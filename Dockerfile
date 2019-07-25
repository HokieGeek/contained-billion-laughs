FROM gradle:jdk8
WORKDIR /usr/src
COPY . .
RUN gradle build

FROM openjdk:8
WORKDIR /usr/app
COPY --from=0 /usr/src/build/libs .
CMD ["/bin/sh", "-c", "java -cp *.jar org.sonatype.se.hacks.lolz.Main"]
