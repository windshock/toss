package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spanned;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.view.component.atom.text.Typography5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = i2 | i7 | i8;
        int i10 = ~(i | i7);
        int i11 = (~(i7 | i8)) | (~i2);
        int i12 = i2 + i3 + i4 + ((-1537480081) * i6) + ((-1176924877) * i5);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i2) - 1179058176) + ((-1443770816) * i3) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i4) + (1226178560 * i6) + ((-1044512768) * i5) + (1201733632 * i13);
        int i15 = (i2 * 1018573086) + 1206756779 + (i3 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i4 * 1018572655) + (i6 * (-758184159)) + (i5 * (-595421667)) + (i13 * (-1647378432));
        return i14 + ((i15 * i15) * 1518272512) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 95;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getDistanceBetweenPoints getdistancebetweenpoints, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function1 function1, boolean z, boolean z2, long j, long j2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getdistancebetweenpoints, str, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, function1, z, z2, j, j2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 121;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Spanned spanned = (Spanned) objArr[0];
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[5];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[6];
        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) objArr[7];
        Typography5 typography5 = (Typography5) objArr[8];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(spanned, r8lambdanm9dm2eewl4vrptnjmesfjqky4, zBooleanValue, jLongValue, jLongValue2, getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, extensionsManagerExtensionsAvailability, typography5);
        int i4 = onExtraCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Typography5 onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(getsupportedhighspeedresolutionsfor, context);
        }
        IAuthTabCallback(getsupportedhighspeedresolutionsfor, context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1107592999, 1107593000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 31;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(getDistanceBetweenPoints getdistancebetweenpoints, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function1 function1, boolean z, boolean z2, long j, long j2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(getdistancebetweenpoints, str, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, function1, z, z2, j, j2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 73;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.widget.TextView, im.toss.tds.view.component.atom.text.Typography5] */
    private static final Typography5 IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        ?? typography5 = new Typography5(context, null, 0, 6, null);
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(typography5.getTextColors());
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return typography5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(Spanned spanned, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z, long j, long j2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, Typography5 typography5) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typography5, "");
        typography5.setText(spanned);
        typography5.setPadding(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onNavigationEvent(extensionsManagerExtensionsAvailability)), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.IAuthTabCallback()), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(extensionsManagerExtensionsAvailability)), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onExtraCallback()));
        if (z) {
            typography5.onActivityLayout();
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        } else {
            typography5.setMovementMethod(null);
        }
        if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(j) == 0) {
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            typography5.setTextSize(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j));
        }
        if (j2 != 16) {
            typography5.setTextColor(ByteOrderedDataOutputStream.onNavigationEvent(j2));
        } else {
            ColorStateList colorStateList = (ColorStateList) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (colorStateList != null) {
                typography5.setTextColor(colorStateList);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032e A[PHI: r10
      0x032e: PHI (r10v8 boolean) = (r10v6 boolean), (r10v9 boolean) binds: [B:184:0x032c, B:180:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final getDistanceBetweenPoints getdistancebetweenpoints, @NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable Function1<? super String, Unit> function1, boolean z, boolean z2, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        long j3;
        int i8;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback;
        boolean z4;
        Function1<? super String, Unit> function12;
        boolean z5;
        long j4;
        long jOnNavigationEvent;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i9;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        boolean z6;
        boolean z7;
        int i10;
        boolean z8;
        boolean z9;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final boolean z13;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        final Function1<? super String, Unit> function13;
        final boolean z14;
        final long j5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(getdistancebetweenpoints, "");
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-663003627);
        if ((i & 48) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                int i13 = onExtraCallback + 49;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                int i15 = onNavigationEvent + 83;
                onExtraCallback = i15 % 128;
                if (i15 % 2 != 0 ? (i2 & 4) == 0 : i12 == 0) {
                    int i16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 2048 : 1024;
                    i3 |= i16;
                }
                i3 |= i16;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    int i17 = onNavigationEvent + 43;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 196608;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i & 196608) == 0) {
                        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3))) {
                            int i19 = onExtraCallback + 5;
                            onNavigationEvent = i19 % 128;
                            int i20 = i19 % 2;
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                        i3 |= i6;
                    }
                }
                if ((i & 1572864) == 0) {
                    i3 |= ((i2 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) ? 1048576 : 524288;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    int i21 = onNavigationEvent + 57;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    i3 |= 12582912;
                    j3 = j;
                } else {
                    j3 = j;
                    if ((i & 12582912) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 8388608 : 4194304;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((100663296 & i) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 67108864 : 33554432;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347921 & i3) != 38347920, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                    function13 = function1;
                    jOnNavigationEvent = j2;
                    z14 = z3;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    j5 = j3;
                    z13 = z2;
                } else {
                    int i23 = onExtraCallback + 37;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        if ((i2 & 4) != 0) {
                            deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult.IAuthTabCallback(), 0.0f, 2, (Object) null);
                            i3 &= -7169;
                            int i25 = onExtraCallback + 103;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                        } else {
                            deviceQuirksExternalSyntheticLambda0OnExtraCallback = deviceQuirksExternalSyntheticLambda0;
                        }
                        Function1<? super String, Unit> function14 = i4 != 0 ? null : function1;
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 32) != 0) {
                            int i27 = onExtraCallback + 27;
                            onNavigationEvent = i27 % 128;
                            if (i27 % 2 != 0) {
                                int i28 = 0 / 0;
                                z4 = function14 != null;
                            } else if (function14 != null) {
                            }
                            i3 &= -3670017;
                        } else {
                            z4 = z2;
                        }
                        long jOnTransact = i7 != 0 ? setByteOrder.Companion.onTransact() : j3;
                        function12 = function14;
                        z5 = z3;
                        j4 = jOnTransact;
                        jOnNavigationEvent = i8 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        i9 = i3;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnExtraCallback;
                        z6 = z4;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            int i29 = onNavigationEvent + 49;
                            onExtraCallback = i29 % 128;
                            int i30 = i29 % 2;
                            i3 &= -3670017;
                        }
                        function12 = function1;
                        z6 = z2;
                        jOnNavigationEvent = j2;
                        i9 = i3;
                        z5 = z3;
                        j4 = j3;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i31 = onNavigationEvent + 67;
                        onExtraCallback = i31 % 128;
                        if (i31 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-663003627, i9, -1, "im.toss.tds.compose.compat.component.atom.post.Html (TdsPostV2.kt:56)");
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-663003627, i9, -1, "im.toss.tds.compose.compat.component.atom.post.Html (TdsPostV2.kt:56)");
                    }
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    boolean z15 = (i9 & 112) == 32;
                    boolean z16 = (57344 & i9) == 16384;
                    boolean z17 = (458752 & i9) == 131072;
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(context);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((z15 | z16 | z17) || zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        z7 = false;
                        i10 = i9;
                        z8 = true;
                        z9 = z6;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        objOnMinimized = isExecuted.onNavigationEvent(isExecuted.IAuthTabCallback, str, new Object[0], context, null, function12, false, z5, null, 168, null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    } else {
                        i10 = i9;
                        z9 = z6;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        z7 = false;
                        z8 = true;
                    }
                    final Spanned spanned = (Spanned) objOnMinimized;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                    final ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                    final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.compat.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3) {
                                int i32 = 2 % 2;
                                int i33 = onWarmupCompleted + 111;
                                IAuthTabCallback = i33 % 128;
                                int i34 = i33 % 2;
                                Typography5 typography5OnNavigationEvent = r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI.onNavigationEvent(getsupportedhighspeedresolutionsfor, (Context) obj3);
                                int i35 = onWarmupCompleted + 3;
                                IAuthTabCallback = i35 % 128;
                                if (i35 % 2 != 0) {
                                    int i36 = 77 / 0;
                                }
                                return typography5OnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                    }
                    Function1 function15 = (Function1) objOnMinimized3;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(spanned);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                    int i32 = i10;
                    boolean z18 = ((((i32 & 7168) ^ 3072) <= 2048 || (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(deviceQuirksExternalSyntheticLambda02) ^ true)) && (i32 & 3072) != 2048) ? z7 : z8;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(extensionsManagerExtensionsAvailability.ordinal());
                    if (((3670016 & i32) ^ 1572864) > 1048576) {
                        z10 = z9;
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z10)) {
                            z11 = z8;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                            z12 = (234881024 & i32) != 67108864 ? z8 : z7;
                            if ((29360128 & i32) == 8388608) {
                                z7 = z8;
                            }
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!(zOnExtraCallback | zOnNavigationEvent2 | z18 | zOnExtraCallback2 | z11 | z12) && !z7) {
                                final boolean z19 = z10;
                                final long j6 = jOnNavigationEvent;
                                final long j7 = j4;
                                final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda02;
                                Function1 function16 = new Function1() { // from class: im.toss.tds.compose.compat.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda1
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj3) {
                                        int i33 = 2 % 2;
                                        int i34 = onWarmupCompleted + 73;
                                        onExtraCallbackWithResult = i34 % 128;
                                        int i35 = i34 % 2;
                                        Spanned spanned2 = spanned;
                                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                                        boolean z20 = z19;
                                        long j8 = j6;
                                        long j9 = j7;
                                        Object[] objArr = {spanned2, r8lambdanm9dm2eewl4vrptnjmesfjqky42, Boolean.valueOf(z20), Long.valueOf(j8), Long.valueOf(j9), getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda04, extensionsManagerExtensionsAvailability, (Typography5) obj3};
                                        Unit unit = (Unit) r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1649630750, 1649630750, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                                        int i36 = onExtraCallbackWithResult + 51;
                                        onWarmupCompleted = i36 % 128;
                                        if (i36 % 2 != 0) {
                                            return unit;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function16);
                                obj = function16;
                                CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function15, quirksExternalSyntheticBackport05, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult2, ((i32 >> 3) & 112) | 6, 0);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                z13 = z10;
                                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                                function13 = function12;
                                z14 = z5;
                                j5 = j4;
                            } else {
                                obj = objOnMinimized4;
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                }
                                CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function15, quirksExternalSyntheticBackport05, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult2, ((i32 >> 3) & 112) | 6, 0);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                z13 = z10;
                                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                                function13 = function12;
                                z14 = z5;
                                j5 = j4;
                            }
                        }
                    } else {
                        z10 = z9;
                    }
                    if ((i32 & 1572864) != 1048576) {
                        z11 = z7;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport02;
                    if ((234881024 & i32) != 67108864) {
                    }
                    if ((29360128 & i32) == 8388608) {
                    }
                    Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(zOnExtraCallback | zOnNavigationEvent2 | z18 | zOnExtraCallback2 | z11 | z12 | z7)) {
                    }
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final long j8 = jOnNavigationEvent;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.compat.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda2
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i33 = 2 % 2;
                            int i34 = onWarmupCompleted + 67;
                            onNavigationEvent = i34 % 128;
                            int i35 = i34 % 2;
                            Unit unitOnExtraCallback = r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI.onExtraCallback(getdistancebetweenpoints, str, quirksExternalSyntheticBackport03, deviceQuirksExternalSyntheticLambda03, function13, z14, z13, j5, j8, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i36 = onNavigationEvent + 109;
                            onWarmupCompleted = i36 % 128;
                            if (i36 % 2 != 0) {
                                int i37 = 91 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347921 & i3) != 38347920, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347921 & i3) != 38347920, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1542593253);
        if (iIntValue != 0) {
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = onNavigationEvent + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onNavigationEvent + 125;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1542593253, iIntValue, -1, "im.toss.tds.compose.compat.component.atom.post.Preview (TdsPostV2.kt:108)");
                    int i7 = 55 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1542593253, iIntValue, -1, "im.toss.tds.compose.compat.component.atom.post.Preview (TdsPostV2.kt:108)");
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaJ9_SFr6O1SCSgN8CalwUP9GgZw.onExtraCallbackWithResult.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onExtraCallback + 55;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.compat.component.atom.post.TdsPostV2Kt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) {
                Unit unitOnExtraCallback;
                int i10 = 2 % 2;
                int i11 = onExtraCallback + 89;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    unitOnExtraCallback = r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI.onExtraCallback(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = 27 / 0;
                } else {
                    unitOnExtraCallback = r8lambdaFhMDyMgWKKGTW4KvNSyM6l9TjEI.onExtraCallback(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
                int i13 = onExtraCallback + 55;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                return unitOnExtraCallback;
            }
        });
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Spanned spanned, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z, long j, long j2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, Typography5 typography5) {
        Object[] objArr = {spanned, r8lambdanm9dm2eewl4vrptnjmesfjqky4, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, extensionsManagerExtensionsAvailability, typography5};
        return (Unit) IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1649630750, 1649630750, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1107592999, 1107593000, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
    }
}
