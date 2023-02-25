package com.example.baitapmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView namein = findViewById(R.id.txt_name);
    TextView phonein = findViewById(R.id.txt_phone);
    TextView tuoiout = findViewById(R.id.txt_tuoi);
    CheckBox thethao = (CheckBox) findViewById(R.id.checkBox);
    String amnhacout;
    RadioGroup amnhac = findViewById(R.id.radioGroup);
    RadioButton pop = findViewById(R.id.pop);
    RadioButton rock = findViewById(R.id.rock);
    RadioButton rap = findViewById(R.id.rap);
    SeekBar tuoi = findViewById(R.id.seekBar);
    Button register = findViewById(R.id.button2);
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch gioitinh = findViewById(R.id.switch1);
    Spinner trinhdo = findViewById(R.id.spinner);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arraySpinner = new String[]{
                "Cao đẳng", "Đại học", "Cao học"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        trinhdo.setAdapter(adapter);
        trinhdo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String trinhdo = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        tuoi.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tuoiout.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        amnhac.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rock:
                        amnhacout = rock.getText().toString();
                        break;
                    case R.id.pop:
                        amnhacout = pop.getText().toString();
                        break;
                    case R.id.rap:
                        amnhacout = rap.getText().toString();
                        break;
                }
            }
        });
    }
    public View.OnClickListener form = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == register) {
                String name = namein.getText().toString();
                String phone = phonein.getText().toString();
                Boolean gtinh = gioitinh.isChecked();
                String trdo = trinhdo.getSelectedItem().toString();
                String tuoi = tuoiout.getText().toString();
                Boolean tthao = thethao.isChecked();
                info_save info = new info_save(name, phone, gtinh, trdo, tuoi, tthao, amnhacout);
                Intent intent = new Intent(getApplicationContext(), show_activity.class);
                intent.putExtra("info", info);
                startActivity(intent);
            }
            else {
                namein.setText("");
                phonein.setText("");
                gioitinh.setChecked(false);
                trinhdo.setSelection(0);
                tuoi.setProgress(20);
                thethao.setChecked(false);
                rock.setChecked(true);
            }
        }
    };
}