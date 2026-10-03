package viva.republica.toss.dashboard.primaryAccount;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.base.BaseActivity;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModuleImplExternalSyntheticLambda0;
import o.DERConstructedSet;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DomainConfigProxy;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.KeyBoardVisiblePoint;
import o.SessionTrackerb;
import o.mergeParams;
import o.onPageExit;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.setDoubleTapZoomDpi;
import o.setTaggedAddrCtrl;
import viva.republica.toss.R;
import viva.republica.toss.account.detail.UnconnectedBankAccountBridgeActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeTransferTossMoneyActivity extends Hilt_SchemeTransferTossMoneyActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private TransferTossMoneyBottomSheet asInterface;

    @Inject
    public DomainConfigProxy homeChangeHelper;

    @Inject
    public SessionTrackerb tossRouter;
    private static char[] access100 = {32474, 32431, 32430, 32473, 32479, 32420, 32472, 32421, 32402, 32613, 32426, 32427, 32422, 32417, 32429, 32419, 32428, 32423, 32425, 32467, 32424, 32405, 32416, 32407};
    private static int getInterfaceDescriptor = -1184333996;
    private static boolean access000 = true;
    private static boolean IAuthTabCallbackStubProxy = true;
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return Boolean.valueOf(((Boolean) SchemeTransferTossMoneyActivity.onExtraCallback(new Object[0], 1719557608, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1719557608, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue());
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            return SchemeTransferTossMoneyActivity.onExtraCallback(this.f$0);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda7
        public final Object invoke(Object obj) {
            return SchemeTransferTossMoneyActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda8
        public final Object invoke(Object obj) {
            return SchemeTransferTossMoneyActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    public static /* synthetic */ void IAuthTabCallback(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallback(new Object[]{schemeTransferTossMoneyActivity, dialogInterface}, -165696446, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 165696449, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = IAuthTabCallback_Parcel + 21;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    public static /* synthetic */ String onExtraCallback(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {schemeTransferTossMoneyActivity};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        String str = (String) onExtraCallback(objArr, 553077216, iOnWarmupCompleted2, -553077214, iOnWarmupCompleted4, iOnWarmupCompleted, iOnWarmupCompleted3);
        int i4 = ICustomTabsCallback + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallback(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) onExtraCallback(new Object[]{schemeTransferTossMoneyActivity, iEngagementSignalsCallbackDefault}, -2106613603, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2106613604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(new Object[]{schemeTransferTossMoneyActivity, iEngagementSignalsCallbackDefault}, -2106613603, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2106613604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i3 = 65 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(schemeTransferTossMoneyActivity, keyBoardVisiblePoint);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 7;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(schemeTransferTossMoneyActivity, dialogInterface);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(schemeTransferTossMoneyActivity, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(schemeTransferTossMoneyActivity, iEngagementSignalsCallbackDefault);
        int i3 = ICustomTabsCallback + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(schemeTransferTossMoneyActivity, keyBoardVisiblePoint, j, z, str);
        int i4 = ICustomTabsCallback + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(schemeTransferTossMoneyActivity, dialogInterface);
        int i4 = ICustomTabsCallback + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity = (SchemeTransferTossMoneyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = schemeTransferTossMoneyActivity.IAuthTabCallbackStub.getValue();
        if (i3 == 0) {
            ((Boolean) value).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) value).booleanValue();
        int i4 = ICustomTabsCallback + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {DERConstructedSet.onNavigationEvent};
        boolean zBooleanValue = ((Boolean) DERConstructedSet.onWarmupCompleted(-480293531, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 480293534, objArr)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 93;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = ICustomTabsCallback + 11;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = ICustomTabsCallback + 15;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            schemeTransferTossMoneyActivity.validateRelationship();
        } else {
            setDoubleTapZoomDpi.onNavigationEvent(setDoubleTapZoomDpi.IAuthTabCallback, schemeTransferTossMoneyActivity, 0L, 1, null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 83;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity = (SchemeTransferTossMoneyActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = schemeTransferTossMoneyActivity.asInterface;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet2 = schemeTransferTossMoneyActivity.asInterface;
        if (transferTossMoneyBottomSheet2 != null) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            TransferTossMoneyBottomSheet.onNavigationEvent(1013760100, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1013760096, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet2});
            int i3 = IAuthTabCallback_Parcel + 81;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    public final DomainConfigProxy IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        DomainConfigProxy domainConfigProxy = this.homeChangeHelper;
        if (domainConfigProxy != null) {
            int i5 = i3 + 7;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return domainConfigProxy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = ICustomTabsCallback + 21;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = ICustomTabsCallback + 1;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 101;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r12 = r12.onExtraCallbackWithResult(true);
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r12.size() != 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r1 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel + 109;
        viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (((java.lang.Boolean) onExtraCallback(new java.lang.Object[]{r11}, 2095197423, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2095197419, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        writeTypedList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        ((java.lang.Boolean) onExtraCallback(new java.lang.Object[]{r11}, 2095197423, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2095197419, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if ((!r12.isEmpty()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        onExtraCallback((java.util.List<? extends o.KeyBoardVisiblePoint>) r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        ICustomTabsServiceStubProxy();
        r12 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel + 11;
        viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        if ((r12 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r12.onTransact() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r12.onTransact() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        writeTypedList();
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.dashboard.primaryAccount.Hilt_SchemeTransferTossMoneyActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1f
            r11.overridePendingTransition(r2, r3)
            super.onCreate(r12)
            o.PageShowPoint$onWarmupCompleted r12 = o.PageShowPoint.Companion
            o.KeyBoardVisiblePoint r1 = r12.onTransact()
            if (r1 == 0) goto L31
            goto L2d
        L1f:
            r11.overridePendingTransition(r2, r2)
            super.onCreate(r12)
            o.PageShowPoint$onWarmupCompleted r12 = o.PageShowPoint.Companion
            o.KeyBoardVisiblePoint r1 = r12.onTransact()
            if (r1 == 0) goto L31
        L2d:
            r11.writeTypedList()
            return
        L31:
            java.util.List r12 = r12.onExtraCallbackWithResult(r3)
            int r1 = r12.size()
            r2 = 0
            if (r1 != r3) goto L98
            int r1 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel
            int r1 = r1 + 109
            int r4 = r1 % 128
            viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L71
            java.lang.Object[] r4 = new java.lang.Object[]{r11}
            int r9 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            int r6 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            int r10 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            int r8 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            r5 = 2095197423(0x7ce22cef, float:9.3949636E36)
            r7 = -2095197419(0xffffffff831dd315, float:-4.6380464E-37)
            java.lang.Object r1 = onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L98
            r11.writeTypedList()
            return
        L71:
            java.lang.Object[] r4 = new java.lang.Object[]{r11}
            int r9 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            int r6 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            int r10 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            int r8 = im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()
            r5 = 2095197423(0x7ce22cef, float:9.3949636E36)
            r7 = -2095197419(0xffffffff831dd315, float:-4.6380464E-37)
            java.lang.Object r12 = onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.booleanValue()
            r2.hashCode()
            throw r2
        L98:
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 == 0) goto La6
            r11.onExtraCallback(r12)
            return
        La6:
            r11.ICustomTabsServiceStubProxy()
            int r12 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel
            int r12 = r12 + 11
            int r1 = r12 % 128
            viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback = r1
            int r12 = r12 % r0
            if (r12 == 0) goto Lb5
            return
        Lb5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.finish();
            overridePendingTransition(0, 1);
        } else {
            super.finish();
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r8 r9
      0x003b: PHI (r8v6 o.TabBarInfoQueryPointOnTabBarInfoQueryListener) = (r8v5 o.TabBarInfoQueryPointOnTabBarInfoQueryListener), (r8v10 o.TabBarInfoQueryPointOnTabBarInfoQueryListener) binds: [B:10:0x0039, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r9v2 o.queryTabBarInfo) = (r9v1 o.queryTabBarInfo), (r9v4 o.queryTabBarInfo) binds: [B:10:0x0039, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[PHI: r8
      0x0061: PHI (r8v8 o.TabBarInfoQueryPointOnTabBarInfoQueryListener) = 
      (r8v5 o.TabBarInfoQueryPointOnTabBarInfoQueryListener)
      (r8v6 o.TabBarInfoQueryPointOnTabBarInfoQueryListener)
      (r8v10 o.TabBarInfoQueryPointOnTabBarInfoQueryListener)
     binds: [B:10:0x0039, B:12:0x003f, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity r11, o.KeyBoardVisiblePoint r12, long r13, boolean r15, java.lang.String r16) throws java.lang.Throwable {
        /*
            r1 = r11
            r0 = r12
            r2 = r16
            r3 = 2
            int r4 = r3 % r3
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            o.verifyHASH r4 = o.verifyHASH.onExtraCallback
            r5 = 0
            r6 = 1
            r7 = 0
            o.verifyHASH.onWarmupCompleted(r4, r5, r6, r7)
            boolean r8 = r0 instanceof o.TabBarInfoQueryPointOnTabBarInfoQueryListener
            if (r8 == 0) goto L64
            int r8 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel
            int r8 = r8 + 47
            int r9 = r8 % 128
            viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback = r9
            int r8 = r8 % r3
            if (r8 != 0) goto L32
            r8 = r0
            o.TabBarInfoQueryPointOnTabBarInfoQueryListener r8 = (o.TabBarInfoQueryPointOnTabBarInfoQueryListener) r8
            o.queryTabBarInfo r9 = r8.ICustomTabsCallbackDefault()
            r10 = 1
            int r10 = r10 / r5
            if (r9 == 0) goto L61
            goto L3b
        L32:
            r8 = r0
            o.TabBarInfoQueryPointOnTabBarInfoQueryListener r8 = (o.TabBarInfoQueryPointOnTabBarInfoQueryListener) r8
            o.queryTabBarInfo r9 = r8.ICustomTabsCallbackDefault()
            if (r9 == 0) goto L61
        L3b:
            boolean r9 = r9.isMydataType()
            if (r9 != r6) goto L61
            o.genSignatureValue r4 = o.genSignatureValue.onExtraCallbackWithResult
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r12)
            o.writeRaw r4 = r4.onNavigationEvent(r8)
            o.deserializeUriNullableCollection r4 = o.IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(r4, r7, r6, r7)
            r11.onNavigationEvent(r4)
            int r4 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback
            int r4 = r4 + 37
            int r7 = r4 % 128
            viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel = r7
            int r4 = r4 % r3
            if (r4 == 0) goto L64
            r4 = 5
            int r4 = r4 % 4
            goto L64
        L61:
            r4.onWarmupCompleted(r8)
        L64:
            o.DomainConfigProxy r4 = r11.IAuthTabCallback()
            r4.IAuthTabCallbackStub()
            if (r15 == 0) goto Lb6
            int r4 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel
            int r4 = r4 + 15
            int r7 = r4 % 128
            viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback = r7
            int r4 = r4 % r3
            r4 = -1
            r11.setResult(r4)
            android.content.Intent r4 = o.issueCertV3.onExtraCallbackWithResult(r12, r11)
            if (r4 == 0) goto Lb1
            java.lang.String r0 = "transferNo"
            r4.putExtra(r0, r2)
            im.toss.state.spec.SessionState$onExtraCallbackWithResult r0 = im.toss.state.spec.SessionState.Companion
            im.toss.state.spec.SessionState r0 = r0.onExtraCallback()
            boolean r0 = r0.onTransact()
            if (r0 == 0) goto La6
            int r0 = viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.ICustomTabsCallback
            int r0 = r0 + 53
            int r2 = r0 % 128
            viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback_Parcel = r2
            int r0 = r0 % r3
            if (r0 == 0) goto La3
            r11.startActivity(r4)
            r0 = 98
            int r0 = r0 / r5
            goto La6
        La3:
            r11.startActivity(r4)
        La6:
            o.setDoubleTapZoomDpi r0 = o.setDoubleTapZoomDpi.IAuthTabCallback
            r2 = 0
            r4 = 1
            r5 = 0
            r1 = r11
            o.setDoubleTapZoomDpi.onNavigationEvent(r0, r1, r2, r4, r5)
            goto Lc0
        Lb1:
            r2 = r13
            r11.onExtraCallback(r12, r13, r6)
            goto Lc0
        Lb6:
            o.setDoubleTapZoomDpi r0 = o.setDoubleTapZoomDpi.IAuthTabCallback
            r2 = 0
            r4 = 1
            r5 = 0
            r1 = r11
            o.setDoubleTapZoomDpi.onNavigationEvent(r0, r1, r2, r4, r5)
        Lc0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity.IAuthTabCallback(viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity, o.KeyBoardVisiblePoint, long, boolean, java.lang.String):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            setDoubleTapZoomDpi.onNavigationEvent(setDoubleTapZoomDpi.IAuthTabCallback, schemeTransferTossMoneyActivity, 1L, 0, null);
        } else {
            setDoubleTapZoomDpi.onNavigationEvent(setDoubleTapZoomDpi.IAuthTabCallback, schemeTransferTossMoneyActivity, 0L, 1, null);
        }
        int i3 = ICustomTabsCallback + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity = (SchemeTransferTossMoneyActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 81;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        schemeTransferTossMoneyActivity.asInterface = null;
        int i5 = i2 + 71;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = this.asInterface;
        if (transferTossMoneyBottomSheet != null) {
            transferTossMoneyBottomSheet.dismiss();
        }
        BrickModuleImplExternalSyntheticLambda0 transferTossMoneyBottomSheet2 = new TransferTossMoneyBottomSheet(this, true, this.asBinder, setEngagementSignalsCallback(), ICustomTabsServiceStub(), new setTaggedAddrCtrl() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SchemeTransferTossMoneyActivity.onNavigationEvent(this.f$0, (KeyBoardVisiblePoint) obj, ((Long) obj2).longValue(), ((Boolean) obj3).booleanValue(), (String) obj4);
            }
        });
        transferTossMoneyBottomSheet2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                SchemeTransferTossMoneyActivity.onExtraCallbackWithResult(this.f$0, dialogInterface);
            }
        });
        transferTossMoneyBottomSheet2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
                SchemeTransferTossMoneyActivity.IAuthTabCallback(this.f$0, dialogInterface);
            }
        });
        this.asInterface = transferTossMoneyBottomSheet2;
        transferTossMoneyBottomSheet2.show();
        int i4 = IAuthTabCallback_Parcel + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(List<? extends KeyBoardVisiblePoint> list) throws Throwable {
        String string;
        String string2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String string3 = getString(R.string.app_account_receive_from_contacts);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Object obj = null;
        if (list.size() != 1) {
            if (((Boolean) onExtraCallback(new Object[]{this}, 2095197423, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2095197419, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue()) {
                string = getString(R.string.app_dashboard_primaryAccount___0643561739);
                int i4 = ICustomTabsCallback + 25;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                string = getString(R.string.app_dashboard_primaryAccount___b098a2282c);
            }
            Intrinsics.checkNotNull(string);
            String string4 = getString(im.toss.uikit.R.string.uikit_confirm);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            SessionTrackerb engagementSignalsCallback = setEngagementSignalsCallback();
            String strIAuthTabCallback = mergeParams.IAuthTabCallback(string, (String) null, 1, (Object) null);
            String strIAuthTabCallback2 = mergeParams.IAuthTabCallback(string3, (String) null, 1, (Object) null);
            String strIAuthTabCallback3 = mergeParams.IAuthTabCallback(string4, (String) null, 1, (Object) null);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-104, -126, -105, -121, -112, -121, -106, -126, -121, -116, -107, -122, -123, -118, -108, -127, -116, -110, -112, -127, -122, -118, -121, -115, -123, -120, -109, -109, -116, -118, -126, -110, -120, -111, -118, -118, -119, -124, -124, -120, -121, -127, -126, -122, -123, -124}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strIAuthTabCallback);
            sb.append("&description=");
            sb.append(strIAuthTabCallback2);
            sb.append("&ok=");
            sb.append(strIAuthTabCallback3);
            sb.append("&add=false");
            SessionTrackerb.onNavigationEvent(engagementSignalsCallback, this, sb.toString(), this.IAuthTabCallbackDefault, (Bundle) null, 8, (Object) null);
            return;
        }
        boolean zBooleanValue = ((Boolean) onExtraCallback(new Object[]{this}, 2095197423, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2095197419, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
        if (zBooleanValue) {
            int i6 = ICustomTabsCallback + 75;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                getString(R.string.app_dashboard_primaryAccount___d6906b42c0);
                obj.hashCode();
                throw null;
            }
            string2 = getString(R.string.app_dashboard_primaryAccount___d6906b42c0);
        } else {
            if (!(!zBooleanValue)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = getString(R.string.app_dashboard_primaryAccount___a7167521e9);
        }
        Intrinsics.checkNotNull(string2);
        String string5 = getString(R.string.app_dashboard_primaryAccount___4e094b925b);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        SessionTrackerb engagementSignalsCallback2 = setEngagementSignalsCallback();
        String strIAuthTabCallback4 = mergeParams.IAuthTabCallback(string2, (String) null, 1, (Object) null);
        String strIAuthTabCallback5 = mergeParams.IAuthTabCallback(string3, (String) null, 1, (Object) null);
        String strIAuthTabCallback6 = mergeParams.IAuthTabCallback(string5, (String) null, 1, (Object) null);
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-104, -126, -105, -121, -112, -121, -106, -126, -121, -116, -107, -122, -123, -118, -108, -127, -116, -110, -112, -127, -122, -118, -121, -115, -123, -120, -109, -109, -116, -118, -126, -110, -120, -111, -118, -118, -119, -124, -124, -120, -121, -127, -126, -122, -123, -124}, Color.blue(0) + 127, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(strIAuthTabCallback4);
        sb2.append("&description=");
        sb2.append(strIAuthTabCallback5);
        sb2.append("&ok=");
        sb2.append(strIAuthTabCallback6);
        sb2.append("&add=false");
        SessionTrackerb.onNavigationEvent(engagementSignalsCallback2, this, sb2.toString(), this.IAuthTabCallbackDefault, (Bundle) null, 8, (Object) null);
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        writeTypedList();
        int i4 = ICustomTabsCallback + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -126, -121, -124, -112, -113, -126, -127, -118, -114, -115, -116, -117, -118, -118, -119, -124, -124, -120, -121, -127, -126, -122, -123, -124}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr2);
        builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), "home_primary_account_register");
        builderBuildUpon.appendQueryParameter("orgListTitle", getString(R.string.app_dashboard_primaryAccount___4d6785603f));
        builderBuildUpon.appendQueryParameter("orgListDesc", getString(R.string.app_dashboard_primaryAccount___ff170150ac));
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        SessionTrackerb.onExtraCallbackWithResult(setEngagementSignalsCallback(), getContext(), string, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
        int i4 = IAuthTabCallback_Parcel + 65;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            schemeTransferTossMoneyActivity.startActivity(UnconnectedBankAccountBridgeActivity.Companion.onExtraCallback(schemeTransferTossMoneyActivity, keyBoardVisiblePoint.onExtraCallbackWithResult(), "DASHBOARD_PLUS"));
            return Unit.INSTANCE;
        }
        schemeTransferTossMoneyActivity.startActivity(UnconnectedBankAccountBridgeActivity.Companion.onExtraCallback(schemeTransferTossMoneyActivity, keyBoardVisiblePoint.onExtraCallbackWithResult(), "DASHBOARD_PLUS"));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setDoubleTapZoomDpi.onNavigationEvent(setDoubleTapZoomDpi.IAuthTabCallback, schemeTransferTossMoneyActivity, 0L, 1, null);
        int i4 = IAuthTabCallback_Parcel + 23;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = access100;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 78 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 20952 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 101;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 2;
                    }
                    j = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(getInterfaceDescriptor)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) + 75, View.MeasureSpec.makeMeasureSpec(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            try {
                if (IAuthTabCallbackStubProxy) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i6 = $11 + 17;
                        $10 = i6 % 128;
                        if (i6 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] + iIntValue);
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 63, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 63 - (ViewConfiguration.getLongPressTimeout() >> 16), 12214 - (ViewConfiguration.getEdgeSlop() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!access000) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i7 = $11 + 115;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i9 = $10 + 5;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 63 - View.MeasureSpec.getMode(0), 12214 - TextUtils.indexOf("", ""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr6);
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(final KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z) {
        int i = 2 % 2;
        r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI connectPrimaryAccountBottomSheet = new ConnectPrimaryAccountBottomSheet(this, keyBoardVisiblePoint, j, z, new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda3
            public final Object invoke() {
                return SchemeTransferTossMoneyActivity.onExtraCallbackWithResult(this.f$0, keyBoardVisiblePoint);
            }
        });
        connectPrimaryAccountBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.dashboard.primaryAccount.SchemeTransferTossMoneyActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SchemeTransferTossMoneyActivity.onWarmupCompleted(this.f$0, dialogInterface);
            }
        });
        connectPrimaryAccountBottomSheet.show();
        int i2 = IAuthTabCallback_Parcel + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i;
        int i8 = (~(i7 | i3)) | (~(i7 | i5)) | (~(i3 | i5));
        int i9 = (~(i | i5)) | i3;
        int i10 = (~(i5 | i | i3)) | (~(i7 | (~i3) | (~i5)));
        int i11 = i + i3 + i2 + (862446602 * i6) + (395103901 * i4);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i) - 438566912) + ((-683246085) * i3) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i2) + ((-128450560) * i6) + ((-674496512) * i4) + ((-1108934656) * i12);
        int i14 = (i * 1384179468) + 550727958 + (i3 * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i2 * 1384179971) + (i6 * 1640285726) + (i4 * 120803543) + (i12 * 2025127936);
        int i15 = i13 + (i14 * i14 * (-275709952));
        if (i15 == 1) {
            return onExtraCallback(objArr);
        }
        if (i15 != 2) {
            if (i15 == 3) {
                return onExtraCallbackWithResult(objArr);
            }
            if (i15 == 4) {
                return IAuthTabCallback(objArr);
            }
            int i16 = 2 % 2;
            int i17 = ICustomTabsCallback + 5;
            IAuthTabCallback_Parcel = i17 % 128;
            int i18 = i17 % 2;
            boolean zICustomTabsServiceDefault = ICustomTabsServiceDefault();
            int i19 = ICustomTabsCallback + 109;
            IAuthTabCallback_Parcel = i19 % 128;
            int i20 = i19 % 2;
            return Boolean.valueOf(zICustomTabsServiceDefault);
        }
        BaseActivity baseActivity = (SchemeTransferTossMoneyActivity) objArr[0];
        int i21 = 2 % 2;
        int i22 = ICustomTabsCallback + 5;
        IAuthTabCallback_Parcel = i22 % 128;
        int i23 = i22 % 2;
        Intent intent = baseActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr2);
        String stringExtra = intent.getStringExtra(((String) objArr2[0]).intern());
        int i24 = ICustomTabsCallback + 99;
        IAuthTabCallback_Parcel = i24 % 128;
        int i25 = i24 % 2;
        return stringExtra;
    }

    public static /* synthetic */ boolean onNavigationEvent() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Boolean) onExtraCallback(new Object[0], 1719557608, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1719557608, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    private final boolean updateVisuals() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return ((Boolean) onExtraCallback(new Object[]{this}, 2095197423, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2095197419, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue();
    }

    private static final String IAuthTabCallback(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (String) onExtraCallback(new Object[]{schemeTransferTossMoneyActivity}, 553077216, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -553077214, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final void IAuthTabCallbackStub(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, DialogInterface dialogInterface) throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallback(new Object[]{schemeTransferTossMoneyActivity, dialogInterface}, -165696446, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 165696449, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(SchemeTransferTossMoneyActivity schemeTransferTossMoneyActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onExtraCallback(new Object[]{schemeTransferTossMoneyActivity, iEngagementSignalsCallbackDefault}, -2106613603, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2106613604, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    @Override // viva.republica.toss.dashboard.primaryAccount.Hilt_SchemeTransferTossMoneyActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallback_Parcel + 107;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.dashboard.primaryAccount.Hilt_SchemeTransferTossMoneyActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 81;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    @Override // viva.republica.toss.dashboard.primaryAccount.Hilt_SchemeTransferTossMoneyActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallback_Parcel + 125;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.dashboard.primaryAccount.Hilt_SchemeTransferTossMoneyActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = ICustomTabsCallback + 109;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }
}
