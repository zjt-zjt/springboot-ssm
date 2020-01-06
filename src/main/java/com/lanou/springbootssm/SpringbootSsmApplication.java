package com.lanou.springbootssm;

import com.lanou.springbootssm.convert.MyThymeleafDateFormat;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.standard.StandardDialect;

@MapperScan(basePackages = "com.lanou.springbootssm.mapper")
@SpringBootApplication
public class SpringbootSsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmApplication.class, args);
    }

//
//    /**
//     * 配置Template模板引擎，添加自定义的日期类型转换器
//     * @param templateEngine
//     * @param dateConvert
//     * @return
//     */
//public TemplateEngine configTemplat(TemplateEngine templateEngine, MyThymeleafDateFormat myThymeleafDateFormat){
//    StandardDialect dialect = new StandardDialect();
//    dialect.setConversionService(myThymeleafDateFormat);
//    templateEngine.setDialect(dialect);
//    return templateEngine;
//}


}
