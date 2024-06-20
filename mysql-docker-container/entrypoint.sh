#!/bin/bash

# Run the initialization script if it's the first time the container is started
if [ ! -d "/var/lib/mysql/mysql" ]; then
    echo "Initializing database"
    mysqld --initialize-insecure --user=mysql --datadir=/var/lib/mysql
    mysqld --user=mysql --datadir=/var/lib/mysql &

    # Wait for MySQL to start
    sleep 10

    echo "Running init.sql"
    mysql -u root < /docker-entrypoint-initdb.d/init.sql

    # Shutdown MySQL after initialization
    mysqladmin -u root shutdown
fi

# Run the original entrypoint script
exec docker-entrypoint.sh mysqld

