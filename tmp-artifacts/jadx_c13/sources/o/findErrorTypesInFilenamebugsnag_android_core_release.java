package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class findErrorTypesInFilenamebugsnag_android_core_release implements setThreads {
    private static final findErrorTypesForEventbugsnag_android_core_release onNavigationEvent = findErrorTypesForEventbugsnag_android_core_release.IAuthTabCallback(Collections.EMPTY_LIST);
    private final List<String> onWarmupCompleted = new ArrayList();
    int onExtraCallbackWithResult = 0;

    private static boolean onExtraCallback(char c) {
        return c < '0' || c > '9';
    }

    static getUserImplbugsnag_android_core_release onWarmupCompleted() {
        return onNavigationEvent;
    }

    findErrorTypesInFilenamebugsnag_android_core_release() {
    }

    @Override // o.setThreads
    public setThreads onExtraCallbackWithResult(String str, String str2) {
        if (onExtraCallbackWithResult(str) && onExtraCallback(str2) && this.onExtraCallbackWithResult < 32) {
            int i = 0;
            while (true) {
                if (i < this.onWarmupCompleted.size()) {
                    if (this.onWarmupCompleted.get(i).equals(str)) {
                        int i2 = i + 1;
                        String str3 = this.onWarmupCompleted.get(i2);
                        this.onWarmupCompleted.set(i2, str2);
                        if (str3 == null) {
                            this.onExtraCallbackWithResult++;
                            return this;
                        }
                    } else {
                        i += 2;
                    }
                } else {
                    this.onWarmupCompleted.add(str);
                    this.onWarmupCompleted.add(str2);
                    this.onExtraCallbackWithResult++;
                    break;
                }
            }
        }
        return this;
    }

    @Override // o.setThreads
    public getUserImplbugsnag_android_core_release onExtraCallbackWithResult() {
        if (this.onExtraCallbackWithResult == 0) {
            return onWarmupCompleted();
        }
        if (this.onWarmupCompleted.size() == 2) {
            return findErrorTypesForEventbugsnag_android_core_release.IAuthTabCallback(new ArrayList(this.onWarmupCompleted));
        }
        String[] strArr = new String[this.onExtraCallbackWithResult << 1];
        int i = 0;
        for (int size = this.onWarmupCompleted.size() - 2; size >= 0; size -= 2) {
            String str = this.onWarmupCompleted.get(size);
            String str2 = this.onWarmupCompleted.get(size + 1);
            if (str2 != null) {
                strArr[i] = str;
                strArr[i + 1] = str2;
                i += 2;
            }
        }
        return findErrorTypesForEventbugsnag_android_core_release.IAuthTabCallback(Arrays.asList(strArr));
    }

    private static boolean onExtraCallbackWithResult(@Nullable String str) {
        int length;
        if (str == null || str.length() > 256 || str.isEmpty() || onWarmupCompleted(str.charAt(0))) {
            return false;
        }
        boolean z = false;
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (onNavigationEvent(cCharAt)) {
                return false;
            }
            if (cCharAt == '@') {
                if (z || i > 240 || (length = (str.length() - i) - 1) > 13 || length == 0) {
                    return false;
                }
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return onExtraCallback(str.charAt(0));
    }

    private static boolean onNavigationEvent(char c) {
        return (!onWarmupCompleted(c) || c == '_' || c == '-' || c == '@' || c == '*' || c == '/') ? false : true;
    }

    private static boolean onWarmupCompleted(char c) {
        return (c < 'a' || c > 'z') && onExtraCallback(c);
    }

    private static boolean onExtraCallback(@Nullable String str) {
        if (ErrorTypes.onNavigationEvent(str) || str.length() > 256 || str.charAt(str.length() - 1) == ' ') {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ',' || cCharAt == '=' || cCharAt < ' ' || cCharAt > '~') {
                return false;
            }
        }
        return true;
    }
}
