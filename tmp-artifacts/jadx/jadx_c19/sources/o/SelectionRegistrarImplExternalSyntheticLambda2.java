package o;

import android.graphics.ImageFormat;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import o.BasicTextContextMenuProviderExternalSyntheticLambda0;
import o.OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4;
import o.SelectionRegistrarImplExternalSyntheticLambda2;
import o.SimpleLayoutKtExternalSyntheticLambda0;
import o.handleRemoveKey;
import org.json.JSONException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionRegistrarImplExternalSyntheticLambda2 implements SimpleLayoutKtExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub onExtraCallbackWithResult;
    private static int onTransact = 1;
    private static final String onWarmupCompleted;
    private final UUID IAuthTabCallback;
    private int onExtraCallback;
    private final MediaDrm onNavigationEvent;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = i2 | i6;
        int i9 = ~i6;
        int i10 = ~i7;
        int i11 = ~(i9 | i10);
        int i12 = ~i2;
        int i13 = i11 | (~(i12 | i7));
        int i14 = ~(i10 | i2);
        int i15 = i13 | i14;
        int i16 = (~(i7 | i12 | i6)) | i14;
        int i17 = i2 + i6 + i4 + (1881146393 * i3) + ((-1035018111) * i5);
        int i18 = i17 * i17;
        int i19 = ((i2 * (-1924067824)) - 304087040) + ((-1924067824) * i6) + (i8 * (-674303503)) + ((-674303503) * i15) + (674303503 * i16) + (1696595968 * i4) + (1612709888 * i3) + ((-182452224) * i5) + ((-1611137024) * i18);
        int i20 = (i2 * (-928100048)) + 945860906 + (i6 * (-928100048)) + (i8 * (-189)) + (i15 * (-189)) + (i16 * 189) + (i4 * (-928100237)) + (i3 * (-1331189957)) + (i5 * 1329932787) + (i18 * 1550319616);
        int i21 = i19 + (i20 * i20 * 1690828800);
        return i21 != 1 ? i21 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public int onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 101;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return 2;
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public /* synthetic */ TextFieldSelectionState_androidKtExternalSyntheticLambda4 IAuthTabCallback(byte[] bArr) throws MediaCryptoException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SelectionRegistrarKtExternalSyntheticLambda0 selectionRegistrarKtExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(bArr);
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        int i6 = onTransact + 83;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return selectionRegistrarKtExternalSyntheticLambda0OnNavigationEvent;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $11 + 107;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 45813), 84 - Gravity.getAbsoluteGravity(0, 0), 21233 - TextUtils.getTrimmedLength(""), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 14185), 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 51;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{59692, 49110, 59716, 36846, 26394, 41656, 2038, 12844, 10351, 20112, 18173, 61571, 27444}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        onExtraCallbackWithResult = new SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda0
            @Override // o.SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallbackStub
            public final SimpleLayoutKtExternalSyntheticLambda0 acquireExoMediaDrm(UUID uuid) {
                return SelectionRegistrarImplExternalSyntheticLambda2.IAuthTabCallback(uuid);
            }
        };
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ SimpleLayoutKtExternalSyntheticLambda0 IAuthTabCallback(UUID uuid) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 7;
        onTransact = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                return (SelectionRegistrarImplExternalSyntheticLambda2) onExtraCallbackWithResult(1979267620, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), new Object[]{uuid}, handleRemoveKey.onExtraCallbackWithResult(), -1979267618, iOnExtraCallbackWithResult);
            }
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            throw null;
        } catch (TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4 unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new SimpleLayoutKtSimpleLayout11ExternalSyntheticLambda0();
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4 {
        int i2 = 2 % 2;
        try {
            SelectionRegistrarImplExternalSyntheticLambda2 selectionRegistrarImplExternalSyntheticLambda2 = new SelectionRegistrarImplExternalSyntheticLambda2((UUID) objArr[0]);
            int i3 = onTransact + 73;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return selectionRegistrarImplExternalSyntheticLambda2;
        } catch (UnsupportedSchemeException e) {
            throw new TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4(1, e);
        } catch (Exception e2) {
            throw new TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4(2, e2);
        }
    }

    private SelectionRegistrarImplExternalSyntheticLambda2(UUID uuid) throws UnsupportedSchemeException {
        RecordingInputConnection_androidKt.onExtraCallback(!AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallbackWithResult.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.IAuthTabCallback = uuid;
        MediaDrm mediaDrm = new MediaDrm(onNavigationEvent(uuid));
        this.onNavigationEvent = mediaDrm;
        this.onExtraCallback = 1;
        if (AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallback.equals(uuid) && asBinder()) {
            int i2 = IAuthTabCallbackStub + 93;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(mediaDrm);
            if (i3 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
        }
        int i5 = onTransact + 29;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public void IAuthTabCallback(@Nullable final SimpleLayoutKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        MediaDrm.OnEventListener onEventListener;
        int i2 = 2 % 2;
        int i3 = onTransact + 75;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        MediaDrm mediaDrm = this.onNavigationEvent;
        if (onextracallbackwithresult == null) {
            int i6 = i4 + 17;
            onTransact = i6 % 128;
            onEventListener = null;
            if (i6 % 2 == 0) {
                throw null;
            }
        } else {
            onEventListener = new MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticLambda2
                @Override // android.media.MediaDrm.OnEventListener
                public final void onEvent(MediaDrm mediaDrm2, byte[] bArr, int i7, int i8, byte[] bArr2) {
                    Object[] objArr = {this.f$0, onextracallbackwithresult, mediaDrm2, bArr, Integer.valueOf(i7), Integer.valueOf(i8), bArr2};
                    int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                    SelectionRegistrarImplExternalSyntheticLambda2.onExtraCallbackWithResult(681778686, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult(), -681778686, iOnExtraCallbackWithResult);
                }
            };
        }
        mediaDrm.setOnEventListener(onEventListener);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SelectionRegistrarImplExternalSyntheticLambda2 selectionRegistrarImplExternalSyntheticLambda2 = (SelectionRegistrarImplExternalSyntheticLambda2) objArr[0];
        SimpleLayoutKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (SimpleLayoutKtExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[1];
        byte[] bArr = (byte[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        byte[] bArr2 = (byte[]) objArr[6];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 121;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onextracallbackwithresult.onNavigationEvent(selectionRegistrarImplExternalSyntheticLambda2, bArr, iIntValue, iIntValue2, bArr2);
            obj.hashCode();
            throw null;
        }
        onextracallbackwithresult.onNavigationEvent(selectionRegistrarImplExternalSyntheticLambda2, bArr, iIntValue, iIntValue2, bArr2);
        int i4 = IAuthTabCallbackStub + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onNavigationEvent(SelectionRegistrarImplExternalSyntheticLambda2 selectionRegistrarImplExternalSyntheticLambda2, SimpleLayoutKtExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i3 = IAuthTabCallbackStub + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new SimpleLayoutKtExternalSyntheticLambda0.onNavigationEvent(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        int i5 = IAuthTabCallbackStub + 33;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionRegistrarImplExternalSyntheticLambda2 selectionRegistrarImplExternalSyntheticLambda2, SimpleLayoutKtExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, MediaDrm mediaDrm, byte[] bArr, long j) {
        int i2 = 2 % 2;
        int i3 = onTransact + 15;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public byte[] IAuthTabCallback() throws MediaDrmException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        MediaDrm mediaDrm = this.onNavigationEvent;
        if (i4 != 0) {
            return mediaDrm.openSession();
        }
        mediaDrm.openSession();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public void onWarmupCompleted(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            this.onNavigationEvent.closeSession(bArr);
            int i4 = 60 / 0;
        } else {
            this.onNavigationEvent.closeSession(bArr);
        }
        int i5 = IAuthTabCallbackStub + 93;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        int i2 = 2 % 2;
        int i3 = onTransact + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            int i5 = IAuthTabCallbackStub + 21;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            try {
                IAuthTabCallback.onExtraCallbackWithResult(this.onNavigationEvent, bArr, selectionManagerExternalSyntheticLambda12);
            } catch (UnsupportedOperationException unused) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public SimpleLayoutKtExternalSyntheticLambda0.onExtraCallback onNavigationEvent(byte[] bArr, @Nullable List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> list, int i2, @Nullable HashMap<String, String> map) throws Throwable {
        BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnNavigationEvent;
        byte[] bArr2;
        String str;
        byte[] bArrOnNavigationEvent;
        String str2;
        int i3 = 2 % 2;
        if (list != null) {
            int i4 = onTransact + 103;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                iAuthTabCallbackOnNavigationEvent = onNavigationEvent(this.IAuthTabCallback, list);
                bArrOnNavigationEvent = onNavigationEvent(this.IAuthTabCallback, (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallbackOnNavigationEvent.onWarmupCompleted));
                str2 = (String) onExtraCallbackWithResult(-1797520493, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this.IAuthTabCallback, iAuthTabCallbackOnNavigationEvent.IAuthTabCallback}, handleRemoveKey.onExtraCallbackWithResult(), 1797520494, handleRemoveKey.onExtraCallbackWithResult());
                int i5 = 44 / 0;
            } else {
                iAuthTabCallbackOnNavigationEvent = onNavigationEvent(this.IAuthTabCallback, list);
                bArrOnNavigationEvent = onNavigationEvent(this.IAuthTabCallback, (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallbackOnNavigationEvent.onWarmupCompleted));
                str2 = (String) onExtraCallbackWithResult(-1797520493, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this.IAuthTabCallback, iAuthTabCallbackOnNavigationEvent.IAuthTabCallback}, handleRemoveKey.onExtraCallbackWithResult(), 1797520494, handleRemoveKey.onExtraCallbackWithResult());
            }
            bArr2 = bArrOnNavigationEvent;
            str = str2;
        } else {
            iAuthTabCallbackOnNavigationEvent = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.onNavigationEvent.getKeyRequest(bArr, bArr2, str, i2, map);
        byte[] bArrOnExtraCallback = onExtraCallback(this.IAuthTabCallback, keyRequest.getData());
        String strOnWarmupCompleted = onWarmupCompleted(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strOnWarmupCompleted) && iAuthTabCallbackOnNavigationEvent != null) {
            int i6 = onTransact + 87;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                TextUtils.isEmpty(iAuthTabCallbackOnNavigationEvent.onNavigationEvent);
                throw null;
            }
            if (!TextUtils.isEmpty(iAuthTabCallbackOnNavigationEvent.onNavigationEvent)) {
                strOnWarmupCompleted = iAuthTabCallbackOnNavigationEvent.onNavigationEvent;
            }
        }
        return new SimpleLayoutKtExternalSyntheticLambda0.onExtraCallback(bArrOnExtraCallback, strOnWarmupCompleted, keyRequest.getRequestType());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String onWarmupCompleted(String str) throws Throwable {
        int i2 = 2 % 2;
        Object obj = null;
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            int i3 = onTransact + 49;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 5;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                return "";
            }
            obj.hashCode();
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            int i7 = IAuthTabCallbackStub + 9;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{47194, 34044, 47154, 46276, 42612, 49686, 50840, 21122, 31001, 30138, 34707, 36909, 14942, 13877, 17642, 53555, 64447, 63308, 552, 5708, 48367, 45442, 49984}, KeyEvent.getDeadChar(1, 0), objArr);
                if (((String) objArr[0]).intern().equals(str)) {
                    String strIAuthTabCallback = IAuthTabCallback("version");
                    if (Objects.equals(strIAuthTabCallback, "1.2") || Objects.equals(strIAuthTabCallback, "aidl-1")) {
                        return "";
                    }
                }
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{47194, 34044, 47154, 46276, 42612, 49686, 50840, 21122, 31001, 30138, 34707, 36909, 14942, 13877, 17642, 53555, 64447, 63308, 552, 5708, 48367, 45442, 49984}, KeyEvent.getDeadChar(0, 0), objArr2);
                if (((String) objArr2[0]).intern().equals(str)) {
                }
            }
        }
        int i8 = IAuthTabCallbackStub + 23;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public byte[] onNavigationEvent(byte[] bArr, byte[] bArr2) throws JSONException, DeniedByServerException, NotProvisionedException {
        int i2 = 2 % 2;
        int i3 = onTransact + 61;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!(!AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback.equals(this.IAuthTabCallback))) {
            bArr2 = SelectionManager_androidKtExternalSyntheticLambda2.IAuthTabCallback(bArr2);
            int i5 = onTransact + 35;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        return this.onNavigationEvent.provideKeyResponse(bArr, bArr2);
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public SimpleLayoutKtExternalSyntheticLambda0.onTransact onExtraCallback() {
        int i2 = 2 % 2;
        MediaDrm.ProvisionRequest provisionRequest = this.onNavigationEvent.getProvisionRequest();
        SimpleLayoutKtExternalSyntheticLambda0.onTransact ontransact = new SimpleLayoutKtExternalSyntheticLambda0.onTransact(provisionRequest.getData(), provisionRequest.getDefaultUrl());
        int i3 = IAuthTabCallbackStub + 105;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return ontransact;
        }
        throw null;
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public void onExtraCallback(byte[] bArr) throws DeniedByServerException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.provideProvisionResponse(bArr);
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public Map<String, String> onExtraCallbackWithResult(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = onTransact + 71;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        MediaDrm mediaDrm = this.onNavigationEvent;
        if (i4 == 0) {
            return mediaDrm.queryKeyStatus(bArr);
        }
        mediaDrm.queryKeyStatus(bArr);
        throw null;
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public boolean onExtraCallbackWithResult(byte[] bArr, String str) throws Throwable {
        MediaCrypto mediaCrypto;
        int i2 = 2 % 2;
        int i3 = onTransact + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        MediaCrypto mediaCrypto2 = null;
        if (Build.VERSION.SDK_INT >= 31 && onTransact()) {
            int i5 = IAuthTabCallbackStub + 121;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                MediaDrm mediaDrm = this.onNavigationEvent;
                return IAuthTabCallback.onExtraCallbackWithResult(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
            MediaDrm mediaDrm2 = this.onNavigationEvent;
            IAuthTabCallback.onExtraCallbackWithResult(mediaDrm2, str, mediaDrm2.getSecurityLevel(bArr));
            mediaCrypto2.hashCode();
            throw null;
        }
        try {
            try {
                mediaCrypto = new MediaCrypto(onNavigationEvent(this.IAuthTabCallback), bArr);
            } catch (Throwable th) {
                th = th;
                mediaCrypto = mediaCrypto2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean zEquals = this.IAuthTabCallback.equals(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback);
            if (mediaCrypto2 != null) {
                int i6 = onTransact + 89;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                mediaCrypto2.release();
            }
            return !zEquals;
        } catch (Throwable th2) {
            th = th2;
            if (mediaCrypto != null) {
                mediaCrypto.release();
                int i8 = IAuthTabCallbackStub + 51;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            }
            throw th;
        }
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public void onWarmupCompleted() {
        synchronized (this) {
            int i2 = this.onExtraCallback - 1;
            this.onExtraCallback = i2;
            if (i2 == 0) {
                this.onNavigationEvent.release();
            }
        }
    }

    @Override // o.SimpleLayoutKtExternalSyntheticLambda0
    public void onWarmupCompleted(byte[] bArr, byte[] bArr2) {
        int i2 = 2 % 2;
        int i3 = onTransact + 41;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.onNavigationEvent.restoreKeys(bArr, bArr2);
            obj.hashCode();
            throw null;
        }
        this.onNavigationEvent.restoreKeys(bArr, bArr2);
        int i4 = onTransact + 95;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 83;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String propertyString = this.onNavigationEvent.getPropertyString(str);
        int i5 = IAuthTabCallbackStub + 111;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return propertyString;
    }

    public SelectionRegistrarKtExternalSyntheticLambda0 onNavigationEvent(byte[] bArr) throws MediaCryptoException {
        int i2 = 2 % 2;
        SelectionRegistrarKtExternalSyntheticLambda0 selectionRegistrarKtExternalSyntheticLambda0 = new SelectionRegistrarKtExternalSyntheticLambda0(onNavigationEvent(this.IAuthTabCallback), bArr);
        int i3 = onTransact + 71;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return selectionRegistrarKtExternalSyntheticLambda0;
    }

    private boolean onTransact() {
        int i2 = 2 % 2;
        if (!this.IAuthTabCallback.equals(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallback)) {
            return this.IAuthTabCallback.equals(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback);
        }
        int i3 = IAuthTabCallbackStub + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String strIAuthTabCallback = IAuthTabCallback("version");
        if (!strIAuthTabCallback.startsWith("v5.")) {
            int i5 = IAuthTabCallbackStub + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (!strIAuthTabCallback.startsWith("14.") && !strIAuthTabCallback.startsWith("15.") && !strIAuthTabCallback.startsWith("16.0")) {
                int i7 = onTransact + 55;
                IAuthTabCallbackStub = i7 % 128;
                return i7 % 2 == 0;
            }
        }
        return false;
    }

    private static BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback onNavigationEvent(UUID uuid, List<BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback> list) {
        int i2 = 2 % 2;
        if (!AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallback.equals(uuid)) {
            return list.get(0);
        }
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = list.get(0);
            int length = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int i4 = onTransact + 77;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2 = list.get(i3);
                byte[] bArr = (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallback2.onWarmupCompleted);
                if (Objects.equals(iAuthTabCallback2.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback) && Objects.equals(iAuthTabCallback2.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                    int i6 = onTransact + 91;
                    IAuthTabCallbackStub = i6 % 128;
                    if (i6 % 2 != 0) {
                        OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onWarmupCompleted(bArr);
                        throw null;
                    }
                    if (OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onWarmupCompleted(bArr)) {
                        length += bArr.length;
                    }
                }
            }
            byte[] bArr2 = new byte[length];
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                byte[] bArr3 = (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(list.get(i8).onWarmupCompleted);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i7, length2);
                i7 += length2;
            }
            return iAuthTabCallback.onWarmupCompleted(bArr2);
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback3 = list.get(i9);
            if (OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onExtraCallback((byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(iAuthTabCallback3.onWarmupCompleted)) == 1) {
                int i10 = IAuthTabCallbackStub + 49;
                onTransact = i10 % 128;
                if (i10 % 2 != 0) {
                    return iAuthTabCallback3;
                }
                throw null;
            }
        }
        BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback4 = list.get(0);
        int i11 = IAuthTabCallbackStub + 23;
        onTransact = i11 % 128;
        if (i11 % 2 != 0) {
            return iAuthTabCallback4;
        }
        obj.hashCode();
        throw null;
    }

    private static UUID onNavigationEvent(UUID uuid) {
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!onExtraCallbackWithResult(uuid)) {
            return uuid;
        }
        int i5 = onTransact + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallbackWithResult;
        }
        UUID uuid2 = AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallbackWithResult;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] onNavigationEvent(UUID uuid, byte[] bArr) {
        OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onExtraCallback onextracallbackOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        UUID uuid2 = AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onNavigationEvent;
        if (uuid2.equals(uuid)) {
            byte[] bArrOnWarmupCompleted = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onWarmupCompleted(bArr, uuid);
            if (bArrOnWarmupCompleted != null) {
                int i3 = IAuthTabCallbackStub + 55;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                bArr = bArrOnWarmupCompleted;
            }
            bArr = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onWarmupCompleted(uuid2, asInterface(bArr));
        }
        if (onExtraCallbackWithResult(uuid) && (onextracallbackOnExtraCallbackWithResult = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onExtraCallbackWithResult(bArr)) != null) {
            int i5 = IAuthTabCallbackStub + 3;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            bArr = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.IAuthTabCallback(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onExtraCallbackWithResult, onextracallbackOnExtraCallbackWithResult.onWarmupCompleted, onextracallbackOnExtraCallbackWithResult.IAuthTabCallback);
        }
        if (uuid2.equals(uuid)) {
            int i7 = onTransact + 111;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                "Amazon".equals(Build.MANUFACTURER);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if ("Amazon".equals(Build.MANUFACTURER)) {
                String str = Build.MODEL;
                if (!"AFTB".equals(str)) {
                    int i8 = onTransact + 69;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (!"AFTS".equals(str)) {
                        int i10 = IAuthTabCallbackStub + 9;
                        onTransact = i10 % 128;
                        int i11 = i10 % 2;
                        if ("AFTM".equals(str) || "AFTT".equals(str)) {
                            byte[] bArrOnWarmupCompleted2 = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onWarmupCompleted(bArr, uuid);
                            if (bArrOnWarmupCompleted2 != null) {
                                return bArrOnWarmupCompleted2;
                            }
                        }
                    }
                }
            }
        }
        return bArr;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        UUID uuid = (UUID) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT < 26) {
            int i5 = IAuthTabCallbackStub + 93;
            onTransact = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback.equals(uuid);
                obj.hashCode();
                throw null;
            }
            if (AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback.equals(uuid)) {
                if ("video/mp4".equals(str)) {
                    return "cenc";
                }
                int i6 = IAuthTabCallbackStub + 87;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    "audio/mp4".equals(str);
                    obj.hashCode();
                    throw null;
                }
                if (!(!"audio/mp4".equals(str))) {
                    return "cenc";
                }
            }
        }
        int i7 = IAuthTabCallbackStub + 119;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private static byte[] onExtraCallback(UUID uuid, byte[] bArr) {
        int i2 = 2 % 2;
        if (AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback.equals(uuid)) {
            int i3 = onTransact + 41;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return SelectionManager_androidKtExternalSyntheticLambda2.onWarmupCompleted(bArr);
        }
        int i5 = IAuthTabCallbackStub + 109;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (java.util.Objects.equals(r4, o.AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r4 = o.SelectionRegistrarImplExternalSyntheticLambda2.IAuthTabCallbackStub + 39;
        o.SelectionRegistrarImplExternalSyntheticLambda2.onTransact = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (java.util.Objects.equals(r4, o.AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.IAuthTabCallback) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean onExtraCallbackWithResult(UUID uuid) {
        int i2 = 2 % 2;
        if (Build.VERSION.SDK_INT < 27) {
            int i3 = onTransact + 29;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 57 / 0;
            }
        }
        int i5 = IAuthTabCallbackStub + 61;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static void onExtraCallbackWithResult(MediaDrm mediaDrm) {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        mediaDrm.setPropertyString("securityLevel", "L3");
        if (i4 != 0) {
            throw null;
        }
    }

    private static boolean asBinder() {
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            "ASUS_Z00AD".equals(Build.MODEL);
            throw null;
        }
        boolean zEquals = "ASUS_Z00AD".equals(Build.MODEL);
        int i4 = onTransact + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return zEquals;
    }

    private static byte[] asInterface(byte[] bArr) {
        int i2 = 2 % 2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr);
        int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        short sAccess100 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access100();
        short sAccess1002 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access100();
        if (sAccess100 != 1 || sAccess1002 != 1) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        int i3 = onTransact + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        short sAccess1003 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access100();
        Charset charset = StandardCharsets.UTF_16LE;
        String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(sAccess1003, charset);
        if (!(!strOnWarmupCompleted.contains("<LA_URL>"))) {
            int i5 = IAuthTabCallbackStub + 31;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return bArr;
        }
        int iIndexOf = strOnWarmupCompleted.indexOf("</DATA>");
        if (iIndexOf == -1) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            int i7 = onTransact + 81;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 4;
            }
        }
        String str = strOnWarmupCompleted.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strOnWarmupCompleted.substring(iIndexOf);
        int i9 = interfaceDescriptor + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i9);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i9);
        byteBufferAllocate.putShort(sAccess100);
        byteBufferAllocate.putShort(sAccess1002);
        byteBufferAllocate.putShort((short) (str.length() << 1));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionRegistrarImplExternalSyntheticLambda2 selectionRegistrarImplExternalSyntheticLambda2, SimpleLayoutKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
        Object[] objArr = {selectionRegistrarImplExternalSyntheticLambda2, onextracallbackwithresult, mediaDrm, bArr, Integer.valueOf(i2), Integer.valueOf(i3), bArr2};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        onExtraCallbackWithResult(681778686, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), objArr, handleRemoveKey.onExtraCallbackWithResult(), -681778686, iOnExtraCallbackWithResult);
    }

    private static String IAuthTabCallback(UUID uuid, String str) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return (String) onExtraCallbackWithResult(-1797520493, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{uuid, str}, handleRemoveKey.onExtraCallbackWithResult(), 1797520494, iOnExtraCallbackWithResult);
    }

    public static SelectionRegistrarImplExternalSyntheticLambda2 onWarmupCompleted(UUID uuid) throws TextFieldSelectionManagershowSelectionToolbarViaTextToolbar1ExternalSyntheticLambda4 {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        return (SelectionRegistrarImplExternalSyntheticLambda2) onExtraCallbackWithResult(1979267620, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{uuid}, handleRemoveKey.onExtraCallbackWithResult(), -1979267618, iOnExtraCallbackWithResult);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackDefault = -7961755791276291264L;
    }

    static class IAuthTabCallback {
        public static boolean onExtraCallbackWithResult(MediaDrm mediaDrm, String str, int i2) {
            return mediaDrm.requiresSecureDecoder(str, i2);
        }

        public static void onExtraCallbackWithResult(MediaDrm mediaDrm, byte[] bArr, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
            LogSessionId logSessionIdNQ_ = selectionManagerExternalSyntheticLambda12.nQ_();
            if (logSessionIdNQ_.equals(SelectionAdjustmentKtExternalSyntheticLambda0.nC_())) {
                return;
            }
            TextFieldSelectionManagerExternalSyntheticLambda0.nU_(RecordingInputConnection_androidKt.onExtraCallbackWithResult(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdNQ_);
        }
    }
}
