package o;

import java.util.List;
import o.AppBarKtExternalSyntheticLambda6;
import o.AppBarKtExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AppBarKtExternalSyntheticLambda6 {
    public static final AppBarKtExternalSyntheticLambda6 onExtraCallback = new AppBarKtExternalSyntheticLambda6() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecSelector$$ExternalSyntheticLambda0
        @Override // o.AppBarKtExternalSyntheticLambda6
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return AppBarKtExternalSyntheticLambda9.onExtraCallback(str, z, z2);
        }
    };
    public static final AppBarKtExternalSyntheticLambda6 onWarmupCompleted = new AppBarKtExternalSyntheticLambda6() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecSelector$$ExternalSyntheticLambda1
        @Override // o.AppBarKtExternalSyntheticLambda6
        public final List getDecoderInfos(String str, boolean z, boolean z2) {
            return AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda6.onExtraCallback.getDecoderInfos(str, z, z2));
        }
    };

    List<AppBarKtExternalSyntheticLambda5> getDecoderInfos(String str, boolean z, boolean z2) throws AppBarKtExternalSyntheticLambda9.onExtraCallback;
}
