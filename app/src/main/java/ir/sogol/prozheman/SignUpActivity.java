package ir.sogol.prozheman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        Button btnClick = (Button) findViewById(R.id.btnSignUpSabtNum);
        TextView btnGoToSignIn = (TextView) findViewById(R.id.txtGoToSignIn);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });


        btnGoToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext() , SignInActivity.class);
                startActivity(intent);

            }
        });




    }
}