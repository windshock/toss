package o;

import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.setApTextSize;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setBody {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static int onTransact = 1;
    public static final setBody onExtraCallback = new setBody();
    private static final float IAuthTabCallback = 0.3f;
    private static final float onNavigationEvent = 0.4f;
    private static final float onExtraCallbackWithResult = 0.26f;
    private static final float onWarmupCompleted = 0.13f;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[setCallToAction.onWarmupCompleted.values().length];
            try {
                iArr[setCallToAction.onWarmupCompleted.Primary.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setCallToAction.onWarmupCompleted.Danger.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setCallToAction.onWarmupCompleted.Dark.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setCallToAction.onWarmupCompleted.Light.ordinal()] = 4;
                int i2 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[setCallToAction.onExtraCallback.values().length];
            try {
                iArr2[setCallToAction.onExtraCallback.Fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[setCallToAction.onExtraCallback.Weak.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallback = iArr2;
            int[] iArr3 = new int[getSpecialFeatureOptInStatus.values().length];
            try {
                iArr3[getSpecialFeatureOptInStatus.Light.ordinal()] = 1;
                int i4 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[getSpecialFeatureOptInStatus.Dark.ordinal()] = 2;
                int i7 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            IAuthTabCallback = iArr3;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i2)) | i8 | (~(i6 | i2));
        int i10 = (~(i7 | (~i2))) | i8;
        int i11 = (~(i2 | i5)) | (~((~i6) | i5));
        int i12 = i5 + i6 + i + (929125522 * i4) + (1849324972 * i3);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i5) + 1146290176 + ((-1462591364) * i6) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i) + ((-291241984) * i4) + (1012400128 * i3) + ((-1810169856) * i13);
        int i15 = ((i5 * (-2058557531)) - 518432259) + (i6 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i * (-2058558961)) + (i4 * 548722830) + (i3 * 1549712660) + (i13 * (-2087387136));
        int i16 = i14 + (i15 * i15 * (-343605248));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private setBody() {
    }

    static {
        int i = onTransact + 51;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallbackWithResult;
        int i5 = i2 + 63;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        float f = onWarmupCompleted;
        int i5 = i3 + 45;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(f);
    }

    public final setClickDestinationBackupUri onWarmupCompleted(@Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        setClickDestinationBackupUri setclickdestinationbackupuriOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallbackStub + 45;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            onwarmupcompleted = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).IAuthTabCallback();
        }
        if ((i2 & 2) != 0) {
            onextracallback = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onWarmupCompleted();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = IAuthTabCallbackDefault + 89;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1509728090, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.buttonColors (TdsButtonV1Defaults.kt:35)");
            int i8 = IAuthTabCallbackDefault + 15;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = IAuthTabCallback.onExtraCallback[onextracallback.ordinal()];
        if (i10 == 1) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-587730276);
            int i11 = IAuthTabCallback.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i11 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850241389);
                setclickdestinationbackupuriOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (i11 != 2) {
                int i12 = IAuthTabCallbackDefault;
                int i13 = i12 + 13;
                IAuthTabCallbackStub = i13 % 128;
                int i14 = i13 % 2;
                if (i11 != 3) {
                    int i15 = i12 + 17;
                    IAuthTabCallbackStub = i15 % 128;
                    if (i15 % 2 == 0 ? i11 != 4 : i11 != 2) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850243034);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850234895);
                    setclickdestinationbackupuriOnExtraCallbackWithResult = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850237008);
                    setclickdestinationbackupuriOnExtraCallbackWithResult = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850239150);
                Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 6) & 14)};
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                setclickdestinationbackupuriOnExtraCallbackWithResult = (setClickDestinationBackupUri) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1139916351, 1139916351);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (i10 != 2) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850244327);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-587392996);
            int i16 = IAuthTabCallback.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i16 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850230509);
                setclickdestinationbackupuriOnExtraCallbackWithResult = onTransact(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (i16 != 2) {
                int i17 = IAuthTabCallbackStub + 13;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                if (i16 == 3) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850226128);
                    setclickdestinationbackupuriOnExtraCallbackWithResult = IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    if (i16 != 4) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850232154);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850224015);
                    setclickdestinationbackupuriOnExtraCallbackWithResult = asInterface(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-850228270);
                setclickdestinationbackupuriOnExtraCallbackWithResult = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i19 = IAuthTabCallbackDefault + 19;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return setclickdestinationbackupuriOnExtraCallbackWithResult;
    }

    public final setClickDestinationBackupUri onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackDefault + 89;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1628982527, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.fillPrimaryButtonColors (TdsButtonV1Defaults.kt:72)");
        }
        setClickDestinationBackupUri setclickdestinationbackupuriOnExtraCallbackWithResult = onExtraCallbackWithResult(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return setclickdestinationbackupuriOnExtraCallbackWithResult;
    }

    public final setClickDestinationBackupUri onExtraCallbackWithResult(@NotNull y2 y2Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickDestinationBackupUri setclickdestinationbackupuriOnActivityResized = y2Var.onActivityResized();
        if (setclickdestinationbackupuriOnActivityResized != null) {
            int i2 = IAuthTabCallbackStub + 21;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return setclickdestinationbackupuriOnActivityResized;
        }
        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
        Object[] objArr = {y2Var, authParams.FillBrand};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
        Object[] objArr2 = {y2Var, authParams.TextOnFillBrand};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        float f = 0.0f;
        float f2 = 0.1f;
        float f3 = 0.3f;
        float f4 = 0.0f;
        setClickDestinationBackupUri setclickdestinationbackupuri = new setClickDestinationBackupUri(onwarmupcompleted, jLongValue, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr2, -1868498688, iOnWarmupCompleted4)).longValue(), f, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillBrandGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillBrandGradientEnd), f2, f3, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonLoaderFill), f4, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 14856, null);
        int iOnWarmupCompleted5 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted6 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var, setclickdestinationbackupuri}, -981719394, iOnWarmupCompleted5, iOnWarmupCompleted6, 981719397, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return setclickdestinationbackupuri;
    }

    public final setClickDestinationBackupUri onTransact(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 43;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(277838004, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.weakPrimaryButtonColors (TdsButtonV1Defaults.kt:107)");
            if (i6 == 0) {
                throw null;
            }
        }
        setClickDestinationBackupUri setclickdestinationbackupuriAsInterface = asInterface(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallbackStub + 11;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 == 0) {
                int i9 = 27 / 0;
            }
            int i10 = IAuthTabCallbackDefault + 15;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
        }
        return setclickdestinationbackupuriAsInterface;
    }

    public final setClickDestinationBackupUri onWarmupCompleted(long j, long j2, long j3, long j4, long j5, long j6, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long jOnTransact;
        long j7;
        long jOnTransact2;
        long j8;
        long jOnTransact3;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallbackDefault + 45;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnTransact4 = (i2 & 2) != 0 ? setByteOrder.Companion.onTransact() : j2;
        if ((i2 & 4) != 0) {
            long jOnTransact5 = setByteOrder.Companion.onTransact();
            int i6 = IAuthTabCallbackDefault + 69;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            j7 = jOnTransact5;
        } else {
            j7 = j3;
        }
        long jOnTransact6 = (i2 & 8) != 0 ? setByteOrder.Companion.onTransact() : j4;
        if ((i2 & 16) != 0) {
            int i8 = IAuthTabCallbackStub + 67;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jOnTransact2 = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact2 = j5;
        }
        if ((i2 & 32) != 0) {
            int i9 = IAuthTabCallbackDefault + 15;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                jOnTransact3 = setByteOrder.Companion.onTransact();
                int i10 = 46 / 0;
            } else {
                jOnTransact3 = setByteOrder.Companion.onTransact();
            }
            j8 = jOnTransact3;
        } else {
            j8 = j6;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-783509866, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.weakPrimaryButtonColors (TdsButtonV1Defaults.kt:118)");
        }
        setClickDestinationBackupUri setclickdestinationbackupuriOnExtraCallback = setClickDestinationBackupUri.onExtraCallback(asInterface(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)), jOnTransact, jOnTransact4, 0.0f, j7, jOnTransact6, 0.0f, 0.0f, jOnTransact2, 0.0f, j8, 0.0f, 0.0f, 0.0f, null, 15716, null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return setclickdestinationbackupuriOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final setClickDestinationBackupUri asInterface(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        long jLongValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickDestinationBackupUri setclickdestinationbackupuriPrefetchWithMultipleUrls = y2Var.prefetchWithMultipleUrls();
        if (setclickdestinationbackupuriPrefetchWithMultipleUrls != null) {
            return setclickdestinationbackupuriPrefetchWithMultipleUrls;
        }
        int i4 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
        Object[] objArr = {y2Var, authParams.FillBrandWeak};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
        Object[] objArr2 = {y2Var, authParams.TextBrand};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue3 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr2, -1868498688, iOnWarmupCompleted4)).longValue();
        float f = IAuthTabCallback;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillBrandWeakGradientStart);
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillBrandWeakGradientEnd);
        long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonLoaderFillBrandWeak);
        float f2 = onNavigationEvent;
        int i6 = IAuthTabCallback.IAuthTabCallback[y2Var.ITrustedWebActivityServiceStubProxy().AudioAttributesCompatParcelizer().ordinal()];
        if (i6 == 1) {
            Object[] objArr3 = {y2Var, authParams.FillBrand};
            int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, objArr3, -1868498688, iOnWarmupCompleted6)).longValue();
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = IAuthTabCallbackStub + 41;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                jLongValue = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonStateLayerFill);
                int i8 = 9 / 0;
            } else {
                jLongValue = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonStateLayerFill);
            }
        }
        setClickDestinationBackupUri setclickdestinationbackupuri = new setClickDestinationBackupUri(onwarmupcompleted, jLongValue2, jLongValue3, f, jOnExtraCallback, jOnExtraCallback2, 0.5f, 0.4f, jOnExtraCallback3, f2, jLongValue, 0.0f, 0.0f, 1.0f, 6144, null);
        y2Var.asInterface(setclickdestinationbackupuri);
        return setclickdestinationbackupuri;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setBody setbody = (setBody) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallbackDefault + 109;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1299348284, iIntValue, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.fillDangerButtonColors (TdsButtonV1Defaults.kt:148)");
            if (i5 != 0) {
                int i6 = 73 / 0;
            }
        }
        setClickDestinationBackupUri setclickdestinationbackupuriOnNavigationEvent = setbody.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i7 = IAuthTabCallbackDefault + 113;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 != 0) {
                throw null;
            }
        }
        return setclickdestinationbackupuriOnNavigationEvent;
    }

    public final setClickDestinationBackupUri onNavigationEvent(@NotNull y2 y2Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y2Var, "");
            y2Var.extraCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickDestinationBackupUri setclickdestinationbackupuriExtraCallback = y2Var.extraCallback();
        if (setclickdestinationbackupuriExtraCallback != null) {
            return setclickdestinationbackupuriExtraCallback;
        }
        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Danger;
        Object[] objArr = {y2Var, authParams.FillDanger};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
        Object[] objArr2 = {y2Var, authParams.TextOnFill};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        float f = 0.0f;
        float f2 = 0.5f;
        float f3 = 0.3f;
        float f4 = 0.0f;
        setClickDestinationBackupUri setclickdestinationbackupuri = new setClickDestinationBackupUri(onwarmupcompleted, jLongValue, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr2, -1868498688, iOnWarmupCompleted4)).longValue(), f, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillDangerGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillDangerGradientEnd), f2, f3, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonLoaderFill), f4, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 14856, null);
        y2Var.onExtraCallback(setclickdestinationbackupuri);
        int i3 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return setclickdestinationbackupuri;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final setClickDestinationBackupUri onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-683899673, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.weakDangerButtonColors (TdsButtonV1Defaults.kt:183)");
            }
        } else if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
        }
        setClickDestinationBackupUri setclickdestinationbackupuriOnWarmupCompleted = onWarmupCompleted(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = IAuthTabCallbackDefault + 123;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return setclickdestinationbackupuriOnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final setClickDestinationBackupUri onWarmupCompleted(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        long jOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickDestinationBackupUri setclickdestinationbackupuriPostMessage = y2Var.postMessage();
        if (setclickdestinationbackupuriPostMessage != null) {
            return setclickdestinationbackupuriPostMessage;
        }
        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Danger;
        Object[] objArr = {y2Var, authParams.FillDangerWeak};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
        Object[] objArr2 = {y2Var, authParams.TextDanger};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr2, -1868498688, iOnWarmupCompleted4)).longValue();
        float f = IAuthTabCallback;
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillDangerWeakGradientStart);
        long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillDangerWeakGradientEnd);
        long jOnExtraCallback4 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonLoaderFillDangerWeak);
        float f2 = onNavigationEvent;
        int i2 = IAuthTabCallback.IAuthTabCallback[y2Var.ITrustedWebActivityServiceStubProxy().AudioAttributesCompatParcelizer().ordinal()];
        if (i2 == 1) {
            Object[] objArr3 = {y2Var, authParams.FillDanger};
            int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            long jLongValue3 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, objArr3, -1868498688, iOnWarmupCompleted6)).longValue();
            int i3 = IAuthTabCallbackStub + 83;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 5;
            }
            jOnExtraCallback = jLongValue3;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = IAuthTabCallbackStub + 105;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonStateLayerFill);
        }
        setClickDestinationBackupUri setclickdestinationbackupuri = new setClickDestinationBackupUri(onwarmupcompleted, jLongValue, jLongValue2, f, jOnExtraCallback2, jOnExtraCallback3, 0.7f, 0.4f, jOnExtraCallback4, f2, jOnExtraCallback, 0.0f, 0.0f, 1.0f, 6144, null);
        y2Var.onWarmupCompleted(setclickdestinationbackupuri);
        return setclickdestinationbackupuri;
    }

    public final setClickDestinationBackupUri onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1341809463, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.fillDarkButtonColors (TdsButtonV1Defaults.kt:224)");
        }
        Object[] objArr = {this, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        setClickDestinationBackupUri setclickdestinationbackupuri = (setClickDestinationBackupUri) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1734673021, 1734673023);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallbackStub + 77;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i4 == 0) {
                int i5 = 88 / 0;
            }
            int i6 = IAuthTabCallbackDefault + 55;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            return setclickdestinationbackupuri;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b8, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ba, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r5 = o.setCallToAction.onWarmupCompleted.Dark;
        r10 = new java.lang.Object[]{r1, o.authParams.FillNeutral};
        r9 = im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        r12 = im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        r6 = ((java.lang.Long) o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), r9, r10, -1868498688, r12)).longValue();
        r17 = new java.lang.Object[]{r1, o.authParams.TextOnFill};
        r16 = im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        r19 = im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        r10 = 0.0f;
        r15 = 0.7f;
        r16 = 0.2f;
        r19 = 0.0f;
        r0 = new o.setClickDestinationBackupUri(r5, r6, ((java.lang.Long) o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), r16, r17, -1868498688, r19)).longValue(), r10, o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(r1, o.eExternalSyntheticLambda0.ButtonGradientLayerFillDarkGradientStart), o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(r1, o.eExternalSyntheticLambda0.ButtonGradientLayerFillDarkGradientEnd), r15, r16, o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(r1, o.eExternalSyntheticLambda0.ButtonLoaderFill), r19, o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(r1, o.eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 14856, null);
        r1.onNavigationEvent(r0);
        r1 = o.setBody.IAuthTabCallbackDefault + 25;
        o.setBody.IAuthTabCallbackStub = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setClickDestinationBackupUri typedObject;
        y2 y2Var = (y2) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(y2Var, "");
            typedObject = y2Var.readTypedObject();
            int i3 = 73 / 0;
        } else {
            Intrinsics.checkNotNullParameter(y2Var, "");
            typedObject = y2Var.readTypedObject();
        }
    }

    public final setClickDestinationBackupUri IAuthTabCallbackStub(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2121525964, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.weakDarkButtonColors (TdsButtonV1Defaults.kt:259)");
        }
        setClickDestinationBackupUri setclickdestinationbackupuriIAuthTabCallbackStub = IAuthTabCallbackStub(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackDefault + 53;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        return setclickdestinationbackupuriIAuthTabCallbackStub;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final setClickDestinationBackupUri IAuthTabCallbackStub(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        long jLongValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        setClickDestinationBackupUri setclickdestinationbackupuri = (setClickDestinationBackupUri) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, 1372151283, iOnWarmupCompleted, iOnWarmupCompleted2, -1372151283, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        if (setclickdestinationbackupuri != null) {
            return setclickdestinationbackupuri;
        }
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
        Object[] objArr = {y2Var, authParams.FillNeutralWeak};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr, -1868498688, iOnWarmupCompleted4)).longValue();
        Object[] objArr2 = {y2Var, authParams.TextSecondary};
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue3 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, objArr2, -1868498688, iOnWarmupCompleted6)).longValue();
        float f = IAuthTabCallback;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillDarkWeakGradientStart);
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillDarkWeakGradientEnd);
        long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonLoaderFillNeutralWeak);
        float f2 = onNavigationEvent;
        int i4 = IAuthTabCallback.IAuthTabCallback[y2Var.ITrustedWebActivityServiceStubProxy().AudioAttributesCompatParcelizer().ordinal()];
        if (i4 != 1) {
            int i5 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jLongValue = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonStateLayerFill);
        } else {
            Object[] objArr3 = {y2Var, authParams.FillNeutral};
            int iOnWarmupCompleted7 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted8 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted7, objArr3, -1868498688, iOnWarmupCompleted8)).longValue();
        }
        setClickDestinationBackupUri setclickdestinationbackupuri2 = new setClickDestinationBackupUri(onwarmupcompleted, jLongValue2, jLongValue3, f, jOnExtraCallback, jOnExtraCallback2, 0.24f, 0.14f, jOnExtraCallback3, f2, jLongValue, 0.0f, 0.0f, 1.0f, 6144, null);
        y2Var.IAuthTabCallbackStub(setclickdestinationbackupuri2);
        return setclickdestinationbackupuri2;
    }

    public final setClickDestinationBackupUri IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = IAuthTabCallbackStub + 57;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(614950315, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.fillLightButtonColors (TdsButtonV1Defaults.kt:300)");
        }
        setClickDestinationBackupUri setclickdestinationbackupuriOnExtraCallback = onExtraCallback(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackDefault + 107;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                throw null;
            }
            int i7 = IAuthTabCallbackStub + 93;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return setclickdestinationbackupuriOnExtraCallback;
    }

    public final setClickDestinationBackupUri onExtraCallback(@NotNull y2 y2Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickDestinationBackupUri setclickdestinationbackupuriOnMessageChannelReady = y2Var.onMessageChannelReady();
        if (setclickdestinationbackupuriOnMessageChannelReady != null) {
            int i4 = IAuthTabCallbackStub + 117;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return setclickdestinationbackupuriOnMessageChannelReady;
        }
        setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Light;
        Object[] objArr = {y2Var, authParams.FillInverse};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        float f = 0.0f;
        float f2 = 0.5f;
        float f3 = 0.3f;
        float f4 = 0.0f;
        setClickDestinationBackupUri setclickdestinationbackupuri = new setClickDestinationBackupUri(onwarmupcompleted, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonTextInverse), f, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillInverseGradientStart), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillInverseGradientEnd), f2, f3, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonLoaderFillInverse), f4, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonStateLayerFill), 0.0f, 0.0f, 0.0f, 14856, null);
        y2Var.onExtraCallbackWithResult(setclickdestinationbackupuri);
        return setclickdestinationbackupuri;
    }

    public final setClickDestinationBackupUri asInterface(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2081424736, i, -1, "im.toss.tds.compose.component.atom.button.TdsButtonV1Defaults.weakLightButtonColors (TdsButtonV1Defaults.kt:335)");
        }
        setClickDestinationBackupUri setclickdestinationbackupuriIAuthTabCallbackDefault = IAuthTabCallbackDefault(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 43;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        return setclickdestinationbackupuriIAuthTabCallbackDefault;
    }

    public final setClickDestinationBackupUri IAuthTabCallbackDefault(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickDestinationBackupUri setclickdestinationbackupuriNewSession = y2Var.newSession();
        if (setclickdestinationbackupuriNewSession == null) {
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Light;
            Object[] objArr = {y2Var, authParams.FillInverseWeak};
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
            Object[] objArr2 = {y2Var, authParams.TextOnFill};
            int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr2, -1868498688, iOnWarmupCompleted4)).longValue();
            float f = IAuthTabCallback;
            long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillInverseWeakGradientStart);
            long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonGradientLayerFillInverseWeakGradientEnd);
            long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.ButtonLoaderFill);
            float f2 = onNavigationEvent;
            Object[] objArr3 = {y2Var, authParams.FillInverse};
            int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            float f3 = 0.7f;
            float f4 = 0.4f;
            setclickdestinationbackupuriNewSession = new setClickDestinationBackupUri(onwarmupcompleted, jLongValue, jLongValue2, f, jOnExtraCallback, jOnExtraCallback2, f3, f4, jOnExtraCallback3, f2, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, objArr3, -1868498688, iOnWarmupCompleted6)).longValue(), 0.0f, 0.0f, 1.0f, 6144, null);
            y2Var.onTransact(setclickdestinationbackupuriNewSession);
            int i4 = IAuthTabCallbackDefault + 89;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 96 / 0;
            }
        }
        return setclickdestinationbackupuriNewSession;
    }

    public final setClickDestinationBackupUri onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (setClickDestinationBackupUri) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1139916351, 1139916351);
    }

    public final setClickDestinationBackupUri IAuthTabCallback(@NotNull y2 y2Var) {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (setClickDestinationBackupUri) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this, y2Var}, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1734673021, 1734673023);
    }

    public final float onWarmupCompleted() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((Float) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1793951373, -1793951370)).floatValue();
    }

    public final float IAuthTabCallback() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((Float) onWarmupCompleted(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1164115063, 1164115064)).floatValue();
    }
}
