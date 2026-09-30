package im.toss.ads_sdk.ui.view;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.gradient.TdsRadialGradientView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.Address;
import o.access13800;
import o.access14300;
import o.deprecated_certificatePinner;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getStrokeWidth;
import o.getUrlokhttp;
import o.getVersionCode;
import o.maybeUpdateAnimatable;
import o.processDeepLink;
import o.readIntokhttp;
import o.registerDataSetObserver;
import o.setCurrentIndex;
import o.setRandomHost;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdsCircularCountdownLayout extends ConstraintLayout {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100;
    private final Lazy IAuthTabCallback;
    private getPackageType IAuthTabCallbackDefault;
    private Function0<Unit> IAuthTabCallbackStub;
    private Function1<? super Boolean, Unit> IAuthTabCallback_Parcel;
    private long access000;
    private boolean asBinder;
    private long asInterface;
    private final findResAndMsg getInterfaceDescriptor;
    private final List<ValueAnimator> onExtraCallback;
    private final registerDataSetObserver onExtraCallbackWithResult;
    private long onNavigationEvent;
    private boolean onTransact;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsCircularCountdownLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsCircularCountdownLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
            return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{adsCircularCountdownLayout, function0}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), 489840145, -489840136, iOnNavigationEvent);
        }
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsImageView tdsImageView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tdsImageView, valueAnimator);
        int i4 = access100 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Typography5 typography5 = (Typography5) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{typography5, valueAnimator}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), 208338486, -208338479, iOnNavigationEvent);
        int i4 = access100 + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AdsCircularCountdownLayout adsCircularCountdownLayout, String str, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(adsCircularCountdownLayout, str, z, z2);
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(AdsCircularCountdownLayout adsCircularCountdownLayout, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(adsCircularCountdownLayout, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Typography5 typography5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(typography5, valueAnimator);
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(context);
        int i4 = IAuthTabCallbackStubProxy + 35;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i4) | i7);
        int i9 = ~(i7 | i6);
        int i10 = i8 | i9;
        int i11 = i9 | i4;
        int i12 = ~(i7 | i4);
        int i13 = i5 + i4 + i2 + (1577873432 * i) + (977123338 * i3);
        int i14 = i13 * i13;
        int i15 = (i5 * (-1177406726)) + 1326046462 + (i4 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + ((-1177406223) * i2) + (1546282648 * i) + ((-1884272278) * i3) + (i14 * 70909952);
        switch ((((-1026819430) * i5) - 865599488) + ((-647756440) * i4) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i2) + ((-767557632) * i) + (1290797056 * i3) + ((-539361280) * i14) + (i15 * i15 * 451280896)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i16 = 2 % 2;
                AdsCircularProgressBar adsCircularProgressBar = adsCircularCountdownLayout.onExtraCallbackWithResult.onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(adsCircularProgressBar, "");
                adsCircularProgressBar.setVisibility(8);
                Typography5 typography5 = adsCircularCountdownLayout.onExtraCallbackWithResult.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(typography5, "");
                typography5.setVisibility(0);
                Typography5 typography52 = adsCircularCountdownLayout.onExtraCallbackWithResult.asInterface;
                Intrinsics.checkNotNullExpressionValue(typography52, "");
                typography52.setVisibility(8);
                Typography5 typography53 = adsCircularCountdownLayout.onExtraCallbackWithResult.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(typography53, "");
                typography53.setAlpha(1.0f);
                typography53.setScaleX(1.0f);
                typography53.setScaleY(1.0f);
                adsCircularCountdownLayout.IAuthTabCallbackDefault = maybeUpdateAnimatable.onNavigationEvent(adsCircularCountdownLayout.getInterfaceDescriptor, (CoroutineContext) null, (setRandomHost) null, adsCircularCountdownLayout.new onNavigationEvent(jLongValue, typography53, null), 3, (Object) null);
                int i17 = IAuthTabCallbackStubProxy + 55;
                access100 = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                final AdsCircularCountdownLayout adsCircularCountdownLayout2 = (AdsCircularCountdownLayout) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                int i19 = 2 % 2;
                getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
                View root = adsCircularCountdownLayout2.onExtraCallbackWithResult.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                getStrokeWidth.onExtraCallback(getstrokewidth, root, false, null, 0, null, null, 0.0f, 0.98f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda13
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i20 = 2 % 2;
                        int i21 = onWarmupCompleted + 37;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        Unit unitOnExtraCallbackWithResult = AdsCircularCountdownLayout.onExtraCallbackWithResult(this.f$0, (MotionEvent) obj);
                        int i23 = onExtraCallback + 99;
                        onWarmupCompleted = i23 % 128;
                        int i24 = i23 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, 4030, null);
                function0.invoke();
                Unit unit = Unit.INSTANCE;
                int i20 = IAuthTabCallbackStubProxy + 55;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AdsCircularCountdownLayout adsCircularCountdownLayout, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(adsCircularCountdownLayout, motionEvent);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(adsCircularCountdownLayout, motionEvent);
        int i3 = access100 + 51;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(AdsCircularCountdownLayout adsCircularCountdownLayout, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
            return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{adsCircularCountdownLayout, motionEvent}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), -1043572070, 1043572074, iOnNavigationEvent);
        }
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Typography5 typography5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(typography5, valueAnimator);
        int i4 = access100 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onWarmupCompleted(adsCircularCountdownLayout, jLongValue, valueAnimator);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(AdsCircularProgressBar adsCircularProgressBar, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(adsCircularProgressBar, valueAnimator);
        int i4 = IAuthTabCallbackStubProxy + 25;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Typography5 typography5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        asInterface(typography5, valueAnimator);
        int i4 = IAuthTabCallbackStubProxy + 27;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdsCircularCountdownLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        registerDataSetObserver registerdatasetobserverOnNavigationEvent = registerDataSetObserver.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(registerdatasetobserverOnNavigationEvent, "");
        this.onExtraCallbackWithResult = registerdatasetobserverOnNavigationEvent;
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new AdsCircularCountdownLayout$.ExternalSyntheticLambda2(context));
        this.onExtraCallback = new ArrayList();
        this.getInterfaceDescriptor = findRes.onExtraCallbackWithResult();
        Typography5 typography5 = registerdatasetobserverOnNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        getVersionCode getversioncode = getVersionCode.MEDIUM;
        processDeepLink.onWarmupCompleted(typography5, getversioncode);
        Typography5 typography52 = registerdatasetobserverOnNavigationEvent.asInterface;
        Intrinsics.checkNotNullExpressionValue(typography52, "");
        processDeepLink.onWarmupCompleted(typography52, getversioncode);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        setAccessibilityLiveRegion(2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdsCircularCountdownLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access100 + 55;
            IAuthTabCallbackStubProxy = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 3;
            access100 = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void IAuthTabCallback(AdsCircularCountdownLayout adsCircularCountdownLayout, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        adsCircularCountdownLayout.access000 = j;
        int i5 = i3 + 95;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(AdsCircularCountdownLayout adsCircularCountdownLayout, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        adsCircularCountdownLayout.onNavigationEvent(str);
        int i4 = access100 + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean IAuthTabCallback(AdsCircularCountdownLayout adsCircularCountdownLayout) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = adsCircularCountdownLayout.asBinder;
        int i5 = i2 + 29;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str = (String) objArr[3];
        boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        adsCircularCountdownLayout.onExtraCallbackWithResult(zBooleanValue, zBooleanValue2, str, zBooleanValue3);
        if (i3 != 0) {
            return null;
        }
        int i4 = 63 / 0;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = adsCircularCountdownLayout.IAuthTabCallback(jLongValue);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iIAuthTabCallback);
        }
        int i5 = 92 / 0;
        return Integer.valueOf(iIAuthTabCallback);
    }

    public static final /* synthetic */ void onWarmupCompleted(AdsCircularCountdownLayout adsCircularCountdownLayout, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        adsCircularCountdownLayout.IAuthTabCallback(str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = access100 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) adsCircularCountdownLayout.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return Float.valueOf(number.floatValue());
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        try {
            float f = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            int i4 = IAuthTabCallbackStubProxy + 121;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 44 / 0;
            }
            return f;
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public final void setCloseBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 59;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult.onExtraCallback.setBackgroundColor(i);
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
    }

    public static final class IAuthTabCallback implements Animator.AnimatorListener {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ AdsCircularProgressBar IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 79 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 71 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
            }
        }

        public IAuthTabCallback(AdsCircularProgressBar adsCircularProgressBar) {
            this.IAuthTabCallback = adsCircularProgressBar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.setVisibility(8);
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements Animator.AnimatorListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AdsCircularCountdownLayout IAuthTabCallback;
        final /* synthetic */ Ref.BooleanRef onExtraCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        public asBinder(Ref.BooleanRef booleanRef, AdsCircularCountdownLayout adsCircularCountdownLayout) {
            this.onExtraCallback = booleanRef;
            this.IAuthTabCallback = adsCircularCountdownLayout;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if ((!this.onExtraCallback.element) && (!AdsCircularCountdownLayout.IAuthTabCallback(this.IAuthTabCallback))) {
                int i4 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                ConstraintLayout constraintLayout = this.IAuthTabCallback;
                String string = constraintLayout.getContext().getString(R.string.ads_sdk_user_earned_reward);
                Intrinsics.checkNotNullExpressionValue(string, "");
                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{constraintLayout, true, true, string, true}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -365925309, 365925315, iOnNavigationEvent);
            }
            int i6 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class asInterface implements Animator.AnimatorListener {
        private static int asBinder = 1;
        private static int asInterface;
        final /* synthetic */ Typography5 IAuthTabCallback;
        final /* synthetic */ Typography5 onExtraCallback;
        final /* synthetic */ AdsCircularCountdownLayout onExtraCallbackWithResult;
        final /* synthetic */ int onNavigationEvent;
        final /* synthetic */ int onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = asInterface + 113;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = asBinder + 25;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = asBinder + 79;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 38 / 0;
            }
        }

        public asInterface(int i, int i2, Typography5 typography5, Typography5 typography52, AdsCircularCountdownLayout adsCircularCountdownLayout) {
            this.onWarmupCompleted = i;
            this.onNavigationEvent = i2;
            this.onExtraCallback = typography5;
            this.IAuthTabCallback = typography52;
            this.onExtraCallbackWithResult = adsCircularCountdownLayout;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = asBinder + 57;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.onWarmupCompleted - this.onNavigationEvent;
            this.onExtraCallback.setText(String.valueOf(i4));
            this.onExtraCallback.setAlpha(0.0f);
            this.onExtraCallback.setScaleX(0.3f);
            this.onExtraCallback.setScaleY(0.3f);
            this.IAuthTabCallback.setAlpha(0.0f);
            this.onExtraCallbackWithResult.setContentDescription(String.valueOf(i4));
            AdsCircularCountdownLayout.onWarmupCompleted(this.onExtraCallbackWithResult, String.valueOf(i4));
            int i5 = asInterface + 97;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final class onTransact implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Ref.BooleanRef onNavigationEvent;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 78 / 0;
            }
        }

        public onTransact(Ref.BooleanRef booleanRef) {
            this.onNavigationEvent = booleanRef;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Ref.BooleanRef booleanRef;
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                booleanRef = this.onNavigationEvent;
                z = false;
            } else {
                booleanRef = this.onNavigationEvent;
                z = true;
            }
            booleanRef.element = z;
            int i3 = onExtraCallback + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class onWarmupCompleted implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 onExtraCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onWarmupCompleted(Function0 function0) {
            this.onExtraCallback = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke();
            int i4 = onNavigationEvent + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted(int i, long j, boolean z, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 55;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback_Parcel = function1;
        this.IAuthTabCallbackStub = function0;
        onExtraCallback();
        this.onWarmupCompleted = z;
        if (z || this.asBinder) {
            this.access000 = 0L;
            this.onNavigationEvent = 0L;
            this.asBinder = true;
            String string = getContext().getString(R.string.ads_sdk_close);
            Intrinsics.checkNotNullExpressionValue(string, "");
            onExtraCallback(string);
            return;
        }
        long jCoerceAtMost = i * 1000;
        this.asInterface = jCoerceAtMost;
        if (i <= 0) {
            String string2 = getContext().getString(R.string.ads_sdk_close);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            onExtraCallbackWithResult(false, false, string2, true);
            return;
        }
        if (j > 0) {
            jCoerceAtMost = RangesKt.coerceAtMost(j, jCoerceAtMost);
        }
        if (jCoerceAtMost > 0) {
            onExtraCallbackWithResult(jCoerceAtMost);
            String string3 = getContext().getString(R.string.ads_sdk_countdown_start, Integer.valueOf(IAuthTabCallback(jCoerceAtMost)));
            Intrinsics.checkNotNullExpressionValue(string3, "");
            onNavigationEvent(string3);
            onNavigationEvent(jCoerceAtMost);
            this.onTransact = false;
            return;
        }
        int i5 = access100 + 119;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            String string4 = getContext().getString(R.string.ads_sdk_user_earned_reward);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            onExtraCallbackWithResult(true, false, string4, !this.onWarmupCompleted);
        } else {
            String string5 = getContext().getString(R.string.ads_sdk_user_earned_reward);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            onExtraCallbackWithResult(true, false, string5, !this.onWarmupCompleted);
        }
    }

    private final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onNavigationEvent.setPercent(RangesKt.coerceIn(f, 0.0f, 1.0f));
        int i4 = access100 + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007b A[PHI: r2
      0x007b: PHI (r2v5 int) = (r2v4 int), (r2v22 int) binds: [B:8:0x0079, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(final long j) {
        int iIAuthTabCallback;
        Typography5 typography5;
        Typography5 typography52;
        final AdsCircularCountdownLayout adsCircularCountdownLayout = this;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = access100 + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            adsCircularCountdownLayout.onNavigationEvent = SystemClock.elapsedRealtime() ^ j;
            iIAuthTabCallback = IAuthTabCallback(j);
            int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
            if (((Float) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{this}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 859454274, -859454271, iOnNavigationEvent)).floatValue() == 1.0f) {
                int i4 = iIAuthTabCallback;
                if (!IAuthTabCallbackDefault()) {
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(j);
                    Address address = Address.onNavigationEvent;
                    valueAnimatorOfFloat.setInterpolator(address.asInterface());
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 47;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            Object[] objArr = {this.f$0, Long.valueOf(j), valueAnimator};
                            int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                            AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 830922377, -830922377, iOnNavigationEvent2);
                            int i8 = IAuthTabCallback + 55;
                            onWarmupCompleted = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i9 = 83 / 0;
                            }
                        }
                    });
                    Intrinsics.checkNotNull(valueAnimatorOfFloat);
                    valueAnimatorOfFloat.addListener(new onTransact(booleanRef));
                    valueAnimatorOfFloat.addListener(new asBinder(booleanRef, adsCircularCountdownLayout));
                    adsCircularCountdownLayout.onExtraCallback.add(valueAnimatorOfFloat);
                    Interpolator interpolatorOnWarmupCompleted = address.onWarmupCompleted();
                    deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
                    TimeInterpolator timeInterpolatorOnExtraCallback = deprecated_certificatepinner.onExtraCallback();
                    TimeInterpolator timeInterpolatorOnExtraCallbackWithResult = deprecated_certificatepinner.onExtraCallbackWithResult();
                    long jIAuthTabCallback = timeInterpolatorOnExtraCallback.IAuthTabCallback();
                    long jIAuthTabCallback2 = timeInterpolatorOnExtraCallbackWithResult.IAuthTabCallback();
                    int i5 = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        int i7 = i5 % 2;
                        registerDataSetObserver registerdatasetobserver = adsCircularCountdownLayout.onExtraCallbackWithResult;
                        if (i7 == 0) {
                            int i8 = access100 + 31;
                            IAuthTabCallbackStubProxy = i8 % 128;
                            if (i8 % i == 0) {
                                typography5 = registerdatasetobserver.onWarmupCompleted;
                                int i9 = 81 / 0;
                            } else {
                                typography5 = registerdatasetobserver.onWarmupCompleted;
                            }
                        } else {
                            typography5 = registerdatasetobserver.asInterface;
                        }
                        final Typography5 typography53 = typography5;
                        Intrinsics.checkNotNull(typography53);
                        if (i7 == 0) {
                            typography52 = adsCircularCountdownLayout.onExtraCallbackWithResult.asInterface;
                        } else {
                            typography52 = adsCircularCountdownLayout.onExtraCallbackWithResult.onWarmupCompleted;
                            int i10 = access100 + 59;
                            IAuthTabCallbackStubProxy = i10 % 128;
                            int i11 = i10 % i;
                        }
                        Typography5 typography54 = typography52;
                        Intrinsics.checkNotNull(typography54);
                        long j2 = 1000 * i6;
                        float[] fArr = new float[i];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr);
                        int i12 = i4;
                        valueAnimatorOfFloat2.setDuration(500L);
                        valueAnimatorOfFloat2.setStartDelay(j2);
                        valueAnimatorOfFloat2.setInterpolator(interpolatorOnWarmupCompleted);
                        Intrinsics.checkNotNull(valueAnimatorOfFloat2);
                        long j3 = jIAuthTabCallback2;
                        valueAnimatorOfFloat2.addListener(new asInterface(i12, i6, typography53, typography54, this));
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda5
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = 2 % 2;
                                int i14 = onWarmupCompleted + 17;
                                onExtraCallback = i14 % 128;
                                int i15 = i14 % 2;
                                AdsCircularCountdownLayout.onExtraCallback(typography53, valueAnimator);
                                if (i15 == 0) {
                                    int i16 = 89 / 0;
                                }
                            }
                        });
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat3.setDuration(200L);
                        valueAnimatorOfFloat3.setStartDelay(j2 + 800);
                        valueAnimatorOfFloat3.setInterpolator(interpolatorOnWarmupCompleted);
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda6
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = 2 % 2;
                                int i14 = IAuthTabCallback + 117;
                                onNavigationEvent = i14 % 128;
                                int i15 = i14 % 2;
                                AdsCircularCountdownLayout.onNavigationEvent(typography53, valueAnimator);
                                int i16 = IAuthTabCallback + 19;
                                onNavigationEvent = i16 % 128;
                                if (i16 % 2 == 0) {
                                    throw null;
                                }
                            }
                        });
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.3f, 1.0f);
                        valueAnimatorOfFloat4.setDuration(jIAuthTabCallback);
                        valueAnimatorOfFloat4.setStartDelay(j2);
                        valueAnimatorOfFloat4.setInterpolator(timeInterpolatorOnExtraCallback);
                        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda7
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = 2 % 2;
                                int i14 = onNavigationEvent + 47;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                Object[] objArr = {typography53, valueAnimator};
                                int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                                AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -1857493238, 1857493239, iOnNavigationEvent2);
                                int i16 = onWarmupCompleted + 91;
                                onNavigationEvent = i16 % 128;
                                int i17 = i16 % 2;
                            }
                        });
                        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.3f);
                        valueAnimatorOfFloat5.setDuration(j3);
                        valueAnimatorOfFloat5.setStartDelay(j2 + 120 + jIAuthTabCallback);
                        valueAnimatorOfFloat5.setInterpolator(timeInterpolatorOnExtraCallbackWithResult);
                        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda8
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = 2 % 2;
                                int i14 = onWarmupCompleted + 65;
                                onNavigationEvent = i14 % 128;
                                int i15 = i14 % 2;
                                AdsCircularCountdownLayout.onWarmupCompleted(typography53, valueAnimator);
                                int i16 = onWarmupCompleted + 11;
                                onNavigationEvent = i16 % 128;
                                if (i16 % 2 == 0) {
                                    int i17 = 8 / 0;
                                }
                            }
                        });
                        this.onExtraCallback.add(valueAnimatorOfFloat2);
                        this.onExtraCallback.add(valueAnimatorOfFloat3);
                        this.onExtraCallback.add(valueAnimatorOfFloat4);
                        this.onExtraCallback.add(valueAnimatorOfFloat5);
                        i5++;
                        jIAuthTabCallback2 = j3;
                        adsCircularCountdownLayout = this;
                        i4 = i12;
                        i = 2;
                    }
                    Iterator<T> it = adsCircularCountdownLayout.onExtraCallback.iterator();
                    while (it.hasNext()) {
                        int i13 = IAuthTabCallbackStubProxy + 59;
                        access100 = i13 % 128;
                        if (i13 % 2 != 0) {
                            ((ValueAnimator) it.next()).start();
                            throw null;
                        }
                        ((ValueAnimator) it.next()).start();
                    }
                    return;
                }
            }
        } else {
            adsCircularCountdownLayout.onNavigationEvent = SystemClock.elapsedRealtime() + j;
            iIAuthTabCallback = IAuthTabCallback(j);
            int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
            if (((Float) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{this}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 859454274, -859454271, iOnNavigationEvent2)).floatValue() == 1.0f) {
            }
        }
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{adsCircularCountdownLayout, Long.valueOf(j)}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -395257935, 395257943, setCurrentIndex.onNavigationEvent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(AdsCircularCountdownLayout adsCircularCountdownLayout, long j, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        long animatedFraction = (long) ((1.0f - valueAnimator.getAnimatedFraction()) * j);
        adsCircularCountdownLayout.access000 = animatedFraction;
        adsCircularCountdownLayout.IAuthTabCallback(adsCircularCountdownLayout.onExtraCallback(animatedFraction));
        adsCircularCountdownLayout.setContentDescription(adsCircularCountdownLayout.getContext().getString(R.string.ads_sdk_seconds_left, Integer.valueOf(adsCircularCountdownLayout.IAuthTabCallback(adsCircularCountdownLayout.access000))));
        int i4 = IAuthTabCallbackStubProxy + 113;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(Typography5 typography5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        typography5.setAlpha(((Float) animatedValue).floatValue());
        int i4 = IAuthTabCallbackStubProxy + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStub(Typography5 typography5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        typography5.setAlpha(((Float) animatedValue).floatValue());
        int i4 = IAuthTabCallbackStubProxy + 45;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Typography5 typography5 = (Typography5) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        typography5.setScaleX(fFloatValue);
        typography5.setScaleY(fFloatValue);
        int i4 = IAuthTabCallbackStubProxy + 105;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return null;
    }

    private static final void asInterface(Typography5 typography5, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            typography5.setScaleX(fFloatValue);
            typography5.setScaleY(fFloatValue);
            return;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue2 = ((Float) animatedValue2).floatValue();
        typography5.setScaleX(fFloatValue2);
        typography5.setScaleY(fFloatValue2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Typography5 $countdownTextView;
        final /* synthetic */ long $startRemainingMs;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(long j, Typography5 typography5, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$startRemainingMs = j;
            this.$countdownTextView = typography5;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = AdsCircularCountdownLayout.this.new onNavigationEvent(this.$startRemainingMs, this.$countdownTextView, access13800Var);
            int i2 = onExtraCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 25;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0088 -> B:14:0x008b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 31;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                AdsCircularCountdownLayout adsCircularCountdownLayout = AdsCircularCountdownLayout.this;
                Object[] objArr = {adsCircularCountdownLayout, Long.valueOf(adsCircularCountdownLayout.onExtraCallbackWithResult())};
                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                iIntValue = ((Integer) AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -518311331, 518311336, iOnNavigationEvent)).intValue();
                int i7 = onWarmupCompleted + 55;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                if (iIntValue > 0) {
                    this.$countdownTextView.setText(String.valueOf(iIntValue));
                    AdsCircularCountdownLayout.IAuthTabCallback(AdsCircularCountdownLayout.this, String.valueOf(iIntValue));
                    AdsCircularCountdownLayout adsCircularCountdownLayout2 = AdsCircularCountdownLayout.this;
                    AdsCircularCountdownLayout.IAuthTabCallback(adsCircularCountdownLayout2, RangesKt.coerceAtLeast(adsCircularCountdownLayout2.onExtraCallbackWithResult(), 0L));
                    this.I$0 = iIntValue;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    AdsCircularCountdownLayout adsCircularCountdownLayout3 = AdsCircularCountdownLayout.this;
                    Object[] objArr2 = {adsCircularCountdownLayout3, Long.valueOf(adsCircularCountdownLayout3.onExtraCallbackWithResult())};
                    int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                    iIntValue = ((Integer) AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr2, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -518311331, 518311336, iOnNavigationEvent2)).intValue();
                    int i72 = onWarmupCompleted + 55;
                    onExtraCallback = i72 % 128;
                    int i82 = i72 % 2;
                    if (iIntValue > 0) {
                        ConstraintLayout constraintLayout = AdsCircularCountdownLayout.this;
                        String string = constraintLayout.getContext().getString(R.string.ads_sdk_user_earned_reward);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
                        int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
                        AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{constraintLayout, true, false, string, true}, iOnNavigationEvent4, setCurrentIndex.onNavigationEvent(), -365925309, 365925315, iOnNavigationEvent3);
                        return Unit.INSTANCE;
                    }
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr3 = {AdsCircularCountdownLayout.this, Long.valueOf(this.$startRemainingMs)};
                int iOnNavigationEvent5 = setCurrentIndex.onNavigationEvent();
                iIntValue = ((Integer) AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr3, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -518311331, 518311336, iOnNavigationEvent5)).intValue();
                if (iIntValue > 0) {
                }
            }
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = true;
        this.access000 = onExtraCallbackWithResult();
        this.onNavigationEvent = 0L;
        onExtraCallback();
        int i4 = IAuthTabCallbackStubProxy + 31;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r6 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r6 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r0 = getContext().getString(im.toss.ads_sdk.R.string.ads_sdk_user_earned_reward);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        onExtraCallbackWithResult(true, false, r0, !r8.onWarmupCompleted);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        onExtraCallbackWithResult(r6);
        onNavigationEvent(r6);
        r1 = im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout.IAuthTabCallbackStubProxy + 103;
        im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout.access100 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent() {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (this.asBinder) {
            return;
        }
        int i2 = access100 + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (!this.onTransact) {
            return;
        }
        int i5 = i3 + 63;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            this.onTransact = true;
            jOnExtraCallbackWithResult = onExtraCallbackWithResult();
        } else {
            this.onTransact = false;
            jOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super/*android.view.View*/.onAttachedToWindow();
            IAuthTabCallback();
            int i3 = 3 / 0;
        } else {
            super/*android.view.View*/.onAttachedToWindow();
            IAuthTabCallback();
        }
        int i4 = access100 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        findResAndMsg findresandmsg;
        int i;
        int i2 = 2 % 2;
        int i3 = access100 + 67;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            super/*android.view.View*/.onDetachedFromWindow();
            onExtraCallback();
            findresandmsg = this.getInterfaceDescriptor;
            i = 0;
        } else {
            super/*android.view.View*/.onDetachedFromWindow();
            onExtraCallback();
            findresandmsg = this.getInterfaceDescriptor;
            i = 1;
        }
        findRes.onExtraCallbackWithResult(findresandmsg, (CancellationException) null, i, (Object) null);
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = CollectionsKt.toList(this.onExtraCallback).iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).cancel();
            int i4 = access100 + 1;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        this.onExtraCallback.clear();
        getPackageType getpackagetype = this.IAuthTabCallbackDefault;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.IAuthTabCallbackDefault = null;
        int i6 = access100 + 61;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onExtraCallback(AdsCircularProgressBar adsCircularProgressBar, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            adsCircularProgressBar.setAlpha(((Float) animatedValue).floatValue());
            return;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        adsCircularProgressBar.setAlpha(((Float) animatedValue2).floatValue());
        throw null;
    }

    private final void IAuthTabCallback(final AdsCircularProgressBar adsCircularProgressBar) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(adsCircularProgressBar.getAlpha(), 0.0f);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        valueAnimatorOfFloat.setDuration(deprecated_certificatepinner.asInterface().IAuthTabCallback());
        valueAnimatorOfFloat.setInterpolator(deprecated_certificatepinner.asInterface());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AdsCircularCountdownLayout.onWarmupCompleted(adsCircularProgressBar, valueAnimator);
                int i5 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new IAuthTabCallback(adsCircularProgressBar));
        this.onExtraCallback.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
        int i2 = IAuthTabCallbackStubProxy + 3;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
    }

    private static final void onWarmupCompleted(TdsImageView tdsImageView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        tdsImageView.setAlpha(animatedFraction);
        tdsImageView.setScaleX(animatedFraction);
        tdsImageView.setScaleY(animatedFraction);
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(Function0<Unit> function0) {
        int i = 2 % 2;
        final TdsImageView tdsImageView = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        tdsImageView.setAlpha(0.0f);
        tdsImageView.setScaleX(0.0f);
        tdsImageView.setScaleY(0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onExtraCallbackWithResult());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 17;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    AdsCircularCountdownLayout.IAuthTabCallback(tdsImageView, valueAnimator);
                    int i4 = 64 / 0;
                } else {
                    AdsCircularCountdownLayout.IAuthTabCallback(tdsImageView, valueAnimator);
                }
                int i5 = onExtraCallbackWithResult + 105;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new onWarmupCompleted(function0));
        this.onExtraCallback.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
        int i2 = IAuthTabCallbackStubProxy + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Object systemService = getContext().getSystemService("accessibility");
        AccessibilityManager accessibilityManager = null;
        if (systemService instanceof AccessibilityManager) {
            int i2 = access100 + 37;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                accessibilityManager = (AccessibilityManager) systemService;
            } else {
                accessibilityManager.hashCode();
                throw null;
            }
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int i3 = IAuthTabCallbackStubProxy + 15;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(final String str) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        if (IAuthTabCallbackDefault()) {
            post(new Runnable() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 107;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    AdsCircularCountdownLayout.onExtraCallback(this.f$0, str);
                    int i6 = IAuthTabCallback + 125;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            int i3 = access100 + 61;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallbackWithResult(AdsCircularCountdownLayout adsCircularCountdownLayout, String str) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        adsCircularCountdownLayout.sendAccessibilityEvent(8);
        adsCircularCountdownLayout.announceForAccessibility(str);
        int i4 = IAuthTabCallbackStubProxy + 67;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        setContentDescription(str);
        IAuthTabCallback(str);
        int i4 = access100 + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            isFocusableInTouchMode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!isFocusableInTouchMode()) {
            int i3 = IAuthTabCallbackStubProxy + 37;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            setFocusableInTouchMode(true);
            int i5 = access100 + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!isFocusable()) {
            int i7 = access100 + 91;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            setFocusable(true);
        }
        requestFocus();
        sendAccessibilityEvent(8);
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.asBinder) {
            long j = this.onNavigationEvent;
            if (j > 0) {
                long jCoerceAtLeast = RangesKt.coerceAtLeast(j - SystemClock.elapsedRealtime(), 0L);
                int i4 = access100 + 35;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    return jCoerceAtLeast;
                }
                throw null;
            }
        }
        return RangesKt.coerceAtLeast(this.access000, 0L);
    }

    private final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        this.asBinder = false;
        this.access000 = j;
        this.onExtraCallbackWithResult.getRoot().setOnClickListener(new View.OnClickListener() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda12
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AdsCircularCountdownLayout.onExtraCallbackWithResult(view);
                int i5 = onWarmupCompleted + 35;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        this.onExtraCallbackWithResult.IAuthTabCallback.setAlpha(0.0f);
        this.onExtraCallbackWithResult.IAuthTabCallback.setScaleX(1.0f);
        this.onExtraCallbackWithResult.IAuthTabCallback.setScaleY(1.0f);
        AdsCircularProgressBar adsCircularProgressBar = this.onExtraCallbackWithResult.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(adsCircularProgressBar, "");
        adsCircularProgressBar.setVisibility(0);
        this.onExtraCallbackWithResult.onNavigationEvent.setAlpha(1.0f);
        Typography5 typography5 = this.onExtraCallbackWithResult.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(0);
        Typography5 typography52 = this.onExtraCallbackWithResult.asInterface;
        Intrinsics.checkNotNullExpressionValue(typography52, "");
        typography52.setVisibility(0);
        this.onExtraCallbackWithResult.onWarmupCompleted.setText(String.valueOf(IAuthTabCallback(j)));
        this.onExtraCallbackWithResult.asInterface.setText("");
        IAuthTabCallback(onExtraCallback(j));
        IAuthTabCallback();
        int i2 = access100 + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(AdsCircularCountdownLayout adsCircularCountdownLayout, String str, boolean z, boolean z2) {
        int i = 2 % 2;
        adsCircularCountdownLayout.onExtraCallbackWithResult.onWarmupCompleted.setText("");
        adsCircularCountdownLayout.onExtraCallbackWithResult.asInterface.setText("");
        adsCircularCountdownLayout.onNavigationEvent(str);
        if (z) {
            int i2 = access100;
            int i3 = i2 + 121;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 58 / 0;
                if (!adsCircularCountdownLayout.onWarmupCompleted) {
                    adsCircularCountdownLayout.onWarmupCompleted = true;
                    Function1<? super Boolean, Unit> function1 = adsCircularCountdownLayout.IAuthTabCallback_Parcel;
                    if (function1 != null) {
                        int i5 = i2 + 55;
                        IAuthTabCallbackStubProxy = i5 % 128;
                        if (i5 % 2 != 0) {
                            function1.invoke(Boolean.valueOf(z2));
                        } else {
                            function1.invoke(Boolean.valueOf(z2));
                            int i6 = 38 / 0;
                        }
                    }
                }
            } else if (!adsCircularCountdownLayout.onWarmupCompleted) {
            }
        }
        adsCircularCountdownLayout.asBinder = true;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(AdsCircularCountdownLayout adsCircularCountdownLayout, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = adsCircularCountdownLayout.IAuthTabCallbackStub;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (function0 != null) {
            function0.invoke();
            int i4 = access100 + 57;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(final boolean z, boolean z2, final String str, final boolean z3) {
        int i = 2 % 2;
        onExtraCallback();
        this.access000 = 0L;
        this.onNavigationEvent = 0L;
        this.onTransact = false;
        final Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AdsCircularCountdownLayout adsCircularCountdownLayout = this.f$0;
                if (i4 != 0) {
                    return AdsCircularCountdownLayout.onExtraCallback(adsCircularCountdownLayout, str, z3, z);
                }
                AdsCircularCountdownLayout.onExtraCallback(adsCircularCountdownLayout, str, z3, z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        if (z2) {
            Typography5 typography5 = this.onExtraCallbackWithResult.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(typography5, "");
            typography5.setVisibility(8);
            Typography5 typography52 = this.onExtraCallbackWithResult.asInterface;
            Intrinsics.checkNotNullExpressionValue(typography52, "");
            typography52.setVisibility(8);
            this.onExtraCallbackWithResult.onWarmupCompleted.setText("");
            this.onExtraCallbackWithResult.asInterface.setText("");
            AdsCircularProgressBar adsCircularProgressBar = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(adsCircularProgressBar, "");
            IAuthTabCallback(adsCircularProgressBar);
            onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda10
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 89;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Object[] objArr = {this.f$0, function0};
                    int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                    Unit unit = (Unit) AdsCircularCountdownLayout.onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1778418477, -1778418475, iOnNavigationEvent);
                    int i5 = onNavigationEvent + 103;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }
            });
            int i2 = IAuthTabCallbackStubProxy + 101;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallback(str);
        function0.invoke();
        int i3 = IAuthTabCallbackStubProxy + 125;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AdsCircularCountdownLayout adsCircularCountdownLayout = (AdsCircularCountdownLayout) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Function0<Unit> function0 = adsCircularCountdownLayout.IAuthTabCallbackStub;
            throw null;
        }
        Function0<Unit> function02 = adsCircularCountdownLayout.IAuthTabCallbackStub;
        if (function02 != null) {
            function02.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 19;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        AdsCircularProgressBar adsCircularProgressBar = this.onExtraCallbackWithResult.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(adsCircularProgressBar, "");
        adsCircularProgressBar.setVisibility(8);
        this.onExtraCallbackWithResult.onNavigationEvent.setAlpha(0.0f);
        Typography5 typography5 = this.onExtraCallbackWithResult.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(typography5, "");
        typography5.setVisibility(8);
        Typography5 typography52 = this.onExtraCallbackWithResult.asInterface;
        Intrinsics.checkNotNullExpressionValue(typography52, "");
        typography52.setVisibility(8);
        TdsImageView tdsImageView = this.onExtraCallbackWithResult.IAuthTabCallback;
        tdsImageView.setAlpha(1.0f);
        tdsImageView.setScaleX(1.0f);
        tdsImageView.setScaleY(1.0f);
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        View root = this.onExtraCallbackWithResult.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, root, false, null, 0, null, null, 0.0f, 0.98f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 39;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = AdsCircularCountdownLayout.onNavigationEvent(this.f$0, (MotionEvent) obj);
                int i5 = onExtraCallbackWithResult + 93;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        }, 4030, null);
        IAuthTabCallback();
        onNavigationEvent(str);
        int i2 = access100 + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final float onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j2 = this.asInterface;
        if (j2 <= 0) {
            int i5 = i3 + 37;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return 1.0f;
        }
        float f = 1.0f - (j / j2);
        int i7 = i3 + 123;
        IAuthTabCallbackStubProxy = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 67 / 0;
        }
        return f;
    }

    private final int IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        return RangesKt.coerceAtLeast((int) (i2 % 2 == 0 ? j ^ 15 : (j + 999) / 1000), 0);
    }

    public final void setCloseGradientVisible(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 105;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            TdsRadialGradientView tdsRadialGradientView = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsRadialGradientView, "");
            if (!z) {
                i = 8;
            } else {
                int i4 = access100 + 27;
                int i5 = i4 % 128;
                IAuthTabCallbackStubProxy = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 125;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                i = 0;
            }
            tdsRadialGradientView.setVisibility(i);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(this.onExtraCallbackWithResult.onExtraCallbackWithResult, "");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a0, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        r4.width = r9;
        r4.height = r9;
        r3.setLayoutParams(r4);
        r9 = im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout.IAuthTabCallbackStubProxy + 99;
        im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout.access100 = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b8, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008b, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setV2Style(boolean z) {
        AdsCircularProgressBar adsCircularProgressBar;
        ViewGroup.LayoutParams layoutParams;
        int i = 2 % 2;
        if (!z) {
            this.onExtraCallbackWithResult.onWarmupCompleted.setTextSize(1, 18.0f);
            this.onExtraCallbackWithResult.asInterface.setTextSize(1, 18.0f);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            setCloseBackgroundColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).requestPostMessageChannel().onMinimized());
            setCloseGradientVisible(true);
            this.onExtraCallbackWithResult.onNavigationEvent.setV2Style(false);
            int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, 40);
            TdsRoundLayout tdsRoundLayout = this.onExtraCallbackWithResult.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            ViewGroup.LayoutParams layoutParams2 = tdsRoundLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = iOnExtraCallbackWithResult;
            layoutParams2.height = iOnExtraCallbackWithResult;
            tdsRoundLayout.setLayoutParams(layoutParams2);
            AdsCircularProgressBar adsCircularProgressBar2 = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(adsCircularProgressBar2, "");
            ViewGroup.LayoutParams layoutParams3 = adsCircularProgressBar2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i2 = IAuthTabCallbackStubProxy + 13;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                layoutParams3.width = iOnExtraCallbackWithResult;
                layoutParams3.height = iOnExtraCallbackWithResult;
                adsCircularProgressBar2.setLayoutParams(layoutParams3);
                return;
            } else {
                layoutParams3.width = iOnExtraCallbackWithResult;
                layoutParams3.height = iOnExtraCallbackWithResult;
                adsCircularProgressBar2.setLayoutParams(layoutParams3);
                int i3 = 73 / 0;
                return;
            }
        }
        this.onExtraCallbackWithResult.onWarmupCompleted.setTextSize(1, 16.0f);
        this.onExtraCallbackWithResult.asInterface.setTextSize(1, 16.0f);
        this.onExtraCallbackWithResult.onExtraCallback.setStrokeWidth(0.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        setCloseBackgroundColor(new getUrlokhttp(new onExtraCallback(configuration2)).requestPostMessageChannel().onUnminimized());
        setCloseGradientVisible(false);
        this.onExtraCallbackWithResult.onNavigationEvent.setV2Style(true);
        int iOnExtraCallbackWithResult2 = setTagsokhttp.onExtraCallbackWithResult(this, 36);
        TdsRoundLayout tdsRoundLayout2 = this.onExtraCallbackWithResult.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        ViewGroup.LayoutParams layoutParams4 = tdsRoundLayout2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i4 = IAuthTabCallbackStubProxy + 31;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            layoutParams4.width = iOnExtraCallbackWithResult2;
            layoutParams4.height = iOnExtraCallbackWithResult2;
            tdsRoundLayout2.setLayoutParams(layoutParams4);
            adsCircularProgressBar = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(adsCircularProgressBar, "");
            layoutParams = adsCircularProgressBar.getLayoutParams();
            int i5 = 75 / 0;
        } else {
            layoutParams4.width = iOnExtraCallbackWithResult2;
            layoutParams4.height = iOnExtraCallbackWithResult2;
            tdsRoundLayout2.setLayoutParams(layoutParams4);
            adsCircularProgressBar = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(adsCircularProgressBar, "");
            layoutParams = adsCircularProgressBar.getLayoutParams();
        }
    }

    public static /* synthetic */ void onNavigationEvent(AdsCircularCountdownLayout adsCircularCountdownLayout, long j, ValueAnimator valueAnimator) {
        Object[] objArr = {adsCircularCountdownLayout, Long.valueOf(j), valueAnimator};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 830922377, -830922377, iOnNavigationEvent);
    }

    public static /* synthetic */ void IAuthTabCallback(Typography5 typography5, ValueAnimator valueAnimator) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{typography5, valueAnimator}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), -1857493238, 1857493239, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onNavigationEvent(AdsCircularCountdownLayout adsCircularCountdownLayout, Function0 function0) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{adsCircularCountdownLayout, function0}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), 1778418477, -1778418475, iOnNavigationEvent);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AdsCircularCountdownLayout adsCircularCountdownLayout, boolean z, boolean z2, String str, boolean z3) {
        Object[] objArr = {adsCircularCountdownLayout, Boolean.valueOf(z), Boolean.valueOf(z2), str, Boolean.valueOf(z3)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -365925309, 365925315, iOnNavigationEvent);
    }

    public static final /* synthetic */ int onWarmupCompleted(AdsCircularCountdownLayout adsCircularCountdownLayout, long j) {
        Object[] objArr = {adsCircularCountdownLayout, Long.valueOf(j)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return ((Integer) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -518311331, 518311336, iOnNavigationEvent)).intValue();
    }

    private static final Unit IAuthTabCallback(AdsCircularCountdownLayout adsCircularCountdownLayout, Function0 function0) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{adsCircularCountdownLayout, function0}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), 489840145, -489840136, iOnNavigationEvent);
    }

    private final float IAuthTabCallbackStub() {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return ((Float) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), 859454274, -859454271, iOnNavigationEvent)).floatValue();
    }

    private final void onWarmupCompleted(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -395257935, 395257943, iOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(AdsCircularCountdownLayout adsCircularCountdownLayout, MotionEvent motionEvent) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{adsCircularCountdownLayout, motionEvent}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), -1043572070, 1043572074, iOnNavigationEvent);
    }

    private static final void IAuthTabCallbackDefault(Typography5 typography5, ValueAnimator valueAnimator) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        onExtraCallbackWithResult(setCurrentIndex.onNavigationEvent(), new Object[]{typography5, valueAnimator}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent(), 208338486, -208338479, iOnNavigationEvent);
    }
}
