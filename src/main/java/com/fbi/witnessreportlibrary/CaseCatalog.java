//package com.fbi.witnessreportlibrary;
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//@RestController
//@RequestMapping("/cases")
//public class CaseCatalog {
//
//    @RequestMapping("/{title}")
//    public CaseItem getCases(@PathVariable("title") String title){
//        RestTemplate restTemplate = new RestTemplate();
//       CaseItem  caseItem = restTemplate.getForObject("https://api.fbi.gov/wanted/v1/list?title=" + title , CaseItem.class);
//        return caseItem;
//    }
//}
