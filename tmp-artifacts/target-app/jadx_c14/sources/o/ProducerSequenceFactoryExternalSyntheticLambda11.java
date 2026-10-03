package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.ImagePipelineExternalSyntheticLambda4;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda11 extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;
    private Gson onWarmupCompleted;

    public ProducerSequenceFactoryExternalSyntheticLambda11(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.onNavigationEvent.onNavigationEvent(jsonWriter, obj == ImagePipelineExternalSyntheticLambda4.onWarmupCompleted.LANDING ? 171 : obj == ImagePipelineExternalSyntheticLambda4.onWarmupCompleted.BACK ? 410 : -1);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        int iOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(jsonReader);
        if (iOnExtraCallbackWithResult == 67) {
            return ImagePipelineExternalSyntheticLambda4.onWarmupCompleted.LANDING;
        }
        if (iOnExtraCallbackWithResult != 269) {
            return null;
        }
        return ImagePipelineExternalSyntheticLambda4.onWarmupCompleted.BACK;
    }
}
