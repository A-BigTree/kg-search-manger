package top.abigtree;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.lang3.StringUtils;
import top.abigtree.wiki.enums.LanguageEnum;
import top.abigtree.wiki.pojo.WikiDataModel;

import static top.abigtree.wiki.util.AnalysisUtil.convertToObject;
import static top.abigtree.wiki.util.AnalysisUtil.getBasicDataByLangEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws Exception {
        /*
        AtomicInteger a = new AtomicInteger(0);
        long start = System.currentTimeMillis();
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
        }*/
        InputStream file = new FileInputStream(new File("E:\\wiki\\latest-all.json.bz2"));
        BZip2CompressorInputStream bZip2IS = new BZip2CompressorInputStream(file);
        String line="";
        Scanner sc = new Scanner(bZip2IS, StandardCharsets.UTF_8);
        int i = 0;
        PrintWriter printWriter = new PrintWriter(System.out,true);
        while(sc.hasNext()) {
            line = sc.nextLine();
            if (line.equals("[") || line.equals("]")) {
                continue;
            }
            line = StringUtils.strip(line, ",").trim();
            WikiDataModel model = convertToObject(line, WikiDataModel.class);
            log.info("{}", getBasicDataByLangEnum(model, LanguageEnum.EN));
            if (i++ > 100) {
                break;
            }
        }
    }
}
