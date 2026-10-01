package im.toss.uikit.widget.mobileId;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.SecureTextView$;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.serialiseFieldsbugsnag_android_core_release;
import o.varyFields;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecureTextView extends View {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final Paint IAuthTabCallback;
    private CharSequence asInterface;
    private float onExtraCallback;
    private int onExtraCallbackWithResult;
    private float onNavigationEvent;
    private Typeface onTransact;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(SecureTextView secureTextView, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(secureTextView, view);
        int i4 = asBinder + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.LEFT);
        this.IAuthTabCallback = paint;
        this.asInterface = _UrlKt.FRAGMENT_ENCODE_SET;
        this.onExtraCallback = 48.0f;
        this.onExtraCallbackWithResult = -16777216;
        this.onWarmupCompleted = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SecureTextView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                CharSequence text = typedArrayObtainStyledAttributes.getText(R.styleable.SecureTextView_android_text);
                if (text != null) {
                    int i2 = asBinder + 73;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    setText(text);
                    int i4 = 2 % 2;
                }
                setInternalTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SecureTextView_android_textSize, (int) (getResources().getDisplayMetrics().scaledDensity * 14.0f)));
                setInternalTextColor(typedArrayObtainStyledAttributes.getColor(R.styleable.SecureTextView_android_textColor, -16777216));
                setIncludeFontPadding(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SecureTextView_android_includeFontPadding, true));
                setLetterSpacing(typedArrayObtainStyledAttributes.getFloat(R.styleable.SecureTextView_android_letterSpacing, 0.0f));
                typedArrayObtainStyledAttributes.recycle();
                int i5 = IAuthTabCallbackDefault + 69;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        paint.setTextSize(this.onExtraCallback);
        paint.setColor(this.onExtraCallbackWithResult);
        paint.setTypeface(this.onTransact);
        paint.setLetterSpacing(this.onNavigationEvent);
        if (varyFields.onWarmupCompleted(context)) {
            setImportantForAccessibility(1);
            setOnClickListener(new SecureTextView$.ExternalSyntheticLambda0(this));
            int i8 = asBinder + 45;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 4;
            } else {
                int i10 = 2 % 2;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SecureTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = asBinder;
            int i5 = i4 + 9;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2 != 0 ? 1 : 0;
            int i7 = i4 + 31;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i = i6;
        }
        this(context, attributeSet, i);
    }

    public final CharSequence onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 103;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = this.asInterface;
        int i5 = i2 + 67;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    public final void setText(@NotNull CharSequence charSequence) throws IOException {
        CharSequence charSequenceOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.asInterface = charSequence;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (varyFields.onWarmupCompleted(context)) {
            CharSequence charSequence2 = this.asInterface;
            StringBuilder sb = new StringBuilder();
            int length = charSequence2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = charSequence2.charAt(i2);
                if (cCharAt != '-') {
                    int i3 = IAuthTabCallbackDefault + 125;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    sb.append(cCharAt);
                    int i5 = IAuthTabCallbackDefault + 49;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            if (TextUtils.isDigitsOnly(sb)) {
                serialiseFieldsbugsnag_android_core_release.onExtraCallback onextracallback = serialiseFieldsbugsnag_android_core_release.Companion;
                ArrayList arrayList = new ArrayList(sb.length());
                int i7 = 0;
                int i8 = 0;
                while (i7 < sb.length()) {
                    char cCharAt2 = sb.charAt(i7);
                    arrayList.add(i8 > 0 ? new serialiseFieldsbugsnag_android_core_release(new char[]{' ', cCharAt2}) : new serialiseFieldsbugsnag_android_core_release(new char[]{cCharAt2}));
                    i7++;
                    i8++;
                }
                serialiseFieldsbugsnag_android_core_release[] serialisefieldsbugsnag_android_core_releaseArr = (serialiseFieldsbugsnag_android_core_release[]) arrayList.toArray(new serialiseFieldsbugsnag_android_core_release[0]);
                charSequenceOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult((CharSequence[]) Arrays.copyOf(serialisefieldsbugsnag_android_core_releaseArr, serialisefieldsbugsnag_android_core_releaseArr.length));
            } else {
                charSequenceOnExtraCallbackWithResult = this.asInterface;
            }
            setContentDescription(charSequenceOnExtraCallbackWithResult);
        }
        requestLayout();
        invalidate();
    }

    public final void setInternalTextSize(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback = f;
            this.IAuthTabCallback.setTextSize(f);
            requestLayout();
            invalidate();
            int i3 = IAuthTabCallbackDefault + 35;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallback = f;
        this.IAuthTabCallback.setTextSize(f);
        requestLayout();
        invalidate();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setInternalTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 19;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback.setColor(i);
            invalidate();
            int i4 = 11 / 0;
        } else {
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback.setColor(i);
            invalidate();
        }
        int i5 = IAuthTabCallbackDefault + 101;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTypeface(@Nullable Typeface typeface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.onTransact = typeface;
            this.IAuthTabCallback.setTypeface(typeface);
            requestLayout();
            invalidate();
            int i3 = 65 / 0;
            return;
        }
        this.onTransact = typeface;
        this.IAuthTabCallback.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void setIncludeFontPadding(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = z;
        requestLayout();
        invalidate();
        int i4 = IAuthTabCallbackDefault + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setLetterSpacing(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (f != this.onNavigationEvent) {
            this.onNavigationEvent = f;
            this.IAuthTabCallback.setLetterSpacing(f);
            requestLayout();
            invalidate();
            return;
        }
        int i4 = i3 + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(SecureTextView secureTextView, View view) {
        int i = 2 % 2;
        Object parent = secureTextView.getParent();
        while (parent != null) {
            boolean z = parent instanceof View;
            View view2 = z ? (View) parent : null;
            if (view2 != null) {
                int i2 = IAuthTabCallbackDefault + 21;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    if (view2.isClickable()) {
                        view2.performClick();
                        return;
                    }
                } else {
                    view2.isClickable();
                    throw null;
                }
            }
            View view3 = !(z ^ true) ? (View) parent : null;
            if (view3 != null) {
                parent = view3.getParent();
                int i3 = IAuthTabCallbackDefault + 87;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } else {
                parent = null;
            }
        }
        int i5 = IAuthTabCallbackDefault + 1;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r1 = r13.IAuthTabCallback.getFontMetrics();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r13.onWarmupCompleted == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r2 = im.toss.uikit.widget.mobileId.SecureTextView.IAuthTabCallbackDefault + org.opencv.imgproc.Imgproc.COLOR_YUV2RGBA_YVYU;
        im.toss.uikit.widget.mobileId.SecureTextView.asBinder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r2 = r1.bottom;
        r1 = r1.top;
        r3 = 23 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r2 = r1.bottom;
        r1 = r1.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r2 = r1.descent;
        r1 = r1.ascent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r3 = android.view.View.MeasureSpec.getMode(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r4 = im.toss.uikit.widget.mobileId.SecureTextView.IAuthTabCallbackDefault + 61;
        im.toss.uikit.widget.mobileId.SecureTextView.asBinder = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r3 == 1073741824) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        r3 = kotlin.jvm.internal.IntCompanionObject.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        r3 = android.view.View.MeasureSpec.getSize(r14) - getPaddingLeft();
        r4 = getPaddingRight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        r3 = android.view.View.MeasureSpec.getSize(r14) - getPaddingLeft();
        r4 = getPaddingRight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r3 = r3 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r3 = onWarmupCompleted(r13.asInterface, r3);
        r4 = r3.iterator();
        r6 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        r7 = r4.next();
        r8 = r7.onWarmupCompleted();
        r7 = r7.onExtraCallbackWithResult();
        r9 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r8 >= r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r13.asInterface.charAt(r8) == '\n') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r10 = im.toss.uikit.widget.mobileId.SecureTextView.asBinder + 99;
        im.toss.uikit.widget.mobileId.SecureTextView.IAuthTabCallbackDefault = r10 % 128;
        r10 = r10 % 2;
        r9 = r9 + r13.IAuthTabCallback.measureText(r13.asInterface, r8, r8 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        r6 = java.lang.Math.max(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        r3 = r3.size();
        r4 = (int) r6;
        r5 = getPaddingLeft();
        setMeasuredDimension(android.view.View.resolveSize((r4 + r5) + getPaddingRight(), r14), android.view.View.resolveSize((((int) ((r2 - r1) * r3)) + getPaddingTop()) + getPaddingBottom(), r15));
        r14 = im.toss.uikit.widget.mobileId.SecureTextView.IAuthTabCallbackDefault + 109;
        im.toss.uikit.widget.mobileId.SecureTextView.asBinder = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r13.asInterface.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r13.asInterface.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        setMeasuredDimension(getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        float f;
        float f2;
        float paddingTop;
        float f3;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 105;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            int i4 = 56 / 0;
            if (this.asInterface.length() == 0) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            if (this.asInterface.length() == 0) {
                return;
            }
        }
        Paint.FontMetrics fontMetrics = this.IAuthTabCallback.getFontMetrics();
        boolean z = this.onWarmupCompleted;
        if (!z) {
            f = fontMetrics.descent;
            f2 = fontMetrics.ascent;
        } else {
            f = fontMetrics.bottom;
            f2 = fontMetrics.top;
        }
        float f4 = f;
        float f5 = f2;
        if (z) {
            int i5 = asBinder + 5;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                paddingTop = getPaddingTop();
                f3 = fontMetrics.top;
                int i6 = 69 / 0;
            } else {
                paddingTop = getPaddingTop();
                f3 = fontMetrics.top;
            }
        } else {
            paddingTop = getPaddingTop();
            f3 = fontMetrics.ascent;
        }
        float f6 = paddingTop + (-f3);
        for (onExtraCallback onextracallback : onWarmupCompleted(this.asInterface, (getWidth() - getPaddingLeft()) - getPaddingRight())) {
            float paddingLeft = getPaddingLeft();
            int iOnWarmupCompleted = onextracallback.onWarmupCompleted();
            int iOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
            float fMeasureText = paddingLeft;
            int i7 = iOnWarmupCompleted;
            while (i7 < iOnExtraCallbackWithResult) {
                if (this.asInterface.charAt(i7) != '\n') {
                    int i8 = i7 + 1;
                    i = i7;
                    canvas.drawText(this.asInterface.subSequence(i7, i8), 0, 1, fMeasureText, f6, this.IAuthTabCallback);
                    fMeasureText += this.IAuthTabCallback.measureText(this.asInterface, i, i8);
                } else {
                    i = i7;
                }
                i7 = i + 1;
            }
            f6 += f4 - f5;
        }
        int i9 = asBinder + 61;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTextSize(int i, float f) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 27;
        asBinder = i3 % 128;
        onExtraCallbackWithResult(i, f, i3 % 2 != 0);
        int i4 = asBinder + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTextSize(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setTextSize(2, f);
        int i4 = asBinder + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(int i, float f, boolean z) {
        int i2 = 2 % 2;
        int i3 = asBinder + 81;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        float fApplyDimension = TypedValue.applyDimension(i, f, getContext().getResources().getDisplayMetrics());
        if (fApplyDimension == this.onExtraCallback) {
            return;
        }
        setInternalTextSize(fApplyDimension);
        this.IAuthTabCallback.setTextSize(fApplyDimension);
        if (z) {
            requestLayout();
            invalidate();
            int i5 = asBinder + 13;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void setTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        setInternalTextColor(i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = IAuthTabCallbackDefault + 61;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float onWarmupCompleted(CharSequence charSequence, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        float fMeasureText = 0.0f;
        while (i < i2) {
            int i6 = asBinder + 71;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                if (charSequence.charAt(i) != '_') {
                    int i7 = asBinder + 113;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                    fMeasureText += this.IAuthTabCallback.measureText(charSequence.subSequence(i, i + 1), 0, 1);
                }
            } else if (charSequence.charAt(i) != '\n') {
            }
            i++;
        }
        int i9 = IAuthTabCallbackDefault + 21;
        asBinder = i9 % 128;
        if (i9 % 2 != 0) {
            return fMeasureText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<onExtraCallback> onWarmupCompleted(CharSequence charSequence) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i2 = asBinder + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            if (charSequence.charAt(i4) == '\n') {
                arrayList.add(new onExtraCallback(i5, i4, onWarmupCompleted(charSequence, i5, i4)));
                i5 = i4 + 1;
                int i6 = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
            i4++;
            int i8 = asBinder + 55;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        if (i5 < charSequence.length()) {
            arrayList.add(new onExtraCallback(i5, charSequence.length(), onWarmupCompleted(charSequence, i5, charSequence.length())));
        }
        int i10 = asBinder + 27;
        IAuthTabCallbackDefault = i10 % 128;
        int i11 = i10 % 2;
        return arrayList;
    }

    public final List<onExtraCallback> onWarmupCompleted(@NotNull CharSequence charSequence, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (f <= 0.0f) {
            return onWarmupCompleted(charSequence);
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < charSequence.length()) {
            int i5 = asBinder + 101;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (charSequence.charAt(i4) == '\n') {
                arrayList.add(new onExtraCallback(i4, i4, onWarmupCompleted(charSequence, i4, i4)));
                i4++;
            } else {
                int iOnWarmupCompleted = onWarmupCompleted(charSequence, i4, f);
                if (iOnWarmupCompleted > i4) {
                    arrayList.add(new onExtraCallback(i4, iOnWarmupCompleted, onWarmupCompleted(charSequence, i4, iOnWarmupCompleted)));
                    while (iOnWarmupCompleted < charSequence.length()) {
                        int i7 = asBinder + 45;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        if (charSequence.charAt(iOnWarmupCompleted) != ' ') {
                            break;
                        }
                        iOnWarmupCompleted++;
                    }
                } else {
                    iOnWarmupCompleted = Math.min(i4 + 1, charSequence.length());
                    arrayList.add(new onExtraCallback(i4, iOnWarmupCompleted, onWarmupCompleted(charSequence, i4, iOnWarmupCompleted)));
                    int i9 = asBinder + 81;
                    IAuthTabCallbackDefault = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 5;
                    }
                }
                i4 = iOnWarmupCompleted;
            }
        }
        return arrayList;
    }

    private final int onWarmupCompleted(CharSequence charSequence, int i, float f) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 95;
        asBinder = i3 % 128;
        float fMeasureText = i3 % 2 == 0 ? 2.0f : 0.0f;
        int i4 = -1;
        int i5 = i;
        while (i5 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt != '\n') {
                int i6 = i5 + 1;
                fMeasureText += this.IAuthTabCallback.measureText(charSequence.subSequence(i5, i6), 0, 1);
                if (fMeasureText > f) {
                    int i7 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
                    int i8 = i7 % 128;
                    asBinder = i8;
                    int i9 = i7 % 2;
                    if (i4 > i) {
                        int i10 = i8 + 11;
                        IAuthTabCallbackDefault = i10 % 128;
                        if (i10 % 2 == 0) {
                            return i4;
                        }
                        throw null;
                    }
                    if (i5 <= i) {
                        return i + 1;
                    }
                } else {
                    if (cCharAt == '\t' || cCharAt == ' ') {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            return i5;
        }
        return charSequence.length();
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final int onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final int onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i6 = i2 + 107;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.onExtraCallback != onextracallback.onExtraCallback) {
                return false;
            }
            if (this.onNavigationEvent != onextracallback.onNavigationEvent) {
                int i8 = i4 + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i8 % 128;
                return i8 % 2 == 0;
            }
            if (Float.compare(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) == 0) {
                return true;
            }
            int i9 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i9 % 128;
            return i9 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Integer.hashCode(this.onExtraCallback) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallbackWithResult);
            int i4 = IAuthTabCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LineInfo(startIndex=" + this.onExtraCallback + ", endIndex=" + this.onNavigationEvent + ", width=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 93 / 0;
            }
            return str;
        }

        public onExtraCallback(int i, int i2, float f) {
            this.onExtraCallback = i;
            this.onNavigationEvent = i2;
            this.onExtraCallbackWithResult = f;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallback;
            int i6 = i2 + 69;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.onNavigationEvent;
            if (i3 == 0) {
                int i5 = 8 / 0;
            }
            return i4;
        }
    }
}
