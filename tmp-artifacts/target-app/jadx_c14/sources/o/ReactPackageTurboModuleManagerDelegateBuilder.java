package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactPackageTurboModuleManagerDelegateBuilder extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;
    private Gson onWarmupCompleted;

    public ReactPackageTurboModuleManagerDelegateBuilder(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1) obj).onExtraCallback(this.onWarmupCompleted, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 = new ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1();
        reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted, jsonReader, this.onNavigationEvent);
        return reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1;
    }
}
