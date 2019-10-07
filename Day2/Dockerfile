#자바11설치
FROM openjdk:11

#시간설정
ENV TZ=Asia/Seoul

#로그파일 외부로빼기
#VOLUME /docker/spring/logs

#jar파일복사
ARG JAR_FILE=demo.jar
COPY ${JAR_FILE} app.jar

#ARG SQL_FILE=*.xml
#COPY ${SQL_FILE} *.xml

#ARG PRPT_FILE=application.properties
#COPY ${PRPT_FILE} application.properties

#실행옵션
ENTRYPOINT ["java","-jar","/app.jar","--spring.config.location=application.properties"]