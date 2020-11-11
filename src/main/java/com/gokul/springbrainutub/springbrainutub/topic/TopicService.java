package com.gokul.springbrainutub.springbrainutub.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic>topics=new ArrayList<>(Arrays.asList(
            new Topic("spring","spring core","spring description"),
            new Topic("java","java core","java description"),
            new Topic("javascript","javascript core","javascript description")
    ));

    public List<Topic>getAllTopics(){
        return topics;
    }


    public Topic getTopics(String id) {
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
