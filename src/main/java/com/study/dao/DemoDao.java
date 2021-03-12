package com.study.dao;

import com.study.entity.Demo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created on 2019/10/9.
 */
@Mapper
public interface DemoDao {
    List<Demo> getDemo();
}
