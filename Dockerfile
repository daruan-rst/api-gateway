FROM openjdk:11
EXPOSE 8080

ADD build/libs/api-gateway-0.0.1.jar api-gateway-0.0.1.jar

ENTRYPOINT ["java","-jar","api-gateway-0.0.1.jar"]