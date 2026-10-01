package o;

import com.google.common.collect.ImmutableList;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class IconKtExternalSyntheticLambda1 implements FloatingActionButtonKtExternalSyntheticLambda1 {
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallback;

    @Override // o.FloatingActionButtonKtExternalSyntheticLambda1
    public int onExtraCallbackWithResult() {
        return 1718776947;
    }

    public static FloatingActionButtonKtExternalSyntheticLambda1 onExtraCallback(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (i2 == 2) {
            return onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        if (i2 == 1) {
            return IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onTransact(i2));
        return null;
    }

    public IconKtExternalSyntheticLambda1(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        this.onExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4;
    }

    private static FloatingActionButtonKtExternalSyntheticLambda1 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        int interfaceDescriptor2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int interfaceDescriptor3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(interfaceDescriptor3);
        if (strOnExtraCallbackWithResult == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("StreamFormatChunk", "Ignoring track with unsupported compression " + interfaceDescriptor3);
            return null;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
        onextracallbackwithresult.onActivityLayout(interfaceDescriptor).access100(interfaceDescriptor2).IAuthTabCallbackDefault(strOnExtraCallbackWithResult);
        return new IconKtExternalSyntheticLambda1(onextracallbackwithresult.onNavigationEvent());
    }

    private static FloatingActionButtonKtExternalSyntheticLambda1 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iWriteTypedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
        String strOnNavigationEvent = onNavigationEvent(iWriteTypedObject);
        if (strOnNavigationEvent == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("StreamFormatChunk", "Ignoring track with unsupported format tag " + iWriteTypedObject);
            return null;
        }
        int iWriteTypedObject2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
        int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(6);
        int iIAuthTabCallbackStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject());
        int iWriteTypedObject3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject() : 0;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
        onextracallbackwithresult.IAuthTabCallbackDefault(strOnNavigationEvent).onExtraCallback(iWriteTypedObject2).extraCallbackWithResult(interfaceDescriptor);
        if (strOnNavigationEvent.equals("audio/raw") && iIAuthTabCallbackStub != 0) {
            onextracallbackwithresult.writeTypedObject(iIAuthTabCallbackStub);
        }
        if (strOnNavigationEvent.equals("audio/mp4a-latm") && iWriteTypedObject3 > 0) {
            byte[] bArr = new byte[iWriteTypedObject3];
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, iWriteTypedObject3);
            onextracallbackwithresult.IAuthTabCallback(ImmutableList.of(bArr));
        }
        return new IconKtExternalSyntheticLambda1(onextracallbackwithresult.onNavigationEvent());
    }

    private static String onNavigationEvent(int i2) {
        if (i2 == 1) {
            return "audio/raw";
        }
        if (i2 == 85) {
            return "audio/mpeg";
        }
        if (i2 == 255) {
            return "audio/mp4a-latm";
        }
        if (i2 == 8192) {
            return "audio/ac3";
        }
        if (i2 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static String onExtraCallbackWithResult(int i2) {
        switch (i2) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }
}
