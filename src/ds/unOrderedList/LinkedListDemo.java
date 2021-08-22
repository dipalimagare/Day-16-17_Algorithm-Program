package ds.unOrderedList;
import ds.unOrderedList.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		String str = "be to not or be To";
		// spliting the words of string and stroring into array
		String[] arr = str.split(" ");
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			list.add(arr[i]);
		}

		list.printList();
		System.out.println();

		// searching for enterd elements,if it is there,then deleting it
		if (list.search(list.head, "Dipali")) {
			System.out.printf("Yes %s is present \n", "Dipali");
			list.deleteNode("Dipali");
			list.printList();
			System.out.println();
		} else {
			// searching for enterd elements,if it is not there,then adding it
			System.out.printf("element %s not found and adding that element to list \n", "Dipali");

			list.add("Dipali");
			list.printList();
		}
	}

}
