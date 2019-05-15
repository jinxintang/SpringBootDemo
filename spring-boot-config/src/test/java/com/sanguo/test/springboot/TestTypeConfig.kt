package com.sanguo.test.springboot

import com.sanguo.srpingboot.Application
import com.sanguo.srpingboot.configuration.TypeProperties
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [Application::class])
class TestTypeConfig {
    @Autowired
    lateinit var typeConfig: TypeProperties

    @Test
    fun testString() {
        System.out.println("-------$typeConfig.serverHost")
    }

    @Test
    fun testList() {
        typeConfig.wareHouseIds!!.forEach {
            System.out.println("------- $it")
        }
    }


    @Test
    fun testMap() {
        typeConfig.zoneInfo!!.values.forEach {
            System.out.println("-------" +it.zoneId)
        }
    }



    @Test
    fun testListRobot() {
        typeConfig.robotInfo!!.forEach{
            System.out.println("-------" +it.zoneId)
        }
    }
}
