package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] arr; 
	
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arr[loc];
	}
	
	public void add(T val) {
		T[] add=(T[]) new Object[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			add[i]=arr[i];
		}
		add[add.length-1]=val;
		arr=add;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException
	{
		T[] insert=(T[]) new Object[arr.length+1];
		for(int i=0; i<insert.length; i++) {
			if(i<loc) {
					insert[i]=arr[i];
			}
			else if(i==loc) {
				insert[i]=val;
			}
			else if(i>loc) {
				insert[i]=arr[i-1];
			}
		
			
		}
		arr=insert;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] remove=(T[]) new Object[arr.length-1];
		for(int i=0; i<remove.length; i++) {
			if(i<loc) {
					remove[i]=arr[i];
			}
			else if(i>=loc) {
				remove[i]=arr[i+1];
			}
		
			
		}
		arr=remove;
	}
	
	public boolean contains(T val) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return arr.length;
	}
}