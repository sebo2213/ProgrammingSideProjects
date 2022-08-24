import java.util.LinkedList;

public class LinkedLists {

    public LinkedList<Integer> list;

    public static void main(String[] args){
        LinkedLists lists = new LinkedLists();
    }

    //create linked list
    public LinkedList create(int size){
        list = new LinkedList<>();
        for(int i = 0; i < size; i++){
            list.add(i);
        }
        return list;
    }

    //get list
    public LinkedList<Integer> getList(){
        return list;
    }

    //print linked list
    public void print(LinkedList<Integer> list){
        for (Integer data: list) {
            System.out.println(data + " ");
        }
    }

    //add node
    public void add(int data){
        list.add(data);
    }

    //remove node
    public void remove(int index) {
        list.remove(index); 
    }

    //find nth node

    //detect loop

    //remove loop

    //reverse list

    //sort list

    //merge list
}
