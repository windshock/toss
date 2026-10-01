package o;

import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class um {
    private String onExtraCallback;
    private int onWarmupCompleted = 0;

    public um(String str) {
        oas.onExtraCallback(str);
        this.onExtraCallback = str;
    }

    public boolean onWarmupCompleted() {
        return onTransact() == 0;
    }

    private int onTransact() {
        return this.onExtraCallback.length() - this.onWarmupCompleted;
    }

    public boolean onTransact(String str) {
        return this.onExtraCallback.regionMatches(true, this.onWarmupCompleted, str, 0, str.length());
    }

    public boolean onNavigationEvent(String... strArr) {
        for (String str : strArr) {
            if (onTransact(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean onWarmupCompleted(char... cArr) {
        if (onWarmupCompleted()) {
            return false;
        }
        for (char c : cArr) {
            if (this.onExtraCallback.charAt(this.onWarmupCompleted) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean onExtraCallback(String str) {
        if (!onTransact(str)) {
            return false;
        }
        this.onWarmupCompleted += str.length();
        return true;
    }

    public boolean asInterface() {
        return !onWarmupCompleted() && nfe.IAuthTabCallback(this.onExtraCallback.charAt(this.onWarmupCompleted));
    }

    public boolean asBinder() {
        return !onWarmupCompleted() && Character.isLetterOrDigit(this.onExtraCallback.charAt(this.onWarmupCompleted));
    }

    public char IAuthTabCallback() {
        String str = this.onExtraCallback;
        int i = this.onWarmupCompleted;
        this.onWarmupCompleted = i + 1;
        return str.charAt(i);
    }

    public void onNavigationEvent(String str) {
        if (!onTransact(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > onTransact()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.onWarmupCompleted += length;
    }

    public String onExtraCallbackWithResult(String str) {
        int iIndexOf = this.onExtraCallback.indexOf(str, this.onWarmupCompleted);
        if (iIndexOf != -1) {
            String strSubstring = this.onExtraCallback.substring(this.onWarmupCompleted, iIndexOf);
            this.onWarmupCompleted += strSubstring.length();
            return strSubstring;
        }
        return IAuthTabCallbackDefault();
    }

    public String IAuthTabCallback(String... strArr) {
        int i = this.onWarmupCompleted;
        while (!onWarmupCompleted() && !onNavigationEvent(strArr)) {
            this.onWarmupCompleted++;
        }
        return this.onExtraCallback.substring(i, this.onWarmupCompleted);
    }

    public String onWarmupCompleted(String str) {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        onExtraCallback(str);
        return strOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0056 A[LOOP:0: B:3:0x0009->B:38:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0058 A[EDGE_INSN: B:46:0x0058->B:39:0x0058 BREAK  A[LOOP:0: B:3:0x0009->B:38:0x0056], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String onExtraCallbackWithResult(char c, char c2) {
        int i = -1;
        int i2 = -1;
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        while (!onWarmupCompleted()) {
            char cIAuthTabCallback = IAuthTabCallback();
            if (c3 != '\\') {
                if (cIAuthTabCallback == '\'' && cIAuthTabCallback != c && !z) {
                    z2 = !z2;
                } else if (cIAuthTabCallback == '\"' && cIAuthTabCallback != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cIAuthTabCallback == c) {
                        i3++;
                        if (i == -1) {
                            i = this.onWarmupCompleted;
                        }
                    } else if (cIAuthTabCallback == c2) {
                        i3--;
                    }
                }
                if (i3 > 0) {
                    break;
                }
                c3 = cIAuthTabCallback;
            } else if (cIAuthTabCallback == 'Q') {
                z3 = true;
            } else if (cIAuthTabCallback == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.onWarmupCompleted;
            }
            if (i3 > 0) {
            }
        }
        String strSubstring = i2 >= 0 ? this.onExtraCallback.substring(i, i2) : _UrlKt.FRAGMENT_ENCODE_SET;
        if (i3 > 0) {
            oas.onWarmupCompleted("Did not find balanced marker at '" + strSubstring + "'");
        }
        return strSubstring;
    }

    public static String IAuthTabCallback(String str) {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbIAuthTabCallback.append(c2);
            } else if (c == '\\') {
                sbIAuthTabCallback.append(c2);
            }
            i++;
            c = c2;
        }
        return nfe.onExtraCallback(sbIAuthTabCallback);
    }

    public boolean onExtraCallbackWithResult() {
        boolean z = false;
        while (asInterface()) {
            this.onWarmupCompleted++;
            z = true;
        }
        return z;
    }

    public String onExtraCallback() {
        int i = this.onWarmupCompleted;
        while (!onWarmupCompleted() && (asBinder() || onNavigationEvent("*|", "|", "_", "-"))) {
            this.onWarmupCompleted++;
        }
        return this.onExtraCallback.substring(i, this.onWarmupCompleted);
    }

    public String onNavigationEvent() {
        int i = this.onWarmupCompleted;
        while (!onWarmupCompleted() && (asBinder() || onWarmupCompleted('-', '_'))) {
            this.onWarmupCompleted++;
        }
        return this.onExtraCallback.substring(i, this.onWarmupCompleted);
    }

    public String IAuthTabCallbackDefault() {
        String strSubstring = this.onExtraCallback.substring(this.onWarmupCompleted);
        this.onWarmupCompleted = this.onExtraCallback.length();
        return strSubstring;
    }

    public String toString() {
        return this.onExtraCallback.substring(this.onWarmupCompleted);
    }
}
