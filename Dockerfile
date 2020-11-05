FROM openjdk:11-jre-slim
WORKDIR /app
EXPOSE 8080
ADD ./build/libs/mobile-server-0.0.1.jar .
CMD ["java", "-jar", "mobile-server-0.0.1.jar"]