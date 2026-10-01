package o;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda43 extends SaversKtExternalSyntheticLambda31<InputStream> {
    public SaversKtExternalSyntheticLambda43(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda31
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public InputStream onExtraCallback(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda31
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public Class<InputStream> onNavigationEvent() {
        return InputStream.class;
    }
}
