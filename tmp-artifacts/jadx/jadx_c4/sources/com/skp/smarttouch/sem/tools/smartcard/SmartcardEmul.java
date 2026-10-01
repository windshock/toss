package com.skp.smarttouch.sem.tools.smartcard;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Semaphore;
import o.setItemPrefetchEnabled;
import o.ulycxycx;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class SmartcardEmul extends AbstractSmartcard {
    private final Semaphore a;

    protected void alog(String str) {
    }

    public SmartcardEmul(Context context, setItemPrefetchEnabled setitemprefetchenabled) {
        super(context, setitemprefetchenabled);
        this.a = new Semaphore(1);
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public void setSmartcard(setItemPrefetchEnabled setitemprefetchenabled) {
        super.setSmartcard(setitemprefetchenabled);
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public setItemPrefetchEnabled getSmartcard() {
        return this.mCard;
    }

    public boolean isEnable() {
        alog("Smartcard::isEnable");
        alog("Smartcard::isEnable::mCard = " + this.mCard);
        return this.mCard != null;
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public int getChannel() {
        setItemPrefetchEnabled setitemprefetchenabled = this.mCard;
        if (setitemprefetchenabled == null) {
            return -1;
        }
        try {
            return setitemprefetchenabled.onWarmupCompleted();
        } catch (RemoteException unused) {
            return -1;
        }
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int connect() throws InterruptedException {
        int iIAuthTabCallback;
        setItemPrefetchEnabled setitemprefetchenabled = this.mCard;
        if (setitemprefetchenabled == null) {
            alog("connect() fail! : mCard is null!");
            return -3;
        }
        try {
            iIAuthTabCallback = setitemprefetchenabled.IAuthTabCallback();
            try {
                alog("connect() return  " + iIAuthTabCallback);
            } catch (RemoteException e) {
                e = e;
                alog("connect() Error : " + e.toString());
                if (iIAuthTabCallback > 0) {
                }
                return iIAuthTabCallback;
            }
        } catch (RemoteException e2) {
            e = e2;
            iIAuthTabCallback = 0;
        }
        if (iIAuthTabCallback > 0) {
            try {
                this.a.acquire();
                alog("connect() =============> semaphore acquire");
            } catch (InterruptedException e3) {
                xkzzb.onNavigationEvent(e3);
            }
        }
        return iIAuthTabCallback;
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public int disconnect() {
        int iOnExtraCallback;
        setItemPrefetchEnabled setitemprefetchenabled = this.mCard;
        if (setitemprefetchenabled == null) {
            alog("disconnect() fail! : mCard is null");
            return -3;
        }
        try {
            iOnExtraCallback = setitemprefetchenabled.onExtraCallback();
            try {
                alog("disconnect() : return " + iOnExtraCallback);
            } catch (RemoteException e) {
                e = e;
                alog("disconnect() Error : " + e.toString());
                this.a.release();
                alog("disconnect() =============> semaphore release");
                return iOnExtraCallback;
            }
        } catch (RemoteException e2) {
            e = e2;
            iOnExtraCallback = 0;
        }
        this.a.release();
        alog("disconnect() =============> semaphore release");
        return iOnExtraCallback;
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] transmit(byte[] bArr) {
        byte[] bArr2 = new byte[AbstractSmartcard.RES_BUFF];
        if (this.mCard == null) {
            alog("transmit() is fail!! : mCard is null!");
            return null;
        }
        if (bArr == null) {
            alog("transmit() is fail!! : command is null");
            return null;
        }
        if (!hasPermissionForSelect(bArr)) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"***** do not have permission to select command !!"});
            return null;
        }
        ulycxycx.onWarmupCompleted("Smartcard::transmit", bArr, bArr.length);
        try {
            int iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr, bArr2);
            if (iOnExtraCallbackWithResult > 0) {
                if (iOnExtraCallbackWithResult == 2 && bArr2[0] == 97) {
                    byte[] bArr3 = {0, -64, 0, 0, 0};
                    bArr3[4] = bArr2[1];
                    ulycxycx.onWarmupCompleted(bArr2, 0, (byte) 0, AbstractSmartcard.RES_BUFF);
                    iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr3, bArr2);
                    if (iOnExtraCallbackWithResult < 0) {
                        alog("transmit() error!! Fail to read more....(61 xx)");
                        return null;
                    }
                }
                byte[] bArr4 = new byte[iOnExtraCallbackWithResult];
                System.arraycopy(bArr2, 0, bArr4, 0, iOnExtraCallbackWithResult);
                ulycxycx.onWarmupCompleted("transmit() response", bArr4, iOnExtraCallbackWithResult);
                return bArr4;
            }
            alog("transmit() error!!! return " + iOnExtraCallbackWithResult);
            return null;
        } catch (RemoteException e) {
            alog("trasmit() Error : " + e.toString());
            return null;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public byte[] transmit(String str, byte[] bArr) {
        xkzzb.IAuthTabCallback(new Object[]{">> transmit()"});
        xkzzb.IAuthTabCallback(new Object[]{"++ compId : [%s]", str});
        byte[] bArr2 = new byte[AbstractSmartcard.RES_BUFF];
        if (this.mCard == null) {
            alog("transmit() is fail!! : mCard is null!");
            return null;
        }
        if (bArr == null) {
            alog("transmit() is fail!! : command is null");
            return null;
        }
        if (!"STD_TRP".equalsIgnoreCase(str) && !"STD_TWR".equalsIgnoreCase(str) && !hasPermissionForSelect(bArr)) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"***** do not have permission to select command !!"});
            return null;
        }
        ulycxycx.onWarmupCompleted("Smartcard::transmit", bArr, bArr.length);
        try {
            int iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr, bArr2);
            if (iOnExtraCallbackWithResult > 0) {
                if (iOnExtraCallbackWithResult == 2 && bArr2[0] == 97) {
                    byte[] bArr3 = {0, -64, 0, 0, 0};
                    bArr3[4] = bArr2[1];
                    ulycxycx.onWarmupCompleted(bArr2, 0, (byte) 0, AbstractSmartcard.RES_BUFF);
                    iOnExtraCallbackWithResult = this.mCard.onExtraCallbackWithResult(bArr3, bArr2);
                    if (iOnExtraCallbackWithResult < 0) {
                        alog("transmit() error!! Fail to read more....(61 xx)");
                        return null;
                    }
                }
                byte[] bArr4 = new byte[iOnExtraCallbackWithResult];
                System.arraycopy(bArr2, 0, bArr4, 0, iOnExtraCallbackWithResult);
                ulycxycx.onWarmupCompleted("transmit() response", bArr4, iOnExtraCallbackWithResult);
                return bArr4;
            }
            alog("transmit() error!!! return " + iOnExtraCallbackWithResult);
            return null;
        } catch (RemoteException e) {
            alog("trasmit() Error : " + e.toString());
            return null;
        }
    }

    @Override // com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard
    public boolean isResponseSuccess(byte[] bArr) {
        if (bArr == null) {
            alog("isResponseSuccess() fail!! : response is null");
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = {bArr[length - 2], bArr[length - 1]};
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
}
