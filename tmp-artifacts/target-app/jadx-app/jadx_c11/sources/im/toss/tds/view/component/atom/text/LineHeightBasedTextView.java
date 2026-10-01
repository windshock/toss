package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CertificatePinnerBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class LineHeightBasedTextView extends AppCompatTextView {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private int onExtraCallback;
    private float onExtraCallbackWithResult;
    private Float onNavigationEvent;
    private int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineHeightBasedTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineHeightBasedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LineHeightBasedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setIncludeFontPadding(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LineHeightBasedTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asBinder + 119;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = asInterface + 97;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        boolean z;
        CharSequence charSequenceOnNavigationEvent;
        int i = 2 % 2;
        CertificatePinnerBuilder.onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CharSequence charSequenceOnNavigationEvent2 = onwarmupcompleted.onNavigationEvent(context, charSequence);
        if (charSequenceOnNavigationEvent2 != charSequence) {
            int i2 = asInterface + 25;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (isEmojiCompatEnabled() == z) {
            int i4 = asInterface + 63;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            setEmojiCompatEnabled(!z);
        }
        if (Build.VERSION.SDK_INT > 31) {
            super/*android.widget.TextView*/.setText(charSequenceOnNavigationEvent2, bufferType);
            int i6 = asInterface + 117;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = asBinder + 105;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        if (charSequenceOnNavigationEvent2 != null) {
            charSequenceOnNavigationEvent = onNavigationEvent(charSequenceOnNavigationEvent2);
            int i10 = asBinder + 35;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 / 2;
            }
        } else {
            charSequenceOnNavigationEvent = null;
        }
        super/*android.widget.TextView*/.setText(charSequenceOnNavigationEvent, bufferType);
    }

    private final CharSequence onNavigationEvent(CharSequence charSequence) {
        int i = 2 % 2;
        int length = charSequence.length();
        while (length > 0 && charSequence.charAt(length - 1) == '\n') {
            length--;
        }
        if (length == charSequence.length()) {
            int i2 = asBinder + 69;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return charSequence;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            int i3 = asBinder + 125;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            SpannableStringBuilder spannableStringBuilderDelete = spannableStringBuilder.delete(length, spannableStringBuilder.length());
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderDelete, "");
            return spannableStringBuilderDelete;
        }
        if (!(charSequence instanceof Spanned)) {
            return charSequence.subSequence(0, length);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence, 0, length);
        int i5 = asInterface + 25;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return spannableStringBuilder2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onMeasure(i, i2);
        Float f = this.onNavigationEvent;
        if (f != null) {
            int i6 = asInterface + 97;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                f.floatValue();
                getLineCount();
                View.MeasureSpec.getMode(i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float fFloatValue = f.floatValue();
            int lineCount = getLineCount();
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824) {
                this.onExtraCallbackWithResult = 0.0f;
                return;
            }
            this.onExtraCallback = (int) (fFloatValue * lineCount);
            this.onWarmupCompleted = (getMeasuredHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom();
            int compoundPaddingTop = this.onExtraCallback + getCompoundPaddingTop() + getCompoundPaddingBottom();
            int measuredHeight = compoundPaddingTop - getMeasuredHeight();
            if (measuredHeight <= 0) {
                this.onExtraCallbackWithResult = 0.0f;
                int i7 = asInterface + 43;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            if (mode != Integer.MIN_VALUE) {
                setMeasuredDimension(getMeasuredWidth(), compoundPaddingTop);
                this.onExtraCallbackWithResult = measuredHeight / 2.0f;
                return;
            }
            int i9 = asInterface + 5;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            setMeasuredDimension(getMeasuredWidth(), Math.min(compoundPaddingTop, View.MeasureSpec.getSize(i2)));
            this.onExtraCallbackWithResult = ((r6 - getMeasuredHeight()) + measuredHeight) / 2.0f;
        }
    }

    public void setLineHeight(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 87;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setLineHeight(i);
        int i5 = asBinder + 99;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLineHeight(int i, float f) {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setLineHeight(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        int i5 = asBinder + 57;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        setLineSpacing(r4, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (getLineSpacingExtra() == r4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (getLineSpacingExtra() == r4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r4 = im.toss.tds.view.component.atom.text.LineHeightBasedTextView.asBinder + 103;
        im.toss.tds.view.component.atom.text.LineHeightBasedTextView.asInterface = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLineHeight(float f) {
        float fontMetricsInt;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent = Float.valueOf(f);
            fontMetricsInt = f - getPaint().getFontMetricsInt(null);
        } else {
            this.onNavigationEvent = Float.valueOf(f);
            fontMetricsInt = f - getPaint().getFontMetricsInt(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextSize(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            super/*android.widget.TextView*/.setTextSize(f);
            asInterface();
            int i3 = 17 / 0;
        } else {
            super/*android.widget.TextView*/.setTextSize(f);
            asInterface();
        }
    }

    public void setTextSize(int i, float f) {
        int i2 = 2 % 2;
        int i3 = asBinder + 77;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            super.setTextSize(i, f);
            asInterface();
        } else {
            super.setTextSize(i, f);
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTypeface(@Nullable Typeface typeface) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super/*android.widget.TextView*/.setTypeface(typeface);
            asInterface();
            int i3 = asInterface + 71;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        super/*android.widget.TextView*/.setTypeface(typeface);
        asInterface();
        throw null;
    }

    public void setTypeface(@Nullable Typeface typeface, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        super.setTypeface(typeface, i);
        asInterface();
        int i5 = asInterface + 59;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Float f = this.onNavigationEvent;
        if (f != null) {
            Intrinsics.checkNotNull(f);
            setLineHeight(f.floatValue());
            int i4 = asInterface + 27;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r3 = r5.save();
        r5.translate(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        super/*android.view.View*\/.onDraw(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r5.restoreToCount(r3);
        r5 = im.toss.tds.view.component.atom.text.LineHeightBasedTextView.asBinder + 59;
        im.toss.tds.view.component.atom.text.LineHeightBasedTextView.asInterface = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r5.restoreToCount(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 == 1.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r1 == 0.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        super/*android.view.View*\/.onDraw(r5);
        r5 = im.toss.tds.view.component.atom.text.LineHeightBasedTextView.asBinder + 87;
        im.toss.tds.view.component.atom.text.LineHeightBasedTextView.asInterface = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(@NotNull Canvas canvas) {
        float f;
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            f = this.onExtraCallbackWithResult;
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            f = this.onExtraCallbackWithResult;
        }
    }
}
