package com.skrb7f16.instagram;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.skrb7f16.instagram.ui.add.AddFragment;
import com.skrb7f16.instagram.ui.home.HomeFragment;
import com.skrb7f16.instagram.ui.notifications.NotificationsFragment;
import com.skrb7f16.instagram.ui.search.SearchFragment;
import com.skrb7f16.instagram.ui.user.UserFragment;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.navigation_home){
                    HomeFragment homeFragment=new HomeFragment();
                    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                    transaction.setReorderingAllowed(true);
                    transaction.replace(R.id.nav_host_fragment,homeFragment);
                    transaction.commit();
                }
                else if(item.getItemId()==R.id.navigation_search){
                    SearchFragment searchFragment=new SearchFragment();
                    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                    transaction.setReorderingAllowed(true);
                    transaction.replace(R.id.nav_host_fragment,searchFragment);
                    transaction.commit();
                }else if(item.getItemId()==R.id.navigation_user){
                    UserFragment userFragment=new UserFragment();
                    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                    transaction.setReorderingAllowed(true);
                    transaction.replace(R.id.nav_host_fragment,userFragment);
                    transaction.commit();
                }else if(item.getItemId()==R.id.navigation_notifications){
                    NotificationsFragment notificationsFragment=new NotificationsFragment();
                    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                    transaction.setReorderingAllowed(true);
                    transaction.replace(R.id.nav_host_fragment,notificationsFragment);
                    transaction.commit();
                }else if(item.getItemId()==R.id.navigation_add){
                    AddFragment addFragment=new AddFragment();
                    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                    transaction.setReorderingAllowed(true);
                    transaction.replace(R.id.nav_host_fragment,addFragment);
                    transaction.commit();
                }
                return true;
            }
        });
    }

}