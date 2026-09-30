package o;

import java.util.Iterator;
import o.PAGBannerAdWrapperListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGBannerAdLoadCallback {
    public createBannerAdLoader[] IAuthTabCallback;
    public int[] IAuthTabCallbackDefault;
    public String[] IAuthTabCallbackStub;
    public int[] IAuthTabCallbackStubProxy;
    public ISDKTypeFactory[][] IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private int access000;
    private int access100;
    public ISDKTypeFactory[] asBinder;
    public ISDKTypeFactory[] asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    public ISDKTypeFactory[] getInterfaceDescriptor;
    private int onActivityLayout;
    private final PAGBannerAdInteractionListener onActivityResized;
    public getInlineAdaptiveBannerAdSize[] onExtraCallback;
    public IADLoader[] onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private int onMinimized;
    public int[] onNavigationEvent;
    private int onPostMessage;
    private Iterator<ISDKTypeFactory> onRelationshipValidationResult;
    public String[] onTransact;
    private int onUnminimized;
    public setSlotId[] onWarmupCompleted;
    private int readTypedObject;
    private int writeTypedObject;

    /* JADX INFO: Access modifiers changed from: private */
    public PAGBannerAdWrapperListener.onExtraCallbackWithResult onNavigationEvent(ISDKTypeFactory iSDKTypeFactory, int i, Iterator<ISDKTypeFactory> it) {
        ISDKTypeFactory[] iSDKTypeFactoryArr = new ISDKTypeFactory[i];
        PAGBannerAdWrapperListener.IAuthTabCallback[] iAuthTabCallbackArr = new PAGBannerAdWrapperListener.IAuthTabCallback[i];
        for (int i2 = 0; i2 < i; i2++) {
            iSDKTypeFactoryArr[i2] = it.next();
            int[] iArr = this.onNavigationEvent;
            int i3 = this.access000;
            this.access000 = i3 + 1;
            int i4 = iArr[i3];
            iAuthTabCallbackArr[i2] = new PAGBannerAdWrapperListener.IAuthTabCallback(i4, onNavigationEvent(i4));
        }
        return new PAGBannerAdWrapperListener.onExtraCallbackWithResult(i, iSDKTypeFactory, iSDKTypeFactoryArr, iAuthTabCallbackArr);
    }

    private Object onNavigationEvent(int i) {
        if (i == 64) {
            ISDKTypeFactory[] iSDKTypeFactoryArr = this.getInterfaceDescriptor;
            int i2 = this.ICustomTabsCallbackDefault;
            this.ICustomTabsCallbackDefault = i2 + 1;
            ISDKTypeFactory iSDKTypeFactory = iSDKTypeFactoryArr[i2];
            int[] iArr = this.IAuthTabCallbackStubProxy;
            int i3 = this.onUnminimized;
            this.onUnminimized = i3 + 1;
            return onNavigationEvent(iSDKTypeFactory, iArr[i3], this.onRelationshipValidationResult);
        }
        if (i != 70) {
            if (i != 83) {
                if (i == 99) {
                    ISDKTypeFactory[] iSDKTypeFactoryArr2 = this.asInterface;
                    int i4 = this.onActivityLayout;
                    this.onActivityLayout = i4 + 1;
                    return iSDKTypeFactoryArr2[i4];
                }
                if (i == 101) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = this.onTransact;
                    int i5 = this.onMessageChannelReady;
                    this.onMessageChannelReady = i5 + 1;
                    sb.append(strArr[i5]);
                    sb.append(":");
                    String[] strArr2 = this.IAuthTabCallbackStub;
                    int i6 = this.onPostMessage;
                    this.onPostMessage = i6 + 1;
                    sb.append(strArr2[i6]);
                    return this.onActivityResized.IAuthTabCallback(sb.toString());
                }
                if (i == 115) {
                    ISDKTypeFactory[] iSDKTypeFactoryArr3 = this.asBinder;
                    int i7 = this.onMinimized;
                    this.onMinimized = i7 + 1;
                    return iSDKTypeFactoryArr3[i7];
                }
                if (i != 73) {
                    if (i == 74) {
                        setSlotId[] setslotidArr = this.onWarmupCompleted;
                        int i8 = this.extraCallback;
                        this.extraCallback = i8 + 1;
                        return setslotidArr[i8];
                    }
                    if (i != 90) {
                        if (i != 91) {
                            switch (i) {
                                case 66:
                                case 67:
                                    break;
                                case 68:
                                    getInlineAdaptiveBannerAdSize[] getinlineadaptivebanneradsizeArr = this.onExtraCallback;
                                    int i9 = this.writeTypedObject;
                                    this.writeTypedObject = i9 + 1;
                                    return getinlineadaptivebanneradsizeArr[i9];
                                default:
                                    return null;
                            }
                        } else {
                            int[] iArr2 = this.IAuthTabCallbackDefault;
                            int i10 = this.readTypedObject;
                            this.readTypedObject = i10 + 1;
                            int i11 = iArr2[i10];
                            PAGBannerAdWrapperListener.IAuthTabCallback[] iAuthTabCallbackArr = new PAGBannerAdWrapperListener.IAuthTabCallback[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                int[] iArr3 = this.onNavigationEvent;
                                int i13 = this.access000;
                                this.access000 = i13 + 1;
                                int i14 = iArr3[i13];
                                iAuthTabCallbackArr[i12] = new PAGBannerAdWrapperListener.IAuthTabCallback(i14, onNavigationEvent(i14));
                            }
                            return iAuthTabCallbackArr;
                        }
                    }
                }
            }
            IADLoader[] iADLoaderArr = this.onExtraCallbackWithResult;
            int i15 = this.extraCallbackWithResult;
            this.extraCallbackWithResult = i15 + 1;
            return iADLoaderArr[i15];
        }
        createBannerAdLoader[] createbanneradloaderArr = this.IAuthTabCallback;
        int i16 = this.ICustomTabsCallback;
        this.ICustomTabsCallback = i16 + 1;
        return createbanneradloaderArr[i16];
    }
}
