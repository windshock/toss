package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.DynamicFromArrayCompanion;
import o.JsonReaderEmptyEOFException;
import o.JsonReaderErrorInfo;
import o.TimeoutCompanionNONE1;
import o.adInfo;
import o.asArraylambda5;
import o.deserializeUriNullableCollection;
import o.flushed;
import o.wasLastName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.PasswordPolicyResponse;
import viva.republica.toss.password.PasswordPolicyManager$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DynamicFromArrayCompanion {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String IAuthTabCallback;
    private static final wie2 IAuthTabCallbackDefault;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static List<PasswordPolicyResponse.UnavailablePasswordPolicy> asBinder = null;
    private static onExtraCallbackWithResult asInterface = null;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallback;
    public static final DynamicFromArrayCompanion onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int[] onTransact;
    private static List<String> onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        String onExtraCallbackWithResult();

        String onNavigationEvent();
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.NOT_THREE_OR_MORE_NUMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallback = iArr;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~(i4 | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i5));
        int i13 = i5 + i3 + i6 + (513088896 * i) + ((-1342203445) * i2);
        int i14 = i13 * i13;
        int i15 = (665020156 * i5) + 661520384 + (1303681286 * i3) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i6) + ((-771751936) * i) + (1382285312 * i2) + ((-350355456) * i14);
        int i16 = ((i5 * (-363642324)) - 614971735) + (i3 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i6 * (-363641803)) + (i * (-2127225984)) + (i2 * (-1080704249)) + (i14 * (-1523187712));
        switch (i15 + (i16 * i16 * (-227409920))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                List<PasswordPolicyResponse.UnavailablePasswordPolicy> list = (List) objArr[1];
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(list, "");
                onWarmupCompleted = CollectionsKt.emptyList();
                asBinder = list;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaMetadataCompat = addPolicy.MediaMetadataCompat();
                wie2 wie2Var = IAuthTabCallbackDefault;
                wie2Var.onExtraCallback();
                String strOnWarmupCompleted = wie2Var.onWarmupCompleted(new checkCanOpenLandingPage(PasswordPolicyResponse.UnavailablePasswordPolicy.Companion.serializer()), list);
                Object[] objArr2 = new Object[1];
                a(new int[]{-1552342949, 210728710, -1874252962, -1216947733, -1882155717, -599154463, 544395849, 1976130891, 36985387, -374223049, -838584197, 1488758008}, Color.argb(0, 0, 0, 0) + 23, objArr2);
                textRoundCornerProgressBarSavedState1MediaMetadataCompat.onNavigationEvent(((String) objArr2[0]).intern(), strOnWarmupCompleted);
                int i18 = getInterfaceDescriptor + 75;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 8:
                return asBinder(objArr);
            default:
                adInfo adinfo = (adInfo) objArr[0];
                int i20 = 2 % 2;
                int i21 = getInterfaceDescriptor + 63;
                IAuthTabCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adinfo);
                int i23 = IAuthTabCallbackStubProxy + 45;
                getInterfaceDescriptor = i23 % 128;
                int i24 = i23 % 2;
                return unitOnExtraCallbackWithResult;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Long l = (Long) objArr[0];
        Long l2 = (Long) objArr[1];
        getHostnameVerifierokhttp gethostnameverifierokhttp = (getHostnameVerifierokhttp) objArr[2];
        wasLastName waslastname = (wasLastName) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoOnNavigationEvent = onNavigationEvent(l, l2, gethostnameverifierokhttp, waslastname);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return jsonReaderErrorInfoOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(th);
        }
        onExtraCallbackWithResult(th);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(function1, obj);
        }
        asInterface(function1, obj);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 11;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getHostnameVerifierokhttp gethostnameverifierokhttp, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(gethostnameverifierokhttp, deserializeurinullablecollection);
        int i4 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(PasswordPolicyResponse passwordPolicyResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(passwordPolicyResponse);
        int i4 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(getHostnameVerifierokhttp gethostnameverifierokhttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(gethostnameverifierokhttp);
        int i4 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordPolicyResponse passwordPolicyResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(passwordPolicyResponse);
        }
        IAuthTabCallback(passwordPolicyResponse);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, obj}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -54571011, iIAuthTabCallback, 54571014, iIAuthTabCallback2);
        int i4 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(String str, flushed flushedVar) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{str, flushedVar}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1121818253, iIAuthTabCallback, 1121818259, iIAuthTabCallback2);
        int i4 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        asBinder(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(th);
        int i4 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordPolicyResponse passwordPolicyResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {passwordPolicyResponse};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iIAuthTabCallback3, objArr, iIAuthTabCallback4, 1735092881, iIAuthTabCallback, -1735092880, iIAuthTabCallback2);
        int i4 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(List list, String str, char c, JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(list, str, c, jsonReaderEmptyEOFException);
        int i4 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        int i4 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private DynamicFromArrayCompanion() {
    }

    public static final /* synthetic */ List onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return list;
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new int[]{-911923480, 1051155915, -1269170103, 696870174, -1540370164, -1942716554, -711450910, -1793736744, 487094305, 2067093477, 1813550297, 435412470}, AndroidCharacter.getMirror('0') - 27, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{-1552342949, 210728710, -1874252962, -1216947733, -1882155717, -599154463, 544395849, 1976130891, 36985387, -374223049, -838584197, 1488758008}, 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        onExtraCallbackWithResult = new DynamicFromArrayCompanion();
        IAuthTabCallbackDefault = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                return (Unit) DynamicFromArrayCompanion.IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{(adInfo) obj}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1326056221, iIAuthTabCallback, -1326056221, iIAuthTabCallback2);
            }
        }, 1, (Object) null);
        onExtraCallback = 8;
        int i = access100 + 83;
        access000 = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final onExtraCallbackWithResult IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = asInterface;
        int i5 = i2 + 119;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return onextracallbackwithresult;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback;
        private static char IAuthTabCallbackDefault;
        private static char IAuthTabCallbackStub;
        public static final onExtraCallback NOT_CONTAINS_PHONE_NUMBERS;
        public static final onExtraCallback NOT_CONTAINS_RRN_NUMBERS;
        public static final onExtraCallback NOT_FOUR_OR_MORE_CONSECUTIVE_NUMBERS;
        public static final onExtraCallback NOT_POPULAR_PASSWORD;
        public static final onExtraCallback NOT_THREE_OR_MORE_CONSECUTIVE_NUMBERS;
        public static final onExtraCallback NOT_THREE_OR_MORE_DUPLICATE_NUMBERS;
        public static final onExtraCallback NOT_THREE_OR_MORE_NUMBERS;
        private static int access100;
        private static char asBinder;
        private static int onExtraCallback;
        private static short[] onExtraCallbackWithResult;
        private static byte[] onNavigationEvent;
        private static char onTransact;
        private static int onWarmupCompleted;
        private final Function2<String, Character, Boolean> checker;
        private final Exception error;
        private static final byte[] $$a = {51, -39, 98, -44};
        private static final int $$b = 158;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int access000 = 1;
        private static int asInterface = 0;
        private static int IAuthTabCallbackStubProxy = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, int r7, short r8) {
            /*
                int r6 = r6 * 2
                int r0 = 1 - r6
                int r7 = r7 * 2
                int r7 = 115 - r7
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r1 = o.DynamicFromArrayCompanion.onExtraCallback.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L2c
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2c:
                int r8 = r8 + 1
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DynamicFromArrayCompanion.onExtraCallback.$$c(short, int, short):java.lang.String");
        }

        public static /* synthetic */ boolean $r8$lambda$4Yt1fO3wLty7r8ldnVlO2IMmWUM(String str, char c) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 107;
            IAuthTabCallbackStubProxy = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                _init_$lambda$4(str, c);
                throw null;
            }
            boolean z_init_$lambda$4 = _init_$lambda$4(str, c);
            int i3 = IAuthTabCallbackStubProxy + 121;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return z_init_$lambda$4;
            }
            obj.hashCode();
            throw null;
        }

        /* renamed from: $r8$lambda$5nwf2-NqOdBBSdG8_INlkPetytU, reason: not valid java name */
        public static /* synthetic */ boolean m0$r8$lambda$5nwf2NqOdBBSdG8_INlkPetytU(String str, char c) {
            int i = 2 % 2;
            int i2 = asInterface + 63;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            boolean z_init_$lambda$2 = _init_$lambda$2(str, c);
            int i4 = asInterface + 91;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                return z_init_$lambda$2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: $r8$lambda$BBQFrX-iPi3rxrIBoxHMb7gYzUA, reason: not valid java name */
        public static /* synthetic */ boolean m1$r8$lambda$BBQFrXiPi3rxrIBoxHMb7gYzUA(String str, char c) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 1;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            boolean z_init_$lambda$1 = _init_$lambda$1(str, c);
            if (i3 == 0) {
                int i4 = 48 / 0;
            }
            return z_init_$lambda$1;
        }

        /* renamed from: $r8$lambda$IYxYoBw73kVlqi5oz-P-99xO8ow, reason: not valid java name */
        public static /* synthetic */ boolean m2$r8$lambda$IYxYoBw73kVlqi5ozP99xO8ow(String str, char c) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 29;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            boolean z_init_$lambda$0 = _init_$lambda$0(str, c);
            if (i3 != 0) {
                int i4 = 57 / 0;
            }
            int i5 = asInterface + 85;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return z_init_$lambda$0;
        }

        /* renamed from: $r8$lambda$VZlqevlJmvog9QFNZ-dULnnWWEY, reason: not valid java name */
        public static /* synthetic */ boolean m3$r8$lambda$VZlqevlJmvog9QFNZdULnnWWEY(String str, char c) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 89;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            boolean z_init_$lambda$3 = _init_$lambda$3(str, c);
            int i4 = asInterface + 125;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return z_init_$lambda$3;
        }

        /* renamed from: $r8$lambda$kMpbyY-uslKoiE6xBOSynv7ZYnk, reason: not valid java name */
        public static /* synthetic */ boolean m4$r8$lambda$kMpbyYuslKoiE6xBOSynv7ZYnk(String str, char c) {
            int i = 2 % 2;
            int i2 = asInterface + 69;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            boolean z_init_$lambda$6 = _init_$lambda$6(str, c);
            int i4 = asInterface + 67;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                return z_init_$lambda$6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ boolean $r8$lambda$z7Ta_xMbov_NG9jsMbOfXG2GjJQ(String str, char c) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 29;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                _init_$lambda$5(str, c);
                throw null;
            }
            boolean z_init_$lambda$5 = _init_$lambda$5(str, c);
            int i3 = asInterface + 101;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return z_init_$lambda$5;
        }

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 47;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {NOT_CONTAINS_PHONE_NUMBERS, NOT_CONTAINS_RRN_NUMBERS, NOT_THREE_OR_MORE_NUMBERS, NOT_THREE_OR_MORE_DUPLICATE_NUMBERS, NOT_THREE_OR_MORE_CONSECUTIVE_NUMBERS, NOT_FOUR_OR_MORE_CONSECUTIVE_NUMBERS, NOT_POPULAR_PASSWORD};
            int i5 = i3 + 79;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 3;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 31;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = asInterface + 99;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = asInterface + 77;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 9;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            int i4 = 32 / 0;
            return (onExtraCallback[]) onextracallbackArr.clone();
        }

        private onExtraCallback(String str, int i, Exception exc, Function2 function2) {
            this.error = exc;
            this.checker = function2;
        }

        public final Function2<String, Character, Boolean> getChecker() {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            Function2<String, Character, Boolean> function2 = this.checker;
            int i5 = i3 + 55;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return function2;
        }

        public final Exception getError() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 119;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Exception exc = this.error;
            int i4 = i2 + 73;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return exc;
            }
            throw null;
        }

        static {
            access100 = 0;
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            a((short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 33), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1628815524, (-1896149456) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-20121) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(new char[]{29526, 35987, 51030, 58456, 24336, 5861, 18077, 61930, 413, 16657, 43913, 16433, 15069, 15521, 1097, 29374}, 16 - TextUtils.getOffsetBefore("", 0), objArr2);
            NOT_CONTAINS_PHONE_NUMBERS = new onExtraCallback(strIntern, 0, new IllegalArgumentException(((String) objArr2[0]).intern()), new Function2() { // from class: viva.republica.toss.password.PasswordPolicyManager$PasswordPolicy$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DynamicFromArrayCompanion.onExtraCallback.m2$r8$lambda$IYxYoBw73kVlqi5ozP99xO8ow((String) obj, ((Character) obj2).charValue()));
                }
            });
            Object[] objArr3 = new Object[1];
            a((short) ((-124) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) (KeyEvent.getMaxKeyCode() >> 16), (-1628815499) - TextUtils.indexOf("", "", 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 1896149456, TextUtils.indexOf((CharSequence) "", '0', 0) - 20122, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new char[]{27821, 12488, 48070, 1552, 37264, 9125, 413, 16657, 43913, 16433, 15069, 15521, 1097, 29374}, 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
            NOT_CONTAINS_RRN_NUMBERS = new onExtraCallback(strIntern2, 1, new IllegalArgumentException(((String) objArr4[0]).intern()), new Function2() { // from class: viva.republica.toss.password.PasswordPolicyManager$PasswordPolicy$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DynamicFromArrayCompanion.onExtraCallback.m1$r8$lambda$BBQFrXiPi3rxrIBoxHMb7gYzUA((String) obj, ((Character) obj2).charValue()));
                }
            });
            Object[] objArr5 = new Object[1];
            b(new char[]{22878, 24558, 26415, 14432, 44557, 4311, 37550, 5306, 42021, 10999, 58619, 21412, 45498, 64254, 58619, 21412, 42021, 10999, 9212, 59095, 32858, 48302, 42411, 36923, 18851, 17533}, TextUtils.indexOf("", "", 0, 0) + 25, objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((short) ((ViewConfiguration.getTouchSlop() >> 8) - 18), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), Process.getGidForName("") - 1628815475, (-1896100098) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-20124) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
            NOT_THREE_OR_MORE_NUMBERS = new onExtraCallback(strIntern3, 2, new IllegalArgumentException(((String) objArr6[0]).intern()), new Function2() { // from class: viva.republica.toss.password.PasswordPolicyManager$PasswordPolicy$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DynamicFromArrayCompanion.onExtraCallback.m0$r8$lambda$5nwf2NqOdBBSdG8_INlkPetytU((String) obj, ((Character) obj2).charValue()));
                }
            });
            Object[] objArr7 = new Object[1];
            b(new char[]{22878, 24558, 26415, 14432, 44557, 4311, 37550, 5306, 42021, 10999, 58619, 21412, 45498, 64254, 58619, 21412, 42021, 10999, 59977, 60835, 56119, 15695, 64709, 29261, 65435, 51202, 42021, 10999, 9212, 59095, 32858, 48302, 42411, 36923, 18851, 17533}, View.combineMeasuredStates(0, 0) + 35, objArr7);
            String strIntern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            b(new char[]{13360, 64635, 18891, 9070, 52498, 14193, 14678, 61160, 7588, 14196, 63504, 33566, 12587, 60256, 31371, 22622, 49521, 9503, 413, 16657, 43913, 16433, 15069, 15521, 1097, 29374}, 26 - (Process.myPid() >> 22), objArr8);
            NOT_THREE_OR_MORE_DUPLICATE_NUMBERS = new onExtraCallback(strIntern4, 3, new IllegalArgumentException(((String) objArr8[0]).intern()), new Function2() { // from class: viva.republica.toss.password.PasswordPolicyManager$PasswordPolicy$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DynamicFromArrayCompanion.onExtraCallback.m3$r8$lambda$VZlqevlJmvog9QFNZdULnnWWEY((String) obj, ((Character) obj2).charValue()));
                }
            });
            Object[] objArr9 = new Object[1];
            a((short) (65 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0) - 1628815453, (-1896149455) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) - 20110, objArr9);
            String strIntern5 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            a((short) ((-86) - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) - 1628815418, TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1896141317, TextUtils.getOffsetBefore("", 0) - 20123, objArr10);
            NOT_THREE_OR_MORE_CONSECUTIVE_NUMBERS = new onExtraCallback(strIntern5, 4, new IllegalArgumentException(((String) objArr10[0]).intern()), new Function2() { // from class: viva.republica.toss.password.PasswordPolicyManager$PasswordPolicy$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DynamicFromArrayCompanion.onExtraCallback.$r8$lambda$4Yt1fO3wLty7r8ldnVlO2IMmWUM((String) obj, ((Character) obj2).charValue()));
                }
            });
            Object[] objArr11 = new Object[1];
            b(new char[]{22878, 24558, 26415, 14432, 38861, 26741, 21290, 7692, 38818, 57198, 57570, 39427, 13010, 46265, 37550, 5306, 62627, 61411, 62562, 35584, 59785, 28451, 19485, 24103, 37783, 3606, 17486, 2335, 15051, 60707, 48524, 8426, 10577, 46592, 58333, 51219}, 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr11);
            String strIntern6 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            b(new char[]{43858, 54903, 46543, 56376, 44491, 61252, 20984, 13976, 35252, 12390, 43560, 61000, 18891, 9070, 52498, 14193, 28827, 65083, 41654, 52199, 6751, 49861, 17916, 45114, 36242, 11515}, 24 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr12);
            NOT_FOUR_OR_MORE_CONSECUTIVE_NUMBERS = new onExtraCallback(strIntern6, 5, new IllegalArgumentException(((String) objArr12[0]).intern()), new Function2() { // from class: viva.republica.toss.password.PasswordPolicyManager$PasswordPolicy$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DynamicFromArrayCompanion.onExtraCallback.$r8$lambda$z7Ta_xMbov_NG9jsMbOfXG2GjJQ((String) obj, ((Character) obj2).charValue()));
                }
            });
            Object[] objArr13 = new Object[1];
            a((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 84), (byte) Color.argb(0, 0, 0, 0), (-1628815395) - TextUtils.indexOf("", "", 0, 0), (-1896149456) - KeyEvent.normalizeMetaState(0), (-20127) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
            String strIntern7 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            b(new char[]{3597, 56581, 35430, 41038, 20010, 12594, 29356, 44324, 52463, 529, 51889, 25883, 6485, 41998, 17281, 59084, 40737, 56909, 13217, 48311, 28827, 65083, 41654, 52199, 6751, 49861, 17916, 45114, 36242, 11515}, 29 - View.combineMeasuredStates(0, 0), objArr14);
            NOT_POPULAR_PASSWORD = new onExtraCallback(strIntern7, 6, new IllegalArgumentException(((String) objArr14[0]).intern()), new Function2() { // from class: viva.republica.toss.password.PasswordPolicyManager$PasswordPolicy$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DynamicFromArrayCompanion.onExtraCallback.m4$r8$lambda$kMpbyYuslKoiE6xBOSynv7ZYnk((String) obj, ((Character) obj2).charValue()));
                }
            });
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = access000 + 55;
            access100 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
        
            if (kotlin.text.StringsKt.contains$default(r6, kotlin.text.StringsKt.take(r0, 4), false, 2, (java.lang.Object) null) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            if (kotlin.text.StringsKt.contains$default(r6, kotlin.text.StringsKt.takeLast(r0, 4), false, 2, (java.lang.Object) null) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6, kotlin.text.StringsKt.take(r0, 4)) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        
            r2 = o.DynamicFromArrayCompanion.onExtraCallback.IAuthTabCallbackStubProxy + 21;
            o.DynamicFromArrayCompanion.onExtraCallback.asInterface = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if ((r2 % 2) == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6, kotlin.text.StringsKt.takeLast(r0, 5)) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6, kotlin.text.StringsKt.takeLast(r0, 4)) != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
        
            if (r6.length() >= 3) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
        
            if (r6.length() >= 6) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final boolean _init_$lambda$0(java.lang.String r6, char r7) {
            /*
                r7 = 2
                int r0 = r7 % r7
                int r0 = o.DynamicFromArrayCompanion.onExtraCallback.asInterface
                int r0 = r0 + 27
                int r1 = r0 % 128
                o.DynamicFromArrayCompanion.onExtraCallback.IAuthTabCallbackStubProxy = r1
                int r0 = r0 % r7
                r1 = 1
                java.lang.String r2 = ""
                r3 = 0
                r4 = 4
                if (r0 != 0) goto L31
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
                o.DynamicFromArrayCompanion r0 = o.DynamicFromArrayCompanion.onExtraCallbackWithResult
                o.DynamicFromArrayCompanion$onExtraCallbackWithResult r0 = r0.IAuthTabCallback()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.String r0 = r0.onExtraCallbackWithResult()
                r2 = 102(0x66, float:1.43E-43)
                java.lang.String r0 = kotlin.text.StringsKt.takeLast(r0, r2)
                int r2 = r6.length()
                r5 = 3
                if (r2 < r5) goto L65
                goto L4e
            L31:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
                o.DynamicFromArrayCompanion r0 = o.DynamicFromArrayCompanion.onExtraCallbackWithResult
                o.DynamicFromArrayCompanion$onExtraCallbackWithResult r0 = r0.IAuthTabCallback()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.String r0 = r0.onExtraCallbackWithResult()
                r2 = 8
                java.lang.String r0 = kotlin.text.StringsKt.takeLast(r0, r2)
                int r2 = r6.length()
                r5 = 6
                if (r2 < r5) goto L65
            L4e:
                java.lang.String r2 = kotlin.text.StringsKt.take(r0, r4)
                r5 = 0
                boolean r2 = kotlin.text.StringsKt.contains$default(r6, r2, r3, r7, r5)
                if (r2 != 0) goto L64
                java.lang.String r0 = kotlin.text.StringsKt.takeLast(r0, r4)
                boolean r6 = kotlin.text.StringsKt.contains$default(r6, r0, r3, r7, r5)
                if (r6 != 0) goto L64
                return r1
            L64:
                return r3
            L65:
                java.lang.String r2 = kotlin.text.StringsKt.take(r0, r4)
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
                if (r2 != 0) goto L91
                int r2 = o.DynamicFromArrayCompanion.onExtraCallback.IAuthTabCallbackStubProxy
                int r2 = r2 + 21
                int r5 = r2 % 128
                o.DynamicFromArrayCompanion.onExtraCallback.asInterface = r5
                int r2 = r2 % r7
                if (r2 == 0) goto L86
                r7 = 5
                java.lang.String r7 = kotlin.text.StringsKt.takeLast(r0, r7)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                if (r6 != 0) goto L91
                goto L90
            L86:
                java.lang.String r7 = kotlin.text.StringsKt.takeLast(r0, r4)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                if (r6 != 0) goto L91
            L90:
                return r1
            L91:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DynamicFromArrayCompanion.onExtraCallback._init_$lambda$0(java.lang.String, char):boolean");
        }

        private static final boolean _init_$lambda$1(String str, char c) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = DynamicFromArrayCompanion.onExtraCallbackWithResult.IAuthTabCallback();
            Intrinsics.checkNotNull(onextracallbackwithresultIAuthTabCallback);
            String strOnNavigationEvent = onextracallbackwithresultIAuthTabCallback.onNavigationEvent();
            if (strOnNavigationEvent.length() != 6) {
                Object[] objArr = new Object[1];
                b(new char[]{32284, 32470, 54639, 9128, 62602, 13056, 57847, 51265, 15232, 22707, 22319, 45505, 36242, 11515}, Drawable.resolveOpacity(0, 0) + 13, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            Object obj = null;
            if (str.length() < 6) {
                return !StringsKt.contains$default(strOnNavigationEvent, str, false, 2, (Object) null);
            }
            boolean zAreEqual = Intrinsics.areEqual(str, strOnNavigationEvent);
            boolean zContains$default = StringsKt.contains$default(str, StringsKt.take(strOnNavigationEvent, 4), false, 2, (Object) null);
            boolean zContains$default2 = StringsKt.contains$default(str, StringsKt.takeLast(strOnNavigationEvent, 4), false, 2, (Object) null);
            if (!zAreEqual) {
                int i2 = asInterface + 35;
                IAuthTabCallbackStubProxy = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (!zContains$default && !zContains$default2) {
                    return true;
                }
            }
            int i3 = asInterface + 33;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        private static final boolean _init_$lambda$2(String str, char c) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 109;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                if (StringsKt.toSet(str).size() < 5) {
                    return false;
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                if (StringsKt.toSet(str).size() < 3) {
                    return false;
                }
            }
            int i3 = asInterface + 49;
            IAuthTabCallbackStubProxy = i3 % 128;
            return i3 % 2 != 0;
        }

        private static final boolean _init_$lambda$3(String str, char c) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 41;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = new Object[1];
            b(new char[]{23868, 21385, 22601, 58430}, 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((short) (10 - KeyEvent.normalizeMetaState(0)), (byte) TextUtils.indexOf("", "", 0), (-1628815376) + (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-1896149484) - KeyEvent.normalizeMetaState(0), (-20144) - View.getDefaultSize(0, 0), objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a((short) ((-75) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1628815374) - (ViewConfiguration.getTapTimeout() >> 16), (-1896149483) - (ViewConfiguration.getDoubleTapTimeout() >> 16), MotionEvent.axisFromString("") - 20143, objArr3);
            String strIntern3 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new char[]{45295, 28252, 153, 3705}, TextUtils.getOffsetBefore("", 0) + 3, objArr4);
            String strIntern4 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a((short) (ExpandableListView.getPackedPositionGroup(0L) + 120), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1628815373, (-1896149481) - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 20145, objArr5);
            String strIntern5 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 84), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 1628815370, (-1896149479) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 20144, objArr6);
            String strIntern6 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            a((short) ((-4) - ((Process.getThreadPriority(0) + 20) >> 6)), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (-1628815367) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) - 1896149479, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 20144, objArr7);
            String strIntern7 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a((short) (97 - TextUtils.indexOf((CharSequence) "", '0')), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.green(0) - 1628815366, (-1896149478) - TextUtils.getOffsetAfter("", 0), (-20144) - View.getDefaultSize(0, 0), objArr8);
            String strIntern8 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            b(new char[]{13284, 54520, 55515, 13833}, (ViewConfiguration.getEdgeSlop() >> 16) + 3, objArr9);
            String strIntern9 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            b(new char[]{3352, 51017, 19821, 46315}, 3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr10);
            Iterator it = clearFaultAdjacentMetadata.onExtraCallback(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, ((String) objArr10[0]).intern()}).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (StringsKt.contains$default(str, (String) next, false, 2, (Object) null)) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                int i4 = IAuthTabCallbackStubProxy + 105;
                asInterface = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = IAuthTabCallbackStubProxy + 23;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        private static final boolean _init_$lambda$4(String str, char c) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 105;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = new Object[1];
            b(new char[]{29359, 37344, 19301, 32414}, 3 - TextUtils.getCapsMode("", 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((short) (TextUtils.getOffsetBefore("", 0) + 84), (byte) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", "", 0, 0) - 1628815364, (-1896149486) - TextUtils.lastIndexOf("", '0'), (-20144) - Color.red(0), objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{46543, 56376, 153, 3705}, 3 - TextUtils.indexOf("", "", 0), objArr3);
            String strIntern3 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new char[]{43556, 43922, 1801, 25025}, 3 - Color.argb(0, 0, 0, 0), objArr4);
            String strIntern4 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            b(new char[]{52834, 14822, 46237, 44928}, Color.rgb(0, 0, 0) + 16777219, objArr5);
            String strIntern5 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((short) (17 - KeyEvent.normalizeMetaState(0)), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) - 1628815362, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1896149481, (-20144) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
            String strIntern6 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            a((short) (119 - View.combineMeasuredStates(0, 0)), (byte) ((-1) - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionChild(0L) - 1628815359, (-1896149480) - TextUtils.indexOf("", ""), (-20145) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr7);
            String strIntern7 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a((short) (106 - Color.alpha(0)), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-1628815358) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1896149478) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-20144) - View.MeasureSpec.getSize(0), objArr8);
            String strIntern8 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            a((short) (120 - TextUtils.indexOf("", "")), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1628815357, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1896149479, (Process.myTid() >> 22) - 20144, objArr9);
            String strIntern9 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            a((short) ((-20) - Gravity.getAbsoluteGravity(0, 0)), (byte) Gravity.getAbsoluteGravity(0, 0), (-1628815354) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') - 1896149485, (-20144) - KeyEvent.getDeadChar(0, 0), objArr10);
            String strIntern10 = ((String) objArr10[0]).intern();
            Object[] objArr11 = new Object[1];
            a((short) (36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.getDeadChar(0, 0) - 1628815352, Color.red(0) - 1896149477, View.resolveSizeAndState(0, 0, 0) - 20144, objArr11);
            String strIntern11 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            b(new char[]{57197, 16740, 46237, 44928}, (Process.myPid() >> 22) + 3, objArr12);
            String strIntern12 = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            b(new char[]{57326, 6198, 1801, 25025}, Color.blue(0) + 3, objArr13);
            String strIntern13 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            a((short) ((-121) - ImageFormat.getBitsPerPixel(0)), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), View.getDefaultSize(0, 0) - 1628815350, (-1896149480) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-20143) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr14);
            String strIntern14 = ((String) objArr14[0]).intern();
            Object[] objArr15 = new Object[1];
            b(new char[]{44198, 58972, 29496, 58656}, KeyEvent.normalizeMetaState(0) + 3, objArr15);
            String strIntern15 = ((String) objArr15[0]).intern();
            Object[] objArr16 = new Object[1];
            a((short) ((-123) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1628815348, (-1896149482) - View.MeasureSpec.makeMeasureSpec(0, 0), (-20144) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr16);
            String strIntern16 = ((String) objArr16[0]).intern();
            Object[] objArr17 = new Object[1];
            b(new char[]{51559, 36056, 22601, 58430}, 3 - KeyEvent.normalizeMetaState(0), objArr17);
            String strIntern17 = ((String) objArr17[0]).intern();
            Object[] objArr18 = new Object[1];
            a((short) (TextUtils.indexOf("", "", 0, 0) - 78), (byte) ((-16777216) - Color.rgb(0, 0, 0)), (-1628815346) - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 1896149483, (-20144) - Color.argb(0, 0, 0, 0), objArr18);
            Iterator it = clearFaultAdjacentMetadata.onExtraCallback(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, strIntern10, strIntern11, strIntern12, strIntern13, strIntern14, strIntern15, strIntern16, strIntern17, ((String) objArr18[0]).intern()}).iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (StringsKt.contains$default(str, (String) next, false, 2, (Object) null)) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                return false;
            }
            int i4 = asInterface;
            int i5 = i4 + 77;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 111;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        private static final boolean _init_$lambda$5(String str, char c) throws Throwable {
            Object next;
            int i = 2 % 2;
            int i2 = asInterface + 65;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = new Object[1];
            b(new char[]{29359, 37344, 46543, 56376}, ExpandableListView.getPackedPositionGroup(0L) + 4, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(new char[]{57131, 40882, 43556, 43922}, (ViewConfiguration.getTapTimeout() >> 16) + 4, objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{46543, 56376, 52834, 14822}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr3);
            String strIntern3 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new char[]{43556, 43922, 51199, 61127}, AndroidCharacter.getMirror('0') - ',', objArr4);
            String strIntern4 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a((short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 69), (byte) TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionType(0L) - 1628815344, Color.argb(0, 0, 0, 0) - 1896149482, (-20143) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
            String strIntern5 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            b(new char[]{51199, 61127, 64271, 39210}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, objArr6);
            String strIntern6 = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            a((short) (35 - TextUtils.getOffsetAfter("", 0)), (byte) Color.argb(0, 0, 0, 0), (-1628815341) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) - 1896149479, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 20143, objArr7);
            String strIntern7 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a((short) (74 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) View.resolveSizeAndState(0, 0, 0), (-1628815338) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionType(0L) - 1896149479, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 20143, objArr8);
            String strIntern8 = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            a((short) (Color.blue(0) - 27), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) - 1628815335, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1896149487, (-20143) - (Process.myPid() >> 22), objArr9);
            String strIntern9 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            b(new char[]{44096, 57884, 57326, 6198}, TextUtils.indexOf("", "", 0, 0) + 4, objArr10);
            String strIntern10 = ((String) objArr10[0]).intern();
            Object[] objArr11 = new Object[1];
            b(new char[]{57197, 16740, 41613, 3589}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr11);
            String strIntern11 = ((String) objArr11[0]).intern();
            Object[] objArr12 = new Object[1];
            a((short) (45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1628815332) - TextUtils.indexOf("", ""), (-1896149479) - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 20144, objArr12);
            String strIntern12 = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            b(new char[]{41613, 3589, 790, 52627}, Color.red(0) + 4, objArr13);
            String strIntern13 = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            b(new char[]{44198, 58972, 51559, 36056}, 4 - ((Process.getThreadPriority(0) + 20) >> 6), objArr14);
            String strIntern14 = ((String) objArr14[0]).intern();
            Object[] objArr15 = new Object[1];
            a((short) (TextUtils.indexOf((CharSequence) "", '0') - 2), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1645592545) - Color.rgb(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1896149482, Color.blue(0) - 20143, objArr15);
            String strIntern15 = ((String) objArr15[0]).intern();
            Object[] objArr16 = new Object[1];
            b(new char[]{51559, 36056, 7483, 34411}, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr16);
            Iterator it = clearFaultAdjacentMetadata.onExtraCallback(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, strIntern10, strIntern11, strIntern12, strIntern13, strIntern14, strIntern15, ((String) objArr16[0]).intern()}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.contains$default(str, (String) next, false, 2, (Object) null)) {
                    break;
                }
            }
            if (next != null) {
                return false;
            }
            int i4 = IAuthTabCallbackStubProxy + 63;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        private static final boolean _init_$lambda$6(String str, char c) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            List listOnExtraCallbackWithResult = DynamicFromArrayCompanion.onExtraCallbackWithResult();
            if (listOnExtraCallbackWithResult == null) {
                int i2 = asInterface + 91;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                listOnExtraCallbackWithResult = CollectionsKt.emptyList();
            }
            boolean z = !listOnExtraCallbackWithResult.contains(str);
            int i4 = IAuthTabCallbackStubProxy + 81;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return z;
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
                int i4 = 58224;
                int i5 = i3;
                while (i5 < 16) {
                    int i6 = $11 + 31;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(asBinder);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(i3, i3, i3);
                            int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                            int maximumDrawingCacheSize = 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSizeAndState, i10, maximumDrawingCacheSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 9 - ((byte) KeyEvent.getModifierMetaStateMask()), 12434 - (ViewConfiguration.getLongPressTimeout() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5++;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16014), 14 - View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = $10 + 95;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            boolean z;
            int i5 = 2;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (Process.myTid() >> 22)), 42 - TextUtils.getTrimmedLength(""), 22439 - View.resolveSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $10 + 11;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if ((i4 ^ 1) == 0) {
                    byte[] bArr = onNavigationEvent;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $11 + 35;
                            $10 = i10 % 128;
                            if (i10 % i5 != 0) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                    if (objOnExtraCallback2 == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.getDefaultSize(0, 0)), Drawable.resolveOpacity(0, 0) + 55, 2167 - Color.blue(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 12843), 55 - (ViewConfiguration.getWindowTouchSlop() >> 8), Process.getGidForName("") + 2168, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i9++;
                            }
                            i5 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 43424), 42 - (KeyEvent.getMaxKeyCode() >> 16), 22487 - AndroidCharacter.getMirror('0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i11 = $11 + 29;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + ((i4 ^ 1) ^ 1);
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 86 - View.getDefaultSize(0, 0), 9566 - TextUtils.lastIndexOf("", '0', 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int i13 = $10 + 29;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            int i16 = $10 + 91;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        z = true;
                    } else {
                        int i18 = $11 + 101;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            int i19 = 5 % 2;
                        }
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

        static void onWarmupCompleted() {
            onWarmupCompleted = -984475476;
            IAuthTabCallback = -1538812229;
            onExtraCallback = -717018602;
            onExtraCallbackWithResult = new short[]{-10198, -10202, -10196, -10210, -10223, -10208, -10216, -10189, -10224, -10200, -10208, -10223, -10214, -10203, -10194, -10194, -10207, -10234, -10193, -10200, -10203, -10227, -10204, -10194, -10198, -10122, -10110, -10104, -10118, -10115, -10100, -10140, -10106, -10127, -10123, -10120, -10111, -10102, -10102, -10099, -10142, -10101, -10124, -10111, -10135, -10112, -10102, -10122, -7772, -8858, 8262, 11154, -10539, -8697, 6294, -6279, 8535, 8046, -29666, 29683, -10195, -24898, 10742, -8833, 6677, -24910, -8530, 27358, -24610, 12122, 10184, 10180, 10186, 10172, 10175, 10190, 10150, 10193, 10150, 10180, 10172, 10166, 10201, 10165, 10169, 10188, 10166, 10179, 10155, 10193, 10170, 10186, 10185, 10149, 10180, 10186, 10151, 10193, 10167, 10170, 10177, 10171, 10172, 10178, 10188, 10184, -7688, -9922, -10164, 7668, -6570, 6726, -7306, 7462, -24846, 10826, -8781, 6761, -27566, 10989, 9211, 7726, -28558, 13234, 29917, -1996, -10145, -10145, 14439, 10133, 10150, 10155, 10151, 10147, 10165, 10132, 10132, 10160, 10164, 10152, 10154, 10168, 10148, 10146, 10132, 10174, 10168, 10148, 10238, 10238, -10173, -10173, 10112, 10112, 10148, 10148, -10228, -10228, 10134, 10134, 10149, 10149, 10232, 10232, 10114, 10114, 10143, 10143, 10103, 10113, -10213, -10219, 10195, 10195, -10113, -10113, -10126, -10126, -10171, -10171, -10162, -10162, -10162, 10198, 10198, 10198, 10149, 10175, 10175, -10222, -10222, -10196, 10203, 10203, 10203, -10230, -10230, -10230, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232, -10232};
            onTransact = (char) 46950;
            IAuthTabCallbackDefault = (char) 60268;
            IAuthTabCallbackStub = (char) 65089;
            asBinder = (char) 64596;
        }
    }

    public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<PasswordPolicyResponse> apply(writeRaw<BaseApiResponse<PasswordPolicyResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentDialog(new Function1<BaseApiResponse<PasswordPolicyResponse>, deserializeIp<? extends PasswordPolicyResponse>>() { // from class: o.DynamicFromArrayCompanion.IAuthTabCallback.3
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends PasswordPolicyResponse> invoke(BaseApiResponse<PasswordPolicyResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = PasswordPolicyResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<PasswordPolicyResponse> apply(writeRaw<BaseApiResponse<PasswordPolicyResponse>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentDialog(new Function1<BaseApiResponse<PasswordPolicyResponse>, deserializeIp<? extends PasswordPolicyResponse>>() { // from class: o.DynamicFromArrayCompanion.onWarmupCompleted.2
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends PasswordPolicyResponse> invoke(BaseApiResponse<PasswordPolicyResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = PasswordPolicyResponse.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DynamicFromArrayCompanion dynamicFromArrayCompanion = (DynamicFromArrayCompanion) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        Long l = (Long) objArr[2];
        Long l2 = (Long) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0 ? (iIntValue & 2) != 0 : (iIntValue & 4) != 0) {
            int i4 = i3 + 89;
            int i5 = i4 % 128;
            IAuthTabCallbackStubProxy = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 47;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 3;
            }
            l = null;
        }
        if ((iIntValue & 4) != 0) {
            int i9 = getInterfaceDescriptor + 25;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            l2 = null;
        }
        return dynamicFromArrayCompanion.onNavigationEvent(onextracallbackwithresult, l, l2);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 54 / 0;
        return null;
    }

    private static final Unit IAuthTabCallback(PasswordPolicyResponse passwordPolicyResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted = (List) PasswordPolicyResponse.IAuthTabCallback(35058852, iOnWarmupCompleted, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -35058851, new Object[]{passwordPolicyResponse}, iOnWarmupCompleted3);
        asBinder = passwordPolicyResponse.IAuthTabCallbackStub();
        setTestMode.onExtraCallback.onExtraCallback(accesssetIndexp.IAuthTabCallback(passwordPolicyResponse.IAuthTabCallback()));
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final wasLastName onNavigationEvent(@NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable Long l, @Nullable Long l2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        asInterface = onextracallbackwithresult;
        shouldAutoplay shouldautoplayNewSessionWithExtras = AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras();
        if (!zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            int i4 = IAuthTabCallbackStubProxy + 19;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            l2 = null;
        }
        writeRaw<BaseApiResponse<PasswordPolicyResponse>> writerawOnNavigationEvent = shouldautoplayNewSessionWithExtras.onNavigationEvent(l, l2);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return DynamicFromArrayCompanion.onExtraCallbackWithResult((PasswordPolicyResponse) obj);
            }
        };
        writeRaw writerawOnNavigationEvent2 = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda16
            public final void accept(Object obj) throws Throwable {
                DynamicFromArrayCompanion.onExtraCallbackWithResult(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return DynamicFromArrayCompanion.onExtraCallback((Throwable) obj);
            }
        };
        wasLastName waslastnameBI_ = writerawOnNavigationEvent2.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda18
            public final void accept(Object obj) {
                DynamicFromArrayCompanion.onWarmupCompleted(function12, obj);
            }
        }).bI_();
        Intrinsics.checkNotNullExpressionValue(waslastnameBI_, "");
        return waslastnameBI_;
    }

    private static final Unit onNavigationEvent(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new int[]{-911923480, 1051155915, -1269170103, 696870174, -1540370164, -1942716554, -711450910, -1793736744, 487094305, 2067093477, 1813550297, 435412470}, 84 % View.resolveSize(0, 1), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1}, new int[]{29, 14, 81, 0}, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), th, (Map) null, 85, (Object) null);
        } else {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr3 = new Object[1];
            a(new int[]{-911923480, 1051155915, -1269170103, 696870174, -1540370164, -1942716554, -711450910, -1793736744, 487094305, 2067093477, 1813550297, 435412470}, View.resolveSize(0, 0) + 21, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1}, new int[]{29, 14, 81, 0}, objArr4);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray2, strIntern2, ((String) objArr4[0]).intern(), th, (Map) null, 8, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(PasswordPolicyResponse passwordPolicyResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            onWarmupCompleted = (List) PasswordPolicyResponse.IAuthTabCallback(35058852, iOnWarmupCompleted, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -35058851, new Object[]{passwordPolicyResponse}, iOnWarmupCompleted3);
            asBinder = passwordPolicyResponse.IAuthTabCallbackStub();
            setTestMode.onExtraCallback.onExtraCallback(accesssetIndexp.IAuthTabCallback(passwordPolicyResponse.IAuthTabCallback()));
            return Unit.INSTANCE;
        }
        int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted = (List) PasswordPolicyResponse.IAuthTabCallback(35058852, iOnWarmupCompleted4, iOnWarmupCompleted5, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -35058851, new Object[]{passwordPolicyResponse}, iOnWarmupCompleted6);
        asBinder = passwordPolicyResponse.IAuthTabCallbackStub();
        setTestMode.onExtraCallback.onExtraCallback(accesssetIndexp.IAuthTabCallback(passwordPolicyResponse.IAuthTabCallback()));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final wasLastName IAuthTabCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        asInterface = onextracallbackwithresult;
        writeRaw<BaseApiResponse<PasswordPolicyResponse>> writerawOnExtraCallbackWithResult = AdSettingsIntegrationErrorMode.onNavigationEvent.postMessage().onExtraCallbackWithResult(j);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new asInterface(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        wasLastName waslastnameBI_ = writerawIAuthTabCallback.onNavigationEvent(new PasswordPolicyManager$.ExternalSyntheticLambda12(new PasswordPolicyManager$.ExternalSyntheticLambda11())).onWarmupCompleted(new PasswordPolicyManager$.ExternalSyntheticLambda14(new PasswordPolicyManager$.ExternalSyntheticLambda13())).bI_();
        Intrinsics.checkNotNullExpressionValue(waslastnameBI_, "");
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return waslastnameBI_;
    }

    private static final Unit asInterface(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new int[]{-911923480, 1051155915, -1269170103, 696870174, -1540370164, -1942716554, -711450910, -1793736744, 487094305, 2067093477, 1813550297, 435412470}, 41 - KeyEvent.getDeadChar(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1}, new int[]{29, 14, 81, 0}, objArr2);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), th, (Map) null, 73, (Object) null);
        } else {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr3 = new Object[1];
            a(new int[]{-911923480, 1051155915, -1269170103, 696870174, -1540370164, -1942716554, -711450910, -1793736744, 487094305, 2067093477, 1813550297, 435412470}, KeyEvent.getDeadChar(0, 0) + 21, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1}, new int[]{29, 14, 81, 0}, objArr4);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray2, strIntern2, ((String) objArr4[0]).intern(), th, (Map) null, 8, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaMetadataCompat = addPolicy.MediaMetadataCompat();
        Object[] objArr = new Object[1];
        a(new int[]{-1552342949, 210728710, -1874252962, -1216947733, -1882155717, -599154463, 544395849, 1976130891, 36985387, -374223049, -838584197, 1488758008}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, objArr);
        textRoundCornerProgressBarSavedState1MediaMetadataCompat.onTransact(((String) objArr[0]).intern());
        int i4 = IAuthTabCallbackStubProxy + 33;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onTransact;
        float f = 0.0f;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                int i8 = $11 + 37;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 72 - TextUtils.indexOf("", ""), 8849 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    f = 0.0f;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onTransact;
        if (iArr6 != null) {
            int i10 = $11 + 53;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 27;
                $11 = i12 % 128;
                if (i12 % i3 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr6[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(i6), 73 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.blue(i6) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i11])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 72 - Color.alpha(0), 8849 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i11++;
                }
                i3 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i13];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 22252), 39 - TextUtils.getCapsMode("", 0, 0), 10301 - TextUtils.getCapsMode("", 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4033), 77 - TextUtils.indexOf((CharSequence) "", '0'), 7398 - View.getDefaultSize(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final void onExtraCallback() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (asBinder == null) {
            onWarmupCompleted = CollectionsKt.emptyList();
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaMetadataCompat = addPolicy.MediaMetadataCompat();
            Object[] objArr = new Object[1];
            a(new int[]{-1552342949, 210728710, -1874252962, -1216947733, -1882155717, -599154463, 544395849, 1976130891, 36985387, -374223049, -838584197, 1488758008}, View.getDefaultSize(0, 0) + 23, objArr);
            String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1MediaMetadataCompat.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
            try {
                Result.Companion companion = Result.Companion;
                wie2 wie2Var = IAuthTabCallbackDefault;
                wie2Var.onExtraCallback();
                obj = Result.constructor-impl((List) wie2Var.onExtraCallback(new checkCanOpenLandingPage(PasswordPolicyResponse.UnavailablePasswordPolicy.Companion.serializer()), strOnExtraCallbackWithResult));
                int i3 = getInterfaceDescriptor + 15;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            List listEmptyList = CollectionsKt.emptyList();
            if (Result.onExtraCallback(obj)) {
                int i5 = getInterfaceDescriptor + 123;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                obj = listEmptyList;
            }
            asBinder = (List) obj;
        }
    }

    public static /* synthetic */ wasLastName onExtraCallback(DynamicFromArrayCompanion dynamicFromArrayCompanion, asArray asarray, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, getHostnameVerifierokhttp gethostnameverifierokhttp, Long l, Long l2, int i, Object obj) {
        Long l3;
        Long l4;
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = IAuthTabCallbackStubProxy;
            int i4 = i3 + 79;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 39;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            l3 = null;
        } else {
            l3 = l;
        }
        if ((i & 16) != 0) {
            int i7 = IAuthTabCallbackStubProxy + 121;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 9 / 0;
            }
            l4 = null;
        } else {
            l4 = l2;
        }
        return dynamicFromArrayCompanion.onExtraCallback(asarray, graniteBrownfieldModule_closeView, gethostnameverifierokhttp, l3, l4);
    }

    private static final void onExtraCallbackWithResult(List list, String str, char c, JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderEmptyEOFException, "");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = IAuthTabCallbackStubProxy + 75;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                ((Boolean) ((onExtraCallback) it.next()).getChecker().invoke(str, Character.valueOf(c))).booleanValue();
                throw null;
            }
            next = it.next();
            if (!((Boolean) ((onExtraCallback) next).getChecker().invoke(str, Character.valueOf(c))).booleanValue()) {
                break;
            }
        }
        onExtraCallback onextracallback = (onExtraCallback) next;
        if (onextracallback != null) {
            int i3 = IAuthTabCallbackStubProxy + 79;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            if (onNavigationEvent.onExtraCallback[onextracallback.ordinal()] == 1) {
                jsonReaderEmptyEOFException.onWarmupCompleted(new asArraylambda5.onExtraCallback(onextracallback));
                return;
            } else {
                jsonReaderEmptyEOFException.onWarmupCompleted(new asArraylambda5.onWarmupCompleted(onextracallback));
                return;
            }
        }
        List<PasswordPolicyResponse.UnavailablePasswordPolicy> listEmptyList = asBinder;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        for (PasswordPolicyResponse.UnavailablePasswordPolicy unavailablePasswordPolicy : listEmptyList) {
            Iterator<T> it2 = unavailablePasswordPolicy.onExtraCallbackWithResult().iterator();
            int i5 = getInterfaceDescriptor + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            while (it2.hasNext()) {
                if (StringsKt.contains$default(str, (String) it2.next(), false, 2, (Object) null)) {
                    jsonReaderEmptyEOFException.onWarmupCompleted(new asArraylambda5.onNavigationEvent(unavailablePasswordPolicy.onWarmupCompleted()));
                    return;
                }
            }
        }
        jsonReaderEmptyEOFException.onWarmupCompleted();
    }

    public final wasLastName onExtraCallback(@NotNull asArray asarray, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull final getHostnameVerifierokhttp gethostnameverifierokhttp, @Nullable final Long l, @Nullable final Long l2) {
        boolean z;
        int i;
        final char cLast;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 63;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(asarray, "");
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        Intrinsics.checkNotNullParameter(gethostnameverifierokhttp, "");
        if (asarray == asArray.PW_6_DIGIT) {
            int i5 = IAuthTabCallbackStubProxy + 49;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i7 = IAuthTabCallbackStubProxy + 23;
            getInterfaceDescriptor = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 % 5;
            }
            i = 6;
        } else {
            i = 4;
        }
        final String string = graniteBrownfieldModule_closeView.subSequence(0, i).toString();
        int i9 = getInterfaceDescriptor;
        int i10 = i9 + 97;
        IAuthTabCallbackStubProxy = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 9;
        IAuthTabCallbackStubProxy = i12 % 128;
        int i13 = i12 % 2;
        if (z) {
            cLast = ' ';
        } else {
            cLast = StringsKt.last(graniteBrownfieldModule_closeView);
            int i14 = getInterfaceDescriptor + 101;
            IAuthTabCallbackStubProxy = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 5 % 4;
            }
        }
        final List listListOf = CollectionsKt.listOf(onExtraCallback.NOT_THREE_OR_MORE_NUMBERS);
        wasLastName waslastnameIAuthTabCallback = wasLastName.onExtraCallbackWithResult(new fillInStackTrace() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda0
            public final void subscribe(JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
                DynamicFromArrayCompanion.onWarmupCompleted(listListOf, string, cLast, jsonReaderEmptyEOFException);
            }
        }).IAuthTabCallback(new JsonReaderBindObject() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda1
            public final JsonReaderErrorInfo apply(wasLastName waslastname) {
                return (JsonReaderErrorInfo) DynamicFromArrayCompanion.IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{l, l2, gethostnameverifierokhttp, waslastname}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1024367686, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1024367688, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
            }
        });
        Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback, "");
        return waslastnameIAuthTabCallback;
    }

    private static final JsonReaderErrorInfo onNavigationEvent(Long l, Long l2, final getHostnameVerifierokhttp gethostnameverifierokhttp, wasLastName waslastname) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(waslastname, "");
        if (asBinder != null) {
            return waslastname;
        }
        int i2 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras();
            zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer();
            obj.hashCode();
            throw null;
        }
        shouldAutoplay shouldautoplayNewSessionWithExtras = AdSettingsIntegrationErrorMode.onNavigationEvent.newSessionWithExtras();
        if (!zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            int i3 = getInterfaceDescriptor + 59;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 5;
            }
            l2 = null;
        }
        writeRaw<BaseApiResponse<PasswordPolicyResponse>> writerawOnNavigationEvent = shouldautoplayNewSessionWithExtras.onNavigationEvent(l, l2);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda3
            public final Object invoke(Object obj2) {
                return DynamicFromArrayCompanion.onExtraCallback(gethostnameverifierokhttp, (deserializeUriNullableCollection) obj2);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda4
            public final void accept(Object obj2) throws Throwable {
                DynamicFromArrayCompanion.IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, obj2}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1289049754, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1289049750, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda5
            public final void run() {
                DynamicFromArrayCompanion.onExtraCallback(gethostnameverifierokhttp);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda6
            public final Object invoke(Object obj2) {
                return DynamicFromArrayCompanion.IAuthTabCallback((Throwable) obj2);
            }
        };
        writeRaw writerawAsBinder = writerawOnWarmupCompleted.asBinder(new deserializeIntNullableCollection() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda7
            public final Object apply(Object obj2) {
                return DynamicFromArrayCompanion.IAuthTabCallbackStub(function12, obj2);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda8
            public final Object invoke(Object obj2) {
                return DynamicFromArrayCompanion.onWarmupCompleted((PasswordPolicyResponse) obj2);
            }
        };
        return waslastname.onNavigationEvent(writerawAsBinder.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda9
            public final void accept(Object obj2) {
                DynamicFromArrayCompanion.onTransact(function13, obj2);
            }
        }).bI_());
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(getHostnameVerifierokhttp gethostnameverifierokhttp, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            getHostnameVerifierokhttp.onNavigationEvent(gethostnameverifierokhttp, (String) null, 0, (Object) null);
        } else {
            getHostnameVerifierokhttp.onNavigationEvent(gethostnameverifierokhttp, (String) null, 1, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return unit;
    }

    private static final void onExtraCallbackWithResult(getHostnameVerifierokhttp gethostnameverifierokhttp) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        gethostnameverifierokhttp.dismissLoadingIndicator();
        if (i3 != 0) {
            throw null;
        }
    }

    private static final deserializeIp asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeip;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final deserializeIp onExtraCallbackWithResult(Throwable th) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Object[] objArr = new Object[1];
        b(false, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0}, new int[]{0, 29, 0, 0}, objArr);
        writeRaw writerawOnExtraCallbackWithResult = writeRaw.onExtraCallbackWithResult(new IllegalStateException(((String) objArr[0]).intern()));
        int i2 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnExtraCallbackWithResult;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PasswordPolicyResponse passwordPolicyResponse = (PasswordPolicyResponse) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted = (List) PasswordPolicyResponse.IAuthTabCallback(35058852, iOnWarmupCompleted, iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -35058851, new Object[]{passwordPolicyResponse}, iOnWarmupCompleted3);
        asBinder = passwordPolicyResponse.IAuthTabCallbackStub();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView = (GraniteBrownfieldModule_closeView) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(graniteBrownfieldModule_closeView, "");
        final String string = graniteBrownfieldModule_closeView.subSequence(0, 4).toString();
        advance advanceVarOnWarmupCompleted = advance.onWarmupCompleted(new enlargeOrFlush() { // from class: viva.republica.toss.password.PasswordPolicyManager$$ExternalSyntheticLambda10
            public final void subscribe(flushed flushedVar) throws Throwable {
                DynamicFromArrayCompanion.onNavigationEvent(string, flushedVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(advanceVarOnWarmupCompleted, "");
        int i2 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return advanceVarOnWarmupCompleted;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = IAuthTabCallbackStub;
        char c = '0';
        if (cArr2 != null) {
            int i6 = $10 + 97;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 35284), 34 - Process.getGidForName(""), TextUtils.indexOf("", c, 0, 0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            int i8 = $11 + 69;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i10 = $11 + 23;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 10935), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 65, 16717 - ((byte) KeyEvent.getModifierMetaStateMask()), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 29 - TextUtils.indexOf("", "", 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.getDefaultSize(0, 0)), 69 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12486 - TextUtils.getOffsetBefore("", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i15 = $10 + 77;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i17 = $10 + 21;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        onExtraCallback onextracallback;
        int i = 0;
        String str = (String) objArr[0];
        flushed flushedVar = (flushed) objArr[1];
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(flushedVar, "");
        onExtraCallback[] onextracallbackArrValues = onExtraCallback.values();
        int length = onextracallbackArrValues.length;
        int i5 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            if (i >= length) {
                onextracallback = null;
                break;
            }
            int i7 = getInterfaceDescriptor + 13;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 != 0) {
                onextracallback = onextracallbackArrValues[i];
                if (!((Boolean) onextracallback.getChecker().invoke(str, '9')).booleanValue()) {
                    break;
                }
                i++;
            } else {
                onextracallback = onextracallbackArrValues[i];
                if (!((Boolean) onextracallback.getChecker().invoke(str, ' ')).booleanValue()) {
                    break;
                }
                i++;
            }
        }
        if (onextracallback != null) {
            flushedVar.onExtraCallbackWithResult(onextracallback);
            return null;
        }
        flushedVar.onExtraCallback();
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(adInfo adinfo) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{adinfo}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1326056221, iIAuthTabCallback, -1326056221, iIAuthTabCallback2);
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, obj}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1289049754, iIAuthTabCallback, -1289049750, iIAuthTabCallback2);
    }

    public static /* synthetic */ JsonReaderErrorInfo onWarmupCompleted(Long l, Long l2, getHostnameVerifierokhttp gethostnameverifierokhttp, wasLastName waslastname) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (JsonReaderErrorInfo) IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{l, l2, gethostnameverifierokhttp, waslastname}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1024367686, iIAuthTabCallback, 1024367688, iIAuthTabCallback2);
    }

    private static final Unit onNavigationEvent(PasswordPolicyResponse passwordPolicyResponse) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{passwordPolicyResponse}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1735092881, iIAuthTabCallback, -1735092880, iIAuthTabCallback2);
    }

    private static final void onWarmupCompleted(String str, flushed flushedVar) throws Throwable {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{str, flushedVar}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1121818253, iIAuthTabCallback, 1121818259, iIAuthTabCallback2);
    }

    public static /* synthetic */ wasLastName onExtraCallback(DynamicFromArrayCompanion dynamicFromArrayCompanion, onExtraCallbackWithResult onextracallbackwithresult, Long l, Long l2, int i, Object obj) {
        return (wasLastName) IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{dynamicFromArrayCompanion, onextracallbackwithresult, l, l2, Integer.valueOf(i), obj}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1276900957, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1276900962, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, obj}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -54571011, iIAuthTabCallback, 54571014, iIAuthTabCallback2);
    }

    public final advance<onExtraCallback> IAuthTabCallback(@NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (advance) IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this, graniteBrownfieldModule_closeView}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -566981147, iIAuthTabCallback, 566981155, iIAuthTabCallback2);
    }

    public final void onExtraCallback(@NotNull List<PasswordPolicyResponse.UnavailablePasswordPolicy> list) throws Throwable {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this, list}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -158261611, iIAuthTabCallback, 158261618, iIAuthTabCallback2);
    }

    static void onNavigationEvent() {
        onTransact = new int[]{758407999, 39651980, -469608606, -1510284100, -363583373, 567717045, 1432841134, 1481741875, -1543744099, 2036807959, -1423100612, 1070163382, 1861237441, -1064436836, -510072959, -1236063628, -1579831787, -1180809478};
        IAuthTabCallbackStub = new char[]{2752, 54430, 13340, 2374, 54046, 54030, 2230, 3020, 41288, 48662, 42576, 53488, 55448, 13255, 27241, 2374, 54046, 15398, 2622, 41600, 44898, 13952, 372, 42152, 42040, 42358, 44884, 43432, 2351, 27180, 27377, 27378, 27378, 27355, 27350, 27276, 27349, 27357, 27387, 27383, 27381, 27384, 27370};
    }
}
