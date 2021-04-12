FROM flyway/flyway:7-alpine

COPY sql /flyway/sql
COPY run_migration.sh /flyway/run_migration.sh

WORKDIR /flyway
ENTRYPOINT ["/flyway/run_migration.sh"]