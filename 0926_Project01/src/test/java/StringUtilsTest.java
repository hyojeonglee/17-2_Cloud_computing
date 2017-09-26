import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
	@Test
	public void testIsBlank() {
		
		Assert.assertTrue(StringUtils.isBlank(null));
		
		///////////////
		// Shortcuts //
		///////////////
		/* ctrl + space = help
		 * F3 = Function manual
		 * sysout + control + space */
		
		
		////////////////////////
		// Before Refactoring //
		////////////////////////
		/* if (StringUtils.isBlank(a)) {
			System.out.println("a is blank.");
		} */
	}
	
	@Test
	public void testIsBlank2() throws Exception {
		String a = null;
		if (StringUtils.isBlank(a)) {
			throw new Exception(); // Error 발생
		}
	}
	// main 함수가 따로 없어도 @Test annotation이 있으면
	// JUnit 프레임워크에서 실행된다!
}
