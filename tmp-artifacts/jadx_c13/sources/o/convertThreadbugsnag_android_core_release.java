package o;

import im.toss.splittarget.spec.fsm.AppState;
import im.toss.state.spec.SessionState;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertThreadbugsnag_android_core_release {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final SessionState IAuthTabCallback;
    private final AppState onWarmupCompleted;

    static {
        int i = onExtraCallback + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public convertThreadbugsnag_android_core_release(@NotNull AppState appState, @NotNull SessionState sessionState) {
        Intrinsics.checkNotNullParameter(appState, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        this.onWarmupCompleted = appState;
        this.IAuthTabCallback = sessionState;
    }

    public final void onExtraCallbackWithResult(@NotNull clearFeatureFlags clearfeatureflags, @NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(clearfeatureflags, "");
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appState", this.onWarmupCompleted.onWarmupCompleted().toString());
        linkedHashMap.put("sessionState", this.IAuthTabCallback.asInterface().toString());
        linkedHashMap.putAll(clearfeatureflags.IAuthTabCallback());
        linkedHashMap.put("error", th);
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossWebSocketLogger", (String) null, linkedHashMap, (String) null, false, (String) null, 58, (Object) null);
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
