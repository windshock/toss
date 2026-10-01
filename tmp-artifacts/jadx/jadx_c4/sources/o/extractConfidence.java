package o;

import java.text.BreakIterator;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class extractConfidence {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final int onExtraCallback(@Nullable CharSequence charSequence) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            i = 1;
            if (charSequence != null) {
            }
            return i;
        }
        if (charSequence == null) {
            return 0;
        }
        i = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        while (characterInstance.next() != -1) {
            int i4 = onExtraCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            i = i4 % 2 == 0 ? i + 125 : i + 1;
        }
        return i;
    }
}
