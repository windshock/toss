package com.samsung.android.ssiframework.sdk;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.samsung.android.ssiframework.sdk.commonsdk.MessageExtKt;
import com.samsung.android.ssiframework.sdk.commonsdk.SsiServiceEvent;
import com.samsung.android.ssiframework.sdk.commonsdk.data.AuthCommand;
import com.samsung.android.ssiframework.sdk.commonsdk.data.AuthType;
import com.samsung.android.ssiframework.sdk.commonsdk.data.request.RequestAuthV11;
import com.samsung.android.ssiframework.sdk.exception.ErrorType;
import com.samsung.android.ssiframework.sdk.exception.SsiException;
import com.samsung.android.ssiframework.sdk.utils.c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AuthSignal {
    public final AuthType a;
    public final ConnectionHelper b;
    public final String c;
    public final String d;
    public final Messenger e;
    public final b f;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallback = {60857, 56548, 36621, 32344, 10465, 6938, 51791};
    private static long IAuthTabCallback = -8670521555574596479L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2 = (b * 4) + 97;
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i2 += i4;
            i4 = i5;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i4 + 1;
            byte b3 = bArr[i7];
            i4 = i2;
            i2 = b3;
            i5 = i7;
            i2 += i4;
            i4 = i5;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        }
    }

    private AuthSignal(AuthType authType, ConnectionHelper connectionHelper, String str, String str2, Messenger messenger) {
        this.a = authType;
        this.b = connectionHelper;
        this.c = str;
        this.d = str2;
        this.e = messenger;
        this.f = new b(this);
    }

    public static final /* synthetic */ AuthType access$getAuthType$p(AuthSignal authSignal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        AuthType authType = authSignal.a;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return authType;
    }

    public static final /* synthetic */ ConnectionHelper access$getConnectionHelper$p(AuthSignal authSignal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConnectionHelper connectionHelper = authSignal.b;
        if (i3 != 0) {
            return connectionHelper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Messenger access$getMessenger$p(AuthSignal authSignal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Messenger messenger = authSignal.e;
        int i5 = i2 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return messenger;
    }

    public final void cancel() {
        int i = 2 % 2;
        c.d("AuthSignal", "cancel " + this.c);
        this.f.a(this.c, this.d);
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ AuthSignal(AuthType authType, ConnectionHelper connectionHelper, String str, String str2, Messenger messenger, DefaultConstructorMarker defaultConstructorMarker) {
        this(authType, connectionHelper, str, str2, messenger);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.samsung.android.ssiframework.sdk.exception.SsiException */
    public final void startAuth() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        b bVar = this.f;
        String str = this.c;
        String str2 = this.d;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Messenger messengerAccess$getMessenger$p = access$getMessenger$p(bVar.a);
        AuthType authTypeAccess$getAuthType$p = access$getAuthType$p(bVar.a);
        Intrinsics.checkNotNullParameter(authTypeAccess$getAuthType$p, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(messengerAccess$getMessenger$p, "");
        Message messageObtain = Message.obtain();
        int i4 = c.a[authTypeAccess$getAuthType$p.ordinal()];
        if (i4 != 3) {
            int i5 = onWarmupCompleted + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 4) {
                throw new SsiException(ErrorType.ERROR_INVALID_EVENT, "invalid authType");
            }
        }
        Intrinsics.checkNotNull(messageObtain);
        MessageExtKt.setPayload(MessageExtKt.setReplyTo(MessageExtKt.setMessageId(MessageExtKt.setEventId(messageObtain, SsiServiceEvent.EVENT_FACE_AUTH_START.getId()), str), messengerAccess$getMessenger$p), new RequestAuthV11(authTypeAccess$getAuthType$p.getId(), AuthCommand.AUTH_START.getId(), (String) null, (String) null, (String) null, (String) null, (byte[]) null, 124, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNull(messageObtain);
        if (access$getConnectionHelper$p(bVar.a).validateCheckAndSendMessage(messageObtain)) {
            return;
        }
        Intrinsics.checkNotNullParameter("AuthSignal", "");
        Object[] objArr = new Object[1];
        g(View.MeasureSpec.getMode(0), 7 - View.MeasureSpec.getMode(0), (char) View.getDefaultSize(0, 0), objArr);
        a.a("start error", ((String) objArr[0]).intern(), "AuthSignal", "start error", "SSIFramework_SDK");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        long j;
        Object obj;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            j = 0;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16, 10973 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ImageFormat.getBitsPerPixel(0)), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 20220 - (ViewConfiguration.getTouchSlop() >> 8), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 49123), ((byte) KeyEvent.getModifierMetaStateMask()) + 45, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 49123);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 45;
                int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1495;
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, iLastIndexOf, i8, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
            j = 0;
        }
        String str = new String(cArr);
        int i9 = $11 + 33;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }
}
