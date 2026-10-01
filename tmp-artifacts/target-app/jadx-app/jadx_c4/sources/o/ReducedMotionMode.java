package o;

import androidx.biometric.BiometricPrompt;
import im.toss.core.biometric.data.ResultData;
import im.toss.core.biometric.data.ResultStatus;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ReducedMotionMode;
import o.toNativeBlendMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ReducedMotionMode<T extends ResultData> implements serializeObject<drawIconBackgroundColor<T>> {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final String IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final String asInterface;
    private final RememberLottieCompositionKtlottieComposition1 onExtraCallback;
    private toPaintJoin<T> onExtraCallbackWithResult;
    private toNativeBlendMode onNavigationEvent;
    private final deserializeFloatArray onWarmupCompleted;

    public static /* synthetic */ void onExtraCallbackWithResult(ReducedMotionMode reducedMotionMode) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(reducedMotionMode);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(ReducedMotionMode reducedMotionMode, BiometricPrompt.IAuthTabCallback iAuthTabCallback, IAuthTabCallback iAuthTabCallback2) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(reducedMotionMode, iAuthTabCallback, iAuthTabCallback2);
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        int i5 = asBinder + 99;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ReducedMotionMode(@Nullable RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull String str, int i, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = rememberLottieCompositionKtlottieComposition1;
        this.IAuthTabCallback = str;
        this.IAuthTabCallbackDefault = i;
        this.asInterface = str2;
        this.onWarmupCompleted = new deserializeFloatArray() { // from class: im.toss.core.biometric.BiometricObservable$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final void cancel() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 29;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                ReducedMotionMode.onExtraCallbackWithResult(this.f$0);
                if (i4 == 0) {
                    throw null;
                }
            }
        };
        if (rememberLottieCompositionKtlottieComposition1 != null) {
            this.onNavigationEvent = new toNativeBlendMode(rememberLottieCompositionKtlottieComposition1);
            int i2 = IAuthTabCallbackStub + 73;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        int i5 = IAuthTabCallbackStub + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReducedMotionMode(RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i3 = asBinder + 17;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i2 & 4) != 0) {
            int i4 = asBinder + 79;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 10;
        }
        if ((i2 & 8) != 0) {
            int i7 = asBinder + 85;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            str2 = null;
        }
        this(rememberLottieCompositionKtlottieComposition1, str, i, str2);
    }

    public static final /* synthetic */ toPaintJoin onNavigationEvent(ReducedMotionMode reducedMotionMode) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        toPaintJoin<T> topaintjoin = reducedMotionMode.onExtraCallbackWithResult;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 119;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return topaintjoin;
    }

    private static final void IAuthTabCallback(ReducedMotionMode reducedMotionMode) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        toNativeBlendMode tonativeblendmode = reducedMotionMode.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 20 / 0;
            if (tonativeblendmode == null) {
                return;
            }
        } else if (tonativeblendmode == null) {
            return;
        }
        tonativeblendmode.onWarmupCompleted();
        int i5 = asBinder + 85;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final ReducedMotionMode<T> onNavigationEvent(@NotNull toPaintJoin<T> topaintjoin) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(topaintjoin, "");
            this.onExtraCallbackWithResult = topaintjoin;
            int i3 = 87 / 0;
        } else {
            Intrinsics.checkNotNullParameter(topaintjoin, "");
            this.onExtraCallbackWithResult = topaintjoin;
        }
        int i4 = IAuthTabCallbackStub + 109;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return this;
    }

    public void subscribe(@NotNull writeBinary<drawIconBackgroundColor<T>> writebinary) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        toPaintJoin<T> topaintjoin = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(writebinary, "");
            topaintjoin.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(writebinary, "");
        toPaintJoin<T> topaintjoin2 = this.onExtraCallbackWithResult;
        if (topaintjoin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            topaintjoin2 = null;
        }
        if (topaintjoin2 instanceof RememberLottieCompositionKtrememberLottieComposition3) {
            ResultStatus resultStatus = ResultStatus.SUCCEEDED;
            toPaintJoin<T> topaintjoin3 = this.onExtraCallbackWithResult;
            if (topaintjoin3 == null) {
                int i3 = IAuthTabCallbackStub + 23;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                topaintjoin = topaintjoin3;
            }
            writebinary.IAuthTabCallback(new drawIconBackgroundColor(resultStatus, ((RememberLottieCompositionKtrememberLottieComposition3) topaintjoin).onExtraCallback()));
            writebinary.onNavigationEvent();
            return;
        }
        try {
            toPaintJoin<T> topaintjoin4 = this.onExtraCallbackWithResult;
            if (topaintjoin4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                topaintjoin = topaintjoin4;
            }
            final BiometricPrompt.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = topaintjoin.onNavigationEvent();
            final IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(writebinary, this);
            writebinary.onWarmupCompleted(this.onWarmupCompleted);
            NetConverter3.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.core.biometric.BiometricObservable$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 117;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    ReducedMotionMode reducedMotionMode = this.f$0;
                    if (i7 == 0) {
                        ReducedMotionMode.onNavigationEvent(reducedMotionMode, iAuthTabCallbackOnNavigationEvent, iAuthTabCallback);
                        return;
                    }
                    ReducedMotionMode.onNavigationEvent(reducedMotionMode, iAuthTabCallbackOnNavigationEvent, iAuthTabCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BiometricObservable", "buildCryptoObject", th, (Map) null, 8, (Object) null);
            writebinary.onExtraCallback(th);
            int i5 = IAuthTabCallbackStub + 27;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 19 / 0;
            }
        }
    }

    public static final class IAuthTabCallback implements toNativeBlendMode.onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ReducedMotionMode<T> IAuthTabCallback;
        final /* synthetic */ writeBinary<drawIconBackgroundColor<T>> onExtraCallback;

        public static /* synthetic */ void onExtraCallbackWithResult(writeBinary writebinary, int i, CharSequence charSequence) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent(writebinary, i, charSequence);
            if (i4 == 0) {
                int i5 = 60 / 0;
            }
            int i6 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }

        IAuthTabCallback(writeBinary<drawIconBackgroundColor<T>> writebinary, ReducedMotionMode<T> reducedMotionMode) {
            this.onExtraCallback = writebinary;
            this.IAuthTabCallback = reducedMotionMode;
        }

        @Override // o.toNativeBlendMode.onExtraCallbackWithResult
        public void onExtraCallback(BiometricPrompt.onExtraCallback onextracallback) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            if (this.onExtraCallback.isDisposed()) {
                return;
            }
            try {
                writeBinary<drawIconBackgroundColor<T>> writebinary = this.onExtraCallback;
                ResultStatus resultStatus = ResultStatus.SUCCEEDED;
                toPaintJoin topaintjoinOnNavigationEvent = ReducedMotionMode.onNavigationEvent(this.IAuthTabCallback);
                if (topaintjoinOnNavigationEvent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    topaintjoinOnNavigationEvent = null;
                }
                writebinary.IAuthTabCallback(new drawIconBackgroundColor(resultStatus, topaintjoinOnNavigationEvent.onExtraCallback(onextracallback)));
                this.onExtraCallback.onNavigationEvent();
            } catch (Exception e) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BiometricObservable", "processAuthResult", e, (Map) null, 8, (Object) null);
                this.onExtraCallback.onExtraCallback(e);
                int i4 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // o.toNativeBlendMode.onExtraCallbackWithResult
        public void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!this.onExtraCallback.isDisposed()) {
                this.onExtraCallback.IAuthTabCallback(new drawIconBackgroundColor(ResultStatus.FAILED, null, 2, null));
            }
            int i4 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
        }

        @Override // o.toNativeBlendMode.onExtraCallbackWithResult
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallback.isDisposed();
                obj.hashCode();
                throw null;
            }
            if (this.onExtraCallback.isDisposed()) {
                return;
            }
            this.onExtraCallback.IAuthTabCallback(new drawIconBackgroundColor(ResultStatus.SELECTED_INPUT, null, 2, null));
            this.onExtraCallback.onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 5;
            }
        }

        @Override // o.toNativeBlendMode.onExtraCallbackWithResult
        public void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!this.onExtraCallback.isDisposed()) {
                    this.onExtraCallback.IAuthTabCallback(new drawIconBackgroundColor(ResultStatus.USER_CANCELLED, null, 2, null));
                    this.onExtraCallback.onNavigationEvent();
                }
                int i3 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.onExtraCallback.isDisposed();
            throw null;
        }

        @Override // o.toNativeBlendMode.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(final int i, final CharSequence charSequence) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            if (!this.onExtraCallback.isDisposed()) {
                MapConverter mapConverterOnNavigationEvent = clearTid.onNavigationEvent();
                final writeBinary<drawIconBackgroundColor<T>> writebinary = this.onExtraCallback;
                mapConverterOnNavigationEvent.onNavigationEvent(new Runnable() { // from class: im.toss.core.biometric.BiometricObservable$subscribe$callback$1$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 97;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        ReducedMotionMode.IAuthTabCallback.onExtraCallbackWithResult(writebinary, i, charSequence);
                        int i8 = onNavigationEvent + 79;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
            }
            int i5 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        private static final void onNavigationEvent(writeBinary writebinary, int i, CharSequence charSequence) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                writebinary.isDisposed();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!writebinary.isDisposed()) {
                writebinary.onExtraCallback(new drawImageIcon(i, charSequence.toString()));
            }
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.toNativeBlendMode) = (r1v4 o.toNativeBlendMode), (r1v6 o.toNativeBlendMode) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(ReducedMotionMode reducedMotionMode, BiometricPrompt.IAuthTabCallback iAuthTabCallback, IAuthTabCallback iAuthTabCallback2) {
        toNativeBlendMode tonativeblendmode;
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            tonativeblendmode = reducedMotionMode.onNavigationEvent;
            int i3 = 53 / 0;
            if (tonativeblendmode != null) {
                tonativeblendmode.onNavigationEvent(iAuthTabCallback, reducedMotionMode.IAuthTabCallback, reducedMotionMode.IAuthTabCallbackDefault, iAuthTabCallback2, reducedMotionMode.asInterface);
            }
        } else {
            tonativeblendmode = reducedMotionMode.onNavigationEvent;
            if (tonativeblendmode != null) {
            }
        }
        int i4 = IAuthTabCallbackStub + 89;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
