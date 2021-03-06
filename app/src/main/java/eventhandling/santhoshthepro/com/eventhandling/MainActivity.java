package eventhandling.santhoshthepro.com.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    Button btnMsg1,btnMsg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMsg1 =(Button)findViewById(R.id.btnMsg1);
        btnMsg2 =(Button)findViewById(R.id.btnMsg2);

    }

    public void showMessageOne(View view) {

        Log.i(TAG,"Button 1 Clicked!");
        Toast.makeText(getApplicationContext(),"Message 1: Hello World!",Toast.LENGTH_SHORT).show();
    }

    public void showMessageTwo(View view) {

        Log.i(TAG,"Button 2 Clicked!");
        Toast.makeText(getApplicationContext(),"Message 2: Welcome Everyone!",Toast.LENGTH_SHORT).show();
    }
}
