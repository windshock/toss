package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.PreSendAlert;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PreSendAlert$BottomSheet$$serializer implements aeu2<PreSendAlert.BottomSheet> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final PreSendAlert$BottomSheet$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        PreSendAlert$BottomSheet$$serializer preSendAlert$BottomSheet$$serializer = new PreSendAlert$BottomSheet$$serializer();
        INSTANCE = preSendAlert$BottomSheet$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet", preSendAlert$BottomSheet$$serializer, 7);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 5, 0, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{9, 7, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 0}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("buttonInfo", true);
        setanimationsloop.onWarmupCompleted("logParams", true);
        setanimationsloop.onWarmupCompleted("attachments", true);
        Object[] objArr4 = new Object[1];
        a(new int[]{16, 14, 0, 9}, true, new byte[]{1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    private PreSendAlert$BottomSheet$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallbackDefault = PreSendAlert.BottomSheet.IAuthTabCallbackDefault();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(PreSendAlert$ButtonInfo$$serializer.INSTANCE), lazyArrIAuthTabCallbackDefault[4].getValue(), lazyArrIAuthTabCallbackDefault[5].getValue(), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[6].getValue())};
        int i4 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PreSendAlert.BottomSheet bottomSheetM88deserialize = m88deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return bottomSheetM88deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0097 A[PHI: r0 r2 r4
      0x0097: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0042, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0042, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r4v10 kotlin.Lazy[]) = (r4v1 kotlin.Lazy[]), (r4v12 kotlin.Lazy[]) binds: [B:8:0x0042, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044 A[PHI: r0 r2 r4
      0x0044: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0042, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0042, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r4v2 kotlin.Lazy[]) = (r4v1 kotlin.Lazy[]), (r4v12 kotlin.Lazy[]) binds: [B:8:0x0042, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.PreSendAlert.BottomSheet m88deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r22) throws kotlinx.serialization.UnknownFieldException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert$BottomSheet$$serializer.m88deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.PreSendAlert$BottomSheet");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PreSendAlert.BottomSheet) obj);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PreSendAlert.BottomSheet bottomSheet) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(bottomSheet, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
            int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
            PreSendAlert.BottomSheet.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), 17719919, -17719918, new Object[]{bottomSheet, vylVarOnExtraCallback, serialDescriptor}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomSheet, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback5 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback6 = ICustomTabsCallbackStubProxy.onExtraCallback();
        PreSendAlert.BottomSheet.IAuthTabCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), 17719919, -17719918, new Object[]{bottomSheet, vylVarOnExtraCallback2, serialDescriptor2}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr3 = onExtraCallback;
        char c = '0';
        if (cArr3 != null) {
            int i6 = $11 + 119;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0) + 35284), 36 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Process.getGidForName("") + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr3, i2, cArr4, 0, i3);
        if (bArr != null) {
            char[] cArr5 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $11 + 115;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10936), 65 - (ViewConfiguration.getFadingEdgeLength() >> 16), Color.argb(0, 0, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i10 = 10 / 0;
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ExpandableListView.getPackedPositionChild(0L)), 65 - TextUtils.indexOf("", "", 0, 0), 16718 - View.MeasureSpec.getSize(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 29 - Drawable.resolveOpacity(0, 0), Color.alpha(0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 49468), TextUtils.indexOf("", "") + 70, 12486 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr4, i13, i5);
            System.arraycopy(cArr6, i5, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $10 + 49;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i15 = $10 + 113;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr4 = cArr;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{27252, 27192, 27194, 27172, 27260, 27174, 27198, 27168, 27168, 27256, 27175, 27170, 27197, 27172, 27178, 27176, 27262, 27176, 27168, 27199, 27168, 27160, 27157, 27173, 27179, 27179, 27172, 27194, 27176, 27176};
    }
}
