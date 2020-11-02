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

import com.demoproject.model.Branch;
import com.demoproject.service.BranchService;

@RestController
public class BranchController 
{

@Autowired
BranchService branchService;

@GetMapping("/branch")
private List<Branch> getAllBranch() 
{
return branchService.getAllBranch();
}

@GetMapping("/branch/{branchid}")
private Branch getBranch(@PathVariable("branchid") int branchid) 
{
return branchService.getBranchById(branchid);
}

@DeleteMapping("/branch/{branchid}")
private void deleteBranch(@PathVariable("branchid") int branchid) 
{
branchService.delete(branchid);
}

@PostMapping("/branch")
private int saveBranch(@RequestBody Branch branch) 
{
branchService.saveOrUpdate(branch);
return branch.getBranchid();
}

@PutMapping("/branch")
private Branch update(@RequestBody Branch branch) 
{
branchService.saveOrUpdate(branch);
return branch;
}
}
