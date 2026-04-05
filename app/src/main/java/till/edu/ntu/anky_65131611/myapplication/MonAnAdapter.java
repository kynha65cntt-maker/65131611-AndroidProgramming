package till.edu.ntu.anky_65131611.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    public MonAnAdapter(Context context, ArrayList<MonAn> dsMonAn) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.dsMonAn = dsMonAn;
    }

    //
     private final ArrayList<MonAn> dsMonAn;
     private final LayoutInflater layoutInflater;
     private final Context context;

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View viewHienHanh = convertView;
        //Kiem tra

        if(viewHienHanh== null)
            viewHienHanh= layoutInflater.inflate(R.layout.item_monan,null);
        MonAn monAnHienTai = dsMonAn.get(i);


        //Tim dieu khien
        TextView textView_TenMon = viewHienHanh.findViewById(R.id.tvTenMonAnh);
        TextView textView_DonGia = viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textView_MoTa = viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //set len
        textView_TenMon.setText(monAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia() ));
        textView_MoTa.setText(monAnHienTai.getMoTa());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;
    }
}
