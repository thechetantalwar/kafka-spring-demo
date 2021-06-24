## Instructions

* Switch to home directory
  * cd /home/<user_name>
* Let's get the code
  * git clone https://github.com/thechetantalwar/kafka-spring-demo
* Change directory to code
  * cd kafka-spring-demo
* If you wish to change your respective topic name, then you need to edit couple of files
	* Editing Controller
	``` vi src/main/java/com/thinknyx/kafkademo2/controller/KafkaController.java```
	* Editing Consumer
	```vi src/main/java/com/thinknyx/kafkademo2/consumer/MyTopicConsumer.java```
* In order to run the application
```./mvnw spring-boot:run```

* Now access your application in browser using below link
	* To get messages(consumer)
	``` your_public_ip_of_vm:8080```
	* To send messages(producer)
	``` your_public_ip_of_vm:8080/kafka/produce?message=SomeMessage```

