package circularQueue;

public class stack 
{
	private int[] newStack;
	private int   size;
	private int   top;
	
	
	public stack(int size)
	{
		this.size = size;
		
		newStack = new int[this.size];
		
		top = -1;
	}
	
	public boolean isFull()
	{
		return (top == size-1);
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public void push(int data)
	{
		if(isFull())
			System.out.println("Your Stack is full");
		else
		{
			newStack[++top] = data;
			
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int temp = newStack[top];
			
			top--;
			
			return temp;
		}
		else
		{
			System.out.println("Your Stack is empty");
			return -1;

		}
	}
	
	
}


