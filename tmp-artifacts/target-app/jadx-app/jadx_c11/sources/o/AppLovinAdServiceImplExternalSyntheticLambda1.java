package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdServiceImplExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdServiceImplExternalSyntheticLambda1 implements getCurrentApplicationStateDurationMillis {
    public static final onExtraCallbackWithResult Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final Map<String, Object> IAuthTabCallback;
    private final AppSetIdAndScope1 onNavigationEvent;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = onTransact + 57;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinAdServiceImplExternalSyntheticLambda1 appLovinAdServiceImplExternalSyntheticLambda1, Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appLovinAdServiceImplExternalSyntheticLambda1, bool);
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AppLovinAdServiceImplExternalSyntheticLambda1(@NotNull JsonReaderUnknownNumberParsing<Boolean> jsonReaderUnknownNumberParsing) {
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        this.onNavigationEvent = ea10.onExtraCallbackWithResult("AppStateStorage");
        this.IAuthTabCallback = Collections.synchronizedMap(new LinkedHashMap());
        final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.util.AppStateStorageImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = AppLovinAdServiceImplExternalSyntheticLambda1.onWarmupCompleted(this.f$0, (Boolean) obj);
                int i4 = IAuthTabCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        };
        jsonReaderUnknownNumberParsing.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.splittarget.impl.util.AppStateStorageImpl$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final void accept(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AppLovinAdServiceImplExternalSyntheticLambda1.onExtraCallback(function1, obj);
                if (i3 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(AppLovinAdServiceImplExternalSyntheticLambda1 appLovinAdServiceImplExternalSyntheticLambda1, Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!(!bool.booleanValue())) {
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            appLovinAdServiceImplExternalSyntheticLambda1.onExtraCallbackWithResult();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 111;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getCurrentApplicationStateDurationMillis
    public <T> T onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Objects.toString(this.IAuthTabCallback.get(str));
        T t = (T) this.IAuthTabCallback.get(str);
        if (t != null) {
            return t;
        }
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // o.getCurrentApplicationStateDurationMillis
    public void IAuthTabCallback(@NotNull String str, @NotNull Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Objects.toString(obj);
        Map<String, Object> map = this.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put(str, obj);
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.getCurrentApplicationStateDurationMillis
    public void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback.remove(str);
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback.clear();
            int i3 = onExtraCallback + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.IAuthTabCallback.clear();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
