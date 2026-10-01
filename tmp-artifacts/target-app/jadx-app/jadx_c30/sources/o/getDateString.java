package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDateString extends Event<getDateString> {
    private final String onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDateString(int i, int i2, @NotNull String str) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = str;
    }

    public String getEventName() {
        return "onMarkerClick";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID, this.onExtraCallbackWithResult);
        return writableMapCreateMap;
    }
}
