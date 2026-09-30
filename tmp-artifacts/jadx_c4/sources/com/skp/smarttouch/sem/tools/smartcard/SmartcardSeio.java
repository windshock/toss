package com.skp.smarttouch.sem.tools.smartcard;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import o.RecyclerViewChildDrawingOrderCallback;
import o.putStringSet;
import o.ulycxycx;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class SmartcardSeio extends AbstractSmartcard {
    private final Semaphore a;

    public SmartcardSeio(Context context, RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback) {
        super(context, recyclerViewChildDrawingOrderCallback);
        this.a = new Semaphore(1);
    }

    public SmartcardSeio(Context context, RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback, boolean z) {
        super(context, recyclerViewChildDrawingOrderCallback, z);
        this.a = new Semaphore(1);
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public void setSmartcard(RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback) {
        super.setSmartcard(recyclerViewChildDrawingOrderCallback);
    }

    public boolean isEnable() {
        return this.mSeioSe != null;
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public int getChannel() throws DeadObjectException {
        RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback = this.mSeioSe;
        int iOnExtraCallbackWithResult = -1;
        if (recyclerViewChildDrawingOrderCallback != null) {
            try {
                iOnExtraCallbackWithResult = recyclerViewChildDrawingOrderCallback.onExtraCallbackWithResult();
                xkzzb.onWarmupCompleted(new Object[]{"getChannel() channel : " + iOnExtraCallbackWithResult});
                if (iOnExtraCallbackWithResult != -11) {
                    return iOnExtraCallbackWithResult;
                }
                xkzzb.onWarmupCompleted(new Object[]{"SmartcardService is dead !!"});
                throw new DeadObjectException();
            } catch (DeadObjectException e) {
                xkzzb.onWarmupCompleted(new Object[]{"getChannel() Error : " + e.toString()});
                this.m_bDeadObject = true;
            } catch (RemoteException unused) {
            }
        }
        return iOnExtraCallbackWithResult;
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] getATR() {
        RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback = this.mSeioSe;
        byte[] bArrA = null;
        if (recyclerViewChildDrawingOrderCallback == null) {
            return null;
        }
        try {
            String strOnNavigationEvent = recyclerViewChildDrawingOrderCallback.onNavigationEvent();
            bArrA = a(strOnNavigationEvent);
            xkzzb.onWarmupCompleted(new Object[]{"getATR() return  " + strOnNavigationEvent});
            return bArrA;
        } catch (RemoteException unused) {
            return bArrA;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public int connect() {
        int iIAuthTabCallback;
        RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback = this.mSeioSe;
        if (recyclerViewChildDrawingOrderCallback == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"connect() fail! : mCard is null!"});
            return -3;
        }
        try {
            iIAuthTabCallback = recyclerViewChildDrawingOrderCallback.IAuthTabCallback();
            try {
                xkzzb.onWarmupCompleted(new Object[]{"connect() return  " + iIAuthTabCallback});
                return iIAuthTabCallback;
            } catch (RemoteException e) {
                e = e;
                xkzzb.onExtraCallbackWithResult(new Object[]{"connect() Error : " + e.toString()});
                return iIAuthTabCallback;
            }
        } catch (RemoteException e2) {
            e = e2;
            iIAuthTabCallback = 0;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public int disconnect() {
        if (this.mSeioSe == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"disconnect() fail! : mCard is null"});
            return -3;
        }
        try {
            if (getChannel() > 0) {
                xkzzb.onWarmupCompleted(new Object[]{"disconnect() : Channel = " + getChannel()});
                int iOnWarmupCompleted = this.mSeioSe.onWarmupCompleted();
                xkzzb.onWarmupCompleted(new Object[]{"disconnect() : return " + iOnWarmupCompleted});
                return iOnWarmupCompleted;
            }
            xkzzb.onWarmupCompleted(new Object[]{"disconnect() : cancel (not connected) "});
            return 0;
        } catch (RemoteException e) {
            xkzzb.onWarmupCompleted(new Object[]{"disconnect() Error : " + e.toString()});
            return 0;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] transmit(byte[] bArr) throws NumberFormatException, DeadObjectException {
        int length;
        xkzzb.onNavigationEvent(new Object[]{"transmit() =============> command  : " + putStringSet.onWarmupCompleted(bArr)});
        byte[] bArrA = new byte[AbstractSmartcard.RES_BUFF];
        if (this.mSeioSe == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() is fail!! : mCard is null!"});
            return null;
        }
        if (bArr == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() is fail!! : command is null"});
            return null;
        }
        if (!hasPermissionForSelect(bArr)) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"do not have permission to select command !!"});
            return null;
        }
        int channel = getChannel();
        if (channel < 0) {
            return null;
        }
        ulycxycx.onWarmupCompleted("Smartcard::transmit", bArr, bArr.length);
        ulycxycx.onWarmupCompleted("transmit() command", bArr, bArr.length);
        try {
            String strOnWarmupCompleted = this.mSeioSe.onWarmupCompleted(bArr, bArrA);
            Locale locale = Locale.ENGLISH;
            String upperCase = strOnWarmupCompleted.toUpperCase(locale);
            if (upperCase.matches("^-")) {
                length = Integer.parseInt(upperCase);
            } else {
                bArrA = a(upperCase);
                length = bArrA.length;
            }
            if (length > 0) {
                if (length == 2 && bArrA[0] == 97) {
                    byte[] bArr2 = {0, -64, 0, 0, 0};
                    bArr2[4] = bArrA[1];
                    bArr2[0] = (byte) channel;
                    String upperCase2 = this.mSeioSe.onWarmupCompleted(bArr2, bArrA).toUpperCase(locale);
                    if (upperCase2.matches("^-")) {
                        length = Integer.parseInt(upperCase2);
                    } else {
                        bArrA = a(upperCase2);
                        length = bArrA.length;
                    }
                    if (length < 0) {
                        xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!! Fail to read more....(61 xx)"});
                        return null;
                    }
                }
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArrA, 0, bArr3, 0, length);
                ulycxycx.onWarmupCompleted("transmit() response", bArr3, length);
                return bArr3;
            }
            xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!!! return " + length});
            return null;
        } catch (RemoteException e) {
            xkzzb.onWarmupCompleted(new Object[]{"trasmit() Error : " + e.toString()});
            return null;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] transmit(String str, byte[] bArr) throws NumberFormatException {
        int length;
        int length2;
        int length3;
        xkzzb.IAuthTabCallback(new Object[]{">> transmit()"});
        xkzzb.IAuthTabCallback(new Object[]{"++ compId : [%s]", str});
        byte[] bArrA = new byte[AbstractSmartcard.RES_BUFF];
        if (this.mSeioSe == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() is fail!! : mCard is null!"});
            return null;
        }
        if (bArr == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() is fail!! : command is null"});
            return null;
        }
        if (!"STD_TRP".equalsIgnoreCase(str) && !"STD_TWR".equalsIgnoreCase(str) && !hasPermissionForSelect(bArr)) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"do not have permission to select command !!"});
            return null;
        }
        if (getChannel() < 0) {
            return null;
        }
        ulycxycx.onWarmupCompleted("Smartcard::transmit", bArr, bArr.length);
        ulycxycx.onWarmupCompleted("transmit() command", bArr, bArr.length);
        try {
            String upperCase = this.mSeioSe.onWarmupCompleted(bArr, bArrA).toUpperCase(Locale.ENGLISH);
            boolean zMatches = upperCase.matches("^-");
            if (zMatches) {
                length = Integer.parseInt(upperCase);
            } else {
                bArrA = a(upperCase);
                length = bArrA.length;
            }
            if (length <= 0) {
                xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!!! return " + length});
                return null;
            }
            if (length == 2 && bArrA[0] == 97) {
                byte[] bArr2 = {0, -64, 0, 0, 0};
                bArr2[4] = bArrA[1];
                upperCase = this.mSeioSe.onWarmupCompleted(bArr2, bArrA);
                zMatches = upperCase.matches("^-");
                if (zMatches) {
                    length3 = Integer.parseInt(upperCase);
                } else {
                    bArrA = a(upperCase);
                    length3 = bArrA.length;
                }
                if (length3 < 0) {
                    xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!! Fail to read more....(61 xx)"});
                    return null;
                }
            }
            if (zMatches) {
                length2 = Integer.parseInt(upperCase);
            } else {
                bArrA = a(upperCase);
                length2 = bArrA.length;
            }
            if (length2 < 0) {
                xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!! Fail to read more....(61 xx)"});
                return null;
            }
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArrA, 0, bArr3, 0, length2);
            ulycxycx.onWarmupCompleted("transmit() response", bArr3, length2);
            return bArr3;
        } catch (RemoteException e) {
            xkzzb.onWarmupCompleted(new Object[]{"trasmit() Error : " + e.toString()});
            return null;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public boolean isResponseSuccess(byte[] bArr) {
        if (bArr == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"isResponseSuccess() fail!! : response is null"});
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = {bArr[length - 2], bArr[length - 1]};
        ulycxycx.onWarmupCompleted("isResponseSuccess", bArr2, 2);
        byte b = bArr2[0];
        byte[] bArr3 = AbstractSmartcard.RESULT_SUCCESS;
        return b == bArr3[0] && bArr2[1] == bArr3[1];
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] cmdSELECT(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 5];
        bArr2[0] = 0;
        bArr2[1] = -92;
        bArr2[2] = 4;
        bArr2[3] = 0;
        bArr2[4] = (byte) length;
        for (int i = 0; i < length; i++) {
            bArr2[i + 5] = bArr[i];
        }
        return transmit(bArr2);
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] cmdSELECT(String str, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 5];
        bArr2[0] = 0;
        bArr2[1] = -92;
        bArr2[2] = 4;
        bArr2[3] = 0;
        bArr2[4] = (byte) length;
        for (int i = 0; i < length; i++) {
            bArr2[i + 5] = bArr[i];
        }
        return transmit(str, bArr2);
    }

    public boolean requestSmartcardStatus() throws InterruptedException {
        int i = 3;
        while (i > 0) {
            if (isEnable()) {
                return true;
            }
            i--;
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
        return false;
    }

    private byte[] a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }
}
