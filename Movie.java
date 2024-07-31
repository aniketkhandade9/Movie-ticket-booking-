import java.util.*;

class Movie{
	Scanner sc=new Scanner(System.in);
	int[] movieno=new int[10];
	String[] pname=new String[33];
	String[] atime=new String[10];
	String[] dtime=new String[10];
	String[] drname=new String[10];
	String[] to=new String[10];
	String[] from=new String[10];
	int i=0,p=0;

	public void start(){
		System.out.println("Enter the Choice: ");
		System.out.println("1.Add Movie\n2.Movie Reservation\n3.Show Seat reservation\n4.Show Available Movies\n5.Exit");
		int ch=sc.nextInt();
		switch (ch) {
			case 1:
				addmovie();
			case 2:
				movieres();
			case 3:
				showres();
			case 4:
				availmovie();
			case 5:
				System.exit(0);	
			default:
				System.out.println("Invalid Choice.");
				start();
		}
	}

	public void addmovie(){
		System.out.println("Enter Movie No: ");
		movieno[i]=sc.nextInt();
		
		System.out.println("Arrival Time: ");
		atime[i]=sc.nextLine();
		atime[i]=sc.nextLine();
		
		System.out.println("From: ");
		from[i]=sc.nextLine();
		System.out.println("To: ");
		to[i]=sc.nextLine();
		System.out.println("Movies Added Succesfully.");
		++i;
		System.out.println();
		start();
	}

	public void movieres(){
		System.out.println("Enter Movie No: ");
		int movieno1=sc.nextInt();
		for (int j=0;j<10 ;++j ) {
			if (movieno1==movieno[j]) {
				System.out.println("Enter Seat No: ");
				int st1=sc.nextInt();
				if (st1<=32) {
					p=st1;
					System.out.println("Enter Name: ");
					pname[p]=sc.next();
					System.out.println();	
					System.out.println("Reservation Completed.");
					System.out.println();
					start();	
				}else {
					System.out.println("There are 32 Seats.");
					System.out.println();
					movieres();
				}
			}
			else{
				System.out.println();
				System.out.println("Movie Not Found.");
				System.out.println();
				start();
			}
		}
	}

	public void showres(){
		System.out.println("Enter Movie No: ");
		int movieno2=sc.nextInt();
		for (int j=0;j<10 ;++j ) {
			if (movieno2==movieno[j]) {
				System.out.println("*************************************************************************************************");
				System.out.println("Movie No: "+movieno[j]);
				
				System.out.println("Entry Time: "+atime[j]+"\t\tExit Time: "+dtime[j]);
				System.out.println("Movie time                  From: "+from[j]+"\t\tTo: "+to[j]);
				System.out.println("*************************************************************************************************");
				for (int k=1;k<=32 ;++k ) {
					System.out.println(k+"."+pname[k]);
				}
			}else {
				System.out.println("Movie Not Found.");
				System.out.println();
				start();
			}
		}
	} 

	public void availmovie(){
		for (int j=0;j<10 ;++j ) {
			System.out.println("*************************************************************************************************");
			System.out.println("Movie No: "+movieno[j]);
			
			System.out.println("Entry Time: "+atime[j]+"\t\tExit Time: "+dtime[j]);
			System.out.println(": "+from[j]+"\t\t: "+to[j]);
			System.out.println("*************************************************************************************************");
		}
		System.out.println();
		start();
	}
}

class MovieReservation{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Movie mo=new Movie();
		String admin,admin1="Sejal",pss,pss1="1234";
		System.out.println("Enter Username: ");
		admin=in.next();
		System.out.println("Enter Passward: ");
		pss=in.next();
		if (admin.equals(admin1) && pss.equals(pss1)) {
			System.out.println();
			mo.start();
		}else {
			System.out.println("Invalid Username or Passward.");
		}
	}	
}