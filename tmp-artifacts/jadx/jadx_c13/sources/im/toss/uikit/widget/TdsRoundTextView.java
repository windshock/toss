package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CertificatePinnerBuilder;
import o.deprecated_noStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsRoundTextView extends AppCompatTextView {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private float onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRadius(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = f;
        invalidate();
        int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CertificatePinnerBuilder.onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CharSequence charSequenceOnNavigationEvent = onwarmupcompleted.onNavigationEvent(context, charSequence);
        boolean z = charSequenceOnNavigationEvent != charSequence;
        if (isEmojiCompatEnabled() == z) {
            int i4 = onNavigationEvent + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            setEmojiCompatEnabled(!z);
        }
        super/*android.widget.TextView*/.setText(charSequenceOnNavigationEvent, bufferType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsRoundTextView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsRoundTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsRoundTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        if (attributeSet != null && (theme = context.getTheme()) != null) {
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0 ? (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.TdsRoundTextView, 0, 0)) != null : (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.TdsRoundTextView, 1, 0)) != null) {
                setRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TdsRoundTextView_radius, 0));
                setBackground(new RoundDrawable(typedArrayObtainStyledAttributes.getColor(R.styleable.TdsRoundTextView_backgroundColor, 255), this.onExtraCallback, 0, false, 12, (DefaultConstructorMarker) null));
                typedArrayObtainStyledAttributes.recycle();
                int i3 = 2 % 2;
            }
        }
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = drawable instanceof ColorDrawable;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (drawable instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) drawable).getColor());
            return;
        }
        super/*android.view.View*/.setBackground(drawable);
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i) {
        int i2 = 2 % 2;
        super/*android.view.View*/.setBackground(new RoundDrawable(i, this.onExtraCallback, 15, false, 8, (DefaultConstructorMarker) null));
        int i3 = onNavigationEvent + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDraw(@NotNull Canvas canvas) {
        Path pathOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super/*android.view.View*/.onDraw(canvas);
            pathOnNavigationEvent = deprecated_noStore.onNavigationEvent(deprecated_noStore.onExtraCallback, this, this.onExtraCallback, 0, false, 78, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super/*android.view.View*/.onDraw(canvas);
            pathOnNavigationEvent = deprecated_noStore.onNavigationEvent(deprecated_noStore.onExtraCallback, this, this.onExtraCallback, 0, false, 6, (Object) null);
        }
        canvas.clipPath(pathOnNavigationEvent);
        int i3 = onWarmupCompleted + 27;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
    }
}
