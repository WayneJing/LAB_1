package ece.course.lab_1_3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isBoy = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnPicture=(Button) findViewById(R.id.btnPicture);
        btnPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tvName=(TextView) findViewById(R.id.tvName);


                ImageView ivPicture=(ImageView)findViewById(R.id.ivPicture);


                if (isBoy){
                    tvName.setText(R.string.nameGirl);
                    ivPicture.setImageResource(R.drawable.girl);
                    isBoy = false;
                }else {
                    tvName.setText(R.string.nameBoy);
                    ivPicture.setImageResource(R.drawable.boy);
                    isBoy = true;
                }
            }
        });
        Button btnName=(Button) findViewById(R.id.btnName);
        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etName = (EditText) findViewById(R.id.etName);
                String name = etName.getText().toString();
                TextView tvName=(TextView) findViewById(R.id.tvName);
                tvName.setText(name);

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
