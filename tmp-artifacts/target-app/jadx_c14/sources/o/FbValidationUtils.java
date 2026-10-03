package o;

import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import im.toss.network.serialization.PolymorphicTypeDeserializer;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "DUMMY", onExtraCallback = getSigningCertificate.class), @gb(IAuthTabCallback = "ACCOUNT_SCRAPING", onExtraCallback = putInteger.class), @gb(IAuthTabCallback = "WAITING", onExtraCallback = unregisterActivityCallbacks.class), @gb(IAuthTabCallback = "POLLING", onExtraCallback = getActivityStateMap.class)}, onNavigationEvent = "type")
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class FbValidationUtils implements Parcelable {
    public abstract String onNavigationEvent();

    public abstract long onWarmupCompleted();
}
