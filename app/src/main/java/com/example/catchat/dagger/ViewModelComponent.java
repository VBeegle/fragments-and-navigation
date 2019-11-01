package com.example.catchat.dagger;

import com.example.catchat.ui.drafts.DraftFragment;
import com.example.catchat.ui.messages.MessagesFragment;
import com.example.catchat.ui.send.SendFragment;
import com.example.catchat.ui.trash.TrashFragment;

import dagger.Component;

@Component(modules = {ViewModelModule.class})
public interface ViewModelComponent {

    void inject(DraftFragment fragment);

    void inject(SendFragment fragment);

    void inject(MessagesFragment fragment);

    void inject(TrashFragment fragment);

}
