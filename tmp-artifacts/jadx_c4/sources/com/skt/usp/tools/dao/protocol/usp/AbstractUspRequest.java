package com.skt.usp.tools.dao.protocol.usp;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.dao.AbstractDao;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractUspRequest extends AbstractDao {
    protected HeaderOfUsp header = null;

    public void setHeader(HeaderOfUsp headerOfUsp) {
        this.header = headerOfUsp;
    }

    public HeaderOfUsp getHeader() {
        return this.header;
    }

    public void setUspHeader(Context context, String str, String str2) {
        this.header = new HeaderOfUsp(context, str, str2);
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.header) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 833);
            HeaderOfUsp headerOfUsp = this.header;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, HeaderOfUsp.class, headerOfUsp).write(jsonWriter, headerOfUsp);
        }
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 130) {
            IAuthTabCallback(gson, jsonReader, i);
        } else if (z) {
            this.header = (HeaderOfUsp) gson.getAdapter(HeaderOfUsp.class).read(jsonReader);
        } else {
            this.header = null;
            jsonReader.nextNull();
        }
    }
}
