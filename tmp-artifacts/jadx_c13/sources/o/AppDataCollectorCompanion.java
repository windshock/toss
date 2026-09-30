package o;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.widget.tooltip.TdsHighlightV3View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AppDataCollectorCompanion;
import o.generateAppWithState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AppDataCollectorCompanion {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[generateAppWithState.onWarmupCompleted.values().length];
            try {
                iArr[generateAppWithState.onWarmupCompleted.TOP.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[generateAppWithState.onWarmupCompleted.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[TdsHighlightV3View.onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.values().length];
            try {
                iArr2[TdsHighlightV3View.onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.RECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TdsHighlightV3View.onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult.CIRCLE.ordinal()] = 2;
                int i2 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr2;
            int[] iArr3 = new int[generateAppWithState.onExtraCallback.values().length];
            try {
                iArr3[generateAppWithState.onExtraCallback.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[generateAppWithState.onExtraCallback.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[generateAppWithState.onExtraCallback.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            onWarmupCompleted = iArr3;
            int i4 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ boolean IAuthTabCallback(generateAppWithState.onNavigationEvent onnavigationevent, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(onnavigationevent, view, motionEvent);
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ View onWarmupCompleted;

        public onNavigationEvent(View view) {
            this.onWarmupCompleted = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            Resources resources = this.onWarmupCompleted.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration)).onWarmupCompleted();
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{iOnWarmupCompleted, setBodyokhttp.onNavigationEvent(iOnWarmupCompleted, 0.0f)}, new float[]{0.45f, 1.0f}, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(this.onWarmupCompleted.getWidth() / 2.0f, this.onWarmupCompleted.getHeight() / 2.0f, 0.0f, 0.0f);
            matrix.postTranslate(this.onWarmupCompleted.getWidth() / 2.0f, this.onWarmupCompleted.getHeight() / 2.0f);
            radialGradient.setLocalMatrix(matrix);
            this.onWarmupCompleted.setBackground(new IAuthTabCallback(radialGradient, this.onWarmupCompleted));
            int i10 = onExtraCallback + 3;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 101;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallback extends Drawable {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        private final Paint onWarmupCompleted;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return -3;
        }

        IAuthTabCallback(RadialGradient radialGradient, View view) {
            this.onExtraCallbackWithResult = view;
            Paint paint = new Paint();
            paint.setShader(radialGradient);
            paint.setAntiAlias(true);
            this.onWarmupCompleted = paint;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(canvas, "");
            canvas.drawRect(0.0f, 0.0f, this.onExtraCallbackWithResult.getWidth(), this.onExtraCallbackWithResult.getHeight(), this.onWarmupCompleted);
            int i4 = onExtraCallback + 1;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 97;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.onWarmupCompleted.setAlpha(i);
            int i5 = IAuthTabCallback + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.setColorFilter(colorFilter);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
        }
    }

    private static final boolean onWarmupCompleted(generateAppWithState.onNavigationEvent onnavigationevent, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            generateAppWithState.onNavigationEvent onnavigationevent2 = generateAppWithState.onNavigationEvent.STRONG;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onnavigationevent == generateAppWithState.onNavigationEvent.STRONG) {
            return true;
        }
        int i3 = onExtraCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull View view, @NotNull final generateAppWithState.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (view.isLaidOut()) {
            int i4 = onExtraCallbackWithResult + 79;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
                if (view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new onNavigationEvent(view));
                } else {
                    Resources resources = view.getContext().getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration)).onWarmupCompleted();
                    RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{iOnWarmupCompleted, setBodyokhttp.onNavigationEvent(iOnWarmupCompleted, 0.0f)}, new float[]{0.45f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setScale(view.getWidth() / 2.0f, view.getHeight() / 2.0f, 0.0f, 0.0f);
                    matrix.postTranslate(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                    radialGradient.setLocalMatrix(matrix);
                    view.setBackground(new IAuthTabCallback(radialGradient, view));
                }
            } else if (!view.isLayoutRequested()) {
            }
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.tooltip.TdsHighlightV3UtilKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 13;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                boolean zIAuthTabCallback = AppDataCollectorCompanion.IAuthTabCallback(onnavigationevent, view2, motionEvent);
                int i9 = onExtraCallback + 43;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return zIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        generateAppWithState.onNavigationEvent onnavigationevent2 = generateAppWithState.onNavigationEvent.STRONG;
        view.setClickable(onnavigationevent == onnavigationevent2);
        view.setFocusable(onnavigationevent == onnavigationevent2);
    }

    public static /* synthetic */ StaticLayout IAuthTabCallback(BaseTextView baseTextView, Layout.Alignment alignment, TextUtils.TruncateAt truncateAt, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0 ? (i & 8) != 0 : (i & 113) != 0) {
            int i5 = i3 + 53;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            num = null;
        }
        return onExtraCallback(baseTextView, alignment, truncateAt, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r8 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r1 = o.AppDataCollectorCompanion.onExtraCallbackWithResult + 97;
        o.AppDataCollectorCompanion.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r5.getMaxWidth() > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r8 = o.AppDataCollectorCompanion.onExtraCallback + 81;
        o.AppDataCollectorCompanion.onExtraCallbackWithResult = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if ((r8 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r8 = r5.getContext().getResources().getDisplayMetrics().widthPixels;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r5 = r5.getContext().getResources().getDisplayMetrics().widthPixels;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        r5.getMaxWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        r8 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        r8 = r5.getMaxWidth();
        r1 = o.AppDataCollectorCompanion.onExtraCallbackWithResult + 17;
        o.AppDataCollectorCompanion.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if ((r1 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r0 = 3 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        r0 = r5.getPaddingStart() + r5.getPaddingEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (r8 < r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r8 = r8 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        return android.text.StaticLayout.Builder.obtain(r5.getText(), 0, r5.getText().length(), r5.getPaint(), kotlin.ranges.RangesKt___RangesKt.coerceAtLeast(r8, 0)).setIncludePad(r5.getIncludeFontPadding()).setEllipsize(r7).setAlignment(r6).setLineSpacing(r5.getLineSpacingExtra(), r5.getLineSpacingMultiplier()).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (kotlin.text.StringsKt__StringsKt.isBlank(r1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (kotlin.text.StringsKt__StringsKt.isBlank(r1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final StaticLayout onExtraCallback(@NotNull BaseTextView baseTextView, @NotNull Layout.Alignment alignment, @NotNull TextUtils.TruncateAt truncateAt, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseTextView, "");
            Intrinsics.checkNotNullParameter(alignment, "");
            Intrinsics.checkNotNullParameter(truncateAt, "");
            CharSequence text = baseTextView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            int i3 = 54 / 0;
        } else {
            Intrinsics.checkNotNullParameter(baseTextView, "");
            Intrinsics.checkNotNullParameter(alignment, "");
            Intrinsics.checkNotNullParameter(truncateAt, "");
            CharSequence text2 = baseTextView.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull View view, @NotNull TdsHighlightV3View.onExtraCallbackWithResult.EnumC0010onExtraCallbackWithResult enumC0010onExtraCallbackWithResult, @NotNull View view2, int i, int i2, int i3, @NotNull generateAppWithState.onExtraCallback onextracallback, @NotNull generateAppWithState.onWarmupCompleted onwarmupcompleted, boolean z, @NotNull View view3, @NotNull generateAppWithState.onNavigationEvent onnavigationevent) {
        int iOnExtraCallbackWithResult;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i4;
        int iOnExtraCallbackWithResult2;
        ViewGroup.LayoutParams layoutParams;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 101;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(enumC0010onExtraCallbackWithResult, "");
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(view3, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (!z) {
            iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(view, 0);
        } else {
            int i8 = onWarmupCompleted.onExtraCallback[onwarmupcompleted.ordinal()];
            if (i8 == 1) {
                iOnExtraCallbackWithResult = -((setTagsokhttp.onExtraCallbackWithResult(view, 8) + view3.getHeight()) / 2);
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iOnExtraCallbackWithResult = (setTagsokhttp.onExtraCallbackWithResult(view, 8) + view3.getHeight()) / 2;
            }
        }
        int i9 = onWarmupCompleted.onNavigationEvent[enumC0010onExtraCallbackWithResult.ordinal()];
        if (i9 != 1) {
            int i10 = onExtraCallbackWithResult + 111;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            if (i9 != 2) {
                f3 = 0.0f;
                if (z) {
                    f4 = i3;
                    f5 = 4.0f;
                } else {
                    f4 = i3;
                    f5 = 6.0f;
                }
                float f6 = f4 * f5;
                i4 = onWarmupCompleted.onWarmupCompleted[onextracallback.ordinal()];
                if (i4 == 1) {
                    int i12 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0 ? i4 == 2 : i4 == 4) {
                        iOnExtraCallbackWithResult2 = (i - (i2 / 2)) - setTagsokhttp.onExtraCallbackWithResult(view, 14);
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iOnExtraCallbackWithResult2 = i / 2;
                    }
                } else {
                    iOnExtraCallbackWithResult2 = setTagsokhttp.onExtraCallbackWithResult(view, 14) + (i2 / 2);
                }
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = (int) f3;
                layoutParams.height = (int) f6;
                view.setLayoutParams(layoutParams);
                onExtraCallbackWithResult(view, onnavigationevent);
                view.setX((view2.getX() + iOnExtraCallbackWithResult2) - (f3 / 2.0f));
                view.setY(((view2.getY() + (i3 / 2.0f)) - (f6 / 2.0f)) + iOnExtraCallbackWithResult);
                int i13 = onExtraCallbackWithResult + 125;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                return;
            }
            f = i2;
            f2 = 4.7f;
        } else {
            f = i2;
            f2 = 3.5f;
        }
        f3 = f * f2;
        if (z) {
        }
        float f62 = f4 * f5;
        i4 = onWarmupCompleted.onWarmupCompleted[onextracallback.ordinal()];
        if (i4 == 1) {
        }
        layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
        }
    }
}
