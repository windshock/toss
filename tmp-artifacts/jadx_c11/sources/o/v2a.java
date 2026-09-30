package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v2a {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int onTransact = 1;
    public static final v2a onNavigationEvent = new v2a();
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f);
    private static final float onWarmupCompleted = AppLovinAdType.onExtraCallbackWithResult.onNavigationEvent();
    private static final InterfaceC0083handshake onExtraCallbackWithResult = ConnectionPool.onWarmupCompleted.onWarmupCompleted();
    private static final float onExtraCallback = MaxDebuggerDetailActivity.IAuthTabCallback.onWarmupCompleted();

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[v2.onWarmupCompleted.values().length];
            try {
                iArr[v2.onWarmupCompleted.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v2.onWarmupCompleted.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[v2.onExtraCallback.values().length];
            try {
                iArr2[v2.onExtraCallback.Pill.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 99;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v2.onExtraCallback.Square.ordinal()] = 2;
                int i4 = onExtraCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr2;
            int[] iArr3 = new int[v2.IAuthTabCallbackDefault.values().length];
            try {
                iArr3[v2.IAuthTabCallbackDefault.Fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[v2.IAuthTabCallbackDefault.Weak.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            onWarmupCompleted = iArr3;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i3) | i7);
        int i9 = i4 | i8 | (~(i6 | i3));
        int i10 = (~(i3 | i4)) | (~(i7 | i3)) | (~(i7 | i4));
        int i11 = i4 + i6 + i5 + (1351532378 * i2) + (1237199896 * i);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i4) + 1314914304 + ((-491389116) * i6) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i5) + ((-1818230784) * i2) + ((-914358272) * i) + ((-2051670016) * i12);
        int i14 = ((i4 * 406040238) - 634933780) + (i6 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i5 * 406039561) + (i2 * 1283666474) + (i * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        return i15 != 1 ? i15 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private v2a() {
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 15;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = IAuthTabCallback;
        int i4 = i2 + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return Float.valueOf(onWarmupCompleted);
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 91;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallback;
        int i5 = i2 + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float onExtraCallback(@NotNull v2.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        int i2 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i2 == 1) {
            float fOnWarmupCompleted = MaxDebuggerTcfInfoListActivity.onExtraCallbackWithResult.onWarmupCompleted();
            int i3 = IAuthTabCallbackStub + 5;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return fOnWarmupCompleted;
        }
        int i5 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        if (i2 == 2) {
            return MaxDebuggerTcfInfoListActivity.onExtraCallbackWithResult.onNavigationEvent();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float IAuthTabCallback(@NotNull v2.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        int i4 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i4 == 1) {
            return AppLovinAdType.onExtraCallbackWithResult.onWarmupCompleted();
        }
        int i5 = IAuthTabCallbackStub;
        int i6 = i5 + 3;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = i5 + 5;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            return AppLovinAdType.onExtraCallbackWithResult.onExtraCallback();
        }
        AppLovinAdType.onExtraCallbackWithResult.onExtraCallback();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onNavigationEvent(@NotNull v2.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        float fIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
        int i2 = onWarmupCompleted.IAuthTabCallback[onextracallback.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 2 : i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
            int i4 = IAuthTabCallbackDefault + 33;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
        }
        return focusMeteringControlExternalSyntheticLambda12.onExtraCallback(fIAuthTabCallback);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel onExtraCallbackWithResult(@NotNull v2.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        float fIAuthTabCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallbackStub + 51;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(265344687, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.verticalArrangement (TdsChipV1Defaults.kt:61)");
                int i4 = 38 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(265344687, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.verticalArrangement (TdsChipV1Defaults.kt:61)");
            }
        }
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(getBacktraceNoteBytes.onExtraCallback(onExtraCallbackWithResult.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).e_(onNavigationEvent.onExtraCallbackWithResult(onwarmupcompleted).IAuthTabCallbackStub())) + 4.0f));
        int i5 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i5 == 1) {
            float fIAuthTabCallback3 = RangesKt.coerceIn(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(35.0f)), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f))).IAuthTabCallback();
            if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(35.0f))) {
                i = 0;
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i);
            } else {
                float fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f);
                if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3).compareTo(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(37.0f))) <= 0) {
                    int i6 = IAuthTabCallbackDefault + 49;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3).compareTo(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback4)) >= 0) {
                        i = 1;
                    } else if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f))) {
                        if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(39.0f))) {
                            i = 3;
                        } else if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f))) {
                            int i8 = IAuthTabCallbackStub + 27;
                            IAuthTabCallbackDefault = i8 % 128;
                            int i9 = i8 % 2;
                            i = 4;
                        } else if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(41.0f))) {
                            i = 5;
                        } else if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(42.0f))) {
                            i = 6;
                        } else if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(43.0f))) {
                            int i10 = IAuthTabCallbackDefault + 105;
                            IAuthTabCallbackStub = i10 % 128;
                            i = i10 % 2 != 0 ? 99 : 7;
                        } else if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f))) {
                            int i11 = IAuthTabCallbackDefault + 27;
                            IAuthTabCallbackStub = i11 % 128;
                            i = i11 % 2 != 0 ? 99 : 8;
                        }
                    }
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i);
                }
            }
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float fIAuthTabCallback5 = RangesKt.coerceIn(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f)), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f))).IAuthTabCallback();
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f)) ^ true ? VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(39.0f)) ? 3 : VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)) ? 4 : VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(41.0f)) ? 5 : VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(42.0f)) ? 6 : VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(43.0f)) ? 7 : VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f)) ? 8 : 0 : 2);
        }
        FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(fIAuthTabCallback);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return asbinderOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final getHumanReadableName onExtraCallbackWithResult(@NotNull v2.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        int i2 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i2 == 1) {
            return AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
        }
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i3 + 81;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
            return (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        Object[] objArr2 = {AppLovinPostbackService.onExtraCallbackWithResult};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final v0a onWarmupCompleted(@NotNull v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        v0a v0aVarOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallbackStub + 101;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1364280737, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.itemColors (TdsChipV1Defaults.kt:108)");
        }
        int i6 = onWarmupCompleted.onWarmupCompleted[iAuthTabCallbackDefault.ordinal()];
        if (i6 == 1) {
            if (z) {
                int i7 = IAuthTabCallbackDefault + 119;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1108768602);
                v0aVarOnNavigationEvent = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                int i9 = IAuthTabCallbackDefault + 105;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 4 / 4;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1108769585);
                v0aVarOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                int i11 = IAuthTabCallbackDefault + 37;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 5 % 5;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i13 = IAuthTabCallbackDefault + 87;
            IAuthTabCallbackStub = i13 % 128;
            int i14 = i13 % 2;
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1108771706);
                Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 6) & 14)};
                int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                v0aVarOnNavigationEvent = (v0a) onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1275746884, iOnWarmupCompleted2, 1275746886);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1108772689);
                v0aVarOnNavigationEvent = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i15 = IAuthTabCallbackDefault + 79;
            IAuthTabCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i16 != 0) {
                int i17 = 28 / 0;
            }
        }
        return v0aVarOnNavigationEvent;
    }

    public final v0a onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-936176533, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.fillItemColors (TdsChipV1Defaults.kt:115)");
        }
        v0a v0aVarOnExtraCallbackWithResult = onExtraCallbackWithResult(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 63;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return v0aVarOnExtraCallbackWithResult;
    }

    public final v0a onExtraCallbackWithResult(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        v0a v0aVarExtraCallbackWithResult = y2Var.extraCallbackWithResult();
        if (v0aVarExtraCallbackWithResult != null) {
            return v0aVarExtraCallbackWithResult;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipFillSelected);
        Object[] objArr = {y2Var, authParams.FillNeutralWeak};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderSelected);
        long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderUnselected);
        long jOnExtraCallback4 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipTextSelected);
        Object[] objArr2 = {y2Var, authParams.TextSecondary};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr2, -1868498688, iOnWarmupCompleted4)).longValue();
        long jOnExtraCallback5 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipNumberTextSelected);
        Object[] objArr3 = {y2Var, authParams.TextTertiary};
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue3 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, objArr3, -1868498688, iOnWarmupCompleted6)).longValue();
        long jOnExtraCallback6 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipIconSelected);
        Object[] objArr4 = {y2Var, authParams.IconSecondary};
        int iOnWarmupCompleted7 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted8 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        v0a v0aVar = new v0a(jOnExtraCallback, jLongValue, jOnExtraCallback2, jOnExtraCallback3, jOnExtraCallback4, jLongValue2, jOnExtraCallback5, jLongValue3, jOnExtraCallback6, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted7, objArr4, -1868498688, iOnWarmupCompleted8)).longValue(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillSelectedGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillSelectedGradientEnd), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotFill), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotBorder), null);
        y2Var.onNavigationEvent(v0aVar);
        int i4 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return v0aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final v0a onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2087385366, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.weakItemColors (TdsChipV1Defaults.kt:178)");
            int i3 = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }
        v0a v0aVarOnWarmupCompleted = onWarmupCompleted(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 119;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                throw null;
            }
        }
        return v0aVarOnWarmupCompleted;
    }

    public final v0a IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        long jOnTransact;
        long j17;
        long jOnTransact2;
        long j18;
        long jOnTransact3;
        long j19;
        long jOnTransact4;
        long j20;
        long j21;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        long jOnTransact5 = (i3 & 1) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnTransact6 = (i3 & 2) != 0 ? setByteOrder.Companion.onTransact() : j2;
        long jOnTransact7 = (i3 & 4) != 0 ? setByteOrder.Companion.onTransact() : j3;
        long jOnTransact8 = (i3 & 8) != 0 ? setByteOrder.Companion.onTransact() : j4;
        long jOnTransact9 = (i3 & 16) != 0 ? setByteOrder.Companion.onTransact() : j5;
        long jOnTransact10 = (i3 & 32) != 0 ? setByteOrder.Companion.onTransact() : j6;
        if ((i3 & 64) != 0) {
            int i7 = IAuthTabCallbackStub + 57;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j7;
        }
        if ((i3 & 128) != 0) {
            int i8 = IAuthTabCallbackStub + 23;
            j17 = jOnTransact;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            jOnTransact2 = setByteOrder.Companion.onTransact();
        } else {
            j17 = jOnTransact;
            jOnTransact2 = j8;
        }
        long jOnTransact11 = (i3 & 256) != 0 ? setByteOrder.Companion.onTransact() : j9;
        long jOnTransact12 = (i3 & 512) != 0 ? setByteOrder.Companion.onTransact() : j10;
        long jOnTransact13 = (i3 & 1024) != 0 ? setByteOrder.Companion.onTransact() : j11;
        long jOnTransact14 = (i3 & 2048) != 0 ? setByteOrder.Companion.onTransact() : j12;
        if ((i3 & 4096) != 0) {
            int i10 = IAuthTabCallbackStub + 45;
            j18 = jOnTransact2;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            jOnTransact3 = setByteOrder.Companion.onTransact();
        } else {
            j18 = jOnTransact2;
            jOnTransact3 = j13;
        }
        if ((i3 & 8192) != 0) {
            int i12 = IAuthTabCallbackDefault + 99;
            j19 = jOnTransact3;
            IAuthTabCallbackStub = i12 % 128;
            if (i12 % 2 != 0) {
                jOnTransact4 = setByteOrder.Companion.onTransact();
                int i13 = 31 / 0;
            } else {
                jOnTransact4 = setByteOrder.Companion.onTransact();
            }
        } else {
            j19 = jOnTransact3;
            jOnTransact4 = j14;
        }
        long jOnTransact15 = (i3 & 16384) != 0 ? setByteOrder.Companion.onTransact() : j15;
        long jOnTransact16 = (i3 & 32768) != 0 ? setByteOrder.Companion.onTransact() : j16;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            j20 = jOnTransact16;
            int i14 = IAuthTabCallbackStub + 85;
            IAuthTabCallbackDefault = i14 % 128;
            int i15 = i14 % 2;
            j21 = jOnTransact4;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1521776980, i, i2, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.weakItemColors (TdsChipV1Defaults.kt:199)");
        } else {
            j20 = jOnTransact16;
            j21 = jOnTransact4;
        }
        v0a v0aVarIAuthTabCallback = onWarmupCompleted(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)).IAuthTabCallback(jOnTransact5, jOnTransact6, jOnTransact7, jOnTransact8, jOnTransact9, jOnTransact10, j17, j18, jOnTransact11, jOnTransact12, jOnTransact13, jOnTransact14, j19, j21, jOnTransact15, j20);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return v0aVarIAuthTabCallback;
    }

    public final v0a onWarmupCompleted(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        v0a v0aVar = (v0a) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -2122364963, iOnWarmupCompleted, iOnWarmupCompleted2, 2122364965, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        if (v0aVar != null) {
            int i4 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return v0aVar;
        }
        Object[] objArr = {y2Var, authParams.FillBrandWeak};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr, -1868498688, iOnWarmupCompleted4)).longValue();
        Object[] objArr2 = {y2Var, authParams.FillNeutralWeak};
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, objArr2, -1868498688, iOnWarmupCompleted6)).longValue();
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderWeakSelected);
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderUnselected);
        long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipTextWeakSelected);
        Object[] objArr3 = {y2Var, authParams.TextSecondary};
        int iOnWarmupCompleted7 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted8 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue3 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted7, objArr3, -1868498688, iOnWarmupCompleted8)).longValue();
        long jOnExtraCallback4 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipNumberTextWeakSelected);
        Object[] objArr4 = {y2Var, authParams.TextTertiary};
        int iOnWarmupCompleted9 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted10 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue4 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted9, objArr4, -1868498688, iOnWarmupCompleted10)).longValue();
        long jOnExtraCallback5 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipIconWeakSelected);
        Object[] objArr5 = {y2Var, authParams.IconSecondary};
        int iOnWarmupCompleted11 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted12 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        v0a v0aVar2 = new v0a(jLongValue, jLongValue2, jOnExtraCallback, jOnExtraCallback2, jOnExtraCallback3, jLongValue3, jOnExtraCallback4, jLongValue4, jOnExtraCallback5, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted11, objArr5, -1868498688, iOnWarmupCompleted12)).longValue(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillWeakSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillWeakSelectedGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillWeakSelectedGradientEnd), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotFill), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotBorder), null);
        y2Var.onExtraCallback(v0aVar2);
        return v0aVar2;
    }

    public final v0a onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackDefault + 99;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1809598396, i, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.fillOnColorBgItemColors (TdsChipV1Defaults.kt:241)");
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        v0a v0aVarOnNavigationEvent = onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallbackDefault + 75;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        }
        return v0aVarOnNavigationEvent;
    }

    public final v0a onNavigationEvent(@NotNull y2 y2Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        v0a v0aVarOnMinimized = y2Var.onMinimized();
        if (v0aVarOnMinimized == null) {
            v0aVarOnMinimized = new v0a(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipFillInverseSelected), setByteOrder.Companion.IAuthTabCallbackDefault(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderInverseSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipTextInverseSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipTextInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipNumberTextInverseSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipNumberTextInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipIconInverseSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipIconInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillInverseSelectedGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillInverseSelectedGradientEnd), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotFillInverse), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotBorderInverse), null);
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var, v0aVarOnMinimized}, -1787479873, iOnWarmupCompleted, iOnWarmupCompleted2, 1787479891, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
            int i4 = IAuthTabCallbackStub + 123;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
        }
        return v0aVarOnMinimized;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        v2a v2aVar = (v2a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1134224377, iIntValue, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1Defaults.weakOnColorBgItemColors (TdsChipV1Defaults.kt:304)");
        }
        v0a v0aVarOnExtraCallback = v2aVar.onExtraCallback(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = IAuthTabCallbackDefault + 125;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return v0aVarOnExtraCallback;
    }

    public final v0a onExtraCallback(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        v0a v0aVarReceiveFile = y2Var.receiveFile();
        if (v0aVarReceiveFile != null) {
            int i4 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return v0aVarReceiveFile;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipFillInverseWeakSelected);
        long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderInverseWeakSelected);
        long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipBorderInverseUnselected);
        Object[] objArr = {y2Var, authParams.TextOnFill};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        v0a v0aVar = new v0a(jOnExtraCallback, jIAuthTabCallbackDefault, jOnExtraCallback2, jOnExtraCallback3, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipTextInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipNumberTextInverseWeakSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipNumberTextInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipIconInverseWeakSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipIconInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillInverseWeakSelected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipStateLayerFillInverseUnselected), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillInverseWeakSelectedGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipGradientLayerFillInverseWeakSelectedGradientEnd), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotFillInverse), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ChipRedDotBorderInverse), null);
        y2Var.IAuthTabCallback(v0aVar);
        return v0aVar;
    }

    static {
        int i = onTransact + 3;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final float onExtraCallback() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return ((Float) onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[]{this}, 1152146518, iOnWarmupCompleted2, -1152146518)).floatValue();
    }

    public final InterfaceC0083handshake onExtraCallbackWithResult() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (InterfaceC0083handshake) onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[]{this}, 514123437, iOnWarmupCompleted2, -514123436);
    }

    public final v0a onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (v0a) onWarmupCompleted(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1275746884, iOnWarmupCompleted2, 1275746886);
    }
}
