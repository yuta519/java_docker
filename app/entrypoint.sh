#!/bin/sh
sleep 5s
sh gradlew build &
wait
java -jar build/libs/app-0.0.1-SNAPSHOT.jar
