import java.util.Arrays;
public class ArrayList{
    private int[] data;
    private int last; 
    
    public ArrayList(){
        data = new int[10];
        last = -1;  
    }

    public int size(){
        return last+1;
    }

    public int get(int index){
        return (data[index]);
    } 

    public void set(int index, int newValue){
        data[index]=newValue;
    }

    public int remove(int index){
        int remove=data[index];
        for(int i=index; i<=last; i++){
            data[i]=data[i+1];
            }
        last--;
        return remove;
    }
    
    public void add(int index, int newValue){
        if(last==data.length-1){
            resize();
        }
        for(int j=last+1; j>index; j--){
            data[j]=data[j-1];
        }
         data[index]=newValue;
         last++;
      }
    
    public void add(int newValue){
        add(last+1, newValue);
    }

    private void resize(){
        int [] tempArray=new int[2*data.length];
        for(int i=0; i<data.length; i++){
            tempArray[i]=data[i];
        }
        data=tempArray;
    }
    
    public String toString(){
        String result="[";
        for(int j=0; j<last; j++){
             result=result+data[j]+", ";
             if(last==-1){
                return(result+"]");
            }
        }  
        return(result+data[last]+"]");
      }
      
    public boolean equals(ArrayList otherList){
        if(otherList.size()!=this.size()){
            return false;
        }
        for(int i=0; i<this.size(); i++){
            if(this.get(i)!=otherList.get(i)){
                return false;
            }
        }
        return true;
    }
   }