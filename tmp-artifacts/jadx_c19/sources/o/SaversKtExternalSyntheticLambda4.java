package o;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.SaversKtExternalSyntheticLambda33;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda4 implements SaversKtExternalSyntheticLambda33<InputStream> {
    private final RecyclableBufferedInputStream IAuthTabCallback;

    public SaversKtExternalSyntheticLambda4(InputStream inputStream, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, savers_androidKtExternalSyntheticLambda6);
        this.IAuthTabCallback = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // o.SaversKtExternalSyntheticLambda33
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public InputStream onNavigationEvent() throws IOException {
        this.IAuthTabCallback.reset();
        return this.IAuthTabCallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda33
    public void onWarmupCompleted() {
        this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback.onWarmupCompleted();
    }

    public static final class IAuthTabCallback implements SaversKtExternalSyntheticLambda33.onExtraCallback<InputStream> {
        private final Savers_androidKtExternalSyntheticLambda6 IAuthTabCallback;

        public IAuthTabCallback(Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
            this.IAuthTabCallback = savers_androidKtExternalSyntheticLambda6;
        }

        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public SaversKtExternalSyntheticLambda33<InputStream> onExtraCallback(InputStream inputStream) {
            return new SaversKtExternalSyntheticLambda4(inputStream, this.IAuthTabCallback);
        }

        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        public Class<InputStream> onExtraCallbackWithResult() {
            return InputStream.class;
        }
    }
}
