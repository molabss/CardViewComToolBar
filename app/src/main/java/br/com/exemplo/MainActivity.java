package br.com.exemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.card_toolbar);
        if (toolbar != null) {
            // inflate your menu
            toolbar.inflateMenu(R.menu.card_toolbar);
            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    return true;
                }
            });
        }


//        Toolbar maintoolbar = (Toolbar) findViewById(R.id.toolbar_main);
//        if (toolbar != null) {
//            // inflate your menu
//            maintoolbar.inflateMenu(R.menu.card_toolbar);
//            maintoolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//                @Override
//                public boolean onMenuItemClick(MenuItem menuItem) {
//                    return true;
//                }
//            });
//        }
    }
}

