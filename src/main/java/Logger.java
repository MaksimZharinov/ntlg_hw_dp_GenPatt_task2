import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static Logger logger = new Logger();
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + now.format(formatter) + num++ + "] " + msg);
    }

    private Logger() {}

    public static Logger getInstance() {
        return logger;
    }
}