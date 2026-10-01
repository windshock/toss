package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridDslKtExternalSyntheticLambda5 implements PagerCacheWindowScopeExternalSyntheticLambda0 {
    private static final LazyStaggeredGridMeasureKtExternalSyntheticLambda0 onWarmupCompleted = new LazyStaggeredGridMeasureKtExternalSyntheticLambda0() { // from class: o.LazyStaggeredGridDslKtExternalSyntheticLambda5.5
        @Override // o.LazyStaggeredGridMeasureKtExternalSyntheticLambda0
        public boolean IAuthTabCallback(Class<?> cls) {
            return false;
        }

        @Override // o.LazyStaggeredGridMeasureKtExternalSyntheticLambda0
        public LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 onExtraCallbackWithResult(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final LazyStaggeredGridMeasureKtExternalSyntheticLambda0 onExtraCallbackWithResult;

    public LazyStaggeredGridDslKtExternalSyntheticLambda5() {
        this(onExtraCallback());
    }

    private LazyStaggeredGridDslKtExternalSyntheticLambda5(LazyStaggeredGridMeasureKtExternalSyntheticLambda0 lazyStaggeredGridMeasureKtExternalSyntheticLambda0) {
        this.onExtraCallbackWithResult = (LazyStaggeredGridMeasureKtExternalSyntheticLambda0) LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(lazyStaggeredGridMeasureKtExternalSyntheticLambda0, "messageInfoFactory");
    }

    @Override // o.PagerCacheWindowScopeExternalSyntheticLambda0
    public <T> PagerDefaultsExternalSyntheticLambda0<T> onExtraCallback(Class<T> cls) {
        LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult((Class<?>) cls);
        LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 lazyStaggeredGridItemProviderKtExternalSyntheticLambda1OnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(cls);
        if (lazyStaggeredGridItemProviderKtExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult()) {
            if (onExtraCallbackWithResult(cls)) {
                return LazyStaggeredGridStateExternalSyntheticLambda2.onExtraCallback(LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(), LazyLayoutSemanticsModifierNodeExternalSyntheticLambda0.IAuthTabCallback(), lazyStaggeredGridItemProviderKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted());
            }
            return LazyStaggeredGridStateExternalSyntheticLambda2.onExtraCallback(LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(), LazyLayoutSemanticsModifierNodeExternalSyntheticLambda0.onNavigationEvent(), lazyStaggeredGridItemProviderKtExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted());
        }
        return onExtraCallbackWithResult(cls, lazyStaggeredGridItemProviderKtExternalSyntheticLambda1OnExtraCallbackWithResult);
    }

    private static <T> PagerDefaultsExternalSyntheticLambda0<T> onExtraCallbackWithResult(Class<T> cls, LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 lazyStaggeredGridItemProviderKtExternalSyntheticLambda1) {
        if (onExtraCallbackWithResult(cls)) {
            return LazyStaggeredGridStateExternalSyntheticLambda0.onExtraCallback(cls, lazyStaggeredGridItemProviderKtExternalSyntheticLambda1, LazyStaggeredGridStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(), LazyStaggeredGridDslKtExternalSyntheticLambda4.onExtraCallback(), LazyLayoutPagerKtExternalSyntheticLambda3.onExtraCallbackWithResult(), IAuthTabCallback(lazyStaggeredGridItemProviderKtExternalSyntheticLambda1) ? LazyLayoutSemanticsModifierNodeExternalSyntheticLambda0.IAuthTabCallback() : null, LazyStaggeredGridItemProviderKtExternalSyntheticLambda0.onExtraCallbackWithResult());
        }
        return LazyStaggeredGridStateExternalSyntheticLambda0.onExtraCallback(cls, lazyStaggeredGridItemProviderKtExternalSyntheticLambda1, LazyStaggeredGridStateKtExternalSyntheticLambda0.onNavigationEvent(), LazyStaggeredGridDslKtExternalSyntheticLambda4.onExtraCallbackWithResult(), LazyLayoutPagerKtExternalSyntheticLambda3.IAuthTabCallback(), IAuthTabCallback(lazyStaggeredGridItemProviderKtExternalSyntheticLambda1) ? LazyLayoutSemanticsModifierNodeExternalSyntheticLambda0.onNavigationEvent() : null, LazyStaggeredGridItemProviderKtExternalSyntheticLambda0.onWarmupCompleted());
    }

    /* renamed from: o.LazyStaggeredGridDslKtExternalSyntheticLambda5$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[LazyLayoutPagerKtExternalSyntheticLambda1.values().length];
            onExtraCallback = iArr;
            try {
                iArr[LazyLayoutPagerKtExternalSyntheticLambda1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static boolean IAuthTabCallback(LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 lazyStaggeredGridItemProviderKtExternalSyntheticLambda1) {
        return AnonymousClass1.onExtraCallback[lazyStaggeredGridItemProviderKtExternalSyntheticLambda1.onExtraCallback().ordinal()] != 1;
    }

    private static LazyStaggeredGridMeasureKtExternalSyntheticLambda0 onExtraCallback() {
        return new onNavigationEvent(LazySaveableStateHolderCompanionExternalSyntheticLambda0.onWarmupCompleted(), onNavigationEvent());
    }

    static class onNavigationEvent implements LazyStaggeredGridMeasureKtExternalSyntheticLambda0 {
        private LazyStaggeredGridMeasureKtExternalSyntheticLambda0[] onExtraCallback;

        onNavigationEvent(LazyStaggeredGridMeasureKtExternalSyntheticLambda0... lazyStaggeredGridMeasureKtExternalSyntheticLambda0Arr) {
            this.onExtraCallback = lazyStaggeredGridMeasureKtExternalSyntheticLambda0Arr;
        }

        @Override // o.LazyStaggeredGridMeasureKtExternalSyntheticLambda0
        public boolean IAuthTabCallback(Class<?> cls) {
            for (LazyStaggeredGridMeasureKtExternalSyntheticLambda0 lazyStaggeredGridMeasureKtExternalSyntheticLambda0 : this.onExtraCallback) {
                if (lazyStaggeredGridMeasureKtExternalSyntheticLambda0.IAuthTabCallback(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.LazyStaggeredGridMeasureKtExternalSyntheticLambda0
        public LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 onExtraCallbackWithResult(Class<?> cls) {
            for (LazyStaggeredGridMeasureKtExternalSyntheticLambda0 lazyStaggeredGridMeasureKtExternalSyntheticLambda0 : this.onExtraCallback) {
                if (lazyStaggeredGridMeasureKtExternalSyntheticLambda0.IAuthTabCallback(cls)) {
                    return lazyStaggeredGridMeasureKtExternalSyntheticLambda0.onExtraCallbackWithResult(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    private static LazyStaggeredGridMeasureKtExternalSyntheticLambda0 onNavigationEvent() {
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return onWarmupCompleted;
        }
        try {
            return (LazyStaggeredGridMeasureKtExternalSyntheticLambda0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return onWarmupCompleted;
        }
    }

    private static boolean onExtraCallbackWithResult(Class<?> cls) {
        return DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult || PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.class.isAssignableFrom(cls);
    }
}
