#!/bin/sh
sleep 20s
sh gradlew build &
wait
java -jar build/libs/app-0.0.1-SNAPSHOT.jar
