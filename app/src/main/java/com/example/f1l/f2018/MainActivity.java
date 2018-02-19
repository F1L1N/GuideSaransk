package com.example.f1l.f2018;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    com.example.f1l.f2018.customSwip customSwip;
    Button button1;
    Button button2;
    Button button3;
    ImageView iv;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        customSwip = new customSwip(this);
        viewPager.setAdapter(customSwip);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.logo);


        final String[] about = new String[] {
                "Главное", "Еда", "Развлечения", "Шоппинг", "Спорт", "Маршруты"};
        final String[] places = new String[] {
                "Обзор", "Справочник", "Галерея", "Избранное", "Посещенные места"};

        final ArrayAdapter<String> adapter_about = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, about);
        final ArrayAdapter<String> adapter_places = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, places);

        lv = (ListView) findViewById(R.id.lv);
        lv.setClickable(true);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //  selected_position_list = lv1.getFirstVisiblePosition();
                //  long lv_id = parent.getItemIdAtPosition(position);
                if ( lv.getItemAtPosition(0)=="Главное"){
                    switch (position) {
                        case 0:
                            break;
                        case 1:

                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }

                }
                if (lv.getItemAtPosition(0)=="Обзор") {
                    switch (position) {
                        case 0:
                            break;
                        case 1:
                            Intent in1 = new Intent(getApplicationContext(), ActivityListPosition.class);
                            startActivity(in1);
                            break;
                        case 2:
                            Intent in2 = new Intent(getApplicationContext(), GalleryMain.class);
                            startActivity(in2);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;

                    }
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            /*возможно, можно переписать чтобы минимальная версия SDK была ниже*/
            public void onClick(View v) {
                button1.setBackground(getDrawable(R.drawable.menu1select));
                button2.setBackground(getDrawable(R.drawable.menu2));
                button3.setBackground(getDrawable(R.drawable.menu3));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override

            public void onClick(View v) {
                button1.setBackground(getDrawable(R.drawable.menu1));
                button2.setBackground(getDrawable(R.drawable.menu2select));
                button3.setBackground(getDrawable(R.drawable.menu3));
                iv.getLayoutParams().width=100;
                iv.setImageResource(R.drawable.places);
                ListView lv = (ListView)findViewById(R.id.lv);
                lv.setAdapter(adapter_about);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                button1.setBackground(getDrawable(R.drawable.menu1));
                button2.setBackground(getDrawable(R.drawable.menu2));
                button3.setBackground(getDrawable(R.drawable.menu3select));
                iv.getLayoutParams().width=130;
                iv.setImageResource(R.drawable.about);
                ListView lv = (ListView)findViewById(R.id.lv);
                lv.setAdapter(adapter_places);
            }
        });
    }


}
