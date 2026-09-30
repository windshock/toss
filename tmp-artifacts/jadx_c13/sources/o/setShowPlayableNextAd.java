package o;

import java.io.IOException;
import java.io.Writer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShowPlayableNextAd extends hideCountDownText {
    private boolean onExtraCallbackWithResult(char c) {
        return c >= '0' && c <= '3';
    }

    private boolean onWarmupCompleted(char c) {
        return c >= '0' && c <= '7';
    }

    @Override // o.hideCountDownText
    public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i) != '\\' || length <= 0) {
            return 0;
        }
        int i2 = i + 1;
        if (!onWarmupCompleted(charSequence.charAt(i2))) {
            return 0;
        }
        int i3 = i + 2;
        int i4 = i + 3;
        sb.append(charSequence.charAt(i2));
        if (length > 1 && onWarmupCompleted(charSequence.charAt(i3))) {
            sb.append(charSequence.charAt(i3));
            if (length > 2 && onExtraCallbackWithResult(charSequence.charAt(i2)) && onWarmupCompleted(charSequence.charAt(i4))) {
                sb.append(charSequence.charAt(i4));
            }
        }
        writer.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
