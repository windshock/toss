package im.toss.tosssecurities.tracker.performance.di;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AFd1uSDK;
import o.AFd1vSDK;
import o.AFd1wSDK10;
import o.AFd1wSDK3;
import o.AFd1wSDKExternalSyntheticLambda0;
import o.AFd1wSDKExternalSyntheticLambda3;
import o.accesssetStatep;
import o.onTextViewSizeChanged;
import o.r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI;
import o.r8lambdaqCQJz0WTiGcBg92EEpExj0ZOE;
import o.zzag;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossSecuritiesPerformanceModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final TossSecuritiesPerformanceModule onNavigationEvent = new TossSecuritiesPerformanceModule();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 25;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(context);
        }
        IAuthTabCallback(context);
        throw null;
    }

    private TossSecuritiesPerformanceModule() {
    }

    @Singleton
    public final r8lambdaqCQJz0WTiGcBg92EEpExj0ZOE onExtraCallback(@NotNull Context context, @NotNull zzag zzagVar, @NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, "");
        AFd1wSDKExternalSyntheticLambda0 aFd1wSDKExternalSyntheticLambda0 = new AFd1wSDKExternalSyntheticLambda0(onWarmupCompleted(context, zzagVar, r8lambdavvxsp2uzrjb9nt4ewemuyygvi));
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return aFd1wSDKExternalSyntheticLambda0;
    }

    private final AFd1wSDKExternalSyntheticLambda3 onWarmupCompleted(final Context context, zzag zzagVar, r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi) {
        int i = 2 % 2;
        AFd1wSDK10 aFd1wSDK10 = new AFd1wSDK10(zzagVar, new AFd1wSDK3(new AFd1uSDK(new Function0() { // from class: im.toss.tosssecurities.tracker.performance.di.TossSecuritiesPerformanceModule$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 115;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String strOnWarmupCompleted = TossSecuritiesPerformanceModule.onWarmupCompleted(context);
                int i5 = IAuthTabCallback + 57;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 35 / 0;
                }
                return strOnWarmupCompleted;
            }
        }, new onExtraCallbackWithResult(accesssetStatep.onWarmupCompleted), (Function0) null, 4, (DefaultConstructorMarker) null), new AFd1vSDK(), r8lambdavvxsp2uzrjb9nt4ewemuyygvi));
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return aFd1wSDK10;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onExtraCallbackWithResult(Object obj) {
            super(0, obj, accesssetStatep.class, "isNativeTarget", "isNativeTarget()Z", 0);
        }

        public final Boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Boolean.valueOf(((accesssetStatep) this.receiver).onWarmupCompleted());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Boolean boolValueOf = Boolean.valueOf(((accesssetStatep) this.receiver).onWarmupCompleted());
            int i3 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Boolean invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolIAuthTabCallback = IAuthTabCallback();
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
            return boolIAuthTabCallback;
        }
    }

    private static final String IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onTextViewSizeChanged.onExtraCallbackWithResult.onWarmupCompleted(context);
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }
}
