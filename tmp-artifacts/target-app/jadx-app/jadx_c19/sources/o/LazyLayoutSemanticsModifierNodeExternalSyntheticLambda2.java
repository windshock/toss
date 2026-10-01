package o;

import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 {
    private static volatile LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 onExtraCallback;
    static final LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 onNavigationEvent = new LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2(true);
    private final Map<IAuthTabCallback, PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback<?, ?>> IAuthTabCallback;

    public static LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 IAuthTabCallback() {
        LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2OnExtraCallbackWithResult;
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return onNavigationEvent;
        }
        LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 = onExtraCallback;
        if (lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 != null) {
            return lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2;
        }
        synchronized (LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2.class) {
            lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallback;
            if (lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2OnExtraCallbackWithResult == null) {
                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2OnExtraCallbackWithResult = LazyLayoutSemanticsModifierNodeExternalSyntheticLambda3.onExtraCallbackWithResult();
                onExtraCallback = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2OnExtraCallbackWithResult;
            }
        }
        return lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2OnExtraCallbackWithResult;
    }

    public <ContainingType extends LazyStaggeredGridMeasureKtExternalSyntheticLambda1> PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback<ContainingType, ?> onExtraCallback(ContainingType containingtype, int i2) {
        return (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.onExtraCallback) this.IAuthTabCallback.get(new IAuthTabCallback(containingtype, i2));
    }

    LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2() {
        this.IAuthTabCallback = new HashMap();
    }

    LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2(boolean z) {
        this.IAuthTabCallback = Collections.EMPTY_MAP;
    }

    static final class IAuthTabCallback {
        private final Object onExtraCallback;
        private final int onNavigationEvent;

        IAuthTabCallback(Object obj, int i2) {
            this.onExtraCallback = obj;
            this.onNavigationEvent = i2;
        }

        public int hashCode() {
            return (System.identityHashCode(this.onExtraCallback) * RtpPacket.MAX_SEQUENCE_NUMBER) + this.onNavigationEvent;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return this.onExtraCallback == iAuthTabCallback.onExtraCallback && this.onNavigationEvent == iAuthTabCallback.onNavigationEvent;
        }
    }
}
