package o;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import o.FragmentManagerExternalSyntheticLambda5;
import o.internalPathIteratorSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class nSetDesiredPresentTime extends internalPathIteratorSize {
    protected final RadioButtonKtRadioButtonElement27<?> IAuthTabCallback;
    protected final boolean asBinder;
    protected final String asInterface;
    protected final AngleMeasurerExternalSyntheticLambda0 onExtraCallback;
    protected final String onExtraCallbackWithResult;
    protected final String onNavigationEvent;
    protected final boolean onTransact;
    protected final onExtraCallback onWarmupCompleted;

    public interface onExtraCallback {
        boolean onWarmupCompleted(char c, String str, int i2);
    }

    @Override // o.internalPathIteratorSize
    public String onExtraCallbackWithResult(RoundedPolygonKt roundedPolygonKt, String str) {
        return str;
    }

    protected nSetDesiredPresentTime(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, String str, String str2, String str3, onExtraCallback onextracallback) {
        this.IAuthTabCallback = radioButtonKtRadioButtonElement27;
        this.onExtraCallback = angleMeasurerExternalSyntheticLambda0;
        this.asBinder = radioButtonKtRadioButtonElement27.onExtraCallback(setLayoutTransition.USE_STD_BEAN_NAMING);
        this.onTransact = radioButtonKtRadioButtonElement27.onExtraCallback(setLayoutTransition.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this.asInterface = str;
        this.onNavigationEvent = str2;
        this.onExtraCallbackWithResult = str3;
        this.onWarmupCompleted = onextracallback;
    }

    @Override // o.internalPathIteratorSize
    public String IAuthTabCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, String str) {
        if (this.onExtraCallbackWithResult == null) {
            return null;
        }
        if ((!this.onTransact && !onExtraCallback(ngetpreviousreleasefencefd.IAuthTabCallback())) || !str.startsWith(this.onExtraCallbackWithResult)) {
            return null;
        }
        if (this.asBinder) {
            return onExtraCallback(str, this.onExtraCallbackWithResult.length());
        }
        return onWarmupCompleted(str, this.onExtraCallbackWithResult.length());
    }

    private boolean onExtraCallback(JavaType javaType) {
        if (javaType.IAuthTabCallback()) {
            javaType = javaType.onNavigationEvent();
        }
        return javaType.onNavigationEvent(Boolean.TYPE) || javaType.onNavigationEvent(Boolean.class) || javaType.onNavigationEvent(AtomicBoolean.class);
    }

    @Override // o.internalPathIteratorSize
    public String onExtraCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, String str) {
        String str2 = this.onNavigationEvent;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (IAuthTabCallback(ngetpreviousreleasefencefd)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && onExtraCallbackWithResult(ngetpreviousreleasefencefd)) {
            return null;
        }
        if (this.asBinder) {
            return onExtraCallback(str, this.onNavigationEvent.length());
        }
        return onWarmupCompleted(str, this.onNavigationEvent.length());
    }

    @Override // o.internalPathIteratorSize
    public String onExtraCallbackWithResult(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd, String str) {
        String str2 = this.asInterface;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if (this.asBinder) {
            return onExtraCallback(str, this.asInterface.length());
        }
        return onWarmupCompleted(str, this.asInterface.length());
    }

    protected String onWarmupCompleted(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char cCharAt = str.charAt(i2);
        onExtraCallback onextracallback = this.onWarmupCompleted;
        if (onextracallback != null && !onextracallback.onWarmupCompleted(cCharAt, str, i2)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        while (true) {
            i2++;
            if (i2 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i2);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i2, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    protected String onExtraCallback(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char cCharAt = str.charAt(i2);
        onExtraCallback onextracallback = this.onWarmupCompleted;
        if (onextracallback != null && !onextracallback.onWarmupCompleted(cCharAt, str, i2)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i2);
        }
        int i3 = i2 + 1;
        if (i3 < length && Character.isUpperCase(str.charAt(i3))) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i3, length);
        return sb.toString();
    }

    protected boolean IAuthTabCallback(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
        Class clsOnNavigationEvent = ngetpreviousreleasefencefd.onNavigationEvent();
        if (clsOnNavigationEvent.isArray()) {
            String name = clsOnNavigationEvent.getComponentType().getName();
            if (name.contains(".cglib")) {
                return name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib");
            }
        }
        return false;
    }

    protected boolean onExtraCallbackWithResult(nGetPreviousReleaseFenceFd ngetpreviousreleasefencefd) {
        return ngetpreviousreleasefencefd.onNavigationEvent().getName().startsWith("groovy.lang");
    }

    public static class onNavigationEvent extends internalPathIteratorSize.onNavigationEvent implements Serializable {
        private static final long serialVersionUID = 1;
        protected final onExtraCallback _baseNameValidator;
        protected final String _getterPrefix;
        protected final String _isGetterPrefix;
        protected final String _setterPrefix;
        protected final String _withPrefix;

        public onNavigationEvent() {
            this("set", "with", "get", "is", null);
        }

        protected onNavigationEvent(String str, String str2, String str3, String str4, onExtraCallback onextracallback) {
            this._setterPrefix = str;
            this._withPrefix = str2;
            this._getterPrefix = str3;
            this._isGetterPrefix = str4;
            this._baseNameValidator = onextracallback;
        }

        @Override // o.internalPathIteratorSize.onNavigationEvent
        public internalPathIteratorSize onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
            return new nSetDesiredPresentTime(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0, this._setterPrefix, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        @Override // o.internalPathIteratorSize.onNavigationEvent
        public internalPathIteratorSize onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, onStateNotSaved onstatenotsaved) {
            startActivityFromFragment startactivityfromfragmentAsBinder = radioButtonKtRadioButtonElement27.ICustomTabsCallback() ? radioButtonKtRadioButtonElement27.asBinder() : null;
            FragmentManagerExternalSyntheticLambda5.IAuthTabCallback IAuthTabCallback = startactivityfromfragmentAsBinder != null ? startactivityfromfragmentAsBinder.IAuthTabCallback(angleMeasurerExternalSyntheticLambda0) : null;
            return new nSetDesiredPresentTime(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0, IAuthTabCallback == null ? this._withPrefix : IAuthTabCallback.onWarmupCompleted, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        @Override // o.internalPathIteratorSize.onNavigationEvent
        public internalPathIteratorSize onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
            return new onExtraCallbackWithResult(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0);
        }
    }
}
