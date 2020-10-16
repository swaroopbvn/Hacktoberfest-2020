package stack;
import java.util.Scanner;
public class Stack {
	private int ar[]=new int[10];
	private	int size;
	private	int top;
	Stack()
	{size=10;top=-1;}
	void push(int a)
	{
		if(top<size-1)
		{
			ar[top+1]=a;
			top++;
		}
		else
			System.out.println("Stack Overflow");
	}
	void pop()
	{
		if(top>-1)
			top--;
		else
			System.out.println("Stack Underflow");
	}
	void display()
	{
		if(top==-1)
			System.out.println("Empty stack!!");
		else 
		{
			for(int i=top;i>=0;i--)
				System.out.print(ar[i]+"\n");
		}
			
	}

	public static void main(String[] args) 
	{
		Stack s= new Stack();
		int c=1;
		int a;
		Scanner in= new Scanner(System.in);
		while(c!=0)
		{
			System.out.println("MAIN MENU");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("0.Exit");
			c=in.nextInt();		
			switch(c)
			{
			case 1:
				System.out.print("Enter the element: ");
				a=in.nextInt();
				s.push(a);
				break;
			case 2:
				System.out.println("Deleting an element");
				s.pop();
				break;
			case 3:
				System.out.println("Fetching elements");
				s.display();
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			
		}
		
	

	
	}
}
