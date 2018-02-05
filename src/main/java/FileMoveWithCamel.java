import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by hy on 2018/2/5.
 */
public class FileMoveWithCamel {
    public static void main(String []arg) throws Exception{
        CamelContext context=new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:F:/history").to("file:F:/home");
            }
        });
        context.start();

            Thread.sleep(4000);

        context.stop();

    }
}
