# 3����

## docker - nginx ��ġ �� ����
docker run --name nginx-container --net=host -v /docker/conf/nignx/nginx.conf:/etc/nginx/nginx.conf:ro -d nginx

## ��ȭ������(����)
- firewall-cmd --permanent --zone=public --add-port=1883/tcp
- firewall-cmd --reload