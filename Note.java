public class Note{
   /*
   Of the format:
   C1 = 0
   C1s = 1
   C2 = 13 and so on...
   */
   int value = 0;
   
   void Note(){
      
   }
   
   void Note(val){
      value = val;
   }
   
   void setValue(val){
      value = val;
   }
   
   int getValue(){
      return value;
   }
}