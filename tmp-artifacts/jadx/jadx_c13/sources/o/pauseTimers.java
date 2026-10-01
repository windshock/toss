package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pauseTimers implements setPreProgressHundred {
    private int IAuthTabCallback;
    private char[] onNavigationEvent = setDataDirectorySuffix.onWarmupCompleted.onExtraCallback();

    @Override // o.setPreProgressHundred
    public void onExtraCallback(long j) {
        onNavigationEvent(String.valueOf(j));
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(char c) {
        onExtraCallback(1);
        char[] cArr = this.onNavigationEvent;
        int i = this.IAuthTabCallback;
        this.IAuthTabCallback = i + 1;
        cArr[i] = c;
    }

    @Override // o.setPreProgressHundred
    public void onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        if (length == 0) {
            return;
        }
        onExtraCallback(length);
        str.getChars(0, str.length(), this.onNavigationEvent, this.IAuthTabCallback);
        this.IAuthTabCallback += length;
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback(str.length() + 2);
        char[] cArr = this.onNavigationEvent;
        int i = this.IAuthTabCallback;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < PglCryptUtils.onExtraCallback().length && PglCryptUtils.onExtraCallback()[c] != 0) {
                onExtraCallbackWithResult(i4 - i2, i4, str);
                return;
            }
        }
        cArr[i3] = '\"';
        this.IAuthTabCallback = i3 + 1;
    }

    private final void onExtraCallbackWithResult(int i, int i2, String str) {
        byte b;
        int length = str.length();
        while (i < length) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, 2);
            char cCharAt = str.charAt(i);
            if (cCharAt >= PglCryptUtils.onExtraCallback().length || (b = PglCryptUtils.onExtraCallback()[cCharAt]) == 0) {
                this.onNavigationEvent[iOnExtraCallbackWithResult] = cCharAt;
                i2 = iOnExtraCallbackWithResult + 1;
            } else if (b == 1) {
                String str2 = PglCryptUtils.onNavigationEvent()[cCharAt];
                Intrinsics.checkNotNull(str2);
                int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnExtraCallbackWithResult, str2.length());
                str2.getChars(0, str2.length(), this.onNavigationEvent, iOnExtraCallbackWithResult2);
                i2 = iOnExtraCallbackWithResult2 + str2.length();
                this.IAuthTabCallback = i2;
            } else {
                char[] cArr = this.onNavigationEvent;
                cArr[iOnExtraCallbackWithResult] = '\\';
                cArr[iOnExtraCallbackWithResult + 1] = (char) b;
                i2 = iOnExtraCallbackWithResult + 2;
                this.IAuthTabCallback = i2;
            }
            i++;
        }
        int iOnExtraCallbackWithResult3 = onExtraCallbackWithResult(i2, 1);
        this.onNavigationEvent[iOnExtraCallbackWithResult3] = '\"';
        this.IAuthTabCallback = iOnExtraCallbackWithResult3 + 1;
    }

    public void onExtraCallback() {
        setDataDirectorySuffix.onWarmupCompleted.IAuthTabCallback(this.onNavigationEvent);
    }

    public String toString() {
        return new String(this.onNavigationEvent, 0, this.IAuthTabCallback);
    }

    private final void onExtraCallback(int i) {
        onExtraCallbackWithResult(this.IAuthTabCallback, i);
    }

    private final int onExtraCallbackWithResult(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.onNavigationEvent;
        if (cArr.length <= i3) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt___RangesKt.coerceAtLeast(i3, i << 1));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
            this.onNavigationEvent = cArrCopyOf;
        }
        return i;
    }
}
