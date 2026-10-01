package im.toss.rn.toss.core.legacy.bundle.v2;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.rn.spec.ReactCoroutineScope;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactRemoteBundleSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.MaxAdViewImplExternalSyntheticLambda4;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.auth;
import o.ebExternalSyntheticLambda0;
import o.findResAndMsg;
import o.getWrite;
import o.hExternalSyntheticLambda8;
import o.maybeUpdateAnimatable;
import o.r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBundleRepositoryImpl implements ReactBundleRepository {
    private static short[] access100;
    private final findResAndMsg IAuthTabCallback;
    private final ebExternalSyntheticLambda0 asBinder;
    private final ReactRemoteBundleSource asInterface;
    private final ReactBuiltInBundleSource onExtraCallback;
    private final r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs onExtraCallbackWithResult;
    private final ReactLocalCacheBundleSource onNavigationEvent;
    private final ReactBundleFileManager onWarmupCompleted;
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 8;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallbackStub = -1008625901;
    private static int IAuthTabCallbackDefault = -1538795458;
    private static int onTransact = -1304939631;
    private static byte[] getInterfaceDescriptor = {-58, 9, -3, 10};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = 3 - (i * 4);
        int i4 = (s * 4) + 115;
        int i5 = b * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i2++;
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    @Inject
    public ReactBundleRepositoryImpl(@NotNull ReactBuiltInBundleSource reactBuiltInBundleSource, @NotNull ReactLocalCacheBundleSource reactLocalCacheBundleSource, @NotNull ReactRemoteBundleSource reactRemoteBundleSource, @NotNull ReactBundleFileManager reactBundleFileManager, @NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0, @ReactCoroutineScope @NotNull findResAndMsg findresandmsg, @NotNull r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs r8lambda2mywpkacv8n5ptcbfsxgde7xkjs) {
        Intrinsics.checkNotNullParameter(reactBuiltInBundleSource, "");
        Intrinsics.checkNotNullParameter(reactLocalCacheBundleSource, "");
        Intrinsics.checkNotNullParameter(reactRemoteBundleSource, "");
        Intrinsics.checkNotNullParameter(reactBundleFileManager, "");
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(r8lambda2mywpkacv8n5ptcbfsxgde7xkjs, "");
        this.onExtraCallback = reactBuiltInBundleSource;
        this.onNavigationEvent = reactLocalCacheBundleSource;
        this.asInterface = reactRemoteBundleSource;
        this.onWarmupCompleted = reactBundleFileManager;
        this.asBinder = ebexternalsyntheticlambda0;
        this.IAuthTabCallback = findresandmsg;
        this.onExtraCallbackWithResult = r8lambda2mywpkacv8n5ptcbfsxgde7xkjs;
    }

    public static final /* synthetic */ ReactRemoteBundleSource onWarmupCompleted(ReactBundleRepositoryImpl reactBundleRepositoryImpl) {
        int i = 2 % 2;
        int i2 = access000 + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        ReactRemoteBundleSource reactRemoteBundleSource = reactBundleRepositoryImpl.asInterface;
        int i5 = i3 + 5;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return reactRemoteBundleSource;
    }

    public static final /* synthetic */ Object onWarmupCompleted(ReactBundleRepositoryImpl reactBundleRepositoryImpl, String str, boolean z, Long l, Date date, String str2, String str3, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = reactBundleRepositoryImpl.onExtraCallback(str, z, l, date, str2, str3, access13800Var);
        int i4 = IAuthTabCallbackStubProxy + 15;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return objOnExtraCallback;
    }

    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepository
    public Object onNavigationEvent(@NotNull String str, boolean z, @Nullable Long l, @Nullable Date date, @NotNull String str2, @NotNull String str3, @NotNull access13800<? super hExternalSyntheticLambda8> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback(str, z, l, date, str2, str3, access13800Var);
        int i4 = IAuthTabCallbackStubProxy + 27;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(String str, boolean z, Long l, Date date, String str2, String str3, access13800<? super hExternalSyntheticLambda8> access13800Var) throws Throwable {
        ReactBundleRepositoryImpl$getBundleForBytesMode$1 reactBundleRepositoryImpl$getBundleForBytesMode$1;
        Object obj;
        Object obj2;
        String string;
        Long l2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String str4;
        String str5;
        Long l3;
        String str6;
        Object objOnNavigationEvent;
        String str7;
        String str8;
        Long l4;
        Date date2;
        ReactBundle reactBundle;
        ReactRemoteBundleSource.Result result;
        String str9 = str;
        boolean z2 = z;
        Date date3 = date;
        String str10 = str2;
        String str11 = str3;
        int i = 2 % 2;
        if (access13800Var instanceof ReactBundleRepositoryImpl$getBundleForBytesMode$1) {
            reactBundleRepositoryImpl$getBundleForBytesMode$1 = (ReactBundleRepositoryImpl$getBundleForBytesMode$1) access13800Var;
            int i2 = reactBundleRepositoryImpl$getBundleForBytesMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reactBundleRepositoryImpl$getBundleForBytesMode$1.label = i2 - 2147483648;
            } else {
                reactBundleRepositoryImpl$getBundleForBytesMode$1 = new ReactBundleRepositoryImpl$getBundleForBytesMode$1(this, access13800Var);
            }
        }
        ReactBundleRepositoryImpl$getBundleForBytesMode$1 reactBundleRepositoryImpl$getBundleForBytesMode$12 = reactBundleRepositoryImpl$getBundleForBytesMode$1;
        Object objOnExtraCallbackWithResult = reactBundleRepositoryImpl$getBundleForBytesMode$12.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = reactBundleRepositoryImpl$getBundleForBytesMode$12.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "ReactBundleRepositoryImpl");
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundleName", str9);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("region", str10);
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("company", str11);
            Object obj9 = null;
            if (date3 != null) {
                obj = "ReactBundleRepositoryImpl";
                obj2 = "bundleName";
                string = date.toString();
            } else {
                obj = "ReactBundleRepositoryImpl";
                obj2 = "bundleName";
                string = null;
            }
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("minDeployedAt", string);
            Object[] objArr = new Object[1];
            a((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) View.MeasureSpec.getSize(0), (-1738952475) - View.resolveSize(0, 0), (-377482028) - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 55, objArr);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_get_started_bytes_mode", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "bytes")}), (String) null, false, (String) null, 56, (Object) null);
            if (!z2 && !this.asBinder.asInterface()) {
                int i4 = IAuthTabCallbackStubProxy + 27;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                ReactLocalCacheBundleSource reactLocalCacheBundleSource = this.onNavigationEvent;
                reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0 = str9;
                l2 = l;
                reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1 = l2;
                reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2 = date3;
                reactBundleRepositoryImpl$getBundleForBytesMode$12.L$3 = str10;
                reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4 = str11;
                reactBundleRepositoryImpl$getBundleForBytesMode$12.Z$0 = z2;
                reactBundleRepositoryImpl$getBundleForBytesMode$12.label = 1;
                obj5 = obj2;
                obj6 = "company";
                obj3 = "bytes";
                obj4 = obj;
                obj7 = "from";
                objOnExtraCallbackWithResult = reactLocalCacheBundleSource.onExtraCallbackWithResult(str, l, date, str2, str3, reactBundleRepositoryImpl$getBundleForBytesMode$12);
                obj8 = objOnWarmupCompleted;
                if (objOnExtraCallbackWithResult != obj8) {
                    int i6 = access000 + 67;
                    IAuthTabCallbackStubProxy = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj9.hashCode();
                        throw null;
                    }
                }
                return obj8;
            }
            l2 = l;
            obj3 = "bytes";
            obj4 = obj;
            obj5 = obj2;
            obj6 = "company";
            obj7 = "from";
            obj8 = objOnWarmupCompleted;
            if (!z2) {
                int i7 = IAuthTabCallbackStubProxy + 107;
                access000 = i7 % 128;
                int i8 = i7 % 2;
                if (!this.asBinder.asInterface()) {
                    ReactBuiltInBundleSource reactBuiltInBundleSource = this.onExtraCallback;
                    reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0 = str9;
                    reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1 = l2;
                    reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2 = date3;
                    reactBundleRepositoryImpl$getBundleForBytesMode$12.L$3 = str10;
                    reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4 = str11;
                    reactBundleRepositoryImpl$getBundleForBytesMode$12.Z$0 = z2;
                    reactBundleRepositoryImpl$getBundleForBytesMode$12.label = 2;
                    objOnExtraCallbackWithResult = reactBuiltInBundleSource.onExtraCallback(str9, date3, str10, str11, reactBundleRepositoryImpl$getBundleForBytesMode$12);
                    if (objOnExtraCallbackWithResult != obj8) {
                        str6 = str10;
                        l3 = l2;
                        reactBundle = (ReactBundle) objOnExtraCallbackWithResult;
                        if (reactBundle == null) {
                        }
                    }
                    return obj8;
                }
            }
            str4 = str9;
            str5 = str10;
            l3 = l2;
            Date date4 = date3;
            IAuthTabCallback(str4, "remote-bytes", l3, date4, "Fetching from remote (BYTES mode)");
            ReactRemoteBundleSource reactRemoteBundleSource = this.asInterface;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0 = str4;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1 = l3;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2 = date4;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$3 = access15400.onNavigationEvent(str5);
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4 = str11;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.Z$0 = z2;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.label = 3;
            Long l5 = l3;
            objOnNavigationEvent = ReactRemoteBundleSource.onNavigationEvent(reactRemoteBundleSource, str4, str5, str11, date4, false, reactBundleRepositoryImpl$getBundleForBytesMode$12, 16, null);
            if (objOnNavigationEvent != obj8) {
            }
            return obj8;
        }
        int i9 = IAuthTabCallbackStubProxy + 33;
        access000 = i9 % 128;
        int i10 = i9 % 2;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str8 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4;
                date2 = (Date) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2;
                l4 = (Long) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1;
                str7 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                obj4 = "ReactBundleRepositoryImpl";
                obj5 = "bundleName";
                obj6 = "company";
                obj3 = "bytes";
                obj7 = "from";
                result = (ReactRemoteBundleSource.Result) objOnExtraCallbackWithResult;
                if (!(result instanceof ReactRemoteBundleSource.Result.Success)) {
                    IAuthTabCallback(str7, "remote-bytes-result", l4, date2, "Downloaded and saved directly (BYTES mode)");
                    return new hExternalSyntheticLambda8.onExtraCallback(((ReactRemoteBundleSource.Result.Success) result).onExtraCallback());
                }
                if (!(result instanceof ReactRemoteBundleSource.Result.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                ReactRemoteBundleSource.Result.Error error = (ReactRemoteBundleSource.Result.Error) result;
                Throwable thIAuthTabCallback = error.IAuthTabCallback();
                Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(obj7, obj4);
                Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(obj5, str7);
                Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(obj6, str8);
                Object[] objArr2 = new Object[1];
                a((short) Gravity.getAbsoluteGravity(0, 0), (byte) (ImageFormat.getBitsPerPixel(0) + 1), AndroidCharacter.getMirror('0') - 20299, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 377482028, View.MeasureSpec.makeMeasureSpec(0, 0) - 55, objArr2);
                convertFloatArrayToByteArray2.onExtraCallbackWithResult("react_native_debug", "remote_fetch_failed_bytes_mode", thIAuthTabCallback, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), obj3), getWrite.IAuthTabCallback("errorType", error.IAuthTabCallback().getClass().getSimpleName())}));
                return new hExternalSyntheticLambda8.IAuthTabCallback(error.IAuthTabCallback());
            }
            boolean z3 = reactBundleRepositoryImpl$getBundleForBytesMode$12.Z$0;
            String str12 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4;
            String str13 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$3;
            date3 = (Date) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2;
            l3 = (Long) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1;
            String str14 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            obj4 = "ReactBundleRepositoryImpl";
            obj5 = "bundleName";
            obj6 = "company";
            obj3 = "bytes";
            obj7 = "from";
            str6 = str13;
            z2 = z3;
            obj8 = objOnWarmupCompleted;
            str11 = str12;
            str9 = str14;
            reactBundle = (ReactBundle) objOnExtraCallbackWithResult;
            if (reactBundle == null) {
                IAuthTabCallback(str9, "builtIn-bytes", l3, date3, "Loaded from built-in (BYTES mode)");
                return new hExternalSyntheticLambda8.onExtraCallback(reactBundle);
            }
            str5 = str6;
            str4 = str9;
            Date date42 = date3;
            IAuthTabCallback(str4, "remote-bytes", l3, date42, "Fetching from remote (BYTES mode)");
            ReactRemoteBundleSource reactRemoteBundleSource2 = this.asInterface;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0 = str4;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1 = l3;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2 = date42;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$3 = access15400.onNavigationEvent(str5);
            reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4 = str11;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.Z$0 = z2;
            reactBundleRepositoryImpl$getBundleForBytesMode$12.label = 3;
            Long l52 = l3;
            objOnNavigationEvent = ReactRemoteBundleSource.onNavigationEvent(reactRemoteBundleSource2, str4, str5, str11, date42, false, reactBundleRepositoryImpl$getBundleForBytesMode$12, 16, null);
            if (objOnNavigationEvent != obj8) {
                str7 = str4;
                objOnExtraCallbackWithResult = objOnNavigationEvent;
                str8 = str11;
                l4 = l52;
                date2 = date42;
                result = (ReactRemoteBundleSource.Result) objOnExtraCallbackWithResult;
                if (!(result instanceof ReactRemoteBundleSource.Result.Success)) {
                }
            }
            return obj8;
        }
        boolean z4 = reactBundleRepositoryImpl$getBundleForBytesMode$12.Z$0;
        String str15 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4;
        String str16 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$3;
        date3 = (Date) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2;
        Long l6 = (Long) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1;
        String str17 = (String) reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        int i11 = IAuthTabCallbackStubProxy + 39;
        access000 = i11 % 128;
        int i12 = i11 % 2;
        obj4 = "ReactBundleRepositoryImpl";
        obj5 = "bundleName";
        obj6 = "company";
        obj3 = "bytes";
        obj7 = "from";
        obj8 = objOnWarmupCompleted;
        l2 = l6;
        str10 = str16;
        z2 = z4;
        str11 = str15;
        str9 = str17;
        ReactBundle reactBundle2 = (ReactBundle) objOnExtraCallbackWithResult;
        if (reactBundle2 != null) {
            String str18 = str9;
            IAuthTabCallback(str18, "localCache-bytes", l2, date3, "Loaded from local cache (BYTES mode)");
            maybeUpdateAnimatable.onNavigationEvent(this.IAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, new ReactBundleRepositoryImpl$getBundleForBytesMode$2(str18, str10, str11, this, date3, null), 3, (Object) null);
            return new hExternalSyntheticLambda8.onExtraCallback(reactBundle2);
        }
        if (!z2) {
        }
        str4 = str9;
        str5 = str10;
        l3 = l2;
        Date date422 = date3;
        IAuthTabCallback(str4, "remote-bytes", l3, date422, "Fetching from remote (BYTES mode)");
        ReactRemoteBundleSource reactRemoteBundleSource22 = this.asInterface;
        reactBundleRepositoryImpl$getBundleForBytesMode$12.L$0 = str4;
        reactBundleRepositoryImpl$getBundleForBytesMode$12.L$1 = l3;
        reactBundleRepositoryImpl$getBundleForBytesMode$12.L$2 = date422;
        reactBundleRepositoryImpl$getBundleForBytesMode$12.L$3 = access15400.onNavigationEvent(str5);
        reactBundleRepositoryImpl$getBundleForBytesMode$12.L$4 = str11;
        reactBundleRepositoryImpl$getBundleForBytesMode$12.Z$0 = z2;
        reactBundleRepositoryImpl$getBundleForBytesMode$12.label = 3;
        Long l522 = l3;
        objOnNavigationEvent = ReactRemoteBundleSource.onNavigationEvent(reactRemoteBundleSource22, str4, str5, str11, date422, false, reactBundleRepositoryImpl$getBundleForBytesMode$12, 16, null);
        if (objOnNavigationEvent != obj8) {
        }
        return obj8;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r1 != r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0102 -> B:36:0x0107). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
        ReactBundleRepositoryImpl$updateBuiltInBundles$1 reactBundleRepositoryImpl$updateBuiltInBundles$1;
        String str3;
        String str4;
        Iterator it;
        String str5;
        int i = 2 % 2;
        int i2 = access000 + 1;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!(!(access13800Var instanceof ReactBundleRepositoryImpl$updateBuiltInBundles$1))) {
            reactBundleRepositoryImpl$updateBuiltInBundles$1 = (ReactBundleRepositoryImpl$updateBuiltInBundles$1) access13800Var;
            int i4 = reactBundleRepositoryImpl$updateBuiltInBundles$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                reactBundleRepositoryImpl$updateBuiltInBundles$1.label = i4 - 2147483648;
                int i5 = access000 + 123;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
            } else {
                reactBundleRepositoryImpl$updateBuiltInBundles$1 = new ReactBundleRepositoryImpl$updateBuiltInBundles$1(this, access13800Var);
            }
        }
        Object objIAuthTabCallback = reactBundleRepositoryImpl$updateBuiltInBundles$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = reactBundleRepositoryImpl$updateBuiltInBundles$1.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs r8lambda2mywpkacv8n5ptcbfsxgde7xkjs = this.onExtraCallbackWithResult;
            reactBundleRepositoryImpl$updateBuiltInBundles$1.L$0 = access15400.onNavigationEvent(str);
            str3 = str2;
            reactBundleRepositoryImpl$updateBuiltInBundles$1.L$1 = str3;
            reactBundleRepositoryImpl$updateBuiltInBundles$1.label = 1;
            str4 = str;
            objIAuthTabCallback = r8lambda2mywpkacv8n5ptcbfsxgde7xkjs.IAuthTabCallback(str4, reactBundleRepositoryImpl$updateBuiltInBundles$1);
        } else if (i7 != 1) {
            int i8 = IAuthTabCallbackStubProxy + 89;
            access000 = i8 % 128;
            if (i8 % 2 == 0 ? i7 != 2 : i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4 = (MaxAdViewImplExternalSyntheticLambda4) reactBundleRepositoryImpl$updateBuiltInBundles$1.L$3;
            it = (Iterator) reactBundleRepositoryImpl$updateBuiltInBundles$1.L$2;
            String str6 = (String) reactBundleRepositoryImpl$updateBuiltInBundles$1.L$1;
            String str7 = (String) reactBundleRepositoryImpl$updateBuiltInBundles$1.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            ReactRemoteBundleSource.Result result = (ReactRemoteBundleSource.Result) objIAuthTabCallback;
            if (result instanceof ReactRemoteBundleSource.Result.Success) {
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "updateBuiltInBundles: '" + maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult() + "' 번들 fetch 성공", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                int i9 = access000 + 23;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
            } else {
                if (!(result instanceof ReactRemoteBundleSource.Result.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "updateBuiltInBundles: '" + maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult() + "' 번들 fetch에 실패했습니다.", ((ReactRemoteBundleSource.Result.Error) result).IAuthTabCallback(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleRepositoryImpl"), getWrite.IAuthTabCallback("assetName", maxAdViewImplExternalSyntheticLambda4.onWarmupCompleted())}));
            }
            str3 = str6;
            str5 = str7;
            if (it.hasNext()) {
                MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda42 = (MaxAdViewImplExternalSyntheticLambda4) it.next();
                ReactRemoteBundleSource reactRemoteBundleSource = this.asInterface;
                String strOnExtraCallbackWithResult = maxAdViewImplExternalSyntheticLambda42.onExtraCallbackWithResult();
                String strAsBinder = maxAdViewImplExternalSyntheticLambda42.asBinder();
                String strOnNavigationEvent = maxAdViewImplExternalSyntheticLambda42.onNavigationEvent();
                reactBundleRepositoryImpl$updateBuiltInBundles$1.L$0 = access15400.onNavigationEvent(str5);
                reactBundleRepositoryImpl$updateBuiltInBundles$1.L$1 = access15400.onNavigationEvent(str3);
                reactBundleRepositoryImpl$updateBuiltInBundles$1.L$2 = it;
                reactBundleRepositoryImpl$updateBuiltInBundles$1.L$3 = maxAdViewImplExternalSyntheticLambda42;
                reactBundleRepositoryImpl$updateBuiltInBundles$1.label = 2;
                Object objOnNavigationEvent = ReactRemoteBundleSource.onNavigationEvent(reactRemoteBundleSource, strOnExtraCallbackWithResult, strAsBinder, strOnNavigationEvent, null, false, reactBundleRepositoryImpl$updateBuiltInBundles$1, 24, null);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    str7 = str5;
                    objIAuthTabCallback = objOnNavigationEvent;
                    str6 = str3;
                    maxAdViewImplExternalSyntheticLambda4 = maxAdViewImplExternalSyntheticLambda42;
                    ReactRemoteBundleSource.Result result2 = (ReactRemoteBundleSource.Result) objIAuthTabCallback;
                    if (result2 instanceof ReactRemoteBundleSource.Result.Success) {
                    }
                    str3 = str6;
                    str5 = str7;
                    if (it.hasNext()) {
                        Unit unit = Unit.INSTANCE;
                        int i11 = IAuthTabCallbackStubProxy + 43;
                        access000 = i11 % 128;
                        int i12 = i11 % 2;
                        return unit;
                    }
                }
                int i13 = IAuthTabCallbackStubProxy + 111;
                access000 = i13 % 128;
                if (i13 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            str3 = (String) reactBundleRepositoryImpl$updateBuiltInBundles$1.L$1;
            str4 = (String) reactBundleRepositoryImpl$updateBuiltInBundles$1.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objIAuthTabCallback) {
            if (Intrinsics.areEqual(((MaxAdViewImplExternalSyntheticLambda4) obj2).onNavigationEvent(), str3)) {
                arrayList.add(obj2);
            }
        }
        String str8 = str4;
        it = arrayList.iterator();
        str5 = str8;
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r15 != r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e6 -> B:33:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        ReactBundleRepositoryImpl$invalidateCachedOldBundle$1 reactBundleRepositoryImpl$invalidateCachedOldBundle$1;
        Iterator it;
        ReactBundle reactBundle;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4;
        String str2;
        Iterator it2;
        ReactBundle reactBundle2;
        int i = 2 % 2;
        if (access13800Var instanceof ReactBundleRepositoryImpl$invalidateCachedOldBundle$1) {
            int i2 = IAuthTabCallbackStubProxy + 39;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            reactBundleRepositoryImpl$invalidateCachedOldBundle$1 = (ReactBundleRepositoryImpl$invalidateCachedOldBundle$1) access13800Var;
            int i4 = reactBundleRepositoryImpl$invalidateCachedOldBundle$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                reactBundleRepositoryImpl$invalidateCachedOldBundle$1.label = i4 - 2147483648;
            } else {
                reactBundleRepositoryImpl$invalidateCachedOldBundle$1 = new ReactBundleRepositoryImpl$invalidateCachedOldBundle$1(this, access13800Var);
            }
        }
        Object objIAuthTabCallback = reactBundleRepositoryImpl$invalidateCachedOldBundle$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = reactBundleRepositoryImpl$invalidateCachedOldBundle$1.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs r8lambda2mywpkacv8n5ptcbfsxgde7xkjs = this.onExtraCallbackWithResult;
            reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$0 = access15400.onNavigationEvent(str);
            reactBundleRepositoryImpl$invalidateCachedOldBundle$1.label = 1;
            objIAuthTabCallback = r8lambda2mywpkacv8n5ptcbfsxgde7xkjs.IAuthTabCallback(str, reactBundleRepositoryImpl$invalidateCachedOldBundle$1);
        } else if (i5 != 1) {
            int i6 = IAuthTabCallbackStubProxy + 103;
            access000 = i6 % 128;
            if (i6 % 2 == 0 ? i5 == 2 : i5 == 4) {
                MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda42 = (MaxAdViewImplExternalSyntheticLambda4) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$2;
                it2 = (Iterator) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$1;
                String str3 = (String) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                maxAdViewImplExternalSyntheticLambda4 = maxAdViewImplExternalSyntheticLambda42;
                str = str3;
                ReactBundle reactBundle3 = (ReactBundle) objIAuthTabCallback;
                if (reactBundle3 != null) {
                    it = it2;
                    if (!it.hasNext()) {
                        int i7 = IAuthTabCallbackStubProxy + 61;
                        access000 = i7 % 128;
                        int i8 = i7 % 2;
                        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda43 = (MaxAdViewImplExternalSyntheticLambda4) it.next();
                        ReactBuiltInBundleSource reactBuiltInBundleSource = this.onExtraCallback;
                        String strOnExtraCallbackWithResult = maxAdViewImplExternalSyntheticLambda43.onExtraCallbackWithResult();
                        String strAsBinder = maxAdViewImplExternalSyntheticLambda43.asBinder();
                        String strOnNavigationEvent = maxAdViewImplExternalSyntheticLambda43.onNavigationEvent();
                        reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$0 = access15400.onNavigationEvent(str);
                        reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$1 = it;
                        reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$2 = maxAdViewImplExternalSyntheticLambda43;
                        Object obj = null;
                        reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$3 = null;
                        reactBundleRepositoryImpl$invalidateCachedOldBundle$1.label = 2;
                        Object objOnExtraCallback = reactBuiltInBundleSource.onExtraCallback(strOnExtraCallbackWithResult, null, strAsBinder, strOnNavigationEvent, reactBundleRepositoryImpl$invalidateCachedOldBundle$1);
                        if (objOnExtraCallback != objOnWarmupCompleted) {
                            int i9 = IAuthTabCallbackStubProxy + 99;
                            access000 = i9 % 128;
                            if (i9 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            maxAdViewImplExternalSyntheticLambda4 = maxAdViewImplExternalSyntheticLambda43;
                            it2 = it;
                            objIAuthTabCallback = objOnExtraCallback;
                            ReactBundle reactBundle32 = (ReactBundle) objIAuthTabCallback;
                            if (reactBundle32 != null) {
                                ReactLocalCacheBundleSource reactLocalCacheBundleSource = this.onNavigationEvent;
                                String strOnExtraCallbackWithResult2 = maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult();
                                String strAsBinder2 = maxAdViewImplExternalSyntheticLambda4.asBinder();
                                String strOnNavigationEvent2 = maxAdViewImplExternalSyntheticLambda4.onNavigationEvent();
                                reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$0 = access15400.onNavigationEvent(str);
                                reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$1 = it2;
                                reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$2 = maxAdViewImplExternalSyntheticLambda4;
                                reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$3 = reactBundle32;
                                reactBundleRepositoryImpl$invalidateCachedOldBundle$1.label = 3;
                                Object objOnExtraCallbackWithResult = reactLocalCacheBundleSource.onExtraCallbackWithResult(strOnExtraCallbackWithResult2, null, null, strAsBinder2, strOnNavigationEvent2, reactBundleRepositoryImpl$invalidateCachedOldBundle$1);
                                if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                                    str2 = str;
                                    reactBundle = reactBundle32;
                                    objIAuthTabCallback = objOnExtraCallbackWithResult;
                                    reactBundle2 = (ReactBundle) objIAuthTabCallback;
                                    if (reactBundle2 != null && reactBundle2.IAuthTabCallback().compareTo(reactBundle.IAuthTabCallback()) < 0) {
                                        int i10 = IAuthTabCallbackStubProxy + 47;
                                        access000 = i10 % 128;
                                        int i11 = i10 % 2;
                                        this.onNavigationEvent.IAuthTabCallback(maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult(), maxAdViewImplExternalSyntheticLambda4.asBinder(), maxAdViewImplExternalSyntheticLambda4.onNavigationEvent());
                                    }
                                    it = it2;
                                    str = str2;
                                    if (!it.hasNext()) {
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reactBundle = (ReactBundle) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$3;
                MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda44 = (MaxAdViewImplExternalSyntheticLambda4) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$2;
                Iterator it3 = (Iterator) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$1;
                str2 = (String) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                maxAdViewImplExternalSyntheticLambda4 = maxAdViewImplExternalSyntheticLambda44;
                it2 = it3;
                reactBundle2 = (ReactBundle) objIAuthTabCallback;
                if (reactBundle2 != null) {
                    int i102 = IAuthTabCallbackStubProxy + 47;
                    access000 = i102 % 128;
                    int i112 = i102 % 2;
                    this.onNavigationEvent.IAuthTabCallback(maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult(), maxAdViewImplExternalSyntheticLambda4.asBinder(), maxAdViewImplExternalSyntheticLambda4.onNavigationEvent());
                }
                it = it2;
                str = str2;
                if (!it.hasNext()) {
                }
            }
        } else {
            str = (String) reactBundleRepositoryImpl$invalidateCachedOldBundle$1.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            int i12 = IAuthTabCallbackStubProxy + 89;
            access000 = i12 % 128;
            int i13 = i12 % 2;
        }
        it = ((List) objIAuthTabCallback).iterator();
        if (!it.hasNext()) {
        }
    }

    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepository
    public void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onNavigationEvent.IAuthTabCallback(str, str2, str3);
        int i4 = access000 + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepositoryImpl.IAuthTabCallbackStubProxy + 11;
        im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepositoryImpl.access000 = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            objOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(access13800Var);
            int i3 = 10 / 0;
        } else {
            objOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(access13800Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(String str, String str2, Long l, Date date, String str3) {
        String str4;
        String str5;
        Object obj;
        String str6 = str3;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        if (str6 != null) {
            str4 = " - " + str6;
            if (str4 == null) {
                int i2 = IAuthTabCallbackStubProxy + 11;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                str4 = "";
            }
        }
        String str7 = "Fetch " + str2 + " bundle for " + str + str4;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("from", "ReactBundleRepositoryImpl");
        mapOnExtraCallback.put("bundleName", str);
        mapOnExtraCallback.put("maxAge", String.valueOf(l));
        mapOnExtraCallback.put("minDeployedAt", String.valueOf(date));
        if (str6 != null) {
            mapOnExtraCallback.put("detail", str6);
        }
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", str7, access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
        auth authVar = auth.onNavigationEvent;
        if (str6 != null) {
            str5 = " - " + str6;
            if (str5 == null) {
                str5 = "";
            }
        }
        String str8 = "Fetch " + str2 + " bundle for " + str + str5;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("bundleName", str);
        if (l == null) {
            int i4 = access000 + 43;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            obj = "null";
        } else {
            obj = l;
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("maxAge", obj);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("minDeployedAt", date != null ? date : "null");
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("from", str2);
        if (str6 == null) {
            str6 = "";
        }
        auth.IAuthTabCallback(authVar, str8, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("detail", str6)}), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackDefault)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.normalizeMetaState(0)), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-16754777) - Color.rgb(0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 15;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = getInterfaceDescriptor;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getEdgeSlop() >> 16)), 54 - TextUtils.lastIndexOf("", c, 0, 0), 2167 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getInterfaceDescriptor;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackStub)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), Color.red(0) + 42, MotionEvent.axisFromString("") + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (access100[i + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onTransact), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 86 - ExpandableListView.getPackedPositionGroup(0L), 9567 - View.MeasureSpec.makeMeasureSpec(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = getInterfaceDescriptor;
                if (bArr4 != null) {
                    int i10 = $10 + 15;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i13 = $11 + 41;
                    int i14 = i13 % 128;
                    $10 = i14;
                    int i15 = i13 % 2;
                    if (z) {
                        int i16 = i14 + 87;
                        $11 = i16 % 128;
                        if (i16 % 2 == 0) {
                            byte[] bArr6 = getInterfaceDescriptor;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >>> 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr6[r7] % (-4629411779493505016L))) << s)) ^ b);
                        } else {
                            byte[] bArr7 = getInterfaceDescriptor;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = access100;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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
}
