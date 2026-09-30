package o;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getX509TrustManagerOrNullokhttp {
    private static final TextPaint IAuthTabCallback = new TextPaint();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final getReadTimeoutokhttp onExtraCallback(@NotNull CharSequence charSequence, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (!(charSequence instanceof Spanned)) {
            return null;
        }
        int i5 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Spanned spanned = (Spanned) charSequence;
        ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) ArraysKt.lastOrNull(spanned.getSpans(i, i + 1, ForegroundColorSpan.class));
        return new getReadTimeoutokhttp(foregroundColorSpan != null ? Integer.valueOf(foregroundColorSpan.getForegroundColor()) : null, onExtraCallbackWithResult(spanned, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Typeface onExtraCallbackWithResult(Spanned spanned, int i) {
        Typeface typefaceIAuthTabCallback;
        StyleSpan styleSpan;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT >= 28) {
            int i5 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            TypefaceSpan typefaceSpan = (TypefaceSpan) ArraysKt.lastOrNull(spanned.getSpans(i, i + 1, TypefaceSpan.class));
            if (typefaceSpan != null) {
                int i7 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    typefaceIAuthTabCallback = typefaceSpan.getTypeface();
                    int i8 = 69 / 0;
                } else {
                    typefaceIAuthTabCallback = typefaceSpan.getTypeface();
                }
            } else {
                typefaceIAuthTabCallback = null;
            }
        } else {
            setCookieJarokhttp setcookiejarokhttp = (setCookieJarokhttp) ArraysKt.lastOrNull(spanned.getSpans(i, i + 1, setCookieJarokhttp.class));
            if (setcookiejarokhttp != null) {
                typefaceIAuthTabCallback = setcookiejarokhttp.IAuthTabCallback();
            }
        }
        if (typefaceIAuthTabCallback != null || (styleSpan = (StyleSpan) ArraysKt.lastOrNull(spanned.getSpans(i, i + 1, StyleSpan.class))) == null) {
            return typefaceIAuthTabCallback;
        }
        TextPaint textPaint = IAuthTabCallback;
        textPaint.setTypeface(null);
        styleSpan.updateDrawState(textPaint);
        return textPaint.getTypeface();
    }

    static {
        int i = onExtraCallback + 5;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
