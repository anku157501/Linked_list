package Linkyyyy;
import java.util.*;
class Node{
    int data;
    Node next;
    public Node(){
        data=0;
        next=null;
    }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public void setdata(int data){
        this.data=data;
    }
    public int getdata(){
      return data;
    }
    public void setnext(Node next){
        this.next=next;
    }
    public Node getnext()
    {
        return next;
    }
}
public class llllist {

    Node start;
    public llllist(){
        start=null;
    }
    public boolean isempty(){
        if(start==null){
            return true;
        }
        else
            return false;
    }
    public void Insert(int data){
        Node temp,newNode;
        newNode =new Node();
        newNode.setdata(data);
        temp=start;
        if(temp==null){
            start=newNode;
        }
        else
        {
            while(temp.getnext()!=null){
                temp=temp.getnext();

            }
            temp.setnext(newNode);


        }

    }
public void Insert2(int data){
        Node n;
        n=new Node();
        n.setnext(start);
        n.setdata(data);
        start=n;
}
public int count(){
    Node temp;
    int c=0;
        if(temp==null){
            System.out.println("empty");
    }
    else
    {
        while(temp!=null){
            c++;
            temp=temp.getnext();

        }
        return c;

    }
public void Insert3(int data,int pos){
        if(pos>count()){

        }
        }
public void display() {
    Node temp;
    temp = start;
    if (temp == null) {
        System.out.println("empty list");
    } else {
        while (temp!= null) {
            System.out.println(temp.getdata());
            temp = temp.getnext();

        }

    }
}
public static void main(String args[]){
        llllist l=new llllist();
        boolean b=l.isempty();
        Scanner sc=new Scanner(System.in);
        int f=0;
        if(b){
        System.out.println("empty");
        f=1;
    }
        else{
            System.out.println("full");
        }
        if(f==1){
            System.out.println("enter the inserting at the end");
            int r=sc.nextInt();
            l.Insert(r);
            System.out.println("enter the data at begining");
            int g=sc.nextInt();
            l.Insert2(g);
        }
        l.display();

}}