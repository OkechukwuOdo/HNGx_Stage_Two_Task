FROM maven:3.8.5-openjdk-17 As build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk-slim
#COPY --from=build /target/HNGx_DayOne_Project-0.0.1-SNAPSHOT.jar HNGx_DayOne_Project.jar
COPY --from=build /target/HNGx_Stage_Two_Task-0.0.1-SNAPSHOT.jar HNGx_Stage_Two_Task.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","HNGx_DayOne_Project.jar"]