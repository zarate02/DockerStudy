# 6일차

## docker - mongodb 설치 및 실행
docker run -d --net=host --name mongodb_server -e MONGO_INITDB_ROOT_USERNAME=id -e MONGO_INITDB_ROOT_PASSWORD=passwd -v /docker/vol/mong:/data/db -d mongo --auth

## 방화벽해제(성공)
- firewall-cmd --permanent --zone=public --add-port=27017/tcp
- firewall-cmd --reload

## 접속
dbname = admin / id = id / pw = passwd
