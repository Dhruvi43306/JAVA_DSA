class P3{
    int h,m,s;

    public P3(int h,int m,int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public void AddSecond(int second){

        int totalsecond = this.s + second;
        while(totalsecond >= 60){
            totalsecond-=60;
            this.m++;
        }
        this.s = totalsecond;
        if(this.m >= 60){
            this.h += this.m/60;
            this.m = this.m%60;
        }
    }
   public void printSecond(){
        System.out.println(this.h+" : "+this.m+" : "+this.s);
   }

   public void substractSecond(int second){
        while(second > 0){
            if(this.s > second){
                this.s -= second;
                second = 0;
            }
            else{
                if(this.m > 0){
                    this.m--;
                    this.s+= 60;
                }
                else{
                    if(this.h > 0){
                    this.h--;    
                    this.m+=60;
                    this.s+= 60;
                }
                else {
                    System.out.println("Cannot subtract more seconds.");
                    return;
                }
            }   
        }
   }
}
    public static void main(String[] args) {
        P3 p = new P3(2, 30, 45);
        // p.AddSecond(50);
        // p.printSecond();

        p.substractSecond(130);
        p.printSecond();
    }
}