package o;

import android.net.Uri;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetSslSocketFactoryOrNullp {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static final Regex onWarmupCompleted = new Regex(".*(icon|icn).*[_-]mono($|\\..*)");
    private static final Regex IAuthTabCallback = new Regex(".*(icon|icn).*[_-]system[_-].*");

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (onExtraCallbackWithResult(r6, r7) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onWarmupCompleted(@NotNull OkHttp okHttp, @Nullable String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (str != null && onNavigationEvent(str)) {
            int i5 = IAuthTabCallbackStub + 113;
            onExtraCallbackWithResult = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
                if (!onWarmupCompleted.onExtraCallbackWithResult(str)) {
                    int i7 = IAuthTabCallbackStub + 57;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        onExtraCallbackWithResult(okHttp, str);
                        obj.hashCode();
                        throw null;
                    }
                }
                i = onExtraCallbackWithResult + 89;
                IAuthTabCallbackStub = i % 128;
                if (i % 2 == 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            }
            if (!onWarmupCompleted.onExtraCallbackWithResult(str)) {
            }
            i = onExtraCallbackWithResult + 89;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
            }
        }
        return false;
    }

    public static final boolean IAuthTabCallback(@NotNull OkHttp okHttp, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (str == null) {
            return false;
        }
        if (!IAuthTabCallback(onExtraCallbackWithResult(str))) {
            int i4 = onExtraCallbackWithResult + 57;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback(okHttp, str);
                throw null;
            }
            if (!onExtraCallback(okHttp, str)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull OkHttp okHttp, @Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (str == null || (!onNavigationEvent(str))) {
            return false;
        }
        int i4 = IAuthTabCallbackStub + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return IAuthTabCallback.onExtraCallbackWithResult(str);
    }

    public static final boolean onExtraCallback(@NotNull OkHttp okHttp, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (str != null) {
            return onWarmupCompleted(onExtraCallbackWithResult(str));
        }
        int i3 = onExtraCallbackWithResult + 75;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private static final boolean onNavigationEvent(String str) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Uri.parse(str).getHost());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return true;
        }
        int i2 = IAuthTabCallbackStub + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.areEqual(CollectionsKt.takeLast(StringsKt.split$default(lowerCase, new char[]{'.'}, false, 0, 6, (Object) null), 2), CollectionsKt.listOf(new String[]{"toss", "im"}))) {
            int i4 = IAuthTabCallbackStub + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallbackStub + 33;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private static final String onExtraCallbackWithResult(String str) {
        String strSubstringBeforeLast$default;
        char c;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            strSubstringBeforeLast$default = StringsKt.substringBeforeLast$default(str, '=', (String) null, 3, (Object) null);
            c = 'L';
        } else {
            strSubstringBeforeLast$default = StringsKt.substringBeforeLast$default(str, '.', (String) null, 2, (Object) null);
            c = '/';
        }
        return StringsKt.substringAfterLast$default(strSubstringBeforeLast$default, c, (String) null, 2, (Object) null);
    }

    static {
        int i = onNavigationEvent + 59;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private static final boolean IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return StringsKt.endsWith$default(str, "_mono", false, 2, (Object) null);
    }

    private static final boolean onWarmupCompleted(String str) {
        int i = 2 % 2;
        if (!StringsKt.contains$default(str, "_system_", false, 2, (Object) null)) {
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0 ? !StringsKt.contains$default(str, "-system-", false, 2, (Object) null) : !StringsKt.contains$default(str, "-system-", true, 4, (Object) null)) {
                int i3 = onExtraCallbackWithResult + 67;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
        }
        int i5 = IAuthTabCallbackStub + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
