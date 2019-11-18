package com.jihenedorsaf.authintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN = "USER_LOGIN";
    final String EXTRA_PASSWORD = "USER_PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = (EditText) findViewById(R.id.user_email);
        final EditText password = (EditText) findViewById(R.id.user_password);
        Button seConnecter = (Button) findViewById(R.id.connect);
        seConnecter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final String logintxt = login.getText().toString();
                final String passtxt = password.getText().toString();

                if (logintxt.equals("") || passtxt.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.email_or_password_empty,
                            Toast.LENGTH_SHORT).show();
                    return;
                }


                    Intent intent = new Intent(MainActivity.this, LoginDisplayActivity.class);
                    intent.putExtra(EXTRA_LOGIN, logintxt);
                    intent.putExtra(EXTRA_PASSWORD, passtxt);
                    startActivity(intent);
                }

        });
    }
}


