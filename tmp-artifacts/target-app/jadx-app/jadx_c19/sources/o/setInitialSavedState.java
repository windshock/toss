package o;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setInitialSavedState extends getUserVisibleHint {
    protected setInitialSavedState IAuthTabCallback;
    protected Object IAuthTabCallbackDefault;
    protected final setInitialSavedState asBinder;
    protected boolean asInterface;
    protected setEnterSharedElementCallback onTransact;
    protected String onWarmupCompleted;

    protected setInitialSavedState(int i2, setInitialSavedState setinitialsavedstate, setEnterSharedElementCallback setentersharedelementcallback) {
        this.onExtraCallback = i2;
        this.asBinder = setinitialsavedstate;
        this.onNavigationEvent = setinitialsavedstate == null ? 0 : setinitialsavedstate.onNavigationEvent + 1;
        this.onTransact = setentersharedelementcallback;
        this.onExtraCallbackWithResult = -1;
    }

    protected setInitialSavedState(int i2, setInitialSavedState setinitialsavedstate, setEnterSharedElementCallback setentersharedelementcallback, Object obj) {
        this.onExtraCallback = i2;
        this.asBinder = setinitialsavedstate;
        this.onNavigationEvent = setinitialsavedstate == null ? 0 : setinitialsavedstate.onNavigationEvent + 1;
        this.onTransact = setentersharedelementcallback;
        this.onExtraCallbackWithResult = -1;
        this.IAuthTabCallbackDefault = obj;
    }

    public setInitialSavedState onNavigationEvent(int i2) {
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = -1;
        this.onWarmupCompleted = null;
        this.asInterface = false;
        this.IAuthTabCallbackDefault = null;
        setEnterSharedElementCallback setentersharedelementcallback = this.onTransact;
        if (setentersharedelementcallback != null) {
            setentersharedelementcallback.onWarmupCompleted();
        }
        return this;
    }

    public setInitialSavedState onNavigationEvent(int i2, Object obj) {
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = -1;
        this.onWarmupCompleted = null;
        this.asInterface = false;
        this.IAuthTabCallbackDefault = obj;
        setEnterSharedElementCallback setentersharedelementcallback = this.onTransact;
        if (setentersharedelementcallback != null) {
            setentersharedelementcallback.onWarmupCompleted();
        }
        return this;
    }

    public setInitialSavedState onWarmupCompleted(setEnterSharedElementCallback setentersharedelementcallback) {
        this.onTransact = setentersharedelementcallback;
        return this;
    }

    @Override // o.getUserVisibleHint
    public Object IAuthTabCallback() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getUserVisibleHint
    public void onWarmupCompleted(Object obj) {
        this.IAuthTabCallbackDefault = obj;
    }

    public static setInitialSavedState onNavigationEvent(setEnterSharedElementCallback setentersharedelementcallback) {
        return new setInitialSavedState(0, null, setentersharedelementcallback);
    }

    public setInitialSavedState access100() {
        setInitialSavedState setinitialsavedstate = this.IAuthTabCallback;
        if (setinitialsavedstate == null) {
            setEnterSharedElementCallback setentersharedelementcallback = this.onTransact;
            setInitialSavedState setinitialsavedstate2 = new setInitialSavedState(1, this, setentersharedelementcallback == null ? null : setentersharedelementcallback.IAuthTabCallback());
            this.IAuthTabCallback = setinitialsavedstate2;
            return setinitialsavedstate2;
        }
        return setinitialsavedstate.onNavigationEvent(1);
    }

    public setInitialSavedState onExtraCallbackWithResult(Object obj) {
        setInitialSavedState setinitialsavedstate = this.IAuthTabCallback;
        if (setinitialsavedstate == null) {
            setEnterSharedElementCallback setentersharedelementcallback = this.onTransact;
            setInitialSavedState setinitialsavedstate2 = new setInitialSavedState(1, this, setentersharedelementcallback == null ? null : setentersharedelementcallback.IAuthTabCallback(), obj);
            this.IAuthTabCallback = setinitialsavedstate2;
            return setinitialsavedstate2;
        }
        return setinitialsavedstate.onNavigationEvent(1, obj);
    }

    public setInitialSavedState access000() {
        setInitialSavedState setinitialsavedstate = this.IAuthTabCallback;
        if (setinitialsavedstate == null) {
            setEnterSharedElementCallback setentersharedelementcallback = this.onTransact;
            setInitialSavedState setinitialsavedstate2 = new setInitialSavedState(2, this, setentersharedelementcallback == null ? null : setentersharedelementcallback.IAuthTabCallback());
            this.IAuthTabCallback = setinitialsavedstate2;
            return setinitialsavedstate2;
        }
        return setinitialsavedstate.onNavigationEvent(2);
    }

    public setInitialSavedState onExtraCallback(Object obj) {
        setInitialSavedState setinitialsavedstate = this.IAuthTabCallback;
        if (setinitialsavedstate == null) {
            setEnterSharedElementCallback setentersharedelementcallback = this.onTransact;
            setInitialSavedState setinitialsavedstate2 = new setInitialSavedState(2, this, setentersharedelementcallback == null ? null : setentersharedelementcallback.IAuthTabCallback(), obj);
            this.IAuthTabCallback = setinitialsavedstate2;
            return setinitialsavedstate2;
        }
        return setinitialsavedstate.onNavigationEvent(2, obj);
    }

    @Override // o.getUserVisibleHint
    /* renamed from: extraCallback, reason: merged with bridge method [inline-methods] */
    public final setInitialSavedState asInterface() {
        return this.asBinder;
    }

    @Override // o.getUserVisibleHint
    public final String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.getUserVisibleHint
    public boolean IAuthTabCallbackDefault() {
        return this.onWarmupCompleted != null;
    }

    public setInitialSavedState IAuthTabCallbackStubProxy() {
        this.IAuthTabCallbackDefault = null;
        return this.asBinder;
    }

    public setEnterSharedElementCallback extraCallbackWithResult() {
        return this.onTransact;
    }

    public int onExtraCallbackWithResult(String str) throws JsonProcessingException {
        if (this.onExtraCallback != 2 || this.asInterface) {
            return 4;
        }
        this.asInterface = true;
        this.onWarmupCompleted = str;
        setEnterSharedElementCallback setentersharedelementcallback = this.onTransact;
        if (setentersharedelementcallback != null) {
            onExtraCallbackWithResult(setentersharedelementcallback, str);
        }
        return this.onExtraCallbackWithResult < 0 ? 0 : 1;
    }

    private final void onExtraCallbackWithResult(setEnterSharedElementCallback setentersharedelementcallback, String str) throws JsonProcessingException {
        if (setentersharedelementcallback.onWarmupCompleted(str)) {
            Object objOnNavigationEvent = setentersharedelementcallback.onNavigationEvent();
            throw new JsonGenerationException("Duplicate field '" + str + "'", objOnNavigationEvent instanceof getView ? (getView) objOnNavigationEvent : null);
        }
    }

    public int writeTypedObject() {
        int i2 = this.onExtraCallback;
        if (i2 == 2) {
            if (!this.asInterface) {
                return 5;
            }
            this.asInterface = false;
            this.onExtraCallbackWithResult++;
            return 2;
        }
        if (i2 == 1) {
            int i3 = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = i3 + 1;
            return i3 < 0 ? 0 : 1;
        }
        int i4 = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i4;
        return i4 == 0 ? 0 : 3;
    }
}
