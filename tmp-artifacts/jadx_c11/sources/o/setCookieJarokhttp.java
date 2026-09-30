package o;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setCookieJarokhttp extends MetricAffectingSpan {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Typeface onWarmupCompleted;

    public setCookieJarokhttp(@Nullable Typeface typeface) {
        this.onWarmupCompleted = typeface;
    }

    public final Typeface IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Typeface typeface = this.onWarmupCompleted;
        int i5 = i3 + 7;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return typeface;
        }
        throw null;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setTypeface(this.onWarmupCompleted);
        } else {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setTypeface(this.onWarmupCompleted);
            throw null;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setTypeface(this.onWarmupCompleted);
            int i3 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setTypeface(this.onWarmupCompleted);
        }
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
