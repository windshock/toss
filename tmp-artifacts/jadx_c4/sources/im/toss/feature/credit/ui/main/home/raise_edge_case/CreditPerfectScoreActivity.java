package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zzaq;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditPerfectScoreActivity$;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.Authenticator;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IPostMessageServiceStubProxy;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.authenticate;
import o.disableImageViewPreallocationAndroid;
import o.enableCustomFocusSearchOnClippedElementsAndroid;
import o.getAdService;
import o.getDispatcherokhttp;
import o.getHostnameVerifierokhttp;
import o.getPrivacyDestinationUri;
import o.getRouteDatabase;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.matches;
import o.protocols;
import o.proxy;
import o.readIntokhttp;
import o.setByteOrder;
import o.setHeadersokhttp;
import o.setProxySelectorokhttp;
import o.socketFactory;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditPerfectScoreActivity extends Hilt_CreditPerfectScoreActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallbackDefault = 0;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static char asBinder;
    private static char asInterface;
    private static char getInterfaceDescriptor;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new Function0() { // from class: im.toss.feature.credit.ui.main.home.raise_edge_case.CreditPerfectScoreActivity$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                CreditPerfectScoreActivity.onWarmupCompleted(this.f$0);
                throw null;
            }
            String strOnWarmupCompleted = CreditPerfectScoreActivity.onWarmupCompleted(this.f$0);
            int i3 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return strOnWarmupCompleted;
        }
    });

    @Inject
    public SessionTrackerb tossRouter;

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackStub = 8;
        int i = access000 + 115;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        CreditPerfectScoreActivity creditPerfectScoreActivity = (CreditPerfectScoreActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(creditPerfectScoreActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 63;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPerfectScoreActivity creditPerfectScoreActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(-1275074044, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 1275074045, iOnWarmupCompleted, new Object[]{creditPerfectScoreActivity});
        int i4 = IAuthTabCallbackStubProxy + 47;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(creditPerfectScoreActivity, setDetectableSize);
        int i4 = access100 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return unitAsInterface;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditPerfectScoreActivity creditPerfectScoreActivity = (CreditPerfectScoreActivity) objArr[0];
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(-1710741775, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 1710741775, iOnWarmupCompleted, new Object[]{creditPerfectScoreActivity, tdsTopV2View});
        int i4 = IAuthTabCallbackStubProxy + 17;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPerfectScoreActivity creditPerfectScoreActivity) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPerfectScoreActivity);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPerfectScoreActivity creditPerfectScoreActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder(creditPerfectScoreActivity, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(creditPerfectScoreActivity, view);
        int i3 = IAuthTabCallbackStubProxy + 1;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(creditPerfectScoreActivity, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        Object obj;
        int i7 = i | i5;
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = ~i;
        int i12 = i10 | (~(i11 | i6));
        int i13 = ~(i9 | i);
        int i14 = i12 | i13;
        int i15 = (~(i6 | i11 | i5)) | i13;
        int i16 = i + i5 + i4 + (1881146393 * i2) + ((-1035018111) * i3);
        int i17 = i16 * i16;
        int i18 = ((i * (-1924067824)) - 304087040) + ((-1924067824) * i5) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i4) + (1612709888 * i2) + ((-182452224) * i3) + ((-1611137024) * i17);
        int i19 = (i * (-928100048)) + 945860906 + (i5 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + (i4 * (-928100237)) + (i2 * (-1331189957)) + (i3 * 1329932787) + (i17 * 1550319616);
        int i20 = i18 + (i19 * i19 * 1690828800);
        if (i20 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i20 == 2) {
            return onExtraCallback(objArr);
        }
        if (i20 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i20 == 4) {
            CreditPerfectScoreActivity creditPerfectScoreActivity = (CreditPerfectScoreActivity) objArr[0];
            SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
            int i21 = 2 % 2;
            int i22 = IAuthTabCallbackStubProxy + 15;
            access100 = i22 % 128;
            if (i22 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a(new char[]{7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206}, 73 >>> ExpandableListView.getPackedPositionChild(0L), objArr2);
                obj = objArr2[0];
            } else {
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr3 = new Object[1];
                a(new char[]{7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206}, ExpandableListView.getPackedPositionChild(0L) + 9, objArr3);
                obj = objArr3[0];
            }
            setDetectableSize.onExtraCallback(((String) obj).intern(), creditPerfectScoreActivity.setEngagementSignalsCallback());
            return Unit.INSTANCE;
        }
        getHostnameVerifierokhttp gethostnameverifierokhttp = (CreditPerfectScoreActivity) objArr[0];
        TdsTopV2View tdsTopV2View = (TdsTopV2View) objArr[1];
        int i23 = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsTopV2View, "");
        String string = gethostnameverifierokhttp.getString(R.string.credit_ui_main_perfect_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onUnminimized());
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
        getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2View.access100();
        if (getdispatcherokhttpAccess100 != null) {
            int i24 = access100 + 117;
            IAuthTabCallbackStubProxy = i24 % 128;
            int i25 = i24 % 2;
            getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.IAuthTabCallback.Companion.IAuthTabCallback());
            ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent())).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
            Object[] objArr4 = new Object[1];
            a(new char[]{61145, 42471, 16863, 6127, 44118, 61140, 58632, 39359, 3819, 50018, 25870, 29557, 22039, 39427, 61265, 11739, 38040, 20579, 62969, 3245, 20329, 34377, 49697, 48451, 18643, 64974, 41228, 48425, 26792, 25355, 18048, 46333, 55529, 54004, 45812, 2314, 41343, 40327, 58262, 59194, 29244, 45160, 10110, 31892, 41228, 48425, 25353, 59218, 13204, 33071, 44939, 37776, 55835, 3552, 2897, 43694}, 56 - Color.argb(0, 0, 0, 0), objArr4);
            getdispatcherokhttpAccess100.IAuthTabCallback(((String) objArr4[0]).intern());
        }
        Unit unit = Unit.INSTANCE;
        int i26 = IAuthTabCallbackStubProxy + 31;
        access100 = i26 % 128;
        int i27 = i26 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(1575925280, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted4, -1575925276, iOnWarmupCompleted3, new Object[]{creditPerfectScoreActivity, setDetectableSize});
        int i3 = IAuthTabCallbackStubProxy + 39;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CreditPerfectScoreActivity creditPerfectScoreActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(creditPerfectScoreActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 19;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditPerfectScoreActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 53;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ String onWarmupCompleted(CreditPerfectScoreActivity creditPerfectScoreActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = onTransact(creditPerfectScoreActivity);
        int i4 = access100 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return strOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(creditPerfectScoreActivity, setDetectableSize);
        }
        onTransact(creditPerfectScoreActivity, setDetectableSize);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return 1273705L;
        }
        int i3 = 92 / 0;
        return 1273705L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onTransact(CreditPerfectScoreActivity creditPerfectScoreActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditPerfectScoreActivity.getIntent());
        int i4 = access100 + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    private final String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        int i4 = IAuthTabCallbackStubProxy + 63;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 11;
        im.toss.feature.credit.ui.main.home.raise_edge_case.CreditPerfectScoreActivity.IAuthTabCallbackStubProxy = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionTrackerb onNavigationEvent() {
        SessionTrackerb sessionTrackerb;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            sessionTrackerb = this.tossRouter;
            int i4 = 10 / 0;
        } else {
            sessionTrackerb = this.tossRouter;
        }
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206}, View.combineMeasuredStates(0, 0) + 8, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), setEngagementSignalsCallback())});
        int i4 = access100 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    int i3 = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i5 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallbackWithResult + 65;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {120, 65, 99, 57};
        private static final int $$b = 63;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private static char[] IAuthTabCallback = {42562, 4837, 53046, 47173, 29826, 8498, 39541, 22162};
        private static long onExtraCallback = -4260757133525558940L;

        private static String $$c(int i, short s, int i2) {
            int i3 = i2 * 4;
            byte[] bArr = $$a;
            int i4 = (s * 3) + 97;
            int i5 = i + 4;
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                i4 += -i6;
            }
            while (true) {
                i7++;
                i5++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i4 += -bArr[i5];
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.lastIndexOf("", '0')), 17 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) + 31, 20220 - View.resolveSizeAndState(0, 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) (-1);
                                byte b2 = (byte) (b + 1);
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 49123), (ViewConfiguration.getFadingEdgeLength() >> 16) + 44, 1494 - TextUtils.getCapsMode("", 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i5 = $11 + 57;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49123), 44 - TextUtils.getTrimmedLength(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i7 = $11 + 13;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr);
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CreditPerfectScoreActivity.class);
            Object[] objArr = new Object[1];
            a(ImageFormat.getBitsPerPixel(0) + 1, ImageFormat.getBitsPerPixel(0) + 9, (char) (19428 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return intent;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditPerfectScoreActivity.setEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("banner_text1", creditPerfectScoreActivity.getString(R.string.credit_ui_main_loan_banner_title));
        setDetectableSize.onExtraCallback("banner_text2", creditPerfectScoreActivity.getString(R.string.credit_ui_main_loan_banner_subtitle));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(CreditPerfectScoreActivity creditPerfectScoreActivity, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1273711L, false, null, null, new CreditPerfectScoreActivity$.ExternalSyntheticLambda7(creditPerfectScoreActivity), 14, null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = creditPerfectScoreActivity.onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{54176, 53807, 35973, 43095, 41768, 63556, 38040, 20579, 44118, 61140, 58632, 39359, 64294, 35307, 60773, 4768, 40489, 61345, 55529, 54004, 50010, 45218, 28363, 48525, 16989, 55153, 33833, 65253, 7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206, 3042, 21191, 7466, 27794, 60504, 55214, 28604, 22108, 20329, 34377, 46272, 35058, 4204, 40941, 36941, 6400, 35973, 43095, 20128, 44212, 8023, 5388, 28604, 22108, 33555, 57238, 38978, 18452, 9531, 60786, 58299, 64750, 54772, 24402, 22039, 39427, 36941, 6400, 7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206, 3042, 21191, 7466, 27794, 60504, 55214, 28604, 22108, 20329, 34377, 46272, 35058, 4204, 40941, 36941, 6400, 35973, 43095, 20128, 44212, 8023, 5388, 28604, 22108, 33555, 57238, 38978, 18452, 20231, 39769}, Gravity.getAbsoluteGravity(0, 0) + 111, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, creditPerfectScoreActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 5;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = i5;
                int i9 = (c2 + i4) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, scrollDefaultDelay, windowTouchSlop, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (asBinder ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getTrimmedLength("") + 10, 12433 - ExpandableListView.getPackedPositionChild(0L), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i8 + 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 14 - View.combineMeasuredStates(0, 0), AndroidCharacter.getMirror('0') + 19853, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 83;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206}, (Process.myPid() >> 22) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditPerfectScoreActivity.setEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("banner_text1", creditPerfectScoreActivity.getString(R.string.credit_ui_main_card_banner_title));
        setDetectableSize.onExtraCallback("banner_text2", creditPerfectScoreActivity.getString(R.string.credit_ui_main_card_banner_subtitle));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(CreditPerfectScoreActivity creditPerfectScoreActivity, View view) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1273711L, false, null, null, new CreditPerfectScoreActivity$.ExternalSyntheticLambda10(creditPerfectScoreActivity), 14, null);
        SessionTrackerb sessionTrackerbOnNavigationEvent = creditPerfectScoreActivity.onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{58299, 64750, 54772, 24402, 22039, 39427, 10110, 31892, 38040, 20579, 44118, 61140, 58632, 39359, 16912, 25224, 37204, 34879, 4575, 7291, 18048, 46333, 65009, 5044, 28324, 7993, 58262, 59194, 21499, 30637, 65009, 5044, 55131, 58231, 50891, 47132, 32495, 48489, 60846, 25417, 37792, 10921, 13271, 42030, 45258, 17492, 23616, 58268, 34705, 60206, 7466, 27794, 35077, 34765, 16912, 25224, 37204, 34879, 4575, 7291, 23424, 44049, 21499, 30637, 13271, 42030, 32196, 26223, 58435, 31946, 34705, 60206, 2228, 7223, 55876, 34475, 49405, 52773, 58262, 59194, 7466, 27794}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 82, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbOnNavigationEvent, creditPerfectScoreActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asBinder(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditPerfectScoreActivity.setEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("banner_text1", creditPerfectScoreActivity.getString(R.string.credit_ui_main_card_banner_title));
        setDetectableSize.onExtraCallback("banner_text2", creditPerfectScoreActivity.getString(R.string.credit_ui_main_card_banner_subtitle));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1273709L, false, null, null, new CreditPerfectScoreActivity$.ExternalSyntheticLambda11((CreditPerfectScoreActivity) objArr[0]), 14, null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{7466, 27794, 2228, 7223, 31858, 26244, 34705, 60206}, 8 - TextUtils.getOffsetAfter("", 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), creditPerfectScoreActivity.setEngagementSignalsCallback());
        setDetectableSize.onExtraCallback("banner_text1", creditPerfectScoreActivity.getString(R.string.credit_ui_main_loan_banner_title));
        setDetectableSize.onExtraCallback("banner_text2", creditPerfectScoreActivity.getString(R.string.credit_ui_main_loan_banner_subtitle));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 63;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CreditPerfectScoreActivity creditPerfectScoreActivity) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1273709L, false, null, null, new CreditPerfectScoreActivity$.ExternalSyntheticLambda9(creditPerfectScoreActivity), 14, null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit asBinder(CreditPerfectScoreActivity creditPerfectScoreActivity, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1273707L, false, null, null, new CreditPerfectScoreActivity$.ExternalSyntheticLambda8(creditPerfectScoreActivity), 14, null);
        creditPerfectScoreActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditPerfectScoreActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        enableCustomFocusSearchOnClippedElementsAndroid enablecustomfocussearchonclippedelementsandroid = new enableCustomFocusSearchOnClippedElementsAndroid();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
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
            int i2 = IAuthTabCallbackStubProxy + 43;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                supportActionBar.onNavigationEvent(false);
                Unit unit = Unit.INSTANCE;
            } else {
                supportActionBar.onNavigationEvent(true);
                Unit unit2 = Unit.INSTANCE;
            }
        }
        IPostMessageServiceStubProxy supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            int i3 = access100 + 13;
            IAuthTabCallbackStubProxy = i3 % 128;
            supportActionBar2.IAuthTabCallbackStub(i3 % 2 != 0);
            Unit unit3 = Unit.INSTANCE;
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        objectRef3.element = appBarLayout;
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        FrameLayout frameLayout = new FrameLayout(context3);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) FrameLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        Context context4 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context4, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Context context5 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        LinearLayout linearLayout2 = new LinearLayout(context5);
        linearLayout2.setOrientation(1);
        getRouteDatabase.IAuthTabCallback(linearLayout2, new CreditPerfectScoreActivity$.ExternalSyntheticLambda1(this));
        Context context6 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context6, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        TdsListRowV1View.asInterface asinterface = TdsListRowV1View.asInterface.IMAGE;
        tdsListRowV1View.setLeftType(asinterface);
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2));
        Object[] objArr = new Object[1];
        a(new char[]{61145, 42471, 16863, 6127, 44118, 61140, 58632, 39359, 3819, 50018, 25870, 29557, 22039, 39427, 61265, 11739, 38040, 20579, 62969, 3245, 20329, 34377, 60846, 25417, 58262, 59194, 43052, 39057, 54976, 42891, 46256, 58912, 26022, 33681, 1674, 1856, 22039, 39427, 2897, 43694, 35544, 26084, 34705, 60206, 56848, 35667, 37792, 10921, 18048, 46333, 59746, 60561, 64594, 24325, 55131, 58231, 11256, 42438, 54650, 63141, 27361, 12318, 32244, 26654, 46256, 58912}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 45, objArr);
        tdsListRowV1View.setLeftImage(((String) objArr[0]).intern());
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult = TdsListRowV1View.onExtraCallbackWithResult.ROW2A;
        tdsListRowV1View.setCenterType(onextracallbackwithresult);
        tdsListRowV1View.setCenterText1(getString(R.string.credit_ui_main_loan_banner_title));
        Context context7 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Configuration configuration = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onExtraCallback(configuration)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setCenterText2(getString(R.string.credit_ui_main_loan_banner_subtitle));
        Context context8 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        Configuration configuration2 = context8.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View.setCenterText2Color(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.ROW1A;
        tdsListRowV1View.setRightType(asbinder);
        tdsListRowV1View.setRightArrow(true);
        tdsListRowV1View.setOnClickListener(new CreditPerfectScoreActivity$.ExternalSyntheticLambda2(this));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsListRowV1View);
        objectRef.element = tdsListRowV1View;
        Context context9 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context9, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View2.setLeftType(asinterface);
        DisplayMetrics displayMetrics3 = tdsListRowV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics3);
        DisplayMetrics displayMetrics4 = tdsListRowV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        tdsListRowV1View2.setLeftImageSize(iOnNavigationEvent2, varyMatches.onNavigationEvent(24, displayMetrics4));
        Object[] objArr2 = new Object[1];
        a(new char[]{61145, 42471, 16863, 6127, 44118, 61140, 58632, 39359, 3819, 50018, 25870, 29557, 22039, 39427, 61265, 11739, 38040, 20579, 62969, 3245, 20329, 34377, 60846, 25417, 58262, 59194, 43052, 39057, 54976, 42891, 46256, 58912, 26022, 33681, 1674, 1856, 22039, 39427, 2897, 43694, 18048, 46333, 65009, 5044, 37508, 18961, 63103, 57373, 34003, 27679, 32499, 21809, 20343, 62059, 302, 33786}, 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        tdsListRowV1View2.setLeftImage(((String) objArr2[0]).intern());
        tdsListRowV1View2.setCenterType(onextracallbackwithresult);
        tdsListRowV1View2.setCenterText1(getString(R.string.credit_ui_main_card_banner_title));
        Context context10 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        Configuration configuration3 = context10.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new onNavigationEvent(configuration3)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View2.setCenterText2(getString(R.string.credit_ui_main_card_banner_subtitle));
        Context context11 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "");
        Configuration configuration4 = context11.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsListRowV1View2.setCenterText2Color(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallbackDefault(configuration4)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        tdsListRowV1View2.setRightType(asbinder);
        tdsListRowV1View2.setRightArrow(true);
        tdsListRowV1View2.setOnClickListener(new CreditPerfectScoreActivity$.ExternalSyntheticLambda3(this));
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsListRowV1View2);
        objectRef2.element = tdsListRowV1View2;
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        proxy.onWarmupCompleted(linearLayout2, (Authenticator) null, (Authenticator) null, (Authenticator) null, (Authenticator) null, false, (protocols) null, AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, (AuthenticatorCompanionAuthenticatorNone) null, false, (Function1) null, 28, (Object) null), false, 0, 0, (socketFactory) null, (Function2) null, (Function1) null, (Function1) null, 16319, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsScrollView);
        enablecustomfocussearchonclippedelementsandroid.IAuthTabCallback(tdsScrollView);
        TdsListRowV1View tdsListRowV1View3 = (TdsListRowV1View) objectRef2.element;
        if (tdsListRowV1View3 != null) {
            enablecustomfocussearchonclippedelementsandroid.onWarmupCompleted(tdsListRowV1View3, new CreditPerfectScoreActivity$.ExternalSyntheticLambda4(this));
            Unit unit4 = Unit.INSTANCE;
        }
        TdsListRowV1View tdsListRowV1View4 = (TdsListRowV1View) objectRef.element;
        if (tdsListRowV1View4 != null) {
            enablecustomfocussearchonclippedelementsandroid.onWarmupCompleted(tdsListRowV1View4, new CreditPerfectScoreActivity$.ExternalSyntheticLambda5(this));
            Unit unit5 = Unit.INSTANCE;
        }
        Context context12 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context12);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, viva.republica.toss.R.string.close, new CreditPerfectScoreActivity$.ExternalSyntheticLambda6(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) FrameLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        ((FrameLayout.LayoutParams) layoutParams3).gravity = 80;
        tdsBottomCtaV1View.setLayoutParams(layoutParams3);
        setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, tdsBottomCtaV1View);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, frameLayout);
        setContentView(linearLayout);
        disableImageViewPreallocationAndroid.onNavigationEvent(linearLayout, (View) objectRef3.element, (View) null, (View) null, false, 14, (Object) null);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditPerfectScoreActivity creditPerfectScoreActivity, TdsTopV2View tdsTopV2View) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-83872408, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 83872410, iOnWarmupCompleted, new Object[]{creditPerfectScoreActivity, tdsTopV2View});
    }

    public static /* synthetic */ void onWarmupCompleted(CreditPerfectScoreActivity creditPerfectScoreActivity, View view) throws Throwable {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        onExtraCallbackWithResult(984190934, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -984190931, iOnWarmupCompleted, new Object[]{creditPerfectScoreActivity, view});
    }

    private static final Unit onNavigationEvent(CreditPerfectScoreActivity creditPerfectScoreActivity, TdsTopV2View tdsTopV2View) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-1710741775, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 1710741775, iOnWarmupCompleted, new Object[]{creditPerfectScoreActivity, tdsTopV2View});
    }

    private static final Unit onNavigationEvent(CreditPerfectScoreActivity creditPerfectScoreActivity) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(-1275074044, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, 1275074045, iOnWarmupCompleted, new Object[]{creditPerfectScoreActivity});
    }

    private static final Unit IAuthTabCallbackStub(CreditPerfectScoreActivity creditPerfectScoreActivity, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(1575925280, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, -1575925276, iOnWarmupCompleted, new Object[]{creditPerfectScoreActivity, setDetectableSize});
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditPerfectScoreActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 75;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditPerfectScoreActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditPerfectScoreActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditPerfectScoreActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        asBinder = (char) 36791;
        IAuthTabCallbackDefault = (char) 23578;
        asInterface = (char) 25321;
        getInterfaceDescriptor = (char) 23863;
    }
}
