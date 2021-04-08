package com.skrb7f16.instagram.ui.notifications;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.skrb7f16.instagram.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        TextView textView=(TextView)root.findViewById(R.id.following_text);
        textView.setText(Html.fromHtml("<b>meow1, amanps22, buibui </b> and <b>2 others</b> started following you\t<small>1hr</small>"));
        textView=(TextView)root.findViewById(R.id.react_1);
        textView.setText(Html.fromHtml("<b>rishirocks111</b> reacted to your story \t&#128293\t<small>3hr</small>"));
        textView=(TextView)root.findViewById(R.id.react_2);
        textView.setText(Html.fromHtml("<b>nikhil2342</b> reacted to your story \t&#9829;\t<small>3hr</small>"));
        textView=(TextView)root.findViewById(R.id.react_3);
        textView.setText(Html.fromHtml("<b>momo22199</b> reacted to your story \t&#128522;\t<small>3hr</small>"));
        textView=(TextView)root.findViewById(R.id.comment_1);
        textView.setText(Html.fromHtml("<b>momo22199</b> commented on your post \"soooo cute &#9829;\" <small>5hr</small>"));
        textView=(TextView)root.findViewById(R.id.like_1);
        textView.setText(Html.fromHtml("<b>momo22199, buibui, bhawbhaw23</b> and <b>187 others </b> liked on your post  <small>1d</small>"));
        textView=(TextView)root.findViewById(R.id.like_2);
        textView.setText(Html.fromHtml("<b>momo22199, suisui, kuchbhi123</b> and <b>198 others </b> liked on your post  <small>1d</small>"));
        textView=(TextView)root.findViewById(R.id.like_3);
        textView.setText(Html.fromHtml("<b>momo22199, suisui, kuchbhi123</b> and <b>198 others </b> liked on your post  <small>1d</small>"));
        textView=(TextView)root.findViewById(R.id.like_4);
        textView.setText(Html.fromHtml("<b>momo22199, suisui, kuchbhi123</b> and <b>198 others </b> liked on your post  <small>1d</small>"));
        textView=(TextView)root.findViewById(R.id.follow_1);
        textView.setText(Html.fromHtml("<b>kuchikuchi</b> requested to follow you <small>2d</small>"));
        textView=(TextView)root.findViewById(R.id.follow_2);
        textView.setText(Html.fromHtml("<b>meowmeow12</b> requested to follow you <small>2d</small>"));
        return root;
    }
}