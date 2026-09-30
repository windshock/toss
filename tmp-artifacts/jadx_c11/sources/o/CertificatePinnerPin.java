package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CertificatePinnerPin implements LeadingMarginSpan, LineHeightSpan {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private final int IAuthTabCallback;
    private final DisplayMetrics onExtraCallback;
    private final Integer onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    static {
        int i = onTransact + 63;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public CertificatePinnerPin(int i, @Nullable Integer num, @NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "");
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = num;
        this.onExtraCallback = displayMetrics;
        this.onWarmupCompleted = varyMatches.onExtraCallbackWithResult((Number) 24, displayMetrics);
        this.IAuthTabCallback = varyMatches.onNavigationEvent((Number) 8, displayMetrics);
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 67;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    private final int onNavigationEvent() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 107;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallbackWithResult != null) {
            int i5 = i4 + 51;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            i = 24;
        } else {
            i = 16;
        }
        return varyMatches.onExtraCallbackWithResult(Integer.valueOf(i), this.onExtraCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // android.text.style.LeadingMarginSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getLeadingMargin(boolean z) {
        int i;
        int i2 = 2 % 2;
        int iOnNavigationEvent = onNavigationEvent() + this.IAuthTabCallback;
        if (this.onNavigationEvent > 1) {
            int i3 = asBinder + 63;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.onExtraCallbackWithResult != null) {
                i = this.onWarmupCompleted - iOnNavigationEvent;
            } else {
                int i4 = IAuthTabCallbackDefault + 69;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
            }
        }
        return iOnNavigationEvent + i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int i, int i2, int i3, int i4, int i5, @NotNull CharSequence charSequence, int i6, int i7, boolean z, @Nullable Layout layout) {
        Spanned spanned;
        String str;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (!(charSequence instanceof Spanned)) {
            spanned = null;
        } else {
            int i9 = IAuthTabCallbackDefault + 97;
            asBinder = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            spanned = (Spanned) charSequence;
        }
        if (spanned != null) {
            int i10 = IAuthTabCallbackDefault + 53;
            asBinder = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 20 / 0;
                if (spanned.length() <= 0) {
                    return;
                }
            } else if (spanned.length() <= 0) {
                return;
            }
            if (spanned.getSpanStart(this) == i6) {
                int i12 = IAuthTabCallbackDefault + 79;
                asBinder = i12 % 128;
                if (i12 % 2 == 0) {
                    paint.getStyle();
                    paint.setStyle(Paint.Style.FILL);
                    throw null;
                }
                Paint.Style style = paint.getStyle();
                paint.setStyle(Paint.Style.FILL);
                if (layout != null) {
                    i = layout.getParagraphLeft(layout.getLineForOffset(i6));
                }
                int leadingMargin = i - (getLeadingMargin(z) * i2);
                float f = i4;
                Integer num = this.onExtraCallbackWithResult;
                if (num != null) {
                    str = num + ".";
                } else {
                    str = "∙";
                }
                float fMeasureText = paint.measureText(str);
                if (this.onExtraCallbackWithResult != null) {
                    canvas.drawText(str, (leadingMargin + (i2 * onNavigationEvent())) - fMeasureText, f, paint);
                } else {
                    canvas.drawText(str, leadingMargin + ((i2 * (onNavigationEvent() - fMeasureText)) / 2.0f), f, paint);
                }
                paint.setStyle(style);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r0 r14
      0x0033: PHI (r0v4 int) = (r0v3 int), (r0v8 int) binds: [B:9:0x0031, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r14v6 o.getHashAlgorithm) = (r14v5 o.getHashAlgorithm), (r14v9 o.getHashAlgorithm) binds: [B:9:0x0031, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.style.LineHeightSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void chooseHeight(@Nullable CharSequence charSequence, int i, int i2, int i3, int i4, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        getHashAlgorithm gethashalgorithm;
        int iOnNavigationEvent;
        int i5 = 2 % 2;
        int i6 = asBinder + 59;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            gethashalgorithm = getHashAlgorithm.onExtraCallbackWithResult;
            iOnNavigationEvent = varyMatches.onNavigationEvent((Number) 102, this.onExtraCallback);
            if (charSequence == null) {
                int i7 = IAuthTabCallbackDefault + 95;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                charSequence = "";
            }
        } else {
            gethashalgorithm = getHashAlgorithm.onExtraCallbackWithResult;
            iOnNavigationEvent = varyMatches.onNavigationEvent((Number) 8, this.onExtraCallback);
            if (charSequence == null) {
            }
        }
        CharSequence charSequence2 = charSequence;
        getHashAlgorithm gethashalgorithm2 = gethashalgorithm;
        int i9 = iOnNavigationEvent;
        if (fontMetricsInt == null) {
            fontMetricsInt = new Paint.FontMetricsInt();
            int i10 = asBinder + 115;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        }
        gethashalgorithm2.onNavigationEvent(this, 0, i9, charSequence2, i, i2, fontMetricsInt);
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return "TdsBulletSpan{}";
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
