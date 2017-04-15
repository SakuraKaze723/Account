package com.account.dao;

import com.account.entity.Owner;

import java.util.Map;

interface OwnerDao {
    Map<Integer,Owner> selectInfo(String owner);
    Integer selectBalance(String owner);
    Boolean updateBalance(String owner,Integer change);
}
