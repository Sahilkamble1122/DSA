package queue;

import java.util.ArrayList;

class Double_ended_queue_implementation{
	
	ArrayList<Integer> arr = new ArrayList<>();
	
	void addBack(Integer e) {
		arr.add(e);
	}
	
	void addFront(Integer e) {
		arr.add(0,e);
	}
	
	Integer removeFront() {
		int temp= arr.get(0);
		arr.remove(0);
		return temp;
	}
	
    Integer removeBack() {
    	int temp= arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return temp;
	}
    
    Integer peekFront() {
    	return (arr.get(0));
    }
	Integer peekback() {
		return (arr.get(arr.size()-1));
	}	
}




public class Double_ended_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
