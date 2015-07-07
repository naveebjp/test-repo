FROM preetick/jvcatenv:v1

MAINTAINER M1018434

RUN cd /home/ubuntu

ADD /var/lib/jenkins/jobs/test_docker/workspace/target/DWGettingStarted-1.2.jar /home/ubuntu/

COPY /var/lib/jenkins/jobs/test_docker/workspace/config.yml /home/ubuntu/config.yml

COPY /var/lib/jenkins/jobs/test_docker/workspace/dwstart.keystore /home/ubuntu/dwstart.keystore

ADD start_up.sh /

CMD bash start_up.sh
