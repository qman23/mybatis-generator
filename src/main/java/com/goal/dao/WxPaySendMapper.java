package com.goal.dao;

import com.goal.po.WxPaySend;

public interface WxPaySendMapper {
    int insert(WxPaySend record);

    int insertSelective(WxPaySend record);
}