import javax.swing.*;

public class BMICategories
{
	public static void main(String[] args)
	{
		String height = JOptionPane.showInputDialog("Your height in m: ");
		String weight = JOptionPane.showInputDialog("Your weight in kg: ");
		double realweight = Double.parseDouble(weight);
		double realheight = Double.parseDouble(height);
		double BMI = realweight / Math.pow(realheight, 2);
		if(BMI < 18.5){
			System.out.println("Your BMI is " + String.valueOf(BMI));
			System.out.println("BMI Category: underweight");
		}
		else if(BMI >= 18.5 && BMI <= 24.9){
			System.out.println("Your BMI is " + String.valueOf(BMI));
			System.out.println("BMI Category: normal weight");
		}
		else if(BMI >= 25 && BMI <= 29.9){
			System.out.println("Your BMI is " + String.valueOf(BMI));
			System.out.println("BMI Category: overweight");
		}
		else if(BMI >= 30){
			System.out.println("Your BMI is " + String.valueOf(BMI));
			System.out.println("BMI Category: obese");
		}
	}
}