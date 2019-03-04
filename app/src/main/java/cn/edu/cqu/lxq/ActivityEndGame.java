package cn.edu.cqu.lxq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityEndGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);
        Bundle bd = getIntent().getExtras();
        String scores=bd.getString("scores");
        ((TextView)findViewById(R.id.tv_scoreNum)).setText(scores);
    }
    public void btn_return_Click(View v){
        Intent it = new Intent();
        it.setClass(this,MainActivity.class);
        startActivity(it);
        this.finish();
    }
}
