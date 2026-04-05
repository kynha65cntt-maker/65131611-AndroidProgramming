package anky.ntu.edu.AndroidProgram.baith8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import till.edu.ntu.anky_65131611.myapplication.R;

public class MonAnAdapter extends BaseAdapter {

    private Context _context;
    private LayoutInflater layoutInflater;
    private ArrayList<MonAn> MonAnList;

    public MonAnAdapter(Context _context, ArrayList<MonAn> monAnList) {
        this._context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
        this.MonAnList = monAnList;
    }

    @Override
    public int getCount() {
        return MonAnList.size();
    }

    @Override
    public Object getItem(int position) {
        return MonAnList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Tạo ViewHolder nếu chưa tồn tại

        View viewHienHanh = convertView;
        RecyclerView.ViewHolder viewHolder;
        if (viewHienHanh == null) {
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        //Lay du lieu
            MonAn monAnHienTai = MonAnList.get(position);

            TextView textView_TenMon = viewHienHanh.findViewById(R.id.textView_TenMon);
            TextView textView_DonGia = viewHienHanh.findViewById(R.id.textView_DonGia);
            TextView textView_MoTa = viewHienHanh.findViewById(R.id.textView_MoTa);
            ImageView imageView_AndDaiDien = (ImageView) viewHienHanh.findViewById(R.id.imageView_AndDaiDien);

            textView_TenMon.setText(monAnHienTai.getTen());
            textView_DonGia.setText((int) monAnHienTai.getDonGia());
            textView_MoTa.setText(monAnHienTai.getMoTa());
            imageView_AndDaiDien.setImageResource(monAnHienTai.getAndDaiDien());

            viewHolder = new RecyclerView.ViewHolder(viewHienHanh) {
            };
            viewHienHanh.setTag(viewHolder);
        } else {
            viewHolder = (RecyclerView.ViewHolder) viewHienHanh.getTag();
        }
        return viewHienHanh;
    }
}
