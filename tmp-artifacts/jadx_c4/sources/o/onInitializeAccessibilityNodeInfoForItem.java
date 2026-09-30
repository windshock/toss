package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.dao.protocol.urms.IGetPackageAllRight;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onInitializeAccessibilityNodeInfoForItem extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private Gson onNavigationEvent;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public onInitializeAccessibilityNodeInfoForItem(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((IGetPackageAllRight.ReqBodyOfIGetPackageAllRight) obj).IAuthTabCallback(this.onNavigationEvent, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        IGetPackageAllRight.ReqBodyOfIGetPackageAllRight reqBodyOfIGetPackageAllRight = new IGetPackageAllRight.ReqBodyOfIGetPackageAllRight();
        reqBodyOfIGetPackageAllRight.onExtraCallbackWithResult(this.onNavigationEvent, jsonReader, this.IAuthTabCallback);
        return reqBodyOfIGetPackageAllRight;
    }
}
