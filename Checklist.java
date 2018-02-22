import java.util.ArrayList;
import java.util.Arrays;

public class Checklist {

    ArrayList itemList = new ArrayList(); //ArrayList of Items
    String checklistName; //A checklist has a name
    ArrayList items = new ArrayList(); //A checklist has an array of items
    int numOfAPIs =  1;
    public String getName(){

        return this.checklistName;
    }

    public void setName(String name){
        if(name == null){
            checklistName = "Checklist";
        }
        checklistName = name;
    }

    private void clear(){
        itemList.clear();

    }


    //Item has an array of prices
    private double sum(ArrayList itemList){

        double walmartSum=0;
        for(int i=0; i<itemList.size(); i++){
            walmartSum += itemList.get(i).price[0];
        }

        return walmartSum;
    }


    private void print(){

        System.out.println(checklistName);
    }

    private void addItem( Item x ){
        itemList.add(x);

    }

    private void removeItem(Item x){

        itemList.remove(x);
    }

    private int compareSums(double[] sums){

        int size = sums.length;
        int maxIdx=0;
        double maxSum=0;
        for(int i =0; i < size ; i++){
            if(sums[i] > maxSum){
                maxIdx = i;
                maxSum = sums[i];
            }
        }
        return maxIdx;
    }

    private void refreshPrices(){

    }


}
