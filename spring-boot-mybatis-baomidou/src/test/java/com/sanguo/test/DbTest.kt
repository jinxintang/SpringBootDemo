package com.sanguo.test

import com.sanguo.mybatis.baomidou.Application
import com.sanguo.mybatis.baomidou.service.IFlowTaskJobService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [Application::class])
class DbTest{

    @Autowired
    lateinit var flowTaskJobService: IFlowTaskJobService

    @Test
    fun testFlowTaskJob(){
        System.out.println("-----beer-----"+flowTaskJobService.getById(6)?.errorMsg)
    }
}