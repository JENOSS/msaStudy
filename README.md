# msaStudy
MSA Study

1. Kafka
 - Zookeeper 및 Kafka 서버 가동
    $KAFKA_HOME/bin/zookeeper-server-start.sh  $KAFKA_HOME/config/zookeeper.properties
    $KAFKA_HOME/bin/kafka-server-start.sh  $KAFKA_HOME/config/server.properties
 - Topic 생성
   $KAFKA_HOME/bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092 --partitions 1
 - Topic 목록 확인
   $KAFKA_HOME/bin/kafka-topics.sh --bootstrap-server localhost:9092 --list
 - Topic 정보 확인
   $KAFKA_HOME/bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092

2. RabbitMq
  - 실행
    rebbitmq-server

3. Prometheus
  - 실행
    ./prometheus --config.file=prometheus.yml

4. Grafana
  - 실행
    ./bin/grafana-server      