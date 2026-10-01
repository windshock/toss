package com.google.common.collect;

import java.util.Collection;

@ElementTypesAreNonnullByDefault
/* loaded from: /tmp/toss_alldex/classes19.dex */
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    static final EmptyImmutableListMultimap INSTANCE = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.of(), 0);
    }

    /* renamed from: asMap, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<Object, Collection<Object>> m60asMap() {
        return super/*com.google.common.collect.ImmutableMultimap*/.asMap();
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
