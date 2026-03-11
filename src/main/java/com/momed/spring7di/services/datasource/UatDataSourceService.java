package com.momed.spring7di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("dataSourceService")
public class UatDataSourceService implements DataSourceService{
    @Override
    public String getDataSource() {
        return "uat";
    }
}
