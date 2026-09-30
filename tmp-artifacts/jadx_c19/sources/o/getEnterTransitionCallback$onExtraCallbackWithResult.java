package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getEnterTransitionCallback$onExtraCallbackWithResult implements Serializable {
    protected static final getEnterTransitionCallback$onExtraCallbackWithResult onExtraCallbackWithResult;
    private static final long serialVersionUID = 1;
    private final getLayoutInflater _contentNulls;
    private final getLayoutInflater _nulls;

    static {
        getLayoutInflater getlayoutinflater = getLayoutInflater.DEFAULT;
        onExtraCallbackWithResult = new getEnterTransitionCallback$onExtraCallbackWithResult(getlayoutinflater, getlayoutinflater);
    }

    protected getEnterTransitionCallback$onExtraCallbackWithResult(getLayoutInflater getlayoutinflater, getLayoutInflater getlayoutinflater2) {
        this._nulls = getlayoutinflater;
        this._contentNulls = getlayoutinflater2;
    }

    protected Object readResolve() {
        return IAuthTabCallback(this._nulls, this._contentNulls) ? onExtraCallbackWithResult : this;
    }

    public static getEnterTransitionCallback$onExtraCallbackWithResult onWarmupCompleted(getEnterTransitionCallback getentertransitioncallback) {
        if (getentertransitioncallback == null) {
            return onExtraCallbackWithResult;
        }
        return onExtraCallback(getentertransitioncallback.onWarmupCompleted(), getentertransitioncallback.onNavigationEvent());
    }

    public static getEnterTransitionCallback$onExtraCallbackWithResult onExtraCallback(getLayoutInflater getlayoutinflater, getLayoutInflater getlayoutinflater2) {
        if (getlayoutinflater == null) {
            getlayoutinflater = getLayoutInflater.DEFAULT;
        }
        if (getlayoutinflater2 == null) {
            getlayoutinflater2 = getLayoutInflater.DEFAULT;
        }
        if (IAuthTabCallback(getlayoutinflater, getlayoutinflater2)) {
            return onExtraCallbackWithResult;
        }
        return new getEnterTransitionCallback$onExtraCallbackWithResult(getlayoutinflater, getlayoutinflater2);
    }

    public static getEnterTransitionCallback$onExtraCallbackWithResult onExtraCallbackWithResult() {
        return onExtraCallbackWithResult;
    }

    public static getEnterTransitionCallback$onExtraCallbackWithResult onExtraCallbackWithResult(getLayoutInflater getlayoutinflater) {
        return onExtraCallback(getlayoutinflater, getLayoutInflater.DEFAULT);
    }

    public getLayoutInflater IAuthTabCallback() {
        return this._contentNulls;
    }

    public getLayoutInflater onNavigationEvent() {
        getLayoutInflater getlayoutinflater = this._nulls;
        if (getlayoutinflater == getLayoutInflater.DEFAULT) {
            return null;
        }
        return getlayoutinflater;
    }

    public getLayoutInflater onExtraCallback() {
        getLayoutInflater getlayoutinflater = this._contentNulls;
        if (getlayoutinflater == getLayoutInflater.DEFAULT) {
            return null;
        }
        return getlayoutinflater;
    }

    public String toString() {
        return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this._nulls, this._contentNulls);
    }

    public int hashCode() {
        return this._nulls.ordinal() + (this._contentNulls.ordinal() << 2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            getEnterTransitionCallback$onExtraCallbackWithResult getentertransitioncallback_onextracallbackwithresult = (getEnterTransitionCallback$onExtraCallbackWithResult) obj;
            if (getentertransitioncallback_onextracallbackwithresult._nulls == this._nulls && getentertransitioncallback_onextracallbackwithresult._contentNulls == this._contentNulls) {
                return true;
            }
        }
        return false;
    }

    private static boolean IAuthTabCallback(getLayoutInflater getlayoutinflater, getLayoutInflater getlayoutinflater2) {
        getLayoutInflater getlayoutinflater3 = getLayoutInflater.DEFAULT;
        return getlayoutinflater == getlayoutinflater3 && getlayoutinflater2 == getlayoutinflater3;
    }
}
