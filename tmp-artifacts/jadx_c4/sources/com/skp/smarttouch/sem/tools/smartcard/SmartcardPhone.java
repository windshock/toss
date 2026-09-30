package com.skp.smarttouch.sem.tools.smartcard;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import java.util.concurrent.Semaphore;
import o.setItemPrefetchEnabled;
import o.ulycxycx;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class SmartcardPhone extends AbstractSmartcard {
    private final Semaphore a;

    public SmartcardPhone(Context context, setItemPrefetchEnabled setitemprefetchenabled, boolean z) {
        super(context, setitemprefetchenabled, z);
        this.a = new Semaphore(1);
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public void setSmartcard(setItemPrefetchEnabled setitemprefetchenabled) {
        super.setSmartcard(setitemprefetchenabled);
    }

    public boolean isEnable() {
        return this.mCard != null;
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public int getChannel() throws DeadObjectException {
        setItemPrefetchEnabled setitemprefetchenabled = this.mCard;
        int iOnWarmupCompleted = -1;
        if (setitemprefetchenabled != null) {
            try {
                iOnWarmupCompleted = setitemprefetchenabled.onWarmupCompleted();
                xkzzb.onWarmupCompleted(new Object[]{"getChannel() channel : " + iOnWarmupCompleted});
                if (iOnWarmupCompleted != -11) {
                    return iOnWarmupCompleted;
                }
                xkzzb.onWarmupCompleted(new Object[]{"SmartcardService is dead !!"});
                throw new DeadObjectException();
            } catch (DeadObjectException e) {
                xkzzb.onWarmupCompleted(new Object[]{"disconnect() Error : " + e.toString()});
                this.m_bDeadObject = true;
            } catch (RemoteException unused) {
            }
        }
        return iOnWarmupCompleted;
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] getATR() {
        setItemPrefetchEnabled setitemprefetchenabled = this.mCard;
        byte[] bArr = null;
        if (setitemprefetchenabled == null) {
            return null;
        }
        byte[] bArr2 = new byte[256];
        try {
            int iOnExtraCallback = setitemprefetchenabled.onExtraCallback(bArr2);
            if (iOnExtraCallback <= 0) {
                return null;
            }
            bArr = new byte[iOnExtraCallback];
            System.arraycopy(bArr2, 0, bArr, 0, iOnExtraCallback);
            return bArr;
        } catch (RemoteException unused) {
            return bArr;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public int connect() {
        int iIAuthTabCallback;
        setItemPrefetchEnabled setitemprefetchenabled = this.mCard;
        if (setitemprefetchenabled == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"connect() fail! : mCard is null!"});
            return -3;
        }
        try {
            iIAuthTabCallback = setitemprefetchenabled.IAuthTabCallback();
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
        if (this.mCard == null) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"disconnect() fail! : mCard is null"});
            return -3;
        }
        try {
            if (getChannel() > 0) {
                xkzzb.onWarmupCompleted(new Object[]{"disconnect() : Channel = " + getChannel()});
                int iOnExtraCallback = this.mCard.onExtraCallback();
                xkzzb.onWarmupCompleted(new Object[]{"disconnect() : return " + iOnExtraCallback});
                return iOnExtraCallback;
            }
            xkzzb.onWarmupCompleted(new Object[]{"disconnect() : cancel (not connected) "});
            return 0;
        } catch (RemoteException e) {
            xkzzb.onWarmupCompleted(new Object[]{"disconnect() Error : " + e.toString()});
            return 0;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] transmit(byte[] bArr) throws DeadObjectException {
        byte[] bArr2 = new byte[AbstractSmartcard.RES_BUFF];
        if (this.mCard == null) {
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
        byte b = (byte) (bArr[0] & 252);
        bArr[0] = b;
        bArr[0] = (byte) (b | channel);
        ulycxycx.onWarmupCompleted("transmit() command", bArr, bArr.length);
        try {
            int iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr, bArr2);
            if (iOnExtraCallbackWithResult > 0) {
                if (iOnExtraCallbackWithResult == 2 && bArr2[0] == 97) {
                    byte[] bArr3 = {0, -64, 0, 0, 0};
                    bArr3[4] = bArr2[1];
                    bArr3[0] = (byte) channel;
                    ulycxycx.onWarmupCompleted(bArr2, 0, (byte) 0, AbstractSmartcard.RES_BUFF);
                    iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr3, bArr2);
                    if (iOnExtraCallbackWithResult < 0) {
                        xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!! Fail to read more....(61 xx)"});
                        return null;
                    }
                }
                byte[] bArr4 = new byte[iOnExtraCallbackWithResult];
                System.arraycopy(bArr2, 0, bArr4, 0, iOnExtraCallbackWithResult);
                ulycxycx.onWarmupCompleted("transmit() response", bArr4, iOnExtraCallbackWithResult);
                return bArr4;
            }
            xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!!! return " + iOnExtraCallbackWithResult});
            return null;
        } catch (RemoteException e) {
            xkzzb.onWarmupCompleted(new Object[]{"trasmit() Error : " + e.toString()});
            return null;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] transmit(String str, byte[] bArr) throws DeadObjectException {
        xkzzb.IAuthTabCallback(new Object[]{">> transmit()"});
        xkzzb.IAuthTabCallback(new Object[]{"++ compId : [%s]", str});
        byte[] bArr2 = new byte[AbstractSmartcard.RES_BUFF];
        if (this.mCard == null) {
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
        int channel = getChannel();
        if (channel < 0) {
            return null;
        }
        ulycxycx.onWarmupCompleted("Smartcard::transmit", bArr, bArr.length);
        byte b = (byte) (bArr[0] & 252);
        bArr[0] = b;
        bArr[0] = (byte) (channel | b);
        ulycxycx.onWarmupCompleted("transmit() command", bArr, bArr.length);
        try {
            int iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr, bArr2);
            if (iOnExtraCallbackWithResult > 0) {
                if (iOnExtraCallbackWithResult == 2 && bArr2[0] == 97) {
                    byte[] bArr3 = {0, -64, 0, 0, 0};
                    bArr3[4] = bArr2[1];
                    ulycxycx.onWarmupCompleted(bArr2, 0, (byte) 0, AbstractSmartcard.RES_BUFF);
                    iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr3, bArr2);
                    if (iOnExtraCallbackWithResult < 0) {
                        xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!! Fail to read more....(61 xx)"});
                        return null;
                    }
                }
                byte[] bArr4 = new byte[iOnExtraCallbackWithResult];
                System.arraycopy(bArr2, 0, bArr4, 0, iOnExtraCallbackWithResult);
                ulycxycx.onWarmupCompleted("transmit() response", bArr4, iOnExtraCallbackWithResult);
                return bArr4;
            }
            xkzzb.onExtraCallbackWithResult(new Object[]{"transmit() error!!! return " + iOnExtraCallbackWithResult});
            return null;
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
}
