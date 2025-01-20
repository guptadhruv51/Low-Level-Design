package CreationalPatterns.SingletonPattern.Solution;

public class AppSettings
{
    //Step:1 create a private static instance of class
    private static AppSettings instance;
    private String databaseUrl;

    private String apiKey;

//Step-2 make the constructor private so that no object can be created
    private AppSettings()
    {
        this.databaseUrl="jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey="123456-ABCD";
    }

    //Only instantiate the new object if there is no other object
    public static AppSettings getInstance()
    {
        if(instance==null) {
            instance = new AppSettings();
        }
        return instance;
    }
    public String getDatabaseUrl()
    {
        return databaseUrl;
    }
    public String getApiKey()
    {
        return apiKey;
    }
}
