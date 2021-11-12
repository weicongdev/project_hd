import com.google.gson.Gson;
import com.rng.demo.pojo.FlowNumReturnPojo;
import com.rng.demo.service.impl.FlowNumServiceimpl;
import org.junit.Test;



public class testFlowNumController {
    @Test
    public void testController() {
        FlowNumServiceimpl flowNumServiceimpl = new FlowNumServiceimpl();
        FlowNumReturnPojo flowNumReturnPojo = flowNumServiceimpl.getFlowNumReturn();

        System.out.println("pojo+"+flowNumReturnPojo);
        Gson gson = new Gson();
        String json = gson.toJson(flowNumReturnPojo);
        System.out.println("json+"+json);
    }

}
