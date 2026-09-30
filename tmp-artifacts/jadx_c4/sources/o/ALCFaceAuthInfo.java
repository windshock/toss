package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceAuthInfo {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static int onExtraCallbackWithResult = 1;
    private static final ALCFaceAuthInfo onNavigationEvent = new ALCFaceAuthInfo(CollectionsKt.listOf((char) 0), 0);
    private static int onWarmupCompleted;
    private final List<Character> IAuthTabCallback;
    private final char onExtraCallback;

    public ALCFaceAuthInfo(@NotNull List<Character> list, char c) {
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = list;
        this.onExtraCallback = c;
    }

    public static final /* synthetic */ ALCFaceAuthInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public final List<Character> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final char IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        char c = this.onExtraCallback;
        int i5 = i3 + 15;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return c;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 27;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ALCFaceAuthInfo) || this.onExtraCallback != ((ALCFaceAuthInfo) obj).onExtraCallback) {
            return false;
        }
        int i4 = asInterface + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        char c = this.onExtraCallback;
        if (i3 == 0) {
            return Character.hashCode(c);
        }
        Character.hashCode(c);
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(this.onExtraCallback);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return strValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final ALCFaceAuthInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return ALCFaceAuthInfo.onNavigationEvent();
            }
            ALCFaceAuthInfo.onNavigationEvent();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
