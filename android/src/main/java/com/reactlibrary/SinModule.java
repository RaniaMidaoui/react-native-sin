package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class SinModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public SinModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Sin";
    }

    @ReactMethod
    public void Sinuss(double a, Callback callback) {
        Sinus sample = new Sinus();
        double msg = sample.SinC((double )a);
        callback.invoke( msg );
    }
}
