package netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/22 20:13
 */
@AllArgsConstructor
public class SKRequest {

    private ChannelHandlerContext ctx;

    private HttpRequest request;



}
