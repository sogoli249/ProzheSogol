package ir.sogol.prozheman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (checkForLogin() ) {

            Intent intent = new Intent(this , SignUpActivity.class);
            startActivity(intent);

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