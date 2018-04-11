package com.example.android.tourguide_moscow_ni;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ObjectDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_detail);

        Intent intent = getIntent();
        List list = intent.getParcelableExtra("Details");


        String objeName = list.getmObjectName();
        String objeAdr = list.getmObjectAddress();
        String objeDes = list.getmObjectDesc();
        String objeCat = list.getmClassName();
        int imageRes = list.getMimageResourceID();

        this.setTitle(objeCat);

        TextView objectName = findViewById(R.id.objectNameDet);
        objectName.setText(objeName);

        TextView objectAdr = findViewById(R.id.objectAdrDet);
        objectAdr.setText(objeAdr);

        TextView objectDes = findViewById(R.id.objectDesDet);
        objectDes.setText(objeDes);

        ImageView ImageDet = findViewById(R.id.imagedet);
        ImageDet.setImageResource(imageRes);

        TextView gpsPlaceView = findViewById(R.id.objectAdrDet);
        final String goToAddress = getString(R.string.goTo) + objeAdr;

        gpsPlaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gps = new Intent(Intent.ACTION_VIEW);
                gps.setData(Uri.parse(goToAddress));
                if (gps.resolveActivity(getPackageManager()) != null) {
                    startActivity(gps);
                }
            }
        });

    }
}
