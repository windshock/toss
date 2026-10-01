package im.toss.features.credit.ui.plus.gift.receive;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.credit.ui.plus.gift.receive.CreditPlusGiftTutorialActivity$;
import im.toss.features.credit.ui.plus.intro.component.CreditPlusGiftTutorialComponent1;
import im.toss.features.credit.ui.plus.intro.component.CreditPlusGiftTutorialComponent2;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DocumentMatcher3;
import o.FileType;
import o.GraphicDeviceInfo;
import o.IPostMessageServiceStubProxy;
import o.ParamUtils;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TombstoneProtosMemoryMappingBuilder;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logAndOpenStore;
import o.logVerbose;
import o.minWebSocketMessageToCompress;
import o.readIntokhttp;
import o.setAdVideoPlaybackListener;
import o.setProxySelectorokhttp;
import o.setRubIn;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusGiftTutorialActivity extends Hilt_CreditPlusGiftTutorialActivity implements SetDetectingInterval {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));
    private final Lazy asInterface = isStopUpload.onNavigationEvent(this, 1393407, (Function1) null, (Function1) null, 6, (Object) null);

    @Inject
    public SessionTrackerb tossRouter;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity = (CreditPlusGiftTutorialActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditPlusGiftTutorialActivity, view);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = onTransact + 57;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1483489105, new Object[]{view}, PushInfo.Companion.onExtraCallback(), 1483489108, PushInfo.Companion.onExtraCallback());
        int i4 = IAuthTabCallbackStub + 119;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPlusGiftTutorialActivity);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditPlusGiftTutorialActivity, view);
        int i4 = onTransact + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(gettypedexportedconstants, view);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(view);
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusGiftTutorialActivity, tdsListHeaderV3View);
        int i4 = onTransact + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~i3;
        int i10 = ~i5;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i | i5)) | (~(i7 | i9 | i10));
        int i13 = i3 + i5 + i2 + ((-1136091917) * i4) + (376669458 * i6);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i3) + 1718550528 + ((-1748215485) * i5) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i2) + ((-2044854272) * i4) + (41156608 * i6) + (1721171968 * i14);
        int i16 = ((i3 * (-924404593)) - 1636593565) + (i5 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i2 * (-924404175)) + (i4 * (-2083730301)) + (i6 * 182666354) + (i14 * (-51970048));
        int i17 = i15 + (i16 * i16 * (-653721600));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity = (CreditPlusGiftTutorialActivity) objArr[0];
        TdsListHeaderV3View tdsListHeaderV3View = (TdsListHeaderV3View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(creditPlusGiftTutorialActivity, tdsListHeaderV3View);
        }
        onNavigationEvent(creditPlusGiftTutorialActivity, tdsListHeaderV3View);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements Function0<FileType> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Activity onNavigationEvent;

        public IAuthTabCallback(Activity activity) {
            this.onNavigationEvent = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback();
            }
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final FileType IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            FileType fileTypeOnNavigationEvent = FileType.onNavigationEvent(layoutInflater);
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return fileTypeOnNavigationEvent;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 83;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public final void onNavigationEvent(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return unit;
        }
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault;
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            int i3 = 81 / 0;
        } else {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        int i4 = IAuthTabCallbackStub + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
            throw null;
        }
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i3 = onTransact + 3;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return strICustomTabsServiceStubProxy;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = IAuthTabCallbackStub + 125;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.removeAttachLongUserData*/.aq_();
        }
        super/*o.removeAttachLongUserData*/.aq_();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = onTransact + 65;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return mapAr_;
        }
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = onTransact + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = onTransact + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return screenId;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.getScreenParams();
            throw null;
        }
        Map<String, Object> screenParams = super.getScreenParams();
        int i3 = onTransact + 77;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return screenParams;
        }
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = onTransact + 81;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = onTransact + 87;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = onTransact + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = IAuthTabCallbackStub + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = onTransact + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final FileType onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return (FileType) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.asInterface.getValue();
        int i4 = onTransact + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    @Override // im.toss.features.credit.ui.plus.gift.receive.Hilt_CreditPlusGiftTutorialActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(onVerticalScrollEvent().IAuthTabCallback());
        ConstraintLayout constraintLayoutIAuthTabCallback = onVerticalScrollEvent().IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutIAuthTabCallback, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutIAuthTabCallback, onVerticalScrollEvent().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        IEngagementSignalsCallbackDefault();
        int i4 = onTransact + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            setToolbar(onVerticalScrollEvent().onExtraCallbackWithResult);
            IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.IAuthTabCallbackStub(false);
                int i3 = onTransact + 61;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -838581687, new Object[]{this}, PushInfo.Companion.onExtraCallback(), 838581687, PushInfo.Companion.onExtraCallback());
            return;
        }
        setToolbar(onVerticalScrollEvent().onExtraCallbackWithResult);
        getSupportActionBar();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                int i4 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 7 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 67;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 0 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            int i4 = onNavigationEvent + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 47;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    private static final Unit onExtraCallbackWithResult(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftTutorialActivity.IPostMessageService();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 35;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [android.content.Context, im.toss.features.credit.ui.plus.gift.receive.CreditPlusGiftTutorialActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ?? r14 = (CreditPlusGiftTutorialActivity) objArr[0];
        int i = 2 % 2;
        r14.onVerticalScrollEvent().onNavigationEvent.removeAllViews();
        LinearLayout linearLayout = r14.onVerticalScrollEvent().onNavigationEvent;
        CreditPlusGiftTutorialComponent1 creditPlusGiftTutorialComponent1 = new CreditPlusGiftTutorialComponent1((Context) r14, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        creditPlusGiftTutorialComponent1.onExtraCallback(new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda0((CreditPlusGiftTutorialActivity) r14));
        linearLayout.addView(creditPlusGiftTutorialComponent1);
        r14.onVerticalScrollEvent().IAuthTabCallback.removeAllViews();
        r14.onVerticalScrollEvent().IAuthTabCallback.addView(new CreditPlusGiftTutorialComponent2((Context) r14, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
        TdsBottomCtaV1View tdsBottomCtaV1View = r14.onVerticalScrollEvent().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string = r14.getString(R.string.next);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda1(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        Object[] objArr2 = {r14.onVerticalScrollEvent().onExtraCallback.asInterface(), ParamUtils.NORMAL, new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda2((CreditPlusGiftTutorialActivity) r14)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit IAuthTabCallback(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusGiftTutorialActivity.onSessionEnded();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        creditPlusGiftTutorialActivity.onSessionEnded();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 33;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onTransact(View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            unit = Unit.INSTANCE;
            int i3 = 57 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStub + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSessionEnded() {
        int i = 2 % 2;
        LinearLayout linearLayout = onVerticalScrollEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = onVerticalScrollEvent().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        TdsBottomCtaV1View tdsBottomCtaV1View = onVerticalScrollEvent().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        String string = getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_tutorial_cta);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda3(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        Object[] objArr = {onVerticalScrollEvent().onExtraCallback.asInterface(), ParamUtils.NORMAL, new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda4(this)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int i2 = onTransact + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusGiftTutorialActivity.finish();
            SessionTrackerb.IAuthTabCallback(creditPlusGiftTutorialActivity.ICustomTabsService_Parcel(), creditPlusGiftTutorialActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.extraCallback.onExtraCallbackWithResult, false, "credit_plus_gift_tutorial", true, (Map) null, 99, (Object) null), true, (Function1) null, (Bundle) null, false, 59, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            creditPlusGiftTutorialActivity.finish();
            SessionTrackerb.IAuthTabCallback(creditPlusGiftTutorialActivity.ICustomTabsService_Parcel(), creditPlusGiftTutorialActivity, h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.extraCallback.onExtraCallbackWithResult, false, "credit_plus_gift_tutorial", false, (Map) null, 13, (Object) null), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        tdsListHeaderV3View.setTitleText(creditPlusGiftTutorialActivity.getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_intro_variant_bottom_sheet_title1));
        GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
        tdsListHeaderV3View.setTitleFontWeight(iAuthTabCallback.IAuthTabCallback());
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        tdsListHeaderV3View.setTitleFontWeight(iAuthTabCallback.IAuthTabCallback());
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        tdsListHeaderV3View.setTitleText(creditPlusGiftTutorialActivity.getString(im.toss.features.credit.ui.plus.R.string.credit_ui_plus_intro_variant_bottom_sheet_title2));
        GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
        tdsListHeaderV3View.setTitleFontWeight(iAuthTabCallback.IAuthTabCallback());
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.MEDIUM);
        tdsListHeaderV3View.setTitleFontWeight(iAuthTabCallback.IAuthTabCallback());
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onExtraCallback(configuration)).onRelationshipValidationResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            gettypedexportedconstants.dismiss();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        gettypedexportedconstants.dismiss();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 87;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageService() {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.onExtraCallbackWithResult;
        logAndOpenStore.IAuthTabCallback(this, 1356657L);
        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(this, 0, false, false, 1356657L, onextracallbackwithresult, 14, (DefaultConstructorMarker) null);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        minWebSocketMessageToCompress.onNavigationEvent(linearLayout, new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda5(this));
        ComposeView composeView = new ComposeView(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        DocumentMatcher3 documentMatcher3 = DocumentMatcher3.onExtraCallbackWithResult;
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(documentMatcher3.onExtraCallback()));
        linearLayout.addView(composeView);
        minWebSocketMessageToCompress.onNavigationEvent(linearLayout, new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda6(this));
        ComposeView composeView2 = new ComposeView(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView2.setContent(setAdVideoPlaybackListener.onWarmupCompleted(documentMatcher3.onWarmupCompleted()));
        linearLayout.addView(composeView2);
        TdsButtonV1View.asInterface asinterface = new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 15, (DefaultConstructorMarker) null);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsButtonV1View tdsButtonV1View = new TdsButtonV1View(context2);
        tdsButtonV1View.setTheme(asinterface);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        DisplayMetrics displayMetrics = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(32, displayMetrics2);
        DisplayMetrics displayMetrics3 = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(24, displayMetrics3);
        DisplayMetrics displayMetrics4 = tdsButtonV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(24, displayMetrics4));
        tdsButtonV1View.setLayoutParams(layoutParams);
        tdsButtonV1View.setText(getString(im.toss.uikit.R.string.uikit_ok));
        Object[] objArr = {tdsButtonV1View, ParamUtils.NORMAL, new CreditPlusGiftTutorialActivity$.ExternalSyntheticLambda7(gettypedexportedconstants)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsButtonV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, View view) {
        return (Unit) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 26072903, new Object[]{creditPlusGiftTutorialActivity, view}, PushInfo.Companion.onExtraCallback(), -26072901, PushInfo.Companion.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPlusGiftTutorialActivity creditPlusGiftTutorialActivity, TdsListHeaderV3View tdsListHeaderV3View) {
        return (Unit) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -395149962, new Object[]{creditPlusGiftTutorialActivity, tdsListHeaderV3View}, PushInfo.Companion.onExtraCallback(), 395149963, PushInfo.Companion.onExtraCallback());
    }

    private final void IEngagementSignalsCallbackStub() {
        onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -838581687, new Object[]{this}, PushInfo.Companion.onExtraCallback(), 838581687, PushInfo.Companion.onExtraCallback());
    }

    private static final Unit onExtraCallback(View view) {
        return (Unit) onNavigationEvent(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1483489105, new Object[]{view}, PushInfo.Companion.onExtraCallback(), 1483489108, PushInfo.Companion.onExtraCallback());
    }

    @Override // im.toss.features.credit.ui.plus.gift.receive.Hilt_CreditPlusGiftTutorialActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.credit.ui.plus.gift.receive.Hilt_CreditPlusGiftTutorialActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.credit.ui.plus.gift.receive.Hilt_CreditPlusGiftTutorialActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.credit.ui.plus.gift.receive.Hilt_CreditPlusGiftTutorialActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
