package com.example.interoperabilitas;

import android.content.Intent;
import android.icu.text.IDNA;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Time;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import cz.msebera.android.httpclient.Header;


public class MainActivity extends AppCompatActivity implements RuanganAdapter.OnRoomListener {
    public static ArrayList<Ruangan> ruangans = new ArrayList<>();
    public static ArrayList<ArrayList<InfoBooking>> ArrayListInfoBookings = new ArrayList<>();
    public static ArrayList<InfoBooking> infoBookingsUniversal = new ArrayList<>();
    public static User user;
    private RecyclerView recyclerView;
    public static String JSONRuang = "";
    public static String JSONBooking= "";
    public static String JSONUser="";
    public static int lengthInfoBookings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callAPI(); //dapetin data booking
        Date currentTime = Calendar.getInstance().getTime();
        String date = DateFormat.getDateInstance().format(currentTime);
        TextView tanggal = findViewById(R.id.ProfileDateText);
        tanggal.setText(date);
        recyclerView =(RecyclerView) findViewById(R.id.RuanganRecycleView);
    }
//        setUser();
//        do
//            {
//
//                {
//                    Log.i("tEST","TEST");
//                    break;
//                }
//                Log.i("Loading","Loading Data 33%");
//
//            }
//        while(JSONBooking.equals("")||JSONRuang.equals("")||JSONUser.equals(""));
//
//    }

    public void callAPI(){
            String[] url = {"http://10.0.2.2/API/api/post/read.php", "http://10.0.2.2/API/api/ruangan/read.php", "http://10.0.2.2/API/api/user/read.php"};
            AsyncHttpClient client = new AsyncHttpClient();
            final String[] response = new String[1];
            for (int i = 0; i < url.length; i++) {
                final int finalI = i;
                client.get(url[i], new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        response[0] = new String(responseBody);
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                        error.printStackTrace();
//                        Log.i("Error", "error ngambildata");
                        response[0] = "null";
                    }

                    @Override
                    public void onFinish() {
                        super.onFinish();
                        if (finalI == 0) {
                            JSONBooking = response[0];
                            Log.i("JSONRuang", response[0]);
//                            Log.i("JSONBooking",JSONBooking);
                        } else if (finalI == 1) {
                            JSONRuang = response[0];

//                            Log.i("JSONRuang",JSONRuang);
                        } else {
                            JSONUser = response[0];
//                            Log.i("JSONUser",JSONUser);

                        }
                        if (!JSONRuang.equals("") && !JSONUser.equals("")&&!JSONBooking.equals("")) {
                            ruangans.clear();
                            ArrayListInfoBookings.clear();
                            try {
                                JSONObject reader = new JSONObject(JSONBooking);
                                JSONArray data = reader.getJSONArray("data");
                                lengthInfoBookings =data.length();
                                setInfoBookings();
                                setUser();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                });
            }
        }
//    private void setRuangans(){
//        ArrayList<InfoBooking> infoBooking1 = new ArrayList<>();
//        infoBooking1.add(new InfoBooking(0,0,0,10,13,2020,10,19,1));
//        infoBooking1.add(new InfoBooking(0,0,1,14,15,2020,10,19,1));
//        infoBooking1.add(new InfoBooking(0,1,3,18,2020,10,20,20,1));
//
//        ArrayList<InfoBooking> infoBooking2 = new ArrayList<>();
//        infoBooking2.add(new InfoBooking(1,0,0,10,13,2020,10,19,1));
//        infoBooking2.add(new InfoBooking(1,1,1,13,14,2020,10,21,1));
//        infoBooking2.add(new InfoBooking(1,1,2,14,17,2020,10,20,1));
//        ruangans.add(new Ruangan(1,"Ruang A03","Lorem ipsum dolor sit amet, consectetur adipiscing elit. In mattis efficitur enim vel tempus. Integer non massa eu ligula consequat commodo. Suspendisse potenti. Nam ac dictum nulla, sit amet laoreet nisl. Aenean luctus, metus sed ullamcorper blandit, lorem nibh facilisis dui, non fringilla nunc augue sed ante. Phasellus vitae vulputate justo. Nunc vel eros vitae nibh accumsan dignissim. Maecenas convallis augue in felis iaculis, vitae tempor eros ultrices. Curabitur in tortor tincidunt, feugiat nulla nec, maximus enim. Fusce et purus nisl. Mauris elementum fringilla tortor, at iaculis dui venenatis in. Quisque justo tellus, commodo eget massa eu, volutpat iaculis urna. Praesent consequat varius lorem, vel rhoncus justo consequat nec. Vestibulum sed purus quis ligula ornare lacinia nec quis libero. Donec efficitur leo a consequat blandit. Fusce convallis neque ante, eu ultricies odio elementum sed.\n" +
//                "\n" +
//                "Donec luctus, nibh vel pharetra tempor, ipsum sapien varius nisl, sed vulputate velit diam sit amet est. Nullam viverra quam quis erat iaculis auctor. In hac habitasse platea dictumst. Nunc non fringilla lacus, non bibendum nisl. Integer at suscipit quam, ut volutpat urna. Praesent euismod aliquam ipsum, gravida posuere mauris aliquet eu. Duis justo nulla, rhoncus sit amet enim a, vulputate convallis sapien. Nullam efficitur aliquam felis, tristique mattis odio feugiat vitae. Vestibulum molestie metus sit amet lacinia scelerisque. Morbi eleifend vitae neque ac fermentum.\n" +
//                "\n" +
//                "In consequat quis erat sed cursus. Sed in facilisis quam, vel elementum justo. Mauris consequat lobortis nisi et venenatis. Praesent sagittis, arcu vitae sagittis congue, elit lacus faucibus orci, a sagittis magna erat in lacus. Nulla sit amet malesuada ante. Etiam dapibus purus justo, at feugiat felis vulputate malesuada. Aenean porta mauris risus, ac ultrices augue efficitur vel. Mauris ipsum velit, hendrerit in consequat eget, sollicitudin vel velit.",
//                "Gedung DTETI lantai 420", "https://images.unsplash.com/photo-1497366754035-f200968a6e72?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",
//                100000,9, infoBooking1));
//
//        ruangans.add(new Ruangan(2,"Ruang C69","Ini ruangan test buat item kedua, semoga berhasil deh aku udah bingung.",
//                "Gedung DTETI lantai 69", "https://images.unsplash.com/photo-1533090161767-e6ffed986c88?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",
//                150000, 10, infoBooking2));
// }

    private void setUser(){
       user = new User(1, "Elsa" ,"Test");
       TextView nama = findViewById(R.id.ProfileTextView);
       nama.setText(user.namaUser);
    }

    private void setInfoBookings() throws JSONException {
        JSONObject reader = new JSONObject(JSONBooking);
        JSONObject ruangan = new JSONObject(JSONRuang);
        JSONArray dataRuangan = ruangan.getJSONArray("data");
        JSONArray data = reader.getJSONArray("data");
        for(int i = 0; i < dataRuangan.length(); i++)
        {
            ArrayList<InfoBooking> infoBookings = new ArrayList<>();
            for(int j = 0; j < data.length(); j++)
            {
                JSONObject bookingsObject = data.getJSONObject(j);
                int idRuangan = bookingsObject.getInt("idRuangan");
                if(idRuangan == i)
                {
//                    Log.i("idRuangan", Integer.toString(idRuangan));
//                    Log.i("Nofilter","woy");
                    int idBooking = bookingsObject.getInt("idBooking");
                    int idUser = bookingsObject.getInt("idUser");
                    int waktuMulai = bookingsObject.getInt("waktuMulai");
                    int waktuSelesai = bookingsObject.getInt("waktuSelesai");
                    int tahunBooking = bookingsObject.getInt("tahunBooking");
                    int bulanBooking = bookingsObject.getInt("bulanBooking");
                    int tanggalBooking = bookingsObject.getInt("tanggalBooking");
                    int hargaTotal = 0;
                    infoBookings.add(new InfoBooking(idRuangan,idUser,idBooking,waktuMulai,waktuSelesai,tahunBooking,bulanBooking,tanggalBooking,hargaTotal));

                }
                else
                {
                    Log.i("Next","next");
                }

            }
            ArrayListInfoBookings.add(infoBookings);
        }
//        Log.i("Test",ArrayListInfoBookings.toString());
        setRuangans();
    }
    private void setRuangans() throws JSONException {
        JSONObject reader = new JSONObject(JSONRuang);
        JSONArray data = reader.getJSONArray("data");
        for(int i = 0; i < data.length(); i++)
        {
         JSONObject ruangansObject = data.getJSONObject(i);
         Integer idRuangan = ruangansObject.getInt("idRuangan");
         String namaRuangan = (String)  ruangansObject.get("namaRuangan");
         String deskripsiRuangan = (String)  ruangansObject.get("deskripsiRuangan");
         Integer hargaRuangan = ruangansObject.getInt("hargaRuangan");
         String lokasiRuangan = (String)  ruangansObject.get("lokasiRuangan");
         String urlGambarRuangan = (String)  ruangansObject.get("urlGambarRuangan");
         Integer kapasitasRuangan = ruangansObject.getInt("kapasitasRuangan");
         Log.i("ruangansObject",namaRuangan);
         ruangans.add(new Ruangan(idRuangan,namaRuangan,deskripsiRuangan,lokasiRuangan,urlGambarRuangan,hargaRuangan,kapasitasRuangan, ArrayListInfoBookings.get(i)));
        }
        setAdapter();
//        Log.i("ruangansArray",ruangans.toString());

    }

    private void setAdapter(){
//        Log.i("ukuran ruangans",Integer.toString(ruangans.size()));
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

    @Override
    protected void onResume() {
        super.onResume();
        callAPI();
    }
}
