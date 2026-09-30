package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o.SaversKtExternalSyntheticLambda26;
import o.SaversKtExternalSyntheticLambda29;
import o.SaversKtExternalSyntheticLambda30;
import o.Savers_androidKtExternalSyntheticLambda6;
import o.applyConstraintsFromLayoutParams;
import o.getTargetWidget;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ResourceCacheKey implements SaversKtExternalSyntheticLambda26 {
    private static final getTargetWidget<Class<?>, byte[]> onExtraCallback = new getTargetWidget<>(50);
    private final SaversKtExternalSyntheticLambda30 IAuthTabCallbackDefault;
    private final SaversKtExternalSyntheticLambda26 IAuthTabCallbackStub;
    private final int asBinder;
    private final SaversKtExternalSyntheticLambda29<?> asInterface;
    private final Class<?> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final SaversKtExternalSyntheticLambda26 onTransact;
    private final Savers_androidKtExternalSyntheticLambda6 onWarmupCompleted;

    public ResourceCacheKey(Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda262, int i2, int i3, SaversKtExternalSyntheticLambda29<?> saversKtExternalSyntheticLambda29, Class<?> cls, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        this.onWarmupCompleted = savers_androidKtExternalSyntheticLambda6;
        this.onTransact = saversKtExternalSyntheticLambda26;
        this.IAuthTabCallbackStub = saversKtExternalSyntheticLambda262;
        this.asBinder = i2;
        this.onNavigationEvent = i3;
        this.asInterface = saversKtExternalSyntheticLambda29;
        this.onExtraCallbackWithResult = cls;
        this.IAuthTabCallbackDefault = saversKtExternalSyntheticLambda30;
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (!(obj instanceof ResourceCacheKey)) {
            return false;
        }
        ResourceCacheKey resourceCacheKey = (ResourceCacheKey) obj;
        return this.onNavigationEvent == resourceCacheKey.onNavigationEvent && this.asBinder == resourceCacheKey.asBinder && applyConstraintsFromLayoutParams.onExtraCallback(this.asInterface, resourceCacheKey.asInterface) && this.onExtraCallbackWithResult.equals(resourceCacheKey.onExtraCallbackWithResult) && this.onTransact.equals(resourceCacheKey.onTransact) && this.IAuthTabCallbackStub.equals(resourceCacheKey.IAuthTabCallbackStub) && this.IAuthTabCallbackDefault.equals(resourceCacheKey.IAuthTabCallbackDefault);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        int iHashCode = this.onTransact.hashCode();
        int iHashCode2 = (((((iHashCode * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.asBinder) * 31) + this.onNavigationEvent;
        SaversKtExternalSyntheticLambda29<?> saversKtExternalSyntheticLambda29 = this.asInterface;
        if (saversKtExternalSyntheticLambda29 != null) {
            iHashCode2 = (iHashCode2 * 31) + saversKtExternalSyntheticLambda29.hashCode();
        }
        return (((iHashCode2 * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode();
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.onWarmupCompleted.onNavigationEvent(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.asBinder).putInt(this.onNavigationEvent).array();
        this.IAuthTabCallbackStub.updateDiskCacheKey(messageDigest);
        this.onTransact.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        SaversKtExternalSyntheticLambda29<?> saversKtExternalSyntheticLambda29 = this.asInterface;
        if (saversKtExternalSyntheticLambda29 != null) {
            saversKtExternalSyntheticLambda29.updateDiskCacheKey(messageDigest);
        }
        this.IAuthTabCallbackDefault.updateDiskCacheKey(messageDigest);
        messageDigest.update(onExtraCallback());
        this.onWarmupCompleted.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
    }

    private byte[] onExtraCallback() {
        getTargetWidget<Class<?>, byte[]> gettargetwidget = onExtraCallback;
        byte[] bArrIAuthTabCallback = gettargetwidget.IAuthTabCallback(this.onExtraCallbackWithResult);
        if (bArrIAuthTabCallback != null) {
            return bArrIAuthTabCallback;
        }
        byte[] bytes = this.onExtraCallbackWithResult.getName().getBytes(SaversKtExternalSyntheticLambda26.IAuthTabCallback);
        gettargetwidget.onNavigationEvent(this.onExtraCallbackWithResult, bytes);
        return bytes;
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.onTransact + ", signature=" + this.IAuthTabCallbackStub + ", width=" + this.asBinder + ", height=" + this.onNavigationEvent + ", decodedResourceClass=" + this.onExtraCallbackWithResult + ", transformation='" + this.asInterface + "', options=" + this.IAuthTabCallbackDefault + '}';
    }
}
