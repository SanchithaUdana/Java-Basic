import java.lang.annotation.Documented;

public class bb {

    public void breakTest(){
        int i = 0;
        while (i<=6){
            if (i==3){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }


    public void continueTest(){
        int i = 0;
        while (i<=5){
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }



}
