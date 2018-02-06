package camelSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hy on 2018/2/6.
 */
public class FileMoveWithSpring {
    public static void main(String[] arg){
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            while(true)
                Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
