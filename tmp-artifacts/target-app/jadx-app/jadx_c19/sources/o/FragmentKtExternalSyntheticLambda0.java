package o;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class FragmentKtExternalSyntheticLambda0 implements Serializable {
    private static final long serialVersionUID = 1;
    protected hasOptionsMenu _encodedSimple;
    protected final String _namespace;
    protected final String _simpleName;
    public static final FragmentKtExternalSyntheticLambda0 onNavigationEvent = new FragmentKtExternalSyntheticLambda0("", null);
    public static final FragmentKtExternalSyntheticLambda0 onExtraCallback = new FragmentKtExternalSyntheticLambda0(new String(""), null);

    public FragmentKtExternalSyntheticLambda0(String str) {
        this(str, null);
    }

    public FragmentKtExternalSyntheticLambda0(String str, String str2) {
        this._simpleName = SavedStateHandleImplExternalSyntheticLambda0.onExtraCallback(str);
        this._namespace = str2;
    }

    protected Object readResolve() {
        String str;
        return (this._namespace == null && ((str = this._simpleName) == null || "".equals(str))) ? onNavigationEvent : this;
    }

    public static FragmentKtExternalSyntheticLambda0 onExtraCallbackWithResult(String str) {
        if (str == null || str.isEmpty()) {
            return onNavigationEvent;
        }
        return new FragmentKtExternalSyntheticLambda0(setTargetFragment.onExtraCallbackWithResult.onNavigationEvent(str), null);
    }

    public static FragmentKtExternalSyntheticLambda0 onWarmupCompleted(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.isEmpty()) {
            return onNavigationEvent;
        }
        return new FragmentKtExternalSyntheticLambda0(setTargetFragment.onExtraCallbackWithResult.onNavigationEvent(str), str2);
    }

    public FragmentKtExternalSyntheticLambda0 onWarmupCompleted() {
        String strOnNavigationEvent;
        return (this._simpleName.isEmpty() || (strOnNavigationEvent = setTargetFragment.onExtraCallbackWithResult.onNavigationEvent(this._simpleName)) == this._simpleName) ? this : new FragmentKtExternalSyntheticLambda0(strOnNavigationEvent, this._namespace);
    }

    public FragmentKtExternalSyntheticLambda0 IAuthTabCallback(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this._simpleName) ? this : new FragmentKtExternalSyntheticLambda0(str, this._namespace);
    }

    public String onExtraCallbackWithResult() {
        return this._simpleName;
    }

    public hasOptionsMenu onExtraCallbackWithResult(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27) {
        hasOptionsMenu hasoptionsmenuOnWarmupCompleted;
        hasOptionsMenu hasoptionsmenu = this._encodedSimple;
        if (hasoptionsmenu != null) {
            return hasoptionsmenu;
        }
        if (radioButtonKtRadioButtonElement27 == null) {
            hasoptionsmenuOnWarmupCompleted = new requireHost(this._simpleName);
        } else {
            hasoptionsmenuOnWarmupCompleted = radioButtonKtRadioButtonElement27.onWarmupCompleted(this._simpleName);
        }
        this._encodedSimple = hasoptionsmenuOnWarmupCompleted;
        return hasoptionsmenuOnWarmupCompleted;
    }

    public boolean IAuthTabCallback() {
        return !this._simpleName.isEmpty();
    }

    public boolean onWarmupCompleted(String str) {
        return this._simpleName.equals(str);
    }

    public boolean onNavigationEvent() {
        return this._namespace != null;
    }

    public boolean onExtraCallback() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0 = (FragmentKtExternalSyntheticLambda0) obj;
        String str = this._simpleName;
        if (str == null) {
            if (fragmentKtExternalSyntheticLambda0._simpleName != null) {
                return false;
            }
        } else if (!str.equals(fragmentKtExternalSyntheticLambda0._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        if (str2 == null) {
            return fragmentKtExternalSyntheticLambda0._namespace == null;
        }
        return str2.equals(fragmentKtExternalSyntheticLambda0._namespace);
    }

    public int hashCode() {
        return (Objects.hashCode(this._simpleName) * 31) + Objects.hashCode(this._namespace);
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        return "{" + this._namespace + "}" + this._simpleName;
    }
}
