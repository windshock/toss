package o;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setTranslationY {
    private static final Savers_androidKtExternalSyntheticLambda2<?, ?, ?> IAuthTabCallback = new Savers_androidKtExternalSyntheticLambda2<>(Object.class, Object.class, Object.class, Collections.singletonList(new SaversKtExternalSyntheticLambda54(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new setHorizontalGap(), null)), null);
    private final onMeasure<setWidgetBaseline, Savers_androidKtExternalSyntheticLambda2<?, ?, ?>> onNavigationEvent = new onMeasure<>();
    private final AtomicReference<setWidgetBaseline> onWarmupCompleted = new AtomicReference<>();

    public boolean onExtraCallback(@Nullable Savers_androidKtExternalSyntheticLambda2<?, ?, ?> savers_androidKtExternalSyntheticLambda2) {
        return IAuthTabCallback.equals(savers_androidKtExternalSyntheticLambda2);
    }

    public <Data, TResource, Transcode> Savers_androidKtExternalSyntheticLambda2<Data, TResource, Transcode> IAuthTabCallback(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Savers_androidKtExternalSyntheticLambda2<Data, TResource, Transcode> savers_androidKtExternalSyntheticLambda2;
        setWidgetBaseline setwidgetbaselineOnExtraCallbackWithResult = onExtraCallbackWithResult(cls, cls2, cls3);
        synchronized (this.onNavigationEvent) {
            savers_androidKtExternalSyntheticLambda2 = (Savers_androidKtExternalSyntheticLambda2) this.onNavigationEvent.get(setwidgetbaselineOnExtraCallbackWithResult);
        }
        this.onWarmupCompleted.set(setwidgetbaselineOnExtraCallbackWithResult);
        return savers_androidKtExternalSyntheticLambda2;
    }

    public void onNavigationEvent(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable Savers_androidKtExternalSyntheticLambda2<?, ?, ?> savers_androidKtExternalSyntheticLambda2) {
        synchronized (this.onNavigationEvent) {
            onMeasure<setWidgetBaseline, Savers_androidKtExternalSyntheticLambda2<?, ?, ?>> onmeasure = this.onNavigationEvent;
            setWidgetBaseline setwidgetbaseline = new setWidgetBaseline(cls, cls2, cls3);
            if (savers_androidKtExternalSyntheticLambda2 == null) {
                savers_androidKtExternalSyntheticLambda2 = IAuthTabCallback;
            }
            onmeasure.put(setwidgetbaseline, savers_androidKtExternalSyntheticLambda2);
        }
    }

    private setWidgetBaseline onExtraCallbackWithResult(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        setWidgetBaseline andSet = this.onWarmupCompleted.getAndSet(null);
        if (andSet == null) {
            andSet = new setWidgetBaseline();
        }
        andSet.IAuthTabCallback(cls, cls2, cls3);
        return andSet;
    }
}
