package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_followSslRedirects {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ deprecated_followRedirects onWarmupCompleted(String str, Context context, deprecated_callTimeoutMillis deprecated_calltimeoutmillis, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0 ? (i & 4) != 0 : (i & 4) != 0) {
            deprecated_calltimeoutmillis = deprecated_callTimeoutMillis.Companion.onWarmupCompleted();
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return onNavigationEvent(str, context, deprecated_calltimeoutmillis);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (r10 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        r9 = new o.accessgetDEFAULT_PROTOCOLScp(r10);
        r10 = o.deprecated_followSslRedirects.onExtraCallbackWithResult + 95;
        o.deprecated_followSslRedirects.onWarmupCompleted = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        r9 = null;
        r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        return o.deprecated_authenticator.onNavigationEvent(r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (r10 != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects onNavigationEvent(@NotNull String str, @Nullable Context context, @NotNull deprecated_callTimeoutMillis deprecated_calltimeoutmillis) {
        int identifier;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deprecated_calltimeoutmillis, "");
        if (context == null) {
            return deprecated_authenticator.onNavigationEvent(str, deprecated_calltimeoutmillis);
        }
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            String strReplace$default = StringsKt.replace$default(str, "-", "_", true, 2, (Object) null);
            Context applicationContext = context.getApplicationContext();
            identifier = applicationContext.getResources().getIdentifier(strReplace$default, "drawable", applicationContext.getPackageName());
        } else {
            String strReplace$default2 = StringsKt.replace$default(str, "-", "_", false, 4, (Object) null);
            Context applicationContext2 = context.getApplicationContext();
            identifier = applicationContext2.getResources().getIdentifier(strReplace$default2, "drawable", applicationContext2.getPackageName());
        }
    }

    public static final deprecated_followRedirects onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        accessgetDEFAULT_PROTOCOLScp accessgetdefault_protocolscp = new accessgetDEFAULT_PROTOCOLScp(i);
        int i3 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return accessgetdefault_protocolscp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final deprecated_followRedirects onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!deprecated_callTimeoutMillis.Companion.onExtraCallbackWithResult().onExtraCallbackWithResult(str))) {
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return deprecated_authenticator.onExtraCallback(str);
        }
        verifyClientState verifyclientstateOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted(str);
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return verifyclientstateOnWarmupCompleted;
        }
        throw null;
    }

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        deprecated_connectionPool deprecated_connectionpool = new deprecated_connectionPool(deprecated_authenticator.onExtraCallback(str), deprecated_authenticator.onExtraCallback(str2));
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return deprecated_connectionpool;
    }
}
