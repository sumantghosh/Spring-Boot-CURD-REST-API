package com.demoproject.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.model.Business;
import com.demoproject.repository.BusinessRepository;


@Service
public class BusinessService 
{
@Autowired
BusinessRepository businessRepository;

public List<Business> getAllBusiness() 
{
List<Business> business = new ArrayList<Business>();
businessRepository.findAll().forEach(business1 -> business.add(business1));
return business;
}

public Business getBusinessById(int id) 
{
return businessRepository.findById(id).get();
}

public void saveOrUpdate(Business business) 
{
businessRepository.save(business);
}

public void delete(int id) 
{
businessRepository.deleteById(id);
}

public void update(Business business, int businessid) 
{
businessRepository.save(business);
}
}