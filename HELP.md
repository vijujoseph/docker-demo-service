# Getting Started

The application is for Simple Spring boot application deployed using docker (Windows machice)


Docker in Windows:
1. Download and install docker
2. Run-> docker quickstart terminal
	- 2.a Run taskManager -> Performances -> Verulization should be enabled, if not go to step 2.b
	- 2.b To enable virtualization(google) : go to settings -> Update and security -> Recovery and proceed
3. in terminal -> run -> ./start.sh

#To build Docker:
	docker build -f Dockerfile -t docker-demo-service .

#Run Docker:
docker run -p 8085:8085 docker-demo-service

#View docker images:
docker images

#Check Docker running instances:
docker container ls
to stop: docker stop a785c9fc110d<Instance>

#to run Application;
 http://192.168.99.100:8085/rest/docker/hello 
 http://localhost:8085/rest/docker/hello

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.8.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

