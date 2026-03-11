package com.momed.spring7di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev","default"})
@Service("dataSourceService")
public class DevDataSourceService implements DataSourceService
{
    @Override
    public String getDataSource() {
        return "dev";
    }
}
