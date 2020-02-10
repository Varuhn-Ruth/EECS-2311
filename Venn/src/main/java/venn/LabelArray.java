package venn;

import javax.*;
import javax.swing.JLabel;

public class LabelArray {

	public static JLabel[] set = new JLabel[]{};

	// Initiated Class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	// This code runs when user clicks the finish button when they create a label
	public static void addLabel(JLabel newLabel, JLabel Array[]) {
		JLabel result[] = new JLabel[set.length + 1];
		for (int i = 0; i < result.length; i++) {
			String name = Integer.toString(i);
			if (i == set.length) {
				result[i] = newLabel;
				
			} else {
				result[i] = Array[i];
			}
			//Label name is the index location in this new array (result, not the set array)
			result[i].setName(name);
			
		}
		set = result;
	}

	public static void removeLabel(int index) {
		JLabel result[] = new JLabel[set.length - 1];
		for (int i = 0; i <= index; i++) {
			String name = Integer.toString(i);
			result[i] = set[i];
			//Label name is the index location in this new array (result, not the set array)
			result[i].setName(name);
		}
		
		for (int i = index + 1; i < result.length; i++) {
			String name = Integer.toString(i);
			result[i - 1] = set[i];
			//Label name is the index location in this new array (result, not the set array)
			result[i - 1].setName(name);
		}
		set = result;
	}

}
