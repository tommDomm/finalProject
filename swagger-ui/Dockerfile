FROM swaggerapi/swagger-ui:latest
MAINTAINER ITAcademy

ADD /user-service/spec/user-service.yml /usr/share/nginx/html/doc/user-service.yaml

ENV URLS="[{ url: 'doc/user-service.yaml', name: 'User'},]"
ENV URLS_PRIMARY_NAME="User"