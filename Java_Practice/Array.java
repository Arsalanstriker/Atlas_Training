class Test {
    public static void main(String args[])
    {
        int intArray[] = { 1, 2, 3  };
        int cloneArray[] = intArray.clone();
        intArray[1] = 4;
        // will print false as shallow copy is created
        //System.out.println(intArray == cloneArray);
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
            System.out.println(intArray[i] + " ");
            //System.out.println(intArray[1] == cloneArray[1]);

        }
    }
}

