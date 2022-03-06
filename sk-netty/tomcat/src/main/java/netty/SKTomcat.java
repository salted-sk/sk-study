package netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/22 20:02
 */
public class SKTomcat {

    private int port = 8080;

    public static void main(String[] args) {
        new SKTomcat().start();
    }

    public void start() {

        //boss线程
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap server = new ServerBootstrap();
            server.group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new HttpRequestDecoder());
                            ch.pipeline().addLast(new HttpResponseEncoder());
                            ch.pipeline().addLast(new SKTomcatHandler());
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);
            ChannelFuture f = server.bind(port).sync();
            System.out.println("tomcat启动");
            f.channel().closeFuture().sync();


        } catch (Exception e) {

        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }

    }


}

class SKTomcatHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpRequest) {
            HttpRequest request = (HttpRequest) msg;

            SocketChannel

        }

    }
}
