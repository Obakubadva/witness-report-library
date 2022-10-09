package com.fbi.witnessreportlibrary.Services;

import com.fbi.witnessreportlibrary.Model.CaseModel;
import com.fbi.witnessreportlibrary.Model.NestedJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CaseService {

    @Autowired
    private RestTemplate template = new RestTemplate();
    public Object[] findAllCasesComplete(){
         return template.getForObject("https://api.fbi.gov/wanted/v1/list", Object[].class);
     }
     public CaseModel[] getAllCases(){
         return template.getForObject("https://api.fbi.gov/wanted/v1/list", CaseModel[].class);
     }
     public NestedJson getJson(){
         return template.getForObject("https://api.fbi.gov/wanted/v1/list", NestedJson.class);
     }
}
