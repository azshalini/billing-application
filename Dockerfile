FROM openjdk:11
VOLUME /tmp
ADD target/billing-application.jar billing-application.jar
EXPOSE 8191
ENTRYPOINT ["java","-jar","billing-application.jar"]