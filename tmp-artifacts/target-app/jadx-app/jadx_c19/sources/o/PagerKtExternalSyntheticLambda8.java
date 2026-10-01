package o;

import androidx.glance.appwidget.protobuf.Reader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PagerKtExternalSyntheticLambda8 extends PagerKtExternalSyntheticLambda2<PagerKtExternalSyntheticLambda7, PagerKtExternalSyntheticLambda7> {
    @Override // o.PagerKtExternalSyntheticLambda2
    boolean onExtraCallback(Reader reader) {
        return false;
    }

    PagerKtExternalSyntheticLambda8() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public PagerKtExternalSyntheticLambda7 onExtraCallback() {
        return PagerKtExternalSyntheticLambda7.onWarmupCompleted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: IAuthTabCallback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void onWarmupCompleted(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, int i2, long j) {
        pagerKtExternalSyntheticLambda7.onWarmupCompleted(PagerKtExternalSyntheticLambda6.onWarmupCompleted(i2, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, int i2, int i3) {
        pagerKtExternalSyntheticLambda7.onWarmupCompleted(PagerKtExternalSyntheticLambda6.onWarmupCompleted(i2, 5), Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onWarmupCompleted, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void IAuthTabCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, int i2, long j) {
        pagerKtExternalSyntheticLambda7.onWarmupCompleted(PagerKtExternalSyntheticLambda6.onWarmupCompleted(i2, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, int i2, LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3) {
        pagerKtExternalSyntheticLambda7.onWarmupCompleted(PagerKtExternalSyntheticLambda6.onWarmupCompleted(i2, 2), lazyLayoutKtExternalSyntheticLambda3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    public void onExtraCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, int i2, PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda72) {
        pagerKtExternalSyntheticLambda7.onWarmupCompleted(PagerKtExternalSyntheticLambda6.onWarmupCompleted(i2, 3), pagerKtExternalSyntheticLambda72);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: IAuthTabCallback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public PagerKtExternalSyntheticLambda7 asBinder(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7) {
        pagerKtExternalSyntheticLambda7.asInterface();
        return pagerKtExternalSyntheticLambda7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(Object obj, PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7) {
        ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) obj).IAuthTabCallback = pagerKtExternalSyntheticLambda7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public PagerKtExternalSyntheticLambda7 onWarmupCompleted(Object obj) {
        return ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) obj).IAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public PagerKtExternalSyntheticLambda7 onNavigationEvent(Object obj) {
        PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7OnWarmupCompleted = onWarmupCompleted(obj);
        if (pagerKtExternalSyntheticLambda7OnWarmupCompleted != PagerKtExternalSyntheticLambda7.onNavigationEvent()) {
            return pagerKtExternalSyntheticLambda7OnWarmupCompleted;
        }
        PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7OnWarmupCompleted2 = PagerKtExternalSyntheticLambda7.onWarmupCompleted();
        onExtraCallback(obj, pagerKtExternalSyntheticLambda7OnWarmupCompleted2);
        return pagerKtExternalSyntheticLambda7OnWarmupCompleted2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(Object obj, PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7) {
        onExtraCallback(obj, pagerKtExternalSyntheticLambda7);
    }

    @Override // o.PagerKtExternalSyntheticLambda2
    void onExtraCallbackWithResult(Object obj) {
        onWarmupCompleted(obj).asInterface();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    public void IAuthTabCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        pagerKtExternalSyntheticLambda7.onWarmupCompleted(pagerMeasureKtExternalSyntheticLambda3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    public void onExtraCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        pagerKtExternalSyntheticLambda7.onNavigationEvent(pagerMeasureKtExternalSyntheticLambda3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public PagerKtExternalSyntheticLambda7 onExtraCallbackWithResult(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7, PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda72) {
        if (PagerKtExternalSyntheticLambda7.onNavigationEvent().equals(pagerKtExternalSyntheticLambda72)) {
            return pagerKtExternalSyntheticLambda7;
        }
        if (PagerKtExternalSyntheticLambda7.onNavigationEvent().equals(pagerKtExternalSyntheticLambda7)) {
            return PagerKtExternalSyntheticLambda7.IAuthTabCallback(pagerKtExternalSyntheticLambda7, pagerKtExternalSyntheticLambda72);
        }
        return pagerKtExternalSyntheticLambda7.IAuthTabCallback(pagerKtExternalSyntheticLambda72);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int IAuthTabCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7) {
        return pagerKtExternalSyntheticLambda7.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.PagerKtExternalSyntheticLambda2
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(PagerKtExternalSyntheticLambda7 pagerKtExternalSyntheticLambda7) {
        return pagerKtExternalSyntheticLambda7.onExtraCallbackWithResult();
    }
}
