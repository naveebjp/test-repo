FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD /var/lib/jenkins/jobs/test_docker/workspace/target/DWGettingStarted.jar /apps/

ADD /var/lib/jenkins/jobs/test_docker/workspace/src/main/docker/start_up /apps/

COPY /var/lib/jenkins/jobs/test_docker/workspace/src/main/docker/config.yml /apps/

CMD bash start_up.sh
