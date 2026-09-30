package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.containsJSONObjectContainingInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class valueExists implements tryToStringMap {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private final String IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final containsJSONObjectContainingInt.onExtraCallbackWithResult asInterface;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getTimebase onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent;
    private final int onTransact;
    private final getTimebase onWarmupCompleted;

    public valueExists(float f, int i, int i2, int i3, @NotNull containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onTransact = i2;
        this.asInterface = onextracallbackwithresult;
        this.IAuthTabCallbackDefault = z;
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = notifyPublicListeners.onWarmupCompleted(i);
        this.onExtraCallbackWithResult = notifyPublicListeners.onWarmupCompleted(i3);
        this.onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Float.valueOf(f), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.onTransact;
        int i6 = i3 + 61;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // o.tryToStringMap
    public containsJSONObjectContainingInt.onExtraCallbackWithResult onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 93;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult = this.asInterface;
        int i5 = i2 + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    @Override // o.tryToStringMap
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iCoerceAtMost = RangesKt.coerceAtMost(IAuthTabCallbackStub(), asBinder());
        int i4 = IAuthTabCallbackStub + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iCoerceAtMost;
    }

    @Override // o.tryToStringMap
    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = IAuthTabCallbackStub + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iIAuthTabCallbackDefault;
    }

    @Override // o.tryToStringMap
    public float IAuthTabCallback() {
        float fOnTransact;
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            fOnTransact = onTransact();
            int i3 = 58 / 0;
        } else {
            fOnTransact = onTransact();
        }
        int i4 = IAuthTabCallbackStub + 27;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.tryToStringMap
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAsInterface = asInterface();
        int i3 = asBinder + 39;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return zAsInterface;
    }

    public void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(f);
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(i);
        int i5 = IAuthTabCallbackStub + 1;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.tryToStringMap
    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(z);
        int i4 = IAuthTabCallbackStub + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        int i4 = asBinder + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    private final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted.onExtraCallback(i);
        int i5 = asBinder + 57;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
            return this.onExtraCallbackWithResult.onWarmupCompleted();
        }
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 77;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.onExtraCallbackWithResult.onExtraCallback(i);
            int i4 = IAuthTabCallbackStub + 63;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.onExtraCallbackWithResult.onExtraCallback(i);
        throw null;
    }

    private final float onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return ((Number) this.onNavigationEvent.onExtraCallbackWithResult()).floatValue();
        }
        ((Number) this.onNavigationEvent.onExtraCallbackWithResult()).floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.IAuthTabCallback(Float.valueOf(f));
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(Float.valueOf(f));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
            return ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
        }
        return ((Boolean) this.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = asBinder + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }
}
