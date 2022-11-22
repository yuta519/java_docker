## Java Springboot with docker

### Stacks
- JDK 17
- MySQL 5.7
- gradle 7.3.1

### Requirements
- Docker Desktop

### Installation
1. Install docker
- Visit [docker desktop website](https://www.docker.com/products/docker-desktop/)
- Please install Docker Desktop. Need to choose installer depending on your OS.
- After installation, run Docker Desktop.
- Check installation. Open your terminal and put the below command.
  - If version appears, it goes well.
> docker --version

2. Initial Setup
- Run the below command and create `mysql/db.env`.
>  cp ./mysql/db.env_sample ./mysql/db.env

- Change credential information in `db.env`.


3. Run application
> docker compose build

> docker compose up

4. Access web application
- Access `http://localhost:8080/book` with your web browser.
