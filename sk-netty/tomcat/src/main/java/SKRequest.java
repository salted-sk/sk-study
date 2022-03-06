import lombok.Data;

import java.io.InputStream;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/20 13:12
 */
@Data
public class SKRequest {

    private String url;
    private String method;


    public SKRequest(InputStream inputStream) {
        try {
            String content = "";
            byte[] bytes = new byte[10];
            int let;
            while ((let = inputStream.read(bytes)) > 0) {
                content += new String(bytes);
            }
            String line = content.split("\\n")[0];
            String[] reqArr = line.split("\\s");
            this.method = reqArr[0];
            this.url = reqArr[1].split("\\?")[0];
            System.out.println(content);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
