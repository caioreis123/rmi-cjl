FROM maven:3.8-jdk-8

RUN mkdir /rmi

COPY . /rmi

WORKDIR /rmi

RUN mvn clean package -DskipTests