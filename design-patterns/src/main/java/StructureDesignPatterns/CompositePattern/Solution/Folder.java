package StructureDesignPatterns.CompositePattern.Solution;

import StructureDesignPatterns.CompositePattern.Problem.FileSystemApp;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComp
{
    private String name;
    private List<FileSystemComp> files=new ArrayList<>();

    public Folder(String name)
    {
        this.name=name;
    }
    public void addFile(FileSystemComp file)
    {
        files.add(file);
    }
    public void showDetails()
    {
        System.out.println("Folder "+name);
        for(FileSystemComp f:files)
            f.showDetails();
    }

}
