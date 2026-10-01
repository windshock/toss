package o;

import android.text.InputFilter;
import android.text.Spanned;
import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ALCFaceAuth implements InputFilter {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final int IAuthTabCallback;

    public ALCFaceAuth(int i) {
        this.IAuthTabCallback = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(@NotNull CharSequence charSequence, int i, int i2, @NotNull Spanned spanned, int i3, int i4) {
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(spanned, "");
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        sb.append((CharSequence) spanned, 0, i3);
        sb.append((CharSequence) spanned, i4, spanned.length());
        int iOnExtraCallback = extractConfidence.onExtraCallback(sb.toString());
        int iOnExtraCallback2 = extractConfidence.onExtraCallback(charSequence.subSequence(i, i2));
        int i7 = this.IAuthTabCallback;
        if (iOnExtraCallback2 + iOnExtraCallback <= i7) {
            int i8 = onExtraCallback + 117;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        int i10 = i7 - iOnExtraCallback;
        if (i10 <= 0) {
            int i11 = onNavigationEvent + 101;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return "";
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.subSequence(i, i2).toString());
        int iCurrent = i;
        while (characterInstance.next() != -1 && i6 < i10) {
            i6++;
            iCurrent = characterInstance.current() + i;
        }
        return charSequence.subSequence(i, iCurrent);
    }
}
