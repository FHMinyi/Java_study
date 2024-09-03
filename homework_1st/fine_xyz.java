public class fine_xyz {
    public static void main(String[] args) {
        int x,y,z;
        for(x = 0; x <= 9; x ++) {
            for(z = 0; z <= 9; z ++) {
                for(y = 0; y <= 9; y ++) {
                    int tmp1,tmp2;
                    tmp1 = x*100 + y*10 + z;
                    tmp2 = y*100 + z*10 + z;
                    if(tmp1 + tmp2 == 532) {
                        System.out.print("x = "+ x + ", y = " + y + ", z = " + z);
                        return;
                    }
                }
            }
        }
        System.err.println("don't fine");
    }
}