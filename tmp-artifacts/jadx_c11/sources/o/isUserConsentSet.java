package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface isUserConsentSet {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onWarmupCompleted;

    void onNavigationEvent(@NotNull String str, @Nullable String str2, @Nullable Throwable th, @Nullable Map<String, ? extends Object> map, @Nullable String str3, boolean z);

    void onNavigationEvent(@NotNull String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, @Nullable String str3, boolean z);

    static /* synthetic */ void onExtraCallbackWithResult(isUserConsentSet isuserconsentset, String str, String str2, Map map, String str3, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        String str4 = (i & 2) != 0 ? null : str2;
        Map map2 = (i & 4) != 0 ? null : map;
        String str5 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            z = false;
        }
        isuserconsentset.onNavigationEvent(str, str4, map2, str5, z);
    }

    static /* synthetic */ void onNavigationEvent(isUserConsentSet isuserconsentset, String str, String str2, Throwable th, Map map, String str3, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        isuserconsentset.onNavigationEvent(str, str2, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
    }

    public static final class onExtraCallbackWithResult {
        private static int asInterface = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();
        private static final isUserConsentSet IAuthTabCallback = new onWarmupCompleted();

        public static final class onWarmupCompleted implements isUserConsentSet {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // o.isUserConsentSet
            public void onNavigationEvent(String str, String str2, Throwable th, Map<String, ? extends Object> map, String str3, boolean z) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                int i4 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 25 / 0;
                }
            }

            @Override // o.isUserConsentSet
            public void onNavigationEvent(String str, String str2, Map<String, ? extends Object> map, String str3, boolean z) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                int i4 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }

            onWarmupCompleted() {
            }
        }

        private onExtraCallbackWithResult() {
        }

        static {
            int i = onNavigationEvent + 115;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public final isUserConsentSet IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            isUserConsentSet isuserconsentset = IAuthTabCallback;
            int i5 = i2 + 85;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return isuserconsentset;
        }
    }
}
