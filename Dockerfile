FROM openjdk:17

ADD target/testApp-0.0.1-SNAPSHOT.jar test-app.jar

ENTRYPOINT ["java","-jar","test-app.jar"]


