package com.EBussines.dailybotani.ui.home;

//import androidx.lifecycle.LiveData;
//import androidx.lifecycle.MutableLiveData;
//import androidx.lifecycle.ViewModel;
//
//public class HomeViewModel extends ViewModel {
//
//    private MutableLiveData<String> mText;
//
//    public HomeViewModel() {
//        mText = new MutableLiveData<>();
//        mText.setValue("This is home fragment");
//    }
//
//    public LiveData<String> getText() {
//        return mText;
//    }
//}

public class HomeViewModel {
    public String gambarID;
    public int imageUrl;

    public int getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(int imageUrl){
        this.imageUrl = imageUrl;
    }

    public HomeViewModel(String gambarID, int imageUrl){
        this.gambarID = gambarID;
    }

    public String getGambarID(){
        return gambarID;
    }

    public void setGambarID(String gambarID){
        this.gambarID = gambarID;
    }


}