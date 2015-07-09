#!/bin/bash
nohup java -jar /apps/DWGettingStarted.jar server /apps/config.yml &
service tomcat7 start ;
tail -f /var/lib/tomcat7/logs/catalina.out