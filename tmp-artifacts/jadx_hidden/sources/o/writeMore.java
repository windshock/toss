package o;

import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.global.features.asset.au.core.model.CdrActionType;
import im.toss.global.features.asset.au.ui.session.AssetAuSessionManager$;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.EngineConfig1;
import o.sendFragmentedFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: classes.dex */
public final class writeMore {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] access000 = {27255, 27173, 27173, 27196, 27173, 27179, 27179, 27173};
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private final IAnimation<sendFragmentedFrame.onExtraCallbackWithResult> IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private Long IAuthTabCallbackStubProxy;
    private Long IAuthTabCallback_Parcel;
    private String access100;
    private String asBinder;
    private String asInterface;
    private CdrActionType getInterfaceDescriptor;
    private String onExtraCallback;
    private final nLockFileSegment<sendFragmentedFrame.onExtraCallbackWithResult> onExtraCallbackWithResult;
    private final List<String> onNavigationEvent;
    private String onTransact;
    private final GRVAndroidMediaPlayer3 onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = ~(i9 | i3);
        int i11 = ~((~i) | i4);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i4 + i3 + i2 + ((-1232316077) * i6) + ((-263306238) * i5);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i4) - 1785593856) + (933837065 * i3) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i2) + (1319895040 * i6) + (1514668032 * i5) + (1334968320 * i15);
        int i17 = ((i4 * (-2046307327)) - 1888090795) + (i3 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i2 * (-2046307883)) + (i6 * 1526207759) + (i5 * (-1095616598)) + (i15 * 1719271424);
        int i18 = i16 + (i17 * i17 * 2111700992);
        if (i18 != 1) {
            return i18 != 2 ? i18 != 3 ? i18 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }
        writeMore writemore = (writeMore) objArr[0];
        CdrActionType cdrActionType = (CdrActionType) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        Long l = (Long) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i19 = 2 % 2;
        if ((iIntValue & 2) != 0) {
            str = null;
        }
        if ((iIntValue & 4) != 0) {
            int i20 = writeTypedObject + 59;
            readTypedObject = i20 % 128;
            int i21 = i20 % 2;
            str2 = null;
        }
        if ((iIntValue & 8) != 0) {
            int i22 = writeTypedObject + 77;
            readTypedObject = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 5 % 4;
            }
            l = null;
        }
        writemore.onWarmupCompleted(cdrActionType, str, str2, l);
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(writeMore writemore, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(writemore, str, setDetectableSize);
        }
        onWarmupCompleted(writemore, str, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public writeMore(@NotNull GRVAndroidMediaPlayer3 gRVAndroidMediaPlayer3) {
        Intrinsics.checkNotNullParameter(gRVAndroidMediaPlayer3, "");
        this.onWarmupCompleted = gRVAndroidMediaPlayer3;
        this.onNavigationEvent = new ArrayList();
        nLockFileSegment<sendFragmentedFrame.onExtraCallbackWithResult> nlockfilesegmentOnExtraCallbackWithResult = zb.onExtraCallbackWithResult(-2, (CloseableUtils) null, (Function1) null, 6, (Object) null);
        this.onExtraCallbackWithResult = nlockfilesegmentOnExtraCallbackWithResult;
        this.IAuthTabCallback = ycxycx.IAuthTabCallback(nlockfilesegmentOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void IAuthTabCallback(writeMore writemore) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        writemore.getInterfaceDescriptor();
        int i4 = readTypedObject + 111;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ GRVAndroidMediaPlayer3 onNavigationEvent(writeMore writemore) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        GRVAndroidMediaPlayer3 gRVAndroidMediaPlayer3 = writemore.onWarmupCompleted;
        int i5 = i3 + 55;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return gRVAndroidMediaPlayer3;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 71;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 13;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallbackStub;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 121;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.access100;
        int i4 = i2 + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 67;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asInterface;
        int i5 = i2 + 79;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> asInterface() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.onNavigationEvent;
        if (i3 == 0) {
            return CollectionsKt.toList(list);
        }
        CollectionsKt.toList(list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        writeMore writemore = (writeMore) objArr[0];
        Long l = (Long) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 3;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        writemore.IAuthTabCallbackStubProxy = l;
        int i5 = i2 + 75;
        readTypedObject = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        writeMore writemore = (writeMore) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 51;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Long l = writemore.IAuthTabCallback_Parcel;
        int i5 = i2 + 1;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackDefault = z;
        int i5 = i3 + 5;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 121;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallbackDefault;
        int i5 = i3 + 41;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 109;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.areEqual(this.asBinder, this.onExtraCallback);
            throw null;
        }
        if (!Intrinsics.areEqual(this.asBinder, this.onExtraCallback)) {
            return false;
        }
        int i3 = writeTypedObject + 17;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return this.onExtraCallback != null;
    }

    public final IAnimation<sendFragmentedFrame.onExtraCallbackWithResult> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        IAnimation<sendFragmentedFrame.onExtraCallbackWithResult> iAnimation = this.IAuthTabCallback;
        int i4 = i3 + 1;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return iAnimation;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        writeMore writemore = (writeMore) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        Long l = (Long) objArr[4];
        int i = 2 % 2;
        writemore.onExtraCallback = str;
        writemore.IAuthTabCallbackStub = str2;
        writemore.access100 = str3;
        if (l == null) {
            int i2 = readTypedObject + 89;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                l = writemore.IAuthTabCallback_Parcel;
                int i3 = 38 / 0;
            } else {
                l = writemore.IAuthTabCallback_Parcel;
            }
        }
        writemore.IAuthTabCallback_Parcel = l;
        int i4 = writeTypedObject + 63;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onTransact = str;
        this.asInterface = str2;
        int i4 = writeTypedObject + 77;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i3 = 54 / 0;
            if (this.onNavigationEvent.contains(str)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.onNavigationEvent.contains(str)) {
                return;
            }
        }
        this.onNavigationEvent.add(str);
        int i4 = writeTypedObject + 111;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void access100() {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        this.asBinder = this.onExtraCallback;
        int i5 = i3 + 69;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(@NotNull CdrActionType cdrActionType, @Nullable String str, @Nullable String str2, @Nullable Long l) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cdrActionType, "");
        readTypedObject();
        this.onExtraCallback = UUID.randomUUID().toString();
        this.getInterfaceDescriptor = cdrActionType;
        Long l2 = this.IAuthTabCallback_Parcel;
        if (l2 != null) {
            l = l2;
        } else if (l == null) {
            int i4 = writeTypedObject + 115;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            l = Long.valueOf(!(this.IAuthTabCallbackDefault ^ true) ? 4994734L : 1958346L);
        }
        this.IAuthTabCallbackStubProxy = l;
        if (str2 != null) {
            int i6 = writeTypedObject + 31;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            this.IAuthTabCallbackStub = str2;
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1639700L, false, (String) null, (Map) null, new AssetAuSessionManager$.ExternalSyntheticLambda0(this, str), 14, (Object) null);
    }

    private static final Unit onWarmupCompleted(writeMore writemore, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(writemore.onNavigationEvent());
        if (str != null) {
            int i4 = writeTypedObject + 21;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                setDetectableSize.onExtraCallback("selected_org_codes", str);
                int i5 = 96 / 0;
            } else {
                setDetectableSize.onExtraCallback("selected_org_codes", str);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        writeMore writemore = (writeMore) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            writemore.onTransact = null;
            writemore.asInterface = null;
            writemore.IAuthTabCallbackStubProxy = null;
            writemore.asBinder = null;
            int i3 = 50 / 0;
        } else {
            writemore.onTransact = null;
            writemore.asInterface = null;
            writemore.IAuthTabCallbackStubProxy = null;
            writemore.asBinder = null;
        }
        return null;
    }

    public final Map<String, Object> onNavigationEvent() {
        Object obj;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.onExtraCallback;
        if (str != null) {
            linkedHashMap.put("execution_id", str);
        }
        String str2 = this.IAuthTabCallbackStub;
        if (str2 != null) {
            int i2 = readTypedObject + 43;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 8, 0, 0}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 8, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr2);
                obj = objArr2[0];
            }
            linkedHashMap.put(((String) obj).intern(), str2);
        }
        String str3 = this.access100;
        if (str3 != null) {
            int i3 = writeTypedObject + 101;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            linkedHashMap.put("referrer_item_id", str3);
        }
        CdrActionType cdrActionType = this.getInterfaceDescriptor;
        if (cdrActionType != null) {
            linkedHashMap.put("register_mode", onNavigationEvent(cdrActionType));
            int i5 = readTypedObject + 29;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
        }
        Long l = this.IAuthTabCallbackStubProxy;
        if (l != null) {
            int i7 = writeTypedObject + 9;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            linkedHashMap.put("start_schema_id", Long.valueOf(l.longValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String onNavigationEvent(@NotNull CdrActionType cdrActionType) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cdrActionType, "");
        int i4 = onExtraCallbackWithResult.IAuthTabCallback[cdrActionType.ordinal()];
        if (i4 == 1) {
            return "ADD";
        }
        if (i4 == 2) {
            return "DELETE";
        }
        int i5 = readTypedObject + 57;
        int i6 = i5 % 128;
        writeTypedObject = i6;
        if (i5 % 2 == 0) {
            if (i4 == 4) {
                return "RENEW_CONSENTS";
            }
        } else if (i4 == 3) {
            return "RENEW_CONSENTS";
        }
        int i7 = i6 + 113;
        readTypedObject = i7 % 128;
        if (i7 % 2 != 0) {
            if (i4 == 4) {
                return "RENEW_CONNECTION";
            }
        } else if (i4 == 4) {
            return "RENEW_CONNECTION";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(sendFragmentedFrame.onExtraCallbackWithResult.onWarmupCompleted.onWarmupCompleted);
        int i4 = readTypedObject + 91;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(sendFragmentedFrame.onExtraCallbackWithResult.onExtraCallback.IAuthTabCallback);
        int i4 = writeTypedObject + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
        int i2 = readTypedObject + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback = null;
            this.IAuthTabCallbackStub = null;
            this.access100 = null;
            this.onTransact = null;
            this.asInterface = null;
            this.onNavigationEvent.clear();
            this.IAuthTabCallbackStubProxy = null;
            this.IAuthTabCallback_Parcel = null;
            this.asBinder = null;
            int i3 = 80 / 0;
        } else {
            this.onExtraCallback = null;
            this.IAuthTabCallbackStub = null;
            this.access100 = null;
            this.onTransact = null;
            this.asInterface = null;
            this.onNavigationEvent.clear();
            this.IAuthTabCallbackStubProxy = null;
            this.IAuthTabCallback_Parcel = null;
            this.asBinder = null;
        }
        int i4 = writeTypedObject + 67;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = access000;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i6]);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 55;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $10 + 15;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (!(!z)) {
            int i12 = $11 + 13;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i14 = $11 + 115;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i16 = $11 + 45;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i18 = $11 + 123;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        objArr[0] = str;
    }

    private final void readTypedObject() {
        onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 258158033, new Object[]{this}, -258158031, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onExtraCallback(writeMore writemore, CdrActionType cdrActionType, String str, String str2, Long l, int i, Object obj) {
        Object[] objArr = {writemore, cdrActionType, str, str2, l, Integer.valueOf(i), obj};
        onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1343321683, objArr, -1343321682, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
    }

    public final Long access000() {
        return (Long) onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1285159362, new Object[]{this}, -1285159362, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
    }

    public final void onExtraCallback(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l) {
        onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -201610556, new Object[]{this, str, str2, str3, l}, 201610559, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
    }

    public final void onExtraCallback(@Nullable Long l) {
        onExtraCallbackWithResult(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -372165032, new Object[]{this, l}, 372165036, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
    }
}
