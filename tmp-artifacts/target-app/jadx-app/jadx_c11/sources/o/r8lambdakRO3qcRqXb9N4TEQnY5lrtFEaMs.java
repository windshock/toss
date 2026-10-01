package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.QuirkSettingsLoader;
import o.r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs;
import o.r8lambdalBPysS0CPqCWn6NRPDKJD1o6so;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs {
    private static final accessisMonitoringp<r8lambdalBPysS0CPqCWn6NRPDKJD1o6so> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback(new Function0() { // from class: im.toss.tds.compose.component.compound.progressstepper.v1.ProgressStepperStepLayoutKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            r8lambdalBPysS0CPqCWn6NRPDKJD1o6so r8lambdalbpyss0cpqcwn6nrpdkjd1o6soIAuthTabCallback = r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs.IAuthTabCallback();
            int i4 = onExtraCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdalbpyss0cpqcwn6nrpdkjd1o6soIAuthTabCallback;
        }
    });
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ r8lambdalBPysS0CPqCWn6NRPDKJD1o6so IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdalBPysS0CPqCWn6NRPDKJD1o6so r8lambdalbpyss0cpqcwn6nrpdkjd1o6soOnNavigationEvent = onNavigationEvent();
        int i4 = onWarmupCompleted + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdalbpyss0cpqcwn6nrpdkjd1o6soOnNavigationEvent;
    }

    public static final createCameraCaptureCallback onExtraCallback(@NotNull r8lambdalBPysS0CPqCWn6NRPDKJD1o6so r8lambdalbpyss0cpqcwn6nrpdkjd1o6so) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdalbpyss0cpqcwn6nrpdkjd1o6so, "");
        if (!r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.IAuthTabCallback()) {
            return null;
        }
        if (Intrinsics.areEqual(r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.onWarmupCompleted(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy())) {
            int i2 = onNavigationEvent + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onTransact());
        }
        if (!Intrinsics.areEqual(r4, r1.asBinder())) {
            return createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback());
        }
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        createCameraCaptureCallback createcameracapturecallbackOnExtraCallback = createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onExtraCallback());
        int i6 = onNavigationEvent + 125;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return createcameracapturecallbackOnExtraCallback;
    }

    static {
        int i = onExtraCallback + 35;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static final r8lambdalBPysS0CPqCWn6NRPDKJD1o6so onNavigationEvent() {
        int i = 2 % 2;
        r8lambdalBPysS0CPqCWn6NRPDKJD1o6so r8lambdalbpyss0cpqcwn6nrpdkjd1o6so = new r8lambdalBPysS0CPqCWn6NRPDKJD1o6so(null, false, 0.0f, 0, 15, null);
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return r8lambdalbpyss0cpqcwn6nrpdkjd1o6so;
    }

    public static final accessisMonitoringp<r8lambdalBPysS0CPqCWn6NRPDKJD1o6so> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public static final QuirkSettingsLoader.onNavigationEvent onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 83;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 == 0 ? i2 <= 1 : i2 <= 0) {
            return QuirkSettingsLoader.Companion.onTransact();
        }
        if (i != 0) {
            if (i == i2 - 1) {
                return QuirkSettingsLoader.Companion.asBinder();
            }
            return QuirkSettingsLoader.Companion.onTransact();
        }
        int i6 = i5 + 25;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy();
    }
}
