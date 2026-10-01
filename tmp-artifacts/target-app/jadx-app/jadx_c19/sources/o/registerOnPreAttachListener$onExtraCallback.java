package o;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;
import o.registerOnPreAttachListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class registerOnPreAttachListener$onExtraCallback implements Serializable {
    private static final registerOnPreAttachListener$onExtraCallback onExtraCallback = new registerOnPreAttachListener$onExtraCallback();
    private static final long serialVersionUID = 1;
    private transient TimeZone IAuthTabCallback;
    private final registerOnPreAttachListener$onNavigationEvent _features;
    private final Boolean _lenient;
    private final Locale _locale;
    private final String _pattern;
    private final registerOnPreAttachListener$onWarmupCompleted _shape;
    private final String _timezoneStr;

    public registerOnPreAttachListener$onExtraCallback() {
        this("", registerOnPreAttachListener$onWarmupCompleted.ANY, "", "", registerOnPreAttachListener$onNavigationEvent.onExtraCallbackWithResult(), null);
    }

    public registerOnPreAttachListener$onExtraCallback(registerOnPreAttachListener registeronpreattachlistener) {
        this(registeronpreattachlistener.onNavigationEvent(), registeronpreattachlistener.onWarmupCompleted(), registeronpreattachlistener.onExtraCallback(), registeronpreattachlistener.onExtraCallbackWithResult(), registerOnPreAttachListener$onNavigationEvent.onExtraCallbackWithResult(registeronpreattachlistener), registeronpreattachlistener.IAuthTabCallback().asBoolean());
    }

    public registerOnPreAttachListener$onExtraCallback(String str, registerOnPreAttachListener$onWarmupCompleted registeronpreattachlistener_onwarmupcompleted, String str2, String str3, registerOnPreAttachListener$onNavigationEvent registeronpreattachlistener_onnavigationevent, Boolean bool) {
        this(str, registeronpreattachlistener_onwarmupcompleted, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, registeronpreattachlistener_onnavigationevent, bool);
    }

    public registerOnPreAttachListener$onExtraCallback(String str, registerOnPreAttachListener$onWarmupCompleted registeronpreattachlistener_onwarmupcompleted, Locale locale, String str2, TimeZone timeZone, registerOnPreAttachListener$onNavigationEvent registeronpreattachlistener_onnavigationevent, Boolean bool) {
        this._pattern = str == null ? "" : str;
        this._shape = registeronpreattachlistener_onwarmupcompleted == null ? registerOnPreAttachListener$onWarmupCompleted.ANY : registeronpreattachlistener_onwarmupcompleted;
        this._locale = locale;
        this.IAuthTabCallback = timeZone;
        this._timezoneStr = str2;
        this._features = registeronpreattachlistener_onnavigationevent == null ? registerOnPreAttachListener$onNavigationEvent.onExtraCallbackWithResult() : registeronpreattachlistener_onnavigationevent;
        this._lenient = bool;
    }

    public static final registerOnPreAttachListener$onExtraCallback onNavigationEvent() {
        return onExtraCallback;
    }

    public static registerOnPreAttachListener$onExtraCallback onExtraCallbackWithResult(registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallback, registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallback2) {
        return registeronpreattachlistener_onextracallback == null ? registeronpreattachlistener_onextracallback2 : registeronpreattachlistener_onextracallback.onWarmupCompleted(registeronpreattachlistener_onextracallback2);
    }

    public static final registerOnPreAttachListener$onExtraCallback onNavigationEvent(registerOnPreAttachListener registeronpreattachlistener) {
        return registeronpreattachlistener == null ? onExtraCallback : new registerOnPreAttachListener$onExtraCallback(registeronpreattachlistener);
    }

    public final registerOnPreAttachListener$onExtraCallback onWarmupCompleted(registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallback) {
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallback2;
        registerOnPreAttachListener$onNavigationEvent registeronpreattachlistener_onnavigationeventOnExtraCallbackWithResult;
        String str;
        TimeZone timeZone;
        if (registeronpreattachlistener_onextracallback == null || registeronpreattachlistener_onextracallback == (registeronpreattachlistener_onextracallback2 = onExtraCallback) || registeronpreattachlistener_onextracallback == this) {
            return this;
        }
        if (this == registeronpreattachlistener_onextracallback2) {
            return registeronpreattachlistener_onextracallback;
        }
        String str2 = registeronpreattachlistener_onextracallback._pattern;
        if (str2 == null || str2.isEmpty()) {
            str2 = this._pattern;
        }
        String str3 = str2;
        registerOnPreAttachListener$onWarmupCompleted registeronpreattachlistener_onwarmupcompleted = registeronpreattachlistener_onextracallback._shape;
        if (registeronpreattachlistener_onwarmupcompleted == registerOnPreAttachListener$onWarmupCompleted.ANY) {
            registeronpreattachlistener_onwarmupcompleted = this._shape;
        }
        registerOnPreAttachListener$onWarmupCompleted registeronpreattachlistener_onwarmupcompleted2 = registeronpreattachlistener_onwarmupcompleted;
        Locale locale = registeronpreattachlistener_onextracallback._locale;
        if (locale == null) {
            locale = this._locale;
        }
        Locale locale2 = locale;
        registerOnPreAttachListener$onNavigationEvent registeronpreattachlistener_onnavigationevent = this._features;
        if (registeronpreattachlistener_onnavigationevent == null) {
            registeronpreattachlistener_onnavigationeventOnExtraCallbackWithResult = registeronpreattachlistener_onextracallback._features;
        } else {
            registeronpreattachlistener_onnavigationeventOnExtraCallbackWithResult = registeronpreattachlistener_onnavigationevent.onExtraCallbackWithResult(registeronpreattachlistener_onextracallback._features);
        }
        registerOnPreAttachListener$onNavigationEvent registeronpreattachlistener_onnavigationevent2 = registeronpreattachlistener_onnavigationeventOnExtraCallbackWithResult;
        Boolean bool = registeronpreattachlistener_onextracallback._lenient;
        if (bool == null) {
            bool = this._lenient;
        }
        Boolean bool2 = bool;
        String str4 = registeronpreattachlistener_onextracallback._timezoneStr;
        if (str4 == null || str4.isEmpty()) {
            str = this._timezoneStr;
            timeZone = this.IAuthTabCallback;
        } else {
            timeZone = registeronpreattachlistener_onextracallback.IAuthTabCallback;
            str = str4;
        }
        return new registerOnPreAttachListener$onExtraCallback(str3, registeronpreattachlistener_onwarmupcompleted2, locale2, str, timeZone, registeronpreattachlistener_onnavigationevent2, bool2);
    }

    public static registerOnPreAttachListener$onExtraCallback onExtraCallbackWithResult(boolean z) {
        return new registerOnPreAttachListener$onExtraCallback("", null, null, null, null, registerOnPreAttachListener$onNavigationEvent.onExtraCallbackWithResult(), Boolean.valueOf(z));
    }

    public registerOnPreAttachListener$onExtraCallback onExtraCallback(Boolean bool) {
        return bool == this._lenient ? this : new registerOnPreAttachListener$onExtraCallback(this._pattern, this._shape, this._locale, this._timezoneStr, this.IAuthTabCallback, this._features, bool);
    }

    public String onExtraCallbackWithResult() {
        return this._pattern;
    }

    public registerOnPreAttachListener$onWarmupCompleted onExtraCallback() {
        return this._shape;
    }

    public Locale IAuthTabCallback() {
        return this._locale;
    }

    public Boolean onWarmupCompleted() {
        return this._lenient;
    }

    public TimeZone asBinder() {
        TimeZone timeZone = this.IAuthTabCallback;
        if (timeZone != null) {
            return timeZone;
        }
        String str = this._timezoneStr;
        if (str == null) {
            return null;
        }
        TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str);
        this.IAuthTabCallback = timeZone2;
        return timeZone2;
    }

    public boolean IAuthTabCallbackStub() {
        return this._shape != registerOnPreAttachListener$onWarmupCompleted.ANY;
    }

    public boolean onTransact() {
        String str = this._pattern;
        return str != null && str.length() > 0;
    }

    public boolean IAuthTabCallbackDefault() {
        return this._locale != null;
    }

    public boolean IAuthTabCallback_Parcel() {
        if (this.IAuthTabCallback != null) {
            return true;
        }
        String str = this._timezoneStr;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public boolean asInterface() {
        return this._lenient != null;
    }

    public Boolean onWarmupCompleted(registerOnPreAttachListener.onExtraCallbackWithResult onextracallbackwithresult) {
        return this._features.onExtraCallback(onextracallbackwithresult);
    }

    public String toString() {
        return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
    }

    public int hashCode() {
        String str = this._timezoneStr;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this._pattern;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        int iHashCode2 = iHashCode + this._shape.hashCode();
        Boolean bool = this._lenient;
        if (bool != null) {
            iHashCode2 ^= bool.hashCode();
        }
        Locale locale = this._locale;
        if (locale != null) {
            iHashCode2 += locale.hashCode();
        }
        return iHashCode2 ^ this._features.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallback = (registerOnPreAttachListener$onExtraCallback) obj;
        return this._shape == registeronpreattachlistener_onextracallback._shape && this._features.equals(registeronpreattachlistener_onextracallback._features) && onNavigationEvent(this._lenient, registeronpreattachlistener_onextracallback._lenient) && onNavigationEvent(this._timezoneStr, registeronpreattachlistener_onextracallback._timezoneStr) && onNavigationEvent(this._pattern, registeronpreattachlistener_onextracallback._pattern) && onNavigationEvent(this.IAuthTabCallback, registeronpreattachlistener_onextracallback.IAuthTabCallback) && onNavigationEvent(this._locale, registeronpreattachlistener_onextracallback._locale);
    }

    private static <T> boolean onNavigationEvent(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        if (t2 == null) {
            return false;
        }
        return t.equals(t2);
    }
}
