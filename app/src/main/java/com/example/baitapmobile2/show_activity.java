package com.example.baitapmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class show_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView name = findViewById(R.id.txt_nameout);
        TextView phone = findViewById(R.id.txt_phoneout);
        TextView gioitinh = findViewById(R.id.txt_gioitinhout);
        TextView trinhdo = findViewById(R.id.txt_trinhdoout);
        TextView tuoi = findViewById(R.id.txt_tuoiout);
        TextView thethao = findViewById(R.id.txt_thethaoout);
        TextView amnhac = findViewById(R.id.txt_amnhacout);

        Bundle extra = getIntent().getExtras();
        info_save info = (info_save) extra.getSerializable("info");
        if(info.gender)
            gioitinh.setText("Nữ");
        else
            gioitinh.setText("Nam");
        name.setText(info.name);
        phone.setText(info.phone);
        trinhdo.setText(info.trinhdo);
        tuoi.setText(info.tuoi);
        if (info.thethao)
            thethao.setText("Có");
        else
            thethao.setText("Không");
        amnhac.setText(info.amnhac);

    }
}