package com.momed.spring7di.controllers.datasource;

import com.momed.spring7di.services.datasource.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final DataSourceService dataSourceService;

    public FauxController(@Qualifier("dataSourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource(){
        return dataSourceService.getDataSource();
    }

}
