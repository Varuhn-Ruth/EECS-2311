/**
 * 
 */

/**
 * @author revanthkondepati
 *
 */
import javax.*;
import javax.swing.JLabel;
import venn.LabelArray;

public class RevTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LabelArray testArray = new LabelArray();
 		JLabel Test1 = new JLabel();
		LabelArray.addLabel(Test1, testArray.set);
		System.out.println(testArray.set.length + " " + testArray.set[testArray.set.length - 1].getName());
		
		JLabel Test2 = new JLabel();
		LabelArray.addLabel(Test2, testArray.set);
		System.out.println(testArray.set.length + " " +  testArray.set[testArray.set.length - 1].getName());
		
		LabelArray.removeLabel(0);
		System.out.println(testArray.set.length + " " +  testArray.set[testArray.set.length - 1].getName());
	}

}
