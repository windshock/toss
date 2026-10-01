package im.toss.features.credit.ui.plus.freetrial;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.compose.ui.platform.ComposeView;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialArrivedActivity$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AudioMatcher1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CrossPromotionHelper;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.PlayerErrorCode;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getRouteDatabase;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getUserData;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.hasRootStatusPermission;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.readIntokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setRubIn;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusFreeTrialArrivedActivity extends Hilt_CreditPlusFreeTrialArrivedActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    public static final int asInterface;
    private static int getInterfaceDescriptor = 1;
    private static char[] onTransact;
    private ComposeView IAuthTabCallbackStub;

    @Inject
    public hasRootStatusPermission creditPlusApi;
    private final Lazy asBinder = isStopUpload.onNavigationEvent(this, 1474973, (Function1) null, new CreditPlusFreeTrialArrivedActivity$.ExternalSyntheticLambda0(this), 2, (Object) null);
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new CreditPlusFreeTrialArrivedActivity$.ExternalSyntheticLambda1(this));

    static {
        IEngagementSignalsCallbackDefault();
        Companion = new onExtraCallbackWithResult(null);
        asInterface = 8;
        int i = IAuthTabCallbackStubProxy + 35;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditPlusFreeTrialArrivedActivity, view);
        int i4 = getInterfaceDescriptor + 121;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, TdsTopV2View tdsTopV2View) {
        int i = 2 % 2;
        int i2 = access000 + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted, iOnWarmupCompleted2, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{creditPlusFreeTrialArrivedActivity, tdsTopV2View}, iOnWarmupCompleted3, -737401642, 737401643);
        int i4 = getInterfaceDescriptor + 41;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = access000 + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(creditPlusFreeTrialArrivedActivity, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusFreeTrialArrivedActivity, iEngagementSignalsCallbackDefault);
        int i3 = getInterfaceDescriptor + 51;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditPlusFreeTrialArrivedActivity, onwarmupcompleted);
        int i4 = access000 + 61;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i12 = ~((~i) | i5 | i6);
        int i13 = i5 + i6 + i2 + ((-2027816600) * i4) + ((-1234684791) * i3);
        int i14 = i13 * i13;
        int i15 = (i5 * (-132237830)) + 1711013888 + ((-132237830) * i6) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i2) + (811597824 * i4) + (1100742656 * i3) + (1751056384 * i14);
        int i16 = ((i5 * 572746074) - 905264446) + (i6 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i2 * 572745585) + (i4 * 982511336) + (i3 * (-774025351)) + (i14 * 1257177088);
        return i15 + ((i16 * i16) * 1874919424) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity = (CreditPlusFreeTrialArrivedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 25;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        ComposeView composeView = creditPlusFreeTrialArrivedActivity.IAuthTabCallbackStub;
        int i5 = i3 + 73;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return composeView;
        }
        throw null;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            int i3 = 86 / 0;
        } else {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        int i4 = getInterfaceDescriptor + 75;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access000 + 125;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
            obj.hashCode();
            throw null;
        }
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i3 = getInterfaceDescriptor + 15;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return strICustomTabsServiceStubProxy;
        }
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = access000 + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = getInterfaceDescriptor + 63;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = access000 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = getInterfaceDescriptor + 41;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return viewAq_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access000 + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.ar_();
        }
        super/*o.openJavaCrashMonitor*/.ar_();
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = access000 + 43;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.getScreenId();
            obj.hashCode();
            throw null;
        }
        long screenId = super.getScreenId();
        int i3 = getInterfaceDescriptor + 105;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return screenId;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getScreenParams();
        }
        super.getScreenParams();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = getInterfaceDescriptor + 43;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
            int i3 = 11 / 0;
        } else {
            onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        }
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsService_Parcel;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            hascrashwhenjavacrashICustomTabsService_Parcel = ICustomTabsService_Parcel();
            int i3 = 2 / 0;
        } else {
            hascrashwhenjavacrashICustomTabsService_Parcel = ICustomTabsService_Parcel();
        }
        int i4 = access000 + 39;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsService_Parcel;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access000 + 111;
        getInterfaceDescriptor = i2 % 128;
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
        int i2 = access000 + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            throw null;
        }
    }

    public hasCrashWhenJavaCrash ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.asBinder.getValue();
        int i4 = access000 + 107;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(new int[]{56, 8, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1}, objArr);
        onwarmupcompleted.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditPlusFreeTrialArrivedActivity.getIntent()));
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 119;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialArrivedActivity.getInterfaceDescriptor + 89;
        im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialArrivedActivity.access000 = r1 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hasRootStatusPermission ICustomTabsServiceStub() {
        hasRootStatusPermission hasrootstatuspermission;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            hasrootstatuspermission = this.creditPlusApi;
            int i3 = 94 / 0;
        } else {
            hasrootstatuspermission = this.creditPlusApi;
        }
    }

    private static final Unit onWarmupCompleted(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = access000 + 115;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            creditPlusFreeTrialArrivedActivity.finish();
            int i4 = access000 + 83;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialArrivedActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        Pair<View, AppBarLayout> pairOnSessionEnded = onSessionEnded();
        View view = (View) pairOnSessionEnded.onExtraCallbackWithResult();
        AppBarLayout appBarLayout = (AppBarLayout) pairOnSessionEnded.IAuthTabCallback();
        setContentView(view);
        disableImageViewPreallocationAndroid.onNavigationEvent(view, appBarLayout, (View) null, (View) null, false, 14, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
        int i2 = access000 + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onExtraCallback + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i6 = onExtraCallback + 23;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i8 = onExtraCallback + 87;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SetDetectingInterval setDetectingInterval = (CreditPlusFreeTrialArrivedActivity) objArr[0];
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        String string = setDetectingInterval.getString(R.string.credit_ui_plus_free_trial_arrived_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setSubtitle2TextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy());
        String string2 = setDetectingInterval.getString(R.string.credit_ui_plus_free_trial_arrived_subtitle, PlayerErrorCode.onPostMessage());
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsTopV2View.setSubtitle2Text(string2);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 33;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 27899;
        private static int asBinder = 1;
        private static int onExtraCallback = 0;
        private static char onExtraCallbackWithResult = 54228;
        private static char onNavigationEvent = 11502;
        private static char onWarmupCompleted = 34194;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $10 + 119;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i6 = $10 + 89;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    int i10 = $11 + 83;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                    int i13 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i13);
                        objArr2[1] = Integer.valueOf(i12);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int i14 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                            int maximumDrawingCacheSize = 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionGroup, i14, maximumDrawingCacheSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), TextUtils.getCapsMode("", 0, 0) + 10, 12434 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 14, 19900 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CreditPlusFreeTrialArrivedActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{42356, 887, 16260, 31569, 2090, 26295, 18898, 19535}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = asBinder + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intentPutExtra;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = creditPlusFreeTrialArrivedActivity.IAuthTabCallbackDefault;
        Intent intent = new Intent((Context) creditPlusFreeTrialArrivedActivity, (Class<?>) CreditPlusFreeTrialGuideActivity.class);
        Object[] objArr = new Object[1];
        a(new int[]{56, 8, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1}, objArr);
        Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditPlusFreeTrialArrivedActivity.getIntent()));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(intentPutExtra);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Pair<View, AppBarLayout> onSessionEnded() throws Throwable {
        int i = 2 % 2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), im.toss.uikit.R.drawable.appbar_elevation_off));
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            Unit unit = Unit.INSTANCE;
        }
        IPostMessageServiceStubProxy supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            int i2 = access000 + 31;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar2.IAuthTabCallbackStub(false);
            Unit unit2 = Unit.INSTANCE;
            int i4 = access000 + 43;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 5;
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
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context4 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout2 = new LinearLayout(context4);
        linearLayout2.setOrientation(1);
        Context context5 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        LinearLayout linearLayout3 = new LinearLayout(context5);
        linearLayout3.setOrientation(1);
        getRouteDatabase.IAuthTabCallback(linearLayout3, new CreditPlusFreeTrialArrivedActivity$.ExternalSyntheticLambda2(this));
        Context context6 = linearLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsImageView tdsImageView = new TdsImageView(context6, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.gravity = 17;
        DisplayMetrics displayMetrics = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams4.width = varyMatches.onNavigationEvent(200, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        layoutParams4.height = varyMatches.onNavigationEvent(200, displayMetrics2);
        DisplayMetrics displayMetrics3 = tdsImageView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        layoutParams4.topMargin = varyMatches.onNavigationEvent(64, displayMetrics3);
        tdsImageView.setLayoutParams(layoutParams3);
        linearLayout3.setGravity(17);
        Object[] objArr = new Object[1];
        a(new int[]{0, 56, 150, 0}, true, new byte[]{1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, tdsImageView);
        Space space = new Space(linearLayout3.getContext());
        DisplayMetrics displayMetrics4 = space.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(space, varyMatches.onNavigationEvent(160, displayMetrics4));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, space);
        this.IAuthTabCallbackStub = CrossPromotionHelper.onNavigationEvent(linearLayout3, AudioMatcher1.onExtraCallbackWithResult.onNavigationEvent());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, linearLayout3);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        Context context7 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context7);
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, tdsScrollView, false, 0, 6, (Object) null);
        String string = getString(viva.republica.toss.R.string.show_detail);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditPlusFreeTrialArrivedActivity$.ExternalSyntheticLambda3(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        return getWrite.IAuthTabCallback(linearLayout, objectRef.element);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onTransact;
        Object obj = null;
        if (cArr2 != null) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 15;
                $11 = i9 % 128;
                int i10 = i9 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 35283), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34, 14238 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.lastIndexOf("", '0', 0, 0)), 65 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 16718 - View.combineMeasuredStates(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 29 - TextUtils.indexOf("", ""), (ViewConfiguration.getEdgeSlop() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 49467), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 70, 12486 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i13 = $11 + 31;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 << i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 * i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i14 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i14, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static final /* synthetic */ ComposeView onExtraCallbackWithResult(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (ComposeView) onNavigationEvent(iOnWarmupCompleted, iOnWarmupCompleted2, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{creditPlusFreeTrialArrivedActivity}, iOnWarmupCompleted3, 394151618, -394151618);
    }

    private static final Unit onNavigationEvent(CreditPlusFreeTrialArrivedActivity creditPlusFreeTrialArrivedActivity, TdsTopV2View tdsTopV2View) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(iOnWarmupCompleted, iOnWarmupCompleted2, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{creditPlusFreeTrialArrivedActivity, tdsTopV2View}, iOnWarmupCompleted3, -737401642, 737401643);
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialArrivedActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 93;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialArrivedActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = access000 + 105;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialArrivedActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = access000 + 63;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.features.credit.ui.plus.freetrial.Hilt_CreditPlusFreeTrialArrivedActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = getInterfaceDescriptor + 41;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IEngagementSignalsCallbackDefault() {
        onTransact = new char[]{27184, 27470, 27467, 27307, 27310, 27470, 27467, 27312, 27283, 27281, 27470, 27467, 27469, 27312, 27469, 27462, 27313, 27281, 27281, 27312, 27471, 27466, 27313, 27312, 27465, 27304, 27281, 27317, 27471, 27468, 27310, 27281, 27311, 27273, 27306, 27471, 27311, 27304, 27463, 27465, 27465, 27305, 27280, 27314, 27466, 27470, 27470, 27463, 27305, 27275, 27268, 27298, 27465, 27462, 27460, 27466, 27255, 27173, 27179, 27179, 27173, 27196, 27173, 27173};
    }
}
