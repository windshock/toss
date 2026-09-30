package o;

import android.media.Image;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getScrollState extends hasFixedSize<Image> {
    public getScrollState(int i2) {
        super(i2, Image.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasFixedSize
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(@NonNull Image image, boolean z) {
        try {
            image.close();
        } catch (Exception unused) {
        }
    }
}
