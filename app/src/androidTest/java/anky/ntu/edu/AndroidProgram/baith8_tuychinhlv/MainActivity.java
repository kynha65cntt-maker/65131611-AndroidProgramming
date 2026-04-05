package anky.ntu.edu.AndroidProgram.baith8_tuychinhlv;

import android.os.Bundle;import android.view.View;import android.widget.AdapterView;import android.widget.ListView;import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;import till.edu.ntu.anky_65131611.myapplication.MonAn;import till.edu.ntu.anky_65131611.myapplication.MonAnAdapter;import till.edu.ntu.anky_65131611.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView lvMonAnList = findViewById(R.id.lvDsMonAn);
        ArrayList <MonAn> MonAnList = new ArrayList<>();

        MonAnList.add(new MonAn("cơm gà", 20000, "Mo ta o day",R.drawable.cg));
        MonAnList.add(new MonAn("cơm tấm sườn", 20000, "Mo ta o day",R.drawable.s));
        MonAnList.add(new MonAn("cơm tấm sườn bì chả", 20000, "Mo ta o day",R.drawable.sbt));
        MonAnList.add(new MonAn("cơm tầm sườn trứng", 20000, "Mo ta o day",R.drawable.st));
        MonAnList.add(new MonAn("cơm tầm sườn đặt biệt", 20000, "Mo ta o day",R.drawable.sdb));
        MonAnAdapter monAnAdapter = new MonAnAdapter(this, MonAnList);
        lvMonAnList.setAdapter(monAnAdapter);

        lvMonAnList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAnChon = MonAnList.get(position);

                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
}