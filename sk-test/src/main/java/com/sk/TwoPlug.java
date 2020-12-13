package com.sk;

import lombok.Data;

/**
 * TODO
 *
 * @author zhangqiao
 * @since 2020/12/11 9:21
 */
@Data
public class TwoPlug {

    private String name;

    private TwoPlug left;

    private TwoPlug right;
}
