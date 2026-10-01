package o;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class InputMethodManagerImplExternalSyntheticLambda0 {
    public static void IAuthTabCallback(Spannable spannable, Object obj, int i2, int i3, int i4) {
        for (Object obj2 : spannable.getSpans(i2, i3, obj.getClass())) {
            onWarmupCompleted(spannable, obj2, i2, i3, i4);
        }
        spannable.setSpan(obj, i2, i3, i4);
    }

    public static void onWarmupCompleted(Spannable spannable, float f, int i2, int i3, int i4) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i2, i3, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i2 && spannable.getSpanEnd(relativeSizeSpan) >= i3) {
                f *= relativeSizeSpan.getSizeChange();
            }
            onWarmupCompleted(spannable, relativeSizeSpan, i2, i3, i4);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i2, i3, i4);
    }

    private static void onWarmupCompleted(Spannable spannable, Object obj, int i2, int i3, int i4) {
        if (spannable.getSpanStart(obj) == i2 && spannable.getSpanEnd(obj) == i3 && spannable.getSpanFlags(obj) == i4) {
            spannable.removeSpan(obj);
        }
    }
}
