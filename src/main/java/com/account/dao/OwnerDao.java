package com.account.dao;

import com.account.entity.Owner;
import com.account.entity.OwnerInfo;

import java.util.Map;

interface OwnerDao {
    Boolean insertOwner(Owner owner);
    Boolean additionalInfo(OwnerInfo ownerInfo);
    Map<Integer,Owner> selectInfo(Integer id);
    Integer selectBalance(Integer id);
    Boolean updateBalance(Integer id,Integer change);
    Boolean updateInfo(OwnerInfo ownerInfo,Integer id);
}
