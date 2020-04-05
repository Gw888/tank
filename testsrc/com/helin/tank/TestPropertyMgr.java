package com.helin.tank;

import org.junit.jupiter.api.Test;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/5 20:32
 * @Copyright © 新点软件股份有限公司
 */
public class TestPropertyMgr {

    @Test
    public void test(){
        String value = (String)PropertyMgr.get("tankpeed");
        System.out.println("value = " + value);
    }
}
