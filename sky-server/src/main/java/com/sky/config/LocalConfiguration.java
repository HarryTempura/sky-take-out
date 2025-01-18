package com.sky.config;

import com.sky.properties.LocalFileProperties;
import com.sky.utils.LocalFileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类用于创建本地文件对象
 */
@Configuration
@Slf4j
public class LocalConfiguration {

    @Bean
    @ConditionalOnMissingBean//条件对象，没有的时候才创建
    public LocalFileUtil localFileUtil(LocalFileProperties localFileProperties) {
        log.info("开始创建本地文件工具类对象：{}", localFileProperties.toString());
        return new LocalFileUtil(localFileProperties.getRoot());
    }

}
