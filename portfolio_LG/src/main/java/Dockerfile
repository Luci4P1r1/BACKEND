FROM amazoncorrectto:17-alpine-jdk //de qué imagen partimos
MAINTAINER LG //quién es el dueño
COPY target/portfolio-0.0.1-SNAPSHOT.jar.original lg-app.jar    //va a copiar el empaquetado github
ENTRYPOINT ["java","-jar", "/lg-app.jar"]  //la instruccion que ejecutará primero
