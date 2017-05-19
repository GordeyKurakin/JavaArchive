import javax.swing.*;

public class BMICategories1
{
	public static void main(String[] args)
	{
		String height = JOptionPane.showInputDialog("Your height in inches: ");
		String weight = JOptionPane.showInputDialog("Your weight in pounds: ");
		double realweight = Double.parseDouble(weight);
		double realheight = Double.parseDouble(height);
		double BMI = (realweight*0.45) / Math.pow((realheight*0.0254), 2);
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