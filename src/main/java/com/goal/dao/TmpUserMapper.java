package com.goal.dao;

import com.goal.po.TmpUser;

public interface TmpUserMapper {
    int insert(TmpUser record);

    int insertSelective(TmpUser record);
}