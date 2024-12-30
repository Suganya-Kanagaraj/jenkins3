FROM eclipse-temurin:17
COPY target/jenexamp3.jar jenexamp3.jar
CMD [ "java","-jar","jenexamp3.jar" ]




