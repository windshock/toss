package viva.republica.toss.tosscert.privatepki.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SignedData$Companion {
    public /* synthetic */ SignedData$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SignedData$Companion() {
    }

    public final KSerializer<SignedData> serializer() {
        return SignedData$$serializer.INSTANCE;
    }
}
