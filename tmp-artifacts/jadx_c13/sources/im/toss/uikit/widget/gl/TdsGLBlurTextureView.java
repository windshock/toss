package im.toss.uikit.widget.gl;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.uikit.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.ByteOrderedDataOutputStream;
import o.basic;
import o.deprecated_directory;
import o.deprecated_secure;
import o.getCurrentBacktraceOrBuilderList;
import o.getMaxAdCount;
import o.getokhttp;
import o.isInclusiveVersion;
import o.leaveBreadcrumb;
import o.readIntokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsGLBlurTextureView extends TdsGLEffectTextureView implements isInclusiveVersion {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private leaveBreadcrumb onExtraCallback;
    private deprecated_secure onExtraCallbackWithResult;

    static {
        int i = onWarmupCompleted + 67;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsGLBlurTextureView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsGLBlurTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsGLBlurTextureView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        deprecated_secure deprecated_secureVarOnExtraCallbackWithResult;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = deprecated_secure.Companion.IAuthTabCallback();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsGLBlurTextureView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsGLBlurTextureView_blurStyle) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    if (i3 == 0) {
                        deprecated_secureVarOnExtraCallbackWithResult = deprecated_secure.Companion.onExtraCallbackWithResult();
                    } else if (i3 != 1) {
                        int i4 = onTransact;
                        int i5 = i4 + 43;
                        IAuthTabCallbackStub = i5 % 128;
                        if (i5 % 2 == 0 ? i3 == 2 : i3 == 4) {
                            deprecated_secureVarOnExtraCallbackWithResult = deprecated_secure.Companion.onNavigationEvent();
                        } else {
                            if (i3 != 3) {
                                int i6 = i4 + 113;
                                IAuthTabCallbackStub = i6 % 128;
                                deprecated_secureVarOnExtraCallbackWithResult = (i6 % 2 == 0 ? i3 == 4 : i3 == 4) ? deprecated_secure.Companion.onExtraCallback() : deprecated_secure.Companion.IAuthTabCallback();
                            } else {
                                deprecated_secureVarOnExtraCallbackWithResult = deprecated_secure.Companion.onWarmupCompleted();
                                int i7 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
                                onTransact = i7 % 128;
                                if (i7 % 2 != 0) {
                                }
                            }
                            setBlurStyle(deprecated_secureVarOnExtraCallbackWithResult);
                        }
                    } else {
                        deprecated_secureVarOnExtraCallbackWithResult = deprecated_secure.Companion.asInterface();
                    }
                    int i8 = 2 % 2;
                    setBlurStyle(deprecated_secureVarOnExtraCallbackWithResult);
                } else if (index == R.styleable.TdsGLBlurTextureView_overlayColor) {
                    setOverlayColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0)));
                }
                i2++;
                int i9 = 2 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setEffectStyle(this.onExtraCallbackWithResult);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsGLBlurTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onTransact + 29;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setBlurStyle(@NotNull deprecated_secure deprecated_secureVar) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
        this.onExtraCallbackWithResult = deprecated_secureVar;
        setEffectStyle(deprecated_secureVar);
        int i4 = IAuthTabCallbackStub + 111;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setProgressiveBlurSpec(@Nullable leaveBreadcrumb leavebreadcrumb) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackStub = i2 % 128;
        basic.onWarmupCompleted onWarmupCompleted2 = null;
        if (i2 % 2 != 0) {
            this.onExtraCallback = leavebreadcrumb;
            basic basicVar = basic.onExtraCallbackWithResult;
            onExtraCallback();
            throw null;
        }
        this.onExtraCallback = leavebreadcrumb;
        basic basicVar2 = basic.onExtraCallbackWithResult;
        String strOnExtraCallback = onExtraCallback();
        if (leavebreadcrumb != null) {
            onWarmupCompleted2 = onWarmupCompleted(leavebreadcrumb);
            int i3 = onTransact + 91;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        basic.onExtraCallback(-1951306524, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent2, 1951306526, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{basicVar2, strOnExtraCallback, onWarmupCompleted2}, iOnNavigationEvent);
    }

    @Override // im.toss.uikit.widget.gl.TdsGLEffectTextureView
    protected void onExtraCallbackWithResult() {
        leaveBreadcrumb leavebreadcrumb;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            leavebreadcrumb = this.onExtraCallback;
            int i3 = 6 / 0;
            if (leavebreadcrumb == null) {
                return;
            }
        } else {
            leavebreadcrumb = this.onExtraCallback;
            if (leavebreadcrumb == null) {
                return;
            }
        }
        Object[] objArr = {basic.onExtraCallbackWithResult, onExtraCallback(), onWarmupCompleted(leavebreadcrumb)};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        basic.onExtraCallback(-1951306524, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1951306526, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, iOnNavigationEvent);
        int i4 = onTransact + 29;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setLinearProgressiveBlur$default(TdsGLBlurTextureView tdsGLBlurTextureView, float f, float f2, float f3, float f4, Float f5, Interpolator interpolator, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 53;
        onTransact = i4 % 128;
        if (i4 % 2 != 0 ? (i & 16) != 0 : (i & 58) != 0) {
            int i5 = i3 + 81;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            f5 = null;
        }
        Float f6 = f5;
        if ((i & 32) != 0) {
            interpolator = new LinearInterpolator();
            int i7 = IAuthTabCallbackStub + 13;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        tdsGLBlurTextureView.setLinearProgressiveBlur(f, f2, f3, f4, f6, interpolator);
    }

    public final void setLinearProgressiveBlur(float f, float f2, float f3, float f4, @Nullable Float f5, @NotNull Interpolator interpolator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interpolator, "");
        setProgressiveBlurSpec(new leaveBreadcrumb.onExtraCallback(interpolator, f, f2, f3, f4, f5));
        int i2 = onTransact + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void setRadialProgressiveBlur$default(TdsGLBlurTextureView tdsGLBlurTextureView, float f, float f2, float f3, Interpolator interpolator, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 71;
        onTransact = i3 % 128;
        if (i3 % 2 != 0 ? (i & 8) != 0 : (i & 35) != 0) {
            interpolator = new LinearInterpolator();
            int i4 = onTransact + 71;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        tdsGLBlurTextureView.setRadialProgressiveBlur(f, f2, f3, interpolator);
        int i6 = onTransact + 55;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setRadialProgressiveBlur(float f, float f2, float f3, @NotNull Interpolator interpolator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interpolator, "");
        setProgressiveBlurSpec(new leaveBreadcrumb.onWarmupCompleted(interpolator, f, f2, f3));
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void setBlurToken(@NotNull deprecated_directory deprecated_directoryVar) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_directoryVar, "");
        setBlurRadius(setTagsokhttp.onExtraCallbackWithResult(this, Integer.valueOf(deprecated_directoryVar.getRadius())));
        int i4 = IAuthTabCallbackStub + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setColorToken(@NotNull getokhttp getokhttpVar) {
        deprecated_secure deprecated_secureVarOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getokhttpVar, "");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Intrinsics.checkNotNullExpressionValue(resources.getConfiguration(), "");
        if (!(!readIntokhttp.onExtraCallback(r4))) {
            int i2 = onTransact + 59;
            IAuthTabCallbackStub = i2 % 128;
            deprecated_secureVarOnWarmupCompleted = i2 % 2 != 0 ? deprecated_secure.onWarmupCompleted(this.onExtraCallbackWithResult, 1, 0.0f, getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallback(getokhttpVar.getColor().onExtraCallbackWithResult()), 0.3f), 0.0f, 2.0f, 1.0f, false, 2, (Object) null) : deprecated_secure.onWarmupCompleted(this.onExtraCallbackWithResult, 0, 0.0f, getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallback(getokhttpVar.getColor().onExtraCallbackWithResult()), 0.3f), 0.0f, 0.0f, 0.0f, false, 123, (Object) null);
        } else {
            deprecated_secureVarOnWarmupCompleted = deprecated_secure.onWarmupCompleted(this.onExtraCallbackWithResult, 0, 0.0f, getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallback(getokhttpVar.getColor().IAuthTabCallback()), 0.3f), 0.0f, 0.0f, 0.0f, false, 123, (Object) null);
        }
        setBlurStyle(deprecated_secureVarOnWarmupCompleted);
        int i3 = IAuthTabCallbackStub + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setBlurRadius(float f) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0 ? f <= 0.0f : f <= 1.0f) {
            setBlurStyle(deprecated_secure.onWarmupCompleted(this.onExtraCallbackWithResult, 0, 0.0f, 0L, 0.0f, 0.0f, 0.0f, false, 124, (Object) null));
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        double dOnExtraCallback = varyMatches.onExtraCallback(Float.valueOf(f), context);
        setBlurStyle(deprecated_secure.onWarmupCompleted(this.onExtraCallbackWithResult, RangesKt___RangesKt.coerceIn(getCurrentBacktraceOrBuilderList.onNavigationEvent((float) Math.pow(dOnExtraCallback, 0.38d)), 1, 7), ((float) Math.pow(dOnExtraCallback, 0.61d)) / IAuthTabCallback(), 0L, 0.0f, 0.0f, 0.0f, false, 124, (Object) null));
        int i3 = IAuthTabCallbackStub + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private final float[] onWarmupCompleted(Interpolator interpolator, boolean z) {
        int i = 2 % 2;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(63, 1);
        float[] fArr = new float[64];
        int i2 = 0;
        while (i2 < 64) {
            int i3 = onTransact + 111;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            float f = (z ? iCoerceAtLeast - i2 : i2) / iCoerceAtLeast;
            int i5 = i4 + 47;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            float interpolation = interpolator.getInterpolation(f);
            if (i6 == 0) {
                fArr[i2] = RangesKt___RangesKt.coerceIn(interpolation, 0.0f, 0.0f);
                i2 += Imgproc.COLOR_YUV2RGB_YVYU;
            } else {
                fArr[i2] = RangesKt___RangesKt.coerceIn(interpolation, 0.0f, 1.0f);
                i2++;
            }
            int i7 = IAuthTabCallbackStub + 101;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        return fArr;
    }

    private final basic.onWarmupCompleted onWarmupCompleted(leaveBreadcrumb leavebreadcrumb) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = leavebreadcrumb instanceof leaveBreadcrumb.onWarmupCompleted;
        float[] fArrOnWarmupCompleted = onWarmupCompleted(leavebreadcrumb.IAuthTabCallback(), z);
        if (leavebreadcrumb instanceof leaveBreadcrumb.onExtraCallback) {
            leaveBreadcrumb.onExtraCallback onextracallback = (leaveBreadcrumb.onExtraCallback) leavebreadcrumb;
            return new basic.onWarmupCompleted(1, onextracallback.onExtraCallback(), onextracallback.onNavigationEvent(), onextracallback.onWarmupCompleted(), onextracallback.onExtraCallbackWithResult(), 0.0f, 0.0f, 0.0f, fArrOnWarmupCompleted);
        }
        if (!z) {
            throw new NoWhenBranchMatchedException();
        }
        leaveBreadcrumb.onWarmupCompleted onwarmupcompleted = (leaveBreadcrumb.onWarmupCompleted) leavebreadcrumb;
        basic.onWarmupCompleted onwarmupcompleted2 = new basic.onWarmupCompleted(2, 0.0f, 0.0f, 0.0f, 0.0f, onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onWarmupCompleted(), onwarmupcompleted.onNavigationEvent(), fArrOnWarmupCompleted);
        int i4 = onTransact + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompleted2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
