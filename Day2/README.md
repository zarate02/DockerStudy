# 2����

## ��������Ʈ�� Dockerȭ

- jar���� ����
- ��Ŀ���ϻ��� : Dockerfile ����
- �̹���ȭ : docker build --tag demospring:0.1 .
- ���� : 
	docker run -itd --name demospring -p 8080:8080 \
	-v /docker/spring/demo/data:/data \
	-v /docker/spring/logs:/docker/spring/logs \
	demospring:0.1

## ��Ŀ����

docker exec -it  d899ca7efd44 /bin/bash