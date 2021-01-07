# kafka-transformer
A repository to demonstrate the operation of kafka with spring cloud

# Running the application
From the root of the repo: docker-compose up -d (You can skip it, if you already have Kafka running)

kafkacat -b localhost:9092 -t toUpperCase-in-0 -P

On another terminal:

kafkacat -b localhost:9092 -t toUpperCase-out-0
