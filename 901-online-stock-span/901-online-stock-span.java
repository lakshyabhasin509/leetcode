



class StockSpanner {
class Pair{
        int index;
        int val;

        public Pair() {
        }

        public Pair(int i, int val){
            this.index=i;
            this.val=val;
    }}
    
    
    
    
    Stack<Pair> stack;
    public StockSpanner() {
        stack=new Stack<>();
    }


    int count=-1;
    public int next(int price) {
        count++;
        
        if (stack.isEmpty()) {
            stack.push(new Pair(count,price));
            return count+1;
        } else {
            if (stack.peek().val > price){
               stack.push(new Pair(count,price));
            return 1;
            }    
            else {
                while (!stack.isEmpty() && stack.peek().val <= price) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                 stack.push(new Pair(count,price));
                    return count+1;
                }
                else {
                     int span = count - stack.peek().index;
                stack.push(new Pair(count, price));
                return span;
                   
                }
            }
        }

      



        }
    }

// class StockSpanner {

// class Pair{
//     int indx;
//     int val;
//     Pair(int indx, int val){
//         this.indx = indx;
//         this.val = val;
//     }
// }

// Stack<Pair> st;
// public StockSpanner() {
//     st = new Stack<>();
// }

// int count = -1;
// public int next(int price) {
//     count++;
//     if(st.isEmpty()){
//         st.push(new Pair(count, price));
//         return count+1;
//     }
//     else{
//         if(price < st.peek().val){
//             st.push(new Pair(count, price));
//             return 1;
//         }
//         else{
//             while(!st.isEmpty() && price >= st.peek().val){
//                 st.pop();
//             }
            
//             if(st.isEmpty()){
//                 st.push(new Pair(count, price));
//                 return count+1;
//             }
//             else{
//                 int span = count - st.peek().indx;
//                 st.push(new Pair(count, price));
//                 return span;
//             }
            
//         }
//     }
    
    
// }
// }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
