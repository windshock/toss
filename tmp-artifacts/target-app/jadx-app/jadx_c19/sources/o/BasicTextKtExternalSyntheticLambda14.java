package o;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextKtExternalSyntheticLambda14 implements BasicTextKtExternalSyntheticLambda11 {
    private final long IAuthTabCallback;

    public /* synthetic */ BasicTextKtExternalSyntheticLambda14(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasicTextKtExternalSyntheticLambda14) && setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, ((BasicTextKtExternalSyntheticLambda14) obj).IAuthTabCallback);
    }

    public int hashCode() {
        return setByteOrder.onTransact(this.IAuthTabCallback);
    }

    public String toString() {
        return "FixedColorProvider(color=" + ((Object) setByteOrder.IAuthTabCallbackDefault(this.IAuthTabCallback)) + ')';
    }

    private BasicTextKtExternalSyntheticLambda14(long j) {
        this.IAuthTabCallback = j;
    }

    public final long IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.BasicTextKtExternalSyntheticLambda11
    public long IAuthTabCallback(@NotNull Context context) {
        return this.IAuthTabCallback;
    }
}
