package o;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestLoggingListenerCompanion {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private List<ProducerSequenceFactoryExternalSyntheticLambda4> emojis;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLoggingListenerCompanion)) {
            int i5 = i2 + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.emojis, ((RequestLoggingListenerCompanion) obj).emojis)) {
            return false;
        }
        int i7 = onExtraCallback + 7;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.emojis.hashCode();
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EmojiProfileList(emojis=" + this.emojis + ")";
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<ProducerSequenceFactoryExternalSyntheticLambda4> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<ProducerSequenceFactoryExternalSyntheticLambda4> list = this.emojis;
        int i5 = i3 + 7;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.emojis) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 229);
            RenderScriptBlurFilter renderScriptBlurFilter = new RenderScriptBlurFilter();
            List<ProducerSequenceFactoryExternalSyntheticLambda4> list = this.emojis;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, renderScriptBlurFilter, list).write(jsonWriter, list);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 594) {
            jsonReader.skipValue();
        } else if (z) {
            this.emojis = (List) gson.getAdapter(new RenderScriptBlurFilter()).read(jsonReader);
        } else {
            this.emojis = null;
            jsonReader.nextNull();
        }
    }
}
