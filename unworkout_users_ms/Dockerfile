FROM openjdk:17-jdk-slim
VOLUME /tmp
ADD ./target/unworkout_users_ms-0.0.1-SNAPSHOT.jar appUser.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/appUser.jar"]

