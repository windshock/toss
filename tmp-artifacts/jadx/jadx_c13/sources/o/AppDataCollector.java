package o;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AppDataCollector {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final char[] IAuthTabCallback;
    private final int onExtraCallback;
    private final Map<Character, Integer> onWarmupCompleted;

    public AppDataCollector(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = 0;
        String string = Character.toString((char) 0);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) string, false, 2, (Object) null)) {
            throw new IllegalArgumentException("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
        }
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        int length = charArray.length;
        this.onExtraCallback = length;
        this.onWarmupCompleted = new HashMap(length);
        int i2 = 2 % 2;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.onWarmupCompleted.put(Character.valueOf(charArray[i3]), Integer.valueOf(i3));
        }
        char[] cArr = new char[(length << 1) + 1];
        this.IAuthTabCallback = cArr;
        cArr[0] = 0;
        int i6 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        while (i < length) {
            int i8 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr2 = this.IAuthTabCallback;
            int i10 = i + 1;
            cArr2[i10] = charArray[i];
            cArr2[length + 1 + i] = charArray[i];
            i = i10;
        }
    }

    public final char[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        char[] cArr = this.IAuthTabCallback;
        int i5 = i3 + 47;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return cArr;
        }
        throw null;
    }

    public final Set<Character> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Set<Character> setKeySet = this.onWarmupCompleted.keySet();
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return setKeySet;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final onWarmupCompleted onNavigationEvent(char c, char c2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(c);
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(c2);
        Object obj = null;
        if (iOnExtraCallbackWithResult >= 0) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 83;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (iOnExtraCallbackWithResult2 >= 0) {
                int i7 = i4 + 55;
                int i8 = i7 % 128;
                onExtraCallbackWithResult = i8;
                if (i7 % 2 != 0) {
                    int i9 = 14 / 0;
                    if (c != 0) {
                        if (c2 != 0) {
                            int i10 = i8 + 19;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (iOnExtraCallbackWithResult2 < iOnExtraCallbackWithResult) {
                                int i11 = this.onExtraCallback;
                                if ((i11 - iOnExtraCallbackWithResult) + iOnExtraCallbackWithResult2 < iOnExtraCallbackWithResult - iOnExtraCallbackWithResult2) {
                                    iOnExtraCallbackWithResult2 += i11;
                                }
                            }
                        }
                    }
                } else if (c != 0) {
                }
                return new onWarmupCompleted(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
            }
        }
        int i12 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if ((!r4.onWarmupCompleted.containsKey(java.lang.Character.valueOf(r5))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r5 = o.AppDataCollector.onExtraCallbackWithResult + 49;
        o.AppDataCollector.onNavigationEvent = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r5 = r4.onWarmupCompleted.get(java.lang.Character.valueOf(r5));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return r5.intValue() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 89;
        o.AppDataCollector.onNavigationEvent = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r2 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int onExtraCallbackWithResult(char c) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            int i4 = 93 / 0;
        }
    }

    public final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final int onExtraCallback;
        private final int onWarmupCompleted;

        public onWarmupCompleted(int i, int i2) {
            this.onWarmupCompleted = i;
            this.onExtraCallback = i2;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onWarmupCompleted;
            int i6 = i2 + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int onNavigationEvent() {
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                i = this.onExtraCallback;
                int i5 = 19 / 0;
            } else {
                i = this.onExtraCallback;
            }
            int i6 = i3 + 105;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 39 / 0;
            }
            return i;
        }
    }
}
