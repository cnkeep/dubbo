package org.apache.dubbo.registry.redis;

import com.google.common.collect.Maps;
import org.apache.dubbo.common.utils.ConcurrentHashSet;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;

/**
 * 订阅者
 * @ClassName: RedisSubTest 
 * @Description: TODO
 * @author OnlyMate
 * @Date 2018年8月23日 下午2:59:42  
 *
 */
public class RedisSubTest {
    @Test
    public void subjava() {
        System.out.println("订阅者 ");
        Jedis jr = null;
        try {
            jr = new Jedis("127.0.0.1", 6379, 0);// redis服务地址和端口号
            RedisMsgPubSubListener sp = new RedisMsgPubSubListener("sub1");
            // jr客户端配置监听两个channel
            jr.subscribe(sp, "news.share", "news.blog");

            System.out.println("---------------");
            RedisMsgPubSubListener sp1 = new RedisMsgPubSubListener("sub2");
            // jr客户端配置监听两个channel
            jr.subscribe(sp1, "news.share", "news.blog");

            new CountDownLatch(1).await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jr != null) {
                jr.disconnect();
            }
        }

        int businessType = 1;
        String version = "1.2.20";
        ConcurrentHashSet<String> lockSet = new ConcurrentHashSet<>();
        String key = businessType+version;
        if(lockSet.contains(key)){
            // lock(s);
        }else {
            lockSet.add(key);
        }
    }


}