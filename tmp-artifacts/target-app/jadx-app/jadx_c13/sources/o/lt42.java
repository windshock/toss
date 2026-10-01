package o;

import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class lt42 {
    public static final yzp2 IAuthTabCallback;
    public static final yzp2 IAuthTabCallbackDefault;
    public static final yzp2 IAuthTabCallbackStub;
    public static final yzp2 IAuthTabCallbackStubProxy;
    private static final Map<yzp2, String> IAuthTabCallback_Parcel;
    private static final Pattern access000;
    private static final Map<yzp2, Integer> access100;
    public static final yzp2 asBinder;
    public static final yzp2 asInterface;
    public static final yzp2 getInterfaceDescriptor;

    @Deprecated
    public static final yzp2 onExtraCallbackWithResult;
    public static final yzp2 onNavigationEvent;
    public static final yzp2 onTransact;
    public static final Duration onWarmupCompleted;
    private final yzp2 ICustomTabsCallback;
    private final SecretKey extraCallback;
    private final Clock extraCallbackWithResult;
    private final Mac onActivityLayout;
    private final yzp2 onMinimized;
    private final String readTypedObject;
    private static final AppSetIdAndScope1 writeTypedObject = ea10.onWarmupCompleted((Class<?>) lt42.class);
    public static final yzp2 onExtraCallback = yzp2.onWarmupCompleted("gss-tsig.");

    static {
        yzp2 yzp2VarOnWarmupCompleted = yzp2.onWarmupCompleted("HMAC-MD5.SIG-ALG.REG.INT.");
        IAuthTabCallback = yzp2VarOnWarmupCompleted;
        onExtraCallbackWithResult = yzp2VarOnWarmupCompleted;
        yzp2 yzp2VarOnWarmupCompleted2 = yzp2.onWarmupCompleted("hmac-sha1.");
        onNavigationEvent = yzp2VarOnWarmupCompleted2;
        yzp2 yzp2VarOnWarmupCompleted3 = yzp2.onWarmupCompleted("hmac-sha224.");
        onTransact = yzp2VarOnWarmupCompleted3;
        yzp2 yzp2VarOnWarmupCompleted4 = yzp2.onWarmupCompleted("hmac-sha256.");
        IAuthTabCallbackStub = yzp2VarOnWarmupCompleted4;
        yzp2 yzp2VarOnWarmupCompleted5 = yzp2.onWarmupCompleted("hmac-sha384.");
        IAuthTabCallbackDefault = yzp2VarOnWarmupCompleted5;
        yzp2 yzp2VarOnWarmupCompleted6 = yzp2.onWarmupCompleted("hmac-sha512.");
        IAuthTabCallbackStubProxy = yzp2VarOnWarmupCompleted6;
        yzp2 yzp2VarOnWarmupCompleted7 = yzp2.onWarmupCompleted("hmac-sha256-128.");
        asBinder = yzp2VarOnWarmupCompleted7;
        yzp2 yzp2VarOnWarmupCompleted8 = yzp2.onWarmupCompleted("hmac-sha384-192.");
        asInterface = yzp2VarOnWarmupCompleted8;
        yzp2 yzp2VarOnWarmupCompleted9 = yzp2.onWarmupCompleted("hmac-sha512-256.");
        getInterfaceDescriptor = yzp2VarOnWarmupCompleted9;
        access000 = Pattern.compile("^Hmac(?<alg>(SHA(1|\\d{3})|MD5))(/(?<length>\\d{3}))?$", 2);
        TreeMap treeMap = new TreeMap();
        treeMap.put(yzp2VarOnWarmupCompleted, "HmacMD5");
        treeMap.put(yzp2VarOnWarmupCompleted2, "HmacSHA1");
        treeMap.put(yzp2VarOnWarmupCompleted3, "HmacSHA224");
        treeMap.put(yzp2VarOnWarmupCompleted4, "HmacSHA256");
        treeMap.put(yzp2VarOnWarmupCompleted5, "HmacSHA384");
        treeMap.put(yzp2VarOnWarmupCompleted6, "HmacSHA512");
        treeMap.put(yzp2VarOnWarmupCompleted7, "HmacSHA256");
        treeMap.put(yzp2VarOnWarmupCompleted8, "HmacSHA384");
        treeMap.put(yzp2VarOnWarmupCompleted9, "HmacSHA512");
        IAuthTabCallback_Parcel = Collections.unmodifiableMap(treeMap);
        HashMap map = new HashMap();
        map.put(yzp2VarOnWarmupCompleted, 16);
        map.put(yzp2VarOnWarmupCompleted2, 20);
        map.put(yzp2VarOnWarmupCompleted3, 28);
        map.put(yzp2VarOnWarmupCompleted4, 32);
        map.put(yzp2VarOnWarmupCompleted5, 48);
        map.put(yzp2VarOnWarmupCompleted6, 64);
        map.put(yzp2VarOnWarmupCompleted7, 16);
        map.put(yzp2VarOnWarmupCompleted8, 24);
        map.put(yzp2VarOnWarmupCompleted9, 32);
        access100 = Collections.unmodifiableMap(map);
        onWarmupCompleted = Duration.ofSeconds(300L);
    }

    private static boolean onExtraCallbackWithResult(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr = bArr3;
        }
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mac onExtraCallbackWithResult() throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = this.onActivityLayout;
        if (mac != null) {
            try {
                return (Mac) mac.clone();
            } catch (CloneNotSupportedException unused) {
                this.onActivityLayout.reset();
                return this.onActivityLayout;
            }
        }
        try {
            Mac mac2 = Mac.getInstance(this.readTypedObject);
            mac2.init(this.extraCallback);
            return mac2;
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("Caught security exception setting up HMAC.", e);
        }
    }

    public lt46 onWarmupCompleted(onChildViewAdded onchildviewadded, byte[] bArr, int i, lt46 lt46Var) {
        return onExtraCallback(onchildviewadded, bArr, i, lt46Var, true);
    }

    public lt46 onExtraCallback(onChildViewAdded onchildviewadded, byte[] bArr, int i, lt46 lt46Var, boolean z) {
        return onExtraCallbackWithResult(onchildviewadded, bArr, i, lt46Var, z, (i == 0 || i == 18 || i == 22) ? onExtraCallbackWithResult() : null);
    }

    private lt46 onExtraCallbackWithResult(onChildViewAdded onchildviewadded, byte[] bArr, int i, lt46 lt46Var, boolean z, Mac mac) throws IllegalStateException, NumberFormatException {
        byte[] bArrDoFinal;
        byte[] bArrIAuthTabCallback;
        Instant instantOnWarmupCompleted = onWarmupCompleted(i, lt46Var);
        Duration durationOnNavigationEvent = onNavigationEvent();
        boolean z2 = mac != null;
        if (lt46Var != null && z2) {
            IAuthTabCallback(mac, lt46Var);
        }
        if (z2) {
            if (writeTypedObject.onNavigationEvent()) {
                UST_TRANS_GenerateCertNum.onNavigationEvent("TSIG-HMAC rendered message", bArr);
            }
            mac.update(bArr);
        }
        deactivate deactivateVar = new deactivate();
        if (z) {
            this.onMinimized.IAuthTabCallback(deactivateVar);
            deactivateVar.IAuthTabCallback(255);
            deactivateVar.onWarmupCompleted(0L);
            this.ICustomTabsCallback.IAuthTabCallback(deactivateVar);
        }
        onExtraCallbackWithResult(instantOnWarmupCompleted, durationOnNavigationEvent, deactivateVar);
        if (z) {
            deactivateVar.IAuthTabCallback(i);
            deactivateVar.IAuthTabCallback(0);
        }
        if (z2) {
            byte[] bArrIAuthTabCallback2 = deactivateVar.IAuthTabCallback();
            if (writeTypedObject.onNavigationEvent()) {
                UST_TRANS_GenerateCertNum.onNavigationEvent("TSIG-HMAC variables", bArrIAuthTabCallback2);
            }
            bArrDoFinal = mac.doFinal(bArrIAuthTabCallback2);
            int length = bArrDoFinal.length;
            Map<yzp2, Integer> map = access100;
            if (length > map.get(this.ICustomTabsCallback).intValue()) {
                bArrDoFinal = Arrays.copyOfRange(bArrDoFinal, 0, map.get(this.ICustomTabsCallback).intValue());
            }
        } else {
            bArrDoFinal = new byte[0];
        }
        byte[] bArr2 = bArrDoFinal;
        if (i == 18) {
            deactivate deactivateVar2 = new deactivate(6);
            IAuthTabCallback(this.extraCallbackWithResult.instant(), deactivateVar2);
            bArrIAuthTabCallback = deactivateVar2.IAuthTabCallback();
        } else {
            bArrIAuthTabCallback = null;
        }
        return new lt46(this.onMinimized, 255, 0L, this.ICustomTabsCallback, instantOnWarmupCompleted, durationOnNavigationEvent, bArr2, onchildviewadded.IAuthTabCallback().onNavigationEvent(), i, bArrIAuthTabCallback);
    }

    private Instant onWarmupCompleted(int i, lt46 lt46Var) {
        return i == 18 ? lt46Var.IAuthTabCallbackDefault() : this.extraCallbackWithResult.instant();
    }

    private static Duration onNavigationEvent() throws NumberFormatException {
        int iOnExtraCallback = lt17.onExtraCallback("tsigfudge");
        return (iOnExtraCallback < 0 || iOnExtraCallback > 32767) ? onWarmupCompleted : Duration.ofSeconds(iOnExtraCallback);
    }

    public void onWarmupCompleted(onChildViewAdded onchildviewadded, lt46 lt46Var) {
        IAuthTabCallback(onchildviewadded, 0, lt46Var, true);
    }

    public void onWarmupCompleted(onChildViewAdded onchildviewadded, lt46 lt46Var, boolean z) {
        IAuthTabCallback(onchildviewadded, 0, lt46Var, z);
    }

    public void IAuthTabCallback(onChildViewAdded onchildviewadded, int i, lt46 lt46Var, boolean z) {
        onchildviewadded.onNavigationEvent(onExtraCallback(onchildviewadded, onchildviewadded.access100(), i, lt46Var, z), 3);
        onchildviewadded.onExtraCallback = 3;
    }

    public int onExtraCallbackWithResult(onChildViewAdded onchildviewadded, byte[] bArr, lt46 lt46Var) {
        return onNavigationEvent(onchildviewadded, bArr, lt46Var, true);
    }

    public int onNavigationEvent(onChildViewAdded onchildviewadded, byte[] bArr, lt46 lt46Var, boolean z) {
        return onExtraCallback(onchildviewadded, bArr, lt46Var, z, (Mac) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onExtraCallback(onChildViewAdded onchildviewadded, byte[] bArr, lt46 lt46Var, boolean z, Mac mac) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        onchildviewadded.onExtraCallback = 4;
        lt46 lt46VarIAuthTabCallbackDefault = onchildviewadded.IAuthTabCallbackDefault();
        if (lt46VarIAuthTabCallbackDefault == null) {
            return 1;
        }
        if (!lt46VarIAuthTabCallbackDefault.access000().equals(this.onMinimized) || !lt46VarIAuthTabCallbackDefault.onExtraCallbackWithResult().equals(this.ICustomTabsCallback)) {
            int iOnNavigationEvent = onchildviewadded.IAuthTabCallback().onNavigationEvent();
            new Object[]{Integer.valueOf(iOnNavigationEvent), this.onMinimized, this.ICustomTabsCallback, lt46VarIAuthTabCallbackDefault.access000(), lt46VarIAuthTabCallbackDefault.onExtraCallbackWithResult()};
            return 17;
        }
        if (mac == null) {
            mac = onExtraCallbackWithResult();
        }
        if (lt46Var != null && lt46VarIAuthTabCallbackDefault.onExtraCallback() != 17 && lt46VarIAuthTabCallbackDefault.onExtraCallback() != 16) {
            IAuthTabCallback(mac, lt46Var);
        }
        onchildviewadded.IAuthTabCallback().onExtraCallbackWithResult(3);
        byte[] bArrAsInterface = onchildviewadded.IAuthTabCallback().asInterface();
        onchildviewadded.IAuthTabCallback().onWarmupCompleted(3);
        AppSetIdAndScope1 appSetIdAndScope1 = writeTypedObject;
        if (appSetIdAndScope1.onNavigationEvent()) {
            UST_TRANS_GenerateCertNum.onNavigationEvent("TSIG-HMAC header", bArrAsInterface);
        }
        mac.update(bArrAsInterface);
        int length = onchildviewadded.onExtraCallbackWithResult - bArrAsInterface.length;
        if (appSetIdAndScope1.onNavigationEvent()) {
            UST_TRANS_GenerateCertNum.onWarmupCompleted("TSIG-HMAC message after header", bArr, bArrAsInterface.length, length);
        }
        mac.update(bArr, bArrAsInterface.length, length);
        mac.update(onExtraCallbackWithResult(z, lt46VarIAuthTabCallbackDefault));
        int iOnExtraCallback = onExtraCallback(mac, lt46VarIAuthTabCallbackDefault.onTransact());
        if (iOnExtraCallback != 0) {
            return iOnExtraCallback;
        }
        int iIAuthTabCallback = IAuthTabCallback(lt46VarIAuthTabCallbackDefault);
        if (iIAuthTabCallback != 0) {
            return iIAuthTabCallback;
        }
        onchildviewadded.onExtraCallback = 1;
        return 0;
    }

    private static byte[] onExtraCallbackWithResult(boolean z, lt46 lt46Var) {
        deactivate deactivateVar = new deactivate();
        if (z) {
            lt46Var.access000().IAuthTabCallback(deactivateVar);
            deactivateVar.IAuthTabCallback(lt46Var.dclass);
            deactivateVar.onWarmupCompleted(lt46Var.ttl);
            lt46Var.onExtraCallbackWithResult().IAuthTabCallback(deactivateVar);
        }
        onExtraCallbackWithResult(lt46Var.IAuthTabCallbackDefault(), lt46Var.onNavigationEvent(), deactivateVar);
        if (z) {
            deactivateVar.IAuthTabCallback(lt46Var.onExtraCallback());
            if (lt46Var.asBinder() != null) {
                deactivateVar.IAuthTabCallback(lt46Var.asBinder().length);
                deactivateVar.onNavigationEvent(lt46Var.asBinder());
            } else {
                deactivateVar.IAuthTabCallback(0);
            }
        }
        byte[] bArrIAuthTabCallback = deactivateVar.IAuthTabCallback();
        if (writeTypedObject.onNavigationEvent()) {
            UST_TRANS_GenerateCertNum.onNavigationEvent("TSIG-HMAC variables", bArrIAuthTabCallback);
        }
        return bArrIAuthTabCallback;
    }

    private int onExtraCallback(Mac mac, byte[] bArr) throws IllegalStateException {
        int macLength = mac.getMacLength();
        int iMax = Math.max(10, macLength / 2);
        if (bArr.length > macLength) {
            int length = bArr.length;
            return 16;
        }
        if (bArr.length < iMax) {
            new Object[]{Integer.valueOf(iMax), Integer.valueOf(macLength), Integer.valueOf(bArr.length)};
            return 16;
        }
        byte[] bArrDoFinal = mac.doFinal();
        int length2 = bArrDoFinal.length;
        Map<yzp2, Integer> map = access100;
        if (length2 > map.get(this.ICustomTabsCallback).intValue()) {
            bArrDoFinal = Arrays.copyOfRange(bArrDoFinal, 0, map.get(this.ICustomTabsCallback).intValue());
        }
        if (onExtraCallbackWithResult(bArrDoFinal, bArr)) {
            return 0;
        }
        if (writeTypedObject.onExtraCallback()) {
            UST_TRANS_ImportCert.onNavigationEvent(bArrDoFinal);
            UST_TRANS_ImportCert.onNavigationEvent(bArr);
        }
        return 16;
    }

    private int IAuthTabCallback(lt46 lt46Var) {
        Instant instant = this.extraCallbackWithResult.instant();
        if (Duration.between(instant, lt46Var.IAuthTabCallbackDefault()).abs().compareTo(lt46Var.onNavigationEvent()) <= 0) {
            return 0;
        }
        new Object[]{instant, lt46Var.IAuthTabCallbackDefault(), lt46Var.onNavigationEvent()};
        return 18;
    }

    public int IAuthTabCallback() {
        short sOnExtraCallbackWithResult = this.onMinimized.onExtraCallbackWithResult();
        return sOnExtraCallbackWithResult + 10 + this.ICustomTabsCallback.onExtraCallbackWithResult() + 10 + access100.get(this.ICustomTabsCallback).intValue() + 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IAuthTabCallback(Mac mac, lt46 lt46Var) throws IllegalStateException {
        byte[] bArrOnExtraCallback = deactivate.onExtraCallback(lt46Var.onTransact().length);
        if (writeTypedObject.onNavigationEvent()) {
            UST_TRANS_GenerateCertNum.onNavigationEvent("TSIG-HMAC signature size", bArrOnExtraCallback);
            UST_TRANS_GenerateCertNum.onNavigationEvent("TSIG-HMAC signature", lt46Var.onTransact());
        }
        mac.update(bArrOnExtraCallback);
        mac.update(lt46Var.onTransact());
    }

    private static void onExtraCallbackWithResult(Instant instant, Duration duration, deactivate deactivateVar) {
        IAuthTabCallback(instant, deactivateVar);
        deactivateVar.IAuthTabCallback((int) duration.getSeconds());
    }

    private static void IAuthTabCallback(Instant instant, deactivate deactivateVar) {
        long epochSecond = instant.getEpochSecond();
        deactivateVar.IAuthTabCallback((int) (epochSecond >> 32));
        deactivateVar.onWarmupCompleted(epochSecond & 4294967295L);
    }

    public static class onWarmupCompleted {
        private final lt46 IAuthTabCallback;
        private final Mac asInterface;
        private final lt42 onExtraCallback;
        private int onExtraCallbackWithResult;
        private String onNavigationEvent;
        private int onWarmupCompleted = 0;

        public String onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public onWarmupCompleted(lt42 lt42Var, lt46 lt46Var) {
            this.onExtraCallback = lt42Var;
            this.asInterface = lt42Var.onExtraCallbackWithResult();
            this.IAuthTabCallback = lt46Var;
        }

        public int onExtraCallback(onChildViewAdded onchildviewadded, byte[] bArr, boolean z) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
            lt46 lt46VarIAuthTabCallbackDefault = onchildviewadded.IAuthTabCallbackDefault();
            int i = this.onWarmupCompleted + 1;
            this.onWarmupCompleted = i;
            if (i == 1) {
                if (lt46VarIAuthTabCallbackDefault != null) {
                    int iOnExtraCallback = this.onExtraCallback.onExtraCallback(onchildviewadded, bArr, this.IAuthTabCallback, true, this.asInterface);
                    lt42.IAuthTabCallback(this.asInterface, lt46VarIAuthTabCallbackDefault);
                    this.onExtraCallbackWithResult = this.onWarmupCompleted;
                    return iOnExtraCallback;
                }
                this.onNavigationEvent = "missing required signature on first message";
                AppSetIdAndScope1 unused = lt42.writeTypedObject;
                onchildviewadded.onExtraCallback = 4;
                return 1;
            }
            if (lt46VarIAuthTabCallbackDefault != null) {
                int iOnExtraCallback2 = this.onExtraCallback.onExtraCallback(onchildviewadded, bArr, (lt46) null, false, this.asInterface);
                this.onExtraCallbackWithResult = this.onWarmupCompleted;
                lt42.IAuthTabCallback(this.asInterface, lt46VarIAuthTabCallbackDefault);
                return iOnExtraCallback2;
            }
            if (i - this.onExtraCallbackWithResult >= 100) {
                this.onNavigationEvent = "Missing required signature on message #" + this.onWarmupCompleted;
                AppSetIdAndScope1 unused2 = lt42.writeTypedObject;
                onchildviewadded.onExtraCallback = 4;
                return 1;
            }
            if (z) {
                this.onNavigationEvent = "Missing required signature on last message";
                AppSetIdAndScope1 unused3 = lt42.writeTypedObject;
                onchildviewadded.onExtraCallback = 4;
                return 1;
            }
            this.onNavigationEvent = "Intermediate message #" + this.onWarmupCompleted + " without signature";
            AppSetIdAndScope1 unused4 = lt42.writeTypedObject;
            IAuthTabCallback(onchildviewadded, bArr, this.asInterface);
            return 0;
        }

        private void IAuthTabCallback(onChildViewAdded onchildviewadded, byte[] bArr, Mac mac) throws IllegalStateException {
            byte[] bArrAsInterface = onchildviewadded.IAuthTabCallback().asInterface();
            if (lt42.writeTypedObject.onNavigationEvent()) {
                AppSetIdAndScope1 unused = lt42.writeTypedObject;
                UST_TRANS_GenerateCertNum.onNavigationEvent("TSIG-HMAC header", bArrAsInterface);
            }
            mac.update(bArrAsInterface);
            int length = bArr.length - bArrAsInterface.length;
            if (lt42.writeTypedObject.onNavigationEvent()) {
                AppSetIdAndScope1 unused2 = lt42.writeTypedObject;
                UST_TRANS_GenerateCertNum.onWarmupCompleted("TSIG-HMAC message after header", bArr, bArrAsInterface.length, length);
            }
            mac.update(bArr, bArrAsInterface.length, length);
            onchildviewadded.onExtraCallback = 2;
        }
    }
}
