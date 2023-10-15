FROM openjdk:17

WORKDIR /code

ENV PORT 8082

EXPOSE 8082

COPY unworkout_users_ms/target/*.jar /code/unworkout_users_ms-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "/code/unworkout_users_ms-0.0.1-SNAPSHOT.jar"]
