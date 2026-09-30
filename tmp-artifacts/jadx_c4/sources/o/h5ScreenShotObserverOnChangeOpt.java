package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o._string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class h5ScreenShotObserverOnChangeOpt {
    public static final onExtraCallback Companion;
    private static short[] IAuthTabCallback;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (s3 * 2) + 115;
        int i4 = 4 - (s2 * 3);
        int i5 = 1 - (s * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 = (-i3) + i6;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i3;
            i3 = bArr[i4];
            i3 = (-i3) + i6;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static {
        onTransact = 0;
        onExtraCallbackWithResult();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallbackDefault + 3;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ h5ScreenShotObserverOnChangeOpt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract String onWarmupCompleted();

    private h5ScreenShotObserverOnChangeOpt() {
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {73, 121, -48, -56};
        private static final int $$b = 194;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onExtraCallback = 7798559133331975163L;
        private static int onExtraCallbackWithResult = 936575519;
        private static char onWarmupCompleted = 27643;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Type inference failed for: r7v1, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, byte b2, short s) {
            int i;
            int i2;
            byte[] bArr = $$a;
            int i3 = s * 4;
            ?? r7 = b2 + 109;
            int i4 = 3 - (b * 2);
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            if (bArr == null) {
                byte b3 = r7;
                int i6 = 0;
                int i7 = i4;
                int i8 = i4 + b3;
                i = i6;
                int i9 = i7;
                i2 = i8;
                i4 = i9;
                bArr2[i] = (byte) i2;
                int i10 = i4 + 1;
                i6 = i + 1;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                b3 = bArr[i10];
                int i11 = i2;
                i7 = i10;
                i4 = i11;
                int i82 = i4 + b3;
                i = i6;
                int i92 = i7;
                i2 = i82;
                i4 = i92;
                bArr2[i] = (byte) i2;
                int i102 = i4 + 1;
                i6 = i + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                i2 = r7;
                bArr2[i] = (byte) i2;
                int i1022 = i4 + 1;
                i6 = i + 1;
                if (i == i5) {
                }
            }
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
            int i7 = ~i;
            int i8 = ~(i7 | i2);
            int i9 = i4 | i8;
            int i10 = ~i4;
            int i11 = i8 | (~(i7 | i10));
            int i12 = (~(i7 | i4)) | (~(i10 | i));
            int i13 = i + i4 + i6 + (513088896 * i5) + ((-1342203445) * i3);
            int i14 = i13 * i13;
            int i15 = ((i * (-363642324)) - 614971735) + (i4 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + ((-363641803) * i6) + ((-2127225984) * i5) + ((-1080704249) * i3) + (i14 * (-1523187712));
            if ((665020156 * i) + 661520384 + (1303681286 * i4) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i6) + ((-771751936) * i5) + (1382285312 * i3) + ((-350355456) * i14) + (i15 * i15 * (-227409920)) == 1) {
                return onExtraCallbackWithResult(objArr);
            }
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            String str3 = (String) objArr[3];
            int i16 = 2 % 2;
            if (str == null) {
                return null;
            }
            if (str2 != null && (!StringsKt.isBlank(str2))) {
                Object[] objArr2 = new Object[1];
                a((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0), new char[]{22709, 9055, 28033, 12154, 33248, 47204, 33352, 26260}, new char[]{0, 0, 0, 0}, new char[]{18943, 36553, 50480, 52734}, objArr2);
                if (!StringsKt.contains$default(str, ((String) objArr2[0]).intern(), false, 2, (Object) null)) {
                    if (str2 == null) {
                        str2 = "undefined";
                    }
                    Object[] objArr3 = new Object[1];
                    a((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ViewConfiguration.getTapTimeout() >> 16, new char[]{22709, 9055, 28033, 12154, 33248, 47204, 33352, 26260}, new char[]{0, 0, 0, 0}, new char[]{18943, 36553, 50480, 52734}, objArr3);
                    convertAnyToMap.IAuthTabCallback(str, ((String) objArr3[0]).intern(), str2);
                }
            }
            if (str3 == null || !(!StringsKt.isBlank(str3)) || StringsKt.contains$default(str, "service_referrer", false, 2, (Object) null)) {
                return str;
            }
            if (str3 == null) {
                int i17 = onNavigationEvent + 91;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                str3 = "undefined";
            }
            convertAnyToMap.IAuthTabCallback(str, "service_referrer", str3);
            int i19 = onNavigationEvent + 41;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
            return str;
        }

        private onExtraCallback() {
        }

        public final boolean onExtraCallbackWithResult(@NotNull Uri uri) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(uri, "");
                uri.getQueryParameter("direct");
                throw null;
            }
            Intrinsics.checkNotNullParameter(uri, "");
            String queryParameter = uri.getQueryParameter("direct");
            if (queryParameter == null) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 45;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 10 / 0;
                }
                int i6 = i3 + 73;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                queryParameter = "true";
            }
            return Boolean.parseBoolean(queryParameter);
        }

        public final String IAuthTabCallback(@Nullable Intent intent) {
            int i = 2 % 2;
            if (intent == null) {
                return "";
            }
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                intent.getStringExtra("from");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String stringExtra = intent.getStringExtra("from");
            if (stringExtra == null) {
                return "";
            }
            int i3 = IAuthTabCallback + 105;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 11 / 0;
            }
            return stringExtra;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
        
            if (r5 != null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
        
            if (r5 != null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String onNavigationEvent(@Nullable Intent intent) throws Throwable {
            String stringExtra;
            Object obj;
            String stringExtra2;
            int i = 2 % 2;
            if (intent != null) {
                int i2 = IAuthTabCallback + 121;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a((char) (ViewConfiguration.getKeyRepeatTimeout() + 15), (-1) - TextUtils.lastIndexOf("", 'g', 0, 1), new char[]{22709, 9055, 28033, 12154, 33248, 47204, 33352, 26260}, new char[]{0, 0, 0, 0}, new char[]{18943, 36553, 50480, 52734}, objArr);
                    stringExtra2 = intent.getStringExtra(((String) objArr[0]).intern());
                } else {
                    Object[] objArr2 = new Object[1];
                    a((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{22709, 9055, 28033, 12154, 33248, 47204, 33352, 26260}, new char[]{0, 0, 0, 0}, new char[]{18943, 36553, 50480, 52734}, objArr2);
                    stringExtra2 = intent.getStringExtra(((String) objArr2[0]).intern());
                }
            }
            if (intent != null) {
                int i3 = IAuthTabCallback + 31;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    a((char) TextUtils.getCapsMode("", 0, 1), (-1890737992) / (ViewConfiguration.getKeyRepeatDelay() >>> 97), new char[]{45644, 26706, 24494, 51822, 20709, 40372, 42884}, new char[]{0, 0, 0, 0}, new char[]{47356, 19872, 10127, 2216}, objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1890737992, new char[]{45644, 26706, 24494, 51822, 20709, 40372, 42884}, new char[]{0, 0, 0, 0}, new char[]{47356, 19872, 10127, 2216}, objArr4);
                    obj = objArr4[0];
                }
                stringExtra = intent.getStringExtra(((String) obj).intern());
                int i4 = onNavigationEvent + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                stringExtra = null;
            }
            return stringExtra == null ? "undefined" : stringExtra;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
            Uri uri = (Uri) objArr[1];
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String queryParameter = null;
            if (uri != null) {
                Object[] objArr2 = new Object[1];
                a((char) View.resolveSize(0, 0), TextUtils.indexOf("", "", 0), new char[]{22709, 9055, 28033, 12154, 33248, 47204, 33352, 26260}, new char[]{0, 0, 0, 0}, new char[]{18943, 36553, 50480, 52734}, objArr2);
                String queryParameter2 = uri.getQueryParameter(((String) objArr2[0]).intern());
                if (queryParameter2 != null) {
                    int i4 = onNavigationEvent + 9;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return queryParameter2;
                    }
                    throw null;
                }
            }
            if (uri != null) {
                Object[] objArr3 = new Object[1];
                a((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) - 1890737992, new char[]{45644, 26706, 24494, 51822, 20709, 40372, 42884}, new char[]{0, 0, 0, 0}, new char[]{47356, 19872, 10127, 2216}, objArr3);
                queryParameter = uri.getQueryParameter(((String) objArr3[0]).intern());
            }
            if (queryParameter == null) {
                int i5 = IAuthTabCallback + 87;
                onNavigationEvent = i5 % 128;
                queryParameter = "undefined";
                if (i5 % 2 == 0) {
                    int i6 = 78 / 0;
                }
            }
            return queryParameter;
        }

        public final String onExtraCallback(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
            Object[] objArr = new Object[1];
            a((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{22709, 9055, 28033, 12154, 33248, 47204, 33352, 26260}, new char[]{0, 0, 0, 0}, new char[]{18943, 36553, 50480, 52734}, objArr);
            String str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback(((String) objArr[0]).intern());
            if (str != null) {
                return str;
            }
            int i4 = IAuthTabCallback + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            a((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getCapsMode("", 0, 0) - 1890737992, new char[]{45644, 26706, 24494, 51822, 20709, 40372, 42884}, new char[]{0, 0, 0, 0}, new char[]{47356, 19872, 10127, 2216}, objArr2);
            String str2 = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback(((String) objArr2[0]).intern());
            if (str2 != null) {
                return str2;
            }
            int i6 = IAuthTabCallback + 15;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return "undefined";
        }

        public final boolean onNavigationEvent(@Nullable Uri uri) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean z = Boolean.parseBoolean(uri != null ? uri.getQueryParameter("from_intro") : null);
            int i4 = onNavigationEvent + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final boolean asBinder(@NotNull Uri uri) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(uri, "");
                uri.getQueryParameter("opaque");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(uri, "");
            String queryParameter = uri.getQueryParameter("opaque");
            if (queryParameter == null) {
                queryParameter = "false";
                int i3 = onNavigationEvent + 69;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            return Boolean.parseBoolean(queryParameter);
        }

        public final boolean IAuthTabCallback(@NotNull Uri uri) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(uri, "");
            String queryParameter = uri.getQueryParameter("completed_activation");
            Object obj = null;
            if (queryParameter == null) {
                int i4 = IAuthTabCallback + 91;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                queryParameter = "false";
            }
            boolean z = Boolean.parseBoolean(queryParameter);
            int i5 = IAuthTabCallback + 43;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean onWarmupCompleted(@Nullable Uri uri) {
            String queryParameter;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (uri == null || (queryParameter = uri.getQueryParameter("scoreChange")) == null) {
                queryParameter = "false";
                int i3 = onNavigationEvent + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            return Boolean.parseBoolean(queryParameter);
        }

        public final String onExtraCallback(@NotNull String str) {
            String string;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                string = Uri.parse(str).buildUpon().appendQueryParameter("completed_activation", "true").build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i3 = 40 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                string = Uri.parse(str).buildUpon().appendQueryParameter("completed_activation", "true").build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            int i4 = onNavigationEvent + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }

        public final boolean asInterface(@NotNull Uri uri) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(uri, "");
            if (!h5ScreenShotObserverOnChangeOpt.onWarmupCompleted(access100.onNavigationEvent, uri, null, 2, null) && !h5ScreenShotObserverOnChangeOpt.onWarmupCompleted(access000.onExtraCallback, uri, null, 2, null)) {
                int i2 = onNavigationEvent + 63;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0 ? !h5ScreenShotObserverOnChangeOpt.onWarmupCompleted(IAuthTabCallback_Parcel.onExtraCallback, uri, null, 2, null) : !h5ScreenShotObserverOnChangeOpt.onWarmupCompleted(IAuthTabCallback_Parcel.onExtraCallback, uri, null, 5, null)) {
                    int i3 = IAuthTabCallback + 11;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0 ? !h5ScreenShotObserverOnChangeOpt.onWarmupCompleted(getInterfaceDescriptor.onNavigationEvent, uri, null, 2, null) : !h5ScreenShotObserverOnChangeOpt.onWarmupCompleted(getInterfaceDescriptor.onNavigationEvent, uri, null, 3, null)) {
                        int i4 = IAuthTabCallback + 85;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                }
            }
            int i6 = onNavigationEvent + 81;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public final boolean IAuthTabCallbackStub(@Nullable Uri uri) throws Throwable {
            String path;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String scheme = uri != null ? uri.getScheme() : null;
            Object[] objArr = new Object[1];
            a((char) Gravity.getAbsoluteGravity(0, 0), (-1002889964) - (Process.myTid() >> 22), new char[]{21499, 62977, 28930, 47380, 11721, 13748, 4922, 14925, 65165}, new char[]{0, 0, 0, 0}, new char[]{5144, 14621, 15812, 21903}, objArr);
            boolean zAreEqual = Intrinsics.areEqual(scheme, ((String) objArr[0]).intern());
            boolean zAreEqual2 = Intrinsics.areEqual(uri != null ? uri.getAuthority() : null, "credit");
            boolean z = (uri == null || (path = uri.getPath()) == null || !StringsKt.startsWith$default(path, "/plus", false, 2, (Object) null)) ? false : true;
            if (zAreEqual && zAreEqual2) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 55;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (z) {
                    int i6 = i3 + 117;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallback(@Nullable Uri uri) throws Throwable {
            boolean z;
            int i = 2 % 2;
            String scheme = uri != null ? uri.getScheme() : null;
            Object[] objArr = new Object[1];
            a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-1002889964) + (ViewConfiguration.getTouchSlop() >> 8), new char[]{21499, 62977, 28930, 47380, 11721, 13748, 4922, 14925, 65165}, new char[]{0, 0, 0, 0}, new char[]{5144, 14621, 15812, 21903}, objArr);
            boolean zAreEqual = Intrinsics.areEqual(scheme, ((String) objArr[0]).intern());
            boolean zAreEqual2 = Intrinsics.areEqual(uri != null ? uri.getAuthority() : null, "credit");
            if (uri != null) {
                int i2 = IAuthTabCallback + 103;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    uri.getPath();
                    throw null;
                }
                String path = uri.getPath();
                z = path != null && StringsKt.startsWith$default(path, "/plus/free-trial", false, 2, (Object) null);
            }
            if (zAreEqual && zAreEqual2 && z) {
                return true;
            }
            int i3 = IAuthTabCallback + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i4 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i5 = $11 + 37;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char size = (char) View.MeasureSpec.getSize(i4);
                        int iIndexOf = 43 - TextUtils.indexOf("", "", i4, i4);
                        int i7 = (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 1451;
                        byte b = (byte) i4;
                        byte b2 = (byte) (b + 1);
                        String str$$c = $$c(b, b2, (byte) (b2 - 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, iIndexOf, i7, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(i4) + 49124), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1493 - (ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 23972), 49 - TextUtils.lastIndexOf("", '0', 0, 0), 22939 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45847), 29 - Color.green(0), Color.green(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i8 = $10 + 5;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final String onNavigationEvent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            return (String) onExtraCallback(new Object[]{this, str, str2, str3}, -1848427700, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), 1848427700, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }

        public final String onTransact(@Nullable Uri uri) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            return (String) onExtraCallback(new Object[]{this, uri}, 1816239997, iOnExtraCallbackWithResult, lt.40.onExtraCallbackWithResult(), -1816239996, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
    }

    public static final class ICustomTabsCallbackStubProxy extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 1;
        private static int asInterface;
        private static long onExtraCallback;
        public static final ICustomTabsCallbackStubProxy onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 25;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 47;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(!(obj instanceof ICustomTabsCallbackStubProxy))) {
                return true;
            }
            int i8 = i4 + 63;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 75;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return -2024167336;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 13;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 3;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return "ScoreRaiseWaiting";
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 11;
            $11 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                    objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                    return;
                }
                int i5 = $10 + 105;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 45812), 83 - TextUtils.indexOf((CharSequence) "", '0'), Process.getGidForName("") + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, 8808 - (ViewConfiguration.getTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    i3 = $11 + 81;
                    $10 = i3 % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        private ICustomTabsCallbackStubProxy() {
            super(null);
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b(new char[]{59078, 59061, 23204, 1764, 12869, 33356, 35423, 38582, 38496, 38873, 6932, 1868, 1821, 26435, 43128, 29732, 46297, 62567, 14534, 58675, 9727, 17749, 18896, 21969, 53891, 51860, 57016, 51946, 16913, 23550, 28486, 15282, 62334}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            onExtraCallbackWithResult = new ICustomTabsCallbackStubProxy();
            Object[] objArr2 = new Object[1];
            b(new char[]{59078, 59061, 23204, 1764, 12869, 33356, 35423, 38582, 38496, 38873, 6932, 1868, 1821, 26435, 43128, 29732, 46297, 62567, 14534, 58675, 9727, 17749, 18896, 21969, 53891, 51860, 57016, 51946, 16913, 23550, 28486, 15282, 62334}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            onWarmupCompleted = ((String) objArr2[0]).intern();
            int i = IAuthTabCallback + 105;
            asBinder = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 115;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            String str = onWarmupCompleted;
            int i5 = i2 + 71;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void IAuthTabCallback() {
            onExtraCallback = 2168164257195960121L;
        }
    }

    public static final class onExtraCallbackWithResult extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder;
        private static long onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        public static final onExtraCallbackWithResult onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackStub + 23;
                asBinder = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            int i3 = IAuthTabCallbackStub + 29;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 77;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return 1499762737;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 77;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 59;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return "Consulting";
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 73;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $10 + 33;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 84, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.green(0)), 18 - ((byte) KeyEvent.getModifierMetaStateMask()), 8808 - Gravity.getAbsoluteGravity(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        private onExtraCallbackWithResult() {
            super(null);
        }

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            b(new char[]{35999, 47000, 19283, 15707, 36076, 19362, 46013, 51667, 32209, 23143, 41702, 56065, 28308, 26981, 36970, 59921, 24392, 26601, 34660, 62878, 18438, 30419, 63218, 34021, 15068, 1421, 58858, 38455, 11163, 5211, 60220, 41312, 5212}, (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr);
            IAuthTabCallback = ((String) objArr[0]).intern();
            onWarmupCompleted = new onExtraCallbackWithResult();
            Object[] objArr2 = new Object[1];
            b(new char[]{35999, 47000, 19283, 15707, 36076, 19362, 46013, 51667, 32209, 23143, 41702, 56065, 28308, 26981, 36970, 59921, 24392, 26601, 34660, 62878, 18438, 30419, 63218, 34021, 15068, 1421, 58858, 38455, 11163, 5211, 60220, 41312, 5212}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = onExtraCallbackWithResult + 105;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 73;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = onNavigationEvent;
            int i4 = i3 + 61;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static void onNavigationEvent() {
            onExtraCallback = 4898747230367549251L;
        }
    }

    public static final class onUnminimized extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder = 1;
        private static int asInterface;
        public static final onUnminimized onExtraCallback;
        private static long onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 95;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj || !(!(obj instanceof onUnminimized))) {
                return true;
            }
            int i5 = i2 + 81;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 107;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return 1591260683;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface + 61;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return "ScoreReport";
            }
            int i3 = 27 / 0;
            return "ScoreReport";
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i3 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 45812), 84 - View.MeasureSpec.makeMeasureSpec(0, 0), View.resolveSizeAndState(0, 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 14185), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20, 8808 - TextUtils.getOffsetBefore("", 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i4 = $10 + 73;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        private onUnminimized() {
            super(null);
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b(new char[]{24664, 19813, 56347, 24619, 19297, 56152, 61691, 35292, 14602, 41593, 22980, 20714, 53867, 1495, 740, 15958, 27483, 60607, 60302, 34109, 1201, 47065, 19748, 27722, 56731, 7906, 13913, 52092, 30389, 57375, 40750, 37513, 4055, 19263, 16415}, KeyEvent.getMaxKeyCode() >> 16, objArr);
            IAuthTabCallback = ((String) objArr[0]).intern();
            onExtraCallback = new onUnminimized();
            Object[] objArr2 = new Object[1];
            b(new char[]{24664, 19813, 56347, 24619, 19297, 56152, 61691, 35292, 14602, 41593, 22980, 20714, 53867, 1495, 740, 15958, 27483, 60607, 60302, 34109, 1201, 47065, 19748, 27722, 56731, 7906, 13913, 52092, 30389, 57375, 40750, 37513, 4055, 19263, 16415}, '0' - AndroidCharacter.getMirror('0'), objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackDefault + 45;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 25;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = onNavigationEvent;
            int i4 = i3 + 55;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
            }
            return str;
        }

        static void IAuthTabCallback() {
            onExtraCallbackWithResult = 5985484168016096580L;
        }
    }

    public static final class ICustomTabsCallbackDefault extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final ICustomTabsCallbackDefault IAuthTabCallback;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 1;
        private static int onExtraCallback;
        public static final String onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static int onTransact;
        private static long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asBinder + 25;
                onTransact = i2 % 128;
                return i2 % 2 == 0;
            }
            if (obj instanceof ICustomTabsCallbackDefault) {
                return true;
            }
            int i3 = asBinder + 115;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 39;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return 1495541646;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 5;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return "ScoreRaiseMain";
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 125;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), KeyEvent.getDeadChar(0, 0) + 24, (Process.myTid() >> 22) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + (onWarmupCompleted - 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 58 - TextUtils.lastIndexOf("", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 23 - TextUtils.lastIndexOf("", '0', 0), 19628 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 60 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 6431 - AndroidCharacter.getMirror('0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 59 - Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2);
            int i6 = $10 + 107;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        private ICustomTabsCallbackDefault() {
            super(null);
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b(new char[]{21942, 41629, 48111, 45095, 35075, 34384, 40612, 38797, 60638, 58730, 61992, 51973, 50106, 55550, 53718, 11778, 10108, 15436, 13504, 3552, 6688, 4893, 26728, 24747}, 63276 - TextUtils.lastIndexOf("", '0', 0), objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            IAuthTabCallback = new ICustomTabsCallbackDefault();
            Object[] objArr2 = new Object[1];
            b(new char[]{21942, 41629, 48111, 45095, 35075, 34384, 40612, 38797, 60638, 58730, 61992, 51973, 50106, 55550, 53718, 11778, 10108, 15436, 13504, 3552, 6688, 4893, 26728, 24747}, 63276 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackStub + 91;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 61;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            String str = onNavigationEvent;
            int i5 = i3 + 1;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ String IAuthTabCallback(ICustomTabsCallbackDefault iCustomTabsCallbackDefault, String str, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = asBinder;
            int i4 = i3 + 45;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 2) != 0) {
                int i6 = i3 + 53;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            return iCustomTabsCallbackDefault.onNavigationEvent(str, z);
        }

        public final String onNavigationEvent(@NotNull String str, boolean z) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 99;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = new Object[1];
            b(new char[]{21942, 41629, 48111, 45095, 35075, 34384, 40612, 38797, 60638, 58730, 61992, 51973, 50106, 55550, 53718, 11778, 10108, 15436, 13504, 3552, 6688, 4893, 26728, 24747}, 63277 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
            Object[] objArr2 = new Object[1];
            b(new char[]{21943, 36963, 56869, 1257, 17083, 35192, 63282, 15842}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 50627, objArr2);
            String string = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), str).appendQueryParameter("score_raise_activation", String.valueOf(!z)).appendQueryParameter("startDirect", String.valueOf(z)).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i4 = asBinder + 11;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }

        private final String IAuthTabCallback(String str, boolean z) {
            int i = 2 % 2;
            int i2 = asBinder + 1;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                String string = Uri.parse(str).buildUpon().appendQueryParameter("isRetry", String.valueOf(z)).build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            Intrinsics.checkNotNullExpressionValue(Uri.parse(str).buildUpon().appendQueryParameter("isRetry", String.valueOf(z)).build().toString(), "");
            throw null;
        }

        public final String IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Object[] objArr = new Object[1];
            b(new char[]{21942, 43879, 43035, 43301, 44779, 44930, 44192, 41559, 41742, 41072, 41356, 42711, 42940, 42327, 47715, 47933, 47297, 47587, 48884, 48194, 48492, 45569, 46038, 45287, 45465, 46943, 46177}, View.MeasureSpec.makeMeasureSpec(0, 0) + 65239, objArr);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
            Object[] objArr2 = new Object[1];
            b(new char[]{21943, 36963, 56869, 1257, 17083, 35192, 63282, 15842}, 50627 - TextUtils.getOffsetAfter("", 0), objArr2);
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), "credit_improve").appendQueryParameter("industries", str).appendQueryParameter("orgListTitle", str2);
            if (!StringsKt.isBlank(str3)) {
                builderAppendQueryParameter.appendQueryParameter("orgListDesc", str3);
                int i4 = onTransact + 39;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                }
            }
            if (!StringsKt.isBlank(str5)) {
                builderAppendQueryParameter.appendQueryParameter("orgListAvailableOrgCodes", str5);
            }
            Object[] objArr3 = new Object[1];
            b(new char[]{21943, 41533, 47771, 45947, 35779, 33713, 38920, 37114, 59768, 57650, 63883}, ((Process.getThreadPriority(0) + 20) >> 6) + 63389, objArr3);
            String string = builderAppendQueryParameter.appendQueryParameter(((String) objArr3[0]).intern(), IAuthTabCallback(str4, z)).appendQueryParameter("tossOneUserEnabled", "false").build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public final boolean IAuthTabCallback(@Nullable Intent intent) {
            String stringExtra;
            int i = 2 % 2;
            if (intent != null) {
                int i2 = asBinder + 117;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                stringExtra = intent.getStringExtra("isRetry");
            } else {
                int i4 = onTransact + 65;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                stringExtra = null;
            }
            return Boolean.parseBoolean(stringExtra);
        }

        public final boolean onWarmupCompleted(@Nullable Intent intent) {
            int i = 2 % 2;
            int i2 = onTransact + 39;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            String stringExtra = null;
            if (intent != null) {
                int i5 = i3 + 47;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    intent.getStringExtra("startDirect");
                    stringExtra.hashCode();
                    throw null;
                }
                stringExtra = intent.getStringExtra("startDirect");
            }
            boolean z = Boolean.parseBoolean(stringExtra);
            int i6 = asBinder + 59;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 1 / 0;
            }
            return z;
        }

        public final boolean IAuthTabCallback(@NotNull Uri uri) {
            int i = 2 % 2;
            int i2 = onTransact + 53;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(uri, "");
                return Boolean.parseBoolean(uri.getQueryParameter("startDirect"));
            }
            Intrinsics.checkNotNullParameter(uri, "");
            Boolean.parseBoolean(uri.getQueryParameter("startDirect"));
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void IAuthTabCallback() {
            onWarmupCompleted = 3068020525942690034L;
        }
    }

    public static final class access000 extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface = 0;
        public static final access000 onExtraCallback;
        public static final String onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static int onTransact = 1;
        private static long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asInterface + 23;
                onTransact = i2 % 128;
                return i2 % 2 != 0;
            }
            if (obj instanceof access000) {
                return true;
            }
            int i3 = onTransact + 45;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 13;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return 632627463;
            }
            int i3 = 41 / 0;
            return 632627463;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface + 17;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 39;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return "PlusGiftIntro";
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            long j;
            Throwable cause;
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (true) {
                j = 0;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    break;
                }
                int i3 = $10 + 39;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, 19627 - View.MeasureSpec.makeMeasureSpec(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), View.combineMeasuredStates(0, 0) + 59, View.MeasureSpec.makeMeasureSpec(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        int i6 = $10 + 125;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getTouchSlop() >> 8) + 59, ExpandableListView.getPackedPositionGroup(j) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            String str = new String(cArr2);
            int i8 = $11 + 45;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
        }

        private access000() {
            super(null);
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{34069, 27344, 23184, 19018, 14872, 11229, 7067, 2880, 64269, 59527, 55511, 51240, 47137, 43507, 39337, 35183, 31039, 28385, 24319, 20079, 15926, 12268, 8151, 4044, 65353, 61188, 56526, 52355, 48157, 44056, 40402, 36239, 32116, 27946}, 61379 - KeyEvent.normalizeMetaState(0), objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            onExtraCallback = new access000();
            Object[] objArr2 = new Object[1];
            b(new char[]{34069, 27344, 23184, 19018, 14872, 11229, 7067, 2880, 64269, 59527, 55511, 51240, 47137, 43507, 39337, 35183, 31039, 28385, 24319, 20079, 15926, 12268, 8151, 4044, 65353, 61188, 56526, 52355, 48157, 44056, 40402, 36239, 32116, 27946}, 61379 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackDefault + 51;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 23;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            String str = onNavigationEvent;
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return str;
        }

        static void onExtraCallback() {
            onWarmupCompleted = -8320446855212629935L;
        }
    }

    public static final class access100 extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 1;
        public static final String onExtraCallback;
        private static final String onExtraCallbackWithResult;
        public static final access100 onNavigationEvent;
        private static int onTransact;
        private static long onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.h5ScreenShotObserverOnChangeOpt.access100) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r2 = r2 + 27;
            o.h5ScreenShotObserverOnChangeOpt.access100.onTransact = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            if ((r2 % 2) == 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r6 = 8 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 87;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                int i4 = 51 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 107;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return 1235694033;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asBinder + 95;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 47;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return "Intro";
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0) + 25, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 60 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 6383 - (Process.myPid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i4 = $10 + 41;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $11 + 11;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private access100() {
            super(null);
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{26534, 40457, 38135, 35659, 33027, 34796, 48716, 46137, 43758, 41246, 42848, 56761, 54362, 51762, 49294, 51030, 64812, 62360, 59928, 57399, 59023, 7548, 4897, 2453}, 63913 - ExpandableListView.getPackedPositionType(0L), objArr);
            onExtraCallback = ((String) objArr[0]).intern();
            onNavigationEvent = new access100();
            Object[] objArr2 = new Object[1];
            b(new char[]{26534, 40457, 38135, 35659, 33027, 34796, 48716, 46137, 43758, 41246, 42848, 56761, 54362, 51762, 49294, 51030, 64812, 62360, 59928, 57399, 59023, 7548, 4897, 2453}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63913, objArr2);
            onExtraCallbackWithResult = ((String) objArr2[0]).intern();
            int i = IAuthTabCallback + 61;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 1;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = onExtraCallbackWithResult;
            int i5 = i2 + 65;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Object[] objArr = new Object[1];
            b(new char[]{26534, 40457, 38135, 35659, 33027, 34796, 48716, 46137, 43758, 41246, 42848, 56761, 54362, 51762, 49294, 51030, 64812, 62360, 59928, 57399, 59023, 7548, 4897, 2453}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 63913, objArr);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
            Object[] objArr2 = new Object[1];
            b(new char[]{26535, 16307, 55221, 28601, 1963, 57256, 30626, 4018}, 22530 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), str).appendQueryParameter("service_referrer", "credit").appendQueryParameter("url_path", (String) zzcl.onNavigationEvent(2117170377, new Object[]{zzcl.onNavigationEvent(str2)}, -2117170376, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback()));
            Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
            String string = IAuthTabCallback(builderAppendQueryParameter, "credit_redirect", str2).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i4 = onTransact + 23;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return string;
            }
            throw null;
        }

        static void onExtraCallback() {
            onWarmupCompleted = -1806743877368487198L;
        }
    }

    public static final class readTypedObject extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final readTypedObject IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static int asBinder = 1;
        private static int asInterface = 1;
        public static final String onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(obj instanceof readTypedObject)) {
                    return false;
                }
                int i2 = IAuthTabCallbackDefault + 13;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i3 = asBinder;
            int i4 = i3 + 33;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 83;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 37 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 115;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return 1488450238;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 23;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 77;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return "PlusGiftReceive";
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            Throwable cause;
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $10 + 113;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                obj = null;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    break;
                }
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 59 - Gravity.getAbsoluteGravity(0, 0), (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $11 + 85;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $10 + 43;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 59, 6382 - TextUtils.indexOf((CharSequence) "", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 59, 6431 - AndroidCharacter.getMirror('0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }

        private readTypedObject() {
            super(null);
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{58726, 32073, 54583, 11531, 34243, 7596, 30092, 52345, 9262, 48222, 5280, 27897, 50330, 24434, 46926, 3862, 26604, 65496, 22488, 44654, 1613, 40509, 63200, 20117, 42666, 14717, 37209, 59698, 16710, 55746, 12734, 35201, 57424, 30773, 53265, 10475}, 38954 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            onExtraCallback = ((String) objArr[0]).intern();
            IAuthTabCallback = new readTypedObject();
            Object[] objArr2 = new Object[1];
            b(new char[]{58726, 32073, 54583, 11531, 34243, 7596, 30092, 52345, 9262, 48222, 5280, 27897, 50330, 24434, 46926, 3862, 26604, 65496, 22488, 44654, 1613, 40509, 63200, 20117, 42666, 14717, 37209, 59698, 16710, 55746, 12734, 35201, 57424, 30773, 53265, 10475}, 38952 - Process.getGidForName(""), objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = onExtraCallbackWithResult + 85;
            asInterface = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 35;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            String str = onNavigationEvent;
            if (i3 != 0) {
                int i4 = 95 / 0;
            }
            return str;
        }

        static void onExtraCallback() {
            onWarmupCompleted = 6424494530503598114L;
        }
    }

    public static final class IAuthTabCallback extends h5ScreenShotObserverOnChangeOpt {
        private static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static char[] onExtraCallback;
        public static final String onExtraCallbackWithResult;
        public static final IAuthTabCallback onNavigationEvent;
        private static long onWarmupCompleted;
        private static final byte[] $$d = {69, -50, 81, 75};
        private static final int $$e = 181;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int asBinder = 1;
        private static int IAuthTabCallbackStub = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$f(int i, short s, byte b) {
            int i2;
            int i3 = i * 2;
            byte[] bArr = $$d;
            int i4 = 3 - (s * 3);
            int i5 = (b * 3) + 97;
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                int i8 = i6;
                i2 = i4;
                i4 += i8;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i2++;
                i8 = bArr[i2];
                i4 += i8;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                }
            } else {
                i2 = i4;
                i4 = i5;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asInterface + 57;
                asBinder = i2 % 128;
                return i2 % 2 != 0;
            }
            if (obj instanceof IAuthTabCallback) {
                int i3 = asBinder + 27;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 65 / 0;
                }
                return true;
            }
            int i5 = asInterface;
            int i6 = i5 + 71;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 109;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return -499664500;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface + 27;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 67;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
            return "Detail";
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
            int i3;
            Throwable cause;
            int i4 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (true) {
                i3 = -1401950695;
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i) {
                    break;
                }
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i2 + i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "", 0)), 17 - TextUtils.indexOf("", "", 0, 0), TextUtils.getTrimmedLength("") + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46134), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49123), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
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
            char[] cArr = new char[i];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i6 = $10 + 31;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
                int i8 = $10 + 73;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 44 - Drawable.resolveOpacity(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i3 = -1401950695;
            }
            objArr[0] = new String(cArr);
        }

        private IAuthTabCallback() {
            super(null);
        }

        static {
            IAuthTabCallbackDefault = 1;
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(25 - View.resolveSize(0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), Drawable.resolveOpacity(0, 0), objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            onNavigationEvent = new IAuthTabCallback();
            Object[] objArr2 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0') + 26, (char) TextUtils.getOffsetBefore("", 0), Gravity.getAbsoluteGravity(0, 0), objArr2);
            IAuthTabCallback = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackStub + 121;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 3;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onNavigationEvent(@Nullable Intent intent) throws Throwable {
            int i = 2 % 2;
            if (intent != null) {
                Object[] objArr = new Object[1];
                b(Drawable.resolveOpacity(0, 0) + 4, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 25 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
                if (stringExtra != null) {
                    int i2 = asInterface + 77;
                    asBinder = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 39 / 0;
                    }
                    return stringExtra;
                }
            }
            int i4 = asInterface + 57;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return "";
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        
            return "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
        
            if (r8 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0073, code lost:
        
            if (r8 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
        
            r8 = o.h5ScreenShotObserverOnChangeOpt.IAuthTabCallback.asInterface + 51;
            o.h5ScreenShotObserverOnChangeOpt.IAuthTabCallback.asBinder = r8 % 128;
            r8 = r8 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String onExtraCallback(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) throws Throwable {
            String str;
            int i = 2 % 2;
            int i2 = asInterface + 13;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
                Object[] objArr = new Object[1];
                b(3 / (ViewConfiguration.getMinimumFlingVelocity() >>> 14), (char) ('w' << AndroidCharacter.getMirror('6')), ViewConfiguration.getScrollDefaultDelay() + 92, objArr);
                str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback(((String) objArr[0]).intern());
            } else {
                Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
                Object[] objArr2 = new Object[1];
                b((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, (char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25, objArr2);
                str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback(((String) objArr2[0]).intern());
            }
        }

        public final boolean onExtraCallbackWithResult(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = asInterface + 65;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
                return Boolean.parseBoolean((String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("refresh"));
            }
            Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
            int i3 = 43 / 0;
            return Boolean.parseBoolean((String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("refresh"));
        }

        public final boolean onNavigationEvent(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
            boolean z = Boolean.parseBoolean((String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("highlight_recent_card"));
            int i4 = asBinder + 77;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        static void onExtraCallback() {
            onExtraCallback = new char[]{60839, 3929, 10324, 17753, 26182, 33656, 48235, 55663, 64103, 5974, 12363, 11603, 19991, 27454, 33825, 41272, 49725, 65496, 6283, 13784, 22225, 29688, 27877, 35317, 43768, 60832, 3925, 10324, 17753};
            onWarmupCompleted = -6656216977269256404L;
        }
    }

    public static final class getInterfaceDescriptor extends h5ScreenShotObserverOnChangeOpt {
        public static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static char[] onExtraCallback;
        private static final String onExtraCallbackWithResult;
        public static final getInterfaceDescriptor onNavigationEvent;
        private static long onWarmupCompleted;
        private static final byte[] $$d = {61, -49, -70, 93};
        private static final int $$e = 107;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private static int asBinder = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$f(int i, byte b, short s) {
            int i2;
            int i3 = b * 4;
            byte[] bArr = $$d;
            int i4 = (s * 3) + 4;
            int i5 = (i * 2) + 97;
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            int i7 = -1;
            if (bArr == null) {
                int i8 = i6;
                i2 = i4;
                i4 += i8;
                i2++;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i8 = bArr[i2];
                i4 += i8;
                i2++;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                }
            } else {
                i4 = i5;
                i2 = i4;
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 83;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this != obj) {
                return obj instanceof getInterfaceDescriptor;
            }
            int i4 = i3 + 97;
            asInterface = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 95;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return -1585999127;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface + 17;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return "KcbSurvey";
            }
            throw null;
        }

        private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i4 = $10 + 95;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i2 + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 59697), 'A' - AndroidCharacter.getMirror('0'), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 31 - ((Process.getThreadPriority(0) + 20) >> 6), Color.blue(0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, ExpandableListView.getPackedPositionGroup(0L) + 1494, -1657859959, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
                int i7 = $11 + 1;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 43 - ExpandableListView.getPackedPositionChild(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 1494, -1657859959, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    throw null;
                }
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 49123), (-16777172) - Color.rgb(0, 0, 0), 1494 - View.MeasureSpec.getMode(0), -1657859959, false, $$f(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            String str = new String(cArr);
            int i8 = $11 + 85;
            $10 = i8 % 128;
            if (i8 % 2 == 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private getInterfaceDescriptor() {
            super(null);
        }

        static {
            IAuthTabCallbackDefault = 1;
            onNavigationEvent();
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getTouchSlop() >> 8) + 29, (char) (21305 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), KeyEvent.getMaxKeyCode() >> 16, objArr);
            IAuthTabCallback = ((String) objArr[0]).intern();
            onNavigationEvent = new getInterfaceDescriptor();
            Object[] objArr2 = new Object[1];
            b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 21305), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            onExtraCallbackWithResult = ((String) objArr2[0]).intern();
            int i = asBinder + 93;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 47;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            String str = onExtraCallbackWithResult;
            int i5 = i3 + 41;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static void onNavigationEvent() {
            onExtraCallback = new char[]{48798, 46333, 43607, 41383, 38667, 36192, 32988, 63069, 60854, 58202, 55600, 52373, 49714, 14782, 12046, 9570, 6356, 3628, 1496, 31737, 29034, 25798, 23148, 20877, 18400, 48450, 45273, 42543, 40344};
            onWarmupCompleted = -6664507140693694543L;
        }
    }

    public final String onNavigationEvent(@NotNull List<Pair<String, String>> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Uri.Builder builderBuildUpon = Uri.parse(onWarmupCompleted()).buildUpon();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = IAuthTabCallbackStub + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object next = it.next();
            if (!StringsKt.isBlank((CharSequence) ((Pair) next).getSecond())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i4 = IAuthTabCallbackStub + 111;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                Pair pair = (Pair) it2.next();
                builderBuildUpon.appendQueryParameter((String) pair.getFirst(), (String) pair.getSecond());
                int i5 = 80 / 0;
            } else {
                Pair pair2 = (Pair) it2.next();
                builderBuildUpon.appendQueryParameter((String) pair2.getFirst(), (String) pair2.getSecond());
            }
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class asBinder extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int access100 = 1;
        private static char asBinder;
        private static char asInterface;
        private static char onExtraCallback;
        public static final asBinder onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static int onTransact;
        private static final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 17;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj || (obj instanceof asBinder)) {
                return true;
            }
            int i4 = i2 + 97;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access100 + 11;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return 865600336;
            }
            int i3 = 97 / 0;
            return 865600336;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact + 77;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return "HighInterestComparison";
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i4 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i5 = $10 + 33;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
                    i2 = 1;
                } else {
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    i2 = i4;
                }
                int i6 = 58224;
                while (i2 < 16) {
                    int i7 = $11 + 9;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                    int i10 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(asBinder);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[i4] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i11 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12433;
                            Class[] clsArr = new Class[4];
                            clsArr[i4] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, i11, i12, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 9 - Process.getGidForName(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i2++;
                        int i13 = $11 + 1;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr3 = cArr4;
                        i4 = 0;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i4 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private asBinder() {
            super(null);
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{13310, 60104, 63298, 26064, 28353, 31655, 58776, 46944, 15252, 61668, 39634, 47262, 52732, 48812, 14922, 58191, 41279, 61779, 39511, 61858, 56846, 61341, 1847, 22843, 27113, 36289, 44508, 52462, 26640, 64506, 52020, 17626}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, objArr);
            IAuthTabCallback = ((String) objArr[0]).intern();
            onExtraCallbackWithResult = new asBinder();
            Object[] objArr2 = new Object[1];
            b(new char[]{13310, 60104, 63298, 26064, 28353, 31655, 58776, 46944, 15252, 61668, 39634, 47262, 52732, 48812, 14922, 58191, 41279, 61779, 39511, 61858, 56846, 61341, 1847, 22843, 27113, 36289, 44508, 52462, 26640, 64506, 52020, 17626}, 30 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            onWarmupCompleted = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackStub + 25;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            String str;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 71;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                str = onWarmupCompleted;
                int i4 = 41 / 0;
            } else {
                str = onWarmupCompleted;
            }
            int i5 = i2 + 85;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void onExtraCallback() {
            onExtraCallback = (char) 60401;
            onNavigationEvent = (char) 13378;
            asInterface = (char) 48999;
            asBinder = (char) 46838;
        }
    }

    public static final class onTransact extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 0;
        private static char IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int IAuthTabCallbackStubProxy = 1;
        private static int asBinder;
        private static int asInterface;
        public static final String onExtraCallback;
        public static final onTransact onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static char onTransact;
        private static final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 95;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj || !(!(obj instanceof onTransact))) {
                return true;
            }
            int i4 = i3 + 125;
            int i5 = i4 % 128;
            asBinder = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 15;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 76 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 117;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return -1667770782;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 17;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
            }
            int i5 = i2 + 73;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                return "FullScreenBanner";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i4 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i5 = $11 + 43;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (true) {
                Object obj = null;
                if (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent >= cArr.length) {
                    break;
                }
                int i7 = $10 + 85;
                $11 = i7 % 128;
                int i8 = 58224;
                if (i7 % i2 == 0) {
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
                } else {
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                }
                int i9 = i4;
                while (i9 < 16) {
                    int i10 = $11 + 51;
                    $10 = i10 % 128;
                    int i11 = i10 % i2;
                    char c = cArr3[1];
                    char c2 = cArr3[i4];
                    char[] cArr4 = cArr3;
                    int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                    int i13 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onTransact);
                        objArr2[i2] = Integer.valueOf(i13);
                        objArr2[1] = Integer.valueOf(i12);
                        objArr2[0] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
                            int i14 = 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[i2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iLastIndexOf, i14, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                        cArr4[1] = cCharValue;
                        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                        Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
                        cArr3 = cArr4;
                        defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                        i2 = 2;
                        i4 = 0;
                        obj = null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - View.getDefaultSize(0, 0)), View.combineMeasuredStates(0, 0) + 14, View.getDefaultSize(0, 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
                cArr3 = cArr5;
                i2 = 2;
                i4 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i15 = $10 + 13;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        private onTransact() {
            super(null);
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{21122, 29001, 57004, 57602, 24055, 23088, 10195, 46374, 33220, 9390, 3037, 59475, 34293, 46952, 58289, 6951, 30795, 50688, 39762, 20146, 13577, 23397, 8266, 56949, 34293, 46952, 9242, 22506, 46434, 17989, 63151, 17346}, TextUtils.lastIndexOf("", '0', 0, 0) + 33, objArr);
            onExtraCallback = ((String) objArr[0]).intern();
            onExtraCallbackWithResult = new onTransact();
            Object[] objArr2 = new Object[1];
            b(new char[]{21122, 29001, 57004, 57602, 24055, 23088, 10195, 46374, 33220, 9390, 3037, 59475, 34293, 46952, 58289, 6951, 30795, 50688, 39762, 20146, 13577, 23397, 8266, 56949, 34293, 46952, 9242, 22506, 46434, 17989, 63151, 17346}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31, objArr2);
            onWarmupCompleted = ((String) objArr2[0]).intern();
            int i = asInterface + 63;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = onWarmupCompleted;
            int i5 = i3 + 41;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
            boolean z;
            boolean z2;
            Map map;
            int i;
            Object obj;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStubProxy + 37;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                z = true;
                z2 = false;
                map = null;
                i = 5;
                obj = null;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                z = false;
                z2 = true;
                map = null;
                i = 9;
                obj = null;
            }
            String string = Uri.parse(h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(this, z, str, z2, map, i, obj)).buildUpon().appendQueryParameter("slot", str2).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        static void onExtraCallback() {
            onNavigationEvent = (char) 29892;
            IAuthTabCallback = (char) 42243;
            IAuthTabCallbackDefault = (char) 13743;
            onTransact = (char) 4426;
        }
    }

    public static final class onWarmupCompleted extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder;
        private static int asInterface;
        public static final onWarmupCompleted onExtraCallback;
        private static char onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static char onTransact;
        private static char onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 57;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 17;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(!(obj instanceof onWarmupCompleted))) {
                return true;
            }
            int i7 = i2 + 39;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 21;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 87 / 0;
            }
            return 1772313682;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asBinder + 77;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return "ActivationOpaque";
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i4 = $11 + 43;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 11;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onTransact);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                            int mode = 12434 - View.MeasureSpec.getMode(i3);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, scrollBarSize2, mode, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 14, 19902 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i12 = $11 + 87;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str;
        }

        private onWarmupCompleted() {
            super(null);
        }

        static {
            IAuthTabCallback();
            onExtraCallback = new onWarmupCompleted();
            Object[] objArr = new Object[1];
            b(new char[]{56153, 6387, 39605, 39285, 22630, 35996, 64628, 14743, 38247, 32870, 28377, 48559, 27256, 37040, 57570, 52301, 37003, 31230, 16202, 29515, 13284, 27877, 53612, 29034, 28037, 62366, 30908, 37015, 37821, 30307}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            int i = asInterface + 125;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 22 / 0;
            }
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 83;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = onNavigationEvent;
            int i5 = i2 + 89;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return str;
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "im.toss.features.credit.ui.activation.CreditActivationSchemeOpaqueActivity");
            intent.putExtra("activation_redirect", str);
            Object[] objArr = new Object[1];
            b(new char[]{59266, 4347, 6274, 20647, 14542, 33858, 33643, 20029}, 8 - TextUtils.getTrimmedLength(""), objArr);
            intent.putExtra(((String) objArr[0]).intern(), str2);
            int i2 = IAuthTabCallbackStub + 101;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return intent;
            }
            throw null;
        }

        public final String onExtraCallbackWithResult(@Nullable Intent intent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 65;
            asBinder = i3 % 128;
            String stringExtra = null;
            if (i3 % 2 != 0) {
                stringExtra.hashCode();
                throw null;
            }
            if (intent != null) {
                stringExtra = intent.getStringExtra("activation_redirect");
            } else {
                int i4 = i2 + 25;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
            int i6 = asBinder + 81;
            int i7 = i6 % 128;
            IAuthTabCallbackStub = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 1;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return "";
        }

        static void IAuthTabCallback() {
            onWarmupCompleted = (char) 54852;
            onExtraCallbackWithResult = (char) 47811;
            IAuthTabCallback = (char) 62408;
            onTransact = (char) 41011;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if ((r9 & 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        r2 = r2 + 63;
        o.h5ScreenShotObserverOnChangeOpt.IAuthTabCallbackStub = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if ((r9 & 4) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if ((r9 & 8) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        r8 = o.access8100.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        return r4.onExtraCallback(r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if ((r9 & 1) == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ String onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt h5screenshotobserveronchangeopt, boolean z, String str, boolean z2, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 11;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    public static final class IAuthTabCallbackDefault extends h5ScreenShotObserverOnChangeOpt {
        public static final String IAuthTabCallback;
        private static int IAuthTabCallbackStub;
        private static char asBinder;
        private static final String asInterface;
        private static int getInterfaceDescriptor;
        public static final IAuthTabCallbackDefault onExtraCallback;
        public static final String onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static long onTransact;
        public static final String onWarmupCompleted;
        private static final byte[] $$d = {2, 77, 55, -86};
        private static final int $$e = 46;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback_Parcel = 0;
        private static int access000 = 1;
        private static int IAuthTabCallbackDefault = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$f(int i, byte b, byte b2) {
            int i2;
            int i3;
            int i4 = b2 + 109;
            byte[] bArr = $$d;
            int i5 = 3 - (b * 4);
            int i6 = 1 - (i * 3);
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i6;
                int i8 = i5;
                i3 = 0;
                int i9 = (-i5) + i7;
                i2 = i3;
                int i10 = i8;
                i4 = i9;
                i5 = i10;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                    return new String(bArr2, 0);
                }
                int i11 = i5 + 1;
                int i12 = i4;
                i8 = i11;
                i5 = bArr[i11];
                i7 = i12;
                int i92 = (-i5) + i7;
                i2 = i3;
                int i102 = i8;
                i4 = i92;
                i5 = i102;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof IAuthTabCallbackDefault) {
                int i2 = access000 + 79;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = access000 + 69;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access000 + 5;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return -237262630;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 57;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return "Home";
        }

        private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i5 = $11 + 81;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i7 = $10 + 115;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 43, 1450 - ImageFormat.getBitsPerPixel(0), 228868077, false, $$f(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 49124), MotionEvent.axisFromString("") + 45, 1493 - TextUtils.indexOf((CharSequence) "", '0'), 1533236389, false, $$f(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.getOffsetBefore("", 0)), 50 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22939 - View.getDefaultSize(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        i2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45848), 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        private IAuthTabCallbackDefault() {
            super(null);
        }

        static {
            getInterfaceDescriptor = 1;
            onExtraCallback();
            Object[] objArr = new Object[1];
            b((-1149251754) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), new char[]{50667, 20874, 64820, 64111, 43192, 29831, 38263, 11796, 17986, 22375, 60592, 41401, 18426, 41184, 6994, 7070, 40588, 1488, 9266, 46177, 38500, 26509, 16129}, new char[]{21764, 32719, 49339, 624}, new char[]{0, 0, 0, 0}, objArr);
            onWarmupCompleted = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (22760 - TextUtils.indexOf((CharSequence) "", '0')), new char[]{16570, 54131, 20372, 18505, 28329, 19773, 21488, 32026, 25722, 1486, 29764, 39703, 53828, 56704, 10181, 20864, 50742, 14347, 57785, 52371, 31507, 26809, 20341, 62372, 38629, 16807}, new char[]{43486, 39794, 59763, 44632}, new char[]{0, 0, 0, 0}, objArr2);
            onExtraCallbackWithResult = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(TextUtils.getOffsetBefore("", 0), (char) (55952 - Drawable.resolveOpacity(0, 0)), new char[]{31007, 15870, 4493, 32739, 39537, 14571, 2720, 39752, 9892, 19908, 56154, 'C', 39532, 24621, 27504, 49673, 42851, 7738, 56748, 20778, 61486, 61298, 15405, 29419, 28840, 63991, 24629, 23284}, new char[]{8776, 13425, 36996, 38362}, new char[]{0, 0, 0, 0}, objArr3);
            onNavigationEvent = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 1471), new char[]{24529, 36334, 30393, 626, 30393, 63482, 64315, 6829, 9827, 51172, 14920, 38440, 18927, 42989, 821, 40139, 42915, 57759}, new char[]{49159, 19321, 48929, 24069}, new char[]{0, 0, 0, 0}, objArr4);
            IAuthTabCallback = ((String) objArr4[0]).intern();
            onExtraCallback = new IAuthTabCallbackDefault();
            Object[] objArr5 = new Object[1];
            b((-1149251756) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{50667, 20874, 64820, 64111, 43192, 29831, 38263, 11796, 17986, 22375, 60592, 41401, 18426, 41184, 6994, 7070, 40588, 1488, 9266, 46177, 38500, 26509, 16129}, new char[]{21764, 32719, 49339, 624}, new char[]{0, 0, 0, 0}, objArr5);
            asInterface = ((String) objArr5[0]).intern();
            int i = IAuthTabCallbackDefault + 115;
            getInterfaceDescriptor = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 15;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            String str = asInterface;
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            return str;
        }

        public static /* synthetic */ String onExtraCallbackWithResult(IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, String str, boolean z2, String str2, boolean z3, int i, Object obj) {
            boolean z4;
            String str3;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 123;
            int i4 = i3 % 128;
            access000 = i4;
            if (i3 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) {
                z4 = z;
            } else {
                int i5 = i4 + 37;
                IAuthTabCallback_Parcel = i5 % 128;
                z4 = i5 % 2 == 0;
            }
            String str4 = (i & 2) != 0 ? "" : str;
            boolean z5 = (i & 4) != 0 ? false : z2;
            if ((i & 8) != 0) {
                int i6 = i4 + 7;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                str3 = null;
            } else {
                str3 = str2;
            }
            return iAuthTabCallbackDefault.onNavigationEvent(z4, str4, z5, str3, (i & 16) == 0 ? z3 : false);
        }

        public final String onNavigationEvent(boolean z, @NotNull String str, boolean z2, @Nullable String str2, boolean z3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 105;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Uri.Builder builderAppendQueryParameter = Uri.parse(h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(this, z, str, false, null, 12, null)).buildUpon().appendQueryParameter("refresh", String.valueOf(z2)).appendQueryParameter("from_intro", String.valueOf(z3));
            Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
            String string = IAuthTabCallback(builderAppendQueryParameter, "credit_redirect", str2).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i4 = IAuthTabCallback_Parcel + 37;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean IAuthTabCallback(@Nullable Intent intent) {
            String stringExtra;
            int i = 2 % 2;
            int i2 = access000;
            int i3 = i2 + 119;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            if (intent != null) {
                int i5 = i2 + 3;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                stringExtra = intent.getStringExtra("refresh");
                if (stringExtra == null) {
                    stringExtra = "false";
                }
            }
            return Boolean.parseBoolean(stringExtra);
        }

        public final String onExtraCallbackWithResult(@Nullable String str) {
            int i = 2 % 2;
            if (str != null) {
                int i2 = IAuthTabCallback_Parcel + 73;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                Uri uri = Uri.parse(str);
                if (uri != null) {
                    int i4 = access000 + 13;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    String queryParameter = uri.getQueryParameter("credit_redirect");
                    if (i5 != 0) {
                        int i6 = 15 / 0;
                    }
                    int i7 = access000 + 73;
                    IAuthTabCallback_Parcel = i7 % 128;
                    if (i7 % 2 == 0) {
                        return queryParameter;
                    }
                    throw null;
                }
            }
            return null;
        }

        public final String IAuthTabCallback(@Nullable TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
            int i = 2 % 2;
            Object obj = null;
            if (textLinkScopeExternalSyntheticLambda7 == null) {
                return null;
            }
            int i2 = IAuthTabCallback_Parcel + 49;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("credit_redirect");
            int i4 = access000 + 125;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final String onNavigationEvent(@Nullable Intent intent) {
            int i = 2 % 2;
            if (intent != null) {
                int i2 = IAuthTabCallback_Parcel + 17;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                String stringExtra = intent.getStringExtra("credit_redirect");
                if (stringExtra != null) {
                    int i4 = access000 + 55;
                    IAuthTabCallback_Parcel = i4 % 128;
                    if (i4 % 2 == 0) {
                        return stringExtra;
                    }
                    throw null;
                }
            }
            int i5 = access000 + 33;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 18 / 0;
            }
            return "";
        }

        public final String onExtraCallbackWithResult(@Nullable TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
            int i = 2 % 2;
            if (textLinkScopeExternalSyntheticLambda7 == null) {
                return null;
            }
            int i2 = access000 + 5;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) textLinkScopeExternalSyntheticLambda7.IAuthTabCallback("credit_redirect");
            int i4 = access000 + 11;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        public boolean onExtraCallback(@Nullable String str) throws Throwable {
            int i = 2 % 2;
            if (str != null) {
                int i2 = access000 + 83;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                String strOnWarmupCompleted = onExtraCallback.onWarmupCompleted();
                Object[] objArr = new Object[1];
                b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (55951 - ExpandableListView.getPackedPositionChild(0L)), new char[]{31007, 15870, 4493, 32739, 39537, 14571, 2720, 39752, 9892, 19908, 56154, 'C', 39532, 24621, 27504, 49673, 42851, 7738, 56748, 20778, 61486, 61298, 15405, 29419, 28840, 63991, 24629, 23284}, new char[]{8776, 13425, 36996, 38362}, new char[]{0, 0, 0, 0}, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                b(AndroidCharacter.getMirror('0') - '0', (char) (22760 - ExpandableListView.getPackedPositionChild(0L)), new char[]{16570, 54131, 20372, 18505, 28329, 19773, 21488, 32026, 25722, 1486, 29764, 39703, 53828, 56704, 10181, 20864, 50742, 14347, 57785, 52371, 31507, 26809, 20341, 62372, 38629, 16807}, new char[]{43486, 39794, 59763, 44632}, new char[]{0, 0, 0, 0}, objArr2);
                String strIntern2 = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "") + 1471), new char[]{24529, 36334, 30393, 626, 30393, 63482, 64315, 6829, 9827, 51172, 14920, 38440, 18927, 42989, 821, 40139, 42915, 57759}, new char[]{49159, 19321, 48929, 24069}, new char[]{0, 0, 0, 0}, objArr3);
                List listListOf = CollectionsKt.listOf(new String[]{strOnWarmupCompleted, strIntern, strIntern2, ((String) objArr3[0]).intern()});
                if (listListOf instanceof Collection) {
                    int i4 = IAuthTabCallback_Parcel + 27;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    if (listListOf.isEmpty()) {
                        int i6 = access000 + 103;
                        IAuthTabCallback_Parcel = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                }
                Iterator it = listListOf.iterator();
                while (!(!it.hasNext())) {
                    if (!(!onExtraCallback.onExtraCallback(Uri.parse(str), (String) it.next()))) {
                        int i8 = access000;
                        int i9 = i8 + 125;
                        IAuthTabCallback_Parcel = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = i8 + 77;
                        IAuthTabCallback_Parcel = i11 % 128;
                        int i12 = i11 % 2;
                        return true;
                    }
                }
            }
            int i13 = IAuthTabCallback_Parcel + 95;
            access000 = i13 % 128;
            if (i13 % 2 != 0) {
                return false;
            }
            throw null;
        }

        static void onExtraCallback() {
            onTransact = 7798559133331975163L;
            IAuthTabCallbackStub = -1776194565;
            asBinder = (char) 61596;
        }
    }

    public static final class IAuthTabCallbackStub extends h5ScreenShotObserverOnChangeOpt {
        private static int IAuthTabCallback;
        private static char IAuthTabCallbackStub;
        public static final IAuthTabCallbackStub onExtraCallback;
        public static final String onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static int onTransact;
        private static long onWarmupCompleted;
        private static final byte[] $$d = {2, 77, 55, -86};
        private static final int $$e = 59;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int asBinder = 1;
        private static int IAuthTabCallbackDefault = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$f(int i, byte b, byte b2) {
            int i2;
            int i3 = i + 109;
            int i4 = 4 - (b * 2);
            byte[] bArr = $$d;
            int i5 = b2 * 4;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i4;
                i3 = i6;
                int i8 = 0;
                i3 += -i4;
                i4 = i7 + 1;
                i2 = i8;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i9 = i2 + 1;
                i7 = i4;
                i4 = bArr[i4];
                i8 = i9;
                i3 += -i4;
                i4 = i7 + 1;
                i2 = i8;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 17;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 59;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackStub)) {
                return false;
            }
            int i8 = i4 + 17;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 77;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 27;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return 1059482297;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface + 77;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return "History";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i3 = $10 + 51;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int iIndexOf = 42 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int threadPriority = 1451 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b = (byte) ($$e & 5);
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, iIndexOf, threadPriority, 228868077, false, $$f(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - Process.getGidForName("")), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1494 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1533236389, false, $$f(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 23972), 51 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.getCapsMode("", 0, 0)), View.resolveSize(0, 0) + 29, 12577 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStub ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            String str = new String(cArr6);
            int i5 = $11 + 125;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        private IAuthTabCallbackStub() {
            super(null);
        }

        static {
            onTransact = 1;
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (ExpandableListView.getPackedPositionGroup(0L) + 49815), new char[]{16470, 13011, 31509, 63914, 40647, 40210, 55011, 36175, 44795, 50224, 40666, 40173, 36101, 5073, 15212, 34937, 21237, 41920, 24160, 35920, 29761, 26299, 26900, 59442, 57200, 57988}, new char[]{17075, 1923, 38706, 31938}, new char[]{0, 0, 0, 0}, objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            onExtraCallback = new IAuthTabCallbackStub();
            Object[] objArr2 = new Object[1];
            b(View.resolveSize(0, 0), (char) (Color.red(0) + 49815), new char[]{16470, 13011, 31509, 63914, 40647, 40210, 55011, 36175, 44795, 50224, 40666, 40173, 36101, 5073, 15212, 34937, 21237, 41920, 24160, 35920, 29761, 26299, 26900, 59442, 57200, 57988}, new char[]{17075, 1923, 38706, 31938}, new char[]{0, 0, 0, 0}, objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackDefault + 27;
            onTransact = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 49;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            String str = onNavigationEvent;
            if (i3 != 0) {
                int i4 = 62 / 0;
            }
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x010b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onExtraCallback(@Nullable String str, @NotNull String str2) throws Throwable {
            String str3;
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str2, "");
            Object obj = null;
            if (str == null) {
                int i2 = asBinder + 111;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                str3 = "";
            } else {
                str3 = str;
            }
            Uri uri = Uri.parse(str3);
            Intrinsics.checkNotNull(uri);
            Object[] objArr = new Object[1];
            b(Drawable.resolveOpacity(0, 0), (char) (49815 - (ViewConfiguration.getTouchSlop() >> 8)), new char[]{16470, 13011, 31509, 63914, 40647, 40210, 55011, 36175, 44795, 50224, 40666, 40173, 36101, 5073, 15212, 34937, 21237, 41920, 24160, 35920, 29761, 26299, 26900, 59442, 57200, 57988}, new char[]{17075, 1923, 38706, 31938}, new char[]{0, 0, 0, 0}, objArr);
            boolean zOnExtraCallback = onExtraCallback(uri, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            b((-494615478) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), new char[]{9932, 61809, 4546, 63540, 61997, 46453, 37447, 37381, 35830, 44460, 28857, 36876, 16399, 38930, 42553, 29744, 31208, 27770, 32151, 54681, 34467, 36070, 30316, 39610, 25091}, new char[]{19062, 33988, 24802, 27594}, new char[]{0, 0, 0, 0}, objArr2);
            if (!onExtraCallback(uri, ((String) objArr2[0]).intern())) {
                z = false;
            } else {
                List listListOf = CollectionsKt.listOf(new String[]{"changes", "inquiry"});
                b((-1) - Process.getGidForName(""), (char) (View.getDefaultSize(0, 0) + 58510), new char[]{39999, 2446, 51276, 1536}, new char[]{25482, 26464, 36504, 56548}, new char[]{0, 0, 0, 0}, new Object[1]);
                if (!(!CollectionsKt.contains(listListOf, uri.getQueryParameter(((String) r12[0]).intern())))) {
                    z = true;
                }
            }
            if (!zOnExtraCallback) {
                int i3 = asBinder + 111;
                int i4 = i3 % 128;
                asInterface = i4;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z) {
                    z2 = true;
                } else {
                    int i5 = i4 + 13;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    z2 = false;
                }
            }
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str2, uri.getQueryParameter("bureau"));
            if (z2) {
                int i7 = asInterface + 11;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                if (zOnExtraCallbackWithResult) {
                    return true;
                }
            }
            return false;
        }

        private final boolean onExtraCallbackWithResult(String str, String str2) {
            int i = 2 % 2;
            int i2 = asInterface + 13;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.equals(str, "kcb", true)) {
                boolean zEquals = StringsKt.equals(str2, str, true);
                int i4 = asInterface + 21;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return zEquals;
            }
            int i6 = asInterface + 7;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                return str2 == null || StringsKt.isBlank(str2) || StringsKt.equals(str2, str, true);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void onExtraCallback() {
            onWarmupCompleted = 7798559133331975163L;
            IAuthTabCallback = 307237679;
            IAuthTabCallbackStub = (char) 27643;
        }
    }

    public static final class writeTypedObject extends h5ScreenShotObserverOnChangeOpt {
        private static int IAuthTabCallback;
        private static final String onExtraCallback;
        public static final String onExtraCallbackWithResult;
        public static final writeTypedObject onNavigationEvent;
        private static int onWarmupCompleted;
        private static final byte[] $$d = {79, -25, -14, 102};
        private static final int $$e = 223;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$f(int i, short s, byte b) {
            int i2;
            int i3;
            int i4 = 105 - (b * 3);
            int i5 = i + 4;
            byte[] bArr = $$d;
            int i6 = (s * 4) + 1;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i7 = i6;
                i3 = 0;
                i4 = (-i4) + i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                    return new String(bArr2, 0);
                }
                i5++;
                i7 = i4;
                i4 = bArr[i5];
                i4 = (-i4) + i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i6) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof writeTypedObject) {
                int i2 = onTransact + 121;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = IAuthTabCallbackDefault + 69;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 57;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 69;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return -675155285;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 115;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 93;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return "PlusGiftUnavailable";
        }

        private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i5 = $10 + 83;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, (ViewConfiguration.getTouchSlop() >> 8) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.resolveSize(0, 0) + 55, 2167 - Color.red(0), 1298711993, false, $$f(b, b2, b2), new Class[]{Object.class, Object.class});
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
            if (i > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                    int i8 = $10 + 75;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback + i2) >> 1];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12842), 55 - TextUtils.getCapsMode("", 0, 0), 2168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1298711993, false, $$f(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback4 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12843), ExpandableListView.getPackedPositionType(0L) + 55, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2167, 1298711993, false, $$f(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    int i9 = $11 + 125;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private writeTypedObject() {
            super(null);
        }

        static {
            onWarmupCompleted = 0;
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b((Process.myPid() >> 22) + 12, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41, new char[]{65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 2, '\t', 65535, 65534, '\t', 6, 65534, 19, 65534, 11, 18, 65484, 17, 3, 6, 4, 65484, 16, 18, '\t', '\r', 65484, 17, 6, 1, 2, 15, 0}, 231 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            onNavigationEvent = new writeTypedObject();
            Object[] objArr2 = new Object[1];
            b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11, 39 - Process.getGidForName(""), new char[]{65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 2, '\t', 65535, 65534, '\t', 6, 65534, 19, 65534, 11, 18, 65484, 17, 3, 6, 4, 65484, 16, 18, '\t', '\r', 65484, 17, 6, 1, 2, 15, 0}, (ViewConfiguration.getScrollBarSize() >> 8) + 231, true, objArr2);
            onExtraCallback = ((String) objArr2[0]).intern();
            int i = asInterface + 19;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 69;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            String str = onExtraCallback;
            int i5 = i2 + 49;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            return str;
        }

        static void IAuthTabCallback() {
            IAuthTabCallback = 478309037;
        }
    }

    public final String onExtraCallback(boolean z, @NotNull String str, boolean z2, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Uri.Builder builderBuildUpon = Uri.parse(onWarmupCompleted()).buildUpon();
        Object[] objArr = new Object[1];
        a((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-404118022) - View.resolveSizeAndState(0, 0, 0), (-208953950) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) - 48, objArr);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr[0]).intern(), str).appendQueryParameter("direct", String.valueOf(z));
        if (z2) {
            builderAppendQueryParameter.appendQueryParameter("completed_activation", "true");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            int i2 = asBinder + 41;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (entry.getValue() != null) {
                int i4 = IAuthTabCallbackStub + 5;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter((String) entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri.Builder IAuthTabCallback(@NotNull Uri.Builder builder, @NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(builder, "");
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 89 / 0;
            if (str2 != null) {
                int i4 = IAuthTabCallbackStub + 31;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 73 / 0;
                    if (str2.length() != 0) {
                        builder.appendQueryParameter(str, str2);
                        int i6 = asBinder + 121;
                        IAuthTabCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                    }
                } else if (str2.length() != 0) {
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(builder, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (str2 != null) {
            }
        }
        int i8 = IAuthTabCallbackStub + 45;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 0 / 0;
        }
        return builder;
    }

    public static /* synthetic */ boolean onWarmupCompleted(h5ScreenShotObserverOnChangeOpt h5screenshotobserveronchangeopt, Uri uri, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isMatch");
        }
        if ((i & 2) != 0) {
            str = h5screenshotobserveronchangeopt.onWarmupCompleted();
            int i3 = asBinder + 117;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        boolean zOnExtraCallback = h5screenshotobserveronchangeopt.onExtraCallback(uri, str);
        int i5 = IAuthTabCallbackStub + 75;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return zOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public boolean onExtraCallback(@NotNull Uri uri, @NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.areEqual(Uri.parse(str).getScheme(), uri.getScheme());
            throw null;
        }
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Uri uri2 = Uri.parse(str);
        if (!Intrinsics.areEqual(uri2.getScheme(), uri.getScheme())) {
            return false;
        }
        if (Intrinsics.areEqual(uri2.getAuthority(), uri.getAuthority())) {
            return !(Intrinsics.areEqual(uri2.getPathSegments(), uri.getPathSegments()) ^ true);
        }
        int i3 = IAuthTabCallbackStub + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public static final class extraCallbackWithResult extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private static int[] onExtraCallback = null;
        public static final String onExtraCallbackWithResult;
        public static final extraCallbackWithResult onNavigationEvent;
        private static int onTransact = 1;
        private static final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 73;
            int i4 = i3 % 128;
            onTransact = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 99;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (obj instanceof extraCallbackWithResult) {
                return true;
            }
            int i8 = i2 + 45;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 5;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 103;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return 1325132247;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 79;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
            }
            return "PlusIntro";
        }

        private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = onExtraCallback;
            float f = 0.0f;
            long j = 0;
            int i3 = -1469660336;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 72 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i4++;
                        f = 0.0f;
                        j = 0;
                        i3 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onExtraCallback;
            int i5 = 16;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i6 = 0;
                while (i6 < length3) {
                    int i7 = $11 + 81;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr5[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> i5), 72 - TextUtils.getCapsMode("", 0, 0), 8848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr6[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i6 >>= 1;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i6])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 72, TextUtils.getOffsetBefore("", 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i6] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i6++;
                    }
                    i5 = 16;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i8 = $10 + 15;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i10 = 0;
                for (int i11 = 16; i10 < i11; i11 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 22253), ((byte) KeyEvent.getModifierMetaStateMask()) + 40, 10302 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10++;
                }
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 4033), (ViewConfiguration.getScrollBarSize() >> 8) + 78, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2, 0, i);
            int i15 = $10 + 9;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            objArr[0] = str;
        }

        private extraCallbackWithResult() {
            super(null);
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(new int[]{-1082204420, 123397650, -772747535, 68696370, 1099238938, -769953066, 836853321, 1737966019, 569313695, 1726973227, 1963855426, 1537369394, 1808239589, -141719036, -1572723404, 493933030}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            onNavigationEvent = new extraCallbackWithResult();
            Object[] objArr2 = new Object[1];
            b(new int[]{-1082204420, 123397650, -772747535, 68696370, 1099238938, -769953066, 836853321, 1737966019, 569313695, 1726973227, 1963855426, 1537369394, 1808239589, -141719036, -1572723404, 493933030}, 29 - TextUtils.getOffsetBefore("", 0), objArr2);
            onWarmupCompleted = ((String) objArr2[0]).intern();
            int i = asInterface + 99;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 49;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted;
            }
            throw null;
        }

        static void onExtraCallback() {
            onExtraCallback = new int[]{1751666686, 1392096742, -821407006, 1974239561, 643605042, 449529621, -1251990514, -700697129, -1698498238, 1678668771, 1134971601, -388553686, 1295822558, 2106030151, 1946809092, 994874816, 1364490354, -1243594502};
        }
    }

    public static final class onActivityResized extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = null;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface;
        public static final onActivityResized onExtraCallback;
        private static final String onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asInterface + 103;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onActivityResized)) {
                int i4 = IAuthTabCallbackStub + 17;
                asInterface = i4 % 128;
                return i4 % 2 != 0;
            }
            int i5 = asInterface + 21;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 121;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return 1447949515;
            }
            int i3 = 52 / 0;
            return 1447949515;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface + 61;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return "QuizMyPage";
            }
            throw null;
        }

        private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = IAuthTabCallback;
            char c = '0';
            int i3 = -1469660336;
            int i4 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), Drawable.resolveOpacity(0, 0) + 72, TextUtils.lastIndexOf("", c) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i5++;
                        c = '0';
                        i3 = -1469660336;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = IAuthTabCallback;
            if (iArr5 != null) {
                int i6 = $11 + 61;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i4] = Integer.valueOf(iArr5[i8]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 73 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.combineMeasuredStates(i4, i4) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                        int i9 = $11 + 59;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        i4 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            int i11 = i4;
            System.arraycopy(iArr5, i11, iArr4, i11, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i11] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                for (int i12 = 0; i12 < 16; i12++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 22252), 39 - (ViewConfiguration.getFadingEdgeLength() >> 16), 10300 - ImageFormat.getBitsPerPixel(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                }
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 4033), (Process.myTid() >> 22) + 78, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i11 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i16 = $11 + 23;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            objArr[0] = str;
        }

        private onActivityResized() {
            super(null);
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b(new int[]{1599760789, -553111800, -467849833, 1063191990, -1512239611, -278739324, 646864288, -811942620, -38364027, -857394476, 1373420209, -710231673, 440721374, 1357420623, -1290564187, -1224913692}, 30 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            onExtraCallback = new onActivityResized();
            Object[] objArr2 = new Object[1];
            b(new int[]{1599760789, -553111800, -467849833, 1063191990, -1512239611, -278739324, 646864288, -811942620, -38364027, -857394476, 1373420209, -710231673, 440721374, 1357420623, -1290564187, -1224913692}, 30 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
            onExtraCallbackWithResult = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackDefault + 49;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 99;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ String onExtraCallback(onActivityResized onactivityresized, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = IAuthTabCallbackStub + 11;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                str = "credit_quiz";
            }
            String strOnWarmupCompleted = onactivityresized.onWarmupCompleted(str, str2);
            int i5 = IAuthTabCallbackStub + 29;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return strOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[PHI: r13
          0x004f: PHI (r13v5 android.net.Uri$Builder) = (r13v4 android.net.Uri$Builder), (r13v13 android.net.Uri$Builder) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String onWarmupCompleted(@NotNull String str, @Nullable String str2) {
            Uri.Builder builderAppendQueryParameter;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 3;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                builderAppendQueryParameter = Uri.parse(h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(this, false, str, true, null, 78, null)).buildUpon().appendQueryParameter("completed_activation", "true");
                if (str2 != null) {
                    int i3 = asInterface + 41;
                    IAuthTabCallbackStub = i3 % 128;
                    if (i3 % 2 == 0) {
                        StringsKt.isBlank(str2);
                        throw null;
                    }
                    if (!StringsKt.isBlank(str2)) {
                        builderAppendQueryParameter.appendQueryParameter("full_screen_banner_scheme", str2);
                        int i4 = asInterface + 57;
                        IAuthTabCallbackStub = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                builderAppendQueryParameter = Uri.parse(h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(this, true, str, false, null, 12, null)).buildUpon().appendQueryParameter("completed_activation", "true");
                if (str2 != null) {
                }
            }
            String string = builderAppendQueryParameter.build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i6 = IAuthTabCallbackStub + 119;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return string;
        }

        public final String onExtraCallback(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = asInterface + 75;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
            String str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("full_screen_banner_scheme");
            if (str != null) {
                return str;
            }
            int i3 = asInterface + 73;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }

        static void IAuthTabCallback() {
            IAuthTabCallback = new int[]{121049046, -183483046, 1673616549, 985318178, 442780661, -1924840303, 1617605794, 1916289311, -423477841, -805421814, -1735482348, 1958642546, 1692324828, -495388528, -613990655, 1383320294, -1516944436, 1014887722};
        }
    }

    public boolean onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 57;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            int i4 = i2 + 53;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        boolean zOnWarmupCompleted = onWarmupCompleted(this, uri, null, 2, null);
        int i6 = IAuthTabCallbackStub + 85;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return zOnWarmupCompleted;
    }

    public static final class ICustomTabsCallback extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final ICustomTabsCallback IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static boolean IAuthTabCallbackStub = false;
        private static int access100 = 1;
        private static int asBinder = 1;
        private static int asInterface;
        private static final String onExtraCallback;
        private static char[] onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static boolean onTransact;
        public static final String onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.h5ScreenShotObserverOnChangeOpt.ICustomTabsCallback) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 11;
            o.h5ScreenShotObserverOnChangeOpt.ICustomTabsCallback.access100 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = access100 + 17;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                int i4 = 78 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 1;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return 155548869;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface + 37;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return "PlusInsurance";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 77, 20951 - MotionEvent.axisFromString(""), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 74 - ExpandableListView.getPackedPositionChild(0L), 16037 - Color.green(0), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                if (!IAuthTabCallbackStub) {
                    if (!onTransact) {
                        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                        char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                        }
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 63 - TextUtils.getOffsetAfter("", 0), 12214 - View.resolveSizeAndState(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i4 = $10 + 87;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 113;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] * iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 63 - ((Process.getThreadPriority(0) + 20) >> 6), 12214 - TextUtils.getTrimmedLength(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } else {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 63, 12214 - View.combineMeasuredStates(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        private ICustomTabsCallback() {
            super(null);
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b(null, new byte[]{-124, -118, -114, -113, -123, -126, -127, -114, -116, -119, -127, -126, -115, -125, -119, -122, -116, -117, -124, -123, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            onWarmupCompleted = ((String) objArr[0]).intern();
            IAuthTabCallback = new ICustomTabsCallback();
            Object[] objArr2 = new Object[1];
            b(null, new byte[]{-124, -118, -114, -113, -123, -126, -127, -114, -116, -119, -127, -126, -115, -125, -119, -122, -116, -117, -124, -123, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
            onExtraCallback = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackDefault + 29;
            asBinder = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access100 + 49;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            String str = onExtraCallback;
            int i5 = i3 + 87;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 88 / 0;
            }
            return str;
        }

        static void IAuthTabCallback() {
            onExtraCallbackWithResult = new char[]{32568, 32574, 32571, 32526, 32569, 32575, 32516, 32753, 32708, 32520, 32527, 32514, 32519, 32517, 32522};
            onNavigationEvent = -1184333909;
            onTransact = true;
            IAuthTabCallbackStub = true;
        }
    }

    public static final class onMinimized extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final onMinimized IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int IAuthTabCallbackStubProxy = 1;
        private static boolean asBinder;
        private static int asInterface;
        private static final String onExtraCallback;
        private static char[] onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static boolean onTransact;
        private static int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackStubProxy + 63;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof onMinimized)) {
                int i3 = IAuthTabCallbackStubProxy + 21;
                asInterface = i3 % 128;
                return i3 % 2 != 0;
            }
            int i4 = IAuthTabCallbackStubProxy + 11;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 7;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return -236988848;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 53;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 67;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return "Quiz";
            }
            obj.hashCode();
            throw null;
        }

        private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            float f = 0.0f;
            char c = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c, 0, 0) + 1), 77 - View.resolveSizeAndState(0, 0, 0), 20952 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        f = 0.0f;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 75 - (Process.myPid() >> 22), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i4 = 1052772399;
            if (onTransact) {
                int i5 = $10 + 5;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63, 12214 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (asBinder) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 64, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i4 = 1052772399;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 57;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr6);
            int i9 = $10 + 73;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
        }

        private onMinimized() {
            super(null);
        }

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            b(null, new byte[]{-114, -116, -126, -115, -119, -122, -116, -117, -124, -123, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            IAuthTabCallback = new onMinimized();
            Object[] objArr2 = new Object[1];
            b(null, new byte[]{-114, -116, -126, -115, -119, -122, -116, -117, -124, -123, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
            onExtraCallback = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 97;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = onExtraCallback;
            int i4 = i2 + 3;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        static void onNavigationEvent() {
            onExtraCallbackWithResult = new char[]{32577, 32583, 32588, 32599, 32578, 32576, 32589, 32570, 32525, 32593, 32592, 32587, 32579, 32634};
            onWarmupCompleted = -1184333828;
            asBinder = true;
            onTransact = true;
        }
    }

    public static final class IAuthTabCallback_Parcel extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder;
        public static final IAuthTabCallback_Parcel onExtraCallback;
        private static char[] onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder + 75;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return obj instanceof IAuthTabCallback_Parcel;
            }
            int i5 = i3 + 53;
            int i6 = i5 % 128;
            asBinder = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 97;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 32 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 95;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return 1333093487;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asBinder + 91;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 77;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return "PlusGiftHistory";
        }

        private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
            int i = 2;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = onExtraCallbackWithResult;
            Object obj = null;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 31;
                    $11 = i8 % 128;
                    int i9 = i8 % i;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 35283), KeyEvent.normalizeMetaState(0) + 35, 14239 - View.getDefaultSize(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        i = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = $11 + 89;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10936), 65 - (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.myPid() >> 22) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                        int i13 = $11 + 57;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 28 - TextUtils.indexOf((CharSequence) "", '0'), 17658 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 49467), View.combineMeasuredStates(0, 0) + 70, 12487 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i16 = $10 + 63;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i18 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i18, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i18);
                int i19 = $11 + 9;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
            if (z) {
                int i21 = $10 + 101;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private IAuthTabCallback_Parcel() {
            super(null);
        }

        static {
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1}, new int[]{0, 36, 0, 2}, objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            onExtraCallback = new IAuthTabCallback_Parcel();
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1}, new int[]{0, 36, 0, 2}, objArr2);
            onWarmupCompleted = ((String) objArr2[0]).intern();
            int i = IAuthTabCallback + 41;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 64 / 0;
            }
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 35;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = onWarmupCompleted;
            int i5 = i3 + 105;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void IAuthTabCallback() {
            onExtraCallbackWithResult = new char[]{27252, 27194, 27192, 27195, 27198, 27199, 27197, 27168, 27174, 27141, 27167, 27171, 27177, 27174, 27141, 27167, 27194, 27198, 27168, 27137, 27167, 27168, 27176, 27178, 27173, 27172, 27143, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172};
        }
    }

    public static final class extraCallback extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 1;
        private static char[] onExtraCallback;
        public static final extraCallback onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static int onTransact;
        public static final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault + 29;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof extraCallback) {
                return true;
            }
            int i4 = onTransact + 21;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 75;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return -2035492844;
            }
            int i3 = 3 / 0;
            return -2035492844;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact + 45;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 39;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return "PlusHome";
        }

        private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = onExtraCallback;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 19;
                    $11 = i9 % 128;
                    if (i9 % i2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 35283), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35, 14239 - View.resolveSizeAndState(0, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i8--;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35283), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, View.resolveSize(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8++;
                    }
                    i2 = 2;
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr, i4, cArr3, 0, i5);
            if (bArr != null) {
                char[] cArr4 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i10 = $11 + 107;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 10936), 65 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16718 - View.MeasureSpec.getMode(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } else {
                        int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), TextUtils.getOffsetAfter("", 0) + 29, 17657 - TextUtils.getCapsMode("", 0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.combineMeasuredStates(0, 0)), 70 - (KeyEvent.getMaxKeyCode() >> 16), 12485 - TextUtils.indexOf((CharSequence) "", '0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i14 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i14, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i14);
                int i15 = $10 + 115;
                $11 = i15 % 128;
                i = 2;
                int i16 = i15 % 2;
            } else {
                i = 2;
            }
            if (z) {
                int i17 = $11 + 91;
                $10 = i17 % 128;
                int i18 = i17 % i;
                char[] cArr6 = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                    int i19 = $11 + 105;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private extraCallback() {
            super(null);
        }

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, new int[]{0, 28, 10, 0}, objArr);
            onWarmupCompleted = ((String) objArr[0]).intern();
            onExtraCallbackWithResult = new extraCallback();
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, new int[]{0, 28, 10, 0}, objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = IAuthTabCallback + 113;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 51;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent;
            }
            throw null;
        }

        static void onExtraCallback() {
            onExtraCallback = new char[]{27257, 27197, 27190, 27195, 27163, 27157, 27184, 27188, 27190, 27159, 27157, 27190, 27198, 27168, 27195, 27194, 27165, 27255, 27248, 27182, 27187, 27189, 27189, 27187, 27195, 27194, 27186, 27184};
        }
    }

    public static final class IAuthTabCallbackStubProxy extends h5ScreenShotObserverOnChangeOpt {
        public static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static int IAuthTabCallbackStub;
        private static short[] asBinder;
        private static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static final String onNavigationEvent;
        private static byte[] onTransact;
        public static final IAuthTabCallbackStubProxy onWarmupCompleted;
        private static final byte[] $$d = {29, -26, 91, 68};
        private static final int $$e = 166;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getInterfaceDescriptor = 0;
        private static int access100 = 1;
        private static int asInterface = 0;

        private static String $$f(short s, int i, int i2) {
            byte[] bArr = $$d;
            int i3 = s * 2;
            int i4 = (i2 * 4) + 115;
            int i5 = i + 4;
            byte[] bArr2 = new byte[i3 + 1];
            int i6 = -1;
            if (bArr == null) {
                i4 = i5 + i4;
                i5 = i5;
            }
            while (true) {
                int i7 = i5 + 1;
                i6++;
                bArr2[i6] = (byte) i4;
                if (i6 == i3) {
                    return new String(bArr2, 0);
                }
                i4 += bArr[i7];
                i5 = i7;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof IAuthTabCallbackStubProxy) {
                    return true;
                }
                int i2 = access100 + 71;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = getInterfaceDescriptor + 39;
            int i5 = i4 % 128;
            access100 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 99;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 45 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access100 + 107;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 47;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return -1903604552;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 117;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 83;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return "PlusFreeTrialArrived";
        }

        private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 43424), 42 - Color.green(0), 22438 - TextUtils.indexOf((CharSequence) "", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i5 = iIntValue == -1 ? 1 : 0;
                if (i5 != 0) {
                    byte[] bArr = onTransact;
                    if (bArr != null) {
                        int i6 = $11 + 107;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i8 = 0; i8 < length; i8++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = (byte) (b2 - 1);
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.getDeadChar(0, 0) + 55, 2167 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -299036574, false, $$f(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i9 = $11 + 109;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        byte[] bArr3 = onTransact;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getMode(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (asBinder[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i5;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStub), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 86 - TextUtils.indexOf("", "", 0), TextUtils.lastIndexOf("", '0') + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onTransact;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i11 = 0; i11 < length2; i11++) {
                            bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i12 = $11;
                        int i13 = i12 + 11;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        if (z) {
                            int i15 = i12 + 13;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            byte[] bArr6 = onTransact;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i17 = $10 + 1;
                            $11 = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 3 / 3;
                            }
                        } else {
                            short[] sArr = asBinder;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i19 = $10 + 61;
                            $11 = i19 % 128;
                            int i20 = i19 % 2;
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                String string = sb.toString();
                int i21 = $11 + 101;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                objArr[0] = string;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        private IAuthTabCallbackStubProxy() {
            super(null);
        }

        static {
            IAuthTabCallbackDefault = 1;
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b((byte) (ImageFormat.getBitsPerPixel(0) + 1), (short) (ViewConfiguration.getTapTimeout() >> 16), 1131739312 - (ViewConfiguration.getPressedStateDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 14, (-1194997697) - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            IAuthTabCallback = ((String) objArr[0]).intern();
            onWarmupCompleted = new IAuthTabCallbackStubProxy();
            Object[] objArr2 = new Object[1];
            b((byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1131739312 - (ViewConfiguration.getEdgeSlop() >> 16), View.combineMeasuredStates(0, 0) + 13, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1194997697, objArr2);
            onNavigationEvent = ((String) objArr2[0]).intern();
            int i = asInterface + 97;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access100 + 103;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            String str = onNavigationEvent;
            int i5 = i3 + 41;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            return str;
        }

        static void IAuthTabCallback() {
            onExtraCallback = 416079704;
            onExtraCallbackWithResult = -1538795499;
            IAuthTabCallbackStub = -478289860;
            onTransact = new byte[]{-9, -25, 5, -1, 8, 25, 60, -55, 3, -16, -1, -10, 79, -64, 8, -5, 4, 63, -76, -10, 1, -12, 73, -77, 3, 13, -9, -5, 7, 60, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 8};
        }
    }

    public static final class onNavigationEvent extends h5ScreenShotObserverOnChangeOpt {
        private static int IAuthTabCallback;
        private static short[] IAuthTabCallbackStub;
        private static int asBinder;
        private static byte[] asInterface;
        private static int onExtraCallback;
        public static final onNavigationEvent onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static int onTransact;
        private static final String onWarmupCompleted;
        private static final byte[] $$d = {68, -59, -116, 119};
        private static final int $$e = 56;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback_Parcel = 0;
        private static int access100 = 1;
        private static int IAuthTabCallbackDefault = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$f(short s, int i, short s2) {
            int i2;
            int i3 = (s2 * 3) + 115;
            int i4 = 4 - (s * 3);
            int i5 = i * 4;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i6 = i5;
                i2 = 0;
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                i6 = bArr[i4];
                i2++;
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback_Parcel + 71;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(obj instanceof onNavigationEvent))) {
                return true;
            }
            int i4 = IAuthTabCallback_Parcel + 5;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 91;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return -587264815;
            }
            int i3 = 3 / 0;
            return -587264815;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = access100 + 103;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return "Activation";
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x02aa  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x02ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            byte b2;
            long j;
            int i4 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 43424), 42 - Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i5 = iIntValue == -1 ? 1 : 0;
                char c = '0';
                if (i5 != 0) {
                    byte[] bArr = asInterface;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = 0;
                        while (i6 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12842), TextUtils.lastIndexOf("", c, 0, 0) + 56, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, -299036574, false, $$f(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i6++;
                            c = '0';
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i7 = $11 + 3;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            byte[] bArr3 = asInterface;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf("", "", 0, 0)), 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.green(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            b2 = (byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] % (-4629411779493505016L));
                            j = onExtraCallback | (-4629411779493505016L);
                        } else {
                            byte[] bArr4 = asInterface;
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.indexOf("", "")), 42 - TextUtils.getOffsetBefore("", 0), 22439 - ExpandableListView.getPackedPositionGroup(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            b2 = (byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L));
                            j = onExtraCallback ^ (-4629411779493505016L);
                        }
                        iIntValue = (byte) (b2 + ((int) j));
                    } else {
                        iIntValue = (short) (((short) (IAuthTabCallbackStub[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i5;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onTransact), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), ExpandableListView.getPackedPositionType(0L) + 86, 9566 - TextUtils.indexOf((CharSequence) "", '0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = asInterface;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        int i8 = $10 + 89;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 4 / 2;
                        }
                        for (int i10 = 0; i10 < length2; i10++) {
                            bArr6[i10] = (byte) (bArr5[i10] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i11 = $11 + 25;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i13 = $11 + 37;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 25 / 0;
                            if (z) {
                                byte[] bArr7 = asInterface;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = IAuthTabCallbackStub;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                        } else if (z) {
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private onNavigationEvent() {
            super(null);
        }

        static {
            asBinder = 1;
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            b((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 80), (short) (TextUtils.getOffsetAfter("", 0) + 109), Color.green(0) - 1644891603, (-25) - Color.red(0), 1076088607 + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            onExtraCallbackWithResult = new onNavigationEvent();
            Object[] objArr2 = new Object[1];
            b((byte) (79 - Process.getGidForName("")), (short) (110 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1644891602) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) - 25, 1076088608 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            onWarmupCompleted = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackDefault + 39;
            asBinder = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 0;
            }
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 73;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            String str = onWarmupCompleted;
            int i5 = i2 + 55;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static /* synthetic */ String onWarmupCompleted(onNavigationEvent onnavigationevent, String str, String str2, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel;
            int i4 = i3 + 35;
            access100 = i4 % 128;
            if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 4) != 0) {
                int i5 = i3 + 15;
                access100 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 3;
                }
                z = false;
            }
            return onnavigationevent.onNavigationEvent(str, str2, z);
        }

        public final String onNavigationEvent(@NotNull String str, @NotNull String str2, boolean z) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 81;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Object[] objArr = new Object[1];
            b((byte) (80 - TextUtils.getOffsetBefore("", 0)), (short) (Color.blue(0) + 109), KeyEvent.getDeadChar(0, 0) - 1644891603, TextUtils.indexOf("", "", 0, 0) - 25, 1076088609 + ExpandableListView.getPackedPositionChild(0L), objArr);
            Uri.Builder builderAppendQueryParameter = Uri.parse(((String) objArr[0]).intern()).buildUpon().appendQueryParameter("activation_redirect", str);
            Object[] objArr2 = new Object[1];
            b((byte) (33 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (short) (50 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1644891576, Drawable.resolveOpacity(0, 0) - 46, 1076088607 - KeyEvent.keyCodeFromString(""), objArr2);
            String string = builderAppendQueryParameter.appendQueryParameter(((String) objArr2[0]).intern(), str2).appendQueryParameter("score_raise_activation", String.valueOf(z)).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i4 = access100 + 29;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }

        public final String onExtraCallbackWithResult(@Nullable Intent intent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 35;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            String stringExtra = null;
            if (intent != null) {
                int i5 = i2 + 117;
                access100 = i5 % 128;
                if (i5 % 2 == 0) {
                    intent.getStringExtra("activation_redirect");
                    stringExtra.hashCode();
                    throw null;
                }
                stringExtra = intent.getStringExtra("activation_redirect");
            } else {
                int i6 = i2 + 61;
                access100 = i6 % 128;
                int i7 = i6 % 2;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
            int i8 = IAuthTabCallback_Parcel + 47;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            return "";
        }

        public final boolean onExtraCallback(@Nullable Intent intent) {
            int i = 2 % 2;
            int i2 = access100 + 107;
            IAuthTabCallback_Parcel = i2 % 128;
            String stringExtra = null;
            if (i2 % 2 != 0) {
                stringExtra.hashCode();
                throw null;
            }
            if (intent != null) {
                stringExtra = intent.getStringExtra("score_raise_activation");
                int i3 = IAuthTabCallback_Parcel + 69;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            }
            return Boolean.parseBoolean(stringExtra);
        }

        public final boolean onExtraCallback(@Nullable Uri uri) {
            String queryParameter;
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 125;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            if (uri != null) {
                int i5 = i2 + 95;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                queryParameter = uri.getQueryParameter("score_raise_activation");
            } else {
                queryParameter = null;
            }
            return Boolean.parseBoolean(queryParameter);
        }

        static void IAuthTabCallback() {
            IAuthTabCallback = -968043045;
            onExtraCallback = -1538795458;
            onTransact = 463202651;
            asInterface = new byte[]{74, -31, 48, -34, 70, -8, 48, -36, -19, -3, 118, -26, -32, 74, 62, -6, -1, -21, 48, 34, -21, -17, 54, -19, -8, 48, 54, -19, -13, -87, -26, -13, -91, -25, -87, 8, 8};
        }
    }

    public static final class onPostMessage extends h5ScreenShotObserverOnChangeOpt {
        private static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault;
        private static int asBinder;
        private static byte[] asInterface;
        public static final onPostMessage onExtraCallback;
        public static final String onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private static short[] onTransact;
        private static int onWarmupCompleted;
        private static final byte[] $$d = {34, -56, 26, -92};
        private static final int $$e = 50;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getInterfaceDescriptor = 0;
        private static int access000 = 1;
        private static int IAuthTabCallbackStub = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$f(int i, short s, short s2) {
            int i2;
            int i3 = 4 - (s2 * 4);
            int i4 = (i * 3) + 115;
            byte[] bArr = $$d;
            int i5 = s * 3;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i4 += -i3;
                i3 = i6 + 1;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i2 + 1;
                i6 = i3;
                i3 = bArr[i3];
                i7 = i8;
                i4 += -i3;
                i3 = i6 + 1;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                }
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 37;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return obj instanceof onPostMessage;
            }
            int i5 = i3 + 75;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = access000;
            int i3 = i2 + 105;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return -2125700357;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = access000 + 121;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 13 / 0;
            }
            return "PlusSetting";
        }

        private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43424), TextUtils.getOffsetAfter("", 0) + 42, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i5 = $11 + 61;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    byte[] bArr = asInterface;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i7 = $11 + 125;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        for (int i9 = 0; i9 < length; i9++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 12843), 55 - TextUtils.getCapsMode("", 0, 0), 2167 - (ViewConfiguration.getLongPressTimeout() >> 16), -299036574, false, $$f(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = asInterface;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 43424), ExpandableListView.getPackedPositionChild(0L) + 43, View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onTransact[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + (!z ? 0 : 1);
                    try {
                        Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackDefault), sb};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 86, TextUtils.indexOf("", "", 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr4 = asInterface;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            int i10 = 0;
                            while (i10 < length2) {
                                int i11 = $11 + 25;
                                $10 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    bArr5[i10] = (byte) (bArr4[i10] % (-4629411779493505016L));
                                } else {
                                    bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                                    i10++;
                                }
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            int i12 = $10 + 89;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            if (z2) {
                                byte[] bArr6 = asInterface;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onTransact;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        private onPostMessage() {
            super(null);
        }

        static {
            asBinder = 0;
            onNavigationEvent();
            Object[] objArr = new Object[1];
            b((byte) TextUtils.indexOf("", "", 0), (short) (Drawable.resolveOpacity(0, 0) + 62), (-416059486) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) - 18, (-1363478719) - (Process.myPid() >> 22), objArr);
            onExtraCallbackWithResult = ((String) objArr[0]).intern();
            onExtraCallback = new onPostMessage();
            Object[] objArr2 = new Object[1];
            b((byte) View.MeasureSpec.makeMeasureSpec(0, 0), (short) ((KeyEvent.getMaxKeyCode() >> 16) + 62), (-416059487) - View.MeasureSpec.makeMeasureSpec(0, 0), (-18) - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.getDefaultSize(0, 0) - 1363478719, objArr2);
            IAuthTabCallback = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackStub + 13;
            asBinder = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = access000 + 27;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = IAuthTabCallback;
            int i4 = i3 + 45;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static void onNavigationEvent() {
            onWarmupCompleted = -1131722665;
            onNavigationEvent = -1538795495;
            IAuthTabCallbackDefault = -184364742;
            asInterface = new byte[]{6, -77, -49, -65, -54, -39, -68, 14, 118, -56, -61, -74, 11, 117, -59, -49, -55, -67, -39, -2, -54, -65, -127, -54, -50, -75, -52, -57, -65, -75, -52};
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 43425), 42 - View.MeasureSpec.getMode(0), 22439 - KeyEvent.keyCodeFromString(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 121;
                int i8 = i7 % 128;
                $11 = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 77;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i4 = 1;
            } else {
                int i12 = $10 + 121;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 5 / 2;
                }
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = onNavigationEvent;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = $10 + 17;
                        $11 = i15 % 128;
                        int i16 = i15 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 12843), 56 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 2167 - TextUtils.indexOf("", ""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i14] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i14++;
                        i5 = 2;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getCapsMode("", 0, 0)), 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i4;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (Process.myTid() >> 22) + 86, 9567 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i17 = 0;
                        while (i17 < length2) {
                            int i18 = $10 + 67;
                            $11 = i18 % 128;
                            if (i18 % 2 == 0) {
                                bArr5[i17] = (byte) (bArr4[i17] % (-4629411779493505016L));
                                i17--;
                            } else {
                                bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                                i17++;
                            }
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static final class ICustomTabsCallbackStub extends h5ScreenShotObserverOnChangeOpt {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final String IAuthTabCallback;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface = 1;
        private static char[] onExtraCallback;
        private static char onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static int onTransact;
        public static final ICustomTabsCallbackStub onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 29;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this != obj) {
                return obj instanceof ICustomTabsCallbackStub;
            }
            int i4 = i3 + 105;
            asInterface = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 1;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 83;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return 882759947;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 79;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return "ScoreRaiseCoolTime";
        }

        private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallback;
            long j = 0;
            char c = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 81;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c, 0, 0) + 1), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        j = 0;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (-16777190) - Color.rgb(0, 0, 0), 23139 - (ViewConfiguration.getPressedStateDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i7 = $10 + 93;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24824), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, 8087 - TextUtils.lastIndexOf("", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() != defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i8 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i8];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } else {
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            }
                        } else {
                            int i12 = $11 + 33;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            int i15 = 0;
            while (i15 < i) {
                int i16 = $11 + 53;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr4[i15] = (char) (cArr4[i15] ^ 21959);
                    i15 += 12;
                } else {
                    cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                    i15++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private ICustomTabsCallbackStub() {
            super(null);
        }

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            b((byte) (Color.argb(0, 0, 0, 0) + 109), 34 - KeyEvent.keyCodeFromString(""), new char[]{'\b', '\n', 7, 4, 5, 0, 11, '\b', '\n', 15, 13858, 13858, 0, '\b', 11, 7, 1, 2, '\f', 5, 4, 1, 15, 11, 14, '\r', 13922, 13922, 3, 14, 2, 1, 11, 4}, objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            onWarmupCompleted = new ICustomTabsCallbackStub();
            Object[] objArr2 = new Object[1];
            b((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 109), KeyEvent.keyCodeFromString("") + 34, new char[]{'\b', '\n', 7, 4, 5, 0, 11, '\b', '\n', 15, 13858, 13858, 0, '\b', 11, 7, 1, 2, '\f', 5, 4, 1, 15, 11, 14, '\r', 13922, 13922, 3, 14, 2, 1, 11, 4}, objArr2);
            IAuthTabCallback = ((String) objArr2[0]).intern();
            int i = IAuthTabCallbackStub + 43;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 66 / 0;
            }
        }

        @Override // o.h5ScreenShotObserverOnChangeOpt
        protected String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 23;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            String str = IAuthTabCallback;
            if (i3 == 0) {
                int i4 = 29 / 0;
            }
            return str;
        }

        static void onNavigationEvent() {
            onExtraCallback = new char[]{64986, 64967, 64991, 64983, 64961, 64978, 64963, 64982, 64990, 64966, 64988, 64960, 64976, 64924, 64905, 64926};
            onExtraCallbackWithResult = (char) 51245;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = -1135508978;
        onExtraCallback = -1538795481;
        onWarmupCompleted = -1473004857;
        onNavigationEvent = new byte[]{-47, 5, -5, 8, 5, -9, 9, -5};
    }
}
