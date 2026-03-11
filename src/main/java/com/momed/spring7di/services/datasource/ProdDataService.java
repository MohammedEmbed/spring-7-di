package com.momed.spring7di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("dataSourceService")
public class ProdDataService implements DataSourceService{
    @Override
    public String getDataSource() {
        return "prod";
    }
}
