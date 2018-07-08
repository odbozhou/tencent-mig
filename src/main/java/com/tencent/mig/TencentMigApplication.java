package com.tencent.mig;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author jiajia
 */
@SpringBootApplication
@MapperScan("com.tencent.mig.dao")
public class TencentMigApplication {

	@Primary
	@Bean
	@ConfigurationProperties("spring.datasource.druid")
	public DataSource dataSource(){
		return DruidDataSourceBuilder.create().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(TencentMigApplication.class, args);
	}
}
