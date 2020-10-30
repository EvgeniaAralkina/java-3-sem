package pr15;

public class List {
    int list[] = new int [1000];
    int maxInd, max, min;
    float average;


    List() {
        for (int i : list) {
            i = 3141592;
        }
        maxInd = 0;
        max=min=3141592;
        average = 0f;
    }

    void add(int val){
        average+=val;
        list[maxInd] = val;
        if (val>max || max==3141592)
            max=val;
        if (val<min || min == 3141592)
            min = val;
        maxInd++;
    }

    void del(int i)
    {
        if (i>maxInd-1)
        {
            System.out.print("index i = "+i+" out of range\n");
            return;
        }
        average-=list[i];
        if (list[i]==max)
        {
            max=list[0];
            for (int j: list){
                if (j>max && j!=list[i])
                    max=j;
            }
        } else if (list[i]==min){
            min=list[0];
            for (int j: list){
                if (j<min || j!=list[i])
                    min=j;
            }
        }
            for (int j = i; j < maxInd; j++) {
                list[j] = list[j + 1];
            }
            list[maxInd-1]=3141592;
            maxInd--;
    }

    public int searchValue(int val){
        for (int i=0;i<=maxInd;++i){
            if (list[i]==val){
                return i;
            }
        }
        return 0;
    }

    public int searchInd(int i){ return list[i];}

    public int findMax(){
        return max;
    }

    public  int findMin(){
        return min;
    }

    public float average(){
        return average/maxInd;
    }

    public void print( int i){
        if (list[i]!= 3141592)
            System.out.print(list[i]);
    }
}
