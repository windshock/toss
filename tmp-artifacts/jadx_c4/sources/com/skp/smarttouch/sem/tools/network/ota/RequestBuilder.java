package com.skp.smarttouch.sem.tools.network.ota;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.common.STOtaProcException;
import com.skp.smarttouch.sem.tools.common.UspCodeEnum;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.BodyOfOta;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.HeaderOfOta;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.IOTAProtocol;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.JobTitle;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OTAWorkerData;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OtaBody;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.OtaHeader;
import com.skp.smarttouch.sem.tools.dao.protocol.ota.Rpdu;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.putStringSet;
import o.xkzzb;
import o.zb2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class RequestBuilder {
    private static int $10 = 0;
    private static int $11 = 1;
    protected static final String MSG_TYPE_APDU = "4";
    protected static final String MSG_TYPE_AUTHENTICATE = "2";
    protected static final String MSG_TYPE_END = "6";
    protected static final String MSG_TYPE_INITIATE = "1";
    protected static final String MSG_TYPE_NEW_REQUEST = "3";
    protected static final String MSG_TYPE_RPDU = "5";
    private static final String a = "BFC0C5B8C7C1B6F4BDC3";
    private static final String b = "EMUL";
    private static final String c = "PHONE";
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private Context d;
    private static char[] onNavigationEvent = {64897, 64896, 64899, 64898};
    private static char IAuthTabCallback = 51243;

    public RequestBuilder(Context context) {
        this.d = context;
    }

    public IOTAProtocol.Request buildInitiate(String str, OTAWorkerData oTAWorkerData) throws Throwable {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> buildInitiate()"});
        IOTAProtocol.Request request = new IOTAProtocol.Request();
        HeaderOfOta headerOfOta = new HeaderOfOta();
        BodyOfOta bodyOfOta = new BodyOfOta();
        OtaHeader otaHeader = new OtaHeader();
        OtaBody otaBody = new OtaBody();
        if (zb2.onExtraCallback()) {
            headerOfOta.setClientType(b);
        } else {
            headerOfOta.setClientType(c);
        }
        headerOfOta.setClientId(zb2.onNavigationEvent(this.d));
        headerOfOta.setPackageName(a());
        headerOfOta.setComponentId(oTAWorkerData.getCompId());
        headerOfOta.setStId(oTAWorkerData.getStId());
        Object[] objArr = new Object[1];
        e(new char[]{13841}, (byte) (102 - (ViewConfiguration.getScrollBarSize() >> 8)), KeyEvent.keyCodeFromString("") + 1, objArr);
        otaHeader.setMsgType(((String) objArr[0]).intern());
        otaHeader.setIccid(oTAWorkerData.getIccid());
        JobTitle jobTitle = new JobTitle();
        jobTitle.setInstanceAid(oTAWorkerData.getInstanceAid());
        jobTitle.setAppletVersion(oTAWorkerData.getAppletVersion());
        jobTitle.setOpCode(oTAWorkerData.getUspCode().getCode());
        otaHeader.setJobTitle(jobTitle);
        otaHeader.setSeqNum(str);
        if (UspCodeEnum.MEMBERSHIP_ISSUE.equals(oTAWorkerData.getUspCode()) || UspCodeEnum.MEMBERSHIP_DELETE.equals(oTAWorkerData.getUspCode())) {
            otaBody.setIssueType(oTAWorkerData.getIssueType());
            otaBody.setIssueDel(oTAWorkerData.getIssueDel());
            otaBody.setIssueData(oTAWorkerData.getIssueData());
            headerOfOta.setNopId(oTAWorkerData.getStId());
            headerOfOta.setStId((String) null);
        } else {
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                UspCodeEnum.SETCONFIGDF.equals(oTAWorkerData.getUspCode());
                throw null;
            }
            if (UspCodeEnum.SETCONFIGDF.equals(oTAWorkerData.getUspCode())) {
                otaBody.setParamData(oTAWorkerData.getParamData());
                int i3 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        bodyOfOta.setOtaHeader(otaHeader);
        bodyOfOta.setOtaBody(otaBody);
        request.setHeader(headerOfOta);
        request.setBody(bodyOfOta);
        return request;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IOTAProtocol.Request buildAuthenticate(String str, OTAWorkerData oTAWorkerData) throws Throwable {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> buildAuthenticate()"});
        IOTAProtocol.Request request = new IOTAProtocol.Request();
        HeaderOfOta headerOfOta = new HeaderOfOta();
        BodyOfOta bodyOfOta = new BodyOfOta();
        OtaHeader otaHeader = new OtaHeader();
        OtaBody otaBody = new OtaBody();
        Object obj = null;
        if (!zb2.onExtraCallback()) {
            headerOfOta.setClientType(c);
        } else {
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                headerOfOta.setClientType(b);
                obj.hashCode();
                throw null;
            }
            headerOfOta.setClientType(b);
        }
        headerOfOta.setClientId(zb2.onNavigationEvent(this.d));
        headerOfOta.setPackageName(a());
        headerOfOta.setComponentId(oTAWorkerData.getCompId());
        headerOfOta.setStId(oTAWorkerData.getStId());
        Object[] objArr = new Object[1];
        e(new char[]{13797}, (byte) (61 - TextUtils.getCapsMode("", 0, 0)), 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        otaHeader.setMsgType(((String) objArr[0]).intern());
        otaHeader.setSeqNum(str);
        if (!UspCodeEnum.INSTALL.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.DELETE.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.LOCK.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.UNLOCK.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.ENABLE.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.BLOCKING.equals(oTAWorkerData.getUspCode())) {
            int i3 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (!UspCodeEnum.SETPPSE.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.LOCKTRANS.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.SETCONFIGDF.equals(oTAWorkerData.getUspCode())) {
                if (UspCodeEnum.MEMBERSHIP_ISSUE.equals(oTAWorkerData.getUspCode()) || UspCodeEnum.MEMBERSHIP_DELETE.equals(oTAWorkerData.getUspCode())) {
                    headerOfOta.setNopId(oTAWorkerData.getStId());
                    headerOfOta.setStId((String) null);
                }
            }
        } else {
            otaHeader.setAccessToken(a(oTAWorkerData.getTid(), a));
        }
        bodyOfOta.setTid(oTAWorkerData.getTid());
        bodyOfOta.setOtaHeader(otaHeader);
        bodyOfOta.setOtaBody(otaBody);
        request.setHeader(headerOfOta);
        request.setBody(bodyOfOta);
        return request;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.skp.smarttouch.sem.tools.common.STOtaProcException */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IOTAProtocol.Request buildNewRequest(String str, OTAWorkerData oTAWorkerData, String str2) throws STOtaProcException {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> buildNewRequest()"});
        if (!a(oTAWorkerData.getIccid(), a).equals(str2)) {
            throw new STOtaProcException("***** Server accesstoken is not valid!!", "978");
        }
        IOTAProtocol.Request request = new IOTAProtocol.Request();
        HeaderOfOta headerOfOta = new HeaderOfOta();
        BodyOfOta bodyOfOta = new BodyOfOta();
        OtaHeader otaHeader = new OtaHeader();
        OtaBody otaBody = new OtaBody();
        if (zb2.onExtraCallback()) {
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                headerOfOta.setClientType(b);
                int i3 = 41 / 0;
            } else {
                headerOfOta.setClientType(b);
            }
        } else {
            headerOfOta.setClientType(c);
        }
        headerOfOta.setClientId(zb2.onNavigationEvent(this.d));
        headerOfOta.setPackageName(a());
        headerOfOta.setComponentId(oTAWorkerData.getCompId());
        headerOfOta.setStId(oTAWorkerData.getStId());
        otaHeader.setMsgType(MSG_TYPE_NEW_REQUEST);
        otaHeader.setSeqNum(str);
        if (!UspCodeEnum.MEMBERSHIP_ISSUE.equals(oTAWorkerData.getUspCode())) {
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                UspCodeEnum.MEMBERSHIP_DELETE.equals(oTAWorkerData.getUspCode());
                throw null;
            }
            if (!(!UspCodeEnum.MEMBERSHIP_DELETE.equals(oTAWorkerData.getUspCode()))) {
                otaBody.setIssueType(oTAWorkerData.getIssueType());
                otaBody.setIssueDel(oTAWorkerData.getIssueDel());
                otaBody.setIssueData(oTAWorkerData.getIssueData());
                headerOfOta.setNopId(oTAWorkerData.getStId());
                headerOfOta.setStId((String) null);
            } else {
                int i5 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (UspCodeEnum.SETCONFIGDF.equals(oTAWorkerData.getUspCode())) {
                    int i7 = onExtraCallbackWithResult + 27;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    otaBody.setParamData(oTAWorkerData.getParamData());
                }
            }
        }
        bodyOfOta.setTid(oTAWorkerData.getTid());
        bodyOfOta.setOtaHeader(otaHeader);
        bodyOfOta.setOtaBody(otaBody);
        request.setHeader(headerOfOta);
        request.setBody(bodyOfOta);
        int i9 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            return request;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        int i5 = 9;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + i5;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 26 - View.MeasureSpec.makeMeasureSpec(0, 0), 23139 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (Process.myTid() >> 22) + 26, View.MeasureSpec.getSize(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i3 = 2;
                i5 = 9;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 5;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $10 + 15;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i12 = $10 + 119;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b2);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b2);
                        int i13 = $11 + 69;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 24825), 74 - (ViewConfiguration.getPressedStateDuration() >> 16), 8088 - TextUtils.indexOf("", "", 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i15 = $11 + 59;
                                $10 = i15 % 128;
                                int i16 = i15 % 2;
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 19440, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i18 = $10 + 63;
                                    $11 = i18 % 128;
                                    int i19 = i18 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                                } else {
                                    int i22 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i23 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i22];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i23];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i24 = 0;
        while (i24 < i) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            i24++;
            int i25 = $10 + 13;
            $11 = i25 % 128;
            int i26 = i25 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    public IOTAProtocol.Request buildRequest(String str, String str2, String str3, List<Rpdu> list, OTAWorkerData oTAWorkerData) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IOTAProtocol.Request requestBuildResponse = buildResponse(str, str2, str3, list, oTAWorkerData);
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return requestBuildResponse;
    }

    public IOTAProtocol.Request buildResponse(String str, String str2, String str3, List<Rpdu> list, OTAWorkerData oTAWorkerData) {
        int i = 2 % 2;
        IOTAProtocol.Request request = new IOTAProtocol.Request();
        HeaderOfOta headerOfOta = new HeaderOfOta();
        BodyOfOta bodyOfOta = new BodyOfOta();
        OtaHeader otaHeader = new OtaHeader();
        OtaBody otaBody = new OtaBody();
        if (zb2.onExtraCallback()) {
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            headerOfOta.setClientType(b);
        } else {
            headerOfOta.setClientType(c);
            int i4 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        headerOfOta.setClientId(zb2.onNavigationEvent(this.d));
        headerOfOta.setPackageName(a());
        headerOfOta.setComponentId(oTAWorkerData.getCompId());
        headerOfOta.setStId(oTAWorkerData.getStId());
        headerOfOta.setResultCode(str2);
        headerOfOta.setResultMsg(str3);
        otaHeader.setMsgType(MSG_TYPE_RPDU);
        otaHeader.setSeqNum(str);
        otaBody.setRpduList(list);
        if (!UspCodeEnum.INSTALL.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.DELETE.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.LOCK.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.UNLOCK.equals(oTAWorkerData.getUspCode()) && !UspCodeEnum.ENABLE.equals(oTAWorkerData.getUspCode())) {
            if (!(!UspCodeEnum.SETCONFIGDF.equals(oTAWorkerData.getUspCode()))) {
                int i6 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                otaBody.setParamData(oTAWorkerData.getParamData());
            } else if (UspCodeEnum.MEMBERSHIP_ISSUE.equals(oTAWorkerData.getUspCode()) || UspCodeEnum.MEMBERSHIP_DELETE.equals(oTAWorkerData.getUspCode())) {
                otaBody.setIssueType(oTAWorkerData.getIssueType());
                otaBody.setIssueDel(oTAWorkerData.getIssueDel());
                otaBody.setIssueData(oTAWorkerData.getIssueData());
                headerOfOta.setNopId(oTAWorkerData.getStId());
                headerOfOta.setStId((String) null);
            }
        }
        bodyOfOta.setTid(oTAWorkerData.getTid());
        bodyOfOta.setOtaHeader(otaHeader);
        bodyOfOta.setOtaBody(otaBody);
        request.setHeader(headerOfOta);
        request.setBody(bodyOfOta);
        return request;
    }

    public IOTAProtocol.Request buildEnd(String str, String str2, String str3, List<Rpdu> list, OTAWorkerData oTAWorkerData) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IOTAProtocol.Request requestBuildResponse = buildResponse(str, str2, str3, list, oTAWorkerData);
        int i4 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return requestBuildResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private String a(String str, String str2) {
        int i = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> makeAccessToken()"});
        xkzzb.onExtraCallback(new Object[]{"++ data : [%s]", str});
        xkzzb.onExtraCallback(new Object[]{"++ key : [%s]", str2});
        try {
            String strReplace = str.replace("-", "");
            if (strReplace.length() > 20) {
                int i2 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    strReplace = strReplace.substring(strReplace.length() >>> 67);
                    Object[] objArr = new Object[3];
                    objArr[1] = "++ data : [%s]";
                    objArr[1] = strReplace;
                    xkzzb.onExtraCallback(objArr);
                } else {
                    strReplace = strReplace.substring(strReplace.length() - 20);
                    xkzzb.onExtraCallback(new Object[]{"++ data : [%s]", strReplace});
                }
                int i3 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            return putStringSet.onWarmupCompleted(b(strReplace, str2));
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            return null;
        }
    }

    private byte[] b(String str, String str2) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        int i = 2 % 2;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(putStringSet.onNavigationEvent(str2), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(putStringSet.onNavigationEvent(str));
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return bArrDoFinal;
        } catch (Exception e) {
            throw new SignatureException(e.getMessage());
        }
    }

    private String a() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> getPackageName()"});
        try {
            packageInfo = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            packageInfo = null;
        }
        String str = packageInfo.packageName;
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
