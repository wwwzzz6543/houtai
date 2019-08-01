package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.service.IBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandControllerTest {

    @Autowired
    private IBrandService brandService;

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
    }

    @Test
    public void list() {

        brandService.list(null).forEach(e-> System.out.println(e));
    }

    @Test
    public void json() {
    }
}