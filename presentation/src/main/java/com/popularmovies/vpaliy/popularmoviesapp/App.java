package com.popularmovies.vpaliy.popularmoviesapp;


import android.app.Application;
import android.support.annotation.NonNull;

import com.popularmovies.vpaliy.popularmoviesapp.di.component.ApplicationComponent;

/**
 * Application
 */
public class App extends Application {

    private ApplicationComponent applicationComponent;
    private static App INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeComponent();
        INSTANCE=this;
    }

    private void initializeComponent(){
       /* applicationComponent=DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .dataModule(new DataModule())
                .build();   */
    }

    @NonNull
    public static App appInstance(){
        return INSTANCE;
    }

    public ApplicationComponent appComponent(){
        return applicationComponent;
    }
}