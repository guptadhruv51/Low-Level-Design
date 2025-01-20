package CreationalPatterns.SingletonPattern.Solution;

public class WithoutSingletonpattern
{
    public static void main(String[] args) {
        AppSettings appSettings=AppSettings.getInstance();
        AppSettings appSettings1=AppSettings.getInstance();
        System.out.println(appSettings1==appSettings);

        System.out.println(appSettings1.getApiKey());
        System.out.println(appSettings.getApiKey());
    }
}
