import com.google.gson.Gson;
import com.rng.demo.pojo.AvgReturnPojo;
import com.rng.demo.service.impl.AvgPvNumServiceImpl;
import org.junit.Test;

public class testAvgPvNumController {
    @Test
    public void test1(){
        AvgPvNumServiceImpl avgPvNumService = new AvgPvNumServiceImpl();
        AvgReturnPojo avgReturnPojo = avgPvNumService.getAvgReturnPojo();



        Gson gson = new Gson();
        String json = gson.toJson(avgReturnPojo);
        System.out.println(json);
    }
}
