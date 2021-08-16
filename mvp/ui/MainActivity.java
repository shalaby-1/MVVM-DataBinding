package com.example.mvp.ui;

import static com.example.mvp.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.mvp.R;
import com.example.mvp.databinding.ActivityMainBinding;
import com.example.mvp.pojo.MoiveModel;
// model --> view model --> view
/** view asks view model about the data
 *  view model gets the data from model / database
 *  view model sets the value of mutablelivedata to the data
 *  view model notifies that the data has changed
 *  view listens for the changes in mutablelivedata and get the value of it
 */

public class MainActivity extends AppCompatActivity  {


    MoiveViewModel moiveViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // to know the layout name for the data binding class
        // single word can have access to all xml views
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // view asks view model about data
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moiveViewModel.getMoiveName();
            }
        });

//        /**
//         * this : refers to current view which listens for live data
//         * view model : is MoiveViewModel
//         */
//        moiveViewModel = ViewModelProviders.of(this).get(MoiveViewModel.class);
//        moiveViewModel.moiveNameMutableLiveData.observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                // when there is a change in the data do this
//                binding.textView.setText(s);
//            }
//        });
        binding.setViewModel(moiveViewModel);
        binding.setLifecycleOwner(this);

    }

}