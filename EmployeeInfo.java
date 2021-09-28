import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id:-  ");
		int x = in.nextInt();
		
		System.out.println("Enter the Employee Name:- ");
		String y = in.next();
		
		System.out.println("Eneter the basic salary of Employee:- ");
		int z = in.nextInt();
		
			double hra,pf,ta,esi,gp,np;
			
			
			hra = x*0.2;
			pf = x*0.3;
			ta = x*0.1;
			esi = x*0.25;
			gp = x+hra+ta+esi;
			np = gp-pf;
			
		
		
		System.out.println("Salary Breakup  Application");
		System.out.println("================================================");
		System.out.println("Employee ID					:-"+x);
		System.out.println("Employee Name 				:-"+y);
		System.out.println("Employee basic Salary        :-"+z);
		System.out.println("HRA							:-"+hra);
		System.out.println("PF							:-"+pf);
		System.out.println("TA							:-"+ta);
		System.out.println("ESI							:-"+esi);
		System.out.println("Gross Pay					:-"+gp);
		System.out.println("Net Pay						:-"+np);
	}

}
