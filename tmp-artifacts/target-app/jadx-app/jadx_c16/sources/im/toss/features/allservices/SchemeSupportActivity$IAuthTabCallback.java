package im.toss.features.allservices;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.base.BaseActivity;
import im.toss.core.cache.RxSharedApiCall;
import im.toss.features.allservices.SchemeSupportActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DERSet;
import o.SessionTrackerb;
import o.announceForAccessibility;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.initMiniApp;
import o.logAndOpenStore;
import o.readIntokhttp;
import o.setApTextSize;
import o.setCurrentIndex;
import o.setProxySelectorokhttp;
import o.varyMatches;
import o.writeRaw;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SchemeSupportActivity$IAuthTabCallback implements SchemeSupportActivity.onExtraCallback {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ SchemeSupportActivity onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = i6 | i7 | i8;
        int i10 = ~(i5 | i7);
        int i11 = (~(i7 | i8)) | (~i6);
        int i12 = i6 + i4 + i + ((-1537480081) * i3) + ((-1176924877) * i2);
        int i13 = i12 * i12;
        int i14 = (((-324914750) * i6) - 1179058176) + ((-1443770816) * i4) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i) + (1226178560 * i3) + ((-1044512768) * i2) + (1201733632 * i13);
        int i15 = (i6 * 1018573086) + 1206756779 + (i4 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i * 1018572655) + (i3 * (-758184159)) + (i2 * (-595421667)) + (i13 * (-1647378432));
        int i16 = i14 + (i15 * i15 * 1518272512);
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
        }
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback = (SchemeSupportActivity$IAuthTabCallback) objArr[1];
        View view = (View) objArr[2];
        int i17 = 2 % 2;
        int i18 = onExtraCallback + 39;
        onExtraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        IAuthTabCallback(new Object[]{gettypedexportedconstants, schemeSupportActivity$IAuthTabCallback, view}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1764738688, setCurrentIndex.onNavigationEvent(), -1764738688);
        int i20 = onExtraCallback + 51;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = onExtraCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(SchemeSupportActivity schemeSupportActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(schemeSupportActivity, dialogInterface);
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(schemeSupportActivity$IAuthTabCallback, th);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = onExtraCallback + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(gettypedexportedconstants, schemeSupportActivity$IAuthTabCallback, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(SchemeSupportActivity schemeSupportActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(schemeSupportActivity, deserializeurinullablecollection);
        }
        onExtraCallback(schemeSupportActivity, deserializeurinullablecollection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(SchemeSupportActivity schemeSupportActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(schemeSupportActivity);
        int i4 = onExtraCallbackWithResult + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, announceForAccessibility announceforaccessibility) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(new Object[]{schemeSupportActivity$IAuthTabCallback, announceforaccessibility}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -2099404549, iOnNavigationEvent, 2099404550);
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class onExtraCallback implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 77;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            int i4 = onWarmupCompleted + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    SchemeSupportActivity$IAuthTabCallback(SchemeSupportActivity schemeSupportActivity) {
        this.onWarmupCompleted = schemeSupportActivity;
    }

    public void onExtraCallback() {
        String strITrustedWebActivityCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (SchemeSupportActivity.onWarmupCompleted(this.onWarmupCompleted) != null) {
            strITrustedWebActivityCallback = DERSet.onExtraCallback.ITrustedWebActivityCallback() + "?botId=" + SchemeSupportActivity.onWarmupCompleted(this.onWarmupCompleted);
            int i4 = onExtraCallbackWithResult + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            strITrustedWebActivityCallback = DERSet.onExtraCallback.ITrustedWebActivityCallback();
        }
        SessionTrackerb.IAuthTabCallback(this.onWarmupCompleted.onNavigationEvent(), this.onWarmupCompleted, strITrustedWebActivityCallback, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        this.onWarmupCompleted.finish();
        int i6 = onExtraCallback + 45;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i4 = IAuthTabCallback + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = IAuthTabCallback + 5;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void onNavigationEvent(SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, announceForAccessibility announceforaccessibility) {
        int i = 2 % 2;
        if (!announceforaccessibility.IAuthTabCallback()) {
            schemeSupportActivity$IAuthTabCallback.onExtraCallbackWithResult(announceforaccessibility.onExtraCallbackWithResult());
            return;
        }
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            schemeSupportActivity$IAuthTabCallback.IAuthTabCallback();
            int i3 = onExtraCallbackWithResult + 3;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        schemeSupportActivity$IAuthTabCallback.IAuthTabCallback();
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(SchemeSupportActivity schemeSupportActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        BaseActivity.IAuthTabCallback(schemeSupportActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(SchemeSupportActivity schemeSupportActivity) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        schemeSupportActivity.bo_();
        int i4 = onExtraCallbackWithResult + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback = (SchemeSupportActivity$IAuthTabCallback) objArr[0];
        announceForAccessibility announceforaccessibility = (announceForAccessibility) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(announceforaccessibility);
        onNavigationEvent(schemeSupportActivity$IAuthTabCallback, announceforaccessibility);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            schemeSupportActivity$IAuthTabCallback.IAuthTabCallback();
            int i3 = 14 / 0;
            return Unit.INSTANCE;
        }
        schemeSupportActivity$IAuthTabCallback.IAuthTabCallback();
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            SchemeSupportActivity.onExtraCallbackWithResult onextracallbackwithresult = SchemeSupportActivity.Companion;
            Object[] objArr = {onextracallbackwithresult.onExtraCallbackWithResult()};
            announceForAccessibility announceforaccessibility = (announceForAccessibility) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -144346571, 144346571, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent());
            if (announceforaccessibility == null) {
                SchemeSupportActivity schemeSupportActivity = this.onWarmupCompleted;
                Object[] objArr2 = {onextracallbackwithresult.onExtraCallbackWithResult(), null, null, false, 7, null};
                writeRaw writeraw = (writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -939077752, 939077756, objArr2, setApTextSize.onNavigationEvent.4.onNavigationEvent());
                final SchemeSupportActivity schemeSupportActivity2 = this.onWarmupCompleted;
                final Function1 function1 = new Function1() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = IAuthTabCallback + 23;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnNavigationEvent = SchemeSupportActivity$IAuthTabCallback.onNavigationEvent(schemeSupportActivity2, (deserializeUriNullableCollection) obj);
                        int i6 = IAuthTabCallback + 55;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnNavigationEvent;
                    }
                };
                writeRaw writerawOnExtraCallback = writeraw.onExtraCallback(new deserializeFloat() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final void accept(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            SchemeSupportActivity$IAuthTabCallback.onNavigationEvent(function1, obj);
                            throw null;
                        }
                        SchemeSupportActivity$IAuthTabCallback.onNavigationEvent(function1, obj);
                        int i5 = onExtraCallbackWithResult + 1;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                    }
                });
                final SchemeSupportActivity schemeSupportActivity3 = this.onWarmupCompleted;
                writeRaw writerawOnWarmupCompleted = writerawOnExtraCallback.onWarmupCompleted(new deserializeDecimalCollection() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final void run() {
                        int i3 = 2 % 2;
                        int i4 = onWarmupCompleted + 1;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        SchemeSupportActivity$IAuthTabCallback.onNavigationEvent(schemeSupportActivity3);
                        int i6 = onWarmupCompleted + 43;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                    }
                });
                final Function1 function12 = new Function1() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 119;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnWarmupCompleted = SchemeSupportActivity$IAuthTabCallback.onWarmupCompleted(this.f$0, (announceForAccessibility) obj);
                        int i6 = onWarmupCompleted + 119;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final void accept(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = IAuthTabCallback + 69;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        SchemeSupportActivity$IAuthTabCallback.IAuthTabCallback(function12, obj);
                        int i6 = IAuthTabCallback + 13;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 14 / 0;
                        }
                    }
                };
                final Function1 function13 = new Function1() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = onWarmupCompleted + 27;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnExtraCallbackWithResult = SchemeSupportActivity$IAuthTabCallback.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
                        int i6 = onWarmupCompleted + 17;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 91 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda9
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final void accept(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = onWarmupCompleted + 101;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        Function1 function14 = function13;
                        if (i5 == 0) {
                            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                            SchemeSupportActivity$IAuthTabCallback.IAuthTabCallback(new Object[]{function14, obj}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1828022913, iOnNavigationEvent, -1828022910);
                            return;
                        }
                        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                        SchemeSupportActivity$IAuthTabCallback.IAuthTabCallback(new Object[]{function14, obj}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1828022913, iOnNavigationEvent2, -1828022910);
                        int i6 = 29 / 0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                SchemeSupportActivity.IAuthTabCallback(-1862954200, new Object[]{schemeSupportActivity, deserializeurinullablecollectionOnNavigationEvent}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1862954202);
                return;
            }
            int i3 = onExtraCallbackWithResult + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onNavigationEvent(this, announceforaccessibility);
                return;
            } else {
                onNavigationEvent(this, announceforaccessibility);
                throw null;
            }
        }
        Object[] objArr3 = {SchemeSupportActivity.Companion.onExtraCallbackWithResult()};
        throw null;
    }

    private static final void IAuthTabCallback(SchemeSupportActivity schemeSupportActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        schemeSupportActivity.finish();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[0];
        SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback = (SchemeSupportActivity$IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            gettypedexportedconstants.dismiss();
            schemeSupportActivity$IAuthTabCallback.IAuthTabCallback();
            int i3 = 48 / 0;
        } else {
            gettypedexportedconstants.dismiss();
            schemeSupportActivity$IAuthTabCallback.IAuthTabCallback();
        }
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            gettypedexportedconstants.dismiss();
            schemeSupportActivity$IAuthTabCallback.onExtraCallback();
        } else {
            gettypedexportedconstants.dismiss();
            schemeSupportActivity$IAuthTabCallback.onExtraCallback();
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        String string = this.onWarmupCompleted.getString(R.string.help_call_bottom_sheet_message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (str.length() == 0) {
            int i2 = onExtraCallbackWithResult + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = str;
        }
        final SchemeSupportActivity schemeSupportActivity = this.onWarmupCompleted;
        onExtraCallback onextracallback = onExtraCallback.onExtraCallbackWithResult;
        logAndOpenStore.IAuthTabCallback(schemeSupportActivity, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(schemeSupportActivity, 0, false, false, -1L, onextracallback, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 59;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                SchemeSupportActivity$IAuthTabCallback.onExtraCallback(schemeSupportActivity, dialogInterface);
                if (i8 == 0) {
                    int i9 = 93 / 0;
                }
            }
        });
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(schemeSupportActivity.getString(R.string.help_call_bottom_sheet_title));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams2.leftMargin = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        layoutParams2.rightMargin = varyMatches.onNavigationEvent(24, displayMetrics2);
        baseTextView.setLayoutParams(layoutParams);
        baseTextView.setText(string);
        Context context3 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        baseTextView.setTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy());
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        String string2 = schemeSupportActivity.getString(R.string.help_call_bottom_sheet_cta_text);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new View.OnClickListener() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 37;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                getTypedExportedConstants gettypedexportedconstants2 = gettypedexportedconstants;
                if (i8 == 0) {
                    Object[] objArr = {gettypedexportedconstants2, this, view};
                    int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                    SchemeSupportActivity$IAuthTabCallback.IAuthTabCallback(objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -107497375, iOnNavigationEvent, 107497377);
                    return;
                }
                Object[] objArr2 = {gettypedexportedconstants2, this, view};
                int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                SchemeSupportActivity$IAuthTabCallback.IAuthTabCallback(objArr2, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -107497375, iOnNavigationEvent2, 107497377);
                throw null;
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String string3 = schemeSupportActivity.getString(R.string.help_call_bottom_sheet_secondary_text);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, string3, new View.OnClickListener() { // from class: im.toss.features.allservices.SchemeSupportActivity$routerMap$1$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 81;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                SchemeSupportActivity$IAuthTabCallback.onExtraCallbackWithResult(gettypedexportedconstants, this, view);
                int i9 = IAuthTabCallback + 27;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(this.onWarmupCompleted, AccessibilityManager.class);
        if (accessibilityManager != null) {
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
                if (accessibilityManager.isEnabled()) {
                    if (!accessibilityManager.isTouchExplorationEnabled()) {
                        int i6 = onExtraCallback + 91;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        str = "1599-4905";
                    } else {
                        str = "1661-4905";
                    }
                }
            } else if (accessibilityManager.isEnabled()) {
            }
        }
        this.onWarmupCompleted.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
        this.onWarmupCompleted.finish();
    }

    public static /* synthetic */ void onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, View view) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        IAuthTabCallback(new Object[]{gettypedexportedconstants, schemeSupportActivity$IAuthTabCallback, view}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -107497375, iOnNavigationEvent, 107497377);
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        IAuthTabCallback(new Object[]{function1, obj}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1828022913, iOnNavigationEvent, -1828022910);
    }

    private static final Unit IAuthTabCallback(SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, announceForAccessibility announceforaccessibility) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(new Object[]{schemeSupportActivity$IAuthTabCallback, announceforaccessibility}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -2099404549, iOnNavigationEvent, 2099404550);
    }

    private static final void IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, SchemeSupportActivity$IAuthTabCallback schemeSupportActivity$IAuthTabCallback, View view) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        IAuthTabCallback(new Object[]{gettypedexportedconstants, schemeSupportActivity$IAuthTabCallback, view}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1764738688, iOnNavigationEvent, -1764738688);
    }
}
