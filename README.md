# contained-billion-laughs

## Building and running
Build it: `docker build -t lolz .`

Run it: `docker run --rm -it -p 8338:8338 lolz`

Point browser to: http://localhost:8338

Exploitable endpoint: `curl -X PUT http://localhost:8338/config`
