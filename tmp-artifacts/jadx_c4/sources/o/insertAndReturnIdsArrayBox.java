package o;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.dto.PointResult;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class insertAndReturnIdsArrayBox extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public insertAndReturnIdsArrayBox(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((PointResult) obj).onExtraCallbackWithResult(this.IAuthTabCallback, jsonWriter, this.onExtraCallbackWithResult);
        }
    }

    public Object read(JsonReader jsonReader) throws JsonSyntaxException, IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        PointResult pointResult = new PointResult();
        pointResult.onNavigationEvent(this.IAuthTabCallback, jsonReader, this.onWarmupCompleted);
        return pointResult;
    }
}
