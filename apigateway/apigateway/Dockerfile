FROM maven as build
WORKDIR /app
COPY . .
RUN mvn install

FROM openjdk:11.0.10-jre
WORKDIR /app
COPY --from=build /app/target/apigateway-0.0.1-SNAPSHOT.jar /app
EXPOSE 9003
CMD ["java","-jar","apigateway-0.0.1-SNAPSHOT.jar"]
