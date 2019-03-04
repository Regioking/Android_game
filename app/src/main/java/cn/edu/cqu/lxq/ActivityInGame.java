package cn.edu.cqu.lxq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityInGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_game);
    }
    private void end(){
        Bundle bd = new Bundle();
        bd.putString("scores","0");
        Intent it = new Intent();
        it.setClass(this,ActivityEndGame.class);
        it.putExtras(bd);
        startActivity(it);
        this.finish();
    }
    public void image1Click(View v){end();}
    public void image2Click(View v){end();}
    public void image3Click(View v){end();}
    public void image4Click(View v){end();}
    public void image5Click(View v){
        Bundle bd = new Bundle();
        bd.putString("scores","100");
        Intent it = new Intent();
        it.setClass(this,ActivityEndGame.class);
         it.putExtras(bd);
        startActivity(it);
        this.finish();}
    public void image6Click(View v){end();}
}
