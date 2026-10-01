package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdViewAdCollapsed {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private String onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i2 + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i2 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return z;
    }

    public final void onNavigationEvent(@Nullable String str, boolean z, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.onWarmupCompleted = z;
            if (!z) {
                if (str == null) {
                    str = str2;
                }
                this.onExtraCallbackWithResult = str;
                return;
            } else {
                this.onExtraCallbackWithResult = null;
                int i4 = i2 + 95;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        this.onWarmupCompleted = z;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = str;
        if (str != null) {
            int i5 = i3 + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                this.onWarmupCompleted = true;
            } else {
                this.onWarmupCompleted = false;
            }
            int i6 = i3 + 1;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = IAuthTabCallback + 99;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onExtraCallbackWithResult(boolean z, boolean z2) {
        int i = 2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (!this.onWarmupCompleted) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
                if (z) {
                    if (z2) {
                        int i6 = i3 + 121;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        this.onWarmupCompleted = true;
                        this.onExtraCallbackWithResult = null;
                        return str;
                    }
                }
            } else if (z) {
            }
        }
        return null;
    }
}
