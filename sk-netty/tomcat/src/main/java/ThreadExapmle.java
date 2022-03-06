import java.util.concurrent.*;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2022/2/22 11:11
 */
public class ThreadExapmle {

    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("子线程执行");
                Thread.sleep(33000);
                return "abc23";
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(callable);
//        FutureTask<String> future = new FutureTask<>(callable);
        String s = null;
        try {
            try {
                s = future.get(2, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(s);

        System.out.println("主线程结束");


    }

    private static void aa(){
        executorService.submit(() -> {
            System.out.println(2222);
            System.out.println(2222);
            System.out.println(2222);
            System.out.println(2222);
            System.out.println(2222);
        });
    }
}
