package string.stringBuilder.reportBuilder;

public class ReportBuilder {
    private StringBuilder reportBuilder = new StringBuilder();
    public void addSection(String sectionTitle, String sectionContent) {
        reportBuilder.append("Section: ").append(sectionTitle).append("\n");
        reportBuilder.append(sectionContent).append("\n\n");
    }
    public String getReport() {
        return reportBuilder.toString();
    }

    public static void main(String[] args) {
        ReportBuilder builder = new ReportBuilder();

        builder.addSection("Header", "This is a HTML header");
        builder.addSection("Body", "This is a HTML body");
        builder.addSection("Footer", "This is a HTML footer");

        System.out.println(builder.getReport());
    }
}
