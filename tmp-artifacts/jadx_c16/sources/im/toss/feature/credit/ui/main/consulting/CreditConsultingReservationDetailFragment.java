package im.toss.feature.credit.ui.main.consulting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import com.google.android.gms.internal.ads.zzaq;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.consulting.CreditConsultingReservationDetailFragment$;
import im.toss.features.credit.data.response.CreditConsultingHistory;
import im.toss.features.credit.data.response.CreditConsultingReservationResponse;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinCmpErrorCode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.enableReportDataOptimize;
import o.findResAndMsg;
import o.getAdService;
import o.getDispatcherokhttp;
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
import o.isOneShot;
import o.isStopUpload;
import o.logVerbose;
import o.matches;
import o.minWebSocketMessageToCompress;
import o.noStore;
import o.readIntokhttp;
import o.setBaseDeeplink;
import o.setBodyokhttp;
import o.setByteOrder;
import o.setProxySelectorokhttp;
import o.setRubIn;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditConsultingReservationDetailFragment extends Hilt_CreditConsultingReservationDetailFragment implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = {-933606319, 1153130032, 2009393364, 412877731, 671134470, -921988855, -297438639, -30474383, -653578024, -1791924980, 502574680, -1390049063, -90110402, -144552000, 855099744, 1981864977, -1549156023, 1726187570};
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Lazy onNavigationEvent = isStopUpload.onExtraCallback(this, 1310601, (Function1) null, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda0(this), 2, (Object) null);
    private final Lazy onWarmupCompleted = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CreditConsultingViewModel.class), new onWarmupCompleted(this), new onExtraCallbackWithResult(null, this), new IAuthTabCallback(this));

    @Inject
    public SessionTrackerb tossRouter;

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(dialogInterface);
        int i4 = onExtraCallbackWithResult + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditConsultingReservationDetailFragment, view);
        int i4 = onExtraCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment, str, commonModule_setLeftEdgeTouchEnabled}, 800126158, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -800126156);
        int i4 = onExtraCallbackWithResult + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(creditConsultingReservationDetailFragment, tdsListHeaderV3View);
        }
        onNavigationEvent(creditConsultingReservationDetailFragment, tdsListHeaderV3View);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, CreditConsultingHistory creditConsultingHistory, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditConsultingReservationDetailFragment, creditConsultingHistory, view);
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditConsultingReservationDetailFragment, str, dialogInterface);
        int i4 = onExtraCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditConsultingReservationDetailFragment, onwarmupcompleted);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        int i5 = onExtraCallbackWithResult + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i6)) | (~(i2 | i6));
        int i9 = i2 | i4;
        int i10 = (~(i4 | (~i6))) | (~(i7 | (~i2))) | (~i9);
        int i11 = i2 + i6 + i3 + (1350191703 * i) + ((-44904237) * i5);
        int i12 = i11 * i11;
        int i13 = ((i2 * (-560584373)) - 948043776) + ((-560584373) * i6) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i3) + ((-71041024) * i) + ((-766246912) * i5) + (1339949056 * i12);
        int i14 = (i2 * 1657715387) + 2046152777 + (i6 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i3 * 1657716305) + (i * 1507858311) + (i5 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 == 1) {
            return onExtraCallback(objArr);
        }
        if (i15 != 2) {
            return i15 != 3 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }
        CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment = (CreditConsultingReservationDetailFragment) objArr[0];
        String str = (String) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        int i16 = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditConsultingReservationDetailFragment.getString(R.string.credit_consulting_cancel_dialog_title));
        String string = creditConsultingReservationDetailFragment.getString(R.string.credit_consulting_cancel_dialog_cta);
        Intrinsics.checkNotNullExpressionValue(string, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda7(creditConsultingReservationDetailFragment, str), 4, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = creditConsultingReservationDetailFragment.getString(im.toss.uikit.R.string.uikit_cancel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda8(), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i17 = onExtraCallback + 45;
        onExtraCallbackWithResult = i17 % 128;
        int i18 = i17 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, TdsTopV2View tdsTopV2View) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditConsultingReservationDetailFragment, tdsTopV2View);
        int i4 = onExtraCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, TdsListRowV1View tdsListRowV1View, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditConsultingReservationDetailFragment, tdsListRowV1View, view);
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CreditConsultingViewModel onExtraCallback(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditConsultingReservationDetailFragment};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) onWarmupCompleted(iOnExtraCallbackWithResult3, objArr, 236601694, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4, -236601694);
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return creditConsultingViewModel;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ long access200() {
        long jAccess200;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
            int i3 = 99 / 0;
        } else {
            jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        }
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess200;
        }
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return viewAq_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return mapAr_;
        }
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.as_();
        }
        super/*o.openJavaCrashMonitor*/.as_();
        throw null;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return screenId;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getScreenParams();
        }
        super.getScreenParams();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = onExtraCallbackWithResult + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = onExtraCallbackWithResult + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        hasCrashWhenJavaCrash hascrashwhenjavacrashOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            hascrashwhenjavacrashOnWarmupCompleted = onWarmupCompleted();
            int i3 = 94 / 0;
        } else {
            hascrashwhenjavacrashOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return hascrashwhenjavacrashOnWarmupCompleted;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = onExtraCallbackWithResult + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public hasCrashWhenJavaCrash onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.onNavigationEvent.getValue();
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return hascrashwhenjavacrash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            creditConsultingReservationDetailFragment.getActivity();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        FragmentActivity activity = creditConsultingReservationDetailFragment.getActivity();
        if (activity != null) {
            int i3 = onExtraCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(new int[]{189003219, 962411288, -2115612683, 823716752}, 8 - TextUtils.getOffsetAfter("", 0), objArr);
            onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(activity.getIntent()));
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            onwarmupcompleted.onExtraCallback("apply_yn", zzaz.onExtraCallbackWithResult(((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 236601694, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallback()));
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment = (CreditConsultingReservationDetailFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = creditConsultingReservationDetailFragment.onWarmupCompleted.getValue();
        if (i3 != 0) {
            throw null;
        }
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) value;
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return creditConsultingViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r4 = im.toss.feature.credit.ui.main.consulting.CreditConsultingReservationDetailFragment.onExtraCallback + 81;
        im.toss.feature.credit.ui.main.consulting.CreditConsultingReservationDetailFragment.onExtraCallbackWithResult = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r3 = r3 + 91;
        im.toss.feature.credit.ui.main.consulting.CreditConsultingReservationDetailFragment.onExtraCallback = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment = (CreditConsultingReservationDetailFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = creditConsultingReservationDetailFragment.tossRouter;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i2 = onExtraCallbackWithResult + 49;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, TdsTopV2View tdsTopV2View) throws Throwable {
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tdsTopV2View, "");
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            ((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        if (!((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallback()) {
            int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            CreditConsultingReservationResponse creditConsultingReservationResponseIAuthTabCallbackStubProxy = ((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallbackStubProxy();
            if (creditConsultingReservationResponseIAuthTabCallbackStubProxy == null || (string = creditConsultingReservationResponseIAuthTabCallbackStubProxy.onExtraCallbackWithResult()) == null) {
                int i3 = onExtraCallbackWithResult + 29;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                string = "";
            }
        } else {
            string = creditConsultingReservationDetailFragment.getString(R.string.credit_consulting_apply_finish_title);
        }
        Intrinsics.checkNotNull(string);
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        CreditConsultingReservationResponse creditConsultingReservationResponseIAuthTabCallbackStubProxy2 = ((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallbackStubProxy();
        if (creditConsultingReservationResponseIAuthTabCallbackStubProxy2 != null) {
            int i5 = onExtraCallback + 3;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                creditConsultingReservationResponseIAuthTabCallbackStubProxy2.onWarmupCompleted();
                throw null;
            }
            String strOnWarmupCompleted = creditConsultingReservationResponseIAuthTabCallbackStubProxy2.onWarmupCompleted();
            if (strOnWarmupCompleted != null) {
                Context context = tdsTopV2View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                tdsTopV2View.setSubtitle2Text(AppLovinCmpErrorCode.onExtraCallbackWithResult(context, strOnWarmupCompleted, (Function1) null, 4, (Object) null));
            }
        }
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i6 = onExtraCallback + 3;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            a(new int[]{944167936, -1459423728, -560195434, 1302430159, -1435360448, 298128084, 1839705432, 802349891, 34568780, 185314809, -988741842, 1515360827, 1261407269, 1054322092, -2038700388, -43770938, -986233722, 380630844, 1583594312, 118942505, 527398463, 609225362, 425387986, -790367511, 1050173427, 1038585780, -535196195, -1882935988}, (Process.myPid() >> 22) + 53, objArr);
            getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr[0]).intern());
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback());
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent())).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 19;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.PARAGRAPH, (String) null, (Function0) null, 6, (Object) null);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.LARGE);
        tdsListHeaderV3View.setTitleText(creditConsultingReservationDetailFragment.getString(R.string.credit_consulting_history_detail));
        tdsListHeaderV3View.setTitleTextColor(setBodyokhttp.onExtraCallback(creditConsultingReservationDetailFragment).onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, TdsListRowV1View tdsListRowV1View, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        SessionTrackerb sessionTrackerb = (SessionTrackerb) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 1622638087, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1622638084);
        Context context = tdsListRowV1View.getContext();
        Object[] objArr = new Object[1];
        a(new int[]{1706556133, -442730855, 562405608, -1560057596, 1922348637, -1800751932, 1513274336, -122322589, 1137864261, -93489953, -896237504, 402634609, 1075432869, -1139141514, 1886715406, -733424007, -1330447094, -1968788248, 1334338718, -1705934072, 1226116746, 1563771322, -360299702, 12905621, -767531627, 1794516841, 1412295647, 17226997, 1335452312, -2089747669, -905187399, 1654102364, -1090301531, -431577342, 2005155852, 2067025832}, 69 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Object obj = null;
        if (((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 236601694, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().onTransact()) {
            int i2 = onExtraCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                creditConsultingReservationDetailFragment.requireActivity().finish();
                obj.hashCode();
                throw null;
            }
            creditConsultingReservationDetailFragment.requireActivity().finish();
        } else {
            FragmentActivity activity = creditConsultingReservationDetailFragment.getActivity();
            if (activity != null) {
                int i3 = onExtraCallback + 53;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    activity.getSupportFragmentManager();
                    obj.hashCode();
                    throw null;
                }
                FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = activity.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    supportFragmentManager.extraCommand();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i3 = -1469660336;
        long j = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 113;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 72 - (ViewConfiguration.getLongPressTimeout() >> 16), 8849 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 72 - (ViewConfiguration.getTouchSlop() >> 8), 8848 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                    i3 = -1469660336;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i8 = $11 + 17;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 25;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22251), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 39, TextUtils.lastIndexOf("", '0', 0, 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10 += 18;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 22252), 39 - ((Process.getThreadPriority(0) + 20) >> 6), 10301 - TextUtils.getTrimmedLength(""), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i10++;
                }
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 4034), 78 - Color.red(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i16 = $10 + 55;
            $11 = i16 % 128;
            int i17 = i16 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, CreditConsultingHistory creditConsultingHistory, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        if (creditConsultingHistory != null) {
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String strOnTransact = creditConsultingHistory.onTransact();
            if (strOnTransact == null) {
                int i6 = onExtraCallback + 17;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 4;
                }
            } else {
                str = strOnTransact;
            }
        }
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment, str}, 1878413184, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1878413183);
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        setBaseDeeplink.onNavigationEvent(this, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new onNavigationEvent(this, (access13800) null), 1, (Object) null);
        int i2 = onExtraCallbackWithResult + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            int i4 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 94 / 0;
            } else {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) {
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
            int i4 = onExtraCallbackWithResult + 65;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 113;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent();
            int i3 = onWarmupCompleted + 117;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 29 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i3 = onWarmupCompleted + 73;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 71 / 0;
            }
            return viewModelStore;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment = (CreditConsultingReservationDetailFragment) objArr[0];
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onNavigationEvent(creditConsultingReservationDetailFragment, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda9(creditConsultingReservationDetailFragment, (String) objArr[1]));
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Object[] objArr = {(CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment}, 236601694, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694), str};
        int iOnExtraCallback = matches.onExtraCallback();
        CreditConsultingViewModel.onExtraCallbackWithResult(-1885559556, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback, 1885559556, objArr);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        CreditConsultingHistory creditConsultingHistoryOnExtraCallback = ((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().onExtraCallback();
        if (creditConsultingHistoryOnExtraCallback == null) {
            CreditConsultingReservationResponse creditConsultingReservationResponseIAuthTabCallbackStubProxy = ((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallbackStubProxy();
            creditConsultingHistoryOnExtraCallback = creditConsultingReservationResponseIAuthTabCallbackStubProxy != null ? creditConsultingReservationResponseIAuthTabCallbackStubProxy.onNavigationEvent() : null;
        }
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Context context2 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        if (((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().onTransact()) {
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
                if (((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallback()) {
                    isOneShot.onExtraCallbackWithResult(linearLayout, noStore.Companion.IAuthTabCallbackStub());
                }
                getRouteDatabase.IAuthTabCallback(linearLayout, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda1(this));
            } else {
                if (((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().IAuthTabCallback()) {
                }
                getRouteDatabase.IAuthTabCallback(linearLayout, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda1(this));
            }
        } else {
            minWebSocketMessageToCompress.onNavigationEvent(linearLayout, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda2(this));
        }
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context3, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW1A;
        tdsListRowV1View.setCenterType(onextracallbackwithresult);
        tdsListRowV1View.setCenterText1(getString(R.string.credit_consulting_confirm_category));
        TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.ROW1E;
        tdsListRowV1View.setRightType(asbinder);
        tdsListRowV1View.setRightText1(creditConsultingHistoryOnExtraCallback != null ? creditConsultingHistoryOnExtraCallback.onNavigationEvent() : null);
        tdsListRowV1View.setRightText1Color(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context4, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View2.setCenterType(onextracallbackwithresult);
        tdsListRowV1View2.setCenterText1(getString(R.string.credit_consulting_confirm_date));
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW2A);
        tdsListRowV1View2.setRightText1(((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().onExtraCallbackWithResult());
        tdsListRowV1View2.setRightText2((String) enableReportDataOptimize.onWarmupCompleted(new Object[]{((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1819829352, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1819829350));
        tdsListRowV1View2.setRightText1Color(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
        Context context5 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setRightText2Color(new getUrlokhttp(new onExtraCallback(configuration)).onPostMessage());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View2);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsListRowV1View tdsListRowV1View3 = new TdsListRowV1View(context6, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View3.setCenterType(onextracallbackwithresult);
        tdsListRowV1View3.setCenterText1(getString(R.string.credit_consulting_confirm_organization));
        tdsListRowV1View3.setRightType(asbinder);
        if (creditConsultingHistoryOnExtraCallback != null) {
            int i4 = onExtraCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                creditConsultingHistoryOnExtraCallback.IAuthTabCallback();
                throw null;
            }
            strIAuthTabCallback = creditConsultingHistoryOnExtraCallback.IAuthTabCallback();
            int i5 = onExtraCallbackWithResult + 11;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            strIAuthTabCallback = null;
        }
        tdsListRowV1View3.setRightText1(strIAuthTabCallback);
        tdsListRowV1View3.setRightText1Color(setBodyokhttp.onExtraCallback(this).ICustomTabsCallbackStubProxy());
        if (((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().onTransact()) {
            tdsListRowV1View3.setRightArrow(true);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View3);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsScrollView);
        Context context7 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context7);
        tdsBottomCtaV1View.setGravity(80);
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda4(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        if (((CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694)).onTransact().onTransact()) {
            TdsButtonV1View.asInterface asinterface = new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null);
            String string2 = getString(R.string.credit_consulting_cancel);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            tdsBottomCtaV1View.setSecondary(string2, new CreditConsultingReservationDetailFragment$.ExternalSyntheticLambda6(this, creditConsultingHistoryOnExtraCallback), asinterface);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsBottomCtaV1View);
        return frameLayout;
    }

    private final CreditConsultingViewModel asInterface() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (CreditConsultingViewModel) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 236601694, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -236601694);
    }

    private final void onExtraCallback(String str) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this, str}, 1878413184, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1878413183);
    }

    private static final Unit onNavigationEvent(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, String str, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{creditConsultingReservationDetailFragment, str, commonModule_setLeftEdgeTouchEnabled}, 800126158, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -800126156);
    }

    public final SessionTrackerb onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (SessionTrackerb) onWarmupCompleted(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), new Object[]{this}, 1622638087, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1622638084);
    }
}
