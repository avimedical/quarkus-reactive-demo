#!/bin/bash

flyway -url=$JDBC_CONNECTION_URL -user=$MIGRATION_USER -password=$MIGRATION_PASSWORD -connectRetries=60 migrate
