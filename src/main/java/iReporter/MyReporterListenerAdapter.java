package iReporter;

import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public class MyReporterListenerAdapter implements org.testng.IReporter {
    public void generateReport(List<XmlSuite> xml, List<ISuite> suites, String outdir) {}

}
