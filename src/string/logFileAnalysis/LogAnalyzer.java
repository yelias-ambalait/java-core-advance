package string.logFileAnalysis;

import java.util.ArrayList;
import java.util.List;

public class LogAnalyzer {
    private List<LogEntry> logEntries;
    public LogAnalyzer() {
        this.logEntries = new ArrayList<>();
    }
    public void addLogEntry(String logEntry) {
        String[] parts = logEntry.split(" ", 3);
        if (parts.length == 3) {
            logEntries.add(new LogEntry(parts[0], parts[1], parts[2]));
        }
    }
    public void getLogEntries() {
        for (LogEntry logEntry : logEntries) {
            System.out.println(logEntry);
        }
    }
}
