package com.company.question7;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Directory {
    
    List<Directory> companyDirectory = new ArrayList<Directory>();
    
    @Override
    public void ShowDirectoryDetails() {
        companyDirectory.forEach(e->e.ShowDirectoryDetails());
    }
}
