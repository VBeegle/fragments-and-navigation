package com.example.catchat.ui.messages;

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

public class MessagesFragment extends Fragment {

    @Inject
    MessagesViewModel messagesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_messages, container, false);

        ViewModelComponent component = DaggerViewModelComponent.builder()
                .viewModelModule(new ViewModelModule(getString(R.string.title_messages)))
                .build();

        component.inject(this);

        final TextView textView = root.findViewById(R.id.text_messages);
        textView.setText(messagesViewModel.getText());

        return root;
    }
}