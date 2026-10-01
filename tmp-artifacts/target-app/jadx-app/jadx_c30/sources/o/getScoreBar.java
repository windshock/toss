package o;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getScoreBar extends getAdTitleTextView {
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final HashMap<String, String> onNavigationEvent = new HashMap<>();
    private final HashSet<Character> IAuthTabCallback = new HashSet<>();

    public getScoreBar(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        if (charSequenceArr != null) {
            int i3 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.onNavigationEvent.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.IAuthTabCallback.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i = length < i ? length : i;
                if (length > i3) {
                    i3 = length;
                }
            }
            i2 = i3;
        }
        this.onExtraCallbackWithResult = i;
        this.onExtraCallback = i2;
    }

    @Override // o.getAdTitleTextView
    public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.IAuthTabCallback.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.onExtraCallback;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.onExtraCallbackWithResult) {
            String str = this.onNavigationEvent.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
