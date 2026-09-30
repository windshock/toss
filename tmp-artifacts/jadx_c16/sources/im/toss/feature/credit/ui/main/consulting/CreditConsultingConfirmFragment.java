package im.toss.feature.credit.ui.main.consulting;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.base.BaseFragment;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.consulting.CreditConsultingConfirmFragment$;
import im.toss.features.credit.data.response.CreditConsultingCategory;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.IEngagementSignalsCallback_Parcel;
import o.ParamUtils;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getAdService;
import o.getDispatcherokhttp;
import o.getDummyAd;
import o.getOriginalFullResponse;
import o.getPrivacyDestinationUri;
import o.getRouteDatabase;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.matches;
import o.maybeUpdateAnimatable;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.readIntokhttp;
import o.setBaseDeeplink;
import o.setBodyokhttp;
import o.setByteOrder;
import o.setHasShown;
import o.setProtocolsokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditConsultingConfirmFragment extends Hilt_CreditConsultingConfirmFragment implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;
    private static char[] onNavigationEvent = {64926, 64913, 64986, 64905, 64976, 64982, 64990, 64981, 64914, 64924, 64987, 64967, 64978, 64925, 64912, 64963, 64980, 64917, 64961, 64989, 64915, 64988, 64985, 64960, 64991};
    private static char onExtraCallback = 51244;
    private final Lazy onExtraCallbackWithResult = isStopUpload.onExtraCallback(this, 1310565, (Function1) null, new CreditConsultingConfirmFragment$.ExternalSyntheticLambda0(this), 2, (Object) null);
    private final Lazy IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CreditConsultingViewModel.class), new IAuthTabCallback(this), new IAuthTabCallbackStub(null, this), new IAuthTabCallbackDefault(this));
    private final SessionTrackera onWarmupCompleted = AppLovinAdImpl.IAuthTabCallback(this, new CreditConsultingConfirmFragment$.ExternalSyntheticLambda1(this));

    public static /* synthetic */ Unit IAuthTabCallback(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(view, suspendAnimationKtExternalSyntheticLambda4);
        int i4 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditConsultingConfirmFragment creditConsultingConfirmFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(creditConsultingConfirmFragment, view);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditConsultingConfirmFragment, view);
        int i3 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditConsultingConfirmFragment creditConsultingConfirmFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(creditConsultingConfirmFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(creditConsultingConfirmFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditConsultingConfirmFragment creditConsultingConfirmFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditConsultingConfirmFragment, onwarmupcompleted);
        int i4 = IAuthTabCallbackDefault + 1;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = i6 | i4 | i7;
        int i9 = ~i6;
        int i10 = (~i4) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i4 | i7 | i9)) | (~(i10 | i6));
        int i13 = i3 + i6 + i2 + (2053704882 * i5) + ((-167119771) * i);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i3) - 1543503872) + (1501345335 * i6) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i2) + (511705088 * i5) + ((-1639972864) * i) + (1278279680 * i14);
        int i16 = ((i3 * (-1228230693)) - 288632672) + (i6 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i2 * (-1228230607)) + (i5 * 927583762) + (i * (-1784727723)) + (i14 * 1163984896);
        int i17 = i15 + (i16 * i16 * 992935936);
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        CreditConsultingConfirmFragment creditConsultingConfirmFragment = (CreditConsultingConfirmFragment) objArr[0];
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[1];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        String string = creditConsultingConfirmFragment.getString(R.string.credit_consulting_confirm_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i21 = IAuthTabCallbackDefault + 23;
            IAuthTabCallbackStub = i21 % 128;
            int i22 = i21 % 2;
            Object[] objArr2 = new Object[1];
            a(new char[]{11, '\f', '\n', 16, 3, '\b', 13797, 13797, 21, '\r', '\r', '\f', 3, 0, 14, '\f', 22, 24, 3, 18, 1, 7, 14, 4, 1, 16, '\f', 1, '\b', 20, 1, 0, 1, 11, 11, 1, 24, 14, 11, 17, 15, '\b', '\n', 5, 20, 18, 1, 16, '\f', 23, 24, 22, 13860}, (byte) ((Process.myPid() >> 22) + 48), 53 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr2[0]).intern());
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback());
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent())).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
            int i23 = IAuthTabCallbackStub + 49;
            IAuthTabCallbackDefault = i23 % 128;
            int i24 = i23 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(view);
        int i4 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditConsultingConfirmFragment creditConsultingConfirmFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditConsultingConfirmFragment, view);
        int i4 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditConsultingConfirmFragment creditConsultingConfirmFragment, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (Unit) onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{creditConsultingConfirmFragment, tdsTopV2View}, -1173749310, iOnWarmupCompleted, iOnWarmupCompleted3, 1173749310);
        }
        int iOnWarmupCompleted4 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted5, new Object[]{creditConsultingConfirmFragment, tdsTopV2View}, -1173749310, iOnWarmupCompleted4, iOnWarmupCompleted6, 1173749310);
        int i3 = 58 / 0;
        return unit;
    }

    public static final /* synthetic */ CreditConsultingViewModel onExtraCallback(CreditConsultingConfirmFragment creditConsultingConfirmFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return creditConsultingConfirmFragment.asBinder();
        }
        creditConsultingConfirmFragment.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = IAuthTabCallbackStub + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.as_();
        }
        super/*o.openJavaCrashMonitor*/.as_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = IAuthTabCallbackStub + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = IAuthTabCallbackStub + 57;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.validateRelationship();
            obj.hashCode();
            throw null;
        }
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i3 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return setrubinValidateRelationship;
        }
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public hasCrashWhenJavaCrash onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.onExtraCallbackWithResult.getValue();
        int i3 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return hascrashwhenjavacrash;
    }

    private static final Unit onWarmupCompleted(CreditConsultingConfirmFragment creditConsultingConfirmFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        FragmentActivity activity = creditConsultingConfirmFragment.getActivity();
        if (activity != null) {
            Object[] objArr = new Object[1];
            a(new char[]{15, '\b', '\b', 6, 13806, 13806, '\b', 15}, (byte) (6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.blue(0) + 8, objArr);
            onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(activity.getIntent()));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final CreditConsultingViewModel asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) this.IAuthTabCallback.getValue();
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return creditConsultingViewModel;
    }

    public final getDummyAd onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        Object obj = null;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 37;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return getdummyad;
        }
        obj.hashCode();
        throw null;
    }

    public final SessionTrackera onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 7;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SessionTrackera sessionTrackera = this.onWarmupCompleted;
        int i4 = i2 + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return sessionTrackera;
    }

    private static final Unit onExtraCallback(CreditConsultingConfirmFragment creditConsultingConfirmFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            Object[] objArr = {creditConsultingConfirmFragment.asBinder()};
            int iOnExtraCallback = matches.onExtraCallback();
            CreditConsultingViewModel.onExtraCallbackWithResult(-269544681, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback, 269544685, objArr);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 29;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = IAuthTabCallback + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingConfirmFragment creditConsultingConfirmFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{creditConsultingConfirmFragment}, -1602241308, iOnWarmupCompleted, iOnWarmupCompleted3, 1602241309);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onExtraCallback("android.widget.Spinner");
            int i4 = IAuthTabCallbackDefault + 13;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CreditConsultingConfirmFragment creditConsultingConfirmFragment, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            creditConsultingConfirmFragment.asBinder().access100();
            unit = Unit.INSTANCE;
            int i3 = 1 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            creditConsultingConfirmFragment.asBinder().access100();
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String strAsBinder;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(contextRequireContext);
        tdsBottomCtaV1View.setGravity(80);
        int i2 = im.toss.uikit.R.string.uikit_confirm;
        String string = getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditConsultingConfirmFragment$.ExternalSyntheticLambda2(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
        tdsButtonV1ViewAsInterface.setText(getString(i2));
        ParamUtils paramUtils = ParamUtils.NORMAL;
        Object[] objArr = {tdsButtonV1ViewAsInterface, paramUtils, new CreditConsultingConfirmFragment$.ExternalSyntheticLambda3(this)};
        asBinder().getInterfaceDescriptor().observe(getViewLifecycleOwner(), new BaseFragment.onExtraCallback(new onExtraCallbackWithResult(tdsBottomCtaV1View)));
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        FrameLayout frameLayout = new FrameLayout(contextRequireContext2);
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Context context2 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        getRouteDatabase.IAuthTabCallback(linearLayout, new CreditConsultingConfirmFragment$.ExternalSyntheticLambda4(this));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW1A;
        tdsListRowV1View.setCenterType(onextracallbackwithresult);
        tdsListRowV1View.setCenterText1(getString(R.string.credit_consulting_confirm_category));
        tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.ROW1E);
        CreditConsultingCategory interfaceDescriptor = asBinder().onTransact().getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            strAsBinder = interfaceDescriptor.asBinder();
        } else {
            int i3 = IAuthTabCallbackStub + 91;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            strAsBinder = null;
        }
        tdsListRowV1View.setRightText1(strAsBinder);
        tdsListRowV1View.setRightText1Color(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context4, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View2.setCenterType(onextracallbackwithresult);
        tdsListRowV1View2.setCenterText1(getString(R.string.credit_consulting_confirm_date));
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW2A);
        tdsListRowV1View2.setRightText1(asBinder().onTransact().asBinder());
        tdsListRowV1View2.setRightText2(asBinder().onTransact().IAuthTabCallbackDefault());
        tdsListRowV1View2.setRightText1Color(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
        Context context5 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setRightText2Color(new getUrlokhttp(new onNavigationEvent(configuration)).onPostMessage());
        tdsListRowV1View2.setRightArrow(true);
        setProtocolsokhttp.IAuthTabCallback(tdsListRowV1View2, new CreditConsultingConfirmFragment$.ExternalSyntheticLambda5());
        Object[] objArr2 = {tdsListRowV1View2, paramUtils, new CreditConsultingConfirmFragment$.ExternalSyntheticLambda6(this)};
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View2);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsScrollView);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsBottomCtaV1View);
        int i5 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return frameLayout;
        }
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        setBaseDeeplink.onNavigationEvent(this, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new onExtraCallback(this, (access13800) null), 1, (Object) null);
        int i2 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditConsultingConfirmFragment creditConsultingConfirmFragment = (CreditConsultingConfirmFragment) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditConsultingConfirmFragment), (CoroutineContext) null, (setRandomHost) null, creditConsultingConfirmFragment.new onWarmupCompleted(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 31;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditConsultingConfirmFragment.this.new onWarmupCompleted(access13800Var);
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelOnWarmupCompleted = CreditConsultingConfirmFragment.this.onWarmupCompleted();
                getDummyAd getdummyadOnTransact = CreditConsultingConfirmFragment.this.onTransact();
                Context contextRequireContext = CreditConsultingConfirmFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(CreditConsultingConfirmFragment.this.requireActivity().getIntent());
                this.L$0 = iEngagementSignalsCallback_ParcelOnWarmupCompleted;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnTransact, contextRequireContext, "STD_7197_CREDIT_RECOVERY", strOnNavigationEvent, "credit_recovery_counsel_apply", 392L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388576, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_ParcelOnWarmupCompleted;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 75;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel2 = (SessionTrackera) this.L$0;
                ResultKt.onNavigationEvent(obj);
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_Parcel2;
                objOnExtraCallback = obj;
            }
            iEngagementSignalsCallback_Parcel.onNavigationEvent(objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i4 = onWarmupCompleted + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
            }
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory(), "");
                throw null;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = IAuthTabCallback + 33;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 60 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = onExtraCallback + 73;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = onExtraCallback + 53;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 26, 23139 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $10 + 81;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i9 = $10 + 61;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 24824), 74 - (ViewConfiguration.getLongPressTimeout() >> 16), 8088 - KeyEvent.getDeadChar(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 19489, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static final class onExtraCallbackWithResult implements Function1<Boolean, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TdsBottomCtaV1View onExtraCallback;

        public onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View) {
            this.onExtraCallback = tdsBottomCtaV1View;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(Boolean bool) {
            Boolean bool2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                bool2 = bool;
                int i3 = 6 / 0;
                if (bool2 == null) {
                    return;
                }
            } else {
                bool2 = bool;
                if (bool2 == null) {
                    return;
                }
            }
            this.onExtraCallback.asInterface().setEnabled(!bool2.booleanValue());
            this.onExtraCallback.asInterface().setLoading(bool2.booleanValue());
            int i4 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{view}, -106531272, iOnWarmupCompleted, iOnWarmupCompleted3, 106531274);
    }

    private static final Unit onNavigationEvent(CreditConsultingConfirmFragment creditConsultingConfirmFragment, TdsTopV2View tdsTopV2View) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{creditConsultingConfirmFragment, tdsTopV2View}, -1173749310, iOnWarmupCompleted, iOnWarmupCompleted3, 1173749310);
    }

    private final void IAuthTabCallbackStubProxy() throws Throwable {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{this}, -1602241308, iOnWarmupCompleted, iOnWarmupCompleted3, 1602241309);
    }
}
