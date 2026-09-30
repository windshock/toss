package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda36 extends SaversKtExternalSyntheticLambda40<ParcelFileDescriptor> {
    public SaversKtExternalSyntheticLambda36(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda40
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor IAuthTabCallback(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
            throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
        return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SaversKtExternalSyntheticLambda40
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public Class<ParcelFileDescriptor> onNavigationEvent() {
        return ParcelFileDescriptor.class;
    }
}
