package servicestack.net.javalinqexamples.support;

/**
 * Created by mythz on 7/26/2015.
 */
public class LogProvider {

    public void println(LogType type, Object message) {
        System.out.println(getPrefix() + logTypeString(type) + ": " + message);
    }

    public LogProvider() {}

    public LogProvider(String prefix) {
        this.prefix = prefix;
    }

    public LogProvider(String prefix, boolean debugEnabled) {
        this.prefix = prefix;
        this.debugEnabled = debugEnabled;
    }

    protected String prefix = null;
    protected boolean debugEnabled = false;

    protected String getPrefix(){
        return prefix == null
                ? ""
                : "[" + prefix + "] ";
    }

    public boolean isDebugEnabled() {
        return debugEnabled;
    }

    public String logTypeString(LogType logType) {
        switch (logType) {
            case DEBUG:
                return "DEBUG";
            case WARN:
                return "WARN";
            case INFO:
                return "INFO";
            case ERROR:
                return "ERROR";
            default:
                return "UNKNOWN";
        }
    }

    public void d(Object msg) {
        debug(msg);
    }
    public void debug(String msg) {
        debug((Object) msg);
    }
    public void debug(Object msg) {
        println(LogType.DEBUG, msg);
    }

    public void i(Object msg) {
        info(msg);
    }
    public void info(String msg) {
        info((Object) msg);
    }
    public void info(Object msg) {
        println(LogType.INFO, msg);
    }

    public void w(Object msg) {
        warn(msg);
    }
    public void warn(String msg) {
        warn((Object) msg);
    }
    public void warn(Object msg){
        println(LogType.WARN, msg);
    }

    public void e(Object msg) {
        error(msg);
    }
    public void e(Object msg, Exception ex) {
        error(msg, ex);
    }
    public void error(String msg) {
        error((Object) msg);
    }
    public void error(Object msg){
        println(LogType.ERROR, msg);
    }
    public void error(Object msg, Exception ex){
        println(LogType.ERROR, msg + "\nEXCEPTION" + ex);
    }
}
