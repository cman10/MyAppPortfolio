package app.portfolio.myappportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn,btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button1);
        btn1= (Button) findViewById(R.id.button2);
        btn2= (Button) findViewById(R.id.button3);
        btn3= (Button) findViewById(R.id.button4);
        btn4= (Button) findViewById(R.id.button5);
        btn5= (Button) findViewById(R.id.button6);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v== btn) {
            Toast.makeText(MainActivity.this, "This Button will launch my Popular movies project", Toast.LENGTH_LONG).show();}

        if(v==btn1) {

        Toast.makeText(MainActivity.this,"This Button will launch my StockHawk project",Toast.LENGTH_LONG).show();
    }
          if(v==btn2) {
            Toast.makeText(MainActivity.this,"This Button will launch my Build it Bigger project",Toast.LENGTH_LONG).show();
        }
             if(v==btn3) {
                Toast.makeText(MainActivity.this,"This Button will launch my Make Your App Material project",Toast.LENGTH_LONG).show();
            }
                if(v==btn4) {
                    Toast.makeText(MainActivity.this,"This Button will launch my Go Ubiquitous project",Toast.LENGTH_LONG).show();
                }
                    if(v==btn5) {
                        Toast.makeText(MainActivity.this,"This Button will launch my Capstone project",Toast.LENGTH_LONG).show();
                    }








    }
}
