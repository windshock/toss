package im.toss.rn.toss.core.remoteprocess;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.rn.toss.core.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.access13800;
import o.logicVerifyID;
import o.onInterstitialAdDisplayed;
import o.onInterstitialAdLoaded;
import o.transGetKmCert;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RemoteProcessReactSchemeActivity extends Hilt_RemoteProcessReactSchemeActivity {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int onTransact;
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.remoteprocess.RemoteProcessReactSchemeActivity$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PreparedRnBundleSnapshot preparedRnBundleSnapshotOnExtraCallback = RemoteProcessReactSchemeActivity.onExtraCallback(this.f$0);
            int i4 = onNavigationEvent + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return preparedRnBundleSnapshotOnExtraCallback;
            }
            throw null;
        }
    });
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.remoteprocess.RemoteProcessReactSchemeActivity$$ExternalSyntheticLambda4
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onInterstitialAdDisplayed oninterstitialaddisplayedOnNavigationEvent = RemoteProcessReactSchemeActivity.onNavigationEvent(this.f$0);
            int i4 = onNavigationEvent + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return oninterstitialaddisplayedOnNavigationEvent;
            }
            throw null;
        }
    });

    static {
        int i = IAuthTabCallback_Parcel + 79;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(remoteProcessReactSchemeActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ PreparedRnBundleSnapshot onExtraCallback(RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        PreparedRnBundleSnapshot preparedRnBundleSnapshotOnWarmupCompleted = onWarmupCompleted(remoteProcessReactSchemeActivity);
        int i4 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return preparedRnBundleSnapshotOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i4)) | (~(i3 | i4));
        int i9 = i3 | i5;
        int i10 = (~(i5 | (~i4))) | (~(i7 | (~i3))) | (~i9);
        int i11 = i3 + i4 + i2 + (1350191703 * i) + ((-44904237) * i6);
        int i12 = i11 * i11;
        int i13 = ((i3 * (-560584373)) - 948043776) + ((-560584373) * i4) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i2) + ((-71041024) * i) + ((-766246912) * i6) + (1339949056 * i12);
        int i14 = (i3 * 1657715387) + 2046152777 + (i4 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i2 * 1657716305) + (i * 1507858311) + (i6 * 1845144771) + (i12 * 155058176);
        return i13 + ((i14 * i14) * 417464320) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(dialogInterface);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(dialogInterface);
        int i3 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity = (RemoteProcessReactSchemeActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(remoteProcessReactSchemeActivity, commonModule_setLeftEdgeTouchEnabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(remoteProcessReactSchemeActivity, commonModule_setLeftEdgeTouchEnabled);
        int i3 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ onInterstitialAdDisplayed onNavigationEvent(RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onInterstitialAdDisplayed oninterstitialaddisplayedOnExtraCallbackWithResult = onExtraCallbackWithResult(remoteProcessReactSchemeActivity);
        int i4 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return oninterstitialaddisplayedOnExtraCallbackWithResult;
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    private final PreparedRnBundleSnapshot ITrustedWebActivityCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) this.asInterface.getValue();
        int i4 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return preparedRnBundleSnapshot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final PreparedRnBundleSnapshot onWarmupCompleted(RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = remoteProcessReactSchemeActivity.getIntent().getStringExtra("rnRemoteProcessPreparedSnapshotId");
        if (stringExtra == null) {
            throw new IllegalStateException("Missing RN remote process snapshot id");
        }
        Context applicationContext = remoteProcessReactSchemeActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        PreparedRnBundleSnapshot preparedRnBundleSnapshotOnNavigationEvent = new onInterstitialAdLoaded(applicationContext).onNavigationEvent(stringExtra);
        int i4 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return preparedRnBundleSnapshotOnNavigationEvent;
    }

    private final onInterstitialAdDisplayed cancelNotification() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onInterstitialAdDisplayed oninterstitialaddisplayed = (onInterstitialAdDisplayed) this.asBinder.getValue();
        int i3 = IAuthTabCallbackDefault + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return oninterstitialaddisplayed;
    }

    private static final onInterstitialAdDisplayed onExtraCallbackWithResult(RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity) {
        int i = 2 % 2;
        onInterstitialAdDisplayed oninterstitialaddisplayed = new onInterstitialAdDisplayed(remoteProcessReactSchemeActivity.ITrustedWebActivityCallbackStubProxy());
        int i2 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return oninterstitialaddisplayed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public logicVerifyID IAuthTabCallbackStub() {
        Object obj;
        UnavailableBundleLoader unavailableBundleLoader;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(cancelNotification());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            int i2 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                onInterstitialAdDisplayed oninterstitialaddisplayed = (onInterstitialAdDisplayed) obj;
                onNavigationEvent(oninterstitialaddisplayed.onExtraCallback());
                onExtraCallbackWithResult(oninterstitialaddisplayed.onNavigationEvent());
                throw null;
            }
            onInterstitialAdDisplayed oninterstitialaddisplayed2 = (onInterstitialAdDisplayed) obj;
            onNavigationEvent(oninterstitialaddisplayed2.onExtraCallback());
            onExtraCallbackWithResult(oninterstitialaddisplayed2.onNavigationEvent());
            unavailableBundleLoader = oninterstitialaddisplayed2;
        } else {
            unavailableBundleLoader = new UnavailableBundleLoader(th2);
        }
        int i3 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unavailableBundleLoader;
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityService();
        int i4 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityService();
        int i4 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.rn.toss.core.ReactSchemeActivity
    public void onDestroy() throws Throwable {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("rnRemoteProcessPreparedSnapshotId");
        super.onDestroy();
        if (stringExtra != null) {
            int i2 = IAuthTabCallbackStub + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (isFinishing()) {
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                new onInterstitialAdLoaded(applicationContext).onExtraCallback(stringExtra);
                int i4 = IAuthTabCallbackStub + 23;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ITrustedWebActivityService() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!isFinishing()) {
            int i4 = IAuthTabCallbackStub + 99;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                isDestroyed();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!isDestroyed()) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: im.toss.rn.toss.core.remoteprocess.RemoteProcessReactSchemeActivity$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 87;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            Object[] objArr = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2};
                            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Object[] objArr2 = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2};
                        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                        Unit unit = (Unit) RemoteProcessReactSchemeActivity.onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -163679224, 163679224, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                        int i7 = IAuthTabCallback + 33;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        return unit;
                    }
                });
            }
        }
        int i5 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        remoteProcessReactSchemeActivity.finish();
        int i4 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(final RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(remoteProcessReactSchemeActivity.getString(R.string.rn___473c448391));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(remoteProcessReactSchemeActivity.getString(R.string.rn___9aeaa96689));
        String string = remoteProcessReactSchemeActivity.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: im.toss.rn.toss.core.remoteprocess.RemoteProcessReactSchemeActivity$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                Unit unit = (Unit) RemoteProcessReactSchemeActivity.onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{(DialogInterface) obj}, iIAuthTabCallback2, -2131092597, 2131092598, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                int i5 = IAuthTabCallback + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnDismissListener() { // from class: im.toss.rn.toss.core.remoteprocess.RemoteProcessReactSchemeActivity$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 9;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                RemoteProcessReactSchemeActivity.IAuthTabCallback(this.f$0, dialogInterface);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{dialogInterface}, iIAuthTabCallback2, -2131092597, 2131092598, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(RemoteProcessReactSchemeActivity remoteProcessReactSchemeActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{remoteProcessReactSchemeActivity, commonModule_setLeftEdgeTouchEnabled}, iIAuthTabCallback2, -163679224, 163679224, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    @Override // im.toss.rn.toss.core.remoteprocess.Hilt_RemoteProcessReactSchemeActivity, im.toss.rn.toss.core.ReactSchemeActivity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
    }

    @Override // im.toss.rn.toss.core.remoteprocess.Hilt_RemoteProcessReactSchemeActivity, im.toss.rn.toss.core.ReactSchemeActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.rn.toss.core.remoteprocess.Hilt_RemoteProcessReactSchemeActivity, im.toss.rn.toss.core.ReactSchemeActivity
    public void onResume() throws Throwable {
        super.onResume();
    }

    @Override // im.toss.rn.toss.core.remoteprocess.Hilt_RemoteProcessReactSchemeActivity, im.toss.rn.toss.core.ReactSchemeActivity
    public void onPause() {
        super.onPause();
    }

    static final class UnavailableBundleLoader implements logicVerifyID {
        private final Throwable onExtraCallback;

        public UnavailableBundleLoader(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallback = th;
        }

        public Object onWarmupCompleted(@NotNull access13800<? super transGetKmCert> access13800Var) {
            int i = 2 % 2;
            throw new IllegalStateException("RN remote process snapshot is unavailable", this.onExtraCallback);
        }
    }

    @Override // im.toss.rn.toss.core.remoteprocess.Hilt_RemoteProcessReactSchemeActivity, im.toss.rn.toss.core.ReactSchemeActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
