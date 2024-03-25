package com.example.videoscroller;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private ArrayList<DataHandler> dataHandlers= new ArrayList<>();
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        DataHandler data= new DataHandler("title :1","https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
        DataHandler data2= new DataHandler("title :2","https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4");
        DataHandler data3= new DataHandler("title :3","https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4");
        DataHandler data4= new DataHandler("title :4","http://ak-sgp-cdn.snackvideo.in/upic/2021/03/26/01/BMjAyMTAzMjYwMTM3MDhfMTUwMDAwNTE1MTY2NjQwXzE1MDAwMTI0NzI4ODc1Ml8yXzM=_b_Be4f85cb42c503afc0f974f5e505730da.mp4?tag=1-1617468575-s-0-mbxjexllo7-49f79faeac91127c");
        DataHandler data5= new DataHandler("title :5",  "http://tx-sgp-cdn.snackvideo.in/upic/2021/01/17/14/BMjAyMTAxMTcxNDEzNTVfMTUwMDAwNTA0NzAxODE3XzE1MDAwMTIwOTExMjE0NF8wXzM=_b_B5f082695b084b1b7f17dbfc228cd2db0.mp4?tag=1-1617467907-s-0-plau4eno3k-d80781247064c82c" );
        DataHandler data6= new DataHandler("title :6","https://g-sgp-cdn.snackvideo.in/upic/2021/03/29/01/BMjAyMTAzMjkwMTQxMDlfMTUwMDAwNTE1MTY2NjQwXzE1MDAwMTI1MDM1NTczN18yXzM=_b_B4d25c9c1a0afb4f60ea04310877f08a1.mp4?tag=1-1617468549-s-0-qwv8aquiyo-9cad5f17da3c8760");
        DataHandler data7= new DataHandler("title :7", "http://ak-sgp-cdn.snackvideo.in/upic/2021/01/20/14/BMjAyMTAxMjAxNDEzMzlfMTUwMDAwNTA0NzAxODE3XzE1MDAwMTIwOTgxNzM5MF8wXzM=_b_Bb5e6ee731d5093b7247b16779b5f69b9.mp4?tag=1-1617467846-s-0-kpjnghcuwy-73303c3ad0d8d0c1");
        DataHandler data8= new DataHandler("title :8",    "http://tx-sgp-cdn.snackvideo.in/upic/2021/01/27/14/BMjAyMTAxMjcxNDEzMzdfMTUwMDAwNTA0NzAxODE3XzE1MDAwMTIxMTY4NDMyOV8wXzM=_b_Bc1ba96b5a29f429f44b3a7eadfdbb739.mp4?tag=1-1617467790-s-0-gln2lo6r9m-c7e3705efa9bb42b");
        DataHandler data9= new DataHandler("title :9",  "http://tx-sgp-cdn.snackvideo.in/upic/2021/02/16/14/BMjAyMTAyMTYxNDEzMzdfMTUwMDAwNTA0NzAxODE3XzE1MDAwMTIxODcwNjYzOF8wXzM=_b_B247f54fc2a79e0bbefab473487e62be3.mp4?tag=1-1617467579-s-0-weo83zkgpk-6eea2e4c58e6ecca");
        DataHandler data10= new DataHandler("title :10", "http://tx-sgp-cdn.snackvideo.in/upic/2021/02/06/14/BMjAyMTAyMDYxNDEzNTdfMTUwMDAwNTA0NzAxODE3XzE1MDAwMTIxNDc2NjMwM18wXzM=_b_Bf75a13f3d0baae6e09439fd4ece0162b.mp4?tag=1-1617467657-s-0-ecmtkyw5wf-bf4998412b4b4d0c");
        DataHandler data11= new DataHandler("title :11",  "http://g-sgp-cdn.snackvideo.in/upic/2021/02/19/14/BMjAyMTAyMTkxNDEzNTBfMTUwMDAwNTA0NzAxODE3XzE1MDAwMTIyMDYyNzg0NF8wXzM=_b_B91e3f34d766d227a45c25a1e789f5fd4.mp4?tag=1-1617467570-s-0-zgwjzvjlen-37f6473471597406");

        dataHandlers.add(data);
        dataHandlers.add(data2);
        dataHandlers.add(data3);
        dataHandlers.add(data4);
        dataHandlers.add(data5);
        dataHandlers.add(data6);
        dataHandlers.add(data7);
        dataHandlers.add(data8);
        dataHandlers.add(data9);
        dataHandlers.add(data10);
        dataHandlers.add(data11);



        viewPager2=findViewById(R.id.viewPager2);
        VideoAdaptor videoAdaptor= new VideoAdaptor(dataHandlers,MainActivity.this);
        viewPager2.setAdapter(videoAdaptor);

    }
}