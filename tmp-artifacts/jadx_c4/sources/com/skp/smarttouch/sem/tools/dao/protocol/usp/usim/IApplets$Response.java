package com.skp.smarttouch.sem.tools.dao.protocol.usp.usim;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.AbstractUspResponse;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IApplets;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class IApplets$Response extends AbstractUspResponse {
    protected IApplets.BodyOfIApplets body = null;

    public void setBody(IApplets.BodyOfIApplets bodyOfIApplets) {
        this.body = bodyOfIApplets;
    }

    public IApplets.BodyOfIApplets getBody() {
        return this.body;
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.body) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 133);
            IApplets.BodyOfIApplets bodyOfIApplets = this.body;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, IApplets.BodyOfIApplets.class, bodyOfIApplets).write(jsonWriter, bodyOfIApplets);
        }
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
    }

    public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onWarmupCompleted(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 464) {
            IAuthTabCallback(gson, jsonReader, i);
        } else if (z) {
            this.body = (IApplets.BodyOfIApplets) gson.getAdapter(IApplets.BodyOfIApplets.class).read(jsonReader);
        } else {
            this.body = null;
            jsonReader.nextNull();
        }
    }
}
