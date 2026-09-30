package io.reactivex.subscribers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.JsonReaderReadObject;
import o.deserializeShortNullableCollection;
import o.deserializeUriNullableCollection;
import o.ycxExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class ResourceSubscriber<T> implements JsonReaderReadObject<T>, deserializeUriNullableCollection {
    private final AtomicReference<ycxExternalSyntheticLambda1> onExtraCallback = new AtomicReference<>();
    private final deserializeShortNullableCollection onWarmupCompleted = new deserializeShortNullableCollection();
    private final AtomicLong onExtraCallbackWithResult = new AtomicLong();
}
