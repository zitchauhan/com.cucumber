import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Beta;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;

public interface WebDriverD {
  
  void get(String url);
  String getCurrentUrl();
  String getTitle();
  String getPageSource();
  String getWindowHandle();
  void close();
  void quit();
  Set<String> getWindowHandles();
  
  Options manage();
  TargetLocator switchTo();
  Navigation navigate();
 
  
  interface Options 
  {
    void addCookie(Cookie cookie);
    void deleteCookieNamed(String name);
    void deleteCookie(Cookie cookie);
    void deleteAllCookies();
    Set<Cookie> getCookies();
    Cookie getCookieNamed(String name);
    Timeouts timeouts();
    Window window();
    @Beta
    Logs logs();
  }
  interface Timeouts 
  {
    @Deprecated
    Timeouts implicitlyWait(long time, TimeUnit unit);
  
    default Timeouts implicitlyWait(Duration duration) {
      return implicitlyWait(duration.toMillis(), TimeUnit.MILLISECONDS);
    }
    default Duration getImplicitWaitTimeout() {
      throw new UnsupportedCommandException();
    }
    @Deprecated
    Timeouts setScriptTimeout(long time, TimeUnit unit);
    @Deprecated
    default Timeouts setScriptTimeout(Duration duration) {
      return setScriptTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
    }
    default Timeouts scriptTimeout(Duration duration) {
      return setScriptTimeout(duration);
    }
    default Duration getScriptTimeout() {
      throw new UnsupportedCommandException();
    }
    @Deprecated
    Timeouts pageLoadTimeout(long time, TimeUnit unit);

    default Timeouts pageLoadTimeout(Duration duration) {
      return pageLoadTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
    }
    default Duration getPageLoadTimeout() {
      throw new UnsupportedCommandException();
    }
  }

  /** Used to locate a given frame or window. */
  interface TargetLocator {
	  
    WebDriver frame(int index);
    WebDriver frame(String nameOrId);
    WebDriver frame(WebElement frameElement);
    WebDriver parentFrame();
    WebDriver window(String nameOrHandle);
    WebDriver newWindow(WindowType typeHint);
    WebDriver defaultContent();
    WebElement activeElement();
    Alert alert();
  }

  interface Navigation 
  {
    void back();
    void forward();
    void to(String url);
    void to(URL url);
    void refresh();
  }

  @Beta
  interface Window {
    Dimension getSize();
    void setSize(Dimension targetSize);
    Point getPosition();
    void setPosition(Point targetPosition);
    void maximize();
    void minimize();
    void fullscreen();
  }
}
