package ro.pub.cs.systems.pdsd.practicaltest02;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PracticalTest02MainActivity extends Activity {



    // Server widgets
    private EditText site= null;
    private Button start = null;
    private Button add = null;
    private EditText port= null;

    // Client widgets
    private EditText Site = null;
    private Button go = null;
    private WebView web = null;


    //network threads
    private ServerThread serverThread = null;
    private ClientThread clientThread = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test02_main);
    }
}
