package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

@Service
public class CateGoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CateGoryService{
}
