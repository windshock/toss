package im.toss.feature.credit.ui.kcbsurvey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallbackStub;
import o.IEngagementSignalsCallback_Parcel;
import o.RotationProvider1;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;
import o.getDevicePerformance;
import o.getUserData;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.rvInitOpt;
import o.setRandomHost;
import o.setRubIn;
import o.stackUploadThreshold;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.service.LabFragment;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyLabActivity extends Hilt_KcbSurveyLabActivity implements SetDetectingInterval {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static long IAuthTabCallbackStubProxy;
    private static char[] IAuthTabCallback_Parcel;
    private static int writeTypedObject;

    @Inject
    public zzad environments;

    @Inject
    public getDevicePerformance kcbSurveyApi;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 78;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access100 = 1;
    private final Lazy access000 = isStopUpload.onNavigationEvent(this, 1482467, (Function1) null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyLabActivity$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = KcbSurveyLabActivity.onWarmupCompleted(this.f$0, (initMiniApp.onWarmupCompleted) obj);
            int i4 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            throw null;
        }
    }, 2, (Object) null);
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyLabActivity$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = Integer.valueOf(KcbSurveyLabActivity.onWarmupCompleted(this.f$0));
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return numValueOf;
            }
            throw null;
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyLabActivity$$ExternalSyntheticLambda2
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.f$0};
            int iOnWarmupCompleted = im.toss.features.payment.ui.autopay.R.onWarmupCompleted();
            String str = (String) KcbSurveyLabActivity.onExtraCallback(im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), objArr, -570954761, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 570954761, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), iOnWarmupCompleted);
            int i4 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent((IEngagementSignalsCallbackStub) this, (Function1<? super IEngagementSignalsCallbackDefault, Unit>) new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyLabActivity$$ExternalSyntheticLambda3
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KcbSurveyLabActivity kcbSurveyLabActivity = this.f$0;
            IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) obj;
            if (i3 != 0) {
                return KcbSurveyLabActivity.IAuthTabCallback(kcbSurveyLabActivity, iEngagementSignalsCallbackDefault);
            }
            KcbSurveyLabActivity.IAuthTabCallback(kcbSurveyLabActivity, iEngagementSignalsCallbackDefault);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = i * 4;
        byte[] bArr = $$a;
        int i4 = (b * 3) + 97;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i8 = i5 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i8];
            i5 = i4;
            i4 = b2;
            i7 = i2 + 1;
            i6 = i8;
            i4 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i82 = i5 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i822 = i5 + 1;
            if (i2 == i3) {
            }
        }
    }

    static {
        writeTypedObject = 0;
        onVerticalScrollEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        IAuthTabCallbackStub = 8;
        int i = extraCallback + 23;
        writeTypedObject = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        KcbSurveyLabActivity kcbSurveyLabActivity = (KcbSurveyLabActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(kcbSurveyLabActivity);
            throw null;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(kcbSurveyLabActivity);
        int i3 = access100 + 87;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KcbSurveyLabActivity kcbSurveyLabActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(kcbSurveyLabActivity, iEngagementSignalsCallbackDefault);
        int i4 = access100 + 119;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i2) | i7 | i6);
        int i9 = ~i6;
        int i10 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i11 = (~(i9 | i4)) | i2;
        int i12 = i4 + i2 + i + ((-946781377) * i5) + ((-59450693) * i3);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i4) - 346488832) + (357422218 * i2) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i) + ((-1205993472) * i5) + ((-1651113984) * i3) + ((-884408320) * i13);
        int i15 = ((i4 * 358501064) - 1042343473) + (i2 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i * 358500791) + (i5 * (-249165559)) + (i3 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        return i16 != 1 ? i16 != 2 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ int onWarmupCompleted(KcbSurveyLabActivity kcbSurveyLabActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(kcbSurveyLabActivity);
            throw null;
        }
        int iOnNavigationEvent = onNavigationEvent(kcbSurveyLabActivity);
        int i3 = access100 + 101;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return iOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(KcbSurveyLabActivity kcbSurveyLabActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 123;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(kcbSurveyLabActivity, onwarmupcompleted);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(kcbSurveyLabActivity, onwarmupcompleted);
        int i3 = access100 + 31;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static final class onExtraCallbackWithResult implements Function0<stackUploadThreshold> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Activity IAuthTabCallback;

        public onExtraCallbackWithResult(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5IAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                searchBarKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback();
                int i3 = 84 / 0;
            } else {
                searchBarKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback();
            }
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return searchBarKtExternalSyntheticLambda5IAuthTabCallback;
            }
            throw null;
        }

        public final stackUploadThreshold IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            stackUploadThreshold stackuploadthresholdIAuthTabCallback = stackUploadThreshold.IAuthTabCallback(layoutInflater);
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return stackuploadthresholdIAuthTabCallback;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(KcbSurveyLabActivity kcbSurveyLabActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyLabActivity.onExtraCallback(str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 97;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = access100 + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        }
        super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 11;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = getInterfaceDescriptor + 75;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.ar_();
            throw null;
        }
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i3 = access100 + 11;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access100 + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = access100 + 77;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 103;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.getScreenId();
            throw null;
        }
        long screenId = super.getScreenId();
        int i3 = getInterfaceDescriptor + 27;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return screenId;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = access100 + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = getInterfaceDescriptor + 25;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = access100 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = getInterfaceDescriptor + 19;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = getInterfaceDescriptor + 35;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsService_Parcel();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsService_Parcel = ICustomTabsService_Parcel();
        int i3 = getInterfaceDescriptor + 27;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
        return hascrashwhenjavacrashICustomTabsService_Parcel;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 95;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.openJavaCrashMonitor*/.validateRelationship();
        }
        super/*o.openJavaCrashMonitor*/.validateRelationship();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getDevicePerformance ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getDevicePerformance getdeviceperformance = this.kcbSurveyApi;
        if (getdeviceperformance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getdeviceperformance;
    }

    public hasCrashWhenJavaCrash ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.access000.getValue();
        if (i3 == 0) {
            return hascrashwhenjavacrash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(KcbSurveyLabActivity kcbSurveyLabActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 3, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iOnWarmupCompleted = im.toss.features.payment.ui.autopay.R.onWarmupCompleted();
        onwarmupcompleted.onExtraCallback(strIntern, (String) onExtraCallback(im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), new Object[]{kcbSurveyLabActivity}, 1900188883, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -1900188881, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), iOnWarmupCompleted));
        onwarmupcompleted.onExtraCallbackWithResult("round", Integer.valueOf(kcbSurveyLabActivity.IPostMessageService()));
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 31;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        stackUploadThreshold stackuploadthreshold;
        KcbSurveyLabActivity kcbSurveyLabActivity = (KcbSurveyLabActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object value = kcbSurveyLabActivity.asBinder.getValue();
        if (i3 == 0) {
            stackuploadthreshold = (stackUploadThreshold) value;
            int i4 = 75 / 0;
        } else {
            stackuploadthreshold = (stackUploadThreshold) value;
        }
        int i5 = access100 + 109;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return stackuploadthreshold;
    }

    private final int IPostMessageService() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.IAuthTabCallbackDefault.getValue()).intValue();
        int i4 = getInterfaceDescriptor + 69;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int onNavigationEvent(KcbSurveyLabActivity kcbSurveyLabActivity) {
        int i = 2 % 2;
        int i2 = access100 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = kcbSurveyLabActivity.getIntent().getIntExtra("EXTRA_KCB_SURVEY_ROUND", 0);
        int i4 = access100 + 59;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return intExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onExtraCallbackWithResult(KcbSurveyLabActivity kcbSurveyLabActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        h5ScreenShotObserverOnChangeOpt.onExtraCallback onextracallback = h5ScreenShotObserverOnChangeOpt.Companion;
        Intent intent = kcbSurveyLabActivity.getIntent();
        if (i3 != 0) {
            return onextracallback.onNavigationEvent(intent);
        }
        onextracallback.onNavigationEvent(intent);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        KcbSurveyLabActivity kcbSurveyLabActivity = (KcbSurveyLabActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) kcbSurveyLabActivity.asInterface.getValue();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(KcbSurveyLabActivity kcbSurveyLabActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = access100 + 125;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                kcbSurveyLabActivity.setResult(-1);
                kcbSurveyLabActivity.finish();
                int i5 = 15 / 0;
            } else {
                kcbSurveyLabActivity.setResult(-1);
                kcbSurveyLabActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.base.BaseActivity
    public boolean bg_() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallbackStub();
        boolean z = i3 != 0;
        int i4 = getInterfaceDescriptor + 13;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return z;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyLabActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int iOnWarmupCompleted = im.toss.features.payment.ui.autopay.R.onWarmupCompleted();
        setContentView((View) ((stackUploadThreshold) onExtraCallback(im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), new Object[]{this}, 1203703094, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -1203703093, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), iOnWarmupCompleted)).onNavigationEvent());
        IEngagementSignalsCallbackStubProxy();
        int i4 = access100 + 33;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    private final void IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 39;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback_Parcel[i - i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 59697), 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.alpha(0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallbackStubProxy), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ImageFormat.getBitsPerPixel(0)), KeyEvent.keyCodeFromString("") + 31, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49123);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 44;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1494;
                        byte b = $$a[1];
                        byte b2 = (byte) (b - 1);
                        byte b3 = (byte) (-b);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, offsetAfter, capsMode, -1657859959, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(IAuthTabCallback_Parcel[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 17, 10974 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackStubProxy), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46134), 30 - ExpandableListView.getPackedPositionChild(0L), 20220 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 49123);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 44;
                    int size = 1494 - View.MeasureSpec.getSize(0);
                    byte b4 = $$a[1];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = (byte) (-b4);
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, deadChar, size, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49122);
                int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43;
                int deadChar2 = 1494 - KeyEvent.getDeadChar(0, 0);
                byte b7 = $$a[1];
                byte b8 = (byte) (b7 - 1);
                byte b9 = (byte) (-b7);
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, i9, deadChar2, -1657859959, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i10 = $10 + 89;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i11 = 40 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStub() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 105;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact.onNavigationEvent(KcbSurveyConfirmExitActivity.Companion.onExtraCallbackWithResult(this, "kcb_survey_web"));
            int i3 = 3 / 0;
        } else {
            this.onTransact.onNavigationEvent(KcbSurveyConfirmExitActivity.Companion.onExtraCallbackWithResult(this, "kcb_survey_web"));
        }
        int i4 = getInterfaceDescriptor + 101;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, i, (access13800) null), 3, (Object) null);
        int i3 = access100 + 45;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onExtraCallback {
        private static short[] onWarmupCompleted;
        private static final byte[] $$a = {11, -55, -20, -91};
        private static final int $$b = 243;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int onTransact = 1;
        private static int onExtraCallbackWithResult = -837582750;
        private static int onNavigationEvent = -1538795519;
        private static int onExtraCallback = -1149033662;
        private static byte[] IAuthTabCallback = {-9, 44, -46, 33, 44, -34, 32, -46};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, int i) {
            int i2;
            int i3 = (b2 * 4) + 4;
            int i4 = b * 3;
            byte[] bArr = $$a;
            int i5 = (i * 2) + 115;
            byte[] bArr2 = new byte[1 - i4];
            int i6 = 0 - i4;
            if (bArr == null) {
                int i7 = i6;
                int i8 = 0;
                i5 = (-i5) + i7;
                i3++;
                i2 = i8;
                bArr2[i2] = (byte) i5;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i9 = i2 + 1;
                i7 = i5;
                i5 = bArr[i3];
                i8 = i9;
                i5 = (-i5) + i7;
                i3++;
                i2 = i8;
                bArr2[i2] = (byte) i5;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                if (i2 == i6) {
                }
            }
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, int i) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyLabActivity.class);
            Object[] objArr = new Object[1];
            a((short) (ViewConfiguration.getTapTimeout() >> 16), (byte) (41 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-1783912553) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-533002968) - (ViewConfiguration.getTapTimeout() >> 16), (-10) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str).putExtra("EXTRA_KCB_SURVEY_ROUND", i);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i3 = onTransact + 13;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return intentPutExtra;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 43424), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 22439 - View.MeasureSpec.getMode(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i5 = iIntValue == -1 ? 1 : 0;
                if (i5 != 0) {
                    int i6 = $10 + 31;
                    $11 = i6 % 128;
                    if (i6 % 2 != 0) {
                        byte[] bArr = IAuthTabCallback;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i7 = 0; i7 < length; i7++) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getEdgeSlop() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55, 2168 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = IAuthTabCallback;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 43424), 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        } else {
                            iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        }
                    } else {
                        throw null;
                    }
                }
                if (iIntValue > 0) {
                    int i8 = $11 + 25;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i5;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 85 - TextUtils.indexOf((CharSequence) "", '0'), ImageFormat.getBitsPerPixel(0) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = IAuthTabCallback;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i11 = $11 + 47;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        if (z) {
                            byte[] bArr6 = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private final void onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = supportFragmentManager.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult, "");
        int id = ((stackUploadThreshold) onExtraCallback(im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), new Object[]{this}, 1203703094, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -1203703093, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted())).onWarmupCompleted.getId();
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 1, TextUtils.getCapsMode("", 0, 0) + 3, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 35267), objArr);
        Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)});
        LabFragment labFragmentInstantiate = supportFragmentManager2.onMessageChannelReady().instantiate(ClassLoader.getSystemClassLoader(), LabFragment.class.getName());
        if (labFragmentInstantiate == null) {
            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.service.LabFragment");
        }
        int i2 = access100;
        int i3 = i2 + 61;
        getInterfaceDescriptor = i3 % 128;
        LabFragment labFragment = labFragmentInstantiate;
        if (i3 % 2 == 0) {
            if (bundleOnNavigationEvent != null) {
                int i4 = i2 + 13;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                labFragment.setArguments(bundleOnNavigationEvent);
            }
            labFragment.IAuthTabCallback(true);
            Unit unit = Unit.INSTANCE;
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback(id, labFragment);
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback();
            rvInitOpt.onExtraCallbackWithResult.onWarmupCompleted(IPostMessageService());
            onExtraCallback(IPostMessageService());
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(KcbSurveyLabActivity kcbSurveyLabActivity) {
        int iOnWarmupCompleted = im.toss.features.payment.ui.autopay.R.onWarmupCompleted();
        return (String) onExtraCallback(im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), new Object[]{kcbSurveyLabActivity}, -570954761, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 570954761, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private final stackUploadThreshold onSessionEnded() {
        int iOnWarmupCompleted = im.toss.features.payment.ui.autopay.R.onWarmupCompleted();
        return (stackUploadThreshold) onExtraCallback(im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), new Object[]{this}, 1203703094, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -1203703093, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private final String IEngagementSignalsCallbackDefault() {
        int iOnWarmupCompleted = im.toss.features.payment.ui.autopay.R.onWarmupCompleted();
        return (String) onExtraCallback(im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), new Object[]{this}, 1900188883, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -1900188881, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyLabActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyLabActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 43;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyLabActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 13;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyLabActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onVerticalScrollEvent() {
        IAuthTabCallback_Parcel = new char[]{25699, 7479, 38620, 60838, 38114, 7956, 34376, 2282, 45881, 14915, 48355};
        IAuthTabCallbackStubProxy = 3419287564331553927L;
    }
}
