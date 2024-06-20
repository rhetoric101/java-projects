FROM mysql:8.0

USER root

# Install necessary tools using microdnf
RUN microdnf update -y && \
    microdnf install -y gettext && \
    microdnf clean all

ENV MYSQL_ROOT_PASSWORD=baron69Tronch
ENV MYSQL_DATABASE=proverbsdb

COPY ./init.sql /docker-entrypoint-initdb.d/init.sql
RUN chmod +x /docker-entrypoint-initdb.d/init.sql

COPY ./entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

RUN mkdir -p /var/lib/mysql && chown -R mysql:mysql /var/lib/mysql

EXPOSE 3306

ENTRYPOINT ["/entrypoint.sh"]


