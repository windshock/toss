package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface BackdropScaffoldKtExternalSyntheticLambda13 {
    public static final BackdropScaffoldKtExternalSyntheticLambda13 IAuthTabCallback = new BackdropScaffoldKtExternalSyntheticLambda13() { // from class: o.BackdropScaffoldKtExternalSyntheticLambda13.4
        @Override // o.BackdropScaffoldKtExternalSyntheticLambda13
        public boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
        @Override // o.BackdropScaffoldKtExternalSyntheticLambda13
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MaterialThemeKtExternalSyntheticLambda2 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            char c;
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1354451219:
                        if (!str.equals("application/vnd.dvb.ait")) {
                            c = 65535;
                            break;
                        } else {
                            c = 0;
                            break;
                        }
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return new MenuKtExternalSyntheticLambda2();
                }
                if (c == 1) {
                    return new MinimumInteractiveComponentSizeModifierExternalSyntheticLambda0();
                }
                if (c == 2) {
                    return new ModalBottomSheetKtExternalSyntheticLambda2();
                }
                if (c == 3) {
                    return new MinimumInteractiveModifierNodeExternalSyntheticLambda0();
                }
                if (c == 4) {
                    return new NavigationRailKtExternalSyntheticLambda4();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    MaterialThemeKtExternalSyntheticLambda2 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

    boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);
}
