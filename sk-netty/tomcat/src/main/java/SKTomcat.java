import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/20 13:12
 */
public class SKTomcat {

    private int port = 8080;
    private ServerSocket serverSocket;

    private Properties properties = new Properties();

    public static void main(String[] args) {
        new SKTomcat().start();
    }


    private void init() {
        try {
            String resourcePath = this.getClass().getResource("/").getPath();
            FileInputStream fis = new FileInputStream(resourcePath + "sk.properties");
            properties.load(fis);



        } catch (Exception e) {

        }
    }

    private void start() {
        init();
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("服务启动,监听的端口号是" + port);
            //等待客户端请求
            while (true) {
                Socket accept = serverSocket.accept();
                //处理客户端请求
                process(accept);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void process(Socket socket) {
        try(InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream()) {
            SKRequest request = new SKRequest(is);
            SKRespose respose = new SKRespose(os);
            //处理请求

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
