package o;

import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MaxRewardedAdImpl;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRewardedAdImpl implements MaxRewardedAdImplb {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Lazy IAuthTabCallback;
    private final Context onExtraCallbackWithResult;

    static {
        int i = onWarmupCompleted + 59;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ SharedPreferences onNavigationEvent(MaxRewardedAdImpl maxRewardedAdImpl) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferencesOnExtraCallbackWithResult = onExtraCallbackWithResult(maxRewardedAdImpl);
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return sharedPreferencesOnExtraCallbackWithResult;
    }

    @Inject
    public MaxRewardedAdImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.bundle.crash.BundleCrashHistoryImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                SharedPreferences sharedPreferencesOnNavigationEvent = MaxRewardedAdImpl.onNavigationEvent(this.f$0);
                int i4 = onExtraCallback + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return sharedPreferencesOnNavigationEvent;
            }
        });
    }

    @Override // o.MaxRewardedAdImplb
    public /* bridge */ boolean onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = super.onExtraCallback(str, str2, str3, str4, i);
        int i5 = onNavigationEvent + 121;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
        return zOnExtraCallback;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private final SharedPreferences onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        SharedPreferences sharedPreferences = (SharedPreferences) value;
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return sharedPreferences;
    }

    private static final SharedPreferences onExtraCallbackWithResult(MaxRewardedAdImpl maxRewardedAdImpl) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Context context = maxRewardedAdImpl.onExtraCallbackWithResult;
        SharedPreferences sharedPreferences = i3 == 0 ? context.getSharedPreferences("bundle_crash_history", 1) : context.getSharedPreferences("bundle_crash_history", 0);
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return sharedPreferences;
    }

    private final String onNavigationEvent(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        String str5 = "crash_count_" + str2 + "_" + str3 + "_" + str + "_" + str4;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str5;
        }
        throw null;
    }

    @Override // o.MaxRewardedAdImplb
    public int IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        String strOnNavigationEvent;
        SharedPreferences sharedPreferencesOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            strOnNavigationEvent = onNavigationEvent(str, str2, str3, str4);
            sharedPreferencesOnExtraCallbackWithResult = onExtraCallbackWithResult();
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            strOnNavigationEvent = onNavigationEvent(str, str2, str3, str4);
            sharedPreferencesOnExtraCallbackWithResult = onExtraCallbackWithResult();
            i = 0;
        }
        return sharedPreferencesOnExtraCallbackWithResult.getInt(strOnNavigationEvent, i);
    }

    @Override // o.MaxRewardedAdImplb
    public void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String strOnNavigationEvent = onNavigationEvent(str, str2, str3, str4);
        int i4 = onExtraCallbackWithResult().getInt(strOnNavigationEvent, 0);
        SharedPreferences.Editor editorEdit = onExtraCallbackWithResult().edit();
        editorEdit.putInt(strOnNavigationEvent, i4 + 1);
        editorEdit.apply();
        int i5 = onExtraCallback + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.MaxRewardedAdImplb
    public void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String strOnNavigationEvent = onNavigationEvent(str, str2, str3, str4);
        SharedPreferences.Editor editorEdit = onExtraCallbackWithResult().edit();
        editorEdit.remove(strOnNavigationEvent);
        editorEdit.apply();
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.MaxRewardedAdImplb
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorEdit = onExtraCallbackWithResult().edit();
        editorEdit.clear();
        editorEdit.apply();
        int i4 = onNavigationEvent + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
