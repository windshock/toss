package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;
import o.SaversKtExternalSyntheticLambda21;
import o.SaversKtExternalSyntheticLambda26;
import o.SaversKtExternalSyntheticLambda35;
import o.SaversKtExternalSyntheticLambda52;
import o.SaversKtExternalSyntheticLambda53;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ResourceCacheGenerator implements SaversKtExternalSyntheticLambda53, SaversKtExternalSyntheticLambda35.onNavigationEvent<Object> {
    private ResourceCacheKey IAuthTabCallback;
    private SaversKtExternalSyntheticLambda26 IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int asBinder;
    private int asInterface = -1;
    private File onExtraCallback;
    private final SaversKtExternalSyntheticLambda52<?> onExtraCallbackWithResult;
    private volatile ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onNavigationEvent;
    private List<ShaderBrushSpanExternalSyntheticLambda0<File, ?>> onTransact;
    private final SaversKtExternalSyntheticLambda53.onExtraCallback onWarmupCompleted;

    public ResourceCacheGenerator(SaversKtExternalSyntheticLambda52<?> saversKtExternalSyntheticLambda52, SaversKtExternalSyntheticLambda53.onExtraCallback onextracallback) {
        this.onExtraCallbackWithResult = saversKtExternalSyntheticLambda52;
        this.onWarmupCompleted = onextracallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda53
    public boolean onNavigationEvent() {
        List<SaversKtExternalSyntheticLambda26> listOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
        boolean z = false;
        if (listOnNavigationEvent.isEmpty()) {
            return false;
        }
        List<Class<?>> interfaceDescriptor = this.onExtraCallbackWithResult.getInterfaceDescriptor();
        if (interfaceDescriptor.isEmpty()) {
            if (File.class.equals(this.onExtraCallbackWithResult.IAuthTabCallback_Parcel())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.onExtraCallbackWithResult.asBinder() + " to " + this.onExtraCallbackWithResult.IAuthTabCallback_Parcel());
        }
        while (true) {
            if (this.onTransact == null || !onExtraCallbackWithResult()) {
                int i2 = this.asInterface + 1;
                this.asInterface = i2;
                if (i2 >= interfaceDescriptor.size()) {
                    int i3 = this.asBinder + 1;
                    this.asBinder = i3;
                    if (i3 >= listOnNavigationEvent.size()) {
                        return false;
                    }
                    this.asInterface = 0;
                }
                SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26 = listOnNavigationEvent.get(this.asBinder);
                Class<?> cls = interfaceDescriptor.get(this.asInterface);
                this.IAuthTabCallback = new ResourceCacheKey(this.onExtraCallbackWithResult.onExtraCallbackWithResult(), saversKtExternalSyntheticLambda26, this.onExtraCallbackWithResult.access100(), this.onExtraCallbackWithResult.access000(), this.onExtraCallbackWithResult.IAuthTabCallbackStub(), this.onExtraCallbackWithResult.onWarmupCompleted((Class) cls), cls, this.onExtraCallbackWithResult.onTransact());
                File fileIAuthTabCallback = this.onExtraCallbackWithResult.onWarmupCompleted().IAuthTabCallback(this.IAuthTabCallback);
                this.onExtraCallback = fileIAuthTabCallback;
                if (fileIAuthTabCallback != null) {
                    this.IAuthTabCallbackDefault = saversKtExternalSyntheticLambda26;
                    this.onTransact = this.onExtraCallbackWithResult.onExtraCallbackWithResult(fileIAuthTabCallback);
                    this.IAuthTabCallbackStub = 0;
                }
            } else {
                this.onNavigationEvent = null;
                while (!z && onExtraCallbackWithResult()) {
                    List<ShaderBrushSpanExternalSyntheticLambda0<File, ?>> list = this.onTransact;
                    int i4 = this.IAuthTabCallbackStub;
                    this.IAuthTabCallbackStub = i4 + 1;
                    this.onNavigationEvent = list.get(i4).onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult.access000(), this.onExtraCallbackWithResult.IAuthTabCallbackStub(), this.onExtraCallbackWithResult.onTransact());
                    if (this.onNavigationEvent != null && this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.onNavigationEvent.onExtraCallback.onNavigationEvent())) {
                        this.onNavigationEvent.onExtraCallback.onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallbackDefault(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    private boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub < this.onTransact.size();
    }

    @Override // o.SaversKtExternalSyntheticLambda53
    public void IAuthTabCallback() {
        ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<?> onextracallbackwithresult = this.onNavigationEvent;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onExtraCallback.onExtraCallbackWithResult();
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
    public void onExtraCallback(Object obj) {
        this.onWarmupCompleted.onExtraCallback(this.IAuthTabCallbackDefault, obj, this.onNavigationEvent.onExtraCallback, SaversKtExternalSyntheticLambda21.RESOURCE_DISK_CACHE, this.IAuthTabCallback);
    }

    @Override // o.SaversKtExternalSyntheticLambda35.onNavigationEvent
    public void onExtraCallback(@NonNull Exception exc) {
        this.onWarmupCompleted.onWarmupCompleted(this.IAuthTabCallback, exc, this.onNavigationEvent.onExtraCallback, SaversKtExternalSyntheticLambda21.RESOURCE_DISK_CACHE);
    }
}
