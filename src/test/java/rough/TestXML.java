package rough;

import utilities.XMLReader;

public class TestXML {
    public static void main(String[] args) {
        XMLReader xml = new XMLReader(System.getProperty("user.dir")+"\\src\\test\\resources\\locator\\OR.xml");
        System.out.println(xml.getLocator("homepage.header.username.css"));

        //driver.findElement(By.xpath(xml.getLocator("homepage.header.username.css"))).sendKeys();

    }
}
