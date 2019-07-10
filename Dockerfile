FROM openjdk:8-jdk-alpine
COPY ./target/mac-pro-jar-with-dependencies.jar /mac-pro.jar
WORKDIR /
CMD ["java", "-jar", "mac-pro.jar" "00-05-9A-3C-7A-00"]
