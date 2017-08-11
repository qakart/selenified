package unit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.coveros.selenified.selenium.Selenium.Locator;
import com.coveros.selenified.selenium.element.Element;

public class ElementTest {

    @Test
    public void checkElementTypeTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertEquals(element.getType(), Locator.ID);

        element.setType(Locator.NAME);
        Assert.assertEquals(element.getType(), Locator.NAME);
    }

    @Test
    public void checkElementLocatorTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertEquals(element.getLocator(), "myId");

        element.setLocator("newId");
        Assert.assertEquals(element.getLocator(), "newId");
    }

    @Test
    public void checkElementMatchTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertEquals(element.getMatch(), 0);

        element.setMatch(5);
        Assert.assertEquals(element.getMatch(), 5);
    }

    @Test
    public void checkElementWebDriverTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertNull(element.getDriver());
    }

    @Test
    public void checkFullElementTypeTest() {
        Element element = new Element(Locator.ID, "myId", 2);
        Assert.assertEquals(element.getType(), Locator.ID);

        element.setType(Locator.NAME);
        Assert.assertEquals(element.getType(), Locator.NAME);
    }

    @Test
    public void checkFullElementLocatorTest() {
        Element element = new Element(Locator.ID, "myId", 2);
        Assert.assertEquals(element.getLocator(), "myId");

        element.setLocator("newId");
        Assert.assertEquals(element.getLocator(), "newId");
    }

    @Test
    public void checkFullElementMatchTest() {
        Element element = new Element(Locator.ID, "myId", 2);
        Assert.assertEquals(element.getMatch(), 2);

        element.setMatch(5);
        Assert.assertEquals(element.getMatch(), 5);
    }

    @Test
    public void checkFullElementWebDriverTest() {
        Element element = new Element(Locator.ID, "myId", 2);
        Assert.assertNull(element.getDriver());
    }

    @Test
    public void checkPrettyOutputTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertEquals(element.prettyOutput(), " element with <i>ID</i> of <i>myId</i> ");
    }

    @Test
    public void checkPrettyOutputStartTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertEquals(element.prettyOutputStart(), "Element with <i>ID</i> of <i>myId</i>");
    }

    @Test
    public void checkPrettyOutputEndTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertEquals(element.prettyOutputEnd(), "element with <i>ID</i> of <i>myId</i>.");
    }

    @Test
    public void checkPrettyOutputLowercaseTest() {
        Element element = new Element(Locator.ID, "myId");
        Assert.assertEquals(element.prettyOutputLowercase(), "element with <i>ID</i> of <i>myId</i>");
    }
}