package o;

import java.util.Objects;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda7 implements RippleKtExternalSyntheticLambda0.onExtraCallback {
    @Override // o.RippleKtExternalSyntheticLambda0.onExtraCallback
    public boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    @Override // o.RippleKtExternalSyntheticLambda0.onExtraCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // o.RippleKtExternalSyntheticLambda0.onExtraCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RippleKtExternalSyntheticLambda0 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new ScaffoldKtExternalSyntheticLambda11(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
                case "application/pgs":
                    return new ScaffoldKtExternalSyntheticLambda3();
                case "application/x-mp4-vtt":
                    return new SliderKtExternalSyntheticLambda1();
                case "text/vtt":
                    return new SliderKtExternalSyntheticLambda13();
                case "application/x-quicktime-tx3g":
                    return new SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda0(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
                case "text/x-ssa":
                    return new ScaffoldKtExternalSyntheticLambda12(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
                case "application/vobsub":
                    return new SliderKtExternalSyntheticLambda0(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
                case "application/x-subrip":
                    return new ScaffoldKtExternalSyntheticLambda5();
                case "application/ttml+xml":
                    return new ScaffoldKtExternalSyntheticLambda9();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
