package mub.tala.talafinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignINActivity2 extends AppCompatActivity {
    //1
    private EditText etEmail,etPassword;
    private Button btnLogin,btnSignup,btnForgetPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_i_n2);
//2
        etEmail=findViewById(R.id.etEmail2);
        etPassword=findViewById(R.id.etPassWord);
        btnLogin=findViewById(R.id.btnSignIn);
        btnSignup = findViewById(R.id.btnSignup);
        btnForgetPass = findViewById(R.id.btnForgetPass);
    }
}