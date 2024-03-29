# Game Character
game character backend API

- [x] Spring Boot
- [x] MongoDB 
- [x] Docker

**System requirements**
- JDK 8 (optional)
- Maven (optional)
- Docker

## Build and run application
The file [docker-compose.yml](docker-compose.yml) contains all the necessary settings to configure the environemnt. 
As this is a very simple application, we will basically have only two containers/services - the heroes app and the database. 
If you want to  build or rebuild services to include any code changes in the docker image(s), run `docker-compose build`. 
To start all the services, you need to run `docker-compose up` (use `-d` to run in detached mode). 
The docker image for the rest api application service is defined by the file [Dockerfile](Dockerfile) using multi stages in order to build and execute the application.

The backend application will be available at http://localhost:8080

The backend documentation will be available at http://localhost:8080/swagger-ui.html

## Database Documentation
![alt text](https://github.com/teguheka/heroes/blob/main/images/diagram_db.png?raw=true)
