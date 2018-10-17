package java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

public class ForEachExample {
  public static void main(String[] args) {
      List<Integer> myList = new ArrayList<Integer>();
      for(int i = 0; i < 10; i++) {
          myList.add(i);
      }
      //using iterator
      Iterator<Integer> iterator = myList.iterator();
      while(iterator.hasNext()) {
          System.out.println(iterator.next());
      }
      
      System.out.println("traverse using Consumer implementation");
      MyConsumer consumer = new MyConsumer();
      myList.forEach(consumer);
      
      System.out.println("traverse using anonymous class");
      myList.forEach(new Consumer<Integer>() {

        @Override
        public void accept(Integer t) {
            System.out.println(t);
            
        }});
  }
  
  private static class MyConsumer implements java.util.function.Consumer<Integer> {

    @Override
    public void accept(Integer t) {
       System.out.println(t);
        
    }
      
  }
}
