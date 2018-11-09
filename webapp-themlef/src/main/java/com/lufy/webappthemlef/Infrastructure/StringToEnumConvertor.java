package com.lufy.webappthemlef.Infrastructure;

import com.lufy.webappthemlef.model.Sex;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToEnumConvertor implements Converter<String, Sex> {
    @Override
    public Sex convert(String s) {
        try {
            return Sex.value(Integer.parseInt(s)-1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
