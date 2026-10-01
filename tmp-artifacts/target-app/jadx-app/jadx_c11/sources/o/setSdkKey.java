package o;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.splittarget.spec.lockscreen.LockScreenView$;
import im.toss.tds.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.widget.RoundFrameLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pxToDp;
import o.setSdkKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setSdkKey {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100;
    private View IAuthTabCallback;
    private final ViewGroup asBinder;
    private final Lazy asInterface;
    private final Lazy onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private RoundFrameLayout onTransact;
    private runOnUiThreadDelayed onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onNavigationEvent = 8;

    static {
        int i = access100 + 91;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ImageView onExtraCallback(setSdkKey setsdkkey) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageViewOnNavigationEvent = onNavigationEvent(setsdkkey);
        int i4 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return imageViewOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i) | i7 | i6);
        int i9 = (~i6) | i7;
        int i10 = i8 | (~(i9 | i)) | (~(i3 | i | i6));
        int i11 = ~i9;
        int i12 = (~(i6 | i3)) | i | i11;
        int i13 = (~(i7 | i)) | i11;
        int i14 = i3 + i + i5 + (933655473 * i2) + ((-1037598838) * i4);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i3) - 925892608) + (470833381 * i) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i5) + ((-1691877376) * i2) + ((-393216000) * i4) + ((-1633878016) * i15);
        int i17 = ((i3 * (-727610197)) - 1081761860) + (i * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i5 * (-727609241)) + (i2 * 1532828727) + (i4 * (-747900794)) + (i15 * 556466176);
        int i18 = i16 + (i17 * i17 * (-1911357440));
        if (i18 == 1) {
            setSdkKey setsdkkey = (setSdkKey) objArr[0];
            int i19 = 2 % 2;
            int i20 = IAuthTabCallbackDefault + 71;
            IAuthTabCallbackStub = i20 % 128;
            int i21 = i20 % 2;
            ImageView imageView = (ImageView) setsdkkey.asInterface.getValue();
            int i22 = IAuthTabCallbackStub + 71;
            IAuthTabCallbackDefault = i22 % 128;
            int i23 = i22 % 2;
            return imageView;
        }
        if (i18 != 2) {
            return onNavigationEvent(objArr);
        }
        setSdkKey setsdkkey2 = (setSdkKey) objArr[0];
        int i24 = 2 % 2;
        int i25 = IAuthTabCallbackDefault;
        int i26 = i25 + 109;
        IAuthTabCallbackStub = i26 % 128;
        int i27 = i26 % 2;
        boolean z = setsdkkey2.onExtraCallbackWithResult;
        int i28 = i25 + 87;
        IAuthTabCallbackStub = i28 % 128;
        int i29 = i28 % 2;
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RoundFrameLayout roundFrameLayout, setSdkKey setsdkkey, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(roundFrameLayout, setsdkkey, f);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(roundFrameLayout, setsdkkey, f);
        int i3 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setSdkKey setsdkkey, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(-1405612840, setVisitUrl.onExtraCallbackWithResult(), 1405612840, setVisitUrl.onExtraCallbackWithResult(), new Object[]{setsdkkey, function0}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ ImageView onWarmupCompleted(setSdkKey setsdkkey) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageViewIAuthTabCallback = IAuthTabCallback(setsdkkey);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return imageViewIAuthTabCallback;
    }

    public setSdkKey(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.asBinder = viewGroup;
        this.asInterface = LazyKt.onExtraCallbackWithResult(new LockScreenView$.ExternalSyntheticLambda2(this));
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new LockScreenView$.ExternalSyntheticLambda3(this));
    }

    public final void onExtraCallback(@Nullable View view) {
        int iRgb;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        RoundFrameLayout roundFrameLayoutOnWarmupCompleted = null;
        if (view != null) {
            int i5 = i3 + 99;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                onWarmupCompleted(view);
                roundFrameLayoutOnWarmupCompleted.hashCode();
                throw null;
            }
            roundFrameLayoutOnWarmupCompleted = onWarmupCompleted(view);
        }
        this.onTransact = roundFrameLayoutOnWarmupCompleted;
        if (roundFrameLayoutOnWarmupCompleted != null && view != null) {
            Resources resources = this.asBinder.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (!readIntokhttp.onExtraCallback(configuration)) {
                iRgb = Color.rgb(221, 227, 236);
            } else {
                int i6 = IAuthTabCallbackStub + 77;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                iRgb = Color.rgb(0, 0, 0);
            }
            view.setBackgroundColor(iRgb);
        }
        this.IAuthTabCallback = view;
    }

    private static final ImageView IAuthTabCallback(setSdkKey setsdkkey) {
        int i = 2 % 2;
        ImageView imageView = new ImageView(setsdkkey.asBinder.getContext());
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        imageView.setImageDrawable(new ColorDrawable(ContextCompat.getColor(imageView.getRootView().getContext(), R.color.background_default)));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        int i2 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return imageView;
    }

    private final ImageView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = (ImageView) this.onExtraCallback.getValue();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return imageView;
    }

    private static final ImageView onNavigationEvent(setSdkKey setsdkkey) {
        int i = 2 % 2;
        ImageView imageView = new ImageView(setsdkkey.asBinder.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(setTagsokhttp.onExtraCallbackWithResult(imageView, 288), setTagsokhttp.onExtraCallbackWithResult(imageView, 288), 17));
        imageView.setImageDrawable(ResourcesCompat.onExtraCallback(imageView.getResources(), im.toss.uikit.R.drawable.img_splash, (Resources.Theme) null));
        int i2 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return imageView;
    }

    public static /* synthetic */ void onWarmupCompleted(setSdkKey setsdkkey, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 99;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 119;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 + 121;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        setsdkkey.onWarmupCompleted(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
            if (!z) {
                if (this.onExtraCallbackWithResult) {
                    return;
                }
            }
        } else if (!z) {
        }
        ViewGroup viewGroup = this.asBinder;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        viewGroup.removeView((ImageView) onExtraCallbackWithResult(2066127632, setVisitUrl.onExtraCallbackWithResult(), -2066127631, setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult));
        viewGroup.removeView(onNavigationEvent());
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        viewGroup.addView((ImageView) onExtraCallbackWithResult(2066127632, setVisitUrl.onExtraCallbackWithResult(), -2066127631, setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2));
        viewGroup.addView(onNavigationEvent());
        this.onExtraCallbackWithResult = true;
        int i4 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(RoundFrameLayout roundFrameLayout, setSdkKey setsdkkey, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float f2 = (0.15f * f) + 0.85f;
        roundFrameLayout.setScaleX(f2);
        roundFrameLayout.setScaleY(f2);
        Intrinsics.checkNotNullExpressionValue(setsdkkey.asBinder.getContext(), "");
        roundFrameLayout.setCornerRadius(varyMatches.IAuthTabCallback((Number) 40, r4) * (1.0f - f));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setSdkKey setsdkkey = (setSdkKey) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroup = setsdkkey.asBinder;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        viewGroup.removeView((ImageView) onExtraCallbackWithResult(2066127632, setVisitUrl.onExtraCallbackWithResult(), -2066127631, setVisitUrl.onExtraCallbackWithResult(), new Object[]{setsdkkey}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult));
        setsdkkey.asBinder.removeView(setsdkkey.onNavigationEvent());
        View view = setsdkkey.IAuthTabCallback;
        if (view != null) {
            view.setBackgroundColor(0);
        }
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }

    public final void onWarmupCompleted(@Nullable final Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        if (this.onExtraCallbackWithResult) {
            Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{onNavigationEvent(), isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf2, fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{(ImageView) onExtraCallbackWithResult(2066127632, setVisitUrl.onExtraCallbackWithResult(), -2066127631, setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult), isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(250.0d, 40.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), fValueOf2, fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)});
            final RoundFrameLayout roundFrameLayout = this.onTransact;
            if (roundFrameLayout != null) {
                Object[] objArr = {(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(250.0d, 40.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.splittarget.spec.lockscreen.LockScreenView$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 77;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnExtraCallbackWithResult = setSdkKey.onExtraCallbackWithResult(roundFrameLayout, this, ((Float) obj).floatValue());
                        int i7 = onExtraCallback + 71;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, null, 8, null};
                listMutableListOf.add((Rally) RallysKt.onWarmupCompleted(new Object[]{roundFrameLayout, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            }
            runOnUiThreadDelayed runonuithreaddelayed = this.onWarmupCompleted;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
            this.onWarmupCompleted = (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted(null, pxToDp.IAuthTabCallback.onExtraCallback, listMutableListOf, 0, null, 0, null, null, null, 0, 0L, false, 4089, null), null, new Function0() { // from class: im.toss.splittarget.spec.lockscreen.LockScreenView$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 41;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnNavigationEvent = setSdkKey.onNavigationEvent(this.f$0, function0);
                    int i7 = IAuthTabCallback + 65;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnNavigationEvent;
                }
            }, 1, null), false, 1, null);
            this.onExtraCallbackWithResult = false;
            int i4 = IAuthTabCallbackStub + 81;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final RoundFrameLayout onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = view instanceof RoundFrameLayout;
            throw null;
        }
        if (view instanceof RoundFrameLayout) {
            return (RoundFrameLayout) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                int i4 = IAuthTabCallbackStub + 45;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                View childAt = viewGroup.getChildAt(i3);
                Intrinsics.checkNotNull(childAt);
                RoundFrameLayout roundFrameLayoutOnWarmupCompleted = onWarmupCompleted(childAt);
                if (roundFrameLayoutOnWarmupCompleted != null) {
                    return roundFrameLayoutOnWarmupCompleted;
                }
                i3++;
                int i6 = IAuthTabCallbackStub + 125;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private final ImageView onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (ImageView) onExtraCallbackWithResult(2066127632, setVisitUrl.onExtraCallbackWithResult(), -2066127631, setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(setSdkKey setsdkkey, Function0 function0) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-1405612840, setVisitUrl.onExtraCallbackWithResult(), 1405612840, setVisitUrl.onExtraCallbackWithResult(), new Object[]{setsdkkey, function0}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult);
    }

    public final boolean onExtraCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(1675082423, setVisitUrl.onExtraCallbackWithResult(), -1675082421, setVisitUrl.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).booleanValue();
    }
}
