package cn.mangowork.shop.convert;

import cn.mangowork.shop.constant.EnvConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dailiming
 * @version v1
 * 字符串转换为时间的转换器
 * @create 2018-11-14 11:36
 **/
@Component
public class StringToDateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String value) {
        if (StringUtils.isEmpty(value)){
           return null;
        }
        value = value.trim();
        try {
            if(value.contains("-")) {
                SimpleDateFormat formatter;
                if(value.contains(":")) {
                    formatter = new SimpleDateFormat(EnvConstant.DATETIME_FORMAT);
                }else {
                    formatter = new SimpleDateFormat(EnvConstant.DATE_FORMAT);
                }
                Date dtDate = formatter.parse(value);
                return dtDate;
            }else if(value.matches("^\\d+$")) {
                Long lDate = new Long(value);
                return new Date(lDate);
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("parser %s to Date fail", value));
        }
        throw new RuntimeException(String.format("parser %s to Date fail", value));
    }
}
