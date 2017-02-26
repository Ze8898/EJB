package main.java.com.six.ejb.bean;

import javax.faces.bean.ManagedBean;

/**
 * Created by liuze on 2017/2/25.
 */
@ManagedBean
public class Navigator {


    public String choosePage(){
        if (Math.random()>0.5){
            return ("result-page-1");
        }else {
            return ("result-page-2");
        }
    }

}
