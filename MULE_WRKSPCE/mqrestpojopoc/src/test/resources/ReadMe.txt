Application--> ActiveMQ --> XML to JSON --> REST Consume (SpringRestExampleApp from JAVA_WORKSPACE)--> JSON to POJO --> SAVE in DB(mySql)

Input:

Active mq message:
QueueName:MulePOCQueue 

<?xml version="1.0" encoding="UTF-8"?>
<Customer>
<id>22</id>
<name>Sri</name>
</Customer>


Output : 

SELECT * FROM temp.customer;
