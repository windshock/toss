package im.toss.features.credit.ui.plus.setting;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import im.toss.features.credit.data.response.membership.CreditPlusUnsubscribeDefenseResponse;
import im.toss.features.credit.ui.plus.setting.CreditPlusUnsubscribeBenefitActivity$;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.R;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getRouteDatabase;
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
import o.maybeUpdateAnimatable;
import o.readIntokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setRubIn;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusUnsubscribeBenefitActivity extends Hilt_CreditPlusUnsubscribeBenefitActivity implements SetDetectingInterval {
    private ViewGroup IAuthTabCallbackDefault;
    private TdsBottomCtaV1View IAuthTabCallbackStub;

    @Inject
    public hasRootStatusPermission creditPlusApi;
    private final Lazy onTransact = isStopUpload.onNavigationEvent(this, 1357027, (Function1) null, new CreditPlusUnsubscribeBenefitActivity$.ExternalSyntheticLambda0(this), 2, (Object) null);

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {51, -113, 92, 4};
    private static final int $$b = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static long asInterface = 7798559133331975163L;
    private static int asBinder = -1776194565;
    private static char access000 = 62649;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2;
        int i3 = (b * 3) + 1;
        byte[] bArr = $$a;
        int i4 = 4 - (s * 4);
        int i5 = 110 - s2;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = (-i4) + i7;
            int i9 = i6 + 1;
            i = i2;
            i5 = i8;
            i4 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i10 = i5;
            i6 = i4;
            i4 = bArr[i4];
            i7 = i10;
            int i82 = (-i4) + i7;
            int i92 = i6 + 1;
            i = i2;
            i5 = i82;
            i4 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~(i4 | i6);
        int i8 = (~i2) | (~i6);
        int i9 = (~i8) | i4;
        int i10 = (~(i6 | i2)) | (~((~i4) | i2)) | (~(i8 | i4));
        int i11 = i2 + i4 + i5 + ((-101282902) * i) + ((-829309908) * i3);
        int i12 = i11 * i11;
        int i13 = ((i2 * 42798203) - 224002048) + (42798203 * i4) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i5) + (1710751744 * i) + ((-1643118592) * i3) + ((-1134166016) * i12);
        int i14 = (i2 * 1745018779) + 1790267665 + (i4 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i5 * 1745018721) + (i * (-1587019414)) + (i3 * (-1871011668)) + (i12 * 1017511936);
        return i13 + ((i14 * i14) * (-1139146752)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1548616483, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{creditPlusUnsubscribeBenefitActivity, view}, -1548616482, iIAuthTabCallback2, iIAuthTabCallback);
        int i4 = access100 + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity = (CreditPlusUnsubscribeBenefitActivity) objArr[0];
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusUnsubscribeBenefitActivity, tdsTopV2View);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 35;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPlusUnsubscribeBenefitActivity, view);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 65;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditPlusUnsubscribeBenefitActivity, onwarmupcompleted);
        int i4 = IAuthTabCallbackStubProxy + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ void onExtraCallback(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, CreditPlusUnsubscribeDefenseResponse creditPlusUnsubscribeDefenseResponse) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        creditPlusUnsubscribeBenefitActivity.onExtraCallback(creditPlusUnsubscribeDefenseResponse);
        if (i3 != 0) {
            throw null;
        }
        int i4 = access100 + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = IAuthTabCallbackStubProxy + 37;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = access100 + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = access100 + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess200;
        }
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.removeAttachLongUserData*/.aq_();
        }
        super/*o.removeAttachLongUserData*/.aq_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = access100 + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = IAuthTabCallbackStubProxy + 57;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return findresandmsgAs_;
        }
        throw null;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getScreenId();
        }
        super.getScreenId();
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = access100 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return screenParams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = access100 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = access100 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsService_Parcel = ICustomTabsService_Parcel();
        int i4 = access100 + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return hascrashwhenjavacrashICustomTabsService_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = IAuthTabCallbackStubProxy + 105;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = access100 + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final hasRootStatusPermission ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 109;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        hasRootStatusPermission hasrootstatuspermission = this.creditPlusApi;
        Object obj = null;
        if (hasrootstatuspermission == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = IAuthTabCallbackStubProxy + 103;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i2 + 35;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 == 0) {
            return hasrootstatuspermission;
        }
        obj.hashCode();
        throw null;
    }

    public hasCrashWhenJavaCrash ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.onTransact.getValue();
        int i4 = access100 + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a((char) KeyEvent.getDeadChar(0, 0), (Process.getThreadPriority(0) + 20) >> 6, new char[]{46808, 37136, 62704, 44073, 27518, 42089, 47358, 26528}, new char[]{0, 0, 0, 0}, new char[]{5741, 39712, 26641, 6677}, objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditPlusUnsubscribeBenefitActivity.getIntent()));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onWarmupCompleted + 79;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onWarmupCompleted + 41;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeBenefitActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), R.drawable.appbar_elevation_off));
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = access100 + 105;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                supportActionBar.IAuthTabCallbackStub(false);
            } else {
                supportActionBar.IAuthTabCallbackStub(false);
            }
        }
        IPostMessageServiceStubProxy supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            int i3 = IAuthTabCallbackStubProxy + 17;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                supportActionBar2.onNavigationEvent(false);
            } else {
                supportActionBar2.onNavigationEvent(true);
            }
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        objectRef.element = appBarLayout;
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context3, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        this.IAuthTabCallbackDefault = tdsScrollView;
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) FrameLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = -1;
        layoutParams4.height = -2;
        layoutParams4.gravity = 80;
        tdsBottomCtaV1View.setLayoutParams(layoutParams3);
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, tdsScrollView, false, 0, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        this.IAuthTabCallbackStub = tdsBottomCtaV1View;
        setContentView(linearLayout);
        disableImageViewPreallocationAndroid.onNavigationEvent(linearLayout, (View) objectRef.element, (View) null, (View) null, false, 14, (Object) null);
        IEngagementSignalsCallbackDefault();
    }

    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onSessionEnded() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 21;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    int iResolveSizeAndState = 43 - View.resolveSizeAndState(i5, i5, i5);
                    int offsetBefore = TextUtils.getOffsetBefore("", i5) + 1451;
                    byte b = (byte) i5;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, iResolveSizeAndState, offsetBefore, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cIndexOf = (char) (49123 - TextUtils.indexOf("", "", i5));
                    int absoluteGravity = Gravity.getAbsoluteGravity(i5, i5) + 44;
                    int iIndexOf = TextUtils.indexOf("", "", i5, i5) + 1494;
                    byte b3 = (byte) i5;
                    byte b4 = (byte) (b3 + 1);
                    String str$$c2 = $$c(b3, b4, (byte) (b4 - 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, absoluteGravity, iIndexOf, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char edgeSlop = (char) (23972 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50;
                    int threadPriority = ((Process.getThreadPriority(i5) + 20) >> 6) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, minimumFlingVelocity, threadPriority, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i9);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 45848);
                    int iMyPid = 29 - (Process.myPid() >> 22);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12577;
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, iMyPid, scrollBarFadeDuration, 1401536470, false, "l", clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (asBinder ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (asInterface ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i10 = $11 + 5;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i3 = i2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        String string = creditPlusUnsubscribeBenefitActivity.getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_unsubscribe_benefit_top_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 107;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Unit unit;
        CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity = (CreditPlusUnsubscribeBenefitActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusUnsubscribeBenefitActivity.onSessionEnded();
            unit = Unit.INSTANCE;
            int i3 = 89 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusUnsubscribeBenefitActivity.onSessionEnded();
            unit = Unit.INSTANCE;
        }
        int i4 = access100 + 65;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(CreditPlusUnsubscribeDefenseResponse creditPlusUnsubscribeDefenseResponse) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroup = this.IAuthTabCallbackDefault;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.IAuthTabCallbackDefault;
        if (viewGroup2 != null) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            getRouteDatabase.IAuthTabCallback(linearLayout, new CreditPlusUnsubscribeBenefitActivity$.ExternalSyntheticLambda1(this));
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1C);
            tdsListRowV1View.setCenterText1(getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_unsubscribe_refund_benefit_info));
            Context context2 = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new IAuthTabCallback(configuration)).onRelationshipValidationResult());
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
            List<CreditPlusUnsubscribeDefenseResponse.BenefitStatusSection> listOnExtraCallback = creditPlusUnsubscribeDefenseResponse.onExtraCallback();
            if (listOnExtraCallback != null) {
                int i4 = access100 + 37;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    listOnExtraCallback.iterator();
                    throw null;
                }
                for (CreditPlusUnsubscribeDefenseResponse.BenefitStatusSection benefitStatusSection : listOnExtraCallback) {
                    int i5 = IAuthTabCallbackStubProxy + 13;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    String strOnWarmupCompleted = benefitStatusSection.onWarmupCompleted();
                    if (strOnWarmupCompleted == null) {
                        int i7 = IAuthTabCallbackStubProxy + 121;
                        access100 = i7 % 128;
                        int i8 = i7 % 2;
                        strOnWarmupCompleted = "";
                    }
                    String strOnExtraCallbackWithResult = benefitStatusSection.onExtraCallbackWithResult();
                    if (strOnExtraCallbackWithResult == null) {
                        strOnExtraCallbackWithResult = "";
                    }
                    onNavigationEvent(linearLayout, strOnWarmupCompleted, strOnExtraCallbackWithResult);
                }
            }
            viewGroup2.addView(linearLayout);
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = this.IAuthTabCallbackStub;
        if (tdsBottomCtaV1View != null) {
            String string = getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_unsubscribe);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditPlusUnsubscribeBenefitActivity$.ExternalSyntheticLambda2(this), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK), false, 8, (Object) null);
        }
        TdsBottomCtaV1View tdsBottomCtaV1View2 = this.IAuthTabCallbackStub;
        if (tdsBottomCtaV1View2 != null) {
            String string2 = getString(R.string.uikit_cancel);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            tdsBottomCtaV1View2.setSecondary(string2, new CreditPlusUnsubscribeBenefitActivity$.ExternalSyntheticLambda3(this), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK));
        }
    }

    private static final Unit onExtraCallbackWithResult(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusUnsubscribeBenefitActivity.finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        creditPlusUnsubscribeBenefitActivity.finish();
        int i3 = 36 / 0;
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(LinearLayout linearLayout, String str, String str2) {
        int i = 2 % 2;
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View.setLeftImage(str);
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2));
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
        tdsListRowV1View.setCenterText1(str2);
        Context context2 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        tdsListRowV1View.setRightArrow(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, TdsTopV2View tdsTopV2View) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) IAuthTabCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 994635876, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{creditPlusUnsubscribeBenefitActivity, tdsTopV2View}, -994635876, iIAuthTabCallback2, iIAuthTabCallback);
    }

    private static final Unit onExtraCallback(CreditPlusUnsubscribeBenefitActivity creditPlusUnsubscribeBenefitActivity, View view) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) IAuthTabCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1548616483, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{creditPlusUnsubscribeBenefitActivity, view}, -1548616482, iIAuthTabCallback2, iIAuthTabCallback);
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeBenefitActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 63;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeBenefitActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeBenefitActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 95;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeBenefitActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 79;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }
}
