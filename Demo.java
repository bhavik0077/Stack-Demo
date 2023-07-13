import java.util.*;
public class Demo{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int n = sc.nextInt();
		stack s1 = new stack(n);
		while(true)
		{
			System.out.println(" Enter 1 for push \n Enter 2 for pop \n Enter 3 for peep \n Enter 4 for Change \n Enter 5 for display \n Enter 6 for Exit");
		int m = sc.nextInt();
		switch(m){
			case 1:
				System.out.println("Enter the element for push");
				int pu = sc.nextInt();
				s1.push(pu);
				break;	
			case 2:
				System.out.println("Enter element for pop");
				s1.pop();
				break;
			case 3:
				System.out.println("Enter index for peep");
				int peep = sc.nextInt();
				s1.peep(peep);
				break;
			case 4:
				System.out.println("Enter index for change");
				int index = sc.nextInt();
				System.out.println("Enter number for change");
				int num = sc.nextInt();
				s1.change(index,num);
				break;
			case 5:
				s1.display();
				break;
			case 6:
				System.exit(0);
				break;
			}
		}
	}
}
class stack{
		int[] arr;
		int top = -1;
		stack(int n){
			arr = new int[n];
		}
		public void push(int number){
			top = top+1;
			if (top>=arr.length) {
				System.out.println("StackOverflow");
				top--;
			}
			else{
				arr[top] = number;
			}
		}
		public void pop(){
			if (top<0) {
				System.out.println("Stack Under flow");
			}
			else{
				top--;
				System.out.println("poped element "+arr[top+1]);
				arr[top+1]=0;
			}
		}
		public void peep(int i){
			if ((top-i+1)<0) {
				System.out.println("Stack Underflow");
			}
			else{
				System.out.println("Peeped element "+arr[top-i+1]);
			}
		}
		public void change(int index, int num){
			if ((top-index+1)<0) {
				System.out.println("Stack Underflow");
			}
			else{
				System.out.println("Changed element "+arr[top-index+1]);
				arr[top-index+1] = num;
			}
		}
		public void display(){
			for (int i=top;i>=0 ;i-- ) {
				System.out.println(arr[i]);
			}
		}
}