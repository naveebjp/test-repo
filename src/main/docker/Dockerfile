FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD DWGettingStarted.jar /apps/DWGettingStarted.jar

ADD start_up.sh /apps/start_up.sh
RUN chmod +x /apps/start_up.sh

ADD config.yml /apps/config.yml


ADD dwstart.keystore /apps/dwstart.keystore

CMD bash /apps/start_up.sh



