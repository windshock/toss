package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya61 {
    public static final Map<Character, Integer> onExtraCallback;
    public static final Map<Character, String> onExtraCallbackWithResult;
    boolean[] IAuthTabCallback_Parcel;
    public static final sya61 onWarmupCompleted = new sya61("\n");
    public static final sya61 IAuthTabCallbackDefault = new sya61("\u0000\r\n");
    public static final sya61 IAuthTabCallback = new sya61(" \u0000\r\n");
    public static final sya61 onTransact = new sya61("\t \u0000\r\n");
    public static final sya61 asBinder = new sya61("\u0000 \t");
    public static final sya61 asInterface = new sya61("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$_.!~*'()%,[]");
    public static final sya61 IAuthTabCallbackStub = new sya61("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$_.!~*'()%");
    public static final sya61 onNavigationEvent = new sya61("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");

    static {
        HashMap map = new HashMap();
        map.put('0', "\u0000");
        map.put('a', "\u0007");
        map.put('b', "\b");
        map.put('t', "\t");
        map.put('n', "\n");
        map.put('v', "\u000b");
        map.put('f', "\f");
        map.put('r', "\r");
        map.put('e', "\u001b");
        map.put(' ', " ");
        map.put('\"', "\"");
        map.put('/', "/");
        map.put('\\', "\\");
        map.put('N', "\u0085");
        map.put('_', " ");
        onExtraCallbackWithResult = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put('x', 2);
        map2.put('u', 4);
        map2.put('U', 8);
        onExtraCallback = Collections.unmodifiableMap(map2);
    }

    private sya61(String str) {
        boolean[] zArr = new boolean[128];
        this.IAuthTabCallback_Parcel = zArr;
        Arrays.fill(zArr, false);
        for (int i = 0; i < str.length(); i++) {
            this.IAuthTabCallback_Parcel[str.codePointAt(i)] = true;
        }
    }

    public boolean onExtraCallbackWithResult(int i) {
        return i < 128 && this.IAuthTabCallback_Parcel[i];
    }

    public boolean onNavigationEvent(int i) {
        return !onExtraCallbackWithResult(i);
    }

    public boolean onNavigationEvent(int i, String str) {
        return onExtraCallbackWithResult(i) || str.indexOf(i) != -1;
    }

    public boolean onWarmupCompleted(int i, String str) {
        return !onNavigationEvent(i, str);
    }

    public static String onExtraCallback(String str) {
        for (Character ch : onExtraCallbackWithResult.keySet()) {
            String str2 = onExtraCallbackWithResult.get(ch);
            if (!" ".equals(str2) && !"/".equals(str2) && !"\"".equals(str2) && str2.equals(str)) {
                return "\\" + ch;
            }
        }
        return str;
    }
}
