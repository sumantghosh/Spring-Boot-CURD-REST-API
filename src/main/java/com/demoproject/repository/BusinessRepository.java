package com.demoproject.repository;
import org.springframework.data.repository.CrudRepository;

import com.demoproject.model.Business;
public interface BusinessRepository extends CrudRepository<Business, Integer>
{
}
