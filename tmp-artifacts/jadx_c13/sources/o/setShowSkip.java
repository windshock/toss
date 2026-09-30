package o;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShowSkip extends hideCountDownText {
    private final BitSet IAuthTabCallback;
    private final Map<String, String> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public setShowSkip(Map<CharSequence, CharSequence> map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.onExtraCallback = new HashMap();
        this.IAuthTabCallback = new BitSet();
        int i = IntCompanionObject.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            this.onExtraCallback.put(entry.getKey().toString(), entry.getValue().toString());
            this.IAuthTabCallback.set(entry.getKey().charAt(0));
            int length = entry.getKey().length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.onNavigationEvent = i;
        this.onExtraCallbackWithResult = i2;
    }

    @Override // o.hideCountDownText
    public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (this.IAuthTabCallback.get(charSequence.charAt(i))) {
            int length = this.onExtraCallbackWithResult;
            if (i + length > charSequence.length()) {
                length = charSequence.length() - i;
            }
            while (length >= this.onNavigationEvent) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i, i + length);
                String str = this.onExtraCallback.get(charSequenceSubSequence.toString());
                if (str != null) {
                    writer.write(str);
                    return Character.codePointCount(charSequenceSubSequence, 0, charSequenceSubSequence.length());
                }
                length--;
            }
        }
        return 0;
    }
}
