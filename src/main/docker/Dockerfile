FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD DWGettingStarted.jar /apps/DWGettingStarted.jar

ADD dwstart.keystore /apps/dwstart.keystore

ADD config.yml /apps/config.yml
RUN chmod +x /apps/config.yml

ADD start_up.sh /apps/start_up.sh
RUN chmod +x /apps/start_up.sh

CMD ["/apps/start_up.sh"]
