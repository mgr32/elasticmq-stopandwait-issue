package com.example.demo;

import org.elasticmq.rest.sqs.SQSRestServerBuilder;

public class DemoApplication {

    public static void main(String[] args) {
        var sqsRestServer = SQSRestServerBuilder.withDynamicPort().start();
        System.out.println("Running sqsRestServer.waitUntilStarted()");
        sqsRestServer.waitUntilStarted();
        System.out.println("Running sqsRestServer.stopAndWait()");
        sqsRestServer.stopAndWait();
        System.out.println("Everything finished");
    }

}