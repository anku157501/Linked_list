package Linkyyyy;
class Emp{
    String Ename;
    int Esal;
    String Post;
    Emp(){
        Ename=null;
        Esal=0;
        Post=null;
    }
    Emp(String Ename,int Esal,String Post){
        this.Ename=Ename;
        this.Esal=Esal;
        this.Post=Post;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public int getEsal() {
        return Esal;
    }

    public void setEsal(int esal) {
        Esal = esal;
    }
}
public class circular_linkedlist {
}
