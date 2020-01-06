package com.lanou.springbootssm.convert;


import org.springframework.stereotype.Component;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.standard.expression.IStandardConversionService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MyThymeleafDateFormat  implements IStandardConversionService {
    @Override
    public <T> T convert(IExpressionContext iExpressionContext, Object origin, Class<T> targetClass) {
        String result = "";
        if(origin==null){
            return (T)"";
        }if(origin instanceof Date){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            result = sdf.format(origin);
        }else{
            result = origin.toString();
        }


        return (T) result;

    }
}
