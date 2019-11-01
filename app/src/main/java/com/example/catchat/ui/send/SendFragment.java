package com.example.catchat.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.catchat.R;
import com.example.catchat.ui.dagger.DaggerViewModelComponent;
import com.example.catchat.ui.dagger.ViewModelComponent;
import com.example.catchat.ui.dagger.ViewModelModule;

import javax.inject.Inject;

import dagger.Provides;

public class SendFragment extends Fragment {

    @Inject
    SendViewModel sendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_send, container, false);

        ViewModelComponent component = DaggerViewModelComponent.builder()
                .viewModelModule(new ViewModelModule(getString(R.string.title_sent_messages)))
                .build();

        component.inject(this);

        final TextView textView = root.findViewById(R.id.text_send);
        textView.setText(sendViewModel.getText());

        return root;
    }
}