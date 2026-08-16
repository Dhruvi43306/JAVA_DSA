// public Maximum Price Selection Problem  You are given a list of items along with their 
// prices and categories. The values N and K are also provided: • N → Maximum number of 
// items that can be selected • K → Maximum number of times the same Category can be 
// selected repeatedly Each item is represented in the format: price:category 
// The program should select items such that: • At most N items are chosen • 
// Each item can be chosen at most K times • The total price is maximum Finally, 
// return the maximum total price.  


// Input: N = 4 K = 2 
// Input Array = ["500:Electronics", "400:Electronics", "300:Electronics","200:Sports", "150:Beauty",   
// "100:Beauty"] 
// Output: Maximum Price = 1250  
// Input: N = 3 K = 1
//  Input Array = ["600:Electronics", "350:Sports", "250:Beauty", "150:Books"]
//  Output: Maximum Price = 1200 


class P5{
     static int maximumPrice(int N,int k,String[] items){
        int totalPrice = 0;
        int selectedItem = 0;
        String previousCategory = "";
        int categorycount = 0;

        for(String item:items){
            if(selectedItem == N){
                break;
            }
            String[] parts = item.split(":");
            int price = Integer.parseInt(parts[0]);
            String category = parts[1];
            if(category.equals(previousCategory)){
                categorycount++;
            }
            else{
                previousCategory = category;
                categorycount = 1;
            }
            if(categorycount <= k){
                totalPrice+=price;
                selectedItem++;
            }
        }
        return totalPrice;
    }
    public static void main(String[] args) {
       int N = 4,k=2;
       String[] items = {
            "500:Electronics",
            "400:Electronics",
            "300:Electronics",
            "200:Sports",
            "150:Beauty",
            "100:Beauty"
       };
       System.out.println("Maximum Price = "+maximumPrice(N, k, items));
    }
}