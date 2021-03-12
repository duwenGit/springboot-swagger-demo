package com.study.service.impl;

import com.study.dao.DemoDao;
import com.study.entity.Demo;
import com.study.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2019/10/9.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;
    @Override
    public List<Demo> getDemo() {
        List<Demo> demos = demoDao.getDemo();
        return demos;
    }
}
