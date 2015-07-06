FROM infomind/repos

MAINTAINER M1018434

RUN cd /var/lib/jenkins/jobs/test/workspace/target/

ADD DWGettingStarted.jar /home/ubuntu/application/ 

ADD start_up.sh /

CMD bash start_up.sh
