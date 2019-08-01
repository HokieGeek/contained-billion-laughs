FROM gradle:jdk8
WORKDIR /usr/src
COPY . .
RUN gradle build

FROM openjdk:8
EXPOSE 8338
WORKDIR /usr/app
COPY --from=0 /usr/src/build/distributions .
RUN tar -xf lolz.tar
CMD ["/usr/app/lolz/bin/lolz"]
