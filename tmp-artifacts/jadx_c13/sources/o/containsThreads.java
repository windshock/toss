package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class containsThreads {
    private static final int[] onExtraCallback = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
    private static final int[] IAuthTabCallback = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] onExtraCallbackWithResult = {3, 6};
    private static final int[] onNavigationEvent = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallbackDefault(char c) {
        return c == 'T' || c == 't';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback_Parcel(char c) {
        return c == ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean access000(char c) {
        return c == ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBinder(char c) {
        return c == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asInterface(char c) {
        return '0' <= c && c < ':';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTransact(char c) {
        return c == '-';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onWarmupCompleted(setRevisionBytes setrevisionbytes) throws IOException {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        getArchValue getarchvalueOnExtraCallback = getArchValue.Companion.onExtraCallback(setrevisionbytes);
        int iIAuthTabCallbackDefault = getarchvalueOnExtraCallback.IAuthTabCallbackDefault();
        int i = 0;
        if (Math.abs(iIAuthTabCallbackDefault) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (iIAuthTabCallbackDefault >= 0) {
                sb2.append(iIAuthTabCallbackDefault + 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(0), "");
            } else {
                sb2.append(iIAuthTabCallbackDefault - 10000);
                Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(1), "");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (iIAuthTabCallbackDefault >= 10000) {
                sb.append('+');
            }
            sb.append(iIAuthTabCallbackDefault);
        }
        sb.append('-');
        IAuthTabCallback(sb, sb, getarchvalueOnExtraCallback.IAuthTabCallback());
        sb.append('-');
        IAuthTabCallback(sb, sb, getarchvalueOnExtraCallback.onExtraCallback());
        sb.append('T');
        IAuthTabCallback(sb, sb, getarchvalueOnExtraCallback.onExtraCallbackWithResult());
        sb.append(':');
        IAuthTabCallback(sb, sb, getarchvalueOnExtraCallback.onWarmupCompleted());
        sb.append(':');
        IAuthTabCallback(sb, sb, getarchvalueOnExtraCallback.IAuthTabCallbackStub());
        if (getarchvalueOnExtraCallback.onNavigationEvent() != 0) {
            sb.append('.');
            while (true) {
                int iOnNavigationEvent = getarchvalueOnExtraCallback.onNavigationEvent();
                iArr = onExtraCallback;
                int i2 = i + 1;
                if (iOnNavigationEvent % iArr[i2] != 0) {
                    break;
                }
                i = i2;
            }
            int i3 = i - (i % 3);
            String strValueOf = String.valueOf((getarchvalueOnExtraCallback.onNavigationEvent() / iArr[i3]) + iArr[9 - i3]);
            Intrinsics.checkNotNull(strValueOf, "");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }

    private static final void IAuthTabCallback(Appendable appendable, StringBuilder sb, int i) throws IOException {
        if (i < 10) {
            appendable.append('0');
        }
        sb.append(i);
    }
}
