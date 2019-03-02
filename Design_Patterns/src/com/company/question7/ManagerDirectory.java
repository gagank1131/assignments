package com.company.question7;

import java.util.ArrayList;
import java.util.List;

public class ManagerDirectory implements Directory {
    
    List<Directory> managerList = new ArrayList<Directory>();
    
    @Override
    public void ShowDirectoryDetails() {
        System.out.println("Manager Directory");
        managerList.forEach(e -> e.ShowDirectoryDetails());
    }
}
