/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/20 13:12
 */
public class DemoServlet extends SKServlet {


    public String getMethod(){
        return "get";
    }

    @Override
    public void doGet(SKRequest request, SKRespose respose) throws Exception {
        doPost(request, respose);
    }

    @Override
    public void doPost(SKRequest request, SKRespose respose) throws Exception {

    }
}
