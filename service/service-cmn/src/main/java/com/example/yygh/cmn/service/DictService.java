package com.example.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yygh.model.cmn.Dict;
import com.example.yygh.model.hosp.HospitalSet;

import java.util.List;

public interface DictService extends IService<Dict> {
    //根据数据id查询子数据列表
    List<Dict> findChildData(Long id);
}
