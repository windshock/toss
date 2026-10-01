package o;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.szb;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class ulm {
    protected String IAuthTabCallbackDefault;
    protected sjd IAuthTabCallbackStubProxy;
    protected Map<String, sl> IAuthTabCallback_Parcel;
    uhs ICustomTabsCallback;
    protected oq access000;
    rdj access100;
    protected szb asBinder;
    protected ArrayList<qgr> extraCallback;
    protected tz getInterfaceDescriptor;
    private szb.asBinder onExtraCallbackWithResult = new szb.asBinder();
    private szb.IAuthTabCallbackDefault IAuthTabCallback = new szb.IAuthTabCallbackDefault();

    protected abstract boolean IAuthTabCallback(szb szbVar);

    protected boolean IAuthTabCallback_Parcel(String str) {
        return false;
    }

    abstract sjd asBinder();

    ulm() {
    }

    protected void onWarmupCompleted(Reader reader, String str, tz tzVar) {
        oas.onNavigationEvent(reader, "String input must not be null");
        oas.onNavigationEvent(str, "BaseURI must not be null");
        oas.onExtraCallback(tzVar);
        oq oqVar = new oq(str);
        this.access000 = oqVar;
        oqVar.onExtraCallback(tzVar);
        this.getInterfaceDescriptor = tzVar;
        this.IAuthTabCallbackStubProxy = tzVar.onWarmupCompleted();
        rdj rdjVar = new rdj(reader);
        this.access100 = rdjVar;
        rdjVar.onExtraCallbackWithResult(tzVar.onExtraCallback());
        this.asBinder = null;
        this.ICustomTabsCallback = new uhs(this.access100, tzVar.onExtraCallbackWithResult());
        this.extraCallback = new ArrayList<>(32);
        this.IAuthTabCallback_Parcel = new HashMap();
        this.IAuthTabCallbackDefault = str;
    }

    oq onExtraCallbackWithResult(Reader reader, String str, tz tzVar) {
        onWarmupCompleted(reader, str, tzVar);
        ICustomTabsCallback_Parcel();
        this.access100.onExtraCallback();
        this.access100 = null;
        this.ICustomTabsCallback = null;
        this.extraCallback = null;
        this.IAuthTabCallback_Parcel = null;
        return this.access000;
    }

    protected void ICustomTabsCallback_Parcel() {
        szb szbVarAccess100;
        uhs uhsVar = this.ICustomTabsCallback;
        szb.onTransact ontransact = szb.onTransact.EOF;
        do {
            szbVarAccess100 = uhsVar.access100();
            IAuthTabCallback(szbVarAccess100);
            szbVarAccess100.access100();
        } while (szbVarAccess100.onExtraCallbackWithResult != ontransact);
    }

    protected boolean extraCallbackWithResult(String str) {
        szb.asBinder asbinder = this.onExtraCallbackWithResult;
        if (this.asBinder == asbinder) {
            return IAuthTabCallback(new szb.asBinder().onWarmupCompleted(str));
        }
        return IAuthTabCallback(asbinder.access100().onWarmupCompleted(str));
    }

    public boolean onNavigationEvent(String str, om omVar) {
        szb.asBinder asbinder = this.onExtraCallbackWithResult;
        if (this.asBinder == asbinder) {
            return IAuthTabCallback(new szb.asBinder().IAuthTabCallback(str, omVar));
        }
        asbinder.access100();
        asbinder.IAuthTabCallback(str, omVar);
        return IAuthTabCallback(asbinder);
    }

    protected boolean readTypedObject(String str) {
        szb szbVar = this.asBinder;
        szb.IAuthTabCallbackDefault iAuthTabCallbackDefault = this.IAuthTabCallback;
        if (szbVar == iAuthTabCallbackDefault) {
            return IAuthTabCallback(new szb.IAuthTabCallbackDefault().onWarmupCompleted(str));
        }
        return IAuthTabCallback(iAuthTabCallbackDefault.access100().onWarmupCompleted(str));
    }

    protected qgr ICustomTabsCallbackDefault() {
        int size = this.extraCallback.size();
        return size > 0 ? this.extraCallback.get(size - 1) : this.access000;
    }

    protected boolean access100(String str) {
        qgr qgrVarICustomTabsCallbackDefault;
        return (this.extraCallback.size() == 0 || (qgrVarICustomTabsCallbackDefault = ICustomTabsCallbackDefault()) == null || !qgrVarICustomTabsCallbackDefault.onMinimized().equals(str)) ? false : true;
    }

    protected void onExtraCallbackWithResult(String str, Object... objArr) {
        sim simVarOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult();
        if (simVarOnExtraCallbackWithResult.onNavigationEvent()) {
            simVarOnExtraCallbackWithResult.add(new rg(this.access100, str, objArr));
        }
    }

    protected sl onExtraCallbackWithResult(String str, sjd sjdVar) {
        sl slVar = this.IAuthTabCallback_Parcel.get(str);
        if (slVar != null) {
            return slVar;
        }
        sl slVarOnExtraCallback = sl.onExtraCallback(str, sjdVar);
        this.IAuthTabCallback_Parcel.put(str, slVarOnExtraCallback);
        return slVarOnExtraCallback;
    }
}
