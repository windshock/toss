package o;

import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setRefCreativeViews implements dvycx<ObjectId> {
    setRefCreativeViews() {
    }

    @Override // o.dvycx
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(ObjectId objectId, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onWarmupCompleted("$oid", objectId.onExtraCallbackWithResult());
        getjsobject.onWarmupCompleted();
    }
}
