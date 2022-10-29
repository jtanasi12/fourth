package circularQueue;

public class circularQueue 
{
	private int[] que;
	private int   front;
	private int   rear;
	private int   size;
	
	public circularQueue(int size)
	{
		this.size = size;
		
		que = new int[this.size];
		
		front = -1;
		rear  = -1;
	}
	
	
	public boolean isEmpty()
	{
		return (front == -1 && rear == -1);
	}
	
	public boolean isFull()
	{
		return ((rear + 1) % size == front);
	}
	
	public void enQueue(int data)
	{
		if(isFull())
			System.out.println("Your Queue is full!");
		else
		{
			if(isEmpty())
				front++;
			
			rear = ((rear + 1) % size);
			
			que[rear] = data;
		}
		
	}
	
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Your Queue is empty!");
			
			return -1;
		}
				
		else
		{
			int temp = que[front]; // copy of the old element we are deleting

			if(rear == front) // This is only true when there is one element in the que
			{
				rear = front = -1;
			}
			else
			{
				front = ((front + 1) % size);
			}
		
		
		return temp;
		}
	}
}
