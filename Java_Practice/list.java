import java.util.*;
public class list {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("1");
        lst.add("1");
        lst.add("1");
        lst.add("1");
        lst.add("1");
        lst.add("1");
        for(int i=0;i<lst.size();i++){
            for(int j=i+1;j<lst.size();j++){
                if(lst.get(i)==lst.get(j)) {
                    lst.remove(j);
                }
            }
        }
        Iterator<String> ite = lst.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        } 
    }
}
