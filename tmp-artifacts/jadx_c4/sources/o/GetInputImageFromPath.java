package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.GetInputImageFromPath;
import o.SetDetectableSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetInputImageFromPath {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    public static final GetInputImageFromPath onExtraCallbackWithResult = new GetInputImageFromPath();
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 89;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 66 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setDetectableSize);
        int i3 = onNavigationEvent + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private GetInputImageFromPath() {
    }

    public static /* synthetic */ void onExtraCallback(GetInputImageFromPath getInputImageFromPath, String str, Map map, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        getInputImageFromPath.onNavigationEvent(str, map, z);
        int i5 = onNavigationEvent + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        new BaseResponseBody(str, map, null, null, null, 28, null).onExtraCallback(z);
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(GetInputImageFromPath getInputImageFromPath, String str, long j, boolean z, String str2, Map map, Object obj, Function1 function1, int i, Object obj2) {
        boolean z2;
        Map map2;
        Object obj3;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        String strAsBinder = (i & 8) != 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str2;
        Object obj4 = null;
        if ((i & 16) != 0) {
            int i5 = onNavigationEvent + 67;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                obj4.hashCode();
                throw null;
            }
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i & 32) != 0) {
            int i6 = onNavigationEvent + 47;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 67 / 0;
            }
            obj3 = null;
        } else {
            obj3 = obj;
        }
        return getInputImageFromPath.onExtraCallbackWithResult(str, j, z2, strAsBinder, map2, obj3, (i & 64) != 0 ? new Function1() { // from class: im.toss.core.tracker.DomainLogger$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj5) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i9 % 128;
                Object obj6 = null;
                SetDetectableSize setDetectableSize = (SetDetectableSize) obj5;
                if (i9 % 2 != 0) {
                    GetInputImageFromPath.IAuthTabCallback(setDetectableSize);
                    obj6.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = GetInputImageFromPath.IAuthTabCallback(setDetectableSize);
                int i10 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        } : function1);
    }

    private static final Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str, long j, boolean z, @NotNull String str2, @Nullable Map<String, ?> map, @Nullable Object obj, @NotNull Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SetDetectableSize setDetectableSize = new SetDetectableSize();
        setDetectableSize.onExtraCallback(map);
        function1.invoke(setDetectableSize);
        boolean zOnExtraCallback = new BaseResponseBody(str, setDetectableSize.IAuthTabCallback(), Long.valueOf(j), obj, str2).onExtraCallback(z);
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return zOnExtraCallback;
    }
}
