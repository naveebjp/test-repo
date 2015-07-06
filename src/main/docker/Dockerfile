FROM preetick/jvcatenv:v1

MAINTAINER M1018434

RUN cd /var/lib/jenkins/jobs/Test_docker/workspace/target/

ADD DWGettingStarted-1.0.jar /home/ubuntu/application/ 

ADD start_up.sh /

CMD bash start_up.sh
