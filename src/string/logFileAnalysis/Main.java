package string.logFileAnalysis;

public class Main {
    public static void main(String[] args) {
        LogAnalyzer logAnalyzer = new LogAnalyzer();

        logAnalyzer.addLogEntry("2024-07-28_09:00:05 Info  Application stared.");
        logAnalyzer.addLogEntry("2024-07-28_03:57:59 Warn  Disk cleanup.");
        logAnalyzer.addLogEntry("2024-07-28_04:02:00 Restart  Restarted application");

        logAnalyzer.getLogEntries();

    }
}
