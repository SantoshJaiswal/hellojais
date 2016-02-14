FROM java:7
COPY *.java .
RUN javac *.java

CMD ["java", "JavaHelloWorld"]