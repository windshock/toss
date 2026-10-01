package viva.republica.toss.common.web.message.handlers.cascraping;

import com.google.gson.JsonElement;
import kotlin.jvm.functions.Function1;
import o.getSemanticsIdentifier;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AbsCaScrapingMessageHandler$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ JsonElement f$1;

    public /* synthetic */ AbsCaScrapingMessageHandler$$ExternalSyntheticLambda1(String str, JsonElement jsonElement) {
        this.f$0 = str;
        this.f$1 = jsonElement;
    }

    public final Object invoke(Object obj) {
        return getSemanticsIdentifier.onWarmupCompleted(this.f$0, this.f$1, (startRunning) obj);
    }
}
