package o;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCRLDP {
    boolean[] IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    boolean asBinder;
    public static final getCRLDP IAuthTabCallback = new getCRLDP("\n\u0085\u2028\u2029");
    public static final getCRLDP onTransact = new getCRLDP("\u0000\r\n\u0085\u2028\u2029");
    public static final getCRLDP onWarmupCompleted = new getCRLDP(" \u0000\r\n\u0085\u2028\u2029");
    public static final getCRLDP onExtraCallback = new getCRLDP("\t \u0000\r\n\u0085\u2028\u2029");
    public static final getCRLDP onNavigationEvent = new getCRLDP("\u0000 \t");
    public static final getCRLDP asInterface = new getCRLDP("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
    public static final getCRLDP onExtraCallbackWithResult = new getCRLDP("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");

    private getCRLDP(String str) {
        boolean[] zArr = new boolean[128];
        this.IAuthTabCallbackDefault = zArr;
        this.asBinder = false;
        Arrays.fill(zArr, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt < 128) {
                this.IAuthTabCallbackDefault[iCodePointAt] = true;
            } else {
                sb.appendCodePoint(iCodePointAt);
            }
        }
        if (sb.length() > 0) {
            this.asBinder = true;
            this.IAuthTabCallbackStub = sb.toString();
        }
    }

    public boolean onExtraCallback(int i) {
        if (i < 128) {
            return this.IAuthTabCallbackDefault[i];
        }
        return this.asBinder && this.IAuthTabCallbackStub.indexOf(i) != -1;
    }

    public boolean onWarmupCompleted(int i) {
        return !onExtraCallback(i);
    }

    public boolean onExtraCallbackWithResult(int i, String str) {
        return onExtraCallback(i) || str.indexOf(i) != -1;
    }

    public boolean onNavigationEvent(int i, String str) {
        return !onExtraCallbackWithResult(i, str);
    }
}
