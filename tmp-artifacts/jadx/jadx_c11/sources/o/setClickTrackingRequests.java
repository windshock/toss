package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSwitchMinWidth;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.setByteOrder;
import o.setClickTrackingRequests;
import o.updateFocusedState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setClickTrackingRequests {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final long IAuthTabCallback;
    private final long asBinder;
    private final long asInterface;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ setClickTrackingRequests(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    public static /* synthetic */ updateFocusedState onExtraCallbackWithResult(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return asInterface(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asInterface(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~i5;
        int i11 = i9 | (~(i7 | i10 | i2));
        int i12 = (~(i5 | i8)) | i7 | (~(i10 | i2));
        int i13 = i3 + i2 + i6 + (1112421973 * i4) + ((-1897213938) * i);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i3) - 781189120) + ((-1395624931) * i2) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i6) + ((-1446510592) * i4) + (892338176 * i) + ((-1657864192) * i14);
        int i16 = (i3 * 2010092721) + 1217064380 + (i2 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i6 * 2010091741) + (i4 * (-1378896031)) + (i * 856652822) + (i14 * 563281920);
        return i15 + ((i16 * i16) * (-1077346304)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        updateFocusedState updatefocusedstateOnExtraCallback = onExtraCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackStub + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return updatefocusedstateOnExtraCallback;
    }

    public static /* synthetic */ updateFocusedState onWarmupCompleted(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private setClickTrackingRequests(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.onNavigationEvent = j;
        this.onExtraCallback = j2;
        this.onExtraCallbackWithResult = j3;
        this.onWarmupCompleted = j4;
        this.IAuthTabCallback = j5;
        this.asBinder = j6;
        this.onTransact = j7;
        this.asInterface = j8;
    }

    public static /* synthetic */ setClickTrackingRequests onWarmupCompleted(setClickTrackingRequests setclicktrackingrequests, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        int i2 = 2 % 2;
        long j13 = (i & 1) != 0 ? setclicktrackingrequests.onNavigationEvent : j;
        long j14 = (i & 2) != 0 ? setclicktrackingrequests.onExtraCallback : j2;
        long j15 = (i & 4) != 0 ? setclicktrackingrequests.onExtraCallbackWithResult : j3;
        if ((i & 8) != 0) {
            int i3 = IAuthTabCallbackDefault + 29;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                long j16 = setclicktrackingrequests.onWarmupCompleted;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j9 = setclicktrackingrequests.onWarmupCompleted;
        } else {
            j9 = j4;
        }
        if ((i & 16) != 0) {
            int i4 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                j10 = setclicktrackingrequests.IAuthTabCallback;
                int i5 = 28 / 0;
            } else {
                j10 = setclicktrackingrequests.IAuthTabCallback;
            }
        } else {
            j10 = j5;
        }
        long j17 = (i & 32) != 0 ? setclicktrackingrequests.asBinder : j6;
        if ((i & 64) != 0) {
            int i6 = IAuthTabCallbackStub + 91;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            j11 = j17;
            j12 = setclicktrackingrequests.onTransact;
        } else {
            j11 = j17;
            j12 = j7;
        }
        return setclicktrackingrequests.IAuthTabCallback(j13, j14, j15, j9, j10, j11, j12, (i & 128) != 0 ? setclicktrackingrequests.asInterface : j8);
    }

    public final setClickTrackingRequests IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j15 = j == 16 ? this.onNavigationEvent : j;
        long j16 = j2 == 16 ? this.onExtraCallback : j2;
        if (j3 == 16) {
            int i5 = i3 + 35;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            j9 = this.onExtraCallbackWithResult;
        } else {
            j9 = j3;
        }
        long j17 = j4 == 16 ? this.onWarmupCompleted : j4;
        if (j5 == 16) {
            int i7 = i3 + 83;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            j10 = this.IAuthTabCallback;
        } else {
            j10 = j5;
        }
        if (j6 == 16) {
            long j18 = this.asBinder;
            int i8 = i3 + 107;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            j11 = j18;
        } else {
            j11 = j6;
        }
        if (j7 == 16) {
            int i10 = i3 + 71;
            IAuthTabCallbackDefault = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            j12 = this.onTransact;
        } else {
            j12 = j7;
        }
        if (j8 == 16) {
            int i11 = i3 + 63;
            IAuthTabCallbackDefault = i11 % 128;
            if (i11 % 2 == 0) {
                j14 = this.asInterface;
                int i12 = 82 / 0;
            } else {
                j14 = this.asInterface;
            }
            j13 = j14;
        } else {
            j13 = j8;
        }
        return new setClickTrackingRequests(j15, j16, j9, j17, j10, j11, j12, j13, null);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long j = this.onWarmupCompleted;
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        if ((!setByteOrder.onExtraCallbackWithResult(j, onextracallbackwithresult.IAuthTabCallbackDefault())) && !setByteOrder.onExtraCallbackWithResult(this.asInterface, onextracallbackwithresult.IAuthTabCallbackDefault())) {
            int i4 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object obj;
        Object objIAuthTabCallback;
        boolean z;
        boolean z2;
        setClickTrackingRequests setclicktrackingrequests = (setClickTrackingRequests) objArr[0];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = IAuthTabCallbackDefault + 105;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1306495714, iIntValue, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleBackgroundColor (TdsCheckBoxV2.kt:333)");
        }
        getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if (i6 != 0) {
                    return setClickTrackingRequests.onWarmupCompleted(onextracallback, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                }
                setClickTrackingRequests.onWarmupCompleted(onextracallback, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                throw null;
            }
        };
        setClickDestinationUri setclickdestinationuri = (setClickDestinationUri) getswitchminwidth.access000();
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1648473162);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1648473162, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleBackgroundColor.<anonymous> (TdsCheckBoxV2.kt:341)");
        }
        long jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(!setclickdestinationuri.onTransact() ? setclicktrackingrequests.asInterface : setclicktrackingrequests.onWarmupCompleted, setclickdestinationuri.onExtraCallbackWithResult() ? 1.0f : 0.0f);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i4 = IAuthTabCallbackStub + 71;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        getAttribute getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getattributeOnExtraCallbackWithResult);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getThumbTintList getthumbtintlist = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getthumbtintlist);
                obj = getthumbtintlist;
            }
        }
        getThumbTintList getthumbtintlist2 = (getThumbTintList) obj;
        int i6 = (((iIntValue & 14) | 384) & 14) | 3072;
        if (getswitchminwidth.IAuthTabCallback_Parcel()) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            objIAuthTabCallback = getswitchminwidth.IAuthTabCallback();
        } else {
            int i7 = IAuthTabCallbackStub + 63;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                if (((i6 & 15) ^ 40) > 5) {
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                        boolean z3 = (i6 & 6) == 4;
                        objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (z3 || objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                            Function1 function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                            try {
                                Object objIAuthTabCallback2 = getswitchminwidth.IAuthTabCallback();
                                iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback2);
                                objIAuthTabCallback = objIAuthTabCallback2;
                            } catch (Throwable th) {
                                iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                                throw th;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                if (((i6 & 14) ^ 6) > 4) {
                }
            }
        }
        setClickDestinationUri setclickdestinationuri2 = (setClickDestinationUri) objIAuthTabCallback;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1648473162);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1648473162, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleBackgroundColor.<anonymous> (TdsCheckBoxV2.kt:341)");
        }
        long jOnExtraCallbackWithResult2 = getMaxAdCount.onExtraCallbackWithResult(setclickdestinationuri2.onTransact() ? setclicktrackingrequests.onWarmupCompleted : setclicktrackingrequests.asInterface, !(setclickdestinationuri2.onExtraCallbackWithResult() ^ true) ? 1.0f : 0.0f);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult2);
        int i8 = i6 & 14;
        int i9 = i8 ^ 6;
        if (i9 > 4) {
            int i10 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackDefault = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                z = (i6 & 6) == 4;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z) {
            int i11 = IAuthTabCallbackDefault + 99;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallback(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        setClickDestinationUri setclickdestinationuri3 = (setClickDestinationUri) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult();
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1648473162);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i13 % 128;
            if (i13 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1648473162, 1, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleBackgroundColor.<anonymous> (TdsCheckBoxV2.kt:341)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1648473162, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleBackgroundColor.<anonymous> (TdsCheckBoxV2.kt:341)");
            }
        }
        long jOnExtraCallbackWithResult3 = getMaxAdCount.onExtraCallbackWithResult(setclickdestinationuri3.onTransact() ? setclicktrackingrequests.onWarmupCompleted : setclicktrackingrequests.asInterface, setclickdestinationuri3.onExtraCallbackWithResult() ? 1.0f : 0.0f);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult3);
        if (i9 > 4) {
            int i14 = IAuthTabCallbackStub + 9;
            IAuthTabCallbackDefault = i14 % 128;
            int i15 = i14 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) {
                z2 = (i6 & 6) == 4;
            }
        }
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallbackWithResult(getswitchminwidth));
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidth, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlist2, "checkColor", cameraCaptureResultEmptyCameraCaptureResult, i8 | 196608);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = IAuthTabCallbackStub + 109;
            IAuthTabCallbackDefault = i16 % 128;
            if (i16 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i17 = 32 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    private static final updateFocusedState IAuthTabCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1044960728);
        Object obj = null;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = IAuthTabCallbackDefault + 13;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1044960728, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleBackgroundColor.<anonymous> (TdsCheckBoxV2.kt:336)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1044960728, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleBackgroundColor.<anonymous> (TdsCheckBoxV2.kt:336)");
        }
        getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(((setClickDestinationUri) onextracallback.onExtraCallback()).onTransact() ? getIconContentView.onWarmupCompleted.asBinder() : getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = IAuthTabCallbackDefault + 91;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onWarmupCompleted(@NotNull getSwitchMinWidth<setClickDestinationUri> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        float f;
        Object obj;
        Object objIAuthTabCallback;
        float f2;
        getThumbTintList getthumbtintlist;
        long j;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallbackStub + 61;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1908720728, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor (TdsCheckBoxV2.kt:347)");
                int i4 = 77 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1908720728, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor (TdsCheckBoxV2.kt:347)");
            }
        }
        getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 93;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                updateFocusedState updatefocusedstateOnExtraCallbackWithResult = setClickTrackingRequests.onExtraCallbackWithResult((getSwitchMinWidth.onExtraCallback) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i8 = onExtraCallbackWithResult + 115;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    return updatefocusedstateOnExtraCallbackWithResult;
                }
                throw null;
            }
        };
        setClickDestinationUri setclickdestinationuri = (setClickDestinationUri) getswitchminwidth.access000();
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-652203140);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-652203140, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor.<anonymous> (TdsCheckBoxV2.kt:355)");
        }
        long j2 = setclickdestinationuri.onTransact() ? this.onExtraCallbackWithResult : this.onTransact;
        if (setclickdestinationuri.onExtraCallbackWithResult()) {
            int i7 = IAuthTabCallbackDefault;
            int i8 = i7 + 23;
            IAuthTabCallbackStub = i8 % 128;
            f = i8 % 2 != 0 ? 1.0f : 0.0f;
            int i9 = i7 + 107;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 3;
            }
        } else {
            f = 1.0f;
        }
        long jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(j2, f);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        getAttribute getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jOnExtraCallbackWithResult);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getattributeOnExtraCallbackWithResult);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getThumbTintList getthumbtintlist2 = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getthumbtintlist2);
                obj = getthumbtintlist2;
            }
        }
        getThumbTintList getthumbtintlist3 = (getThumbTintList) obj;
        int i11 = (((i & 14) | 384) & 14) | 3072;
        if (getswitchminwidth.IAuthTabCallback_Parcel()) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            objIAuthTabCallback = getswitchminwidth.IAuthTabCallback();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
            boolean z = (((i11 & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i11 & 6) == 4;
            objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!z) || objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                Function1 function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                try {
                    Object objIAuthTabCallback2 = getswitchminwidth.IAuthTabCallback();
                    iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback2);
                    objIAuthTabCallback = objIAuthTabCallback2;
                } catch (Throwable th) {
                    iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                    throw th;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        setClickDestinationUri setclickdestinationuri2 = (setClickDestinationUri) objIAuthTabCallback;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-652203140);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = IAuthTabCallbackDefault + 101;
            IAuthTabCallbackStub = i12 % 128;
            if (i12 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-652203140, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor.<anonymous> (TdsCheckBoxV2.kt:355)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-652203140, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor.<anonymous> (TdsCheckBoxV2.kt:355)");
            }
        }
        long j3 = setclickdestinationuri2.onTransact() ? this.onExtraCallbackWithResult : this.onTransact;
        if (setclickdestinationuri2.onExtraCallbackWithResult()) {
            f2 = 0.0f;
        } else {
            int i13 = IAuthTabCallbackDefault + 97;
            IAuthTabCallbackStub = i13 % 128;
            int i14 = i13 % 2;
            f2 = 1.0f;
        }
        long jOnExtraCallbackWithResult2 = getMaxAdCount.onExtraCallbackWithResult(j3, f2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult2);
        int i15 = i11 & 14;
        int i16 = i15 ^ 6;
        boolean z2 = (i16 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i11 & 6) == 4;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(getswitchminwidth));
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        setClickDestinationUri setclickdestinationuri3 = (setClickDestinationUri) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult();
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-652203140);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i17 = IAuthTabCallbackDefault + 29;
            IAuthTabCallbackStub = i17 % 128;
            if (i17 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-652203140, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor.<anonymous> (TdsCheckBoxV2.kt:355)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-652203140, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor.<anonymous> (TdsCheckBoxV2.kt:355)");
            }
        }
        if (setclickdestinationuri3.onTransact()) {
            int i18 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            getthumbtintlist = getthumbtintlist3;
            j = this.onExtraCallbackWithResult;
        } else {
            getthumbtintlist = getthumbtintlist3;
            j = this.onTransact;
        }
        long jOnExtraCallbackWithResult3 = getMaxAdCount.onExtraCallbackWithResult(j, setclickdestinationuri3.onExtraCallbackWithResult() ? 0.0f : 1.0f);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult3);
        boolean z3 = (i16 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i11 & 6) == 4;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new asInterface(getswitchminwidth));
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidth, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlist, "circleLineColor", cameraCaptureResultEmptyCameraCaptureResult, i15 | 196608);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final updateFocusedState asInterface(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 21;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(653608814);
            int i4 = 54 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 15;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(653608814, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.circleLineColor.<anonymous> (TdsCheckBoxV2.kt:350)");
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(653608814);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        if (((setClickDestinationUri) onextracallback.onExtraCallback()).onTransact()) {
            int i7 = IAuthTabCallbackDefault + 11;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.asBinder();
            int i9 = IAuthTabCallbackStub + 3;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 3;
            }
        } else {
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
        }
        getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getstarratingcontentviewgroupOnExtraCallbackWithResult, 0, 2, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(@NotNull getSwitchMinWidth<setClickDestinationUri> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        Object objIAuthTabCallback;
        boolean z;
        long j;
        boolean z2;
        Function1 function1IAuthTabCallbackStub;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getswitchminwidth, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1499029776, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.checkColor (TdsCheckBoxV2.kt:361)");
        }
        getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 9;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj3;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj4;
                Integer numValueOf = Integer.valueOf(((Integer) obj5).intValue());
                if (i6 != 0) {
                    int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                    throw null;
                }
                int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
                int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
                updateFocusedState updatefocusedstate = (updateFocusedState) setClickTrackingRequests.onNavigationEvent(OverseasRrnInputTextField.IAuthTabCallback(), -1586158287, 1586158288, iIAuthTabCallback6, iIAuthTabCallback4, iIAuthTabCallback5, new Object[]{onextracallback, cameraCaptureResultEmptyCameraCaptureResult2, numValueOf});
                int i7 = onWarmupCompleted + 97;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 87 / 0;
                }
                return updatefocusedstate;
            }
        };
        setClickDestinationUri setclickdestinationuri = (setClickDestinationUri) getswitchminwidth.access000();
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1879565668);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1879565668, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.checkColor.<anonymous> (TdsCheckBoxV2.kt:372)");
        }
        long j2 = setclickdestinationuri.onTransact() ? setclickdestinationuri.onExtraCallbackWithResult() ? this.onNavigationEvent : this.onExtraCallback : setclickdestinationuri.onExtraCallbackWithResult() ? this.IAuthTabCallback : this.asBinder;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        getAttribute getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(j2);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getattributeOnExtraCallbackWithResult);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                getThumbTintList getthumbtintlist = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getthumbtintlist);
                obj = getthumbtintlist;
            }
        }
        getThumbTintList getthumbtintlist2 = (getThumbTintList) obj;
        int i4 = (((i & 14) | 384) & 14) | 3072;
        if (getswitchminwidth.IAuthTabCallback_Parcel()) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            objIAuthTabCallback = getswitchminwidth.IAuthTabCallback();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
            boolean z3 = (((i4 & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i4 & 6) == 4;
            objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (z3 || objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                if (r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null) {
                    int i5 = IAuthTabCallbackDefault + 27;
                    IAuthTabCallbackStub = i5 % 128;
                    if (i5 % 2 != 0) {
                        function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                        int i6 = 84 / 0;
                    } else {
                        function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                    }
                } else {
                    function1IAuthTabCallbackStub = null;
                }
                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                try {
                    Object objIAuthTabCallback2 = getswitchminwidth.IAuthTabCallback();
                    iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback2);
                    objIAuthTabCallback = objIAuthTabCallback2;
                } catch (Throwable th) {
                    iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                    throw th;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        setClickDestinationUri setclickdestinationuri2 = (setClickDestinationUri) objIAuthTabCallback;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1879565668);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallbackStub + 81;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1879565668, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.checkColor.<anonymous> (TdsCheckBoxV2.kt:372)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1879565668, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.checkColor.<anonymous> (TdsCheckBoxV2.kt:372)");
            }
        }
        long j3 = setclickdestinationuri2.onTransact() ? setclickdestinationuri2.onExtraCallbackWithResult() ? this.onNavigationEvent : this.onExtraCallback : setclickdestinationuri2.onExtraCallbackWithResult() ? this.IAuthTabCallback : this.asBinder;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j3);
        int i8 = i4 & 14;
        int i9 = i8 ^ 6;
        boolean z4 = (i9 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) || (i4 & 6) == 4;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z4) {
            int i10 = IAuthTabCallbackDefault + 13;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onWarmupCompleted(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        setClickDestinationUri setclickdestinationuri3 = (setClickDestinationUri) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult();
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1879565668);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1879565668, 0, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.checkColor.<anonymous> (TdsCheckBoxV2.kt:372)");
        }
        if (setclickdestinationuri3.onTransact()) {
            z = true;
            if (!(!setclickdestinationuri3.onExtraCallbackWithResult())) {
                int i12 = IAuthTabCallbackDefault + 1;
                IAuthTabCallbackStub = i12 % 128;
                int i13 = i12 % 2;
                j = this.onNavigationEvent;
            } else {
                j = this.onExtraCallback;
            }
        } else {
            z = true;
            if (setclickdestinationuri3.onExtraCallbackWithResult()) {
                int i14 = IAuthTabCallbackStub + 45;
                IAuthTabCallbackDefault = i14 % 128;
                if (i14 % 2 == 0) {
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                j = this.IAuthTabCallback;
            } else {
                j = this.asBinder;
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(j);
        if ((i9 <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth)) && (i4 & 6) != 4) {
            int i15 = IAuthTabCallbackDefault + 115;
            IAuthTabCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidth));
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidth, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlist2, "circleCheckColor", cameraCaptureResultEmptyCameraCaptureResult, i8 | 196608);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    private static final updateFocusedState onExtraCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-962998422);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 53;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-962998422, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Colors.checkColor.<anonymous> (TdsCheckBoxV2.kt:364)");
        }
        getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(((setClickDestinationUri) onextracallback.onExtraCallback()).onTransact() ? getIconContentView.onWarmupCompleted.asBinder() : getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setClickTrackingRequests)) {
            return false;
        }
        setClickTrackingRequests setclicktrackingrequests = (setClickTrackingRequests) obj;
        if (setByteOrder.onExtraCallbackWithResult(this.onNavigationEvent, setclicktrackingrequests.onNavigationEvent) && !(!setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, setclicktrackingrequests.onExtraCallback)) && setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, setclicktrackingrequests.onExtraCallbackWithResult)) {
            int i2 = IAuthTabCallbackDefault + 69;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, setclicktrackingrequests.onWarmupCompleted);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, setclicktrackingrequests.onWarmupCompleted) && setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, setclicktrackingrequests.IAuthTabCallback)) {
                int i3 = IAuthTabCallbackStub + 115;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                if (setByteOrder.onExtraCallbackWithResult(this.asBinder, setclicktrackingrequests.asBinder)) {
                    int i5 = IAuthTabCallbackDefault + 3;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    if (setByteOrder.onExtraCallbackWithResult(this.onTransact, setclicktrackingrequests.onTransact)) {
                        int i7 = IAuthTabCallbackDefault + 125;
                        IAuthTabCallbackStub = i7 % 128;
                        int i8 = i7 % 2;
                        if (setByteOrder.onExtraCallbackWithResult(this.asInterface, setclicktrackingrequests.asInterface)) {
                            int i9 = IAuthTabCallbackStub;
                            int i10 = i9 + 105;
                            IAuthTabCallbackDefault = i10 % 128;
                            int i11 = i10 % 2;
                            int i12 = i9 + 61;
                            IAuthTabCallbackDefault = i12 % 128;
                            int i13 = i12 % 2;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = setByteOrder.onTransact(this.onNavigationEvent);
        int iOnTransact2 = setByteOrder.onTransact(this.onExtraCallback);
        int iOnTransact3 = setByteOrder.onTransact(this.onExtraCallbackWithResult);
        int iOnTransact4 = setByteOrder.onTransact(this.onWarmupCompleted);
        int iOnTransact5 = setByteOrder.onTransact(this.IAuthTabCallback);
        int iOnTransact6 = (((((((((((((iOnTransact * 31) + iOnTransact2) * 31) + iOnTransact3) * 31) + iOnTransact4) * 31) + iOnTransact5) * 31) + setByteOrder.onTransact(this.asBinder)) * 31) + setByteOrder.onTransact(this.onTransact)) * 31) + setByteOrder.onTransact(this.asInterface);
        int i4 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return iOnTransact6;
    }

    public static /* synthetic */ updateFocusedState onNavigationEvent(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (updateFocusedState) onNavigationEvent(OverseasRrnInputTextField.IAuthTabCallback(), -1586158287, 1586158288, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallback(@NotNull getSwitchMinWidth<setClickDestinationUri> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (CameraPresenceProviderExternalSyntheticLambda6) onNavigationEvent(OverseasRrnInputTextField.IAuthTabCallback(), 744978201, -744978201, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, objArr);
    }

    public static final class IAuthTabCallback implements Function0<setClickDestinationUri> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public IAuthTabCallback(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.setClickDestinationUri] */
        public final setClickDestinationUri invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onExtraCallbackWithResult.access000();
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return Access000;
        }
    }

    public static final class onExtraCallback implements Function0<setClickDestinationUri> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onExtraCallback(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.setClickDestinationUri] */
        public final setClickDestinationUri invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onWarmupCompleted.access000();
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return Access000;
            }
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Function0<setClickDestinationUri> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public onWarmupCompleted(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.setClickDestinationUri] */
        public final setClickDestinationUri invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.IAuthTabCallback.access000();
            int i4 = onWarmupCompleted + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return Access000;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements Function0<getSwitchMinWidth.onExtraCallback<setClickDestinationUri>> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public asInterface(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            getSwitchMinWidth.onExtraCallback<setClickDestinationUri> onextracallbackOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onextracallbackOnNavigationEvent = onNavigationEvent();
                int i3 = 30 / 0;
            } else {
                onextracallbackOnNavigationEvent = onNavigationEvent();
            }
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackOnNavigationEvent;
            }
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<setClickDestinationUri> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<setClickDestinationUri> onextracallbackIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<getSwitchMinWidth.onExtraCallback<setClickDestinationUri>> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<setClickDestinationUri> onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnExtraCallbackWithResult;
        }

        public final getSwitchMinWidth.onExtraCallback<setClickDestinationUri> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.IAuthTabCallbackDefault();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<setClickDestinationUri> onextracallbackIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    public static final class onNavigationEvent implements Function0<getSwitchMinWidth.onExtraCallback<setClickDestinationUri>> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        public final getSwitchMinWidth.onExtraCallback<setClickDestinationUri> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<setClickDestinationUri> onextracallbackIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            int i4 = onNavigationEvent + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback();
            }
            IAuthTabCallback();
            throw null;
        }
    }
}
