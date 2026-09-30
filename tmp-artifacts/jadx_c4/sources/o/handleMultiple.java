package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.dto.CreditCardGroupDto;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class handleMultiple extends TypeAdapter implements getGainFactorAt {
    private Gson onExtraCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public handleMultiple(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallback = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((CreditCardGroupDto) obj).onNavigationEvent(this.onExtraCallback, jsonWriter, this.onExtraCallbackWithResult);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CreditCardGroupDto creditCardGroupDto = new CreditCardGroupDto();
        creditCardGroupDto.IAuthTabCallback(this.onExtraCallback, jsonReader, this.onWarmupCompleted);
        return creditCardGroupDto;
    }
}
