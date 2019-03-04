package cn.edu.cqu.lxq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_start_Click(View view){
        Intent it = new Intent();
        it.setClass(this,ActivityInGame.class);
        startActivity(it);
        this.finish();
    }
    public void btn_end_Click(View v){

        System.exit(0);
    }
}
