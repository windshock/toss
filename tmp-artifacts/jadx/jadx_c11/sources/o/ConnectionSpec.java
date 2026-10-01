package o;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ParagraphStyle;
import android.text.style.StyleSpan;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ConnectionSpec {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CharSequence onExtraCallbackWithResult(@NotNull CharSequence charSequence, @NotNull getDelegateokhttp getdelegateokhttp) {
        String strValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(getdelegateokhttp, "");
        int i2 = 0;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(onExtraCallbackWithResult(charSequence.toString(), getdelegateokhttp));
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), Object.class);
            int length = spans.length;
            while (i2 < length) {
                Object getpattern = spans[i2];
                int spanStart = spanned.getSpanStart(getpattern);
                int spanEnd = spanned.getSpanEnd(getpattern);
                int spanFlags = spanned.getSpanFlags(getpattern);
                if (getpattern instanceof ParagraphStyle) {
                    int i3 = onNavigationEvent + 33;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return charSequence;
                }
                if (!(getpattern instanceof getPattern) && (getpattern instanceof StyleSpan)) {
                    getpattern = new getPattern(((StyleSpan) getpattern).getStyle(), null, 2, null);
                }
                spannableString.setSpan(getpattern, spanStart, spanEnd, spanFlags);
                i2++;
            }
            int i5 = onNavigationEvent + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return spannableString;
        }
        if (charSequence instanceof hasProvider) {
            hasProvider hasprovider = (hasProvider) charSequence;
            return new hasProvider(onExtraCallbackWithResult(hasprovider.onTransact(), getdelegateokhttp).toString(), hasprovider.onWarmupCompleted(), hasprovider.onExtraCallback());
        }
        if (!(!getdelegateokhttp.IAuthTabCallbackStub()) && getdelegateokhttp.onTransact()) {
            return charSequence;
        }
        StringBuilder sb = new StringBuilder(charSequence.length());
        int length2 = charSequence.length();
        while (i2 < length2) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '\n') {
                if (cCharAt != ' ') {
                    strValueOf = (getdelegateokhttp.IAuthTabCallbackStub() || getdelegateokhttp.onTransact() || !CharsKt.IAuthTabCallback(cCharAt)) ? Character.valueOf(cCharAt) : " ";
                } else if (getdelegateokhttp.IAuthTabCallbackStub()) {
                    strValueOf = Character.valueOf(cCharAt);
                }
            } else if (getdelegateokhttp.onTransact()) {
                strValueOf = Character.valueOf(cCharAt);
                int i7 = onNavigationEvent + 29;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            sb.append(strValueOf);
            i2++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }
}
