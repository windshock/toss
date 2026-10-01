package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.extensions.ViewsKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.R;
import im.toss.uikit.widget.KeyboardBottomCta;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.UpdatableAnimationStateExternalSyntheticLambda1;
import o.pxToDp;
import o.transparentBackground;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;
import viva.republica.toss.service.LabActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class transparentBackground {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int[] onNavigationEvent;
    private static final WeakHashMap<Object, Long> onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[getContentView.values().length];
            try {
                iArr[getContentView.DEFAULT.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getContentView.SMALL.ordinal()] = 2;
                int i3 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getContentView.BOUNCE.ordinal()] = 3;
                int i5 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(View.OnClickListener onClickListener, View view, Unit unit) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onClickListener, view, unit);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = IAuthTabCallback + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(View view, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(view, i, valueAnimator);
        if (i4 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(RecyclerView recyclerView, int i, Function0 function0, View view, Function0 function02, boolean z, float f, float f2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(recyclerView, i, function0, view, function02, z, f, f2);
        int i5 = onExtraCallback + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(String str, View view, long j, Function1 function1, View view2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(str, view, j, function1, view2);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = IAuthTabCallback + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 2 / 0;
        return null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(th);
        }
        IAuthTabCallback(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(str);
        }
        onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(function0);
        }
        onNavigationEvent(function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, boolean z, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {function0, Boolean.valueOf(z), view};
            return (Unit) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1376653551, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1376653567, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
        }
        Object[] objArr2 = {function0, Boolean.valueOf(z), view};
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = onExtraCallback + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function0, zBooleanValue, view);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, zBooleanValue, view);
        int i3 = onExtraCallback + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(str);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = onExtraCallback + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Context context, wipeOffVhost wipeoffvhost, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(context, wipeoffvhost, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(view, i, valueAnimator);
        int i5 = onExtraCallback + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Bitmap bitmap, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
            onWarmupCompleted(iOnWarmupCompleted, new Object[]{function1, bitmap, numValueOf}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 659377422, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -659377407, iOnWarmupCompleted2);
            return;
        }
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted3, new Object[]{function1, bitmap, numValueOf}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 659377422, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -659377407, iOnWarmupCompleted4);
        throw null;
    }

    private static final String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = onExtraCallback + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ WeakHashMap onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        WeakHashMap<Object, Long> weakHashMap = onWarmupCompleted;
        int i5 = i2 + 23;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return weakHashMap;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0, float f, TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda02, Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {transformableStateKtanimateZoomBy3ExternalSyntheticLambda0, Float.valueOf(f), transformableStateKtanimateZoomBy3ExternalSyntheticLambda02, l};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(iOnWarmupCompleted, objArr, iOnWarmupCompleted4, 2014723581, iOnWarmupCompleted3, -2014723575, iOnWarmupCompleted2);
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(view, valueAnimator);
        int i4 = IAuthTabCallback + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return str;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(RecyclerView recyclerView, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 270942115, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -270942107, iOnWarmupCompleted2);
        int i5 = onExtraCallback + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, new Object[]{function1, view}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -838163920, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 838163932, iOnWarmupCompleted2);
        int i4 = onExtraCallback + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, View view, long j, View view2, boolean z, float f, float f2, List list, Function2 function2, getContentView getcontentview, Function1 function1, boolean z2, View view3, MotionEvent motionEvent) {
        boolean zOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallback = onExtraCallback(str, view, j, view2, z, f, f2, list, function2, getcontentview, function1, z2, view3, motionEvent);
            int i3 = 31 / 0;
        } else {
            zOnExtraCallback = onExtraCallback(str, view, j, view2, z, f, f2, list, function2, getcontentview, function1, z2, view3, motionEvent);
        }
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
        view.setEnabled(true);
    }

    public static final void onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        view.setEnabled(false);
        int i4 = onExtraCallback + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ View onExtraCallback(ViewGroup viewGroup, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i4 + 55;
            onExtraCallback = i7 % 128;
            z = i7 % 2 != 0;
        }
        View viewOnNavigationEvent = onNavigationEvent(viewGroup, i, z);
        int i8 = IAuthTabCallback + 95;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return viewOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final View onNavigationEvent(@NotNull ViewGroup viewGroup, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        int i5 = onExtraCallback + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return viewInflate;
    }

    private static final void onNavigationEvent(View view, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            int iIntValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = iIntValue;
            view.setLayoutParams(layoutParams);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        int iIntValue2 = ((Integer) animatedValue2).intValue();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = iIntValue2;
        view.setLayoutParams(layoutParams2);
        if (iIntValue2 == i) {
            int i4 = IAuthTabCallback + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            view.setTag(R.id.view_animation, "");
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 13;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 51;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 71 - ImageFormat.getBitsPerPixel(0), MotionEvent.axisFromString("") + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        char c = '0';
        if (iArr5 != null) {
            int i12 = $11 + 75;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i14]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c, i6, i6) + 1), 72 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i14++;
                c = '0';
                i6 = 0;
            }
            i2 = i6;
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
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf("", '0', 0, 0)), 39 - View.MeasureSpec.makeMeasureSpec(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (KeyEvent.getMaxKeyCode() >> 16)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 77, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i20 = $11 + 45;
        $10 = i20 % 128;
        int i21 = i20 % 2;
        objArr[0] = str;
    }

    private static final void onWarmupCompleted(View view, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            int iIntValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = iIntValue;
            view.setLayoutParams(layoutParams);
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        int iIntValue2 = ((Integer) animatedValue2).intValue();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = iIntValue2;
        view.setLayoutParams(layoutParams2);
        if (iIntValue2 == i) {
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                view.setTag(R.id.view_animation, "");
            } else {
                view.setTag(R.id.view_animation, "");
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull View view, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ValueAnimator valueAnimator = null;
        if (view.getTag() != null) {
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(!(view.getTag() instanceof ValueAnimator))) {
                int i4 = onExtraCallback + 25;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Object tag = view.getTag();
                    Intrinsics.checkNotNull(tag, "");
                    throw null;
                }
                Object tag2 = view.getTag();
                Intrinsics.checkNotNull(tag2, "");
                valueAnimator = (ValueAnimator) tag2;
            }
        }
        if (valueAnimator != null) {
            int i5 = IAuthTabCallback + 87;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getRotation(), f);
        valueAnimatorOfFloat.addUpdateListener(new ViewsKt$.ExternalSyntheticLambda17(view));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
        view.setTag(valueAnimatorOfFloat);
    }

    private static final void onExtraCallback(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        view.setRotation(((Float) animatedValue).floatValue());
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        View view = (View) objArr[0];
        ParamUtils paramUtils = (ParamUtils) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paramUtils, "");
        Intrinsics.checkNotNullParameter(function1, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = onWarmupCompleted(view, paramUtils, new View.OnClickListener() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                transparentBackground.onWarmupCompleted(function1, view2);
                if (i4 != 0) {
                    int i5 = 69 / 0;
                }
            }
        });
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserializeurinullablecollectionOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final deserializeUriNullableCollection onWarmupCompleted(@Nullable View view, @NotNull ParamUtils paramUtils, @NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(paramUtils, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = onWarmupCompleted(view, paramUtils.getDelay(), onClickListener);
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeurinullablecollectionOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final deserializeUriNullableCollection onWarmupCompleted(final View view, long j, final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (view == null) {
            return null;
        }
        getByteBuffer getbytebufferOnTransact = RxView.onNavigationEvent(view).onTransact(j, TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda18
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                Unit unitIAuthTabCallback = transparentBackground.IAuthTabCallback(onClickListener, view, (Unit) obj);
                int i7 = onExtraCallback + 65;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return unitIAuthTabCallback;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnTransact.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda19
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final void accept(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                transparentBackground.onWarmupCompleted(function1, obj);
                int i7 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 10 / 0;
                }
            }
        });
        int i4 = IAuthTabCallback + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeurinullablecollectionIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(View.OnClickListener onClickListener, View view, Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onClickListener.onClick(view);
        Unit unit2 = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    public static final void onExtraCallback(@NotNull EditText editText) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(editText, "");
        editText.setSelection(editText.length());
        int i4 = onExtraCallback + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onNavigationEvent(@NotNull TextView textView, boolean z) {
        int paintFlags;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        if (z) {
            paintFlags = textView.getPaintFlags() | 16;
        } else {
            paintFlags = textView.getPaintFlags() & (-17);
            int i4 = onExtraCallback + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        textView.setPaintFlags(paintFlags);
    }

    public static final void onExtraCallback(@NotNull TextView textView, @Nullable CharSequence charSequence, @Nullable Integer num, boolean z) {
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        if (num == null) {
            textView.setText(charSequence);
            return;
        }
        if (charSequence == null || num.intValue() <= 0) {
            textView.setText("");
            return;
        }
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int length = 0;
        if (!(!z)) {
            string = charSequence.subSequence(0, num.intValue() - 1).toString();
        } else {
            if (textView.getText().length() > num.intValue()) {
                int i6 = onExtraCallback + 117;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                length = textView.getText().length() - num.intValue();
            }
            string = charSequence.subSequence(length, Math.min(charSequence.length(), num.intValue() - 1)).toString();
            int i8 = IAuthTabCallback + 101;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        textView.setText(string);
    }

    public static final void onExtraCallbackWithResult(@NotNull TextView textView, @Nullable CharSequence charSequence, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        if (num == null) {
            textView.append(charSequence);
            return;
        }
        if (charSequence != null) {
            int i4 = onExtraCallback + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (num.intValue() > 0) {
                int i6 = onExtraCallback + 125;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    if ((num.intValue() >>> textView.getText().length()) <= 0) {
                        return;
                    }
                } else if (num.intValue() - textView.getText().length() <= 0) {
                    return;
                }
                textView.append(charSequence.subSequence(0, Math.min(charSequence.length(), num.intValue() - textView.getText().length())).toString());
            }
        }
    }

    public static final List<RecyclerView.ViewHolder> onWarmupCompleted(@NotNull RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        ArrayList arrayList = new ArrayList();
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            linearLayoutManager = layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                linearLayoutManager.findFirstVisibleItemPosition();
                linearLayoutManager.findLastVisibleItemPosition();
                throw null;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                while (true) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                    }
                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                        break;
                    }
                    iFindFirstVisibleItemPosition++;
                }
            }
        }
        return arrayList;
    }

    public static final class onTransact extends LinearSmoothScroller {
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface;

        public int getVerticalSnapPreference() {
            int i = 2 % 2;
            int i2 = asInterface + 63;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 115;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return -1;
            }
            throw null;
        }

        onTransact(Context context) {
            super(context);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final RecyclerView recyclerView = (RecyclerView) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        recyclerView.postDelayed(new Runnable() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda20
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                transparentBackground.onWarmupCompleted(recyclerView, iIntValue);
                int i5 = onExtraCallbackWithResult + 69;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }, jLongValue);
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        RecyclerView recyclerView = (RecyclerView) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        onTransact ontransact = new onTransact(recyclerView.getContext());
        ontransact.setTargetPosition(iIntValue);
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "");
        layoutManager.startSmoothScroll(ontransact);
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r3
      0x003a: PHI (r1v5 int) = (r1v4 int), (r1v10 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r3v5 int) = (r3v4 int), (r3v14 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iComputeVerticalScrollOffset;
        int iComputeVerticalScrollRange;
        float f;
        RecyclerView recyclerView = (RecyclerView) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
            if (iComputeVerticalScrollRange > 0) {
                f = iComputeVerticalScrollOffset / iComputeVerticalScrollRange;
                int i3 = onExtraCallback + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                f = 0.0f;
            }
        } else {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
            if (iComputeVerticalScrollRange > 0) {
            }
        }
        return Float.valueOf(Math.min(1.0f, f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[PHI: r5
      0x0043: PHI (r5v7 im.toss.tds.view.component.atom.image.TdsImageView) = (r5v6 im.toss.tds.view.component.atom.image.TdsImageView), (r5v19 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:10:0x0041, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull TdsListRowV1View tdsListRowV1View, int i) {
        TdsImageView tdsImageViewMayLaunchUrl;
        ViewParent parent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        if (CollectionsKt.listOf(new Integer[]{48, 16}).contains(Integer.valueOf(i))) {
            int i3 = onExtraCallback + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                tdsImageViewMayLaunchUrl = tdsListRowV1View.mayLaunchUrl();
                int i4 = 65 / 0;
                if (tdsImageViewMayLaunchUrl != null) {
                    parent = tdsImageViewMayLaunchUrl.getParent();
                } else {
                    int i5 = onExtraCallback + 39;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 5;
                    }
                    parent = null;
                }
            } else {
                tdsImageViewMayLaunchUrl = tdsListRowV1View.mayLaunchUrl();
                if (tdsImageViewMayLaunchUrl != null) {
                }
            }
            ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
            if (constraintLayout != null) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(constraintLayout);
                int i7 = im.toss.tds.view.R.id.tds_list_row_v1_left_image;
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(i7, 4);
                if (i == 16) {
                    int i8 = onExtraCallback + 121;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i7, 4, im.toss.tds.view.R.id.spaceBottom, 3);
                }
                deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(constraintLayout);
                int i10 = IAuthTabCallback + 125;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        int i12 = onExtraCallback + 71;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 54 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (iIntValue == 0) {
            int i5 = i2 + 113;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                function1.invoke(bitmap);
                return null;
            }
            function1.invoke(bitmap);
            obj.hashCode();
            throw null;
        }
        function1.invoke((Object) null);
        return null;
    }

    public static final void onExtraCallback(@NotNull Activity activity, @NotNull final Function1<? super Bitmap, Unit> function1) {
        Rect rect;
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            function1.invoke((Object) null);
            return;
        }
        if (i4 >= 30) {
            rect = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
            int i5 = onExtraCallback + 109;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        Intrinsics.checkNotNull(rect);
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        try {
            PixelCopy.request(activity.getWindow(), rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i7) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 51;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    transparentBackground.onExtraCallbackWithResult(function1, bitmapCreateBitmap, i7);
                    int i11 = IAuthTabCallback + 81;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                }
            }, new Handler(activity.getMainLooper()));
        } catch (Exception unused) {
            function1.invoke((Object) null);
        }
    }

    public static final boolean onExtraCallback(@NotNull Activity activity) {
        TypedArray typedArrayObtainStyledAttributes;
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Resources.Theme theme = activity.getTheme();
            int[] iArr = new int[0];
            iArr[0] = 16842840;
            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(iArr);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    public static /* synthetic */ TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 onExtraCallback(View view, UpdatableAnimationStateExternalSyntheticLambda1.onNavigationEvent onnavigationevent, float f, float f2, Float f3, Float f4, Float f5, int i, Object obj) {
        Float f6;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i3 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            f = 1500.0f;
        }
        float f7 = f;
        if ((i & 4) != 0) {
            int i7 = onExtraCallback + 97;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            f2 = 1.0f;
        }
        float f8 = f2;
        Float f9 = (i & 8) != 0 ? null : f3;
        Float f10 = (i & 16) != 0 ? null : f4;
        if ((i & 32) != 0) {
            int i9 = onExtraCallback + 31;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            f6 = null;
        } else {
            f6 = f5;
        }
        return IAuthTabCallback(view, onnavigationevent, f7, f8, f9, f10, f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 IAuthTabCallback(@NotNull View view, @NotNull UpdatableAnimationStateExternalSyntheticLambda1.onNavigationEvent onnavigationevent, float f, float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int iOnExtraCallback = onExtraCallback(onnavigationevent);
        Object tag = view.getTag(iOnExtraCallback);
        TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 = tag instanceof TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 ? (TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0) tag : null;
        if (transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 == null) {
            transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 = new TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0(view, onnavigationevent);
            view.setTag(iOnExtraCallback, transformableStateKtanimateZoomBy3ExternalSyntheticLambda0);
        }
        TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda0AsBinder = transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.asBinder();
        if (transformableStateKtanimateRotateBy2ExternalSyntheticLambda0AsBinder == null) {
            int i4 = onExtraCallback + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
                transformableStateKtanimateRotateBy2ExternalSyntheticLambda0AsBinder = f5 == null ? new TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0() : new TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0(f5.floatValue());
            } else if (f5 == null) {
            }
        }
        transformableStateKtanimateRotateBy2ExternalSyntheticLambda0AsBinder.onWarmupCompleted(f2);
        transformableStateKtanimateRotateBy2ExternalSyntheticLambda0AsBinder.onExtraCallbackWithResult(f);
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.onExtraCallbackWithResult(transformableStateKtanimateRotateBy2ExternalSyntheticLambda0AsBinder);
        if (f4 != null) {
            transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.IAuthTabCallbackStub(f4.floatValue());
        }
        if (f3 != null) {
            int i6 = onExtraCallback + 17;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.onWarmupCompleted(f3.floatValue());
        }
        return transformableStateKtanimateZoomBy3ExternalSyntheticLambda0;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 = (TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda02 = (TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.asInterface(fFloatValue);
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda02.asInterface(fFloatValue);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final int onExtraCallback(UpdatableAnimationStateExternalSyntheticLambda1.onNavigationEvent onnavigationevent) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.IAuthTabCallbackStub);
            throw null;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.IAuthTabCallbackStub)) {
            int i3 = viva.republica.toss.R.id.translation_x;
            int i4 = onExtraCallback + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.asInterface)) {
            return viva.republica.toss.R.id.translation_y;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.IAuthTabCallbackStubProxy)) {
            return viva.republica.toss.R.id.translation_z;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallback)) {
            return viva.republica.toss.R.id.scale_x;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.asBinder)) {
            return viva.republica.toss.R.id.scale_y;
        }
        if (!(!Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.onNavigationEvent))) {
            int i6 = IAuthTabCallback + 123;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return viva.republica.toss.R.id.rotation;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallbackWithResult)) {
            return viva.republica.toss.R.id.rotation_x;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.IAuthTabCallback)) {
            return viva.republica.toss.R.id.rotation_y;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.getInterfaceDescriptor)) {
            return viva.republica.toss.R.id.x;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.access100)) {
            return viva.republica.toss.R.id.y;
        }
        if (!(!Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.IAuthTabCallback_Parcel))) {
            return viva.republica.toss.R.id.z;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.onWarmupCompleted)) {
            return viva.republica.toss.R.id.alpha;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.IAuthTabCallbackDefault)) {
            int i8 = IAuthTabCallback + 81;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return viva.republica.toss.R.id.scroll_x;
            }
            int i9 = 1 / 0;
            return viva.republica.toss.R.id.scroll_x;
        }
        if (Intrinsics.areEqual(onnavigationevent, UpdatableAnimationStateExternalSyntheticLambda1.onTransact)) {
            int i10 = IAuthTabCallback + 65;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return viva.republica.toss.R.id.scroll_y;
        }
        throw new IllegalAccessException("Unknown ViewProperty: " + onnavigationevent);
    }

    public static final class onExtraCallback implements UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ View onNavigationEvent;
        final /* synthetic */ TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 onWarmupCompleted;

        onExtraCallback(TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0, View view, int i) {
            this.onWarmupCompleted = transformableStateKtanimateZoomBy3ExternalSyntheticLambda0;
            this.onNavigationEvent = view;
            this.onExtraCallbackWithResult = i;
        }

        public void onAnimationEnd(UpdatableAnimationStateExternalSyntheticLambda1<? extends UpdatableAnimationStateExternalSyntheticLambda1<?>> updatableAnimationStateExternalSyntheticLambda1, boolean z, float f, float f2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.onExtraCallback(this);
            this.onNavigationEvent.setVisibility(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallback + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final void IAuthTabCallback(@NotNull View view, int i) {
        float f;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        if (i == 0) {
            int i3 = IAuthTabCallback + 103;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        UpdatableAnimationStateExternalSyntheticLambda1.onNavigationEvent onnavigationevent = UpdatableAnimationStateExternalSyntheticLambda1.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(onnavigationevent, "");
        TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0OnExtraCallback = onExtraCallback(view, onnavigationevent, 200.0f, 0.0f, null, null, null, 60, null);
        if (i == 0) {
            int i5 = IAuthTabCallback + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0 ? view.getAlpha() == 1.0f : view.getAlpha() == 1.0f) {
                view.setAlpha(0.0f);
                transformableStateKtanimateZoomBy3ExternalSyntheticLambda0OnExtraCallback.onWarmupCompleted(0.0f);
            }
            view.setVisibility(0);
        }
        int i6 = viva.republica.toss.R.id.tag_visible_end_listener;
        Object tag = view.getTag(i6);
        UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallback onextracallback = tag instanceof UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallback ? (UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallback) tag : null;
        if (onextracallback != null) {
            transformableStateKtanimateZoomBy3ExternalSyntheticLambda0OnExtraCallback.onExtraCallback(onextracallback);
        }
        onExtraCallback onextracallback2 = new onExtraCallback(transformableStateKtanimateZoomBy3ExternalSyntheticLambda0OnExtraCallback, view, i);
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0OnExtraCallback.onNavigationEvent(onextracallback2);
        view.setTag(i6, onextracallback2);
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0OnExtraCallback.asInterface(f);
    }

    public static final void IAuthTabCallback(@NotNull View view, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        IAuthTabCallback(view, z ? 0 : 8);
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        View view = (View) objArr[0];
        Integer num = (Integer) objArr[1];
        Integer num2 = (Integer) objArr[2];
        Float f = (Float) objArr[3];
        Long l = (Long) objArr[4];
        Long l2 = (Long) objArr[5];
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        Object obj = objArr[8];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            num = null;
        }
        if ((iIntValue & 2) != 0) {
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
            num2 = null;
        }
        if ((iIntValue & 4) != 0) {
            f = null;
        }
        if ((iIntValue & 8) != 0) {
            l = null;
        }
        if ((iIntValue & 16) != 0) {
            l2 = null;
        }
        if ((iIntValue & 32) != 0) {
            int i6 = IAuthTabCallback + 7;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            animatorListener = null;
        }
        onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{view, num, num2, f, l, l2, animatorListener}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1347498147, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1347498152, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
        return null;
    }

    private static final float onExtraCallbackWithResult(Float f, View view, Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        float f2 = 1.0f;
        if (f == null) {
            if ((num != null && num.intValue() == 5) || (num != null && num.intValue() == 80)) {
                int i5 = IAuthTabCallback + 23;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return 1.0f;
            }
            if (num == null || num.intValue() != 3) {
                if (num == null) {
                    return 0.0f;
                }
                int i7 = IAuthTabCallback + 3;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    if (num.intValue() != 7) {
                        return 0.0f;
                    }
                } else if (num.intValue() != 48) {
                    return 0.0f;
                }
            }
            return -1.0f;
        }
        int i8 = i2 + 67;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(view.getResources().getDisplayMetrics(), "");
            Math.abs(varyMatches.onNavigationEvent(f, r8));
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(view.getResources().getDisplayMetrics(), "");
        float fAbs = Math.abs(varyMatches.onNavigationEvent(f, r8));
        if (num != null && num.intValue() == 3) {
            f2 = -1.0f;
        } else if (num != null && num.intValue() == 48) {
            int i9 = onExtraCallback;
            int i10 = i9 + 87;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 27;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            f2 = -1.0f;
        }
        return fAbs * f2;
    }

    public static final class IAuthTabCallbackStub implements Animator.AnimatorListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Integer IAuthTabCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ Integer onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            int i4 = onNavigationEvent + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        IAuthTabCallbackStub(Integer num, View view, Integer num2) {
            this.onWarmupCompleted = num;
            this.onExtraCallbackWithResult = view;
            this.IAuthTabCallback = num2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.onWarmupCompleted != null) {
                int i2 = onNavigationEvent + 41;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                this.onExtraCallbackWithResult.setVisibility(8);
                int i4 = onNavigationEvent + 7;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r6
          0x0033: PHI (r6v12 android.view.View) = (r6v1 android.view.View), (r6v13 android.view.View) binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r6
          0x0028: PHI (r6v2 android.view.View) = (r6v1 android.view.View), (r6v13 android.view.View) binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.animation.Animator.AnimatorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAnimationStart(Animator animator) {
            View view;
            float f;
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                view = this.onExtraCallbackWithResult;
                int i3 = 12 / 0;
                if (this.IAuthTabCallback != null) {
                    int i4 = onExtraCallback + 61;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
            } else {
                Intrinsics.checkNotNullParameter(animator, "");
                view = this.onExtraCallbackWithResult;
                if (this.IAuthTabCallback != null) {
                }
            }
            view.setAlpha(f);
            if (this.IAuthTabCallback == null) {
                int i6 = onNavigationEvent + 87;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    this.onExtraCallbackWithResult.setTranslationY(2.0f);
                } else {
                    this.onExtraCallbackWithResult.setTranslationY(0.0f);
                }
                this.onExtraCallbackWithResult.setTranslationX(0.0f);
            }
            this.onExtraCallbackWithResult.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        long jLongValue;
        String str;
        Float f;
        Integer num;
        long jLongValue2;
        Integer num2;
        Animator.AnimatorListener animatorListener;
        View view = (View) objArr[0];
        Integer num3 = (Integer) objArr[1];
        Integer num4 = (Integer) objArr[2];
        Float f2 = (Float) objArr[3];
        Long l = (Long) objArr[4];
        Long l2 = (Long) objArr[5];
        Animator.AnimatorListener animatorListener2 = (Animator.AnimatorListener) objArr[6];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        AnimatorSet animatorSet = new AnimatorSet();
        if (l != null) {
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        animatorSet.setStartDelay(jLongValue);
        String str2 = "translationX";
        if (num3 == null || num3.intValue() != 80) {
            if (num3 != null) {
                int i4 = onExtraCallback + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (num3.intValue() == 48) {
                    str = "translationY";
                }
            }
            str = ((num3 == null || num3.intValue() != 3) && (num3 == null || num3.intValue() != 5)) ? null : "translationX";
        }
        if (num4 != null && num4.intValue() == 80) {
            f = f2;
            str2 = "translationY";
        } else if (num4 != null && num4.intValue() == 48) {
            int i6 = onExtraCallback + 41;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            f = f2;
            str2 = "translationY";
        } else if (num4 != null) {
            int i8 = onExtraCallback + 51;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0 ? num4.intValue() == 3 : num4.intValue() == 4) {
                f = f2;
            } else if (num4 == null || num4.intValue() != 5) {
                f = f2;
                str2 = null;
            }
        }
        long j = num3 != null ? 400L : 0L;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            if (num3 == null) {
                num = num4;
                jLongValue2 = 0;
                long j2 = j + jLongValue2;
                ArrayList arrayList = new ArrayList();
                if (num3 == null) {
                    int iIntValue = num3.intValue();
                    num2 = num3;
                    animatorListener = animatorListener2;
                    Object[] objArr2 = new Object[1];
                    a(new int[]{1916482832, -981446971, -1925206950, -1054950107}, Color.green(0) + 5, objArr2);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ((String) objArr2[0]).intern(), 1.0f);
                    objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                    objectAnimatorOfFloat.setDuration(400L);
                    Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "");
                    arrayList.add(objectAnimatorOfFloat);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, str, onExtraCallbackWithResult(f, view, Integer.valueOf(iIntValue)), 0.0f);
                    objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    objectAnimatorOfFloat2.setDuration(400L);
                    Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "");
                    arrayList.add(objectAnimatorOfFloat2);
                    int i9 = IAuthTabCallback + 35;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 5 % 3;
                    }
                } else {
                    num2 = num3;
                    animatorListener = animatorListener2;
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    Object[] objArr3 = new Object[1];
                    a(new int[]{1916482832, -981446971, -1925206950, -1054950107}, (ViewConfiguration.getTouchSlop() >> 8) + 5, objArr3);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, ((String) objArr3[0]).intern(), 0.0f);
                    objectAnimatorOfFloat3.setInterpolator(new AccelerateInterpolator());
                    objectAnimatorOfFloat3.setStartDelay(j2);
                    objectAnimatorOfFloat3.setDuration(400L);
                    Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat3, "");
                    arrayList.add(objectAnimatorOfFloat3);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, str2, onExtraCallbackWithResult(f, view, Integer.valueOf(iIntValue2)));
                    objectAnimatorOfFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                    objectAnimatorOfFloat4.setStartDelay(j2);
                    objectAnimatorOfFloat4.setDuration(400L);
                    Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat4, "");
                    arrayList.add(objectAnimatorOfFloat4);
                }
                animatorSet.playTogether(arrayList);
                animatorSet.addListener(new IAuthTabCallbackStub(num, view, num2));
                if (animatorListener != null) {
                    animatorSet.addListener(animatorListener);
                }
                animatorSet.start();
                return null;
            }
            int i11 = IAuthTabCallback + 5;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            jLongValue2 = 1000;
        }
        num = num4;
        long j22 = j + jLongValue2;
        ArrayList arrayList2 = new ArrayList();
        if (num3 == null) {
        }
        if (num != null) {
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.addListener(new IAuthTabCallbackStub(num, view, num2));
        if (animatorListener != null) {
        }
        animatorSet.start();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @Nullable View view) throws Resources.NotFoundException {
        int dimensionPixelSize;
        Window window;
        WindowManager.LayoutParams attributes;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int measuredHeight = view.getMeasuredHeight();
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            int i3 = IAuthTabCallback + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            dimensionPixelSize = 0;
        } else {
            int i5 = IAuthTabCallback + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if ((attributes.softInputMode & 16) == 16) {
                boolean z = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getView() instanceof ContentFrameLayout;
                View view2 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getView();
                if (z) {
                    int i7 = IAuthTabCallback + 39;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Intrinsics.checkNotNull(view2, "");
                    view2 = ((ContentFrameLayout) view2).getChildAt(0);
                }
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    dimensionPixelSize = 0;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        TdsBottomCtaV1View childAt = viewGroup.getChildAt(i9);
                        if (childAt instanceof TdsBottomCtaV1View) {
                            int i10 = IAuthTabCallback + 7;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                dimensionPixelSize = childAt.getMeasuredHeight();
                                int i11 = 72 / 0;
                            } else {
                                dimensionPixelSize = childAt.getMeasuredHeight();
                            }
                        } else if (childAt instanceof KeyboardBottomCta) {
                            dimensionPixelSize = view.getResources().getDimensionPixelSize(im.toss.tds.view.R.dimen.button_big_height);
                        }
                    }
                }
            }
            dimensionPixelSize = 0;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        return (M_.onExtraCallback.IAuthTabCallbackDefault() - enableAccessibilityOrder.onExtraCallbackWithResult.IAuthTabCallback()) - (varyMatches.onNavigationEvent(24, displayMetrics) + dimensionPixelSize) > i2 + measuredHeight;
    }

    private static final void onNavigationEvent(Context context, wipeOffVhost wipeoffvhost, View view) {
        int i = 2 % 2;
        LabActivity.IAuthTabCallback iAuthTabCallback = LabActivity.Companion;
        String strOnExtraCallback = wipeoffvhost.onExtraCallback();
        if (strOnExtraCallback == null) {
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            strOnExtraCallback = "";
        }
        String string = StringsKt.trim(strOnExtraCallback).toString();
        String strOnWarmupCompleted = wipeoffvhost.onWarmupCompleted();
        context.startActivity(LabActivity.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, context, string, StringsKt.trim(strOnWarmupCompleted != null ? strOnWarmupCompleted : "").toString(), (String) null, (String) null, false, false, false, 248, (Object) null));
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        TdsBadgeV1View.onExtraCallbackWithResult onextracallbackwithresult = (TdsBadgeV1View.onExtraCallbackWithResult) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(str, "");
        textView.setGravity(16);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsBadgeV1View tdsBadgeV1View = new TdsBadgeV1View(context);
        tdsBadgeV1View.setTheme(onextracallbackwithresult);
        tdsBadgeV1View.setText(str);
        tdsBadgeV1View.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        tdsBadgeV1View.layout(0, 0, tdsBadgeV1View.getMeasuredWidth(), tdsBadgeV1View.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(tdsBadgeV1View.getMeasuredWidth(), tdsBadgeV1View.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        tdsBadgeV1View.draw(new Canvas(bitmapCreateBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(textView.getResources(), bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        textView.setCompoundDrawablePadding(varyMatches.onNavigationEvent(6, displayMetrics));
        Object obj = null;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, bitmapDrawable, (Drawable) null);
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final void onNavigationEvent(@NotNull TextView textView, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setGravity(16);
        Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(textView.getResources(), i, (Resources.Theme) null);
        if (drawableOnExtraCallback != null) {
            int i4 = onExtraCallback + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            drawableOnExtraCallback.setBounds(0, 0, i2, i2);
            int i6 = IAuthTabCallback + 7;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        textView.setCompoundDrawablePadding(varyMatches.onNavigationEvent(6, displayMetrics));
        textView.setCompoundDrawables(drawableOnExtraCallback, null, null, null);
    }

    public static final void onExtraCallback(@NotNull TextView textView, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setGravity(16);
        Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(textView.getResources(), i, (Resources.Theme) null);
        if (drawableOnExtraCallback != null) {
            int i6 = onExtraCallback + 97;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            drawableOnExtraCallback.setBounds(0, 0, i2, i2);
        }
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        textView.setCompoundDrawablePadding(varyMatches.onNavigationEvent(6, displayMetrics));
        textView.setCompoundDrawables(null, null, drawableOnExtraCallback, null);
    }

    public static final void IAuthTabCallback(@NotNull TextView textView) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textView, "");
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        int i3 = onExtraCallback + 27;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback extends RecyclerView.ItemDecoration {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ setUnreadableElfFiles<Rect, View, RecyclerView, RecyclerView.State, Integer, Unit> onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(setUnreadableElfFiles<? super Rect, ? super View, ? super RecyclerView, ? super RecyclerView.State, ? super Integer, Unit> setunreadableelffiles) {
            this.onExtraCallback = setunreadableelffiles;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            this.onExtraCallback.invoke(rect, view, recyclerView, state, Integer.valueOf(recyclerView.getChildAdapterPosition(view)));
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull RecyclerView recyclerView, @NotNull setUnreadableElfFiles<? super Rect, ? super View, ? super RecyclerView, ? super RecyclerView.State, ? super Integer, Unit> setunreadableelffiles) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(setunreadableelffiles, "");
        recyclerView.addItemDecoration(new IAuthTabCallback(setunreadableelffiles));
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted extends RecyclerView.OnScrollListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function1<Integer, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Function1<? super Integer, Unit> function1) {
            this.onWarmupCompleted = function1;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                super.onScrollStateChanged(recyclerView, i);
                this.onWarmupCompleted.invoke(Integer.valueOf(i));
            } else {
                Intrinsics.checkNotNullParameter(recyclerView, "");
                super.onScrollStateChanged(recyclerView, i);
                this.onWarmupCompleted.invoke(Integer.valueOf(i));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final void onNavigationEvent(@NotNull RecyclerView recyclerView, @NotNull Function1<? super Integer, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        recyclerView.addOnScrollListener(new onWarmupCompleted(function1));
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        TextView textView = (TextView) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            function1 = new Function1() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i3 % 128;
                    String str = (String) obj2;
                    if (i3 % 2 == 0) {
                        return transparentBackground.onExtraCallbackWithResult(str);
                    }
                    transparentBackground.onExtraCallbackWithResult(str);
                    throw null;
                }
            };
        }
        if ((iIntValue & 2) != 0) {
            function12 = new Function1() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 101;
                    onNavigationEvent = i3 % 128;
                    String str = (String) obj2;
                    if (i3 % 2 != 0) {
                        transparentBackground.onExtraCallback(str);
                        throw null;
                    }
                    String strOnExtraCallback = transparentBackground.onExtraCallback(str);
                    int i4 = onWarmupCompleted + 21;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return strOnExtraCallback;
                    }
                    throw null;
                }
            };
        }
        if ((iIntValue & 4) != 0) {
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            zBooleanValue = i2 % 2 != 0;
        }
        onExtraCallback(textView, (Function1<? super String, String>) function1, (Function1<? super String, String>) function12, zBooleanValue);
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static final class asBinder extends AccessibilityDelegateCompat {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        final /* synthetic */ TextView onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ Function1<String, String> onNavigationEvent;
        final /* synthetic */ Function1<String, String> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        asBinder(TextView textView, Function1<? super String, String> function1, boolean z, Function1<? super String, String> function12) {
            this.onExtraCallback = textView;
            this.onWarmupCompleted = function1;
            this.onExtraCallbackWithResult = z;
            this.onNavigationEvent = function12;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onInitializeAccessibilityNodeInfo(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            int i2 = asInterface + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
                super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
                int i3 = 92 / 0;
                if (this.onExtraCallback.getHint() != null) {
                    String strOnWarmupCompleted = (String) this.onWarmupCompleted.invoke(this.onExtraCallback.getHint().toString());
                    if (this.onExtraCallbackWithResult) {
                        int i4 = asInterface + 11;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        strOnWarmupCompleted = convertAnyToMap.onWarmupCompleted(strOnWarmupCompleted);
                    }
                    suspendAnimationKtExternalSyntheticLambda4.onWarmupCompleted(strOnWarmupCompleted);
                }
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
                super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
                if (this.onExtraCallback.getHint() != null) {
                }
            }
            if (this.onExtraCallback.getText() != null) {
                String strOnWarmupCompleted2 = (String) this.onNavigationEvent.invoke(this.onExtraCallback.getText().toString());
                if (this.onExtraCallbackWithResult) {
                    strOnWarmupCompleted2 = convertAnyToMap.onWarmupCompleted(strOnWarmupCompleted2);
                    InputFilter[] filters = this.onExtraCallback.getFilters();
                    Intrinsics.checkNotNullExpressionValue(filters, "");
                    ArrayList arrayList = new ArrayList();
                    for (InputFilter inputFilter : filters) {
                        if (inputFilter instanceof InputFilter.LengthFilter) {
                            int i6 = IAuthTabCallback + 41;
                            asInterface = i6 % 128;
                            int i7 = i6 % 2;
                            arrayList.add(inputFilter);
                        }
                    }
                    InputFilter.LengthFilter lengthFilter = (InputFilter.LengthFilter) CollectionsKt.firstOrNull(arrayList);
                    Integer numValueOf = lengthFilter != null ? Integer.valueOf(lengthFilter.getMax()) : null;
                    int i8 = 0;
                    for (int i9 = 0; i9 < strOnWarmupCompleted2.length(); i9++) {
                        if (Character.isDigit(strOnWarmupCompleted2.charAt(i9))) {
                            int i10 = IAuthTabCallback + 111;
                            asInterface = i10 % 128;
                            i8 = i10 % 2 == 0 ? i8 / 0 : i8 + 1;
                        }
                    }
                    if (numValueOf != null) {
                        suspendAnimationKtExternalSyntheticLambda4.onTransact(numValueOf.intValue() + i8);
                        int i11 = IAuthTabCallback + 91;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
                suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallbackDefault(strOnWarmupCompleted2);
                int i13 = asInterface + 27;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            }
        }
    }

    public static final void onExtraCallback(@NotNull TextView textView, @NotNull Function1<? super String, String> function1, @NotNull Function1<? super String, String> function12, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        setProtocolsokhttp.onExtraCallbackWithResult(textView, new asBinder(textView, function1, z, function12));
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class asInterface extends View.AccessibilityDelegate {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String onExtraCallback;

        asInterface(String str) {
            this.onExtraCallback = str;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (Build.VERSION.SDK_INT < 118) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (Build.VERSION.SDK_INT < 26) {
                    return;
                }
            }
            int i3 = onNavigationEvent + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            accessibilityNodeInfo.setHintText(this.onExtraCallback);
        }
    }

    public static final void onWarmupCompleted(@NotNull View view, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        view.setAccessibilityDelegate(new asInterface(str));
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }

    static {
        onExtraCallback();
        onWarmupCompleted = new WeakHashMap<>();
        int i = asBinder + 67;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(View view, boolean z, Integer num, int i, View view2, List list, float f, float f2, Function2 function2, boolean z2, long j, String str, getContentView getcontentview, Function1 function1, int i2, Object obj) {
        Integer num2;
        int iOnNavigationEvent;
        float f3;
        Function2 function22;
        boolean z3;
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 29;
        IAuthTabCallback = i5 % 128;
        boolean z4 = (i5 % 2 != 0 ? (i2 & 1) == 0 : (i2 & 1) == 0) ? z : true;
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i6 = i4 + 51;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 4;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 4) != 0) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(20, displayMetrics);
        } else {
            iOnNavigationEvent = i;
        }
        View view3 = (i2 & 8) != 0 ? view : view2;
        List list2 = (i2 & 16) != 0 ? null : list;
        if ((i2 & 32) != 0) {
            int i8 = IAuthTabCallback + 87;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            f3 = 1.0f;
        } else {
            f3 = f;
        }
        float f4 = (i2 & 64) != 0 ? 0.96f : f2;
        if ((i2 & 128) != 0) {
            int i10 = IAuthTabCallback + 3;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            function22 = null;
        } else {
            function22 = function2;
        }
        if ((i2 & 256) != 0) {
            int i11 = onExtraCallback + 1;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        onExtraCallbackWithResult(view, z4, num2, iOnNavigationEvent, view3, list2, f3, f4, function22, z3, (i2 & 512) != 0 ? 300L : j, (i2 & 1024) != 0 ? null : str, (i2 & 2048) != 0 ? null : getcontentview, function1);
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ View $this_setOnClickWithAnimListener;
        final /* synthetic */ String $throttleGroupId;
        final /* synthetic */ long $throttleInterval;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(long j, String str, View view, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$throttleInterval = j;
            this.$throttleGroupId = str;
            this.$this_setOnClickWithAnimListener = view;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$throttleInterval, this.$throttleGroupId, this.$this_setOnClickWithAnimListener, access13800Var);
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = 14 / 0;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                long j = this.$throttleInterval;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallbackWithResult + 115;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            WeakHashMap weakHashMapOnNavigationEvent = transparentBackground.onNavigationEvent();
            Object obj3 = this.$throttleGroupId;
            if (obj3 == null) {
                obj3 = this.$this_setOnClickWithAnimListener;
                int i5 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            weakHashMapOnNavigationEvent.remove(obj3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(String str, View view, long j, Function1 function1, View view2) {
        long jLongValue;
        int i = 2 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        WeakHashMap<Object, Long> weakHashMap = onWarmupCompleted;
        Long l = weakHashMap.get(str == null ? view : str);
        if (l != null) {
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                l.longValue();
                throw null;
            }
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (j != 0) {
            int i3 = onExtraCallback + 65;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if (jElapsedRealtime - jLongValue < j) {
                int i6 = i4 + 89;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        if (str == null) {
            str = view;
        }
        weakHashMap.put(str, Long.valueOf(jElapsedRealtime));
        function1.invoke((Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final View view, final boolean z, @Nullable Integer num, int i, @NotNull final View view2, @Nullable final List<? extends View> list, final float f, float f2, @Nullable final Function2<? super Integer, ? super runOnUiThreadDelayed, Unit> function2, final boolean z2, final long j, @Nullable final String str, @Nullable final getContentView getcontentview, @NotNull final Function1<? super MotionEvent, Unit> function1) {
        int i2;
        float f3;
        final float f4;
        Context context;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(view);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(j, str, view, null), 3, (Object) null);
        }
        if (getcontentview == null) {
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i2 = -1;
        } else {
            i2 = onNavigationEvent.IAuthTabCallback[getcontentview.ordinal()];
            int i6 = onExtraCallback + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (i2 == 1) {
            f3 = 0.96f;
        } else if (i2 == 2) {
            f3 = 0.9f;
        } else {
            if (i2 != 3) {
                f4 = f2;
                context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (!varyFields.onWarmupCompleted(context)) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda14
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 99;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                transparentBackground.IAuthTabCallback(str, view, j, function1, view3);
                            } else {
                                transparentBackground.IAuthTabCallback(str, view, j, function1, view3);
                                int i10 = 19 / 0;
                            }
                        }
                    });
                    return;
                }
                if (num != null) {
                    if (z) {
                        Context context2 = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        Drawable drawableOnWarmupCompleted = onWarmupCompleted(context2, i, num.intValue());
                        drawableOnWarmupCompleted.setHotspot(view2.getWidth() / 2.0f, view2.getHeight() / 2.0f);
                        view2.setBackground(drawableOnWarmupCompleted);
                    } else {
                        Context context3 = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        Drawable drawableOnWarmupCompleted2 = onWarmupCompleted(context3, i, num.intValue());
                        drawableOnWarmupCompleted2.setHotspot(view2.getWidth() / 2.0f, view2.getHeight() / 2.0f);
                        view2.setForeground(drawableOnWarmupCompleted2);
                    }
                }
                view.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda15
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 63;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        boolean zOnWarmupCompleted = transparentBackground.onWarmupCompleted(str, view, j, view2, z, f, f4, list, function2, getcontentview, function1, z2, view3, motionEvent);
                        int i11 = IAuthTabCallback + 123;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 11 / 0;
                        }
                        return zOnWarmupCompleted;
                    }
                });
                return;
            }
            f3 = 0.92f;
        }
        f4 = f3;
        context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (!varyFields.onWarmupCompleted(context)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0277 A[PHI: r4
      0x0277: PHI (r4v15 android.graphics.drawable.Drawable) = (r4v14 android.graphics.drawable.Drawable), (r4v16 android.graphics.drawable.Drawable) binds: [B:90:0x0275, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallback(String str, View view, long j, View view2, boolean z, float f, float f2, List list, Function2 function2, getContentView getcontentview, Function1 function1, boolean z2, View view3, MotionEvent motionEvent) {
        String str2;
        Drawable background;
        Drawable background2;
        Iterator it;
        String str3;
        int i = 2 % 2;
        int action = motionEvent.getAction();
        Object obj = null;
        if (action == 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            WeakHashMap<Object, Long> weakHashMap = onWarmupCompleted;
            Long l = weakHashMap.get(str == null ? view : str);
            long jLongValue = l != null ? l.longValue() : 0L;
            if (j != 0 && jElapsedRealtime - jLongValue < j) {
                return false;
            }
            if (str == null) {
                int i2 = onExtraCallback + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                str2 = view;
            } else {
                str2 = str;
            }
            weakHashMap.put(str2, Long.valueOf(jElapsedRealtime));
            if (Intrinsics.areEqual(view2, view)) {
                if (z) {
                    int i4 = onExtraCallback + 39;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        background = view2.getBackground();
                        int i5 = 43 / 0;
                        if (background != null) {
                            background.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                    } else {
                        background = view2.getBackground();
                        if (background != null) {
                        }
                    }
                } else {
                    Drawable foreground = view2.getForeground();
                    if (foreground != null) {
                        int i6 = IAuthTabCallback + 95;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        foreground.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            }
            Drawable background3 = view2.getBackground();
            if (background3 != null) {
                background3.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
            }
            view2.setPressed(true);
            List listMutableListOf = CollectionsKt.mutableListOf(new Rally[]{onNavigationEvent(view2, f, f2)});
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    View view4 = (View) it2.next();
                    view4.setPivotX(motionEvent.getX());
                    view4.setPivotY(motionEvent.getY());
                    listMutableListOf.add(onNavigationEvent(view4, f, f2));
                }
            }
            runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, listMutableListOf, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
            if (function2 != null) {
                function2.invoke(Integer.valueOf(motionEvent.getAction()), runonuithreaddelayedOnExtraCallbackWithResult);
            }
        } else if (action != 1) {
            int i8 = onExtraCallback;
            int i9 = i8 + 35;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (action == 2) {
                WeakHashMap<Object, Long> weakHashMap2 = onWarmupCompleted;
                if (str != null) {
                    int i11 = i8 + 91;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str3 = str;
                } else {
                    str3 = view;
                }
                weakHashMap2.put(str3, Long.valueOf(SystemClock.elapsedRealtime()));
            } else if (action == 3) {
                Drawable background4 = view2.getBackground();
                if (background4 != null) {
                    background4.setState(new int[0]);
                }
                view2.setPressed(false);
                List listMutableListOf2 = CollectionsKt.mutableListOf(new Rally[]{(Rally) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{view2, getcontentview, Float.valueOf(f)}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -90321963, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 90321972, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())});
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        listMutableListOf2.add((Rally) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{(View) it3.next(), getcontentview, Float.valueOf(f)}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -90321963, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 90321972, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted()));
                    }
                }
                runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult2 = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, listMutableListOf2, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(motionEvent.getAction()), runonuithreaddelayedOnExtraCallbackWithResult2);
                }
            }
        } else {
            float width = view3.getWidth();
            float x = motionEvent.getX();
            if (0.0f > x || x > width) {
                background2 = view2.getBackground();
                if (background2 != null) {
                    background2.setState(new int[0]);
                }
                view2.setPressed(false);
                if (!z2) {
                    List listMutableListOf3 = CollectionsKt.mutableListOf(new Rally[]{(Rally) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{view2, getcontentview, Float.valueOf(f)}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -90321963, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 90321972, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted())});
                    if (list != null) {
                        int i12 = IAuthTabCallback + 17;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            it = list.iterator();
                            int i13 = 76 / 0;
                        } else {
                            it = list.iterator();
                        }
                        while (it.hasNext()) {
                            listMutableListOf3.add((Rally) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{(View) it.next(), getcontentview, Float.valueOf(f)}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -90321963, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 90321972, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted()));
                        }
                    }
                    runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult3 = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, listMutableListOf3, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
                    if (function2 != null) {
                        int i14 = onExtraCallback + 35;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            function2.invoke(Integer.valueOf(motionEvent.getAction()), runonuithreaddelayedOnExtraCallbackWithResult3);
                            obj.hashCode();
                            throw null;
                        }
                        function2.invoke(Integer.valueOf(motionEvent.getAction()), runonuithreaddelayedOnExtraCallbackWithResult3);
                    }
                }
            } else {
                float height = view3.getHeight();
                float y = motionEvent.getY();
                if (0.0f <= y) {
                    int i15 = onExtraCallback;
                    int i16 = i15 + 51;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (y <= height) {
                        int i17 = i15 + 19;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        function1.invoke(motionEvent);
                    }
                    background2 = view2.getBackground();
                    if (background2 != null) {
                    }
                    view2.setPressed(false);
                    if (!z2) {
                    }
                }
            }
        }
        return true;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        View view = (View) objArr[0];
        getContentView getcontentview = (getContentView) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (getcontentview == null) {
            int i5 = i3 + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else if (onNavigationEvent.IAuthTabCallback[getcontentview.ordinal()] == 3) {
            return (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onWarmupCompleted()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(view.getScaleX()), Float.valueOf(fFloatValue), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        }
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(view.getScaleX()), Float.valueOf(fFloatValue), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i7 = IAuthTabCallback + 113;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 44 / 0;
        }
        return rally;
    }

    private static final Rally onNavigationEvent(View view, float f, float f2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(view.getScaleX()), Float.valueOf(f2 * f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private static final Drawable onWarmupCompleted(Context context, int i, int i2) {
        RippleDrawable rippleDrawable;
        int i3 = 2 % 2;
        RippleDrawable rippleDrawable2 = (deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{M_.onExtraCallback, context, Float.valueOf(i)}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        if (rippleDrawable2 != null) {
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            rippleDrawable = rippleDrawable2;
        } else {
            rippleDrawable = null;
        }
        if (rippleDrawable != null) {
            int i6 = IAuthTabCallback + 11;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            rippleDrawable.setColor(ColorStateList.valueOf(i2));
        }
        return rippleDrawable2;
    }

    public static final boolean onWarmupCompleted(@NotNull Activity activity) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        Intrinsics.checkNotNullExpressionValue(activityInfo, "");
        if (activityInfo.theme == viva.republica.toss.R.style.WhiteTheme_NoDisplay) {
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = IAuthTabCallback + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Rally onExtraCallbackWithResult(View view, boolean z, Function0 function0, Function0 function02, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 87;
            IAuthTabCallback = i3 % 128;
            z = i3 % 2 != 0;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 37;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 13;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            function0 = null;
        }
        if ((i & 4) != 0) {
            int i9 = onExtraCallback + 125;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            function02 = null;
        }
        return (Rally) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{view, Boolean.valueOf(z), function0, function02}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 44392337, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -44392336, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (function0 != null) {
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function0 function0, boolean z, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (function0 != null) {
            function0.invoke();
        }
        if (z) {
            int i3 = IAuthTabCallback + 67;
            onExtraCallback = i3 % 128;
            view.setVisibility(i3 % 2 != 0 ? 107 : 8);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Rally IAuthTabCallback(View view, boolean z, int i, Function0 function0, Function0 function02, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallback + 107;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 91;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        if ((i2 & 8) != 0) {
            int i9 = onExtraCallback + 65;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            function02 = null;
        }
        Object[] objArr = {view, Boolean.valueOf(z), Integer.valueOf(i), function0, function02};
        return (Rally) onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1549040677, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1549040664, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        final View view = (View) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        final Function0 function0 = (Function0) objArr[3];
        final Function0 function02 = (Function0) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object[] objArr2 = {Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, Integer.valueOf(iIntValue), 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 47;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Function0 function03 = function0;
                if (i4 != 0) {
                    return transparentBackground.onExtraCallback(function03, zBooleanValue, view);
                }
                int i5 = 78 / 0;
                return transparentBackground.onExtraCallback(function03, zBooleanValue, view);
            }
        }, 1, (Object) null), null, new Function0() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = transparentBackground.onWarmupCompleted(function02);
                int i5 = onExtraCallback + 87;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, 1, null};
        Rally rallyOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr2, 2128644226), false, 1, (Object) null);
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return rallyOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (function0 != null) {
            int i5 = i3 + 123;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                function0.invoke();
            } else {
                function0.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view, int i, RecyclerView recyclerView, boolean z, float f, float f2, Function0 function0, Function0 function02, int i2, Object obj) {
        Function0 function03;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 23;
        onExtraCallback = i5 % 128;
        boolean z2 = (i5 % 2 == 0 ? (i2 & 4) == 0 : (i2 & 4) == 0) ? z : true;
        float f3 = (i2 & 8) != 0 ? 0.0f : f;
        float f4 = (i2 & 16) != 0 ? 0.0f : f2;
        Function0 function04 = (i2 & 32) != 0 ? null : function0;
        if ((i2 & 64) != 0) {
            int i6 = i4 + 29;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            function03 = null;
        } else {
            function03 = function02;
        }
        IAuthTabCallback(view, i, recyclerView, z2, f3, f4, (Function0<Unit>) function04, (Function0<Unit>) function03);
    }

    private static final void onNavigationEvent(RecyclerView recyclerView, int i, Function0<Unit> function0, View view, Function0<Unit> function02, boolean z, float f, float f2) {
        LinearLayoutManager linearLayoutManager;
        int i2 = 2 % 2;
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int i3 = IAuthTabCallback + 105;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            linearLayoutManager = layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition > i || i > iFindLastVisibleItemPosition) {
                if (function02 != null) {
                    function02.invoke();
                } else {
                    view.setVisibility(8);
                }
                view.setTranslationY(-10000.0f);
                return;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            View view2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.onNavigationEvent : null;
            if (function0 != null) {
                function0.invoke();
            } else {
                view.setVisibility(0);
            }
            if (view2 != null) {
                view2.getLocationOnScreen(new int[2]);
                if (z) {
                    view.setTranslationY(r5[1] + (view2.getHeight() / 2.0f) + f);
                } else {
                    view.setTranslationY(r5[1] + f);
                    int i5 = IAuthTabCallback + 105;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                view.setTranslationX(f2);
            }
        }
    }

    public static final class onExtraCallbackWithResult extends RecyclerView.OnScrollListener {
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        final /* synthetic */ boolean IAuthTabCallback;
        final /* synthetic */ int IAuthTabCallbackDefault;
        final /* synthetic */ View asBinder;
        final /* synthetic */ float onExtraCallback;
        final /* synthetic */ Function0<Unit> onExtraCallbackWithResult;
        final /* synthetic */ Function0<Unit> onNavigationEvent;
        final /* synthetic */ RecyclerView onTransact;
        final /* synthetic */ float onWarmupCompleted;

        onExtraCallbackWithResult(View view, RecyclerView recyclerView, int i, Function0<Unit> function0, Function0<Unit> function02, boolean z, float f, float f2) {
            this.asBinder = view;
            this.onTransact = recyclerView;
            this.IAuthTabCallbackDefault = i;
            this.onNavigationEvent = function0;
            this.onExtraCallbackWithResult = function02;
            this.IAuthTabCallback = z;
            this.onWarmupCompleted = f;
            this.onExtraCallback = f2;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (this.asBinder.getVisibility() == 0) {
                int i4 = IAuthTabCallbackStub + 115;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                transparentBackground.IAuthTabCallback(this.onTransact, this.IAuthTabCallbackDefault, this.onNavigationEvent, this.asBinder, this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onWarmupCompleted, this.onExtraCallback);
            }
            int i6 = IAuthTabCallbackStub + 83;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final void IAuthTabCallback(@NotNull View view, int i, @NotNull RecyclerView recyclerView, boolean z, float f, float f2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        onNavigationEvent(recyclerView, i, function0, view, function02, z, f, f2);
        recyclerView.addOnScrollListener(new onExtraCallbackWithResult(view, recyclerView, i, function0, function02, z, f, f2));
        int i3 = onExtraCallback + 67;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i7 | i3;
        int i9 = (~i8) | (~(i7 | i));
        int i10 = (~((~i) | i7 | (~i3))) | (~(i5 | i3));
        int i11 = i5 + i3 + i6 + ((-540997959) * i4) + (162607451 * i2);
        int i12 = i11 * i11;
        int i13 = (i5 * 228155117) + 240245784 + (i3 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (228155391 * i6) + ((-329950905) * i4) + ((-2026639707) * i2) + (i12 * 159186944);
        switch (((-612843245) * i5) + 1723858944 + (1667710703 * i3) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i6) + ((-672137216) * i4) + (483393536 * i2) + (377683968 * i12) + (i13 * i13 * (-1451425792))) {
            case 1:
                final View view = (View) objArr[0];
                final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                final Function0 function0 = (Function0) objArr[2];
                final Function0 function02 = (Function0) objArr[3];
                int i14 = 2 % 2;
                Intrinsics.checkNotNullParameter(view, "");
                Object[] objArr2 = {Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda8
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallbackWithResult + 15;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        Unit unitOnExtraCallback = transparentBackground.onExtraCallback(function0);
                        int i18 = onNavigationEvent + 81;
                        onExtraCallbackWithResult = i18 % 128;
                        if (i18 % 2 != 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                }, 1, (Object) null), null, new Function0() { // from class: im.toss.extensions.ViewsKt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallbackWithResult + 25;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        Function0 function03 = function02;
                        boolean z = zBooleanValue;
                        Object[] objArr3 = {function03, Boolean.valueOf(z), view};
                        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
                        Unit unit = (Unit) transparentBackground.onWarmupCompleted(iOnWarmupCompleted, objArr3, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1658697801, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1658697804, iOnWarmupCompleted2);
                        int i18 = onExtraCallbackWithResult + 115;
                        IAuthTabCallback = i18 % 128;
                        if (i18 % 2 == 0) {
                            int i19 = 75 / 0;
                        }
                        return unit;
                    }
                }, 1, null};
                int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                Rally rallyOnExtraCallbackWithResult = isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr2, 2128644226), false, 1, (Object) null);
                int i15 = IAuthTabCallback + 11;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                return rallyOnExtraCallbackWithResult;
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access100(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return getInterfaceDescriptor(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                Function0 function03 = (Function0) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                View view2 = (View) objArr[2];
                int i17 = 2 % 2;
                int i18 = onExtraCallback + 11;
                IAuthTabCallback = i18 % 128;
                int i19 = i18 % 2;
                if (function03 != null) {
                    function03.invoke();
                }
                if (zBooleanValue2) {
                    int i20 = IAuthTabCallback + 39;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    view2.setVisibility(0);
                }
                return Unit.INSTANCE;
            case 17:
                return ICustomTabsCallback(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, new Object[]{th}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1252915538, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1252915531, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, boolean z, View view) {
        Object[] objArr = {function0, Boolean.valueOf(z), view};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1658697801, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1658697804, iOnWarmupCompleted2);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, new Object[]{function1, obj}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 4857146, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -4857136, iOnWarmupCompleted2);
    }

    private static final Unit onExtraCallback(TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0, float f, TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda02, Long l) {
        Object[] objArr = {transformableStateKtanimateZoomBy3ExternalSyntheticLambda0, Float.valueOf(f), transformableStateKtanimateZoomBy3ExternalSyntheticLambda02, l};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 2014723581, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -2014723575, iOnWarmupCompleted2);
    }

    public static final Rally onExtraCallbackWithResult(@NotNull View view, boolean z, int i, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
        Object[] objArr = {view, Boolean.valueOf(z), Integer.valueOf(i), function0, function02};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Rally) onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1549040677, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1549040664, iOnWarmupCompleted2);
    }

    private static final Unit onWarmupCompleted(Function0 function0, boolean z, View view) {
        Object[] objArr = {function0, Boolean.valueOf(z), view};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1376653551, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1376653567, iOnWarmupCompleted2);
    }

    public static final Rally onNavigationEvent(@NotNull View view, boolean z, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
        Object[] objArr = {view, Boolean.valueOf(z), function0, function02};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Rally) onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 44392337, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -44392336, iOnWarmupCompleted2);
    }

    public static final void onExtraCallback(@NotNull View view, @Nullable Integer num, @Nullable Integer num2, @Nullable Float f, @Nullable Long l, @Nullable Long l2, @Nullable Animator.AnimatorListener animatorListener) {
        Object[] objArr = {view, num, num2, f, l, l2, animatorListener};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1347498147, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1347498152, iOnWarmupCompleted2);
    }

    public static /* synthetic */ void onWarmupCompleted(View view, Integer num, Integer num2, Float f, Long l, Long l2, Animator.AnimatorListener animatorListener, int i, Object obj) {
        Object[] objArr = {view, num, num2, f, l, l2, animatorListener, Integer.valueOf(i), obj};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1440892420, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1440892409, iOnWarmupCompleted2);
    }

    public static final float IAuthTabCallback(@NotNull RecyclerView recyclerView) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Float) onWarmupCompleted(iOnWarmupCompleted, new Object[]{recyclerView}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -812325569, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 812325569, iOnWarmupCompleted2)).floatValue();
    }

    private static final Rally onNavigationEvent(View view, getContentView getcontentview, float f) {
        Object[] objArr = {view, getcontentview, Float.valueOf(f)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Rally) onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -90321963, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 90321972, iOnWarmupCompleted2);
    }

    private static final void onExtraCallback(Function1 function1, Bitmap bitmap, int i) {
        Object[] objArr = {function1, bitmap, Integer.valueOf(i)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 659377422, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -659377407, iOnWarmupCompleted2);
    }

    public static final deserializeUriNullableCollection onExtraCallbackWithResult(@Nullable View view, @NotNull ParamUtils paramUtils, @NotNull Function1<? super View, Unit> function1) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (deserializeUriNullableCollection) onWarmupCompleted(iOnWarmupCompleted, new Object[]{view, paramUtils, function1}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1385263125, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1385263142, iOnWarmupCompleted2);
    }

    private static final void IAuthTabCallback(Function1 function1, View view) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, new Object[]{function1, view}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -838163920, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 838163932, iOnWarmupCompleted2);
    }

    public static final void IAuthTabCallback(@NotNull TextView textView, @NotNull TdsBadgeV1View.onExtraCallbackWithResult onextracallbackwithresult, @NotNull String str) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, new Object[]{textView, onextracallbackwithresult, str}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1568387188, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1568387184, iOnWarmupCompleted2);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TextView textView, Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        Object[] objArr = {textView, function1, function12, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -2039764647, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 2039764661, iOnWarmupCompleted2);
    }

    public static final void IAuthTabCallback(@NotNull RecyclerView recyclerView, int i, long j) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Long.valueOf(j)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -302971228, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 302971230, iOnWarmupCompleted2);
    }

    private static final void onNavigationEvent(RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 270942115, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -270942107, iOnWarmupCompleted2);
    }

    static void onExtraCallback() {
        onNavigationEvent = new int[]{2083611822, 596837284, 1031732170, -1527277337, -1695796489, -53594912, -1691609200, -208513597, -247123538, -26041214, 1663875154, 15958218, 747678160, -1535736817, -2068432520, -8707971, -835207154, 568833155};
    }
}
