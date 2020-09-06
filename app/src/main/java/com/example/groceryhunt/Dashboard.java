package com.example.groceryhunt;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;

import java.util.LinkedHashMap;

public class Dashboard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton search;
    MyAdapter adapter;
    RecyclerView r1,r2;
    Adapter2 adapter2;
    int[] grid1 = {R.drawable.pulses, R.drawable.atta, R.drawable.rice, R.drawable.dryfruits, R.drawable.edibleoil, R.drawable.ghee};
    int[] grid2 = {R.drawable.spices, R.drawable.salt, R.drawable.organicstaples, R.drawable.vegetables, R.drawable.fruits, R.drawable.meat};
    int[] ri1 = {R.drawable.fruits, R.drawable.vegetables, R.drawable.meat, R.drawable.milk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        search = findViewById(R.id.search);
        r1 = findViewById(R.id.recyclerview1);
        r2 = findViewById(R.id.recyclerview2);
        adapter = new MyAdapter(this,ri1);
        String[] name1 = getResources().getStringArray(R.array.name1);
        String[] offer1 = getResources().getStringArray(R.array.offers1);
        String[] name2 = getResources().getStringArray(R.array.name2);
        String[] offer2 = getResources().getStringArray(R.array.offers2);
        adapter2 = new Adapter2(this, name1, offer1, name2, offer2, grid1, grid2);
        r2.setAdapter(adapter2);
        r2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        r1.setAdapter(adapter);
        r1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
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
        MenuItem myActionMenuItem=menu.findItem(R.id.search);
        final SearchView searchView=(SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)){
                }
                else{

                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.cart) {
            startActivity(new Intent(Dashboard.this,Cart.class));
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
            case R.id.nav_cart:
                intent = new Intent(Dashboard.this,Cart.class);
                startActivity(intent);
                break;
            case R.id.categories:
                intent = new Intent(Dashboard.this,Categories.class);
                startActivity(intent);
                break;
            case R.id.nav_offers:
                intent = new Intent(Dashboard.this,offers.class);
                startActivity(intent);
                break;
            case R.id.nav_wallet:
                break;
            case R.id.nav_share:
                intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"SHUT UP");
                intent.setType("text/plain");
                chooser = Intent.createChooser(intent,"Share VIA");
                startActivity(chooser);
                break;
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void offers(View view) {
        startActivity(new Intent(Dashboard.this,offers.class));
    }

    public void categories(View view) {
        startActivity(new Intent(Dashboard.this,Categories.class));
    }
}
