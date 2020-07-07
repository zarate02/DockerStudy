# 6일차

## docker - mongodb 설치 및 실행
docker run -d --net=host --name mongodb_server -e MONGO_INITDB_ROOT_USERNAME=aimyon -e MONGO_INITDB_ROOT_PASSWORD=aimyon00 -v /docker/vol/mong:/data/db -v /docker/conf/mongodb/mongod.conf:/etc/mongod.conf -d mongo --auth

## 방화벽해제(성공)
- firewall-cmd --permanent --zone=public --add-port=27017/tcp
- firewall-cmd --reload

## 접속
dbname = admin / id = aimyon / pw = aimyon00
