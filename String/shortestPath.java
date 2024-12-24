package String;

public class shortestPath {
    public static void main(String[] args) {
        String str =  "WNEENESENNN";
        float ans = shortPath(str);
        System.out.println(ans);
    }
    public static float shortPath(String path){
        int x =0, y=0;
        for (int i = 0; i < path.length(); i++) {
            char dic = path.charAt(i);
            if (dic == 'S'){
                y--;
            } else if (dic == 'N') {
                y++;
            } else if (dic == 'W') {
                x--;
            }else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float) Math.sqrt(x2 + y2);
    }
}
