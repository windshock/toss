package org.chromium.support_lib_boundary;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface NoVarySearchDataBoundaryInterface {
    List<String> getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    List<String> getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
