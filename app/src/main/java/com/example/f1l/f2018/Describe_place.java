package com.example.f1l.f2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Describe_place extends AppCompatActivity {
    String s;
    Button button;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_place);
        Bundle extras = getIntent().getExtras();
        final int _id = extras != null ? extras.getInt("id") : 0;
        construct(_id);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                construct_coord(_id);
            }
        });
    }

    void construct_coord(int _id){
        switch (_id){
            case 0:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 1:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 2:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 3:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 4:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 5:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 6:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 7:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 8:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 9:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 10:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 11:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 12:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 13:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 14:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 15:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 16:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 17:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
            case 18:
                in = new Intent(getApplicationContext(), MapsActivity.class);
                in.putExtra("longitude", 54.21);
                in.putExtra("latitude", 45.20);
                startActivity(in);
                break;
        }
    }
    void construct(int _id){
        setContentView(R.layout.activity_describe_place);
        ImageView iv = (ImageView) findViewById(R.id.imageView);
        TextView tv = (TextView) findViewById(R.id.textView);
        switch (_id){
            case 0:
                iv.setImageResource(R.drawable.skver_win);
                s = "Сквер Победы\n"+"ул. Победы";
                tv.setText(s);
                break;
            case 1:
                iv.setImageResource(R.drawable.sobor_square);
                s = "Соборная площадь\n"+"ул. Советская, 35";
                tv.setText(s);
                break;
            case 2:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.ushakov);
                s = "Кафедральный собор святого праведного воина Феодора Ушакова\n"+"ул. Советская, д. 53";
                tv.setText(s);
                break;
            case 3:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.drama_theater);
                s = "Мордовский драматический театр\n"+"ул. Советская, д. 27";
                tv.setText(s);
                break;
            case 4:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.coursants);
                s = "Памятник Подольским курсантам\n"+"Пресечение улиц Комарова, Гагарина и 50 лет Октября";
                tv.setText(s);
                break;
            case 5:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.ogarev);
                s = "Памятник Н.П. Огареву\n"+"ул. Большевистская и Сквер славы";
                tv.setText(s);
                break;
            case 6:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.pushkin_park);
                s = "Парк имени Пушкина\n"+"ул. Московская, 18";
                tv.setText(s);
                break;
            case 7:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.children_hospitale);
                s = "Республиканская детская библиотека\n"+" ул. Большевистская, 39";
                tv.setText(s);
                break;
            case 8:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.pugachev);
                s = "Памятник Е. Пугачеву\n"+"развилка улиц Волгоградской и Короленко";
                tv.setText(s);
                break;
            case 9:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.lake_inerka);
                s = "Озеро Инерка\n"+"Большеберезниковский район";
                tv.setText(s);
                break;
            case 10:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.alleya);
                s = "Аллея Славы\n"+"Парк культуры и отдыха им. А.С. Пушкина";
                tv.setText(s);
                break;
            case 11:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.kraeved_museum);
                s = "Республиканский краеведческий музей Республики Мордовия\n"+"ул. Московская, 48";
                tv.setText(s);
                break;
            case 12:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.fontan1000);
                s = "Фонтан Тысячелетия\n"+"площадь Тысячелетия";
                tv.setText(s);
                break;
            case 13:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.piyav_lake);
                s = "Озеро Пиявское\n"+"Теньгушевский район";
                tv.setText(s);
                break;
            case 14:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.river_moksha);
                s = "Река Мокша";
                tv.setText(s);
                break;
            case 15:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.smolnyi);
                s = "Государственный парк Смольный\n"+"Ичалковский р-н, пос. Смольный, ул. Тополей, 11";
                tv.setText(s);
                break;
            case 16:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.stratonavt);
                s = "Памятник героям-стратонавтам\n"+"пл. Героев-стратонавтов";
                tv.setText(s);
                break;
            case 17:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.zapovednik);
                s = "Мордовский заповедник\n"+"Темниковский район";
                tv.setText(s);
                break;
            case 18:
                ((ImageView) iv.findViewById(R.id.imageView)).setImageResource(R.drawable.war_museum);
                s = "Музей военного и трудового подвига 1941-1945 годов\n"+"улица Советская, 34-а";
                tv.setText(s);
                break;
        }
    }
}
