package com.jihenedorsaf.authintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


    public class LoginDisplayActivity extends AppCompatActivity {
        final String EXTRA_LOGIN = "USER_LOGIN";
        final String Extra_Password = "USER_PASSWORD";

        @Override
        protected void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login_display);
            Intent intent = getIntent();

            TextView loginDisplay = findViewById(R.id.email_display);
            TextView passwordDisplay = findViewById(R.id.password_display);

            if (intent != null) {
                loginDisplay.setText((intent.getStringExtra(EXTRA_LOGIN)));
                passwordDisplay.setText(intent.getStringExtra(Extra_Password));

            }
        }
    }