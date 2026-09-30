package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getRead implements Comparable<getRead> {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final getRead onWarmupCompleted = getEndAddress.onExtraCallback();
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public getRead(int i, int i2, int i3) {
        this.IAuthTabCallback = i;
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = i3;
        this.onNavigationEvent = onExtraCallbackWithResult(i, i2, i3);
    }

    private final int onExtraCallbackWithResult(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IAuthTabCallback);
        sb.append('.');
        sb.append(this.onExtraCallback);
        sb.append('.');
        sb.append(this.onExtraCallbackWithResult);
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        getRead getread = obj instanceof getRead ? (getRead) obj : null;
        return getread != null && this.onNavigationEvent == getread.onNavigationEvent;
    }

    public int hashCode() {
        return this.onNavigationEvent;
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull getRead getread) {
        Intrinsics.checkNotNullParameter(getread, BuildConfig.FLAVOR);
        return this.onNavigationEvent - getread.onNavigationEvent;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
