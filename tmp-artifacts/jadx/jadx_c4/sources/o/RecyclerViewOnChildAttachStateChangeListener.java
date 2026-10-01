package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.statsig.androidsdk.HashAlgorithm;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RecyclerViewOnChildAttachStateChangeListener extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallbackWithResult;

    public RecyclerViewOnChildAttachStateChangeListener(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.onExtraCallback.onNavigationEvent(jsonWriter, obj == HashAlgorithm.SHA256 ? 584 : obj == HashAlgorithm.DJB2 ? 126 : obj == HashAlgorithm.NONE ? 827 : -1);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        int iOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(jsonReader);
        if (iOnExtraCallbackWithResult == 8) {
            return HashAlgorithm.DJB2;
        }
        if (iOnExtraCallbackWithResult == 393) {
            return HashAlgorithm.NONE;
        }
        if (iOnExtraCallbackWithResult != 528) {
            return null;
        }
        return HashAlgorithm.SHA256;
    }
}
