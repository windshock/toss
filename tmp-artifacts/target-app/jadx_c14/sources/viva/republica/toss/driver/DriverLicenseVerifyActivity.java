package viva.republica.toss.driver;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.anim.top.AnimateTop;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AdSettingsIntegrationErrorMode;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseRoundCornerProgressBarSavedState1;
import o.CERT_GetVIDRandomWithPrikey;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.PlayerErrorCode;
import o.ReactJsExceptionHandlerProcessedErrorStackFrame;
import o.SetDetectableSize;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.enableWebPerformanceAPIsByDefault;
import o.findResAndMsg;
import o.getUserData;
import o.getWrite;
import o.getWriteTimeoutokhttp;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU;
import o.readTimeout;
import o.setGlobalVariable;
import o.setRandomHost;
import o.setRubIn;
import o.shouldAutoplay;
import o.viewCullingOutsetRatio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.driver.DriverLicenseVerifyActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DriverLicenseVerifyActivity extends Hilt_DriverLicenseVerifyActivity implements SetDetectingInterval {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static char[] ICustomTabsCallbackDefault;
    private static int isEngagementSignalsApiAvailable;
    private static long onPostMessage;
    private static long onUnminimized;
    public CERT_GetVIDRandomWithPrikey IAuthTabCallbackStub;

    @Inject
    public Object mobileIdManager;
    private static final byte[] $$a = {69, -38, -90, 81};
    private static final int $$b = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onRelationshipValidationResult = 0;
    private static int ICustomTabsCallbackStub = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private final Lazy writeTypedObject = isStopUpload.onNavigationEvent(this, 1612442, (Function1) null, (Function1) null, 6, (Object) null);
    private final Lazy onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda11
        public final Object invoke() {
            return DriverLicenseVerifyActivity.IEngagementSignalsCallbackDefault();
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda17
        public final Object invoke() {
            return DriverLicenseVerifyActivity.ICustomTabsService_Parcel();
        }
    });
    private final Lazy onActivityLayout = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda18
        public final Object invoke() {
            return DriverLicenseVerifyActivity.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda19
        public final Object invoke() {
            return DriverLicenseVerifyActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy extraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda20
        public final Object invoke() {
            return DriverLicenseVerifyActivity.IAuthTabCallbackDefault(this.f$0);
        }
    });
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda21
        public final Object invoke() {
            return DriverLicenseVerifyActivity.onTransact(this.f$0);
        }
    });
    private final Lazy ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda22
        public final Object invoke() {
            return Long.valueOf(DriverLicenseVerifyActivity.onWarmupCompleted(this.f$0));
        }
    });
    private final Lazy onActivityResized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda23
        public final Object invoke() {
            return DriverLicenseVerifyActivity.asInterface(this.f$0);
        }
    });
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda24
        public final Object invoke() {
            return DriverLicenseVerifyActivity.IAuthTabCallbackStubProxy(this.f$0);
        }
    });
    private final Lazy onMinimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda25
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return Boolean.valueOf(((Boolean) DriverLicenseVerifyActivity.onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -620027107, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 620027120)).booleanValue());
        }
    });
    private final Lazy readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda12
        public final Object invoke() {
            return Boolean.valueOf(DriverLicenseVerifyActivity.asBinder(this.f$0));
        }
    });
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda13
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            return Long.valueOf(((Long) DriverLicenseVerifyActivity.onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1923436628, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1923436630)).longValue());
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda14
        public final Object invoke() {
            return Boolean.valueOf(DriverLicenseVerifyActivity.IAuthTabCallback(this.f$0));
        }
    });
    private final Lazy access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda15
        public final Object invoke() {
            return DriverLicenseVerifyActivity.onExtraCallbackWithResult(this.f$0);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> getInterfaceDescriptor = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda16
        public final Object invoke(Object obj) {
            return DriverLicenseVerifyActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final CoroutineExceptionHandler asInterface = new onExtraCallbackWithResult(CoroutineExceptionHandler.extraCallbackWithResult, this);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 97
            byte[] r1 = viva.republica.toss.driver.DriverLicenseVerifyActivity.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.driver.DriverLicenseVerifyActivity.$$c(byte, byte, short):java.lang.String");
    }

    static {
        isEngagementSignalsApiAvailable = 1;
        onVerticalScrollEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        IAuthTabCallbackDefault = 8;
        int i = onRelationshipValidationResult + 11;
        isEngagementSignalsApiAvailable = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 43;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(driverLicenseVerifyActivity, str, str2, commonModule_setLeftEdgeTouchEnabled);
        }
        onNavigationEvent(driverLicenseVerifyActivity, str, str2, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(driverLicenseVerifyActivity, tdsBottomCtaV1View, view);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 115;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 49;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject(driverLicenseVerifyActivity);
        }
        writeTypedObject(driverLicenseVerifyActivity);
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallbackDefault(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onRelationshipValidationResult(driverLicenseVerifyActivity);
            obj.hashCode();
            throw null;
        }
        String strOnRelationshipValidationResult = onRelationshipValidationResult(driverLicenseVerifyActivity);
        int i3 = ICustomTabsCallbackStubProxy + 111;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnRelationshipValidationResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            access000(driverLicenseVerifyActivity, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAccess000 = access000(driverLicenseVerifyActivity, setDetectableSize);
        int i3 = ICustomTabsCallbackStubProxy + 75;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess000;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStubProxy(driverLicenseVerifyActivity);
            throw null;
        }
        boolean zICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(driverLicenseVerifyActivity);
        int i3 = ICustomTabsCallbackStubProxy + 79;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zICustomTabsCallbackStubProxy);
    }

    public static /* synthetic */ String IAuthTabCallbackStubProxy(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 91;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsCallback(driverLicenseVerifyActivity);
            throw null;
        }
        String strICustomTabsCallback = ICustomTabsCallback(driverLicenseVerifyActivity);
        int i3 = ICustomTabsCallbackStub + 53;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return strICustomTabsCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 49;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2082833825, iOnExtraCallback2, new Object[]{driverLicenseVerifyActivity}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2082833835);
        int i3 = ICustomTabsCallbackStubProxy + 123;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 85;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            ITrustedWebActivityServiceDefault();
            throw null;
        }
        Unit unitITrustedWebActivityServiceDefault = ITrustedWebActivityServiceDefault();
        int i3 = ICustomTabsCallbackStub + 57;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return unitITrustedWebActivityServiceDefault;
    }

    public static /* synthetic */ BaseRoundCornerProgressBarSavedState1.IAuthTabCallback ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = (BaseRoundCornerProgressBarSavedState1.IAuthTabCallback) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1668196663, iOnExtraCallback, new Object[0], EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1668196670);
        int i4 = ICustomTabsCallbackStubProxy + 9;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ shouldAutoplay IEngagementSignalsCallbackDefault() {
        shouldAutoplay shouldautoplayITrustedWebActivityServiceStubProxy;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 9;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            shouldautoplayITrustedWebActivityServiceStubProxy = ITrustedWebActivityServiceStubProxy();
            int i3 = 91 / 0;
        } else {
            shouldautoplayITrustedWebActivityServiceStubProxy = ITrustedWebActivityServiceStubProxy();
        }
        int i4 = ICustomTabsCallbackStub + 71;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return shouldautoplayITrustedWebActivityServiceStubProxy;
    }

    public static /* synthetic */ boolean asBinder(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 99;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityLayout = onActivityLayout(driverLicenseVerifyActivity);
        int i4 = ICustomTabsCallbackStubProxy + 109;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return zOnActivityLayout;
    }

    public static /* synthetic */ String asInterface(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 43;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onUnminimized(driverLicenseVerifyActivity);
        }
        onUnminimized(driverLicenseVerifyActivity);
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 17;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnActivityResized = onActivityResized(driverLicenseVerifyActivity);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return strOnActivityResized;
    }

    public static /* synthetic */ Unit onExtraCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 67;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(driverLicenseVerifyActivity, str, str2, setDetectableSize);
        }
        IAuthTabCallback(driverLicenseVerifyActivity, str, str2, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long jOnPostMessage = onPostMessage(driverLicenseVerifyActivity);
        int i4 = ICustomTabsCallbackStub + 11;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return Long.valueOf(jOnPostMessage);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(driverLicenseVerifyActivity, i, setDetectableSize);
        int i5 = ICustomTabsCallbackStubProxy + 65;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return access100(driverLicenseVerifyActivity, setDetectableSize);
        }
        access100(driverLicenseVerifyActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DriverLicenseLoadingDialog onExtraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 103;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        DriverLicenseLoadingDialog driverLicenseLoadingDialogOnMessageChannelReady = onMessageChannelReady(driverLicenseVerifyActivity);
        int i4 = ICustomTabsCallbackStubProxy + 13;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return driverLicenseLoadingDialogOnMessageChannelReady;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(driverLicenseVerifyActivity, view);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 81;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 43;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2079715255, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, setDetectableSize}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2079715250);
        int i4 = ICustomTabsCallbackStubProxy + 7;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DriverLicenseVerifyActivity driverLicenseVerifyActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -945575763, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, iEngagementSignalsCallbackDefault}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 945575771);
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ viewCullingOutsetRatio onNavigationEvent(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 111;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback_Parcel(driverLicenseVerifyActivity);
        }
        ICustomTabsCallback_Parcel(driverLicenseVerifyActivity);
        throw null;
    }

    public static /* synthetic */ String onTransact(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 121;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnMinimized = onMinimized(driverLicenseVerifyActivity);
        int i4 = ICustomTabsCallbackStub + 7;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return strOnMinimized;
    }

    public static /* synthetic */ long onWarmupCompleted(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {driverLicenseVerifyActivity};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback4 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        if (i3 != 0) {
            return ((Long) onWarmupCompleted(iOnExtraCallback2, -796709930, iOnExtraCallback, objArr, iOnExtraCallback3, iOnExtraCallback4, 796709941)).longValue();
        }
        int i4 = 86 / 0;
        return ((Long) onWarmupCompleted(iOnExtraCallback2, -796709930, iOnExtraCallback, objArr, iOnExtraCallback3, iOnExtraCallback4, 796709941)).longValue();
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = ~(i7 | i3);
        int i10 = i8 | i9;
        int i11 = ~i6;
        int i12 = (~((~i3) | i7 | i6)) | (~(i7 | i11 | i3));
        int i13 = i9 | (~(i11 | i2));
        int i14 = i2 + i6 + i + ((-1696018712) * i4) + (2108813197 * i5);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i2) - 2121662464) + (1221732374 * i6) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i) + (39845888 * i4) + (227278848 * i5) + ((-1705377792) * i15);
        int i17 = ((i2 * 362004572) - 1408384217) + (i6 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i * 362004373) + (i4 * (-1290304248)) + (i5 * 155295761) + (i15 * (-60686336));
        switch (i16 + (i17 * i17 * (-1680474112))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallbackStub + 95;
                ICustomTabsCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                Unit unitAsBinder = asBinder(driverLicenseVerifyActivity, setDetectableSize);
                int i21 = ICustomTabsCallbackStub + 31;
                ICustomTabsCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                return unitAsBinder;
            case 4:
                DriverLicenseVerifyActivity driverLicenseVerifyActivity2 = (DriverLicenseVerifyActivity) objArr[0];
                SetDetectableSize setDetectableSize2 = (SetDetectableSize) objArr[1];
                int i23 = 2 % 2;
                int i24 = ICustomTabsCallbackStub + 95;
                ICustomTabsCallbackStubProxy = i24 % 128;
                int i25 = i24 % 2;
                Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(driverLicenseVerifyActivity2, setDetectableSize2);
                int i26 = ICustomTabsCallbackStub + 9;
                ICustomTabsCallbackStubProxy = i26 % 128;
                int i27 = i26 % 2;
                return unitIAuthTabCallbackDefault;
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                final DriverLicenseVerifyActivity driverLicenseVerifyActivity3 = (DriverLicenseVerifyActivity) objArr[0];
                final String str = (String) objArr[1];
                final String str2 = (String) objArr[2];
                DialogInterface dialogInterface = (DialogInterface) objArr[3];
                int i28 = 2 % 2;
                Intrinsics.checkNotNullParameter(dialogInterface, "");
                ConvertByteArrayToFloatArray.onExtraCallback(1231001L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda4
                    public final Object invoke(Object obj) {
                        return DriverLicenseVerifyActivity.onExtraCallback(this.f$0, str, str2, (SetDetectableSize) obj);
                    }
                }, 14, (Object) null);
                dialogInterface.dismiss();
                Unit unit = Unit.INSTANCE;
                int i29 = ICustomTabsCallbackStubProxy + 53;
                ICustomTabsCallbackStub = i29 % 128;
                int i30 = i29 % 2;
                return unit;
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                DriverLicenseVerifyActivity driverLicenseVerifyActivity4 = (DriverLicenseVerifyActivity) objArr[0];
                String str3 = (String) objArr[1];
                String str4 = (String) objArr[2];
                SetDetectableSize setDetectableSize3 = (SetDetectableSize) objArr[3];
                int i31 = 2 % 2;
                int i32 = ICustomTabsCallbackStub + 29;
                ICustomTabsCallbackStubProxy = i32 % 128;
                int i33 = i32 % 2;
                Unit unit2 = (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1257856250, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{driverLicenseVerifyActivity4, str3, str4, setDetectableSize3}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1257856259);
                int i34 = ICustomTabsCallbackStub + 7;
                ICustomTabsCallbackStubProxy = i34 % 128;
                int i35 = i34 % 2;
                return unit2;
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return getInterfaceDescriptor(objArr);
            case 17:
                return access000(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, String str2, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1965841101, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, str, str2, dialogInterface}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1965841113);
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1965841101, iOnExtraCallback2, new Object[]{driverLicenseVerifyActivity, str, str2, dialogInterface}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1965841113);
        int i3 = 33 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(driverLicenseVerifyActivity, setDetectableSize);
        int i4 = ICustomTabsCallbackStubProxy + 75;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ DriverLicenseLoadingDialog access100(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 55;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        DriverLicenseLoadingDialog driverLicenseLoadingDialog = (DriverLicenseLoadingDialog) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2047550335, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2047550352);
        int i4 = ICustomTabsCallbackStub + 89;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return driverLicenseLoadingDialog;
    }

    public static final /* synthetic */ shouldAutoplay extraCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        shouldAutoplay shouldautoplayCancelNotification = driverLicenseVerifyActivity.cancelNotification();
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        int i5 = ICustomTabsCallbackStub + 1;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return shouldautoplayCancelNotification;
        }
        throw null;
    }

    public static final /* synthetic */ viewCullingOutsetRatio extraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 47;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            driverLicenseVerifyActivity.getActiveNotifications();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        viewCullingOutsetRatio activeNotifications = driverLicenseVerifyActivity.getActiveNotifications();
        int i3 = ICustomTabsCallbackStub + 87;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return activeNotifications;
    }

    public static final /* synthetic */ BaseRoundCornerProgressBarSavedState1.IAuthTabCallback getInterfaceDescriptor(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return driverLicenseVerifyActivity.IPostMessageServiceStub();
        }
        driverLicenseVerifyActivity.IPostMessageServiceStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 43;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        driverLicenseVerifyActivity.onExtraCallbackWithResult(str);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(DriverLicenseVerifyActivity driverLicenseVerifyActivity, int i, Intent intent) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 65;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        driverLicenseVerifyActivity.onExtraCallback(i, intent);
        int i5 = ICustomTabsCallbackStubProxy + 117;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ String readTypedObject(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 27;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIPostMessageService_Parcel = driverLicenseVerifyActivity.IPostMessageService_Parcel();
        int i4 = ICustomTabsCallbackStubProxy + 101;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return strIPostMessageService_Parcel;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = ICustomTabsCallbackStubProxy + 79;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = ICustomTabsCallbackStubProxy + 7;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = ICustomTabsCallbackStub + 33;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 125;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = ICustomTabsCallbackStubProxy + 73;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        View viewAq_;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
            int i3 = 86 / 0;
        } else {
            viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        }
        int i4 = ICustomTabsCallbackStubProxy + 41;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 81;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.ar_();
        }
        super/*o.openJavaCrashMonitor*/.ar_();
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = ICustomTabsCallbackStubProxy + 39;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 47;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.getScreenId();
            obj.hashCode();
            throw null;
        }
        long screenId = super.getScreenId();
        int i3 = ICustomTabsCallbackStubProxy + 71;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return screenId;
        }
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 27;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 15;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 17;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStub + 125;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 41;
        ICustomTabsCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsServiceDefault();
            obj.hashCode();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onSessionEnded();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrashOnSessionEnded = onSessionEnded();
        int i3 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return hascrashwhenjavacrashOnSessionEnded;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 103;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.validateRelationship();
        }
        super/*o.openJavaCrashMonitor*/.validateRelationship();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            throw null;
        }
    }

    public hasCrashWhenJavaCrash onSessionEnded() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 39;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.writeTypedObject.getValue();
        int i4 = ICustomTabsCallbackStub + 33;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    private static final shouldAutoplay ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AdSettingsIntegrationErrorMode adSettingsIntegrationErrorMode = AdSettingsIntegrationErrorMode.onNavigationEvent;
        if (i3 == 0) {
            return adSettingsIntegrationErrorMode.newSessionWithExtras();
        }
        adSettingsIntegrationErrorMode.newSessionWithExtras();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final shouldAutoplay cancelNotification() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 15;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        shouldAutoplay shouldautoplay = (shouldAutoplay) this.onMessageChannelReady.getValue();
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return shouldautoplay;
    }

    private final BaseRoundCornerProgressBarSavedState1.IAuthTabCallback IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = (BaseRoundCornerProgressBarSavedState1.IAuthTabCallback) this.onTransact.getValue();
        int i3 = ICustomTabsCallbackStub + 69;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return iAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 65;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        BaseRoundCornerProgressBarSavedState1.IAuthTabCallback iAuthTabCallback = BaseRoundCornerProgressBarSavedState1.IAuthTabCallback.GCM;
        int i4 = ICustomTabsCallbackStubProxy + 109;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return iAuthTabCallback;
    }

    public static final class onExtraCallbackWithResult extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ DriverLicenseVerifyActivity onNavigationEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
            super(onwarmupcompleted);
            this.onNavigationEvent = driverLicenseVerifyActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DriverLicenseVerifyActivity", th);
            DriverLicenseVerifyActivity driverLicenseVerifyActivity = this.onNavigationEvent;
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            DriverLicenseVerifyActivity.onNavigationEvent(driverLicenseVerifyActivity, localizedMessage);
        }
    }

    private final viewCullingOutsetRatio getActiveNotifications() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onActivityLayout.getValue();
        if (i3 != 0) {
            return (viewCullingOutsetRatio) value;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final viewCullingOutsetRatio ICustomTabsCallback_Parcel(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 69;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        viewCullingOutsetRatio parcelableExtra = driverLicenseVerifyActivity.getIntent().getParcelableExtra("EXTRA_VERIFY_ID_CARD_ENTITY");
        int i4 = ICustomTabsCallbackStub + 7;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return parcelableExtra;
    }

    private final String ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 53;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStubProxy.getValue();
        int i4 = ICustomTabsCallbackStub + 19;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onActivityResized(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 81;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = driverLicenseVerifyActivity.getIntent().getStringExtra("EXTRA_REFERRER");
        if (stringExtra == null) {
            int i4 = ICustomTabsCallbackStub;
            int i5 = i4 + 39;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = i4 + 11;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            stringExtra = "";
        }
        int i8 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    private final String ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 51;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.extraCallbackWithResult.getValue();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onRelationshipValidationResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 13;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = driverLicenseVerifyActivity.getIntent().getStringExtra("EXTRA_SERVICE_REFERRER");
        if (i3 != 0) {
            int i4 = 62 / 0;
            if (stringExtra != null) {
                return stringExtra;
            }
        } else if (stringExtra != null) {
            return stringExtra;
        }
        int i5 = ICustomTabsCallbackStubProxy + 53;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    private final String IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 85;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access100.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onMinimized(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = driverLicenseVerifyActivity.getIntent();
        if (i3 == 0) {
            intent.getStringExtra("EXTRA_REQUESTER_CODE");
            throw null;
        }
        String stringExtra = intent.getStringExtra("EXTRA_REQUESTER_CODE");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = ICustomTabsCallbackStub + 51;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long jLongValue;
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 85;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = driverLicenseVerifyActivity.ICustomTabsCallback.getValue();
        if (i3 == 0) {
            jLongValue = ((Number) value).longValue();
            int i4 = 25 / 0;
        } else {
            jLongValue = ((Number) value).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        SetDetectingInterval setDetectingInterval = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 23;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long longExtra = setDetectingInterval.getIntent().getLongExtra("EXTRA_SESSION_ID", 0L);
        int i4 = ICustomTabsCallbackStubProxy + 121;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(longExtra);
        }
        throw null;
    }

    private final String ITrustedWebActivityCallback_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            str = (String) this.onActivityResized.getValue();
            int i3 = 92 / 0;
        } else {
            str = (String) this.onActivityResized.getValue();
        }
        int i4 = ICustomTabsCallbackStub + 19;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onUnminimized(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = driverLicenseVerifyActivity.getIntent().getStringExtra("EXTRA_SESSION_TYPE");
        if (stringExtra == null) {
            int i4 = ICustomTabsCallbackStubProxy + 91;
            ICustomTabsCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            stringExtra = "";
        }
        int i5 = ICustomTabsCallbackStub + 73;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return stringExtra;
    }

    private final String IPostMessageService() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 61;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.IAuthTabCallback_Parcel.getValue();
            int i3 = 54 / 0;
        } else {
            str = (String) this.IAuthTabCallback_Parcel.getValue();
        }
        int i4 = ICustomTabsCallbackStubProxy + 115;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String ICustomTabsCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 31;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = driverLicenseVerifyActivity.getIntent().getStringExtra("EXTRA_EXTRA_INFO");
        if (i3 == 0) {
            int i4 = 39 / 0;
            if (stringExtra != null) {
                return stringExtra;
            }
        } else if (stringExtra != null) {
            return stringExtra;
        }
        int i5 = ICustomTabsCallbackStubProxy + 65;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return "";
        }
        throw null;
    }

    private final boolean areNotificationsEnabled() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 43;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onMinimized.getValue()).booleanValue();
        int i4 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean ICustomTabsCallbackStubProxy(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return driverLicenseVerifyActivity.getIntent().getBooleanExtra("EXTRA_SHOW_EXIT_INTERACTION", false);
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 87;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) driverLicenseVerifyActivity.readTypedObject.getValue();
        if (i3 == 0) {
            return Boolean.valueOf(bool.booleanValue());
        }
        bool.booleanValue();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onActivityLayout(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = driverLicenseVerifyActivity.getIntent().getBooleanExtra("EXTRA_REUSABLE_SESSION_SUPPORTED", false);
        int i4 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    private final long ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 21;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.extraCallback.getValue();
        if (i3 != 0) {
            return ((Number) value).longValue();
        }
        ((Number) value).longValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 117;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), KeyEvent.normalizeMetaState(0) + 24, 19675 - AndroidCharacter.getMirror('0'), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * (onPostMessage + 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 60, 6383 - View.resolveSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 23 - Process.getGidForName(""), TextUtils.indexOf("", "", 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onPostMessage ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 58 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf("", "") + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 61;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 59 - Color.blue(0), 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final long onPostMessage(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 69;
        ICustomTabsCallbackStub = i2 % 128;
        long longExtra = driverLicenseVerifyActivity.getIntent().getLongExtra("EXTRA_REUSABLE_ID_CARD_OCR_TERMS_ID", i2 % 2 != 0 ? 1L : 0L);
        int i3 = ICustomTabsCallbackStub + 79;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return longExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 49;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.asBinder.getValue()).booleanValue();
        int i4 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean writeTypedObject(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 65;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = driverLicenseVerifyActivity.getIntent().getBooleanExtra("EXTRA_CAN_USE_ID_CARD", false);
        int i4 = ICustomTabsCallbackStub + 73;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return booleanExtra;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        DriverLicenseLoadingDialog driverLicenseLoadingDialog = (DriverLicenseLoadingDialog) driverLicenseVerifyActivity.access000.getValue();
        int i4 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return driverLicenseLoadingDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final DriverLicenseLoadingDialog onMessageChannelReady(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int i = 2 % 2;
        DriverLicenseLoadingDialog driverLicenseLoadingDialog = new DriverLicenseLoadingDialog(driverLicenseVerifyActivity);
        int i2 = ICustomTabsCallbackStub + 23;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return driverLicenseLoadingDialog;
    }

    public final CERT_GetVIDRandomWithPrikey IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 107;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        CERT_GetVIDRandomWithPrikey cERT_GetVIDRandomWithPrikey = this.IAuthTabCallbackStub;
        if (cERT_GetVIDRandomWithPrikey != null) {
            int i5 = i3 + 123;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return cERT_GetVIDRandomWithPrikey;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = ICustomTabsCallbackStubProxy + 65;
        ICustomTabsCallbackStub = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull CERT_GetVIDRandomWithPrikey cERT_GetVIDRandomWithPrikey) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 73;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cERT_GetVIDRandomWithPrikey, "");
        this.IAuthTabCallbackStub = cERT_GetVIDRandomWithPrikey;
        int i4 = ICustomTabsCallbackStub + 15;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void c(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $10 + 87;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(ICustomTabsCallbackDefault[i2 >> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 59697), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, View.resolveSize(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onUnminimized), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, 1494 - TextUtils.getCapsMode("", 0, 0), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(ICustomTabsCallbackDefault[i2 + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59697), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onUnminimized), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - MotionEvent.axisFromString("")), 31 - (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionChild(0L) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback6 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 44, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1495, -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback6).invoke(null, objArr7);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $11 + 1;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        String stringExtra;
        String stringExtra2;
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        String stringExtra3 = null;
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = ICustomTabsCallbackStub + 69;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            boolean booleanExtra = intentOnExtraCallbackWithResult != null ? intentOnExtraCallbackWithResult.getBooleanExtra("success", false) : false;
            Intent intentOnExtraCallbackWithResult2 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult2 != null) {
                int i4 = ICustomTabsCallbackStubProxy + 5;
                ICustomTabsCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    intentOnExtraCallbackWithResult2.getStringExtra("error_message");
                    throw null;
                }
                stringExtra = intentOnExtraCallbackWithResult2.getStringExtra("error_message");
            } else {
                stringExtra = null;
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (!(!booleanExtra)) {
                Intent intentOnExtraCallbackWithResult3 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
                if (intentOnExtraCallbackWithResult3 != null) {
                    int i5 = ICustomTabsCallbackStubProxy + 5;
                    ICustomTabsCallbackStub = i5 % 128;
                    if (i5 % 2 != 0) {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{56702, 63870, 38244, 45428}, View.MeasureSpec.getSize(1) * 19928, objArr2);
                        stringExtra2 = intentOnExtraCallbackWithResult3.getStringExtra(((String) objArr2[0]).intern());
                    } else {
                        Object[] objArr3 = new Object[1];
                        a(new char[]{56702, 63870, 38244, 45428}, View.MeasureSpec.getSize(0) + 9221, objArr3);
                        stringExtra2 = intentOnExtraCallbackWithResult3.getStringExtra(((String) objArr3[0]).intern());
                    }
                    stringExtra3 = stringExtra2;
                }
                String str = stringExtra3 != null ? stringExtra3 : "";
                if (str.length() == 0) {
                    driverLicenseVerifyActivity.onExtraCallbackWithResult(stringExtra);
                } else {
                    onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 208301024, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{driverLicenseVerifyActivity, str}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -208301023);
                }
            } else {
                driverLicenseVerifyActivity.onExtraCallbackWithResult(stringExtra);
            }
        } else {
            Intent intentOnExtraCallbackWithResult4 = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            if (intentOnExtraCallbackWithResult4 != null) {
                stringExtra3 = intentOnExtraCallbackWithResult4.getStringExtra("error_message");
                int i6 = ICustomTabsCallbackStub + 113;
                ICustomTabsCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            }
            driverLicenseVerifyActivity.onExtraCallbackWithResult(stringExtra3 != null ? stringExtra3 : "");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.driver.Hilt_DriverLicenseVerifyActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 49;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        CERT_GetVIDRandomWithPrikey cERT_GetVIDRandomWithPrikeyOnExtraCallbackWithResult = CERT_GetVIDRandomWithPrikey.onExtraCallbackWithResult(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cERT_GetVIDRandomWithPrikeyOnExtraCallbackWithResult, "");
        onExtraCallback(cERT_GetVIDRandomWithPrikeyOnExtraCallbackWithResult);
        setContentView(IEngagementSignalsCallbackStub().getRoot());
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -718383173, iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 718383188);
        int i4 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU $m400;
        Object L$0;
        int label;
        private static final byte[] $$a = {40, 108, -113, 75};
        private static final int $$b = 45;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onNavigationEvent = 1;
        private static int IAuthTabCallback = 478308965;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [int] */
        /* JADX WARN: Type inference failed for: r6v7, types: [int] */
        /* JADX WARN: Type inference failed for: r6v9 */
        private static String $$c(short s, short s2, short s3) {
            int i = 105 - (s * 2);
            byte[] bArr = $$a;
            int i2 = 4 - (s2 * 4);
            int i3 = s3 * 4;
            byte[] bArr2 = new byte[1 - i3];
            int i4 = 0 - i3;
            int i5 = -1;
            byte b = i;
            if (bArr == null) {
                int i6 = i + i2;
                i2++;
                i5 = -1;
                b = i6;
            }
            while (true) {
                int i7 = i5 + 1;
                bArr2[i7] = b;
                if (i7 == i4) {
                    return new String(bArr2, 0);
                }
                int i8 = i2;
                b = bArr[i2] + b;
                i2 = i8 + 1;
                i5 = i7;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU r8lambdaoa3wfvckspv9ubadkrowki1vuu, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$m400 = r8lambdaoa3wfvckspv9ubadkrowki1vuu;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(driverLicenseVerifyActivity, str, setDetectableSize);
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            return unitOnExtraCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = DriverLicenseVerifyActivity.this.new onNavigationEvent(this.$m400, access13800Var);
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = 62 / 0;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r24, int r25, char[] r26, boolean r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.driver.DriverLicenseVerifyActivity.onNavigationEvent.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        private static final Unit onExtraCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
                setDetectableSize.onExtraCallback("result_type", str);
                return Unit.INSTANCE;
            }
            setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
            setDetectableSize.onExtraCallback("result_type", str);
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Boolean bool;
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (DriverLicenseVerifyActivity.extraCallbackWithResult(DriverLicenseVerifyActivity.this) == null) {
                    return Unit.INSTANCE;
                }
                viewCullingOutsetRatio viewcullingoutsetratioExtraCallbackWithResult = DriverLicenseVerifyActivity.extraCallbackWithResult(DriverLicenseVerifyActivity.this);
                Intrinsics.checkNotNull(viewcullingoutsetratioExtraCallbackWithResult);
                long jOnNavigationEvent = viewcullingoutsetratioExtraCallbackWithResult.onNavigationEvent();
                viewCullingOutsetRatio viewcullingoutsetratioExtraCallbackWithResult2 = DriverLicenseVerifyActivity.extraCallbackWithResult(DriverLicenseVerifyActivity.this);
                Intrinsics.checkNotNull(viewcullingoutsetratioExtraCallbackWithResult2);
                long jOnWarmupCompleted = viewcullingoutsetratioExtraCallbackWithResult2.onWarmupCompleted();
                r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU r8lambdaoa3wfvckspv9ubadkrowki1vuu = this.$m400;
                viewCullingOutsetRatio viewcullingoutsetratioExtraCallbackWithResult3 = DriverLicenseVerifyActivity.extraCallbackWithResult(DriverLicenseVerifyActivity.this);
                Intrinsics.checkNotNull(viewcullingoutsetratioExtraCallbackWithResult3);
                setGlobalVariable setglobalvariable = new setGlobalVariable(jOnNavigationEvent, jOnWarmupCompleted, r8lambdaoa3wfvckspv9ubadkrowki1vuu.onWarmupCompleted(viewcullingoutsetratioExtraCallbackWithResult3.onExtraCallback(), DriverLicenseVerifyActivity.getInterfaceDescriptor(DriverLicenseVerifyActivity.this)), null, 8, null);
                DriverLicenseVerifyActivity.access100(DriverLicenseVerifyActivity.this).dismiss();
                shouldAutoplay shouldautoplayExtraCallback = DriverLicenseVerifyActivity.extraCallback(DriverLicenseVerifyActivity.this);
                String typedObject = DriverLicenseVerifyActivity.readTypedObject(DriverLicenseVerifyActivity.this);
                this.L$0 = access15400.onNavigationEvent(setglobalvariable);
                this.label = 1;
                obj = shouldautoplayExtraCallback.onTransact(typedObject, setglobalvariable, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult != null) {
                    throw apiErrorExtraCallbackWithResult;
                }
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                int i3 = onNavigationEvent + 95;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                throw apiErrorOnExtraCallbackWithResult;
            }
            int i5 = onWarmupCompleted + 15;
            onNavigationEvent = i5 % 128;
            Object obj3 = null;
            try {
            } catch (NullPointerException e) {
                if (!Intrinsics.areEqual(Boolean.class, Object.class)) {
                    int i6 = onNavigationEvent + 107;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (!Intrinsics.areEqual(Boolean.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult2 = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult2.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult2;
                    }
                }
                bool = Unit.INSTANCE;
            }
            if (i5 % 2 == 0) {
                baseApiResponse.onTransact();
                obj3.hashCode();
                throw null;
            }
            Object objOnTransact = baseApiResponse.onTransact();
            if (objOnTransact == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool = (Boolean) objOnTransact;
            boolean zBooleanValue = bool.booleanValue();
            if (!zBooleanValue) {
                Object[] objArr = new Object[1];
                a(3 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{5, 65535, 65530, 2}, false, 147 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                obj2 = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, new char[]{65527, 65527, '\t', 7, 7, 7, 65529}, true, 152 - TextUtils.indexOf("", "", 0, 0), objArr2);
                obj2 = objArr2[0];
            }
            final String strIntern = ((String) obj2).intern();
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            final DriverLicenseVerifyActivity driverLicenseVerifyActivity = DriverLicenseVerifyActivity.this;
            ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1612624L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$verifyMobileId$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj4) {
                    return DriverLicenseVerifyActivity.onNavigationEvent.onExtraCallbackWithResult(driverLicenseVerifyActivity, strIntern, (SetDetectableSize) obj4);
                }
            }, 14, (Object) null);
            if (zBooleanValue) {
                DriverLicenseVerifyActivity driverLicenseVerifyActivity2 = DriverLicenseVerifyActivity.this;
                Intent intent = new Intent();
                viewCullingOutsetRatio viewcullingoutsetratioExtraCallbackWithResult4 = DriverLicenseVerifyActivity.extraCallbackWithResult(DriverLicenseVerifyActivity.this);
                Intrinsics.checkNotNull(viewcullingoutsetratioExtraCallbackWithResult4);
                intent.putExtra("RESULT_VERIFY_ID", viewcullingoutsetratioExtraCallbackWithResult4.onNavigationEvent());
                Unit unit = Unit.INSTANCE;
                DriverLicenseVerifyActivity.onWarmupCompleted(driverLicenseVerifyActivity2, -1, intent);
            } else {
                DriverLicenseVerifyActivity.onWarmupCompleted(DriverLicenseVerifyActivity.this, 10, null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 103;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
            Object[] objArr = new Object[1];
            a(new char[]{56696, 26264, 43648, 61067, 12969, 30375, 47759, 65199, 715, 18113, 35536, 52962}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) * 48118, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
            Object[] objArr2 = new Object[1];
            a(new char[]{56696, 26264, 43648, 61067, 12969, 30375, 47759, 65199, 715, 18113, 35536, 52962}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 48118, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), driverLicenseVerifyActivity.getString(R.string.app_driver_license_cta));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 13;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
            setDetectableSize.onExtraCallback("bridge_title", driverLicenseVerifyActivity.getString(R.string.app_driver___43da401304));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
        setDetectableSize.onExtraCallback("bridge_title", driverLicenseVerifyActivity.getString(R.string.app_driver___43da401304));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void onExtraCallback(final DriverLicenseVerifyActivity driverLicenseVerifyActivity, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        Object obj;
        int i;
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1230997L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj2) {
                return DriverLicenseVerifyActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj2);
            }
        }, 14, (Object) null);
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        ReactJsExceptionHandlerProcessedErrorStackFrame.onExtraCallbackWithResult((DriverLicenseLoadingDialog) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2047550335, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2047550352));
        ConvertByteArrayToFloatArray.onExtraCallback(1230993L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj2) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj2};
                return (Unit) DriverLicenseVerifyActivity.onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2032959950, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2032959947);
            }
        }, 14, (Object) null);
        try {
            Result.Companion companion = Result.Companion;
            driverLicenseVerifyActivity.getInterfaceDescriptor.onNavigationEvent(driverLicenseVerifyActivity.IPostMessageServiceStubProxy());
            obj = Result.constructor-impl(Unit.INSTANCE);
            int i3 = ICustomTabsCallbackStub + 95;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i5 = ICustomTabsCallbackStub + 77;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DriverLicenseVerifyActivity", "Failed to launch mobileId", th2, (Map) null, 43, (Object) null);
                i = 68;
            } else {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DriverLicenseVerifyActivity", "Failed to launch mobileId", th2, (Map) null, 8, (Object) null);
                i = 10;
            }
            onWarmupCompleted(driverLicenseVerifyActivity, i, null, 2, null);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        final AppCompatActivity appCompatActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 67;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        appCompatActivity.setSupportActionBar(appCompatActivity.IEngagementSignalsCallbackStub().onWarmupCompleted);
        IPostMessageServiceStubProxy supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i4 = ICustomTabsCallbackStub + 59;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            supportActionBar.onExtraCallbackWithResult("");
        }
        AnimateTop animateTop = appCompatActivity.IEngagementSignalsCallbackStub().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(animateTop, "");
        String string = appCompatActivity.getString(R.string.app_mobile_license_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        readTimeout.asInterface.onExtraCallback onextracallback = readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult;
        getWriteTimeoutokhttp.onWarmupCompleted onwarmupcompleted = new getWriteTimeoutokhttp.onWarmupCompleted(string, onextracallback, 0, (AnimateText.onNavigationEvent) null, false, false, (Function0) null, (Function0) null, (Function0) null, 504, (DefaultConstructorMarker) null);
        String string2 = appCompatActivity.getString(R.string.app_mobile_license_subtitle, PlayerErrorCode.onPostMessage());
        Intrinsics.checkNotNullExpressionValue(string2, "");
        AnimateTop.onExtraCallback(animateTop, new getWriteTimeoutokhttp.onWarmupCompleted(string2, onextracallback, 300, (AnimateText.onNavigationEvent) null, false, false, (Function0) null, (Function0) null, (Function0) null, 504, (DefaultConstructorMarker) null), onwarmupcompleted, (getWriteTimeoutokhttp) null, false, false, 28, (Object) null);
        final TdsBottomCtaV1View tdsBottomCtaV1View = appCompatActivity.IEngagementSignalsCallbackStub().onExtraCallback;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string3 = appCompatActivity.getString(R.string.app_driver_license_cta);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string3, new View.OnClickListener() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DriverLicenseVerifyActivity.IAuthTabCallback(this.f$0, tdsBottomCtaV1View, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        if (appCompatActivity.IPostMessageServiceDefault()) {
            tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
            tdsBottomCtaV1View.setBottomButtonArrow(true);
            tdsBottomCtaV1View.setBottomButton(appCompatActivity.getString(R.string.app_driver_license_bottom_button), new View.OnClickListener() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda27
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DriverLicenseVerifyActivity.onExtraCallbackWithResult(this.f$0, view);
                }
            });
        }
        int i6 = ICustomTabsCallbackStub + 113;
        ICustomTabsCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.driver.DriverLicenseVerifyActivity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ?? r1 = (DriverLicenseVerifyActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(r1.getScreenParams());
        Object[] objArr2 = new Object[1];
        a(new char[]{56696, 26264, 43648, 61067, 12969, 30375, 47759, 65199, 715, 18113, 35536, 52962}, 48119 - TextUtils.indexOf("", "", 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), r1.getString(R.string.app_driver_license_bottom_button));
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 101;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallback(final DriverLicenseVerifyActivity driverLicenseVerifyActivity, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1230999L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                return (Unit) DriverLicenseVerifyActivity.onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -740294497, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 740294497);
            }
        }, 14, (Object) null);
        onWarmupCompleted(driverLicenseVerifyActivity, 4, null, 2, null);
        int i2 = ICustomTabsCallbackStub + 105;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(driverLicenseVerifyActivity), driverLicenseVerifyActivity.asInterface, (setRandomHost) null, driverLicenseVerifyActivity.new onNavigationEvent((r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU) new Gson().fromJson((String) objArr[1], r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU.class), null), 2, (Object) null);
        int i2 = ICustomTabsCallbackStubProxy + 95;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit access000(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
            Object[] objArr = new Object[1];
            a(new char[]{56668, 7980, 22973, 39475}, TextUtils.getOffsetAfter("", 0) * 49783, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
            Object[] objArr2 = new Object[1];
            a(new char[]{56668, 7980, 22973, 39475}, TextUtils.getOffsetAfter("", 0) + 49783, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback("result_type", ((String) obj).intern());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.driver.DriverLicenseVerifyActivity] */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ?? r1 = (DriverLicenseVerifyActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(r1.getScreenParams());
        setDetectableSize.onExtraCallback("dialog_title", r1.getString(R.string.app_driver___6da22266ff));
        setDetectableSize.onExtraCallback("dialog_description", str);
        setDetectableSize.onExtraCallback("err_code", str2);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(final String str) {
        final String string;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1612624L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return DriverLicenseVerifyActivity.IAuthTabCallbackStub(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        if (IPostMessageServiceDefault()) {
            int i2 = ICustomTabsCallbackStub + 115;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            string = getString(R.string.app_driver___dfcaae7f39);
            int i4 = ICustomTabsCallbackStubProxy + 59;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = getString(R.string.app_driver_license_retry);
        }
        Intrinsics.checkNotNull(string);
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        ((DriverLicenseLoadingDialog) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2047550335, iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2047550352)).dismiss();
        ConvertByteArrayToFloatArray.onExtraCallback(1230995L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, string, str, (SetDetectableSize) obj};
                return (Unit) DriverLicenseVerifyActivity.onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 208003381, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -208003367);
            }
        }, 14, (Object) null);
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return DriverLicenseVerifyActivity.IAuthTabCallback(this.f$0, string, str, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 5;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(driverLicenseVerifyActivity.getScreenParams());
        setDetectableSize.onExtraCallback("dialog_title", driverLicenseVerifyActivity.getString(R.string.app_driver___6da22266ff));
        setDetectableSize.onExtraCallback("dialog_description", str);
        setDetectableSize.onExtraCallback("err_code", str2);
        Object[] objArr = new Object[1];
        a(new char[]{56696, 26264, 43648, 61067, 12969, 30375, 47759, 65199, 715, 18113, 35536, 52962}, View.combineMeasuredStates(0, 0) + 48119, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), driverLicenseVerifyActivity.getString(R.string.confirm_name));
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(final DriverLicenseVerifyActivity driverLicenseVerifyActivity, final String str, final String str2, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(driverLicenseVerifyActivity.getString(R.string.app_driver___6da22266ff));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallback(new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return DriverLicenseVerifyActivity.onWarmupCompleted(this.f$0, str, str2, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{56680, 41938, 8230, 41336, 10204, 41993, 9585, 43987}, (Process.myPid() >> 22) + 32429, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ITrustedWebActivityCallbackDefault());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("service_referrer", ITrustedWebActivityCallbackStubProxy());
        Object[] objArr2 = new Object[1];
        a(new char[]{56703, 23061, 54144, 19213, 49319, 30742, 61881, 26933, 59076, 7770}, 34679 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), IPostMessageService());
        Object[] objArr3 = new Object[1];
        c((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39852), 9 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), getString(R.string.app_mobile_license_title));
        int i4 = R.string.app_mobile_license_subtitle;
        Object[] objArr4 = {PlayerErrorCode.onPostMessage()};
        Object[] objArr5 = new Object[1];
        c(11 - Color.green(0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 32272), 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), getString(i4, objArr4));
        String str = "Y";
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("continue_yn", ((Boolean) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1487960362, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1487960346)).booleanValue() ? "Y" : "N");
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("idcard_terms_id", ITrustedWebActivityCallback() != 0 ? Long.valueOf(ITrustedWebActivityCallback()) : null);
        if (ITrustedWebActivityCallback() != 0) {
            int i5 = ICustomTabsCallbackStub + 39;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } else {
            str = "N";
        }
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback("idcard_terms_id_yn", str), getWrite.IAuthTabCallback("idcard_type", getString(R.string.app_driver___ae054be80a))});
    }

    public boolean bg_() {
        int i = 2 % 2;
        if (super.bg_()) {
            int i2 = ICustomTabsCallbackStubProxy + 107;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (areNotificationsEnabled()) {
            int i4 = ICustomTabsCallbackStubProxy + 43;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            notifyNotificationWithChannel();
            return true;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1252415L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                return (Unit) DriverLicenseVerifyActivity.onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -131804460, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 131804464);
            }
        }, 14, (Object) null);
        return false;
    }

    private static final Unit IAuthTabCallbackDefault(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{56680, 41938, 8230, 41336, 10204, 41993, 9585, 43987}, 32429 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), driverLicenseVerifyActivity.ITrustedWebActivityCallbackDefault());
        setDetectableSize.onExtraCallback("service_referrer", driverLicenseVerifyActivity.ITrustedWebActivityCallbackStubProxy());
        Object[] objArr2 = new Object[1];
        a(new char[]{56703, 23061, 54144, 19213, 49319, 30742, 61881, 26933, 59076, 7770}, Color.red(0) + 34679, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), driverLicenseVerifyActivity.IPostMessageService());
        Object[] objArr3 = new Object[1];
        c(9 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionType(0L), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), "N");
        Object[] objArr4 = new Object[1];
        a(new char[]{56665, 44248, 15954, 35280, 6995, 60121, 29773, 51147}, 29059 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
        setDetectableSize.onExtraCallback("end_type", ((String) objArr4[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 7;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyNotificationWithChannel() {
        int i = 2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        long jLongValue = ((Long) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1952304181, iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1952304187)).longValue();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        enableWebPerformanceAPIsByDefault.onWarmupCompleted(this, jLongValue, ((Boolean) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1487960362, iOnExtraCallback2, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1487960346)).booleanValue(), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda28
            public final Object invoke() {
                return DriverLicenseVerifyActivity.IAuthTabCallback_Parcel(this.f$0);
            }
        }, new Function0() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda29
            public final Object invoke() {
                return DriverLicenseVerifyActivity.ICustomTabsServiceStub();
            }
        }, 1612442L, getScreenParams());
        int i2 = ICustomTabsCallbackStubProxy + 47;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 45;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{56680, 41938, 8230, 41336, 10204, 41993, 9585, 43987}, 32428 - TextUtils.lastIndexOf("", '0'), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), driverLicenseVerifyActivity.ITrustedWebActivityCallbackDefault());
        setDetectableSize.onExtraCallback("service_referrer", driverLicenseVerifyActivity.ITrustedWebActivityCallbackStubProxy());
        Object[] objArr2 = new Object[1];
        a(new char[]{56703, 23061, 54144, 19213, 49319, 30742, 61881, 26933, 59076, 7770}, Color.argb(0, 0, 0, 0) + 34679, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), driverLicenseVerifyActivity.IPostMessageService());
        Object[] objArr3 = new Object[1];
        c(9 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 1, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), "N");
        Object[] objArr4 = new Object[1];
        a(new char[]{56665, 44248, 15954, 35280, 6995, 60121, 29773, 51147}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29058, objArr4);
        setDetectableSize.onExtraCallback("end_type", ((String) objArr4[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 17;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        final DriverLicenseVerifyActivity driverLicenseVerifyActivity = (DriverLicenseVerifyActivity) objArr[0];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1252415L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return DriverLicenseVerifyActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        onWarmupCompleted(driverLicenseVerifyActivity, 0, null, 2, null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit ITrustedWebActivityServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStub + 77;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static /* synthetic */ void onWarmupCompleted(DriverLicenseVerifyActivity driverLicenseVerifyActivity, int i, Intent intent, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = ICustomTabsCallbackStub;
            int i5 = i4 + 47;
            ICustomTabsCallbackStubProxy = i5 % 128;
            Object obj2 = null;
            if (i5 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i6 = i4 + 23;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            intent = null;
        }
        driverLicenseVerifyActivity.onExtraCallback(i, intent);
        int i8 = ICustomTabsCallbackStub + 115;
        ICustomTabsCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(viva.republica.toss.driver.DriverLicenseVerifyActivity r6, int r7, o.SetDetectableSize r8) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.driver.DriverLicenseVerifyActivity.ICustomTabsCallbackStubProxy
            int r1 = r1 + 95
            int r2 = r1 % 128
            viva.republica.toss.driver.DriverLicenseVerifyActivity.ICustomTabsCallbackStub = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = -1
            java.lang.String r4 = ""
            r5 = 0
            if (r1 == 0) goto L23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            java.util.Map r1 = r6.getScreenParams()
            r8.onExtraCallback(r1)
            r1 = 31
            int r1 = r1 / r5
            if (r7 == r3) goto L69
            goto L2f
        L23:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            java.util.Map r1 = r6.getScreenParams()
            r8.onExtraCallback(r1)
            if (r7 == r3) goto L69
        L2f:
            int r1 = viva.republica.toss.driver.DriverLicenseVerifyActivity.ICustomTabsCallbackStub
            int r1 = r1 + 123
            int r3 = r1 % 128
            viva.republica.toss.driver.DriverLicenseVerifyActivity.ICustomTabsCallbackStubProxy = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L3e
            r1 = 3
            if (r7 == r1) goto L4b
            goto L41
        L3e:
            r1 = 4
            if (r7 == r1) goto L4b
        L41:
            int r3 = r3 + 33
            int r7 = r3 % 128
            viva.republica.toss.driver.DriverLicenseVerifyActivity.ICustomTabsCallbackStub = r7
            int r3 = r3 % r0
            java.lang.String r7 = "ERROR"
            goto L8b
        L4b:
            r7 = 8
            char[] r7 = new char[r7]
            r7 = {x00b0: FILL_ARRAY_DATA , data: [-8871, -21288, 15954, -30256, 6995, -5415, 29773, -14389} // fill-array
            float r0 = android.media.AudioTrack.getMinVolume()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            int r0 = 29059 - r0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            a(r7, r0, r1)
            r7 = r1[r5]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r7.intern()
            goto L8b
        L69:
            r7 = 7
            char[] r7 = new char[r7]
            r7 = {x00bc: FILL_ARRAY_DATA , data: [-8887, -9184, -8313, -9964, -10013, -9630, -10797} // fill-array
            int r1 = android.graphics.Color.green(r5)
            int r1 = r1 + 367
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r7, r1, r2)
            r7 = r2[r5]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r7.intern()
            int r1 = viva.republica.toss.driver.DriverLicenseVerifyActivity.ICustomTabsCallbackStub
            int r1 = r1 + 83
            int r2 = r1 % 128
            viva.republica.toss.driver.DriverLicenseVerifyActivity.ICustomTabsCallbackStubProxy = r2
            int r1 = r1 % r0
        L8b:
            java.lang.String r0 = "end_type"
            r8.onExtraCallback(r0, r7)
            int r7 = viva.republica.toss.R.string.app_driver___c8c75b4988
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r0 = "idcard_type"
            r8.onExtraCallback(r0, r7)
            java.lang.String r7 = "requester_code"
            java.lang.String r0 = r6.IPostMessageService_Parcel()
            r8.onExtraCallback(r7, r0)
            java.lang.String r7 = "session_type"
            java.lang.String r6 = r6.ITrustedWebActivityCallback_Parcel()
            r8.onExtraCallback(r7, r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.driver.DriverLicenseVerifyActivity.onNavigationEvent(viva.republica.toss.driver.DriverLicenseVerifyActivity, int, o.SetDetectableSize):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(final int i, Intent intent) {
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1226259L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.driver.DriverLicenseVerifyActivity$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return DriverLicenseVerifyActivity.onExtraCallbackWithResult(this.f$0, i, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        if (i == 10) {
            int i3 = ICustomTabsCallbackStubProxy + 31;
            ICustomTabsCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        }
        if (intent == null) {
            setResult(i);
        } else {
            int i5 = ICustomTabsCallbackStub + 125;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                setResult(i, intent);
                int i6 = 14 / 0;
            } else {
                setResult(i, intent);
            }
        }
        finish();
    }

    private final Intent IPostMessageServiceStubProxy() throws Throwable {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 101;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (getSmallIconBitmap()) {
            int i4 = ICustomTabsCallbackStubProxy + 109;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{56697, 16982, 58161, ']', 41445, 50900, 26533, 33948, 9335, 17743, 59939, 2997, 43231, 51635, 28308, 36453, 12101, 19488, 60680, 4781, 46037, 53430, 28785, 37209, 13856, 22288, 62713, 5582, 47801, 56194, 31602, 38988}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132027062).substring(4, 5).length() + 40738, objArr);
            pairIAuthTabCallback = getWrite.IAuthTabCallback("mobileidfw", ((String) objArr[0]).intern());
            int i6 = ICustomTabsCallbackStubProxy + 103;
            ICustomTabsCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{56689, 4393, 17846, 47550, 60529, 8305, 5361, 18610, 49008, 62266, 10236, 7092, 20095, 33331}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 52181, objArr2);
            pairIAuthTabCallback = getWrite.IAuthTabCallback("mobileid", ((String) objArr2[0]).intern());
        }
        String str = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
        String str2 = (String) pairIAuthTabCallback.IAuthTabCallback();
        viewCullingOutsetRatio activeNotifications = getActiveNotifications();
        String strOnExtraCallbackWithResult = activeNotifications != null ? activeNotifications.onExtraCallbackWithResult() : null;
        if (strOnExtraCallbackWithResult == null) {
            int i8 = ICustomTabsCallbackStubProxy + 53;
            ICustomTabsCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            strOnExtraCallbackWithResult = "";
        }
        Uri uri = Uri.parse(str + "://verify?data_type=string&data=" + strOnExtraCallbackWithResult);
        Object[] objArr3 = new Object[1];
        a(new char[]{56684, 51386, 63202, 39996, 35432, 45498}, 5574 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
        Intent intent = new Intent(((String) objArr3[0]).intern(), uri).setPackage(str2);
        Intrinsics.checkNotNullExpressionValue(intent, "");
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getSmallIconBitmap() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{56684, 51386, 63202, 39996, 35432, 45498}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019716).substring(0, 16).codePointAt(8) + 5468, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern(), Uri.parse("mobileidfw://verify"));
        Object[] objArr2 = new Object[1];
        a(new char[]{56697, 16982, 58161, ']', 41445, 50900, 26533, 33948, 9335, 17743, 59939, 2997, 43231, 51635, 28308, 36453, 12101, 19488, 60680, 4781, 46037, 53430, 28785, 37209, 13856, 22288, 62713, 5582, 47801, 56194, 31602, 38988}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 40720, objArr2);
        intent.setPackage(((String) objArr2[0]).intern());
        if (intent.resolveActivity(getPackageManager()) == null) {
            return false;
        }
        int i2 = ICustomTabsCallbackStubProxy + 79;
        ICustomTabsCallbackStub = i2 % 128;
        return i2 % 2 == 0;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull viewCullingOutsetRatio viewcullingoutsetratio, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, long j2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(viewcullingoutsetratio, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) DriverLicenseVerifyActivity.class).putExtra("EXTRA_VERIFY_ID_CARD_ENTITY", (Parcelable) viewcullingoutsetratio).putExtra("EXTRA_REFERRER", str).putExtra("EXTRA_SERVICE_REFERRER", str2).putExtra("EXTRA_REQUESTER_CODE", str3).putExtra("EXTRA_SESSION_ID", j).putExtra("EXTRA_SESSION_TYPE", str4).putExtra("EXTRA_EXTRA_INFO", str5).putExtra("EXTRA_CAN_USE_ID_CARD", z).putExtra("EXTRA_SHOW_EXIT_INTERACTION", z2).putExtra("EXTRA_REUSABLE_SESSION_SUPPORTED", z3).putExtra("EXTRA_REUSABLE_ID_CARD_OCR_TERMS_ID", j2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    public static /* synthetic */ long IAuthTabCallbackStub(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Long) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1923436628, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1923436630)).longValue();
    }

    public static /* synthetic */ Unit IAuthTabCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -740294497, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, setDetectableSize}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 740294497);
    }

    public static /* synthetic */ boolean access000(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Boolean) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -620027107, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 620027120)).booleanValue();
    }

    public static /* synthetic */ Unit onNavigationEvent(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -131804460, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, setDetectableSize}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 131804464);
    }

    public static /* synthetic */ Unit onExtraCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2032959950, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, setDetectableSize}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2032959947);
    }

    public static /* synthetic */ Unit onWarmupCompleted(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, String str2, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 208003381, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, str, str2, setDetectableSize}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -208003367);
    }

    private static final BaseRoundCornerProgressBarSavedState1.IAuthTabCallback IEngagementSignalsCallback_Parcel() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (BaseRoundCornerProgressBarSavedState1.IAuthTabCallback) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1668196663, iOnExtraCallback, new Object[0], EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1668196670);
    }

    private final DriverLicenseLoadingDialog IEngagementSignalsCallbackStubProxy() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (DriverLicenseLoadingDialog) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2047550335, iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2047550352);
    }

    private final boolean ITrustedWebActivityCallbackStub() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Boolean) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1487960362, iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1487960346)).booleanValue();
    }

    private final long ITrustedWebActivityService() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Long) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1952304181, iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1952304187)).longValue();
    }

    private final void getSmallIconId() throws Throwable {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -718383173, iOnExtraCallback, new Object[]{this}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 718383188);
    }

    private static final Unit asInterface(DriverLicenseVerifyActivity driverLicenseVerifyActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2079715255, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, setDetectableSize}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2079715250);
    }

    private static final Unit IAuthTabCallback(DriverLicenseVerifyActivity driverLicenseVerifyActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -945575763, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, iEngagementSignalsCallbackDefault}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 945575771);
    }

    private static final long ICustomTabsCallbackStub(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Long) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -796709930, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 796709941)).longValue();
    }

    private static final Unit ICustomTabsCallbackDefault(DriverLicenseVerifyActivity driverLicenseVerifyActivity) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2082833825, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2082833835);
    }

    private static final Unit onExtraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, String str2, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1257856250, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, str, str2, setDetectableSize}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1257856259);
    }

    private static final Unit onExtraCallbackWithResult(DriverLicenseVerifyActivity driverLicenseVerifyActivity, String str, String str2, DialogInterface dialogInterface) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1965841101, iOnExtraCallback, new Object[]{driverLicenseVerifyActivity, str, str2, dialogInterface}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1965841113);
    }

    private final void onExtraCallback(String str) throws Throwable {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 208301024, iOnExtraCallback, new Object[]{this, str}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -208301023);
    }

    @Override // viva.republica.toss.driver.Hilt_DriverLicenseVerifyActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStub + 71;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.driver.Hilt_DriverLicenseVerifyActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 113;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = ICustomTabsCallbackStub + 29;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.driver.Hilt_DriverLicenseVerifyActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = ICustomTabsCallbackStub + 85;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.driver.Hilt_DriverLicenseVerifyActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 31;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
    }

    static void onVerticalScrollEvent() {
        onPostMessage = 1520287998439348269L;
        ICustomTabsCallbackDefault = new char[]{60839, 61506, 54897, 46110, 39485, 30920, 24309, 15550, 693, 57665, 30219, 27637, 19917, 12218, 406, 37792, 36418, 43121, 51726, 58426, 1730, 8422, 17029, 31925, 40784, 47476};
        onUnminimized = 8629545154087022647L;
    }
}
