package cn.org.easysite.spring.boot.distributed.lock.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author 潘多拉
 */
@ConfigurationProperties(prefix = DLockConfig.PREFIX)
@Data
public class DLockConfig {

    public static final String PREFIX = "easy.dlock";
    /**
     * 等待时间
     */
    private long waitTime = 60;

    /**
     * 超时解锁时间
     */
    private long leaseTime = 60;

}
