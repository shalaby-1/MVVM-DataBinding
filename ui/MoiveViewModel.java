package com.example.mvp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvp.pojo.MoiveModel;

/**
 * 1 - gets data from database / model
 * 2- just notifiy that the data is ready for the view through
 * a parameter contain live data
 * view can observe this data
 */
public class MoiveViewModel extends ViewModel {

    LiveData<String> moiveNameLiveData; // can not be set manully
    public MutableLiveData<String> moiveNameMutableLiveData = new MutableLiveData<>(); // can be Set

    // used by view to get the data from view model
    // sets the value of mutablelivedata to the data
    public void getMoiveName(){
        String moiveName = getMovieFromDatabase().getName();
        moiveNameMutableLiveData.setValue(moiveName);
    }

    // get data from database to view model
    private MoiveModel getMovieFromDatabase() {
        return new MoiveModel("hollow man", "a horror moive", "horror", 9.5);
    }
}
