# RABBITMQ

- root 계정접속
- cd /
- mkdir rpm
- yum install -y yum-utils device-mapper-persistent-data lvm2
- yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
- yum install docker-ce docker-ce-cli containerd.io --downloadonly --downloaddir=/rpm
- cd rpm
- rpm -Uvh *
- systemctl enable docker
- systemctl start docker


* 클러스터링-미러링 구성은 WEB <- WAS 형태

[공통]
- mkdir docker
- mkdir rmq
- vi Dockerfile

```
FROM rabbitmq:3-management
RUN rabbitmq-plugins enable --offline rabbitmq_mqtt
```

- docker build ./ --tag rbmq

[WEB]

- docker run --restart=always --add-host dgcs1:ip1 --add-host dgcs2:ip2 --add-host dgcs3:ip3 --name rmq --net=host -e RABBITMQ_NODENAME='rabbit@dgcs3' -e RABBITMQ_ERLANG_COOKIE='KXDSVKZWAUEKCOVNPALE' -d rbmq
- firewall-cmd --permanent --zone=public --add-port=4369/tcp
- firewall-cmd --permanent --zone=public --add-port=25672/tcp
- firewall-cmd --reload

[WAS]

- docker run --restart=always --add-host dgcs:ip --name rmq --net=host -e RABBITMQ_ERLANG_COOKIE='KXDSVKZWAUEKCOVNPALE' -d rbmq
- docker exec -it rmq /bin/bash
- rabbitmqctl stop_app
- rabbitmqctl reset
- rabbitmqctl join_cluster rabbit@dgcs
- rabbitmqctl start_app
- firewall-cmd --permanent --zone=public --add-port=15672/tcp
- firewall-cmd --reload
- rabbitmqctl set_policy ha-all "^ha\." '{"ha-mode":"all"}'

[TAR파일화]

- docker save -o rabmq.tar rabmq:latest
- docker load -i rabmq.tar
