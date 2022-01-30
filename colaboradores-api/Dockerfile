FROM openjdk:17
VOLUME /tmp
ADD colaboradores-api/target/colaboradores-api-0.0.1-SNAPSHOT.jar colaboradores-api.jar
EXPOSE 8080
RUN bash -c 'touch /colaboradores-api.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/colaboradores-api.jar"]
