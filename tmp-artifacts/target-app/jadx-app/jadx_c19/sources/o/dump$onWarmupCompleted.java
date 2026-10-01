package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dump$onWarmupCompleted implements Serializable {
    protected static final dump$onWarmupCompleted onWarmupCompleted;
    private static final long serialVersionUID = 1;
    protected final Class<?> _contentFilter;
    protected final dump$onExtraCallback _contentInclusion;
    protected final Class<?> _valueFilter;
    protected final dump$onExtraCallback _valueInclusion;

    static {
        dump$onExtraCallback dump_onextracallback = dump$onExtraCallback.USE_DEFAULTS;
        onWarmupCompleted = new dump$onWarmupCompleted(dump_onextracallback, dump_onextracallback, null, null);
    }

    protected dump$onWarmupCompleted(dump$onExtraCallback dump_onextracallback, dump$onExtraCallback dump_onextracallback2, Class<?> cls, Class<?> cls2) {
        this._valueInclusion = dump_onextracallback == null ? dump$onExtraCallback.USE_DEFAULTS : dump_onextracallback;
        this._contentInclusion = dump_onextracallback2 == null ? dump$onExtraCallback.USE_DEFAULTS : dump_onextracallback2;
        this._valueFilter = cls == Void.class ? null : cls;
        this._contentFilter = cls2 == Void.class ? null : cls2;
    }

    public static dump$onWarmupCompleted onNavigationEvent() {
        return onWarmupCompleted;
    }

    public static dump$onWarmupCompleted IAuthTabCallback(dump$onWarmupCompleted dump_onwarmupcompleted, dump$onWarmupCompleted dump_onwarmupcompleted2) {
        return dump_onwarmupcompleted == null ? dump_onwarmupcompleted2 : dump_onwarmupcompleted.onExtraCallback(dump_onwarmupcompleted2);
    }

    public static dump$onWarmupCompleted onNavigationEvent(dump$onWarmupCompleted... dump_onwarmupcompletedArr) {
        dump$onWarmupCompleted dump_onwarmupcompleted = null;
        for (dump$onWarmupCompleted dump_onwarmupcompletedOnExtraCallback : dump_onwarmupcompletedArr) {
            if (dump_onwarmupcompletedOnExtraCallback != null) {
                if (dump_onwarmupcompleted != null) {
                    dump_onwarmupcompletedOnExtraCallback = dump_onwarmupcompleted.onExtraCallback(dump_onwarmupcompletedOnExtraCallback);
                }
                dump_onwarmupcompleted = dump_onwarmupcompletedOnExtraCallback;
            }
        }
        return dump_onwarmupcompleted;
    }

    protected Object readResolve() {
        dump$onExtraCallback dump_onextracallback = this._valueInclusion;
        dump$onExtraCallback dump_onextracallback2 = dump$onExtraCallback.USE_DEFAULTS;
        return (dump_onextracallback == dump_onextracallback2 && this._contentInclusion == dump_onextracallback2 && this._valueFilter == null && this._contentFilter == null) ? onWarmupCompleted : this;
    }

    public dump$onWarmupCompleted onExtraCallback(dump$onWarmupCompleted dump_onwarmupcompleted) {
        if (dump_onwarmupcompleted != null && dump_onwarmupcompleted != onWarmupCompleted) {
            dump$onExtraCallback dump_onextracallback = dump_onwarmupcompleted._valueInclusion;
            dump$onExtraCallback dump_onextracallback2 = dump_onwarmupcompleted._contentInclusion;
            Class<?> cls = dump_onwarmupcompleted._valueFilter;
            Class<?> cls2 = dump_onwarmupcompleted._contentFilter;
            dump$onExtraCallback dump_onextracallback3 = this._valueInclusion;
            boolean z = true;
            boolean z2 = (dump_onextracallback == dump_onextracallback3 || dump_onextracallback == dump$onExtraCallback.USE_DEFAULTS) ? false : true;
            dump$onExtraCallback dump_onextracallback4 = this._contentInclusion;
            boolean z3 = (dump_onextracallback2 == dump_onextracallback4 || dump_onextracallback2 == dump$onExtraCallback.USE_DEFAULTS) ? false : true;
            Class<?> cls3 = this._valueFilter;
            if (cls == cls3 && cls2 == cls3) {
                z = false;
            }
            if (z2) {
                if (z3) {
                    return new dump$onWarmupCompleted(dump_onextracallback, dump_onextracallback2, cls, cls2);
                }
                return new dump$onWarmupCompleted(dump_onextracallback, dump_onextracallback4, cls, cls2);
            }
            if (z3) {
                return new dump$onWarmupCompleted(dump_onextracallback3, dump_onextracallback2, cls, cls2);
            }
            if (z) {
                return new dump$onWarmupCompleted(dump_onextracallback3, dump_onextracallback4, cls, cls2);
            }
        }
        return this;
    }

    public static dump$onWarmupCompleted onWarmupCompleted(dump$onExtraCallback dump_onextracallback, dump$onExtraCallback dump_onextracallback2) {
        dump$onExtraCallback dump_onextracallback3 = dump$onExtraCallback.USE_DEFAULTS;
        if ((dump_onextracallback == dump_onextracallback3 || dump_onextracallback == null) && (dump_onextracallback2 == dump_onextracallback3 || dump_onextracallback2 == null)) {
            return onWarmupCompleted;
        }
        return new dump$onWarmupCompleted(dump_onextracallback, dump_onextracallback2, null, null);
    }

    public static dump$onWarmupCompleted onExtraCallback(dump$onExtraCallback dump_onextracallback, dump$onExtraCallback dump_onextracallback2, Class<?> cls, Class<?> cls2) {
        if (cls == Void.class) {
            cls = null;
        }
        if (cls2 == Void.class) {
            cls2 = null;
        }
        dump$onExtraCallback dump_onextracallback3 = dump$onExtraCallback.USE_DEFAULTS;
        if ((dump_onextracallback == dump_onextracallback3 || dump_onextracallback == null) && ((dump_onextracallback2 == dump_onextracallback3 || dump_onextracallback2 == null) && cls == null && cls2 == null)) {
            return onWarmupCompleted;
        }
        return new dump$onWarmupCompleted(dump_onextracallback, dump_onextracallback2, cls, cls2);
    }

    public static dump$onWarmupCompleted onExtraCallback(dump dumpVar) {
        if (dumpVar == null) {
            return onWarmupCompleted;
        }
        dump$onExtraCallback dump_onextracallbackOnNavigationEvent = dumpVar.onNavigationEvent();
        dump$onExtraCallback dump_onextracallbackOnExtraCallback = dumpVar.onExtraCallback();
        dump$onExtraCallback dump_onextracallback = dump$onExtraCallback.USE_DEFAULTS;
        if (dump_onextracallbackOnNavigationEvent == dump_onextracallback && dump_onextracallbackOnExtraCallback == dump_onextracallback) {
            return onWarmupCompleted;
        }
        Class clsIAuthTabCallback = dumpVar.IAuthTabCallback();
        if (clsIAuthTabCallback == Void.class) {
            clsIAuthTabCallback = null;
        }
        Class clsOnExtraCallbackWithResult = dumpVar.onExtraCallbackWithResult();
        return new dump$onWarmupCompleted(dump_onextracallbackOnNavigationEvent, dump_onextracallbackOnExtraCallback, clsIAuthTabCallback, clsOnExtraCallbackWithResult != Void.class ? clsOnExtraCallbackWithResult : null);
    }

    public dump$onWarmupCompleted onNavigationEvent(dump$onExtraCallback dump_onextracallback) {
        return dump_onextracallback == this._valueInclusion ? this : new dump$onWarmupCompleted(dump_onextracallback, this._contentInclusion, this._valueFilter, this._contentFilter);
    }

    public dump$onWarmupCompleted onWarmupCompleted(Class<?> cls) {
        dump$onExtraCallback dump_onextracallback;
        if (cls == null || cls == Void.class) {
            dump_onextracallback = dump$onExtraCallback.USE_DEFAULTS;
            cls = null;
        } else {
            dump_onextracallback = dump$onExtraCallback.CUSTOM;
        }
        return onExtraCallback(this._valueInclusion, dump_onextracallback, this._valueFilter, cls);
    }

    public dump$onWarmupCompleted onExtraCallbackWithResult(dump$onExtraCallback dump_onextracallback) {
        return dump_onextracallback == this._contentInclusion ? this : new dump$onWarmupCompleted(this._valueInclusion, dump_onextracallback, this._valueFilter, this._contentFilter);
    }

    public dump$onExtraCallback onExtraCallbackWithResult() {
        return this._valueInclusion;
    }

    public dump$onExtraCallback IAuthTabCallback() {
        return this._contentInclusion;
    }

    public Class<?> onExtraCallback() {
        return this._valueFilter;
    }

    public Class<?> onWarmupCompleted() {
        return this._contentFilter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("JsonInclude.Value(value=");
        sb.append(this._valueInclusion);
        sb.append(",content=");
        sb.append(this._contentInclusion);
        if (this._valueFilter != null) {
            sb.append(",valueFilter=");
            sb.append(this._valueFilter.getName());
            sb.append(".class");
        }
        if (this._contentFilter != null) {
            sb.append(",contentFilter=");
            sb.append(this._contentFilter.getName());
            sb.append(".class");
        }
        sb.append(')');
        return sb.toString();
    }

    public int hashCode() {
        return (this._valueInclusion.hashCode() << 2) + this._contentInclusion.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        dump$onWarmupCompleted dump_onwarmupcompleted = (dump$onWarmupCompleted) obj;
        return dump_onwarmupcompleted._valueInclusion == this._valueInclusion && dump_onwarmupcompleted._contentInclusion == this._contentInclusion && dump_onwarmupcompleted._valueFilter == this._valueFilter && dump_onwarmupcompleted._contentFilter == this._contentFilter;
    }
}
