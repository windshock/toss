package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.UpdatePrimaryAccountHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class oids implements ALCFaceQuality {
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static final String IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static boolean IAuthTabCallback_Parcel;
    private static char asBinder;
    private static char[] asInterface;
    private static int extraCallback;
    private static boolean getInterfaceDescriptor;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static long onTransact;
    private static final String onWarmupCompleted;
    private static final byte[] $$a = {29, -59, -25, -119};
    private static final int $$b = 66;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 0;
    private static int access000 = 0;
    private static int access100 = 1;

    private static String $$c(int i, byte b, byte b2) {
        int i2 = b + 109;
        byte[] bArr = $$a;
        int i3 = b2 * 3;
        int i4 = i + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4++;
            i2 += bArr[i4];
        }
    }

    static {
        extraCallback = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 1397249438, new char[]{52124, 50100, 43535, 1664, 23476, 22479, 1007, 12474, 1288, 41336, 1108, 31817, 11233, 42902, 60433, 62702, 12726, 58458, 29914, 13533, 20938}, new char[]{6143, 18222, 36965, 64830}, new char[]{40431, 18517, 38483, 41281}, objArr);
        IAuthTabCallbackDefault = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), (-70880944) + (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{31414, 20830, 32545, 55682, 47615, 59421, 20496, 5547, 57568, 28023, '\''}, new char[]{6143, 18222, 36965, 64830}, new char[]{20628, 50801, 51963, 19451}, objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-122, -124, -123, -124, -127, -125, -126, -127}, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
        onExtraCallbackWithResult = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-115, -116, -119, -117, -118, -119, -120, -121}, null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr4);
        onNavigationEvent = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore("", 0), new char[]{55485, 15645, 30088, 41443, 22983, 26528, 13497, 10877, 14265, 1160, 49270, 40365, 17040, 40528, 8173, 43495, 63986, 32431, 34434, 61168, 29713, 38570, 12764, 32481}, new char[]{6143, 18222, 36965, 64830}, new char[]{32466, 16243, 37155, 50460}, objArr5);
        onWarmupCompleted = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((char) (16071 - Color.argb(0, 0, 0, 0)), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{15064, 43590}, new char[]{6143, 18222, 36965, 64830}, new char[]{19700, 29299, 51147, 14398}, objArr6);
        IAuthTabCallback = ((String) objArr6[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = writeTypedObject + 101;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = access000 + 31;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, str2);
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        int i3 = access000 + 67;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
        return zIAuthTabCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 65 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = access100 + 39;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 49;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = access100 + 107;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = access000 + 1;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = access100 + 105;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = access000 + 97;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new UpdatePrimaryAccountHandler$.ExternalSyntheticLambda0());
        int i2 = access100 + 113;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = access100 + 29;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return filterCreatePageParams.onTransact(Uri.parse(str));
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i3 = 19 / 0;
        return filterCreatePageParams.onTransact(Uri.parse(str));
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i == 28371) {
            if (i2 == -1) {
                KeyBoardVisiblePoint keyBoardVisiblePointOnTransact = PageShowPoint.Companion.onTransact();
                if (keyBoardVisiblePointOnTransact != null) {
                    onExtraCallback(setonoutofmemeryerrorcallback, new UST_CERT_GetAuthorityKeyIdentifierInfo(keyBoardVisiblePointOnTransact));
                    return;
                }
                return;
            }
            int i4 = access100 + 23;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            switch (i2) {
                case 1000:
                    Object[] objArr = new Object[1];
                    b(null, new byte[]{-122, -124, -123, -124, -127, -125, -126, -127}, null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, objArr);
                    IAuthTabCallback(this, setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), null, 4, null);
                    return;
                case 1001:
                    Object[] objArr2 = new Object[1];
                    a((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 70880944, new char[]{31414, 20830, 32545, 55682, 47615, 59421, 20496, 5547, 57568, 28023, '\''}, new char[]{6143, 18222, 36965, 64830}, new char[]{20628, 50801, 51963, 19451}, objArr2);
                    IAuthTabCallback(this, setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern(), null, 4, null);
                    return;
                case 1002:
                    Object[] objArr3 = new Object[1];
                    a((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1397249437 - View.MeasureSpec.getSize(0), new char[]{52124, 50100, 43535, 1664, 23476, 22479, 1007, 12474, 1288, 41336, 1108, 31817, 11233, 42902, 60433, 62702, 12726, 58458, 29914, 13533, 20938}, new char[]{6143, 18222, 36965, 64830}, new char[]{40431, 18517, 38483, 41281}, objArr3);
                    IAuthTabCallback(this, setonoutofmemeryerrorcallback, ((String) objArr3[0]).intern(), null, 4, null);
                    int i5 = access000 + 39;
                    access100 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 49 / 0;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            setText settext = new setText(jsonObject);
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 3733), (-1922815253) - ImageFormat.getBitsPerPixel(0), new char[]{32027, 63776, 4555, 32902, 13776}, new char[]{6143, 18222, 36965, 64830}, new char[]{60428, 25642, 38285, 39438}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(null, new byte[]{-115, -116, -119, -117, -118, -119, -120, -121}, null, KeyEvent.keyCodeFromString("") + 127, objArr2);
            String strOnNavigationEvent = settext.onNavigationEvent(strIntern, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            b(null, new byte[]{-105, -106, -109, -107, -108, -109, -110, -111, -112, -113, -114}, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a((char) (Process.myPid() >> 22), KeyEvent.getDeadChar(0, 0), new char[]{55485, 15645, 30088, 41443, 22983, 26528, 13497, 10877, 14265, 1160, 49270, 40365, 17040, 40528, 8173, 43495, 63986, 32431, 34434, 61168, 29713, 38570, 12764, 32481}, new char[]{6143, 18222, 36965, 64830}, new char[]{32466, 16243, 37155, 50460}, objArr4);
            String strOnNavigationEvent2 = settext.onNavigationEvent(strIntern2, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            b(null, new byte[]{-105, -106, -107, -107, -103, -104}, null, TextUtils.getCapsMode("", 0, 0) + 127, objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((char) (16071 - KeyEvent.getDeadChar(0, 0)), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{15064, 43590}, new char[]{6143, 18222, 36965, 64830}, new char[]{19700, 29299, 51147, 14398}, objArr6);
            String strOnNavigationEvent3 = settext.onNavigationEvent(strIntern3, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            b(null, new byte[]{-110, -113, -110, -113, -102, -113, -110}, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
            String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr7[0]).intern(), "");
            Object[] objArr8 = new Object[1];
            a((char) (TextUtils.lastIndexOf("", '0') + 1), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{20348, 36122, 'V', 39099, 20103, 1617, 14271, 50159}, new char[]{6143, 18222, 36965, 64830}, new char[]{17498, 33740, 29180, 11561}, objArr8);
            String strOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr8[0]).intern(), "");
            Object[] objArr9 = new Object[1];
            b(null, new byte[]{-113, -107, -97, -114, -108, -103, -100, -96, -110, -97, -98, -109, -110, -108, -100, -107, -105, -103, -106, -111, -111, -97, -100, -113, -98, -106, -99, -100, -100, -101, -112, -112, -106, -107, -110, -113, -108, -103, -112}, null, MotionEvent.axisFromString("") + 128, objArr9);
            Uri.Builder builderBuildUpon = Uri.parse(((String) objArr9[0]).intern()).buildUpon();
            Object[] objArr10 = new Object[1];
            a((char) (3732 - ((byte) KeyEvent.getModifierMetaStateMask())), (-1922815252) + (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{32027, 63776, 4555, 32902, 13776}, new char[]{6143, 18222, 36965, 64830}, new char[]{60428, 25642, 38285, 39438}, objArr10);
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter(((String) objArr10[0]).intern(), strOnNavigationEvent);
            Object[] objArr11 = new Object[1];
            b(null, new byte[]{-105, -106, -109, -107, -108, -109, -110, -111, -112, -113, -114}, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr11);
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(((String) objArr11[0]).intern(), strOnNavigationEvent2);
            Object[] objArr12 = new Object[1];
            b(null, new byte[]{-95, -106}, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr12);
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter(((String) objArr12[0]).intern(), strOnNavigationEvent3);
            if (strOnNavigationEvent5 != null) {
                int i2 = access100 + 57;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                if (strOnNavigationEvent5.length() != 0) {
                    strOnNavigationEvent4 = strOnNavigationEvent5;
                }
            }
            Object[] objArr13 = new Object[1];
            a((char) Color.green(0), TextUtils.indexOf("", ""), new char[]{20348, 36122, 'V', 39099, 20103, 1617, 14271, 50159}, new char[]{6143, 18222, 36965, 64830}, new char[]{17498, 33740, 29180, 11561}, objArr13);
            String string = builderAppendQueryParameter3.appendQueryParameter(((String) objArr13[0]).intern(), strOnNavigationEvent4).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intent intentOnExtraCallback = resumeForClick.asBinder.onExtraCallback(context, string);
            if (intentOnExtraCallback != null) {
                PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intentOnExtraCallback, 28371, (Bundle) null, 4, (Object) null);
            }
        }
        int i4 = access100 + 111;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, UST_CERT_GetAuthorityKeyIdentifierInfo uST_CERT_GetAuthorityKeyIdentifierInfo) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, ALCEyeBlink.onWarmupCompleted.onExtraCallbackWithResult(uST_CERT_GetAuthorityKeyIdentifierInfo));
        int i4 = access000 + 13;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void IAuthTabCallback(oids oidsVar, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = access000;
            int i4 = i3 + 67;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 125;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            str2 = "";
        }
        oidsVar.onWarmupCompleted(setonoutofmemeryerrorcallback, str, str2);
    }

    private final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str2, str, (Map) null, 3, (Object) null);
        } else {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str2, str, (Map) null, 4, (Object) null);
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 13;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 13;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (-b);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 43 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1451 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 1494 - TextUtils.getCapsMode("", 0, 0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - Color.blue(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 45848), TextUtils.getTrimmedLength("") + 29, 12577 - Gravity.getAbsoluteGravity(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i9 = $10 + 47;
                $11 = i9 % 128;
                int i10 = i9 % 2;
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

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = asInterface;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 111;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.argb(0, 0, 0, 0) + 77, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStubProxy)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 75 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        long j = 0;
        if (!(!IAuthTabCallback_Parcel)) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 51;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 64 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!getInterfaceDescriptor) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $11 + 55;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $10 + 5;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                int i14 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
                int i15 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                cArr6[i13] = (char) (cArr3[cArr[0] >>> i] >>> iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1), 16777279 + Color.rgb(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 63, 12214 - TextUtils.getTrimmedLength(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            j = 0;
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onTransact = -7997095154499486716L;
        IAuthTabCallbackStub = -1776194565;
        asBinder = (char) 27643;
        asInterface = new char[]{32717, 32719, 32762, 32707, 32708, 32716, 46740, 51188, 32680, 47768, 52540, 54092, 46852, 32748, 32739, 32541, 32749, 32542, 32743, 32536, 32540, 32537, 32538, 32750, 32531, 32738, 32726, 32729, 32736, 32539, 32751, 32535, 32741};
        IAuthTabCallbackStubProxy = -1184333944;
        getInterfaceDescriptor = true;
        IAuthTabCallback_Parcel = true;
    }
}
