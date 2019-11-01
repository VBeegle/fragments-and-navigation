package com.example.catchat.dagger;

import com.example.catchat.ui.drafts.DraftViewModel;
import com.example.catchat.ui.messages.MessagesViewModel;
import com.example.catchat.ui.send.SendViewModel;
import com.example.catchat.ui.trash.TrashViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewModelModule {

    private String mText;

    public ViewModelModule(String text){
        mText = text;
    }

    @Provides
    DraftViewModel provideDraftViewModel(){
        return new DraftViewModel(mText);
    }

    @Provides
    SendViewModel provideSendViewModel(){
        return new SendViewModel(mText);
    }

    @Provides
    TrashViewModel provideTrashViewModel(){
        return new TrashViewModel(mText);
    }

    @Provides
    MessagesViewModel provideMessagesViewModel(){
        return new MessagesViewModel(mText);
    }
}
