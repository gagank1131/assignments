package com.company.question7;

import java.util.ArrayList;
import java.util.List;

public class DeveloperDirectory implements Directory {
    
    List<Directory> developerList = new ArrayList<Directory>();
    
    @Override
    public void ShowDirectoryDetails() {
        System.out.println("Developer Directory");
        developerList.forEach(e->e.ShowDirectoryDetails());
    }
}
