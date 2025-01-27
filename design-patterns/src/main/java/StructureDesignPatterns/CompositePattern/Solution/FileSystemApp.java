package StructureDesignPatterns.CompositePattern.Solution;

public class FileSystemApp
{
    public static void main(String[] args) {
        File file1=new File("File1.txt");
        File file2=new File("File2.txt");
        Folder folder=new Folder("Documents");
        Folder folder2=new Folder("Internal_Docs");
        folder.addFile(file1);
        folder.addFile(file2);
        folder.addFile(folder2);
        folder2.addFile(new File("File3.txt"));
        folder.showDetails();
    }
}
