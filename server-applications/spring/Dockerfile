FROM gradle:7.5.1-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:18.0.2.1-jdk

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/ /app/
WORKDIR /app

ENTRYPOINT ["java","-jar","/app/demo-0.0.1-SNAPSHOT.jar"]