package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.qt;
import o.setGuideTextColor;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setGuideTextColor<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {
    private static final byte[] $$a = {94, -43, -105, 125};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted = 478308931;
    private final KSerializer<C> IAuthTabCallback;
    private final KSerializer<B> onExtraCallback;
    private final KSerializer<A> onExtraCallbackWithResult;
    private final SerialDescriptor onNavigationEvent;

    private static String $$c(byte b, byte b2, byte b3) {
        int i = 3 - (b * 3);
        int i2 = 105 - (b3 * 4);
        int i3 = b2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 += i3;
        }
        while (true) {
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i];
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(setGuideTextColor setguidetextcolor, qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(setguidetextcolor, qtVar);
        }
        onExtraCallbackWithResult(setguidetextcolor, qtVar);
        throw null;
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Triple<A, B, C> tripleOnExtraCallbackWithResult = onExtraCallbackWithResult(decoder);
        int i4 = IAuthTabCallbackDefault + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tripleOnExtraCallbackWithResult;
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(encoder, (Triple) obj);
        int i4 = asInterface + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public setGuideTextColor(@NotNull KSerializer<A> kSerializer, @NotNull KSerializer<B> kSerializer2, @NotNull KSerializer<C> kSerializer3) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        Intrinsics.checkNotNullParameter(kSerializer3, "");
        this.onExtraCallbackWithResult = kSerializer;
        this.onExtraCallback = kSerializer2;
        this.IAuthTabCallback = kSerializer3;
        this.onNavigationEvent = ujb.IAuthTabCallback("kotlin.Triple", new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.TripleSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setGuideTextColor.onNavigationEvent(this.f$0, (qt) obj);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = this.onNavigationEvent;
        int i5 = i2 + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static final Unit onExtraCallbackWithResult(setGuideTextColor setguidetextcolor, qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(qtVar, "");
        Object[] objArr = new Object[1];
        a(4 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), 4 - Gravity.getAbsoluteGravity(0, 0), new char[]{65531, 4, 5, 6, 65528}, false, TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 216, objArr);
        qt.onExtraCallback(qtVar, ((String) objArr[0]).intern(), setguidetextcolor.onExtraCallbackWithResult.getDescriptor(), null, false, 12, null);
        qt.onExtraCallback(qtVar, "second", setguidetextcolor.onExtraCallback.getDescriptor(), null, false, 12, null);
        qt.onExtraCallback(qtVar, "third", setguidetextcolor.IAuthTabCallback.getDescriptor(), null, false, 12, null);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull Encoder encoder, @NotNull Triple<? extends A, ? extends B, ? extends C> triple) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(triple, "");
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(getDescriptor());
        vylVarOnExtraCallback.onNavigationEvent(getDescriptor(), 0, this.onExtraCallbackWithResult, triple.getFirst());
        vylVarOnExtraCallback.onNavigationEvent(getDescriptor(), 1, this.onExtraCallback, triple.getSecond());
        vylVarOnExtraCallback.onNavigationEvent(getDescriptor(), 2, this.IAuthTabCallback, triple.getThird());
        vylVarOnExtraCallback.onNavigationEvent(getDescriptor());
        int i4 = IAuthTabCallbackDefault + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    public Triple<A, B, C> onExtraCallbackWithResult(@NotNull Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(getDescriptor());
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            return onExtraCallback(ywVarOnWarmupCompleted);
        }
        Triple<A, B, C> tripleOnNavigationEvent = onNavigationEvent(ywVarOnWarmupCompleted);
        int i4 = IAuthTabCallbackDefault + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tripleOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35125), 23 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 12844), 55 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            int i7 = $10 + 47;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 47;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), 55 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2168 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $10 + 21;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i4 = 2083011369;
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final Triple<A, B, C> onNavigationEvent(yw ywVar) {
        int i = 2 % 2;
        Object objOnExtraCallback = yw.onExtraCallback(ywVar, getDescriptor(), 0, this.onExtraCallbackWithResult, null, 8, null);
        Object objOnExtraCallback2 = yw.onExtraCallback(ywVar, getDescriptor(), 1, this.onExtraCallback, null, 8, null);
        Object objOnExtraCallback3 = yw.onExtraCallback(ywVar, getDescriptor(), 2, this.IAuthTabCallback, null, 8, null);
        ywVar.onExtraCallbackWithResult(getDescriptor());
        Triple<A, B, C> triple = new Triple<>(objOnExtraCallback, objOnExtraCallback2, objOnExtraCallback3);
        int i2 = asInterface + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return triple;
    }

    private final Triple<A, B, C> onExtraCallback(yw ywVar) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = pmi111.onWarmupCompleted;
        Object objOnExtraCallback2 = pmi111.onWarmupCompleted;
        Object objOnExtraCallback3 = pmi111.onWarmupCompleted;
        while (true) {
            int iOnNavigationEvent = ywVar.onNavigationEvent(getDescriptor());
            if (iOnNavigationEvent == -1) {
                ywVar.onExtraCallbackWithResult(getDescriptor());
                if (objOnExtraCallback == pmi111.onWarmupCompleted) {
                    throw new qn("Element 'first' is missing");
                }
                int i4 = asInterface + 73;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                if (objOnExtraCallback2 == pmi111.onWarmupCompleted) {
                    throw new qn("Element 'second' is missing");
                }
                if (objOnExtraCallback3 != pmi111.onWarmupCompleted) {
                    return new Triple<>(objOnExtraCallback, objOnExtraCallback2, objOnExtraCallback3);
                }
                throw new qn("Element 'third' is missing");
            }
            if (iOnNavigationEvent != 0) {
                int i6 = asInterface + 111;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                if (iOnNavigationEvent == 1) {
                    objOnExtraCallback2 = yw.onExtraCallback(ywVar, getDescriptor(), 1, this.onExtraCallback, null, 8, null);
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new qn("Unexpected index " + iOnNavigationEvent);
                    }
                    objOnExtraCallback3 = yw.onExtraCallback(ywVar, getDescriptor(), 2, this.IAuthTabCallback, null, 8, null);
                }
            } else {
                objOnExtraCallback = yw.onExtraCallback(ywVar, getDescriptor(), 0, this.onExtraCallbackWithResult, null, 8, null);
            }
        }
    }
}
