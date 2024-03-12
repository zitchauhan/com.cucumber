
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;



public interface WebElement_  {

  void click();
  void submit();
  void sendKeys(CharSequence... keysToSend);
  void clear();
  String getTagName();
  String getText();
  boolean isSelected();
  boolean isEnabled();
  boolean isDisplayed();
  List<WebElement> findElements(By by);
  WebElement findElement(By by);
  
  Point getLocation();
  Dimension getSize();
  Rectangle getRect();
  String getCssValue(String propertyName);
  

  
  default String getDomProperty(String name) {
    throw new UnsupportedOperationException("getDomProperty");
  }

  default String getDomAttribute(String name) {
    throw new UnsupportedOperationException("getDomAttribute");
  }

  String getAttribute(String name);

  default String getAriaRole() {
    throw new UnsupportedOperationException("getAriaRole");
  }

  default String getAccessibleName() {
    throw new UnsupportedOperationException("getAccessibleName");
  }

}
