package SuperPackage.StacksAndQueues;

public class DynamicStack extends CustomStack{
    public DynamicStack(){// It will call custom stack.
        super();
    }
    public DynamicStack(int size){
        super(size); // It will call custom stack.
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int [] temp = new int [data.length * 2];
            //Now copy all the previous elements of the array into the new one.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point  we know that array is not full \
        // insert items
        return super.push(item);
    }
}