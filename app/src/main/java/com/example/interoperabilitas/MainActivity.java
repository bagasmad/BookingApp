package com.example.interoperabilitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.sql.Time;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import cz.msebera.android.httpclient.Header;


public class MainActivity extends AppCompatActivity implements RuanganAdapter.OnRoomListener {
    public static ArrayList<Ruangan> ruangans = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date currentTime = Calendar.getInstance().getTime();
        String date = DateFormat.getDateInstance().format(currentTime);
        TextView tanggal = findViewById(R.id.ProfileDateText);
        tanggal.setText(date);
        recyclerView =(RecyclerView) findViewById(R.id.RuanganRecycleView);
        setRuangans();
        setAdapter();
    }
    private void setRuangans(){
        ArrayList<InfoBooking> infoBooking1 = new ArrayList<>();
        infoBooking1.add(new InfoBooking(0,0,0,10,13,2020,10,19));
        infoBooking1.add(new InfoBooking(0,0,1,14,15,2020,10,19));
        infoBooking1.add(new InfoBooking(0,1,3,18,2020,10,20,20));

        ArrayList<InfoBooking> infoBooking2 = new ArrayList<>();
        infoBooking2.add(new InfoBooking(1,0,0,10,13,2020,10,19));
        infoBooking2.add(new InfoBooking(1,1,1,13,14,2020,10,21));
        infoBooking2.add(new InfoBooking(1,1,2,14,17,2020,10,20));
        ruangans.add(new Ruangan(1,"Ruang A03","Lorem ipsum dolor sit amet, consectetur adipiscing elit. In mattis efficitur enim vel tempus. Integer non massa eu ligula consequat commodo. Suspendisse potenti. Nam ac dictum nulla, sit amet laoreet nisl. Aenean luctus, metus sed ullamcorper blandit, lorem nibh facilisis dui, non fringilla nunc augue sed ante. Phasellus vitae vulputate justo. Nunc vel eros vitae nibh accumsan dignissim. Maecenas convallis augue in felis iaculis, vitae tempor eros ultrices. Curabitur in tortor tincidunt, feugiat nulla nec, maximus enim. Fusce et purus nisl. Mauris elementum fringilla tortor, at iaculis dui venenatis in. Quisque justo tellus, commodo eget massa eu, volutpat iaculis urna. Praesent consequat varius lorem, vel rhoncus justo consequat nec. Vestibulum sed purus quis ligula ornare lacinia nec quis libero. Donec efficitur leo a consequat blandit. Fusce convallis neque ante, eu ultricies odio elementum sed.\n" +
                "\n" +
                "Donec luctus, nibh vel pharetra tempor, ipsum sapien varius nisl, sed vulputate velit diam sit amet est. Nullam viverra quam quis erat iaculis auctor. In hac habitasse platea dictumst. Nunc non fringilla lacus, non bibendum nisl. Integer at suscipit quam, ut volutpat urna. Praesent euismod aliquam ipsum, gravida posuere mauris aliquet eu. Duis justo nulla, rhoncus sit amet enim a, vulputate convallis sapien. Nullam efficitur aliquam felis, tristique mattis odio feugiat vitae. Vestibulum molestie metus sit amet lacinia scelerisque. Morbi eleifend vitae neque ac fermentum.\n" +
                "\n" +
                "In consequat quis erat sed cursus. Sed in facilisis quam, vel elementum justo. Mauris consequat lobortis nisi et venenatis. Praesent sagittis, arcu vitae sagittis congue, elit lacus faucibus orci, a sagittis magna erat in lacus. Nulla sit amet malesuada ante. Etiam dapibus purus justo, at feugiat felis vulputate malesuada. Aenean porta mauris risus, ac ultrices augue efficitur vel. Mauris ipsum velit, hendrerit in consequat eget, sollicitudin vel velit.",
                "Gedung DTETI lantai 420", "https://images.unsplash.com/photo-1497366754035-f200968a6e72?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",
                100000,9, infoBooking1));

        ruangans.add(new Ruangan(2,"Ruang C69","Ini ruangan test buat item kedua, semoga berhasil deh aku udah bingung.",
                "Gedung DTETI lantai 69", "https://images.unsplash.com/photo-1533090161767-e6ffed986c88?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",
                150000, 10, infoBooking2));
    }
    private void setAdapter(){
        RuanganAdapter adapter = new RuanganAdapter(ruangans, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void OnRoomClick(int position) {
//        ruangans.get(position);
        Intent intent = new Intent(this,DisplayActivity.class).putExtra("POSITION", position);
        startActivity(intent);

    }
//    public void display(View view)
//    {

//    }
}
