package o;

import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import im.toss.network.serialization.PolymorphicTypeDeserializer;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "PARAGRAPH", onExtraCallback = stackTraceToString.class), @gb(IAuthTabCallback = "ORDER", onExtraCallback = DynamicLoaderFactoryExternalSyntheticApiModelOutline1.class), @gb(IAuthTabCallback = "UNORDER", onExtraCallback = setFallbackMode.class), @gb(IAuthTabCallback = "TABLE_ROW", onExtraCallback = DynamicLoaderFactoryRemoteClassLoaderFactory.class), @gb(IAuthTabCallback = "IMAGE", onExtraCallback = mkdirChecked.class), @gb(IAuthTabCallback = "LIST_ROW", onExtraCallback = makeAdsSdkClassLoader.class), @gb(IAuthTabCallback = "LINE", onExtraCallback = makeLegacyAdsSdkClassLoader.class)}, onNavigationEvent = "type")
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface makeLoaderUnsafe extends Parcelable {
}
