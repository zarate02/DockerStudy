# 4일차

## docker - postgres 설치(성공)
- docker pull postgres

## 명령어
docker run --restart=always --name ggrpdpostgres --net=host -v /GGRPD/docker/dbdata:/var/lib/postgresql/data -e POSTGRES_PASSWORD=비번 -d postgres:latest

## 정보
5432 // postgres // 비번

## 권한부여
- docker exec -it ggrpdpostgres bash
- su postgres
- psql
- CREATE ROLE wini LOGIN CREATEDB PASSWORD 'wini00';







## docker - postgres 설치(성공)
- docker pull postgres

## 명령어
docker run --restart=always --name some-mysql --net=host -e MYSQL_ROOT_PASSWORD=비번 -d mysql

## 정보
33060 // mysql // 비번
