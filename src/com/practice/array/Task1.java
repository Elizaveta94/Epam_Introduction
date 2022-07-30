package com.practice.array;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 5;
        }

        ArrayTools.print(array);

        int[] newArray = new int[array.length - 5];
        int newArrayI = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 4) {
                newArray[newArrayI] = array[i];
                newArrayI++;
            }
        }

        ArrayTools.print(newArray);

        int[] addArray = new int [newArray.length + 5];
        for (int i = 0; i < newArray.length; i++) {
            addArray[i] = newArray[i];
        }
        for (int i = newArray.length; i < addArray.length; i++) {
            addArray[i] = addArray[i-1] + 1;
        }

        ArrayTools.print(addArray);
        int[] extendArray = ArrayTools.extend(array, newArray);
        ArrayTools.print(extendArray);
        ArrayTools.print(ArrayTools.insert(extendArray,5, 99));

    }

}
