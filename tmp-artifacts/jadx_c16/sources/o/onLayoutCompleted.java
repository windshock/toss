package o;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.map.MapControlsView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onLayoutCompleted {
    private boolean extraCallback;
    private boolean getInterfaceDescriptor;
    private final MapControlsView onExtraCallbackWithResult;
    private final float onWarmupCompleted;
    private int onExtraCallback = 0;
    private boolean onNavigationEvent = true;
    private boolean IAuthTabCallback = true;
    private boolean IAuthTabCallbackStub = true;
    private boolean onTransact = true;
    private boolean asInterface = true;
    private float IAuthTabCallbackDefault = 0.088f;
    private float asBinder = 0.12375f;
    private float IAuthTabCallback_Parcel = 0.19333f;
    private boolean access000 = true;
    private boolean IAuthTabCallbackStubProxy = true;
    private boolean access100 = true;
    private boolean readTypedObject = true;
    private boolean ICustomTabsCallback = true;

    public onLayoutCompleted(@NonNull Context context, @Nullable MapControlsView mapControlsView) {
        this.onWarmupCompleted = context.getResources().getDisplayMetrics().density;
        this.onExtraCallbackWithResult = mapControlsView;
    }

    public int onNavigationEvent() {
        return this.onExtraCallback;
    }

    public void IAuthTabCallback(int i) {
        this.onExtraCallback = i;
    }

    public boolean IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    public void IAuthTabCallbackStub(boolean z) {
        this.onNavigationEvent = z;
    }

    public boolean getInterfaceDescriptor() {
        return this.IAuthTabCallback;
    }

    public void IAuthTabCallback_Parcel(boolean z) {
        this.IAuthTabCallback = z;
    }

    public boolean onTransact() {
        return this.IAuthTabCallbackStub;
    }

    public void onTransact(boolean z) {
        this.IAuthTabCallbackStub = z;
    }

    public boolean asInterface() {
        return this.onTransact;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.onTransact = z;
    }

    public boolean asBinder() {
        return this.asInterface;
    }

    public void IAuthTabCallbackDefault(boolean z) {
        this.asInterface = z;
    }

    public float onExtraCallbackWithResult() {
        return this.IAuthTabCallbackDefault;
    }

    public void onExtraCallback(float f) {
        this.IAuthTabCallbackDefault = f;
    }

    public float IAuthTabCallbackDefault() {
        return this.asBinder;
    }

    public void onWarmupCompleted(float f) {
        this.asBinder = f;
    }

    public float onWarmupCompleted() {
        return this.IAuthTabCallback_Parcel;
    }

    public void onNavigationEvent(float f) {
        this.IAuthTabCallback_Parcel = f;
    }

    public void onExtraCallback(boolean z) {
        this.access000 = z;
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.onWarmupCompleted(z);
        }
    }

    public void asInterface(boolean z) {
        this.IAuthTabCallbackStubProxy = z;
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.IAuthTabCallback(z);
        }
    }

    public void asBinder(boolean z) {
        this.access100 = z;
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.onNavigationEvent(z);
        }
    }

    public void IAuthTabCallback(boolean z) {
        this.getInterfaceDescriptor = z;
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.onExtraCallback(z);
        }
    }

    public void onWarmupCompleted(boolean z) {
        this.extraCallback = z;
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.onExtraCallbackWithResult(z);
        }
    }

    private void getInterfaceDescriptor(boolean z) {
        this.readTypedObject = z;
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.IAuthTabCallbackStub(z);
        }
    }

    public void onNavigationEvent(boolean z) {
        this.ICustomTabsCallback = z;
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.IAuthTabCallbackDefault(z);
        }
    }

    public int onExtraCallback() {
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            return mapControlsView.onExtraCallback();
        }
        return 0;
    }

    public void onWarmupCompleted(int i) {
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.onExtraCallbackWithResult(i);
        }
    }

    public int[] IAuthTabCallback() {
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            return mapControlsView.onExtraCallbackWithResult();
        }
        return new int[]{0, 0, 0, 0};
    }

    public void onExtraCallbackWithResult(int i, int i2, int i3, int i4) {
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.onExtraCallbackWithResult(i, i2, i3, i4);
        }
    }

    public void IAuthTabCallback(int i, int i2, int i3, int i4) {
        MapControlsView mapControlsView = this.onExtraCallbackWithResult;
        if (mapControlsView != null) {
            mapControlsView.setPadding(i, i2, i3, i4);
        }
    }

    public void onNavigationEvent(@NonNull isAutoMeasureEnabled isautomeasureenabled) {
        int iOnRelationshipValidationResult = isautomeasureenabled.onRelationshipValidationResult();
        if (iOnRelationshipValidationResult < 0) {
            iOnRelationshipValidationResult = Math.round(this.onWarmupCompleted * 2.0f);
        }
        IAuthTabCallback(iOnRelationshipValidationResult);
        IAuthTabCallbackStub(isautomeasureenabled.prefetchWithMultipleUrls());
        IAuthTabCallback_Parcel(isautomeasureenabled.access200());
        onTransact(isautomeasureenabled.ICustomTabsServiceDefault());
        onExtraCallbackWithResult(isautomeasureenabled.setEngagementSignalsCallback());
        IAuthTabCallbackDefault(isautomeasureenabled.receiveFile());
        onExtraCallback(isautomeasureenabled.ICustomTabsCallbackStub());
        onWarmupCompleted(isautomeasureenabled.mayLaunchUrl());
        onNavigationEvent(isautomeasureenabled.onUnminimized());
        onExtraCallback(isautomeasureenabled.isEngagementSignalsApiAvailable());
        asInterface(isautomeasureenabled.requestPostMessageChannelWithExtras());
        asBinder(isautomeasureenabled.updateVisuals());
        IAuthTabCallback(isautomeasureenabled.ICustomTabsCallback_Parcel());
        onWarmupCompleted(isautomeasureenabled.newAuthTabSession());
        getInterfaceDescriptor(isautomeasureenabled.onExtraCallbackWithResult());
        onNavigationEvent(isautomeasureenabled.newSessionWithExtras());
        int iOnActivityResized = isautomeasureenabled.onActivityResized();
        if (iOnActivityResized != 0) {
            onWarmupCompleted(iOnActivityResized);
        }
        int[] iArrOnMinimized = isautomeasureenabled.onMinimized();
        if (iArrOnMinimized != null) {
            onExtraCallbackWithResult(iArrOnMinimized[0], iArrOnMinimized[1], iArrOnMinimized[2], iArrOnMinimized[3]);
        }
    }

    public void onNavigationEvent(Bundle bundle) {
        bundle.putInt("UiSettings00", this.onExtraCallback);
        bundle.putBoolean("UiSettings01", this.onNavigationEvent);
        bundle.putBoolean("UiSettings02", this.IAuthTabCallback);
        bundle.putBoolean("UiSettings03", this.IAuthTabCallbackStub);
        bundle.putBoolean("UiSettings04", this.onTransact);
        bundle.putBoolean("UiSettings05", this.asInterface);
        bundle.putFloat("UiSettings06", this.IAuthTabCallbackDefault);
        bundle.putFloat("UiSettings07", this.asBinder);
        bundle.putFloat("UiSettings08", this.IAuthTabCallback_Parcel);
        bundle.putBoolean("UiSettings09", this.access000);
        bundle.putBoolean("UiSettings10", this.IAuthTabCallbackStubProxy);
        bundle.putBoolean("UiSettings11", this.access100);
        bundle.putBoolean("UiSettings12", this.getInterfaceDescriptor);
        bundle.putBoolean("UiSettings13", this.extraCallback);
        bundle.putBoolean("UiSettings14", this.readTypedObject);
        bundle.putBoolean("UiSettings15", this.ICustomTabsCallback);
        bundle.putInt("UiSettings16", onExtraCallback());
        bundle.putIntArray("UiSettings17", IAuthTabCallback());
    }

    public void onExtraCallback(Bundle bundle) {
        IAuthTabCallback(bundle.getInt("UiSettings00"));
        IAuthTabCallbackStub(bundle.getBoolean("UiSettings01"));
        IAuthTabCallback_Parcel(bundle.getBoolean("UiSettings02"));
        onTransact(bundle.getBoolean("UiSettings03"));
        onExtraCallbackWithResult(bundle.getBoolean("UiSettings04"));
        IAuthTabCallbackDefault(bundle.getBoolean("UiSettings05"));
        onExtraCallback(bundle.getFloat("UiSettings06"));
        onWarmupCompleted(bundle.getFloat("UiSettings07"));
        onNavigationEvent(bundle.getFloat("UiSettings08"));
        onExtraCallback(bundle.getBoolean("UiSettings09"));
        asInterface(bundle.getBoolean("UiSettings10"));
        asBinder(bundle.getBoolean("UiSettings11"));
        IAuthTabCallback(bundle.getBoolean("UiSettings12"));
        onWarmupCompleted(bundle.getBoolean("UiSettings13"));
        getInterfaceDescriptor(bundle.getBoolean("UiSettings14"));
        onNavigationEvent(bundle.getBoolean("UiSettings15"));
        onWarmupCompleted(bundle.getInt("UiSettings16"));
        int[] intArray = bundle.getIntArray("UiSettings17");
        if (intArray != null) {
            onExtraCallbackWithResult(intArray[0], intArray[1], intArray[2], intArray[3]);
        }
    }
}
