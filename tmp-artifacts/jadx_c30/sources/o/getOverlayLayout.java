package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getOverlayLayout extends getAdTitleTextView {
    public abstract boolean IAuthTabCallback(int i, Writer writer) throws IOException;

    @Override // o.getAdTitleTextView
    public final int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
        return IAuthTabCallback(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }
}
