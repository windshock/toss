package o;

import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y5b {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 1;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long IAuthTabCallback_Parcel;
    private final long access000;
    private final long access100;
    private final long asBinder;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ y5b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9;
        int i11 = (~((~i3) | i7 | i5)) | (~(i8 | i6));
        int i12 = i6 + i5 + i2 + (531708263 * i4) + ((-608630064) * i);
        int i13 = i12 * i12;
        int i14 = (i6 * (-228234701)) + 730857472 + ((-228234701) * i5) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i2) + ((-45088768) * i4) + ((-419430400) * i) + ((-1471938560) * i13);
        int i15 = ((i6 * (-1679524527)) - 150938974) + (i5 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i2 * (-1679524245)) + (i4 * (-166744051)) + (i * 2062148848) + (i13 * (-865337344));
        if (i14 + (i15 * i15 * (-1617166336)) != 1) {
            return onExtraCallbackWithResult(objArr);
        }
        y5b y5bVar = (y5b) objArr[0];
        int i16 = 2 % 2;
        int i17 = IAuthTabCallbackStubProxy + 5;
        int i18 = i17 % 128;
        getInterfaceDescriptor = i18;
        int i19 = i17 % 2;
        long j = y5bVar.IAuthTabCallbackDefault;
        int i20 = i18 + 27;
        IAuthTabCallbackStubProxy = i20 % 128;
        int i21 = i20 % 2;
        return Long.valueOf(j);
    }

    private y5b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.onNavigationEvent = j;
        this.onExtraCallback = j2;
        this.onWarmupCompleted = j3;
        this.IAuthTabCallback = j4;
        this.onExtraCallbackWithResult = j5;
        this.onTransact = j6;
        this.IAuthTabCallbackStub = j7;
        this.IAuthTabCallbackDefault = j8;
        this.asBinder = j9;
        this.asInterface = j10;
        this.IAuthTabCallback_Parcel = j11;
        this.access000 = j12;
        this.access100 = j13;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 89;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.onExtraCallback;
        int i4 = i3 + 123;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        y5b y5bVar = (y5b) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = y5bVar.onWarmupCompleted;
        int i5 = i3 + 111;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        int i3 = 10 / 0;
        return this.IAuthTabCallback;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i3 + 19;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 45;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onTransact;
        int i5 = i2 + 95;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 49;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallbackStub;
        int i5 = i2 + 93;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        long j = this.asBinder;
        int i5 = i3 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asInterface;
        }
        int i3 = 24 / 0;
        return this.asInterface;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long access000() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        long j = this.access000;
        int i5 = i3 + 57;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        long j = this.access100;
        int i5 = i3 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Long) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3, -1580134568, 1580134568)).longValue();
    }

    public final long asInterface() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Long) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3, -1359263887, 1359263888)).longValue();
    }
}
