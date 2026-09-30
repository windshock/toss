package o;

import java.io.Serializable;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class loadFragmentClass implements Serializable {
    private static final long serialVersionUID = 2;

    @Deprecated
    public static final loadFragmentClass IAuthTabCallback = new loadFragmentClass();

    @Deprecated
    public static final loadFragmentClass IAuthTabCallbackStub = new asInterface(false);

    @Deprecated
    public static final loadFragmentClass onWarmupCompleted = new onNavigationEvent(false);

    @Deprecated
    public static final loadFragmentClass onExtraCallbackWithResult = new IAuthTabCallback(false);

    @Deprecated
    public static final loadFragmentClass onNavigationEvent = new onExtraCallbackWithResult(false);

    @Deprecated
    public static final loadFragmentClass onExtraCallback = new onExtraCallback(false);

    public String IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nDupFenceFd ndupfencefd, String str) {
        return str;
    }

    public String onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, RoundedPolygonKt roundedPolygonKt, String str) {
        return str;
    }

    public String onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, String str) {
        return str;
    }

    public String onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, String str) {
        return str;
    }

    @Deprecated
    public static abstract class onWarmupCompleted extends loadFragmentClass {
        public abstract String onNavigationEvent(String str);

        protected onWarmupCompleted() {
            this(true);
        }

        protected onWarmupCompleted(boolean z) {
            if (z) {
                String simpleName = getClass().getSimpleName();
                Logger.getLogger(getClass().getName()).warning("PropertyNamingStrategy." + simpleName + " is used but it has been deprecated due to risk of deadlock. Consider using PropertyNamingStrategies." + simpleName + " instead. See https://github.com/FasterXML/jackson-databind/issues/2715 for more details.");
            }
        }

        @Override // o.loadFragmentClass
        public String onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, RoundedPolygonKt roundedPolygonKt, String str) {
            return onNavigationEvent(str);
        }

        @Override // o.loadFragmentClass
        public String onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, String str) {
            return onNavigationEvent(str);
        }

        @Override // o.loadFragmentClass
        public String onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, String str) {
            return onNavigationEvent(str);
        }

        @Override // o.loadFragmentClass
        public String IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nDupFenceFd ndupfencefd, String str) {
            return onNavigationEvent(str);
        }

        protected static String onWarmupCompleted(String str, char c) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                char lowerCase = Character.toLowerCase(cCharAt);
                if (lowerCase == cCharAt) {
                    if (i2 > 1) {
                        sb.insert(sb.length() - 1, c);
                    }
                    i2 = 0;
                } else {
                    if (i2 == 0 && i3 > 0) {
                        sb.append(c);
                    }
                    i2++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }
    }

    @Deprecated
    public static class onNavigationEvent extends onWarmupCompleted {
        public onNavigationEvent() {
        }

        protected onNavigationEvent(boolean z) {
            super(z);
        }

        @Override // o.loadFragmentClass.onWarmupCompleted
        public String onNavigationEvent(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length << 1);
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if (i3 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z && i2 > 0 && sb.charAt(i2 - 1) != '_') {
                            sb.append('_');
                            i2++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(cCharAt);
                    i2++;
                }
            }
            return i2 > 0 ? sb.toString() : str;
        }
    }

    @Deprecated
    public static class asInterface extends onWarmupCompleted {
        public asInterface() {
        }

        protected asInterface(boolean z) {
            super(z);
        }

        @Override // o.loadFragmentClass.onWarmupCompleted
        public String onNavigationEvent(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    @Deprecated
    public static class IAuthTabCallback extends onWarmupCompleted {
        public IAuthTabCallback() {
        }

        protected IAuthTabCallback(boolean z) {
            super(z);
        }

        @Override // o.loadFragmentClass.onWarmupCompleted
        public String onNavigationEvent(String str) {
            return str.toLowerCase();
        }
    }

    @Deprecated
    public static class onExtraCallbackWithResult extends onWarmupCompleted {
        public onExtraCallbackWithResult() {
        }

        protected onExtraCallbackWithResult(boolean z) {
            super(z);
        }

        @Override // o.loadFragmentClass.onWarmupCompleted
        public String onNavigationEvent(String str) {
            return onWarmupCompleted.onWarmupCompleted(str, '-');
        }
    }

    @Deprecated
    public static class onExtraCallback extends onWarmupCompleted {
        public onExtraCallback() {
        }

        protected onExtraCallback(boolean z) {
            super(z);
        }

        @Override // o.loadFragmentClass.onWarmupCompleted
        public String onNavigationEvent(String str) {
            return onWarmupCompleted.onWarmupCompleted(str, '.');
        }
    }
}
