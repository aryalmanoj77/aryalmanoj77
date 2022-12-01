 //Name : Manoj Aryal
 //Class: CSET 1200
 //Instructor: Dr. Jared Oluoch
 //Programming Assignment: 13
 //Date: 11/28/2022
//This code is my own work. I did not get any help from any online source 
//such as chegg.com; from a classmate, or any other person other than the instructor 
//or TA for this course. I understand that getting outside help from this course 
//other than from the instructor or TA will result in a grade of 0 in this 
//assignment and other disciplinary actions for academic dishonesty.
//SUMMARY: This program calculates the area of a triangle , rectangle and square by using the input given by the user and also calculates the total area of the shapes using array and for loop
//YouTube URL:https://youtu.be/MZkOd1WvZKM
import java.util.Scanner;
class addAreaNum {
	public static double addArea(GeomObject[]b) {
		double addArea=0;
		for( int i=0; i<b.length;i++) {
			addArea+=b[i].getArea();
		}
		return addArea;
	}
	public static void main(String[]args) {
		//one Triangle, one Rectangle, and one Square)
		double height1,base1,width2,length2,length3,length4;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the height of the Triangle: ");
		height1=input.nextDouble();
		
		System.out.print("Enter the base of the Triangle: ");
		base1=input.nextDouble();

		System.out.print("Enter the width of the Rectangle: ");
		width2=input.nextDouble();
		
		System.out.print("Enter the length of the Rectangle: ");
		length2=input.nextDouble();
		
		System.out.print("Enter the length of a side of the sqaure: ");
		length3=input.nextDouble();
		System.out.print("Enter the breadth of a side of the sqaure: ");
		length4=input.nextDouble();
		
		GeomObject[] objects= { new Triangle(height1,base1), new Rectangle(width2,length2), new S(length3,length4)};
		System.out.println("Created a Sqaure with area: " +objects[2].getArea());
		System.out.println("Created a Recatngle with area: "+objects[1].getArea());
		System.out.println("Created a Triangle with area: "+objects[0].getArea());
		System.out.println("Total Area of the given shapes is :"+addArea(objects));
		}

	}

		abstract class GeomObject{
			abstract double getArea();
		
		}
		class Triangle extends GeomObject{
			double height1,base1;
			Triangle(double height1,double base1){
				this.height1= height1;
				this.base1=base1;
			
			}
			double getArea() {
				return 0.5*height1*base1;
			}
			
		}
		class Rectangle extends GeomObject{
		double width2,length2;
			
			Rectangle (double width2,double length2){
				this.width2=width2;
				this.length2=length2;
				
			}
			double getArea() {
				return width2*length2;
		
			}
		}
		
		class S extends GeomObject{
			double length3;
			double length4;
		S(double length3,double length4){
				this.length3=length3;
				this.length4=length4;
			}
			double getArea() {
				return length3*length4;
			}
		}
	
		
		