package singleton;

public class Configuration {

    private static final Configuration INSTANCE = new Configuration();
    private LogLevels logLevel;
    private String catalogue;
    private String status;
    private long countOfCalls;

    private Configuration(){

    }

    public static Configuration getInstance(){
        INSTANCE.countOfCalls++;
        return INSTANCE;
    }

    public LogLevels getLogLevel() {
        countOfCalls++;
        return logLevel;
    }

    public void setLogLevel(LogLevels logLevel) {
        countOfCalls++;
        this.logLevel = logLevel;
    }

    public String getCatalogue() {
        countOfCalls++;
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        countOfCalls++;
        this.catalogue = catalogue;
    }

    public String getStatus() {
        countOfCalls++;
        return status;
    }

    public void setStatus(String status) {
        countOfCalls++;
        this.status = status;
    }

    public long getCountOfCalls() {
        countOfCalls++;
        return countOfCalls;
    }
}
