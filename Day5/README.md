# 5일차

## docker - rabbitmq 설치(성공)
- docker build ./ --tag rabbitmq

## 명령어
- docker run --restart=always --name rmq --net=host -d rabmq

## 방화벽해제
- firewall-cmd --permanent --zone=public --add-port=15672/tcp
- firewall-cmd --reload

## TAR파일화
- docker save -o rabmq.tar rabmq:latest
- docker load -i rabmq.tar

## 정보
- 15672 // guest // guest
