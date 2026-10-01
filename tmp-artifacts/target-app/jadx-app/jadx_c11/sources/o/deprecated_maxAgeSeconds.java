package o;

import android.content.Context;
import android.graphics.fonts.Font;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_maxAgeSeconds;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface deprecated_maxAgeSeconds {
    public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallbackWithResult;

    static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        return onWarmupCompleted(th);
    }

    static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        return onExtraCallbackWithResult();
    }

    static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        return IAuthTabCallback();
    }

    File onExtraCallbackWithResult(@NotNull Context context);

    void onWarmupCompleted(@NotNull Context context, boolean z, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function02);

    Font rm_(@NotNull Context context);

    static /* synthetic */ void onExtraCallbackWithResult(deprecated_maxAgeSeconds deprecated_maxageseconds, Context context, boolean z, Function0 function0, Function1 function1, Function0 function02, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadTossFaceIfNeeded");
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.tds.foundation.font.typeface.TossFaceLoader$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 61;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitAsInterface = deprecated_maxAgeSeconds.asInterface();
                    if (i5 != 0) {
                        int i6 = 60 / 0;
                    }
                    return unitAsInterface;
                }
            };
        }
        Function0 function03 = function0;
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: im.toss.tds.foundation.font.typeface.TossFaceLoader$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onNavigationEvent + 59;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitIAuthTabCallback = deprecated_maxAgeSeconds.IAuthTabCallback((Throwable) obj2);
                    int i6 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 94 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 16) != 0) {
            function02 = new Function0() { // from class: im.toss.tds.foundation.font.typeface.TossFaceLoader$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallback + 35;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return deprecated_maxAgeSeconds.onExtraCallback();
                    }
                    deprecated_maxAgeSeconds.onExtraCallback();
                    throw null;
                }
            };
        }
        deprecated_maxageseconds.onWarmupCompleted(context, z, function03, function12, function02);
    }

    private static Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        return Unit.INSTANCE;
    }

    private static Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    private static Unit IAuthTabCallback() {
        int i = 2 % 2;
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int asBinder = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static final deprecated_maxAgeSeconds onExtraCallback = new onExtraCallbackWithResult();

        public static final class onExtraCallbackWithResult implements deprecated_maxAgeSeconds {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // o.deprecated_maxAgeSeconds
            public File onExtraCallbackWithResult(Context context) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                int i4 = IAuthTabCallback + 95;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }

            @Override // o.deprecated_maxAgeSeconds
            public void onWarmupCompleted(Context context, boolean z, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, Function0<Unit> function02) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(function0, "");
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(function02, "");
                int i4 = onNavigationEvent + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override // o.deprecated_maxAgeSeconds
            public Font rm_(Context context) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                int i4 = onNavigationEvent + 17;
                IAuthTabCallback = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }

            onExtraCallbackWithResult() {
            }
        }

        private onNavigationEvent() {
        }

        static {
            int i = onNavigationEvent + 19;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public final deprecated_maxAgeSeconds onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback;
            }
            throw null;
        }
    }
}
