package com.demoproject.repository;
import org.springframework.data.repository.CrudRepository;

import com.demoproject.model.Branch;
public interface BranchRepository extends CrudRepository<Branch, Integer>
{
}
