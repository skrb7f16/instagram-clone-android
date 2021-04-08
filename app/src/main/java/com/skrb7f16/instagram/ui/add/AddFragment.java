package com.skrb7f16.instagram.ui.add;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.skrb7f16.instagram.R;
import com.skrb7f16.instagram.model.ImageModel;

public class AddFragment extends Fragment {

    String[] projection = {MediaStore.MediaColumns.DATA};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_add, container, false);
        return root;
    }

    public void getAllImages(){
        Cursor cursor = getActivity().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, null,null, null);
        while (cursor.moveToNext()) {
            String absolutePathOfImage = cursor.getString(cursor.getColumnIndex(MediaStore.MediaColumns.DATA));
            ImageModel ImageModel = new ImageModel();
            ImageModel.setImage(absolutePathOfImage);

        }
        cursor.close();
    }
}
