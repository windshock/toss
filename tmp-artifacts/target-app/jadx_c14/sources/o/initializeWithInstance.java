package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class initializeWithInstance extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private Gson onNavigationEvent;

    public initializeWithInstance(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU) obj).onExtraCallback(this.onNavigationEvent, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU r8lambdaoa3wfvckspv9ubadkrowki1vuu = new r8lambdaOa3wfVCkSpv9UbaDKRowki1vUU();
        r8lambdaoa3wfvckspv9ubadkrowki1vuu.onNavigationEvent(this.onNavigationEvent, jsonReader, this.IAuthTabCallback);
        return r8lambdaoa3wfvckspv9ubadkrowki1vuu;
    }
}
