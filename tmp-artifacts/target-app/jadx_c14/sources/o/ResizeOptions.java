package o;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResizeOptions {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("component")
    private ResizeOptionsCompanion component;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResizeOptions() {
        ResizeOptionsCompanion resizeOptionsCompanion = null;
        this(resizeOptionsCompanion, 1, resizeOptionsCompanion);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResizeOptions)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component, ((ResizeOptions) obj).component)) {
            return true;
        }
        int i3 = IAuthTabCallback + 57;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 37;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component.hashCode();
        int i4 = IAuthTabCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ErrorComponent(component=" + this.component + ")";
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public ResizeOptions(@NotNull ResizeOptionsCompanion resizeOptionsCompanion) {
        Intrinsics.checkNotNullParameter(resizeOptionsCompanion, "");
        this.component = resizeOptionsCompanion;
    }

    public /* synthetic */ ResizeOptions(ResizeOptionsCompanion resizeOptionsCompanion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            resizeOptionsCompanion = new ResizeOptionsCompanion(null, null, null, null, null, null, 63, null);
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(resizeOptionsCompanion);
    }

    public final ResizeOptionsCompanion onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ResizeOptionsCompanion resizeOptionsCompanion = this.component;
        int i5 = i2 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return resizeOptionsCompanion;
        }
        throw null;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 574);
        ResizeOptionsCompanion resizeOptionsCompanion = this.component;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ResizeOptionsCompanion.class, resizeOptionsCompanion).write(jsonWriter, resizeOptionsCompanion);
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 192) {
            jsonReader.skipValue();
        } else if (z) {
            this.component = (ResizeOptionsCompanion) gson.getAdapter(ResizeOptionsCompanion.class).read(jsonReader);
        } else {
            this.component = null;
            jsonReader.nextNull();
        }
    }
}
