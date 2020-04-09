# 6일차

## docker - mongodb 설치 및 실행
docker run –-name mongodb_server --net=host -v /docker/vol/mong:/data/db -d mongo –auth

## 방화벽해제(성공)
- firewall-cmd --permanent --zone=public --add-port=27017/tcp
- firewall-cmd --reload