package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getPatch extends CancellationException {
    private final transient getPackageType onExtraCallback;

    public getPatch(@NotNull String str, @Nullable Throwable th, @NotNull getPackageType getpackagetype) {
        super(str);
        this.onExtraCallback = getpackagetype;
        if (th != null) {
            initCause(th);
        }
    }

    public final getPackageType onExtraCallback() {
        getPackageType getpackagetype = this.onExtraCallback;
        return getpackagetype == null ? UpdatePackageContent.onExtraCallback : getpackagetype;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + onExtraCallback();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getPatch)) {
            return false;
        }
        getPatch getpatch = (getPatch) obj;
        return Intrinsics.areEqual(getpatch.getMessage(), getMessage()) && Intrinsics.areEqual(getpatch.onExtraCallback(), onExtraCallback()) && Intrinsics.areEqual(getpatch.getCause(), getCause());
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = message.hashCode();
        getPackageType getpackagetypeOnExtraCallback = onExtraCallback();
        int iHashCode2 = getpackagetypeOnExtraCallback != null ? getpackagetypeOnExtraCallback.hashCode() : 0;
        Throwable cause = getCause();
        return (((iHashCode * 31) + iHashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }
}
