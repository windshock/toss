package com.alibaba.ariver.kernel.api.extension.resolver;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class BoolPositiveResolver implements ResultResolver<Boolean> {
    /* renamed from: resolve, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m1resolve(List list) {
        return resolve((List<Boolean>) list);
    }

    public Boolean resolve(List<Boolean> list) {
        boolean z;
        if (list != null) {
            for (Boolean bool : list) {
                if (bool != null && bool.booleanValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
