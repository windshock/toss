package o;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.Reader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import o.LazySaveableStateHolderExternalSyntheticLambda2;
import o.LazyStaggeredGridDslKtExternalSyntheticLambda1;
import o.PagerKtExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridStateExternalSyntheticLambda2<T> implements PagerDefaultsExternalSyntheticLambda0<T> {
    private final boolean IAuthTabCallback;
    private final PagerKtExternalSyntheticLambda2<?, ?> onExtraCallback;
    private final LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> onExtraCallbackWithResult;
    private final LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onNavigationEvent;

    private LazyStaggeredGridStateExternalSyntheticLambda2(PagerKtExternalSyntheticLambda2<?, ?> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        this.onExtraCallback = pagerKtExternalSyntheticLambda2;
        this.IAuthTabCallback = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted(lazyStaggeredGridMeasureKtExternalSyntheticLambda1);
        this.onExtraCallbackWithResult = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4;
        this.onNavigationEvent = lazyStaggeredGridMeasureKtExternalSyntheticLambda1;
    }

    static <T> LazyStaggeredGridStateExternalSyntheticLambda2<T> onExtraCallback(PagerKtExternalSyntheticLambda2<?, ?> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<?> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        return new LazyStaggeredGridStateExternalSyntheticLambda2<>(pagerKtExternalSyntheticLambda2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, lazyStaggeredGridMeasureKtExternalSyntheticLambda1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public T onExtraCallback() {
        LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1 = this.onNavigationEvent;
        if (lazyStaggeredGridMeasureKtExternalSyntheticLambda1 instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) {
            return (T) ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) lazyStaggeredGridMeasureKtExternalSyntheticLambda1).onRelationshipValidationResult();
        }
        return (T) lazyStaggeredGridMeasureKtExternalSyntheticLambda1.ICustomTabsCallbackStub().IAuthTabCallbackStub();
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public boolean onExtraCallback(T t, T t2) {
        if (!this.onExtraCallback.onWarmupCompleted(t).equals(this.onExtraCallback.onWarmupCompleted(t2))) {
            return false;
        }
        if (this.IAuthTabCallback) {
            return this.onExtraCallbackWithResult.IAuthTabCallback(t).equals(this.onExtraCallbackWithResult.IAuthTabCallback(t2));
        }
        return true;
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public int IAuthTabCallback(T t) {
        int iHashCode = this.onExtraCallback.onWarmupCompleted(t).hashCode();
        return this.IAuthTabCallback ? (iHashCode * 53) + this.onExtraCallbackWithResult.IAuthTabCallback(t).hashCode() : iHashCode;
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public void onExtraCallbackWithResult(T t, T t2) {
        LazyLayoutPagerKtExternalSyntheticLambda3.onWarmupCompleted(this.onExtraCallback, t, t2);
        if (this.IAuthTabCallback) {
            LazyLayoutPagerKtExternalSyntheticLambda3.onNavigationEvent(this.onExtraCallbackWithResult, t, t2);
        }
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public void onNavigationEvent(T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        Iterator itAsBinder = this.onExtraCallbackWithResult.IAuthTabCallback(t).asBinder();
        while (itAsBinder.hasNext()) {
            Map.Entry entry = (Map.Entry) itAsBinder.next();
            LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = (LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult) entry.getKey();
            if (onextracallbackwithresult.onNavigationEvent() != PagerKtExternalSyntheticLambda6.onExtraCallback.MESSAGE || onextracallbackwithresult.IAuthTabCallback() || onextracallbackwithresult.onExtraCallbackWithResult()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1.IAuthTabCallback) {
                pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(onextracallbackwithresult.onWarmupCompleted(), ((LazyStaggeredGridDslKtExternalSyntheticLambda1.IAuthTabCallback) entry).onWarmupCompleted().onExtraCallbackWithResult());
            } else {
                pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(onextracallbackwithresult.onWarmupCompleted(), entry.getValue());
            }
        }
        onExtraCallbackWithResult(this.onExtraCallback, t, pagerMeasureKtExternalSyntheticLambda3);
    }

    private <UT, UB> void onExtraCallbackWithResult(PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, T t, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        pagerKtExternalSyntheticLambda2.onExtraCallback((PagerKtExternalSyntheticLambda2<UT, UB>) pagerKtExternalSyntheticLambda2.onWarmupCompleted(t), pagerMeasureKtExternalSyntheticLambda3);
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public void onExtraCallback(T t, Reader reader, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException {
        onExtraCallback(this.onExtraCallback, this.onExtraCallbackWithResult, t, reader, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2);
    }

    private <UT, UB, ET extends LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult<ET>> void onExtraCallback(PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<ET> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, T t, Reader reader, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException {
        UB ubOnNavigationEvent = pagerKtExternalSyntheticLambda2.onNavigationEvent(t);
        LazySaveableStateHolderExternalSyntheticLambda2<ET> lazySaveableStateHolderExternalSyntheticLambda2OnExtraCallback = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onExtraCallback(t);
        while (reader.onWarmupCompleted() != Integer.MAX_VALUE) {
            try {
                if (!IAuthTabCallback(reader, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, lazySaveableStateHolderExternalSyntheticLambda2OnExtraCallback, pagerKtExternalSyntheticLambda2, ubOnNavigationEvent)) {
                    return;
                }
            } finally {
                pagerKtExternalSyntheticLambda2.onNavigationEvent(t, ubOnNavigationEvent);
            }
        }
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public void onExtraCallbackWithResult(T t) {
        this.onExtraCallback.onExtraCallbackWithResult(t);
        this.onExtraCallbackWithResult.onNavigationEvent(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult<ET>> boolean IAuthTabCallback(Reader reader, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<ET> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, LazySaveableStateHolderExternalSyntheticLambda2<ET> lazySaveableStateHolderExternalSyntheticLambda2, PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, UB ub) throws IOException {
        int iOnExtraCallbackWithResult = reader.onExtraCallbackWithResult();
        int iExtraCallback = 0;
        if (iOnExtraCallbackWithResult != PagerKtExternalSyntheticLambda6.onWarmupCompleted) {
            if (PagerKtExternalSyntheticLambda6.onExtraCallbackWithResult(iOnExtraCallbackWithResult) == 2) {
                Object objOnWarmupCompleted = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted(lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, this.onNavigationEvent, PagerKtExternalSyntheticLambda6.onNavigationEvent(iOnExtraCallbackWithResult));
                if (objOnWarmupCompleted != null) {
                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onNavigationEvent(reader, objOnWarmupCompleted, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, lazySaveableStateHolderExternalSyntheticLambda2);
                    return true;
                }
                return pagerKtExternalSyntheticLambda2.onNavigationEvent(ub, reader, 0);
            }
            return reader.readTypedObject();
        }
        Object objOnWarmupCompleted2 = null;
        LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3OnNavigationEvent = null;
        while (reader.onWarmupCompleted() != Integer.MAX_VALUE) {
            int iOnExtraCallbackWithResult2 = reader.onExtraCallbackWithResult();
            if (iOnExtraCallbackWithResult2 == PagerKtExternalSyntheticLambda6.onExtraCallbackWithResult) {
                iExtraCallback = reader.extraCallback();
                objOnWarmupCompleted2 = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted(lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, this.onNavigationEvent, iExtraCallback);
            } else if (iOnExtraCallbackWithResult2 == PagerKtExternalSyntheticLambda6.onExtraCallback) {
                if (objOnWarmupCompleted2 != null) {
                    lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onNavigationEvent(reader, objOnWarmupCompleted2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, lazySaveableStateHolderExternalSyntheticLambda2);
                } else {
                    lazyLayoutKtExternalSyntheticLambda3OnNavigationEvent = reader.onNavigationEvent();
                }
            } else if (!reader.readTypedObject()) {
                break;
            }
        }
        if (reader.onExtraCallbackWithResult() != PagerKtExternalSyntheticLambda6.IAuthTabCallback) {
            throw InvalidProtocolBufferException.onExtraCallbackWithResult();
        }
        if (lazyLayoutKtExternalSyntheticLambda3OnNavigationEvent != null) {
            if (objOnWarmupCompleted2 != null) {
                lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onWarmupCompleted(lazyLayoutKtExternalSyntheticLambda3OnNavigationEvent, objOnWarmupCompleted2, lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2, lazySaveableStateHolderExternalSyntheticLambda2);
            } else {
                pagerKtExternalSyntheticLambda2.onExtraCallbackWithResult(ub, iExtraCallback, lazyLayoutKtExternalSyntheticLambda3OnNavigationEvent);
            }
        }
        return true;
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public final boolean onWarmupCompleted(T t) {
        return this.onExtraCallbackWithResult.IAuthTabCallback(t).IAuthTabCallbackStub();
    }

    @Override // o.PagerDefaultsExternalSyntheticLambda0
    public int onExtraCallback(T t) {
        int iOnWarmupCompleted = onWarmupCompleted(this.onExtraCallback, t);
        return this.IAuthTabCallback ? iOnWarmupCompleted + this.onExtraCallbackWithResult.IAuthTabCallback(t).onWarmupCompleted() : iOnWarmupCompleted;
    }

    private <UT, UB> int onWarmupCompleted(PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, T t) {
        return pagerKtExternalSyntheticLambda2.onExtraCallback((PagerKtExternalSyntheticLambda2<UT, UB>) pagerKtExternalSyntheticLambda2.onWarmupCompleted(t));
    }
}
