package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CacheCompanion {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ Integer onNavigationEvent(getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Integer numIAuthTabCallback = IAuthTabCallback(getspecialfeatureoptinstatus, str);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return numIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Integer onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(str);
            throw null;
        }
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i3 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return numOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Integer IAuthTabCallback(getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, String str) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CipherSuiteCompanion cipherSuiteCompanionOnExtraCallback = onExtraCallback(str);
        Object obj = null;
        if (cipherSuiteCompanionOnExtraCallback == null) {
            return null;
        }
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int iOnNavigationEvent = cipherSuiteCompanionOnExtraCallback.onNavigationEvent(getspecialfeatureoptinstatus);
        if (i5 != 0) {
            Integer.valueOf(iOnNavigationEvent);
            obj.hashCode();
            throw null;
        }
        Integer numValueOf = Integer.valueOf(iOnNavigationEvent);
        int i6 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return numValueOf;
    }

    private static final CipherSuiteCompanion onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!StringsKt.startsWith$default(str, "color.", false, 2, (Object) null)) {
            return null;
        }
        Pair<String, getSpecialFeatureOptInStatus> pairOnNavigationEvent = onNavigationEvent(str);
        String str2 = (String) pairOnNavigationEvent.onExtraCallbackWithResult();
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = (getSpecialFeatureOptInStatus) pairOnNavigationEvent.IAuthTabCallback();
        CipherSuiteCompanion cipherSuiteCompanion = matchesHostname.onWarmupCompleted().get(str2);
        if (cipherSuiteCompanion == null || getspecialfeatureoptinstatus == null) {
            int i4 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return cipherSuiteCompanion;
        }
        deprecated_javaName deprecated_javaname = new deprecated_javaName(cipherSuiteCompanion.onNavigationEvent(getspecialfeatureoptinstatus));
        int i6 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return deprecated_javaname;
    }

    private static final Pair<String, getSpecialFeatureOptInStatus> onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0 ? StringsKt.endsWith$default(str, ".light", false, 2, (Object) null) : StringsKt.endsWith$default(str, ".light", false, 2, (Object) null)) {
            int i3 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return getWrite.IAuthTabCallback(StringsKt.removeSuffix(str, ".light"), getSpecialFeatureOptInStatus.Light);
        }
        if (!StringsKt.endsWith$default(str, ".dark", false, 2, (Object) null)) {
            return getWrite.IAuthTabCallback(str, (Object) null);
        }
        int i5 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return getWrite.IAuthTabCallback(StringsKt.removeSuffix(str, ".dark"), getSpecialFeatureOptInStatus.Dark);
        }
        getWrite.IAuthTabCallback(StringsKt.removeSuffix(str, ".dark"), getSpecialFeatureOptInStatus.Dark);
        obj.hashCode();
        throw null;
    }

    private static final Integer IAuthTabCallback(String str) {
        Object obj;
        ArrayList arrayList;
        int size;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            String strSubstring = str.substring(str.charAt(3) == 'a' ? 5 : 4, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            List listSplit$default = StringsKt.split$default(strSubstring, new char[]{','}, false, 0, 6, (Object) null);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (!(!it.hasNext())) {
                arrayList.add(StringsKt.trim((String) it.next()).toString());
            }
            size = arrayList.size();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (3 > size || size >= 5) {
            return null;
        }
        obj = Result.constructor-impl(Integer.valueOf((RangesKt.coerceIn((int) ((arrayList.size() == 4 ? Float.parseFloat((String) arrayList.get(3)) : 1.0f) * 255.0f), 0, 255) << 24) | (Integer.parseInt((String) arrayList.get(0)) << 16) | (Integer.parseInt((String) arrayList.get(1)) << 8) | Integer.parseInt((String) arrayList.get(2))));
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r0 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r9 = r9.toString();
        r1 = r9.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if ('-' != r9.charAt(0)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r2 = -1;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r4 = 0;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r8 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if ('0' != r9.charAt(r4)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r6 = o.CacheCompanion.onExtraCallbackWithResult + 9;
        o.CacheCompanion.onNavigationEvent = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r4 != (r1 - 1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r1 = r4 + 1;
        r3 = r9.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if ('x' == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        r5 = o.CacheCompanion.onNavigationEvent + 121;
        o.CacheCompanion.onExtraCallbackWithResult = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if ((r5 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if ('@' == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if ('X' == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        r8 = 8;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r4 = r4 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if ('#' != r9.charAt(r4)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        r1 = o.CacheCompanion.onNavigationEvent + 113;
        o.CacheCompanion.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        r8 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r9 = r9.substring(r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(r9, kotlin.text.CharsKt.IAuthTabCallback(r8)) * r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 33;
        o.CacheCompanion.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Integer onExtraCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r5, "rgb", false, 2, (java.lang.Object) null) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r5 = IAuthTabCallback(r5);
        r1 = o.CacheCompanion.onNavigationEvent + 85;
        o.CacheCompanion.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (kotlin.text.StringsKt.startsWith(r5, "0x", true) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r5, '#', false, 2, (java.lang.Object) null) == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r5.length() <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r1 = o.CacheCompanion.onExtraCallbackWithResult + 99;
        o.CacheCompanion.onNavigationEvent = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (java.lang.Character.isLetter(r5.charAt(0)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (java.lang.Character.isLetter(r5.charAt(0)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        return java.lang.Integer.valueOf(android.graphics.Color.parseColor(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return onExtraCallback((java.lang.CharSequence) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r5.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r5.length() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Integer onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
    }
}
