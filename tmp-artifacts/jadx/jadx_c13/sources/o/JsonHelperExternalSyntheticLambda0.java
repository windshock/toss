package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class JsonHelperExternalSyntheticLambda0 extends awaitResult {
    private final modifyCallback IAuthTabCallback;

    @Nullable
    private final String onExtraCallback;

    @Nullable
    private final String onExtraCallbackWithResult;
    private final withJavaConverters onNavigationEvent;
    private final int onWarmupCompleted;

    JsonHelperExternalSyntheticLambda0(@Nullable String str, @Nullable String str2, modifyCallback modifycallback, withJavaConverters withjavaconverters, int i) {
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = str2;
        if (modifycallback == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.IAuthTabCallback = modifycallback;
        if (withjavaconverters == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.onNavigationEvent = withjavaconverters;
        this.onWarmupCompleted = i;
    }

    @Override // o.awaitResult
    @Nullable
    public String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.awaitResult
    @Nullable
    public String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    @Override // o.awaitResult
    public modifyCallback IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.awaitResult
    withJavaConverters onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.awaitResult
    public int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awaitResult)) {
            return false;
        }
        awaitResult awaitresult = (awaitResult) obj;
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            if (awaitresult.onWarmupCompleted() != null) {
                return false;
            }
        } else if (!str.equals(awaitresult.onWarmupCompleted())) {
            return false;
        }
        String str2 = this.onExtraCallback;
        if (str2 == null) {
            if (awaitresult.onExtraCallbackWithResult() != null) {
                return false;
            }
        } else if (!str2.equals(awaitresult.onExtraCallbackWithResult())) {
            return false;
        }
        return this.IAuthTabCallback.equals(awaitresult.IAuthTabCallback()) && this.onNavigationEvent.equals(awaitresult.onExtraCallback()) && this.onWarmupCompleted == awaitresult.onNavigationEvent();
    }

    public int hashCode() {
        String str = this.onExtraCallbackWithResult;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.onExtraCallback;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.IAuthTabCallback.hashCode()) * 1000003) ^ this.onNavigationEvent.hashCode()) * 1000003) ^ this.onWarmupCompleted;
    }
}
