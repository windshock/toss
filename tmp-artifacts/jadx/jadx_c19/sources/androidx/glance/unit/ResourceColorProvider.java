package androidx.glance.unit;

import android.content.Context;
import o.BasicTextKtExternalSyntheticLambda10;
import o.BasicTextKtExternalSyntheticLambda11;
import o.ByteOrderedDataOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ResourceColorProvider implements BasicTextKtExternalSyntheticLambda11 {
    private final int onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResourceColorProvider) && this.onExtraCallbackWithResult == ((ResourceColorProvider) obj).onExtraCallbackWithResult;
    }

    public int hashCode() {
        return Integer.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return "ResourceColorProvider(resId=" + this.onExtraCallbackWithResult + ')';
    }

    public ResourceColorProvider(int i2) {
        this.onExtraCallbackWithResult = i2;
    }

    public final int onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.BasicTextKtExternalSyntheticLambda11
    public long IAuthTabCallback(@NotNull Context context) {
        return ByteOrderedDataOutputStream.onExtraCallback(BasicTextKtExternalSyntheticLambda10.onNavigationEvent.IAuthTabCallback(context, this.onExtraCallbackWithResult));
    }
}
