package o;

import java.io.IOException;
import java.io.Writer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setCountDownFor1InN extends hideCountDownText {
    public abstract boolean onWarmupCompleted(int i, Writer writer) throws IOException;

    @Override // o.hideCountDownText
    public final int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        return onWarmupCompleted(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }
}
