package im.toss.uikit.widget.gl;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.tmoney.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import o.TTHistoryActivity2;
import o.access6900;
import o.setImageAssetDelegate;
import o.setProxySelectorokhttp;
import o.setSubtitleTextColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TdsAgslEffectView extends FrameLayout {
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private TimeInterpolator IAuthTabCallback;
    private final ValueAnimator IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private final View access000;
    private float access100;
    private float asBinder;
    private float asInterface;
    private int getInterfaceDescriptor;
    private long onExtraCallbackWithResult;
    private boolean onTransact;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onNavigationEvent = 8;
    private static final Regex onWarmupCompleted = new Regex("uniform\\s+float\\s+a\\s*;");
    private static final Regex onExtraCallback = new Regex("uniform\\s+float2\\s+iResolution\\s*;");

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgslEffectView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgslEffectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~(i | i6)) | i2;
        int i8 = (~((~i6) | i)) | i2;
        int i9 = (~i2) | i;
        int i10 = i2 + i + i5 + (440753341 * i4) + ((-634449194) * i3);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i2) + 1075183616 + ((-1421434046) * i) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i5) + (780402688 * i4) + ((-180879360) * i3) + (353763328 * i11);
        int i13 = (i2 * 892202253) + 1676176333 + (i * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i5 * 892200819) + (i4 * (-770690073)) + (i3 * 448958498) + (i11 * 1390542848);
        return i12 + ((i13 * i13) * (-1042677760)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ boolean onExtraCallback(TdsAgslEffectView tdsAgslEffectView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(tdsAgslEffectView, view, motionEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(tdsAgslEffectView, view, motionEvent);
        int i3 = extraCallbackWithResult + 11;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(TdsAgslEffectView tdsAgslEffectView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tdsAgslEffectView, valueAnimator);
        int i4 = writeTypedObject + 79;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAgslEffectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        View legacyEmptyEffectView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT >= 33) {
            legacyEmptyEffectView = new AgslRenderEffectView(context);
            int i2 = writeTypedObject + 11;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        } else {
            legacyEmptyEffectView = new LegacyEmptyEffectView(context);
            int i4 = writeTypedObject + 115;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
            }
            this.access000 = legacyEmptyEffectView;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.IAuthTabCallbackStubProxy = string;
            this.onExtraCallbackWithResult = 1350L;
            this.getInterfaceDescriptor = -1;
            this.IAuthTabCallback = new LinearInterpolator();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(this.onExtraCallbackWithResult);
            valueAnimatorOfFloat.setRepeatCount(this.getInterfaceDescriptor);
            valueAnimatorOfFloat.setInterpolator(this.IAuthTabCallback);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.gl.TdsAgslEffectView$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 123;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        TdsAgslEffectView.onNavigationEvent(this.f$0, valueAnimator);
                        int i7 = 70 / 0;
                    } else {
                        TdsAgslEffectView.onNavigationEvent(this.f$0, valueAnimator);
                    }
                    int i8 = onNavigationEvent + 79;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            this.IAuthTabCallbackDefault = valueAnimatorOfFloat;
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            setTag((String) onExtraCallback(-652621796, 652621796, a.3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted));
            setWillNotDraw(false);
            setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.gl.TdsAgslEffectView$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 43;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    boolean zOnExtraCallback = TdsAgslEffectView.onExtraCallback(this.f$0, view, motionEvent);
                    int i8 = onExtraCallback + 83;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        return zOnExtraCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            legacyEmptyEffectView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setProxySelectorokhttp.onExtraCallbackWithResult(this, legacyEmptyEffectView);
            int i5 = extraCallbackWithResult + 29;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = 2 % 2;
        this.access000 = legacyEmptyEffectView;
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        this.IAuthTabCallbackStubProxy = string2;
        this.onExtraCallbackWithResult = 1350L;
        this.getInterfaceDescriptor = -1;
        this.IAuthTabCallback = new LinearInterpolator();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(this.onExtraCallbackWithResult);
        valueAnimatorOfFloat2.setRepeatCount(this.getInterfaceDescriptor);
        valueAnimatorOfFloat2.setInterpolator(this.IAuthTabCallback);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.gl.TdsAgslEffectView$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i52 = 2 % 2;
                int i62 = onNavigationEvent + 123;
                onWarmupCompleted = i62 % 128;
                if (i62 % 2 != 0) {
                    TdsAgslEffectView.onNavigationEvent(this.f$0, valueAnimator);
                    int i72 = 70 / 0;
                } else {
                    TdsAgslEffectView.onNavigationEvent(this.f$0, valueAnimator);
                }
                int i8 = onNavigationEvent + 79;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.IAuthTabCallbackDefault = valueAnimatorOfFloat2;
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted22 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted32 = a.3.onWarmupCompleted();
        setTag((String) onExtraCallback(-652621796, 652621796, a.3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted32, iOnWarmupCompleted22, iOnWarmupCompleted4));
        setWillNotDraw(false);
        setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.gl.TdsAgslEffectView$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i52 = 2 % 2;
                int i62 = onExtraCallback + 43;
                onWarmupCompleted = i62 % 128;
                int i72 = i62 % 2;
                boolean zOnExtraCallback = TdsAgslEffectView.onExtraCallback(this.f$0, view, motionEvent);
                int i8 = onExtraCallback + 83;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    return zOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        legacyEmptyEffectView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setProxySelectorokhttp.onExtraCallbackWithResult(this, legacyEmptyEffectView);
        int i52 = extraCallbackWithResult + 29;
        writeTypedObject = i52 % 128;
        int i62 = i52 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgslEffectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCallbackWithResult + 1;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = extraCallbackWithResult + 91;
            writeTypedObject = i6 % 128;
            i = i6 % 2 == 0 ? 1 : 0;
            int i7 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ Regex onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 75;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Regex regex = onExtraCallback;
        int i5 = i2 + 77;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return regex;
    }

    public static final /* synthetic */ Regex onWarmupCompleted() {
        Regex regex;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 29;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            regex = onWarmupCompleted;
            int i4 = 8 / 0;
        } else {
            regex = onWarmupCompleted;
        }
        int i5 = i2 + 59;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return regex;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        String str = "TDS_AGSL_EFFECT_VIEW_TAG:" + ((TdsAgslEffectView) objArr[0]).IAuthTabCallbackStubProxy;
        int i2 = extraCallbackWithResult + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final void setAnimationDuration(long j) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallbackDefault.setDuration(j);
        int i4 = writeTypedObject + 63;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setRepeatCount(int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 55;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.getInterfaceDescriptor = i;
        this.IAuthTabCallbackDefault.setRepeatCount(i);
        int i5 = extraCallbackWithResult + 33;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setAnimationInterpolator(@NotNull TimeInterpolator timeInterpolator) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(timeInterpolator, "");
        this.IAuthTabCallback = timeInterpolator;
        this.IAuthTabCallbackDefault.setInterpolator(timeInterpolator);
        int i4 = extraCallbackWithResult + 11;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDraggable(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 17;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.onTransact = z;
        int i5 = i2 + 107;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onExtraCallbackWithResult(TdsAgslEffectView tdsAgslEffectView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        tdsAgslEffectView.setProgress(((Float) animatedValue).floatValue());
        int i4 = writeTypedObject + 3;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onWarmupCompleted(TdsAgslEffectView tdsAgslEffectView, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        if (!tdsAgslEffectView.onTransact) {
            int i2 = extraCallbackWithResult + 71;
            writeTypedObject = i2 % 128;
            return i2 % 2 == 0;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            tdsAgslEffectView.asBinder = motionEvent.getRawX();
            tdsAgslEffectView.asInterface = motionEvent.getRawY();
            tdsAgslEffectView.access100 = tdsAgslEffectView.getTranslationX();
            tdsAgslEffectView.IAuthTabCallback_Parcel = tdsAgslEffectView.getTranslationY();
            return true;
        }
        int i3 = extraCallbackWithResult + 113;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0 ? actionMasked != 2 : actionMasked != 5) {
            return false;
        }
        tdsAgslEffectView.setTranslationX((tdsAgslEffectView.access100 + motionEvent.getRawX()) - tdsAgslEffectView.asBinder);
        tdsAgslEffectView.setTranslationY((tdsAgslEffectView.IAuthTabCallback_Parcel + motionEvent.getRawY()) - tdsAgslEffectView.asInterface);
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        onExtraCallback(833850587, -833850586, a.3.onWarmupCompleted(), new Object[]{tdsAgslEffectView}, a.3.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        setProgress(this.IAuthTabCallbackStub);
        int i4 = extraCallbackWithResult + 119;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault.cancel();
        super.onDetachedFromWindow();
        int i4 = extraCallbackWithResult + 43;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setAgslEffect$default(TdsAgslEffectView tdsAgslEffectView, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject;
        int i4 = i3 + 97;
        extraCallbackWithResult = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAgslEffect");
        }
        int i5 = i3 + 9;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        if ((i & 2) != 0) {
            int i7 = i3 + 103;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            str2 = "u_Texture";
        }
        tdsAgslEffectView.setAgslEffect(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAgslEffect(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (Build.VERSION.SDK_INT >= 48) {
                View view = this.access000;
                Intrinsics.checkNotNull(view, "");
                ((AgslRenderEffectView) view).setAgslEffect(str, str2);
                setProgress(this.IAuthTabCallbackStub);
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (Build.VERSION.SDK_INT >= 33) {
            }
        }
        int i3 = writeTypedObject + 83;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 79 / 0;
        }
    }

    public static /* synthetic */ void setAgslEffectFromFile$default(TdsAgslEffectView tdsAgslEffectView, String str, String str2, int i, Object obj) throws IOException {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAgslEffectFromFile");
        }
        if ((i & 2) != 0) {
            int i3 = writeTypedObject + 41;
            int i4 = i3 % 128;
            extraCallbackWithResult = i4;
            int i5 = i3 % 2;
            str2 = "u_Texture";
            int i6 = i4 + 17;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        tdsAgslEffectView.setAgslEffectFromFile(str, str2);
    }

    public final void setAgslEffectFromFile(@NotNull String str, @NotNull String str2) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InputStream inputStreamOpen = getContext().getAssets().open("shader/" + str);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), TTHistoryActivity2.SIZE);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            setAgslEffect(text, str2);
            int i2 = extraCallbackWithResult + 9;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setProgress(float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStub = RangesKt___RangesKt.coerceIn(f, 1.0f, 2.0f);
            if (Build.VERSION.SDK_INT >= 112) {
                View view = this.access000;
                Intrinsics.checkNotNull(view, "");
                ((AgslRenderEffectView) view).setProgress(this.IAuthTabCallbackStub);
            }
        } else {
            this.IAuthTabCallbackStub = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
            if (Build.VERSION.SDK_INT >= 33) {
            }
        }
        int i3 = extraCallbackWithResult + 75;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        if (!this.IAuthTabCallbackDefault.isStarted()) {
            int i2 = writeTypedObject + 123;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackDefault.start();
        }
        int i4 = extraCallbackWithResult + 45;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackDefault.cancel();
            int i3 = 98 / 0;
        } else {
            this.IAuthTabCallbackDefault.cancel();
        }
        int i4 = extraCallbackWithResult + 1;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsAgslEffectView tdsAgslEffectView = (TdsAgslEffectView) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        tdsAgslEffectView.access000.invalidate();
        tdsAgslEffectView.invalidate();
        int i4 = extraCallbackWithResult + 81;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setMaskRoundRect(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 26) {
            int i3 = writeTypedObject + 103;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                View view = this.access000;
                Intrinsics.checkNotNull(view, "");
                ((AgslRenderEffectView) view).setMaskRoundRect(f);
            } else {
                View view2 = this.access000;
                Intrinsics.checkNotNull(view2, "");
                ((AgslRenderEffectView) view2).setMaskRoundRect(f);
                throw null;
            }
        }
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        onExtraCallback(833850587, -833850586, a.3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    public final void setMaskCircle(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            View view = this.access000;
            Intrinsics.checkNotNull(view, "");
            ((AgslRenderEffectView) view).setMaskCircle(f, f2, f3);
            int i4 = writeTypedObject + 113;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        onExtraCallback(833850587, -833850586, a.3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    static final class AgslRenderEffectView extends View {
        private static int ICustomTabsCallback = 1;
        private static int readTypedObject;
        private final Path IAuthTabCallback;
        private boolean IAuthTabCallbackDefault;
        private boolean IAuthTabCallbackStub;
        private float IAuthTabCallbackStubProxy;
        private RuntimeShader IAuthTabCallback_Parcel;
        private RenderEffect access000;
        private final RenderNode access100;
        private final int[] asBinder;
        private onNavigationEvent asInterface;
        private String getInterfaceDescriptor;
        private final int[] onExtraCallback;
        private final Rect onExtraCallbackWithResult;
        private final RectF onNavigationEvent;
        private final RenderNode onTransact;
        private final int[] onWarmupCompleted;
        private final access6900<Pair<View, View>> writeTypedObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgslRenderEffectView(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.access100 = setSubtitleTextColor.et_("TDS_AGSL_EFFECT_SOURCE");
            this.onTransact = setSubtitleTextColor.et_("TDS_AGSL_EFFECT");
            this.onWarmupCompleted = new int[2];
            this.asBinder = new int[2];
            this.onExtraCallback = new int[2];
            this.writeTypedObject = new access6900<>(8);
            this.onExtraCallbackWithResult = new Rect();
            this.IAuthTabCallback = new Path();
            this.onNavigationEvent = new RectF();
            this.getInterfaceDescriptor = "u_Texture";
            this.asInterface = onNavigationEvent.onWarmupCompleted.onNavigationEvent;
        }

        interface onNavigationEvent {

            public static final class onWarmupCompleted implements onNavigationEvent {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult = 1;
                public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
                private static int onWarmupCompleted;

                static {
                    int i = IAuthTabCallback + 69;
                    onExtraCallbackWithResult = i % 128;
                    int i2 = i % 2;
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 95;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    int i4 = i2 % 2;
                    if (this == obj) {
                        int i5 = i3 + 115;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return true;
                    }
                    if (!(!(obj instanceof onWarmupCompleted))) {
                        return true;
                    }
                    int i7 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
                    onExtraCallback = i7 % 128;
                    return i7 % 2 == 0;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 33;
                    int i3 = i2 % 128;
                    onWarmupCompleted = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    int i4 = i3 + 55;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return 71852586;
                }

                public String toString() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 77;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return "None";
                    }
                    int i3 = 0 / 0;
                    return "None";
                }

                private onWarmupCompleted() {
                }
            }
        }

        public final void setAgslEffect(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = readTypedObject + 77;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.getInterfaceDescriptor = str2;
            this.IAuthTabCallbackDefault = TdsAgslEffectView.onWarmupCompleted().onExtraCallback(str);
            this.IAuthTabCallbackStub = TdsAgslEffectView.onExtraCallbackWithResult().onExtraCallback(str);
            this.IAuthTabCallback_Parcel = setImageAssetDelegate.qz_(str);
            this.access000 = null;
            invalidate();
            int i4 = ICustomTabsCallback + 95;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public final void setProgress(float f) {
            int i = 2 % 2;
            int i2 = readTypedObject + 113;
            ICustomTabsCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.IAuthTabCallbackStubProxy = f;
                this.access000 = null;
                invalidate();
            } else {
                this.IAuthTabCallbackStubProxy = f;
                this.access000 = null;
                invalidate();
                obj.hashCode();
                throw null;
            }
        }

        public final void setMaskRoundRect(float f) {
            int i = 2 % 2;
            this.asInterface = new onNavigationEvent.IAuthTabCallback(f);
            invalidate();
            int i2 = readTypedObject + 125;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setMaskCircle(float f, float f2, float f3) {
            int i = 2 % 2;
            this.asInterface = new onNavigationEvent.onNavigationEvent(f, f2, f3);
            invalidate();
            int i2 = readTypedObject + 7;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.view.View
        protected void onDraw(@NotNull Canvas canvas) {
            View view;
            RuntimeShader runtimeShader;
            int i = 2 % 2;
            int i2 = readTypedObject + 125;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            if (getWidth() > 0) {
                int i4 = ICustomTabsCallback + 119;
                readTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 90 / 0;
                    if (getHeight() <= 0) {
                        return;
                    }
                } else if (getHeight() <= 0) {
                    return;
                }
                Object parent = getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    int i6 = ICustomTabsCallback + 57;
                    readTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    view = null;
                }
                if (view != null) {
                    int i8 = readTypedObject + 111;
                    ICustomTabsCallback = i8 % 128;
                    int i9 = i8 % 2;
                    ViewParent parent2 = view.getParent();
                    View view2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (view2 == null || (runtimeShader = this.IAuthTabCallback_Parcel) == null) {
                        return;
                    }
                    int i10 = ICustomTabsCallback + 37;
                    readTypedObject = i10 % 128;
                    int i11 = i10 % 2;
                    view2.getLocationInWindow(this.onWarmupCompleted);
                    view.getLocationInWindow(this.asBinder);
                    int[] iArr = this.asBinder;
                    int i12 = iArr[0];
                    int[] iArr2 = this.onWarmupCompleted;
                    int i13 = i12 - iArr2[0];
                    int i14 = iArr[1] - iArr2[1];
                    this.access100.setPosition(0, 0, getWidth(), getHeight());
                    RecordingCanvas recordingCanvasBeginRecording = this.access100.beginRecording(getWidth(), getHeight());
                    Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "");
                    recordingCanvasBeginRecording.translate(-i13, -i14);
                    this.onExtraCallbackWithResult.set(i13, i14, view.getWidth() + i13, view.getHeight() + i14);
                    recordingCanvasBeginRecording.clipRect(this.onExtraCallbackWithResult);
                    onExtraCallback(recordingCanvasBeginRecording, view2, view);
                    this.access100.endRecording();
                    if (this.IAuthTabCallbackDefault) {
                        runtimeShader.setFloatUniform("a", this.IAuthTabCallbackStubProxy);
                    }
                    if (this.IAuthTabCallbackStub) {
                        int i15 = ICustomTabsCallback + 85;
                        readTypedObject = i15 % 128;
                        if (i15 % 2 != 0) {
                            runtimeShader.setFloatUniform("iResolution", getWidth(), getHeight());
                            int i16 = 97 / 0;
                        } else {
                            runtimeShader.setFloatUniform("iResolution", getWidth(), getHeight());
                        }
                    }
                    this.onTransact.setPosition(0, 0, getWidth(), getHeight());
                    this.onTransact.setRenderEffect(rK_(runtimeShader));
                    RecordingCanvas recordingCanvasBeginRecording2 = this.onTransact.beginRecording(getWidth(), getHeight());
                    Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording2, "");
                    recordingCanvasBeginRecording2.drawRenderNode(this.access100);
                    this.onTransact.endRecording();
                    int iSave = canvas.save();
                    onWarmupCompleted(canvas);
                    canvas.drawRenderNode(this.onTransact);
                    canvas.restoreToCount(iSave);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            r5 = null;
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r2 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r2 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r1 = r1 + 9;
            im.toss.uikit.widget.gl.TdsAgslEffectView.AgslRenderEffectView.ICustomTabsCallback = r1 % 128;
            r1 = r1 % 2;
            r5 = android.graphics.RenderEffect.createRuntimeShaderEffect(r5, r4.getInterfaceDescriptor);
            r4.access000 = r5;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
            r1 = im.toss.uikit.widget.gl.TdsAgslEffectView.AgslRenderEffectView.readTypedObject + 119;
            im.toss.uikit.widget.gl.TdsAgslEffectView.AgslRenderEffectView.ICustomTabsCallback = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final RenderEffect rK_(RuntimeShader runtimeShader) {
            RenderEffect renderEffect;
            int i = 2 % 2;
            int i2 = readTypedObject;
            int i3 = i2 + 29;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                renderEffect = this.access000;
                int i4 = 30 / 0;
            } else {
                renderEffect = this.access000;
            }
        }

        private final void onWarmupCompleted(Canvas canvas) {
            int i = 2 % 2;
            onNavigationEvent.IAuthTabCallback iAuthTabCallback = this.asInterface;
            if (Intrinsics.areEqual(iAuthTabCallback, onNavigationEvent.onWarmupCompleted.onNavigationEvent)) {
                return;
            }
            int i2 = readTypedObject + 73;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (iAuthTabCallback instanceof onNavigationEvent.IAuthTabCallback) {
                    this.IAuthTabCallback.rewind();
                    this.onNavigationEvent.set(0.0f, 0.0f, getWidth(), getHeight());
                    onNavigationEvent.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    this.IAuthTabCallback.addRoundRect(this.onNavigationEvent, iAuthTabCallback2.onExtraCallback(), iAuthTabCallback2.onExtraCallback(), Path.Direction.CW);
                    canvas.clipPath(this.IAuthTabCallback);
                    return;
                }
                if (!(iAuthTabCallback instanceof onNavigationEvent.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i4 = i3 + 21;
                readTypedObject = i4 % 128;
                if (i4 % 2 == 0) {
                    this.IAuthTabCallback.rewind();
                    onNavigationEvent.onNavigationEvent onnavigationevent = (onNavigationEvent.onNavigationEvent) iAuthTabCallback;
                    this.IAuthTabCallback.addCircle(onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.IAuthTabCallback(), onnavigationevent.onNavigationEvent(), Path.Direction.CW);
                    canvas.clipPath(this.IAuthTabCallback);
                    return;
                }
                this.IAuthTabCallback.rewind();
                onNavigationEvent.onNavigationEvent onnavigationevent2 = (onNavigationEvent.onNavigationEvent) iAuthTabCallback;
                this.IAuthTabCallback.addCircle(onnavigationevent2.onExtraCallbackWithResult(), onnavigationevent2.IAuthTabCallback(), onnavigationevent2.onNavigationEvent(), Path.Direction.CW);
                canvas.clipPath(this.IAuthTabCallback);
                obj.hashCode();
                throw null;
            }
            boolean z = iAuthTabCallback instanceof onNavigationEvent.IAuthTabCallback;
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void onExtraCallback(Canvas canvas, View view, View view2) {
            View view3;
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 19;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            this.writeTypedObject.clear();
            while (view != null) {
                this.writeTypedObject.addFirst(new Pair<>(view, view2));
                Object parent = view.getParent();
                if (parent instanceof View) {
                    int i4 = readTypedObject + 55;
                    ICustomTabsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    view3 = (View) parent;
                } else {
                    view3 = null;
                }
                View view4 = view3;
                view2 = view;
                view = view4;
            }
            int iSave = canvas.save();
            Iterator<Pair<View, View>> it = this.writeTypedObject.iterator();
            int i6 = ICustomTabsCallback + 53;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = readTypedObject + 105;
                ICustomTabsCallback = i9 % 128;
                int i10 = i9 % 2;
                Pair<View, View> next = it.next();
                View first = next.getFirst();
                View second = next.getSecond();
                first.getLocationInWindow(this.onExtraCallback);
                int[] iArr = this.onExtraCallback;
                int i11 = iArr[0];
                int[] iArr2 = this.onWarmupCompleted;
                float f = i11 - iArr2[0];
                float f2 = iArr[1] - iArr2[1];
                int iSave2 = canvas.save();
                canvas.translate(f, f2);
                if (i8 <= 0) {
                    int i12 = readTypedObject + 77;
                    ICustomTabsCallback = i12 % 128;
                    int i13 = i12 % 2;
                    if (first.getBackground() != null) {
                        Drawable background = first.getBackground();
                        if (background != null) {
                            int i14 = ICustomTabsCallback + 61;
                            readTypedObject = i14 % 128;
                            int i15 = i14 % 2;
                            background.setBounds(0, 0, first.getWidth(), first.getHeight());
                            background.draw(canvas);
                        }
                    }
                }
                if (first instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) first;
                    int iIndexOfChild = viewGroup.indexOfChild(second);
                    for (int i16 = 0; i16 < iIndexOfChild; i16++) {
                        View childAt = viewGroup.getChildAt(i16);
                        Intrinsics.checkNotNull(childAt);
                        if (childAt.getVisibility() == 0 && childAt.getWidth() > 0 && childAt.getHeight() > 0) {
                            int iSave3 = canvas.save();
                            canvas.translate(childAt.getLeft(), childAt.getTop());
                            childAt.draw(canvas);
                            canvas.restoreToCount(iSave3);
                        }
                    }
                }
                canvas.restoreToCount(iSave2);
                i8++;
            }
            canvas.restoreToCount(iSave);
        }
    }

    static final class LegacyEmptyEffectView extends View {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegacyEmptyEffectView(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        int i = readTypedObject + 19;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    private final String asInterface() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        return (String) onExtraCallback(-652621796, 652621796, a.3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
    }

    public final void onNavigationEvent() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        onExtraCallback(833850587, -833850586, a.3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted);
    }
}
