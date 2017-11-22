package com.goal.dao;

import com.goal.po.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}