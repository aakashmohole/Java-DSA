package neetCode;

public class kokoEatingBananas{
    public static void main(String[] args) {
        int [] piles = {1,4,3,2}; int h = 9;
        System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right =1;
        for (int pile : piles){
            right = Math.max(right, pile);
        }

        while (left < right){
            int mid = left + (right - left) /2;
            if (canFinish(piles, mid, h)){
                right = mid;
            }else {
                left = mid +1;
            }
        }
        return left;
    }

    public static boolean canFinish(int[] piles, int speed, int h){
        int hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}
