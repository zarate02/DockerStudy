# 4일차

## docker - mosquitto 설치(성공)
- docker pull postgres

## 명령어
docker run --restart=always --name ggrpdpostgres --net=host -v /GGRPD/docker/dbdata:/var/lib/postgresql/data -e POSTGRES_PASSWORD=비번 -d postgres:latest

## 정보
5432 // postgres // 비번