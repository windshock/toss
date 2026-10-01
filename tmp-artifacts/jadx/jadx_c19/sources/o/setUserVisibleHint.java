package o;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class setUserVisibleHint implements initState, shouldShowRequestPermissionRationale<setUserVisibleHint>, Serializable {

    @Deprecated
    public static final requireHost onNavigationEvent = new requireHost(" ");
    private static final long serialVersionUID = 1;
    protected String _arrayEmptySeparator;
    protected onExtraCallbackWithResult _arrayIndenter;
    protected String _arrayValueSeparator;
    protected String _objectEmptySeparator;
    protected String _objectEntrySeparator;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected onExtraCallbackWithResult _objectIndenter;
    protected hasOptionsMenu _rootSeparator;
    protected getSupportFragmentManager _separators;

    @Deprecated
    protected boolean _spacesInObjectEntries;
    protected transient int onExtraCallbackWithResult;

    public static class onExtraCallback implements onExtraCallbackWithResult, Serializable {
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();

        @Override // o.setUserVisibleHint.onExtraCallbackWithResult
        public void onNavigationEvent(getView getview, int i2) throws IOException {
        }

        @Override // o.setUserVisibleHint.onExtraCallbackWithResult
        public boolean onNavigationEvent() {
            return true;
        }
    }

    public interface onExtraCallbackWithResult {
        void onNavigationEvent(getView getview, int i2) throws IOException;

        boolean onNavigationEvent();
    }

    public setUserVisibleHint() {
        this(initState.IAuthTabCallback);
    }

    public setUserVisibleHint(getSupportFragmentManager getsupportfragmentmanager) {
        this._arrayIndenter = IAuthTabCallback.onWarmupCompleted;
        this._objectIndenter = unregisterForContextMenu.IAuthTabCallback;
        this._spacesInObjectEntries = true;
        this._separators = getsupportfragmentmanager;
        this._rootSeparator = getsupportfragmentmanager.onTransact() == null ? null : new requireHost(getsupportfragmentmanager.onTransact());
        this._objectFieldValueSeparatorWithSpaces = getsupportfragmentmanager.asInterface().apply(getsupportfragmentmanager.asBinder());
        this._objectEntrySeparator = getsupportfragmentmanager.IAuthTabCallbackStub().apply(getsupportfragmentmanager.IAuthTabCallbackDefault());
        this._objectEmptySeparator = getsupportfragmentmanager.onExtraCallback();
        this._arrayValueSeparator = getsupportfragmentmanager.onNavigationEvent().apply(getsupportfragmentmanager.IAuthTabCallback());
        this._arrayEmptySeparator = getsupportfragmentmanager.onExtraCallbackWithResult();
    }

    public setUserVisibleHint(setUserVisibleHint setuservisiblehint) {
        this._arrayIndenter = IAuthTabCallback.onWarmupCompleted;
        this._objectIndenter = unregisterForContextMenu.IAuthTabCallback;
        this._spacesInObjectEntries = true;
        this._rootSeparator = setuservisiblehint._rootSeparator;
        this._arrayIndenter = setuservisiblehint._arrayIndenter;
        this._objectIndenter = setuservisiblehint._objectIndenter;
        this._spacesInObjectEntries = setuservisiblehint._spacesInObjectEntries;
        this.onExtraCallbackWithResult = setuservisiblehint.onExtraCallbackWithResult;
        this._separators = setuservisiblehint._separators;
        this._objectFieldValueSeparatorWithSpaces = setuservisiblehint._objectFieldValueSeparatorWithSpaces;
        this._objectEntrySeparator = setuservisiblehint._objectEntrySeparator;
        this._objectEmptySeparator = setuservisiblehint._objectEmptySeparator;
        this._arrayValueSeparator = setuservisiblehint._arrayValueSeparator;
        this._arrayEmptySeparator = setuservisiblehint._arrayEmptySeparator;
    }

    @Override // o.shouldShowRequestPermissionRationale
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public setUserVisibleHint onExtraCallback() {
        if (getClass() != setUserVisibleHint.class) {
            throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
        }
        return new setUserVisibleHint(this);
    }

    @Override // o.initState
    public void asInterface(getView getview) throws IOException {
        hasOptionsMenu hasoptionsmenu = this._rootSeparator;
        if (hasoptionsmenu != null) {
            getview.IAuthTabCallback(hasoptionsmenu);
        }
    }

    @Override // o.initState
    public void onTransact(getView getview) throws IOException {
        getview.onWarmupCompleted('{');
        if (this._objectIndenter.onNavigationEvent()) {
            return;
        }
        this.onExtraCallbackWithResult++;
    }

    @Override // o.initState
    public void onWarmupCompleted(getView getview) throws IOException {
        this._objectIndenter.onNavigationEvent(getview, this.onExtraCallbackWithResult);
    }

    @Override // o.initState
    public void onExtraCallbackWithResult(getView getview) throws IOException {
        getview.onTransact(this._objectFieldValueSeparatorWithSpaces);
    }

    @Override // o.initState
    public void onExtraCallback(getView getview) throws IOException {
        getview.onTransact(this._objectEntrySeparator);
        this._objectIndenter.onNavigationEvent(getview, this.onExtraCallbackWithResult);
    }

    @Override // o.initState
    public void onNavigationEvent(getView getview, int i2) throws IOException {
        if (!this._objectIndenter.onNavigationEvent()) {
            this.onExtraCallbackWithResult--;
        }
        if (i2 > 0) {
            this._objectIndenter.onNavigationEvent(getview, this.onExtraCallbackWithResult);
        } else {
            getview.onTransact(this._objectEmptySeparator);
        }
        getview.onWarmupCompleted('}');
    }

    @Override // o.initState
    public void IAuthTabCallbackDefault(getView getview) throws IOException {
        if (!this._arrayIndenter.onNavigationEvent()) {
            this.onExtraCallbackWithResult++;
        }
        getview.onWarmupCompleted('[');
    }

    @Override // o.initState
    public void onNavigationEvent(getView getview) throws IOException {
        this._arrayIndenter.onNavigationEvent(getview, this.onExtraCallbackWithResult);
    }

    @Override // o.initState
    public void IAuthTabCallback(getView getview) throws IOException {
        getview.onTransact(this._arrayValueSeparator);
        this._arrayIndenter.onNavigationEvent(getview, this.onExtraCallbackWithResult);
    }

    @Override // o.initState
    public void onWarmupCompleted(getView getview, int i2) throws IOException {
        if (!this._arrayIndenter.onNavigationEvent()) {
            this.onExtraCallbackWithResult--;
        }
        if (i2 > 0) {
            this._arrayIndenter.onNavigationEvent(getview, this.onExtraCallbackWithResult);
        } else {
            getview.onTransact(this._arrayEmptySeparator);
        }
        getview.onWarmupCompleted(']');
    }

    public static class IAuthTabCallback extends onExtraCallback {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        @Override // o.setUserVisibleHint.onExtraCallback, o.setUserVisibleHint.onExtraCallbackWithResult
        public boolean onNavigationEvent() {
            return true;
        }

        @Override // o.setUserVisibleHint.onExtraCallback, o.setUserVisibleHint.onExtraCallbackWithResult
        public void onNavigationEvent(getView getview, int i2) throws IOException {
            getview.onWarmupCompleted(' ');
        }
    }
}
