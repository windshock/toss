package viva.republica.toss.appsintoss;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import im.toss.appsintoss.iap.InAppPurchasePreparationActivity;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.DERTaggedObject;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QueryProductDetailsParamsProduct;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1;
import o.addFixedPosition;
import o.dequeImageProxy;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getCornerRadius;
import o.isRepeatingEnabled;
import o.onPageExit;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setShine;
import o.toMetersPerSecond;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity$;

@DERTaggedObject
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AppsInTossIAPDemoActivity extends Hilt_AppsInTossIAPDemoActivity {
    private static final byte[] $$a = {79, 7, -80, -125};
    private static final int $$b = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 478308960;
    private final WindowInfoTrackerCompanionExternalSyntheticLambda0 IAuthTabCallback;

    @Inject
    public SafeWindowLayoutComponentProviderExternalSyntheticLambda4 inAppPurchaseStoreManager;
    private final IEngagementSignalsCallback_Parcel<Intent> onExtraCallback;
    private final getCornerRadius<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> onExtraCallbackWithResult;
    private QueryProductDetailsParamsProduct onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.$$a
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r5 = r5 * 3
            int r5 = 105 - r5
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.$$c(byte, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        boolean z;
        long jLongValue;
        int i7 = ~i2;
        int i8 = i4 | i7 | (~i6);
        int i9 = ~i4;
        int i10 = (~(i6 | i7)) | (~(i7 | i9));
        int i11 = i2 + i4 + i5 + ((-92689393) * i) + (1942122663 * i3);
        int i12 = i11 * i11;
        int i13 = (i2 * 1048061654) + 1366922925 + (i4 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (1048061961 * i5) + (439444615 * i) + ((-1279783457) * i3) + (i12 * 173867008);
        int i14 = (((-665130586) * i2) - 357761024) + ((-674687396) * i4) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i5) + ((-1056047104) * i) + ((-742522880) * i3) + ((-592117760) * i12) + (i13 * i13 * (-1898250240));
        if (i14 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i14 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i14 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i14 != 4) {
            return onExtraCallback(objArr);
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((iIntValue & 17) != 16) {
            int i16 = asBinder + 33;
            asInterface = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 4 % 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1848318235, iIntValue, -1, "viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsInTossIAPDemoActivity.kt:96)");
            }
            if (onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>>) cameraPresenceProviderExternalSyntheticLambda6).isEmpty()) {
                int i18 = asInterface + 99;
                asBinder = i18 % 128;
                int i19 = i18 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1767884085);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    int i20 = asBinder + 77;
                    asInterface = i20 % 128;
                    int i21 = i20 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1882625022);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1882624062);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                long j = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i22 = asInterface + 37;
                asBinder = i22 % 128;
                if (i22 % 2 != 0) {
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"상품이 없거나 불러오는 중.", quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(1.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 14, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                } else {
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"상품이 없거나 불러오는 중.", quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 54, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1768362663);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, appsInTossIAPDemoActivity, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, appsInTossIAPDemoActivity, audioRestrictionControllerImplExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(appsInTossIAPDemoActivity);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(appsInTossIAPDemoActivity);
        int i3 = asBinder + 67;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return asBinder(appsInTossIAPDemoActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asBinder(appsInTossIAPDemoActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appsInTossIAPDemoActivity, iEngagementSignalsCallbackDefault);
        int i4 = asInterface + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(appsInTossIAPDemoActivity, str);
        int i4 = asBinder + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(appsInTossIAPDemoActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(appsInTossIAPDemoActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 95;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {appsInTossIAPDemoActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        if (i4 == 0) {
            return (Unit) IAuthTabCallback(iOnExtraCallbackWithResult3, -2081542405, iOnExtraCallbackWithResult4, objArr, 2081542405, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppsInTossIAPDemoActivity appsInTossIAPDemoActivity = (AppsInTossIAPDemoActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {appsInTossIAPDemoActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -625940229, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr2, 625940230, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = asInterface + 103;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 23;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1188802956, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1188802960, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i5 = asInterface + 75;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 5;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return onNavigationEvent(appsInTossIAPDemoActivity, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(appsInTossIAPDemoActivity, cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public AppsInTossIAPDemoActivity() throws Throwable {
        Object[] objArr = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 8, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019655).substring(0, 29).length() - 25, new char[]{4, '\t', 3, 65534, 65533, 65528, 3, 65530, 65527, '\b', '\b'}, true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 161, objArr);
        this.IAuthTabCallback = new WindowInfoTrackerCompanionExternalSyntheticLambda0("demo_deployment_id", ((String) objArr[0]).intern(), (Integer) null, 4, (DefaultConstructorMarker) null);
        this.onExtraCallback = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return AppsInTossIAPDemoActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            }
        });
        this.onWarmupCompleted = new QueryProductDetailsParamsProduct.onExtraCallbackWithResult().onExtraCallback(this);
        this.onExtraCallbackWithResult = setShine.onNavigationEvent(CollectionsKt.emptyList());
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppsInTossIAPDemoActivity appsInTossIAPDemoActivity = (AppsInTossIAPDemoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 33;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> getcornerradius = appsInTossIAPDemoActivity.onExtraCallbackWithResult;
        int i5 = i2 + 49;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return getcornerradius;
    }

    public static final /* synthetic */ QueryProductDetailsParamsProduct onNavigationEvent(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        QueryProductDetailsParamsProduct queryProductDetailsParamsProduct = appsInTossIAPDemoActivity.onWarmupCompleted;
        int i5 = i3 + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return queryProductDetailsParamsProduct;
    }

    public static final /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0 onWarmupCompleted(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = appsInTossIAPDemoActivity.IAuthTabCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 93;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return windowInfoTrackerCompanionExternalSyntheticLambda0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 99;
        viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4 onExtraCallbackWithResult() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder
            int r1 = r1 + 101
            int r2 = r1 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4 r1 = r4.inAppPurchaseStoreManager
            r3 = 79
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1b
        L17:
            o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4 r1 = r4.inAppPurchaseStoreManager
            if (r1 == 0) goto L23
        L1b:
            int r2 = r2 + 99
            int r3 = r2 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder = r3
            int r2 = r2 % r0
            return r1
        L23:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onExtraCallbackWithResult():o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = asInterface + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            str = "구매 성공";
        } else {
            str = "구매 실패";
        }
        Toast.makeText((Context) appsInTossIAPDemoActivity, (CharSequence) str, 0).show();
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 19;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        appsInTossIAPDemoActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit asBinder(viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity r14, o.CameraCaptureResultEmptyCameraCaptureResult r15, int r16) {
        /*
            r0 = r14
            r10 = r15
            r1 = r16
            r13 = 2
            int r2 = r13 % r13
            int r2 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface
            int r2 = r2 + 81
            int r3 = r2 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder = r3
            int r2 = r2 % r13
            if (r2 == 0) goto L17
            r2 = r1 & 3
            if (r2 == r13) goto L1d
            goto L1b
        L17:
            r2 = r1 & 3
            if (r2 == r13) goto L1d
        L1b:
            r2 = 1
            goto L25
        L1d:
            int r3 = r3 + 107
            int r2 = r3 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface = r2
            int r3 = r3 % r13
            r2 = 0
        L25:
            r3 = r1 & 1
            boolean r2 = r15.onWarmupCompleted(r2, r3)
            if (r2 == 0) goto L94
            int r2 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface
            int r2 = r2 + 37
            int r3 = r2 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder = r3
            int r2 = r2 % r13
            boolean r2 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r2 == 0) goto L45
            r2 = -1
            java.lang.String r3 = "viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AppsInTossIAPDemoActivity.kt:84)"
            r4 = 1305397215(0x4dcec7df, float:4.3365066E8)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r4, r1, r2, r3)
        L45:
            boolean r1 = r15.onExtraCallback(r14)
            java.lang.Object r2 = r15.onMinimized()
            if (r1 != 0) goto L60
            int r1 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder
            int r1 = r1 + 83
            int r3 = r1 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface = r3
            int r1 = r1 % r13
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r1 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r1 = r1.onExtraCallback()
            if (r2 != r1) goto L68
        L60:
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity$$ExternalSyntheticLambda6 r2 = new viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity$$ExternalSyntheticLambda6
            r2.<init>(r14)
            r15.onWarmupCompleted(r2)
        L68:
            r0 = r2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            o.OIDTokenizer r1 = o.OIDTokenizer.onWarmupCompleted
            o.getBacktraceNote r9 = r1.IAuthTabCallback()
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = 126(0x7e, float:1.77E-43)
            r10 = r15
            o.MaxAdViewAdapterListener.onWarmupCompleted(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto L97
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            int r0 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface
            int r0 = r0 + 53
            int r1 = r0 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder = r1
            int r0 = r0 % r13
            goto L97
        L94:
            r15.ICustomTabsCallbackStubProxy()
        L97:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder(viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        appsInTossIAPDemoActivity.onExtraCallback.onNavigationEvent(InAppPurchasePreparationActivity.onNavigationEvent.IAuthTabCallback(InAppPurchasePreparationActivity.Companion, appsInTossIAPDemoActivity, appsInTossIAPDemoActivity.IAuthTabCallback, str, (InAppPurchaseProductAuthorizer) null, (String) null, (String) null, 56, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity r9, o.CameraPresenceProviderExternalSyntheticLambda6 r10, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 r11, int r12, o.CameraCaptureResultEmptyCameraCaptureResult r13, int r14) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            r11 = r14 & 48
            r1 = 0
            r2 = 1
            if (r11 != 0) goto L39
            int r11 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder
            int r11 = r11 + 43
            int r3 = r11 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface = r3
            int r11 = r11 % r0
            if (r11 != 0) goto L24
            boolean r11 = r13.onExtraCallback(r12)
            r3 = 55
            int r3 = r3 / r1
            r11 = r11 ^ r2
            if (r11 == 0) goto L2a
            goto L36
        L24:
            boolean r11 = r13.onExtraCallback(r12)
            if (r11 == 0) goto L36
        L2a:
            int r11 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder
            int r11 = r11 + 13
            int r3 = r11 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface = r3
            int r11 = r11 % r0
            r11 = 32
            goto L38
        L36:
            r11 = 16
        L38:
            r14 = r14 | r11
        L39:
            r11 = r14 & 145(0x91, float:2.03E-43)
            r3 = 144(0x90, float:2.02E-43)
            if (r11 == r3) goto L40
            r1 = r2
        L40:
            r11 = r14 & 1
            boolean r11 = r13.onWarmupCompleted(r1, r11)
            if (r11 == 0) goto Lab
            int r11 = viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asInterface
            int r11 = r11 + 99
            int r1 = r11 % 128
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.asBinder = r1
            int r11 = r11 % r0
            boolean r11 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r11 == 0) goto L60
            r11 = -1
            java.lang.String r0 = "viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsInTossIAPDemoActivity.kt:106)"
            r1 = -587778894(0xffffffffdcf734b2, float:-5.5665807E17)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r1, r14, r11, r0)
        L60:
            java.util.List r10 = onExtraCallbackWithResult(r10)
            java.lang.Object r10 = r10.get(r12)
            r4 = r10
            o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 r4 = (o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1) r4
            o.QuirksExternalSyntheticBackport0$onExtraCallback r10 = o.QuirksExternalSyntheticBackport0.Companion
            r11 = 1090519040(0x41000000, float:8.0)
            float r11 = o.VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r11)
            r12 = 0
            r14 = 0
            o.QuirksExternalSyntheticBackport0 r3 = o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(r10, r12, r11, r2, r14)
            boolean r10 = r13.onExtraCallback(r9)
            java.lang.Object r11 = r13.onMinimized()
            if (r10 != 0) goto L8b
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r10 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r10 = r10.onExtraCallback()
            if (r11 != r10) goto L93
        L8b:
            viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity$$ExternalSyntheticLambda0 r11 = new viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity$$ExternalSyntheticLambda0
            r11.<init>(r9)
            r13.onWarmupCompleted(r11)
        L93:
            r5 = r11
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            int r9 = o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.onNavigationEvent
            int r9 = r9 << 3
            r7 = r9 | 6
            r8 = 0
            r6 = r13
            o.DERSetParser.onNavigationEvent(r3, r4, r5, r6, r7, r8)
            boolean r9 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r9 == 0) goto Lae
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto Lae
        Lab:
            r13.ICustomTabsCallbackStubProxy()
        Lae:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onNavigationEvent(viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity, o.CameraPresenceProviderExternalSyntheticLambda6, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, int, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(1848318235, true, new AppsInTossIAPDemoActivity$.ExternalSyntheticLambda4(cameraPresenceProviderExternalSyntheticLambda6)), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>>) cameraPresenceProviderExternalSyntheticLambda6).size(), (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-587778894, true, new AppsInTossIAPDemoActivity$.ExternalSyntheticLambda5(appsInTossIAPDemoActivity, cameraPresenceProviderExternalSyntheticLambda6)), 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z = false;
        AppsInTossIAPDemoActivity appsInTossIAPDemoActivity = (AppsInTossIAPDemoActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        if (i2 % 2 != 0 ? (iIntValue & 3) != 2 : (iIntValue & 4) != 3) {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i3 = asBinder + 123;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1970763964, iIntValue, -1, "viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onCreate.<anonymous>.<anonymous> (AppsInTossIAPDemoActivity.kt:81)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (dequeImageProxy) null, ForwardingCameraControl.onExtraCallback(1305397215, true, new AppsInTossIAPDemoActivity$.ExternalSyntheticLambda8(appsInTossIAPDemoActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(-1795538234, true, new AppsInTossIAPDemoActivity$.ExternalSyntheticLambda9(appsInTossIAPDemoActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 12582912, 131066);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asInterface + 19;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = asBinder + 63;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = asBinder + 37;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = asInterface + 43;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1516186604, i, -1, "viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.onCreate.<anonymous> (AppsInTossIAPDemoActivity.kt:80)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1970763964, true, new AppsInTossIAPDemoActivity$.ExternalSyntheticLambda1(appsInTossIAPDemoActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asBinder + 93;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = asBinder + 89;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossIAPDemoActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1516186604, true, new AppsInTossIAPDemoActivity$.ExternalSyntheticLambda3(this))), 1, (Object) null);
        onWarmupCompleted();
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r24, int r25, char[] r26, boolean r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossIAPDemoActivity.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        this.onWarmupCompleted.onNavigationEvent(new IAuthTabCallback(this));
        int i2 = asBinder + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1> onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<? extends List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1> list = (List) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = asInterface + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appsInTossIAPDemoActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -372722917, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 372722920, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ getCornerRadius onExtraCallbackWithResult(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (getCornerRadius) IAuthTabCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1891512656, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{appsInTossIAPDemoActivity}, -1891512654, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appsInTossIAPDemoActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -625940229, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 625940230, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(AppsInTossIAPDemoActivity appsInTossIAPDemoActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appsInTossIAPDemoActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -2081542405, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 2081542405, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1188802956, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1188802960, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossIAPDemoActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asBinder + 59;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossIAPDemoActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossIAPDemoActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossIAPDemoActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
