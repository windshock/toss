package o;

import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import im.toss.network.serialization.PolymorphicTypeDeserializer;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "SHOW_CHOICE", onExtraCallback = BaseActivityEventListener.class), @gb(IAuthTabCallback = "SHOW_WRITE", onExtraCallback = ArgumentsWhenMappings.class), @gb(IAuthTabCallback = "JUMP_TO_SCHEME", onExtraCallback = fromList.class)}, onNavigationEvent = "type")
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface fromJavaArgs extends Parcelable {
}
