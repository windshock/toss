package im.toss.feature.credit.ui.history.detail.latest;

import android.content.Context;
import android.os.Bundle;
import im.toss.feature.credit.ui.history.detail.latest.CreditHistoryLoanDisclaimerActivity$;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.ForwardingCameraControl;
import o.PromptPoint;
import o.QuirksExternalSyntheticBackport0;
import o.RuntimeOptimizeSwitch;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.getAppAlias;
import o.getSupportedHighSpeedResolutionsFor;
import o.maybeUpdateAnimatable;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHistoryLoanDisclaimerActivity extends Hilt_CreditHistoryLoanDisclaimerActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final getSupportedHighSpeedResolutionsFor<String> asBinder = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);

    @Inject
    public getAppAlias creditGatewayApi;

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHistoryLoanDisclaimerActivity);
        int i4 = onTransact + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditHistoryLoanDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 19;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 67;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(creditHistoryLoanDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(creditHistoryLoanDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 17;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final /* synthetic */ getSupportedHighSpeedResolutionsFor onExtraCallback(CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 3;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor = creditHistoryLoanDisclaimerActivity.asBinder;
        int i5 = i2 + 119;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r4 = r1 + 31;
        im.toss.feature.credit.ui.history.detail.latest.CreditHistoryLoanDisclaimerActivity.onTransact = r4 % 128;
        r4 = r4 % 2;
        r1 = r1 + 55;
        im.toss.feature.credit.ui.history.detail.latest.CreditHistoryLoanDisclaimerActivity.onTransact = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getAppAlias onNavigationEvent() {
        getAppAlias getappalias;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 75;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            getappalias = this.creditGatewayApi;
            int i4 = 10 / 0;
        } else {
            getappalias = this.creditGatewayApi;
        }
    }

    private static final Unit onWarmupCompleted(CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryLoanDisclaimerActivity.finish();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(518341644, i, -1, "im.toss.feature.credit.ui.history.detail.latest.CreditHistoryLoanDisclaimerActivity.onCreate.<anonymous>.<anonymous> (CreditHistoryLoanDisclaimerActivity.kt:41)");
            }
            String str = (String) creditHistoryLoanDisclaimerActivity.asBinder.onExtraCallbackWithResult();
            if (str == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1508530654);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i3 = onTransact + 125;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 / 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1508530655);
                RuntimeOptimizeSwitch.onWarmupCompleted(str, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i5 = onTransact + 99;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStub + 121;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(211032422, i, -1, "im.toss.feature.credit.ui.history.detail.latest.CreditHistoryLoanDisclaimerActivity.onCreate.<anonymous> (CreditHistoryLoanDisclaimerActivity.kt:38)");
                int i3 = IAuthTabCallbackStub + 23;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHistoryLoanDisclaimerActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback)) {
                CreditHistoryLoanDisclaimerActivity$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new CreditHistoryLoanDisclaimerActivity$.ExternalSyntheticLambda0(creditHistoryLoanDisclaimerActivity);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                obj = externalSyntheticLambda0;
                PromptPoint.onExtraCallback((QuirksExternalSyntheticBackport0) null, 0L, (Function0) obj, ForwardingCameraControl.onExtraCallback(518341644, true, new CreditHistoryLoanDisclaimerActivity$.ExternalSyntheticLambda1(creditHistoryLoanDisclaimerActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3072, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                PromptPoint.onExtraCallback((QuirksExternalSyntheticBackport0) null, 0L, (Function0) obj, ForwardingCameraControl.onExtraCallback(518341644, true, new CreditHistoryLoanDisclaimerActivity$.ExternalSyntheticLambda1(creditHistoryLoanDisclaimerActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3072, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 13;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return unit;
    }

    @Override // im.toss.feature.credit.ui.history.detail.latest.Hilt_CreditHistoryLoanDisclaimerActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(211032422, true, new CreditHistoryLoanDisclaimerActivity$.ExternalSyntheticLambda2(this))), 1, (Object) null);
        IAuthTabCallback();
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.feature.credit.ui.history.detail.latest.Hilt_CreditHistoryLoanDisclaimerActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.feature.credit.ui.history.detail.latest.Hilt_CreditHistoryLoanDisclaimerActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.feature.credit.ui.history.detail.latest.Hilt_CreditHistoryLoanDisclaimerActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.feature.credit.ui.history.detail.latest.Hilt_CreditHistoryLoanDisclaimerActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
