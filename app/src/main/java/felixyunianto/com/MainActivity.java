package felixyunianto.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLinux;
    private ArrayList<Linux> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rvLinux = findViewById(R.id.rv_linux);
        rvLinux .setHasFixedSize(true);

        list.addAll(LinuxData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvLinux.setLayoutManager(new LinearLayoutManager(this));
        ListLinuxAdapter listLinuxAdapter = new ListLinuxAdapter(list);
        rvLinux.setAdapter(listLinuxAdapter);

        listLinuxAdapter.setOnItemClickCallback(new ListLinuxAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Linux data) {
                showSelectedData(data);
            }
        });
    }

    public void showSelectedData (Linux l){
        Intent detail = new Intent(MainActivity.this, DetailLinux.class);
        detail.putExtra(DetailLinux.EXTRA_NAMALINUX, l.getName());
        detail.putExtra(DetailLinux.EXTRA_RILIS,l.getRilis());
        detail.putExtra(DetailLinux.EXTRA_PENGERTIAN, l.getDetail());
        detail.putExtra(DetailLinux.EXTRA_SEJARAH,l.getSejarah());
        detail.putExtra(DetailLinux.EXTRA_IMG,l.getPhoto());
        startActivity(detail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
        return super.onOptionsItemSelected(item);
    }

}
