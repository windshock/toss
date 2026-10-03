package viva.republica.toss.dashboard.onboarding;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zziea;
import im.toss.TossApplication;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.InterstitialAdExtendedListener;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_PKCS12_MakePFX_ENCPKCS8;
import o.access13800;
import o.access14300;
import o.access15400;
import o.copyFile;
import o.enableModuleArgumentNSNullConversionIOS;
import o.findResAndMsg;
import o.getCurrentAppState;
import o.getDummyAd;
import o.getSWidth;
import o.maybeUpdateAnimatable;
import o.notifyVerticalEdgeReached;
import o.onPageExit;
import o.setRandomHost;
import o.updateAnimatedNodeConfig;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.network.model.teens.TeensCardEventApplyResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TeensOnboardingTutorialActivity extends Hilt_TeensOnboardingTutorialActivity {
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int access100;
    private static char asBinder;
    private static long asInterface;

    @Inject
    public copyFile appsFlyerManager;

    @Inject
    public notifyVerticalEdgeReached guestLoginManager;
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            return (Unit) TeensOnboardingTutorialActivity.onExtraCallback(objArr, iIAuthTabCallback, zziea.IAuthTabCallback(), -1426994829, zziea.IAuthTabCallback(), iIAuthTabCallback2, 1426994829);
        }
    });

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TeensOnboardingTutorialActivity.onNavigationEvent(TeensOnboardingTutorialActivity.this, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, byte r9) {
        /*
            int r7 = 110 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r0 = viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.$$c(int, short, byte):java.lang.String");
    }

    static {
        access100 = 1;
        ICustomTabsServiceStub();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        IAuthTabCallbackDefault = 8;
        int i = access000 + 39;
        access100 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = (~i) | i8;
        int i10 = i7 | (~i9);
        int i11 = i | i8;
        int i12 = ~(i9 | i3);
        int i13 = i6 + i3 + i5 + (1075552530 * i4) + ((-1519595880) * i2);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i6) - 1639710720) + ((-2116975300) * i3) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i5) + ((-189792256) * i4) + (1111490560 * i2) + (1415839744 * i14);
        int i16 = (i6 * 251836610) + 257048825 + (i3 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i5 * 251837547) + (i4 * 1710852742) + (i2 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        return i17 != 1 ? i17 != 2 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        TeensOnboardingTutorialActivity teensOnboardingTutorialActivity = (TeensOnboardingTutorialActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(teensOnboardingTutorialActivity, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean bq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        int i3 = 86 / 0;
        return -1L;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(TeensOnboardingTutorialActivity teensOnboardingTutorialActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strWriteTypedList = teensOnboardingTutorialActivity.writeTypedList();
        int i4 = IAuthTabCallback_Parcel + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strWriteTypedList;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallbackWithResult(TeensOnboardingTutorialActivity teensOnboardingTutorialActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = teensOnboardingTutorialActivity.onTransact;
        int i5 = i2 + 113;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(TeensOnboardingTutorialActivity teensOnboardingTutorialActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            teensOnboardingTutorialActivity.onWarmupCompleted((access13800<? super Boolean>) access13800Var);
            throw null;
        }
        Object objOnWarmupCompleted = teensOnboardingTutorialActivity.onWarmupCompleted((access13800<? super Boolean>) access13800Var);
        int i3 = IAuthTabCallbackStubProxy + 25;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
        }
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ void onNavigationEvent(TeensOnboardingTutorialActivity teensOnboardingTutorialActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        teensOnboardingTutorialActivity.access200();
        int i4 = IAuthTabCallbackStubProxy + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i2 = IAuthTabCallback_Parcel + 57;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        copyFile copyfile = ((TeensOnboardingTutorialActivity) objArr[0]).appsFlyerManager;
        Object obj = null;
        if (copyfile != null) {
            int i2 = IAuthTabCallback_Parcel + 81;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return copyfile;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final getDummyAd IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 73;
        int i5 = i4 % 128;
        IAuthTabCallbackStubProxy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 73;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        return getdummyad;
    }

    private final updateAnimatedNodeConfig ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        updateAnimatedNodeConfig updateanimatednodeconfig = (updateAnimatedNodeConfig) UST_PKCS12_MakePFX_ENCPKCS8.onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 334927683, -334927681, objArr, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback);
        int i4 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return updateanimatednodeconfig;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(TeensOnboardingTutorialActivity teensOnboardingTutorialActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            teensOnboardingTutorialActivity.access200();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        teensOnboardingTutorialActivity.access200();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
    
        r1 = null;
        o.verifyHASH.onWarmupCompleted(o.verifyHASH.onExtraCallback, false, 1, (java.lang.Object) null);
        o.UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted.onWarmupCompleted((android.content.Context) r14);
        access200();
        r15 = viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.IAuthTabCallback_Parcel + 49;
        viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.IAuthTabCallbackStubProxy = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0092, code lost:
    
        if ((r15 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (o.setReferrerImageURL.onNavigationEvent(getIntent().getFlags(), 1048576) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (o.setReferrerImageURL.onNavigationEvent(getIntent().getFlags(), 1048576) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r5 = setEngagementSignalsCallback();
        r15 = new java.lang.Object[1];
        a((char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10326), android.view.ViewConfiguration.getTapTimeout() >> 16, new char[]{22258, 5652, 28786, 24471, 50082, 39023, 47937, 45776, 9560, 60153, 39558, 48589, 43922, 38747, 5897, 28796}, new char[]{0, 0, 0, 0}, new char[]{12152, 48006, 22225, 15912}, r15);
        o.SessionTrackerb.IAuthTabCallback(r5, r14, ((java.lang.String) r15[0]).intern(), false, (kotlin.jvm.functions.Function1) null, (android.os.Bundle) null, false, 60, (java.lang.Object) null);
        finish();
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.dashboard.onboarding.Hilt_TeensOnboardingTutorialActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r15) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.IAuthTabCallback_Parcel
            int r1 = r1 + 87
            int r2 = r1 % 128
            viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 1048576(0x100000, float:1.469368E-39)
            r4 = 0
            if (r1 == 0) goto L27
            super.onCreate(r15)
            android.content.Intent r15 = r14.getIntent()
            int r15 = r15.getFlags()
            boolean r15 = o.setReferrerImageURL.onNavigationEvent(r15, r3)
            r1 = 68
            int r1 = r1 / r4
            if (r15 == 0) goto L7b
            goto L38
        L27:
            super.onCreate(r15)
            android.content.Intent r15 = r14.getIntent()
            int r15 = r15.getFlags()
            boolean r15 = o.setReferrerImageURL.onNavigationEvent(r15, r3)
            if (r15 == 0) goto L7b
        L38:
            o.SessionTrackerb r5 = r14.setEngagementSignalsCallback()
            r15 = 0
            float r0 = android.util.TypedValue.complexToFraction(r4, r15, r15)
            int r15 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            int r15 = r15 + 10326
            char r6 = (char) r15
            int r15 = android.view.ViewConfiguration.getTapTimeout()
            r0 = 16
            int r7 = r15 >> 16
            char[] r8 = new char[r0]
            r8 = {x009a: FILL_ARRAY_DATA , data: [22258, 5652, 28786, 24471, -15454, -26513, -17599, -19760, 9560, -5383, -25978, -16947, -21614, -26789, 5897, 28796} // fill-array
            r15 = 4
            char[] r9 = new char[r15]
            r9 = {x00ae: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            char[] r10 = new char[r15]
            r10 = {x00b6: FILL_ARRAY_DATA , data: [12152, -17530, 22225, 15912} // fill-array
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r11 = r15
            a(r6, r7, r8, r9, r10, r11)
            r15 = r15[r4]
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r7 = r15.intern()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 60
            r13 = 0
            r6 = r14
            o.SessionTrackerb.IAuthTabCallback(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.finish()
            return
        L7b:
            o.verifyHASH r15 = o.verifyHASH.onExtraCallback
            r1 = 0
            o.verifyHASH.onWarmupCompleted(r15, r4, r2, r1)
            o.UST_PKCS12_MakePFX_ENCPKCS8 r15 = o.UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted
            r15.onWarmupCompleted(r14)
            r14.access200()
            int r15 = viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.IAuthTabCallback_Parcel
            int r15 = r15 + 49
            int r2 = r15 % 128
            viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.IAuthTabCallbackStubProxy = r2
            int r15 = r15 % r0
            if (r15 != 0) goto L95
            return
        L95:
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.onCreate(android.os.Bundle):void");
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TeensOnboardingTutorialActivity.this.new onExtraCallback(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity] */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyadIAuthTabCallback = TeensOnboardingTutorialActivity.this.IAuthTabCallback();
                this.label = 1;
                obj = getDummyAd.IAuthTabCallback(getdummyadIAuthTabCallback, "STD_1309_YOUTH_ONBOARDING_MARKETING_AGREEMENT", false, this, 2, (Object) null);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                UST_PKCS12_MakePFX_ENCPKCS8 uST_PKCS12_MakePFX_ENCPKCS8 = UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted;
                ?? r0 = TeensOnboardingTutorialActivity.this;
                uST_PKCS12_MakePFX_ENCPKCS8.onExtraCallback(r0, TeensOnboardingTutorialActivity.onExtraCallbackWithResult((TeensOnboardingTutorialActivity) r0));
            } else {
                Object[] objArr = {UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted};
                int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
                ((updateAnimatedNodeConfig) UST_PKCS12_MakePFX_ENCPKCS8.onNavigationEvent(TossApplication.onSessionEnded.onExtraCallback(), 334927683, -334927681, objArr, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback)).onExtraCallback((getCurrentAppState) null);
                TeensOnboardingTutorialActivity.onNavigationEvent(TeensOnboardingTutorialActivity.this);
            }
            return Unit.INSTANCE;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TeensOnboardingTutorialActivity.this.new onNavigationEvent(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity] */
        /* JADX WARN: Type inference failed for: r1v6, types: [android.content.Context, viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity] */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                String strOnExtraCallback = TeensOnboardingTutorialActivity.onExtraCallback(TeensOnboardingTutorialActivity.this);
                BaseActivity.IAuthTabCallback(TeensOnboardingTutorialActivity.this, (String) null, false, 3, (Object) null);
                TeensOnboardingTutorialActivity teensOnboardingTutorialActivity = TeensOnboardingTutorialActivity.this;
                this.L$0 = strOnExtraCallback;
                this.label = 1;
                Object objOnNavigationEvent = TeensOnboardingTutorialActivity.onNavigationEvent(teensOnboardingTutorialActivity, this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                str = strOnExtraCallback;
                obj = objOnNavigationEvent;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                UST_PKCS12_MakePFX_ENCPKCS8 uST_PKCS12_MakePFX_ENCPKCS8 = UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted;
                ?? r1 = TeensOnboardingTutorialActivity.this;
                uST_PKCS12_MakePFX_ENCPKCS8.onExtraCallback((Context) r1, str, (IEngagementSignalsCallback_Parcel<Intent>) TeensOnboardingTutorialActivity.onExtraCallbackWithResult((TeensOnboardingTutorialActivity) r1));
            } else {
                UST_PKCS12_MakePFX_ENCPKCS8 uST_PKCS12_MakePFX_ENCPKCS82 = UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted;
                ?? r0 = TeensOnboardingTutorialActivity.this;
                uST_PKCS12_MakePFX_ENCPKCS82.onNavigationEvent(r0, TeensOnboardingTutorialActivity.onExtraCallbackWithResult((TeensOnboardingTutorialActivity) r0));
            }
            TeensOnboardingTutorialActivity.this.overridePendingTransition(R.anim.slide_in_from_bottom_alpha, R.anim.stay);
            TeensOnboardingTutorialActivity.this.bo_();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void access200() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (ICustomTabsServiceStubProxy().IAuthTabCallback() != null) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
            int i4 = IAuthTabCallback_Parcel + 15;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (ICustomTabsServiceStubProxy().onNavigationEvent() == null) {
            if (ICustomTabsServiceStubProxy().onWarmupCompleted() != null) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
                return;
            } else {
                validateRelationship();
                return;
            }
        }
        int i6 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted.IAuthTabCallback(this, this.onTransact);
        } else {
            UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted.IAuthTabCallback(this, this.onTransact);
            int i7 = 11 / 0;
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super TeensCardEventApplyResponse>, Object> {
        final /* synthetic */ String $referralKey$inlined;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, String str) {
            super(2, access13800Var);
            this.$referralKey$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(access13800Var, this.$referralKey$inlined);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super TeensCardEventApplyResponse> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                InterstitialAdExtendedListener interstitialAdExtendedListenerOnActivityResized = AdSettingsIntegrationErrorMode.onNavigationEvent.onActivityResized();
                String str = this.$referralKey$inlined;
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = interstitialAdExtendedListenerOnActivityResized.onExtraCallbackWithResult(str, (access13800<? super BaseApiResponse<TeensCardEventApplyResponse>>) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (TeensCardEventApplyResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.teens.TeensCardEventApplyResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(TeensCardEventApplyResponse.class, Object.class) || Intrinsics.areEqual(TeensCardEventApplyResponse.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", i3);
                    int i4 = 44 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int packedPositionGroup = 1451 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i4, packedPositionGroup, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char c2 = (char) (49123 - (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494;
                        byte b3 = (byte) ($$b & 5);
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, keyRepeatDelay, keyRepeatDelay2, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 23972), 50 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 45848), 29 - (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.getDeadChar(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i5 = $11 + 83;
                            $10 = i5 % 128;
                            int i6 = i5 % 2;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
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
        String str = new String(cArr6);
        int i7 = $10 + 1;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(o.access13800<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.onboarding.TeensOnboardingTutorialActivity.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    private final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            ((copyFile) onExtraCallback(new Object[]{this}, iIAuthTabCallback, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback2, -1989822973)).IAuthTabCallbackStub();
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        String strIAuthTabCallbackStub = ((copyFile) onExtraCallback(new Object[]{this}, iIAuthTabCallback3, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback4, -1989822973)).IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub == null) {
            strIAuthTabCallbackStub = getSWidth.onExtraCallback.onExtraCallbackWithResult();
        }
        if (StringsKt.contains$default(strIAuthTabCallbackStub, "event", false, 2, (Object) null) && StringsKt.contains$default(strIAuthTabCallbackStub, "neon-green", false, 2, (Object) null)) {
            int i3 = IAuthTabCallbackStubProxy + 11;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0 ? StringsKt.contains$default(strIAuthTabCallbackStub, "received", false, 2, (Object) null) : StringsKt.contains$default(strIAuthTabCallbackStub, "received", true, 4, (Object) null)) {
                if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(strIAuthTabCallbackStub)) {
                    return true;
                }
            }
        }
        int i4 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final String writeTypedList() {
        int i = 2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        String strIAuthTabCallbackStub = ((copyFile) onExtraCallback(new Object[]{this}, iIAuthTabCallback, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback2, -1989822973)).IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub == null) {
            int i2 = IAuthTabCallback_Parcel + 111;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                getSWidth.onExtraCallback.onExtraCallbackWithResult();
                throw null;
            }
            strIAuthTabCallbackStub = getSWidth.onExtraCallback.onExtraCallbackWithResult();
        }
        int i3 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return strIAuthTabCallbackStub;
        }
        throw null;
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            if (((copyFile) onExtraCallback(new Object[]{this}, iIAuthTabCallback, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback2, -1989822973)).IAuthTabCallbackStub() != null) {
                int i3 = IAuthTabCallback_Parcel + 81;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                int iIAuthTabCallback3 = zziea.IAuthTabCallback();
                int iIAuthTabCallback4 = zziea.IAuthTabCallback();
                ((copyFile) onExtraCallback(new Object[]{this}, iIAuthTabCallback3, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback4, -1989822973)).onNavigationEvent();
                int i5 = IAuthTabCallbackStubProxy + 31;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            getSWidth.onExtraCallback.onTransact();
            return;
        }
        int iIAuthTabCallback5 = zziea.IAuthTabCallback();
        int iIAuthTabCallback6 = zziea.IAuthTabCallback();
        ((copyFile) onExtraCallback(new Object[]{this}, iIAuthTabCallback5, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback6, -1989822973)).IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int[] onNavigationEvent = {-1190131072, -497395001, -1003992779, 1555692289, -100925213, -333932955, 689294003, -683887376, -705664247, -1128695727, 1587837203, 1575379953, -1596638401, 654903314, -1465785068, -722816334, -186968980, -87966668};

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int i2;
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onNavigationEvent;
            int i4 = -1469660336;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = $10 + 105;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 72 - TextUtils.indexOf("", ""), 8848 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i9++;
                        i4 = -1469660336;
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
            int[] iArr5 = onNavigationEvent;
            long j = 0;
            if (iArr5 != null) {
                int i10 = $10 + 25;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(i6)), 73 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i12++;
                    i5 = 1;
                    i6 = 0;
                    j = 0;
                }
                i2 = i6;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i13 = $10 + 89;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i15 = 0;
                for (int i16 = 16; i15 < i16; i16 = 16) {
                    int i17 = $10 + 55;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionGroup(0L)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39, 10300 - MotionEvent.axisFromString(""), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i15 += 18;
                    } else {
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22251), 39 - View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i15++;
                    }
                }
                int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 78, ((Process.getThreadPriority(0) + 20) >> 6) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private onWarmupCompleted() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) TeensOnboardingTutorialActivity.class);
            Object[] objArr = new Object[1];
            a(new int[]{1388533809, -351180977, 496520959, 1361879130, 2145794049, 3094992, -1206496012, 1451378733, 235294916, 989807563}, 17 - TextUtils.getTrimmedLength(""), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TeensOnboardingTutorialActivity teensOnboardingTutorialActivity = (TeensOnboardingTutorialActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        String strIAuthTabCallbackStub = ((copyFile) onExtraCallback(new Object[]{teensOnboardingTutorialActivity}, iIAuthTabCallback, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback2, -1989822973)).IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub == null) {
            int i4 = IAuthTabCallback_Parcel + 117;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            strIAuthTabCallbackStub = getSWidth.onExtraCallback.onExtraCallbackWithResult();
        }
        return Uri.parse(strIAuthTabCallbackStub).getQueryParameter("referralKey");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted.onExtraCallbackWithResult(this);
            finish();
            int i3 = IAuthTabCallback_Parcel + 23;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        UST_PKCS12_MakePFX_ENCPKCS8.onWarmupCompleted.onExtraCallbackWithResult(this);
        finish();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TeensOnboardingTutorialActivity teensOnboardingTutorialActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (Unit) onExtraCallback(new Object[]{teensOnboardingTutorialActivity, iEngagementSignalsCallbackDefault}, iIAuthTabCallback, zziea.IAuthTabCallback(), -1426994829, zziea.IAuthTabCallback(), iIAuthTabCallback2, 1426994829);
    }

    private final String IEngagementSignalsCallback() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (String) onExtraCallback(new Object[]{this}, iIAuthTabCallback, zziea.IAuthTabCallback(), 1442562852, zziea.IAuthTabCallback(), iIAuthTabCallback2, -1442562850);
    }

    public final copyFile onNavigationEvent() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (copyFile) onExtraCallback(new Object[]{this}, iIAuthTabCallback, zziea.IAuthTabCallback(), 1989822974, zziea.IAuthTabCallback(), iIAuthTabCallback2, -1989822973);
    }

    @Override // viva.republica.toss.dashboard.onboarding.Hilt_TeensOnboardingTutorialActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.dashboard.onboarding.Hilt_TeensOnboardingTutorialActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }

    @Override // viva.republica.toss.dashboard.onboarding.Hilt_TeensOnboardingTutorialActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.dashboard.onboarding.Hilt_TeensOnboardingTutorialActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 3;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
    }

    static void ICustomTabsServiceStub() {
        asInterface = 7798559133331975163L;
        IAuthTabCallbackStub = -1776194565;
        asBinder = (char) 41443;
    }
}
