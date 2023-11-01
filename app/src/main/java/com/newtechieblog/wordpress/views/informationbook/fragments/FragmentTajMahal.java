package com.newtechieblog.wordpress.views.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.newtechieblog.wordpress.views.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentTajMahal extends Fragment {
    public static FragmentTajMahal newInstance() {
        return new FragmentTajMahal();
    }

    private ImageView imageViewTajMahal;
    private ProgressBar progressBarTajMahal;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taj_mahal, container, false);

        imageViewTajMahal = view.findViewById(R.id.imageViewTajMahal);
        progressBarTajMahal = view.findViewById(R.id.progressBarTajMahal);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/" +
                        "Taj-Mahal.jpg/1024px-Taj-Mahal.jpg")
                .into(imageViewTajMahal, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarTajMahal.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                        progressBarTajMahal.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
