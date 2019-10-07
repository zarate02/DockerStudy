# 2老瞒

## 胶橇傅何飘狼 Docker拳

- jar颇老 积己
- 档目颇老积己 : Dockerfile 积己
- 捞固瘤拳 : docker build --tag demospring:0.1 .
- 角青 : 
	docker run -itd --name demospring -p 8080:8080 \
	-v /docker/spring/demo/data:/data \
	-v /docker/spring/logs:/docker/spring/logs \
	demospring:0.1

## 档目立加

docker exec -it  d899ca7efd44 /bin/bash