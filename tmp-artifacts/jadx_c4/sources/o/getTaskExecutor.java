package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.base.transition.icon.ScaleTransitionTargetIconContainer;
import im.toss.base.transition.icon.ScaleTransitionTargetIconFactory;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.getTaskExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTaskExecutor {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final getTaskExecutor onWarmupCompleted = new getTaskExecutor();
    private static final WeakHashMap<ViewGroup, WeakReference<onNavigationEvent>> onExtraCallback = new WeakHashMap<>();

    private getTaskExecutor() {
    }

    static {
        int i = onNavigationEvent + 91;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull Activity activity) {
        ViewGroup viewGroup;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        View decorView = activity.getWindow().getDecorView();
        if (decorView instanceof ViewGroup) {
            viewGroup = (ViewGroup) decorView;
            int i2 = IAuthTabCallback + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = IAuthTabCallback + 15;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(activity, viewGroup);
        onnavigationeventIAuthTabCallback.onExtraCallback(viewGroup);
        onnavigationeventIAuthTabCallback.onExtraCallback(false, null);
    }

    public final onNavigationEvent IAuthTabCallback(@NotNull Activity activity, @NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        WeakHashMap<ViewGroup, WeakReference<onNavigationEvent>> weakHashMap = onExtraCallback;
        WeakReference<onNavigationEvent> weakReference = weakHashMap.get(viewGroup);
        if (weakReference != null) {
            int i4 = IAuthTabCallback + 45;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                weakReference.get();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent onnavigationevent = weakReference.get();
            if (onnavigationevent != null) {
                onnavigationevent.onExtraCallback(viewGroup);
                int i5 = IAuthTabCallback + 69;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationevent;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer = new ScaleTransitionTargetIconContainer(activity, null, 0, 6, null);
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
        onNavigationEvent onnavigationevent2 = new onNavigationEvent(frameLayout, scaleTransitionTargetIconContainer, scaleTransitionTargetIconFactory.onWarmupCompleted(activity), scaleTransitionTargetIconFactory.onNavigationEvent(activity), scaleTransitionTargetIconFactory.onWarmupCompleted(activity), scaleTransitionTargetIconFactory.onNavigationEvent(activity));
        weakHashMap.put(viewGroup, new WeakReference<>(onnavigationevent2));
        onnavigationevent2.onExtraCallback(viewGroup);
        return onnavigationevent2;
    }

    public final boolean IAuthTabCallback(@Nullable FrameLayout frameLayout, boolean z, @Nullable Function0<Unit> function0) {
        Object tag;
        onNavigationEvent onnavigationevent;
        int i = 2 % 2;
        Object obj = null;
        if (frameLayout != null) {
            tag = frameLayout.getTag();
        } else {
            int i2 = asBinder + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            tag = null;
        }
        if (!(!(tag instanceof onNavigationEvent))) {
            int i4 = asBinder + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            onnavigationevent = (onNavigationEvent) tag;
        } else {
            onnavigationevent = null;
        }
        if (onnavigationevent != null) {
            onnavigationevent.onExtraCallback(z, function0);
            return true;
        }
        int i6 = IAuthTabCallback + 27;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallbackDefault = 1;
        private static int onTransact;
        private FrameLayout IAuthTabCallback;
        private final View IAuthTabCallbackStub;
        private final View asBinder;
        private final ScaleTransitionTargetIconContainer asInterface;
        private final View onExtraCallback;
        private final FrameLayout onExtraCallbackWithResult;
        private final View onNavigationEvent;
        private int onWarmupCompleted;

        public static /* synthetic */ void IAuthTabCallback(onNavigationEvent onnavigationevent, int i, Ref.BooleanRef booleanRef, Function0 function0) {
            int i2 = 2 % 2;
            int i3 = onTransact + 91;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent(onnavigationevent, i, booleanRef, function0);
            if (i4 == 0) {
                int i5 = 23 / 0;
            }
            int i6 = IAuthTabCallbackDefault + 113;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        private static final boolean IAuthTabCallback(View view, MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 35;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 125;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~(i6 | i2 | i5);
            int i8 = ~i6;
            int i9 = ~i2;
            int i10 = ~(i8 | i9);
            int i11 = ~i5;
            int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
            int i13 = i11 | i10;
            int i14 = i6 + i2 + i + (105149790 * i4) + ((-719480883) * i3);
            int i15 = i14 * i14;
            int i16 = (i6 * (-424837635)) + 281018368 + ((-424837635) * i2) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i) + ((-654311424) * i4) + (1702887424 * i3) + ((-155189248) * i15);
            int i17 = (i6 * 910058005) + 1460508013 + (i2 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i * 910058489) + (i4 * (-759332242)) + (i3 * (-1121784475)) + (i15 * 1086324736);
            int i18 = i16 + (i17 * i17 * (-1925185536));
            return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }

        public static /* synthetic */ void onExtraCallbackWithResult(onNavigationEvent onnavigationevent, int i, Ref.BooleanRef booleanRef, Function0 function0) {
            int i2 = 2 % 2;
            int i3 = onTransact + 45;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {onnavigationevent, Integer.valueOf(i), booleanRef, function0};
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            onExtraCallback(objArr, zzmr.onExtraCallbackWithResult(), -559902405, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 559902405);
            int i5 = onTransact + 79;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public static /* synthetic */ boolean onWarmupCompleted(View view, MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 57;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = IAuthTabCallback(view, motionEvent);
            int i4 = onTransact + 101;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 24 / 0;
            }
            return zIAuthTabCallback;
        }

        public onNavigationEvent(@NotNull FrameLayout frameLayout, @NotNull ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer, @NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull View view4) {
            Intrinsics.checkNotNullParameter(frameLayout, "");
            Intrinsics.checkNotNullParameter(scaleTransitionTargetIconContainer, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(view2, "");
            Intrinsics.checkNotNullParameter(view3, "");
            Intrinsics.checkNotNullParameter(view4, "");
            this.onExtraCallbackWithResult = frameLayout;
            this.asInterface = scaleTransitionTargetIconContainer;
            this.IAuthTabCallbackStub = view;
            this.asBinder = view2;
            this.onExtraCallback = view3;
            this.onNavigationEvent = view4;
            frameLayout.setTag(this);
            frameLayout.setLayoutParams(getWorkerFactory.onWarmupCompleted());
            frameLayout.setVisibility(4);
            frameLayout.setClickable(false);
            frameLayout.setEnabled(false);
        }

        public final FrameLayout onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 37;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            FrameLayout frameLayout = this.onExtraCallbackWithResult;
            int i5 = i3 + 71;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return frameLayout;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 109;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer = onnavigationevent.asInterface;
            int i5 = i3 + 55;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return scaleTransitionTargetIconContainer;
            }
            throw null;
        }

        public final View IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 89;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            View view = this.IAuthTabCallbackStub;
            int i5 = i2 + 55;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return view;
        }

        public final View IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 113;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            View view = this.asBinder;
            int i5 = i3 + 43;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return view;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final View onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 117;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            View view = this.onExtraCallback;
            int i4 = i2 + 119;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return view;
            }
            throw null;
        }

        public final View onExtraCallbackWithResult() {
            View view;
            int i = 2 % 2;
            int i2 = onTransact + 45;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 == 0) {
                view = this.onNavigationEvent;
                int i4 = 24 / 0;
            } else {
                view = this.onNavigationEvent;
            }
            int i5 = i3 + 47;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return view;
        }

        public final FrameLayout onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 47;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            FrameLayout frameLayout = this.IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 35 / 0;
            }
            return frameLayout;
        }

        public final void onExtraCallback(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2;
            int i = 2 % 2;
            int i2 = onTransact + 73;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(viewGroup, "");
            ViewParent parent = this.onExtraCallbackWithResult.getParent();
            if (parent != viewGroup) {
                if (parent instanceof ViewGroup) {
                    int i4 = IAuthTabCallbackDefault + 55;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        viewGroup2 = (ViewGroup) parent;
                        int i5 = 4 / 0;
                    } else {
                        viewGroup2 = (ViewGroup) parent;
                    }
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    int i6 = onTransact + 103;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    viewGroup2.removeView(this.onExtraCallbackWithResult);
                }
                viewGroup.addView(this.onExtraCallbackWithResult);
                int i8 = IAuthTabCallbackDefault + 105;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            }
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            onExtraCallback(new Object[]{this}, zzmr.onExtraCallbackWithResult(), 1075702335, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1075702334);
            int i10 = IAuthTabCallbackDefault + 43;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, android.view.ViewGroup, im.toss.base.transition.icon.ScaleTransitionTargetIconContainer, java.lang.Object] */
        public final void onTransact() {
            int i = 2 % 2;
            this.onWarmupCompleted++;
            getInterfaceDescriptor();
            onExtraCallback(new Object[]{this}, zzmr.onExtraCallbackWithResult(), 1075702335, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1075702334);
            onExtraCallback(new Object[]{this}, zzmr.onExtraCallbackWithResult(), 1074962356, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1074962352);
            this.onExtraCallbackWithResult.bringToFront();
            this.onExtraCallbackWithResult.setVisibility(0);
            this.onExtraCallbackWithResult.setAlpha(1.0f);
            this.onExtraCallbackWithResult.setClickable(true);
            this.onExtraCallbackWithResult.setEnabled(true);
            this.onExtraCallbackWithResult.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.base.transition.origin.ScaleTransitionOriginOverlayPool$OriginOverlayViews$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 55;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    boolean zOnWarmupCompleted = getTaskExecutor.onNavigationEvent.onWarmupCompleted(view, motionEvent);
                    int i5 = IAuthTabCallback + 29;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 64 / 0;
                    }
                    return zOnWarmupCompleted;
                }
            });
            ?? r2 = this.asInterface;
            r2.setVisibility(0);
            r2.setLayerType(0, null);
            r2.onNavigationEvent();
            ScaleTransitionTargetIconContainer.IAuthTabCallback(1481091810, nSetPosition.onExtraCallbackWithResult(), -1481091809, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{r2}, nSetPosition.onExtraCallbackWithResult());
            r2.removeAllViews();
            asBinder();
            int i2 = IAuthTabCallbackDefault + 17;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public final void onNavigationEvent(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
            ViewGroup viewGroup;
            int childCount;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(layoutParams, "");
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                int i2 = IAuthTabCallbackDefault + 91;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    num.hashCode();
                    throw null;
                }
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (viewGroup == this.onExtraCallbackWithResult) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int i3 = onTransact + 1;
                    IAuthTabCallbackDefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        viewGroup.removeView(view);
                        num.hashCode();
                        throw null;
                    }
                    viewGroup.removeView(view);
                }
            }
            if (view.getParent() == null) {
                Integer numValueOf = Integer.valueOf(this.onExtraCallbackWithResult.indexOfChild(this.onExtraCallback));
                num = numValueOf.intValue() >= 0 ? numValueOf : null;
                if (num != null) {
                    int i4 = onTransact + 37;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        childCount = num.intValue();
                        int i5 = 3 / 0;
                    } else {
                        childCount = num.intValue();
                    }
                } else {
                    childCount = this.onExtraCallbackWithResult.getChildCount();
                }
                this.onExtraCallbackWithResult.addView(view, childCount, layoutParams);
            } else {
                view.setLayoutParams(layoutParams);
                int i6 = onTransact + 105;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
            view.setVisibility(0);
        }

        public final void asBinder() {
            int i = 2 % 2;
            int i2 = onTransact + 75;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.setVisibility(3);
                this.onExtraCallback.setAlpha(2.0f);
                this.onExtraCallback.setScaleX(0.0f);
                this.onExtraCallback.setScaleY(1.0f);
                this.onExtraCallback.setTranslationX(1.0f);
            } else {
                this.onExtraCallback.setVisibility(4);
                this.onExtraCallback.setAlpha(0.0f);
                this.onExtraCallback.setScaleX(1.0f);
                this.onExtraCallback.setScaleY(1.0f);
                this.onExtraCallback.setTranslationX(0.0f);
            }
            this.onExtraCallback.setTranslationY(0.0f);
        }

        private static final void IAuthTabCallback(Ref.BooleanRef booleanRef, Function0<Unit> function0) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 53;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!(!booleanRef.element)) {
                return;
            }
            booleanRef.element = true;
            if (function0 != null) {
                function0.invoke();
                int i4 = IAuthTabCallbackDefault + 11;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.view.ViewGroup, im.toss.base.transition.icon.ScaleTransitionTargetIconContainer, java.lang.Object] */
        private static final void onExtraCallback(onNavigationEvent onnavigationevent, int i, Ref.BooleanRef booleanRef, Function0<Unit> function0) {
            ImageView imageView;
            int i2 = 2 % 2;
            int i3 = onTransact + 107;
            int i4 = i3 % 128;
            IAuthTabCallbackDefault = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                int i5 = onnavigationevent.onWarmupCompleted;
                obj.hashCode();
                throw null;
            }
            if (onnavigationevent.onWarmupCompleted != i) {
                int i6 = i4 + 103;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                IAuthTabCallback(booleanRef, function0);
                return;
            }
            onnavigationevent.onExtraCallbackWithResult.setVisibility(4);
            onnavigationevent.onExtraCallbackWithResult.setOnTouchListener(null);
            onnavigationevent.onExtraCallbackWithResult.setClickable(false);
            onnavigationevent.onExtraCallbackWithResult.setEnabled(false);
            onnavigationevent.onExtraCallbackWithResult.setAlpha(1.0f);
            ?? r2 = onnavigationevent.asInterface;
            r2.setAlpha(0.0f);
            r2.setScaleX(1.0f);
            r2.setScaleY(1.0f);
            r2.setX(0.0f);
            r2.setY(0.0f);
            r2.setTranslationX(0.0f);
            r2.setTranslationY(0.0f);
            r2.setPivotX(0.0f);
            r2.setPivotY(0.0f);
            r2.onNavigationEvent();
            ScaleTransitionTargetIconContainer.IAuthTabCallback(1481091810, nSetPosition.onExtraCallbackWithResult(), -1481091809, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{r2}, nSetPosition.onExtraCallbackWithResult());
            r2.removeAllViews();
            r2.setLayerType(0, null);
            onnavigationevent.IAuthTabCallback(onnavigationevent.IAuthTabCallbackStub);
            onnavigationevent.IAuthTabCallback(onnavigationevent.asBinder);
            View view = onnavigationevent.asBinder;
            ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
            }
            onnavigationevent.asBinder();
            onnavigationevent.IAuthTabCallback(onnavigationevent.onNavigationEvent);
            View view2 = onnavigationevent.onNavigationEvent;
            if (view2 instanceof ImageView) {
                int i8 = IAuthTabCallbackDefault + 117;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                imageView = (ImageView) view2;
            } else {
                int i9 = IAuthTabCallbackDefault + 41;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            FrameLayout frameLayout = onnavigationevent.IAuthTabCallback;
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
                frameLayout.setVisibility(4);
            }
            onnavigationevent.getInterfaceDescriptor();
            onExtraCallback(new Object[]{onnavigationevent}, zzmr.onExtraCallbackWithResult(), 1075702335, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1075702334);
            IAuthTabCallback(booleanRef, function0);
        }

        public final void onExtraCallback(boolean z, @Nullable final Function0<Unit> function0) {
            int i = 2 % 2;
            final int i2 = this.onWarmupCompleted + 1;
            this.onWarmupCompleted = i2;
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (z) {
                this.onExtraCallbackWithResult.setOnTouchListener(null);
                this.onExtraCallbackWithResult.setClickable(false);
                this.onExtraCallbackWithResult.setEnabled(false);
                this.onExtraCallbackWithResult.postOnAnimation(new Runnable() { // from class: im.toss.base.transition.origin.ScaleTransitionOriginOverlayPool$OriginOverlayViews$$ExternalSyntheticLambda2
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = 2 % 2;
                        int i4 = onWarmupCompleted + 85;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        getTaskExecutor.onNavigationEvent onnavigationevent = this.f$0;
                        if (i5 != 0) {
                            getTaskExecutor.onNavigationEvent.IAuthTabCallback(onnavigationevent, i2, booleanRef, function0);
                            return;
                        }
                        getTaskExecutor.onNavigationEvent.IAuthTabCallback(onnavigationevent, i2, booleanRef, function0);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                return;
            }
            int i3 = IAuthTabCallbackDefault + 105;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallback(this, i2, booleanRef, function0);
            } else {
                onExtraCallback(this, i2, booleanRef, function0);
                throw null;
            }
        }

        private static final void onNavigationEvent(final onNavigationEvent onnavigationevent, final int i, final Ref.BooleanRef booleanRef, final Function0 function0) {
            int i2 = 2 % 2;
            onnavigationevent.onExtraCallbackWithResult.postOnAnimation(new Runnable() { // from class: im.toss.base.transition.origin.ScaleTransitionOriginOverlayPool$OriginOverlayViews$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 25;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        getTaskExecutor.onNavigationEvent.onExtraCallbackWithResult(this.f$0, i, booleanRef, function0);
                        throw null;
                    }
                    getTaskExecutor.onNavigationEvent.onExtraCallbackWithResult(this.f$0, i, booleanRef, function0);
                    int i5 = onNavigationEvent + 57;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 97 / 0;
                    }
                }
            });
            int i3 = onTransact + 77;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[2];
            Function0 function0 = (Function0) objArr[3];
            int i = 2 % 2;
            int i2 = onTransact + 15;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(onnavigationevent, iIntValue, booleanRef, function0);
            int i4 = onTransact + 121;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x007f A[PHI: r0
          0x007f: PHI (r0v6 im.toss.tds.view.component.widget.TdsRoundLayout) = (r0v2 im.toss.tds.view.component.widget.TdsRoundLayout), (r0v8 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:8:0x007a, B:5:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x007c A[PHI: r0 r3
          0x007c: PHI (r0v3 im.toss.tds.view.component.widget.TdsRoundLayout) = (r0v2 im.toss.tds.view.component.widget.TdsRoundLayout), (r0v8 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:8:0x007a, B:5:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r3v6 android.view.ViewGroup$LayoutParams) = (r3v5 android.view.ViewGroup$LayoutParams), (r3v17 android.view.ViewGroup$LayoutParams) binds: [B:8:0x007a, B:5:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            TdsRoundLayout tdsRoundLayout;
            ViewGroup.LayoutParams layoutParams;
            FrameLayout.LayoutParams layoutParams2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 47;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(new Object[]{onnavigationevent, onnavigationevent.access100(), 1, getWorkerFactory.onWarmupCompleted()}, zzmr.onExtraCallbackWithResult(), 1743867458, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1743867456);
                tdsRoundLayout = onnavigationevent.asInterface;
                layoutParams = tdsRoundLayout.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                } else {
                    int i3 = onTransact + 13;
                    IAuthTabCallbackDefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 % 4;
                    }
                    layoutParams2 = null;
                }
            } else {
                onExtraCallback(new Object[]{onnavigationevent, onnavigationevent.access100(), 0, getWorkerFactory.onWarmupCompleted()}, zzmr.onExtraCallbackWithResult(), 1743867458, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1743867456);
                tdsRoundLayout = onnavigationevent.asInterface;
                layoutParams = tdsRoundLayout.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                }
            }
            onExtraCallback(new Object[]{onnavigationevent, tdsRoundLayout, 1, layoutParams2}, zzmr.onExtraCallbackWithResult(), 1743867458, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1743867456);
            onExtraCallback(new Object[]{onnavigationevent, onnavigationevent.onExtraCallback, 2, new FrameLayout.LayoutParams(1, 1)}, zzmr.onExtraCallbackWithResult(), 1743867458, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), -1743867456);
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r6
          0x003c: PHI (r6v6 android.view.ViewParent) = (r6v5 android.view.ViewParent), (r6v16 android.view.ViewParent) binds: [B:8:0x0038, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[PHI: r0 r1
          0x0091: PHI (r0v3 android.widget.FrameLayout) = (r0v2 android.widget.FrameLayout), (r0v5 android.widget.FrameLayout) binds: [B:26:0x008f, B:23:0x007f] A[DONT_GENERATE, DONT_INLINE]
          0x0091: PHI (r1v4 int) = (r1v3 int), (r1v7 int) binds: [B:26:0x008f, B:23:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            ViewParent parent;
            ViewGroup viewGroup;
            int iCoerceIn;
            FrameLayout frameLayout;
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            View view = (View) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) objArr[3];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 113;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                parent = view.getParent();
                int i3 = 64 / 0;
                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            } else {
                parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                }
            }
            if (viewGroup != null) {
                if (viewGroup != onnavigationevent.onExtraCallbackWithResult) {
                    int i4 = onTransact;
                    int i5 = i4 + 93;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = i4 + 61;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int i9 = IAuthTabCallbackDefault + 27;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    viewGroup.removeView(view);
                }
            }
            if (view.getParent() == null) {
                int i11 = onTransact + 59;
                IAuthTabCallbackDefault = i11 % 128;
                if (i11 % 2 == 0) {
                    frameLayout = onnavigationevent.onExtraCallbackWithResult;
                    iCoerceIn = RangesKt.coerceIn(iIntValue, 1, frameLayout.getChildCount());
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(1, 1);
                    }
                    frameLayout.addView(view, iCoerceIn, layoutParams);
                } else {
                    FrameLayout frameLayout2 = onnavigationevent.onExtraCallbackWithResult;
                    iCoerceIn = RangesKt.coerceIn(iIntValue, 0, frameLayout2.getChildCount());
                    frameLayout = frameLayout2;
                    if (layoutParams == null) {
                    }
                    frameLayout.addView(view, iCoerceIn, layoutParams);
                }
            }
            return null;
        }

        private final void getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onTransact + 51;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            for (int childCount = this.onExtraCallbackWithResult.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.onExtraCallbackWithResult.getChildAt(childCount);
                if (childAt != this.asInterface) {
                    int i4 = onTransact + 91;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    if (childAt != this.onExtraCallback && childAt != this.IAuthTabCallback) {
                        this.onExtraCallbackWithResult.removeViewAt(childCount);
                        int i6 = IAuthTabCallbackDefault + 77;
                        onTransact = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            }
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            int i = 2 % 2;
            int i2 = onTransact + 79;
            IAuthTabCallbackDefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                FrameLayout frameLayout = onnavigationevent.IAuthTabCallback;
                obj.hashCode();
                throw null;
            }
            FrameLayout frameLayout2 = onnavigationevent.IAuthTabCallback;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundColor(onnavigationevent.IAuthTabCallbackDefault());
                frameLayout2.setAlpha(0.0f);
                frameLayout2.setVisibility(0);
                int i3 = IAuthTabCallbackDefault + 105;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = IAuthTabCallbackDefault + 63;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        private final FrameLayout access100() {
            int i = 2 % 2;
            int i2 = onTransact + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            FrameLayout frameLayout = this.IAuthTabCallback;
            if (frameLayout != null) {
                return frameLayout;
            }
            FrameLayout frameLayout2 = new FrameLayout(this.onExtraCallbackWithResult.getContext());
            frameLayout2.setBackgroundColor(IAuthTabCallbackDefault());
            frameLayout2.setAlpha(0.0f);
            frameLayout2.setVisibility(4);
            this.IAuthTabCallback = frameLayout2;
            int i4 = IAuthTabCallbackDefault + 49;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return frameLayout2;
        }

        private final int IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 51;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Context context = this.onExtraCallbackWithResult.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onExtraCallback(configuration)) {
                int i4 = IAuthTabCallbackDefault + 39;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return Color.argb(142, 0, 0, 0);
            }
            int iArgb = Color.argb(51, 0, 0, 0);
            int i6 = IAuthTabCallbackDefault + 3;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 44 / 0;
            }
            return iArgb;
        }

        private final void IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = onTransact + 77;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(0.0f);
                view.setX(1.0f);
                view.setY(2.0f);
                view.setTranslationX(2.0f);
                view.setTranslationY(0.0f);
                view.setLayerType(1, null);
                return;
            }
            view.setVisibility(0);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setX(0.0f);
            view.setY(0.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setLayerType(0, null);
        }

        private final void onExtraCallbackWithResult(View view, int i, FrameLayout.LayoutParams layoutParams) {
            Object[] objArr = {this, view, Integer.valueOf(i), layoutParams};
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            onExtraCallback(objArr, zzmr.onExtraCallbackWithResult(), 1743867458, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1743867456);
        }

        private final void IAuthTabCallbackStubProxy() {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            onExtraCallback(new Object[]{this}, zzmr.onExtraCallbackWithResult(), 1075702335, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1075702334);
        }

        private final void IAuthTabCallback_Parcel() {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            onExtraCallback(new Object[]{this}, zzmr.onExtraCallbackWithResult(), 1074962356, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1074962352);
        }

        private static final void onWarmupCompleted(onNavigationEvent onnavigationevent, int i, Ref.BooleanRef booleanRef, Function0 function0) {
            Object[] objArr = {onnavigationevent, Integer.valueOf(i), booleanRef, function0};
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            onExtraCallback(objArr, zzmr.onExtraCallbackWithResult(), -559902405, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 559902405);
        }

        public final ScaleTransitionTargetIconContainer asInterface() {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            return (ScaleTransitionTargetIconContainer) onExtraCallback(new Object[]{this}, zzmr.onExtraCallbackWithResult(), -586221734, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 586221737);
        }
    }
}
