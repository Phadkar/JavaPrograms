package src.oops_13Jan2024.abstraction.realTimeExample;

public class TC1_Chrome extends BaseClass{
    @Override
    public void openBrowser() {
        System.out.println("Starting Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }
}
