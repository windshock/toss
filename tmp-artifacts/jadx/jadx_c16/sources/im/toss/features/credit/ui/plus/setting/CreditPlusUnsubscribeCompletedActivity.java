package im.toss.features.credit.ui.plus.setting;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.zzaq;
import com.google.common.collect.Synchronized;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.setting.CreditPlusUnsubscribeCompletedActivity$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.FileTypeIFileTypeMatcher;
import o.ParamImpl;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SetDetectingInterval;
import o.TombstoneProtosMemoryMappingBuilder;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getDispatcherokhttp;
import o.getLongName;
import o.getPrivacyDestinationUri;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.isUcInitOpt;
import o.logVerbose;
import o.response;
import o.setByteOrder;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusUnsubscribeCompletedActivity extends Hilt_CreditPlusUnsubscribeCompletedActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static boolean IAuthTabCallback_Parcel = false;
    private static boolean access000 = false;
    private static int access100 = 1;
    public static final int asBinder;
    private static int getInterfaceDescriptor = 0;
    private static int onTransact = 0;
    private static int writeTypedObject = 1;
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onNavigationEvent(this, 1458211, (Function1) null, new CreditPlusUnsubscribeCompletedActivity$.ExternalSyntheticLambda0(this), 2, (Object) null);
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onVerticalScrollEvent();
        Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
        asBinder = 8;
        int i = getInterfaceDescriptor + 5;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditPlusUnsubscribeCompletedActivity creditPlusUnsubscribeCompletedActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditPlusUnsubscribeCompletedActivity, view);
        int i4 = access100 + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditPlusUnsubscribeCompletedActivity creditPlusUnsubscribeCompletedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(creditPlusUnsubscribeCompletedActivity, onwarmupcompleted);
        }
        onExtraCallbackWithResult(creditPlusUnsubscribeCompletedActivity, onwarmupcompleted);
        throw null;
    }

    public static final class onNavigationEvent implements Function0<FileTypeIFileTypeMatcher> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Activity IAuthTabCallback;

        public onNavigationEvent(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        }

        public final FileTypeIFileTypeMatcher onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                FileTypeIFileTypeMatcher fileTypeIFileTypeMatcherOnExtraCallbackWithResult = FileTypeIFileTypeMatcher.onExtraCallbackWithResult(layoutInflater);
                int i3 = onNavigationEvent + 111;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 94 / 0;
                }
                return fileTypeIFileTypeMatcherOnExtraCallbackWithResult;
            }
            LayoutInflater layoutInflater2 = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
            FileTypeIFileTypeMatcher.onExtraCallbackWithResult(layoutInflater2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            int i3 = 18 / 0;
        } else {
            onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        }
        int i4 = access100 + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 97;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = access100 + 83;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.access200();
            obj.hashCode();
            throw null;
        }
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i3 = IAuthTabCallbackStubProxy + 31;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return jAccess200;
        }
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.removeAttachLongUserData*/.aq_();
            throw null;
        }
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i3 = access100 + 55;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return viewAq_;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = access100 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return mapAr_;
        }
        throw null;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = IAuthTabCallbackStubProxy + 35;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = IAuthTabCallbackStubProxy + 95;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return screenId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super.getScreenParams();
            throw null;
        }
        Map<String, Object> screenParams = super.getScreenParams();
        int i3 = access100 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 24 / 0;
        }
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 43;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = IAuthTabCallbackStubProxy + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault;
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
            int i3 = 47 / 0;
        } else {
            onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        }
        int i4 = IAuthTabCallbackStubProxy + 57;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub;
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
            int i3 = 88 / 0;
        } else {
            hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        }
        int i4 = access100 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return hascrashwhenjavacrashICustomTabsServiceStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = access100 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
    }

    public final SessionTrackerb ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 123;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        int i4 = access100 + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrash;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CreditPlusUnsubscribeCompletedActivity creditPlusUnsubscribeCompletedActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-108, -114, -108, -108, -114, -106, -114, -108}, 62 >> (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-108, -114, -108, -108, -114, -106, -114, -108}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, objArr2);
            obj = objArr2[0];
        }
        onwarmupcompleted.onExtraCallback(((String) obj).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditPlusUnsubscribeCompletedActivity.getIntent()));
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 107;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final FileTypeIFileTypeMatcher onSessionEnded() {
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        FileTypeIFileTypeMatcher fileTypeIFileTypeMatcher = (FileTypeIFileTypeMatcher) this.asInterface.getValue();
        int i4 = access100 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return fileTypeIFileTypeMatcher;
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeCompletedActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(onSessionEnded().onExtraCallbackWithResult());
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onSessionEnded().onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutOnExtraCallbackWithResult, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(constraintLayoutOnExtraCallbackWithResult, onSessionEnded().onExtraCallbackWithResult, (View) null, (View) null, false, 14, (Object) null);
        IEngagementSignalsCallbackStub();
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStub() throws Throwable {
        int i = 2 % 2;
        TdsTopV2View tdsTopV2View = onSessionEnded().IAuthTabCallbackDefault;
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i2 = IAuthTabCallbackStubProxy + 87;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-112, -117, -124, -110, -118, -126, -117, -125, -124, -113, -111, -119, -114, -127, -119, -122, -112, -117, -116, -116, -117, -119, -113, -124, -114, -120, -126, -126, -117, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, Process.getGidForName("") + 128, objArr);
            getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr[0]).intern());
            getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent());
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent)).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            int i4 = IAuthTabCallbackStubProxy + 45;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        String string = getString(R.string.credit_ui_plus_unsubscribe_complete_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        onSessionEnded().onWarmupCompleted.setRightText1(getLongName.onNavigationEvent(getIntent().getLongExtra("EXTRA_REFUNDED_AMOUNT", 0L), (ParamImpl) null, 1, (Object) null));
        onSessionEnded().onNavigationEvent.setRightText1(getString(R.string.credit_ui_plus_unsubscribe_refund_period));
        TdsListRowV1View tdsListRowV1View = onSessionEnded().IAuthTabCallback;
        String stringExtra = getIntent().getStringExtra("EXTRA_PAYMENT_METHOD_TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        tdsListRowV1View.setRightText1(stringExtra);
        TdsListRowV1View tdsListRowV1View2 = onSessionEnded().IAuthTabCallback;
        String stringExtra2 = getIntent().getStringExtra("EXTRA_PAYMENT_METHOD_DESC");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        tdsListRowV1View2.setRightText2(stringExtra2);
        Object[] objArr2 = {onSessionEnded().IAuthTabCallback};
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(objArr2, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (baseTextView != null) {
            baseTextView.onNavigationEvent(response.Bold);
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = onSessionEnded().onExtraCallback;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string2 = getString(R.string.credit_confirm_checked);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new CreditPlusUnsubscribeCompletedActivity$.ExternalSyntheticLambda1(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(CreditPlusUnsubscribeCompletedActivity creditPlusUnsubscribeCompletedActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb sessionTrackerbICustomTabsService_Parcel = creditPlusUnsubscribeCompletedActivity.ICustomTabsService_Parcel();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-117, -108, -126, -112, -120, -122, -124, -109, -115, -125, -122, -126, -120, -107, -114, -108, -119, -122, -122, -123, -124, -124, -117, -126, -108, -114, -125, -109, -124}, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbICustomTabsService_Parcel, creditPlusUnsubscribeCompletedActivity, isUcInitOpt.onWarmupCompleted(((String) objArr[0]).intern(), "credit_plus_refund"), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        creditPlusUnsubscribeCompletedActivity.setResult(-1);
        creditPlusUnsubscribeCompletedActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 35;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = IAuthTabCallbackStub;
        long j = 0;
        if (cArr4 != null) {
            int i3 = $11 + 35;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j) + 1), Color.argb(0, 0, 0, 0) + 77, (ViewConfiguration.getJumpTapTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 74 - ExpandableListView.getPackedPositionChild(0L), 16037 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (!(!IAuthTabCallback_Parcel)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $11 + 67;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] >> iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.getCapsMode("", 0, 0) + 63, TextUtils.lastIndexOf("", '0', 0, 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 63 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12214 - (ViewConfiguration.getWindowTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!access000) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr6);
            int i6 = $11 + 125;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                int i7 = 64 / 0;
                objArr[0] = str;
                return;
            }
        }
        int i8 = $10 + 95;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 63 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12214 - (ViewConfiguration.getScrollBarSize() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeCompletedActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeCompletedActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeCompletedActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 15;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.credit.ui.plus.setting.Hilt_CreditPlusUnsubscribeCompletedActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void onVerticalScrollEvent() {
        IAuthTabCallbackStub = new char[]{32756, 32736, 32748, 32737, 32730, 32685, 32755, 32747, 32753, 32686, 32749, 32751, 32744, 32759, 32687, 32750, 32745, 32746, 32743, 32738, 32752, 32758};
        onTransact = -1184333924;
        access000 = true;
        IAuthTabCallback_Parcel = true;
    }
}
