/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package abi43_0_0.host.exp.exponent.modules.api.netinfo;

import android.os.Build;
import abi43_0_0.com.facebook.react.bridge.Promise;
import abi43_0_0.com.facebook.react.bridge.ReactApplicationContext;
import abi43_0_0.com.facebook.react.bridge.ReactContextBaseJavaModule;
import abi43_0_0.com.facebook.react.bridge.ReactMethod;
import abi43_0_0.com.facebook.react.module.annotations.ReactModule;

/** Module that monitors and provides information about the connectivity state of the device. */
@ReactModule(name = NetInfoModule.NAME)
public class NetInfoModule extends ReactContextBaseJavaModule implements AmazonFireDeviceConnectivityPoller.ConnectivityChangedCallback {
    public static final String NAME = "RNCNetInfo";

    private final ConnectivityReceiver mConnectivityReceiver;
    private final AmazonFireDeviceConnectivityPoller mAmazonConnectivityChecker;

    public NetInfoModule(ReactApplicationContext reactContext) {
        super(reactContext);
        // Create the connectivity receiver based on the API level we are running on
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mConnectivityReceiver = new NetworkCallbackConnectivityReceiver(reactContext);
        } else {
            mConnectivityReceiver = new BroadcastReceiverConnectivityReceiver(reactContext);
        }

        mAmazonConnectivityChecker = new AmazonFireDeviceConnectivityPoller(reactContext, this);
    }

    @Override
    public void initialize() {
        mConnectivityReceiver.register();
        mAmazonConnectivityChecker.register();
    }

    @Override
    public void onCatalystInstanceDestroy() {
        mAmazonConnectivityChecker.unregister();
        mConnectivityReceiver.unregister();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getCurrentState(final String requestedInterface, final Promise promise) {
        mConnectivityReceiver.getCurrentState(requestedInterface, promise);
    }

    @Override
    public void onAmazonFireDeviceConnectivityChanged(boolean isConnected) {
        mConnectivityReceiver.setIsInternetReachableOverride(isConnected);
    }

    @ReactMethod
    public void addListener(String eventName) {
        // Keep: Required for RN built in Event Emitter Calls.
    }

    @ReactMethod
    public void removeListeners(Integer count) {
        // Keep: Required for RN built in Event Emitter Calls.
    }
}
