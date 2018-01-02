package np.com.aacs.kathmanduvistguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView textView;
        textView= (TextView) findViewById(R.id.textView);
        Toast.makeText(Home.this, "Welcome to Kathmandu Visit Guide", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

    }
}
