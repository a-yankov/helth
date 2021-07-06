FROM openjdk:12-alpine
COPY target/helth.war /demo.jar

CMD ["java", "-jar", "/demo.jar"]