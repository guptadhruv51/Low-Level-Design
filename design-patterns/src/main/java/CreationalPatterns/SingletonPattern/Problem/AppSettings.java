package CreationalPatterns.SingletonPattern.Problem;

public class AppSettings
{
    private String databaseUrl;

    private String apiKey;
    public AppSettings()
    {
        this.databaseUrl="jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey="123456-ABCD";
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
