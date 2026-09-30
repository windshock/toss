package im.toss.securities.widget.data.model.watchlists;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class WidgetWatchlists$WatchList$$serializer implements aeu2<WidgetWatchlists.WatchList> {
    private static int IAuthTabCallback;
    public static final WidgetWatchlists$WatchList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static final byte[] $$a = {23, 124, -70, -17};
    private static final int $$b = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = b + 4;
        int i7 = (i2 * 2) + 105;
        byte[] bArr = $$a;
        int i8 = 1 - (i * 2);
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i6;
            i5 = 0;
            i6 += i7;
            i4 = i9;
            i3 = i5;
            int i10 = i4 + 1;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            i9 = i10;
            i7 = bArr[i10];
            i6 += i7;
            i4 = i9;
            i3 = i5;
            int i102 = i4 + 1;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i8) {
            }
        } else {
            i3 = 0;
            i4 = i6;
            i6 = i7;
            int i1022 = i4 + 1;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i8) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 1;
        IAuthTabCallback();
        WidgetWatchlists$WatchList$$serializer widgetWatchlists$WatchList$$serializer = new WidgetWatchlists$WatchList$$serializer();
        INSTANCE = widgetWatchlists$WatchList$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetWatchlists.WatchList", widgetWatchlists$WatchList$$serializer, 4);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("items", true);
        Object[] objArr = new Object[1];
        a(4 - TextUtils.indexOf("", "", 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, new char[]{6, 65533, 5, 65529}, true, 137 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 4, (ViewConfiguration.getScrollBarSize() >> 8) + 1, new char[]{65525, 4, '\t', 0}, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 144, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private WidgetWatchlists$WatchList$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = WidgetWatchlists.WatchList.onNavigationEvent();
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[1].getValue()), getWriggleLayout.onNavigationEvent, lazyArrOnNavigationEvent[3].getValue()};
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetWatchlists.WatchList deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
        List list;
        long j;
        char c;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            WidgetWatchlists.WatchList.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = WidgetWatchlists.WatchList.onNavigationEvent();
        boolean z = false;
        char c2 = 3;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted2.IAuthTabCallbackDefault(serialDescriptor, 0);
            List list2 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg2 = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnNavigationEvent[3].getValue(), (Object) null);
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
            i = 15;
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg = r8lambdabrizzqzhaizmdvstl2yymmz7zsg2;
            j = jIAuthTabCallbackDefault;
            list = list2;
            str = strAsInterface;
        } else {
            String strAsInterface2 = null;
            boolean z2 = true;
            long jIAuthTabCallbackDefault2 = 0;
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg3 = null;
            List list3 = null;
            int i6 = 0;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onExtraCallbackWithResult;
                    int i8 = i7 + 1;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i10 = i7 + 61;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 0) {
                            c = 3;
                            list3 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list3);
                            i6 |= 2;
                        } else {
                            c = 3;
                            if (iOnNavigationEvent == 2) {
                                strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                                i6 |= 4;
                            } else {
                                if (iOnNavigationEvent != 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                r8lambdabrizzqzhaizmdvstl2yymmz7zsg3 = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnNavigationEvent[3].getValue(), r8lambdabrizzqzhaizmdvstl2yymmz7zsg3);
                                i6 |= 8;
                            }
                        }
                        c2 = c;
                        z = false;
                    } else {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted2.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i6 |= 1;
                        c2 = 3;
                        z = false;
                    }
                } else {
                    z2 = z;
                    c2 = c2;
                    z = z2;
                }
            }
            i = i6;
            str = strAsInterface2;
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg = r8lambdabrizzqzhaizmdvstl2yymmz7zsg3;
            list = list3;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetWatchlists.WatchList(i, j, list, str, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m62deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        WidgetWatchlists.WatchList watchListDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return watchListDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetWatchlists.WatchList watchList) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(watchList, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WidgetWatchlists.WatchList.onNavigationEvent(watchList, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetWatchlists.WatchList) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = -1;
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i7 = $11 + 1;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Color.rgb(0, 0, 0) + 16777239, 10278 - View.resolveSize(0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.green(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 55, 2167 - View.MeasureSpec.getMode(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i10 = $10 + 65;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i12 = $10 + 43;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 / 2;
            }
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i14 = $11 + 105;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 55, TextUtils.indexOf((CharSequence) "", '0') + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = -1;
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onExtraCallback = 478308872;
    }
}
