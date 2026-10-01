package o;

import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ResolvableFuture implements Resource<byte[]> {
    private final byte[] onExtraCallbackWithResult;

    @Override // com.bumptech.glide.load.engine.Resource
    public void asBinder() {
    }

    public ResolvableFuture(byte[] bArr) {
        this.onExtraCallbackWithResult = (byte[]) markHierarchyDirty.onExtraCallbackWithResult(bArr);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class<byte[]> onExtraCallbackWithResult() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public byte[] IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult.length;
    }
}
