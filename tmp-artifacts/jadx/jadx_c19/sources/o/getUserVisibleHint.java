package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class getUserVisibleHint {
    public int onExtraCallback;
    public int onExtraCallbackWithResult;
    public int onNavigationEvent;

    public Object IAuthTabCallback() {
        return null;
    }

    public abstract getUserVisibleHint asInterface();

    public abstract String onExtraCallbackWithResult();

    public void onWarmupCompleted(Object obj) {
    }

    public getUserVisibleHint() {
    }

    public getUserVisibleHint(getUserVisibleHint getuservisiblehint) {
        this.onExtraCallback = getuservisiblehint.onExtraCallback;
        this.onExtraCallbackWithResult = getuservisiblehint.onExtraCallbackWithResult;
    }

    public getUserVisibleHint(int i2, int i3) {
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = i3;
    }

    public final boolean IAuthTabCallbackStub() {
        return this.onExtraCallback == 1;
    }

    public final boolean IAuthTabCallback_Parcel() {
        return this.onExtraCallback == 0;
    }

    public final boolean asBinder() {
        return this.onExtraCallback == 2;
    }

    public final int onExtraCallback() {
        return this.onNavigationEvent;
    }

    public String getInterfaceDescriptor() {
        int i2 = this.onExtraCallback;
        if (i2 == 0) {
            return "root";
        }
        if (i2 == 1) {
            return "Array";
        }
        if (i2 == 2) {
            return "Object";
        }
        return "?";
    }

    public final int onWarmupCompleted() {
        return this.onExtraCallbackWithResult + 1;
    }

    public final int onNavigationEvent() {
        int i2 = this.onExtraCallbackWithResult;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public boolean onTransact() {
        return this.onExtraCallbackWithResult >= 0;
    }

    public boolean IAuthTabCallbackDefault() {
        return onExtraCallbackWithResult() != null;
    }

    public getSharedElementTargetNames onExtraCallbackWithResult(registerForContextMenu registerforcontextmenu) {
        return getSharedElementTargetNames.IAuthTabCallback;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i2 = this.onExtraCallback;
        if (i2 == 0) {
            sb.append("/");
        } else if (i2 == 1) {
            sb.append('[');
            sb.append(onNavigationEvent());
            sb.append(']');
        } else {
            sb.append('{');
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                sb.append('\"');
                postponeEnterTransition.IAuthTabCallback(sb, strOnExtraCallbackWithResult);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}
