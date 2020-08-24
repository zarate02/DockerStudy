# 3일차

## docker - nginx 설치 및 실행
docker run --name nginx-container --net=host -v /docker/conf/nignx/nginx.conf:/etc/nginx/nginx.conf:ro -d nginx

## 방화벽해제(성공)
- firewall-cmd --permanent --zone=public --add-port=1883/tcp
- firewall-cmd --reload