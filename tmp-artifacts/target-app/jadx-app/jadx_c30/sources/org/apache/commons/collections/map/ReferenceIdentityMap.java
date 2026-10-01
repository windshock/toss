package org.apache.commons.collections.map;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import o.TTLandingPageActivity16;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ReferenceIdentityMap extends TTLandingPageActivity16 implements Serializable {
    private static final long serialVersionUID = -1266190134568365852L;

    @Override // o.TTLandingPageActivity18
    public boolean IAuthTabCallback(Object obj, Object obj2) {
        return obj == obj2;
    }

    public ReferenceIdentityMap() {
        super(0, 1, 16, 0.75f, false);
    }

    @Override // o.TTLandingPageActivity18
    public int onWarmupCompleted(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // o.TTLandingPageActivity16
    public int onNavigationEvent(Object obj, Object obj2) {
        return System.identityHashCode(obj) ^ System.identityHashCode(obj2);
    }

    @Override // o.TTLandingPageActivity16, o.TTLandingPageActivity18
    public boolean onWarmupCompleted(Object obj, Object obj2) {
        if (this.IAuthTabCallbackDefault > 0) {
            obj2 = ((Reference) obj2).get();
        }
        return obj == obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        onExtraCallbackWithResult(objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        onExtraCallbackWithResult(objectInputStream);
    }
}
