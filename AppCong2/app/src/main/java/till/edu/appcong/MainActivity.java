package till.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view){
        //Tim tham chieu den cac doi tuong trong giao dien
        EditText editTextA = findViewById(R.id.edtA);
        EditText editTextB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lay dữ liệu về ô điều khiển số a
        String strA = editTextA.getText().toString();
        //Lay dữ liệu về ô điều khiển số b
        String strB = editTextB.getText().toString();

        //Tính tổng 2 số a và b
        int a = Integer.parseInt(strA);//2
        int b = Integer.parseInt(strB);//4
        // tính toán theo yêu cầu
        int tong = a + b; //Tính tổng 2 số a và b = 6
        String strTong = String.valueOf(tong); //Chuyển sang dạng chuoi: :"6"
        // Hiển thị kết quả
        editTextKetQua.setText(String.valueOf(strTong));

    }
}