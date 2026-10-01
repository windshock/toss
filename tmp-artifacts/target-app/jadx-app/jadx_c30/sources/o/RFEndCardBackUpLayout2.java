package o;

import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RFEndCardBackUpLayout2 extends jc2 {
    private final ObjectId IAuthTabCallback;
    private final String onExtraCallbackWithResult;

    public RFEndCardBackUpLayout2(String str, ObjectId objectId) {
        if (str == null) {
            throw new IllegalArgumentException("namespace can not be null");
        }
        if (objectId == null) {
            throw new IllegalArgumentException("id can not be null");
        }
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = objectId;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.DB_POINTER;
    }

    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public ObjectId onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RFEndCardBackUpLayout2 rFEndCardBackUpLayout2 = (RFEndCardBackUpLayout2) obj;
        return this.IAuthTabCallback.equals(rFEndCardBackUpLayout2.IAuthTabCallback) && this.onExtraCallbackWithResult.equals(rFEndCardBackUpLayout2.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult.hashCode() * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return "BsonDbPointer{namespace='" + this.onExtraCallbackWithResult + "', id=" + this.IAuthTabCallback + '}';
    }
}
