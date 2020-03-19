package Session5;

public class Snippet12 {
    public static void main(String[] args) {
        int cnt, square=0, cube =0;
        for(cnt = 1; cnt < 300; cnt++){
            if(cnt % 3 == 0){
                continue;
            }
            square = cnt * cnt;
            cube = cnt * cnt * cnt;

            System.out.printf("\nSquare of %d is %d anf Cube is %d", cnt, square, cube);
        }

       // System.out.println(cube);
    }
}
