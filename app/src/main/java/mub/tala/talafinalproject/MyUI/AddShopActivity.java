package mub.tala.talafinalproject.MyUI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mub.tala.talafinalproject.R;
import mub.tala.talafinalproject.data.Shop;

//1 design addshop xml
public class AddShopActivity extends AppCompatActivity {
    //2
    private Button btnSaveShop,btnUpload;
    private EditText etAdress,etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3 find view by id
        setContentView(R.layout.activity_add_shop);
        etAdress=findViewById(R.id.etEmailAdress);
        etPhone=findViewById(R.id.etPhone);
        btnUpload=findViewById(R.id.btnUpload);
        //4 listner
        btnSaveShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    //5
    public void validateForm(){
        String adress= etAdress.getText().toString();
        String phone= etPhone.getText().toString();
        boolean isOk=true;
        //note: another validate option for the address it have to chek if the address is located
        if(adress.length()==0){
            isOk= false;
            etAdress.setError("Wrong Address");
        }
        if (isOk){
            //6 save on fireabase
            //6.1 build your data project
            Shop shop= new Shop();
            shop.setAdress(adress);
            shop.setPhone(phone);
            //6.2
       //     saveShop(shop);
        }
        //6.3 request to save mt shop
    }
}