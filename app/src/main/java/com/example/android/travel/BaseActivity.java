package com.example.android.travel;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import static android.widget.Toast.makeText;


public class BaseActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    protected DrawerLayout drawerLayout;
    protected Toolbar toolbar;
    //private ListView listView;
    //private String string[];
    protected ActionBarDrawerToggle drawerListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        toolbar=(Toolbar)findViewById(R.id.nav_action_bar);
        setSupportActionBar(toolbar);
        drawerListener=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.setDrawerListener(drawerListener);
        drawerListener.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
       // listView=(ListView)findViewById(R.id.drawerList);
        //string=getResources().getStringArray(R.array.List);
        //listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,string));
      //  listView.setOnItemClickListener(this);



    }

//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent i=new Intent(BaseActivity.this,getClass(position));
//        startActivity(i);
//
//    }
//    public Class getClass(int position) {
//        if (position == 0)
//            return MonumentsActivity.class;
//        else if (position == 1)
//            return RestaurantsActivity.class;
//        else
//            return MallsActivity.class;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(drawerListener.onOptionsItemSelected(item))
//            return true;
//        return super.onOptionsItemSelected(item);
//    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent i;
        if(id==R.id.nav_home)
        {
            i=new Intent(BaseActivity.this,BaseActivity.class);
            startActivity(i);
        }
        else if (id == R.id.nav_mon) {
            i=new Intent(BaseActivity.this,MonumentsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_mall) {
            i=new Intent(BaseActivity.this,MallsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_res) {
            i=new Intent(BaseActivity.this,RestaurantsActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    protected void replaceContentLayout(int sourceId, int destinationId) {
        View contentLayout = findViewById(destinationId);

        ViewGroup parent = (ViewGroup) contentLayout.getParent();
        int index = parent.indexOfChild(contentLayout);

        parent.removeView(contentLayout);
        contentLayout = getLayoutInflater().inflate(sourceId, parent, false);
        parent.addView(contentLayout, index);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.settings, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
