package o;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static volatile Pair<? extends Typeface, ? extends getSurfaceSize> onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc onWarmupCompleted = new r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc();
    private static final getTimebase IAuthTabCallback = notifyPublicListeners.onWarmupCompleted(0);

    public static /* synthetic */ Unit onExtraCallbackWithResult(Handler handler) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(handler);
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc() {
    }

    static {
        final Handler handler = new Handler(Looper.getMainLooper());
        CacheRealCacheRequest1.onExtraCallback.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.atom.text.TossFaceSoloFontFamily$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc.onExtraCallbackWithResult(handler);
                int i4 = IAuthTabCallback + 45;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i = asInterface + 41;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getTimebase gettimebase = IAuthTabCallback;
        if (i3 == 0) {
            return gettimebase.onWarmupCompleted();
        }
        gettimebase.onWarmupCompleted();
        throw null;
    }

    public static void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getTimebase gettimebase = IAuthTabCallback;
        gettimebase.onExtraCallback(i3 != 0 ? gettimebase.onWarmupCompleted() << 1 : gettimebase.onWarmupCompleted() + 1);
    }

    private static final Unit onWarmupCompleted(Handler handler) {
        int i = 2 % 2;
        handler.post(new Runnable() { // from class: im.toss.tds.compose.component.atom.text.TossFaceSoloFontFamily$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc.IAuthTabCallback();
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = onExtraCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final getSurfaceSize onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Typeface typefaceOnNavigationEvent = CacheRealCacheRequest1.onExtraCallback.onNavigationEvent(context);
        Object obj = null;
        if (typefaceOnNavigationEvent == null) {
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        Pair<? extends Typeface, ? extends getSurfaceSize> pair = onExtraCallback;
        if (pair != null) {
            int i3 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                pair.getFirst();
                obj.hashCode();
                throw null;
            }
            if (pair.getFirst() != typefaceOnNavigationEvent) {
                pair = null;
            }
            if (pair != null) {
                int i4 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return (getSurfaceSize) pair.getSecond();
            }
        }
        getSurfaceSize getsurfacesizeOnNavigationEvent = create4x4IdentityMatrix.onNavigationEvent(typefaceOnNavigationEvent);
        onExtraCallback = getWrite.IAuthTabCallback(typefaceOnNavigationEvent, getsurfacesizeOnNavigationEvent);
        int i6 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return getsurfacesizeOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }
}
