package o;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class replace {
    private static int asBinder = 1;
    private static int onTransact;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private long onNavigationEvent;
    private long onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i6));
        int i11 = ~(i7 | i9);
        int i12 = i3 | i11;
        int i13 = (~(i6 | i5)) | i11 | (~(i8 | i5));
        int i14 = i5 + i3 + i2 + (296844165 * i) + (1729652556 * i4);
        int i15 = i14 * i14;
        int i16 = ((i5 * 599922083) - 580124672) + (599922083 * i3) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i2) + ((-279707648) * i) + ((-265289728) * i4) + (2117271552 * i15);
        int i17 = (i5 * (-1181628991)) + 1322814002 + (i3 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i2 * (-1181629109)) + (i * (-698251017)) + (i4 * 1773125444) + (i15 * 938541056);
        return i16 + ((i17 * i17) * (-109772800)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public replace() {
        Boolean bool = Boolean.FALSE;
        this.IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(bool, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onNavigationEvent = setUseCaseAttached.Companion.IAuthTabCallback();
        this.onWarmupCompleted = ExtensionsManager1.Companion.onNavigationEvent();
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        int i3 = 61 / 0;
        return this.onNavigationEvent;
    }

    public final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = j;
        if (i3 == 0) {
            throw null;
        }
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i3 + 35;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = j;
        int i5 = i3 + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        int i4 = onTransact + 79;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        replace replaceVar = (replace) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        replaceVar.IAuthTabCallback.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.onExtraCallbackWithResult()).booleanValue();
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(z));
            int i3 = asBinder + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(Boolean.valueOf(z));
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        replace replaceVar = (replace) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) replaceVar.onExtraCallback.onExtraCallbackWithResult()).booleanValue();
        int i4 = asBinder + 89;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onTransact + 121;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(new Object[]{this}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1790639364, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1790639363, iOnExtraCallbackWithResult)).booleanValue();
    }

    public final void IAuthTabCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -2137797996, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 2137797996, iOnExtraCallbackWithResult);
    }
}
