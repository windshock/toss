package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PagerKtExternalSyntheticLambda0 {

    interface onNavigationEvent {
        byte onExtraCallback(int i2);

        int onWarmupCompleted();
    }

    static String IAuthTabCallback(onNavigationEvent onnavigationevent) {
        StringBuilder sb = new StringBuilder(onnavigationevent.onWarmupCompleted());
        for (int i2 = 0; i2 < onnavigationevent.onWarmupCompleted(); i2++) {
            byte bOnExtraCallback = onnavigationevent.onExtraCallback(i2);
            if (bOnExtraCallback == 34) {
                sb.append("\\\"");
            } else if (bOnExtraCallback == 39) {
                sb.append("\\'");
            } else if (bOnExtraCallback != 92) {
                switch (bOnExtraCallback) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bOnExtraCallback >= 32 && bOnExtraCallback <= 126) {
                            sb.append((char) bOnExtraCallback);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bOnExtraCallback >>> 6) & 3) + 48));
                            sb.append((char) (((bOnExtraCallback >>> 3) & 7) + 48));
                            sb.append((char) ((bOnExtraCallback & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String IAuthTabCallback(final LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3) {
        return IAuthTabCallback(new onNavigationEvent() { // from class: o.PagerKtExternalSyntheticLambda0.5
            @Override // o.PagerKtExternalSyntheticLambda0.onNavigationEvent
            public int onWarmupCompleted() {
                return lazyLayoutKtExternalSyntheticLambda3.onTransact();
            }

            @Override // o.PagerKtExternalSyntheticLambda0.onNavigationEvent
            public byte onExtraCallback(int i2) {
                return lazyLayoutKtExternalSyntheticLambda3.onExtraCallback(i2);
            }
        });
    }

    static String onNavigationEvent(String str) {
        return IAuthTabCallback(LazyLayoutKtExternalSyntheticLambda3.onExtraCallbackWithResult(str));
    }
}
