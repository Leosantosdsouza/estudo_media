import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		double x, y, z, media;
		
		System.out.print("Digite o primeiro numero:");
		x = sc.nextDouble();
		
		System.out.print("Digite o segundo numero:");
		y = sc.nextDouble();
		
		System.out.print("Digite o terceiro numero:");
		z = sc.nextDouble();
		
		media = (x + y + z) / 3.0;
		System.out.println(" Media = " + media);
		sc.close();

	}

}