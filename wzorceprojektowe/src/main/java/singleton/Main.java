package singleton;

public class Main {
    public static void main(String[] args) {

        ConfigurationDoubleChecker instance1 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance1);
        instance1.setStatus("RUNNING");
        instance1.setCatalogue("C:/");
        instance1.setLogLevel(LogLevels.DEBUG);
        System.out.println(instance1.getCountOfCalls());

        ConfigurationDoubleChecker instance2 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance2);
        System.out.println(instance2.getCountOfCalls());
    }
}
