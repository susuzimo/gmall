package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.manage.mapper.PmsProductInfoMapper;
import com.atguigu.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;


    @Override
    public List<PmsProductInfo> SpuList(String catalog3Id) {

        PmsProductInfo pmsProductInfo=new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);

        List<PmsProductInfo> pmsProductInfoList = pmsProductInfoMapper.select(pmsProductInfo);
        return pmsProductInfoList;
    }
}
