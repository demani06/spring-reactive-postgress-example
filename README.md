**Postgress container set up**

Followed steps in https://towardsdatascience.com/local-development-set-up-of-postgresql-with-docker-c022632f13ea

`docker run -d \
--name dev-postgres \
-e POSTGRES_PASSWORD=Pass2020! \
-v ${HOME}/postgres-data/:/var/lib/postgresql/data \
-p 5432:5432
postgres


docker exec -it dev-postgres bash


docker pull dpage/pgadmin4

docker run \ -p 80:80 \ -e 'PGADMIN_DEFAULT_EMAIL=user@domain.local' \ -e 'PGADMIN_DEFAULT_PASSWORD=SuperSecret' \ --name dev-pgadmin \  -d dpage/pgadmin4


docker inspect dev-postgres -f "{{json .NetworkSettings.Networks }}"
`