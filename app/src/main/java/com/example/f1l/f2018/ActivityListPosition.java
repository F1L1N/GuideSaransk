package com.example.f1l.f2018;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivityListPosition extends Activity {

    ArrayList<Item> products = new ArrayList<Item>();
    ArrayList<Item> sub_products = new ArrayList<Item>();
    ListAdapter boxAdapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_position);

        fillData();
        boxAdapter = new ListAdapter(this, products, sub_products);

        final ListView lvMain = (ListView) findViewById(R.id.lvMain);
        lvMain.setAdapter(boxAdapter);

        lvMain.setClickable(true);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent in = new Intent(getApplicationContext(), Describe_place.class);
                in.putExtra("id", position);
                //in.putExtra("image",R.drawable.about);
                //in.putExtra("name","Сквер Победы");
                //in.putExtra("subname","ул. Победы");
                startActivity(in);
            }
        });
    }

    void fillData() {
        products.add(new Item(0,"Сквер Победы", "ул. Победы", R.drawable.ic_launcher,R.drawable.skver_win));
        products.add(new Item(1,"Соборная площадь","ул. Советская, 35", R.drawable.ic_launcher,R.drawable.sobor_square));
        products.add(new Item(2,"Кафедральный собор святого праведного воина Феодора Ушакова","ул. Советская, д. 53",R.drawable.ic_launcher,R.drawable.ushakov));
        products.add(new Item(3,"Мордовский драматический театр","ул. Советская, д. 27",R.drawable.ic_launcher,R.drawable.drama_theater));
        products.add(new Item(4,"Памятник Подольским курсантам","Пресечение улиц Комарова, Гагарина и 50 лет Октября",R.drawable.ic_launcher,R.drawable.coursants));
        products.add(new Item(5,"Памятник Н.П. Огареву","ул. Большевистская и Сквер славы",R.drawable.ic_launcher,R.drawable.ogarev));
        products.add(new Item(6,"Парк имени Пушкина","ул. Московская, 18", R.drawable.ic_launcher,R.drawable.pushkin_park));
        products.add(new Item(7,"Республиканская детская библиотека"," ул. Большевистская, 39", R.drawable.ic_launcher,R.drawable.children_hospitale));
        products.add(new Item(8,"Памятник Е. Пугачеву","развилка улиц Волгоградской и Короленко",R.drawable.ic_launcher,R.drawable.pugachev));
        products.add(new Item(9,"Озеро Инерка","Большеберезниковский район",R.drawable.ic_launcher,R.drawable.lake_inerka));
        products.add(new Item(10,"Аллея Славы","Парк культуры и отдыха им. А.С. Пушкина", R.drawable.ic_launcher,R.drawable.alleya));
        products.add(new Item(11,"Республиканский краеведческий музей Республики Мордовия","ул. Московская, 48", R.drawable.ic_launcher,R.drawable.kraeved_museum));
        products.add(new Item(12,"Фонтан Тысячелетия","площадь Тысячелетия",R.drawable.ic_launcher,R.drawable.fontan1000));
        products.add(new Item(13,"Озеро Пиявское","Теньгушевский район",R.drawable.ic_launcher,R.drawable.piyav_lake));
        products.add(new Item(14,"Река Мокша","", R.drawable.ic_launcher,R.drawable.river_moksha));
        products.add(new Item(15,"Государственный парк Смольный","Ичалковский р-н, пос. Смольный, ул. Тополей, 11", R.drawable.ic_launcher,R.drawable.smolnyi));
        products.add(new Item(16,"Памятник героям-стратонавтам","пл. Героев-стратонавтов", R.drawable.ic_launcher,R.drawable.stratonavt));
        products.add(new Item(17,"Мордовский заповедник","Темниковский район",R.drawable.ic_launcher,R.drawable.zapovednik));
        products.add(new Item(18,"Музей военного и трудового подвига 1941-1945 годов","улица Советская, 34-а",R.drawable.ic_launcher,R.drawable.war_museum));
    }
}