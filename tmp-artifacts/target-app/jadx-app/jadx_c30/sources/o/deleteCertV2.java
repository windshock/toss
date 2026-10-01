package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class deleteCertV2 extends Event<deleteCertV2> {
    private final getSignForPKCS7AndVIDRV2NoContentsWithAttr onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deleteCertV2(int i, int i2, @NotNull getSignForPKCS7AndVIDRV2NoContentsWithAttr getsignforpkcs7andvidrv2nocontentswithattr) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv2nocontentswithattr, BuildConfig.FLAVOR);
        this.onNavigationEvent = getsignforpkcs7andvidrv2nocontentswithattr;
    }

    public String getEventName() {
        return "topVideoProgress";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("currentTime", this.onNavigationEvent.onNavigationEvent());
        writableMapCreateMap.putDouble("playableDuration", this.onNavigationEvent.onExtraCallbackWithResult());
        writableMapCreateMap.putDouble("seekableDuration", this.onNavigationEvent.IAuthTabCallback());
        return writableMapCreateMap;
    }
}
