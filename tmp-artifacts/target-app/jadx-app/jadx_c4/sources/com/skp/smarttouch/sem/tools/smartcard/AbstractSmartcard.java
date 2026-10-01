package com.skp.smarttouch.sem.tools.smartcard;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.skp.seio.aidl.ISEIOConnection;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skp.smarttouch.sem.tools.dao.NRMSApplets;
import com.skp.smarttouch.sem.tools.dao.NRMSCredits;
import com.skp.smarttouch.sem.tools.dao.NRMSTcses;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.RecyclerViewChildDrawingOrderCallback;
import o.putStringSet;
import o.setItemPrefetchEnabled;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractSmartcard {
    public static final byte BYTE_READ_MORE = 97;
    public static final byte BYTE_RESPONSE_LENGTH = 108;
    public static final int RES_BUFF = 258;
    public static final int SMARTCARD_IO_ALREADY_CONNECTED = -2;
    public static final int SMARTCARD_IO_CARD_NOT_EXIST = -7;
    public static final int SMARTCARD_IO_ERROR_ATR_BUFFER = -6;
    public static final int SMARTCARD_IO_ERROR_DEAD_OBJECT = -11;
    public static final int SMARTCARD_IO_ERROR_NOT_CONNECT = -3;
    public static final int SMARTCARD_IO_ERROR_OPEN_CHANNEL = -1;
    public static final int SMARTCARD_IO_ERROR_RESPONSE_BUFFER = -5;
    public static final int SMARTCARD_IO_ERROR_TRANSMIT_BUFFER = -4;
    public static final int SMARTCARD_IO_ERROR_UNKNOWN = -8;
    public static final int SMARTCARD_IO_SUCCESS = 0;
    private List<NRMSApplets> a;
    private List<NRMSCredits> b;
    private List<NRMSTcses> c;
    private Context d;
    protected setItemPrefetchEnabled mCard;
    protected RecyclerViewChildDrawingOrderCallback mSeioSe;
    public boolean m_bDeadObject;
    public static final byte[] RESULT_SUCCESS = {-112, 0};
    public static final byte[] ERROR_LENGTH = {103, 0};
    public static final byte[] ERROR_P1P2 = {106, -122};
    public static final byte[] ERROR_NOT_FOUND_AID = {106, -120};
    private static final byte[] e = {-96, 0, 0, 0, 3};
    private static final byte[] f = {-96, 0, 0, 0, 4};
    private static final byte[] g = {-96, 0, 0, 0, 119};
    private static final byte[] h = {-96, 0, 0, 0, 37};
    private static final byte[] i = {-44, 16, 0, 0, 48};
    private static final byte[] j = {-96, 0, 0, 3, 51};

    public abstract byte[] cmdSELECT(String str, byte[] bArr);

    public abstract byte[] cmdSELECT(byte[] bArr);

    public abstract int connect();

    public abstract int disconnect();

    public abstract byte[] getATR();

    public abstract int getChannel();

    public abstract boolean isResponseSuccess(byte[] bArr);

    public abstract byte[] transmit(String str, byte[] bArr);

    public abstract byte[] transmit(byte[] bArr);

    public AbstractSmartcard(Context context, setItemPrefetchEnabled setitemprefetchenabled) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.mSeioSe = null;
        this.m_bDeadObject = false;
        this.d = context;
        this.mCard = setitemprefetchenabled;
    }

    public AbstractSmartcard(Context context, setItemPrefetchEnabled setitemprefetchenabled, boolean z) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.mCard = null;
        this.mSeioSe = null;
        this.m_bDeadObject = false;
        xkzzb.onExtraCallback(new Object[]{"++ AbstractSmartcard createForSubscriptionId: subId[%s], createSubId[%s]", Integer.valueOf(LibraryFeatures.getSemSubscriptionId()), Boolean.valueOf(z)});
        this.d = context;
        this.mCard = setitemprefetchenabled;
        if (z) {
            try {
                if (this.mCard.IAuthTabCallback(LibraryFeatures.getSemSubscriptionId(), new ISEIOConnection.Stub() { // from class: com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard.1
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static char IAuthTabCallback = 7545;
                    private static int IAuthTabCallbackDefault = 1;
                    private static char onExtraCallback = 22024;
                    private static int onExtraCallbackWithResult = 0;
                    private static char onNavigationEvent = 46370;
                    private static char onWarmupCompleted = 38090;

                    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                        int i3;
                        int i4 = 2 % 2;
                        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                        char[] cArr2 = new char[cArr.length];
                        int i5 = 0;
                        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                        char[] cArr3 = new char[2];
                        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                            int i6 = $10 + 37;
                            $11 = i6 % 128;
                            int i7 = 58224;
                            char c = 1;
                            if (i6 % 2 == 0) {
                                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                                i3 = 1;
                            } else {
                                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                                i3 = i5;
                            }
                            while (i3 < 16) {
                                int i8 = $10 + 105;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                char c2 = cArr3[c];
                                char c3 = cArr3[i5];
                                char[] cArr4 = cArr3;
                                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                                int i11 = c3 >>> 5;
                                try {
                                    Object[] objArr2 = new Object[4];
                                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                                    objArr2[2] = Integer.valueOf(i11);
                                    objArr2[c] = Integer.valueOf(i10);
                                    objArr2[0] = Integer.valueOf(c2);
                                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                                    if (objOnExtraCallback == null) {
                                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0);
                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12434;
                                        Class[] clsArr = new Class[4];
                                        clsArr[0] = Integer.TYPE;
                                        clsArr[c] = Integer.TYPE;
                                        clsArr[2] = Integer.TYPE;
                                        clsArr[3] = Integer.TYPE;
                                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, iLastIndexOf, iKeyCodeFromString, -787580090, false, "C", clsArr);
                                    }
                                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                    cArr4[c] = cCharValue;
                                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                                    if (objOnExtraCallback2 == null) {
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, 12433 - TextUtils.lastIndexOf("", '0', 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                    i7 -= 40503;
                                    i3++;
                                    int i12 = $11 + 11;
                                    $10 = i12 % 128;
                                    int i13 = i12 % 2;
                                    cArr3 = cArr4;
                                    i5 = 0;
                                    c = 1;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            char[] cArr5 = cArr3;
                            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 16015), 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 19901 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            cArr3 = cArr5;
                            i5 = 0;
                        }
                        String str = new String(cArr2, 0, i2);
                        int i14 = $11 + 103;
                        $10 = i14 % 128;
                        if (i14 % 2 == 0) {
                            objArr[0] = str;
                        } else {
                            int i15 = 74 / 0;
                            objArr[0] = str;
                        }
                    }

                    public void onConnectedToSEIO(IBinder iBinder) throws RemoteException {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 67;
                        IAuthTabCallbackDefault = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        if (iBinder == null) {
                            xkzzb.onExtraCallbackWithResult(new Object[]{"onConnectedToSEIO(subId) is null"});
                            AbstractSmartcard.this.mCard = null;
                            int i4 = onExtraCallbackWithResult + 19;
                            IAuthTabCallbackDefault = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 29 / 0;
                                return;
                            }
                            return;
                        }
                        AbstractSmartcard.this.mCard = setItemPrefetchEnabled.IAuthTabCallback.IAuthTabCallback(iBinder);
                        xkzzb.onNavigationEvent(new Object[]{"onConnectedToSEIO(subId) 1 mCard"});
                    }

                    public void onDisconnectedToSEIO() throws Throwable {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallbackWithResult + 37;
                        IAuthTabCallbackDefault = i3 % 128;
                        int i4 = i3 % 2;
                        Object[] objArr = new Object[1];
                        a(new char[]{65162, 9583, 54570, 64263, 32099, 47518, 65162, 9583, 38261, 47625, 44406, 13714, 25149, 51323, 53409, 11641, 47643, 35284, 1792, 35845, 53620, 7790, 8141, 39227, 37521, 2204, 12535, 29978, 21380, 42268, 21380, 42268, 21380, 42268, 21380, 42268, 21380, 42268, 21380, 42268, 33220, 54571, 39199, 37357}, 43 - TextUtils.getOffsetBefore("", 0), objArr);
                        xkzzb.onExtraCallback(new Object[]{((String) objArr[0]).intern()});
                        Object obj = null;
                        AbstractSmartcard.this.mCard = null;
                        int i5 = IAuthTabCallbackDefault + 29;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }.asBinder()) == null) {
                    xkzzb.onExtraCallbackWithResult(new Object[]{"createForSubscriptionIdAgentis null"});
                    this.mCard = null;
                } else {
                    xkzzb.onExtraCallbackWithResult(new Object[]{"createForSubscriptionIdAgentis is not null"});
                }
            } catch (Exception e2) {
                xkzzb.onExtraCallbackWithResult(new Object[]{"++ Error [%s]", e2.getMessage()});
            }
        }
    }

    public void setSmartcard(setItemPrefetchEnabled setitemprefetchenabled) {
        this.mCard = setitemprefetchenabled;
    }

    public setItemPrefetchEnabled getSmartcard() {
        return this.mCard;
    }

    public AbstractSmartcard(Context context, RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.mCard = null;
        this.m_bDeadObject = false;
        this.d = context;
        this.mSeioSe = recyclerViewChildDrawingOrderCallback;
    }

    public AbstractSmartcard(Context context, RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback, boolean z) {
        RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallbackOnExtraCallbackWithResult;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.mCard = null;
        this.mSeioSe = null;
        this.m_bDeadObject = false;
        xkzzb.onExtraCallback(new Object[]{"++ AbstractSmartcard createForSubscriptionId"});
        this.d = context;
        this.mSeioSe = recyclerViewChildDrawingOrderCallback;
        try {
            if (LibraryFeatures.getSemSubscriptionId() <= 0 || (recyclerViewChildDrawingOrderCallbackOnExtraCallbackWithResult = this.mSeioSe.onExtraCallbackWithResult(LibraryFeatures.getSemSubscriptionId())) == null) {
                return;
            }
            this.mSeioSe = recyclerViewChildDrawingOrderCallbackOnExtraCallbackWithResult;
        } catch (RemoteException e2) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"++ Error [%s]", e2.getMessage()});
        }
    }

    public void setSmartcard(RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback) {
        this.mSeioSe = recyclerViewChildDrawingOrderCallback;
    }

    public void setApplets(List<NRMSApplets> list) {
        this.a = list;
    }

    public void setCredits(List<NRMSCredits> list) {
        this.b = list;
    }

    public void setTcses(List<NRMSTcses> list) {
        this.c = list;
    }

    protected boolean hasPermissionForSelect(byte[] bArr) throws Exception {
        String strOnWarmupCompleted;
        xkzzb.onExtraCallback(new Object[]{">> hasPermissionForSelect()"});
        xkzzb.onExtraCallback(new Object[]{"++ command : [%s]", putStringSet.onWarmupCompleted(bArr)});
        String packageName = getPackageName();
        boolean z = true;
        if (packageName.equalsIgnoreCase("com.skp.nop.tc") || packageName.equalsIgnoreCase("com.nfcusim.appletconf") || packageName.equalsIgnoreCase("com.skplanet.nfc.smarttouch") || packageName.contains("com.skplanet.sem.sample") || packageName.equalsIgnoreCase("com.skcc.testotpapplet") || packageName.equalsIgnoreCase("com.sktelecom.tauth")) {
            xkzzb.onExtraCallback(new Object[]{"-- returned - [" + packageName + "] hasPermissionForSelect skip"});
            return true;
        }
        if (bArr[1] == 65444 && bArr[2] == 4) {
            int i2 = bArr[4];
            byte[] bArr2 = new byte[i2];
            try {
                System.arraycopy(bArr, 5, bArr2, 0, i2);
                strOnWarmupCompleted = putStringSet.onWarmupCompleted(bArr2);
            } catch (Exception e2) {
                xkzzb.onNavigationEvent(e2);
            }
            if (strOnWarmupCompleted == null || strOnWarmupCompleted.length() < 2) {
                throw new Exception("***** this is not aid");
            }
            List<NRMSApplets> list = this.a;
            if (list == null || list.size() <= 0) {
                throw new Exception("***** applets is null");
            }
            xkzzb.IAuthTabCallback(new Object[]{"this is select aid [%s]", strOnWarmupCompleted});
            for (NRMSApplets nRMSApplets : this.a) {
                nRMSApplets.dump(nRMSApplets);
                String instAid = nRMSApplets.getInstAid();
                String sdAid = nRMSApplets.getSdAid();
                if (strOnWarmupCompleted.equalsIgnoreCase(instAid)) {
                    xkzzb.IAuthTabCallback(new Object[]{"has permission instanceAID"});
                    return true;
                }
                byte[] bArr3 = e;
                if (strOnWarmupCompleted.contains(putStringSet.onWarmupCompleted(bArr3)) && strOnWarmupCompleted.startsWith(putStringSet.onWarmupCompleted(bArr3))) {
                    xkzzb.IAuthTabCallback(new Object[]{"this is visa rid"});
                    String strA = a(bArr2);
                    if (strA != null && strA.length() == 2) {
                        Iterator<NRMSCredits> it = this.b.iterator();
                        while (it.hasNext()) {
                            if (it.next().getFinanceCd().equalsIgnoreCase(strA)) {
                                xkzzb.IAuthTabCallback(new Object[]{"has permission for finance cd for visa"});
                                return true;
                            }
                        }
                    }
                } else {
                    byte[] bArr4 = f;
                    if (strOnWarmupCompleted.contains(putStringSet.onWarmupCompleted(bArr4)) && strOnWarmupCompleted.startsWith(putStringSet.onWarmupCompleted(bArr4))) {
                        xkzzb.IAuthTabCallback(new Object[]{"this is visa master"});
                        String strA2 = a(bArr2);
                        if (strA2 != null && strA2.length() == 2) {
                            Iterator<NRMSCredits> it2 = this.b.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().getFinanceCd().equalsIgnoreCase(strA2)) {
                                    xkzzb.IAuthTabCallback(new Object[]{"has permission for finance cd for master"});
                                    return true;
                                }
                            }
                        }
                    } else {
                        byte[] bArr5 = g;
                        if (strOnWarmupCompleted.contains(putStringSet.onWarmupCompleted(bArr5)) && strOnWarmupCompleted.startsWith(putStringSet.onWarmupCompleted(bArr5))) {
                            xkzzb.IAuthTabCallback(new Object[]{"this is visa amex01"});
                            String strA3 = a(bArr2);
                            if (strA3 != null && strA3.length() == 2) {
                                Iterator<NRMSCredits> it3 = this.b.iterator();
                                while (it3.hasNext()) {
                                    if (it3.next().getFinanceCd().equalsIgnoreCase(strA3)) {
                                        xkzzb.IAuthTabCallback(new Object[]{"has permission for finance cd for amex01"});
                                        return true;
                                    }
                                }
                            }
                        } else {
                            byte[] bArr6 = h;
                            if (strOnWarmupCompleted.contains(putStringSet.onWarmupCompleted(bArr6)) && strOnWarmupCompleted.startsWith(putStringSet.onWarmupCompleted(bArr6))) {
                                xkzzb.IAuthTabCallback(new Object[]{"this is visa amex02"});
                                String strA4 = a(bArr2);
                                if (strA4 != null && strA4.length() == 2) {
                                    Iterator<NRMSCredits> it4 = this.b.iterator();
                                    while (it4.hasNext()) {
                                        if (it4.next().getFinanceCd().equalsIgnoreCase(strA4)) {
                                            xkzzb.IAuthTabCallback(new Object[]{"has permission for finance cd for amex02"});
                                            return true;
                                        }
                                    }
                                }
                            } else {
                                byte[] bArr7 = i;
                                if (strOnWarmupCompleted.contains(putStringSet.onWarmupCompleted(bArr7)) && strOnWarmupCompleted.startsWith(putStringSet.onWarmupCompleted(bArr7))) {
                                    xkzzb.IAuthTabCallback(new Object[]{"this is mobia"});
                                    String strB = b(bArr2);
                                    xkzzb.onExtraCallback(new Object[]{"++ fCd : [%s]", strB});
                                    if (strB != null && strB.length() == 4) {
                                        for (NRMSTcses nRMSTcses : this.c) {
                                            xkzzb.onExtraCallback(new Object[]{"++ tcs.getFinanceCd() : [%s]", nRMSTcses.getFinanceCd()});
                                            if (nRMSTcses.getFinanceCd().equalsIgnoreCase(strB)) {
                                                xkzzb.IAuthTabCallback(new Object[]{"has permission for finance cd for mobia"});
                                                return true;
                                            }
                                        }
                                    }
                                    xkzzb.IAuthTabCallback(new Object[]{"has permission for finance cd for mobia always"});
                                    return true;
                                }
                                byte[] bArr8 = j;
                                if (strOnWarmupCompleted.contains(putStringSet.onWarmupCompleted(bArr8)) && strOnWarmupCompleted.startsWith(putStringSet.onWarmupCompleted(bArr8))) {
                                    xkzzb.IAuthTabCallback(new Object[]{"this is unionpay"});
                                    String strA5 = a(bArr2);
                                    if (strA5 != null && strA5.length() == 2) {
                                        Iterator<NRMSCredits> it5 = this.b.iterator();
                                        while (it5.hasNext()) {
                                            if (it5.next().getFinanceCd().equalsIgnoreCase(strA5)) {
                                                xkzzb.IAuthTabCallback(new Object[]{"has permission for finance cd for unionpay"});
                                                return true;
                                            }
                                        }
                                    }
                                } else {
                                    if (strOnWarmupCompleted.contains(instAid) && strOnWarmupCompleted.startsWith(instAid)) {
                                        xkzzb.IAuthTabCallback(new Object[]{"has permission pattern"});
                                        return true;
                                    }
                                    if (strOnWarmupCompleted.contains(instAid.toUpperCase()) && strOnWarmupCompleted.startsWith(instAid.toUpperCase())) {
                                        xkzzb.IAuthTabCallback(new Object[]{"has permission pattern"});
                                        return true;
                                    }
                                    if (strOnWarmupCompleted.equalsIgnoreCase(sdAid)) {
                                        xkzzb.IAuthTabCallback(new Object[]{"has permission sd aid"});
                                        return true;
                                    }
                                    List<NRMSCredits> list2 = this.b;
                                    if (list2 != null && list2.size() > 0) {
                                        Iterator<NRMSCredits> it6 = this.b.iterator();
                                        while (it6.hasNext()) {
                                            if (strOnWarmupCompleted.equalsIgnoreCase(it6.next().getSdAid())) {
                                                xkzzb.IAuthTabCallback(new Object[]{"has permission finance's sd aid"});
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z = false;
        }
        xkzzb.onExtraCallback(new Object[]{"-- returned - hasPermission is " + z});
        return z;
    }

    public String getICCID() throws Exception {
        byte[] bArrTransmit = transmit(putStringSet.onNavigationEvent("00A4000C022FE2"));
        xkzzb.onExtraCallback(new Object[]{"++ baRPDU : [%s]", putStringSet.onWarmupCompleted(bArrTransmit)});
        if (!isResponseSuccess(bArrTransmit)) {
            throw new Exception("***** File select failed");
        }
        byte[] bArrTransmit2 = transmit(putStringSet.onNavigationEvent("00B000000A"));
        xkzzb.onExtraCallback(new Object[]{"++ baRPDU : [%s]", putStringSet.onWarmupCompleted(bArrTransmit2)});
        if (!isResponseSuccess(bArrTransmit2)) {
            throw new Exception("***** ICCID read faild");
        }
        int length = bArrTransmit2.length - 2;
        byte[] bArr = new byte[length];
        System.arraycopy(bArrTransmit2, 0, bArr, 0, length);
        String strOnWarmupCompleted = putStringSet.onWarmupCompleted(bArr);
        int length2 = strOnWarmupCompleted.length() / 2;
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, length2, 2);
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < 2; i4++) {
                strArr[i3][i4] = String.format("%c", Character.valueOf(strOnWarmupCompleted.charAt(i2)));
                i2++;
            }
        }
        String str = "";
        for (int i5 = 0; i5 < length2; i5++) {
            for (int i6 = 1; i6 >= 0; i6--) {
                str = str + strArr[i5][i6];
            }
        }
        xkzzb.onExtraCallback(new Object[]{"++ tmpIccid : [%s]", strOnWarmupCompleted});
        xkzzb.onExtraCallback(new Object[]{"++ iccid : [%s]", str});
        return str;
    }

    protected String getPackageName() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        xkzzb.onExtraCallback(new Object[]{">> getPackageName()"});
        try {
            packageInfo = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0);
        } catch (Exception e2) {
            xkzzb.onNavigationEvent(e2);
            packageInfo = null;
        }
        return packageInfo.packageName;
    }

    private String a(byte[] bArr) {
        xkzzb.onExtraCallback(new Object[]{">> parseFinanceCode()"});
        try {
            if (bArr != null) {
                try {
                    if (bArr.length >= 15) {
                        byte[] bArr2 = new byte[5];
                        byte[] bArr3 = new byte[2];
                        byte[] bArr4 = new byte[3];
                        byte[] bArr5 = new byte[5];
                        if (bArr.length >= 15) {
                            System.arraycopy(bArr, 0, bArr2, 0, 5);
                            System.arraycopy(bArr, 5, bArr3, 0, 2);
                            System.arraycopy(bArr, 7, bArr4, 0, 3);
                            System.arraycopy(bArr, 10, bArr5, 0, 5);
                            xkzzb.onExtraCallbackWithResult(new Object[]{"++ baInstanceAid : [%s]", putStringSet.onWarmupCompleted(bArr)});
                            xkzzb.onExtraCallbackWithResult(new Object[]{"++ baRid : [%s]", putStringSet.onWarmupCompleted(bArr2)});
                            xkzzb.onExtraCallbackWithResult(new Object[]{"++ baPix : [%s]", putStringSet.onWarmupCompleted(bArr3)});
                            xkzzb.onExtraCallbackWithResult(new Object[]{"++ baBin : [%s]", putStringSet.onWarmupCompleted(bArr4)});
                            xkzzb.onExtraCallbackWithResult(new Object[]{"++ baExt : [%s]", putStringSet.onWarmupCompleted(bArr5)});
                        }
                        String strSubstring = putStringSet.onWarmupCompleted(bArr5).substring(0, 2);
                        xkzzb.onExtraCallback(new Object[]{"++ returned : [%s]", strSubstring});
                        return strSubstring;
                    }
                } catch (Exception e2) {
                    xkzzb.onNavigationEvent(e2);
                    xkzzb.onExtraCallback(new Object[]{"++ returned : [%s]", null});
                    return null;
                }
            }
            throw new IllegalArgumentException("***** invalid credit card aid !!");
        } catch (Throwable th) {
            xkzzb.onExtraCallback(new Object[]{"++ returned : [%s]", null});
            throw th;
        }
    }

    private String b(byte[] bArr) {
        xkzzb.onExtraCallback(new Object[]{">> parseFinanceCode()"});
        xkzzb.onExtraCallback(new Object[]{"++ baInstanceAid : [%s]", putStringSet.onWarmupCompleted(bArr)});
        try {
            if (bArr != null) {
                try {
                    if (bArr.length >= 16) {
                        byte[] bArr2 = new byte[5];
                        byte[] bArr3 = new byte[2];
                        byte[] bArr4 = new byte[1];
                        byte[] bArr5 = new byte[2];
                        byte[] bArr6 = new byte[5];
                        byte[] bArr7 = new byte[1];
                        System.arraycopy(bArr, 0, bArr2, 0, 5);
                        System.arraycopy(bArr, 5, bArr3, 0, 2);
                        System.arraycopy(bArr, 7, bArr4, 0, 1);
                        System.arraycopy(bArr, 8, bArr5, 0, 2);
                        System.arraycopy(bArr, 10, bArr6, 0, 5);
                        System.arraycopy(bArr, 15, bArr7, 0, 1);
                        xkzzb.onExtraCallbackWithResult(new Object[]{"++ baInstanceAid : [%s]", putStringSet.onWarmupCompleted(bArr)});
                        xkzzb.onExtraCallbackWithResult(new Object[]{"++ baRid : [%s]", putStringSet.onWarmupCompleted(bArr2)});
                        xkzzb.onExtraCallbackWithResult(new Object[]{"++ baSvs : [%s]", putStringSet.onWarmupCompleted(bArr3)});
                        xkzzb.onExtraCallbackWithResult(new Object[]{"++ baRfu : [%s]", putStringSet.onWarmupCompleted(bArr4)});
                        xkzzb.onExtraCallbackWithResult(new Object[]{"++ baFcd : [%s]", putStringSet.onWarmupCompleted(bArr5)});
                        xkzzb.onExtraCallbackWithResult(new Object[]{"++ baPcd : [%s]", putStringSet.onWarmupCompleted(bArr6)});
                        xkzzb.onExtraCallbackWithResult(new Object[]{"++ baNum : [%s]", putStringSet.onWarmupCompleted(bArr7)});
                        String strOnWarmupCompleted = putStringSet.onWarmupCompleted(bArr5);
                        xkzzb.onExtraCallback(new Object[]{"++parseFinanceCode returned : [%s]", strOnWarmupCompleted});
                        return strOnWarmupCompleted;
                    }
                } catch (Exception e2) {
                    xkzzb.onNavigationEvent(e2);
                    xkzzb.onExtraCallback(new Object[]{"++parseFinanceCode returned : [%s]", null});
                    return null;
                }
            }
            throw new IllegalArgumentException("***** invalid credit card aid !!");
        } catch (Throwable th) {
            xkzzb.onExtraCallback(new Object[]{"++parseFinanceCode returned : [%s]", null});
            throw th;
        }
    }

    public boolean hasSeioCarrierPrivileges() {
        xkzzb.onExtraCallback(new Object[]{"++ hasSeioCarrierPrivileges"});
        int semSubscriptionId = LibraryFeatures.getSemSubscriptionId();
        try {
            RecyclerViewChildDrawingOrderCallback recyclerViewChildDrawingOrderCallback = this.mSeioSe;
            zOnExtraCallback = recyclerViewChildDrawingOrderCallback != null ? recyclerViewChildDrawingOrderCallback.onExtraCallback() : false;
            if (semSubscriptionId > 0) {
                zOnExtraCallback = this.mSeioSe.IAuthTabCallback(semSubscriptionId);
            }
        } catch (RemoteException e2) {
            xkzzb.onExtraCallbackWithResult(new Object[]{"++ Error [%s]", e2.getMessage()});
        }
        xkzzb.onNavigationEvent(new Object[]{"++ hasSeioCarrierPrivileges [%s]", Boolean.valueOf(zOnExtraCallback)});
        return zOnExtraCallback;
    }
}
