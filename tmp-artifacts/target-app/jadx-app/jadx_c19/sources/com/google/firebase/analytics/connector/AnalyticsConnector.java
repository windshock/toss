package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AnalyticsConnector {
    void clearConditionalUserProperty(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle);

    List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @Nullable String str2);

    int getMaxUserProperties(@NonNull String str);

    Map<String, Object> getUserProperties(boolean z);

    void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnectorListener analyticsConnectorListener);

    void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty);

    void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj);
}
