package o;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setHasOptionsMenu extends getUserVisibleHint {
    protected setHasOptionsMenu IAuthTabCallback;
    protected final setHasOptionsMenu IAuthTabCallbackDefault;
    protected Object IAuthTabCallbackStub;
    protected setEnterSharedElementCallback asBinder;
    protected int asInterface;
    protected String onTransact;
    protected int onWarmupCompleted;

    public setHasOptionsMenu(setHasOptionsMenu sethasoptionsmenu, int i2, setEnterSharedElementCallback setentersharedelementcallback, int i3, int i4, int i5) {
        this.IAuthTabCallbackDefault = sethasoptionsmenu;
        this.asBinder = setentersharedelementcallback;
        this.onExtraCallback = i3;
        this.asInterface = i4;
        this.onWarmupCompleted = i5;
        this.onExtraCallbackWithResult = -1;
        this.onNavigationEvent = i2;
    }

    public void IAuthTabCallback(int i2, int i3, int i4) {
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = -1;
        this.asInterface = i3;
        this.onWarmupCompleted = i4;
        this.onTransact = null;
        this.IAuthTabCallbackStub = null;
        setEnterSharedElementCallback setentersharedelementcallback = this.asBinder;
        if (setentersharedelementcallback != null) {
            setentersharedelementcallback.onWarmupCompleted();
        }
    }

    public setHasOptionsMenu onExtraCallbackWithResult(setEnterSharedElementCallback setentersharedelementcallback) {
        this.asBinder = setentersharedelementcallback;
        return this;
    }

    @Override // o.getUserVisibleHint
    public Object IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getUserVisibleHint
    public void onWarmupCompleted(Object obj) {
        this.IAuthTabCallbackStub = obj;
    }

    public static setHasOptionsMenu onExtraCallback(setEnterSharedElementCallback setentersharedelementcallback) {
        return new setHasOptionsMenu(null, 0, setentersharedelementcallback, 0, 1, 0);
    }

    public setHasOptionsMenu onExtraCallbackWithResult(int i2, int i3) {
        setHasOptionsMenu sethasoptionsmenu = this.IAuthTabCallback;
        if (sethasoptionsmenu == null) {
            int i4 = this.onNavigationEvent;
            setEnterSharedElementCallback setentersharedelementcallback = this.asBinder;
            setHasOptionsMenu sethasoptionsmenu2 = new setHasOptionsMenu(this, i4 + 1, setentersharedelementcallback == null ? null : setentersharedelementcallback.IAuthTabCallback(), 1, i2, i3);
            this.IAuthTabCallback = sethasoptionsmenu2;
            return sethasoptionsmenu2;
        }
        sethasoptionsmenu.IAuthTabCallback(1, i2, i3);
        return sethasoptionsmenu;
    }

    public setHasOptionsMenu onWarmupCompleted(int i2, int i3) {
        setHasOptionsMenu sethasoptionsmenu = this.IAuthTabCallback;
        if (sethasoptionsmenu == null) {
            int i4 = this.onNavigationEvent;
            setEnterSharedElementCallback setentersharedelementcallback = this.asBinder;
            setHasOptionsMenu sethasoptionsmenu2 = new setHasOptionsMenu(this, i4 + 1, setentersharedelementcallback == null ? null : setentersharedelementcallback.IAuthTabCallback(), 2, i2, i3);
            this.IAuthTabCallback = sethasoptionsmenu2;
            return sethasoptionsmenu2;
        }
        sethasoptionsmenu.IAuthTabCallback(2, i2, i3);
        return sethasoptionsmenu;
    }

    @Override // o.getUserVisibleHint
    public String onExtraCallbackWithResult() {
        return this.onTransact;
    }

    @Override // o.getUserVisibleHint
    public boolean IAuthTabCallbackDefault() {
        return this.onTransact != null;
    }

    @Override // o.getUserVisibleHint
    /* renamed from: readTypedObject, reason: merged with bridge method [inline-methods] */
    public setHasOptionsMenu asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getUserVisibleHint
    public getSharedElementTargetNames onExtraCallbackWithResult(registerForContextMenu registerforcontextmenu) {
        return new getSharedElementTargetNames(registerforcontextmenu, -1L, this.asInterface, this.onWarmupCompleted);
    }

    public setHasOptionsMenu IAuthTabCallbackStubProxy() {
        this.IAuthTabCallbackStub = null;
        return this.IAuthTabCallbackDefault;
    }

    public setEnterSharedElementCallback access100() {
        return this.asBinder;
    }

    public boolean access000() {
        int i2 = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i2;
        return this.onExtraCallback != 0 && i2 > 0;
    }

    public void IAuthTabCallback(String str) throws JsonProcessingException {
        this.onTransact = str;
        setEnterSharedElementCallback setentersharedelementcallback = this.asBinder;
        if (setentersharedelementcallback != null) {
            IAuthTabCallback(setentersharedelementcallback, str);
        }
    }

    private void IAuthTabCallback(setEnterSharedElementCallback setentersharedelementcallback, String str) throws JsonProcessingException {
        if (setentersharedelementcallback.onWarmupCompleted(str)) {
            Object objOnNavigationEvent = setentersharedelementcallback.onNavigationEvent();
            throw new JsonParseException(objOnNavigationEvent instanceof getViewLifecycleOwner ? (getViewLifecycleOwner) objOnNavigationEvent : null, "Duplicate field '" + str + "'");
        }
    }
}
