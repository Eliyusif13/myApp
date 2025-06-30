# 1. Mərhələ: Build mərhələsi
FROM gradle:8.4.0-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle bootJar --no-daemon

# 2. Mərhələ: Run mərhələsi
FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
