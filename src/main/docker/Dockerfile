FROM preetick/jvcatenv:v1

MAINTAINER M1018434

ADD DWGettingStarted.jar /apps/DWGettingStarted.jar

ADD config.yml /apps/config.yml
ADD dwstart.keystore /apps/dwstart.keystore
ADD start_up.sh /apps/start_up.sh

RUN chmod 755 /apps/DWGettingStarted.jar \
&& chmod 755 /apps/config.yml \
&& chmod 755 /apps/dwstart.keystore \
&& chmod 755 /apps/start_up.sh /*

CMD ['bash /apps/start_up.sh']
