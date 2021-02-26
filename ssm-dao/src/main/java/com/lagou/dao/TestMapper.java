package com.lagou.dao;

import com.lagou.domain.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TestMapper {

    public List<Test> findAllTest();

}
