package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getIconOnlyView extends getOverlayLayout {
    @Override // o.getOverlayLayout
    public boolean IAuthTabCallback(int i, Writer writer) throws IOException {
        return i >= 55296 && i <= 57343;
    }
}
