## Spring Boot Consul 
This project demonstrated Spring Boot micro-service auto registry, roll-over start & auto recovery
from fail over

In this project service-a calls service-b preodically using Feign client

### Instructions to setup

1. Download CONSUL (https://www.consul.io/downloads.html)
2.       Unzip consul.zip and go  bin directory and start consul using command > consul agent –dev
3.       Build project service-b > mvn clean install –DskipTests
4.       Start multiple instances of service-b say 4 by opening multiple command windows and issuing the command  > java -jar target\service-b-1.0.0.jar
5.       Build project service-a > mvn clean install –DskipTests
6.       Run service-a  by issuing the command > java -jar target\service-a-1.0.0.jar
NOTE > service-a calls service-b repeatedly after 10ms
7.       Simulate auto recovery from catastrophic failure by killing one of the node of service-b (ctr+c), There should *not* be any error(s)/exception(s) in service-a command window
8.       Now simulate rolling restart by re-starting the killed node (as mentioned in 6)
 
NOTE:
1.       Use the url - http://localhost:8500/v1/catalog/service/service-b to get all the instances of service-b
2.       Use the url - http://localhost:8500/v1/catalog/service/service-a to get all the instances of service-a
