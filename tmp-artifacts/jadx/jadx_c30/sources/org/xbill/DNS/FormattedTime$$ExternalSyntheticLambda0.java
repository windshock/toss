package org.xbill.DNS;

import j$.time.Instant;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FormattedTime$$ExternalSyntheticLambda0 implements TemporalQuery {
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
