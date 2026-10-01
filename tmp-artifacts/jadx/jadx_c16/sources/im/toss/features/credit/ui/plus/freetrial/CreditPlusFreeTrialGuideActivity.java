package im.toss.features.credit.ui.plus.freetrial;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.credit.ui.plus.component.CreditPlusIntroComponentSection;
import im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialGuideActivity$;
import im.toss.features.credit.ui.plus.intro.CreditPlusSuccessPayActivity;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.CloseableUtils;
import o.IEngagementSignalsCallback_Parcel;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.checkType;
import o.containsRelativePath;
import o.disableImageViewPreallocationAndroid;
import o.enableNebulaDestroyOpt$asInterface;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getDummyAd;
import o.getOriginalFullResponse;
import o.getRouteDatabase;
import o.getShine;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.hasRootStatusPermission;
import o.initMiniApp;
import o.initSDK;
import o.isShowTransAnimate;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.setHasShown;
import o.setRandomHost;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusFreeTrialGuideActivity extends Hilt_CreditPlusFreeTrialGuideActivity implements SetDetectingInterval {

    @Inject
    public hasRootStatusPermission creditPlusApi;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {48, -22, 122, 126};
    private static final int $$b = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 1;
    private static int IAuthTabCallbackStub = 478308975;
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onNavigationEvent(this, 1474857, (Function1) null, new CreditPlusFreeTrialGuideActivity$.ExternalSyntheticLambda0(this), 2, (Object) null);
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));
    private final getBorderRadius<Unit> asBinder = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
    private final SessionTrackera asInterface = AppLovinAdImpl.IAuthTabCallback(this, new CreditPlusFreeTrialGuideActivity$.ExternalSyntheticLambda1(this));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = s * 2;
        int i4 = (i * 2) + 105;
        int i5 = 3 - (s2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i5];
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditPlusFreeTrialGuideActivity, view);
        int i4 = getInterfaceDescriptor + 43;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{creditPlusFreeTrialGuideActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 402524400, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -402524400, iOnWarmupCompleted);
        int i4 = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity = (CreditPlusFreeTrialGuideActivity) objArr[0];
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusFreeTrialGuideActivity, onwarmupcompleted);
        int i4 = getInterfaceDescriptor + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = (~(i7 | i8 | i9)) | (~(i3 | i5));
        int i11 = ~(i6 | i5);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i5);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i3 + i5 + i2 + (1349231875 * i) + (1735201104 * i4);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i3) + 1558183936 + (237349861 * i5) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i2) + ((-1337982976) * i) + (469762048 * i4) + (1272971264 * i16);
        int i18 = ((i3 * 236314795) - 374860141) + (i5 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i2 * 236313959) + (i * (-66979019)) + (i4 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusFreeTrialGuideActivity, tdsTopV2View);
        int i4 = IAuthTabCallback_Parcel + 3;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static final class onNavigationEvent implements Function0<containsRelativePath> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Activity onExtraCallback;

        public onNavigationEvent(Activity activity) {
            this.onExtraCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 85 / 0;
            }
            return searchBarKtExternalSyntheticLambda5OnWarmupCompleted;
        }

        public final containsRelativePath onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            containsRelativePath containsrelativepathOnExtraCallbackWithResult = containsRelativePath.onExtraCallbackWithResult(layoutInflater);
            int i4 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return containsrelativepathOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity = (CreditPlusFreeTrialGuideActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<Unit> getborderradius = creditPlusFreeTrialGuideActivity.asBinder;
        if (i3 == 0) {
            return getborderradius;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        creditPlusFreeTrialGuideActivity.IPostMessageServiceStub();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ containsRelativePath onNavigationEvent(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {creditPlusFreeTrialGuideActivity};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        containsRelativePath containsrelativepath = (containsRelativePath) onExtraCallbackWithResult(objArr, iOnWarmupCompleted3, iOnWarmupCompleted2, 1387700024, iOnWarmupCompleted4, -1387700023, iOnWarmupCompleted);
        int i4 = IAuthTabCallback_Parcel + 65;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return containsrelativepath;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        creditPlusFreeTrialGuideActivity.onVerticalScrollEvent();
        int i4 = getInterfaceDescriptor + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = getInterfaceDescriptor + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = IAuthTabCallback_Parcel + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.removeAttachLongUserData*/.aq_();
            throw null;
        }
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i3 = getInterfaceDescriptor + 57;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return viewAq_;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.ar_();
        }
        super/*o.openJavaCrashMonitor*/.ar_();
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = IAuthTabCallback_Parcel + 97;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return findresandmsgAs_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getScreenId();
        }
        super.getScreenId();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = IAuthTabCallback_Parcel + 103;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = getInterfaceDescriptor + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = IAuthTabCallback_Parcel + 1;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsService_Parcel = ICustomTabsService_Parcel();
        int i4 = IAuthTabCallback_Parcel + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsService_Parcel;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public hasCrashWhenJavaCrash ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return hascrashwhenjavacrash;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 176, objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditPlusFreeTrialGuideActivity.getIntent()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 69;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity = (CreditPlusFreeTrialGuideActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object value = creditPlusFreeTrialGuideActivity.onTransact.getValue();
        if (i3 != 0) {
            return (containsRelativePath) value;
        }
        throw null;
    }

    public final hasRootStatusPermission ICustomTabsServiceStub() {
        int i = 2 % 2;
        hasRootStatusPermission hasrootstatuspermission = this.creditPlusApi;
        if (hasrootstatuspermission != null) {
            int i2 = getInterfaceDescriptor + 25;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return hasrootstatuspermission;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = getInterfaceDescriptor + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final getDummyAd IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 101;
        int i6 = i5 % 128;
        getInterfaceDescriptor = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 97;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return getdummyad;
    }

    public final SessionTrackera onSessionEnded() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackera sessionTrackera = this.asInterface;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return sessionTrackera;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialGuideActivity, java.lang.Object] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ?? r1 = (CreditPlusFreeTrialGuideActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i4 = getInterfaceDescriptor + 83;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                r1.IEngagementSignalsCallback_Parcel();
                throw null;
            }
            r1.IEngagementSignalsCallback_Parcel();
        } else {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            ((containsRelativePath) onExtraCallbackWithResult(new Object[]{r1}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted)).IAuthTabCallback.asInterface().setLoading(false);
            Integer numOnWarmupCompleted = enableNebulaDestroyOpt$asInterface.onExtraCallbackWithResult.onWarmupCompleted();
            if (numOnWarmupCompleted != null) {
                int i5 = IAuthTabCallback_Parcel + 43;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                onJsBridgeReady.onNavigationEvent((Context) r1, r1.getString(numOnWarmupCompleted.intValue()), 0, 2, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialGuideActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        setContentView(((containsRelativePath) onExtraCallbackWithResult(new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted)).onNavigationEvent());
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        ConstraintLayout constraintLayoutOnNavigationEvent = ((containsRelativePath) onExtraCallbackWithResult(new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted2)).onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnNavigationEvent, "");
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnNavigationEvent, ((containsRelativePath) onExtraCallbackWithResult(new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted3)).onExtraCallbackWithResult, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageService();
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageService() {
        int i = 2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        ((containsRelativePath) onExtraCallbackWithResult(new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted)).onNavigationEvent.removeAllViews();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        ((containsRelativePath) onExtraCallbackWithResult(new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted2)).onNavigationEvent.addView(IEngagementSignalsCallbackStub());
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        TdsBottomCtaV1View tdsBottomCtaV1View = ((containsRelativePath) onExtraCallbackWithResult(new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted3)).IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string = getString(R.string.next);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditPlusFreeTrialGuideActivity$.ExternalSyntheticLambda3(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = CreditPlusFreeTrialGuideActivity.this.new IAuthTabCallback(access13800Var);
            int i2 = onWarmupCompleted + 17;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 19;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 45;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel2 = (SessionTrackera) this.L$0;
                ResultKt.onNavigationEvent(obj);
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_Parcel2;
                objOnExtraCallback = obj;
            } else {
                ResultKt.onNavigationEvent(obj);
                CreditPlusFreeTrialGuideActivity.onNavigationEvent(CreditPlusFreeTrialGuideActivity.this).IAuthTabCallback.asInterface().setLoading(true);
                IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_ParcelOnSessionEnded = CreditPlusFreeTrialGuideActivity.this.onSessionEnded();
                getDummyAd getdummyadIEngagementSignalsCallbackDefault = CreditPlusFreeTrialGuideActivity.this.IEngagementSignalsCallbackDefault();
                long jOnExtraCallback = enableNebulaDestroyOpt$asInterface.onExtraCallbackWithResult.onExtraCallback();
                String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(CreditPlusFreeTrialGuideActivity.this.getIntent());
                SetDetectingInterval setDetectingInterval = CreditPlusFreeTrialGuideActivity.this;
                this.L$0 = iEngagementSignalsCallback_ParcelOnSessionEnded;
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadIEngagementSignalsCallbackDefault, setDetectingInterval, "STD_7189_CREDIT_PLUS_FREE_TRIAL", strOnNavigationEvent, (String) null, jOnExtraCallback, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388584, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                iEngagementSignalsCallback_Parcel = iEngagementSignalsCallback_ParcelOnSessionEnded;
            }
            iEngagementSignalsCallback_Parcel.onNavigationEvent(objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i8 = onExtraCallback + 123;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit onNavigationEvent(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditPlusFreeTrialGuideActivity), (CoroutineContext) null, (setRandomHost) null, creditPlusFreeTrialGuideActivity.new IAuthTabCallback(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        String string = creditPlusFreeTrialGuideActivity.getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_free_trial_guide_1_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        getRouteDatabase.IAuthTabCallback(linearLayout, new CreditPlusFreeTrialGuideActivity$.ExternalSyntheticLambda2(this));
        CreditPlusIntroComponentSection creditPlusIntroComponentSection = new CreditPlusIntroComponentSection(this, null, 2, null);
        checkType.onExtraCallbackWithResult(creditPlusIntroComponentSection, true, null, 2, null);
        linearLayout.addView(creditPlusIntroComponentSection);
        int i2 = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return linearLayout;
    }

    private final void IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = CreditPlusFreeTrialGuideActivity.this.new onWarmupCompleted(access13800Var);
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 96 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 58 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {CreditPlusFreeTrialGuideActivity.this};
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                getBorderRadius getborderradius = (getBorderRadius) CreditPlusFreeTrialGuideActivity.onExtraCallbackWithResult(objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1802211095, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1802211097, iOnWarmupCompleted);
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (getborderradius.emit(unit, this) == objOnWarmupCompleted) {
                    int i4 = IAuthTabCallback + 51;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onVerticalScrollEvent() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 35125), (ViewConfiguration.getScrollBarSize() >> 8) + 23, View.MeasureSpec.getMode(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 12843), ExpandableListView.getPackedPositionType(0L) + 55, 2166 - TextUtils.lastIndexOf("", '0', 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i7 = $10 + 105;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $10 + 53;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i >> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) << 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 55 - Gravity.getAbsoluteGravity(0, 0), 2167 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myPid() >> 22)), 55 - View.MeasureSpec.getSize(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i4 = 2083011369;
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $11 + 21;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceStub() throws Throwable {
        int i = 2 % 2;
        TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
        String string = getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_free_trial_start);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object obj = null;
        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), R.drawable.icn_success_color, 0, 2, (Object) null), 500, (Integer) null, 0, 6, (Object) null);
        Intent intent = new Intent((Context) this, (Class<?>) CreditPlusSuccessPayActivity.class);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 8, (Process.myPid() >> 22) + 2, new char[]{65530, 7, 7, 65530, 65531, 65530, 7, 7}, false, 176 - TextUtils.lastIndexOf("", '0', 0), objArr);
        intent.putExtra(((String) objArr[0]).intern(), getReferrer());
        intent.putExtra("EXTRA_IS_FREE_TRIAL", true);
        startActivity(intent);
        setResult(-1);
        finish();
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(new Object[]{creditPlusFreeTrialGuideActivity, onwarmupcompleted}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1722731766, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1722731769, iOnWarmupCompleted);
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (getBorderRadius) onExtraCallbackWithResult(new Object[]{creditPlusFreeTrialGuideActivity}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1802211095, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1802211097, iOnWarmupCompleted);
    }

    private final containsRelativePath IPostMessageServiceDefault() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (containsRelativePath) onExtraCallbackWithResult(new Object[]{this}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1387700024, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1387700023, iOnWarmupCompleted);
    }

    private static final Unit onWarmupCompleted(CreditPlusFreeTrialGuideActivity creditPlusFreeTrialGuideActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(new Object[]{creditPlusFreeTrialGuideActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 402524400, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -402524400, iOnWarmupCompleted);
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialGuideActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialGuideActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = getInterfaceDescriptor + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialGuideActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialGuideActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }
}
