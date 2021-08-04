FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD ./cambio-0.0.1-SNAPSHOT.jar cambio.jar
ENTRYPOINT ["java","-jar","/cambio.jar"]