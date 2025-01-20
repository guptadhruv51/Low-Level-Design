package CreationalPatterns.SingletonPattern.Problem;

public class WithoutSingletonpattern
{
    public static void main(String[] args) {
        AppSettings appSettings=new AppSettings();
        AppSettings appSettings1=new AppSettings();

        System.out.println(appSettings1.getApiKey());
        System.out.println(appSettings.getApiKey());
    }
}
