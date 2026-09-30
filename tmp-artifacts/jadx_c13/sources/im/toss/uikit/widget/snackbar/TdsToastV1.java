package im.toss.uikit.widget.snackbar;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Insets;
import android.graphics.PointF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.snackbar.ContentViewCallback;
import com.tmoney.a;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.TabBar;
import im.toss.uikit.widget.snackbar.BaseTransientBar;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import o.AFj1rSDKExternalSyntheticLambda0;
import o.AFj1rSDKExternalSyntheticLambda1;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConnectionPool;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.OkHttpClientCompanion;
import o.RecomposerawaitIdle2;
import o.RequestBodyCompanion;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.accessgetDEFAULT_PROTOCOLScp;
import o.accessgetINSTANCEScp;
import o.accessgetORDER_BY_NAMEcp;
import o.authParams;
import o.deprecated_authenticator;
import o.deprecated_cookieJar;
import o.deprecated_followRedirects;
import o.eExternalSyntheticLambda0;
import o.getCurrentBacktraceOrBuilderList;
import o.getDelegateokhttp;
import o.getKekid;
import o.hasVaryAll;
import o.onBackPressedDispatcher_delegatelambda0;
import o.onBackPressedDispatcher_delegatelambda00;
import o.pin;
import o.readIntokhttp;
import o.setBuildUuid;
import o.setDnsokhttp;
import o.setProtocolsokhttp;
import o.varyFields;
import o.varyMatches;
import o.verifyClientState;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsToastV1 extends BaseTransientBar<TdsToastV1> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static boolean asInterface = false;
    private static int[] onActivityLayout = null;
    private static int onActivityResized = 0;
    public static final int onExtraCallbackWithResult;
    private static int onRelationshipValidationResult = 1;
    private View.OnClickListener IAuthTabCallbackDefault;
    private final CardView IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private final TdsImageView IAuthTabCallback_Parcel;
    private Function0<Unit> ICustomTabsCallback;
    private boolean access000;
    private final Handler access100;
    private final BaseTextView asBinder;
    private boolean extraCallback;
    private int extraCallbackWithResult;
    private final View getInterfaceDescriptor;
    private final TdsRoundLayout onMessageChannelReady;
    private int onMinimized;
    private final BaseTextView onPostMessage;
    private final Lazy onTransact;
    private final FrameLayout readTypedObject;
    private final LottieAnimationView writeTypedObject;

    public interface IAuthTabCallback {
        void onClick(@NotNull TdsToastV1 tdsToastV1);
    }

    static {
        ICustomTabsCallback();
        Companion = new onWarmupCompleted(null);
        onExtraCallbackWithResult = 8;
        int i = ICustomTabsCallbackDefault + 79;
        onRelationshipValidationResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    public /* synthetic */ TdsToastV1(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, view, contentViewCallback);
    }

    public static /* synthetic */ onExtraCallbackWithResult onExtraCallback(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 43;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresultAccess100 = access100(tdsToastV1);
        int i4 = ICustomTabsCallbackStubProxy + 93;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallbackwithresultAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        TdsToastV1 tdsToastV1;
        String strIntern;
        TdsImageView tdsImageView;
        Function1 function1;
        Function1 function12;
        int i7;
        int i8 = ~i4;
        int i9 = ~((~i) | i8);
        int i10 = ~i6;
        int i11 = ~(i10 | i4);
        int i12 = ~(i8 | i6);
        int i13 = i9 | i11 | i12;
        int i14 = ~(i10 | i8 | i);
        int i15 = (~(i | i8)) | i11 | i12;
        int i16 = i6 + i4 + i5 + (2052055731 * i2) + (1687666023 * i3);
        int i17 = i16 * i16;
        int i18 = (i6 * (-1966771951)) + 1000013824 + ((-1966771951) * i4) + ((-617538080) * i13) + ((-926307120) * i14) + (308769040 * i15) + (2019426304 * i5) + (632946688 * i2) + ((-741212160) * i3) + (2121465856 * i17);
        int i19 = (i6 * 1533266457) + 1248777597 + (i4 * 1533266457) + (i13 * (-800)) + (i14 * (-1200)) + (i15 * 400) + (i5 * 1533266057) + (i2 * 706030027) + (i3 * 1023530015) + (i17 * (-2088042496));
        switch (i18 + (i19 * i19 * 1434255360)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                TdsToastV1 tdsToastV12 = (TdsToastV1) objArr[0];
                int i20 = 2 % 2;
                int i21 = onActivityResized + 21;
                ICustomTabsCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                boolean zExtraCallback = tdsToastV12.extraCallback();
                int i23 = ICustomTabsCallbackStubProxy + 53;
                onActivityResized = i23 % 128;
                int i24 = i23 % 2;
                return Boolean.valueOf(zExtraCallback);
            case 5:
                tdsToastV1 = (TdsToastV1) objArr[0];
                int i25 = 2 % 2;
                if (((Number) objArr[1]).intValue() == 0) {
                    int i26 = onActivityResized + 37;
                    ICustomTabsCallbackStubProxy = i26 % 128;
                    int i27 = i26 % 2;
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-1177405691, 1868488940, -1256561685, -173535406, -1771441339, 1335107121, -845442441, -1812388589, 1010375659, 1544755684, -1207194527, -1987749473, 690631136, 938957246, 2048490175, -2104569867, -1056050633, -1107061729, -1803220842, -246933920, 1790148726, -297187247, 1344652157, -1216088045, -808754624, -1545347179, -1367100153, 1085175622, 804845567, -2093373729}, 59 - Gravity.getAbsoluteGravity(0, 0), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    int i28 = onActivityResized + 49;
                    ICustomTabsCallbackStubProxy = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new int[]{-1177405691, 1868488940, -1256561685, -173535406, -1771441339, 1335107121, -845442441, -1812388589, 1010375659, 1544755684, -1207194527, -1987749473, 690631136, 938957246, 2048490175, -2104569867, -1056050633, -1107061729, -1734939460, -509865534, 1857839406, 1947111203, 1402840319, 190368073, -2030210710, -780073136, -1269848001, -892763091, 1692568176, 517999107}, TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 60, objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                }
                tdsToastV1.writeTypedObject.setAnimationFromUrl(strIntern);
                tdsToastV1.writeTypedObject.setVisibility(0);
                break;
            case 6:
                TdsToastV1 tdsToastV13 = (TdsToastV1) objArr[0];
                int i30 = 2 % 2;
                int i31 = onActivityResized;
                int i32 = i31 + 103;
                ICustomTabsCallbackStubProxy = i32 % 128;
                int i33 = i32 % 2;
                boolean z = tdsToastV13.IAuthTabCallbackStubProxy;
                int i34 = i31 + 13;
                ICustomTabsCallbackStubProxy = i34 % 128;
                int i35 = i34 % 2;
                return Boolean.valueOf(z);
            case 7:
                return onExtraCallbackWithResult(objArr);
            case 8:
                return onExtraCallback(objArr);
            default:
                tdsToastV1 = (TdsToastV1) objArr[0];
                RecomposerawaitIdle2.onNavigationEvent onnavigationevent = (RecomposerawaitIdle2.onNavigationEvent) objArr[1];
                int i36 = 2 % 2;
                int i37 = ICustomTabsCallbackStubProxy + 93;
                onActivityResized = i37 % 128;
                if (i37 % 2 != 0) {
                    tdsToastV1.IAuthTabCallback_Parcel.setVisibility(1);
                    tdsImageView = tdsToastV1.IAuthTabCallback_Parcel;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    function1 = null;
                    function12 = null;
                    i7 = Imgproc.COLOR_YUV2BGR_YVYU;
                } else {
                    tdsToastV1.IAuthTabCallback_Parcel.setVisibility(0);
                    tdsImageView = tdsToastV1.IAuthTabCallback_Parcel;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    function1 = null;
                    function12 = null;
                    i7 = 6;
                }
                TdsImageView.setImage$default(tdsImageView, onnavigationevent, function1, function12, i7, (Object) null);
                break;
        }
        return tdsToastV1;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tdsToastV1, view);
        if (i3 != 0) {
            return null;
        }
        int i4 = 29 / 0;
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, TdsToastV1 tdsToastV1, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(iAuthTabCallback, tdsToastV1, view);
        int i4 = onActivityResized + 125;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(tdsToastV1);
        int i4 = ICustomTabsCallbackStubProxy + 97;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ getDelegateokhttp onNavigationEvent(Context context, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 23;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getDelegateokhttp getdelegateokhttpOnWarmupCompleted = onWarmupCompleted(context, f);
        int i4 = onActivityResized + 5;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return getdelegateokhttpOnWarmupCompleted;
    }

    private TdsToastV1(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(viewGroup, view, contentViewCallback);
        this.getInterfaceDescriptor = view;
        TdsRoundLayout tdsRoundLayoutFindViewById = this.onExtraCallback.findViewById(R.id.root);
        if (tdsRoundLayoutFindViewById == null) {
            int i = ICustomTabsCallbackStubProxy + 87;
            onActivityResized = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
            tdsRoundLayoutFindViewById = null;
        }
        this.onMessageChannelReady = tdsRoundLayoutFindViewById;
        this.IAuthTabCallback_Parcel = this.onExtraCallback.findViewById(R.id.icon);
        this.writeTypedObject = this.onExtraCallback.findViewById(R.id.lottie);
        this.readTypedObject = (FrameLayout) this.onExtraCallback.findViewById(R.id.left_content);
        this.onPostMessage = this.onExtraCallback.findViewById(R.id.text);
        this.IAuthTabCallbackStub = this.onExtraCallback.findViewById(R.id.button_layout);
        this.asBinder = this.onExtraCallback.findViewById(R.id.button_content);
        this.extraCallbackWithResult = IAuthTabCallback();
        this.access100 = new Handler(Looper.getMainLooper());
        this.onTransact = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 85;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                TdsToastV1 tdsToastV1 = this.f$0;
                if (i5 != 0) {
                    return TdsToastV1.onExtraCallback(tdsToastV1);
                }
                TdsToastV1.onExtraCallback(tdsToastV1);
                throw null;
            }
        });
        onMinimized();
        IAuthTabCallback(new BaseTransientBar.onExtraCallbackWithResult<TdsToastV1>() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1.1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // im.toss.uikit.widget.snackbar.BaseTransientBar.onExtraCallbackWithResult
            public void onWarmupCompleted(int i3) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 65;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    super.onWarmupCompleted(i3);
                } else {
                    super.onWarmupCompleted(i3);
                }
                onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
                TdsToastV1.onWarmupCompleted(false);
                int i6 = onWarmupCompleted + 13;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // im.toss.uikit.widget.snackbar.BaseTransientBar.onExtraCallbackWithResult
            public void IAuthTabCallback() {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 13;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                super.IAuthTabCallback();
                onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
                TdsToastV1.onWarmupCompleted(true);
                int i6 = onWarmupCompleted + 27;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = ICustomTabsCallbackStubProxy + 71;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ TdsToastV1 IAuthTabCallback(TdsToastV1 tdsToastV1, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 19;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = {tdsToastV1, Integer.valueOf(i)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        if (i4 != 0) {
            throw null;
        }
        TdsToastV1 tdsToastV12 = (TdsToastV1) onExtraCallback(iOnNavigationEvent, iOnNavigationEvent3, objArr, iOnNavigationEvent4, -300767228, iOnNavigationEvent2, 300767233);
        int i5 = onActivityResized + 75;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return tdsToastV12;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ TdsToastV1 IAuthTabCallback(TdsToastV1 tdsToastV1, String str) {
        int i = 2 % 2;
        int i2 = onActivityResized + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return tdsToastV1.onNavigationEvent(str);
        }
        tdsToastV1.onNavigationEvent(str);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 69;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        BaseTextView baseTextView = tdsToastV1.onPostMessage;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 115;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return baseTextView;
    }

    public static final /* synthetic */ void IAuthTabCallback(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 61;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        tdsToastV1.readTypedObject();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(TdsToastV1 tdsToastV1, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 111;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        tdsToastV1.access000 = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 119;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
    }

    public static final /* synthetic */ TdsRoundLayout IAuthTabCallback_Parcel(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = onActivityResized + 25;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        TdsRoundLayout tdsRoundLayout = tdsToastV1.onMessageChannelReady;
        int i5 = i3 + 19;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return tdsRoundLayout;
    }

    public static final /* synthetic */ boolean access100() {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ LottieAnimationView asBinder(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 73;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        LottieAnimationView lottieAnimationView = tdsToastV1.writeTypedObject;
        int i5 = i2 + 111;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return lottieAnimationView;
    }

    public static final /* synthetic */ FrameLayout asInterface(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = tdsToastV1.readTypedObject;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 23;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return frameLayout;
    }

    public static final /* synthetic */ TdsToastV1 onExtraCallback(TdsToastV1 tdsToastV1, RecomposerawaitIdle2.onNavigationEvent onnavigationevent) {
        TdsToastV1 tdsToastV12;
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            tdsToastV12 = (TdsToastV1) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1, onnavigationevent}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1941918142, iOnNavigationEvent2, -1941918142);
            int i3 = 79 / 0;
        } else {
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            tdsToastV12 = (TdsToastV1) onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1, onnavigationevent}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1941918142, iOnNavigationEvent4, -1941918142);
        }
        int i4 = ICustomTabsCallbackStubProxy + 35;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return tdsToastV12;
    }

    public static final /* synthetic */ TdsToastV1 onExtraCallbackWithResult(TdsToastV1 tdsToastV1, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 23;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            tdsToastV1.IAuthTabCallbackStub(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsToastV1 tdsToastV1IAuthTabCallbackStub = tdsToastV1.IAuthTabCallbackStub(i);
        int i4 = onActivityResized + 25;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return tdsToastV1IAuthTabCallbackStub;
    }

    public static final /* synthetic */ TdsToastV1 onExtraCallbackWithResult(TdsToastV1 tdsToastV1, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        TdsToastV1 tdsToastV12 = (TdsToastV1) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1, charSequence}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1021957349, iOnNavigationEvent2, 1021957356);
        int i4 = onActivityResized + 79;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return tdsToastV12;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsToastV1 tdsToastV1, Function0 function0) {
        int i = 2 % 2;
        int i2 = onActivityResized + 123;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        tdsToastV1.ICustomTabsCallback = function0;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 125;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CardView onNavigationEvent(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 37;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        CardView cardView = tdsToastV1.IAuthTabCallbackStub;
        int i5 = i2 + 31;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return cardView;
    }

    public static final /* synthetic */ TdsToastV1 onNavigationEvent(TdsToastV1 tdsToastV1, String str) {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsToastV1 tdsToastV1OnWarmupCompleted = tdsToastV1.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return tdsToastV1OnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 111;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        tdsToastV1.IAuthTabCallbackStubProxy = zBooleanValue;
        int i5 = i3 + 93;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return null;
    }

    public static final /* synthetic */ Handler onTransact(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        Handler handler = tdsToastV1.access100;
        int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    public static final /* synthetic */ BaseTextView onWarmupCompleted(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        BaseTextView baseTextView = tdsToastV1.asBinder;
        if (i4 == 0) {
            int i5 = 31 / 0;
        }
        int i6 = i3 + 123;
        onActivityResized = i6 % 128;
        int i7 = i6 % 2;
        return baseTextView;
    }

    public static final /* synthetic */ TdsToastV1 onWarmupCompleted(TdsToastV1 tdsToastV1, CharSequence charSequence, IAuthTabCallback iAuthTabCallback, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 41;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsToastV1 tdsToastV1OnExtraCallback = tdsToastV1.onExtraCallback(charSequence, iAuthTabCallback, z);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 85;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return tdsToastV1OnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 73;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        TdsImageView tdsImageView = tdsToastV1.IAuthTabCallback_Parcel;
        int i5 = i2 + 87;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return tdsImageView;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 15;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        asInterface = z;
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // im.toss.uikit.widget.snackbar.BaseTransientBar
    public /* synthetic */ BaseTransientBar onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder(i);
        }
        asBinder(i);
        throw null;
    }

    public final View writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 109;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view = this.getInterfaceDescriptor;
        int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public static final class onExtraCallbackWithResult extends AccessibilityDelegateCompat {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        onExtraCallbackWithResult() {
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(accessibilityEvent, "");
            Object[] objArr = {TdsToastV1.this};
            if (((Boolean) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1213177146, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1213177142)).booleanValue()) {
                int i2 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.id.root), Integer.valueOf(R.id.button_layout)}).contains(Integer.valueOf(view.getId()))) {
                    if (accessibilityEvent.getEventType() == 32768) {
                        TdsToastV1.onTransact(TdsToastV1.this).removeCallbacksAndMessages(null);
                        int i4 = onExtraCallbackWithResult + 125;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 3 / 3;
                        }
                    } else if (accessibilityEvent.getEventType() == 65536) {
                        int i6 = onExtraCallbackWithResult + 125;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        TdsToastV1.IAuthTabCallback(TdsToastV1.this);
                    }
                }
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    private final onExtraCallbackWithResult extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityResized + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) this.onTransact.getValue();
        int i4 = ICustomTabsCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return onextracallbackwithresult;
    }

    private static final onExtraCallbackWithResult access100(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = tdsToastV1.new onExtraCallbackWithResult();
        int i2 = ICustomTabsCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }

    private static final getDelegateokhttp onWarmupCompleted(Context context, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullExpressionValue(context.getResources().getConfiguration(), "");
        if (!readIntokhttp.IAuthTabCallback(r2)) {
            return getDelegateokhttp.Companion.onExtraCallback();
        }
        int i2 = ICustomTabsCallbackStubProxy + 45;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            getDelegateokhttp.Companion.onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getDelegateokhttp getdelegateokhttpOnTransact = getDelegateokhttp.Companion.onTransact();
        int i3 = ICustomTabsCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return getdelegateokhttpOnTransact;
    }

    private final void onMinimized() {
        int i = 2 % 2;
        BaseTransientBar.SnackbarBaseLayout snackbarBaseLayout = this.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(snackbarBaseLayout, "");
        setProtocolsokhttp.onExtraCallbackWithResult(snackbarBaseLayout, extraCallbackWithResult());
        setDnsokhttp setdnsokhttp = new setDnsokhttp() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final getDelegateokhttp resolve(Context context, float f) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getDelegateokhttp getdelegateokhttpOnNavigationEvent = TdsToastV1.onNavigationEvent(context, f);
                int i5 = onNavigationEvent + 19;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return getdelegateokhttpOnNavigationEvent;
                }
                throw null;
            }
        };
        this.onPostMessage.onNavigationEvent(setdnsokhttp);
        this.asBinder.onNavigationEvent(setdnsokhttp);
        this.onPostMessage.setImportantForAccessibility(2);
        int i2 = onActivityResized + 75;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onActivityLayout;
        char c = '0';
        int i6 = -1469660336;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $11 + 123;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i9 = $11 + 49;
                $10 = i9 % 128;
                if (i9 % i4 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), 'x' - AndroidCharacter.getMirror(c), 8848 - (ViewConfiguration.getTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), View.MeasureSpec.getSize(0) + 72, Gravity.getAbsoluteGravity(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i3++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 2;
                c = '0';
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onActivityLayout;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i7] = Integer.valueOf(iArr5[i10]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, i7), TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, i7) + 72, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i10++;
                i6 = -1469660336;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = $11 + 115;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                try {
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 22253), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, (Process.myPid() >> 22) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 4034), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 78, View.MeasureSpec.getMode(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (extraCallback()) {
            int i4 = ICustomTabsCallbackStubProxy + 83;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            TdsRoundLayout tdsRoundLayout = this.onMessageChannelReady;
            if (tdsRoundLayout != null && tdsRoundLayout.hasFocus()) {
                int i5 = ICustomTabsCallbackStubProxy + 69;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
            } else {
                if (this.IAuthTabCallbackStub.hasFocus()) {
                    return;
                }
                this.access100.postDelayed(new Runnable() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 107;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        TdsToastV1.onExtraCallbackWithResult(this.f$0);
                        int i10 = IAuthTabCallback + 55;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 12 / 0;
                        }
                    }
                }, 30000L);
                int i7 = ICustomTabsCallbackStubProxy + 77;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    private static final void getInterfaceDescriptor(TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        if (tdsToastV1.IAuthTabCallbackStub()) {
            int i2 = ICustomTabsCallbackStubProxy + 43;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            tdsToastV1.onExtraCallback();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = ICustomTabsCallbackStubProxy + 1;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.uikit.widget.snackbar.BaseTransientBar
    protected void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 27;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            super.getInterfaceDescriptor();
            int i3 = 93 / 0;
            if (!extraCallback()) {
                return;
            }
        } else {
            super.getInterfaceDescriptor();
            if (!extraCallback()) {
                return;
            }
        }
        TdsRoundLayout tdsRoundLayout = this.onMessageChannelReady;
        if (tdsRoundLayout != null) {
            tdsRoundLayout.announceForAccessibility(onWarmupCompleted().getString(R.string.uikit_accessibility_button_shown));
            int i4 = onActivityResized + 87;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // im.toss.uikit.widget.snackbar.BaseTransientBar
    protected int onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 71;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onMinimized;
        int i6 = i2 + 21;
        onActivityResized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
        return i5;
    }

    private static final void onExtraCallbackWithResult(TdsToastV1 tdsToastV1, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        tdsToastV1.onExtraCallback();
        int i4 = ICustomTabsCallbackStubProxy + 19;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
    }

    @Override // im.toss.uikit.widget.snackbar.BaseTransientBar
    public void IAuthTabCallback_Parcel() {
        TdsRoundLayout tdsRoundLayout;
        int i = 2 % 2;
        if (this.access000) {
            int i2 = ICustomTabsCallbackStubProxy + 39;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            if (asInterface) {
                Function0<Unit> function0 = this.ICustomTabsCallback;
                if (function0 != null) {
                    int i5 = i3 + 125;
                    ICustomTabsCallbackStubProxy = i5 % 128;
                    if (i5 % 2 != 0) {
                        function0.invoke();
                        return;
                    } else {
                        function0.invoke();
                        int i6 = 46 / 0;
                        return;
                    }
                }
                return;
            }
        }
        if (extraCallback()) {
            super.onExtraCallback(-2);
            TdsRoundLayout tdsRoundLayout2 = this.onMessageChannelReady;
            if (tdsRoundLayout2 != null) {
                tdsRoundLayout2.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws Throwable {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 3;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            Object[] objArr = {this.f$0, view};
                            TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 107101012, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -107101004);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Object[] objArr2 = {this.f$0, view};
                        TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr2, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 107101012, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -107101004);
                        int i9 = IAuthTabCallback + 69;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 36 / 0;
                        }
                    }
                });
            }
            TdsRoundLayout tdsRoundLayout3 = this.onMessageChannelReady;
            if (tdsRoundLayout3 != null) {
                int i7 = ICustomTabsCallbackStubProxy + 3;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
                SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback = SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
                setProtocolsokhttp.IAuthTabCallback(tdsRoundLayout3, iAuthTabCallback, onWarmupCompleted().getString(R.string.uikit_content_desc_close));
                int i9 = onActivityResized + 9;
                ICustomTabsCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
            }
            readTypedObject();
        } else {
            if (!this.extraCallback && (tdsRoundLayout = this.onMessageChannelReady) != null) {
                int i11 = onActivityResized + 71;
                ICustomTabsCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.checkNotNullExpressionValue(onWarmupCompleted(), "");
                tdsRoundLayout.setClickable(!varyFields.onWarmupCompleted(r3));
                int i13 = onActivityResized + 73;
                ICustomTabsCallbackStubProxy = i13 % 128;
                int i14 = i13 % 2;
            }
            Intrinsics.checkNotNull(super.onExtraCallback(this.extraCallbackWithResult));
        }
        super.IAuthTabCallback_Parcel();
    }

    public TdsToastV1 asBinder(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 65;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallbackWithResult = i;
        BaseTransientBar baseTransientBarOnExtraCallback = super.onExtraCallback(i);
        Intrinsics.checkNotNullExpressionValue(baseTransientBarOnExtraCallback, "");
        TdsToastV1 tdsToastV1 = (TdsToastV1) baseTransientBarOnExtraCallback;
        int i5 = ICustomTabsCallbackStubProxy + 77;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return tdsToastV1;
    }

    public final void IAuthTabCallbackDefault(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy;
        int i4 = i3 + 17;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        this.onMinimized = i;
        int i6 = i3 + 61;
        onActivityResized = i6 % 128;
        int i7 = i6 % 2;
    }

    private final TdsToastV1 IAuthTabCallbackStub(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 93;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback_Parcel.setImageResource(i);
        } else {
            this.IAuthTabCallback_Parcel.setImageResource(i);
        }
        this.IAuthTabCallback_Parcel.setVisibility(0);
        int i4 = ICustomTabsCallbackStubProxy + 57;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return this;
    }

    private final TdsToastV1 onNavigationEvent(String str) {
        TdsImageView tdsImageView;
        Function1 function1;
        Function1 function12;
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 73;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback_Parcel.setVisibility(1);
            tdsImageView = this.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            function1 = null;
            function12 = null;
            i = 0;
        } else {
            this.IAuthTabCallback_Parcel.setVisibility(0);
            tdsImageView = this.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            function1 = null;
            function12 = null;
            i = 6;
        }
        TdsImageView.setImage$default(tdsImageView, str, function1, function12, i, (Object) null);
        return this;
    }

    private final TdsToastV1 onWarmupCompleted(String str) {
        LottieAnimationView lottieAnimationView;
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 23;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            this.writeTypedObject.setAnimationFromUrl(str);
            lottieAnimationView = this.writeTypedObject;
            i = 1;
        } else {
            this.writeTypedObject.setAnimationFromUrl(str);
            lottieAnimationView = this.writeTypedObject;
            i = 0;
        }
        lottieAnimationView.setVisibility(i);
        return this;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        tdsToastV1.onPostMessage.setText(charSequence);
        TdsRoundLayout tdsRoundLayout = tdsToastV1.onMessageChannelReady;
        if (tdsRoundLayout != null) {
            int i2 = onActivityResized + 5;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            tdsRoundLayout.setContentDescription(charSequence);
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            int i5 = onActivityResized + 53;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        return tdsToastV1;
    }

    private static final void onNavigationEvent(IAuthTabCallback iAuthTabCallback, TdsToastV1 tdsToastV1, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        iAuthTabCallback.onClick(tdsToastV1);
        if (!tdsToastV1.IAuthTabCallbackStubProxy) {
            int i4 = ICustomTabsCallbackStubProxy + 17;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            if (!tdsToastV1.extraCallback()) {
                return;
            }
        }
        tdsToastV1.onExtraCallback();
    }

    private final TdsToastV1 onExtraCallback(CharSequence charSequence, final IAuthTabCallback iAuthTabCallback, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 1;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = iAuthTabCallback != null ? new View.OnClickListener() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 5;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                TdsToastV1.onExtraCallbackWithResult(iAuthTabCallback, this, view);
                int i7 = onExtraCallback + 79;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        } : null;
        this.extraCallback = z;
        this.asBinder.setText(charSequence);
        CardView cardView = this.IAuthTabCallbackStub;
        cardView.setVisibility(0);
        cardView.setOnClickListener(this.IAuthTabCallbackDefault);
        if (!(!z)) {
            int i4 = ICustomTabsCallbackStubProxy + 83;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            TdsRoundLayout tdsRoundLayout = this.onMessageChannelReady;
            if (tdsRoundLayout != null) {
                tdsRoundLayout.setOnClickListener(this.IAuthTabCallbackDefault);
            }
            this.onExtraCallback.setOnTouchListener(null);
        }
        CardView cardView2 = this.IAuthTabCallbackStub;
        float f = this.onMinimized == 1 ? 16.0f : 999.0f;
        Intrinsics.checkNotNullExpressionValue(onWarmupCompleted().getResources().getDisplayMetrics(), "");
        cardView2.setRadius(varyMatches.onNavigationEvent(Float.valueOf(f), r7));
        return this;
    }

    static final class onExtraCallback implements ContentViewCallback {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final LottieAnimationView onExtraCallback;
        private final CardView onExtraCallbackWithResult;
        private final TextView onNavigationEvent;

        public onExtraCallback(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            LottieAnimationView lottieAnimationViewFindViewById = view.findViewById(R.id.lottie);
            Intrinsics.checkNotNull(lottieAnimationViewFindViewById, "");
            this.onExtraCallback = lottieAnimationViewFindViewById;
            View viewFindViewById = view.findViewById(R.id.text);
            Intrinsics.checkNotNull(viewFindViewById, "");
            this.onNavigationEvent = (TextView) viewFindViewById;
            CardView cardViewFindViewById = view.findViewById(R.id.button_layout);
            Intrinsics.checkNotNull(cardViewFindViewById, "");
            this.onExtraCallbackWithResult = cardViewFindViewById;
        }

        public void animateContentIn(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.onNavigationEvent.setAlpha(0.0f);
            long j = i2;
            long j2 = i;
            this.onNavigationEvent.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            if (this.onExtraCallback.getVisibility() == 0) {
                this.onExtraCallback.setAlpha(0.0f);
                this.onExtraCallback.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            }
            if (this.onExtraCallbackWithResult.getVisibility() == 0) {
                this.onExtraCallbackWithResult.setAlpha(0.0f);
                this.onExtraCallbackWithResult.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
                int i6 = onWarmupCompleted + 63;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = onWarmupCompleted + 57;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 99 / 0;
            }
        }

        public void animateContentOut(int i, int i2) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha;
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.onNavigationEvent.setAlpha(1.0f);
            long j = i2;
            long j2 = i;
            this.onNavigationEvent.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
            if (this.onExtraCallback.getVisibility() == 0) {
                int i6 = IAuthTabCallback + 97;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    this.onExtraCallback.setAlpha(0.0f);
                    viewPropertyAnimatorAlpha = this.onExtraCallback.animate().alpha(1.0f);
                } else {
                    this.onExtraCallback.setAlpha(1.0f);
                    viewPropertyAnimatorAlpha = this.onExtraCallback.animate().alpha(0.0f);
                }
                viewPropertyAnimatorAlpha.setDuration(j).setStartDelay(j2).start();
            }
            if (this.onExtraCallbackWithResult.getVisibility() == 0) {
                this.onExtraCallbackWithResult.setAlpha(1.0f);
                this.onExtraCallbackWithResult.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
                int i7 = IAuthTabCallback + 93;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = IAuthTabCallback + 39;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] onExtraCallback;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            static {
                int[] iArr = new int[pin.values().length];
                try {
                    iArr[pin.Narrow.ordinal()] = 1;
                    int i = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[pin.Normal.ordinal()] = 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[pin.FoldableExpanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                onExtraCallback = iArr;
                int i4 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, TdsToastV1 tdsToastV1, View view) throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnExtraCallback = getKekid.onExtraCallback();
                onExtraCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{iAuthTabCallback, tdsToastV1, view}, iOnExtraCallback, 2011668967, getKekid.onExtraCallback(), -2011668967);
                int i3 = 93 / 0;
            } else {
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                onExtraCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{iAuthTabCallback, tdsToastV1, view}, iOnExtraCallback2, 2011668967, getKekid.onExtraCallback(), -2011668967);
            }
            int i4 = IAuthTabCallback + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Resources.NotFoundException {
            int i7 = ~i6;
            int i8 = ~i3;
            int i9 = i4 | i7 | i8;
            int i10 = ~(i3 | i7);
            int i11 = (~(i7 | i8)) | (~i4);
            int i12 = i4 + i6 + i + ((-1537480081) * i2) + ((-1176924877) * i5);
            int i13 = i12 * i12;
            int i14 = (((-324914750) * i4) - 1179058176) + ((-1443770816) * i6) + (1588055615 * i9) + (i10 * (-1588055615)) + ((-1588055615) * i11) + (1263140864 * i) + (1226178560 * i2) + ((-1044512768) * i5) + (1201733632 * i13);
            int i15 = (i4 * 1018573086) + 1206756779 + (i6 * 1018572224) + (i9 * (-431)) + (i10 * 431) + (i11 * 431) + (i * 1018572655) + (i2 * (-758184159)) + (i5 * (-595421667)) + (i13 * (-1647378432));
            if (i14 + (i15 * i15 * 1518272512) != 1) {
                return onExtraCallbackWithResult(objArr);
            }
            Context context = (Context) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i16 = 2 % 2;
            int i17 = onExtraCallback + 91;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(iIntValue);
            int i19 = IAuthTabCallback + 81;
            onExtraCallback = i19 % 128;
            int i20 = i19 % 2;
            return Integer.valueOf(dimensionPixelSize);
        }

        public static /* synthetic */ void onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        private onWarmupCompleted() {
        }

        public static final /* synthetic */ TdsToastV1 onNavigationEvent(onWarmupCompleted onwarmupcompleted, View view, CharSequence charSequence, int i, String str, RecomposerawaitIdle2.onNavigationEvent onnavigationevent, int i2, int i3, String str2, CharSequence charSequence2, IAuthTabCallback iAuthTabCallback, IAuthTabCallback iAuthTabCallback2, boolean z, boolean z2, Function0 function0, int i4, int i5, int i6, boolean z3) throws Throwable {
            int i7 = 2 % 2;
            int i8 = onExtraCallback + 25;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            TdsToastV1 tdsToastV1OnExtraCallback = onwarmupcompleted.onExtraCallback(view, charSequence, i, str, onnavigationevent, i2, i3, str2, charSequence2, iAuthTabCallback, iAuthTabCallback2, z, z2, function0, i4, i5, i6, z3);
            int i10 = onExtraCallback + 33;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                return tdsToastV1OnExtraCallback;
            }
            throw null;
        }

        public final boolean onExtraCallbackWithResult() {
            boolean zAccess100;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                zAccess100 = TdsToastV1.access100();
                int i3 = 86 / 0;
            } else {
                zAccess100 = TdsToastV1.access100();
            }
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return zAccess100;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[1];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                iAuthTabCallback.onClick(tdsToastV1);
                int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                if (!(!((Boolean) TdsToastV1.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 805409075, iOnNavigationEvent2, -805409069)).booleanValue())) {
                    tdsToastV1.onExtraCallback();
                }
                int i3 = IAuthTabCallback + 63;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            iAuthTabCallback.onClick(tdsToastV1);
            ((Boolean) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 805409075, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -805409069)).booleanValue();
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x03f0, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x03ac, code lost:
        
            if (r12 != null) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x03df, code lost:
        
            if (r12 != null) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x03e1, code lost:
        
            r12 = (androidx.constraintlayout.widget.ConstraintLayout.onExtraCallbackWithResult) r12;
            ((android.view.ViewGroup.MarginLayoutParams) r12).width = -2;
            r11.setLayoutParams(r12);
         */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final TdsToastV1 onExtraCallback(View view, CharSequence charSequence, int i, String str, RecomposerawaitIdle2.onNavigationEvent onnavigationevent, int i2, int i3, String str2, CharSequence charSequence2, IAuthTabCallback iAuthTabCallback, final IAuthTabCallback iAuthTabCallback2, boolean z, boolean z2, Function0<Unit> function0, int i4, int i5, int i6, boolean z3) throws Throwable {
            int iOnNavigationEvent;
            int iOnNavigationEvent2;
            accessgetORDER_BY_NAMEcp accessgetorder_by_namecpOnExtraCallbackWithResult;
            int i7;
            String str3;
            TdsToastV1 tdsToastV1;
            boolean z4;
            float f;
            String str4;
            float f2;
            Configuration configuration;
            int iIAuthTabCallback;
            int iOnNavigationEvent3;
            BaseTextView baseTextView;
            ViewGroup.LayoutParams layoutParams;
            int i8 = 2 % 2;
            ViewGroup viewGroupOnWarmupCompleted = onWarmupCompleted(view);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroupOnWarmupCompleted.getContext());
            boolean z5 = i4 == 1;
            TdsRoundLayout tdsRoundLayoutInflate = layoutInflaterFrom.inflate(z5 ? R.layout.tds_toast_top : R.layout.tds_toast, viewGroupOnWarmupCompleted, false);
            Intrinsics.checkNotNull(tdsRoundLayoutInflate, "");
            TdsRoundLayout tdsRoundLayout = tdsRoundLayoutInflate;
            final TdsToastV1 tdsToastV12 = new TdsToastV1(viewGroupOnWarmupCompleted, tdsRoundLayout, new onExtraCallback(tdsRoundLayout), null);
            tdsToastV12.IAuthTabCallbackDefault(i4);
            TdsToastV1.IAuthTabCallback(tdsToastV12, z2);
            TdsToastV1.onExtraCallbackWithResult(tdsToastV12, function0);
            TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12, Boolean.valueOf(z3)}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -519609908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 519609909);
            Context contextOnWarmupCompleted = tdsToastV12.onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(contextOnWarmupCompleted, "");
            if (z5) {
                iOnNavigationEvent = OkHttpClientCompanion.onNavigationEvent(contextOnWarmupCompleted, eExternalSyntheticLambda0.ToastTopFill);
                iOnNavigationEvent2 = RequestBodyCompanion.IAuthTabCallback(contextOnWarmupCompleted, authParams.TextPrimary);
                accessgetorder_by_namecpOnExtraCallbackWithResult = RequestBodyCompanion.onExtraCallbackWithResult(contextOnWarmupCompleted, accessgetINSTANCEScp.WeakDown);
            } else {
                iOnNavigationEvent = OkHttpClientCompanion.onNavigationEvent(contextOnWarmupCompleted, eExternalSyntheticLambda0.ToastBottomFill);
                iOnNavigationEvent2 = OkHttpClientCompanion.onNavigationEvent(contextOnWarmupCompleted, eExternalSyntheticLambda0.ToastText);
                accessgetorder_by_namecpOnExtraCallbackWithResult = accessgetORDER_BY_NAMEcp.Companion.onExtraCallbackWithResult();
            }
            if (iAuthTabCallback2 != null) {
                TdsRoundLayout tdsRoundLayoutIAuthTabCallback_Parcel = TdsToastV1.IAuthTabCallback_Parcel(tdsToastV12);
                if (tdsRoundLayoutIAuthTabCallback_Parcel != null) {
                    tdsRoundLayoutIAuthTabCallback_Parcel.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$Companion$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) throws Resources.NotFoundException {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallbackWithResult + 59;
                            onExtraCallback = i10 % 128;
                            Object obj = null;
                            if (i10 % 2 == 0) {
                                TdsToastV1.onWarmupCompleted.IAuthTabCallback(iAuthTabCallback2, tdsToastV12, view2);
                                throw null;
                            }
                            TdsToastV1.onWarmupCompleted.IAuthTabCallback(iAuthTabCallback2, tdsToastV12, view2);
                            int i11 = onExtraCallbackWithResult + 29;
                            onExtraCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    });
                }
            } else {
                tdsToastV12.onExtraCallback.setOnTouchListener(null);
                TdsRoundLayout tdsRoundLayoutIAuthTabCallback_Parcel2 = TdsToastV1.IAuthTabCallback_Parcel(tdsToastV12);
                if (tdsRoundLayoutIAuthTabCallback_Parcel2 != null) {
                    tdsRoundLayoutIAuthTabCallback_Parcel2.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$Companion$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 35;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            TdsToastV1.onWarmupCompleted.onExtraCallback(view2);
                            if (i11 == 0) {
                                int i12 = 3 / 0;
                            }
                            int i13 = onNavigationEvent + 75;
                            IAuthTabCallback = i13 % 128;
                            if (i13 % 2 != 0) {
                                throw null;
                            }
                        }
                    });
                }
            }
            TdsRoundLayout tdsRoundLayoutIAuthTabCallback_Parcel3 = TdsToastV1.IAuthTabCallback_Parcel(tdsToastV12);
            if (tdsRoundLayoutIAuthTabCallback_Parcel3 != null) {
                tdsRoundLayoutIAuthTabCallback_Parcel3.setBackgroundColor(iOnNavigationEvent);
            }
            TdsRoundLayout tdsRoundLayoutIAuthTabCallback_Parcel4 = TdsToastV1.IAuthTabCallback_Parcel(tdsToastV12);
            if (tdsRoundLayoutIAuthTabCallback_Parcel4 != null) {
                i7 = 2;
                TdsRoundLayout.setShadow$default(tdsRoundLayoutIAuthTabCallback_Parcel4, accessgetorder_by_namecpOnExtraCallbackWithResult, (AppLovinSdkSettings) null, 2, (Object) null);
            } else {
                i7 = 2;
            }
            TdsRoundLayout tdsRoundLayoutIAuthTabCallback_Parcel5 = TdsToastV1.IAuthTabCallback_Parcel(tdsToastV12);
            if (tdsRoundLayoutIAuthTabCallback_Parcel5 != null) {
                int i9 = onExtraCallback + 51;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % i7;
                tdsRoundLayoutIAuthTabCallback_Parcel5.setMinimumHeight(varyMatches.IAuthTabCallback(Float.valueOf(48.0f), contextOnWarmupCompleted));
            }
            ((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).setTextColor(iOnNavigationEvent2);
            VectorConvertersKtExternalSyntheticLambda8.onNavigationEvent((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129), getCurrentBacktraceOrBuilderList.onNavigationEvent(((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getTextSize() * ConnectionPool.onWarmupCompleted.onNavigationEvent().IAuthTabCallback()));
            Object parent = tdsRoundLayout.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
                if (onwarmupcompleted.onExtraCallback(i, str, onnavigationevent) || onwarmupcompleted.onWarmupCompleted(i3, str2)) {
                    z4 = true;
                } else {
                    int i11 = IAuthTabCallback + 53;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    z4 = false;
                }
                boolean z6 = charSequence2.length() > 0;
                TextPaint paint = ((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getPaint();
                Intrinsics.checkNotNull(paint, "");
                int iIntValue = z5 ? ((Integer) onExtraCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{contextOnWarmupCompleted, Integer.valueOf(im.toss.tds.view.R.dimen.tds_toast_top_horizontal_margin)}, getKekid.onExtraCallback(), 1712337581, getKekid.onExtraCallback(), -1712337580)).intValue() : ((Integer) onExtraCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{contextOnWarmupCompleted, Integer.valueOf(im.toss.tds.view.R.dimen.tds_toast_horizontal_margin)}, getKekid.onExtraCallback(), 1712337581, getKekid.onExtraCallback(), -1712337580)).intValue();
                view2.setPadding(iIntValue, i5, iIntValue, i6);
                if (!z5 && z6) {
                    Resources resources = contextOnWarmupCompleted.getResources();
                    if (resources == null || (configuration = resources.getConfiguration()) == null) {
                        f = 1.0f;
                    } else {
                        float f3 = configuration.fontScale;
                        int i13 = onExtraCallback + 31;
                        IAuthTabCallback = i13 % 128;
                        int i14 = i13 % 2;
                        f = f3;
                    }
                    Configuration configuration2 = contextOnWarmupCompleted.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    int i15 = onExtraCallback.onExtraCallback[readIntokhttp.onNavigationEvent(configuration2).ordinal()];
                    str4 = _UrlKt.FRAGMENT_ENCODE_SET;
                    if (i15 == 1 || i15 == 2) {
                        f2 = 1.6f;
                    } else {
                        if (i15 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i16 = onExtraCallback + 63;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        f2 = Float.MAX_VALUE;
                    }
                    boolean z7 = f >= f2;
                    str3 = str4;
                    iIAuthTabCallback = onwarmupcompleted.IAuthTabCallback(contextOnWarmupCompleted, tdsToastV12, iIntValue, z5, z4, z6, charSequence2, z7);
                    if (iIAuthTabCallback >= 0) {
                        int lineCount = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), paint, iIAuthTabCallback).setIncludePad(((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getIncludeFontPadding()).setLineSpacing(((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getLineSpacingExtra(), ((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getLineSpacingMultiplier()).build().getLineCount();
                        int i17 = (z5 ? 48 : 80) | 1;
                        if (lineCount > 1 || z6) {
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            if (layoutParams2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                            int i18 = onExtraCallback + 69;
                            IAuthTabCallback = i18 % 128;
                            if (i18 % 2 != 0) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                                layoutParams3.gravity = i17;
                                view2.setLayoutParams(layoutParams3);
                                tdsRoundLayout.getLayoutParams();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams2;
                            layoutParams4.gravity = i17;
                            view2.setLayoutParams(layoutParams4);
                            ViewGroup.LayoutParams layoutParams5 = tdsRoundLayout.getLayoutParams();
                            if (layoutParams5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            layoutParams5.width = -1;
                            tdsRoundLayout.setLayoutParams(layoutParams5);
                        } else {
                            ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                            if (layoutParams6 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                            int i19 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                            onExtraCallback = i19 % 128;
                            int i20 = i19 % 2;
                            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
                            layoutParams7.width = -2;
                            layoutParams7.gravity = i17;
                            view2.setLayoutParams(layoutParams7);
                            ViewGroup.LayoutParams layoutParams8 = tdsRoundLayout.getLayoutParams();
                            if (layoutParams8 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            int i21 = onExtraCallback + 113;
                            IAuthTabCallback = i21 % 128;
                            if (i21 % 2 != 0) {
                                layoutParams8.width = 34;
                                tdsRoundLayout.setLayoutParams(layoutParams8);
                                baseTextView = (BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129);
                                Intrinsics.checkNotNullExpressionValue(baseTextView, str3);
                                layoutParams = baseTextView.getLayoutParams();
                            } else {
                                layoutParams8.width = -2;
                                tdsRoundLayout.setLayoutParams(layoutParams8);
                                baseTextView = (BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV12}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129);
                                Intrinsics.checkNotNullExpressionValue(baseTextView, str3);
                                layoutParams = baseTextView.getLayoutParams();
                            }
                        }
                        if (lineCount > 1 || z7) {
                            DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics, str3);
                            iOnNavigationEvent3 = varyMatches.onNavigationEvent(Float.valueOf(20.0f), displayMetrics);
                        } else {
                            int i22 = IAuthTabCallback + 51;
                            onExtraCallback = i22 % 128;
                            if (i22 % 2 == 0) {
                                DisplayMetrics displayMetrics2 = view2.getResources().getDisplayMetrics();
                                Intrinsics.checkNotNullExpressionValue(displayMetrics2, str3);
                                varyMatches.onNavigationEvent(Float.valueOf(999.0f), displayMetrics2);
                                throw null;
                            }
                            DisplayMetrics displayMetrics3 = view2.getResources().getDisplayMetrics();
                            Intrinsics.checkNotNullExpressionValue(displayMetrics3, str3);
                            iOnNavigationEvent3 = varyMatches.onNavigationEvent(Float.valueOf(999.0f), displayMetrics3);
                        }
                        tdsRoundLayout.setRadius(iOnNavigationEvent3);
                    }
                    tdsToastV1 = tdsToastV12;
                } else {
                    str4 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                str3 = str4;
                iIAuthTabCallback = onwarmupcompleted.IAuthTabCallback(contextOnWarmupCompleted, tdsToastV12, iIntValue, z5, z4, z6, charSequence2, z7);
                if (iIAuthTabCallback >= 0) {
                }
                tdsToastV1 = tdsToastV12;
            } else {
                str3 = _UrlKt.FRAGMENT_ENCODE_SET;
                tdsToastV1 = tdsToastV12;
            }
            TdsToastV1.onExtraCallbackWithResult(tdsToastV1, charSequence);
            if (i != 0) {
                TdsToastV1.onExtraCallbackWithResult(tdsToastV1, i);
            } else if (str.length() > 0) {
                TdsToastV1.IAuthTabCallback(tdsToastV1, str);
            } else if (onnavigationevent != null) {
                TdsToastV1.onExtraCallback(tdsToastV1, onnavigationevent);
            }
            if (i2 != 0) {
                int i23 = onExtraCallback + 79;
                IAuthTabCallback = i23 % 128;
                int i24 = i23 % 2;
                ((TdsImageView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -320490892, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 320490895)).setSupportImageTintList(ColorStateList.valueOf(i2));
            } else {
                ((TdsImageView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -320490892, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 320490895)).setSupportImageTintList((ColorStateList) null);
            }
            if (onWarmupCompleted(i3, str2)) {
                if (i3 != 2) {
                    TdsToastV1.IAuthTabCallback(tdsToastV1, i3);
                } else if (!StringsKt__StringsKt.isBlank(str2)) {
                    TdsToastV1.onNavigationEvent(tdsToastV1, str2);
                }
            }
            TdsImageView tdsImageView = (TdsImageView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -320490892, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 320490895);
            Intrinsics.checkNotNullExpressionValue(tdsImageView, str3);
            if (tdsImageView.getVisibility() != 0) {
                int i25 = onExtraCallback + 11;
                IAuthTabCallback = i25 % 128;
                if (i25 % 2 != 0) {
                    LottieAnimationView lottieAnimationViewAsBinder = TdsToastV1.asBinder(tdsToastV1);
                    Intrinsics.checkNotNullExpressionValue(lottieAnimationViewAsBinder, str3);
                    lottieAnimationViewAsBinder.getVisibility();
                    throw null;
                }
                LottieAnimationView lottieAnimationViewAsBinder2 = TdsToastV1.asBinder(tdsToastV1);
                Intrinsics.checkNotNullExpressionValue(lottieAnimationViewAsBinder2, str3);
                if (lottieAnimationViewAsBinder2.getVisibility() != 0) {
                    TdsToastV1.asInterface(tdsToastV1).setVisibility(8);
                }
            }
            if (charSequence2.length() <= 0) {
                tdsToastV1.asBinder(3000);
                return tdsToastV1;
            }
            TdsToastV1.onWarmupCompleted(tdsToastV1, charSequence2, iAuthTabCallback, z);
            tdsToastV1.asBinder(5000);
            return tdsToastV1;
        }

        private static final int onExtraCallback(Context context, int i) throws Resources.NotFoundException {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            int i5 = onExtraCallback + 85;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return dimensionPixelSize;
        }

        private final int IAuthTabCallback(Context context, TdsToastV1 tdsToastV1, int i, boolean z, boolean z2, boolean z3, CharSequence charSequence, boolean z4) throws Resources.NotFoundException {
            int iOnExtraCallback;
            int iCeil;
            int iOnExtraCallback2;
            int iOnExtraCallback3;
            int iCoerceIn;
            int iOnExtraCallback4;
            int i2;
            int i3;
            int i4 = 2 % 2;
            int i5 = IAuthTabCallback + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int iOnExtraCallback5 = z ? onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_top_text_horizontal_gone_margin) : onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_text_horizontal_gone_margin);
            int iOnExtraCallback6 = z ? onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_top_text_vertical_margin) : onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_text_vertical_margin);
            if (z) {
                if (z2) {
                    int i7 = IAuthTabCallback + 15;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = im.toss.tds.view.R.dimen.tds_toast_top_text_start_margin;
                } else {
                    i3 = im.toss.tds.view.R.dimen.tds_toast_top_text_horizontal_gone_margin;
                }
                iOnExtraCallback = onExtraCallback(context, i3);
            } else {
                iOnExtraCallback = onExtraCallback(context, !z2 ? im.toss.tds.view.R.dimen.tds_toast_text_horizontal_gone_margin : im.toss.tds.view.R.dimen.tds_toast_text_start_margin);
            }
            int i9 = iOnExtraCallback;
            if (z4) {
                int i10 = IAuthTabCallback + 7;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                ConstraintLayout constraintLayoutWriteTypedObject = tdsToastV1.writeTypedObject();
                ConstraintLayout constraintLayout = null;
                if (constraintLayoutWriteTypedObject instanceof ConstraintLayout) {
                    int i12 = IAuthTabCallback + 9;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    constraintLayout = constraintLayoutWriteTypedObject;
                }
                ConstraintLayout constraintLayout2 = constraintLayout;
                if (constraintLayout2 != null) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(constraintLayout2);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getId(), 7);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getId(), 4);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(TdsToastV1.onNavigationEvent(tdsToastV1).getId(), 3);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(TdsToastV1.onNavigationEvent(tdsToastV1).getId(), 7);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.IAuthTabCallback(((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getId(), 7, constraintLayout2.getId(), 7, iOnExtraCallback5);
                    int id = ((BaseTextView) TdsToastV1.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 959345129)).getId();
                    int i13 = R.id.button_layout;
                    DisplayMetrics displayMetrics = constraintLayout2.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.IAuthTabCallback(id, 4, i13, 3, varyMatches.onNavigationEvent(10, displayMetrics));
                    if (!(!z2)) {
                        deactivateEncoderSurfaceBeforeStopEncoderQuirk.IAuthTabCallback(TdsToastV1.onNavigationEvent(tdsToastV1).getId(), 6, TdsToastV1.asInterface(tdsToastV1).getId(), 7, i9);
                    } else {
                        deactivateEncoderSurfaceBeforeStopEncoderQuirk.IAuthTabCallback(TdsToastV1.onNavigationEvent(tdsToastV1).getId(), 6, constraintLayout2.getId(), 6, iOnExtraCallback5);
                    }
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.IAuthTabCallback(TdsToastV1.onNavigationEvent(tdsToastV1).getId(), 4, constraintLayout2.getId(), 4, iOnExtraCallback6);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(constraintLayout2);
                }
                iCoerceIn = RangesKt___RangesKt.coerceIn(onExtraCallbackWithResult(context), onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_min_width), onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_max_width));
                iOnExtraCallback4 = onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_horizontal_margin) << 1;
            } else {
                int iOnExtraCallback7 = 0;
                if (z3) {
                    int i14 = IAuthTabCallback + 35;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    iCeil = (int) Math.ceil(TdsToastV1.onWarmupCompleted(tdsToastV1).getPaint().measureText(charSequence, 0, charSequence.length()) + TdsToastV1.onWarmupCompleted(tdsToastV1).getPaddingStart() + TdsToastV1.onWarmupCompleted(tdsToastV1).getPaddingEnd());
                } else {
                    iCeil = 0;
                }
                if (z2) {
                    iOnExtraCallback2 = onExtraCallback(context, z ? im.toss.tds.view.R.dimen.tds_toast_top_left_content_margin : im.toss.tds.view.R.dimen.tds_toast_left_content_margin);
                } else {
                    iOnExtraCallback2 = 0;
                }
                if (z2) {
                    if (!z) {
                        i2 = im.toss.tds.view.R.dimen.tds_toast_left_content_size;
                    } else {
                        i2 = im.toss.tds.view.R.dimen.tds_toast_top_left_content_size;
                        int i16 = IAuthTabCallback + 7;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    iOnExtraCallback3 = onExtraCallback(context, i2);
                } else {
                    iOnExtraCallback3 = 0;
                }
                int iOnExtraCallback8 = z ? onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_top_text_end_margin) : onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_text_end_margin);
                if (z3) {
                    if (z) {
                        iOnExtraCallback7 = onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_top_button_end_margin);
                        int i18 = IAuthTabCallback + 91;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                    } else {
                        iOnExtraCallback7 = onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_button_end_margin);
                    }
                }
                iCoerceIn = RangesKt___RangesKt.coerceIn(onExtraCallbackWithResult(context), onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_min_width), onExtraCallback(context, im.toss.tds.view.R.dimen.tds_toast_max_width)) - (((i + iOnExtraCallback2) + iOnExtraCallback3) + i9);
                iOnExtraCallback4 = i + iOnExtraCallback7 + iCeil + iOnExtraCallback8;
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            return (iCoerceIn - iOnExtraCallback4) - varyMatches.onNavigationEvent(2, displayMetrics2);
        }

        private final int onExtraCallbackWithResult(Context context) {
            Insets insetsIgnoringVisibility;
            int iWidth;
            int i = 2 % 2;
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "");
            WindowManager windowManager = (WindowManager) systemService;
            if (Build.VERSION.SDK_INT < 30) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i2 = displayMetrics.widthPixels;
                int i3 = onExtraCallback + 43;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 56 / 0;
                }
                return i2;
            }
            int i5 = IAuthTabCallback + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "");
                insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "");
                iWidth = currentWindowMetrics.getBounds().width() * onBackPressedDispatcher_delegatelambda00.dd_(insetsIgnoringVisibility);
            } else {
                WindowMetrics currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(currentWindowMetrics2, "");
                insetsIgnoringVisibility = currentWindowMetrics2.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "");
                iWidth = currentWindowMetrics2.getBounds().width() - onBackPressedDispatcher_delegatelambda00.dd_(insetsIgnoringVisibility);
            }
            int iDf_ = iWidth - onBackPressedDispatcher_delegatelambda0.df_(insetsIgnoringVisibility);
            int i6 = IAuthTabCallback + 109;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return iDf_;
        }

        private final boolean onExtraCallback(int i, String str, RecomposerawaitIdle2.onNavigationEvent onnavigationevent) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (i != 0 || str.length() > 0) {
                return true;
            }
            int i5 = IAuthTabCallback + 49;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return onnavigationevent != null;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            if (kotlin.text.StringsKt__StringsKt.isBlank(r4) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            r3 = im.toss.uikit.widget.snackbar.TdsToastV1.onWarmupCompleted.IAuthTabCallback + 89;
            im.toss.uikit.widget.snackbar.TdsToastV1.onWarmupCompleted.onExtraCallback = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            if (r3 != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean onWarmupCompleted(int i, String str) {
            int i2 = 2 % 2;
            if (i == 2) {
                int i3 = IAuthTabCallback + 27;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean zIsBlank = StringsKt__StringsKt.isBlank(str);
                    int i4 = 89 / 0;
                }
            }
            int i5 = onExtraCallback + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        private final ViewGroup onWarmupCompleted(View view) {
            int i = 2 % 2;
            ViewGroup viewGroup = null;
            do {
                if (view instanceof FrameLayout) {
                    int i2 = IAuthTabCallback + 103;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (((FrameLayout) view).getId() == 16908290) {
                        return (ViewGroup) view;
                    }
                    viewGroup = (ViewGroup) view;
                }
                if (view != null) {
                    int i4 = IAuthTabCallback + 53;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        int i6 = IAuthTabCallback + 43;
                        int i7 = i6 % 128;
                        onExtraCallback = i7;
                        int i8 = i6 % 2;
                        view = (View) parent;
                        int i9 = i7 + 27;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        view = null;
                    }
                }
            } while (view != null);
            Intrinsics.checkNotNull(viewGroup);
            return viewGroup;
        }

        private static final void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, TdsToastV1 tdsToastV1, View view) throws Resources.NotFoundException {
            int iOnExtraCallback = getKekid.onExtraCallback();
            onExtraCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{iAuthTabCallback, tdsToastV1, view}, iOnExtraCallback, 2011668967, getKekid.onExtraCallback(), -2011668967);
        }

        private static final int onWarmupCompleted(Context context, int i) {
            return ((Integer) onExtraCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), new Object[]{context, Integer.valueOf(i)}, getKekid.onExtraCallback(), 1712337581, getKekid.onExtraCallback(), -1712337580)).intValue();
        }
    }

    public static final class onNavigationEvent {
        private static int ICustomTabsCallbackStubProxy = 1;
        private static int onActivityLayout = 0;
        private static int onActivityResized = 0;
        private static int onPostMessage = 1;
        private IAuthTabCallback IAuthTabCallback;
        private RecomposerawaitIdle2.onNavigationEvent IAuthTabCallbackDefault;
        private Integer IAuthTabCallbackStub;
        private boolean IAuthTabCallbackStubProxy;
        private String IAuthTabCallback_Parcel;
        private final View ICustomTabsCallback;
        private boolean access000;
        private boolean access100;
        private boolean asBinder;
        private int asInterface;
        private Function0<Unit> extraCallback;
        private Function0<Unit> extraCallbackWithResult;
        private int getInterfaceDescriptor;
        private int onExtraCallbackWithResult;
        private int onMessageChannelReady;
        private final CharSequence onMinimized;
        private String onNavigationEvent;
        private int onTransact;
        private boolean onWarmupCompleted;
        private String readTypedObject;
        private IAuthTabCallback writeTypedObject;
        public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
        public static final int onExtraCallback = 8;

        static {
            int i = onActivityLayout + 7;
            ICustomTabsCallbackStubProxy = i % 128;
            int i2 = i % 2;
        }

        public static /* synthetic */ void IAuthTabCallback(Function1 function1, TdsToastV1 tdsToastV1) {
            int i = 2 % 2;
            int i2 = onPostMessage + 115;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(function1, tdsToastV1);
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            int i5 = onActivityResized + 43;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
        }

        public static /* synthetic */ void onExtraCallback(Function1 function1, TdsToastV1 tdsToastV1) throws Throwable {
            int i = 2 % 2;
            int i2 = onPostMessage + 11;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                onWarmupCompleted(a.3.onWarmupCompleted(), 1204433140, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, tdsToastV1}, -1204433129, iOnWarmupCompleted);
                return;
            }
            int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted5 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted6 = a.3.onWarmupCompleted();
            onWarmupCompleted(a.3.onWarmupCompleted(), 1204433140, iOnWarmupCompleted6, iOnWarmupCompleted5, new Object[]{function1, tdsToastV1}, -1204433129, iOnWarmupCompleted4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
            Object objOnWarmupCompleted;
            int i7 = ~((~i6) | i5);
            int i8 = (~((~i5) | (~i2))) | i7;
            int i9 = i5 | i2;
            int i10 = i5 + i2 + i4 + ((-39394691) * i3) + ((-2104995841) * i);
            int i11 = i10 * i10;
            int i12 = ((i5 * 1773844906) - 1404835566) + (i2 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (1773845519 * i4) + (1055723859 * i3) + (1996616689 * i) + (i11 * (-1450508288));
            switch ((i5 * (-1880913482)) + 198443008 + ((-1880913482) * i2) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i4) + ((-1529085952) * i3) + ((-319553536) * i) + ((-289079296) * i11) + (i12 * i12 * (-778371072))) {
                case 1:
                    return onWarmupCompleted(objArr);
                case 2:
                    return onNavigationEvent(objArr);
                case 3:
                    onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
                    int i13 = 2 % 2;
                    int i14 = onPostMessage + 37;
                    int i15 = i14 % 128;
                    onActivityResized = i15;
                    int i16 = i14 % 2;
                    CharSequence charSequence = onnavigationevent.onMinimized;
                    int i17 = i15 + 25;
                    onPostMessage = i17 % 128;
                    int i18 = i17 % 2;
                    return charSequence;
                case 4:
                    return onExtraCallback(objArr);
                case 5:
                    return onExtraCallbackWithResult(objArr);
                case 6:
                    return asInterface(objArr);
                case 7:
                    onNavigationEvent onnavigationevent2 = (onNavigationEvent) objArr[0];
                    RecomposerawaitIdle2.onNavigationEvent onnavigationevent3 = (RecomposerawaitIdle2.onNavigationEvent) objArr[1];
                    int iIntValue = ((Number) objArr[2]).intValue();
                    int i19 = 2 % 2;
                    int i20 = onActivityResized + 19;
                    onPostMessage = i20 % 128;
                    if (i20 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(onnavigationevent3, "");
                    } else {
                        Intrinsics.checkNotNullParameter(onnavigationevent3, "");
                    }
                    onnavigationevent2.asInterface = 0;
                    onnavigationevent2.IAuthTabCallback_Parcel = _UrlKt.FRAGMENT_ENCODE_SET;
                    onnavigationevent2.IAuthTabCallbackDefault = onnavigationevent3;
                    onnavigationevent2.onTransact = iIntValue;
                    return onnavigationevent2;
                case 8:
                    onNavigationEvent onnavigationevent4 = (onNavigationEvent) objArr[0];
                    int i21 = 2 % 2;
                    int i22 = onPostMessage + 113;
                    onActivityResized = i22 % 128;
                    if (i22 % 2 != 0) {
                        int iOnWarmupCompleted = a.3.onWarmupCompleted();
                        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                        objOnWarmupCompleted = onWarmupCompleted(a.3.onWarmupCompleted(), -1261591066, a.3.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{onnavigationevent4, 1}, 1261591079, iOnWarmupCompleted);
                    } else {
                        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
                        objOnWarmupCompleted = onWarmupCompleted(a.3.onWarmupCompleted(), -1261591066, a.3.onWarmupCompleted(), iOnWarmupCompleted4, new Object[]{onnavigationevent4, 0}, 1261591079, iOnWarmupCompleted3);
                    }
                    return (TdsToastV1) objOnWarmupCompleted;
                case 9:
                    return onTransact(objArr);
                case 10:
                    return IAuthTabCallbackDefault(objArr);
                case 11:
                    Function1 function1 = (Function1) objArr[0];
                    TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[1];
                    int i23 = 2 % 2;
                    int i24 = onActivityResized + 101;
                    onPostMessage = i24 % 128;
                    int i25 = i24 % 2;
                    Intrinsics.checkNotNullParameter(tdsToastV1, "");
                    function1.invoke(tdsToastV1);
                    int i26 = onPostMessage + 93;
                    onActivityResized = i26 % 128;
                    int i27 = i26 % 2;
                    return null;
                case 12:
                    return IAuthTabCallbackStub(objArr);
                case 13:
                    onNavigationEvent onnavigationevent5 = (onNavigationEvent) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i28 = 2 % 2;
                    int i29 = onActivityResized + 95;
                    onPostMessage = i29 % 128;
                    int i30 = i29 % 2;
                    if (iIntValue2 == 0 && (true ^ onnavigationevent5.asBinder())) {
                        int i31 = onPostMessage + 119;
                        onActivityResized = i31 % 128;
                        int i32 = i31 % 2;
                        onnavigationevent5.IAuthTabCallbackStub();
                    }
                    TdsToastV1 tdsToastV1OnNavigationEvent = onWarmupCompleted.onNavigationEvent(TdsToastV1.Companion, onnavigationevent5.IAuthTabCallbackDefault(), onnavigationevent5.onMinimized, onnavigationevent5.asInterface, onnavigationevent5.IAuthTabCallback_Parcel, onnavigationevent5.IAuthTabCallbackDefault, onnavigationevent5.onTransact, onnavigationevent5.getInterfaceDescriptor, onnavigationevent5.readTypedObject, onnavigationevent5.onNavigationEvent, onnavigationevent5.IAuthTabCallback, onnavigationevent5.writeTypedObject, onnavigationevent5.IAuthTabCallbackStubProxy, onnavigationevent5.access100, onnavigationevent5.extraCallback, iIntValue2, onnavigationevent5.onMessageChannelReady, onnavigationevent5.onExtraCallbackWithResult, onnavigationevent5.asBinder);
                    Integer num = onnavigationevent5.IAuthTabCallbackStub;
                    if (num != null) {
                        tdsToastV1OnNavigationEvent.asBinder(num.intValue());
                    }
                    Function0<Unit> function0 = onnavigationevent5.extraCallbackWithResult;
                    if (function0 != null) {
                        tdsToastV1OnNavigationEvent.IAuthTabCallback(new C0008onNavigationEvent(function0));
                    }
                    return tdsToastV1OnNavigationEvent;
                case 14:
                    return asBinder(objArr);
                default:
                    return IAuthTabCallback(objArr);
            }
        }

        public static /* synthetic */ void onWarmupCompleted(Function1 function1, TdsToastV1 tdsToastV1) throws Throwable {
            int i = 2 % 2;
            int i2 = onActivityResized + 27;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                onWarmupCompleted(a.3.onWarmupCompleted(), 893354320, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, tdsToastV1}, -893354316, iOnWarmupCompleted);
                int i3 = 12 / 0;
            } else {
                int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted5 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted6 = a.3.onWarmupCompleted();
                onWarmupCompleted(a.3.onWarmupCompleted(), 893354320, iOnWarmupCompleted6, iOnWarmupCompleted5, new Object[]{function1, tdsToastV1}, -893354316, iOnWarmupCompleted4);
            }
            int i4 = onActivityResized + 57;
            onPostMessage = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = onPostMessage;
            int i3 = i2 + 49;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            String str = onnavigationevent.onNavigationEvent;
            int i5 = i2 + 15;
            onActivityResized = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return str;
        }

        public static final /* synthetic */ void IAuthTabCallback(onNavigationEvent onnavigationevent, boolean z) {
            int i = 2 % 2;
            int i2 = onActivityResized + 33;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            onnavigationevent.access100 = z;
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
        }

        private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i = 2 % 2;
            int i2 = onPostMessage + 47;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            onnavigationevent.onMessageChannelReady = iIntValue;
            int i5 = i3 + 97;
            onPostMessage = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 29 / 0;
            }
            return null;
        }

        public static final /* synthetic */ boolean IAuthTabCallbackDefault(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onPostMessage;
            int i3 = i2 + 1;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            boolean z = onnavigationevent.access100;
            int i5 = i2 + 35;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public static final /* synthetic */ int IAuthTabCallbackStub(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 91;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            int i5 = onnavigationevent.asInterface;
            if (i4 == 0) {
                int i6 = 7 / 0;
            }
            int i7 = i2 + 79;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            return i5;
        }

        private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            String str = (String) objArr[1];
            int i = 2 % 2;
            int i2 = onPostMessage + 5;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            onnavigationevent.onNavigationEvent = str;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 33;
            onPostMessage = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }

        public static final /* synthetic */ boolean IAuthTabCallbackStubProxy(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onPostMessage + 57;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            boolean z = onnavigationevent.access000;
            if (i3 == 0) {
                return z;
            }
            throw null;
        }

        public static final /* synthetic */ int IAuthTabCallback_Parcel(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 11;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            int i5 = onnavigationevent.getInterfaceDescriptor;
            if (i4 == 0) {
                int i6 = 30 / 0;
            }
            int i7 = i2 + 65;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            return i5;
        }

        public static final /* synthetic */ Function0 ICustomTabsCallback(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onActivityResized + 125;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Function0<Unit> function0 = onnavigationevent.extraCallbackWithResult;
            if (i3 != 0) {
                return function0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ String access000(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onPostMessage + 33;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            String str = onnavigationevent.readTypedObject;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 49;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static final /* synthetic */ IAuthTabCallback access100(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 113;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = onnavigationevent.writeTypedObject;
            int i5 = i2 + 47;
            onPostMessage = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return iAuthTabCallback;
        }

        private static /* synthetic */ Object asInterface(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 37;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            RecomposerawaitIdle2.onNavigationEvent onnavigationevent2 = onnavigationevent.IAuthTabCallbackDefault;
            int i5 = i2 + 111;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationevent2;
        }

        public static final /* synthetic */ String asInterface(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onPostMessage + Imgproc.COLOR_YUV2RGB_YVYU;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            String str = onnavigationevent.IAuthTabCallback_Parcel;
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            return str;
        }

        public static final /* synthetic */ int extraCallbackWithResult(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onPostMessage + 91;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            int i4 = onnavigationevent.onMessageChannelReady;
            if (i3 == 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ Function0 getInterfaceDescriptor(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onActivityResized + 25;
            int i3 = i2 % 128;
            onPostMessage = i3;
            int i4 = i2 % 2;
            Function0<Unit> function0 = onnavigationevent.extraCallback;
            int i5 = i3 + 63;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            return function0;
        }

        public static final /* synthetic */ IAuthTabCallback onExtraCallback(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 85;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            IAuthTabCallback iAuthTabCallback = onnavigationevent.IAuthTabCallback;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 107;
            onPostMessage = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ void onExtraCallback(onNavigationEvent onnavigationevent, int i) {
            int i2 = 2 % 2;
            int i3 = onActivityResized;
            int i4 = i3 + 97;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            onnavigationevent.getInterfaceDescriptor = i;
            int i6 = i3 + 33;
            onPostMessage = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 95 / 0;
            }
        }

        public static final /* synthetic */ void onExtraCallback(onNavigationEvent onnavigationevent, Function0 function0) {
            int i = 2 % 2;
            int i2 = onPostMessage + 27;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            onnavigationevent.extraCallback = function0;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ void onExtraCallback(onNavigationEvent onnavigationevent, boolean z) {
            int i = 2 % 2;
            int i2 = onPostMessage;
            int i3 = i2 + 119;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            onnavigationevent.asBinder = z;
            int i5 = i2 + 103;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final /* synthetic */ Integer onExtraCallbackWithResult(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onPostMessage;
            int i3 = i2 + 69;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            Integer num = onnavigationevent.IAuthTabCallbackStub;
            if (i4 != 0) {
                int i5 = 75 / 0;
            }
            int i6 = i2 + 107;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            return num;
        }

        public static final /* synthetic */ void onExtraCallbackWithResult(onNavigationEvent onnavigationevent, IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = onPostMessage + 79;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            onnavigationevent.IAuthTabCallback = iAuthTabCallback;
            int i5 = i3 + 3;
            onPostMessage = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ int onNavigationEvent(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onPostMessage + 17;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            int i4 = onnavigationevent.onExtraCallbackWithResult;
            if (i3 == 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, int i) {
            int i2 = 2 % 2;
            int i3 = onActivityResized;
            int i4 = i3 + 61;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            onnavigationevent.asInterface = i;
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 75;
            onPostMessage = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, Integer num) {
            int i = 2 % 2;
            int i2 = onActivityResized + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            onPostMessage = i3;
            int i4 = i2 % 2;
            onnavigationevent.IAuthTabCallbackStub = num;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 19;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, String str) {
            int i = 2 % 2;
            int i2 = onActivityResized + 77;
            int i3 = i2 % 128;
            onPostMessage = i3;
            int i4 = i2 % 2;
            onnavigationevent.readTypedObject = str;
            int i5 = i3 + 113;
            onActivityResized = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public static final /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, Function0 function0) {
            int i = 2 % 2;
            int i2 = onPostMessage + 111;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            onnavigationevent.extraCallbackWithResult = function0;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 91;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, RecomposerawaitIdle2.onNavigationEvent onnavigationevent2) {
            int i = 2 % 2;
            int i2 = onActivityResized + 9;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            onnavigationevent.IAuthTabCallbackDefault = onnavigationevent2;
            if (i3 == 0) {
                int i4 = 21 / 0;
            }
        }

        public static final /* synthetic */ void onNavigationEvent(onNavigationEvent onnavigationevent, boolean z) {
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 79;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            onnavigationevent.access000 = z;
            int i5 = i2 + 1;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final /* synthetic */ int onTransact(onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 103;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            int i5 = onnavigationevent.onTransact;
            if (i4 == 0) {
                throw null;
            }
            int i6 = i2 + 3;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        private static /* synthetic */ Object onTransact(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = onActivityResized + 45;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            boolean z = onnavigationevent.asBinder;
            if (i3 != 0) {
                return Boolean.valueOf(z);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i = 2 % 2;
            int i2 = onActivityResized + 69;
            int i3 = i2 % 128;
            onPostMessage = i3;
            int i4 = i2 % 2;
            onnavigationevent.onExtraCallbackWithResult = iIntValue;
            int i5 = i3 + 73;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        public static final /* synthetic */ void onWarmupCompleted(onNavigationEvent onnavigationevent, int i) {
            int i2 = 2 % 2;
            int i3 = onActivityResized + 11;
            int i4 = i3 % 128;
            onPostMessage = i4;
            int i5 = i3 % 2;
            onnavigationevent.onTransact = i;
            int i6 = i4 + 55;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
        }

        public static final /* synthetic */ void onWarmupCompleted(onNavigationEvent onnavigationevent, IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = onPostMessage;
            int i3 = i2 + 9;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            onnavigationevent.writeTypedObject = iAuthTabCallback;
            int i5 = i2 + 31;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        }

        public static final /* synthetic */ void onWarmupCompleted(onNavigationEvent onnavigationevent, String str) {
            int i = 2 % 2;
            int i2 = onPostMessage + 17;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            onnavigationevent.IAuthTabCallback_Parcel = str;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onPostMessage = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
            }
        }

        private final int onTransact() throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onActivityResized + 87;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            int dimensionPixelSize = this.ICustomTabsCallback.getResources().getDimensionPixelSize(im.toss.tds.view.R.dimen.tds_toast_bottom_margin);
            int i4 = onActivityResized + 91;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return dimensionPixelSize;
        }

        public final boolean asBinder() {
            int i = 2 % 2;
            int i2 = onActivityResized + 99;
            int i3 = i2 % 128;
            onPostMessage = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.onExtraCallbackWithResult == 0) {
                return false;
            }
            int i4 = i3 + 57;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public onNavigationEvent(@NotNull Activity activity, @NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.IAuthTabCallback_Parcel = _UrlKt.FRAGMENT_ENCODE_SET;
            this.getInterfaceDescriptor = 2;
            this.readTypedObject = _UrlKt.FRAGMENT_ENCODE_SET;
            this.onNavigationEvent = _UrlKt.FRAGMENT_ENCODE_SET;
            View viewFindViewById = activity.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.ICustomTabsCallback = viewFindViewById;
            this.onMinimized = charSequence;
        }

        public onNavigationEvent(@NotNull View view, @NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.IAuthTabCallback_Parcel = _UrlKt.FRAGMENT_ENCODE_SET;
            this.getInterfaceDescriptor = 2;
            this.readTypedObject = _UrlKt.FRAGMENT_ENCODE_SET;
            this.onNavigationEvent = _UrlKt.FRAGMENT_ENCODE_SET;
            this.ICustomTabsCallback = view;
            this.onMinimized = charSequence;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public onNavigationEvent(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            String string = view.getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            this(view, string);
        }

        public static /* synthetic */ onNavigationEvent onNavigationEvent(onNavigationEvent onnavigationevent, int i, int i2, int i3, Object obj) {
            int i4 = 2 % 2;
            int i5 = onPostMessage + 51;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent.onExtraCallback(i, i2);
            int i7 = onPostMessage + 69;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
            return onnavigationeventOnExtraCallback;
        }

        public final onNavigationEvent onExtraCallback(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = onPostMessage;
            int i5 = i4 + 69;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            this.asInterface = i;
            this.IAuthTabCallback_Parcel = _UrlKt.FRAGMENT_ENCODE_SET;
            this.IAuthTabCallbackDefault = null;
            this.onTransact = i2;
            int i7 = i4 + 37;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public static /* synthetic */ onNavigationEvent onExtraCallback(onNavigationEvent onnavigationevent, String str, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = onActivityResized;
            int i5 = i4 + 47;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 2) != 0) {
                int i7 = i4 + 97;
                onPostMessage = i7 % 128;
                int i8 = i7 % 2;
                i = 0;
            }
            return onnavigationevent.onNavigationEvent(str, i);
        }

        public final onNavigationEvent onNavigationEvent(@NotNull String str, int i) {
            int i2 = 2 % 2;
            int i3 = onPostMessage + 125;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.asInterface = 0;
            this.IAuthTabCallback_Parcel = str;
            this.IAuthTabCallbackDefault = null;
            this.onTransact = i;
            int i5 = onPostMessage + 63;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public static /* synthetic */ onNavigationEvent onNavigationEvent(onNavigationEvent onnavigationevent, RecomposerawaitIdle2.onNavigationEvent onnavigationevent2, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = onPostMessage + 51;
            int i5 = i4 % 128;
            onActivityResized = i5;
            if (i4 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
                int i6 = i5 + 65;
                onPostMessage = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 37;
                onPostMessage = i8 % 128;
                int i9 = i8 % 2;
                i = 0;
            }
            Object[] objArr = {onnavigationevent, onnavigationevent2, Integer.valueOf(i)};
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            return (onNavigationEvent) onWarmupCompleted(a.3.onWarmupCompleted(), -957102186, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, 957102193, iOnWarmupCompleted);
        }

        public static /* synthetic */ onNavigationEvent onWarmupCompleted(onNavigationEvent onnavigationevent, deprecated_followRedirects deprecated_followredirects, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 2) != 0) {
                int i4 = onPostMessage + 123;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
            }
            onNavigationEvent onnavigationeventOnWarmupCompleted = onnavigationevent.onWarmupCompleted(deprecated_followredirects, i);
            int i6 = onPostMessage + 115;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            return onnavigationeventOnWarmupCompleted;
        }

        public final onNavigationEvent onWarmupCompleted(@NotNull deprecated_followRedirects deprecated_followredirects, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            if (deprecated_followredirects instanceof deprecated_cookieJar) {
                Context context = this.ICustomTabsCallback.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                onWarmupCompleted(((deprecated_cookieJar) deprecated_followredirects).onExtraCallbackWithResult(context), i);
                return this;
            }
            if (deprecated_followredirects instanceof accessgetDEFAULT_PROTOCOLScp) {
                int i3 = onActivityResized + 123;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback(((accessgetDEFAULT_PROTOCOLScp) deprecated_followredirects).onNavigationEvent(), i);
                return this;
            }
            if (!(deprecated_followredirects instanceof verifyClientState)) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = onPostMessage + 123;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            Context context2 = this.ICustomTabsCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            onExtraCallback(this, deprecated_authenticator.onWarmupCompleted((verifyClientState) deprecated_followredirects, context2), 0, 2, null);
            return this;
        }

        public final onNavigationEvent onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onPostMessage + 3;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            this.getInterfaceDescriptor = i;
            if (i4 != 0) {
                int i5 = 13 / 0;
            }
            return this;
        }

        public final onNavigationEvent IAuthTabCallback(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onActivityResized + 57;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.readTypedObject = str;
                return this;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.readTypedObject = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent onExtraCallbackWithResult(@NotNull String str, @Nullable IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = onActivityResized + 39;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onNavigationEvent = str;
                this.IAuthTabCallback = iAuthTabCallback;
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = iAuthTabCallback;
            int i3 = onActivityResized + 101;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback;
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            String str = (String) objArr[1];
            final Function1 function1 = (Function1) objArr[2];
            int i = 2 % 2;
            int i2 = onActivityResized + 51;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                int i3 = 56 / 0;
                iAuthTabCallback = function1 == null ? null : new IAuthTabCallback() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$Builder$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // im.toss.uikit.widget.snackbar.TdsToastV1.IAuthTabCallback
                    public final void onClick(TdsToastV1 tdsToastV1) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 11;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            TdsToastV1.onNavigationEvent.IAuthTabCallback(function1, tdsToastV1);
                            throw null;
                        }
                        TdsToastV1.onNavigationEvent.IAuthTabCallback(function1, tdsToastV1);
                        int i6 = onWarmupCompleted + 77;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                    }
                };
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                if (function1 == null) {
                }
            }
            onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(str, iAuthTabCallback);
            int i4 = onActivityResized + 37;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationeventOnExtraCallbackWithResult;
        }

        private static final void onNavigationEvent(Function1 function1, TdsToastV1 tdsToastV1) {
            int i = 2 % 2;
            int i2 = onPostMessage + 101;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(tdsToastV1, "");
                function1.invoke(tdsToastV1);
                int i3 = 72 / 0;
            } else {
                Intrinsics.checkNotNullParameter(tdsToastV1, "");
                function1.invoke(tdsToastV1);
            }
            int i4 = onPostMessage + 19;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }

        private static /* synthetic */ Object asBinder(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback;
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            final Function1 function1 = (Function1) objArr[2];
            int i = 2 % 2;
            int i2 = onActivityResized + 73;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            String string = onnavigationevent.ICustomTabsCallback.getContext().getString(iIntValue);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (function1 == null) {
                int i4 = onActivityResized + 81;
                int i5 = i4 % 128;
                onPostMessage = i5;
                int i6 = i4 % 2;
                int i7 = i5 + Imgproc.COLOR_YUV2RGB_YVYU;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
                iAuthTabCallback = null;
            } else {
                iAuthTabCallback = new IAuthTabCallback() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$Builder$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // im.toss.uikit.widget.snackbar.TdsToastV1.IAuthTabCallback
                    public final void onClick(TdsToastV1 tdsToastV1) throws Throwable {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 47;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        TdsToastV1.onNavigationEvent.onWarmupCompleted(function1, tdsToastV1);
                        int i12 = onExtraCallbackWithResult + 107;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                    }
                };
            }
            return onnavigationevent.onExtraCallbackWithResult(string, iAuthTabCallback);
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            TdsToastV1 tdsToastV1 = (TdsToastV1) objArr[1];
            int i = 2 % 2;
            int i2 = onPostMessage + 79;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tdsToastV1, "");
            function1.invoke(tdsToastV1);
            int i4 = onActivityResized + 51;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        public final onNavigationEvent IAuthTabCallback(@Nullable IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = onPostMessage;
            int i3 = i2 + 17;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            this.writeTypedObject = iAuthTabCallback;
            int i5 = i2 + 49;
            onActivityResized = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onNavigationEvent onWarmupCompleted(@Nullable final Function1<? super TdsToastV1, Unit> function1) {
            int i = 2 % 2;
            int i2 = onActivityResized + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i3 = i2 % 128;
            onPostMessage = i3;
            IAuthTabCallback iAuthTabCallback = null;
            if (i2 % 2 == 0) {
                iAuthTabCallback.hashCode();
                throw null;
            }
            if (function1 == null) {
                int i4 = i3 + 67;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback() { // from class: im.toss.uikit.widget.snackbar.TdsToastV1$Builder$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // im.toss.uikit.widget.snackbar.TdsToastV1.IAuthTabCallback
                    public final void onClick(TdsToastV1 tdsToastV1) throws Throwable {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 85;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        TdsToastV1.onNavigationEvent.onExtraCallback(function1, tdsToastV1);
                        if (i8 != 0) {
                            throw null;
                        }
                    }
                };
            }
            onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(iAuthTabCallback);
            int i6 = onPostMessage + 51;
            onActivityResized = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 10 / 0;
            }
            return onnavigationeventIAuthTabCallback;
        }

        public final onNavigationEvent onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onPostMessage + 103;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            this.IAuthTabCallbackStubProxy = z;
            int i5 = i3 + 21;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final onNavigationEvent onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = onActivityResized;
            int i3 = i2 + 67;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            this.access100 = z;
            int i5 = i2 + 65;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final onNavigationEvent onExtraCallback(@NotNull Function0<Unit> function0) {
            int i = 2 % 2;
            int i2 = onActivityResized + 95;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(function0, "");
            this.extraCallbackWithResult = function0;
            int i4 = onActivityResized + 97;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final onNavigationEvent onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onActivityResized + 91;
            int i4 = i3 % 128;
            onPostMessage = i4;
            int i5 = i3 % 2;
            this.onMessageChannelReady = i;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i4 + 13;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final onNavigationEvent IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onActivityResized + 21;
            onPostMessage = i3 % 128;
            this.onExtraCallbackWithResult = i3 % 2 == 0 ? i * onTransact() : i - onTransact();
            int i4 = onActivityResized + 93;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final onNavigationEvent onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onPostMessage + 105;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            this.IAuthTabCallbackStub = Integer.valueOf(i);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = onPostMessage + 25;
            onActivityResized = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return this;
        }

        public final onNavigationEvent onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = onPostMessage;
            int i3 = i2 + 85;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            this.asBinder = z;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 23;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final onNavigationEvent asInterface() {
            int i = 2 % 2;
            int i2 = onPostMessage + 17;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            this.access000 = true;
            return this;
        }

        public final onNavigationEvent onNavigationEvent(@NotNull View view) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            if (view.getMeasuredHeight() <= onTransact()) {
                return this;
            }
            int i2 = onActivityResized + 57;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            int measuredHeight = view.getMeasuredHeight();
            if (i3 == 0) {
                IAuthTabCallback(measuredHeight);
                throw null;
            }
            onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(measuredHeight);
            int i4 = onActivityResized + 69;
            onPostMessage = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationeventIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        
            if ((!access000()) != true) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r1 = r4.ICustomTabsCallback.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
            r1 = o.hasVaryAll.IAuthTabCallback(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            if (r1 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            r2 = im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent.onActivityResized + 25;
            im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent.onPostMessage = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if ((r2 % 2) == 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            r0 = r1.findViewById(android.R.id.content);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r0 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            r1.findViewById(android.R.id.content);
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            return r4.ICustomTabsCallback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            if (access000() != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final View IAuthTabCallbackDefault() {
            int i = 2 % 2;
            if (!this.access000) {
                int i2 = onActivityResized + 39;
                onPostMessage = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 63 / 0;
                }
            }
            return this.ICustomTabsCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Resources.NotFoundException {
            int height;
            int height2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            ConstraintLayout constraintLayout = (View) objArr[1];
            int i = 2 % 2;
            if (constraintLayout.getVisibility() != 0) {
                return false;
            }
            if (!onnavigationevent.onWarmupCompleted) {
                if (constraintLayout instanceof TdsBottomCtaV1View) {
                    TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) constraintLayout;
                    onnavigationevent.IAuthTabCallback((tdsBottomCtaV1View.IAuthTabCallbackStub().getVisibility() == 0 ? tdsBottomCtaV1View.getHeight() - tdsBottomCtaV1View.IAuthTabCallbackStub().getHeight() : tdsBottomCtaV1View.getHeight()) + onnavigationevent.onTransact());
                    onnavigationevent.onWarmupCompleted = true;
                    return true;
                }
                if (constraintLayout instanceof KeyboardBottomCta) {
                    View viewFindViewById = constraintLayout.findViewById(R.id.gradient);
                    if (viewFindViewById != null) {
                        int i2 = onPostMessage + 5;
                        onActivityResized = i2 % 128;
                        if (i2 % 2 != 0) {
                            viewFindViewById.getVisibility();
                            throw null;
                        }
                        height2 = viewFindViewById.getVisibility() == 0 ? ((KeyboardBottomCta) constraintLayout).getHeight() - viewFindViewById.getHeight() : ((KeyboardBottomCta) constraintLayout).getHeight();
                    }
                    onnavigationevent.IAuthTabCallback(height2 + onnavigationevent.onTransact());
                    onnavigationevent.onWarmupCompleted = true;
                    return true;
                }
                if (!(constraintLayout instanceof TabBar) && !(constraintLayout instanceof setBuildUuid)) {
                    if (!(true ^ (constraintLayout instanceof ViewGroup))) {
                        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) constraintLayout).IAuthTabCallback();
                        while (itIAuthTabCallback.hasNext()) {
                            int i3 = onPostMessage + 25;
                            onActivityResized = i3 % 128;
                            if (i3 % 2 != 0) {
                                Object[] objArr2 = {onnavigationevent, (View) itIAuthTabCallback.next()};
                                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                                int i4 = 36 / 0;
                                if (((Boolean) onWarmupCompleted(a.3.onWarmupCompleted(), 1843284625, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), objArr2, -1843284623, iOnWarmupCompleted)).booleanValue()) {
                                    return true;
                                }
                            } else {
                                Object[] objArr3 = {onnavigationevent, (View) itIAuthTabCallback.next()};
                                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                                if (((Boolean) onWarmupCompleted(a.3.onWarmupCompleted(), 1843284625, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), objArr3, -1843284623, iOnWarmupCompleted2)).booleanValue()) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                if (constraintLayout.getHeight() == 0) {
                    height = onnavigationevent.ICustomTabsCallback.getContext().getResources().getDimensionPixelSize(R.dimen.bottom_tab_bar_height);
                } else {
                    height = constraintLayout.getHeight();
                    int i5 = onPostMessage + 19;
                    onActivityResized = i5 % 128;
                    int i6 = i5 % 2;
                }
                onnavigationevent.IAuthTabCallback(height + onnavigationevent.onTransact());
                onnavigationevent.onWarmupCompleted = true;
            }
            return true;
        }

        private final void IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onActivityResized + 115;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Context context = this.ICustomTabsCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
            if (activityIAuthTabCallback != null) {
                int i4 = onPostMessage + 65;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                ViewGroup viewGroup = (ViewGroup) activityIAuthTabCallback.findViewById(android.R.id.content);
                if (viewGroup != null) {
                    int iOnWarmupCompleted = a.3.onWarmupCompleted();
                    int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                    int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                    ((Boolean) onWarmupCompleted(a.3.onWarmupCompleted(), 1843284625, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this, viewGroup}, -1843284623, iOnWarmupCompleted)).booleanValue();
                }
            }
        }

        private final boolean access000() {
            int i = 2 % 2;
            int i2 = onActivityResized + 37;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                Context context = this.ICustomTabsCallback.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ComponentCallbacks2 componentCallbacks2IAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
                if (!(componentCallbacks2IAuthTabCallback instanceof AFj1rSDKExternalSyntheticLambda0) || !AFj1rSDKExternalSyntheticLambda1.onWarmupCompleted(((AFj1rSDKExternalSyntheticLambda0) componentCallbacks2IAuthTabCallback).IAuthTabCallback())) {
                    return false;
                }
                int i3 = onPostMessage + 61;
                onActivityResized = i3 % 128;
                if (i3 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            Context context2 = this.ICustomTabsCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            boolean z = hasVaryAll.IAuthTabCallback(context2) instanceof AFj1rSDKExternalSyntheticLambda0;
            throw null;
        }

        /* renamed from: im.toss.uikit.widget.snackbar.TdsToastV1$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0008onNavigationEvent extends BaseTransientBar.onExtraCallbackWithResult<TdsToastV1> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Function0<Unit> IAuthTabCallback;

            C0008onNavigationEvent(Function0<Unit> function0) {
                this.IAuthTabCallback = function0;
            }

            @Override // im.toss.uikit.widget.snackbar.BaseTransientBar.onExtraCallbackWithResult
            public void IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    super.IAuthTabCallback();
                    this.IAuthTabCallback.invoke();
                    int i3 = 69 / 0;
                } else {
                    super.IAuthTabCallback();
                    this.IAuthTabCallback.invoke();
                }
                int i4 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final TdsToastV1 onWarmupCompleted() throws Throwable {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onActivityResized + 55;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                objOnWarmupCompleted = onWarmupCompleted(a.3.onWarmupCompleted(), -1261591066, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this, 0}, 1261591079, iOnWarmupCompleted);
            } else {
                int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted5 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted6 = a.3.onWarmupCompleted();
                objOnWarmupCompleted = onWarmupCompleted(a.3.onWarmupCompleted(), -1261591066, iOnWarmupCompleted6, iOnWarmupCompleted5, new Object[]{this, 1}, 1261591079, iOnWarmupCompleted4);
            }
            TdsToastV1 tdsToastV1 = (TdsToastV1) objOnWarmupCompleted;
            int i3 = onPostMessage + 105;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                return tdsToastV1;
            }
            throw null;
        }

        public final TdsToastV1 onExtraCallback() throws Throwable {
            int i = 2 % 2;
            int i2 = onPostMessage + 13;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            TdsToastV1 tdsToastV1OnWarmupCompleted = onWarmupCompleted();
            tdsToastV1OnWarmupCompleted.IAuthTabCallback_Parcel();
            int i4 = onPostMessage + Imgproc.COLOR_YUV2RGBA_YVYU;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                return tdsToastV1OnWarmupCompleted;
            }
            throw null;
        }

        public final TdsToastV1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onActivityResized + 51;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                TdsToastV1 tdsToastV1 = (TdsToastV1) onWarmupCompleted(a.3.onWarmupCompleted(), -950699249, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this}, 950699257, iOnWarmupCompleted);
                tdsToastV1.IAuthTabCallback_Parcel();
                int i3 = 3 / 0;
                return tdsToastV1;
            }
            int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted5 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted6 = a.3.onWarmupCompleted();
            TdsToastV1 tdsToastV12 = (TdsToastV1) onWarmupCompleted(a.3.onWarmupCompleted(), -950699249, iOnWarmupCompleted6, iOnWarmupCompleted5, new Object[]{this}, 950699257, iOnWarmupCompleted4);
            tdsToastV12.IAuthTabCallback_Parcel();
            return tdsToastV12;
        }

        public final TdsToastV1 IAuthTabCallback() {
            TdsToastV1 tdsToastV1;
            int i;
            int i2 = 2 % 2;
            int i3 = onPostMessage + 73;
            onActivityResized = i3 % 128;
            if (i3 % 2 != 0) {
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                tdsToastV1 = (TdsToastV1) onWarmupCompleted(a.3.onWarmupCompleted(), -950699249, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this}, 950699257, iOnWarmupCompleted);
                i = 90;
            } else {
                int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted5 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted6 = a.3.onWarmupCompleted();
                tdsToastV1 = (TdsToastV1) onWarmupCompleted(a.3.onWarmupCompleted(), -950699249, iOnWarmupCompleted6, iOnWarmupCompleted5, new Object[]{this}, 950699257, iOnWarmupCompleted4);
                i = -2;
            }
            tdsToastV1.asBinder(i);
            tdsToastV1.IAuthTabCallback_Parcel();
            return tdsToastV1;
        }

        public static final class onWarmupCompleted {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onNavigationEvent onWarmupCompleted(@NotNull Activity activity, @NotNull onNavigationEvent onnavigationevent) throws Throwable {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(activity, "");
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                onNavigationEvent onnavigationevent2 = new onNavigationEvent(activity, onNavigationEvent.extraCallback(onnavigationevent));
                onNavigationEvent.onNavigationEvent(onnavigationevent2, onNavigationEvent.IAuthTabCallbackStub(onnavigationevent));
                onNavigationEvent.onWarmupCompleted(onnavigationevent2, onNavigationEvent.asInterface(onnavigationevent));
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
                onNavigationEvent.onNavigationEvent(onnavigationevent2, (RecomposerawaitIdle2.onNavigationEvent) onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), -1878562414, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{onnavigationevent}, 1878562420, iOnWarmupCompleted));
                onNavigationEvent.onWarmupCompleted(onnavigationevent2, onNavigationEvent.onTransact(onnavigationevent));
                onNavigationEvent.onExtraCallback(onnavigationevent2, onNavigationEvent.IAuthTabCallback_Parcel(onnavigationevent));
                onNavigationEvent.onNavigationEvent(onnavigationevent2, onNavigationEvent.access000(onnavigationevent));
                int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted5 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted6 = a.3.onWarmupCompleted();
                Object[] objArr = {onnavigationevent2, (String) onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 2081993647, iOnWarmupCompleted6, iOnWarmupCompleted5, new Object[]{onnavigationevent}, -2081993647, iOnWarmupCompleted4)};
                int iOnWarmupCompleted7 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted8 = a.3.onWarmupCompleted();
                onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 376243078, a.3.onWarmupCompleted(), iOnWarmupCompleted8, objArr, -376243066, iOnWarmupCompleted7);
                onNavigationEvent.onExtraCallbackWithResult(onnavigationevent2, onNavigationEvent.onExtraCallback(onnavigationevent));
                onNavigationEvent.onWarmupCompleted(onnavigationevent2, onNavigationEvent.access100(onnavigationevent));
                Object[] objArr2 = {onnavigationevent2, Integer.valueOf(onNavigationEvent.extraCallbackWithResult(onnavigationevent))};
                int iOnWarmupCompleted9 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted10 = a.3.onWarmupCompleted();
                onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), -1482635149, a.3.onWarmupCompleted(), iOnWarmupCompleted10, objArr2, 1482635159, iOnWarmupCompleted9);
                Object[] objArr3 = {onnavigationevent2, Integer.valueOf(onNavigationEvent.onNavigationEvent(onnavigationevent))};
                int iOnWarmupCompleted11 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted12 = a.3.onWarmupCompleted();
                onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 1454993148, a.3.onWarmupCompleted(), iOnWarmupCompleted12, objArr3, -1454993147, iOnWarmupCompleted11);
                onNavigationEvent.onNavigationEvent(onnavigationevent2, onNavigationEvent.IAuthTabCallbackStubProxy(onnavigationevent));
                onNavigationEvent.IAuthTabCallback(onnavigationevent2, onNavigationEvent.IAuthTabCallbackDefault(onnavigationevent));
                onNavigationEvent.onExtraCallback(onnavigationevent2, onNavigationEvent.getInterfaceDescriptor(onnavigationevent));
                onNavigationEvent.onNavigationEvent(onnavigationevent2, onNavigationEvent.ICustomTabsCallback(onnavigationevent));
                onNavigationEvent.onNavigationEvent(onnavigationevent2, onNavigationEvent.onExtraCallbackWithResult(onnavigationevent));
                int iOnWarmupCompleted13 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted14 = a.3.onWarmupCompleted();
                int iOnWarmupCompleted15 = a.3.onWarmupCompleted();
                onNavigationEvent.onExtraCallback(onnavigationevent2, ((Boolean) onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 1244296264, iOnWarmupCompleted15, iOnWarmupCompleted14, new Object[]{onnavigationevent}, -1244296255, iOnWarmupCompleted13)).booleanValue());
                int i2 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent2;
            }
        }

        public static final /* synthetic */ String IAuthTabCallback(onNavigationEvent onnavigationevent) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            return (String) onWarmupCompleted(a.3.onWarmupCompleted(), 2081993647, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{onnavigationevent}, -2081993647, iOnWarmupCompleted);
        }

        public static final /* synthetic */ boolean onWarmupCompleted(onNavigationEvent onnavigationevent) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            return ((Boolean) onWarmupCompleted(a.3.onWarmupCompleted(), 1244296264, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{onnavigationevent}, -1244296255, iOnWarmupCompleted)).booleanValue();
        }

        public static final /* synthetic */ RecomposerawaitIdle2.onNavigationEvent asBinder(onNavigationEvent onnavigationevent) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            return (RecomposerawaitIdle2.onNavigationEvent) onWarmupCompleted(a.3.onWarmupCompleted(), -1878562414, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{onnavigationevent}, 1878562420, iOnWarmupCompleted);
        }

        public static final /* synthetic */ CharSequence extraCallback(onNavigationEvent onnavigationevent) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            return (CharSequence) onWarmupCompleted(a.3.onWarmupCompleted(), 117835542, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{onnavigationevent}, -117835539, iOnWarmupCompleted);
        }

        public static final /* synthetic */ void onExtraCallbackWithResult(onNavigationEvent onnavigationevent, int i) throws Throwable {
            Object[] objArr = {onnavigationevent, Integer.valueOf(i)};
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            onWarmupCompleted(a.3.onWarmupCompleted(), 1454993148, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, -1454993147, iOnWarmupCompleted);
        }

        public static final /* synthetic */ void onExtraCallback(onNavigationEvent onnavigationevent, String str) throws Throwable {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            onWarmupCompleted(a.3.onWarmupCompleted(), 376243078, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{onnavigationevent, str}, -376243066, iOnWarmupCompleted);
        }

        public static final /* synthetic */ void IAuthTabCallback(onNavigationEvent onnavigationevent, int i) throws Throwable {
            Object[] objArr = {onnavigationevent, Integer.valueOf(i)};
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            onWarmupCompleted(a.3.onWarmupCompleted(), -1482635149, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, 1482635159, iOnWarmupCompleted);
        }

        private final TdsToastV1 onExtraCallbackWithResult(int i) {
            Object[] objArr = {this, Integer.valueOf(i)};
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            return (TdsToastV1) onWarmupCompleted(a.3.onWarmupCompleted(), -1261591066, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, 1261591079, iOnWarmupCompleted);
        }

        private final boolean onWarmupCompleted(View view) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            return ((Boolean) onWarmupCompleted(a.3.onWarmupCompleted(), 1843284625, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this, view}, -1843284623, iOnWarmupCompleted)).booleanValue();
        }

        private static final void onExtraCallbackWithResult(Function1 function1, TdsToastV1 tdsToastV1) throws Throwable {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            onWarmupCompleted(a.3.onWarmupCompleted(), 893354320, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, tdsToastV1}, -893354316, iOnWarmupCompleted);
        }

        private static final void asInterface(Function1 function1, TdsToastV1 tdsToastV1) throws Throwable {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            onWarmupCompleted(a.3.onWarmupCompleted(), 1204433140, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, tdsToastV1}, -1204433129, iOnWarmupCompleted);
        }

        public final TdsToastV1 onExtraCallbackWithResult() {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            return (TdsToastV1) onWarmupCompleted(a.3.onWarmupCompleted(), -950699249, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this}, 950699257, iOnWarmupCompleted);
        }

        public final onNavigationEvent onWarmupCompleted(int i, @Nullable Function1<? super TdsToastV1, Unit> function1) {
            Object[] objArr = {this, Integer.valueOf(i), function1};
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            return (onNavigationEvent) onWarmupCompleted(a.3.onWarmupCompleted(), -936884656, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, 936884670, iOnWarmupCompleted);
        }

        public final onNavigationEvent onNavigationEvent(@NotNull String str, @Nullable Function1<? super TdsToastV1, Unit> function1) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            return (onNavigationEvent) onWarmupCompleted(a.3.onWarmupCompleted(), 289755328, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{this, str, function1}, -289755323, iOnWarmupCompleted);
        }

        public final onNavigationEvent onWarmupCompleted(@NotNull RecomposerawaitIdle2.onNavigationEvent onnavigationevent, int i) {
            Object[] objArr = {this, onnavigationevent, Integer.valueOf(i)};
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            return (onNavigationEvent) onWarmupCompleted(a.3.onWarmupCompleted(), -957102186, a.3.onWarmupCompleted(), iOnWarmupCompleted2, objArr, 957102193, iOnWarmupCompleted);
        }
    }

    private final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 123;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Context contextOnWarmupCompleted = onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(contextOnWarmupCompleted, "");
            if (!varyFields.onWarmupCompleted(contextOnWarmupCompleted)) {
                return false;
            }
            int i3 = onActivityResized + Imgproc.COLOR_YUV2RGB_YVYU;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                CardView cardView = this.IAuthTabCallbackStub;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                return cardView.getVisibility() == 0;
            }
            CardView cardView2 = this.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(cardView2, "");
            cardView2.getVisibility();
            throw null;
        }
        Context contextOnWarmupCompleted2 = onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(contextOnWarmupCompleted2, "");
        varyFields.onWarmupCompleted(contextOnWarmupCompleted2);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsToastV1 tdsToastV1, View view) throws Throwable {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1, view}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 107101012, iOnNavigationEvent2, -107101004);
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return ((Boolean) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 805409075, iOnNavigationEvent2, -805409069)).booleanValue();
    }

    public static final /* synthetic */ TdsImageView IAuthTabCallbackStub(TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (TdsImageView) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -320490892, iOnNavigationEvent2, 320490895);
    }

    public static final /* synthetic */ boolean access000(TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return ((Boolean) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1213177146, iOnNavigationEvent2, -1213177142)).booleanValue();
    }

    public static final /* synthetic */ BaseTextView IAuthTabCallbackStubProxy(TdsToastV1 tdsToastV1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (BaseTextView) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{tdsToastV1}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -959345127, iOnNavigationEvent2, 959345129);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(TdsToastV1 tdsToastV1, boolean z) throws Throwable {
        Object[] objArr = {tdsToastV1, Boolean.valueOf(z)};
        onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -519609908, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 519609909);
    }

    private final TdsToastV1 onNavigationEvent(RecomposerawaitIdle2.onNavigationEvent onnavigationevent) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (TdsToastV1) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this, onnavigationevent}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1941918142, iOnNavigationEvent2, -1941918142);
    }

    private final TdsToastV1 onTransact(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return (TdsToastV1) onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -300767228, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 300767233);
    }

    private final TdsToastV1 onExtraCallback(CharSequence charSequence) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (TdsToastV1) onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this, charSequence}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1021957349, iOnNavigationEvent2, 1021957356);
    }

    static void ICustomTabsCallback() {
        onActivityLayout = new int[]{592392799, -526837741, 1713897341, 1653589676, -1921855994, 610843386, 320870346, -610068585, -1646799752, -472548621, 1326829057, 1799617498, 256678371, -451550038, 1635911691, -12256466, -1645813749, 846197222};
    }
}
