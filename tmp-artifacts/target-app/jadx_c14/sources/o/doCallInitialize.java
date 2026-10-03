package o;

import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import im.toss.network.serialization.PolymorphicTypeDeserializer;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "FOLDER", onExtraCallback = getCacheCodeDirLegacy.class), @gb(IAuthTabCallback = "PLAIN", onExtraCallback = getDynamicLoader.class), @gb(IAuthTabCallback = "LINE", onExtraCallback = getApplicationContextViaReflection.class), @gb(IAuthTabCallback = "SPACE", onExtraCallback = isFallbackMode.class), @gb(IAuthTabCallback = "BOX", onExtraCallback = maybeInitInternally.class)}, onNavigationEvent = "type")
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface doCallInitialize extends Parcelable {
}
