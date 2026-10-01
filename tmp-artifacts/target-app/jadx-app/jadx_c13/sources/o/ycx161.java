package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ycx161 implements AppSetIdAndScope1 {
    public final boolean IAuthTabCallback;
    private Method IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private Boolean onExtraCallback;
    private ea5 onExtraCallbackWithResult;
    private volatile AppSetIdAndScope1 onNavigationEvent;
    private final Queue<ea9> onWarmupCompleted;

    public ycx161(String str, Queue<ea9> queue, boolean z) {
        this.IAuthTabCallbackStub = str;
        this.onWarmupCompleted = queue;
        this.IAuthTabCallback = z;
    }

    @Override // o.AppSetIdAndScope1
    public String onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.AppSetIdAndScope1
    public boolean onWarmupCompleted(ea8 ea8Var) {
        return onTransact().onWarmupCompleted(ea8Var);
    }

    @Override // o.AppSetIdAndScope1
    public boolean onNavigationEvent() {
        return onTransact().onNavigationEvent();
    }

    @Override // o.AppSetIdAndScope1
    public boolean onExtraCallback() {
        return onTransact().onExtraCallback();
    }

    @Override // o.AppSetIdAndScope1
    public boolean IAuthTabCallback() {
        return onTransact().IAuthTabCallback();
    }

    @Override // o.AppSetIdAndScope1
    public boolean asInterface() {
        return onTransact().asInterface();
    }

    @Override // o.AppSetIdAndScope1
    public boolean onWarmupCompleted() {
        return onTransact().onWarmupCompleted();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.IAuthTabCallbackStub.equals(((ycx161) obj).IAuthTabCallbackStub);
    }

    public int hashCode() {
        return this.IAuthTabCallbackStub.hashCode();
    }

    public AppSetIdAndScope1 onTransact() {
        if (this.onNavigationEvent != null) {
            return this.onNavigationEvent;
        }
        if (this.IAuthTabCallback) {
            return jw33.onExtraCallback;
        }
        return access100();
    }

    private AppSetIdAndScope1 access100() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = new ea5(this, this.onWarmupCompleted);
        }
        return this.onExtraCallbackWithResult;
    }

    public void onWarmupCompleted(AppSetIdAndScope1 appSetIdAndScope1) {
        this.onNavigationEvent = appSetIdAndScope1;
    }

    public boolean IAuthTabCallbackDefault() {
        Boolean bool = this.onExtraCallback;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.IAuthTabCallbackDefault = this.onNavigationEvent.getClass().getMethod("log", jw31.class);
            this.onExtraCallback = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.onExtraCallback = Boolean.FALSE;
        }
        return this.onExtraCallback.booleanValue();
    }

    public void onWarmupCompleted(jw31 jw31Var) {
        if (IAuthTabCallbackDefault()) {
            try {
                this.IAuthTabCallbackDefault.invoke(this.onNavigationEvent, jw31Var);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public boolean IAuthTabCallbackStub() {
        return this.onNavigationEvent == null;
    }

    public boolean asBinder() {
        return this.onNavigationEvent instanceof jw33;
    }
}
