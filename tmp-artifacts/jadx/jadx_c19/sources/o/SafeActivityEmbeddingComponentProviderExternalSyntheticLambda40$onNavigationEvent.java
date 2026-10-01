package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40$onNavigationEvent implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final int IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40$onNavigationEvent)) {
            return false;
        }
        if (this.IAuthTabCallback != ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40$onNavigationEvent) obj).IAuthTabCallback) {
            int i3 = onExtraCallbackWithResult + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = onExtraCallbackWithResult + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Integer.hashCode(this.IAuthTabCallback);
        int i5 = onExtraCallback + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "Success(messageRes=" + this.IAuthTabCallback + ")";
        int i3 = onExtraCallbackWithResult + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final int onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 57;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
