package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AbstractResolvableFuture {
    public static final AbstractResolvableFuture IAuthTabCallbackDefault;
    public static final SaversKtExternalSyntheticLambda3<AbstractResolvableFuture> asBinder;
    public static final AbstractResolvableFuture onExtraCallbackWithResult;
    static final boolean onTransact;
    public static final AbstractResolvableFuture onWarmupCompleted;
    public static final AbstractResolvableFuture onNavigationEvent = new onWarmupCompleted();
    public static final AbstractResolvableFuture onExtraCallback = new onNavigationEvent();
    public static final AbstractResolvableFuture asInterface = new onExtraCallback();
    public static final AbstractResolvableFuture IAuthTabCallback = new onExtraCallbackWithResult();

    public enum asInterface {
        MEMORY,
        QUALITY
    }

    public abstract float onExtraCallback(int i2, int i3, int i4, int i5);

    public abstract asInterface onExtraCallbackWithResult(int i2, int i3, int i4, int i5);

    static {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        onWarmupCompleted = iAuthTabCallback;
        IAuthTabCallbackDefault = new IAuthTabCallbackDefault();
        onExtraCallbackWithResult = iAuthTabCallback;
        asBinder = SaversKtExternalSyntheticLambda3.onWarmupCompleted("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", iAuthTabCallback);
        onTransact = true;
    }

    static class onExtraCallback extends AbstractResolvableFuture {
        onExtraCallback() {
        }

        @Override // o.AbstractResolvableFuture
        public float onExtraCallback(int i2, int i3, int i4, int i5) {
            if (AbstractResolvableFuture.onTransact) {
                return Math.min(i4 / i2, i5 / i3);
            }
            if (Math.max(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }

        @Override // o.AbstractResolvableFuture
        public asInterface onExtraCallbackWithResult(int i2, int i3, int i4, int i5) {
            if (AbstractResolvableFuture.onTransact) {
                return asInterface.QUALITY;
            }
            return asInterface.MEMORY;
        }
    }

    static class IAuthTabCallback extends AbstractResolvableFuture {
        IAuthTabCallback() {
        }

        @Override // o.AbstractResolvableFuture
        public float onExtraCallback(int i2, int i3, int i4, int i5) {
            return Math.max(i4 / i2, i5 / i3);
        }

        @Override // o.AbstractResolvableFuture
        public asInterface onExtraCallbackWithResult(int i2, int i3, int i4, int i5) {
            return asInterface.QUALITY;
        }
    }

    static class onWarmupCompleted extends AbstractResolvableFuture {
        onWarmupCompleted() {
        }

        @Override // o.AbstractResolvableFuture
        public float onExtraCallback(int i2, int i3, int i4, int i5) {
            if (Math.min(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }

        @Override // o.AbstractResolvableFuture
        public asInterface onExtraCallbackWithResult(int i2, int i3, int i4, int i5) {
            return asInterface.QUALITY;
        }
    }

    static class onNavigationEvent extends AbstractResolvableFuture {
        onNavigationEvent() {
        }

        @Override // o.AbstractResolvableFuture
        public float onExtraCallback(int i2, int i3, int i4, int i5) {
            int iCeil = (int) Math.ceil(Math.max(i3 / i5, i2 / i4));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }

        @Override // o.AbstractResolvableFuture
        public asInterface onExtraCallbackWithResult(int i2, int i3, int i4, int i5) {
            return asInterface.MEMORY;
        }
    }

    static class IAuthTabCallbackDefault extends AbstractResolvableFuture {
        @Override // o.AbstractResolvableFuture
        public float onExtraCallback(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }

        IAuthTabCallbackDefault() {
        }

        @Override // o.AbstractResolvableFuture
        public asInterface onExtraCallbackWithResult(int i2, int i3, int i4, int i5) {
            return asInterface.QUALITY;
        }
    }

    static class onExtraCallbackWithResult extends AbstractResolvableFuture {
        onExtraCallbackWithResult() {
        }

        @Override // o.AbstractResolvableFuture
        public float onExtraCallback(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, AbstractResolvableFuture.asInterface.onExtraCallback(i2, i3, i4, i5));
        }

        @Override // o.AbstractResolvableFuture
        public asInterface onExtraCallbackWithResult(int i2, int i3, int i4, int i5) {
            if (onExtraCallback(i2, i3, i4, i5) == 1.0f) {
                return asInterface.QUALITY;
            }
            return AbstractResolvableFuture.asInterface.onExtraCallbackWithResult(i2, i3, i4, i5);
        }
    }
}
