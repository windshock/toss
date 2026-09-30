package im.toss.feature.credit.ui.history.list;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzgc;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17;
import im.toss.feature.credit.ui.history.CreditHistoryViewModel;
import im.toss.feature.credit.ui.history.CreditHistoryViewModel$onExtraCallback;
import im.toss.feature.credit.ui.history.R;
import im.toss.feature.credit.ui.history.list.CreditHistoryActivity$;
import im.toss.features.credit.CreditBaseActivity;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinAdImpl;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.LifeCycleBlockOptimizeEventTracker2;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.access8100;
import o.enableNebulaServiceInitOpt;
import o.enableSwitch;
import o.filterCreatePageParams;
import o.getCornerRadius;
import o.getDummyAd;
import o.getFrameworkThreadPoolOptSwitch;
import o.getOriginalFullResponse;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.isShowTransAnimate;
import o.matchItemIds;
import o.maybeUpdateAnimatable;
import o.networkAvailableOpt;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0;
import o.setBaseDeeplink;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditHistoryActivity extends Hilt_CreditHistoryActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int ICustomTabsCallback = 0;
    public static final int asInterface;
    private static long extraCallbackWithResult = 0;
    private static int onActivityLayout = 1;
    private static int readTypedObject = 1;
    private static int writeTypedObject;
    private boolean IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private enableNebulaServiceInitOpt IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private String access000;
    private boolean access100;
    private boolean asBinder;
    private final SessionTrackera extraCallback;
    private final getCornerRadius<enableNebulaServiceInitOpt> getInterfaceDescriptor;
    private final Map<enableNebulaServiceInitOpt, CreditHistoryViewModel> onTransact;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = CreditHistoryActivity.onWarmupCompleted(CreditHistoryActivity.this, (access13800) this);
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        asInterface = 8;
        int i = onActivityLayout + 21;
        writeTypedObject = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHistoryActivity creditHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditHistoryActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = readTypedObject + 73;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ enableNebulaServiceInitOpt onExtraCallback(CreditHistoryActivity creditHistoryActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        enableNebulaServiceInitOpt enablenebulaserviceinitoptAsInterface = asInterface(creditHistoryActivity);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        int i5 = ICustomTabsCallback + 113;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return enablenebulaserviceinitoptAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(dialogInterface);
        }
        onExtraCallbackWithResult(dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHistoryActivity creditHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(creditHistoryActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallbackWithResult(creditHistoryActivity, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ViewModel onWarmupCompleted(enableNebulaServiceInitOpt enablenebulaserviceinitopt, CreditHistoryActivity creditHistoryActivity, CreditHistoryViewModel$onExtraCallback creditHistoryViewModel$onExtraCallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ViewModel viewModelOnExtraCallback = onExtraCallback(enablenebulaserviceinitopt, creditHistoryActivity, creditHistoryViewModel$onExtraCallback);
        int i4 = ICustomTabsCallback + 57;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return viewModelOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i4 | i6));
        int i11 = ~(i7 | i9);
        int i12 = (~i6) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i4);
        int i15 = i4 + i + i5 + ((-1261570137) * i2) + (2040842291 * i3);
        int i16 = i15 * i15;
        int i17 = ((i4 * (-750812765)) - 1471086592) + ((-750812765) * i) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i5) + ((-1928462336) * i2) + (1629880320 * i3) + (2096168960 * i16);
        int i18 = ((i4 * 1408203179) - 1033136887) + (i * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i5 * 1408202841) + (i2 * (-1046847217)) + (i3 * (-121732677)) + (i16 * 1741225984);
        switch (i17 + (i18 * i18 * 838795264)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CreditHistoryActivity creditHistoryActivity = (CreditHistoryActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {creditHistoryActivity, dialogInterface};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(1196857690, iOnNavigationEvent3, iOnNavigationEvent4, objArr2, -1196857687, iOnNavigationEvent2, iOnNavigationEvent);
        int i4 = ICustomTabsCallback + 13;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHistoryActivity creditHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHistoryActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = readTypedObject + 47;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHistoryActivity creditHistoryActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditHistoryActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onWarmupCompleted(CreditHistoryActivity creditHistoryActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditHistoryActivity);
        int i4 = readTypedObject + 121;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallbackDefault;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return 1011593L;
    }

    public CreditHistoryActivity() {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        this.IAuthTabCallbackStub = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.feature.credit.ui.history.list.CreditHistoryActivity$$ExternalSyntheticLambda6
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                enableNebulaServiceInitOpt enablenebulaserviceinitoptOnExtraCallback = CreditHistoryActivity.onExtraCallback(this.f$0);
                int i4 = onNavigationEvent + 25;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return enablenebulaserviceinitoptOnExtraCallback;
                }
                throw null;
            }
        });
        this.IAuthTabCallback_Parcel = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.feature.credit.ui.history.list.CreditHistoryActivity$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolValueOf = Boolean.valueOf(CreditHistoryActivity.onWarmupCompleted(this.f$0));
                int i4 = onNavigationEvent + 117;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return boolValueOf;
            }
        });
        this.IAuthTabCallbackStubProxy = enableNebulaServiceInitOpt.KCB;
        this.access000 = "";
        this.onTransact = new LinkedHashMap();
        this.getInterfaceDescriptor = setShine.onNavigationEvent((Object) null);
        this.extraCallback = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: im.toss.feature.credit.ui.history.list.CreditHistoryActivity$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = CreditHistoryActivity.onWarmupCompleted(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
                int i4 = IAuthTabCallback + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
    }

    public static final /* synthetic */ Object IAuthTabCallback(CreditHistoryActivity creditHistoryActivity, getFrameworkThreadPoolOptSwitch getframeworkthreadpooloptswitch, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        Object objOnWarmupCompleted = onWarmupCompleted(283031974, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{creditHistoryActivity, getframeworkthreadpooloptswitch, access13800Var}, -283031973, iOnNavigationEvent2, iOnNavigationEvent);
        int i4 = ICustomTabsCallback + 39;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ String IAuthTabCallback(CreditHistoryActivity creditHistoryActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        String str = creditHistoryActivity.access000;
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        int i6 = i3 + 23;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(CreditHistoryActivity creditHistoryActivity, LifeCycleBlockOptimizeEventTracker2 lifeCycleBlockOptimizeEventTracker2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(-11111888, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{creditHistoryActivity, lifeCycleBlockOptimizeEventTracker2}, 11111894, iOnNavigationEvent2, iOnNavigationEvent);
        int i4 = readTypedObject + 105;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CreditHistoryActivity creditHistoryActivity = (CreditHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            creditHistoryActivity.setEngagementSignalsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        enableNebulaServiceInitOpt engagementSignalsCallback = creditHistoryActivity.setEngagementSignalsCallback();
        int i3 = readTypedObject + 89;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return engagementSignalsCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditHistoryActivity creditHistoryActivity = (CreditHistoryActivity) objArr[0];
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CreditHistoryViewModel creditHistoryViewModelOnWarmupCompleted = creditHistoryActivity.onWarmupCompleted(enablenebulaserviceinitopt);
        int i4 = ICustomTabsCallback + 109;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return creditHistoryViewModelOnWarmupCompleted;
    }

    public static final /* synthetic */ getCornerRadius onNavigationEvent(CreditHistoryActivity creditHistoryActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<enableNebulaServiceInitOpt> getcornerradius = creditHistoryActivity.getInterfaceDescriptor;
        if (i3 == 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditHistoryActivity creditHistoryActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        creditHistoryActivity.IAuthTabCallback(enablenebulaserviceinitopt);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(CreditHistoryActivity creditHistoryActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return creditHistoryActivity.onWarmupCompleted((access13800<? super Unit>) access13800Var);
        }
        creditHistoryActivity.onWarmupCompleted((access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{52652, 38656, 30926, 56714, 42816, 2059, 60889, 46769}, TextUtils.getOffsetBefore("", 0) + 23227, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.access000);
        String lowerCase = this.IAuthTabCallbackStubProxy.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("cb_type", lowerCase)});
        int i4 = readTypedObject + 107;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return mapIAuthTabCallback;
    }

    private final enableNebulaServiceInitOpt setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) this.IAuthTabCallbackStub.getValue();
        int i4 = readTypedObject + 37;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return enablenebulaserviceinitopt;
    }

    private final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((Boolean) this.IAuthTabCallback_Parcel.getValue()).booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallback_Parcel.getValue()).booleanValue();
        int i3 = readTypedObject + 9;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, im.toss.feature.credit.ui.history.list.CreditHistoryActivity] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static final boolean IAuthTabCallbackDefault(CreditHistoryActivity creditHistoryActivity) throws Throwable {
        Bundle extras;
        Object obj;
        Object next;
        Object next2;
        int i;
        int i2 = 2 % 2;
        if (StringsKt.contains(h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditHistoryActivity.getIntent()), "alimtalk", true)) {
            int i3 = readTypedObject + 51;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            Intent intent = creditHistoryActivity.getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                Object[] objArr = new Object[1];
                a(new char[]{52650, 5740, 31288, 24282}, 56267 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                if (extras.containsKey(((String) objArr[0]).intern())) {
                    if (zzbq.onNavigationEvent(intent)) {
                        Bundle extras2 = intent.getExtras();
                        if (extras2 != null) {
                            Object[] objArr2 = new Object[1];
                            a(new char[]{52650, 5740, 31288, 24282}, 56267 - TextUtils.indexOf("", ""), objArr2);
                            ?? string = extras2.getString(((String) objArr2[0]).intern());
                            if (string != 0) {
                                if (!(!Intrinsics.areEqual(String.class, Integer.class))) {
                                    string = StringsKt.toIntOrNull((String) string);
                                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                                    string = StringsKt.toLongOrNull((String) string);
                                } else if (Intrinsics.areEqual(String.class, Float.class)) {
                                    int i5 = readTypedObject + 113;
                                    ICustomTabsCallback = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        i = 76;
                                        string = StringsKt.toFloatOrNull((String) string);
                                        int i6 = i / 0;
                                    } else {
                                        string = StringsKt.toFloatOrNull((String) string);
                                    }
                                } else if (Intrinsics.areEqual(String.class, Double.class)) {
                                    string = StringsKt.toDoubleOrNull((String) string);
                                } else if (Intrinsics.areEqual(String.class, Short.class)) {
                                    int i7 = readTypedObject + 15;
                                    ICustomTabsCallback = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        i = 6;
                                        string = StringsKt.toShortOrNull((String) string);
                                        int i62 = i / 0;
                                    } else {
                                        string = StringsKt.toShortOrNull((String) string);
                                    }
                                } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                                    string = StringsKt.toByteOrNull((String) string);
                                } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                                    int i8 = readTypedObject + 55;
                                    ICustomTabsCallback = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                                        int i9 = 38 / 0;
                                    } else {
                                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                                    }
                                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                                    int i10 = ICustomTabsCallback + 71;
                                    readTypedObject = i10 % 128;
                                    string = i10 % 2 == 0 ? Character.valueOf(string.charAt(0)) : Character.valueOf(string.charAt(0));
                                } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                    if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                        List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : listSplit$default) {
                                            if (((String) obj2).length() > 0) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                        }
                                        string = arrayList2.toArray(new Integer[0]);
                                    } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                        List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it2 = listSplit$default2.iterator();
                                        while (!(!it2.hasNext())) {
                                            Object next3 = it2.next();
                                            if (((String) next3).length() > 0) {
                                                arrayList3.add(next3);
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it3.next()).toString())));
                                        }
                                        string = arrayList4.toArray(new Long[0]);
                                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                        List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj3 : listSplit$default3) {
                                            if (((String) obj3).length() > 0) {
                                                arrayList5.add(obj3);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                        Iterator it4 = arrayList5.iterator();
                                        while (it4.hasNext()) {
                                            arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it4.next()).toString())));
                                        }
                                        string = arrayList6.toArray(new Float[0]);
                                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                        List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj4 : listSplit$default4) {
                                            if (((String) obj4).length() > 0) {
                                                arrayList7.add(obj4);
                                            }
                                        }
                                        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                        Iterator it5 = arrayList7.iterator();
                                        while (it5.hasNext()) {
                                            int i11 = ICustomTabsCallback + 113;
                                            readTypedObject = i11 % 128;
                                            if (i11 % 2 == 0) {
                                                arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it5.next()).toString())));
                                                obj.hashCode();
                                                throw null;
                                            }
                                            arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it5.next()).toString())));
                                        }
                                        string = arrayList8.toArray(new Double[0]);
                                    } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                        List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList9 = new ArrayList();
                                        for (Object obj5 : listSplit$default5) {
                                            if (((String) obj5).length() > 0) {
                                                arrayList9.add(obj5);
                                            }
                                        }
                                        ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                        Iterator it6 = arrayList9.iterator();
                                        while (it6.hasNext()) {
                                            arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it6.next()).toString())));
                                        }
                                        string = arrayList10.toArray(new Short[0]);
                                    } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                        List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj6 : listSplit$default6) {
                                            if (((String) obj6).length() > 0) {
                                                arrayList11.add(obj6);
                                            }
                                        }
                                        ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                        Iterator it7 = arrayList11.iterator();
                                        while (it7.hasNext()) {
                                            arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it7.next()).toString())));
                                        }
                                        string = arrayList12.toArray(new Byte[0]);
                                    } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                        List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList13 = new ArrayList();
                                        for (Object obj7 : listSplit$default7) {
                                            if (((String) obj7).length() > 0) {
                                                arrayList13.add(obj7);
                                            }
                                        }
                                        ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                        Iterator it8 = arrayList13.iterator();
                                        while (it8.hasNext()) {
                                            arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it8.next()).toString())));
                                        }
                                        string = arrayList14.toArray(new Boolean[0]);
                                    } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                        List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList15 = new ArrayList();
                                        for (Object obj8 : listSplit$default8) {
                                            if (((String) obj8).length() > 0) {
                                                int i12 = readTypedObject + 57;
                                                ICustomTabsCallback = i12 % 128;
                                                if (i12 % 2 != 0) {
                                                    arrayList15.add(obj8);
                                                    int i13 = 27 / 0;
                                                } else {
                                                    arrayList15.add(obj8);
                                                }
                                            }
                                        }
                                        ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                        Iterator it9 = arrayList15.iterator();
                                        while (it9.hasNext()) {
                                            arrayList16.add(Character.valueOf(StringsKt.trim((String) it9.next()).toString().charAt(0)));
                                        }
                                        string = arrayList16.toArray(new Character[0]);
                                    } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                        List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList17 = new ArrayList();
                                        Iterator it10 = listSplit$default9.iterator();
                                        while (it10.hasNext()) {
                                            int i14 = readTypedObject + 113;
                                            ICustomTabsCallback = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                next2 = it10.next();
                                                int i15 = 77 / 0;
                                                if (((String) next2).length() > 0) {
                                                    arrayList17.add(next2);
                                                }
                                            } else {
                                                next2 = it10.next();
                                                if (((String) next2).length() > 0) {
                                                    arrayList17.add(next2);
                                                }
                                            }
                                        }
                                        string = arrayList17.toArray(new String[0]);
                                    } else {
                                        Object[] enumConstants = String.class.getEnumConstants();
                                        if (enumConstants != null) {
                                            ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                            for (Object obj9 : enumConstants) {
                                                Intrinsics.checkNotNull(obj9, "");
                                                arrayList18.add((Enum) obj9);
                                            }
                                            Iterator it11 = arrayList18.iterator();
                                            while (true) {
                                                if (!it11.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                int i16 = ICustomTabsCallback + 43;
                                                readTypedObject = i16 % 128;
                                                if (i16 % 2 != 0) {
                                                    next = it11.next();
                                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                        break;
                                                    }
                                                } else {
                                                    next = it11.next();
                                                    int i17 = 9 / 0;
                                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            string = (Enum) next;
                                        } else {
                                            string = 0;
                                        }
                                        if (string == 0) {
                                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                            }
                                            string = 0;
                                        }
                                    }
                                }
                                obj = (String) (string instanceof String ? string : null);
                            }
                        }
                    } else {
                        Bundle extras3 = intent.getExtras();
                        if (extras3 != null) {
                            Object[] objArr3 = new Object[1];
                            a(new char[]{52650, 5740, 31288, 24282}, TextUtils.lastIndexOf("", '0') + 56268, objArr3);
                            obj = extras3.get(((String) objArr3[0]).intern());
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            obj = obj;
                        } else {
                            int i18 = readTypedObject + 115;
                            ICustomTabsCallback = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        obj = (String) obj;
                    }
                }
            }
            if (Intrinsics.areEqual(obj, "CARD_LOAN_OPENED")) {
                return true;
            }
        }
        return false;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionGroup(0L) + 24, 19627 - View.resolveSizeAndState(0, 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (extraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myPid() >> 22) + 59, TextUtils.getOffsetBefore("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 95;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 59 - Gravity.getAbsoluteGravity(0, 0), 6383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 59 - View.MeasureSpec.getSize(0), 6382 - TextUtils.lastIndexOf("", '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2);
        int i7 = $11 + 109;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r7
      0x0029: PHI (r7v3 im.toss.feature.credit.ui.history.CreditHistoryViewModel) = 
      (r7v2 im.toss.feature.credit.ui.history.CreditHistoryViewModel)
      (r7v18 im.toss.feature.credit.ui.history.CreditHistoryViewModel)
     binds: [B:8:0x0027, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        CreditHistoryViewModel creditHistoryViewModel;
        LifeCycleBlockOptimizeEventTracker2 lifeCycleBlockOptimizeEventTracker2;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            creditHistoryViewModel = this.onTransact.get(enablenebulaserviceinitopt);
            int i3 = 22 / 0;
            if (creditHistoryViewModel != null) {
                setRubIn setrubinAsInterface = creditHistoryViewModel.asInterface();
                if (setrubinAsInterface != null) {
                    int i4 = readTypedObject + 1;
                    ICustomTabsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    lifeCycleBlockOptimizeEventTracker2 = (LifeCycleBlockOptimizeEventTracker2) setrubinAsInterface.IAuthTabCallback();
                } else {
                    int i6 = ICustomTabsCallback + 71;
                    readTypedObject = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 5 / 5;
                    }
                    lifeCycleBlockOptimizeEventTracker2 = null;
                }
            }
        } else {
            creditHistoryViewModel = this.onTransact.get(enablenebulaserviceinitopt);
            if (creditHistoryViewModel != null) {
            }
        }
        if (!(lifeCycleBlockOptimizeEventTracker2 instanceof LifeCycleBlockOptimizeEventTracker2.IAuthTabCallback)) {
            int i8 = readTypedObject + 45;
            int i9 = i8 % 128;
            ICustomTabsCallback = i9;
            int i10 = i8 % 2;
            LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult onextracallbackwithresult = lifeCycleBlockOptimizeEventTracker2 instanceof LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult ? (LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult) lifeCycleBlockOptimizeEventTracker2 : null;
            if (onextracallbackwithresult != null) {
                int i11 = i9 + 99;
                readTypedObject = i11 % 128;
                if (i11 % 2 != 0 ? onextracallbackwithresult.IAuthTabCallback_Parcel() : onextracallbackwithresult.IAuthTabCallback_Parcel()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ViewModel onExtraCallback(enableNebulaServiceInitOpt enablenebulaserviceinitopt, CreditHistoryActivity creditHistoryActivity, CreditHistoryViewModel$onExtraCallback creditHistoryViewModel$onExtraCallback) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(creditHistoryViewModel$onExtraCallback, "");
        boolean z2 = true;
        if (enablenebulaserviceinitopt == creditHistoryActivity.setEngagementSignalsCallback()) {
            int i2 = readTypedObject + 67;
            ICustomTabsCallback = i2 % 128;
            z = i2 % 2 == 0;
        }
        if (creditHistoryActivity.ICustomTabsServiceDefault() && enablenebulaserviceinitopt == enableNebulaServiceInitOpt.KCB) {
            int i3 = ICustomTabsCallback + 5;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0 ? enablenebulaserviceinitopt == creditHistoryActivity.setEngagementSignalsCallback() : enablenebulaserviceinitopt == creditHistoryActivity.setEngagementSignalsCallback()) {
                int i4 = ICustomTabsCallback + 3;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            z2 = false;
        }
        return creditHistoryViewModel$onExtraCallback.onNavigationEvent(enablenebulaserviceinitopt, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 73;
        im.toss.feature.credit.ui.history.list.CreditHistoryActivity.ICustomTabsCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionTrackerb IAuthTabCallback() {
        SessionTrackerb sessionTrackerb;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 83;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            sessionTrackerb = this.tossRouter;
            int i4 = 16 / 0;
        } else {
            sessionTrackerb = this.tossRouter;
        }
    }

    public final getDummyAd onExtraCallback() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = readTypedObject;
        int i3 = i2 + 33;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return getdummyad;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CreditHistoryActivity creditHistoryActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult() == r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE) {
            enableSwitch.IAuthTabCallback.onExtraCallback();
            TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
            String string = creditHistoryActivity.getString(R.string.agree_credit_protection_term);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent onnavigationeventOnWarmupCompleted = isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string);
            Object[] objArr = new Object[1];
            a(new char[]{52662, 14643, 9368, 4197, 8137, 2841, 30311, 32222, 26981, 21707, 16453, 20281, 47771, 42616, 44462, 39261, 33825, 62340, 65391, 60075, 54851, 56638, 51415, 13320, 9189, 12096, 6714, 398, 3405, 30971, 25694, 21310, 24273, 19027, 45556, 48410, 43059, 38816, 33543, 36607, 64027, 57660, 60588, 55304, 51185, 13136, 16013, 9642, 4359, 7397, 2143, 30665, 25263, 28254, 22015, 16755, 19651, 48042, 42778, 37555, 40562, 34245, 61623}, 62618 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onExtraCallback(onnavigationeventOnWarmupCompleted, ((String) objArr[0]).intern(), 0, 2, (Object) null), 200, (Integer) null, 0, 6, (Object) null);
            int i4 = ICustomTabsCallback + 61;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsCallback + 65;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    @Override // im.toss.feature.credit.ui.history.list.Hilt_CreditHistoryActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        enableNebulaServiceInitOpt engagementSignalsCallback;
        Uri data;
        String stringExtra;
        Uri data2;
        String string;
        Object obj;
        int i = 2 % 2;
        super/*im.toss.base.BaseActivity*/.onCreate(bundle);
        Object obj2 = null;
        if (bundle == null || (string = bundle.getString("selected_bureau")) == null) {
            engagementSignalsCallback = setEngagementSignalsCallback();
        } else {
            Object engagementSignalsCallback2 = setEngagementSignalsCallback();
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(enableNebulaServiceInitOpt.valueOf(string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                int i2 = ICustomTabsCallback + 15;
                readTypedObject = i2 % 128;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
            } else {
                engagementSignalsCallback2 = obj;
            }
            engagementSignalsCallback = (Enum) engagementSignalsCallback2;
            if (engagementSignalsCallback == null) {
            }
        }
        this.IAuthTabCallbackStubProxy = engagementSignalsCallback;
        h5ScreenShotObserverOnChangeOpt.onExtraCallback onextracallback = h5ScreenShotObserverOnChangeOpt.Companion;
        this.access000 = onextracallback.onNavigationEvent(getIntent());
        Intent intent = getIntent();
        if (intent != null) {
            data = intent.getData();
        } else {
            int i3 = readTypedObject + 71;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            data = null;
        }
        boolean zOnWarmupCompleted = onextracallback.onWarmupCompleted(data);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i5 = ICustomTabsCallback + 23;
            readTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                intent2.getStringExtra("date");
                throw null;
            }
            stringExtra = intent2.getStringExtra("date");
            if (stringExtra == null) {
                Intent intent3 = getIntent();
                stringExtra = intent3 != null ? intent3.getStringExtra("date") : null;
            }
        }
        Intent intent4 = getIntent();
        if (intent4 != null) {
            Intent intent5 = getIntent();
            intent4.setData((intent5 == null || (data2 = intent5.getData()) == null) ? null : (Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{data2, "scoreChange"}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971));
        }
        Iterator it = enableNebulaServiceInitOpt.getEntries().iterator();
        while (it.hasNext()) {
            onWarmupCompleted((enableNebulaServiceInitOpt) it.next());
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, zOnWarmupCompleted, stringExtra, (access13800) null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super/*im.toss.base.BaseActivity*/.onSaveInstanceState(bundle);
            bundle.putString("selected_bureau", this.IAuthTabCallbackStubProxy.name());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*im.toss.base.BaseActivity*/.onSaveInstanceState(bundle);
        bundle.putString("selected_bureau", this.IAuthTabCallbackStubProxy.name());
        int i3 = ICustomTabsCallback + 25;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0581  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, im.toss.base.BaseActivity, im.toss.feature.credit.ui.history.list.CreditHistoryActivity] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNewIntent(@NotNull Intent intent) throws NoWhenBranchMatchedException {
        String str;
        String upperCase;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt;
        ?? string;
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super/*im.toss.base.BaseActivity*/.onNewIntent(intent);
        setIntent(intent);
        Bundle extras = intent.getExtras();
        Object obj = null;
        if (extras == null || !extras.containsKey("bureau")) {
            str = null;
        } else {
            int i2 = ICustomTabsCallback + 1;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null && (string = extras2.getString("bureau")) != 0) {
                        if (Intrinsics.areEqual(String.class, Integer.class)) {
                            string = StringsKt.toIntOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Long.class)) {
                            string = StringsKt.toLongOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Float.class)) {
                            string = StringsKt.toFloatOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Double.class)) {
                            string = StringsKt.toDoubleOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Short.class)) {
                            string = StringsKt.toShortOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                            string = StringsKt.toByteOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                            string = Boolean.valueOf(Boolean.parseBoolean(string));
                        } else if (Intrinsics.areEqual(String.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : listSplit$default) {
                                    if (((String) obj2).length() > 0) {
                                        arrayList.add(obj2);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                }
                                string = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj3 : listSplit$default2) {
                                    if (((String) obj3).length() > 0) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                }
                                string = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj4 : listSplit$default3) {
                                    int i4 = readTypedObject + 13;
                                    ICustomTabsCallback = i4 % 128;
                                    int i5 = i4 % 2;
                                    if (((String) obj4).length() > 0) {
                                        int i6 = readTypedObject + 55;
                                        ICustomTabsCallback = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            arrayList5.add(obj4);
                                            int i7 = 50 / 0;
                                        } else {
                                            arrayList5.add(obj4);
                                        }
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                }
                                string = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj5 : listSplit$default4) {
                                    if (((String) obj5).length() > 0) {
                                        arrayList7.add(obj5);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                }
                                string = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj6 : listSplit$default5) {
                                    if (((String) obj6).length() > 0) {
                                        arrayList9.add(obj6);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it5 = arrayList9.iterator();
                                while (it5.hasNext()) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                }
                                string = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj7 : listSplit$default6) {
                                    if (((String) obj7).length() > 0) {
                                        arrayList11.add(obj7);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it6 = arrayList11.iterator();
                                while (it6.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                }
                                string = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj8 : listSplit$default7) {
                                    if (((String) obj8).length() > 0) {
                                        arrayList13.add(obj8);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it7 = arrayList13.iterator();
                                while (it7.hasNext()) {
                                    int i8 = ICustomTabsCallback + 107;
                                    readTypedObject = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                        throw null;
                                    }
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                }
                                string = arrayList14.toArray(new Boolean[0]);
                                int i9 = readTypedObject + 77;
                                ICustomTabsCallback = i9 % 128;
                                int i10 = i9 % 2;
                            } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj9 : listSplit$default8) {
                                    if (((String) obj9).length() > 0) {
                                        int i11 = ICustomTabsCallback + 27;
                                        readTypedObject = i11 % 128;
                                        int i12 = i11 % 2;
                                        arrayList15.add(obj9);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it8 = arrayList15.iterator();
                                while (it8.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                                }
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj10 : listSplit$default9) {
                                    if (((String) obj10).length() > 0) {
                                        int i13 = readTypedObject + 97;
                                        ICustomTabsCallback = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            arrayList17.add(obj10);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList17.add(obj10);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = String.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj11 : enumConstants) {
                                        Intrinsics.checkNotNull(obj11, "");
                                        arrayList18.add((Enum) obj11);
                                    }
                                    Iterator it9 = arrayList18.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    string = (Enum) next;
                                } else {
                                    string = 0;
                                }
                                if (string == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                        boolean z = string instanceof String;
                        String str2 = string;
                        if (!z) {
                            int i14 = ICustomTabsCallback + 49;
                            readTypedObject = i14 % 128;
                            int i15 = i14 % 2;
                            str2 = null;
                        }
                        str = str2;
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    Object obj12 = extras3 != null ? extras3.get("bureau") : null;
                    if (!(obj12 instanceof String)) {
                        int i16 = ICustomTabsCallback + 17;
                        readTypedObject = i16 % 128;
                        int i17 = i16 % 2;
                        obj12 = null;
                    }
                    str = (String) obj12;
                }
            } else if (zzbq.onNavigationEvent(intent)) {
            }
        }
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = this.IAuthTabCallbackStubProxy;
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.checkNotNull(upperCase);
            enablenebulaserviceinitopt = Result.constructor-impl(enableNebulaServiceInitOpt.valueOf(upperCase));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            enablenebulaserviceinitopt = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(enablenebulaserviceinitopt)) {
            int i18 = readTypedObject + 1;
            ICustomTabsCallback = i18 % 128;
            if (i18 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            enablenebulaserviceinitopt2 = enablenebulaserviceinitopt;
        }
        enableNebulaServiceInitOpt enablenebulaserviceinitopt3 = enablenebulaserviceinitopt2;
        if (enablenebulaserviceinitopt3 != this.IAuthTabCallbackStubProxy) {
            this.getInterfaceDescriptor.onWarmupCompleted(enablenebulaserviceinitopt3);
        }
    }

    private final void IAuthTabCallback(enableNebulaServiceInitOpt enablenebulaserviceinitopt) throws Throwable {
        int i = 2 % 2;
        if (this.IAuthTabCallbackStubProxy == enablenebulaserviceinitopt) {
            return;
        }
        this.IAuthTabCallbackStubProxy = enablenebulaserviceinitopt;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        long screenId = getScreenId();
        ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{convertFloatArrayToByteArray, Long.valueOf(screenId), false, null, getScreenParams(), null, 22, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
        CreditHistoryViewModel creditHistoryViewModel = this.onTransact.get(enablenebulaserviceinitopt);
        if (creditHistoryViewModel != null) {
            int i2 = ICustomTabsCallback + 49;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                creditHistoryViewModel.onPostMessage();
                int i3 = 54 / 0;
            } else {
                creditHistoryViewModel.onPostMessage();
            }
            int i4 = readTypedObject + 69;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        ICustomTabsServiceStub();
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CreditHistoryActivity creditHistoryActivity = (CreditHistoryActivity) objArr[0];
        LifeCycleBlockOptimizeEventTracker2 lifeCycleBlockOptimizeEventTracker2 = (LifeCycleBlockOptimizeEventTracker2) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (!(lifeCycleBlockOptimizeEventTracker2 instanceof LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult)) {
            int i2 = ICustomTabsCallback + 91;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                if (!(lifeCycleBlockOptimizeEventTracker2 instanceof LifeCycleBlockOptimizeEventTracker2.IAuthTabCallback)) {
                    return null;
                }
            } else {
                boolean z = lifeCycleBlockOptimizeEventTracker2 instanceof LifeCycleBlockOptimizeEventTracker2.IAuthTabCallback;
                obj.hashCode();
                throw null;
            }
        }
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(720592252, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{creditHistoryActivity}, -720592247, iOnNavigationEvent2, iOnNavigationEvent);
        creditHistoryActivity.ICustomTabsServiceStub();
        int i3 = ICustomTabsCallback + 125;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CreditHistoryActivity creditHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditHistoryActivity.getString(R.string.credit_ui_history_maintenance_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(creditHistoryActivity.getString(R.string.credit_ui_history_maintenance_dialog_description));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, new CreditHistoryActivity$.ExternalSyntheticLambda2(), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 7;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context, im.toss.feature.credit.ui.history.list.CreditHistoryActivity] */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ?? r5 = (CreditHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (((CreditHistoryActivity) r5).IAuthTabCallbackDefault) {
                return null;
            }
            EnumEntries<enableNebulaServiceInitOpt> entries = enableNebulaServiceInitOpt.getEntries();
            if (entries == null || !entries.isEmpty()) {
                Iterator it = entries.iterator();
                while (it.hasNext()) {
                    int i3 = readTypedObject + 13;
                    ICustomTabsCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (!r5.onExtraCallback((enableNebulaServiceInitOpt) it.next())) {
                        return null;
                    }
                }
            }
            ((CreditHistoryActivity) r5).IAuthTabCallbackDefault = true;
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r5, new CreditHistoryActivity$.ExternalSyntheticLambda1((CreditHistoryActivity) r5));
            return null;
        }
        boolean z = ((CreditHistoryActivity) r5).IAuthTabCallbackDefault;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditHistoryActivity creditHistoryActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{52652, 38656, 30926, 56714, 42816, 2059, 60889, 46769}, 28958 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 79), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{52652, 38656, 30926, 56714, 42816, 2059, 60889, 46769}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23227, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), creditHistoryActivity.access000);
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 9;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CreditBaseActivity creditBaseActivity = (CreditHistoryActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        creditBaseActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 91;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditHistoryActivity creditHistoryActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1273237L, false, null, null, new CreditHistoryActivity$.ExternalSyntheticLambda3(creditHistoryActivity), 14, null);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(creditHistoryActivity.getString(R.string.credit_ui_history_maintenance_title));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, new CreditHistoryActivity$.ExternalSyntheticLambda4(creditHistoryActivity), 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 51;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditHistoryActivity creditHistoryActivity = (CreditHistoryActivity) objArr[0];
        getFrameworkThreadPoolOptSwitch getframeworkthreadpooloptswitch = (getFrameworkThreadPoolOptSwitch) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 13;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
            if (getframeworkthreadpooloptswitch instanceof getFrameworkThreadPoolOptSwitch.IAuthTabCallback) {
                if (!creditHistoryActivity.access100) {
                    int i5 = i2 + 85;
                    ICustomTabsCallback = i5 % 128;
                    int i6 = i5 % 2;
                    creditHistoryActivity.access100 = true;
                    Object objOnWarmupCompleted = creditHistoryActivity.onWarmupCompleted(access13800Var);
                    if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
                        int i7 = readTypedObject;
                        int i8 = i7 + 125;
                        ICustomTabsCallback = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = i7 + 59;
                        ICustomTabsCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 6 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                    return Unit.INSTANCE;
                }
            }
        } else if (getframeworkthreadpooloptswitch instanceof getFrameworkThreadPoolOptSwitch.IAuthTabCallback) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        SessionTrackera sessionTrackera;
        int i = 2 % 2;
        if (!(access13800Var instanceof onWarmupCompleted)) {
            onwarmupcompleted = new onWarmupCompleted(access13800Var);
        } else {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = readTypedObject + 59;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                onwarmupcompleted.label = i2 - 2147483648;
            }
        }
        onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        Object objOnExtraCallback = onwarmupcompleted2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            SessionTrackera sessionTrackera2 = this.extraCallback;
            getDummyAd getdummyadOnExtraCallback = onExtraCallback();
            String str = this.access000;
            networkAvailableOpt networkavailableopt = new networkAvailableOpt();
            onwarmupcompleted2.L$0 = sessionTrackera2;
            onwarmupcompleted2.label = 1;
            objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnExtraCallback, this, "STD_3_CREDIT_PROTECTION", str, "credit_history", 319L, (Map) null, networkavailableopt, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, onwarmupcompleted2, 8388512, (Object) null);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i6 = readTypedObject + 99;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
            sessionTrackera = sessionTrackera2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = ICustomTabsCallback + 31;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            sessionTrackera = (SessionTrackera) onwarmupcompleted2.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        sessionTrackera.onNavigationEvent(objOnExtraCallback);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.history.list.Hilt_CreditHistoryActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.base.BaseActivity*/.onResume();
            CreditHistoryViewModel creditHistoryViewModel = this.onTransact.get(this.IAuthTabCallbackStubProxy);
            if (creditHistoryViewModel != null) {
                creditHistoryViewModel.onPostMessage();
            }
            int i3 = readTypedObject + 49;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*im.toss.base.BaseActivity*/.onResume();
        this.onTransact.get(this.IAuthTabCallbackStubProxy);
        throw null;
    }

    private final void onExtraCallback(CreditHistoryViewModel creditHistoryViewModel) {
        int i = 2 % 2;
        setBaseDeeplink.onNavigationEvent(this, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, new onExtraCallback(creditHistoryViewModel, this, (access13800) null), 1, (Object) null);
        int i2 = ICustomTabsCallback + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CreditHistoryViewModel onWarmupCompleted(enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Map<enableNebulaServiceInitOpt, CreditHistoryViewModel> map = this.onTransact;
            CreditHistoryViewModel creditHistoryViewModel = map.get(enablenebulaserviceinitopt);
            if (creditHistoryViewModel == null) {
                creditHistoryViewModel = (CreditHistoryViewModel) new ViewModelProvider(getViewModelStore(), getDefaultViewModelProviderFactory(), matchItemIds.onExtraCallbackWithResult(getDefaultViewModelCreationExtras(), new CreditHistoryActivity$.ExternalSyntheticLambda0(enablenebulaserviceinitopt, this))).onExtraCallbackWithResult("credit_history_" + enablenebulaserviceinitopt.name(), CreditHistoryViewModel.class);
                onExtraCallback(creditHistoryViewModel);
                map.put(enablenebulaserviceinitopt, creditHistoryViewModel);
            }
            CreditHistoryViewModel creditHistoryViewModel2 = creditHistoryViewModel;
            int i3 = ICustomTabsCallback + 91;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return creditHistoryViewModel2;
        }
        this.onTransact.get(enablenebulaserviceinitopt);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() {
        LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult onextracallbackwithresult;
        setRubIn setrubinAsInterface;
        int i = 2 % 2;
        if (this.asBinder) {
            return;
        }
        CreditHistoryViewModel creditHistoryViewModel = this.onTransact.get(this.IAuthTabCallbackStubProxy);
        LifeCycleBlockOptimizeEventTracker2 lifeCycleBlockOptimizeEventTracker2 = null;
        LifeCycleBlockOptimizeEventTracker2 lifeCycleBlockOptimizeEventTracker22 = (creditHistoryViewModel == null || (setrubinAsInterface = creditHistoryViewModel.asInterface()) == null) ? null : (LifeCycleBlockOptimizeEventTracker2) setrubinAsInterface.IAuthTabCallback();
        if (lifeCycleBlockOptimizeEventTracker22 instanceof LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult) {
            onextracallbackwithresult = (LifeCycleBlockOptimizeEventTracker2.onExtraCallbackWithResult) lifeCycleBlockOptimizeEventTracker22;
            int i2 = ICustomTabsCallback + 33;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            onextracallbackwithresult = null;
        }
        if (onextracallbackwithresult != null) {
            int i4 = ICustomTabsCallback + 103;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                if (onextracallbackwithresult.IAuthTabCallback_Parcel()) {
                    return;
                }
            } else if (!onextracallbackwithresult.IAuthTabCallback_Parcel()) {
                return;
            }
            for (enableNebulaServiceInitOpt enablenebulaserviceinitopt : enableNebulaServiceInitOpt.getEntries()) {
                if (enablenebulaserviceinitopt != this.IAuthTabCallbackStubProxy) {
                    CreditHistoryViewModel creditHistoryViewModel2 = this.onTransact.get(enablenebulaserviceinitopt);
                    if (creditHistoryViewModel2 != null) {
                        int i5 = ICustomTabsCallback + 39;
                        readTypedObject = i5 % 128;
                        int i6 = i5 % 2;
                        setRubIn setrubinAsInterface2 = creditHistoryViewModel2.asInterface();
                        if (setrubinAsInterface2 != null) {
                            int i7 = ICustomTabsCallback + 73;
                            readTypedObject = i7 % 128;
                            if (i7 % 2 == 0) {
                                lifeCycleBlockOptimizeEventTracker2.hashCode();
                                throw null;
                            }
                            lifeCycleBlockOptimizeEventTracker2 = (LifeCycleBlockOptimizeEventTracker2) setrubinAsInterface2.IAuthTabCallback();
                        }
                    }
                    if (lifeCycleBlockOptimizeEventTracker2 == null || (lifeCycleBlockOptimizeEventTracker2 instanceof LifeCycleBlockOptimizeEventTracker2.onExtraCallback)) {
                        return;
                    }
                    int i8 = ICustomTabsCallback + 79;
                    readTypedObject = i8 % 128;
                    int i9 = i8 % 2;
                    if (onExtraCallback(enablenebulaserviceinitopt)) {
                        return;
                    }
                    this.asBinder = true;
                    CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new CreditHistoryActivity$.ExternalSyntheticLambda5(this));
                    int i10 = readTypedObject + 93;
                    ICustomTabsCallback = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0569  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, im.toss.feature.credit.ui.history.list.CreditHistoryActivity] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v59, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v61, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v62, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v64, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v69, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final enableNebulaServiceInitOpt asInterface(CreditHistoryActivity creditHistoryActivity) {
        String str;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt;
        ?? string;
        Object next;
        Object next2;
        int i = 2 % 2;
        Intent intent = creditHistoryActivity.getIntent();
        String upperCase = null;
        if (intent != null) {
            int i2 = ICustomTabsCallback + 35;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("bureau")) {
                str = null;
            } else if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("bureau")) != 0) {
                    if (Intrinsics.areEqual(String.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Long.class)) {
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                        int i4 = ICustomTabsCallback + 87;
                        readTypedObject = i4 % 128;
                        int i5 = i4 % 2;
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else {
                        if (Intrinsics.areEqual(String.class, Short.class)) {
                            int i6 = ICustomTabsCallback + 1;
                            readTypedObject = i6 % 128;
                            if (i6 % 2 == 0) {
                                string = StringsKt.toShortOrNull((String) string);
                                int i7 = 60 / 0;
                            } else {
                                string = StringsKt.toShortOrNull((String) string);
                            }
                        } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                            string = StringsKt.toByteOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                            string = Boolean.valueOf(Boolean.parseBoolean(string));
                        } else if (Intrinsics.areEqual(String.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listSplit$default) {
                                    if (((String) obj).length() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                }
                                string = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : listSplit$default2) {
                                    int i8 = ICustomTabsCallback + 11;
                                    readTypedObject = i8 % 128;
                                    int i9 = i8 % 2;
                                    if (((String) obj2).length() > 0) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    int i10 = readTypedObject + 47;
                                    ICustomTabsCallback = i10 % 128;
                                    int i11 = i10 % 2;
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                }
                                string = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : listSplit$default3) {
                                    if (((String) obj3).length() > 0) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                }
                                string = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj4 : listSplit$default4) {
                                    int i12 = readTypedObject + 103;
                                    ICustomTabsCallback = i12 % 128;
                                    int i13 = i12 % 2;
                                    if (((String) obj4).length() > 0) {
                                        arrayList7.add(obj4);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                }
                                string = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                Iterator it5 = listSplit$default5.iterator();
                                while (it5.hasNext()) {
                                    int i14 = readTypedObject + 59;
                                    ICustomTabsCallback = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        next2 = it5.next();
                                        int i15 = 35 / 0;
                                        if (((String) next2).length() > 0) {
                                            arrayList9.add(next2);
                                        }
                                    } else {
                                        next2 = it5.next();
                                        if (((String) next2).length() > 0) {
                                            arrayList9.add(next2);
                                        }
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it6 = arrayList9.iterator();
                                while (it6.hasNext()) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it6.next()).toString())));
                                }
                                string = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj5 : listSplit$default6) {
                                    if (((String) obj5).length() > 0) {
                                        arrayList11.add(obj5);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it7 = arrayList11.iterator();
                                while (it7.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it7.next()).toString())));
                                }
                                string = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj6 : listSplit$default7) {
                                    if (((String) obj6).length() > 0) {
                                        arrayList13.add(obj6);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it8 = arrayList13.iterator();
                                while (it8.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it8.next()).toString())));
                                }
                                string = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj7 : listSplit$default8) {
                                    if (((String) obj7).length() > 0) {
                                        int i16 = ICustomTabsCallback + 105;
                                        readTypedObject = i16 % 128;
                                        int i17 = i16 % 2;
                                        arrayList15.add(obj7);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it9 = arrayList15.iterator();
                                while (it9.hasNext()) {
                                    int i18 = readTypedObject + 29;
                                    ICustomTabsCallback = i18 % 128;
                                    int i19 = i18 % 2;
                                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it9.next()).toString().charAt(0)));
                                }
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj8 : listSplit$default9) {
                                    if (((String) obj8).length() > 0) {
                                        int i20 = ICustomTabsCallback + 29;
                                        readTypedObject = i20 % 128;
                                        int i21 = i20 % 2;
                                        arrayList17.add(obj8);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = String.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj9 : enumConstants) {
                                        Intrinsics.checkNotNull(obj9, "");
                                        arrayList18.add((Enum) obj9);
                                    }
                                    Iterator it10 = arrayList18.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it10.next();
                                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                            break;
                                        }
                                    }
                                    string = (Enum) next;
                                } else {
                                    string = 0;
                                }
                                if (string == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                    }
                    boolean z = string instanceof String;
                    String str2 = string;
                    if (!z) {
                        str2 = null;
                    }
                    str = str2;
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj10 = extras3 != null ? extras3.get("bureau") : null;
                if (!(obj10 instanceof String)) {
                    obj10 = null;
                }
                str = (String) obj10;
            }
        }
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        }
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = enableNebulaServiceInitOpt.KCB;
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.checkNotNull(upperCase);
            enablenebulaserviceinitopt = Result.constructor-impl(enableNebulaServiceInitOpt.valueOf(upperCase));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            enablenebulaserviceinitopt = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!Result.onExtraCallback(enablenebulaserviceinitopt)) {
            enablenebulaserviceinitopt2 = enablenebulaserviceinitopt;
        }
        return enablenebulaserviceinitopt2;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditHistoryActivity creditHistoryActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(1193778521, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{creditHistoryActivity, dialogInterface}, -1193778521, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public static final /* synthetic */ enableNebulaServiceInitOpt onExtraCallbackWithResult(CreditHistoryActivity creditHistoryActivity) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        return (enableNebulaServiceInitOpt) onWarmupCompleted(1214121391, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{creditHistoryActivity}, -1214121389, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public static final /* synthetic */ CreditHistoryViewModel IAuthTabCallback(CreditHistoryActivity creditHistoryActivity, enableNebulaServiceInitOpt enablenebulaserviceinitopt) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        return (CreditHistoryViewModel) onWarmupCompleted(574220581, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{creditHistoryActivity, enablenebulaserviceinitopt}, -574220577, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private final Object onExtraCallbackWithResult(getFrameworkThreadPoolOptSwitch getframeworkthreadpooloptswitch, access13800<? super Unit> access13800Var) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        return onWarmupCompleted(283031974, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this, getframeworkthreadpooloptswitch, access13800Var}, -283031973, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private final void onExtraCallbackWithResult(LifeCycleBlockOptimizeEventTracker2 lifeCycleBlockOptimizeEventTracker2) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(-11111888, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this, lifeCycleBlockOptimizeEventTracker2}, 11111894, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private final void updateVisuals() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(720592252, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, -720592247, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(CreditHistoryActivity creditHistoryActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(1196857690, FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$$ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{creditHistoryActivity, dialogInterface}, -1196857687, iOnNavigationEvent2, iOnNavigationEvent);
    }

    @Override // im.toss.feature.credit.ui.history.list.Hilt_CreditHistoryActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = readTypedObject + 55;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.history.list.Hilt_CreditHistoryActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = ICustomTabsCallback + 91;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.history.list.Hilt_CreditHistoryActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    static void onNavigationEvent() {
        extraCallbackWithResult = -8745566123535480599L;
    }
}
