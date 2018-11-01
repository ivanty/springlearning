package com.xue.springlearning;

import com.xue.springlearning.dao.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringlearningApplication {


    /*@Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    String index(){
        return  "book name is: "+authorSettings.getName()+" and author age is "+authorSettings.getAge();
    }
*/
    public static void main(String[] args) {
        SpringApplication.run(SpringlearningApplication.class, args);
      /*  SpringApplication app=new SpringApplication(SpringlearningApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);*/
    }
}
