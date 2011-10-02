/**
 * 
 */
package test;

import main.Doller;
import junit.framework.TestCase;

/**
 * @author nomadmonad
 *
 */
public class MoneyTest extends TestCase {

	public void testManipulation() {
		Doller five = new Doller(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}
