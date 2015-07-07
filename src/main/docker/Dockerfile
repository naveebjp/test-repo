FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD DWGettingStarted-1.4.jar /home/ubuntu/

COPY config.yml /home/ubuntu/config.yml

COPY dwstart.keystore /home/ubuntu/dwstart.keystore

ADD start_up.sh /

CMD bash start_up.sh
