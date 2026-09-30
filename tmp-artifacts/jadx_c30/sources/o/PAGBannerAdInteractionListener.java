package o;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGBannerAdInteractionListener extends PAGBannerAd1 {
    private int[] IAuthTabCallback;
    private Map<String, Integer> IAuthTabCallbackDefault;
    private String[] IAuthTabCallbackStub;
    private final Map<String, ISDKTypeFactory> IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private Map<String, Integer> access000;
    private Map<String, Integer> access100;
    private final Map<String, IADTypeLoaderFactory> asBinder;
    private int[] asInterface;
    private int[] onExtraCallback;
    private String[] onExtraCallbackWithResult;
    private String[] onNavigationEvent;
    private int onTransact;
    private int[] onWarmupCompleted;

    public IADTypeLoaderFactory IAuthTabCallback(int i) {
        String str = this.onExtraCallbackWithResult[i];
        IADTypeLoaderFactory iADTypeLoaderFactory = this.asBinder.get(str);
        if (iADTypeLoaderFactory != null) {
            return iADTypeLoaderFactory;
        }
        IADTypeLoaderFactory iADTypeLoaderFactory2 = new IADTypeLoaderFactory(onExtraCallback(this.IAuthTabCallback[i]), onNavigationEvent(this.onWarmupCompleted[i]), i + this.onTransact);
        this.asBinder.put(str, iADTypeLoaderFactory2);
        return iADTypeLoaderFactory2;
    }

    public IADTypeLoaderFactory IAuthTabCallback(String str) {
        IADTypeLoaderFactory iADTypeLoaderFactory = this.asBinder.get(str);
        if (iADTypeLoaderFactory != null) {
            return iADTypeLoaderFactory;
        }
        Integer num = this.IAuthTabCallbackDefault.get(str);
        if (num != null) {
            return IAuthTabCallback(num.intValue());
        }
        int iIndexOf = str.indexOf(58);
        IADTypeLoaderFactory iADTypeLoaderFactory2 = new IADTypeLoaderFactory(onNavigationEvent(str.substring(0, iIndexOf), true), onNavigationEvent(str.substring(iIndexOf + 1), true), this.onTransact - 1);
        this.asBinder.put(str, iADTypeLoaderFactory2);
        return iADTypeLoaderFactory2;
    }

    public ISDKTypeFactory onNavigationEvent(int i) {
        int i2 = this.onExtraCallback[i];
        if (i2 == -1) {
            i2 = this.IAuthTabCallback_Parcel + i;
        }
        String str = this.onNavigationEvent[i];
        ISDKTypeFactory iSDKTypeFactory = this.IAuthTabCallbackStubProxy.get(str);
        if (iSDKTypeFactory != null) {
            return iSDKTypeFactory;
        }
        ISDKTypeFactory iSDKTypeFactory2 = new ISDKTypeFactory(str, i2);
        this.IAuthTabCallbackStubProxy.put(str, iSDKTypeFactory2);
        return iSDKTypeFactory2;
    }

    public ISDKTypeFactory onExtraCallback(int i) {
        String str = this.IAuthTabCallbackStub[i];
        ISDKTypeFactory iSDKTypeFactory = this.IAuthTabCallbackStubProxy.get(str);
        if (iSDKTypeFactory == null) {
            ISDKTypeFactory iSDKTypeFactory2 = new ISDKTypeFactory(str, i);
            this.IAuthTabCallbackStubProxy.put(str, iSDKTypeFactory2);
            return iSDKTypeFactory2;
        }
        if (iSDKTypeFactory.onNavigationEvent() > i) {
            iSDKTypeFactory.IAuthTabCallback(i);
        }
        return iSDKTypeFactory;
    }

    public ISDKTypeFactory onNavigationEvent(String str, boolean z) {
        ISDKTypeFactory iSDKTypeFactory = this.IAuthTabCallbackStubProxy.get(str);
        if (iSDKTypeFactory != null) {
            return iSDKTypeFactory;
        }
        Integer num = z ? this.access000.get(str) : null;
        if (num != null) {
            return onExtraCallback(num.intValue());
        }
        if (z) {
            num = this.access100.get(str);
        }
        if (num != null) {
            return onNavigationEvent(num.intValue());
        }
        ISDKTypeFactory iSDKTypeFactory2 = new ISDKTypeFactory(str, -1);
        this.IAuthTabCallbackStubProxy.put(str, iSDKTypeFactory2);
        return iSDKTypeFactory2;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(PAGBannerAdInteractionListener pAGBannerAdInteractionListener, int i) {
        return pAGBannerAdInteractionListener.IAuthTabCallbackStub[pAGBannerAdInteractionListener.asInterface[i]];
    }
}
