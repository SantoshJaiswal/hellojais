FROM java:7
COPY JavaHelloWorld.java,Calculator.java .
RUN javac JavaHelloWorld.java

CMD ["java", "JavaHelloWorld"]