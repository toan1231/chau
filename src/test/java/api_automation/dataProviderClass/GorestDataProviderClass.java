package api_automation.dataProviderClass;

import org.testng.annotations.DataProvider;

public class GorestDataProviderClass {
    @DataProvider(name = "dataProvider")
    public Object[][] method() {
        return new Object[][]  {
                {"John@gmail.com", "John", "female", "Active"},
                {"David@gmail.com", "David", "male", "Inactive"},
                  };

    }

    public Object[][] dpMethod() {
        return new Object[][]{};
    }
}
