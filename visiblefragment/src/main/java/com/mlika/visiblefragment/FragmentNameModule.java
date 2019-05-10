package com.mlika.visiblefragment;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.willowtreeapps.hyperion.plugin.v1.PluginModule;

import java.util.List;

public class FragmentNameModule extends PluginModule implements View.OnClickListener {


    @Nullable
    @Override
    public View createPluginView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.textview_view, parent, false);

        view.findViewById(R.id.mainView).setOnClickListener(this);
        return null;
    }

    @Override
    public void onClick(View v) {

        List<Fragment> list = (((FragmentActivity) getContext())).getSupportFragmentManager().getFragments();

        if (!list.isEmpty()) {

            Toast.makeText(getContext(), list.get(list.size() - 1)
                    .getClass().getName(), Toast.LENGTH_LONG).show();


        }
    }


}
