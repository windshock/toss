package o;

import com.fasterxml.jackson.core.JsonProcessingException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onForceLoad extends getUserVisibleHint {
    protected Object IAuthTabCallback;
    protected final getSharedElementTargetNames asInterface;
    protected final getUserVisibleHint onTransact;
    protected String onWarmupCompleted;

    protected onForceLoad(getUserVisibleHint getuservisiblehint, registerForContextMenu registerforcontextmenu) {
        super(getuservisiblehint);
        this.onTransact = getuservisiblehint.asInterface();
        this.onWarmupCompleted = getuservisiblehint.onExtraCallbackWithResult();
        this.IAuthTabCallback = getuservisiblehint.IAuthTabCallback();
        if (getuservisiblehint instanceof setHasOptionsMenu) {
            this.asInterface = ((setHasOptionsMenu) getuservisiblehint).onExtraCallbackWithResult(registerforcontextmenu);
        } else {
            this.asInterface = getSharedElementTargetNames.IAuthTabCallback;
        }
    }

    protected onForceLoad(getUserVisibleHint getuservisiblehint, getSharedElementTargetNames getsharedelementtargetnames) {
        super(getuservisiblehint);
        this.onTransact = getuservisiblehint.asInterface();
        this.onWarmupCompleted = getuservisiblehint.onExtraCallbackWithResult();
        this.IAuthTabCallback = getuservisiblehint.IAuthTabCallback();
        this.asInterface = getsharedelementtargetnames;
    }

    protected onForceLoad() {
        super(0, -1);
        this.onTransact = null;
        this.asInterface = getSharedElementTargetNames.IAuthTabCallback;
    }

    protected onForceLoad(onForceLoad onforceload, int i2, int i3) {
        super(i2, i3);
        this.onTransact = onforceload;
        this.asInterface = onforceload.asInterface;
    }

    @Override // o.getUserVisibleHint
    public Object IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getUserVisibleHint
    public void onWarmupCompleted(Object obj) {
        this.IAuthTabCallback = obj;
    }

    public static onForceLoad onNavigationEvent(getUserVisibleHint getuservisiblehint) {
        if (getuservisiblehint == null) {
            return new onForceLoad();
        }
        return new onForceLoad(getuservisiblehint, registerForContextMenu.onExtraCallbackWithResult());
    }

    public onForceLoad access100() {
        this.onExtraCallbackWithResult++;
        return new onForceLoad(this, 1, -1);
    }

    public onForceLoad IAuthTabCallbackStubProxy() {
        this.onExtraCallbackWithResult++;
        return new onForceLoad(this, 2, -1);
    }

    public onForceLoad access000() {
        getUserVisibleHint getuservisiblehint = this.onTransact;
        if (getuservisiblehint instanceof onForceLoad) {
            return (onForceLoad) getuservisiblehint;
        }
        if (getuservisiblehint == null) {
            return new onForceLoad();
        }
        return new onForceLoad(getuservisiblehint, this.asInterface);
    }

    @Override // o.getUserVisibleHint
    public String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.getUserVisibleHint
    public boolean IAuthTabCallbackDefault() {
        return this.onWarmupCompleted != null;
    }

    @Override // o.getUserVisibleHint
    public getUserVisibleHint asInterface() {
        return this.onTransact;
    }

    public void IAuthTabCallback(String str) throws JsonProcessingException {
        this.onWarmupCompleted = str;
    }

    public void extraCallbackWithResult() {
        this.onExtraCallbackWithResult++;
    }
}
