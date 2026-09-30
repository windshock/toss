package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleSetWidthJNI {

    public interface onExtraCallback extends onNavigationEvent, IAuthTabCallback {
    }

    public interface onNavigationEvent extends onExtraCallbackWithResult, onWarmupCompleted {
    }

    void onWarmupCompleted(@NotNull String str);

    public interface asBinder extends jni_YGNodeStyleSetWidthJNI {
        void onExtraCallback(@NotNull rl rlVar);

        void onExtraCallback(@NotNull xz xzVar);

        void onWarmupCompleted(int i);

        void onWarmupCompleted(@NotNull xz xzVar);

        static /* synthetic */ void IAuthTabCallback(asBinder asbinder, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            asbinder.onExtraCallback(xzVar);
        }

        static /* synthetic */ void onExtraCallbackWithResult(asBinder asbinder, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            asbinder.onWarmupCompleted(xzVar);
        }
    }

    public interface onExtraCallbackWithResult extends asBinder {
        void IAuthTabCallback(@NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetAspectRatioJNI> jni_ygnodeswapchildjni);

        void IAuthTabCallback(@NotNull xz xzVar);

        void onExtraCallback(@NotNull replaceChild replacechild);

        static /* synthetic */ void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: day");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            onextracallbackwithresult.IAuthTabCallback(xzVar);
        }
    }

    public interface onWarmupCompleted extends jni_YGNodeStyleSetWidthJNI {
        void IAuthTabCallback(int i, int i2);

        void a_(@NotNull xz xzVar);

        void b_(@NotNull xz xzVar);

        void onNavigationEvent(@NotNull xz xzVar);

        void onWarmupCompleted(@NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetFlexBasisPercentJNI> jni_ygnodeswapchildjni);

        static /* synthetic */ void onNavigationEvent(onWarmupCompleted onwarmupcompleted, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            onwarmupcompleted.onNavigationEvent(xzVar);
        }

        static /* synthetic */ void onExtraCallback(onWarmupCompleted onwarmupcompleted, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            onwarmupcompleted.a_(xzVar);
        }

        static /* synthetic */ void onWarmupCompleted(onWarmupCompleted onwarmupcompleted, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            onwarmupcompleted.b_(xzVar);
        }
    }

    public interface IAuthTabCallback extends jni_YGNodeStyleSetWidthJNI {
        void c_(@NotNull xz xzVar);

        void d_(@NotNull xz xzVar);

        void onExtraCallback(@NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetMarginAutoJNI> jni_ygnodeswapchildjni);

        void onExtraCallbackWithResult(@NotNull xz xzVar);

        static /* synthetic */ void onExtraCallback(IAuthTabCallback iAuthTabCallback, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            iAuthTabCallback.c_(xzVar);
        }

        static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            iAuthTabCallback.onExtraCallbackWithResult(xzVar);
        }

        static /* synthetic */ void onNavigationEvent(IAuthTabCallback iAuthTabCallback, xz xzVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
            }
            if ((i & 1) != 0) {
                xzVar = xz.ZERO;
            }
            iAuthTabCallback.d_(xzVar);
        }
    }
}
