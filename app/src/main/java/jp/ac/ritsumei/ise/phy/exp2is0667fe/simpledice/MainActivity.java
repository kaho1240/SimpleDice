package jp.ac.ritsumei.ise.phy.exp2is0667fe.simpledice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        TextView dice = (TextView) findViewById(R.id.dice);
        Random random = new Random();
        dice.setText(String.format("%d", random.nextInt(6) + 1));
    }
}
