/**
 * Exercise1.BrowserDemo.java
 * Your Name:        Bora Avcu
 * Your Student ID:  250444902
 * Your Date:        23.11.2026
 */

package Exercise1;

public class BrowserDemo {
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        // STEP 1: Visit webpages and test back navigation.
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();

        // STEP 2: Visit another page and go back again.
        browser.visit("Facebook.com");
        browser.goBack();

        // STEP 3: Go forward once.
        browser.goForward();

        // STEP 4: Visit a new webpage (clears forward stack).
        browser.visit("stackoverflow.com");

        // STEP 5: Display the current webpage.
        browser.displayCurrentPage();

        // STEP 6: Display the complete browser history.
        browser.displayHistory();
    }
}