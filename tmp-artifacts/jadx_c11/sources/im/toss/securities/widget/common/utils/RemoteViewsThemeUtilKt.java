package im.toss.securities.widget.common.utils;

import android.content.Context;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.ByteOrderedDataOutputStream;
import o.CipherSuiteCompanion;
import o.getMaxAdCount;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RemoteViewsThemeUtilKt {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class WhenMappings {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;

        static {
            int[] iArr = new int[DisplaySetting.values().length];
            try {
                iArr[DisplaySetting.LIGHT.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySetting.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySetting.SYSTEM.ordinal()] = 3;
                int i4 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
        }
    }

    public static /* synthetic */ long IAuthTabCallback(CipherSuiteCompanion cipherSuiteCompanion, Context context, DisplaySetting displaySetting, Float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 73;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            int i5 = i4 + 3;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            f = null;
        }
        return IAuthTabCallback(cipherSuiteCompanion, context, displaySetting, f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long IAuthTabCallback(@NotNull CipherSuiteCompanion cipherSuiteCompanion, @NotNull Context context, @NotNull DisplaySetting displaySetting, @Nullable Float f) throws NoWhenBranchMatchedException {
        int iIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cipherSuiteCompanion, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(displaySetting, "");
        int i2 = WhenMappings.onExtraCallback[displaySetting.ordinal()];
        if (i2 == 1) {
            iIAuthTabCallback = cipherSuiteCompanion.IAuthTabCallback();
        } else if (i2 != 2) {
            int i3 = onWarmupCompleted + 113;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 != 0 ? i2 != 3 : i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = i4 + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                int i7 = onWarmupCompleted + 59;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                iIAuthTabCallback = cipherSuiteCompanion.onExtraCallbackWithResult();
            } else {
                iIAuthTabCallback = cipherSuiteCompanion.IAuthTabCallback();
            }
        } else {
            iIAuthTabCallback = cipherSuiteCompanion.onExtraCallbackWithResult();
        }
        long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(iIAuthTabCallback);
        return f != null ? getMaxAdCount.onExtraCallbackWithResult(jOnExtraCallback, f.floatValue()) : jOnExtraCallback;
    }
}
