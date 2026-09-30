package im.toss.features.mobileid.impl.view;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.samsung.android.ssiframework.sdk.exception.SsiException;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.features.mobile.id.model.AvailableVcListResponse;
import im.toss.features.mobileid.impl.MobileIdIssueViewModel;
import im.toss.features.mobileid.impl.view.MobileIdIssueOtherVcFragment$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.ExtHubMetaInfoHelper;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.Rmipmap;
import o.SetDetectingInterval;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access8100;
import o.authenticate;
import o.findResAndMsg;
import o.getBigDecimal;
import o.getCodeNameBytes;
import o.getExtraParameters;
import o.getPackageType;
import o.getParamImp;
import o.getUserData;
import o.getWaitTime;
import o.getWrite;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isFireOS;
import o.isStopUpload;
import o.logInvite;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onRenderReady;
import o.pxToDp;
import o.readExtHubMetaInfo;
import o.resolveProxyClass;
import o.setRandomHost;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileIdIssueOtherVcFragment extends Hilt_MobileIdIssueOtherVcFragment implements SetDetectingInterval {

    @Inject
    public Object mobileIdManager;
    private getPackageType onExtraCallback;
    public getWaitTime onExtraCallbackWithResult;
    private final Lazy onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(Class.forName("im.toss.features.mobileid.impl.MobileIdIssueViewModel")), new asBinder(this), new IAuthTabCallbackDefault(null, this), new IAuthTabCallbackStub(this));
    private final Lazy onWarmupCompleted = isStopUpload.onExtraCallback(this, 1578735, (Function1) null, (Function1) null, 6, (Object) null);

    @Inject
    public getBigDecimal walletErrorHandler;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 478309004;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        byte[] bArr = $$a;
        int i4 = (b * 4) + 105;
        int i5 = i * 3;
        int i6 = 4 - (i2 * 4);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = i6 + (-i7);
            int i11 = i8 + 1;
            i3 = i9;
            i4 = i10;
            i6 = i11;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i6];
            int i12 = i4;
            i8 = i6;
            i6 = i12;
            int i102 = i6 + (-i7);
            int i112 = i8 + 1;
            i3 = i9;
            i4 = i102;
            i6 = i112;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~i6;
        int i10 = (~(i7 | i8 | i9)) | (~(i | i2));
        int i11 = ~(i6 | i2);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i2);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i + i2 + i5 + (1349231875 * i4) + (1735201104 * i3);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i) + 1558183936 + (237349861 * i2) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i5) + ((-1337982976) * i4) + (469762048 * i3) + (1272971264 * i16);
        int i18 = ((i * 236314795) - 374860141) + (i2 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i5 * 236313959) + (i4 * (-66979019)) + (i3 * (-1872492752)) + (i16 * (-417333248));
        return i17 + ((i18 * i18) * 639631360) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(mobileIdIssueOtherVcFragment, view);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = asInterface + 89;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mobileIdIssueOtherVcFragment, view);
        int i4 = IAuthTabCallbackStub + 95;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment = (MobileIdIssueOtherVcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            mobileIdIssueOtherVcFragment.access000();
            throw null;
        }
        MobileIdIssueViewModel mobileIdIssueViewModelAccess000 = mobileIdIssueOtherVcFragment.access000();
        int i3 = asInterface + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return mobileIdIssueViewModelAccess000;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i3 = asInterface + 65;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
            throw null;
        }
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i3 = IAuthTabCallbackStub + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = IAuthTabCallbackStub + 1;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return jAccess200;
        }
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.removeAttachLongUserData*/.aq_();
            obj.hashCode();
            throw null;
        }
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i3 = IAuthTabCallbackStub + 55;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return viewAq_;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.ar_();
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i3 = IAuthTabCallbackStub + 5;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return mapAr_;
        }
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.as_();
        }
        super/*o.openJavaCrashMonitor*/.as_();
        throw null;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = asInterface + 57;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return screenId;
        }
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = asInterface + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = asInterface + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsServiceDefault();
        }
        ICustomTabsServiceDefault();
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact();
        }
        onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.validateRelationship();
        }
        super/*o.openJavaCrashMonitor*/.validateRelationship();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final MobileIdIssueViewModel access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MobileIdIssueViewModel mobileIdIssueViewModel = (MobileIdIssueViewModel) this.onNavigationEvent.getValue();
        int i3 = asInterface + 51;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return mobileIdIssueViewModel;
    }

    public final getWaitTime IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getWaitTime getwaittime = this.onExtraCallbackWithResult;
        if (getwaittime == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 101;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return getwaittime;
    }

    public final void onExtraCallback(@NotNull getWaitTime getwaittime) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getwaittime, "");
            this.onExtraCallbackWithResult = getwaittime;
        } else {
            Intrinsics.checkNotNullParameter(getwaittime, "");
            this.onExtraCallbackWithResult = getwaittime;
            int i3 = 94 / 0;
        }
    }

    public final getBigDecimal IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 95;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getBigDecimal getbigdecimal = this.walletErrorHandler;
        if (getbigdecimal == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 9;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return getbigdecimal;
    }

    public final Object asBinder$60b4c886() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 69;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj = this.mobileIdManager;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return obj;
    }

    public hasCrashWhenJavaCrash onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.onWarmupCompleted.getValue();
        int i4 = IAuthTabCallbackStub + 99;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return hascrashwhenjavacrash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f A[PHI: r1
      0x005f: PHI (r1v7 o.ExtHubMetaInfoHelper) = (r1v6 o.ExtHubMetaInfoHelper), (r1v14 o.ExtHubMetaInfoHelper) binds: [B:8:0x005d, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> getScreenParams() throws Throwable {
        ExtHubMetaInfoHelper extHubMetaInfoHelper;
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = asInterface + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {access000()};
            extHubMetaInfoHelper = (ExtHubMetaInfoHelper) MobileIdIssueViewModel.onNavigationEvent(-676113272, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 676113274, R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback());
            int i3 = 64 / 0;
            if (extHubMetaInfoHelper != null) {
                strOnExtraCallback = extHubMetaInfoHelper.onExtraCallback();
                int i4 = asInterface + 33;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strOnExtraCallback = null;
            }
        } else {
            Object[] objArr2 = {access000()};
            extHubMetaInfoHelper = (ExtHubMetaInfoHelper) MobileIdIssueViewModel.onNavigationEvent(-676113272, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 676113274, R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback());
            if (extHubMetaInfoHelper != null) {
            }
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("tx_id", strOnExtraCallback);
        Object[] objArr3 = new Object[1];
        a(8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 8, new char[]{7, 65530, 7, 7, 65530, 65531, 65530, 7}, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 272, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Object[] objArr4 = {access000()};
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(strIntern, (String) MobileIdIssueViewModel.onNavigationEvent(-147195383, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 147195405, R.drawable.IAuthTabCallback(), objArr4, R.drawable.IAuthTabCallback()));
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("idcard_type", (String) IAuthTabCallback(862713838, -862713837, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, iOnWarmupCompleted))});
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        getWaitTime getwaittimeOnExtraCallback = getWaitTime.onExtraCallback(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(getwaittimeOnExtraCallback, "");
        onExtraCallback(getwaittimeOnExtraCallback);
        ConstraintLayout constraintLayoutOnWarmupCompleted = IAuthTabCallbackDefault().onWarmupCompleted();
        int i4 = IAuthTabCallbackStub + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnWarmupCompleted;
    }

    public static final class onExtraCallback<T> implements Comparator {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((AvailableVcListResponse.IssuableVc) t).IAuthTabCallback()), Integer.valueOf(((AvailableVcListResponse.IssuableVc) t2).IAuthTabCallback()));
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            getPackageType getpackagetype = mobileIdIssueOtherVcFragment.onExtraCallback;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        getPackageType getpackagetype2 = mobileIdIssueOtherVcFragment.onExtraCallback;
        if (getpackagetype2 != null && getpackagetype2.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        Context context = mobileIdIssueOtherVcFragment.getContext();
        if (context != null) {
            mobileIdIssueOtherVcFragment.onExtraCallback = maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(mobileIdIssueOtherVcFragment), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(mobileIdIssueOtherVcFragment, context, (access13800) null), 3, (Object) null);
            return Unit.INSTANCE;
        }
        int i3 = asInterface + 1;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
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
        int i6 = $11 + 123;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 23, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getScrollBarSize() >> 8)), 55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i11 = $11 + 85;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i13 = $10 + 71;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "")), 55 - View.resolveSize(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onNavigationEvent(MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        mobileIdIssueOtherVcFragment.access000().IEngagementSignalsCallbackDefault().onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Throwable $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Throwable th, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$it = th;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = MobileIdIssueOtherVcFragment.this.new onWarmupCompleted(this.$it, access13800Var);
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                getBigDecimal getbigdecimalIAuthTabCallbackStub = MobileIdIssueOtherVcFragment.this.IAuthTabCallbackStub();
                BaseActivity baseActivityRequireBaseActivity = MobileIdIssueOtherVcFragment.this.requireBaseActivity();
                Throwable th = this.$it;
                this.label = 1;
                if (getBigDecimal.onNavigationEvent(getbigdecimalIAuthTabCallbackStub, baseActivityRequireBaseActivity, th, (Map) null, (Function0) null, (Function0) null, this, 28, (Object) null) == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 45;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 87;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 71 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i4 = i3 + 21;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i5 = onExtraCallbackWithResult + 83;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            int i4 = onNavigationEvent + 81;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return defaultViewModelProviderFactory;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            int i3 = onWarmupCompleted + 73;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Typography6 typography6 = IAuthTabCallbackDefault().onWarmupCompleted;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        typography6.setText((String) IAuthTabCallback(862713838, -862713837, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, iOnWarmupCompleted));
        TdsBottomCtaV1View tdsBottomCtaV1View = IAuthTabCallbackDefault().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_other_vc_cta);
        Intrinsics.checkNotNullExpressionValue(string, "");
        logInvite.onExtraCallback(tdsBottomCtaV1View, string, 0L, (TdsButtonV1View.asInterface) null, false, new MobileIdIssueOtherVcFragment$.ExternalSyntheticLambda0(this), 14, (Object) null);
        TdsBottomCtaV1View tdsBottomCtaV1View2 = IAuthTabCallbackDefault().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        String string2 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_other_vc_secondary);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        logInvite.IAuthTabCallback(tdsBottomCtaV1View2, string2, 0L, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK), false, new MobileIdIssueOtherVcFragment$.ExternalSyntheticLambda1(this), 10, (Object) null);
        MobileIdIssueViewModel mobileIdIssueViewModelAccess000 = access000();
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(mobileIdIssueViewModelAccess000, this, (access13800) null), 3, (Object) null);
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        ((Rmipmap) MobileIdIssueViewModel.onNavigationEvent(-398626569, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 398626579, iIAuthTabCallback, new Object[]{mobileIdIssueViewModelAccess000}, R.drawable.IAuthTabCallback())).observe(getViewLifecycleOwner(), new BaseFragment.extraCallback(new IAuthTabCallback()));
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(250);
        LottieAnimationView lottieAnimationView = IAuthTabCallbackDefault().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        AuthenticatorCompanion authenticatorCompanion = AuthenticatorCompanion.IAuthTabCallback;
        authenticate authenticateVar = authenticate.IN;
        Cache cache = Cache.UP;
        AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.SLOW;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{lottieAnimationView, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        SubTypography5 subTypography5 = IAuthTabCallbackDefault().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(subTypography5, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{subTypography5, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Typography7 typography7 = IAuthTabCallbackDefault().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{typography7, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Typography6 typography62 = IAuthTabCallbackDefault().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(typography62, "");
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, onnavigationevent, CollectionsKt.listOf(new Rally[]{rally, rally2, rally3, (Rally) RallysKt.onWarmupCompleted(new Object[]{typography62, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String strOnExtraCallbackWithResult;
        MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment = (MobileIdIssueOtherVcFragment) objArr[0];
        int i = 2 % 2;
        List listIAuthTabCallbackDefault = mobileIdIssueOtherVcFragment.access000().IAuthTabCallbackDefault();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallbackDefault, 10));
        Iterator it = listIAuthTabCallbackDefault.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((readExtHubMetaInfo) it.next()).getVcTypeCode()));
        }
        Set set = CollectionsKt.toSet(arrayList);
        List listICustomTabsCallback = mobileIdIssueOtherVcFragment.access000().ICustomTabsCallback();
        ArrayList arrayList2 = new ArrayList();
        int i2 = asInterface + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        for (Object obj : listICustomTabsCallback) {
            if (!set.contains(Integer.valueOf(((AvailableVcListResponse.IssuableVc) obj).IAuthTabCallback()))) {
                int i4 = asInterface + 9;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList2.add(obj);
                    throw null;
                }
                arrayList2.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new onExtraCallback());
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            readExtHubMetaInfo readexthubmetainfoOnNavigationEvent = readExtHubMetaInfo.Companion.onNavigationEvent(((AvailableVcListResponse.IssuableVc) it2.next()).IAuthTabCallback());
            if (readexthubmetainfoOnNavigationEvent != null) {
                int i5 = asInterface + 101;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                Context contextRequireContext = mobileIdIssueOtherVcFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                strOnExtraCallbackWithResult = resolveProxyClass.onExtraCallbackWithResult(readexthubmetainfoOnNavigationEvent, contextRequireContext);
            } else {
                strOnExtraCallbackWithResult = null;
            }
            if (strOnExtraCallbackWithResult != null) {
                arrayList3.add(strOnExtraCallbackWithResult);
            }
        }
        return CollectionsKt.joinToString$default(arrayList3, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public static final /* synthetic */ MobileIdIssueViewModel onExtraCallbackWithResult(MobileIdIssueOtherVcFragment mobileIdIssueOtherVcFragment) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (MobileIdIssueViewModel) IAuthTabCallback(-1480289090, 1480289090, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{mobileIdIssueOtherVcFragment}, iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    private final String getInterfaceDescriptor() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (String) IAuthTabCallback(862713838, -862713837, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this}, iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    public static final class IAuthTabCallback implements Function1<Throwable, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return unit;
        }

        public final void onWarmupCompleted(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Throwable th2 = th;
            if (th2 instanceof SsiException) {
                maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(MobileIdIssueOtherVcFragment.this), (CoroutineContext) null, (setRandomHost) null, MobileIdIssueOtherVcFragment.this.new onWarmupCompleted(th2, null), 3, (Object) null);
                return;
            }
            Intrinsics.checkNotNull(th2);
            getParamImp.onWarmupCompleted(th2, MobileIdIssueOtherVcFragment.this.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
