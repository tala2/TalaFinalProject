package mub.tala.talafinalproject.MyUI;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mub.tala.talafinalproject.R;
public class SignUpActivity extends AppCompatActivity {
    private TextView TvSignUp;
    private EditText etFirstName,etLastName,etPhone,etEmail2,etPassWord,etPassWordVarify;
    private Button btnSave,btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TvSignUp = findViewById(R.id.tvSignUp); // title
        etFirstName = findViewById(R.id.etFirstName);//first name
        etLastName = findViewById(R.id.etLastName);//family name
        etPhone = findViewById(R.id.etPhone);//phone number
        etEmail2 = findViewById(R.id.etEmail2);//email address
        etPassWord = findViewById(R.id.etPassWord);//password
        etPassWordVarify = findViewById(R.id.etPassWordVarify);//verifying
        btnSave = findViewById(R.id.btnSave);//save data
        btnReturn = findViewById(R.id.btnReturn);//return to the home screen
    }
        private void checkForm() {
            String passw2 = etPassWordVarify.getText().toString();
            String passw1 = etPassWord.getText().toString();
            String fname = etFirstName.getText().toString();
            String lname = etLastName.getText().toString();
            String phone = etPhone.getText().toString();
            String email = etEmail2.getText().toString();
            boolean isOk = true;
            if (fname.length() < 2)
            {
                isOk = false;
                etFirstName.setError("At least to letters");
            }
            if (email.length() < 5 || email.indexOf('@') == 0 || email.indexOf('@') >= email.length() - 2 ||
                    email.indexOf('.') == 0 || email.indexOf('.') > email.length() - 1 || email.lastIndexOf('.') < email.indexOf('@'))
            {
                isOk = false;
                etEmail2.setError("Wrong Email Address Please Rewrite");
            }
        }
}