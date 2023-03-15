class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
                stack.pop();
            }

        else if(operations[i].equals("D")){
            stack.push(stack.peek()*2);
        }
        else if(operations[i].equals("+")){
            int x=stack.pop();
            int y=stack.pop();
            int z=x+y;
            stack.push(y);
            stack.push(x);
            stack.push(z);
        }
        else{
            stack.push(Integer.parseInt(operations[i]));
        }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}