package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem;
import kotlin.jvm.internal.Intrinsics;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda45 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 onExtraCallback(@NotNull AppsInTossPurchasedDetailItem appsInTossPurchasedDetailItem) {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appsInTossPurchasedDetailItem, "");
        String strExtraCallback = appsInTossPurchasedDetailItem.extraCallback();
        if (strExtraCallback != null) {
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            switch (strExtraCallback.hashCode()) {
                case -1636482787:
                    if (strExtraCallback.equals("SUBSCRIPTION")) {
                        return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onExtraCallback(appsInTossPurchasedDetailItem.onNavigationEvent(), appsInTossPurchasedDetailItem.IAuthTabCallbackDefault(), appsInTossPurchasedDetailItem.onTransact(), (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1510801612, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 1510801614, C40Encoder.onExtraCallback()), appsInTossPurchasedDetailItem.IAuthTabCallbackStub(), appsInTossPurchasedDetailItem.onExtraCallback(), appsInTossPurchasedDetailItem.access000(), appsInTossPurchasedDetailItem.getInterfaceDescriptor(), appsInTossPurchasedDetailItem.onWarmupCompleted(), appsInTossPurchasedDetailItem.IAuthTabCallbackStubProxy());
                    }
                    break;
                case -1300143257:
                    if (strExtraCallback.equals("SUBSCRIBING")) {
                        String strOnNavigationEvent = appsInTossPurchasedDetailItem.onNavigationEvent();
                        String strIAuthTabCallbackDefault = appsInTossPurchasedDetailItem.IAuthTabCallbackDefault();
                        String strOnTransact = appsInTossPurchasedDetailItem.onTransact();
                        String str5 = (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1510801612, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 1510801614, C40Encoder.onExtraCallback());
                        String strIAuthTabCallbackStub = appsInTossPurchasedDetailItem.IAuthTabCallbackStub();
                        String strOnExtraCallback = appsInTossPurchasedDetailItem.onExtraCallback();
                        String strAccess000 = appsInTossPurchasedDetailItem.access000();
                        String interfaceDescriptor = appsInTossPurchasedDetailItem.getInterfaceDescriptor();
                        String strOnWarmupCompleted = appsInTossPurchasedDetailItem.onWarmupCompleted();
                        String str6 = (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1109341534, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 1109341534, C40Encoder.onExtraCallback());
                        if (str6 == null) {
                            int i6 = onExtraCallback + 67;
                            onExtraCallbackWithResult = i6 % 128;
                            if (i6 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            str = "";
                        } else {
                            str = str6;
                        }
                        String strAsBinder = appsInTossPurchasedDetailItem.asBinder();
                        String str7 = strAsBinder == null ? "" : strAsBinder;
                        String strAsInterface = appsInTossPurchasedDetailItem.asInterface();
                        String strWriteTypedObject = appsInTossPurchasedDetailItem.writeTypedObject();
                        String str8 = strWriteTypedObject == null ? "" : strWriteTypedObject;
                        String str9 = (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -2036189333, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 2036189334, C40Encoder.onExtraCallback());
                        if (str9 == null) {
                            int i7 = onExtraCallback + 123;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 58 / 0;
                            }
                            str2 = "";
                        } else {
                            str2 = str9;
                        }
                        return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.C0019onWarmupCompleted(strOnNavigationEvent, strIAuthTabCallbackDefault, strOnTransact, str5, strIAuthTabCallbackStub, strOnExtraCallback, strAccess000, interfaceDescriptor, strOnWarmupCompleted, str, str8, str2, str7, strAsInterface);
                    }
                    break;
                case -1031784143:
                    if (strExtraCallback.equals("CANCELLED")) {
                        String strOnNavigationEvent2 = appsInTossPurchasedDetailItem.onNavigationEvent();
                        String strIAuthTabCallbackDefault2 = appsInTossPurchasedDetailItem.IAuthTabCallbackDefault();
                        String strOnTransact2 = appsInTossPurchasedDetailItem.onTransact();
                        String str10 = (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1510801612, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 1510801614, C40Encoder.onExtraCallback());
                        String strIAuthTabCallbackStub2 = appsInTossPurchasedDetailItem.IAuthTabCallbackStub();
                        String strOnExtraCallback2 = appsInTossPurchasedDetailItem.onExtraCallback();
                        String strAccess0002 = appsInTossPurchasedDetailItem.access000();
                        String interfaceDescriptor2 = appsInTossPurchasedDetailItem.getInterfaceDescriptor();
                        String strOnWarmupCompleted2 = appsInTossPurchasedDetailItem.onWarmupCompleted();
                        String strIAuthTabCallbackStubProxy = appsInTossPurchasedDetailItem.IAuthTabCallbackStubProxy();
                        if (strIAuthTabCallbackStubProxy == null) {
                            int i9 = onExtraCallback + 47;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            str3 = "";
                        } else {
                            str3 = strIAuthTabCallbackStubProxy;
                        }
                        return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onNavigationEvent(strOnNavigationEvent2, strIAuthTabCallbackDefault2, strOnTransact2, str10, strIAuthTabCallbackStub2, strOnExtraCallback2, strAccess0002, interfaceDescriptor2, strOnWarmupCompleted2, str3);
                    }
                    break;
                case -290017821:
                    if (strExtraCallback.equals("SUBSCRIPTION_EXPIRED")) {
                        String strOnNavigationEvent3 = appsInTossPurchasedDetailItem.onNavigationEvent();
                        String strIAuthTabCallbackDefault3 = appsInTossPurchasedDetailItem.IAuthTabCallbackDefault();
                        String strOnTransact3 = appsInTossPurchasedDetailItem.onTransact();
                        String str11 = (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1510801612, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 1510801614, C40Encoder.onExtraCallback());
                        String strIAuthTabCallbackStub3 = appsInTossPurchasedDetailItem.IAuthTabCallbackStub();
                        String strOnExtraCallback3 = appsInTossPurchasedDetailItem.onExtraCallback();
                        String strAccess0003 = appsInTossPurchasedDetailItem.access000();
                        String interfaceDescriptor3 = appsInTossPurchasedDetailItem.getInterfaceDescriptor();
                        String strOnWarmupCompleted3 = appsInTossPurchasedDetailItem.onWarmupCompleted();
                        String str12 = (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1109341534, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 1109341534, C40Encoder.onExtraCallback());
                        String str13 = str12 == null ? "" : str12;
                        String strWriteTypedObject2 = appsInTossPurchasedDetailItem.writeTypedObject();
                        String str14 = strWriteTypedObject2 == null ? "" : strWriteTypedObject2;
                        String str15 = (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -2036189333, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 2036189334, C40Encoder.onExtraCallback());
                        String str16 = str15 == null ? "" : str15;
                        String strIAuthTabCallback = appsInTossPurchasedDetailItem.IAuthTabCallback();
                        if (strIAuthTabCallback == null) {
                            int i11 = onExtraCallback + 27;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            str4 = "";
                        } else {
                            str4 = strIAuthTabCallback;
                        }
                        String strOnExtraCallbackWithResult = appsInTossPurchasedDetailItem.onExtraCallbackWithResult();
                        String str17 = strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult;
                        String strIAuthTabCallback_Parcel = appsInTossPurchasedDetailItem.IAuthTabCallback_Parcel();
                        return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult(strOnNavigationEvent3, strIAuthTabCallbackDefault3, strOnTransact3, str11, strIAuthTabCallbackStub3, strOnExtraCallback3, strAccess0003, interfaceDescriptor3, strOnWarmupCompleted3, str13, str14, str16, str4, str17, strIAuthTabCallback_Parcel == null ? "" : strIAuthTabCallback_Parcel);
                    }
                    break;
            }
        }
        return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.IAuthTabCallback(appsInTossPurchasedDetailItem.onNavigationEvent(), appsInTossPurchasedDetailItem.IAuthTabCallbackDefault(), appsInTossPurchasedDetailItem.onTransact(), (String) AppsInTossPurchasedDetailItem.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1510801612, C40Encoder.onExtraCallback(), new Object[]{appsInTossPurchasedDetailItem}, 1510801614, C40Encoder.onExtraCallback()), appsInTossPurchasedDetailItem.IAuthTabCallbackStub(), appsInTossPurchasedDetailItem.onExtraCallback(), appsInTossPurchasedDetailItem.access000(), appsInTossPurchasedDetailItem.getInterfaceDescriptor(), appsInTossPurchasedDetailItem.onWarmupCompleted(), appsInTossPurchasedDetailItem.IAuthTabCallbackStubProxy());
    }
}
