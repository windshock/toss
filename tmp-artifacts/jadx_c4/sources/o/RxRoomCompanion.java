package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.MSS0003ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RxRoomCompanion extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private Gson onNavigationEvent;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public RxRoomCompanion(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((MSS0003ResponseDTO) obj).onExtraCallback(this.onNavigationEvent, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MSS0003ResponseDTO mSS0003ResponseDTO = new MSS0003ResponseDTO();
        mSS0003ResponseDTO.onExtraCallback(this.onNavigationEvent, jsonReader, this.onWarmupCompleted);
        return mSS0003ResponseDTO;
    }
}
