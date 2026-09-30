package o;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setSkipEnable extends hideCountDownText {
    private static final EnumSet<onWarmupCompleted> onNavigationEvent = EnumSet.copyOf((Collection) Collections.singletonList(onWarmupCompleted.semiColonRequired));
    private final EnumSet<onWarmupCompleted> onExtraCallbackWithResult;

    public enum onWarmupCompleted {
        semiColonRequired,
        semiColonOptional,
        errorIfNoSemiColon
    }

    public setSkipEnable(onWarmupCompleted... onwarmupcompletedArr) {
        this.onExtraCallbackWithResult = getVideoProgress.onExtraCallbackWithResult((Object[]) onwarmupcompletedArr) ? onNavigationEvent : EnumSet.copyOf((Collection) Arrays.asList(onwarmupcompletedArr));
    }

    public boolean onExtraCallback(onWarmupCompleted onwarmupcompleted) {
        return this.onExtraCallbackWithResult.contains(onwarmupcompleted);
    }

    @Override // o.hideCountDownText
    public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws NumberFormatException, IOException {
        int i2;
        int i3;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i4 = i + 2;
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i4 = i + 3;
                if (i4 == length) {
                    return 0;
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i5 = i4;
            while (i5 < length && ((charSequence.charAt(i5) >= '0' && charSequence.charAt(i5) <= '9') || ((charSequence.charAt(i5) >= 'a' && charSequence.charAt(i5) <= 'f') || (charSequence.charAt(i5) >= 'A' && charSequence.charAt(i5) <= 'F')))) {
                i5++;
            }
            int i6 = (i5 == length || charSequence.charAt(i5) != ';') ? 0 : 1;
            if (i6 == 0) {
                if (onExtraCallback(onWarmupCompleted.semiColonRequired)) {
                    return 0;
                }
                if (onExtraCallback(onWarmupCompleted.errorIfNoSemiColon)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            try {
                if (i2 != 0) {
                    i3 = Integer.parseInt(charSequence.subSequence(i4, i5).toString(), 16);
                } else {
                    i3 = Integer.parseInt(charSequence.subSequence(i4, i5).toString(), 10);
                }
                if (i3 > 65535) {
                    char[] chars = Character.toChars(i3);
                    writer.write(chars[0]);
                    writer.write(chars[1]);
                } else {
                    writer.write(i3);
                }
                return ((i5 + 2) - i4) + i2 + i6;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
