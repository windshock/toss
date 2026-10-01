package viva.republica.toss.common.web.message.handlers.cascraping;

import kotlin.jvm.functions.Function1;
import o.getSemanticsIdentifier;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AbsCaScrapingMessageHandler$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AbsCaScrapingMessageHandler$$ExternalSyntheticLambda0(boolean z, String str) {
        this.f$0 = z;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        return getSemanticsIdentifier.onWarmupCompleted(this.f$0, this.f$1, (startRunning) obj);
    }
}
