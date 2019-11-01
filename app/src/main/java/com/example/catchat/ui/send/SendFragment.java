package com.example.catchat.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.catchat.R;
import com.example.catchat.dagger.DaggerViewModelComponent;
import com.example.catchat.dagger.ViewModelComponent;
import com.example.catchat.dagger.ViewModelModule;

import javax.inject.Inject;

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