package com.example.Parking_System.domain;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.services.lambda.model.*;
import java.util.List;

public class SQS {
    static AmazonSQS sqs= AmazonSQSClientBuilder.standard().
            withEndpointConfiguration(new AwsClientBuilder.
                    EndpointConfiguration("http://localhost:4566", "us-west-2"))
                        .build();
    static String queueUrl="http://localhost:4566/000000000000/parkingQ";
    public static String SendMessage(String msg){
        try {
            SendMessageRequest send_msg_req = new SendMessageRequest().withQueueUrl(queueUrl)
                    .withMessageBody(msg)
                    .withDelaySeconds(0);
            SendMessageResult send_msg_rslt = sqs.sendMessage(send_msg_req);
            return "Data Saved";
        }
        catch(Exception e) {
            return "Failed to save Data";
        }

    }



}
