package com.example.catchat.ui.drafts;

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

public class DraftFragment extends Fragment {

    @Inject
    DraftViewModel draftViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_draft, container, false);

        ViewModelComponent component = DaggerViewModelComponent.builder()
                                            .viewModelModule(new ViewModelModule(getString(R.string.title_draft)))
                                            .build();

        component.inject(this);

        final TextView textView = root.findViewById(R.id.text_draft);
        textView.setText(draftViewModel.getText());

        return root;
    }
}