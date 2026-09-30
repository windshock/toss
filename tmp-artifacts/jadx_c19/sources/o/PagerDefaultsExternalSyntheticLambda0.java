package o;

import androidx.glance.appwidget.protobuf.Reader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface PagerDefaultsExternalSyntheticLambda0<T> {
    int IAuthTabCallback(T t);

    int onExtraCallback(T t);

    T onExtraCallback();

    void onExtraCallback(T t, Reader reader, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    boolean onExtraCallback(T t, T t2);

    void onExtraCallbackWithResult(T t);

    void onExtraCallbackWithResult(T t, T t2);

    void onNavigationEvent(T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException;

    boolean onWarmupCompleted(T t);
}
