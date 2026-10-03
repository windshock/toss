package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class initializelambda0 extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;

    public initializelambda0(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.onNavigationEvent.onNavigationEvent(jsonWriter, obj == unstable_isLegacyModuleRegistered.REGULAR ? 325 : obj == unstable_isLegacyModuleRegistered.MEDIUM ? 85 : obj == unstable_isLegacyModuleRegistered.BOLD ? 549 : -1);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        int iOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(jsonReader);
        if (iOnExtraCallbackWithResult == 247) {
            return unstable_isLegacyModuleRegistered.REGULAR;
        }
        if (iOnExtraCallbackWithResult == 261) {
            return unstable_isLegacyModuleRegistered.BOLD;
        }
        if (iOnExtraCallbackWithResult != 754) {
            return null;
        }
        return unstable_isLegacyModuleRegistered.MEDIUM;
    }
}
