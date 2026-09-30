package o;

import o.getTinyLocalStorage;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getTinyLocalStorage$asInterface implements getTinyLocalStorage {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final getTinyLocalStorage$asInterface onWarmupCompleted = new getTinyLocalStorage$asInterface();

    static {
        int i = onNavigationEvent + 97;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(!(obj instanceof getTinyLocalStorage$asInterface))) {
            return true;
        }
        int i3 = IAuthTabCallback + 35;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 93;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return -297451895;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return "Validating";
    }

    private getTinyLocalStorage$asInterface() {
    }

    public /* bridge */ void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    public /* bridge */ getTinyLocalStorage.asBinder onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getTinyLocalStorage.asBinder asbinderOnWarmupCompleted = super.onWarmupCompleted();
        int i4 = IAuthTabCallback + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return asbinderOnWarmupCompleted;
    }
}
