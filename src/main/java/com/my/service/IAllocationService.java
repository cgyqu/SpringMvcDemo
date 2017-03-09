package com.my.service;

import com.my.pojo.AllocationModel;

import java.util.List;

/**
 * Created by cgy6094 on 2017/3/8.
 */
public interface IAllocationService {
    public List<AllocationModel> getAllocationList(int count);
}
