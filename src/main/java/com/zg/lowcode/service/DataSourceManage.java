package com.zg.lowcode.service;

import com.zg.lowcode.entity.DataSourceEntity;

import java.util.List;

/**
 * @author 赵刚
 */
public interface DataSourceManage {
    void addDataSource(DataSourceEntity dataSourceEntity);

    void updateDataSource(DataSourceEntity dataSource);
    void deleteDataSource(String id);
    DataSourceEntity getDataSource(String id);
    List<DataSourceEntity> getAllDataSources();
    boolean testConnection(DataSourceEntity dataSource);
}
