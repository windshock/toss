package com.alibaba.ariver.kernel.api.extension.resolver;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class BoolIntersectionResolver implements ResultResolver<Boolean> {
    /* renamed from: resolve, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m0resolve(List list) {
        return resolve((List<Boolean>) list);
    }

    public Boolean resolve(List<Boolean> list) {
        if (list == null) {
            return Boolean.FALSE;
        }
        for (Boolean bool : list) {
            if (bool == null) {
                return Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
