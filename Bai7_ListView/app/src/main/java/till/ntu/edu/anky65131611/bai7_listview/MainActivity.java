package till.ntu.edu.anky65131611.bai7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hien Thi du lieu len List View
        //B1+: Can co du lieu, tu dau co ?
        // tu co so du lieu (SQL, noSQL, XML,...)
        //o bai nay, chung ta hard-code du lieu truc tiep
        // can bien phu hop de chua du lieu
        //String[]danhsachabc
        ArrayList<String> dsTenTinhThanhVN = new ArrayList<String>();//KHAI BAO VAKhoi tao(
        // them du lieu vao ArrayList
        dsTenTinhThanhVN.add("An Giang");
        dsTenTinhThanhVN.add("Bà Rịa - Vũng Tàu");
        dsTenTinhThanhVN.add("Bạc Liêu");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Kiên Giang");
        dsTenTinhThanhVN.add("Kon Tum");

        //B2. Tao adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);
        //B3. Gan adapter cho listview
        //3.1, Tim
        ListView lvTinhThanh = findViewById(R.id.IvDanhSachTT);
        //3.2 Gan adapter cho listview
        lvTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 lắng nghe xử lý sự kiện


    }
}
