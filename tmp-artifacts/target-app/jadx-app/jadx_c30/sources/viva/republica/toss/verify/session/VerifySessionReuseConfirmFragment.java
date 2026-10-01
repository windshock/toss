package viva.republica.toss.verify.session;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.base.BaseFragment;
import im.toss.tds.compose.component.atom.image.ResourceSizeKt;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsLocalAccessor;
import o.SetDetectableSize;
import o.TypeUtils1;
import o.UTF8Decoder;
import o.access8100;
import o.accessgetProtocolp;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.getByteBuffer;
import o.getDispatcherokhttp;
import o.getParamImp;
import o.getPrivacyDestinationUri;
import o.getRouteDatabase;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getWrite;
import o.immediateFailedFuture;
import o.initMiniApp;
import o.isJSONTypeIgnore;
import o.matches;
import o.setBodyokhttp;
import o.setByteOrder;
import o.setHeadersokhttp;
import o.setProxySelectorokhttp;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifySessionReuseConfirmFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 18131;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static char onExtraCallback = 39688;
    private static char onExtraCallbackWithResult = 39721;
    private static char onNavigationEvent = 48125;
    private final Lazy onWarmupCompleted = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new onWarmupCompleted(this), new IAuthTabCallback(null, this), new onExtraCallbackWithResult(this));

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = (~i) | i8;
        int i10 = i7 | (~i9);
        int i11 = i | i8;
        int i12 = ~(i9 | i5);
        int i13 = i6 + i5 + i4 + (1075552530 * i3) + ((-1519595880) * i2);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i6) - 1639710720) + ((-2116975300) * i5) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i4) + ((-189792256) * i3) + (1111490560 * i2) + (1415839744 * i14);
        int i16 = (i6 * 251836610) + 257048825 + (i5 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i4 * 251837547) + (i3 * 1710852742) + (i2 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        if (i17 != 1) {
            return i17 != 2 ? i17 != 3 ? i17 != 4 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }
        final VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment = (VerifySessionReuseConfirmFragment) objArr[0];
        int i18 = 2 % 2;
        verifySessionReuseConfirmFragment.onExtraCallbackWithResult().onExtraCallback();
        ConvertByteArrayToFloatArray.onExtraCallback(1233849L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return VerifySessionReuseConfirmFragment.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i19 = asBinder + 65;
        IAuthTabCallbackDefault = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(verifySessionReuseConfirmFragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(verifySessionReuseConfirmFragment, setDetectableSize);
        int i3 = IAuthTabCallbackDefault + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(verifySessionReuseConfirmFragment, th);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, getUrlokhttp geturlokhttp, TdsTopV2View tdsTopV2View) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(verifySessionReuseConfirmFragment, geturlokhttp, tdsTopV2View);
        int i4 = IAuthTabCallbackDefault + 75;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(verifySessionReuseConfirmFragment, view);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = asBinder + 77;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback, new Object[]{function0, isjsontypeignore}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -484298577, 484298577);
        int i4 = IAuthTabCallbackDefault + 107;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(verifySessionReuseConfirmFragment, setDetectableSize);
        int i4 = asBinder + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = IAuthTabCallbackDefault + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(verifySessionReuseConfirmFragment);
        int i4 = asBinder + 37;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = asBinder + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, new Object[]{verifySessionReuseConfirmFragment, view}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 636130816, -636130815);
        int i4 = IAuthTabCallbackDefault + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return 1233847L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final VerifySessionViewModel onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        VerifySessionViewModel verifySessionViewModel = (VerifySessionViewModel) this.onWarmupCompleted.getValue();
        int i3 = asBinder + 27;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return verifySessionViewModel;
        }
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        View view = (View) IAuthTabCallback(iOnExtraCallback, new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -98569580, 98569583);
        int i4 = IAuthTabCallbackDefault + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment = (VerifySessionReuseConfirmFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        if (!(!((Boolean) IAuthTabCallback(iOnExtraCallback, new Object[]{verifySessionReuseConfirmFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -384759109, 384759113)).booleanValue())) {
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(verifySessionReuseConfirmFragment.getString(R.string.app_verify_session_reuse_confirm_manual_verify_description), verifySessionReuseConfirmFragment.getString(R.string.app_verify_session_reuse_manual_verify_title, new Object[]{PlayerErrorCode.onPostMessage()}));
            int i4 = asBinder + 15;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return pairIAuthTabCallback;
        }
        String strICustomTabsCallbackDefault = verifySessionReuseConfirmFragment.onExtraCallbackWithResult().onExtraCallbackWithResult().ICustomTabsCallbackDefault();
        if (strICustomTabsCallbackDefault.length() == 0) {
            return getWrite.IAuthTabCallback(verifySessionReuseConfirmFragment.getString(R.string.app_verify_session___ae7103380c), verifySessionReuseConfirmFragment.getString(R.string.app_verify_session___6b7e33c90a));
        }
        return getWrite.IAuthTabCallback(verifySessionReuseConfirmFragment.getString(R.string.app_verify_session___c44c992049), strICustomTabsCallbackDefault);
    }

    private static final Unit IAuthTabCallback(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, getUrlokhttp geturlokhttp, TdsTopV2View tdsTopV2View) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tdsTopV2View, BuildConfig.FLAVOR);
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            Pair pair = (Pair) IAuthTabCallback(iOnExtraCallback, new Object[]{verifySessionReuseConfirmFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 330260300, -330260298);
            tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
            tdsTopV2View.access100();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tdsTopV2View, BuildConfig.FLAVOR);
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Pair pair2 = (Pair) IAuthTabCallback(iOnExtraCallback3, new Object[]{verifySessionReuseConfirmFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, 330260300, -330260298);
        String str = (String) pair2.onExtraCallbackWithResult();
        String str2 = (String) pair2.IAuthTabCallback();
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent());
            int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            if (((Boolean) IAuthTabCallback(iOnExtraCallback5, new Object[]{verifySessionReuseConfirmFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback6, -384759109, 384759113)).booleanValue()) {
                Object[] objArr = new Object[1];
                a(new char[]{61739, 47065, 53979, 65199, 1036, 9928, 61544, 7298, 62521, 42629, 58881, 58993, 16410, 49116, 2898, 24908, 27957, 55555, 53744, 37318, 35048, 11603, 47752, 5515, 25898, 20592, 16085, 44921, 50691, 22173, 52539, 51830, 51989, 44545, 62990, 14030, 2822, 10016, 57916, 58721, 54196, 61287, 11154, 55548, 62249, 1739, 25898, 20592, 12298, 35398, 43114, 11170, 50831, 27675}, (ViewConfiguration.getPressedStateDuration() >> 16) + 53, objArr);
                getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr[0]).intern());
                getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
                int iOnNavigationEvent = zzaq.onNavigationEvent();
                ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent)).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            } else {
                String strICustomTabsCallbackStubProxy = verifySessionReuseConfirmFragment.onExtraCallbackWithResult().onExtraCallbackWithResult().ICustomTabsCallbackStubProxy();
                if (strICustomTabsCallbackStubProxy.length() == 0) {
                    int i3 = asBinder + 45;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    Object[] objArr2 = new Object[1];
                    a(new char[]{61739, 47065, 53979, 65199, 1036, 9928, 61544, 7298, 62521, 42629, 58881, 58993, 16410, 49116, 2898, 24908, 27957, 55555, 53744, 37318, 35048, 11603, 9279, 28604, 18036, 64748, 16875, 46344, 9634, 39533, 55183, 43275, 50896, 59738, 21513, 25131, 16410, 49116, 4246, 16702, 45667, 44237, 20867, 10642, 39191, 16882, 24874, 55354, 17911, 15383, 38400, 8571, 14811, 59856, 4246, 16702, 51659, 48240, 7244, 12102, 53915, 2644}, 61 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                    strICustomTabsCallbackStubProxy = ((String) objArr2[0]).intern();
                }
                getdispatcherokhttpAccess100.onWarmupCompleted(strICustomTabsCallbackStubProxy);
                Object[] objArr3 = {getdispatcherokhttpAccess100, ResourceSizeKt.onNavigationEvent(immediateFailedFuture.Companion)};
                int iOnNavigationEvent2 = zzaq.onNavigationEvent();
                getDispatcherokhttp.IAuthTabCallback(1305743902, objArr3, zzaq.onNavigationEvent(), -1305743902, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent2);
                getdispatcherokhttpAccess100.onExtraCallback(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
                int i5 = asBinder + 25;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        tdsTopV2View.setTitleText(str2);
        int iOnExtraCallback7 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback8 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        if (((Boolean) IAuthTabCallback(iOnExtraCallback7, new Object[]{verifySessionReuseConfirmFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback8, -384759109, 384759113)).booleanValue()) {
            tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            tdsTopV2View.setSubtitle2Text(str);
        } else {
            tdsTopV2View.setSubtitle1Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            tdsTopV2View.setSubtitle1Text(str);
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(final VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, View view) {
        int i = 2 % 2;
        verifySessionReuseConfirmFragment.IAuthTabCallback(new Function0() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda9
            public final Object invoke() {
                return VerifySessionReuseConfirmFragment.onWarmupCompleted(this.f$0);
            }
        });
        int i2 = IAuthTabCallbackDefault + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{23695, 28068, 850, 64888, 4246, 16702, 11578, 44201, 48795, 35653, 64881, 41995}, Gravity.getAbsoluteGravity(0, 0) + 12, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifySessionReuseConfirmFragment.getString(R.string.follow_up));
        setDetectableSize.onExtraCallback(verifySessionReuseConfirmFragment.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(final VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment) {
        int i = 2 % 2;
        VerifySessionViewModel.IAuthTabCallback(verifySessionReuseConfirmFragment.onExtraCallbackWithResult(), (Function1) null, (Function1) null, 3, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1233849L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return VerifySessionReuseConfirmFragment.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 9;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        int iAxisFromString = MotionEvent.axisFromString(BuildConfig.FLAVOR) + 11;
                        int trimmedLength = 12434 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iAxisFromString, trimmedLength, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, 12433 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $10 + 17;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 16014), 14 - View.combineMeasuredStates(0, 0), 19901 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onExtraCallback(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{23695, 28068, 850, 64888, 4246, 16702, 11578, 44201, 48795, 35653, 64881, 41995}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifySessionReuseConfirmFragment.getString(R.string.app_verify_session___351ecffcec));
        setDetectableSize.onExtraCallback(verifySessionReuseConfirmFragment.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 25;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 57;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 65;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            int i3 = 78 / 0;
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, verifySessionReuseConfirmFragment.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallback(final Function0<Unit> function0) {
        int i = 2 % 2;
        getByteBuffer getbytebufferIAuthTabCallback = shortValue.IAuthTabCallback(shortValue.Companion, this, UTF8Decoder.SESSION_REUSE_CONFIRM, onExtraCallbackWithResult().onExtraCallbackWithResult().access000(), false, false, false, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, (Function1) null, 32760, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return VerifySessionReuseConfirmFragment.onExtraCallbackWithResult(function0, (isJSONTypeIgnore) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                VerifySessionReuseConfirmFragment.onWarmupCompleted(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return VerifySessionReuseConfirmFragment.onExtraCallback(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = getbytebufferIAuthTabCallback.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                VerifySessionReuseConfirmFragment.onNavigationEvent(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, BuildConfig.FLAVOR);
        autoDisposable(deserializeurinullablecollectionOnExtraCallbackWithResult);
        int i2 = IAuthTabCallbackDefault + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment = (VerifySessionReuseConfirmFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ReactNativeFeatureFlagsLocalAccessor reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult = verifySessionReuseConfirmFragment.onExtraCallbackWithResult().onExtraCallbackWithResult();
        if (i3 == 0) {
            reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.newSession();
            throw null;
        }
        boolean zNewSession = reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.newSession();
        int i4 = IAuthTabCallbackDefault + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zNewSession);
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ReactNativeFeatureFlagsLocalAccessor reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult = onExtraCallbackWithResult().onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{16085, 44921, 17378, 21294, 54764, 16240}, KeyEvent.normalizeMetaState(0) + 5, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), ((Pair) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 330260300, -330260298)).getSecond());
        Object[] objArr2 = new Object[1];
        a(new char[]{10457, 53310, 61199, 21989, 39869, 5423, 11197, 15470, 51890, 42446, 50831, 27675}, ((Process.getThreadPriority(0) + 20) >> 6) + 11, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), ((Pair) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 330260300, -330260298)).getFirst());
        Object[] objArr3 = new Object[1];
        a(new char[]{38400, 8571, 3749, 32013, 50792, 14625, 64411, 44276}, Color.alpha(0) + 8, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.onActivityLayout());
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("service_referrer", reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.onActivityResized());
        Object[] objArr4 = new Object[1];
        a(new char[]{39522, 13210, 28374, 37412, 52917, 55905, 64156, 47355, 16364, 56625}, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 10, objArr4);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.IAuthTabCallback_Parcel())});
        int i4 = asBinder + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return mapIAuthTabCallback;
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment = (VerifySessionReuseConfirmFragment) objArr[0];
        int i = 2 % 2;
        final getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(verifySessionReuseConfirmFragment);
        int iOnWarmupCompleted = accessgetProtocolp.onNavigationEvent(verifySessionReuseConfirmFragment).onWarmupCompleted();
        Context contextRequireContext = verifySessionReuseConfirmFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iOnWarmupCompleted);
        getRouteDatabase.IAuthTabCallback(linearLayout, new Function1() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return VerifySessionReuseConfirmFragment.onExtraCallback(this.f$0, geturlokhttpOnExtraCallback, (TdsTopV2View) obj);
            }
        });
        Space space = new Space(linearLayout.getContext());
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        space.setLayoutParams(layoutParams);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, space);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context);
        String string = verifySessionReuseConfirmFragment.getString(R.string.follow_up);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new View.OnClickListener() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifySessionReuseConfirmFragment.onExtraCallback(this.f$0, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setBottomButton(verifySessionReuseConfirmFragment.getString(R.string.app_verify_session___351ecffcec), new View.OnClickListener() { // from class: viva.republica.toss.verify.session.VerifySessionReuseConfirmFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifySessionReuseConfirmFragment.onWarmupCompleted(this.f$0, view);
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
        return linearLayout;
    }

    private static final Unit onNavigationEvent(Function0 function0, isJSONTypeIgnore isjsontypeignore) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, new Object[]{function0, isjsontypeignore}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -484298577, 484298577);
    }

    private final View onExtraCallback() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (View) IAuthTabCallback(iOnExtraCallback, new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -98569580, 98569583);
    }

    private static final void IAuthTabCallback(VerifySessionReuseConfirmFragment verifySessionReuseConfirmFragment, View view) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, new Object[]{verifySessionReuseConfirmFragment, view}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 636130816, -636130815);
    }

    private final Pair<String, String> onNavigationEvent() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Pair) IAuthTabCallback(iOnExtraCallback, new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, 330260300, -330260298);
    }

    private final boolean onWarmupCompleted() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback, new Object[]{this}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -384759109, 384759113)).booleanValue();
    }
}
