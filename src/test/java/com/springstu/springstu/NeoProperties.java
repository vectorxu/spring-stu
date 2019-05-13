package com.springstu.springstu;

import com.springstu.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Component
public class NeoProperties {
    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;

    //省略getter settet方法

    @Test
    public void test() {

        try {
            System.out.println(new String(title.getBytes("UTF-8"),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(description);
        System.out.println(String.format(description, "UTF-8"));

    }


}

