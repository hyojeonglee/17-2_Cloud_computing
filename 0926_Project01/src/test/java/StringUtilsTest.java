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
			throw new Exception(); // Error �߻�
		}
	}
	// main �Լ��� ���� ��� @Test annotation�� ������
	// JUnit �����ӿ�ũ���� ����ȴ�!
}
