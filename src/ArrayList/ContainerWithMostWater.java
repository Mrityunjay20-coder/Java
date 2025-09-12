package ArrayList;

public class ContainerWithMostWater {
    public static int container(int[]height){
        int maxWater=0;
        int lp=0;
        int rp= height.length-1;

        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);
            //updation of pointer
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[]height={1,8,6,2,5,4,8,3,7};
        System.out.println("max water is " +container(height));
    }
}
