import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethodsExamples {


    public static Object[][] page() {
        String allPage = "https://test1.z2data.com/alerts/Parts/All";
        String EOLPage = "https://test1.z2data.com/alerts/Parts/EOL";
        String majorPage  = "https://test1.z2data.com/alerts/Parts/Major";
        String minorPage = "https://test1.z2data.com/alerts/Parts/Minor";
        String FYIPage = "https://test1.z2data.com/alerts/Parts/FYI";
        String trackedPCNAndAlerts = "https://test1.z2data.com/alerts/Parts/Tracked";
        String archivedPCNAndAlerts = "https://test1.z2data.com/alerts/Parts/Archived";

        return new Object[][]{
                {allPage},
                {EOLPage},
                {majorPage},
                {minorPage},
                {FYIPage},
                {trackedPCNAndAlerts},
                {archivedPCNAndAlerts}
        };
    }

    public static Object[][] scopeSelector() {

        String allEventsScope = "?dType=5&sType=AllEvents";
        String sandBox = "?BomId=80360fcc-2adf-4ec0-a7a4-03907668bc12&dType=2"; //select Ahmad-Helal/HelaBOM01
        String entirePLMVault = "?dType=1&sType=PLM";
        String BOMs = "?dType=1&sType=BOM&parents.itemNumber=410-000077";
        String AVL = "?dType=1&sType=AVL&itemType=Item";
        String products = "?dType=1&sType=Segment&parents.itemNumber=920-000073,,920-000093";
        String commodity = "?dType=1&sType=Segment&commodity.commodity=Memory,,Connector,,Divider";
        String supplier = "?BomId=b5a91140-e48c-43b4-9811-11c7ffa60721&dType=1&sType=Segment&parts.company.companyName=Molex,,TXC%20Corporation,,Micron,,AVX,,Vishay%20Intertechnology,%20Inc.";

        return new Object[][]{
                {allEventsScope},
                {sandBox},
                {entirePLMVault},
                {BOMs},
                {AVL},
                {products},
                {commodity},
                {supplier}
        };
    }

    public static Object[][] switcher() {
        return new Object[][]{
                {"mpn"},
                {"pcn"}
        };
    }


    //combines 2 DataProviders
    @DataProvider(name = "scopeSelectorAndPage")
    public static Object[][] scopeSelectorAndPage() {
        Object[][] dataProvider1 = page();
        Object[][] dataProvider2 = scopeSelector();
        Object[][] combinedData = new Object[dataProvider1.length * dataProvider2.length][];
        int index = 0;
        for (int i = 0; i < dataProvider1.length; i++) {
            for (int j = 0; j < dataProvider2.length; j++) {
                combinedData[index++] = new Object[] {dataProvider1[i][0], dataProvider2[j][0]};
            }
        }
        return combinedData;
    }




    //combines 3 DataProviders
    @DataProvider(name = "combinedDataProvider")
    public Object[][] combinedDataProvider() {
        Object[][] page = page();
        Object[][] scopeSelector = scopeSelector();
        Object[][] switcher = switcher();
        Object[][] combinedData = new Object[page.length * scopeSelector.length * switcher.length][];
        int index = 0;
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < scopeSelector.length; j++) {
                for (int k = 0; k < switcher.length; k++) {
                    combinedData[index++] = new Object[]{page[i][0], scopeSelector[j][0], switcher[k][0]};
                }
            }
        }
        return combinedData;
    }



    @Test(dataProvider = "combinedDataProvider")
    public void testTestTest(String page, String scope, String switcher) {
        System.out.println("switcher :: "+switcher);
        System.out.println("test URL :: "+page+scope);
    }





}
