# ElasticMQ stopAndWait issue

To reproduce:

1. See [com.example.demo.DemoApplication](https://github.com/mgr32/elasticmq-stopandwait-issue/blob/main/src/main/java/com/example/demo/DemoApplication.java) class to see how ElasticMQ server is started and stopped.  
2. Ensure `elasticmq-rest-sqs_2.13` version in `build.gradle` is `0.15.8` (last working ok) 
3. Run `./gradlew run` - observe that the process ends successfully.
4. Change `elasticmq-rest-sqs_2.13` version in `build.gradle` to `1.0.0` (first with issue) or `1.4.2` (the latest one with the issue).
5. Run `./gradlew run` - observe that the process hangs indefinitely.
