package felixyunianto.com;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailLinux extends AppCompatActivity {
    public static final String EXTRA_IMG= "extra_img";
    public static final String EXTRA_NAMALINUX = "extra_namalinux";
    public static final String EXTRA_RILIS = "extra_rilis";
    public static final String EXTRA_PENGERTIAN= "extra_pengertian";
    public static final String EXTRA_SEJARAH= "extra_sejarah";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_linux);

        ImageView Gambar;
        TextView tvNamaLinux, tvPengertian, tvSejarah ,tvRilis;

        Gambar = findViewById(R.id.img_linux);
        tvNamaLinux = findViewById(R.id.tv_name);
        tvRilis = findViewById(R.id.tv_rilis);
        tvPengertian = findViewById(R.id.tv_pengertian);
        tvSejarah = findViewById(R.id.tv_sejarah);

        int photo = getIntent().getIntExtra(EXTRA_IMG, 0);
        String nama = getIntent().getStringExtra(EXTRA_NAMALINUX),
                rilis = getIntent().getStringExtra(EXTRA_RILIS),
                pengertian = getIntent().getStringExtra(EXTRA_PENGERTIAN),
                sejarah = getIntent().getStringExtra(EXTRA_SEJARAH);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(),photo);
        Gambar.setImageBitmap(bmp);
        tvNamaLinux.setText(nama);
        tvRilis.setText(rilis);
        tvPengertian.setText(pengertian);
        tvSejarah.setText(sejarah);

    }
}
