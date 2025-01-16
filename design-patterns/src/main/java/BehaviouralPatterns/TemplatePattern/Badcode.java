package BehaviouralPatterns.TemplatePattern;

class CSVParser
{
    void parse()
    {
        openFile();

        System.out.println("Parsing a CSV File");
        closeFile();
    }
    private void openFile()
    {
        System.out.println("Opening File");
    }
    private void closeFile()
    {
        System.out.println("Closing File");
    }
}

class JSONParser
{
    void parse()
    {
        openFile();

        System.out.println("Parsing a JSON File");
        closeFile();
    }
    private void openFile()
    {
        System.out.println("Opening File");
    }
    private void closeFile()
    {
        System.out.println("Closing File");
    }
}
public class Badcode
{
    public static void main(String[] args)
    {
        /**
         * Violates DRY: Do not repeat yourself
         * Too much code duplication
         */
        CSVParser csvParser=new CSVParser();
        csvParser.parse();
        JSONParser jsonParser=new JSONParser();
        jsonParser.parse();

    }
}
