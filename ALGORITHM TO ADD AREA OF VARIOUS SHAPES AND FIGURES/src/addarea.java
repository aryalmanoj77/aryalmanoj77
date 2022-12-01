
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
	
		
		
