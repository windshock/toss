package o;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda59 implements SaversKtExternalSyntheticLambda26 {
    private final int IAuthTabCallbackDefault;
    private final SaversKtExternalSyntheticLambda26 IAuthTabCallbackStub;
    private final Class<?> asBinder;
    private final Class<?> asInterface;
    private final SaversKtExternalSyntheticLambda30 onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> onTransact;
    private int onWarmupCompleted;

    SaversKtExternalSyntheticLambda59(Object obj, SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, int i2, int i3, Map<Class<?>, SaversKtExternalSyntheticLambda29<?>> map, Class<?> cls, Class<?> cls2, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        this.onExtraCallbackWithResult = markHierarchyDirty.onExtraCallbackWithResult(obj);
        this.IAuthTabCallbackStub = (SaversKtExternalSyntheticLambda26) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda26, "Signature must not be null");
        this.IAuthTabCallbackDefault = i2;
        this.onNavigationEvent = i3;
        this.onTransact = (Map) markHierarchyDirty.onExtraCallbackWithResult(map);
        this.asBinder = (Class) markHierarchyDirty.onExtraCallbackWithResult(cls, "Resource class must not be null");
        this.asInterface = (Class) markHierarchyDirty.onExtraCallbackWithResult(cls2, "Transcode class must not be null");
        this.onExtraCallback = (SaversKtExternalSyntheticLambda30) markHierarchyDirty.onExtraCallbackWithResult(saversKtExternalSyntheticLambda30);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public boolean equals(Object obj) {
        if (!(obj instanceof SaversKtExternalSyntheticLambda59)) {
            return false;
        }
        SaversKtExternalSyntheticLambda59 saversKtExternalSyntheticLambda59 = (SaversKtExternalSyntheticLambda59) obj;
        return this.onExtraCallbackWithResult.equals(saversKtExternalSyntheticLambda59.onExtraCallbackWithResult) && this.IAuthTabCallbackStub.equals(saversKtExternalSyntheticLambda59.IAuthTabCallbackStub) && this.onNavigationEvent == saversKtExternalSyntheticLambda59.onNavigationEvent && this.IAuthTabCallbackDefault == saversKtExternalSyntheticLambda59.IAuthTabCallbackDefault && this.onTransact.equals(saversKtExternalSyntheticLambda59.onTransact) && this.asBinder.equals(saversKtExternalSyntheticLambda59.asBinder) && this.asInterface.equals(saversKtExternalSyntheticLambda59.asInterface) && this.onExtraCallback.equals(saversKtExternalSyntheticLambda59.onExtraCallback);
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public int hashCode() {
        if (this.onWarmupCompleted == 0) {
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            this.onWarmupCompleted = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.IAuthTabCallbackDefault) * 31) + this.onNavigationEvent;
            this.onWarmupCompleted = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.onTransact.hashCode();
            this.onWarmupCompleted = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.asBinder.hashCode();
            this.onWarmupCompleted = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.asInterface.hashCode();
            this.onWarmupCompleted = iHashCode5;
            this.onWarmupCompleted = (iHashCode5 * 31) + this.onExtraCallback.hashCode();
        }
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "EngineKey{model=" + this.onExtraCallbackWithResult + ", width=" + this.IAuthTabCallbackDefault + ", height=" + this.onNavigationEvent + ", resourceClass=" + this.asBinder + ", transcodeClass=" + this.asInterface + ", signature=" + this.IAuthTabCallbackStub + ", hashCode=" + this.onWarmupCompleted + ", transformations=" + this.onTransact + ", options=" + this.onExtraCallback + '}';
    }

    @Override // o.SaversKtExternalSyntheticLambda26
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
