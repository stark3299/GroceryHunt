package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton search;
    RecyclerView r1,r2;
    int[] grid1 = {R.drawable.pulses, R.drawable.atta, R.drawable.rice, R.drawable.dryfruits, R.drawable.edibleoil, R.drawable.ghee};
    int[] grid2 = {R.drawable.spices, R.drawable.salt, R.drawable.organicstaples, R.drawable.vegetables, R.drawable.fruits, R.drawable.meat};
    int[] ri1 = {R.drawable.fruits, R.drawable.vegetables, R.drawable.meat, R.drawable.milk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        search = findViewById(R.id.search);
        r1 = findViewById(R.id.recyclerview1);
        r2 = findViewById(R.id.recyclerview2);
        com.example.dashboard.MyAdapter adapter = new com.example.dashboard.MyAdapter(this, ri1);
        String[] name1 = getResources().getStringArray(R.array.name1);
        String[] offer1 = getResources().getStringArray(R.array.offers1);
        String[] name2 = getResources().getStringArray(R.array.name2);
        String[] offer2 = getResources().getStringArray(R.array.offers2);
        Adapter2 adapter2 = new Adapter2(this, name1, offer1, name2, offer2, grid1, grid2);
        r2.setAdapter(adapter2);
        r2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        r1.setAdapter(adapter);
        r1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.cart) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Intent intent,chooser;
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_address:
                break;
            case R.id.nav_orders:
                break;
            case R.id.nav_cart:
                break;
            case R.id.categories:
                break;
            case R.id.nav_offers:
                break;
            case R.id.nav_wallet:
                break;
            case R.id.nav_support:
                break;
            case R.id.nav_share:
                intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"SHUT UP");
                intent.setType("text/plain");
                chooser = Intent.createChooser(intent,"Share VIA");
                startActivity(chooser);
                break;
            case R.id.nav_rate:
                break;
            case R.id.nav_about:
                break;
            case R.id.nav_settings:
                intent = new Intent(this, com.example.dashboard.settings.class);
                startActivity(intent);
                break;
            case R.id.login:
                intent = new Intent(this,loginpage.class);
                startActivity(intent);
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}