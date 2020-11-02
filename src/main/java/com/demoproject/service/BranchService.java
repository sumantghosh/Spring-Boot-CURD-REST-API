package com.demoproject.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.model.Branch;
import com.demoproject.repository.BranchRepository;


@Service
public class BranchService 
{
@Autowired
BranchRepository branchRepository;

public List<Branch> getAllBranch() 
{
List<Branch> branch = new ArrayList<Branch>();
branchRepository.findAll().forEach(branch1 -> branch.add(branch1));
return branch;
}

public Branch getBranchById(int id) 
{
return branchRepository.findById(id).get();
}

public void saveOrUpdate(Branch branch) 
{
branchRepository.save(branch);
}

public void delete(int id) 
{
branchRepository.deleteById(id);
}

public void update(Branch branch, int branchid) 
{
branchRepository.save(branch);
}
}