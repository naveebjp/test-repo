FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD DWGettingStarted.jar /DWGettingStarted.jar

ADD start_up.sh /start_up.sh
RUN chmod +x /start_up.sh

ADD config.yml /config.yml
RUN chmod +x /config.yml

ADD dwstart.keystore /dwstart.keystore

CMD bash /start_up.sh



