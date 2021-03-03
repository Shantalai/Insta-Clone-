package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("f9uAYa341hVWpUNBQvTCNKPCH8qZvLwwDXNrYVlX")
                .clientKey("SPudRdZRtoHDCEhRJajnB6nCISKPFbzsCg0wQajO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
