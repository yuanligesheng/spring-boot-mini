package com.dme.modules.service;

import com.dme.modules.common.utils.TestUtils;
import com.dme.modules.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Wang Haoyu
 * @Date 2024/12/3 23:05
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {

   /* @Autowired
    private TestDao testDao;*/

    @Override
    public void testServiceFunction() {

        /**
         * 业务处理逻辑
         */
        System.out.println("我是service中的方法，我处理业务逻辑---------");
        TestUtils.testUtils();
    }
}
