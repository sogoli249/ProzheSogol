package ir.sogol.prozheman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText editUseName = (EditText) findViewById(R.id.edtSignUpUserName);
        EditText editPassword = (EditText) findViewById(R.id.edtSignUpPassword);
        Button btnClick = (Button) findViewById(R.id.btnSignUpSabtNum);
        TextView btnGoToSignIn = (TextView) findViewById(R.id.txtGoToSignIn);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = editUseName.getText().toString();
                String passWord = editPassword.getText().toString();

                sharedPreferences.edit().putString("username", userName).apply();
                sharedPreferences.edit().putString("password", passWord).apply();
                sharedPreferences.edit().putBoolean("login", true).apply();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }

        });


        btnGoToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(intent);

            }
        });


    }
}