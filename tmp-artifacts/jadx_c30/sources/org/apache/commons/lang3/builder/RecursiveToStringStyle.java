package org.apache.commons.lang3.builder;

import java.util.Collection;
import o.BackupConstant;
import o.onVideoError;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RecursiveToStringStyle extends BackupConstant {
    private static final long serialVersionUID = 1;

    protected boolean onExtraCallback(Class<?> cls) {
        return true;
    }

    @Override // o.BackupConstant
    public void onNavigationEvent(StringBuffer stringBuffer, String str, Object obj) {
        if (!onVideoError.onWarmupCompleted(obj.getClass()) && !String.class.equals(obj.getClass()) && onExtraCallback(obj.getClass())) {
            stringBuffer.append(ReflectionToStringBuilder.onWarmupCompleted(obj, this));
        } else {
            super.onNavigationEvent(stringBuffer, str, obj);
        }
    }

    @Override // o.BackupConstant
    public void onExtraCallback(StringBuffer stringBuffer, String str, Collection<?> collection) {
        onExtraCallbackWithResult(stringBuffer, collection);
        IAuthTabCallback(stringBuffer, collection);
        IAuthTabCallback(stringBuffer, str, collection.toArray());
    }
}
