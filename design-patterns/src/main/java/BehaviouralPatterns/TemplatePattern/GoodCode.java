package BehaviouralPatterns.TemplatePattern;

abstract class DataParser
{
    public final void parse()
    {
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile()
    {
        System.out.println("Opening File");
    }
    protected  void closeFile()
    {
        System.out.println("Closing file");
    }
    protected abstract void parseData();
}

class CSVParserII extends DataParser
{
    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}
class JSONParserII extends DataParser
{
    @Override
    protected void parseData() {
        System.out.println("Parsing Json Data");
    }
}
public class GoodCode
{
    public static void main(String[] args)
    {
        DataParser csvParser=new CSVParserII();
        csvParser.parse();
        DataParser jsonParser=new JSONParserII();
        jsonParser.parse();
    }

}
