package o;

import java.util.Arrays;
import javax.annotation.Nullable;
import o.szb;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class uhs {
    static final int[] IAuthTabCallback = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private static final char[] IAuthTabCallbackDefault;
    szb.IAuthTabCallbackStub IAuthTabCallbackStub;

    @Nullable
    private String ICustomTabsCallback;
    private szb access000;
    private String extraCallback;
    private final sim getInterfaceDescriptor;
    private final rdj writeTypedObject;
    private uc readTypedObject = uc.Data;
    private boolean IAuthTabCallback_Parcel = false;
    private String access100 = null;
    private StringBuilder asInterface = new StringBuilder(1024);
    StringBuilder onWarmupCompleted = new StringBuilder(1024);
    szb.asBinder onTransact = new szb.asBinder();
    szb.IAuthTabCallbackDefault asBinder = new szb.IAuthTabCallbackDefault();
    szb.onExtraCallback onNavigationEvent = new szb.onExtraCallback();
    szb.onNavigationEvent onExtraCallbackWithResult = new szb.onNavigationEvent();
    szb.onExtraCallbackWithResult onExtraCallback = new szb.onExtraCallbackWithResult();
    private final int[] IAuthTabCallbackStubProxy = new int[1];
    private final int[] extraCallbackWithResult = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        IAuthTabCallbackDefault = cArr;
        Arrays.sort(cArr);
    }

    uhs(rdj rdjVar, sim simVar) {
        this.writeTypedObject = rdjVar;
        this.getInterfaceDescriptor = simVar;
    }

    szb access100() {
        while (!this.IAuthTabCallback_Parcel) {
            this.readTypedObject.read(this, this.writeTypedObject);
        }
        StringBuilder sb = this.asInterface;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.access100 = null;
            return this.onNavigationEvent.onWarmupCompleted(string);
        }
        String str = this.access100;
        if (str != null) {
            szb.onExtraCallback onextracallbackOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(str);
            this.access100 = null;
            return onextracallbackOnWarmupCompleted;
        }
        this.IAuthTabCallback_Parcel = false;
        return this.access000;
    }

    void onExtraCallbackWithResult(szb szbVar) {
        oas.IAuthTabCallback(this.IAuthTabCallback_Parcel);
        this.access000 = szbVar;
        this.IAuthTabCallback_Parcel = true;
        szb.onTransact ontransact = szbVar.onExtraCallbackWithResult;
        if (ontransact == szb.onTransact.StartTag) {
            this.extraCallback = ((szb.asBinder) szbVar).onNavigationEvent;
            this.ICustomTabsCallback = null;
        } else if (ontransact == szb.onTransact.EndTag) {
            szb.IAuthTabCallbackDefault iAuthTabCallbackDefault = (szb.IAuthTabCallbackDefault) szbVar;
            if (iAuthTabCallbackDefault.extraCallback()) {
                onExtraCallbackWithResult("Attributes incorrectly present on end tag [/%s]", iAuthTabCallbackDefault.onActivityLayout());
            }
        }
    }

    void IAuthTabCallback(String str) {
        if (this.access100 == null) {
            this.access100 = str;
            return;
        }
        if (this.asInterface.length() == 0) {
            this.asInterface.append(this.access100);
        }
        this.asInterface.append(str);
    }

    void IAuthTabCallback(StringBuilder sb) {
        if (this.access100 == null) {
            this.access100 = sb.toString();
            return;
        }
        if (this.asInterface.length() == 0) {
            this.asInterface.append(this.access100);
        }
        this.asInterface.append((CharSequence) sb);
    }

    void onNavigationEvent(char c) {
        if (this.access100 == null) {
            this.access100 = String.valueOf(c);
            return;
        }
        if (this.asInterface.length() == 0) {
            this.asInterface.append(this.access100);
        }
        this.asInterface.append(c);
    }

    void onWarmupCompleted(int[] iArr) {
        IAuthTabCallback(new String(iArr, 0, iArr.length));
    }

    void IAuthTabCallback(uc ucVar) {
        this.readTypedObject = ucVar;
    }

    void onWarmupCompleted(uc ucVar) {
        this.writeTypedObject.IAuthTabCallback();
        this.readTypedObject = ucVar;
    }

    @Nullable
    int[] onWarmupCompleted(Character ch, boolean z) {
        int iIntValue;
        if (this.writeTypedObject.access000()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.writeTypedObject.IAuthTabCallbackStubProxy()) || this.writeTypedObject.onExtraCallback(IAuthTabCallbackDefault)) {
            return null;
        }
        int[] iArr = this.IAuthTabCallbackStubProxy;
        this.writeTypedObject.readTypedObject();
        if (this.writeTypedObject.onWarmupCompleted("#")) {
            boolean zOnExtraCallbackWithResult = this.writeTypedObject.onExtraCallbackWithResult("X");
            rdj rdjVar = this.writeTypedObject;
            String strIAuthTabCallbackDefault = zOnExtraCallbackWithResult ? rdjVar.IAuthTabCallbackDefault() : rdjVar.asInterface();
            if (strIAuthTabCallbackDefault.length() == 0) {
                onWarmupCompleted("numeric reference with no numerals", new Object[0]);
                this.writeTypedObject.onActivityLayout();
                return null;
            }
            this.writeTypedObject.onMinimized();
            if (!this.writeTypedObject.onWarmupCompleted(";")) {
                onWarmupCompleted("missing semicolon on [&#%s]", strIAuthTabCallbackDefault);
            }
            try {
                iIntValue = Integer.valueOf(strIAuthTabCallbackDefault, zOnExtraCallbackWithResult ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                onWarmupCompleted("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128) {
                    int[] iArr2 = IAuthTabCallback;
                    if (iIntValue < iArr2.length + 128) {
                        onWarmupCompleted("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                        iIntValue = iArr2[iIntValue - 128];
                    }
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        String strAsBinder = this.writeTypedObject.asBinder();
        boolean zOnWarmupCompleted = this.writeTypedObject.onWarmupCompleted(';');
        if (!pvm.IAuthTabCallback(strAsBinder) && (!pvm.onExtraCallbackWithResult(strAsBinder) || !zOnWarmupCompleted)) {
            this.writeTypedObject.onActivityLayout();
            if (zOnWarmupCompleted) {
                onWarmupCompleted("invalid named reference [%s]", strAsBinder);
            }
            return null;
        }
        if (z && (this.writeTypedObject.onPostMessage() || this.writeTypedObject.extraCallback() || this.writeTypedObject.onNavigationEvent('=', '-', '_'))) {
            this.writeTypedObject.onActivityLayout();
            return null;
        }
        this.writeTypedObject.onMinimized();
        if (!this.writeTypedObject.onWarmupCompleted(";")) {
            onWarmupCompleted("missing semicolon on [&%s]", strAsBinder);
        }
        int iIAuthTabCallback = pvm.IAuthTabCallback(strAsBinder, this.extraCallbackWithResult);
        if (iIAuthTabCallback == 1) {
            iArr[0] = this.extraCallbackWithResult[0];
            return iArr;
        }
        if (iIAuthTabCallback == 2) {
            return this.extraCallbackWithResult;
        }
        oas.onWarmupCompleted("Unexpected characters returned for " + strAsBinder);
        return this.extraCallbackWithResult;
    }

    szb.IAuthTabCallbackStub onExtraCallbackWithResult(boolean z) {
        szb.IAuthTabCallbackStub iAuthTabCallbackStubAccess100 = z ? this.onTransact.access100() : this.asBinder.access100();
        this.IAuthTabCallbackStub = iAuthTabCallbackStubAccess100;
        return iAuthTabCallbackStubAccess100;
    }

    void IAuthTabCallbackStub() {
        this.IAuthTabCallbackStub.readTypedObject();
        onExtraCallbackWithResult(this.IAuthTabCallbackStub);
    }

    void onNavigationEvent() {
        this.onExtraCallback.access100();
    }

    void IAuthTabCallbackDefault() {
        onExtraCallbackWithResult(this.onExtraCallback);
    }

    void onExtraCallbackWithResult() {
        this.onExtraCallback.access100();
        this.onExtraCallback.onWarmupCompleted = true;
    }

    void onExtraCallback() {
        this.onExtraCallbackWithResult.access100();
    }

    void asInterface() {
        onExtraCallbackWithResult(this.onExtraCallbackWithResult);
    }

    void asBinder() {
        szb.IAuthTabCallback(this.onWarmupCompleted);
    }

    boolean onTransact() {
        return this.extraCallback != null && this.IAuthTabCallbackStub.ICustomTabsCallback().equalsIgnoreCase(this.extraCallback);
    }

    String onWarmupCompleted() {
        return this.extraCallback;
    }

    String IAuthTabCallback() {
        if (this.ICustomTabsCallback == null) {
            this.ICustomTabsCallback = "</" + this.extraCallback;
        }
        return this.ICustomTabsCallback;
    }

    void onExtraCallback(uc ucVar) {
        if (this.getInterfaceDescriptor.onNavigationEvent()) {
            sim simVar = this.getInterfaceDescriptor;
            rdj rdjVar = this.writeTypedObject;
            simVar.add(new rg(rdjVar, "Unexpected character '%s' in input state [%s]", Character.valueOf(rdjVar.IAuthTabCallbackStubProxy()), ucVar));
        }
    }

    void onNavigationEvent(uc ucVar) {
        if (this.getInterfaceDescriptor.onNavigationEvent()) {
            this.getInterfaceDescriptor.add(new rg(this.writeTypedObject, "Unexpectedly reached end of file (EOF) in input state [%s]", ucVar));
        }
    }

    private void onWarmupCompleted(String str, Object... objArr) {
        if (this.getInterfaceDescriptor.onNavigationEvent()) {
            this.getInterfaceDescriptor.add(new rg(this.writeTypedObject, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    void onExtraCallbackWithResult(String str, Object... objArr) {
        if (this.getInterfaceDescriptor.onNavigationEvent()) {
            this.getInterfaceDescriptor.add(new rg(this.writeTypedObject, str, objArr));
        }
    }
}
