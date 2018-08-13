public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal<= 0){
            return false;
        }
        goal -= Math.min(goal/5,bigCount) * 5;
        return (smallCount >= goal);
    }
}