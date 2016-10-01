package ru.itis;

/**
 * Created by KFU-user on 30.09.2016.
 */
public class IntegerArrayList {

    private static final int MAX_SIZE = 10;

    private int data[];

    private int count;

    public IntegerArrayList() {
        this.count = 0;
        this.data = new int[MAX_SIZE];
    }

    public IntegerArrayList(int originalData[]){
        if(originalData.length <= MAX_SIZE){
            this.data = new int[MAX_SIZE];
            this.count = originalData.length;
            for (int i = 0; i < originalData.length; i++) {
                this.data[i] = originalData[i];
                this.count = originalData.length;
            }
        }
        else throw new IllegalArgumentException();
    }

    public void add(int element){
        if (this.count < MAX_SIZE){
            this.data[count] = element;
            count++;
        }
        else throw new IllegalArgumentException();
    }

    public void add(int element, int position){
        if(position < count && count < MAX_SIZE){
            shiftingElementsInTheRight(position);
            this.data[position] = element;
        }
        else throw new IllegalArgumentException();
    }

    public boolean delete(int element){
        if (count >= 0 && find(element) != -1){
            shiftingElementsInTheLeft(find(element));
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteByPosition(int position){
        if(position < count && count < MAX_SIZE){
            shiftingElementsInTheLeft(position);
        }
        else throw new IllegalArgumentException();
    }

    public int find(int element){
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int get(int position){
        if(position < this.count){
            return this.data[position];
        }
        else throw new IllegalArgumentException();
    }

    private void shiftingElementsInTheRight(int position){
        for (int i = this.count; i > position; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.count++;
    }

    private void shiftingElementsInTheLeft(int position){
        for (int i = position; i < this.count; i++) {
            this.data[i] = this.data[i + 1];
        }
        count--;
    }
}
