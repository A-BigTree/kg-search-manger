package top.abigtree;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(0);
        long start = System.currentTimeMillis();
        /*
        for(int i = 0; i < 10000; i++){
            try {
                log.info("Thread:{}", i);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long end = System.currentTimeMillis();
        log.info("Cost time:{}ms", end - start); // 111863ms
        */
        for(int i = 0; i < 100; i++){
            new Thread(()->{
                for(int j = 0; j < 10000; j++){
                    if(a.compareAndSet(j, j + 1)){
                        try {
                            log.info("Thread:{}", j);
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                long end = System.currentTimeMillis();
                log.info("Cost time:{}ms", end - start); //11161ms
                log.info(a.toString());
            }).start();
        }

    }
}
