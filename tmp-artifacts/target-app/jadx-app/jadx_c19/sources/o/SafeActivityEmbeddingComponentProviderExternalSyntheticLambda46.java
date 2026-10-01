package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.appsintoss.R;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46;
import o.roundUpToNearestHalfInt;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46 {
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46 IAuthTabCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault;
    private static getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static char[] access100;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
    private static long getInterfaceDescriptor;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static final byte[] $$a = {98, -3, -80, -4};
    private static final int $$b = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;

    private static String $$c(int i2, int i3, short s) {
        int i4 = (s * 3) + 97;
        byte[] bArr = $$a;
        int i5 = i2 * 4;
        int i6 = 4 - (i3 * 4);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i4 = i6 + (-i4);
            i6++;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            int i9 = i4;
            int i10 = i6 + 1;
            i4 = i9 + (-bArr[i6]);
            i6 = i10;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        roundUpToNearestHalfInt rounduptonearesthalfint = (roundUpToNearestHalfInt) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = access000 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i5 = IAuthTabCallbackStubProxy + 7;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = access000 + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i4 != 0) {
            int i5 = 29 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 96 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy;
        int i4 = i3 + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i6 = i3 + 45;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 95 / 0;
        }
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = access000 + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = access000 + 25;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStubProxy + 3;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Object onNavigationEvent(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (~((~i6) | i7)) | (~(i7 | i2));
        int i9 = (~i7) | (~i2);
        int i10 = i8 | (~(i9 | i6));
        int i11 = (~i9) | i6;
        int i12 = ~(i2 | i6);
        int i13 = i6 + i7 + i4 + ((-417414852) * i5) + (1247522396 * i3);
        int i14 = i13 * i13;
        int i15 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i7) + (825712212 * i10) + ((-1651424424) * i11) + ((-825712212) * i12) + ((-2045509632) * i4) + ((-2135949312) * i5) + ((-953155584) * i3) + ((-430374912) * i14);
        int i16 = ((i6 * 184508743) - 476012450) + (i7 * 184508743) + (i10 * (-996)) + (i11 * 1992) + (i12 * 996) + (i4 * 184509739) + (i5 * (-953474796)) + (i3 * (-288057996)) + (i14 * (-839712768));
        int i17 = i15 + (i16 * i16 * 1709113344);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 109;
        int i4 = i3 % 128;
        access000 = i4;
        int i5 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i6 = i4 + 77;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStubProxy + 69;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 55;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallbackDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackStubProxy + 17;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i2 = 2 % 2;
        int i3 = access000 + 119;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        if (i3 % 2 != 0) {
            getbacktracenote = onExtraCallbackWithResult;
            int i5 = 2 / 0;
        } else {
            getbacktracenote = onExtraCallbackWithResult;
        }
        int i6 = i4 + 57;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = access000 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 97;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAccess100 = access100(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access000 + 55;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return unitAccess100;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i6 = i3 + 81;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 125;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i2 = 2 % 2;
        int i3 = access000 + 81;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        if (i3 % 2 != 0) {
            getbacktracenote = onTransact;
            int i5 = 2 / 0;
        } else {
            getbacktracenote = onTransact;
        }
        int i6 = i4 + 11;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return getbacktracenote;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 95;
        int i4 = i3 % 128;
        access000 = i4;
        int i5 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = asInterface;
        int i6 = i4 + 49;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            function2 = onExtraCallback;
            int i5 = 53 / 0;
        } else {
            function2 = onExtraCallback;
        }
        int i6 = i3 + 65;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    public final getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 53;
        int i4 = i3 % 128;
        access000 = i4;
        int i5 = i3 % 2;
        getBacktraceNote<roundUpToNearestHalfInt, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackStub;
        int i6 = i4 + 29;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onTransact();
        IAuthTabCallback = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46();
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(1674163873, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {(roundUpToNearestHalfInt) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1923368270, -1923368270);
                int i5 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        });
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(9825192, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i4 != 0) {
                    return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onExtraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onExtraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
        });
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-2118838575, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i4 != 0) {
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onWarmupCompleted(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onWarmupCompleted(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i5 = onExtraCallback + 105;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        });
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(219981808, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {(w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                if (i4 != 0) {
                    unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 890113349, -890113345);
                    int i5 = 77 / 0;
                } else {
                    unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 890113349, -890113345);
                }
                int i6 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 84 / 0;
                }
                return unit;
            }
        });
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1265527530, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 23;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onNavigationEvent((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onExtraCallback + 117;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1073292853, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnTransact = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onTransact((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onExtraCallbackWithResult + 95;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnTransact;
                }
                throw null;
            }
        });
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(1948480716, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object obj4 = null;
                w5a w5aVar = (w5a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i4 != 0) {
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onExtraCallbackWithResult(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i5 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj4.hashCode();
                throw null;
            }
        });
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(2008625959, false, new Function2() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 71;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i5 = IAuthTabCallback + 73;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-741534001, false, new Function2() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i4 != 0) {
                    return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                }
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        int i2 = ICustomTabsCallback + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = IAuthTabCallbackStubProxy + 125;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = access000 + 39;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i9 = IAuthTabCallbackStubProxy + 69;
            access000 = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1674163873, i3, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$1674163873.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:77)");
                int i10 = IAuthTabCallbackStubProxy + 13;
                access000 = i10 % 128;
                int i11 = i10 % 2;
            }
            rounduptonearesthalfint.asInterface(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_disclaimer, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, (handshake) null, 0, 0.0f, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResult, 234881024 & (i3 << 24), 254);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            int i4 = IAuthTabCallbackStubProxy + 53;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i2 & 19) != 18) {
            int i5 = IAuthTabCallbackStubProxy + 19;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(9825192, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$9825192.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:85)");
            }
            w5aVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_purchase_date_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStubProxy + 57;
        access000 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 51 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i3) {
                break;
            }
            int i5 = $10 + 71;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(access100[i2 + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 59697), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(getInterfaceDescriptor), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 46135), 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 20220 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49123), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, 1494 - KeyEvent.getDeadChar(0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $10 + 91;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char cIndexOf = (char) (49123 - TextUtils.indexOf("", ""));
                int iMyTid = 44 - (Process.myTid() >> 22);
                int packedPositionType = ExpandableListView.getPackedPositionType(j) + 1494;
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iMyTid, packedPositionType, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            j = 0;
        }
        String str = new String(cArr);
        int i10 = $11 + 3;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static final Unit access100(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i2 & 19) != 18) {
            int i4 = IAuthTabCallbackStubProxy + 35;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = access000 + 55;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 5;
            }
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2118838575, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$-2118838575.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:100)");
            }
            w5aVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_order_id_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackStubProxy + 3;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = access000 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i2 & 40) == 0) {
                int i5 = access000 + 33;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
                int i7 = IAuthTabCallbackStubProxy + 13;
                access000 = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i2 & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i9 = access000 + 95;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(219981808, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$219981808.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:115)");
            }
            w5aVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_purchase_state_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        Object obj = null;
        if ((i2 & 6) == 0) {
            int i4 = access000 + 51;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = access000 + 13;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1265527530, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$-1265527530.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:135)");
            }
            w5aVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_cash_receipt, cameraCaptureResultEmptyCameraCaptureResult, 0), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStubProxy + 95;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = IAuthTabCallbackStubProxy + 103;
                access000 = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = access000 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        boolean z = true;
        if ((i2 & 6) == 0) {
            int i7 = IAuthTabCallbackStubProxy + 95;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i3 = 2;
            } else {
                int i9 = access000 + 9;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                i3 = 4;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i11 = IAuthTabCallbackStubProxy + 21;
            access000 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = access000 + 101;
                IAuthTabCallbackStubProxy = i13 % 128;
                if (i13 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1073292853, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$1073292853.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:161)");
                    int i14 = 0 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1073292853, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$1073292853.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:161)");
                }
            }
            w5aVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_subscribe_refund_label, cameraCaptureResultEmptyCameraCaptureResult, 0), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i15 = IAuthTabCallbackStubProxy + 21;
                access000 = i15 % 128;
                int i16 = i15 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            int i4 = access000 + 31;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            i2 |= !(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ^ true) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = IAuthTabCallbackStubProxy + 69;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1948480716, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$1948480716.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:179)");
                }
                w5aVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_date_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w5aVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_date_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackStubProxy + 91;
        access000 = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = access000 + 69;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = access000 + 25;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackStubProxy + 49;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2008625959, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$2008625959.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:199)");
                int i10 = access000 + 49;
                IAuthTabCallbackStubProxy = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 % 3;
                }
            }
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getDoubleTapTimeout() >> 16, TextUtils.indexOf((CharSequence) "", '0') + 12, (char) TextUtils.getCapsMode("", 0, 0), objArr);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.IAuthTabCallback(null, ((String) objArr[0]).intern(), "440원", "282719", "2026-02-11T01:09:43", null, true, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 1797552, 897);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = IAuthTabCallbackStubProxy + 55;
                access000 = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i14 = access000 + 93;
                IAuthTabCallbackStubProxy = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = IAuthTabCallbackStubProxy + 125;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = IAuthTabCallbackStubProxy + 23;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-741534001, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchaseHandledSubscriptionContentKt.lambda$-741534001.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:214)");
            }
            Object[] objArr = new Object[1];
            a(KeyEvent.normalizeMetaState(0), 11 - View.MeasureSpec.getMode(0), (char) TextUtils.getOffsetAfter("", 0), objArr);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.IAuthTabCallback(null, ((String) objArr[0]).intern(), "440원", "282719", "2026-02-11T01:09:43", "2026-02-12T10:30:00", false, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 1797552, 897);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackStubProxy + 13;
                access000 = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = 33 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 890113349, -890113345);
    }

    public static /* synthetic */ Unit onNavigationEvent(roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1923368270, -1923368270);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        return (getBacktraceNote) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1067672929, 1067672930);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        return (getBacktraceNote) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 236736954, -236736952);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        return (getBacktraceNote) onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -608548782, 608548785);
    }

    static void onTransact() {
        access100 = new char[]{60861, 33722, 12704, 42939, 21927, 52135, 31158, 61361, 40378, 13239, 41404};
        getInterfaceDescriptor = 5926133488036185044L;
    }
}
