package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CertTransferMgra extends Event<CertTransferMgra> {
    private final List<CertTransferMgrb> IAuthTabCallback;
    private final double onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final List<CertTransferMgrb> onNavigationEvent;
    private final double onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertTransferMgra(int i, int i2, double d, double d2, double d3, @NotNull List<CertTransferMgrb> list, @NotNull List<CertTransferMgrb> list2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list2, BuildConfig.FLAVOR);
        this.onExtraCallback = d;
        this.onWarmupCompleted = d2;
        this.onExtraCallbackWithResult = d3;
        this.IAuthTabCallback = list;
        this.onNavigationEvent = list2;
    }

    public String getEventName() {
        return "onCameraChange";
    }

    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("latitude", this.onExtraCallback);
        writableMapCreateMap.putDouble("longitude", this.onWarmupCompleted);
        writableMapCreateMap.putDouble("zoom", this.onExtraCallbackWithResult);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (CertTransferMgrb certTransferMgrb : this.IAuthTabCallback) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble("latitude", certTransferMgrb.onWarmupCompleted());
            writableMapCreateMap2.putDouble("longitude", certTransferMgrb.onExtraCallback());
            writableArrayCreateArray.pushMap(writableMapCreateMap2);
        }
        writableMapCreateMap.putArray("contentRegion", writableArrayCreateArray);
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        for (CertTransferMgrb certTransferMgrb2 : this.onNavigationEvent) {
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            writableMapCreateMap3.putDouble("latitude", certTransferMgrb2.onWarmupCompleted());
            writableMapCreateMap3.putDouble("longitude", certTransferMgrb2.onExtraCallback());
            writableArrayCreateArray2.pushMap(writableMapCreateMap3);
        }
        writableMapCreateMap.putArray("coveringRegion", writableArrayCreateArray2);
        return writableMapCreateMap;
    }
}
