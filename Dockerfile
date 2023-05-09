FROM scratch
COPY target/app .
ENTRYPOINT ["./app"]