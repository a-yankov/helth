FROM openjdk:12-alpine
COPY target/helth-wildfly.jar /demo.jar
CMD ["java", "-jar", "/demo.jar"]