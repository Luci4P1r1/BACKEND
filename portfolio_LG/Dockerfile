FROM amazoncorretto:17-alpine-jdk //de qué impagen de java partimos
MAINTAINER LG //quién es el dueño
COPY  target.portfoliolg-0.0.1-SNAPSHOT.jar lg-app.jar //copia el empaquetado y luego lo sube a github
ENTRYPOINT ["java","-jar","/mgb-app.jar"]     //la instrucción que se va a ejecutar primero
