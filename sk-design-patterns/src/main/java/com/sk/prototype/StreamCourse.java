package com.sk.prototype;

import lombok.Data;

import java.io.*;
import java.math.BigDecimal;
import java.util.Map;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/11/18 9:04
 */
@Data
public class StreamCourse implements Cloneable, Serializable {

    private String name;

    private BigDecimal price;

    private Map<String, String> cloneMap;

    @Override
    public Object clone() {
        Object o;
        try {
            o = this;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(o);
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            o = objectInputStream.readObject();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return o;
    }

}
