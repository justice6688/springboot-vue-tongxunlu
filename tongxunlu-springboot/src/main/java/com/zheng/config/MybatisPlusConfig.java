package com.zheng.config;


import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zy
 * @date 2021-10-21
 */

@MapperScan("com.zheng.mapper")
@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {

    // @Bean
    // public MybatisPlusInterceptor mybatisPlusInterceptor(){
    //     // 3.4之后的新版本：分页插件
    //     // MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
    //     // mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.H2));
    //     // return mybatisPlusInterceptor;
    // }

    // 分页插件：旧版变化
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    // 逻辑删除组件！
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

}
