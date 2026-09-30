package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.MSS0004ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RxRoomCompanionExternalSyntheticLambda1 extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private Gson onExtraCallbackWithResult;

    public RxRoomCompanionExternalSyntheticLambda1(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((MSS0004ResponseDTO) obj).onNavigationEvent(this.onExtraCallbackWithResult, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MSS0004ResponseDTO mSS0004ResponseDTO = new MSS0004ResponseDTO();
        mSS0004ResponseDTO.onExtraCallbackWithResult(this.onExtraCallbackWithResult, jsonReader, this.IAuthTabCallback);
        return mSS0004ResponseDTO;
    }
}
