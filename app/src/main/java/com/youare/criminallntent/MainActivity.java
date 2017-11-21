package com.youare.criminallntent;

//import android.support.v4.app.FragmentActivity;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getFragmentManager();

        //为了防止当前fragment已经有内容
        //R.id.fragment用来唯一标识
        Fragment fragment=fm.findFragmentById(R.id.fragment_main_container);
        if(fragment==null){
            fragment=new MainFragment();
            fm.beginTransaction().add(R.id.fragment_main_container,fragment).commit();
        }

//        Fragment fragment=new MainFragment();
//        fm.beginTransaction().add(R.id.fragment_main_container,fragment).commit();
    }
}
