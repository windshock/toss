package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTHistoryLandingPageActivity4 implements Serializable {
    protected String name;
    protected transient Class<?> onExtraCallback;
    protected transient Class<?> onExtraCallbackWithResult;

    public boolean onWarmupCompleted() {
        Class<?> cls = this.onExtraCallback;
        if (cls == null) {
            return false;
        }
        return cls.isArray() || List.class.isAssignableFrom(this.onExtraCallback);
    }

    public boolean onNavigationEvent() {
        Class<?> cls = this.onExtraCallback;
        if (cls == null) {
            return false;
        }
        return Map.class.isAssignableFrom(cls);
    }

    public boolean equals(Object obj) {
        boolean z = obj == this;
        if (z || !(obj instanceof TTHistoryLandingPageActivity4)) {
            return z;
        }
        TTHistoryLandingPageActivity4 tTHistoryLandingPageActivity4 = (TTHistoryLandingPageActivity4) obj;
        String str = this.name;
        if (str != null ? str.equals(tTHistoryLandingPageActivity4.name) : tTHistoryLandingPageActivity4.name == null) {
            Class<?> cls = this.onExtraCallback;
            if (cls != null ? cls.equals(tTHistoryLandingPageActivity4.onExtraCallback) : tTHistoryLandingPageActivity4.onExtraCallback == null) {
                Class<?> cls2 = this.onExtraCallbackWithResult;
                Class<?> cls3 = tTHistoryLandingPageActivity4.onExtraCallbackWithResult;
                if (cls2 != null ? cls2.equals(cls3) : cls3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        Class<?> cls = this.onExtraCallback;
        int iHashCode2 = cls == null ? 0 : cls.hashCode();
        Class<?> cls2 = this.onExtraCallbackWithResult;
        return ((((iHashCode + 31) * 31) + iHashCode2) * 31) + (cls2 != null ? cls2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynaProperty[name=");
        sb.append(this.name);
        sb.append(",type=");
        sb.append(this.onExtraCallback);
        if (onNavigationEvent() || onWarmupCompleted()) {
            sb.append(" <");
            sb.append(this.onExtraCallbackWithResult);
            sb.append(">");
        }
        sb.append("]");
        return sb.toString();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        onNavigationEvent(this.onExtraCallback, objectOutputStream);
        if (onNavigationEvent() || onWarmupCompleted()) {
            onNavigationEvent(this.onExtraCallbackWithResult, objectOutputStream);
        }
        objectOutputStream.defaultWriteObject();
    }

    private void onNavigationEvent(Class<?> cls, ObjectOutputStream objectOutputStream) throws IOException {
        int i;
        if (Boolean.TYPE.equals(cls)) {
            i = 1;
        } else if (Byte.TYPE.equals(cls)) {
            i = 2;
        } else if (Character.TYPE.equals(cls)) {
            i = 3;
        } else if (Double.TYPE.equals(cls)) {
            i = 4;
        } else if (Float.TYPE.equals(cls)) {
            i = 5;
        } else if (Integer.TYPE.equals(cls)) {
            i = 6;
        } else if (Long.TYPE.equals(cls)) {
            i = 7;
        } else {
            i = Short.TYPE.equals(cls) ? 8 : 0;
        }
        if (i == 0) {
            objectOutputStream.writeBoolean(false);
            objectOutputStream.writeObject(cls);
        } else {
            objectOutputStream.writeBoolean(true);
            objectOutputStream.writeInt(i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.onExtraCallback = onExtraCallback(objectInputStream);
        if (onNavigationEvent() || onWarmupCompleted()) {
            this.onExtraCallbackWithResult = onExtraCallback(objectInputStream);
        }
        objectInputStream.defaultReadObject();
    }

    private Class<?> onExtraCallback(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        if (objectInputStream.readBoolean()) {
            switch (objectInputStream.readInt()) {
                case 1:
                    return Boolean.TYPE;
                case 2:
                    return Byte.TYPE;
                case 3:
                    return Character.TYPE;
                case 4:
                    return Double.TYPE;
                case 5:
                    return Float.TYPE;
                case 6:
                    return Integer.TYPE;
                case 7:
                    return Long.TYPE;
                case 8:
                    return Short.TYPE;
                default:
                    throw new StreamCorruptedException("Invalid primitive type. Check version of beanutils used to serialize is compatible.");
            }
        }
        return (Class) objectInputStream.readObject();
    }
}
