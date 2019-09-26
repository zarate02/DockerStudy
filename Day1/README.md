# 1����

## docker ��ġ(����)

- root ��������
- cd /
- mkdir rpm
- yum install -y yum-utils device-mapper-persistent-data lvm2
- yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
- yum install docker-ce docker-ce-cli containerd.io --downloadonly --downloaddir=/rpm
- cd rpm
- rpm -Uvh *

## docker ����(����)

- systemctl enable docker
- systemctl start docker

## docker - mosquitto ��ġ(����)
### pull : ��Ŀ��꿡�� ��������
### docker images : ��Ŀ�̹��� Ȯ��
### docker rmi : ��Ŀ�̹��� ����
- docker pull eclipse-mosquitto
- docker images �� �̿��� �� ��ġ�Ǿ��ִ��� Ȯ��

## docker - mosquitto ����
### run �����̳� ����
### stop �����̳� ����
### -i -t : ��ȣ�ۿ��ϱ����� �ɼ� (interactive)
### -p : ��Ʈ������ (port)
### -v : �ܺ� ���� ��� (volume)
### ps : �������� �����̳� ��ȸ, -a ��ü �����̳� ��ȸ
### rm : �����̳� ����
### docker rm 'docker ps -a -q' : �����̳� ��ü����
### -d : ����
### --name �����̳��̸�����
- docker run --name mosquitto -p 1883:1883 -p 9001:9001 -v /docker/conf/mosquitto/mosquitto.conf:/mosquitto/config/mosquitto.conf -d eclipse-mosquitto

## docker - mosquitto ����/�ε�
- ���� : docker save -o eclipse-mosquitto.tar eclipse-mosquitto:latest
- �ε� : docker load -i eclipse-mosquitto.tar

## ��ȭ������
firewall-cmd --permanent --zone=public --add-port=1883/tcp
firewall-cmd --reload