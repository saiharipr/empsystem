

FROM openjdk:8
EXPOSE 8054
ADD build/libs/Empsystem-0.0.1-SNAPSHOT.jar Empsystem-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/Empsystem-0.0.1-SNAPSHOT.jar" ]