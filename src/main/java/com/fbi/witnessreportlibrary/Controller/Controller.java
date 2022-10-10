package com.fbi.witnessreportlibrary.Controller;

import com.fbi.witnessreportlibrary.Model.CaseModel;
import com.fbi.witnessreportlibrary.Model.NestedJson;
import com.fbi.witnessreportlibrary.Services.CaseService;
import com.fbi.witnessreportlibrary.Services.FileService;
import com.fbi.witnessreportlibrary.Services.PhoneValidationService;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cases")
public class Controller {

    @Autowired
    private PhoneValidationService validate;
    @Autowired
    private  FileService file;
    @Autowired
    private CaseService caseService;

    @GetMapping("/json")
    public NestedJson getJson(){
        return caseService.getJson();
    }

    @GetMapping("/json/items")
    public List<CaseModel> getJsoItems(){
        List<CaseModel> items = caseService.getJson().getItems();
        return items;
    }

    @GetMapping("/titles")
    public List<String> getJsoItemsTitles(){
        List<String> list = new ArrayList<>();
        for (CaseModel model:getJsoItems()) {
           list.add(model.getTitle()) ;
        }
       return list;
    }

    @GetMapping("/titles/search")
    public CaseModel getCaseByName(@RequestParam(value = "title") String name){
        for (CaseModel model:getJsoItems()) {
            if (model.getTitle().equalsIgnoreCase(name)){
            return model;
            }
        }
        return null;
        }
        @GetMapping("/search")
        public String validatePhoneAndCase(
                                            @RequestParam (value = "title", required = true) String name,
                                            @RequestParam (value = "phoneNumber", required = true) String phoneNumber){
            if (getCaseByName(name) != null && validate.phoneValidation(phoneNumber)){
                return "redirect:/reports good";
            }else{
                return "redirect:/titles bed";
            }
        }
        @PostMapping("/reports")
        public void fileTheReport(@RequestParam(value = "ipAddress", required = true)String ipAddress,
                                  @RequestParam (value = "report", required = true)String report) throws IOException, GeoIp2Exception {
            file.writer(ipAddress, report);
        }
}
