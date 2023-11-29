# Java-Kafka

## Getting Start
Start a ZooKeper server (required by kafka):
```
bin/zookeeper-server-start.sh config/zookeepr.properties
```

Start a Kafka broker:
```
bin/kafka-server-start.sh config/server.properties
```

Read the events
```
bin/kafka-console-consumer.sh --topic wikimedia-stream --from-beginning --bootstrap-server localhost:9092
```
