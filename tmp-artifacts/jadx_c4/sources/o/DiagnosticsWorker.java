package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DiagnosticsWorker {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final TTBaseLandingPageActivity IAuthTabCallback;
    private final String onNavigationEvent;
    private final IAuthTabCallback onWarmupCompleted;

    public DiagnosticsWorker(@NotNull String str, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onNavigationEvent = str;
        this.IAuthTabCallback = tTBaseLandingPageActivity;
        this.onWarmupCompleted = iAuthTabCallback;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final TTBaseLandingPageActivity onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        TTBaseLandingPageActivity tTBaseLandingPageActivity = this.IAuthTabCallback;
        int i5 = i3 + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return tTBaseLandingPageActivity;
    }

    public final IAuthTabCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        int i5 = i3 + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return iAuthTabCallback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull String str, @NotNull byte[] bArr, @NotNull IAuthTabCallback iAuthTabCallback) {
        this(str, TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(TTBaseLandingPageActivity.Companion, bArr, 0, 0, 3, (Object) null), iAuthTabCallback);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final IAuthTabCallback NONE = new IAuthTabCallback("NONE", 0);
        public static final IAuthTabCallback GZIP = new IAuthTabCallback("GZIP", 1);
        public static final IAuthTabCallback ZSTD = new IAuthTabCallback("ZSTD", 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {NONE, GZIP, ZSTD};
            int i5 = i2 + 11;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 60 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 == 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            int i4 = 92 / 0;
            return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 77;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
