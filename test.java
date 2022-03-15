import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String[] args) throws Exception {
        String buggyPath ="hello";
        if(f()>0) {
            if(f()<0){
                
            }else if(f()==0){
                
            }
        }
        System.out.println(buggyPath);
    }
     public static int f(){
        return 1+1;
    }
}
