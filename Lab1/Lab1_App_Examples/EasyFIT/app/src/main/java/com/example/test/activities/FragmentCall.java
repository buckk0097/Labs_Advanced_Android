package com.example.test.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.adapters.RecyclerViewAdapter;
import com.example.test.model.Contact;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;
import java.util.List;

public class FragmentCall extends Fragment {
    private LinearLayout bottomsheetlayout ;
    private BottomSheetBehavior bottomsheetbehavior ;
    private ImageView imgshare ;

    View v;

    public FragmentCall() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.call_fragment,container,false);

                                    // test this part
        bottomsheetlayout = (LinearLayout) v.findViewById(R.id.bottomsheet);
        imgshare = (ImageView) v.findViewById(R.id.shareimg);
        bottomsheetbehavior = BottomSheetBehavior.from(bottomsheetlayout);
              //// state hidden
         bottomsheetbehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
              //// state collapsed
        // bottomsheetbehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
              //// state expanded
       // bottomsheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                                    // end of test
        imgshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Bottomsheet
                bottomsheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        return v;
    }
}
