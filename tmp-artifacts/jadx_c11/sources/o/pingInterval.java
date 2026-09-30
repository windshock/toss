package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pingInterval {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final List<Pair<Integer, Integer>> onExtraCallbackWithResult;
    private CharSequence onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public pingInterval() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pingInterval)) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, ((pingInterval) obj).onNavigationEvent)) {
            int i7 = onWarmupCompleted + 123;
            IAuthTabCallback = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, r6.onExtraCallbackWithResult))) {
            return true;
        }
        int i8 = onWarmupCompleted + 81;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onWarmupCompleted + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        CharSequence charSequence = this.onNavigationEvent;
        String str = "TextEmojiIdxPair(text=" + ((Object) charSequence) + ", emojiIdxPairList=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public pingInterval(@NotNull CharSequence charSequence, @NotNull List<Pair<Integer, Integer>> list) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = charSequence;
        this.onExtraCallbackWithResult = list;
    }

    public /* synthetic */ pingInterval(CharSequence charSequence, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            charSequence = "";
        }
        if ((i & 2) != 0) {
            list = new ArrayList();
            int i4 = IAuthTabCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(charSequence, list);
    }

    public final CharSequence IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final void IAuthTabCallback(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onNavigationEvent = charSequence;
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    public final List<Pair<Integer, Integer>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<Pair<Integer, Integer>> list = this.onExtraCallbackWithResult;
        int i5 = i3 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
