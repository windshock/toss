package o;

import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import im.toss.network.serialization.PolymorphicTypeDeserializer;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "LIST", onExtraCallback = DynamicLoaderFactoryExternalSyntheticApiModelOutline0.class), @gb(IAuthTabCallback = "TABLE", onExtraCallback = DynamicLoaderFallback.class)}, onNavigationEvent = "type")
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface makeFallbackLoader extends Parcelable {
}
