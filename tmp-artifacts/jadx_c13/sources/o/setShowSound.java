package o;

import java.io.IOException;
import java.io.Writer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class setShowSound extends hideCountDownText {
    abstract void IAuthTabCallback(CharSequence charSequence, Writer writer) throws IOException;

    setShowSound() {
    }

    private String onWarmupCompleted() {
        Class<?> cls = getClass();
        return cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName();
    }

    @Override // o.hideCountDownText
    public int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (i != 0) {
            throw new IllegalArgumentException(onWarmupCompleted() + ".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index.");
        }
        IAuthTabCallback(charSequence, writer);
        return Character.codePointCount(charSequence, i, charSequence.length());
    }
}
