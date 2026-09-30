package o;

import java.io.IOException;
import o.getView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class setExitSharedElementCallback extends isRemoving {
    protected static final int[] IAuthTabCallback_Parcel = postponeEnterTransition.onWarmupCompleted();
    protected static final r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<isInBackStack> access000 = getView.onWarmupCompleted;
    protected boolean IAuthTabCallbackStubProxy;
    protected performStart ICustomTabsCallback;
    protected boolean access100;
    protected int extraCallback;
    protected final isInLayout extraCallbackWithResult;
    protected int[] readTypedObject;
    protected hasOptionsMenu writeTypedObject;

    public setExitSharedElementCallback(performViewCreated performviewcreated, int i2, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata) {
        super(i2, getviewlifecycleownerlivedata, performviewcreated);
        this.readTypedObject = IAuthTabCallback_Parcel;
        this.writeTypedObject = getReturnTransition.onNavigationEvent;
        this.extraCallbackWithResult = performviewcreated.IAuthTabCallback_Parcel();
        if (getView.IAuthTabCallback.ESCAPE_NON_ASCII.enabledIn(i2)) {
            this.extraCallback = 127;
        }
        this.access100 = getView.IAuthTabCallback.WRITE_HEX_UPPER_CASE.enabledIn(i2);
        this.IAuthTabCallbackStubProxy = !getView.IAuthTabCallback.QUOTE_FIELD_NAMES.enabledIn(i2);
    }

    @Override // o.getView
    public isInLayout asBinder() {
        return this.extraCallbackWithResult;
    }

    @Override // o.isRemoving, o.getView
    public getView onWarmupCompleted(getView.IAuthTabCallback iAuthTabCallback) {
        super.onWarmupCompleted(iAuthTabCallback);
        if (iAuthTabCallback == getView.IAuthTabCallback.QUOTE_FIELD_NAMES) {
            this.IAuthTabCallbackStubProxy = true;
            return this;
        }
        if (iAuthTabCallback == getView.IAuthTabCallback.WRITE_HEX_UPPER_CASE) {
            this.access100 = false;
        }
        return this;
    }

    @Override // o.isRemoving
    public void onNavigationEvent(int i2, int i3) {
        super.onNavigationEvent(i2, i3);
        this.IAuthTabCallbackStubProxy = !getView.IAuthTabCallback.QUOTE_FIELD_NAMES.enabledIn(i2);
        this.access100 = getView.IAuthTabCallback.WRITE_HEX_UPPER_CASE.enabledIn(i2);
    }

    @Override // o.getView
    public getView onExtraCallback(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.extraCallback = i2;
        return this;
    }

    @Override // o.getView
    public getView IAuthTabCallback(performStart performstart) {
        this.ICustomTabsCallback = performstart;
        if (performstart == null) {
            this.readTypedObject = IAuthTabCallback_Parcel;
            return this;
        }
        this.readTypedObject = performstart.onNavigationEvent();
        return this;
    }

    @Override // o.getView
    public getView onWarmupCompleted(hasOptionsMenu hasoptionsmenu) {
        this.writeTypedObject = hasoptionsmenu;
        return this;
    }

    protected void onNavigationEvent(String str, int i2) throws IOException {
        if (i2 == 0) {
            if (this.getInterfaceDescriptor.IAuthTabCallbackStub()) {
                this.onExtraCallback.onNavigationEvent(this);
                return;
            } else {
                if (this.getInterfaceDescriptor.asBinder()) {
                    this.onExtraCallback.onWarmupCompleted(this);
                    return;
                }
                return;
            }
        }
        if (i2 == 1) {
            this.onExtraCallback.IAuthTabCallback(this);
            return;
        }
        if (i2 == 2) {
            this.onExtraCallback.onExtraCallbackWithResult(this);
            return;
        }
        if (i2 == 3) {
            this.onExtraCallback.asInterface(this);
        } else if (i2 == 5) {
            IAuthTabCallbackStubProxy(str);
        } else {
            onWarmupCompleted();
        }
    }

    protected void IAuthTabCallbackStubProxy(String str) throws IOException {
        IAuthTabCallback(String.format("Can not %s, expecting field name (context: %s)", str, this.getInterfaceDescriptor.getInterfaceDescriptor()));
    }
}
