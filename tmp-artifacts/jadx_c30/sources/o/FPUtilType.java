package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FPUtilType extends Event<FPUtilType> {
    private final getSignForPKCS7 onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FPUtilType(int i, int i2, @NotNull getSignForPKCS7 getsignforpkcs7) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(getsignforpkcs7, BuildConfig.FLAVOR);
        this.onWarmupCompleted = getsignforpkcs7;
    }

    public String getEventName() {
        return "topVideoError";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("code", this.onWarmupCompleted.onNavigationEvent());
        writableMapCreateMap2.putString("domain", this.onWarmupCompleted.onExtraCallbackWithResult());
        writableMapCreateMap2.putString("localizedDescription", this.onWarmupCompleted.onWarmupCompleted());
        writableMapCreateMap2.putString("localizedFailureReason", BuildConfig.FLAVOR);
        writableMapCreateMap2.putString("localizedRecoverySuggestion", BuildConfig.FLAVOR);
        writableMapCreateMap2.putString("errorString", this.onWarmupCompleted.onExtraCallback());
        writableMapCreateMap.putMap("error", writableMapCreateMap2);
        return writableMapCreateMap;
    }
}
