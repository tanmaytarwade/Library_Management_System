import java.util.Scanner;

public class Project {

	public static void main(String args[])
	{
		
	char r;
		do { 
		
		System.out.println("********LIBRARY MANAGEMENT SYSTEM********");
		System.out.println("Press 1 to Add book");
		System.out.println("Press 2 to Issue a book");
		System.out.println("Press 3 to Return a book");
		System.out.println("Press 4 to Print complete issue details");
		System.out.println("Press 5 to Exit");
		Scanner sc = new Scanner(System.in);                                                
		System.out.println("Enter no.");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			Library l = new Library();
			l.add();
			break;
		case 2:
			Library ll = new Library();
			ll.issue();
			break;
		case 3:
			Library lll = new Library();
			lll.ret();
			break;
		case 4:
			Library llll = new Library();
			llll.detail();
			break;
		case 5:
			Library lllll = new Library();
			lllll.exit();
			break;
			default:
			 System.out.println("Invalid choice");
		}
		System.out.println("Next Option Y/N");
		r=sc.next().charAt(0);
		}
		while(r=='y'||r=='Y');
		if(r=='n'||r=='N')
		{
			Library z = new Library();
			z.exit();
		}
		}
	}
		
	
class Library
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.println("Enter book Name,Price,Book_no");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		float Price = s.nextInt();
		int Book_no = s.nextInt();
		System.out.println("your details are " +" "+ str + Price + Book_no);
	}
	void issue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Book name");
		str=sc.nextLine();
		System.out.println("Book_id");
		a=sc.nextInt();
		sc.nextLine();
		System.out.println("Issue date");
		b=sc.nextLine();
		System.out.println("Total no of Book Issued");
		c=sc.nextInt();
		sc.nextLine();
		System.out.println("Return Book Date");
		date=sc.nextLine();
		
	}
	int getid()
	{
		return a;
    }
	
	void ret()
	    {
		System.out.println("Enter Student Name & Book_id");
		Scanner c = new Scanner(System.in);
	    String name = c.nextLine();
	    int Book_id = c.nextInt();
	    if(a==Book_id)
	    {
	    	System.out.println("Total Details");
	    	System.out.println("Book Name:"+ Library.str);
	    	System.out.println("Book_id :"+ Library.a);
	    	System.out.println("Issue Date :"+ Library.b);
	    	System.out.println("Total no of Book Issued:"+ Library.c);
	    	System.out.println("Return Book Date :"+ Library.date);
	    }
	    else
	    {
	    	System.out.println("Wrond id, plz enter correct id");
	    }
	 }
			
	void detail()
	{
		
    	System.out.println("Book Name:"+ Library.str);
    	System.out.println("Book_id :"+ Library.a);
    	System.out.println("Issue Date :"+ Library.b);
    	System.out.println("Total no of Book Issued:"+ Library.c);
    	System.out.println("Return Book Date :"+ Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
	
}
