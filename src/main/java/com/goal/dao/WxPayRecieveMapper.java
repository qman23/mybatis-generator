package com.goal.dao;

import com.goal.po.WxPayRecieve;

public interface WxPayRecieveMapper {
    int insert(WxPayRecieve record);

    int insertSelective(WxPayRecieve record);
}