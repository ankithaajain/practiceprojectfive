import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
 
@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class SpringBootDemoApplication {
   public static void main(String[] args) 
   {
      ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
 
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
   }
}
