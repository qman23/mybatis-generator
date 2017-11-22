package com.goal.dao;

import com.goal.po.OrderPriceDetail;

public interface OrderPriceDetailMapper {
    int insert(OrderPriceDetail record);

    int insertSelective(OrderPriceDetail record);
}