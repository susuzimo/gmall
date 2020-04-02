package com.atguigu.gmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {


    @Reference
    SpuService spuService;


    @RequestMapping("/SpuList")
    @ResponseBody
    public List<PmsProductInfo> SpuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfoList=spuService.SpuList(catalog3Id);

        return  pmsProductInfoList;
    }



    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile ){

        //分布式文件存储系统

        return  "";
    }



}
