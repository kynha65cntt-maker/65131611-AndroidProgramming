package till.edu.anky65131611.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac doi tuong voi cac dieu khien tuong ung
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien() {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKetQua = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //Gan bo lang nghe
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //goi ham xu ly cong
                XuLyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }

        });
    }


    //XuLyCong
    public void XuLyCong() {
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang con so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh tong
        float tong = soA + soB;
        //Tim view hien thi ket qua
        //Chuyen du lieu tu con so sang chuoi
        String ketQua = String.valueOf(tong);
        //Gan ket qua vao view
        editTextKetQua.setText(ketQua);
    }
    public void XuLyTru() {

        //lay du lieu tu 2 dieu khien tren
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang con so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Hieu
        float hieu = soA - soB;
        //Tim view hien thi ket qua

        //Chuyen du lieu tu con so sang chuoi
        String ketQua = String.valueOf(hieu);
        //Gan ket qua vao view
        editTextKetQua.setText(ketQua);
    }

    public void XuLyNhan() {
        //lay du lieu tu 2 dieu khien tren
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang con so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Hieu
        float tich = soA * soB;
        //Tim view hien thi ket qua

        //Chuyen du lieu tu con so sang chuoi
        String ketQua = String.valueOf(tich);
        //Gan ket qua vao view
        editTextKetQua.setText(ketQua);
    }

    public void XuLyChia() {
        //lay du lieu tu 2 dieu khien tren
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyen du lieu tu chuoi sang con so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tinh Hieu
        float thuong = soA / soB;
        //Tim view hien thi ket qua
        EditText editTextKetQua = (EditText) findViewById(R.id.edtKetQua);
        //Chuyen du lieu tu con so sang chuoi
        String ketQua = String.valueOf(thuong);
        //Gan ket qua vao view
        editTextKetQua.setText(ketQua);
    }
}