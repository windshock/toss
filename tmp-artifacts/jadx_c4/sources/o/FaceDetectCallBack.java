package o;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceDetectCallBack {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    public static final FaceDetectCallBack onExtraCallbackWithResult = new FaceDetectCallBack();
    private static final HashMap<Character, Character> onNavigationEvent = access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback((char) 51060, (char) 47532), getWrite.IAuthTabCallback((char) 45208, (char) 46972), getWrite.IAuthTabCallback((char) 45432, (char) 47196), getWrite.IAuthTabCallback((char) 51076, (char) 47548), getWrite.IAuthTabCallback((char) 50977, (char) 47449), getWrite.IAuthTabCallback((char) 50668, (char) 47140), getWrite.IAuthTabCallback((char) 50857, (char) 47329), getWrite.IAuthTabCallback((char) 50976, (char) 47448), getWrite.IAuthTabCallback((char) 50577, (char) 47049), getWrite.IAuthTabCallback((char) 50684, (char) 47156), getWrite.IAuthTabCallback((char) 45784, (char) 51076)});
    private static int onWarmupCompleted = 1;

    public final boolean onExtraCallback(char c) {
        int i = 2 % 2;
        if ('0' <= c) {
            int i2 = asInterface;
            int i3 = i2 + 27;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0 ? c < ':' : c < 'A') {
                int i4 = i2 + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = onExtraCallback + 91;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final boolean onExtraCallbackWithResult(char c) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if ('!' <= c) {
            int i5 = i2 + 15;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (c < '0') {
                return true;
            }
        }
        if (':' <= c && c < 'A') {
            return true;
        }
        if ('[' <= c && c < 'a') {
            return true;
        }
        if ('{' > c) {
            return false;
        }
        int i7 = i2 + 115;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return c < 127;
    }

    public final boolean onNavigationEvent(char c) {
        int i = 2 % 2;
        if ('A' <= c) {
            int i2 = asInterface + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (c < 'a') {
                    return true;
                }
            } else if (c < '[') {
                return true;
            }
        }
        if ('a' <= c) {
            int i3 = asInterface + 101;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                if (c < 'p') {
                    return true;
                }
            } else if (c < '{') {
                return true;
            }
        }
        int i4 = onExtraCallback + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private FaceDetectCallBack() {
    }

    @JvmStatic
    public static final boolean onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        for (int i2 = 0; i2 < str.length(); i2++) {
            int i3 = onExtraCallback + 61;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (onExtraCallbackWithResult.onNavigationEvent(str.charAt(i2))) {
                return true;
            }
        }
        int i5 = onExtraCallback + 99;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final boolean IAuthTabCallback(char c) {
        int i = 2 % 2;
        if (Intrinsics.compare(c, (char) Integer.parseInt("AC00", 16)) < 0) {
            return false;
        }
        int i2 = asInterface + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.compare(c, (char) Integer.parseInt("D7A3", 16)) > 0) {
            return false;
        }
        int i4 = onExtraCallback + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static /* synthetic */ boolean onExtraCallback(FaceDetectCallBack faceDetectCallBack, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface + 51;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 103;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 + 119;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        return faceDetectCallBack.IAuthTabCallback(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r12 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r13 = o.FaceDetectCallBack.onExtraCallback + 33;
        r1 = r13 % 128;
        o.FaceDetectCallBack.asInterface = r1;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r12 == 8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        r1 = r1 + 39;
        o.FaceDetectCallBack.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r12 <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallback(@NotNull String str, boolean z) {
        int i;
        int iLastIndexOf$default;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (StringsKt.endsWith$default(str, ')', false, 2, (Object) null)) {
            int i3 = onExtraCallback + 111;
            asInterface = i3 % 128;
            if (i3 % 2 != 0 ? (iLastIndexOf$default = StringsKt.lastIndexOf$default(str, '(', 0, false, 6, (Object) null)) > 0 : (iLastIndexOf$default = StringsKt.lastIndexOf$default(str, '2', 0, false, 23, (Object) null)) > 0) {
                str = str.substring(0, iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
        }
        Character chLastOrNull = StringsKt.lastOrNull(StringsKt.trimEnd(str).toString());
        if (chLastOrNull != null && IAuthTabCallback(chLastOrNull.charValue())) {
            int i4 = asInterface + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            char cCharValue = chLastOrNull.charValue();
            if (i5 != 0) {
                i = (cCharValue >> 44032) >>> 87;
            } else {
                i = (cCharValue - 44032) % 28;
            }
        }
        int i6 = asInterface + 107;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList arrayList = new ArrayList(str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = asInterface + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                char cCharAt = str.charAt(i2);
                onNavigationEvent.containsKey(Character.valueOf(cCharAt));
                Character.valueOf(cCharAt);
                throw null;
            }
            char cCharAt2 = str.charAt(i2);
            HashMap<Character, Character> map = onNavigationEvent;
            boolean zContainsKey = map.containsKey(Character.valueOf(cCharAt2));
            Character chValueOf = Character.valueOf(cCharAt2);
            if (zContainsKey) {
                chValueOf = map.get(chValueOf);
            }
            arrayList.add(chValueOf);
            i2++;
            int i4 = asInterface + 79;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
        }
        return CollectionsKt.joinToString$default(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    static {
        int i = onWarmupCompleted + 31;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        int i4 = onExtraCallback + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        for (char c : charArray) {
            if ((c > '\n' || c > '\r') && c != ' ' && (c < 12593 || c > 12629)) {
                if (c >= 12623) {
                    int i7 = onExtraCallback + 111;
                    asInterface = i7 % 128;
                    if (i7 % 2 == 0) {
                        if (c > 18881) {
                            if (44032 > c || c >= 55216) {
                                i6++;
                            } else {
                                int i8 = asInterface + 113;
                                onExtraCallback = i8 % 128;
                                i6 = (i8 % 2 == 0 ? (c - 44032) % 28 == 0 : (c / 44032) + (-117) == 0) ? i6 + 2 : i6 + 3;
                            }
                        }
                    } else if (c > 12681) {
                    }
                }
            }
        }
        return i6;
    }
}
