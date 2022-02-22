- docker run --restart=always --name oracle12g -p 1521:1521 -v /docker/oracle:/ORCL -d store/oracle/database-enterprise:12.2.0.1

- docker exec -it oracle bash

- sqlplus / as sysdba

- ALTER SESSION SET "_ORACLE_SCRIPT"=true;

- create user <USER> identified by "<PWD>";
  
  
