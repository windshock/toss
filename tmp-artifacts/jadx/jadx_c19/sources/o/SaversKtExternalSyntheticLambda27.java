package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda27 extends SaversKtExternalSyntheticLambda40<AssetFileDescriptor> {
    public SaversKtExternalSyntheticLambda27(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda40
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor IAuthTabCallback(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda40
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public Class<AssetFileDescriptor> onNavigationEvent() {
        return AssetFileDescriptor.class;
    }
}
