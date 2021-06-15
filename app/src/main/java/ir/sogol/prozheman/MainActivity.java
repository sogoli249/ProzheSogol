package ir.sogol.prozheman;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        TextView txtWelcome = (TextView) findViewById(R.id.txtMain);

        if (checkForLogin() ) {

            Intent intent = new Intent(this , SignUpActivity.class);
            startActivity(intent);

        } else {

            String userName = sharedPreferences.getString("username" , "یوزر جدید");
            txtWelcome.setText("خوش اومدی" + userName);

        }



    }

    private boolean checkForLogin() {

        boolean check = false;

        if (!sharedPreferences.getBoolean("login", false)) {

            check = true;

        }


        return check;

    }
}