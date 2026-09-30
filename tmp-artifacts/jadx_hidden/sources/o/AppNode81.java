package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub;
import im.toss.devtool.runtime.ui.scheme.history.compose.SchemeHistoryEmptyScreenKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getBooleanFromAdObject;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AppNode81 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = -1256058788;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 238672384;
    private static int onExtraCallbackWithResult = -1538789446;
    private static byte[] onNavigationEvent;
    private static short[] onWarmupCompleted = {4273, -10229, 10235, -10232, -10183, 10230, 10178, -10177, 10230, 10239, -10228, 10224, 10223, -10203, 10234, 10235, 10236, 10199, -10189, 10232, 10236, -10236, 10238, 10229, 10206, -10212, -10233, 10231, -10238, 10234, 10223, 10196, 10231, -10163, 10230, 10239, -10228, 10224, 10223, -10203, 10234, 10235, 10236, 10199, -10189, 10232, 10236, -10236, 10238, 10229, 10206, -10212, -10233, 10231, -10238, 10234, 10223, 10202, -10186, -10227, 10235, -10240, 10236, -10239, 10227, 10186, -10166, 10232, 10236, -10236, 10238, 10229, 10238, 10181, -10186, -10233, 10231, -10238, 10234, -10225, 10170, -10182, -10229, 10168, -10186, -10233, 10235, -10230, 10233, -10234, 10236, 10171, -10179, -10238, 10239, -10236, -10239, 10222, 10238, 10185, -10172, 10239, 10235, -10236, 10169, -10178, 10235, 4180, -27381, -10147, 10322, 9390, 7677, -7977, 11905, -10671, 6853, -27579, 27581, -3370, -13596, 4296, 10170, -10164, 10165, 10122, -10171, -10127, 10124, -10171, -10164, 10175, -10173, -10148, 10134, -10167, -10168, -10161, -10140, 10112, -10165, -10161, 10167, -10163, -10170, -10131, 10159, 10164, -10172, 10161, -10167, -10148, -10137, -10172, 10213, -10146, 10160, -10145, 10173, 10175, -10130, 10158, -10171, -10164, 10175, -10173, -10148, 10134, -10167, -10168, -10161, -10140, 10112, -10165, -10161, 10167, -10163, -10170, -10131, 10159, 10164, -10172, 10161, -10167, -10148, -10135, 10117, 10174, -10168, 10163, -10161, 10162, -10176, -10119, 10233, -10165, -10161, 10167, -10163, -10170, -10163, -10122, 10117, 10164, -10172, 10161, -10167, 10172, -10231, 10121, 10168, -10229, 10117, 10164, -10168, 10169, -10166, 10165, -10161, -10232, 10126, 10161, -10164, 10167, 10162, -10147, -10163, -10118, 10231, -10164, -10168, 10167, -10230, 10125, -10168};

    private static final Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 57;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 75;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 49;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallbackStub + 107;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = asBinder + 97;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-335127668);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 3) != 2, i3 & 1)) {
            int i6 = IAuthTabCallbackStub + 99;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i5 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((-10) - ImageFormat.getBitsPerPixel(0)), TextUtils.getCapsMode("", 0, 0) - 291883092, 1434582625 - Color.red(0), (-16791475) - Color.rgb(0, 0, 0), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-335127668, i3, -1, ((String) objArr[0]).intern());
                int i7 = asBinder + 29;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i9 = asBinder + 3;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            setCauses setcauses = setCauses.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablenameIAuthTabCallbackDefault = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            createCameraCaptureCallback createcameracapturecallbackOnExtraCallback = createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback());
            Object[] objArr2 = new Object[1];
            a((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (73 - KeyEvent.keyCodeFromString("")), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 291882986, ExpandableListView.getPackedPositionType(0L) + 1434632412, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 14259, objArr2);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr2[0]).intern(), null, gethumanreadablenameIAuthTabCallbackDefault, 0L, 0L, 0L, null, null, createcameracapturecallbackOnExtraCallback, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 6, 0, 130810}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new SchemeHistoryEmptyScreenKt$.ExternalSyntheticLambda1(quirksExternalSyntheticBackport02, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[PHI: r12
      0x002d: PHI (r12v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r12v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r12v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r12
      0x0022: PHI (r12v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r12v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r12v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onExtraCallbackWithResult(@org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r12, int r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AppNode81.IAuthTabCallbackStub
            int r1 = r1 + 95
            int r2 = r1 % 128
            o.AppNode81.asBinder = r2
            int r1 = r1 % r0
            r2 = -675796099(0xffffffffd7b82b7d, float:-4.0499384E14)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L1c
            o.CameraCaptureResultEmptyCameraCaptureResult r12 = r12.IAuthTabCallback(r2)
            r1 = 3
            int r1 = r1 / r4
            if (r13 == 0) goto L2d
            goto L22
        L1c:
            o.CameraCaptureResultEmptyCameraCaptureResult r12 = r12.IAuthTabCallback(r2)
            if (r13 == 0) goto L2d
        L22:
            int r1 = o.AppNode81.asBinder
            int r1 = r1 + 39
            int r5 = r1 % 128
            o.AppNode81.IAuthTabCallbackStub = r5
            int r1 = r1 % r0
            r1 = r3
            goto L2e
        L2d:
            r1 = r4
        L2e:
            r5 = r13 & 1
            boolean r1 = r12.onWarmupCompleted(r1, r5)
            if (r1 == 0) goto L9e
            boolean r1 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r1 == 0) goto L87
            int r1 = o.AppNode81.asBinder
            int r1 = r1 + 87
            int r5 = r1 % 128
            o.AppNode81.IAuthTabCallbackStub = r5
            int r1 = r1 % r0
            java.lang.String r1 = ""
            int r5 = android.os.Process.getGidForName(r1)
            int r5 = r5 + r3
            short r6 = (short) r5
            int r5 = android.os.Process.getThreadPriority(r4)
            int r5 = r5 + 20
            int r5 = r5 >> 6
            int r5 = 68 - r5
            byte r7 = (byte) r5
            long r8 = android.os.SystemClock.currentThreadTimeMillis()
            r10 = -1
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r8 = -291882972(0xffffffffee9a3824, float:-2.386428E28)
            int r8 = r8 + r5
            r5 = 1434582624(0x5581fe60, float:1.7866192E13)
            r9 = 48
            int r10 = android.text.TextUtils.indexOf(r1, r9, r4)
            int r5 = r5 - r10
            int r1 = android.text.TextUtils.indexOf(r1, r9, r4, r4)
            int r10 = (-14260) - r1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r9 = r5
            r11 = r1
            a(r6, r7, r8, r9, r10, r11)
            r1 = r1[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r5 = -1
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r2, r13, r5, r1)
        L87:
            r1 = 0
            onExtraCallbackWithResult(r1, r12, r4, r3)
            boolean r1 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r1 == 0) goto La1
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            int r1 = o.AppNode81.IAuthTabCallbackStub
            int r1 = r1 + 109
            int r2 = r1 % 128
            o.AppNode81.asBinder = r2
            int r1 = r1 % r0
            goto La1
        L9e:
            r12.ICustomTabsCallbackStubProxy()
        La1:
            o.clearAllCameraStateObserverslambda19lambda18 r12 = r12.IAuthTabCallback_Parcel()
            if (r12 == 0) goto Laf
            im.toss.devtool.runtime.ui.scheme.history.compose.SchemeHistoryEmptyScreenKt$$ExternalSyntheticLambda0 r0 = new im.toss.devtool.runtime.ui.scheme.history.compose.SchemeHistoryEmptyScreenKt$$ExternalSyntheticLambda0
            r0.<init>(r13)
            r12.onExtraCallback(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppNode81.onExtraCallbackWithResult(o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        char c;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        int iO = getBooleanFromAdObject.onWarmupCompleted.o(i3, onExtraCallbackWithResult);
        int i6 = iO == -1 ? 1 : 0;
        if (i6 != 0) {
            byte[] bArr = onNavigationEvent;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.s(bArr[i7]);
                }
                int i8 = $10 + 51;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                bArr = bArr2;
            }
            if (bArr != null) {
                iO = (byte) (((byte) (onNavigationEvent[getBooleanFromAdObject.onWarmupCompleted.o(i, IAuthTabCallback)] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
            } else {
                iO = (short) (((short) (onWarmupCompleted[((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                int i10 = $10 + 103;
                $11 = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        if (iO > 0) {
            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iO) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i6;
            ((StringBuilder) QuickActionBottomSheetActivity$IAuthTabCallbackStub.r(trackSelectionParametersExternalSyntheticLambda0, i2, onExtraCallback, sb)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
            byte[] bArr3 = onNavigationEvent;
            if (bArr3 != null) {
                int i12 = $10 + 17;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i14 = 0; i14 < length2; i14++) {
                    bArr4[i14] = (byte) (bArr3[i14] ^ (-4629411779493505016L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iO) {
                int i15 = $11;
                int i16 = i15 + 33;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                if (z) {
                    int i18 = i15 + 125;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        byte[] bArr5 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent / 0;
                        byte b2 = (byte) (bArr5[r10] & (-4629411779493505016L));
                        c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                        i4 = b2 / s;
                    } else {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        byte b3 = (byte) (bArr6[r10] ^ (-4629411779493505016L));
                        c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                        i4 = b3 + s;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (c + (((byte) i4) ^ b));
                } else {
                    short[] sArr = onWarmupCompleted;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r10] ^ (-4629411779493505016L))) + s)) ^ b));
                }
                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
            }
        }
        objArr[0] = sb.toString();
    }
}
