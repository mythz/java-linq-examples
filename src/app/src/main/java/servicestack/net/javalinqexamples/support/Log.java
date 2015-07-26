package servicestack.net.javalinqexamples.support;

/**
 * Created by mythz on 7/26/2015.
 */
public class Log {

    public static LogProvider Instance = new LogProvider();

    public static void setInstance(LogProvider logger) {
        Instance = logger;
    }

    public static boolean isDebugEnabled() {
        return Instance.isDebugEnabled();
    }

    public static void d(Object msg) {
        Instance.debug(msg);
    }
    public static void debug(String msg) {
        Instance.debug((Object) msg);
    }
    public static void debug(Object msg) {
        Instance.debug(msg);
    }

    public static void i(Object msg) {
        Instance.info(msg);
    }
    public static void info(String msg) {
        Instance.info((Object) msg);
    }
    public static void info(Object msg) {
        Instance.info(msg);
    }

    public static void w(Object msg) {
        Instance.warn(msg);
    }
    public static void warn(String msg) {
        Instance.warn((Object) msg);
    }
    public static void warn(Object msg){
        Instance.warn(msg);
    }

    public static void e(Object msg) {
        Instance.error(msg);
    }
    public static void e(Object msg, Exception ex) {
        Instance.error(msg, ex);
    }
    public static void error(String msg) {
        Instance.error((Object) msg);
    }
    public static void error(Object msg){
        Instance.error(msg);
    }
    public static void error(Object msg, Exception ex){
        Instance.error(msg, ex);
    }
}
