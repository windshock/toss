package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.ResizeOptionsCompanion;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda10 extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private Gson onNavigationEvent;

    public ProducerSequenceFactoryExternalSyntheticLambda10(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onExtraCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.onExtraCallbackWithResult.onNavigationEvent(jsonWriter, obj == ResizeOptionsCompanion.IAuthTabCallback.TOAST ? 348 : obj == ResizeOptionsCompanion.IAuthTabCallback.DIALOG ? 60 : obj == ResizeOptionsCompanion.IAuthTabCallback.TEXT ? 617 : obj == ResizeOptionsCompanion.IAuthTabCallback.UNKNOWN ? 531 : -1);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(jsonReader);
        if (iOnExtraCallbackWithResult == 135) {
            return ResizeOptionsCompanion.IAuthTabCallback.DIALOG;
        }
        if (iOnExtraCallbackWithResult == 407) {
            return ResizeOptionsCompanion.IAuthTabCallback.UNKNOWN;
        }
        if (iOnExtraCallbackWithResult == 655) {
            return ResizeOptionsCompanion.IAuthTabCallback.TOAST;
        }
        if (iOnExtraCallbackWithResult != 731) {
            return null;
        }
        return ResizeOptionsCompanion.IAuthTabCallback.TEXT;
    }
}
