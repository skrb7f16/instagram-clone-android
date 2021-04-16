package com.skrb7f16.instagram.adapters;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.skrb7f16.instagram.chats.chat.ChatFragment;
import com.skrb7f16.instagram.chats.rooms.RoomsFragment;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int behavior) {
        super(fm, behavior);
        myContext = context;
        this.totalTabs = behavior;
        Log.d("meow", "adapter ");
    }
    public MyAdapter(Context context,FragmentManager fm){
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                ChatFragment chatFragment=new ChatFragment();
                return chatFragment;
            case 1:
                RoomsFragment roomsFragment=new RoomsFragment();
                return roomsFragment;
            default:
                return new ChatFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0)title="Chats";
        else if(position==1)title="Group chats";
        return title;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
