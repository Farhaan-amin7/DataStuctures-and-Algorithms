package SuperPackage.StacksAndQueues;

public class DynamicQueue extends  CircularQueue{

        public DynamicQueue(){// It will call custom stack.
            super();
        }
        public DynamicQueue(int size){
            super(size); // It will call custom stack.
        }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            int [] temp = new int [data.length * 2];
            //Now copy all the previous elements of the array into the new one.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(font + i)]% data.length; // Fill the position of the array where the element was removed
            }
            font = 0;
            end = data.length;
            data = temp; // assign the reference of the newly created array with double the size to the actual variable.
        }
        // at this point  we know that array is not full
        // insert items
        return super.insert(item);

    }
}