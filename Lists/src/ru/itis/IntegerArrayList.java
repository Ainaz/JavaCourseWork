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

    /**
     * Добавление элемента в заданную позицию - элементы
     * правее позиции сдвигаются на один вправо
     * @param element элемент
     * @param position позиция, должна быть меньше, чем количество элементов
     * @throws IllegalArgumentException если вставляем элемент в самый конец, а там
     * элемент уже есть
     */
    public void add(int element, int position){
        if(position < count && count < MAX_SIZE){
            for (int i = this.data.length - 1; i > position; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[position] = element;
            count++;
        }
        else throw new IllegalArgumentException();
    }

    /**
     * Удаление элемента со сдвигом
     * @param element элемент, который необходимо удалить
     * @return true, если удаление прошло успешно, false - если элемент не был найден
     */
    public boolean delete(int element){
        if (count >= 0 && find(element) != -1){
            for (int i = this.data[find(element)] + 1; i < this.data.length; i++) {

            }
            //this.data[find(element)] =
            return true;
        }
        else {
            return false;
            }
    }

    public void deleteByPosition(int position){

    }

    /**
     * Поиск заданного элемента
     * @param element искомый элемент
     * @return индекс, в котором находится элемент. -1 - если элемент не найден
     */
    public int find(int element){
        int index = -1;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == element) {
                 index = this.data[i];
            }
        }
        return index;
    }


    public int get(int position){
        if(position < this.count){
            return this.data[position];
        }
        else throw new IllegalArgumentException();
    }
}
