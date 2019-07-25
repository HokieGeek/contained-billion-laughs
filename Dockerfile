FROM openjdk:8
WORKDIR /usr/src/org/sonatype/se/hack/
COPY ./src/main/java/org/sonatype/se/hack .
RUN javac Main.java
RUN pwd ; ls
CMD ["java", "-cp", "/usr/src", "org.sonatype.se.hack.Main"]
