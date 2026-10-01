package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.widget.AppBarLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import o.RecomposerawaitIdle2;
import o.TossBundleLoader_startServiceSessionEvents;
import o.generateInviteUrl;
import o.getPreRenderJob;
import o.pxToDp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class generateInviteUrl {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 37662;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static Bitmap onExtraCallback = null;
    private static char onExtraCallbackWithResult = 51889;
    private static char onNavigationEvent = 44589;
    private static char onWarmupCompleted = 45550;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i6 | i4)) | (~(i2 | i4));
        int i10 = ~i2;
        int i11 = (~(i10 | i4)) | i6;
        int i12 = (~(i4 | i6 | i2)) | (~(i8 | i10));
        int i13 = i6 + i2 + i5 + ((-373584967) * i3) + ((-1711780345) * i);
        int i14 = i13 * i13;
        int i15 = (i6 * 1075882953) + 1902575616 + (1075882953 * i2) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i5) + ((-375259136) * i3) + ((-1109524480) * i) + (585564160 * i14);
        int i16 = ((i6 * 235012993) - 778813113) + (i2 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i5 * 235013625) + (i3 * 915899377) + (i * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? i17 != 4 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }
        View view = (View) objArr[0];
        int i18 = 2 % 2;
        int i19 = asInterface + 75;
        IAuthTabCallbackDefault = i19 % 128;
        int i20 = i19 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
        int i21 = IAuthTabCallbackDefault + 15;
        asInterface = i21 % 128;
        int i22 = i21 % 2;
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void onExtraCallback(TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tossBundleLoader_startServiceSessionEvents);
        int i4 = IAuthTabCallbackDefault + 49;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        View view = (View) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(view, valueAnimator);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(view, i, valueAnimator);
        int i5 = asInterface + 125;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(View view, Ref.BooleanRef booleanRef, Handler handler, Runnable runnable, TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents, View view2, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(view, booleanRef, handler, runnable, tossBundleLoader_startServiceSessionEvents, view2, motionEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(view, booleanRef, handler, runnable, tossBundleLoader_startServiceSessionEvents, view2, motionEvent);
        int i3 = asInterface + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 37;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if ((iIntValue2 & 1) != 0) {
            jLongValue = 1000;
        }
        if ((iIntValue2 & 2) != 0) {
            int i5 = i2 + 83;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            jLongValue2 = 0;
        }
        if ((iIntValue2 & 4) != 0) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr2 = {new getUrlokhttp(new onExtraCallback(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iIntValue3 = ((Integer) getUrlokhttp.onNavigationEvent(objArr2, 480532619, -480532619, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
            int i7 = IAuthTabCallbackDefault + 41;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            iIntValue = iIntValue3;
        }
        onWarmupCompleted(view, jLongValue, jLongValue2, iIntValue);
        return null;
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 91 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    private static final Animator onExtraCallback(final View view, final int i, long j, int... iArr) {
        int i2 = 2 % 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, iArr.length));
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.42f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.extensions.ViewsKt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 3;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                generateInviteUrl.onExtraCallbackWithResult(view, i, valueAnimator);
                int i6 = onExtraCallback + 11;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        int i3 = IAuthTabCallbackDefault + 5;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return valueAnimatorOfInt;
    }

    private static final void onExtraCallback(View view, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 31;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            ((Integer) animatedValue).intValue();
            view.getBackground();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        int iIntValue = ((Integer) animatedValue2).intValue();
        Drawable background = view.getBackground();
        if (background != null) {
            background.setColorFilter(new PorterDuffColorFilter(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(i, iIntValue), PorterDuff.Mode.SRC_OVER));
            background.invalidateSelf();
        }
        int i4 = asInterface + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback implements Animator.AnimatorListener {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallback(boolean z, View view) {
            this.onExtraCallbackWithResult = z;
            this.onExtraCallback = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this.onExtraCallbackWithResult) {
                int i5 = i2 + 107;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                this.onExtraCallback.setBackground(null);
            }
            int i7 = onNavigationEvent + 3;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final void onWarmupCompleted(@NotNull View view, long j, long j2, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j2);
        if (view.getBackground() == null) {
            int i3 = IAuthTabCallbackDefault + 5;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view.setBackground(new ColorDrawable(0));
        }
        animatorSet.play(onExtraCallback(view, i, 400L, Imgproc.COLOR_RGBA2YUV_YVYU, 0)).after(RangesKt___RangesKt.coerceAtLeast(j - 1000, 0L)).after(onExtraCallback(view, i, 600L, 0, Imgproc.COLOR_RGBA2YUV_YVYU));
        animatorSet.addListener(new IAuthTabCallback(z, view));
        animatorSet.start();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 83;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i3, i3);
                        int size = View.MeasureSpec.getSize(i3) + 10;
                        int i10 = 12435 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, size, i10, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.green(0)), ExpandableListView.getPackedPositionChild(0L) + 15, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $11 + 43;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    public static final View onWarmupCompleted(@NotNull ViewGroup viewGroup, @NotNull Function1<? super View, Boolean> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (function1.invoke(viewGroup).booleanValue()) {
            int i2 = asInterface + 55;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return viewGroup;
        }
        Stack stack = new Stack();
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                stack.addAll(arrayList);
                while (!stack.isEmpty()) {
                    View view = (View) stack.pop();
                    Intrinsics.checkNotNull(view);
                    if (function1.invoke(view).booleanValue()) {
                        return view;
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) view;
                        IntRange intRangeUntil2 = RangesKt___RangesKt.until(0, viewGroup2.getChildCount());
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil2, 10));
                        Iterator<Integer> it2 = intRangeUntil2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(viewGroup2.getChildAt(((IntIterator) it2).nextInt()));
                        }
                        stack.addAll(arrayList2);
                    }
                }
                return null;
            }
            int i4 = asInterface + 13;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
                obj.hashCode();
                throw null;
            }
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
        }
    }

    public static /* synthetic */ TossBundleLoader_startServiceSessionEvents onExtraCallback(View view, int i, CharSequence charSequence, Integer num, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = asInterface + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 4) != 0) {
            num = null;
        }
        TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEventsOnNavigationEvent = onNavigationEvent(view, i, charSequence, num);
        int i6 = asInterface + 77;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return tossBundleLoader_startServiceSessionEventsOnNavigationEvent;
    }

    public static final TossBundleLoader_startServiceSessionEvents onNavigationEvent(@NotNull View view, int i, @NotNull CharSequence charSequence, @Nullable Integer num) {
        int i2 = 2 % 2;
        int i3 = asInterface + 1;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        TossBundleLoader_startServiceSessionEvents.onExtraCallbackWithResult onextracallbackwithresult = TossBundleLoader_startServiceSessionEvents.Companion;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEventsOnExtraCallback = onextracallbackwithresult.onExtraCallback(context, i, num, charSequence);
        onExtraCallback(view, tossBundleLoader_startServiceSessionEventsOnExtraCallback);
        int i5 = asInterface + 81;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return tossBundleLoader_startServiceSessionEventsOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ TossBundleLoader_startServiceSessionEvents onWarmupCompleted(View view, String str, CharSequence charSequence, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = asInterface + 3;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            num = null;
        }
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents = (TossBundleLoader_startServiceSessionEvents) onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 275277009, new Object[]{view, str, charSequence, num}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -275277008);
        int i4 = asInterface + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return tossBundleLoader_startServiceSessionEvents;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[0];
        String str = (String) objArr[1];
        CharSequence charSequence = (CharSequence) objArr[2];
        Integer num = (Integer) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        TossBundleLoader_startServiceSessionEvents.onExtraCallbackWithResult onextracallbackwithresult = TossBundleLoader_startServiceSessionEvents.Companion;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEventsOnExtraCallback = onextracallbackwithresult.onExtraCallback(context, str, num, charSequence);
        onExtraCallback(view, tossBundleLoader_startServiceSessionEventsOnExtraCallback);
        int i4 = asInterface + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return tossBundleLoader_startServiceSessionEventsOnExtraCallback;
    }

    public static final void onNavigationEvent(@NotNull View view, @NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            TossBundleLoader_startServiceSessionEvents.onExtraCallbackWithResult onextracallbackwithresult = TossBundleLoader_startServiceSessionEvents.Companion;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            onExtraCallback(view, onextracallbackwithresult.onNavigationEvent(context, charSequence));
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            TossBundleLoader_startServiceSessionEvents.onExtraCallbackWithResult onextracallbackwithresult2 = TossBundleLoader_startServiceSessionEvents.Companion;
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            onExtraCallback(view, onextracallbackwithresult2.onNavigationEvent(context2, charSequence));
        }
        int i4 = asInterface + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        tossBundleLoader_startServiceSessionEvents.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallback(final View view, final TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.IAuthTabCallback(configuration)) {
            final Handler handler = new Handler(Looper.getMainLooper());
            final Runnable runnable = new Runnable() { // from class: im.toss.uikit.extensions.ViewsKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 65;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    generateInviteUrl.onExtraCallback(tossBundleLoader_startServiceSessionEvents);
                    int i7 = onExtraCallback + 15;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                }
            };
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            view.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.extensions.ViewsKt$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        generateInviteUrl.onNavigationEvent(view, booleanRef, handler, runnable, tossBundleLoader_startServiceSessionEvents, view2, motionEvent);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    boolean zOnNavigationEvent = generateInviteUrl.onNavigationEvent(view, booleanRef, handler, runnable, tossBundleLoader_startServiceSessionEvents, view2, motionEvent);
                    int i6 = onExtraCallbackWithResult + 43;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return zOnNavigationEvent;
                }
            });
            return;
        }
        int i4 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(null);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onWarmupCompleted(View view, Ref.BooleanRef booleanRef, Handler handler, Runnable runnable, TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents, View view2, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            motionEvent.getAction();
            obj.hashCode();
            throw null;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
            booleanRef.element = true;
            view.setPressed(true);
            handler.postDelayed(runnable, 200L);
            return true;
        }
        int i3 = IAuthTabCallbackDefault + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (action == 1) {
            handler.removeCallbacks(runnable);
            tossBundleLoader_startServiceSessionEvents.dismiss();
            if (booleanRef.element) {
                booleanRef.element = false;
                view.setPressed(false);
                view.performClick();
            }
            return true;
        }
        if (action != 2) {
            if (action != 3 && action != 4) {
                return false;
            }
            handler.removeCallbacks(runnable);
            tossBundleLoader_startServiceSessionEvents.dismiss();
            if (booleanRef.element) {
                int i5 = IAuthTabCallbackDefault + 5;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                booleanRef.element = false;
                view.setPressed(false);
            }
            return true;
        }
        if (motionEvent.getX() >= 0.0f) {
            int i7 = asInterface + 43;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            if (motionEvent.getX() > view.getWidth() || motionEvent.getY() < 0.0f) {
                handler.removeCallbacks(runnable);
                tossBundleLoader_startServiceSessionEvents.dismiss();
                if (booleanRef.element) {
                    booleanRef.element = false;
                    view.setPressed(false);
                }
            } else {
                int i9 = IAuthTabCallbackDefault + 35;
                asInterface = i9 % 128;
                if (i9 % 2 == 0) {
                    motionEvent.getY();
                    view.getHeight();
                    throw null;
                }
                if (motionEvent.getY() > view.getHeight()) {
                }
            }
        }
        return false;
    }

    private static final void onNavigationEvent(View view, ValueAnimator valueAnimator) {
        Drawable background;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        int i4 = asInterface + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        if (i5 == 0) {
            background.setAlpha(((Integer) animatedValue).intValue());
        } else {
            background.setAlpha(((Integer) animatedValue).intValue());
            int i6 = 71 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r10 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r10 = 93 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = new android.widget.LinearLayout(r10);
        r0.setOrientation(0);
        r0.setGravity(17);
        r5 = r0.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r10 = new im.toss.tds.view.component.atom.image.TdsImageView(r5, (android.util.AttributeSet) null, 0, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r4 = java.lang.Integer.TYPE;
        r4 = (android.view.ViewGroup.LayoutParams) android.view.ViewGroup.MarginLayoutParams.class.getDeclaredConstructor(r4, r4).newInstance(-1, -2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r5 = (android.view.ViewGroup.MarginLayoutParams) r4;
        r6 = r10.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r5.width = o.varyMatches.onExtraCallbackWithResult(r1, r6);
        r6 = r10.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r5.height = o.varyMatches.onExtraCallbackWithResult(r1, r6);
        r1 = r10.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r5.leftMargin = o.varyMatches.onNavigationEvent(4, r1);
        r1 = r10.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r5.bottomMargin = o.varyMatches.onNavigationEvent(1, r1);
        r10.setLayoutParams(r4);
        r10.setImageResource(im.toss.uikit.R.drawable.icon_lock_mono);
        r10.setImageTintList(android.content.res.ColorStateList.valueOf(r11));
        o.setProxySelectorokhttp.onExtraCallbackWithResult(r0, r10);
        r10 = (im.toss.tds.view.component.atom.text.BaseTextView) im.toss.tds.view.component.atom.text.Typography7.class.getDeclaredConstructor(android.content.Context.class).newInstance(r0.getContext());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r10);
        r10.onNavigationEvent(o.response.Bold);
        r10.setTextColor(r11);
        r4 = new java.lang.Object[1];
        a(new char[]{12260, 14116, 27008, 45494}, 3 - android.text.TextUtils.getOffsetBefore(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET, 0), r4);
        r10.setText(((java.lang.String) r4[0]).intern());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r10);
        o.setProxySelectorokhttp.onExtraCallbackWithResult(r0, r10);
        r0.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        r0.layout(0, 0, r0.getMeasuredWidth(), r0.getMeasuredHeight());
        r10 = android.graphics.Bitmap.createBitmap(r0.getMeasuredWidth(), r0.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "");
        r0.draw(new android.graphics.Canvas(r10));
        o.generateInviteUrl.onExtraCallback = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0159, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r10 = o.generateInviteUrl.IAuthTabCallbackDefault + 31;
        o.generateInviteUrl.asInterface = r10 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap onExtraCallback(@NotNull Context context, int i) throws Throwable {
        int i2;
        Bitmap bitmap;
        int i3 = 2 % 2;
        int i4 = asInterface + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            i2 = 108;
            Intrinsics.checkNotNullParameter(context, "");
            bitmap = onExtraCallback;
        } else {
            i2 = 16;
            Intrinsics.checkNotNullParameter(context, "");
            bitmap = onExtraCallback;
        }
    }

    private static final boolean onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof AppBarLayout) {
            return false;
        }
        int i2 = asInterface;
        int i3 = i2 + 19;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        Integer num = 0;
        ViewGroup viewGroup = (ViewGroup) objArr[0];
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ArrayList arrayList = new ArrayList();
        Iterator itIAuthTabCallback = ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup), new Function1() { // from class: im.toss.uikit.extensions.ViewsKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 29;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) generateInviteUrl.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2099080433, new Object[]{(View) obj}, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -2099080431)).booleanValue());
                int i7 = onWarmupCompleted + 59;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return boolValueOf;
            }
        }).IAuthTabCallback();
        while (true) {
            i = 1;
            if (!itIAuthTabCallback.hasNext()) {
                break;
            }
            int i4 = IAuthTabCallbackDefault + 3;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            View view = (View) itIAuthTabCallback.next();
            if (!(!(view instanceof ScrollView))) {
                View childAt = ((ScrollView) view).getChildAt(0);
                Intrinsics.checkNotNull(childAt, "");
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                int childCount = viewGroup2.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    int i7 = asInterface + 65;
                    IAuthTabCallbackDefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        arrayList.add(viewGroup2.getChildAt(i6));
                        i6 += 77;
                    } else {
                        arrayList.add(viewGroup2.getChildAt(i6));
                        i6++;
                    }
                }
            } else if (!(view instanceof RecyclerView)) {
                arrayList.add(view);
            } else {
                ViewGroup viewGroup3 = (ViewGroup) view;
                int childCount2 = viewGroup3.getChildCount();
                int i8 = 0;
                while (i8 < childCount2) {
                    int i9 = asInterface + 71;
                    IAuthTabCallbackDefault = i9 % 128;
                    if (i9 % 2 != 0) {
                        arrayList.add(viewGroup3.getChildAt(i8));
                        i8 += 123;
                    } else {
                        arrayList.add(viewGroup3.getChildAt(i8));
                        i8++;
                    }
                }
            }
        }
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(30);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i10 = asInterface + 65;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % i2;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) it.next(), AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null), num, null, num, null, null, null, num, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            i = i;
            arrayList2 = arrayList3;
            onnavigationevent = onnavigationevent;
            num = num;
            i2 = 2;
        }
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, onnavigationevent, arrayList2, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), false, i, (Object) null);
        return null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(View view, String str, Integer num, Integer num2, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = asInterface + 21;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 0;
            }
            num = null;
        }
        if ((i & 4) != 0) {
            int i5 = asInterface + 93;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            num2 = null;
        }
        Object objIAuthTabCallback = IAuthTabCallback(view, str, num, num2, access13800Var);
        int i6 = IAuthTabCallbackDefault + 9;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return objIAuthTabCallback;
    }

    public static final Object IAuthTabCallback(@NotNull View view, @NotNull String str, @Nullable Integer num, @Nullable Integer num2, @NotNull access13800<? super Bitmap> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onWarmupCompleted(view, str, num, num2, null), access13800Var);
        int i2 = asInterface + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ Integer $targetHeight;
        final /* synthetic */ Integer $targetWidth;
        final /* synthetic */ View $this_getBitmapFromURL;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(View view, String str, Integer num, Integer num2, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$this_getBitmapFromURL = view;
            this.$imageUrl = str;
            this.$targetWidth = num;
            this.$targetHeight = num2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$this_getBitmapFromURL, this.$imageUrl, this.$targetWidth, this.$targetHeight, access13800Var);
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Bitmap> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg2, access13800Var2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg2, access13800Var2);
            int i3 = onExtraCallback + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            int i5 = onExtraCallbackWithResult + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Context context = this.$this_getBitmapFromURL.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(this.$imageUrl);
                RecomposerHotReloadable recomposerHotReloadable = RecomposerHotReloadable.ENABLED;
                RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = Recomposerjoin2.IAuthTabCallback(onnavigationeventOnExtraCallback.onNavigationEvent(recomposerHotReloadable).onWarmupCompleted(recomposerHotReloadable), false).onExtraCallbackWithResult();
                Context context2 = this.$this_getBitmapFromURL.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context2);
                this.L$0 = access15400.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult);
                this.label = 1;
                obj = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult, this);
                if (obj == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i3 = onExtraCallbackWithResult + 61;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 3;
                }
            }
            RecomposerKt recomposerKt = (RecomposerErrorInformation) obj;
            if (!(recomposerKt instanceof RecomposerKt)) {
                return null;
            }
            if (this.$targetWidth == null || this.$targetHeight == null) {
                return CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(recomposerKt.onExtraCallbackWithResult(), 0, 0, 3, (Object) null);
            }
            int i5 = onExtraCallback + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return Bitmap.createScaledBitmap(CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(recomposerKt.onExtraCallbackWithResult(), 0, 0, 3, (Object) null), this.$targetWidth.intValue(), this.$targetHeight.intValue(), true);
        }
    }

    public static final float onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        float width = view.getWidth() / 2.0f;
        int i4 = IAuthTabCallbackDefault + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return width;
    }

    public static final float IAuthTabCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        float height = view.getHeight() / 2.0f;
        int i4 = asInterface + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return height;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(View view, ValueAnimator valueAnimator) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1899980231, new Object[]{view, valueAnimator}, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, 1899980231);
    }

    public static /* synthetic */ boolean onNavigationEvent(View view) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Boolean) onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 2099080433, new Object[]{view}, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -2099080431)).booleanValue();
    }

    public static final TossBundleLoader_startServiceSessionEvents onExtraCallbackWithResult(@NotNull View view, @NotNull String str, @NotNull CharSequence charSequence, @Nullable Integer num) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (TossBundleLoader_startServiceSessionEvents) onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 275277009, new Object[]{view, str, charSequence, num}, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, -275277008);
    }

    public static /* synthetic */ void onExtraCallback(View view, long j, long j2, int i, int i2, Object obj) {
        Object[] objArr = {view, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), obj};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1112513744, objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1112513740);
    }

    public static final void onWarmupCompleted(@NotNull ViewGroup viewGroup) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -178321738, new Object[]{viewGroup}, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, 178321741);
    }
}
