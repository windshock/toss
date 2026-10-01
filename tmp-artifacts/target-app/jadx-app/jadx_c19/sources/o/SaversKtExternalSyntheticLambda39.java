package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda39 extends SaversKtExternalSyntheticLambda31<AssetFileDescriptor> {
    public SaversKtExternalSyntheticLambda39(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda31
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor onExtraCallback(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda31
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public Class<AssetFileDescriptor> onNavigationEvent() {
        return AssetFileDescriptor.class;
    }
}
