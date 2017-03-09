package com.my.service.impl;

import com.my.dao.mysql.IAllocationDao;
import com.my.pojo.AllocationModel;
import com.my.service.IAllocationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cgy6094 on 2017/3/8.
 */
@Service("allocationService")
public class AllocationService implements IAllocationService {
    @Resource
    private IAllocationDao allocationDao;

    @Override
    public List<AllocationModel> getAllocationList(int count) {
        return allocationDao.getAllocationList(count);
    }
}
