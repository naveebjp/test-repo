FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD DWGettingStarted.jar /apps/

ADD start_up /apps/

COPY /var/lib/jenkins/jobs/test_docker/workspace/src/main/docker/config.yml /apps/

CMD bash start_up.sh
