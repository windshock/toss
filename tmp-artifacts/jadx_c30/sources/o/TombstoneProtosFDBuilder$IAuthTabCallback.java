package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TombstoneProtosFDBuilder$IAuthTabCallback<T> implements writeQuoted<T> {
    final writeQuoted<? super T> onExtraCallbackWithResult;
    final serializeRaw<? extends T> onNavigationEvent;
    boolean onExtraCallback = true;
    final deserializeShortArray onWarmupCompleted = new deserializeShortArray();

    TombstoneProtosFDBuilder$IAuthTabCallback(writeQuoted<? super T> writequoted, serializeRaw<? extends T> serializeraw) {
        this.onExtraCallbackWithResult = writequoted;
        this.onNavigationEvent = serializeraw;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        this.onWarmupCompleted.onExtraCallbackWithResult(deserializeurinullablecollection);
    }

    public void onExtraCallback(T t) {
        if (this.onExtraCallback) {
            this.onExtraCallback = false;
        }
        this.onExtraCallbackWithResult.onExtraCallback(t);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        if (this.onExtraCallback) {
            this.onExtraCallback = false;
            this.onNavigationEvent.subscribe(this);
        } else {
            this.onExtraCallbackWithResult.onExtraCallback();
        }
    }
}
