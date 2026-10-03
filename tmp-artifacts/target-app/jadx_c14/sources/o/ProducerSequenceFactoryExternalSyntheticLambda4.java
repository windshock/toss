package o;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private String iconName;
    private String iconUrl;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProducerSequenceFactoryExternalSyntheticLambda4)) {
            int i2 = IAuthTabCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ProducerSequenceFactoryExternalSyntheticLambda4 producerSequenceFactoryExternalSyntheticLambda4 = (ProducerSequenceFactoryExternalSyntheticLambda4) obj;
        if (Intrinsics.areEqual(this.iconUrl, producerSequenceFactoryExternalSyntheticLambda4.iconUrl)) {
            return Intrinsics.areEqual(this.iconName, producerSequenceFactoryExternalSyntheticLambda4.iconName);
        }
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.iconUrl.hashCode();
        String str = this.iconName;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i4 = IAuthTabCallback + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EmojiProfile(iconUrl=" + this.iconUrl + ", iconName=" + this.iconName + ")";
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUrl;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.iconName;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 298);
        jsonWriter.value(this.iconName);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 624);
        jsonWriter.value(this.iconUrl);
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 145) {
            if (!z) {
                this.iconName = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.iconName = jsonReader.nextString();
                return;
            } else {
                this.iconName = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 717) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.iconUrl = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.iconUrl = jsonReader.nextString();
        } else {
            this.iconUrl = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
