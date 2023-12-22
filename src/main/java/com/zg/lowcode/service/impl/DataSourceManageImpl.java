package com.zg.lowcode.service.impl;

import com.zg.lowcode.entity.DataSourceEntity;
import com.zg.lowcode.mapper.DataSourceManagementMapper;
import com.zg.lowcode.service.DataSourceManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 赵刚
 */
@Service
public class DataSourceManageImpl implements DataSourceManage {
    private DataSourceManagementMapper dataSourceManagementMapper;

    private DataSourceManageImpl(DataSourceManagementMapper dataSourceManagementMapper) {
        this.dataSourceManagementMapper = dataSourceManagementMapper;
    }

    // 新增数据源
    @Override
    public void addDataSource(DataSourceEntity dataSourceEntity) {

    }
}
