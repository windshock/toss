package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ChipKtExternalSyntheticLambda0 {
    public static final ChipKtExternalSyntheticLambda0 onExtraCallbackWithResult = new ChipKtExternalSyntheticLambda0() { // from class: o.ChipKtExternalSyntheticLambda0.5
        private final ProgressIndicatorKtExternalSyntheticLambda7 IAuthTabCallback = new ProgressIndicatorKtExternalSyntheticLambda7();

        @Override // o.ChipKtExternalSyntheticLambda0
        public boolean onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            return this.IAuthTabCallback.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[ADDED_TO_REGION] */
        @Override // o.ChipKtExternalSyntheticLambda0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RadioButtonKtExternalSyntheticLambda0 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            char c;
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode == 930165504) {
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 0;
                    }
                    if (c != 0) {
                    }
                    return new RippleNodeFactory(str, basicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted, 16000L);
                }
                if (iHashCode == 1566015601) {
                    if (str.equals("application/cea-608")) {
                        c = 1;
                    }
                    if (c != 0) {
                    }
                    return new RippleNodeFactory(str, basicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted, 16000L);
                }
                c = (iHashCode == 1566016562 && str.equals("application/cea-708")) ? (char) 2 : (char) 65535;
                if (c != 0 || c == 1) {
                    return new RippleNodeFactory(str, basicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted, 16000L);
                }
                if (c == 2) {
                    return new ScaffoldKtExternalSyntheticLambda10(basicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted, basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
                }
            }
            if (this.IAuthTabCallback.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                RippleKtExternalSyntheticLambda0 rippleKtExternalSyntheticLambda0IAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                return new CheckboxKtExternalSyntheticLambda6(rippleKtExternalSyntheticLambda0IAuthTabCallback.getClass().getSimpleName() + "Decoder", rippleKtExternalSyntheticLambda0IAuthTabCallback);
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    RadioButtonKtExternalSyntheticLambda0 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

    boolean onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);
}
