package o;

import com.krc.pl_card.enums.ResponseCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class notifyListener<T> {
    private final ResponseCode IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String onExtraCallback;
    private final T onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final boolean onWarmupCompleted;

    public notifyListener(@NotNull ResponseCode responseCode, boolean z, @Nullable String str, @Nullable T t, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(responseCode, "");
        this.IAuthTabCallback = responseCode;
        this.onWarmupCompleted = z;
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = t;
        this.onExtraCallback = str2;
        this.IAuthTabCallbackDefault = str3;
        if (responseCode == ResponseCode.OK) {
            if (t == null) {
                throw new IllegalStateException("When 'code' is OK(0000), 'data' should not be null.");
            }
        } else if (str2 == null) {
            throw new IllegalStateException("When 'code' is not OK(0000), 'errorMessage' should not be null.");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof notifyListener)) {
            return false;
        }
        notifyListener notifylistener = (notifyListener) obj;
        return this.IAuthTabCallback == notifylistener.IAuthTabCallback && this.onWarmupCompleted == notifylistener.onWarmupCompleted && Intrinsics.areEqual(this.onNavigationEvent, notifylistener.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, notifylistener.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, notifylistener.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, notifylistener.IAuthTabCallbackDefault);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        boolean z = this.onWarmupCompleted;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        String str = this.onNavigationEvent;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        T t = this.onExtraCallbackWithResult;
        int iHashCode3 = t == null ? 0 : t.hashCode();
        String str2 = this.onExtraCallback;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.IAuthTabCallbackDefault;
        return (((((((((iHashCode * 31) + i2) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ServiceResult(code=" + this.IAuthTabCallback + ", isUsedNetwork=" + this.onWarmupCompleted + ", uuid=" + this.onNavigationEvent + ", data=" + this.onExtraCallbackWithResult + ", errorMessage=" + this.onExtraCallback + ", additionalCode=" + this.IAuthTabCallbackDefault + ')';
    }
}
