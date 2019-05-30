package com.santander.integration.modulea;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.santander.integration.core.IActivity;
import com.santander.integration.core.ICoreA;
import com.santander.integration.core.IFragmentA;

public class FragmentA1 extends Fragment implements IFragmentA {

    private ICoreA core;
    private IActivity activity;

    private static MyComponent component;

    @Override
    public void onAttach(final Context context) {

        super.onAttach(context);
        activity = (IActivity) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        component = DaggerMyComponent.builder()
                .contextModule(new ContextModule(requireActivity()))
                .build();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmenta1, container, false);
        Button button = view.findViewById(R.id.button);
        final EditText textView = view.findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dialog", "Enable MyAccounts");
                activity.showText(textView.getText().toString());
                if(core != null){
                    core.setText(textView.getText().toString());
                }
            }
        });

        return view;

    }

    public void setCore(ICoreA core){
        this.core = core;
    }

    public static MyComponent getMyComponent() {
        return component;
    }

}
