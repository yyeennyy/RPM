FROM openjdk:17

COPY build/libs/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

EXPOSE 7777

ENTRYPOINT ["java", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]