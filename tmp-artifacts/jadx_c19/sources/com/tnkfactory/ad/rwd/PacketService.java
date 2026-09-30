package com.tnkfactory.ad.rwd;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.e.f;
import com.tnkfactory.ad.e.g;
import com.tnkfactory.ad.rwd.api.ConstantsUtil;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.SessionInfo;
import com.tnkfactory.ad.rwd.data.constants.Constants;
import com.tnkfactory.ad.rwd.data.constants.Gdpr;
import com.tnkfactory.ad.rwd.data.constants.RpcConfig;
import com.tnkfactory.framework.crypto.DecryptInputStream;
import com.tnkfactory.framework.crypto.EncryptOutputStream;
import com.tnkfactory.framework.crypto.RC4Cryptor;
import com.tnkfactory.framework.vo.ValueObject;
import com.tnkfactory.framework.vo.ValueObjectAssembler;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PacketService {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallbackWithResult = 7818308714137367812L;
    private static int onWarmupCompleted;
    public final SessionInfo a;
    public final boolean b;
    public final HashMap c;

    public PacketService(@NotNull SessionInfo sessionInfo, boolean z) {
        Intrinsics.checkNotNullParameter(sessionInfo, "");
        this.a = sessionInfo;
        this.b = z;
        HashMap map = new HashMap();
        ConstantsUtil constantsUtil = ConstantsUtil.INSTANCE;
        RpcConfig rpcConfig = RpcConfig.INSTANCE;
        map.put("*", a(constantsUtil.def(rpcConfig.getREQUEST_URL()), z));
        map.put(constantsUtil.def(rpcConfig.getSERVICE_TRACER()), a(constantsUtil.def(rpcConfig.getSESSION_URL()), z));
        map.put(constantsUtil.def(rpcConfig.getSERVICE_PUBLISHER()) + "/" + constantsUtil.def(rpcConfig.getMETHOD_GET_ICON_IMAGE()), a(constantsUtil.def(rpcConfig.getICON_GET_URL()), z));
        this.c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResultState invoke$default(PacketService packetService, String str, String str2, Object[] objArr, Map map, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        int i7 = i4 + 21;
        IAuthTabCallback = i7 % 128;
        Object obj2 = null;
        if (i7 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 72) != 0) {
            map = null;
        }
        ResultState resultStateInvoke = packetService.invoke(str, str2, objArr, map);
        int i8 = IAuthTabCallback + 77;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return resultStateInvoke;
        }
        obj2.hashCode();
        throw null;
    }

    public final SessionInfo getSessionInfo() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        SessionInfo sessionInfo = this.a;
        int i6 = i4 + 39;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return sessionInfo;
    }

    public final boolean getUseSsl() {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            z = this.b;
            int i5 = 5 / 0;
        } else {
            z = this.b;
        }
        int i6 = i3 + 115;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final <T> ResultState<T> invoke(@NotNull String str, @NotNull String str2, @NotNull Object[] objArr, @Nullable Map<String, ? extends Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        if (this.a.getGdpr() == Gdpr.INSTANCE.getGDPR_CONSENT_FALSE()) {
            return new ResultState.Error(new TnkError(99, "GDPR not consent", null));
        }
        ConcurrentInvokeControl concurrentInvokeControl = ConcurrentInvokeControl.INSTANCE;
        try {
            if (!(!concurrentInvokeControl.checkInvoke(str, str2))) {
                int i3 = onWarmupCompleted + 97;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return ResultState.Pass.INSTANCE;
                }
                int i4 = 11 / 0;
                return ResultState.Pass.INSTANCE;
            }
            try {
                concurrentInvokeControl.markInvoke(str, str2);
                Object objA = a(str, str2, objArr, map);
                concurrentInvokeControl.clearInvoke(str, str2);
                if (!(objA instanceof ValueObjectAssembler)) {
                    return new ResultState.Success(objA);
                }
                Map<String, ValueObject> map2 = ((ValueObjectAssembler) objA).a;
                Intrinsics.checkNotNull(map2, "");
                return new ResultState.Success(new ValueObject(map2));
            } catch (PacketException e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "서버와의 통신에 실패했습니다.";
                }
                ResultState.Error error = new ResultState.Error(new TnkError(99, message, e));
                ConcurrentInvokeControl.INSTANCE.clearInvoke(str, str2);
                return error;
            } catch (AssertionError e2) {
                String message2 = e2.getMessage();
                if (message2 == null) {
                    message2 = ConstantsUtil.INSTANCE.def("cf761799e254d922b37a765131eb75") + e2.getClass().getName();
                }
                ResultState.Error error2 = new ResultState.Error(new TnkError(99, message2, e2));
                ConcurrentInvokeControl.INSTANCE.clearInvoke(str, str2);
                return error2;
            } catch (Exception e3) {
                String message3 = e3.getMessage();
                if (message3 == null) {
                    message3 = ConstantsUtil.INSTANCE.def("cf761799e254d922b37a765131eb75") + e3.getClass().getName();
                }
                ResultState.Error error3 = new ResultState.Error(new TnkError(99, message3, e3));
                ConcurrentInvokeControl.INSTANCE.clearInvoke(str, str2);
                int i5 = IAuthTabCallback + 81;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return error3;
            }
        } catch (Throwable th) {
            ConcurrentInvokeControl.INSTANCE.clearInvoke(str, str2);
            throw th;
        }
    }

    private static void e(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 24 - TextUtils.indexOf("", "", 0), View.resolveSizeAndState(0, 0, 0) + 19627, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 59 - Color.red(0), 6383 - (ViewConfiguration.getEdgeSlop() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i7 = $10 + 57;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i9 = $11 + 93;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 59 - TextUtils.getOffsetAfter("", 0), 6431 - AndroidCharacter.getMirror('0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public final Object a(String str, String str2, Object[] objArr, Map map) throws IOException {
        int i2 = 2 % 2;
        URLConnection uRLConnectionOpenConnection = new URL(a(str, str2)).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new SSLFactory());
            } catch (Exception unused) {
            }
        }
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            RC4Cryptor rC4Cryptor = new RC4Cryptor(TnkCore.INSTANCE.getENCRYPT_KEY_BYTES());
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new EncryptOutputStream(httpURLConnection.getOutputStream(), rC4Cryptor.init()));
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            map2.put(TtmlNode.TAG_P, 1);
            map2.put("t", str);
            map2.put("m", str2);
            String applicationId = this.a.getApplicationId();
            if (map != null) {
                int i3 = IAuthTabCallback + 115;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (map.containsKey("override_app_id")) {
                    String str3 = (String) map.get("override_app_id");
                    Intrinsics.checkNotNull(str3);
                    applicationId = new Regex("-").replace(str3, "");
                }
            }
            map2.put("a", applicationId);
            map2.put("i", this.a.getUdid());
            map2.put(RVParams.URL, this.a.getDeviceId());
            map2.put("f", this.a.getAdid());
            map2.put("v", this.a.getAppVersion());
            if (this.a.getMediaUserName() != null) {
                map2.put("n", this.a.getMediaUserName());
            }
            if (this.a.getId1() != null) {
                map2.put("z", this.a.getId1());
            }
            if (this.a.getWidevineIdL1() != null) {
                map2.put("s", this.a.getWidevineIdL1());
            } else if (this.a.getWidevineIdL3() != null) {
                int i5 = onWarmupCompleted + 27;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                map2.put("s", this.a.getWidevineIdL3());
            }
            map2.put("r", this.a.getRootYn());
            map2.put("k", Constants.VERSION_NUMBER);
            if (objArr != null) {
                for (Object obj : objArr) {
                    arrayList.add(obj);
                }
            }
            g gVar = new g(deflaterOutputStream);
            gVar.writeShort(3);
            Set setKeySet = map2.keySet();
            String[] strArr = (String[]) setKeySet.toArray(new String[setKeySet.size()]);
            int length = strArr.length;
            gVar.writeShort(length);
            int i7 = 0;
            while (i7 < length) {
                int i8 = IAuthTabCallback + 103;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    gVar.writeUTF(strArr[i7]);
                    gVar.writeObject(map2.get(strArr[i7]));
                    i7 += 16;
                } else {
                    gVar.writeUTF(strArr[i7]);
                    gVar.writeObject(map2.get(strArr[i7]));
                    i7++;
                }
            }
            int size = arrayList.size();
            gVar.writeShort(size);
            for (int i9 = 0; i9 < size; i9++) {
                gVar.writeObject(arrayList.get(i9));
            }
            deflaterOutputStream.close();
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new DecryptInputStream(httpURLConnection.getInputStream(), rC4Cryptor.init()));
            HashMap map3 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            f fVar = new f(inflaterInputStream);
            int unsignedShort = fVar.readUnsignedShort();
            if (unsignedShort != 3) {
                throw new IOException("Version mismatched. " + unsignedShort);
            }
            int i10 = onWarmupCompleted + 119;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            int unsignedShort2 = fVar.readUnsignedShort();
            int i12 = 0;
            while (i12 < unsignedShort2) {
                int i13 = onWarmupCompleted + 89;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    map3.put(fVar.readUTF(), fVar.readObject());
                    i12 += 83;
                } else {
                    map3.put(fVar.readUTF(), fVar.readObject());
                    i12++;
                }
            }
            int unsignedShort3 = fVar.readUnsignedShort();
            for (int i14 = 0; i14 < unsignedShort3; i14++) {
                arrayList2.add(fVar.readObject());
            }
            inflaterInputStream.close();
            Object obj2 = map3.get(TtmlNode.TAG_P);
            if (((obj2 == null || !(obj2 instanceof Number)) ? 0 : ((Number) obj2).intValue()) == 11) {
                throw new PacketException((arrayList2.size() > 0 ? arrayList2.get(0) : null).toString());
            }
            Object obj3 = arrayList2.size() > 0 ? arrayList2.get(0) : null;
            Intrinsics.checkNotNullExpressionValue(obj3, "");
            return obj3;
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static String a(String str, boolean z) throws Throwable {
        int i2 = 2 % 2;
        if (z) {
            int i3 = onWarmupCompleted + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (StringsKt.startsWith$default(str, "http://", false, 2, (Object) null)) {
                String strSubstring = str.substring(7);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                e(new char[]{12379, 35094, 17125, 7088, 54532, 44700, 26618, 8491}, ImageFormat.getBitsPerPixel(0) + 47442, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(strSubstring);
                str = sb.toString();
            }
        }
        int i5 = IAuthTabCallback + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String a(String str, String str2) {
        int i2 = 2 % 2;
        String str3 = (String) this.c.get(str + "/" + str2);
        if (str3 == null) {
            int i3 = onWarmupCompleted + 27;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                str3 = (String) this.c.get(str);
                int i4 = 2 / 0;
            } else {
                str3 = (String) this.c.get(str);
            }
        }
        if (str3 != null) {
            return str3;
        }
        int i5 = IAuthTabCallback + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return (String) this.c.get("*");
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
