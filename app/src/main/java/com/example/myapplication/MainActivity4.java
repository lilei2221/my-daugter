package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class MainActivity4 extends AppCompatActivity {

    private TextView testTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shiyan3c);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        testTextView = findViewById(R.id.testTextView);  // 绑定测试文本控件
    }

    // 加载菜单布局
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();  // 获取菜单项的 ID

        if (id == R.id.menu_font_size_small) {
            testTextView.setTextSize(10);  // 小号字体
            Toast.makeText(this, "小号字体", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_font_size_medium) {
            testTextView.setTextSize(16);  // 中号字体
            Toast.makeText(this, "中号字体", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_font_size_large) {
            testTextView.setTextSize(20);  // 大号字体
            Toast.makeText(this, "大号字体", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_font_color_red) {
            testTextView.setTextColor(Color.RED);  // 红色字体
            Toast.makeText(this, "红色字体", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_font_color_black) {
            testTextView.setTextColor(Color.BLACK);  // 黑色字体
            Toast.makeText(this, "黑色字体", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_normal) {
            Toast.makeText(this, "普通菜单项", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

