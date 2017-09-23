package ece.course.lab1assignment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main extends AppCompatActivity {
    int dice=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnThrow=(Button) findViewById(R.id.btnThrow);
        btnThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                dice=random.nextInt(6);
                TextView tvName=(TextView) findViewById(R.id.tvName);
                ImageView ivPicture=(ImageView)findViewById(R.id.ivPicture);
                switch (dice){
                    default:
                        break;
                    case 0:
                        tvName.setText("Result: 1");
                        ivPicture.setImageResource(R.drawable.one);
                        break;
                    case 1:
                        tvName.setText("Result: 2");
                        ivPicture.setImageResource(R.drawable.two);
                        break;
                    case 2:
                        tvName.setText("Result: 3");
                        ivPicture.setImageResource(R.drawable.three);
                        break;
                    case 3:
                        tvName.setText("Result: 4");
                        ivPicture.setImageResource(R.drawable.four);
                        break;
                    case 4:
                        tvName.setText("Result: 5");
                        ivPicture.setImageResource(R.drawable.five);
                        break;
                    case 5:
                        tvName.setText("Result: 6");
                        ivPicture.setImageResource(R.drawable.six);
                        break;
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
