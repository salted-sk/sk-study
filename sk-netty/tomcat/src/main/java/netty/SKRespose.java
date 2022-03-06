package netty;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.*;
import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/22 20:13
 */
@AllArgsConstructor
public class SKRespose {

    private ChannelHandlerContext ctx;

    private HttpRequest request;

    public void write(String out) {
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, Unpooled.wrappedBuffer(out.getBytes()));
        response.headers().set("Content-Type", "text/html");
        ctx.write(response);
        ctx.flush();
        ctx.close();
    }

}
