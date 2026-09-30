package o;

import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ycxdj1 extends jc2 implements Comparable<ycxdj1> {
    private final ObjectId onExtraCallbackWithResult;

    public ycxdj1() {
        this(new ObjectId());
    }

    public ycxdj1(ObjectId objectId) {
        if (objectId == null) {
            throw new IllegalArgumentException("value may not be null");
        }
        this.onExtraCallbackWithResult = objectId;
    }

    public ObjectId onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.OBJECT_ID;
    }

    @Override // java.lang.Comparable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int compareTo(ycxdj1 ycxdj1Var) {
        return this.onExtraCallbackWithResult.onWarmupCompleted(ycxdj1Var.onExtraCallbackWithResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.onExtraCallbackWithResult.equals(((ycxdj1) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "BsonObjectId{value=" + this.onExtraCallbackWithResult.onExtraCallbackWithResult() + '}';
    }
}
