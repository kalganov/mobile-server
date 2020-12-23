FROM openjdk:11-jre-slim
WORKDIR /app
EXPOSE 8080
ENV DB_URL="jdbc:postgresql://localhost:5432/client"
ENV DB_USERNAME="client"
ENV DB_PASSWORD="P@55w0rd"
ADD ./build/libs/mobile-server-0.0.1.jar .
CMD ["java", "-jar", "mobile-server-0.0.1.jar"]