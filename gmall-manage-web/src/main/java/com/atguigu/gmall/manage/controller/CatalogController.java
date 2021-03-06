package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;
import com.atguigu.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
分类
 */
@Controller
@CrossOrigin
public class CatalogController {


    @Reference
    CatalogService catalogService;

    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog(){
        //ResponseBody  返回是个集合

        List<PmsBaseCatalog1> pmsBaseCatalog1List=catalogService.getCatalog1();
        return pmsBaseCatalog1List;
    }

    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        //ResponseBody  返回是个集合

        List<PmsBaseCatalog2> pmsBaseCatalog2List=catalogService.getCatalog2(catalog1Id);
        return pmsBaseCatalog2List;
    }


    @RequestMapping("/getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        //ResponseBody  返回是个集合

        List<PmsBaseCatalog3> pmsBaseCatalog3List=catalogService.getCatalog3(catalog2Id);
        return pmsBaseCatalog3List;
    }

}
