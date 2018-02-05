package camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by hy on 2018/2/5.
 */
public class FileConvertProcessor implements Processor {

    public void process(Exchange exchange) throws Exception{
        BufferedReader in=null;
        InputStream inputStream=null;
        try{
           inputStream= exchange.getIn().getBody(InputStream.class);
           in=new BufferedReader(new InputStreamReader(inputStream));
            String str="";
            str=in.readLine();
            while(str!=null){
                System.out.print(str+"@@");
                str=in.readLine();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(inputStream!=null)
                inputStream.close();
            if(in!=null)
                in.close();
        }
    }
}
