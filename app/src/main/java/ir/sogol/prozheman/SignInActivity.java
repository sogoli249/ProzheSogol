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
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        EditText editUseName = (EditText) findViewById(R.id.edtSignInUserName);
        EditText editPassword = (EditText) findViewById(R.id.edtSignInPassword);
        Button btnClick = (Button) findViewById(R.id.btnSignIn);
        TextView btnGoToSignUp = (TextView) findViewById(R.id.btnSignUpSabtNum);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = editUseName.getText().toString();
                String passWord = editPassword.getText().toString();

                String userCheck = sharedPreferences.getString("username" , "null");
                String passCheck = sharedPreferences.getString("password" , "null");


                if (userCheck.equals(userName) && passCheck.equals(passWord)) {

                    Toast.makeText(getApplicationContext() , "خوش اومدین" , Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext() , MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);

                } else {

                    Toast.makeText(getApplicationContext() , "اشتباه است" , Toast.LENGTH_SHORT).show();

                }



            }

        });


        btnGoToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext() , SignUpActivity.class);
                startActivity(intent);

            }
        });


    }
}