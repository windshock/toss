package o;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambda8ktL7VgKDquhCIJdgkcD1wC4ukI implements clampToInt {
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final Context onNavigationEvent;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public r8lambda8ktL7VgKDquhCIJdgkcD1wC4ukI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = context;
    }

    private final SharedPreferences onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = this.onNavigationEvent.getSharedPreferences("pref.uikit.configuration", 0);
        int i4 = onExtraCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return sharedPreferences;
        }
        throw null;
    }

    public void onExtraCallback(@NotNull maxAge maxage) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(maxage, "");
        SharedPreferences.Editor editorEdit = onWarmupCompleted().edit();
        int i5 = onExtraCallbackWithResult.onExtraCallback[maxage.ordinal()];
        if (i5 != 1) {
            int i6 = onExtraCallback;
            int i7 = i6 + 53;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (i5 != 2) {
                int i9 = i6 + 7;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i11 = i6 + 103;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            } else {
                i = 1;
            }
        } else {
            int i13 = onExtraCallback + 115;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            i = 0;
        }
        editorEdit.putInt("pref.uikit.key.hapticSetting", i).apply();
    }

    public maxAge onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted().getInt("pref.uikit.key.hapticSetting", 2);
        if (i2 == 0) {
            maxAge maxage = maxAge.On;
            int i3 = onWarmupCompleted + 3;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return maxage;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 != 1) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0 ? i2 == 2 : i2 == 4) {
                return maxAge.System;
            }
            int i6 = i4 + 17;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return maxAge.System;
        }
        return maxAge.Off;
    }

    public void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted().edit().putFloat("pref.uikit.key.hapticVolume", f).apply();
            return;
        }
        onWarmupCompleted().edit().putFloat("pref.uikit.key.hapticVolume", f).apply();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float f = onWarmupCompleted().getFloat("pref.uikit.key.hapticVolume", 1.0f);
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
