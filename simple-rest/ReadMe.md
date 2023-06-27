This is simple Rest service which uses mysql db.

Before run this service you have to run mysql db. For instance you can run basic mysql docker image with next command:

`docker run -d --name mysql-container -e MYSQL_ROOT_PASSWORD=your_password -p 3306:3306 mysql`