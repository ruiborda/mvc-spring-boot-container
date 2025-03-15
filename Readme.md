# Arquitectura de Software CODIGO by Tecsup

## Init

```bash
docker stop $(docker ps -q)
docker rm $(docker ps -aq)
docker volume prune -f
docker volume rm $(docker volume ls -q)
docker compose up -d
```