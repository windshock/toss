package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putShortArray implements putFloatArray {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted;

    public putShortArray(@Nullable Object obj, @NotNull putIntArray putintarray, @Nullable String str) {
        Intrinsics.checkNotNullParameter(putintarray, "");
        this.onNavigationEvent = obj;
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(putintarray, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(str, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    @Override // o.putFloatArray
    public Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Object obj = this.onNavigationEvent;
        int i5 = i3 + 61;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return obj;
    }

    @Override // o.putFloatArray
    public putIntArray IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        putIntArray putintarrayAsInterface = asInterface();
        int i4 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return putintarrayAsInterface;
    }

    @Override // o.putFloatArray
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = asBinder();
        int i4 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zAsBinder;
    }

    @Override // o.putFloatArray
    public Float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Float fIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i3 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return fIAuthTabCallbackDefault;
    }

    @Override // o.putFloatArray
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull putIntArray putintarray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(putintarray, "");
        IAuthTabCallback(putintarray);
        int i4 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.putFloatArray
    public void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.putFloatArray
    public void IAuthTabCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(f);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    private final putIntArray asInterface() {
        putIntArray putintarray;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            putintarray = (putIntArray) this.IAuthTabCallback.onExtraCallbackWithResult();
            int i3 = 91 / 0;
        } else {
            putintarray = (putIntArray) this.IAuthTabCallback.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return putintarray;
    }

    private final void IAuthTabCallback(putIntArray putintarray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.IAuthTabCallback(putintarray);
        int i4 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
            int i3 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return zBooleanValue;
        }
        ((Boolean) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Float f = (Float) this.onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = IAuthTabCallbackDefault + 111;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.IAuthTabCallback(f);
        int i4 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onExtraCallback.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
