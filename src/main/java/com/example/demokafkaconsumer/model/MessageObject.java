package com.example.demokafkaconsumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MessageObject {
    private String id;
    private String data;
}
