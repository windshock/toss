package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getIv3 extends Event<getIv3> {
    private final String onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getIv3(int i, int i2, @NotNull String str) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onExtraCallback = str;
    }

    public String getEventName() {
        return "onAnimationFailure";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("error", this.onExtraCallback);
        return writableMapCreateMap;
    }
}
