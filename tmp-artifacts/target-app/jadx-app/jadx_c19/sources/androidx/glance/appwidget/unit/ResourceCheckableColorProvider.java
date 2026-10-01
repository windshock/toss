package androidx.glance.appwidget.unit;

import o.BringIntoViewRequesterImplExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ResourceCheckableColorProvider implements BringIntoViewRequesterImplExternalSyntheticLambda0 {
    private final int IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResourceCheckableColorProvider) && this.IAuthTabCallback == ((ResourceCheckableColorProvider) obj).IAuthTabCallback;
    }

    public int hashCode() {
        return Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "ResourceCheckableColorProvider(resId=" + this.IAuthTabCallback + ')';
    }

    public ResourceCheckableColorProvider(int i2) {
        this.IAuthTabCallback = i2;
    }

    public final int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }
}
