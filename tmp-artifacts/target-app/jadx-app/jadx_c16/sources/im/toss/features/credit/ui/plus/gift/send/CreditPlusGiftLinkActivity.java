package im.toss.features.credit.ui.plus.gift.send;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftLinkActivity$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DocumentMatcher1;
import o.IPostMessageServiceStubProxy;
import o.ParamUtils;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TombstoneProtosMemoryMappingBuilder;
import o.callTimeoutMillis;
import o.certificateChainCleaner;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.hasRootStatusPermission;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.normalizeWritePath;
import o.readIntokhttp;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusGiftLinkActivity extends Hilt_CreditPlusGiftLinkActivity implements SetDetectingInterval {
    private static int IAuthTabCallbackDefault = 0;
    private static int getInterfaceDescriptor = 1;

    @Inject
    public hasRootStatusPermission creditPlusApi;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new CreditPlusGiftLinkActivity$.ExternalSyntheticLambda4(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new CreditPlusGiftLinkActivity$.ExternalSyntheticLambda5(this));
    private final Lazy asBinder = isStopUpload.onNavigationEvent(this, 1392315, (Function1) null, (Function1) null, 6, (Object) null);

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i2)) | i9 | (~(i8 | i2));
        int i11 = ~i2;
        int i12 = (~(i11 | i8 | i4)) | (~(i7 | i11 | i5));
        int i13 = i4 + i5 + i6 + ((-195996979) * i) + ((-904719387) * i3);
        int i14 = i13 * i13;
        int i15 = (i4 * 1886715248) + 940376064 + (1886715248 * i5) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i6) + ((-1389494272) * i) + (1623064576 * i3) + (1510801408 * i14);
        int i16 = (i4 * 1590984816) + 1398186415 + (i5 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i6 * 1590985553) + (i * (-1025631779)) + (i3 * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(view);
        int i4 = getInterfaceDescriptor + 37;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditPlusGiftLinkActivity creditPlusGiftLinkActivity = (CreditPlusGiftLinkActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(creditPlusGiftLinkActivity);
        }
        IAuthTabCallback(creditPlusGiftLinkActivity);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditPlusGiftLinkActivity creditPlusGiftLinkActivity = (CreditPlusGiftLinkActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPlusGiftLinkActivity, view);
        int i4 = IAuthTabCallbackDefault + 23;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(creditPlusGiftLinkActivity);
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(view);
        int i3 = getInterfaceDescriptor + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditPlusGiftLinkActivity creditPlusGiftLinkActivity = (CreditPlusGiftLinkActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(creditPlusGiftLinkActivity, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusGiftLinkActivity, th);
        int i3 = IAuthTabCallbackDefault + 25;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(creditPlusGiftLinkActivity, view);
        }
        onNavigationEvent(creditPlusGiftLinkActivity, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements Function0<normalizeWritePath> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Activity IAuthTabCallback;

        public onWarmupCompleted(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 == 0) {
                int i4 = 34 / 0;
            }
            return searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        }

        public final normalizeWritePath onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                return normalizeWritePath.IAuthTabCallback(layoutInflater);
            }
            LayoutInflater layoutInflater2 = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
            normalizeWritePath.IAuthTabCallback(layoutInflater2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = getInterfaceDescriptor + 19;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = IAuthTabCallbackDefault + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = getInterfaceDescriptor + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getScreenId();
        }
        super.getScreenId();
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.getScreenParams();
            obj.hashCode();
            throw null;
        }
        Map<String, Object> screenParams = super.getScreenParams();
        int i3 = getInterfaceDescriptor + 85;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return screenParams;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = getInterfaceDescriptor + 111;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = IAuthTabCallbackDefault + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = IAuthTabCallbackDefault + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsServiceDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = getInterfaceDescriptor + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = IAuthTabCallbackDefault + 85;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = getInterfaceDescriptor + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = getInterfaceDescriptor + 87;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final normalizeWritePath IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        normalizeWritePath normalizewritepath = (normalizeWritePath) this.asInterface.getValue();
        int i3 = IAuthTabCallbackDefault + 61;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return normalizewritepath;
    }

    private final String onSessionEnded() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallback(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intent intent = creditPlusGiftLinkActivity.getIntent();
        if (i3 != 0) {
            intent.getStringExtra("shareLink");
            throw null;
        }
        String stringExtra = intent.getStringExtra("shareLink");
        int i4 = getInterfaceDescriptor + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        obj.hashCode();
        throw null;
    }

    private final String IEngagementSignalsCallbackStub() {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.onTransact.getValue();
            int i3 = 22 / 0;
        } else {
            str = (String) this.onTransact.getValue();
        }
        int i4 = IAuthTabCallbackDefault + 123;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onWarmupCompleted(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = creditPlusGiftLinkActivity.getIntent().getStringExtra("recipientUserName");
        int i4 = getInterfaceDescriptor + 67;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.asBinder.getValue();
        int i4 = getInterfaceDescriptor + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftLinkActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(IEngagementSignalsCallbackDefault().onWarmupCompleted());
        ConstraintLayout constraintLayoutOnWarmupCompleted = IEngagementSignalsCallbackDefault().onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnWarmupCompleted, IEngagementSignalsCallbackDefault().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -636472973, new Object[]{this}, 636472973, iOnWarmupCompleted2);
        int i4 = IAuthTabCallbackDefault + 67;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallback + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 79;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = 21 / 0;
            } else {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            }
            int i4 = onNavigationEvent + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    private static final Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 69;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        creditPlusGiftLinkActivity.IEngagementSignalsCallbackStubProxy();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 97;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppCompatActivity appCompatActivity = (CreditPlusGiftLinkActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            appCompatActivity.setSupportActionBar(appCompatActivity.IEngagementSignalsCallbackDefault().onNavigationEvent);
            IPostMessageServiceStubProxy supportActionBar = appCompatActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.IAuthTabCallbackStub(false);
            }
            TdsTopV2View tdsTopV2View = appCompatActivity.IEngagementSignalsCallbackDefault().onExtraCallbackWithResult;
            Intrinsics.checkNotNull(tdsTopV2View);
            DocumentMatcher1.onExtraCallbackWithResult(tdsTopV2View, appCompatActivity.IEngagementSignalsCallbackStub());
            tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
            tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
            Context context = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onUnminimized());
            String string = appCompatActivity.getString(R.string.credit_ui_plus_gift_success_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = String.format(string, Arrays.copyOf(new Object[]{appCompatActivity.IEngagementSignalsCallbackStub()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            tdsTopV2View.setTitleText(str);
            TdsTopV2View.onExtraCallbackWithResult onextracallbackwithresult = TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH;
            tdsTopV2View.setSubtitle1Type(onextracallbackwithresult);
            TdsTopV2View.onWarmupCompleted onwarmupcompleted = TdsTopV2View.onWarmupCompleted.SIZE_17;
            tdsTopV2View.setSubtitle1TextSize(onwarmupcompleted);
            Context context2 = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsTopV2View.setSubtitle1TextColor(new getUrlokhttp(new IAuthTabCallback(configuration2)).asBinder());
            String string2 = appCompatActivity.getString(R.string.credit_ui_plus_gift_success_subtitle1);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            tdsTopV2View.setSubtitle1Text(string2);
            tdsTopV2View.setSubtitle2Type(onextracallbackwithresult);
            tdsTopV2View.setSubtitle2TextSize(onwarmupcompleted);
            String string3 = appCompatActivity.getString(R.string.credit_ui_plus_gift_success_subtitle2);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            tdsTopV2View.setSubtitle2Text(string3);
            Context context3 = tdsTopV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            tdsTopV2View.setSubtitle2TextColor(new getUrlokhttp(new onExtraCallback(configuration3)).ICustomTabsCallbackStubProxy());
            TdsBottomCtaV1View tdsBottomCtaV1View = appCompatActivity.IEngagementSignalsCallbackDefault().onExtraCallback;
            Intrinsics.checkNotNull(tdsBottomCtaV1View);
            String string4 = appCompatActivity.getString(R.string.credit_ui_plus_gift_success_cta);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string4, new CreditPlusGiftLinkActivity$.ExternalSyntheticLambda0(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
            ParamUtils paramUtils = ParamUtils.NORMAL;
            Object[] objArr2 = {tdsButtonV1ViewAsInterface, paramUtils, new CreditPlusGiftLinkActivity$.ExternalSyntheticLambda1(appCompatActivity)};
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            tdsBottomCtaV1View.setBottomButton(appCompatActivity.getString(R.string.credit_ui_plus_gift_success_cta_label), new CreditPlusGiftLinkActivity$.ExternalSyntheticLambda2());
            tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.GREY);
            Object[] objArr3 = {tdsBottomCtaV1View.onExtraCallbackWithResult(), paramUtils, new CreditPlusGiftLinkActivity$.ExternalSyntheticLambda3(appCompatActivity)};
            int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int i3 = getInterfaceDescriptor + 113;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        appCompatActivity.setSupportActionBar(appCompatActivity.IEngagementSignalsCallbackDefault().onNavigationEvent);
        appCompatActivity.getSupportActionBar();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusGiftLinkActivity.finish();
            SessionTrackerb.IAuthTabCallback(creditPlusGiftLinkActivity.ICustomTabsService_Parcel(), creditPlusGiftLinkActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallback_Parcel.onExtraCallback, false, "credit_plus_gift_share", true, (Map) null, 14, (Object) null), true, (Function1) null, (Bundle) null, true, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusGiftLinkActivity.finish();
            SessionTrackerb.IAuthTabCallback(creditPlusGiftLinkActivity.ICustomTabsService_Parcel(), creditPlusGiftLinkActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.IAuthTabCallback_Parcel.onExtraCallback, false, "credit_plus_gift_share", false, (Map) null, 13, (Object) null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStubProxy() {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        callTimeoutMillis.onNavigationEvent onnavigationevent = callTimeoutMillis.Companion;
        String strOnSessionEnded = onSessionEnded();
        if (strOnSessionEnded == null) {
            int i4 = getInterfaceDescriptor + 31;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
            str = "";
        } else {
            str = strOnSessionEnded;
        }
        callTimeoutMillis.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, this, str, new certificateChainCleaner(getReferrerParam(), "credit_plus_gift", (String) null, 4, (DefaultConstructorMarker) null), (List) null, (String) null, getString(R.string.credit_ui_plus_gift_link_share_title), (Function1) null, new CreditPlusGiftLinkActivity$.ExternalSyntheticLambda6(this), 88, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, creditPlusGiftLinkActivity, true, (initMiniApp) null, (Function0) null, (Function1) null, 45, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            getParamImp.onWarmupCompleted(th, creditPlusGiftLinkActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 83;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            setResult(-1);
            super.onDestroy();
            int i3 = getInterfaceDescriptor + 55;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 59 / 0;
                return;
            }
            return;
        }
        setResult(-1);
        super.onDestroy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (String) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 548971971, new Object[]{creditPlusGiftLinkActivity}, -548971970, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, Throwable th) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1955676825, new Object[]{creditPlusGiftLinkActivity, th}, 1955676828, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusGiftLinkActivity creditPlusGiftLinkActivity, View view) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1802363652, new Object[]{creditPlusGiftLinkActivity, view}, -1802363650, iOnWarmupCompleted2);
    }

    private final void onVerticalScrollEvent() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        IAuthTabCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -636472973, new Object[]{this}, 636472973, iOnWarmupCompleted2);
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftLinkActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftLinkActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftLinkActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftLinkActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
