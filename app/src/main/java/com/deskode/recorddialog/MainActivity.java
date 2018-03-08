package com.deskode.recorddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecordDialog recordDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recordDialog = RecordDialog.newInstance("Grabar Audio de Complemento");
                recordDialog.show(MainActivity.this.getFragmentManager(),"TAG");
                recordDialog.setPositiveButton("Guardar", new RecordDialog.ClickListener() {
                    @Override
                    public void OnClickListener(String path) {
                        Toast.makeText(MainActivity.this,"Save audio: "+path, Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
