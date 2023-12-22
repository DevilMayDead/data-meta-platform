package com.zg.lowcode.entity;

import lombok.Data;

/**
 * @author 赵刚
 */
@Data
public class DataSourceEntity {
    private String id;
    private String type;
    private String name;
    private String url;
    private String username;
    private String password;
    private String properties;
}
