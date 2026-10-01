package im.toss.features.credit.ui.plus.intro.component;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection4$;
import im.toss.tds.view.compat.component.TdsComposeView;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioMatcher;
import o.Authenticator;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.GraphicDeviceInfo;
import o.TimelineExternalSyntheticLambda0;
import o.authenticate;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.initSDK;
import o.protocols;
import o.proxy;
import o.readIntokhttp;
import o.socketFactory;
import o.updateFileSpaceCache;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusIntroComponentSection4 extends FrameLayout implements updateFileSpaceCache {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = -6412078070253475809L;
    private static int onWarmupCompleted = 1;
    private final AudioMatcher IAuthTabCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreditPlusIntroComponentSection4(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreditPlusIntroComponentSection4(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPlusIntroComponentSection4 creditPlusIntroComponentSection4, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPlusIntroComponentSection4, z);
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, initSDK.onNavigationEvent onnavigationevent) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(i, onnavigationevent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(i, onnavigationevent);
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditPlusIntroComponentSection4(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AudioMatcher audioMatcherOnExtraCallback = AudioMatcher.onExtraCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(audioMatcherOnExtraCallback, "");
        this.IAuthTabCallback = audioMatcherOnExtraCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusIntroComponentSection4(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 56 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static final Unit onNavigationEvent(int i, initSDK.onNavigationEvent onnavigationevent) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationevent.onExtraCallbackWithResult("order", Integer.valueOf(i));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onnavigationevent.onExtraCallbackWithResult("order", Integer.valueOf(i));
        int i4 = 77 / 0;
        return Unit.INSTANCE;
    }

    @Override // o.updateFileSpaceCache
    public void onNavigationEvent(int i, int i2, @NotNull Function0<Unit> function0) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        TdsListHeaderV3View tdsListHeaderV3View = this.IAuthTabCallback.onTransact;
        tdsListHeaderV3View.setTitleText(tdsListHeaderV3View.getContext().getString(R.string.credit_ui_plus_intro_section4_top_title));
        tdsListHeaderV3View.setTitleFontWeight(GraphicDeviceInfo.Companion.IAuthTabCallback());
        tdsListHeaderV3View.setTitleWidthRatioValue(1.0f);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.LARGE);
        Intrinsics.checkNotNull(tdsListHeaderV3View);
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new IAuthTabCallback(configuration)).onRelationshipValidationResult());
        Object[] objArr = {tdsListHeaderV3View, new CreditPlusIntroComponentSection4$.ExternalSyntheticLambda0(i)};
        TdsComposeView.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, -122849947, JsParamKeys.onExtraCallbackWithResult(), 122849948);
        TdsListRowV1View tdsListRowV1View = this.IAuthTabCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        String string = getContext().getString(R.string.credit_ui_plus_intro_section4_list_row_1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{42823, 15874, 42799, 28005, 49460, 26470, 25346, 60280, 39499, 41319, 13161, 57313, 16300, 54749, 65515, 3054, 17354, 2454, 18960, 17442, 38424, 47666, 5649, 45068, 55890, 61152, 58041, 60567, 28396, 8886, 44724, 22841, 45436, 22357, 32096, 38241, 50440, 35653, 51658, 49661, 2434, 16350, 38281, 15808, 23954, 28775, 24671, 28183, 57441, 42032, 11308, 55835, 13542, 55436, 63729, 5875, 30958, 3212, 18244, 17211, 35649, 16713, 4884, 48973}, ExpandableListView.getPackedPositionType(0L) + 1, objArr2);
        onExtraCallbackWithResult(tdsListRowV1View, ((String) objArr2[0]).intern(), string);
        TdsListRowV1View tdsListRowV1View2 = this.IAuthTabCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View2, "");
        String string2 = getContext().getString(R.string.credit_ui_plus_intro_section4_list_row_2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr3 = new Object[1];
        a(new char[]{2127, 56535, 2087, 36784, 11193, 36331, 65460, 17520, 1789, 17330, 55780, 17239, 37028, 14088, 5478, 38744, 60610, 60227, 41117, 55444, 14608, 22759, 64668, 11450, 30042, 3125, 2100, 28705, 49636, 49251, 17465, 50575, 7796, 46464, 38893, 2519, 27136, 27024, 9031, 23883, 42634, 56587, 32516, 41334, 62106, 37554, 35538, 62113, 20329, 18149, 50849, 18093, 39917, 14937, 4732, 35397, 55270, 61017, 44489, 57229, 9289, 41884, 63897, 9211}, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
        onExtraCallbackWithResult(tdsListRowV1View2, ((String) objArr3[0]).intern(), string2);
        TdsListRowV1View tdsListRowV1View3 = this.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View3, "");
        String string3 = getContext().getString(R.string.credit_ui_plus_intro_section4_list_row_3);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Object[] objArr4 = new Object[1];
        a(new char[]{32853, 2648, 32829, 22847, 52111, 28125, 59827, 52330, 4346, 38205, 14802, 21840, 6334, 57735, 62800, 33119, 25816, 15820, 16555, 52883, 45322, 36456, 7338, 15037, 64832, 55994, 59394, 26150, 18942, 5868, 41999, 54152, 38510, 25359, 30683, 8144, 57882, 48927, 50033, 19276, 11920, 2948, 40754, 46961, 31360, 17469, 27364, 58534, 51059, 36970, 9879, 20650, 5110, 60630, 62026, 40002, 24572, 14550, 19967, 51594, 44115, 29971, 6575, 13820}, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        onExtraCallbackWithResult(tdsListRowV1View3, ((String) objArr4[0]).intern(), string3);
        TdsListRowV1View tdsListRowV1View4 = this.IAuthTabCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View4, "");
        String string4 = getContext().getString(R.string.credit_ui_plus_intro_section4_list_row_4);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Object[] objArr5 = new Object[1];
        a(new char[]{59591, 41739, 59567, 61548, 21102, 62524, 55806, 42232, 8375, 15470, 41011, 25885, 28716, 18644, 27825, 45330, 3146, 38047, 55626, 65246, 55704, 10043, 34123, 2800, 38354, 29673, 29155, 22123, 8556, 49087, 15854, 58309, 65276, 51804, 60986, 12189, 35464, 5708, 23184, 31489, 17922, 41687, 1747, 34620, 4626, 60782, 62213, 54507, 45025, 14649, 49014, 24807, 31587, 17797, 27563, 44047, 14190, 37253, 54302, 63943, 50369, 56384, 32846, 1457}, View.getDefaultSize(0, 0) + 1, objArr5);
        onExtraCallbackWithResult(tdsListRowV1View4, ((String) objArr5[0]).intern(), string4);
        TdsListRowV1View tdsListRowV1View5 = this.IAuthTabCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View5, "");
        String string5 = getContext().getString(R.string.credit_ui_plus_intro_section4_list_row_5);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        Object[] objArr6 = new Object[1];
        a(new char[]{13006, 14933, 12966, 26930, 39498, 15384, 37988, 32497, 27949, 42288, 26647, 10375, 43557, 53642, 42133, 64648, 54851, 3521, 4462, 45892, 913, 48741, 19823, 18282, 20443, 60087, 47559, 7153, 64357, 9953, 62922, 44639, 9461, 21250, 9758, 25095, 20609, 36626, 37556, 13979, 39947, 15241, 52983, 51878, 51227, 29744, 15137, 39281, 30184, 41063, 30546, 11645, 41323, 56539, 41871, 57749, 60775, 2267, 7226, 46173, 7880, 17694, 18538, 18475}, -MotionEvent.axisFromString(""), objArr6);
        onExtraCallbackWithResult(tdsListRowV1View5, ((String) objArr6[0]).intern(), string5);
        int i4 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 113;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 83, (ViewConfiguration.getLongPressTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 14186), 19 - Color.alpha(0), Color.argb(0, 0, 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 69;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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

    @Override // o.updateFileSpaceCache
    public void onWarmupCompleted() {
        int i = 2 % 2;
        LinearLayout linearLayout = this.IAuthTabCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        proxy.onWarmupCompleted(linearLayout, (Authenticator) null, (Authenticator) null, (Authenticator) null, (Authenticator) null, false, (protocols) null, AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null), false, 80, 0, (socketFactory) null, (Function2) null, new CreditPlusIntroComponentSection4$.ExternalSyntheticLambda1(this), (Function1) null, 11967, (Object) null);
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onNavigationEvent + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i5 = onExtraCallback + 99;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    private static final Unit onExtraCallbackWithResult(CreditPlusIntroComponentSection4 creditPlusIntroComponentSection4, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditPlusIntroComponentSection4.IAuthTabCallback.asInterface.setAlpha(1.0f);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View, String str, String str2) {
        int i = 2 % 2;
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View.setLeftImage(str);
        tdsListRowV1View.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View, 24), varyMatches.IAuthTabCallback(tdsListRowV1View, 24));
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1C);
        tdsListRowV1View.setCenterText1(str2);
        Context context = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onNavigationEvent(configuration)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setRightArrow(false);
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
