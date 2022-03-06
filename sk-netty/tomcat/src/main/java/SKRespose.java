import java.io.IOException;
import java.io.OutputStream;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/20 13:12
 */
public class SKRespose {

    private OutputStream outputStream;

    public SKRespose(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String s) throws IOException {
        StringBuffer sb = new StringBuffer();
        sb.append("HTTP/1.1 200 OK\n")
                .append("Content-type: text/html;\n")
                .append("\r\n")
                .append(s);
        outputStream.write(sb.toString().getBytes());
    }
}
