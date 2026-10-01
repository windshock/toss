package o;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import java.text.BreakIterator;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.checkEyeBlink;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkEyeBlink {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final checkEyeBlink onExtraCallbackWithResult = new checkEyeBlink();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 7;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i3 | i5);
        int i12 = (~(i5 | i3)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i4 + i + ((-1422066268) * i6) + ((-2108786386) * i2);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i3) + 967573504 + (322476998 * i4) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i) + ((-1298137088) * i6) + (1722810368 * i2) + (518782976 * i14);
        int i16 = (i3 * 793895740) + 1353643607 + (i4 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i * 793896001) + (i6 * 692483748) + (i2 * (-1016611666)) + (i14 * 166461440);
        return i15 + ((i16 * i16) * 1997799424) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ String IAuthTabCallback(BreakIterator breakIterator, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(breakIterator, str);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return strAsInterface;
    }

    public static /* synthetic */ String onNavigationEvent(BreakIterator breakIterator, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(breakIterator, str);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        int i5 = onWarmupCompleted + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return strOnExtraCallback;
    }

    private checkEyeBlink() {
    }

    public final String onExtraCallbackWithResult(@NotNull String str) {
        int length;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        String strOnNavigationEvent = Cookies_flush.onNavigationEvent(str);
        Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent, "");
        Iterator itIAuthTabCallback = StringsKt.splitToSequence$default(strOnNavigationEvent, new String[]{"-"}, false, 0, 6, (Object) null).IAuthTabCallback();
        int i2 = 0;
        while (itIAuthTabCallback.hasNext()) {
            int i3 = IAuthTabCallback + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                itIAuthTabCallback.next();
                throw null;
            }
            Object next = itIAuthTabCallback.next();
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) next;
            if (i2 > 0) {
                sb.append("-");
                int i4 = IAuthTabCallback + 61;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = 1;
            if (i2 == 1) {
                int i7 = IAuthTabCallback + 75;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    length = str2.length();
                } else {
                    length = str2.length();
                    i6 = 0;
                }
                while (i6 < length) {
                    int i8 = onWarmupCompleted + 89;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        sb.append("*");
                        i6 += 50;
                    } else {
                        sb.append("*");
                        i6++;
                    }
                }
            } else {
                sb.append(str2);
            }
            i2++;
        }
        return sb.toString();
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Lazy lazy = (Lazy) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) lazy.getValue();
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    private static final String onExtraCallback(BreakIterator breakIterator, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        checkEyeBlink checkeyeblink = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(breakIterator);
        String strOnExtraCallbackWithResult = checkeyeblink.onExtraCallbackWithResult(breakIterator, str);
        int i4 = onWarmupCompleted + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    private static final String asInterface(BreakIterator breakIterator, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        checkEyeBlink checkeyeblink = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(breakIterator);
        String strOnWarmupCompleted = checkeyeblink.onWarmupCompleted(breakIterator, str);
        int i4 = IAuthTabCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Lazy lazy = (Lazy) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) lazy.getValue();
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    @JvmStatic
    public static final String onWarmupCompleted(@NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        final BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int iOnExtraCallback = extractConfidence.onExtraCallback(str);
        if (iOnExtraCallback <= 1) {
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.utils.MaskingUtils$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 73;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                String strOnNavigationEvent = checkEyeBlink.onNavigationEvent(characterInstance, str);
                int i7 = onNavigationEvent + 117;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return strOnNavigationEvent;
            }
        });
        Lazy lazyOnExtraCallbackWithResult2 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.utils.MaskingUtils$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                String strIAuthTabCallback = checkEyeBlink.IAuthTabCallback(characterInstance, str);
                int i7 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return strIAuthTabCallback;
            }
        });
        if (iOnExtraCallback == 2) {
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            String str2 = ((String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1937521793, -1937521793, iOnExtraCallback2, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{lazyOnExtraCallbackWithResult})) + "*";
            int i4 = onWarmupCompleted + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            return str2;
        }
        if (iOnExtraCallback == 3) {
            int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            String str3 = (String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1937521793, -1937521793, iOnExtraCallback3, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{lazyOnExtraCallbackWithResult});
            int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            return str3 + "*" + ((String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1663117607, 1663117608, iOnExtraCallback4, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{lazyOnExtraCallbackWithResult2}));
        }
        if (iOnExtraCallback == 4) {
            int iOnExtraCallback5 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            String str4 = (String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1937521793, -1937521793, iOnExtraCallback5, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{lazyOnExtraCallbackWithResult});
            int iOnExtraCallback6 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
            return str4 + "**" + ((String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1663117607, 1663117608, iOnExtraCallback6, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{lazyOnExtraCallbackWithResult2}));
        }
        checkEyeBlink checkeyeblink = onExtraCallbackWithResult;
        if (checkeyeblink.onExtraCallbackWithResult((CharSequence) StringsKt.take(str, 2)) && checkeyeblink.onExtraCallbackWithResult((CharSequence) StringsKt.takeLast(str, 2))) {
            return StringsKt.take(str, 2) + StringsKt.repeat("*", iOnExtraCallback - 4) + StringsKt.takeLast(str, 2);
        }
        StringBuilder sb = new StringBuilder();
        int iOnExtraCallback7 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        sb.append((String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1937521793, -1937521793, iOnExtraCallback7, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{lazyOnExtraCallbackWithResult}));
        sb.append(StringsKt.repeat("*", iOnExtraCallback - 2));
        int iOnExtraCallback8 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        sb.append((String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1663117607, 1663117608, iOnExtraCallback8, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{lazyOnExtraCallbackWithResult2}));
        return sb.toString();
    }

    public final String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (i3 < 3) {
                int i4 = IAuthTabCallback + 31;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    sb.append(cCharAt);
                    int i5 = 56 / 0;
                } else {
                    sb.append(cCharAt);
                }
            } else if (i3 < 7) {
                int i6 = IAuthTabCallback + 47;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                sb.append("*");
            } else if (i3 >= length - 4) {
                sb.append(cCharAt);
            } else {
                sb.append("*");
                int i8 = onWarmupCompleted + 43;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            i2++;
            i3++;
        }
        return sb.toString();
    }

    private final boolean onExtraCallbackWithResult(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            int i5 = onWarmupCompleted + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!FaceDetectCallBack.onExtraCallbackWithResult.onNavigationEvent(charSequence.charAt(i4))) {
                int i7 = IAuthTabCallback + 81;
                onWarmupCompleted = i7 % 128;
                return i7 % 2 == 0;
            }
        }
        return true;
    }

    private final String onExtraCallbackWithResult(BreakIterator breakIterator, String str) {
        int i = 2 % 2;
        int iFirst = breakIterator.first();
        int next = breakIterator.next();
        Object obj = null;
        if (next == -1) {
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "";
            }
            obj.hashCode();
            throw null;
        }
        String strSubstring = str.substring(iFirst, next);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        int i3 = IAuthTabCallback + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return strSubstring;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r6 = r7.substring(r6, r1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
        r7 = o.checkEyeBlink.onWarmupCompleted + 103;
        o.checkEyeBlink.IAuthTabCallback = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if ((r7 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r7 = 80 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r6 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r6 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onWarmupCompleted(BreakIterator breakIterator, String str) {
        int iLast;
        int iPrevious;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            iLast = breakIterator.last();
            iPrevious = breakIterator.previous();
            int i3 = 74 / 0;
        } else {
            iLast = breakIterator.last();
            iPrevious = breakIterator.previous();
        }
    }

    private static final String onExtraCallbackWithResult(Lazy<String> lazy) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (String) IAuthTabCallback(iOnExtraCallback2, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1937521793, -1937521793, iOnExtraCallback, iOnExtraCallback3, new Object[]{lazy});
    }

    private static final String IAuthTabCallback(Lazy<String> lazy) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (String) IAuthTabCallback(iOnExtraCallback2, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1663117607, 1663117608, iOnExtraCallback, iOnExtraCallback3, new Object[]{lazy});
    }
}
