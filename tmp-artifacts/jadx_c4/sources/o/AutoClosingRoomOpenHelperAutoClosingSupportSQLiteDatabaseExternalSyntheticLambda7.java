package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.UCAD0001ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda7 extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private Gson onNavigationEvent;

    public AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda7(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((UCAD0001ResponseDTO.Response) obj).onNavigationEvent(this.onNavigationEvent, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        UCAD0001ResponseDTO.Response response = new UCAD0001ResponseDTO.Response();
        response.onExtraCallback(this.onNavigationEvent, jsonReader, this.IAuthTabCallback);
        return response;
    }
}
