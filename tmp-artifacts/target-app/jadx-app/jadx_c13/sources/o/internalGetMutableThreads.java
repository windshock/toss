package o;

import kotlin.text.CharsKt__CharJVMKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class internalGetMutableThreads extends CharsKt__CharJVMKt {
    public static boolean asBinder(char c) {
        return 55296 <= c && c < 57344;
    }

    public static int IAuthTabCallbackStub(char c) {
        int iOnExtraCallback = CharsKt__CharJVMKt.onExtraCallback(c, 10);
        if (iOnExtraCallback >= 0) {
            return iOnExtraCallback;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static Integer onTransact(char c) {
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.onExtraCallback(c, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static String asInterface(char c) {
        return setArchValue.onExtraCallbackWithResult(c);
    }

    public static boolean onNavigationEvent(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
