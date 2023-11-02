
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyRobot implements IRobot
{

    @Override
    public int f1(List<Robot> t) {
        
    }

    @Override
    public void f2(List<Robot> t) {
       int maxStep=t.get(0).getStep();
       int maxIndex=0;
        for(int i=0;i<t.size();i++){
           if(t.get(i).getStep()>maxStep){
               maxStep=t.get(i).getStep();
               maxIndex=i;
           }
           
       }t.remove(t.get(maxIndex));
    }

    @Override
    public void f3(List<Robot> t) {
        Collections.sort(t.subList(1, 4),new Comparator<Robot>() {
            @Override
            public int compare(Robot o1, Robot o2) {
                if(o1.getLabel().compareTo(o2.getLabel())!=0)
                    return o1.getLabel().compareTo(o2.getLabel());
                return o1.getStep()-o2.getStep();
            }
        });
            
        }
    }
    

