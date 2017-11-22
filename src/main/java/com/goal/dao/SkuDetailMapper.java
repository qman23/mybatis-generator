package com.goal.dao;

import com.goal.po.SkuDetail;

public interface SkuDetailMapper {
    int insert(SkuDetail record);

    int insertSelective(SkuDetail record);
}