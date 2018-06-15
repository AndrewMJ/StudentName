FROM openjdk:8-jre-alpine3.7
COPY target/StudentName-0.0.1-SNAPSHOT.jar /home/StudentName-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/StudentName-0.0.1-SNAPSHOT.jar"]

