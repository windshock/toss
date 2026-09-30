package o;

import java.io.IOException;
import o.setUserVisibleHint;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class unregisterForContextMenu extends setUserVisibleHint.onExtraCallback {
    public static final unregisterForContextMenu IAuthTabCallback;
    public static final String onExtraCallback;
    private static final long serialVersionUID = 1;
    private final int charsPerLevel;
    private final String eol;
    private final char[] indents;

    @Override // o.setUserVisibleHint.onExtraCallback, o.setUserVisibleHint.onExtraCallbackWithResult
    public boolean onNavigationEvent() {
        return false;
    }

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        onExtraCallback = property;
        IAuthTabCallback = new unregisterForContextMenu("  ", property);
    }

    public unregisterForContextMenu() {
        this("  ", onExtraCallback);
    }

    public unregisterForContextMenu(String str, String str2) {
        this.charsPerLevel = str.length();
        this.indents = new char[str.length() << 4];
        int length = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            str.getChars(0, str.length(), this.indents, length);
            length += str.length();
        }
        this.eol = str2;
    }

    @Override // o.setUserVisibleHint.onExtraCallback, o.setUserVisibleHint.onExtraCallbackWithResult
    public void onNavigationEvent(getView getview, int i2) throws IOException {
        getview.onTransact(this.eol);
        if (i2 <= 0) {
            return;
        }
        int length = i2 * this.charsPerLevel;
        while (true) {
            char[] cArr = this.indents;
            if (length > cArr.length) {
                getview.IAuthTabCallback(cArr, 0, cArr.length);
                length -= this.indents.length;
            } else {
                getview.IAuthTabCallback(cArr, 0, length);
                return;
            }
        }
    }
}
