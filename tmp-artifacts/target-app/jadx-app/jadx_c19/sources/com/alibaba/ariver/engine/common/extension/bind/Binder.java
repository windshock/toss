package com.alibaba.ariver.engine.common.extension.bind;

import java.lang.annotation.Annotation;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface Binder<A extends Annotation, T> {
    T bind(Class<T> cls, A a) throws BindException;
}
