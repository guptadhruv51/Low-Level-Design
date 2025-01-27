package StructureDesignPatterns.CompositePattern.Solution;

public class File implements FileSystemComp
{
    private String name;

    public File(String name) {
        this.name = name;
    }
    public void showDetails()
    {
        System.out.println("File "+this.name);
    }
}
