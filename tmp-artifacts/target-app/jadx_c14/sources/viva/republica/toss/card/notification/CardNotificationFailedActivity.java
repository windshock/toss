package viva.republica.toss.card.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BuildConfigApi;
import o.CERT_GetCRLDP;
import o.ConvertByteArrayToFloatArray;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getVersionOverride;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.card.notification.CardNotificationFailedActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardNotificationFailedActivity extends Hilt_CardNotificationFailedActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int ICustomTabsCallback = 1;
    private static long access000;
    private static int access100;
    private static int getInterfaceDescriptor;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda3
        public final Object invoke() {
            return CardNotificationFailedActivity.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda4
        public final Object invoke() {
            return CardNotificationFailedActivity.onExtraCallbackWithResult(this.f$0);
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (Integer) CardNotificationFailedActivity.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, 295407957, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -295407957);
        }
    });
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            return CardNotificationFailedActivity.onExtraCallback(this.f$0);
        }
    });

    static {
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackStub = 8;
        int i = getInterfaceDescriptor + 79;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CERT_GetCRLDP cERT_GetCRLDP, CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cERT_GetCRLDP, cardNotificationFailedActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = access100 + 123;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(cardNotificationFailedActivity, setDetectableSize);
        }
        IAuthTabCallbackDefault(cardNotificationFailedActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(CardNotificationFailedActivity cardNotificationFailedActivity, View view) {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity, view}, -701971328, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, 701971332);
        int i4 = IAuthTabCallbackStubProxy + 75;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardNotificationFailedActivity cardNotificationFailedActivity = (CardNotificationFailedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (Integer) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity}, 426398193, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -426398192);
        }
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(CardNotificationFailedActivity cardNotificationFailedActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        String str = (String) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity}, 927042700, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -927042697);
        int i4 = IAuthTabCallbackStubProxy + 45;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallback(CERT_GetCRLDP cERT_GetCRLDP, CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(cERT_GetCRLDP, cardNotificationFailedActivity, setDetectableSize);
        }
        onWarmupCompleted(cERT_GetCRLDP, cardNotificationFailedActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardNotificationFailedActivity, setDetectableSize);
        int i4 = access100 + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(CardNotificationFailedActivity cardNotificationFailedActivity, CERT_GetCRLDP cERT_GetCRLDP, View view) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(cardNotificationFailedActivity, cERT_GetCRLDP, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i6 | i2 | i5));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i5 | i2)) | (~(i13 | i8)) | (~(i6 | i5));
        int i16 = i6 + i2 + i + ((-298151579) * i4) + ((-427515960) * i3);
        int i17 = i16 * i16;
        int i18 = (i6 * (-431502880)) + 875560960 + ((-431502880) * i2) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i) + ((-16252928) * i4) + (423624704 * i3) + (1109590016 * i17);
        int i19 = ((i6 * (-2003555040)) - 1632655964) + (i2 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i * (-2003554617)) + (i4 * 1812671363) + (i3 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? i20 != 5 ? onExtraCallback(objArr) : IAuthTabCallbackDefault(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CardNotificationFailedActivity cardNotificationFailedActivity = (CardNotificationFailedActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cardNotificationFailedActivity, view);
        int i4 = access100 + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardNotificationFailedActivity, setDetectableSize);
        int i4 = access100 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ getVersionOverride onExtraCallbackWithResult(CardNotificationFailedActivity cardNotificationFailedActivity) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getVersionOverride getversionoverrideAsBinder = asBinder(cardNotificationFailedActivity);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return getversionoverrideAsBinder;
    }

    public static /* synthetic */ BuildConfigApi onNavigationEvent(CardNotificationFailedActivity cardNotificationFailedActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        BuildConfigApi buildConfigApiAsInterface = asInterface(cardNotificationFailedActivity);
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return buildConfigApiAsInterface;
    }

    public static /* synthetic */ void onWarmupCompleted(CardNotificationFailedActivity cardNotificationFailedActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(cardNotificationFailedActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 67;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return 1010403L;
    }

    public static final class IAuthTabCallback implements Function0<CERT_GetCRLDP> {
        final /* synthetic */ Activity IAuthTabCallback;

        public IAuthTabCallback(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_GetCRLDP invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetCRLDP.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = IAuthTabCallbackStubProxy + 123;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return null;
    }

    private final BuildConfigApi ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BuildConfigApi buildConfigApi = (BuildConfigApi) this.asInterface.getValue();
        if (i3 != 0) {
            return buildConfigApi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final BuildConfigApi asInterface(CardNotificationFailedActivity cardNotificationFailedActivity) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BuildConfigApi buildConfigApi = (BuildConfigApi) cardNotificationFailedActivity.getIntent().getParcelableExtra("response");
        int i4 = access100 + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return buildConfigApi;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CardNotificationFailedActivity cardNotificationFailedActivity = (CardNotificationFailedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getVersionOverride getversionoverride = (getVersionOverride) cardNotificationFailedActivity.IAuthTabCallback_Parcel.getValue();
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 99;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return getversionoverride;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getVersionOverride asBinder(CardNotificationFailedActivity cardNotificationFailedActivity) {
        Object next;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        BuildConfigApi buildConfigApiICustomTabsServiceStub = cardNotificationFailedActivity.ICustomTabsServiceStub();
        if (buildConfigApiICustomTabsServiceStub != null) {
            int i4 = access100 + 111;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            List<getVersionOverride> listOnNavigationEvent = buildConfigApiICustomTabsServiceStub.onNavigationEvent();
            if (listOnNavigationEvent != null) {
                Iterator<T> it = listOnNavigationEvent.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int i6 = access100 + 49;
                        IAuthTabCallbackStubProxy = i6 % 128;
                        int i7 = i6 % 2;
                        next = null;
                        break;
                    }
                    next = it.next();
                    int iIAuthTabCallback = ((getVersionOverride) next).IAuthTabCallback();
                    Integer numValidateRelationship = cardNotificationFailedActivity.validateRelationship();
                    if (numValidateRelationship != null && iIAuthTabCallback == numValidateRelationship.intValue()) {
                        break;
                    }
                }
                getVersionOverride getversionoverride = (getVersionOverride) next;
                if (getversionoverride != null) {
                    int i8 = access100 + 31;
                    IAuthTabCallbackStubProxy = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 48 / 0;
                    }
                    return getversionoverride;
                }
            }
        }
        BuildConfigApi buildConfigApiICustomTabsServiceStub2 = cardNotificationFailedActivity.ICustomTabsServiceStub();
        if (buildConfigApiICustomTabsServiceStub2 != null) {
            int i10 = access100 + 65;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            List<getVersionOverride> listOnNavigationEvent2 = buildConfigApiICustomTabsServiceStub2.onNavigationEvent();
            if (listOnNavigationEvent2 != null) {
                return (getVersionOverride) CollectionsKt.firstOrNull(listOnNavigationEvent2);
            }
        }
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        Integer numValueOf = Integer.valueOf(((CardNotificationFailedActivity) objArr[0]).getIntent().getIntExtra("cardCode", 0));
        if (numValueOf.intValue() <= 0) {
            return null;
        }
        int i2 = access100 + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return numValueOf;
    }

    private final Integer validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return (Integer) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final CERT_GetCRLDP setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asBinder.getValue();
        if (i3 != 0) {
            return (CERT_GetCRLDP) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getVersionOverride getversionoverride;
        CardNotificationFailedActivity cardNotificationFailedActivity = (CardNotificationFailedActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {cardNotificationFailedActivity};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        if (i3 != 0) {
            getversionoverride = (getVersionOverride) onExtraCallbackWithResult(iOnWarmupCompleted2, objArr2, -70058372, iOnWarmupCompleted4, iOnWarmupCompleted3, iOnWarmupCompleted, 70058377);
            int i4 = 81 / 0;
            if (getversionoverride == null) {
                return "";
            }
        } else {
            getversionoverride = (getVersionOverride) onExtraCallbackWithResult(iOnWarmupCompleted2, objArr2, -70058372, iOnWarmupCompleted4, iOnWarmupCompleted3, iOnWarmupCompleted, 70058377);
            if (getversionoverride == null) {
                return "";
            }
        }
        String strOnNavigationEvent = getversionoverride.onNavigationEvent();
        if (strOnNavigationEvent == null) {
            return "";
        }
        int i5 = IAuthTabCallbackStubProxy + 73;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return strOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getScreenParams() throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 8
            char[] r2 = new char[r1]
            r2 = {x00d2: FILL_ARRAY_DATA , data: [-9391, 19471, -2601, 7837, -31115, 12092, 20720, -1618} // fill-array
            int r3 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r3 = r3 >> 24
            r4 = 38729(0x9749, float:5.4271E-41)
            int r4 = r4 - r3
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r2, r4, r5)
            r2 = 0
            r4 = r5[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            android.content.Intent r5 = r13.getIntent()
            char[] r1 = new char[r1]
            r1 = {x00de: FILL_ARRAY_DATA , data: [-9391, 19471, -2601, 7837, -31115, 12092, 20720, -1618} // fill-array
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r7 = 38730(0x974a, float:5.4272E-41)
            int r7 = r7 - r6
            java.lang.Object[] r6 = new java.lang.Object[r3]
            a(r1, r7, r6)
            r1 = r6[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r1 = r5.getStringExtra(r1)
            kotlin.Pair r1 = o.getWrite.IAuthTabCallback(r4, r1)
            java.lang.String r4 = "card_vendor_name"
            java.lang.String r5 = r13.ICustomTabsServiceDefault()
            kotlin.Pair r4 = o.getWrite.IAuthTabCallback(r4, r5)
            o.BuildConfigApi r5 = r13.ICustomTabsServiceStub()
            if (r5 == 0) goto L78
            int r6 = viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallbackStubProxy
            int r6 = r6 + 75
            int r7 = r6 % 128
            viva.republica.toss.card.notification.CardNotificationFailedActivity.access100 = r7
            int r6 = r6 % r0
            boolean r5 = r5.onWarmupCompleted()
            if (r5 != r3) goto L78
            int r5 = viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallbackStubProxy
            int r5 = r5 + 45
            int r6 = r5 % 128
            viva.republica.toss.card.notification.CardNotificationFailedActivity.access100 = r6
            int r5 = r5 % r0
            java.lang.String r5 = "Y"
            goto L7a
        L78:
            java.lang.String r5 = "N"
        L7a:
            java.lang.String r6 = "success"
            kotlin.Pair r5 = o.getWrite.IAuthTabCallback(r6, r5)
            java.lang.Object[] r7 = new java.lang.Object[]{r13}
            int r11 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r6 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r10 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r9 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            r12 = 70058377(0x42d0189, float:2.0336757E-36)
            r8 = -70058372(0xfffffffffbd2fe7c, float:-2.1910878E36)
            java.lang.Object r6 = onExtraCallbackWithResult(r6, r7, r8, r9, r10, r11, r12)
            o.getVersionOverride r6 = (o.getVersionOverride) r6
            if (r6 == 0) goto Lb9
            int r7 = viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallbackStubProxy
            int r7 = r7 + 79
            int r8 = r7 % 128
            viva.republica.toss.card.notification.CardNotificationFailedActivity.access100 = r8
            int r7 = r7 % r0
            java.lang.String r6 = r6.asBinder()
            int r7 = viva.republica.toss.card.notification.CardNotificationFailedActivity.access100
            int r7 = r7 + 105
            int r8 = r7 % 128
            viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallbackStubProxy = r8
            int r7 = r7 % r0
            goto Lba
        Lb9:
            r6 = 0
        Lba:
            java.lang.String r7 = "fail_reason"
            kotlin.Pair r6 = o.getWrite.IAuthTabCallback(r7, r6)
            r7 = 4
            kotlin.Pair[] r7 = new kotlin.Pair[r7]
            r7[r2] = r1
            r7[r3] = r4
            r7[r0] = r5
            r0 = 3
            r7[r0] = r6
            java.util.Map r0 = o.access8100.IAuthTabCallback(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationFailedActivity.getScreenParams():java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationFailedActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            setContentView(setEngagementSignalsCallback().getRoot());
            setResult(-1, getIntent());
            access200();
            int i3 = 17 / 0;
            return;
        }
        super.onCreate(bundle);
        setContentView(setEngagementSignalsCallback().getRoot());
        setResult(-1, getIntent());
        access200();
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = 7789004639664555208L;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 33;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $10 + 79;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.getSize(0)), TextUtils.getOffsetAfter("", 0) + 84, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - TextUtils.indexOf("", "")), KeyEvent.getDeadChar(0, 0) + 19, 8808 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(onExtraCallback onextracallback, Context context, BuildConfigApi buildConfigApi, String str, Integer num, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 51;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i6 = i4 + 109;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 10 / 0;
                }
                str = null;
            }
            if ((i & 8) != 0) {
                int i8 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                num = null;
            }
            return onextracallback.IAuthTabCallback(context, buildConfigApi, str, num);
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull BuildConfigApi buildConfigApi, @Nullable String str, @Nullable Integer num) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(buildConfigApi, "");
            Intent intent = new Intent(context, (Class<?>) CardNotificationFailedActivity.class);
            intent.putExtra("response", buildConfigApi);
            Object[] objArr = new Object[1];
            a(new char[]{32067, 54055, 32049, 29319, 2739, 60550, 3433, 46490, 33313, 60801, 3194, 46237}, Color.red(0), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("cardCode", num);
            int i2 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{56129, 53113, 62217, 59354, 35824, 49062, 41574, 22046, 31282, 28400, 4761, 1347}, 5168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardNotificationFailedActivity.getString(R.string.uikit_confirm));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 71;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    private static final void onExtraCallback(final CardNotificationFailedActivity cardNotificationFailedActivity, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1241827L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CardNotificationFailedActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        cardNotificationFailedActivity.finish();
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60, 6383 - (ViewConfiguration.getTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Gravity.getAbsoluteGravity(0, 0) + 59, TextUtils.lastIndexOf("", '0', 0, 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{56129, 53113, 62217, 59354, 35824, 49062, 41574, 22046, 31282, 28400, 4761, 1347}, (ViewConfiguration.getEdgeSlop() >> 16) + 5167, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardNotificationFailedActivity.getString(viva.republica.toss.R.string.next_time));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 61;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return unit;
    }

    private static final void onExtraCallbackWithResult(CardNotificationFailedActivity cardNotificationFailedActivity, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1241827L, false, (String) null, (Map) null, new CardNotificationFailedActivity$.ExternalSyntheticLambda12(cardNotificationFailedActivity), 14, (Object) null);
        cardNotificationFailedActivity.finish();
        int i2 = IAuthTabCallbackStubProxy + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{56129, 53113, 62217, 59354, 35824, 49062, 41574, 22046, 31282, 28400, 4761, 1347}, 5167 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardNotificationFailedActivity.getString(viva.republica.toss.R.string.card_notification_failed_cta_call));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, java.lang.Object, viva.republica.toss.card.notification.CardNotificationFailedActivity] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String strAccess100;
        final ?? r0 = (CardNotificationFailedActivity) objArr[0];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1241827L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardNotificationFailedActivity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        getVersionOverride getversionoverride = (getVersionOverride) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{r0}, -70058372, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 70058377);
        Object obj = null;
        if (getversionoverride != null) {
            strAccess100 = getversionoverride.access100();
            int i2 = access100 + 83;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        } else {
            strAccess100 = null;
        }
        r0.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + strAccess100)));
        int i4 = IAuthTabCallbackStubProxy + 29;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(CERT_GetCRLDP cERT_GetCRLDP, CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = cERT_GetCRLDP.onNavigationEvent.ICustomTabsCallbackStubProxy();
        CharSequence text = null;
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            int i2 = access100 + 43;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                baseTextViewICustomTabsCallbackStubProxy.getText();
                text.hashCode();
                throw null;
            }
            text = baseTextViewICustomTabsCallbackStubProxy.getText();
        } else {
            int i3 = access100 + 99;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        setDetectableSize.onExtraCallback("banner_title", text);
        setDetectableSize.onExtraCallback("vendor_name", cardNotificationFailedActivity.ICustomTabsServiceDefault());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(viva.republica.toss.card.notification.CardNotificationFailedActivity r13, o.CERT_GetCRLDP r14, android.view.View r15) {
        /*
            r15 = 2
            int r0 = r15 % r15
            r1 = 1241825(0x12f2e1, double:6.13543E-318)
            r3 = 0
            r4 = 0
            r5 = 0
            viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda1 r6 = new viva.republica.toss.card.notification.CardNotificationFailedActivity$$ExternalSyntheticLambda1
            r6.<init>(r14, r13)
            r7 = 14
            r8 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r1, r3, r4, r5, r6, r7, r8)
            o.DERSet r14 = o.DERSet.onExtraCallback
            java.lang.String r14 = r14.writeTypedObject()
            android.net.Uri r14 = android.net.Uri.parse(r14)
            android.net.Uri$Builder r14 = r14.buildUpon()
            java.lang.Object[] r1 = new java.lang.Object[]{r13}
            int r5 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r0 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r4 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r3 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            r12 = 70058377(0x42d0189, float:2.0336757E-36)
            r8 = -70058372(0xfffffffffbd2fe7c, float:-2.1910878E36)
            r2 = r8
            r6 = r12
            java.lang.Object r0 = onExtraCallbackWithResult(r0, r1, r2, r3, r4, r5, r6)
            o.getVersionOverride r0 = (o.getVersionOverride) r0
            r1 = 0
            if (r0 == 0) goto L63
            int r2 = viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallbackStubProxy
            int r2 = r2 + 35
            int r3 = r2 % 128
            viva.republica.toss.card.notification.CardNotificationFailedActivity.access100 = r3
            int r2 = r2 % r15
            if (r2 != 0) goto L5b
            int r0 = r0.IAuthTabCallback()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L64
        L5b:
            int r13 = r0.IAuthTabCallback()
            java.lang.Integer.valueOf(r13)
            throw r1
        L63:
            r0 = r1
        L64:
            java.lang.String r2 = "cardCode"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.net.Uri$Builder r14 = r14.appendQueryParameter(r2, r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r13}
            int r11 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r6 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r10 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            int r9 = im.toss.features.usshome.UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted()
            java.lang.Object r0 = onExtraCallbackWithResult(r6, r7, r8, r9, r10, r11, r12)
            o.getVersionOverride r0 = (o.getVersionOverride) r0
            if (r0 == 0) goto La3
            int r2 = viva.republica.toss.card.notification.CardNotificationFailedActivity.access100
            int r2 = r2 + 25
            int r3 = r2 % 128
            viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallbackStubProxy = r3
            int r2 = r2 % r15
            if (r2 == 0) goto L9c
            java.lang.String r0 = r0.access000()
            if (r0 != 0) goto La5
            goto La3
        L9c:
            r0.access000()
            r1.hashCode()
            throw r1
        La3:
            java.lang.String r0 = ""
        La5:
            java.lang.String r1 = "errorCode"
            android.net.Uri$Builder r14 = r14.appendQueryParameter(r1, r0)
            android.net.Uri r14 = r14.build()
            o.SessionTrackerb r0 = r13.onNavigationEvent()
            java.lang.String r2 = r14.toString()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 60
            r8 = 0
            r1 = r13
            o.SessionTrackerb.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            int r13 = viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallbackStubProxy
            int r13 = r13 + 57
            int r14 = r13 % 128
            viva.republica.toss.card.notification.CardNotificationFailedActivity.access100 = r14
            int r13 = r13 % r15
            if (r13 == 0) goto Ld1
            r13 = 69
            int r13 = r13 / 0
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationFailedActivity.IAuthTabCallback(viva.republica.toss.card.notification.CardNotificationFailedActivity, o.CERT_GetCRLDP, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void access200() {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.notification.CardNotificationFailedActivity.access200():void");
    }

    private static final Unit onWarmupCompleted(CERT_GetCRLDP cERT_GetCRLDP, CardNotificationFailedActivity cardNotificationFailedActivity, SetDetectableSize setDetectableSize) {
        CharSequence text;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        BaseTextView baseTextViewICustomTabsCallbackStubProxy = cERT_GetCRLDP.onNavigationEvent.ICustomTabsCallbackStubProxy();
        if (baseTextViewICustomTabsCallbackStubProxy != null) {
            text = baseTextViewICustomTabsCallbackStubProxy.getText();
            int i2 = access100 + 29;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        } else {
            text = null;
        }
        setDetectableSize.onExtraCallback("banner_title", text);
        setDetectableSize.onExtraCallback("vendor_name", cardNotificationFailedActivity.ICustomTabsServiceDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Integer IAuthTabCallback(CardNotificationFailedActivity cardNotificationFailedActivity) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Integer) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity}, 295407957, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -295407957);
    }

    public static /* synthetic */ void onNavigationEvent(CardNotificationFailedActivity cardNotificationFailedActivity, View view) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity, view}, -563437911, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, 563437913);
    }

    private static final Integer onWarmupCompleted(CardNotificationFailedActivity cardNotificationFailedActivity) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Integer) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity}, 426398193, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -426398192);
    }

    private static final String IAuthTabCallbackStub(CardNotificationFailedActivity cardNotificationFailedActivity) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity}, 927042700, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -927042697);
    }

    private final getVersionOverride updateVisuals() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (getVersionOverride) onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{this}, -70058372, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, 70058377);
    }

    private static final void IAuthTabCallbackStub(CardNotificationFailedActivity cardNotificationFailedActivity, View view) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{cardNotificationFailedActivity, view}, -701971328, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, 701971332);
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationFailedActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationFailedActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationFailedActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
    }

    @Override // viva.republica.toss.card.notification.Hilt_CardNotificationFailedActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void IAuthTabCallback() {
        access000 = -8857573720731132396L;
    }
}
