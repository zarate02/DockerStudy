docker run -d --net=host --name mongodb_server -e MONGO_INITDB_ROOT_USERNAME=id -e MONGO_INITDB_ROOT_PASSWORD=pw -v /docker/vol/mong:/data/db -d mongo --auth
