package im.toss.features.cardrecommend.home.model.feed.division.divider;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.cardrecommend.home.model.feed.division.DivisionModel;
import im.toss.features.cardrecommend.home.model.feed.division.DivisionModel$$serializer;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DividerResp$$serializer implements aeu2<DividerResp> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    public static final DividerResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        DividerResp$$serializer dividerResp$$serializer = new DividerResp$$serializer();
        INSTANCE = dividerResp$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.cardrecommend.home.model.feed.division.divider.DividerResp", dividerResp$$serializer, 3);
        Object[] objArr = new Object[1];
        a(new char[]{23473, 4311, 41720, 56087}, KeyEvent.getDeadChar(0, 0) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{60261, 19520, 176, 46343}, TextUtils.lastIndexOf("", '0') + 5, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("stateType", false);
        descriptor = setanimationsloop;
        int i = onTransact + 21;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private DividerResp$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, DivisionModel$$serializer.INSTANCE, getwrigglelayout};
        int i4 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DividerResp deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        DivisionModel divisionModel;
        String strAsInterface;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        DivisionModel divisionModel2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            DivisionModel divisionModel3 = (DivisionModel) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, DivisionModel$$serializer.INSTANCE, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = strAsInterface2;
            divisionModel = divisionModel3;
            i = 7;
        } else {
            int i3 = 0;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = IAuthTabCallbackStub;
                    int i5 = i4 + 23;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i7 = i4 + 53;
                        int i8 = i7 % 128;
                        IAuthTabCallbackDefault = i8;
                        if (i7 % 2 == 0) {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i9 = i8 + 59;
                            IAuthTabCallbackStub = i9 % 128;
                            strAsInterface4 = i9 % 2 == 0 ? ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4) : ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i3 |= 4;
                            int i10 = IAuthTabCallbackDefault + 55;
                            IAuthTabCallbackStub = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i92 = i8 + 59;
                            IAuthTabCallbackStub = i92 % 128;
                            if (i92 % 2 == 0) {
                            }
                            i3 |= 4;
                            int i102 = IAuthTabCallbackDefault + 55;
                            IAuthTabCallbackStub = i102 % 128;
                            int i112 = i102 % 2;
                        }
                    } else {
                        divisionModel2 = (DivisionModel) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, DivisionModel$$serializer.INSTANCE, divisionModel2);
                        i3 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            str = strAsInterface3;
            divisionModel = divisionModel2;
            strAsInterface = strAsInterface4;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DividerResp(i, str, divisionModel, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m106deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DividerResp dividerResp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dividerResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DividerResp.onWarmupCompleted(dividerResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DividerResp) obj);
        int i4 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $10 + 39;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 17;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 10 - View.MeasureSpec.getMode(0), 12434 - Color.argb(0, 0, 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getMode(0) + 10, View.getDefaultSize(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, View.MeasureSpec.getSize(0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2, 0, i);
        int i9 = $11 + 7;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 8 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = (char) 38160;
        onWarmupCompleted = (char) 48189;
        IAuthTabCallback = (char) 55917;
        onExtraCallback = (char) 35293;
    }
}
