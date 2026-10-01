package im.toss.tds.compose.component.compound.chip.v1;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.tds.compose.R;
import im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplc;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.deprecated_followRedirects;
import o.needCorrectJpegMetadata;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.setByteOrder;
import o.v2;
import o.v2a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RightAccessorySlotMarker
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RightAccessoryPreset {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final RightAccessoryPreset onWarmupCompleted = new RightAccessoryPreset();

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
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
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[v2.onExtraCallback.values().length];
            try {
                iArr2[v2.onExtraCallback.Pill.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v2.onExtraCallback.Square.ordinal()] = 2;
                int i = onNavigationEvent + 27;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr2;
            int i3 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 75;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i3)) | (~(i7 | i2));
        int i9 = (~i3) | i6;
        int i10 = ~(i9 | i2);
        int i11 = (~(i3 | (~i2))) | (~i9);
        int i12 = i6 + i2 + i4 + (243328196 * i5) + (549715570 * i);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i6) + 1264254976 + ((-1099560353) * i2) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i4) + (781713408 * i5) + (665583616 * i) + (1005256704 * i13);
        int i15 = (i6 * 1467389705) + 421362043 + (i2 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i4 * 1467388771) + (i5 * (-1383267380)) + (i * 1030937622) + (i13 * 484507648);
        int i16 = i14 + (i15 * i15 * 1164771328);
        return i16 != 1 ? i16 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RightAccessoryPreset rightAccessoryPreset = (RightAccessoryPreset) objArr[0];
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        String str = (String) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue3 = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rightAccessoryPreset, deprecated_followredirects, quirksExternalSyntheticBackport0, jLongValue, str, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(RightAccessoryPreset rightAccessoryPreset, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 63;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        rightAccessoryPreset.onExtraCallback(i, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(RightAccessoryPreset rightAccessoryPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        rightAccessoryPreset.onNavigationEvent(quirksExternalSyntheticBackport0, j, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 47;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(RightAccessoryPreset rightAccessoryPreset, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        rightAccessoryPreset.onExtraCallbackWithResult(deprecated_followredirects, quirksExternalSyntheticBackport0, j, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 1;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 56 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RightAccessoryPreset rightAccessoryPreset = (RightAccessoryPreset) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        String str = (String) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rightAccessoryPreset, quirksExternalSyntheticBackport0, jLongValue, str, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(RightAccessoryPreset rightAccessoryPreset, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 19;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rightAccessoryPreset, i, quirksExternalSyntheticBackport0, j, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallback + 13;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(RightAccessoryPreset rightAccessoryPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 47;
        onExtraCallback = i5 % 128;
        rightAccessoryPreset.onWarmupCompleted(quirksExternalSyntheticBackport0, j, str, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 109;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(RightAccessoryPreset rightAccessoryPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rightAccessoryPreset, quirksExternalSyntheticBackport0, j, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 21 / 0;
        }
        return unitIAuthTabCallback;
    }

    private RightAccessoryPreset() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        long j2;
        int i5;
        String str2;
        int i6;
        int i7;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j3;
        final String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jAccess100;
        String str4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i8 = 2 % 2;
        int i9 = onExtraCallback + 83;
        IAuthTabCallback = i9 % 128;
        boolean z = false;
        if (i9 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1014815097);
            i3 = 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1014815097);
            i3 = i2 & 1;
            if (i3 != 0) {
                i4 = i | 6;
            }
            if ((i & 48) != 0) {
                int i10 = IAuthTabCallback + 27;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
                    j2 = j;
                } else {
                    j2 = j;
                    int i11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 32 : 16;
                    i4 |= i11;
                }
                i4 |= i11;
            } else {
                j2 = j;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    str2 = str;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                        int i12 = IAuthTabCallback + 53;
                        onExtraCallback = i12 % 128;
                        i6 = i12 % 2 != 0 ? 32460 : 256;
                    } else {
                        i6 = 128;
                    }
                    i7 = i6 | i4;
                }
                if ((i & 3072) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 2048 : 1024;
                }
                if ((i7 & 1171) != 1170) {
                    int i13 = onExtraCallback + 105;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                    int i15 = onExtraCallback + 25;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if (i16 != 0 ? (i & 1) == 0 : (i & 1) == 0) {
                        if (i3 != 0) {
                            quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                        }
                        if ((i2 & 2) != 0) {
                            jAccess100 = ((setByteOrder) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2.onExtraCallback.IAuthTabCallback_Parcel())).access100();
                            i7 &= -113;
                        } else {
                            jAccess100 = j2;
                        }
                        if (i5 != 0) {
                            int i17 = onExtraCallback + 125;
                            IAuthTabCallback = i17 % 128;
                            int i18 = i17 % 2;
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1014815097, i7, -1, "im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset.Dropdown (RightAccessoryPreset.kt:26)");
                        }
                        int i19 = R.drawable.icn_chip_arrow_down_mono;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        v2 v2Var = v2.onExtraCallback;
                        AppLovinNativeAdImplc.onExtraCallback(i19, IAuthTabCallback(onextracallback, (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.asInterface()), (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.IAuthTabCallbackStubProxy()), (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(quirksExternalSyntheticBackport03), jAccess100, null, null, null, null, null, str4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i7 << 3) & 896) | ((i7 << 18) & 234881024), 248);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        str3 = str4;
                        j3 = jAccess100;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    } else {
                        int i20 = onExtraCallback + 73;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 2) != 0) {
                                i7 &= -113;
                            }
                            jAccess100 = j2;
                        }
                        str4 = str2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        int i192 = R.drawable.icn_chip_arrow_down_mono;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                        v2 v2Var2 = v2.onExtraCallback;
                        AppLovinNativeAdImplc.onExtraCallback(i192, IAuthTabCallback(onextracallback2, (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var2.asInterface()), (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var2.IAuthTabCallbackStubProxy()), (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(quirksExternalSyntheticBackport03), jAccess100, null, null, null, null, null, str4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i7 << 3) & 896) | ((i7 << 18) & 234881024), 248);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        str3 = str4;
                        j3 = jAccess100;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    j3 = j2;
                    str3 = str2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = 2 % 2;
                            int i23 = onWarmupCompleted + 57;
                            onExtraCallback = i23 % 128;
                            if (i23 % 2 == 0) {
                                RightAccessoryPreset.onNavigationEvent(this.f$0, quirksExternalSyntheticBackport02, j3, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            Unit unitOnNavigationEvent = RightAccessoryPreset.onNavigationEvent(this.f$0, quirksExternalSyntheticBackport02, j3, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i24 = onWarmupCompleted + 85;
                            onExtraCallback = i24 % 128;
                            if (i24 % 2 == 0) {
                                int i25 = 67 / 0;
                            }
                            return unitOnNavigationEvent;
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 384;
            str2 = str;
            i7 = i4;
            if ((i & 3072) == 0) {
            }
            if ((i7 & 1171) != 1170) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 6) == 0) {
            int i22 = onExtraCallback + 1;
            IAuthTabCallback = i22 % 128;
            if (i22 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                throw null;
            }
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) != 0) {
        }
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        str2 = str;
        i7 = i4;
        if ((i & 3072) == 0) {
        }
        if ((i7 & 1171) != 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        long jAccess100;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final String str2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        int i6;
        String str3 = str;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(805857682);
        int i8 = i2 & 1;
        if (i8 != 0) {
            int i9 = IAuthTabCallback + 35;
            onExtraCallback = i9 % 128;
            i3 = i9 % 2 != 0 ? i | 25 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jAccess100 = j;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jAccess100)) {
                    int i10 = onExtraCallback + 23;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    i6 = 32;
                }
                i3 |= i6;
            } else {
                jAccess100 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            jAccess100 = j;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            int i13 = IAuthTabCallback + 107;
            onExtraCallback = i13 % 128;
            i3 = i13 % 2 != 0 ? i3 | 3301 : i3 | 384;
        } else if ((i & 384) == 0) {
            int i14 = onExtraCallback + 101;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 41 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
            }
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i16 = onExtraCallback + 61;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                quirksExternalSyntheticBackport04 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if ((i2 & 2) != 0) {
                    int i18 = IAuthTabCallback + 65;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    jAccess100 = ((setByteOrder) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2.onExtraCallback.IAuthTabCallback_Parcel())).access100();
                    i3 &= -113;
                }
                if (i12 != 0) {
                    str3 = null;
                }
            } else {
                int i20 = onExtraCallback + 25;
                IAuthTabCallback = i20 % 128;
                int i21 = i20 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            }
            long j2 = jAccess100;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(805857682, i3, -1, "im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset.Close (RightAccessoryPreset.kt:46)");
            }
            int i22 = R.drawable.icn_chip_x_mono;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            v2 v2Var = v2.onExtraCallback;
            AppLovinNativeAdImplc.onExtraCallback(i22, IAuthTabCallback(onextracallback, (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.asInterface()), (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.IAuthTabCallbackStubProxy()), (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(quirksExternalSyntheticBackport04), j2, null, null, null, null, null, str3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 896) | ((i3 << 18) & 234881024), 248);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i23 = IAuthTabCallback + 115;
                onExtraCallback = i23 % 128;
                int i24 = i23 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            str2 = str3;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            jAccess100 = j2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            str2 = str3;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final long j3 = jAccess100;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i25 = 2 % 2;
                    int i26 = onWarmupCompleted + 27;
                    onExtraCallbackWithResult = i26 % 128;
                    int i27 = i26 % 2;
                    RightAccessoryPreset rightAccessoryPreset = this.f$0;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                    long j4 = j3;
                    String str4 = str2;
                    int i28 = i;
                    int i29 = i2;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {rightAccessoryPreset, quirksExternalSyntheticBackport05, Long.valueOf(j4), str4, Integer.valueOf(i28), Integer.valueOf(i29), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) RightAccessoryPreset.IAuthTabCallback(zzgsa.onWarmupCompleted(), -1110635488, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, 1110635490);
                    int i30 = onExtraCallbackWithResult + 61;
                    onWarmupCompleted = i30 % 128;
                    if (i30 % 2 != 0) {
                        int i31 = 16 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r0
      0x0049: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r0
      0x0032: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        long jOnTransact;
        int i5;
        String str2;
        int i6;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final long j2;
        final String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i7 = 2 % 2;
        int i8 = IAuthTabCallback + 107;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-860699509);
            if ((i & 114) != 0) {
                i3 = i;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects)) {
                int i9 = IAuthTabCallback + 103;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2 != 0 ? 2 : 4;
                i3 = i10 | i;
            }
        } else {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-860699509);
            if ((i & 6) == 0) {
            }
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    jOnTransact = j;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        str2 = str;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                            int i12 = onExtraCallback + 115;
                            IAuthTabCallback = i12 % 128;
                            i6 = i12 % 2 == 0 ? 20170 : 2048;
                        } else {
                            i6 = 1024;
                        }
                        i3 |= i6;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 16384 : 8192;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        j2 = jOnTransact;
                        str3 = str2;
                    } else {
                        int i13 = onExtraCallback + 35;
                        IAuthTabCallback = i13 % 128;
                        int i14 = i13 % 2;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if (i4 != 0) {
                            jOnTransact = setByteOrder.Companion.onTransact();
                        }
                        long j3 = jOnTransact;
                        Object obj = null;
                        String str4 = i5 != 0 ? null : str2;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i15 = onExtraCallback + 59;
                            IAuthTabCallback = i15 % 128;
                            if (i15 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-860699509, i3, -1, "im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset.Icon (RightAccessoryPreset.kt:68)");
                                obj.hashCode();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-860699509, i3, -1, "im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset.Icon (RightAccessoryPreset.kt:68)");
                        }
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        v2 v2Var = v2.onExtraCallback;
                        String str5 = str4;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, ((QuirksExternalSyntheticBackport0) IAuthTabCallback(zzgsa.onWarmupCompleted(), 1424605925, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{this, onextracallback, (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.asInterface()), (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.IAuthTabCallbackStubProxy())}, -1424605924)).onExtraCallback(quirksExternalSyntheticBackport04), j3, null, null, null, null, null, str5, cameraCaptureResultEmptyCameraCaptureResult2, (i3 & 910) | ((i3 << 15) & 234881024), 248);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i16 = onExtraCallback + 61;
                            IAuthTabCallback = i16 % 128;
                            int i17 = i16 % 2;
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        str3 = str4;
                        j2 = j3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i18 = 2 % 2;
                                int i19 = onNavigationEvent + 109;
                                onExtraCallback = i19 % 128;
                                Object obj4 = null;
                                if (i19 % 2 == 0) {
                                    RightAccessoryPreset rightAccessoryPreset = this.f$0;
                                    deprecated_followRedirects deprecated_followredirects2 = deprecated_followredirects;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                    long j4 = j2;
                                    String str6 = str3;
                                    int i20 = i;
                                    int i21 = i2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    Object[] objArr = {rightAccessoryPreset, deprecated_followredirects2, quirksExternalSyntheticBackport05, Long.valueOf(j4), str6, Integer.valueOf(i20), Integer.valueOf(i21), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                    obj4.hashCode();
                                    throw null;
                                }
                                RightAccessoryPreset rightAccessoryPreset2 = this.f$0;
                                deprecated_followRedirects deprecated_followredirects3 = deprecated_followredirects;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                                long j5 = j2;
                                String str7 = str3;
                                int i22 = i;
                                int i23 = i2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                Object[] objArr2 = {rightAccessoryPreset2, deprecated_followredirects3, quirksExternalSyntheticBackport06, Long.valueOf(j5), str7, Integer.valueOf(i22), Integer.valueOf(i23), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                                Unit unit = (Unit) RightAccessoryPreset.IAuthTabCallback(zzgsa.onWarmupCompleted(), 2116857085, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr2, -2116857085);
                                int i24 = onExtraCallback + 109;
                                onNavigationEvent = i24 % 128;
                                if (i24 % 2 == 0) {
                                    return unit;
                                }
                                obj4.hashCode();
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                int i18 = onExtraCallback + 41;
                IAuthTabCallback = i18 % 128;
                i3 = i18 % 2 == 0 ? i3 | 30589 : i3 | 3072;
                str2 = str;
                if ((i & 24576) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            jOnTransact = j;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            str2 = str;
            if ((i & 24576) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        jOnTransact = j;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        long j2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jOnTransact;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1075443709);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            int i9 = IAuthTabCallback + 87;
            onExtraCallback = i9 % 128;
            i4 = i9 % 2 != 0 ? i4 | 41 : i4 | 48;
        } else if ((i2 & 48) == 0) {
            int i10 = IAuthTabCallback + 73;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 60 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03)) {
            }
            i4 |= i5;
        }
        int i12 = i3 & 4;
        if (i12 == 0) {
            if ((i2 & 384) == 0) {
                j2 = j;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ^ true ? 128 : 256;
            }
            if ((i2 & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                    int i13 = onExtraCallback + 21;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            } else {
                if (i8 != 0) {
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                }
                if (i12 != 0) {
                    int i15 = IAuthTabCallback + 1;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        setByteOrder.Companion.onTransact();
                        throw null;
                    }
                    jOnTransact = setByteOrder.Companion.onTransact();
                } else {
                    jOnTransact = j2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1075443709, i4, -1, "im.toss.tds.compose.component.compound.chip.v1.RightAccessoryPreset.Number (RightAccessoryPreset.kt:119)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                v2 v2Var = v2.onExtraCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{String.valueOf(i), onWarmupCompleted(onextracallback, (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.asInterface()), (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.IAuthTabCallbackStubProxy())).onExtraCallback(quirksExternalSyntheticBackport03), null, Long.valueOf(jOnTransact), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 << 3) & 7168), 0, 131060}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i16 = onExtraCallback + 115;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                j2 = jOnTransact;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new RightAccessoryPreset$.ExternalSyntheticLambda0(this, i, quirksExternalSyntheticBackport02, j2, i2, i3));
                return;
            }
            return;
        }
        int i18 = IAuthTabCallback + 103;
        onExtraCallback = i18 % 128;
        i4 = i18 % 2 != 0 ? i4 | 6548 : i4 | 384;
        j2 = j;
        if ((i2 & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull v2.onExtraCallback onextracallback, @NotNull v2.onWarmupCompleted onwarmupcompleted, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) throws NoWhenBranchMatchedException {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        float fIAuthTabCallback3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        float fE_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.e_(v2a.onNavigationEvent.onExtraCallbackWithResult(onwarmupcompleted).IAuthTabCallbackStub());
        if (fE_ < 19.0f) {
            int i2 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i2 == 1) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f);
            }
        } else if (19.0f <= fE_) {
            int i3 = onExtraCallback;
            int i4 = i3 + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (fE_ < 28.0f) {
                int i6 = i3 + 13;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f);
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            }
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
        int[] iArr = WhenMappings.IAuthTabCallback;
        int i8 = iArr[onextracallback.ordinal()];
        if (i8 == 1) {
            int i9 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i9 == 1) {
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i10 = onExtraCallback + 59;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
            }
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i12 == 1) {
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i13 = IAuthTabCallback + 49;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
            }
        }
        float f = fIAuthTabCallback2;
        int i15 = iArr[onextracallback.ordinal()];
        if (i15 == 1) {
            int i16 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i16 == 1) {
                fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f);
            } else {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
            }
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i17 = IAuthTabCallback + 115;
            onExtraCallback = i17 % 128;
            int i18 = i17 % 2;
            int i19 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f);
            } else {
                fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
            }
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, f, 0.0f, fIAuthTabCallback3, 0.0f, 10, (Object) null), fIAuthTabCallback));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        float fIAuthTabCallback3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        v2.onExtraCallback onextracallback = (v2.onExtraCallback) objArr[2];
        v2.onWarmupCompleted onwarmupcompleted = (v2.onWarmupCompleted) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
        int[] iArr = WhenMappings.IAuthTabCallback;
        int i2 = iArr[onextracallback.ordinal()];
        if (i2 == 1) {
            int i3 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i3 == 1) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i4 == 1) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
                int i5 = onExtraCallback + 63;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 2;
                }
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
            }
        }
        int i7 = iArr[onextracallback.ordinal()];
        if (i7 == 1) {
            int i8 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i8 == 1) {
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
            }
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = onExtraCallback + 57;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
            } else {
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, fIAuthTabCallback, 0.0f, fIAuthTabCallback2, 0.0f, 10, (Object) null);
        int i12 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
        if (i12 == 1) {
            fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i13 = onExtraCallback + 31;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f);
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, fIAuthTabCallback3));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull v2.onExtraCallback onextracallback, @NotNull v2.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        float fIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
        int i4 = WhenMappings.IAuthTabCallback[onextracallback.ordinal()];
        if (i4 == 1) {
            int i5 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i5 == 1) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
            }
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = onExtraCallback + 93;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = WhenMappings.onWarmupCompleted[onwarmupcompleted.ordinal()];
            if (i8 != 1) {
                int i9 = IAuthTabCallback + 71;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
                int i11 = IAuthTabCallback + 95;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, fIAuthTabCallback2, 0.0f, fIAuthTabCallback, 0.0f, 10, (Object) null));
        int i13 = onExtraCallback + 47;
        IAuthTabCallback = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 22 / 0;
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightAccessoryPreset rightAccessoryPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {rightAccessoryPreset, quirksExternalSyntheticBackport0, Long.valueOf(j), str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), -1110635488, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, 1110635490);
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightAccessoryPreset rightAccessoryPreset, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {rightAccessoryPreset, deprecated_followredirects, quirksExternalSyntheticBackport0, Long.valueOf(j), str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(zzgsa.onWarmupCompleted(), 2116857085, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, -2116857085);
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull v2.onExtraCallback onextracallback, @NotNull v2.onWarmupCompleted onwarmupcompleted) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(zzgsa.onWarmupCompleted(), 1424605925, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this, quirksExternalSyntheticBackport0, onextracallback, onwarmupcompleted}, -1424605924);
    }
}
