package im.toss.features.home.core.local.model.dst.element;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.setSuccessCallback;
import o.setSuccessParams;
import o.sp;
import o.updateInterrupt;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GroupedListRowLocal$$serializer implements aeu2<GroupedListRowLocal> {
    public static final GroupedListRowLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2 = b + 109;
        int i3 = 3 - (b2 * 2);
        byte[] bArr = $$a;
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            i2 = i4;
            int i6 = 0;
            i2 += -i3;
            i3 = i5;
            i = i6;
            bArr2[i] = (byte) i2;
            int i7 = i3 + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            int i8 = i + 1;
            i5 = i7;
            i3 = bArr[i7];
            i6 = i8;
            i2 += -i3;
            i3 = i5;
            i = i6;
            bArr2[i] = (byte) i2;
            int i72 = i3 + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i722 = i3 + 1;
            if (i == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 33;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted = 1;
        onExtraCallbackWithResult();
        GroupedListRowLocal$$serializer groupedListRowLocal$$serializer = new GroupedListRowLocal$$serializer();
        INSTANCE = groupedListRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.GroupedListRowLocal", groupedListRowLocal$$serializer, 9);
        Object[] objArr = new Object[1];
        a((char) (33296 - MotionEvent.axisFromString("")), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 369793191, new char[]{23120, 60248, 53787}, new char[]{42160, 44513, 29973, 18135}, new char[]{22794, 62823, 4585, 34434}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("content", false);
        setanimationsloop.onWarmupCompleted("rollingNumberContent", false);
        setanimationsloop.onWarmupCompleted("left", false);
        setanimationsloop.onWarmupCompleted("right", false);
        setanimationsloop.onWarmupCompleted("arrow", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("longPressHandler", false);
        setanimationsloop.onWarmupCompleted("hiddenItems", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 115;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private GroupedListRowLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = GroupedListRowLocal.onExtraCallbackWithResult();
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, BaseListRowLocal$Content$$serializer.INSTANCE, sp.IAuthTabCallback(updateInterrupt.onNavigationEvent), sp.IAuthTabCallback(setSuccessCallback.onExtraCallback), sp.IAuthTabCallback(setSuccessParams.IAuthTabCallback), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker), lazyArrOnExtraCallbackWithResult[8].getValue()};
        int i4 = IAuthTabCallbackDefault + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final GroupedListRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BaseListRowLocal.RollingNumberContent rollingNumberContent;
        Boolean bool;
        BaseListRowLocal.Right right;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        String str;
        int i;
        List list;
        BaseListRowLocal.Left left;
        BaseListRowLocal.Right right2;
        BaseListRowLocal.Left left2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = GroupedListRowLocal.onExtraCallbackWithResult();
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        BaseListRowLocal.Content content = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            BaseListRowLocal.Content content2 = (BaseListRowLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseListRowLocal$Content$$serializer.INSTANCE, (Object) null);
            BaseListRowLocal.RollingNumberContent rollingNumberContent2 = (BaseListRowLocal.RollingNumberContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, updateInterrupt.onNavigationEvent, (Object) null);
            BaseListRowLocal.Left left3 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setSuccessCallback.onExtraCallback, (Object) null);
            BaseListRowLocal.Right right3 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setSuccessParams.IAuthTabCallback, (Object) null);
            Boolean bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getBgColor.IAuthTabCallback, (Object) null);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            HandlerLocal handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setappxversioninworker, (Object) null);
            HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, setappxversioninworker, (Object) null);
            i = 511;
            rollingNumberContent = rollingNumberContent2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnExtraCallbackWithResult[8].getValue(), (Object) null);
            str = strAsInterface;
            handlerLocal = handlerLocal4;
            handlerLocal2 = handlerLocal3;
            left = left3;
            bool = bool2;
            right = right3;
            content = content2;
        } else {
            int i6 = IAuthTabCallbackDefault + 5;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            boolean z = true;
            Boolean bool3 = null;
            HandlerLocal handlerLocal5 = null;
            HandlerLocal handlerLocal6 = null;
            rollingNumberContent = null;
            List list2 = null;
            BaseListRowLocal.Right right4 = null;
            BaseListRowLocal.Left left4 = null;
            String strAsInterface2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i9 = IAuthTabCallbackDefault + 43;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        left4 = left4;
                        right4 = right4;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        z = false;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 1:
                        right2 = right4;
                        left2 = left4;
                        content = (BaseListRowLocal.Content) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, BaseListRowLocal$Content$$serializer.INSTANCE, content);
                        i8 |= 2;
                        int i11 = asBinder + 63;
                        IAuthTabCallbackDefault = i11 % 128;
                        int i12 = i11 % 2;
                        left4 = left2;
                        right4 = right2;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 2:
                        right2 = right4;
                        left2 = left4;
                        rollingNumberContent = (BaseListRowLocal.RollingNumberContent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, updateInterrupt.onNavigationEvent, rollingNumberContent);
                        i8 |= 4;
                        left4 = left2;
                        right4 = right2;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 3:
                        left4 = (BaseListRowLocal.Left) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setSuccessCallback.onExtraCallback, left4);
                        i8 |= 8;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 4:
                        i8 |= 16;
                        right4 = (BaseListRowLocal.Right) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setSuccessParams.IAuthTabCallback, right4);
                        i3 = 7;
                        i4 = 6;
                    case 5:
                        bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getBgColor.IAuthTabCallback, bool3);
                        i8 |= 32;
                        i3 = 7;
                    case 6:
                        handlerLocal6 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, setAppxVersionInWorker.onExtraCallback, handlerLocal6);
                        i8 |= 64;
                        int i13 = asBinder + 87;
                        IAuthTabCallbackDefault = i13 % 128;
                        int i14 = i13 % 2;
                        i3 = 7;
                    case 7:
                        handlerLocal5 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, setAppxVersionInWorker.onExtraCallback, handlerLocal5);
                        i8 |= 128;
                    case 8:
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 8, (jp) lazyArrOnExtraCallbackWithResult[8].getValue(), list2);
                        i8 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            BaseListRowLocal.Left left5 = left4;
            bool = bool3;
            right = right4;
            handlerLocal = handlerLocal5;
            handlerLocal2 = handlerLocal6;
            str = strAsInterface2;
            i = i8;
            list = list2;
            left = left5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new GroupedListRowLocal(i, str, content, rollingNumberContent, left, right, bool, handlerLocal2, handlerLocal, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m376deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        GroupedListRowLocal groupedListRowLocalDeserialize = deserialize(decoder);
        int i4 = asBinder + 51;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return groupedListRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull GroupedListRowLocal groupedListRowLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupedListRowLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        GroupedListRowLocal.onWarmupCompleted(groupedListRowLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 1;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (GroupedListRowLocal) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 99;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 41;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43;
                    int size = 1451 - View.MeasureSpec.getSize(0);
                    byte b = (byte) ($$b & 1);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cCombineMeasuredStates, i6, size, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myTid() >> 22)), TextUtils.getOffsetBefore("", 0) + 44, 1494 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23971), View.MeasureSpec.makeMeasureSpec(0, 0) + 50, ExpandableListView.getPackedPositionGroup(0L) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 45849), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 125;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = 3093261711306706763L;
        onExtraCallbackWithResult = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
