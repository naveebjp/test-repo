FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD DWGettingStarted-2.0.jar /home/ubuntu/

COPY /var/lib/jenkins/jobs/Test_docker/workspace/config.yml /home/ubuntu/config.yml

ADD start_up.sh /

CMD bash start_up.sh
