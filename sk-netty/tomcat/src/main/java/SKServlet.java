/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/20 13:12
 */
public abstract class SKServlet {

    public void service(SKRequest request, SKRespose respose) throws Exception {
        if ("get".equalsIgnoreCase(request.getMethod())) {
            doGet(request, respose);
        } else {
            doPost(request, respose);
        }

    }

    public abstract void doGet(SKRequest request, SKRespose respose) throws Exception;
    public abstract void doPost(SKRequest request, SKRespose respose) throws Exception;


}
