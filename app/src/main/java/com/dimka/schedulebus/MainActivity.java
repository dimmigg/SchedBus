package com.dimka.schedulebus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBtn136prig;
    Button mBtn136kmr;
    Button mBtn157kmr;
    Button mBtn176;
    Button mBtn114;
    TextView mTextH1;
    TextView mTextTime;
    CheckBox mChkBox;


    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtn136prig = (Button) findViewById(R.id.btn136prig);
        mBtn136kmr = (Button) findViewById(R.id.btn136kmr);
        mBtn157kmr = (Button) findViewById(R.id.btn157kmr);
        mBtn176 = (Button) findViewById(R.id.btn176);
        mBtn114 = (Button) findViewById(R.id.btn114);
        mTextH1 = (TextView) findViewById(R.id.textH1);
        mTextTime = (TextView) findViewById(R.id.texttime);
        mChkBox = (CheckBox) findViewById(R.id.checkBox);

        sp = PreferenceManager.getDefaultSharedPreferences(this);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.btn136prig:
                        if (mChkBox.isChecked()) {
                            mTextH1.setText(R.string.H1_136prig);
                            mTextTime.setText(R.string.TextTime136prig);
                            break;
                        } else {
                            mTextH1.setText(R.string.H1_136prigVih);
                            mTextTime.setText(R.string.TextTime136prigVih);
                            break;
                        }
                    case R.id.btn136kmr:
                        if (mChkBox.isChecked()) {
                            mTextH1.setText(R.string.H1_136kmr);
                            mTextTime.setText(R.string.TextTime136kmr);
                            break;
                        } else {
                            mTextH1.setText(R.string.H1_136kmrVih);
                            mTextTime.setText(R.string.TextTime136kmrVih);
                            break;
                        }
                    case R.id.btn157kmr:
                        if (mChkBox.isChecked()) {
                            mTextH1.setText(R.string.H1_157kmr);
                            mTextTime.setText(R.string.TextTime157kmr);
                            break;
                        } else {
                            mTextH1.setText(R.string.H1_157kmrVih);
                            mTextTime.setText(R.string.TextTime157kmrVih);
                            break;
                        }
                    case R.id.btn176:
                        if (mChkBox.isChecked()) {
                            mTextH1.setText(R.string.H1_176);
                            mTextTime.setText(R.string.TextTime176);
                            break;
                        } else {
                            mTextH1.setText(R.string.H1_176);
                            mTextTime.setText(R.string.TextTime176);
                            break;
                        }
                    case R.id.btn114:
                        if (mChkBox.isChecked()) {
                            mTextH1.setText(R.string.H1_114);
                            mTextTime.setText(R.string.TextTime114);
                            break;
                        } else {
                            mTextH1.setText(R.string.H1_114Vih);
                            mTextTime.setText(R.string.TextTime114Vih);
                            break;
                        }
                }

            }
        };
        mBtn136prig.setOnClickListener(onClickListener);
        mBtn136kmr.setOnClickListener(onClickListener);
        mBtn157kmr.setOnClickListener(onClickListener);
        mBtn176.setOnClickListener(onClickListener);
        mBtn114.setOnClickListener(onClickListener);

    }


    protected void onResume() {

        super.onResume();


        int textH1Size = Integer.parseInt(sp.getString("textH1Size", "1"));
        if (textH1Size != 1){
            mTextH1.setTextSize(textH1Size);}else {
            mTextH1.setTextSize(12);}

        int textTimeSize = Integer.parseInt(sp.getString("textTimeSize", "1"));
        if (textTimeSize != 1){
        mTextTime.setTextSize(textTimeSize);}else {
            mTextTime.setTextSize(12);}

        int textBtnSize = Integer.parseInt(sp.getString("textBtnSize", "1"));
        if (textBtnSize != 1){
        mBtn136kmr.setTextSize(textBtnSize);
        mBtn136prig.setTextSize(textBtnSize);
        mBtn157kmr.setTextSize(textBtnSize);
        mBtn176.setTextSize(textBtnSize);
        mBtn114.setTextSize(textBtnSize);
        mChkBox.setTextSize(textBtnSize);
        }else {
            mBtn136kmr.setTextSize(12);
            mBtn136prig.setTextSize(12);
            mBtn157kmr.setTextSize(12);
            mBtn176.setTextSize(12);
            mBtn114.setTextSize(12);
            mChkBox.setTextSize(12);
        }


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem mi = menu.add(0, 1, 0, "Preferences");
        mi.setIcon(R.drawable.ic_settings_black_24dp);
        mi.setShowAsAction(1);
        mi.setIntent(new Intent(this, PrefActivity.class));
        return super.onCreateOptionsMenu(menu);
    }

}
