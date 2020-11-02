package com.demoproject.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.model.Business;
import com.demoproject.service.BusinessService;

@RestController
public class BusinessController 
{

@Autowired
BusinessService businessService;

@GetMapping("/business")
private List<Business> getAllBusiness() 
{
return businessService.getAllBusiness();
}

@GetMapping("/business/{businessid}")
private Business getBusiness(@PathVariable("businessid") int businessid) 
{
return businessService.getBusinessById(businessid);
}

@DeleteMapping("/business/{businessid}")
private void deleteBusiness(@PathVariable("businessid") int businessid) 
{
businessService.delete(businessid);
}

@PostMapping("/business")
private int saveBusiness(@RequestBody Business business) 
{
businessService.saveOrUpdate(business);
return business.getBusinessid();
}

@PutMapping("/business")
private Business update(@RequestBody Business business) 
{
businessService.saveOrUpdate(business);
return business;
}
}
