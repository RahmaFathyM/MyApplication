package com.example.WhatsApp_Task;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TabLayout tab;
ViewPager container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=(TabLayout)findViewById(R.id.tab_main);
        container=(ViewPager)findViewById(R.id.container);
        ArrayList<String> array_name=new ArrayList<>();
        array_name.add("Rahma");
        array_name.add("Tasnim");
        array_name.add("Rahma");
        array_name.add("Tasnim");
        array_name.add("Rahma");
        array_name.add("Tasnim");
        array_name.add("Rahma");
        array_name.add("Tasnim");
        ArrayList<Integer> array_img=new ArrayList<>();
        array_img.add(R.drawable.ic_person_black_24dp);
        array_img.add(R.drawable.ic_person_black_24dp);
        array_img.add(R.drawable.ic_person_black_24dp);
        array_img.add(R.drawable.ic_person_black_24dp);
        array_img.add(R.drawable.ic_person_black_24dp);
        array_img.add(R.drawable.ic_person_black_24dp);
        array_img.add(R.drawable.ic_person_black_24dp);
        array_img.add(R.drawable.ic_person_black_24dp);
        fragPager fp=new fragPager(getSupportFragmentManager()) ;
        fp.addTab(new MyTab("Chats",chat_Frag.newInstance(array_name,array_img)));
        fp.addTab(new MyTab("Calls",call_Frag.newInstance(array_img,array_name)));
        container.setAdapter(fp);
        tab.setupWithViewPager(container);
        tab.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
