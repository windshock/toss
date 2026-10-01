package o;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.Reader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class PagerKtExternalSyntheticLambda2<T, B> {
    private static volatile int onExtraCallbackWithResult = 100;

    abstract int IAuthTabCallback(T t);

    abstract void IAuthTabCallback(B b, int i2, long j);

    abstract void IAuthTabCallback(T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException;

    abstract T asBinder(B b);

    abstract int onExtraCallback(T t);

    abstract B onExtraCallback();

    abstract void onExtraCallback(B b, int i2, int i3);

    abstract void onExtraCallback(B b, int i2, T t);

    abstract void onExtraCallback(Object obj, T t);

    abstract void onExtraCallback(T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException;

    abstract boolean onExtraCallback(Reader reader);

    abstract T onExtraCallbackWithResult(T t, T t2);

    abstract void onExtraCallbackWithResult(Object obj);

    abstract void onExtraCallbackWithResult(B b, int i2, LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3);

    abstract B onNavigationEvent(Object obj);

    abstract void onNavigationEvent(Object obj, B b);

    abstract T onWarmupCompleted(Object obj);

    abstract void onWarmupCompleted(B b, int i2, long j);

    PagerKtExternalSyntheticLambda2() {
    }

    final boolean onNavigationEvent(B b, Reader reader, int i2) throws IOException {
        int iOnExtraCallbackWithResult = reader.onExtraCallbackWithResult();
        int iOnNavigationEvent = PagerKtExternalSyntheticLambda6.onNavigationEvent(iOnExtraCallbackWithResult);
        int iOnExtraCallbackWithResult2 = PagerKtExternalSyntheticLambda6.onExtraCallbackWithResult(iOnExtraCallbackWithResult);
        if (iOnExtraCallbackWithResult2 == 0) {
            onWarmupCompleted(b, iOnNavigationEvent, reader.IAuthTabCallback_Parcel());
            return true;
        }
        if (iOnExtraCallbackWithResult2 == 1) {
            IAuthTabCallback(b, iOnNavigationEvent, reader.asBinder());
            return true;
        }
        if (iOnExtraCallbackWithResult2 == 2) {
            onExtraCallbackWithResult(b, iOnNavigationEvent, reader.onNavigationEvent());
            return true;
        }
        if (iOnExtraCallbackWithResult2 != 3) {
            if (iOnExtraCallbackWithResult2 == 4) {
                return false;
            }
            if (iOnExtraCallbackWithResult2 == 5) {
                onExtraCallback((PagerKtExternalSyntheticLambda2<T, B>) b, iOnNavigationEvent, reader.onTransact());
                return true;
            }
            throw InvalidProtocolBufferException.IAuthTabCallback();
        }
        B bOnExtraCallback = onExtraCallback();
        int iOnWarmupCompleted = PagerKtExternalSyntheticLambda6.onWarmupCompleted(iOnNavigationEvent, 4);
        int i3 = i2 + 1;
        if (i3 >= onExtraCallbackWithResult) {
            throw InvalidProtocolBufferException.asInterface();
        }
        onExtraCallback((PagerKtExternalSyntheticLambda2<T, B>) bOnExtraCallback, reader, i3);
        if (iOnWarmupCompleted != reader.onExtraCallbackWithResult()) {
            throw InvalidProtocolBufferException.onExtraCallbackWithResult();
        }
        onExtraCallback((PagerKtExternalSyntheticLambda2<T, B>) b, iOnNavigationEvent, (int) asBinder(bOnExtraCallback));
        return true;
    }

    private final void onExtraCallback(B b, Reader reader, int i2) throws IOException {
        while (reader.onWarmupCompleted() != Integer.MAX_VALUE && onNavigationEvent(b, reader, i2)) {
        }
    }
}
