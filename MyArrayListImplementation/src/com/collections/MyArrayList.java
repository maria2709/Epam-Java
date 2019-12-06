package com.collections;

public class MyArrayList {
    private int size;
    private int capacity;

    int[] array = new int[size];


    public MyArrayList(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public void add(int newElement) {


            setCapacity(getSize() + 2);


        int[] exdendedArray = new int[capacity];
        System.arraycopy(array, 0, exdendedArray, 0, size);
        exdendedArray[size] = newElement;
        setSize(getSize()+1);
        array = exdendedArray;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getElement(int index) {
        return array[index];
    }

    public void remove(int index) {
        int[] shortenArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            shortenArray[i] = array[i];
        }
        for (int i = index; i < shortenArray.length; i++) {

            shortenArray[i] = array[i + 1];
        }
        this.array = shortenArray;
        this.size--;

    }

    public void output() {
        if (size > 0) {
            for (int i = 0; i < size; i++)
                System.out.print(array[i] + " ");
            System.out.println();
        } else System.out.println("The array is empty");
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = 0;
        this.size = 0;
    }

    public boolean contains(int o) {
        boolean f = false;

            for (int i = 0; i < size; i++) {
                if (array[i] == o){
                    f = true;
                    break;
                }
            }
        return f;
    }

    public int[] toArray(){
        return this.array;
    }


}
