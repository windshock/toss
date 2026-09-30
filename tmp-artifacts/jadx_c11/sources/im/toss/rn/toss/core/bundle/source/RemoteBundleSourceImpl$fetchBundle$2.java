package im.toss.rn.toss.core.bundle.source;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.observability.instrumentation.rn.RnBundleInfo;
import im.toss.observability.instrumentation.rn.RnCause;
import im.toss.rn.spec.log.ReactLogKt;
import im.toss.rn.toss.core.bundle.model.BundleMetadata;
import im.toss.rn.toss.core.bundle.model.RemoteBundleResult;
import im.toss.rn.toss.core.observability.RnBundleResponseParser;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.rn.toss.core.util.RnAppVersion;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.IdGeneratorExternalSyntheticLambda1;
import o.MaxNativeAdLoaderImplb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTCeilingLandingPageActivity5;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.auth;
import o.dbExternalSyntheticLambda0;
import o.findResAndMsg;
import o.getWrite;
import o.r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4;
import o.setCampaign;
import o.setRequestListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RemoteBundleSourceImpl$fetchBundle$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super RemoteBundleResult>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int[] onNavigationEvent = {450015239, 1491100154, -1089054273, -216143314, -1667464064, 2034894536, -1968088106, -2135041907, 488244596, 11344270, -1482691836, 540122254, -1929064553, -978319122, -1675887789, -1815428291, -1194305290, -1160092159};
    private static int onWarmupCompleted = 1;
    final /* synthetic */ String $bundleName;
    final /* synthetic */ String $bundleURL;
    final /* synthetic */ String $cacheNamespace;
    final /* synthetic */ String $company;
    final /* synthetic */ Date $minDeployedAt;
    final /* synthetic */ String $region;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ RemoteBundleSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteBundleSourceImpl$fetchBundle$2(RemoteBundleSourceImpl remoteBundleSourceImpl, String str, String str2, String str3, String str4, Date date, String str5, access13800<? super RemoteBundleSourceImpl$fetchBundle$2> access13800Var) {
        super(2, access13800Var);
        this.this$0 = remoteBundleSourceImpl;
        this.$bundleURL = str;
        this.$bundleName = str2;
        this.$region = str3;
        this.$company = str4;
        this.$minDeployedAt = date;
        this.$cacheNamespace = str5;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super RemoteBundleResult> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$2 = new RemoteBundleSourceImpl$fetchBundle$2(this.this$0, this.$bundleURL, this.$bundleName, this.$region, this.$company, this.$minDeployedAt, this.$cacheNamespace, access13800Var);
        remoteBundleSourceImpl$fetchBundle$2.L$0 = obj;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return remoteBundleSourceImpl$fetchBundle$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super RemoteBundleResult> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
        int i3 = 69 / 0;
        return objIAuthTabCallback;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i3 = -1469660336;
        long j = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = $11 + 95;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 2;
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
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
        int[] iArr5 = onNavigationEvent;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 'x' - AndroidCharacter.getMirror(c), 8848 - Color.alpha(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                i3 = -1469660336;
                c = '0';
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 31;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22252), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40, 10300 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i10++;
                int i14 = $11 + 41;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 79, 7398 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 33, insn: 0x0335: MOVE (r27 I:??[OBJECT, ARRAY]) = (r33 I:??[OBJECT, ARRAY]), block:B:29:0x0334 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05e5 A[Catch: all -> 0x050d, TRY_ENTER, TRY_LEAVE, TryCatch #48 {all -> 0x050d, blocks: (B:58:0x04f0, B:60:0x04f6, B:63:0x0508, B:75:0x0551, B:99:0x05c7, B:105:0x05e5), top: B:521:0x04f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05f4 A[Catch: all -> 0x0fc2, TRY_ENTER, TryCatch #16 {all -> 0x0fc2, blocks: (B:93:0x05a9, B:96:0x05b3, B:103:0x05d4, B:109:0x05f8, B:108:0x05f4, B:102:0x05d0), top: B:460:0x05a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0980 A[Catch: all -> 0x0998, TryCatch #53 {all -> 0x0998, blocks: (B:165:0x094a, B:169:0x0972, B:172:0x0984, B:170:0x097b, B:171:0x0980), top: B:531:0x094a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0cd0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0daf A[Catch: all -> 0x0f0f, TRY_LEAVE, TryCatch #49 {all -> 0x0f0f, blocks: (B:279:0x0daf, B:277:0x0d40), top: B:523:0x0d40 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0efa  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0eff  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1183  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x1224  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x1226  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x1247  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x127a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0b74 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x07b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x04f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05b9  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v164, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v87, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v59, types: [kotlin.Pair[]] */
    /* JADX WARN: Type inference failed for: r8v66, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v70, types: [java.lang.Object[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Response response;
        Response response2;
        findResAndMsg findresandmsg;
        String str;
        Throwable th2;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$2;
        Object obj2;
        Response responseExecute;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$22;
        Throwable th3;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        RemoteBundleSourceImpl remoteBundleSourceImpl;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$23;
        RnPhaseObserver rnPhaseObserverIAuthTabCallbackDefault;
        RnBundleInfo rnBundleInfo;
        boolean z;
        String str5;
        Throwable th4;
        String str6;
        Object obj3;
        String str7;
        Object obj4;
        Object obj5;
        String str8;
        Object obj6;
        Date date;
        Object obj7;
        String str9;
        Object obj8;
        RnPhaseObserver rnPhaseObserverIAuthTabCallbackDefault2;
        Object obj9;
        findResAndMsg findresandmsg2;
        int i3;
        RemoteBundleSourceImpl remoteBundleSourceImpl2;
        String str10;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        int i4;
        Object obj10;
        findResAndMsg findresandmsg3;
        Object obj11;
        String str11;
        String str12;
        Object obj12;
        String string;
        Object obj13;
        Date date2;
        Request requestBuild;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$24;
        Response response3;
        Response responseNetworkResponse;
        String str13;
        Long longOrNull;
        Long l;
        String str14;
        String str15;
        Object obj14;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$25;
        RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1;
        int i5;
        String str16;
        String str17;
        RnBundleResponseParser.ServerTiming serverTiming;
        String str18;
        Request request;
        String str19;
        Response responseNetworkResponse2;
        String str20;
        RemoteBundleSourceImpl remoteBundleSourceImpl3;
        int iCode;
        String str21;
        Object obj15;
        Object obj16;
        Object obj17;
        String str22;
        Object obj18;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$26;
        Date date3;
        String str23;
        RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$12;
        findResAndMsg findresandmsg4;
        RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13;
        Response response4;
        Object obj19;
        String str24;
        int i6;
        int i7;
        String strIAuthTabCallback;
        String str25;
        String str26;
        String str27;
        int i8;
        RemoteBundleSourceImpl remoteBundleSourceImpl4;
        byte[] bArr;
        Object obj20;
        String str28;
        String str29;
        String str30;
        Object obj21;
        Object obj22;
        Response response5;
        String str31;
        byte[] bArr2;
        String str32;
        Object obj23;
        Response response6;
        RnPhaseObserver rnPhaseObserverIAuthTabCallbackDefault3;
        int i9;
        Object obj24;
        Object obj25;
        String str33;
        findResAndMsg findresandmsg5;
        String str34;
        int i10;
        Response response7;
        String str35;
        int i11;
        Date date4;
        String str36;
        RemoteBundleSourceImpl remoteBundleSourceImpl5;
        String str37;
        String str38;
        Response response8;
        String str39;
        byte[] bArr3;
        Response response9;
        String str40;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$27;
        PublicKey publicKeyIAuthTabCallback;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnWarmupCompleted;
        boolean zIAuthTabCallback;
        Response response10;
        String str41;
        String str42;
        Object obj26;
        String str43;
        Response response11;
        Response response12;
        int iCode2;
        int iCode3;
        Response response13;
        String str44;
        Response response14;
        String str45;
        String str46;
        Date date5;
        RemoteBundleSourceImpl remoteBundleSourceImpl6;
        Object obj27;
        int i12;
        String str47;
        Object obj28;
        Object obj29;
        Object obj30;
        Object obj31;
        String str48;
        Object obj32;
        Response response15;
        Response response16;
        byte[] bArr4;
        String str49;
        String str50;
        String str51;
        Response responseNetworkResponse3;
        int iCode4;
        Response response17;
        RemoteBundleResult error;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$28;
        Response response18;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2;
        String str52;
        Object obj33;
        Object obj34;
        Response responseNetworkResponse4;
        String str53;
        Date date6;
        int iCode5;
        ?? IAuthTabCallback2;
        byte[] bArr5;
        long jCurrentTimeMillis;
        String str54;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback;
        setRequestListener setrequestlistener;
        byte[] bArr6;
        byte[] bArr7;
        String str55;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$29;
        Date date7;
        RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$210;
        Response response19;
        int i13 = 2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{786482612, 1527767867, 1901841835, -1101776911}, 6 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String strIntern = ((String) objArr[0]).intern();
        findResAndMsg findresandmsg6 = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        Object obj35 = "signature";
        String str56 = "responseCode";
        String str57 = "company";
        ?? r10 = "from";
        String str58 = "react_native_debug";
        try {
            try {
                try {
                } catch (Throwable th5) {
                    th = th5;
                    response = response2;
                }
            } catch (Throwable th6) {
                th = th6;
                response = "signature";
            }
        } catch (Throwable th7) {
            th = th7;
            th2 = th;
            remoteBundleSourceImpl$fetchBundle$2 = r10;
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
            remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$2;
            RemoteBundleSourceImpl remoteBundleSourceImpl7 = remoteBundleSourceImpl$fetchBundle$22.this$0;
            String str59 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
            String str60 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
            th3 = Result.exceptionOrNull-impl(obj2);
            if (th3 != null) {
            }
        }
        switch (this.label) {
            case 0:
                ResultKt.onNavigationEvent(obj);
                RemoteBundleSourceImpl remoteBundleSourceImpl8 = this.this$0;
                str6 = this.$bundleURL;
                obj3 = "source";
                str7 = this.$bundleName;
                obj4 = "responseCode";
                String str61 = this.$region;
                obj5 = "deploymentId";
                str8 = this.$company;
                obj6 = "signature";
                date = this.$minDeployedAt;
                obj7 = "minDeployedAt";
                str9 = this.$cacheNamespace;
                try {
                    Result.Companion companion2 = Result.Companion;
                    obj8 = "company";
                    rnPhaseObserverIAuthTabCallbackDefault2 = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl8);
                    obj9 = "region";
                    this.L$0 = access15400.onNavigationEvent(findresandmsg6);
                    this.L$1 = remoteBundleSourceImpl8;
                    this.L$2 = str6;
                    this.L$3 = str7;
                    this.L$4 = str61;
                    this.L$5 = str8;
                    this.L$6 = date;
                    this.L$7 = str9;
                    this.L$8 = access15400.onNavigationEvent(findresandmsg6);
                    this.I$0 = 0;
                    this.label = 1;
                } catch (Throwable th8) {
                    th = th8;
                    obj35 = objOnWarmupCompleted;
                    str57 = "from";
                    str56 = "bundleName";
                    str = "RemoteBundleSourceImpl";
                    findresandmsg = findresandmsg6;
                    r10 = this;
                    th2 = th;
                    remoteBundleSourceImpl$fetchBundle$2 = r10;
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$2;
                    RemoteBundleSourceImpl remoteBundleSourceImpl72 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                    String str592 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                    String str602 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                    th3 = Result.exceptionOrNull-impl(obj2);
                    if (th3 != null) {
                    }
                }
                if (rnPhaseObserverIAuthTabCallbackDefault2.IAuthTabCallback(str6, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    int i14 = IAuthTabCallback + 113;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    return objOnWarmupCompleted;
                }
                findresandmsg2 = findresandmsg6;
                i3 = 0;
                remoteBundleSourceImpl2 = remoteBundleSourceImpl8;
                str10 = str61;
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                try {
                    Map mapOnExtraCallback = access8100.onExtraCallback();
                    mapOnExtraCallback.put("from", "RemoteBundleSourceImpl");
                    mapOnExtraCallback.put("bundleName", str7);
                    i4 = i3;
                    obj10 = obj9;
                    mapOnExtraCallback.put(obj10, str10);
                    findresandmsg3 = findresandmsg2;
                    obj11 = obj8;
                    mapOnExtraCallback.put(obj11, str8);
                    str11 = str9;
                    try {
                        str12 = str8;
                        findresandmsg = findresandmsg6;
                        try {
                            Object[] objArr2 = new Object[1];
                            a(new int[]{-393834964, 783819354}, (ViewConfiguration.getLongPressTimeout() >> 16) + 3, objArr2);
                            mapOnExtraCallback.put(((String) objArr2[0]).intern(), str6);
                            if (date == null) {
                                int i16 = IAuthTabCallback + 23;
                                onWarmupCompleted = i16 % 128;
                                int i17 = i16 % 2;
                                try {
                                    string = date.toString();
                                    obj12 = obj7;
                                } catch (Throwable th9) {
                                    th2 = th9;
                                    str57 = "from";
                                    str56 = "bundleName";
                                    str = "RemoteBundleSourceImpl";
                                    obj35 = objOnWarmupCompleted;
                                    remoteBundleSourceImpl$fetchBundle$2 = this;
                                    Result.Companion companion32 = Result.Companion;
                                    obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                                    remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$2;
                                    RemoteBundleSourceImpl remoteBundleSourceImpl722 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                                    String str5922 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                                    String str6022 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                                    th3 = Result.exceptionOrNull-impl(obj2);
                                    if (th3 != null) {
                                    }
                                }
                            } else {
                                obj12 = obj7;
                                string = null;
                            }
                            mapOnExtraCallback.put(obj12, string);
                            mapOnExtraCallback.putAll(MaxNativeAdLoaderImplb.onNavigationEvent.onWarmupCompleted(RemoteBundleSourceImpl.onExtraCallbackWithResult(remoteBundleSourceImpl2)));
                            Unit unit = Unit.INSTANCE;
                            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_fetch_started", access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
                            ReactLogKt.onNavigationEvent(str7, str6);
                            obj13 = obj12;
                            date2 = date;
                            requestBuild = new Request.Builder().headers(new Headers.Builder().add("x-toss-app-version", RnAppVersion.onExtraCallback.onWarmupCompleted(RemoteBundleSourceImpl.onExtraCallbackWithResult(remoteBundleSourceImpl2), RemoteBundleSourceImpl.onWarmupCompleted(remoteBundleSourceImpl2))).add("TossDeviceId", RemoteBundleSourceImpl.asBinder(remoteBundleSourceImpl2).onNavigationEvent()).build()).url(str6).build();
                            responseExecute = RemoteBundleSourceImpl.onNavigationEvent(remoteBundleSourceImpl2).newCall(requestBuild).execute();
                            try {
                                responseNetworkResponse = responseExecute.networkResponse();
                            } catch (Throwable th10) {
                                th = th10;
                                str57 = "from";
                                str56 = "bundleName";
                                str = "RemoteBundleSourceImpl";
                                obj35 = objOnWarmupCompleted;
                                remoteBundleSourceImpl$fetchBundle$24 = this;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            str57 = "from";
                            str56 = "bundleName";
                            str = "RemoteBundleSourceImpl";
                            obj35 = objOnWarmupCompleted;
                            r10 = this;
                            th2 = th;
                            remoteBundleSourceImpl$fetchBundle$2 = r10;
                            Result.Companion companion322 = Result.Companion;
                            obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                            remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$2;
                            RemoteBundleSourceImpl remoteBundleSourceImpl7222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                            String str59222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                            String str60222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                            th3 = Result.exceptionOrNull-impl(obj2);
                            if (th3 != null) {
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        str57 = "from";
                        str56 = "bundleName";
                        str = "RemoteBundleSourceImpl";
                        findresandmsg = findresandmsg6;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    str57 = "from";
                    str56 = "bundleName";
                    str = "RemoteBundleSourceImpl";
                    findresandmsg = findresandmsg6;
                    obj35 = objOnWarmupCompleted;
                    r10 = this;
                    th2 = th;
                    remoteBundleSourceImpl$fetchBundle$2 = r10;
                    Result.Companion companion3222 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$2;
                    RemoteBundleSourceImpl remoteBundleSourceImpl72222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                    String str592222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                    String str602222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                    th3 = Result.exceptionOrNull-impl(obj2);
                    if (th3 != null) {
                    }
                }
                if (responseNetworkResponse == null) {
                    try {
                        Headers headers = responseNetworkResponse.headers();
                        if (headers == null || (str13 = headers.get("content-length")) == null) {
                            longOrNull = null;
                        } else {
                            int i18 = onWarmupCompleted + 27;
                            IAuthTabCallback = i18 % 128;
                            int i19 = i18 % 2;
                            longOrNull = StringsKt.toLongOrNull(str13);
                        }
                        RnBundleResponseParser.ServerTiming serverTimingOnWarmupCompleted = RnBundleResponseParser.onWarmupCompleted.onWarmupCompleted(responseExecute.headers().get("server-timing"));
                        RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$14 = new RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1(remoteBundleSourceImpl2, str6, responseExecute, longOrNull, serverTimingOnWarmupCompleted, null);
                        try {
                            l = longOrNull;
                            if (responseExecute.code() == 200) {
                                try {
                                    Response responseNetworkResponse5 = responseExecute.networkResponse();
                                    try {
                                        try {
                                            try {
                                                if (responseNetworkResponse5 != null) {
                                                    int i20 = IAuthTabCallback + 1;
                                                    remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 = remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$14;
                                                    onWarmupCompleted = i20 % 128;
                                                    int i21 = i20 % 2;
                                                    if (responseNetworkResponse5.code() == 304) {
                                                        int i22 = onWarmupCompleted + 17;
                                                        IAuthTabCallback = i22 % 128;
                                                        int i23 = i22 % 2;
                                                        i5 = 1;
                                                    }
                                                    str16 = responseExecute.headers().get("x-toss-signature");
                                                    if (str16 == null) {
                                                        str16 = "";
                                                    }
                                                    int i24 = i5;
                                                    str17 = responseExecute.headers().get("x-toss-deployment-id");
                                                    if (str17 == null) {
                                                        str17 = "";
                                                    }
                                                    serverTiming = serverTimingOnWarmupCompleted;
                                                    str18 = responseExecute.headers().get("x-toss-deployed-at");
                                                    if (str18 == null) {
                                                        int i25 = IAuthTabCallback + 43;
                                                        onWarmupCompleted = i25 % 128;
                                                        int i26 = i25 % 2;
                                                        str18 = "";
                                                    }
                                                    request = requestBuild;
                                                    str19 = responseExecute.headers().get("x-toss-shared-min-deployed-at");
                                                    if (str19 == null) {
                                                        str19 = "";
                                                    }
                                                    responseNetworkResponse2 = responseExecute.networkResponse();
                                                    if (responseNetworkResponse2 == null) {
                                                        str20 = str19;
                                                        int i27 = onWarmupCompleted + 45;
                                                        remoteBundleSourceImpl3 = remoteBundleSourceImpl2;
                                                        IAuthTabCallback = i27 % 128;
                                                        int i28 = i27 % 2;
                                                        iCode = responseNetworkResponse2.code();
                                                    } else {
                                                        str20 = str19;
                                                        remoteBundleSourceImpl3 = remoteBundleSourceImpl2;
                                                        iCode = responseExecute.code();
                                                    }
                                                    ReactLogKt.IAuthTabCallback(str7, str6, iCode, str17);
                                                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "RemoteBundleSourceImpl");
                                                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundleName", str7);
                                                    Response responseNetworkResponse6 = responseExecute.networkResponse();
                                                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("statusCode", access14000.onNavigationEvent(responseNetworkResponse6 == null ? responseNetworkResponse6.code() : responseExecute.code()));
                                                    str21 = "bundleName";
                                                    Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("contentLength", access14000.onExtraCallback(responseExecute.body().contentLength()));
                                                    Object obj36 = obj6;
                                                    Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(obj36, str16);
                                                    obj15 = obj36;
                                                    Object obj37 = obj5;
                                                    Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(obj37, str17);
                                                    obj16 = obj37;
                                                    Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("deployedAt", str18);
                                                    Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(obj10, str10);
                                                    obj17 = obj10;
                                                    str22 = str12;
                                                    obj18 = obj11;
                                                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_fetch_response", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, getWrite.IAuthTabCallback(obj11, str22)}), (String) null, false, (String) null, 56, (Object) null);
                                                    byte[] bArrExtraCallback = responseExecute.body().source().extraCallback();
                                                    remoteBundleSourceImpl$fetchBundle$26 = this;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$0 = access15400.onNavigationEvent(findresandmsg);
                                                    RemoteBundleSourceImpl remoteBundleSourceImpl9 = remoteBundleSourceImpl3;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$1 = remoteBundleSourceImpl9;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$2 = str7;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$3 = str10;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$4 = str22;
                                                    date3 = date2;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$5 = date3;
                                                    str23 = str11;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$6 = str23;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$7 = access15400.onNavigationEvent(findresandmsg3);
                                                    remoteBundleSourceImpl$fetchBundle$26.L$8 = access15400.onNavigationEvent(request);
                                                    remoteBundleSourceImpl$fetchBundle$26.L$9 = responseExecute;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$10 = responseExecute;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$11 = access15400.onNavigationEvent(serverTiming);
                                                    remoteBundleSourceImpl$fetchBundle$26.L$12 = access15400.onNavigationEvent(remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1);
                                                    remoteBundleSourceImpl$fetchBundle$26.L$13 = access15400.onNavigationEvent(l);
                                                    remoteBundleSourceImpl$fetchBundle$26.L$14 = str16;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$15 = str17;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$16 = str18;
                                                    String str62 = str20;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$17 = str62;
                                                    remoteBundleSourceImpl$fetchBundle$26.L$18 = bArrExtraCallback;
                                                    String str63 = str10;
                                                    remoteBundleSourceImpl$fetchBundle$26.I$0 = i4;
                                                    remoteBundleSourceImpl$fetchBundle$26.I$1 = 0;
                                                    remoteBundleSourceImpl$fetchBundle$26.I$2 = i24;
                                                    remoteBundleSourceImpl$fetchBundle$26.label = 2;
                                                    remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$12 = remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1;
                                                    String str64 = str17;
                                                    if (remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$12.invoke(remoteBundleSourceImpl$fetchBundle$26) != objOnWarmupCompleted) {
                                                        int i29 = onWarmupCompleted + 49;
                                                        IAuthTabCallback = i29 % 128;
                                                        int i30 = i29 % 2;
                                                        obj20 = objOnWarmupCompleted;
                                                        return obj20;
                                                    }
                                                    findresandmsg4 = findresandmsg3;
                                                    remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13 = remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$12;
                                                    response4 = responseExecute;
                                                    obj19 = objOnWarmupCompleted;
                                                    str24 = str63;
                                                    i6 = i24;
                                                    i7 = 0;
                                                    strIAuthTabCallback = "from";
                                                    str25 = str62;
                                                    str26 = str18;
                                                    str27 = str64;
                                                    i8 = i4;
                                                    remoteBundleSourceImpl4 = remoteBundleSourceImpl9;
                                                    bArr = bArrExtraCallback;
                                                    str31 = "RemoteBundleSourceImpl";
                                                    bArr2 = bArr;
                                                    try {
                                                        rnPhaseObserverIAuthTabCallbackDefault3 = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl4);
                                                        remoteBundleSourceImpl$fetchBundle$26.L$0 = access15400.onNavigationEvent(findresandmsg);
                                                        remoteBundleSourceImpl$fetchBundle$26.L$1 = remoteBundleSourceImpl4;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$2 = str7;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$3 = str24;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$4 = str22;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$5 = date3;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$6 = str23;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$7 = access15400.onNavigationEvent(findresandmsg4);
                                                        remoteBundleSourceImpl$fetchBundle$26.L$8 = access15400.onNavigationEvent(request);
                                                        remoteBundleSourceImpl$fetchBundle$26.L$9 = responseExecute;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$10 = response4;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$11 = access15400.onNavigationEvent(serverTiming);
                                                        remoteBundleSourceImpl$fetchBundle$26.L$12 = access15400.onNavigationEvent(remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13);
                                                        remoteBundleSourceImpl$fetchBundle$26.L$13 = access15400.onNavigationEvent(l);
                                                        remoteBundleSourceImpl$fetchBundle$26.L$14 = str16;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$15 = str27;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$16 = str26;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$17 = str25;
                                                        remoteBundleSourceImpl$fetchBundle$26.L$18 = bArr2;
                                                        int i31 = i8;
                                                        remoteBundleSourceImpl$fetchBundle$26.I$0 = i31;
                                                        RemoteBundleSourceImpl remoteBundleSourceImpl10 = remoteBundleSourceImpl4;
                                                        int i32 = i7;
                                                        remoteBundleSourceImpl$fetchBundle$26.I$1 = i32;
                                                        int i33 = i6;
                                                        remoteBundleSourceImpl$fetchBundle$26.I$2 = i33;
                                                        i9 = i33;
                                                        remoteBundleSourceImpl$fetchBundle$26.label = 3;
                                                        Response response20 = responseExecute;
                                                        obj24 = obj19;
                                                        if (rnPhaseObserverIAuthTabCallbackDefault3.IAuthTabCallback((access13800<? super Unit>) remoteBundleSourceImpl$fetchBundle$26) != obj24) {
                                                            obj20 = obj24;
                                                            return obj20;
                                                        }
                                                        obj25 = obj24;
                                                        str33 = str25;
                                                        findresandmsg5 = findresandmsg4;
                                                        str34 = str24;
                                                        i10 = i31;
                                                        response7 = response4;
                                                        str35 = str26;
                                                        i11 = i32;
                                                        date4 = date3;
                                                        str36 = str16;
                                                        remoteBundleSourceImpl5 = remoteBundleSourceImpl10;
                                                        str37 = str23;
                                                        str38 = str7;
                                                        response8 = response20;
                                                        str39 = str27;
                                                        bArr3 = bArr2;
                                                        try {
                                                            publicKeyIAuthTabCallback = RemoteBundleSourceImpl.IAuthTabCallback(remoteBundleSourceImpl5).IAuthTabCallback(str34, str22);
                                                            int i34 = i11;
                                                            tTAppOpenAdTransActivityOnWarmupCompleted = new TTBaseActivity().onWarmupCompleted(bArr3);
                                                            int i35 = i10;
                                                            try {
                                                                zIAuthTabCallback = dbExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(tTAppOpenAdTransActivityOnWarmupCompleted, str36, publicKeyIAuthTabCallback);
                                                                try {
                                                                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnWarmupCompleted, (Throwable) null);
                                                                    if (zIAuthTabCallback) {
                                                                        try {
                                                                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                            String str65 = strIAuthTabCallback;
                                                                            String str66 = str31;
                                                                            try {
                                                                                Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(str65, str66);
                                                                                String str67 = str21;
                                                                                try {
                                                                                    Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(str67, str38);
                                                                                    str42 = str66;
                                                                                    Object obj38 = obj17;
                                                                                    try {
                                                                                        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(obj38, str34);
                                                                                        Object obj39 = obj18;
                                                                                        Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(obj39, str22);
                                                                                        Response responseNetworkResponse7 = response7.networkResponse();
                                                                                        if (responseNetworkResponse7 != null) {
                                                                                            try {
                                                                                                iCode2 = responseNetworkResponse7.code();
                                                                                            } catch (Throwable th14) {
                                                                                                th = th14;
                                                                                                str21 = str67;
                                                                                                response12 = response8;
                                                                                                r10 = remoteBundleSourceImpl$fetchBundle$26;
                                                                                                str57 = str65;
                                                                                                str = str42;
                                                                                                obj35 = obj25;
                                                                                                responseExecute = response12;
                                                                                                str56 = str21;
                                                                                                try {
                                                                                                    throw th;
                                                                                                } catch (Throwable th15) {
                                                                                                    CloseableKt.closeFinally(responseExecute, th);
                                                                                                    throw th15;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            iCode2 = response7.code();
                                                                                        }
                                                                                        byte[] bArr8 = bArr3;
                                                                                        String str68 = str35;
                                                                                        Object obj40 = obj4;
                                                                                        response12 = response8;
                                                                                        String str69 = str36;
                                                                                        try {
                                                                                            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray3, "react_native_debug", "bundle_signature_verification_failed", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, getWrite.IAuthTabCallback(obj40, access14000.onNavigationEvent(iCode2))}), 4, (Object) null);
                                                                                            auth authVar = auth.onNavigationEvent;
                                                                                            Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback(str67, str38);
                                                                                            Pair pairIAuthTabCallback14 = getWrite.IAuthTabCallback(obj3, obj15);
                                                                                            str21 = str67;
                                                                                            try {
                                                                                                Pair pairIAuthTabCallback15 = getWrite.IAuthTabCallback(strIntern, "fail");
                                                                                                Pair pairIAuthTabCallback16 = getWrite.IAuthTabCallback(obj38, str34);
                                                                                                Pair pairIAuthTabCallback17 = getWrite.IAuthTabCallback(obj39, str22);
                                                                                                Response responseNetworkResponse8 = response7.networkResponse();
                                                                                                if (responseNetworkResponse8 != null) {
                                                                                                    try {
                                                                                                        iCode3 = responseNetworkResponse8.code();
                                                                                                    } catch (Throwable th16) {
                                                                                                        th = th16;
                                                                                                        r10 = remoteBundleSourceImpl$fetchBundle$26;
                                                                                                        str57 = str65;
                                                                                                        str = str42;
                                                                                                        obj35 = obj25;
                                                                                                        responseExecute = response12;
                                                                                                        str56 = str21;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } else {
                                                                                                    iCode3 = response7.code();
                                                                                                }
                                                                                                Pair pairIAuthTabCallback18 = getWrite.IAuthTabCallback(obj40, String.valueOf(iCode3));
                                                                                                Pair[] pairArr = new Pair[6];
                                                                                                pairArr[0] = pairIAuthTabCallback13;
                                                                                                pairArr[1] = pairIAuthTabCallback14;
                                                                                                pairArr[2] = pairIAuthTabCallback15;
                                                                                                pairArr[3] = pairIAuthTabCallback16;
                                                                                                pairArr[4] = pairIAuthTabCallback17;
                                                                                                try {
                                                                                                    pairArr[5] = pairIAuthTabCallback18;
                                                                                                    auth.IAuthTabCallback(authVar, "BundleVerification: signature result=fail", access8100.onWarmupCompleted(pairArr), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
                                                                                                    RnPhaseObserver rnPhaseObserverIAuthTabCallbackDefault4 = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl5);
                                                                                                    RnBundleInfo rnBundleInfo2 = new RnBundleInfo((RnBundleInfo.Source) null, (String) null, (String) null, (String) null, (String) null, str39, (Integer) null, (Long) null, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8159, (DefaultConstructorMarker) null);
                                                                                                    String simpleName = SecurityException.class.getSimpleName();
                                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$0 = access15400.onNavigationEvent(findresandmsg);
                                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$1 = str38;
                                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$2 = access15400.onNavigationEvent(findresandmsg5);
                                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$3 = access15400.onNavigationEvent(request);
                                                                                                    try {
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$4 = response12;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$5 = response7;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$6 = access15400.onNavigationEvent(serverTiming);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$7 = access15400.onNavigationEvent(remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$8 = access15400.onNavigationEvent(l);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$9 = access15400.onNavigationEvent(str69);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$10 = access15400.onNavigationEvent(str39);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$11 = access15400.onNavigationEvent(str68);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$12 = access15400.onNavigationEvent(str33);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$13 = access15400.onNavigationEvent(bArr8);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$14 = access15400.onNavigationEvent(publicKeyIAuthTabCallback);
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$15 = null;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$16 = null;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$17 = null;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.L$18 = null;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.I$0 = i35;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.I$1 = i34;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.I$2 = i9;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.Z$0 = zIAuthTabCallback;
                                                                                                        remoteBundleSourceImpl$fetchBundle$26.label = 4;
                                                                                                        str41 = str65;
                                                                                                        str43 = str21;
                                                                                                        response10 = response12;
                                                                                                        Response response21 = response7;
                                                                                                        obj26 = obj25;
                                                                                                        try {
                                                                                                            if (RnPhaseObserver.onExtraCallbackWithResult(rnPhaseObserverIAuthTabCallbackDefault4, rnBundleInfo2, simpleName, false, this, 4, null) == obj26) {
                                                                                                                obj20 = obj26;
                                                                                                            } else {
                                                                                                                response13 = response21;
                                                                                                                str44 = str38;
                                                                                                                response14 = response10;
                                                                                                                try {
                                                                                                                    SecurityException securityException = new SecurityException("번들 파일 검증에 실패했습니다. 서비스: " + str44);
                                                                                                                    responseNetworkResponse3 = response13.networkResponse();
                                                                                                                    if (responseNetworkResponse3 == null) {
                                                                                                                        int i36 = onWarmupCompleted + 107;
                                                                                                                        IAuthTabCallback = i36 % 128;
                                                                                                                        if (i36 % 2 != 0) {
                                                                                                                            iCode4 = responseNetworkResponse3.code();
                                                                                                                            int i37 = 33 / 0;
                                                                                                                        } else {
                                                                                                                            iCode4 = responseNetworkResponse3.code();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        iCode4 = response13.code();
                                                                                                                    }
                                                                                                                    RemoteBundleResult error2 = new RemoteBundleResult.Error(securityException, access14000.onNavigationEvent(iCode4));
                                                                                                                    response17 = response14;
                                                                                                                    error = error2;
                                                                                                                    obj35 = obj26;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$26;
                                                                                                                    str57 = str41;
                                                                                                                    str56 = str43;
                                                                                                                    str = str42;
                                                                                                                    CloseableKt.closeFinally(response17, (Throwable) null);
                                                                                                                    obj2 = Result.constructor-impl(error);
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                                                                                                                    RemoteBundleSourceImpl remoteBundleSourceImpl722222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                                                                                                                    String str5922222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                                                                                                                    String str6022222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                                                                                                                    th3 = Result.exceptionOrNull-impl(obj2);
                                                                                                                    if (th3 != null) {
                                                                                                                        return obj2;
                                                                                                                    }
                                                                                                                    String simpleName2 = th3.getClass().getSimpleName();
                                                                                                                    boolean z2 = th3 instanceof CancellationException;
                                                                                                                    RnPhaseObserver rnPhaseObserverIAuthTabCallbackDefault5 = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl722222);
                                                                                                                    RnBundleInfo rnBundleInfo3 = new RnBundleInfo((RnBundleInfo.Source) null, (String) null, (String) null, (String) null, str5922222, (String) null, (Integer) null, (Long) null, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8175, (DefaultConstructorMarker) null);
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$0 = access15400.onNavigationEvent(findresandmsg);
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$1 = remoteBundleSourceImpl722222;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$2 = str5922222;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$3 = str6022222;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$4 = th3;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$5 = simpleName2;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$6 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$7 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$8 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$9 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$10 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$11 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$12 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$13 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$14 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$15 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$16 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$17 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$18 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.L$19 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.I$0 = 0;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.I$1 = z2 ? 1 : 0;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22.label = 7;
                                                                                                                    if (rnPhaseObserverIAuthTabCallbackDefault5.onWarmupCompleted(rnBundleInfo3, simpleName2, z2, (access13800<? super Unit>) remoteBundleSourceImpl$fetchBundle$22) == obj35) {
                                                                                                                        return obj35;
                                                                                                                    }
                                                                                                                    str2 = str5922222;
                                                                                                                    str3 = str6022222;
                                                                                                                    i = 0;
                                                                                                                    str4 = simpleName2;
                                                                                                                    i2 = z2 ? 1 : 0;
                                                                                                                    remoteBundleSourceImpl = remoteBundleSourceImpl722222;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23 = remoteBundleSourceImpl$fetchBundle$22;
                                                                                                                    rnPhaseObserverIAuthTabCallbackDefault = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl);
                                                                                                                    rnBundleInfo = new RnBundleInfo((RnBundleInfo.Source) null, (String) null, (String) null, (String) null, str2, (String) null, (Integer) null, (Long) null, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8175, (DefaultConstructorMarker) null);
                                                                                                                    z = i2 == 0;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.L$0 = access15400.onNavigationEvent(findresandmsg);
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.L$1 = str3;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.L$2 = th3;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.L$3 = str4;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.L$4 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.L$5 = null;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.I$0 = i;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.I$1 = i2;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$23.label = 8;
                                                                                                                    if (rnPhaseObserverIAuthTabCallbackDefault.onNavigationEvent(rnBundleInfo, str4, z, (access13800<? super Unit>) remoteBundleSourceImpl$fetchBundle$23) != obj35) {
                                                                                                                        return obj35;
                                                                                                                    }
                                                                                                                    str5 = str4;
                                                                                                                    th4 = th3;
                                                                                                                } catch (Throwable th17) {
                                                                                                                    th = th17;
                                                                                                                    response11 = response14;
                                                                                                                    obj35 = obj26;
                                                                                                                    r10 = remoteBundleSourceImpl$fetchBundle$26;
                                                                                                                    str57 = str41;
                                                                                                                    str56 = str43;
                                                                                                                    responseExecute = response11;
                                                                                                                    str = str42;
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th18) {
                                                                                                            th = th18;
                                                                                                            th = th;
                                                                                                            response11 = response10;
                                                                                                            obj35 = obj26;
                                                                                                            r10 = remoteBundleSourceImpl$fetchBundle$26;
                                                                                                            str57 = str41;
                                                                                                            str56 = str43;
                                                                                                            responseExecute = response11;
                                                                                                            str = str42;
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th19) {
                                                                                                        th = th19;
                                                                                                        response10 = response12;
                                                                                                        str41 = str65;
                                                                                                        obj26 = obj25;
                                                                                                        str43 = str21;
                                                                                                        th = th;
                                                                                                        response11 = response10;
                                                                                                        obj35 = obj26;
                                                                                                        r10 = remoteBundleSourceImpl$fetchBundle$26;
                                                                                                        str57 = str41;
                                                                                                        str56 = str43;
                                                                                                        responseExecute = response11;
                                                                                                        str = str42;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (Throwable th20) {
                                                                                                    th = th20;
                                                                                                    str41 = str65;
                                                                                                    obj26 = obj25;
                                                                                                    response10 = response12;
                                                                                                }
                                                                                            } catch (Throwable th21) {
                                                                                                th = th21;
                                                                                                str41 = str65;
                                                                                                obj26 = obj25;
                                                                                                response10 = response12;
                                                                                            }
                                                                                        } catch (Throwable th22) {
                                                                                            th = th22;
                                                                                            str43 = str67;
                                                                                            str41 = str65;
                                                                                            obj26 = obj25;
                                                                                            response10 = response12;
                                                                                        }
                                                                                    } catch (Throwable th23) {
                                                                                        th = th23;
                                                                                        str43 = str67;
                                                                                        response10 = response8;
                                                                                        str41 = str65;
                                                                                        obj26 = obj25;
                                                                                    }
                                                                                } catch (Throwable th24) {
                                                                                    th = th24;
                                                                                    str43 = str67;
                                                                                    str42 = str66;
                                                                                    str41 = str65;
                                                                                    obj26 = obj25;
                                                                                    response10 = response8;
                                                                                    th = th;
                                                                                    response11 = response10;
                                                                                    obj35 = obj26;
                                                                                    r10 = remoteBundleSourceImpl$fetchBundle$26;
                                                                                    str57 = str41;
                                                                                    str56 = str43;
                                                                                    responseExecute = response11;
                                                                                    str = str42;
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th25) {
                                                                                th = th25;
                                                                                str41 = str65;
                                                                                str42 = str66;
                                                                                obj26 = obj25;
                                                                                str43 = str21;
                                                                            }
                                                                        } catch (Throwable th26) {
                                                                            th = th26;
                                                                            response10 = response8;
                                                                            str41 = strIAuthTabCallback;
                                                                            str42 = str31;
                                                                            obj26 = obj25;
                                                                        }
                                                                    } else {
                                                                        String str70 = str35;
                                                                        Response response22 = response8;
                                                                        byte[] bArr9 = bArr3;
                                                                        str45 = str31;
                                                                        int i38 = i9;
                                                                        String str71 = str21;
                                                                        Object obj41 = obj4;
                                                                        String str72 = str36;
                                                                        str46 = strIAuthTabCallback;
                                                                        Object obj42 = obj3;
                                                                        try {
                                                                            RnPhaseObserver rnPhaseObserverIAuthTabCallbackDefault6 = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl5);
                                                                            RnBundleInfo rnBundleInfo4 = new RnBundleInfo((RnBundleInfo.Source) null, (String) null, (String) null, (String) null, (String) null, str39, (Integer) null, (Long) null, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8159, (DefaultConstructorMarker) null);
                                                                            str21 = str71;
                                                                            try {
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$0 = access15400.onNavigationEvent(findresandmsg);
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$1 = remoteBundleSourceImpl5;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$2 = str38;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$3 = str34;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$4 = str22;
                                                                                date5 = date4;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$5 = date5;
                                                                                remoteBundleSourceImpl6 = remoteBundleSourceImpl5;
                                                                                String str73 = str37;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$6 = str73;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$7 = access15400.onNavigationEvent(findresandmsg5);
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$8 = access15400.onNavigationEvent(request);
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$9 = response22;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$10 = response7;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$11 = access15400.onNavigationEvent(serverTiming);
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$12 = access15400.onNavigationEvent(remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13);
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$13 = access15400.onNavigationEvent(l);
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$14 = str72;
                                                                                remoteBundleSourceImpl$fetchBundle$26.L$15 = str39;
                                                                                try {
                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$16 = str70;
                                                                                    Response response23 = response7;
                                                                                    String str74 = str33;
                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$17 = str74;
                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$18 = bArr9;
                                                                                    remoteBundleSourceImpl$fetchBundle$26.L$19 = access15400.onNavigationEvent(publicKeyIAuthTabCallback);
                                                                                    remoteBundleSourceImpl$fetchBundle$26.I$0 = i35;
                                                                                    remoteBundleSourceImpl$fetchBundle$26.I$1 = i34;
                                                                                    remoteBundleSourceImpl$fetchBundle$26.I$2 = i38;
                                                                                    remoteBundleSourceImpl$fetchBundle$26.Z$0 = zIAuthTabCallback;
                                                                                    remoteBundleSourceImpl$fetchBundle$26.label = 5;
                                                                                    obj27 = obj18;
                                                                                    i12 = i38;
                                                                                    str47 = str70;
                                                                                    obj28 = obj41;
                                                                                    response9 = response22;
                                                                                    obj29 = obj16;
                                                                                    obj30 = obj42;
                                                                                    obj31 = obj13;
                                                                                    obj23 = obj25;
                                                                                    str48 = strIntern;
                                                                                    try {
                                                                                        obj32 = obj23;
                                                                                        if (RnPhaseObserver.onExtraCallbackWithResult(rnPhaseObserverIAuthTabCallbackDefault6, rnBundleInfo4, null, false, this, 6, null) == obj32) {
                                                                                            obj20 = obj32;
                                                                                        } else {
                                                                                            response15 = response9;
                                                                                            response16 = response23;
                                                                                            bArr4 = bArr9;
                                                                                            str49 = str74;
                                                                                            str50 = str72;
                                                                                            str51 = str73;
                                                                                            try {
                                                                                                convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                                                str52 = str45;
                                                                                                try {
                                                                                                    Pair pairIAuthTabCallback19 = getWrite.IAuthTabCallback(str46, str52);
                                                                                                    obj23 = obj32;
                                                                                                    str56 = str21;
                                                                                                    try {
                                                                                                        Pair pairIAuthTabCallback20 = getWrite.IAuthTabCallback(str56, str38);
                                                                                                        response18 = response15;
                                                                                                        obj33 = obj17;
                                                                                                        try {
                                                                                                            strIAuthTabCallback = getWrite.IAuthTabCallback(obj33, str34);
                                                                                                            obj34 = obj27;
                                                                                                            Pair pairIAuthTabCallback21 = getWrite.IAuthTabCallback(obj34, str22);
                                                                                                            responseNetworkResponse4 = response16.networkResponse();
                                                                                                            try {
                                                                                                                if (responseNetworkResponse4 == null) {
                                                                                                                    str53 = str48;
                                                                                                                    int i39 = onWarmupCompleted + 109;
                                                                                                                    date6 = date5;
                                                                                                                    IAuthTabCallback = i39 % 128;
                                                                                                                    if (i39 % 2 != 0) {
                                                                                                                        iCode5 = responseNetworkResponse4.code();
                                                                                                                        int i40 = 94 / 0;
                                                                                                                    } else {
                                                                                                                        iCode5 = responseNetworkResponse4.code();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    str53 = str48;
                                                                                                                    date6 = date5;
                                                                                                                    iCode5 = response16.code();
                                                                                                                }
                                                                                                                IAuthTabCallback2 = getWrite.IAuthTabCallback(obj28, access14000.onNavigationEvent(iCode5));
                                                                                                                bArr5 = bArr4;
                                                                                                                ?? r4 = new Pair[5];
                                                                                                                r4[0] = pairIAuthTabCallback19;
                                                                                                                r4[1] = pairIAuthTabCallback20;
                                                                                                                r4[2] = strIAuthTabCallback;
                                                                                                                r4[3] = pairIAuthTabCallback21;
                                                                                                                try {
                                                                                                                    r4[4] = IAuthTabCallback2;
                                                                                                                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "react_native_debug", "bundle_signature_verified", access8100.onWarmupCompleted((Pair[]) r4), (String) null, false, (String) null, 56, (Object) null);
                                                                                                                    jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                                } catch (Throwable th27) {
                                                                                                                    th = th27;
                                                                                                                    str50 = str52;
                                                                                                                }
                                                                                                            } catch (Throwable th28) {
                                                                                                                th = th28;
                                                                                                                str50 = str52;
                                                                                                            }
                                                                                                        } catch (Throwable th29) {
                                                                                                            th = th29;
                                                                                                            str50 = str52;
                                                                                                            strIAuthTabCallback = str46;
                                                                                                            th = th;
                                                                                                            response6 = response18;
                                                                                                            str32 = str50;
                                                                                                            remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                                            str = str32;
                                                                                                            str57 = strIAuthTabCallback;
                                                                                                            responseExecute = response6;
                                                                                                            obj35 = obj23;
                                                                                                            r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th30) {
                                                                                                        th = th30;
                                                                                                        response18 = response15;
                                                                                                    }
                                                                                                } catch (Throwable th31) {
                                                                                                    th = th31;
                                                                                                    response18 = response15;
                                                                                                    obj23 = obj32;
                                                                                                    str50 = str52;
                                                                                                    strIAuthTabCallback = str46;
                                                                                                    str56 = str21;
                                                                                                    th = th;
                                                                                                    response6 = response18;
                                                                                                    str32 = str50;
                                                                                                    remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                                    str = str32;
                                                                                                    str57 = strIAuthTabCallback;
                                                                                                    responseExecute = response6;
                                                                                                    obj35 = obj23;
                                                                                                    r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Throwable th32) {
                                                                                                th = th32;
                                                                                                response18 = response15;
                                                                                                obj23 = obj32;
                                                                                                strIAuthTabCallback = str46;
                                                                                                str50 = str45;
                                                                                            }
                                                                                            try {
                                                                                                if (i12 == 0) {
                                                                                                    try {
                                                                                                        if (RemoteBundleSourceImpl.onExtraCallback(remoteBundleSourceImpl6).onExtraCallback(str38, str50, str39, str47, str49, str34, str22, str51)) {
                                                                                                            IAuthTabCallback2 = new Object[]{RemoteBundleSourceImpl.onExtraCallback(remoteBundleSourceImpl6), str38, Long.valueOf(jCurrentTimeMillis), str34, str22, str51};
                                                                                                            r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4.onWarmupCompleted(IAuthTabCallback2, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1055338990, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1055338990);
                                                                                                            try {
                                                                                                                tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(RemoteBundleSourceImpl.onExtraCallback(remoteBundleSourceImpl6).onExtraCallbackWithResult(str38, str34, str22, str51)));
                                                                                                            } catch (Exception e) {
                                                                                                                str54 = str58;
                                                                                                                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str54, "metadata_read_failed_after_update", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str46, str52), getWrite.IAuthTabCallback(str56, str38), getWrite.IAuthTabCallback(obj33, str34), getWrite.IAuthTabCallback(obj34, str22)}));
                                                                                                                IOException iOException = new IOException("업데이트 후 기존 번들 " + str38 + " 의 메타데이터를 읽는데 실패했습니다.", e);
                                                                                                                Response responseNetworkResponse9 = response16.networkResponse();
                                                                                                                error = new RemoteBundleResult.Error(iOException, access14000.onNavigationEvent(responseNetworkResponse9 != null ? responseNetworkResponse9.code() : response16.code()));
                                                                                                            }
                                                                                                            try {
                                                                                                                BundleMetadata bundleMetadataOnExtraCallback = BundleMetadata.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                                                                                                                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                                                                                                                setrequestlistener = new setRequestListener(str38, ((File) r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4.onWarmupCompleted(new Object[]{RemoteBundleSourceImpl.onExtraCallback(remoteBundleSourceImpl6), str38, str34, str22, str51}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195)).getPath(), bundleMetadataOnExtraCallback.IAuthTabCallbackStub(), bundleMetadataOnExtraCallback.onNavigationEvent(), (String) BundleMetadata.onExtraCallback(2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{bundleMetadataOnExtraCallback}), bundleMetadataOnExtraCallback.onTransact(), access14000.onExtraCallback(bundleMetadataOnExtraCallback.asBinder()), access14000.onExtraCallback(jCurrentTimeMillis), true);
                                                                                                                str54 = str58;
                                                                                                                bArr6 = bArr5;
                                                                                                                try {
                                                                                                                    if (date6 == null) {
                                                                                                                        Locale locale = Locale.US;
                                                                                                                        Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                                                        bArr7 = bArr6;
                                                                                                                        str58 = str54;
                                                                                                                        String str75 = str51;
                                                                                                                        Object[] objArr3 = new Object[1];
                                                                                                                        a(new int[]{759980, -1649830602, -1240098374, 1077483539, 127665262, 1275323850, 419851936, -2025793059}, 14 - TextUtils.getOffsetBefore("", 0), objArr3);
                                                                                                                        Date dateOnWarmupCompleted = setCampaign.onWarmupCompleted(new IdGeneratorExternalSyntheticLambda1(((String) objArr3[0]).intern(), locale), setrequestlistener.onExtraCallbackWithResult());
                                                                                                                        if (dateOnWarmupCompleted != null) {
                                                                                                                            date7 = date6;
                                                                                                                            if (!dateOnWarmupCompleted.before(date7)) {
                                                                                                                                str = str52;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            date7 = date6;
                                                                                                                        }
                                                                                                                        Object obj43 = obj31;
                                                                                                                        str = str52;
                                                                                                                        str55 = str46;
                                                                                                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "react_native_debug", "min_deployed_at_rejected", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str46, str52), getWrite.IAuthTabCallback(str56, str38), getWrite.IAuthTabCallback("bundleDeployedAt", setrequestlistener.onExtraCallbackWithResult()), getWrite.IAuthTabCallback(obj43, date7.toString())}), (String) null, false, (String) null, 56, (Object) null);
                                                                                                                        auth.IAuthTabCallback(auth.onNavigationEvent, "BundleVerification: minDeployedAt result=rejected", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str56, str38), getWrite.IAuthTabCallback(obj30, obj43), getWrite.IAuthTabCallback(str53, "rejected"), getWrite.IAuthTabCallback("bundleDeployedAt", setrequestlistener.onExtraCallbackWithResult()), getWrite.IAuthTabCallback(obj43, date7.toString()), getWrite.IAuthTabCallback(obj29, str39)}), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
                                                                                                                        RemoteBundleSourceImpl.onExtraCallback(remoteBundleSourceImpl6).IAuthTabCallback(str38, str34, str22, str75);
                                                                                                                        IllegalStateException illegalStateException = new IllegalStateException("Bundle " + str38 + " does not meet minDeployedAt requirement: bundle=" + setrequestlistener.onExtraCallbackWithResult() + ", required=" + date7);
                                                                                                                        Response responseNetworkResponse10 = response16.networkResponse();
                                                                                                                        error = new RemoteBundleResult.Error(illegalStateException, access14000.onNavigationEvent(responseNetworkResponse10 != null ? responseNetworkResponse10.code() : response16.code()));
                                                                                                                        remoteBundleSourceImpl$fetchBundle$29 = this;
                                                                                                                        response17 = response18;
                                                                                                                        str57 = str55;
                                                                                                                        obj35 = obj23;
                                                                                                                        remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$29;
                                                                                                                        CloseableKt.closeFinally(response17, (Throwable) null);
                                                                                                                        obj2 = Result.constructor-impl(error);
                                                                                                                        remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                                                                                                                        RemoteBundleSourceImpl remoteBundleSourceImpl7222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                                                                                                                        String str59222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                                                                                                                        String str60222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                                                                                                                        th3 = Result.exceptionOrNull-impl(obj2);
                                                                                                                        if (th3 != null) {
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        bArr7 = bArr6;
                                                                                                                        str = str52;
                                                                                                                        str58 = str54;
                                                                                                                    }
                                                                                                                    str55 = str46;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$29 = this;
                                                                                                                    response17 = response18;
                                                                                                                    error = new RemoteBundleResult.Success(setrequestlistener, setrequestlistener.IAuthTabCallbackDefault() ^ true ? 304 : 200, bArr7.length);
                                                                                                                    str57 = str55;
                                                                                                                    obj35 = obj23;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$29;
                                                                                                                    CloseableKt.closeFinally(response17, (Throwable) null);
                                                                                                                    obj2 = Result.constructor-impl(error);
                                                                                                                    remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                                                                                                                    RemoteBundleSourceImpl remoteBundleSourceImpl72222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                                                                                                                    String str592222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                                                                                                                    String str602222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                                                                                                                    th3 = Result.exceptionOrNull-impl(obj2);
                                                                                                                    if (th3 != null) {
                                                                                                                    }
                                                                                                                } catch (Throwable th33) {
                                                                                                                    th = th33;
                                                                                                                    th = th;
                                                                                                                    response6 = response18;
                                                                                                                    str32 = str50;
                                                                                                                    remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                                                    str = str32;
                                                                                                                    str57 = strIAuthTabCallback;
                                                                                                                    responseExecute = response6;
                                                                                                                    obj35 = obj23;
                                                                                                                    r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Throwable th34) {
                                                                                                                try {
                                                                                                                    throw th34;
                                                                                                                } catch (Throwable th35) {
                                                                                                                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, th34);
                                                                                                                    throw th35;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            str54 = str58;
                                                                                                            try {
                                                                                                                if (i12 != 0) {
                                                                                                                    bArr6 = bArr5;
                                                                                                                    if (bArr6.length == 0) {
                                                                                                                        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray2, "react_native_debug", "not_modified_but_no_local_bundle", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str46, str52), getWrite.IAuthTabCallback(str56, str38)}), 4, (Object) null);
                                                                                                                        IOException iOException2 = new IOException("HTTP_NOT_MODIFIED but no matching local bundle for " + str38);
                                                                                                                        Response responseNetworkResponse11 = response16.networkResponse();
                                                                                                                        error = new RemoteBundleResult.Error(iOException2, access14000.onNavigationEvent(responseNetworkResponse11 != null ? responseNetworkResponse11.code() : response16.code()));
                                                                                                                        str = str52;
                                                                                                                        str58 = str54;
                                                                                                                        str55 = str46;
                                                                                                                        remoteBundleSourceImpl$fetchBundle$29 = this;
                                                                                                                        response17 = response18;
                                                                                                                        str57 = str55;
                                                                                                                        obj35 = obj23;
                                                                                                                        remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$29;
                                                                                                                        CloseableKt.closeFinally(response17, (Throwable) null);
                                                                                                                        obj2 = Result.constructor-impl(error);
                                                                                                                        remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                                                                                                                        RemoteBundleSourceImpl remoteBundleSourceImpl722222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                                                                                                                        String str5922222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                                                                                                                        String str6022222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                                                                                                                        th3 = Result.exceptionOrNull-impl(obj2);
                                                                                                                        if (th3 != null) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    bArr6 = bArr5;
                                                                                                                }
                                                                                                                RemoteBundleSourceImpl.onExtraCallback(remoteBundleSourceImpl6).IAuthTabCallback(str38, new TTBaseActivity().onWarmupCompleted(bArr6), str50, str39, str47, str49, jCurrentTimeMillis, str34, str22, RemoteBundleSourceImpl.onWarmupCompleted(remoteBundleSourceImpl6).requestPostMessageChannelWithExtras(), str51);
                                                                                                                setrequestlistener = new setRequestListener(str38, ((File) r8lambda2dEdIe2Xf7DEclMCF5TaIJLDVi4.onWarmupCompleted(new Object[]{RemoteBundleSourceImpl.onExtraCallback(remoteBundleSourceImpl6), str38, str34, str22, str51}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1891120194, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1891120195)).getPath(), str50, str39, str47, str49, access14000.onExtraCallback(jCurrentTimeMillis), access14000.onExtraCallback(jCurrentTimeMillis), false);
                                                                                                                if (date6 == null) {
                                                                                                                }
                                                                                                                str55 = str46;
                                                                                                                remoteBundleSourceImpl$fetchBundle$29 = this;
                                                                                                                response17 = response18;
                                                                                                                error = new RemoteBundleResult.Success(setrequestlistener, setrequestlistener.IAuthTabCallbackDefault() ^ true ? 304 : 200, bArr7.length);
                                                                                                                str57 = str55;
                                                                                                                obj35 = obj23;
                                                                                                                remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$29;
                                                                                                                CloseableKt.closeFinally(response17, (Throwable) null);
                                                                                                                obj2 = Result.constructor-impl(error);
                                                                                                                remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                                                                                                                RemoteBundleSourceImpl remoteBundleSourceImpl7222222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                                                                                                                String str59222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                                                                                                                String str60222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                                                                                                                th3 = Result.exceptionOrNull-impl(obj2);
                                                                                                                if (th3 != null) {
                                                                                                                }
                                                                                                            } catch (Throwable th36) {
                                                                                                                th = th36;
                                                                                                                str50 = str52;
                                                                                                                str58 = str54;
                                                                                                                strIAuthTabCallback = str46;
                                                                                                                th = th;
                                                                                                                response6 = response18;
                                                                                                                str32 = str50;
                                                                                                                remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                                                str = str32;
                                                                                                                str57 = strIAuthTabCallback;
                                                                                                                responseExecute = response6;
                                                                                                                obj35 = obj23;
                                                                                                                r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th37) {
                                                                                                        th = th37;
                                                                                                        str50 = str52;
                                                                                                        str58 = str58;
                                                                                                        strIAuthTabCallback = str46;
                                                                                                        response6 = response18;
                                                                                                        str32 = str50;
                                                                                                        remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                                        str = str32;
                                                                                                        str57 = strIAuthTabCallback;
                                                                                                        responseExecute = response6;
                                                                                                        obj35 = obj23;
                                                                                                        r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                                        throw th;
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th38) {
                                                                                                th = th38;
                                                                                                response6 = response18;
                                                                                                str58 = IAuthTabCallback2;
                                                                                                strIAuthTabCallback = str46;
                                                                                                str32 = str52;
                                                                                                remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                                str = str32;
                                                                                                str57 = strIAuthTabCallback;
                                                                                                responseExecute = response6;
                                                                                                obj35 = obj23;
                                                                                                r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th39) {
                                                                                        th = th39;
                                                                                        strIAuthTabCallback = str46;
                                                                                        str31 = str45;
                                                                                        str56 = str21;
                                                                                        th = th;
                                                                                        str40 = str31;
                                                                                        remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                        str = str40;
                                                                                        responseExecute = response9;
                                                                                        str57 = strIAuthTabCallback;
                                                                                        obj35 = obj23;
                                                                                        r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th40) {
                                                                                    th = th40;
                                                                                    strIAuthTabCallback = str46;
                                                                                    str31 = str45;
                                                                                    obj23 = obj25;
                                                                                    response9 = response22;
                                                                                    str56 = str21;
                                                                                    th = th;
                                                                                    str40 = str31;
                                                                                    remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                                    str = str40;
                                                                                    responseExecute = response9;
                                                                                    str57 = strIAuthTabCallback;
                                                                                    obj35 = obj23;
                                                                                    r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th41) {
                                                                                th = th41;
                                                                                response9 = response22;
                                                                                strIAuthTabCallback = str46;
                                                                                str31 = str45;
                                                                                obj23 = obj25;
                                                                                str56 = str21;
                                                                            }
                                                                        } catch (Throwable th42) {
                                                                            th = th42;
                                                                            response9 = response22;
                                                                            strIAuthTabCallback = str46;
                                                                            str56 = str71;
                                                                            str31 = str45;
                                                                            obj23 = obj25;
                                                                        }
                                                                    }
                                                                    return obj20;
                                                                } catch (Throwable th43) {
                                                                    th = th43;
                                                                    response9 = response8;
                                                                    obj23 = obj25;
                                                                }
                                                            } catch (Throwable th44) {
                                                                response9 = response8;
                                                                str40 = str31;
                                                                obj23 = obj25;
                                                                str56 = str21;
                                                                try {
                                                                    throw th44;
                                                                } catch (Throwable th45) {
                                                                    try {
                                                                        CloseableKt.closeFinally(tTAppOpenAdTransActivityOnWarmupCompleted, th44);
                                                                        throw th45;
                                                                    } catch (Throwable th46) {
                                                                        th = th46;
                                                                        th = th;
                                                                        remoteBundleSourceImpl$fetchBundle$27 = this;
                                                                        str = str40;
                                                                        responseExecute = response9;
                                                                        str57 = strIAuthTabCallback;
                                                                        obj35 = obj23;
                                                                        r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th47) {
                                                            th = th47;
                                                            response9 = response8;
                                                            str40 = str31;
                                                            obj23 = obj25;
                                                            str56 = str21;
                                                        }
                                                    } catch (Throwable th48) {
                                                        str32 = str31;
                                                        obj23 = obj19;
                                                        str56 = str21;
                                                        th = th48;
                                                        response6 = responseExecute;
                                                        remoteBundleSourceImpl$fetchBundle$27 = this;
                                                        str = str32;
                                                        str57 = strIAuthTabCallback;
                                                        responseExecute = response6;
                                                        obj35 = obj23;
                                                        r10 = remoteBundleSourceImpl$fetchBundle$27;
                                                        throw th;
                                                    }
                                                } else {
                                                    remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 = remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$14;
                                                }
                                                remoteBundleSourceImpl$fetchBundle$26.L$9 = responseExecute;
                                                remoteBundleSourceImpl$fetchBundle$26.L$10 = responseExecute;
                                                remoteBundleSourceImpl$fetchBundle$26.L$11 = access15400.onNavigationEvent(serverTiming);
                                                remoteBundleSourceImpl$fetchBundle$26.L$12 = access15400.onNavigationEvent(remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1);
                                                remoteBundleSourceImpl$fetchBundle$26.L$13 = access15400.onNavigationEvent(l);
                                                remoteBundleSourceImpl$fetchBundle$26.L$14 = str16;
                                                remoteBundleSourceImpl$fetchBundle$26.L$15 = str17;
                                                remoteBundleSourceImpl$fetchBundle$26.L$16 = str18;
                                                String str622 = str20;
                                                remoteBundleSourceImpl$fetchBundle$26.L$17 = str622;
                                                remoteBundleSourceImpl$fetchBundle$26.L$18 = bArrExtraCallback;
                                                String str632 = str10;
                                                remoteBundleSourceImpl$fetchBundle$26.I$0 = i4;
                                                remoteBundleSourceImpl$fetchBundle$26.I$1 = 0;
                                                remoteBundleSourceImpl$fetchBundle$26.I$2 = i24;
                                                remoteBundleSourceImpl$fetchBundle$26.label = 2;
                                                remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$12 = remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1;
                                                String str642 = str17;
                                                if (remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$12.invoke(remoteBundleSourceImpl$fetchBundle$26) != objOnWarmupCompleted) {
                                                }
                                            } catch (Throwable th49) {
                                                th = th49;
                                                str14 = "from";
                                                str15 = "RemoteBundleSourceImpl";
                                                obj14 = objOnWarmupCompleted;
                                                str56 = str21;
                                                th = th;
                                                remoteBundleSourceImpl$fetchBundle$25 = this;
                                                response3 = responseExecute;
                                                str = str15;
                                                str57 = str14;
                                                obj35 = obj14;
                                                responseExecute = response3;
                                                r10 = remoteBundleSourceImpl$fetchBundle$25;
                                                throw th;
                                            }
                                            Pair pairIAuthTabCallback42 = getWrite.IAuthTabCallback("contentLength", access14000.onExtraCallback(responseExecute.body().contentLength()));
                                            Object obj362 = obj6;
                                            Pair pairIAuthTabCallback52 = getWrite.IAuthTabCallback(obj362, str16);
                                            obj15 = obj362;
                                            Object obj372 = obj5;
                                            Pair pairIAuthTabCallback62 = getWrite.IAuthTabCallback(obj372, str17);
                                            obj16 = obj372;
                                            Pair pairIAuthTabCallback72 = getWrite.IAuthTabCallback("deployedAt", str18);
                                            Pair pairIAuthTabCallback82 = getWrite.IAuthTabCallback(obj10, str10);
                                            obj17 = obj10;
                                            str22 = str12;
                                            obj18 = obj11;
                                            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_fetch_response", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback42, pairIAuthTabCallback52, pairIAuthTabCallback62, pairIAuthTabCallback72, pairIAuthTabCallback82, getWrite.IAuthTabCallback(obj11, str22)}), (String) null, false, (String) null, 56, (Object) null);
                                            byte[] bArrExtraCallback2 = responseExecute.body().source().extraCallback();
                                            remoteBundleSourceImpl$fetchBundle$26 = this;
                                            remoteBundleSourceImpl$fetchBundle$26.L$0 = access15400.onNavigationEvent(findresandmsg);
                                            RemoteBundleSourceImpl remoteBundleSourceImpl92 = remoteBundleSourceImpl3;
                                            remoteBundleSourceImpl$fetchBundle$26.L$1 = remoteBundleSourceImpl92;
                                            remoteBundleSourceImpl$fetchBundle$26.L$2 = str7;
                                            remoteBundleSourceImpl$fetchBundle$26.L$3 = str10;
                                            remoteBundleSourceImpl$fetchBundle$26.L$4 = str22;
                                            date3 = date2;
                                            remoteBundleSourceImpl$fetchBundle$26.L$5 = date3;
                                            str23 = str11;
                                            remoteBundleSourceImpl$fetchBundle$26.L$6 = str23;
                                            remoteBundleSourceImpl$fetchBundle$26.L$7 = access15400.onNavigationEvent(findresandmsg3);
                                            remoteBundleSourceImpl$fetchBundle$26.L$8 = access15400.onNavigationEvent(request);
                                        } catch (Throwable th50) {
                                            th = th50;
                                            str14 = "from";
                                            str15 = "RemoteBundleSourceImpl";
                                            obj14 = objOnWarmupCompleted;
                                            str56 = str21;
                                        }
                                        str19 = responseExecute.headers().get("x-toss-shared-min-deployed-at");
                                        if (str19 == null) {
                                        }
                                        responseNetworkResponse2 = responseExecute.networkResponse();
                                        if (responseNetworkResponse2 == null) {
                                        }
                                        ReactLogKt.IAuthTabCallback(str7, str6, iCode, str17);
                                        Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("from", "RemoteBundleSourceImpl");
                                        Pair pairIAuthTabCallback23 = getWrite.IAuthTabCallback("bundleName", str7);
                                        Response responseNetworkResponse62 = responseExecute.networkResponse();
                                        Pair pairIAuthTabCallback32 = getWrite.IAuthTabCallback("statusCode", access14000.onNavigationEvent(responseNetworkResponse62 == null ? responseNetworkResponse62.code() : responseExecute.code()));
                                        str21 = "bundleName";
                                    } catch (Throwable th51) {
                                        th = th51;
                                        str14 = "from";
                                        str56 = "bundleName";
                                        str15 = "RemoteBundleSourceImpl";
                                        obj14 = objOnWarmupCompleted;
                                    }
                                    i5 = 0;
                                    str16 = responseExecute.headers().get("x-toss-signature");
                                    if (str16 == null) {
                                    }
                                    int i242 = i5;
                                    str17 = responseExecute.headers().get("x-toss-deployment-id");
                                    if (str17 == null) {
                                    }
                                    serverTiming = serverTimingOnWarmupCompleted;
                                    str18 = responseExecute.headers().get("x-toss-deployed-at");
                                    if (str18 == null) {
                                    }
                                    request = requestBuild;
                                } catch (Throwable th52) {
                                    th = th52;
                                    str14 = "from";
                                    str56 = "bundleName";
                                    str15 = "RemoteBundleSourceImpl";
                                    obj14 = objOnWarmupCompleted;
                                }
                            } else {
                                str28 = "from";
                                str56 = "bundleName";
                                str29 = "RemoteBundleSourceImpl";
                                str30 = strIntern;
                                obj21 = obj3;
                                obj22 = obj4;
                                try {
                                    RemoteBundleSourceImpl$fetchBundle$2 remoteBundleSourceImpl$fetchBundle$211 = this;
                                    try {
                                        remoteBundleSourceImpl$fetchBundle$211.L$0 = access15400.onNavigationEvent(findresandmsg);
                                        remoteBundleSourceImpl$fetchBundle$211.L$1 = str7;
                                        remoteBundleSourceImpl$fetchBundle$211.L$2 = access15400.onNavigationEvent(findresandmsg3);
                                        remoteBundleSourceImpl$fetchBundle$211.L$3 = access15400.onNavigationEvent(requestBuild);
                                        remoteBundleSourceImpl$fetchBundle$211.L$4 = responseExecute;
                                        remoteBundleSourceImpl$fetchBundle$211.L$5 = responseExecute;
                                        remoteBundleSourceImpl$fetchBundle$211.L$6 = access15400.onNavigationEvent(serverTimingOnWarmupCompleted);
                                        remoteBundleSourceImpl$fetchBundle$211.L$7 = access15400.onNavigationEvent(remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$14);
                                        remoteBundleSourceImpl$fetchBundle$211.L$8 = access15400.onNavigationEvent(l);
                                        remoteBundleSourceImpl$fetchBundle$211.I$0 = i4;
                                        remoteBundleSourceImpl$fetchBundle$211.I$1 = 0;
                                        remoteBundleSourceImpl$fetchBundle$211.label = 6;
                                        obj35 = objOnWarmupCompleted;
                                        if (remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$14.invoke(remoteBundleSourceImpl$fetchBundle$211) == obj35) {
                                            return obj35;
                                        }
                                        response5 = responseExecute;
                                        remoteBundleSourceImpl$fetchBundle$210 = remoteBundleSourceImpl$fetchBundle$211;
                                        try {
                                            str57 = str28;
                                            try {
                                                response19 = responseExecute;
                                                try {
                                                    str = str29;
                                                    try {
                                                        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "remote_http_error", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str57, str29), getWrite.IAuthTabCallback(str56, str7), getWrite.IAuthTabCallback(obj22, access14000.onNavigationEvent(response5.code())), getWrite.IAuthTabCallback("responseMessage", response5.message())}), 4, (Object) null);
                                                        auth.IAuthTabCallback(auth.onNavigationEvent, "BundleVerification: http-error result=error", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str56, str7), getWrite.IAuthTabCallback(obj21, "http-error"), getWrite.IAuthTabCallback(str30, "error"), getWrite.IAuthTabCallback(obj22, String.valueOf(response5.code())), getWrite.IAuthTabCallback("error", response5.message())}), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
                                                        error = new RemoteBundleResult.Error(new IOException("HTTP error " + response5.code() + ": " + response5.message()), access14000.onNavigationEvent(response5.code()));
                                                        response17 = response19;
                                                        remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$210;
                                                        CloseableKt.closeFinally(response17, (Throwable) null);
                                                        obj2 = Result.constructor-impl(error);
                                                        remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                                                        RemoteBundleSourceImpl remoteBundleSourceImpl72222222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                                                        String str592222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                                                        String str602222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                                                        th3 = Result.exceptionOrNull-impl(obj2);
                                                        if (th3 != null) {
                                                        }
                                                    } catch (Throwable th53) {
                                                        th = th53;
                                                        th = th;
                                                        response3 = response19;
                                                        remoteBundleSourceImpl$fetchBundle$25 = remoteBundleSourceImpl$fetchBundle$210;
                                                        responseExecute = response3;
                                                        r10 = remoteBundleSourceImpl$fetchBundle$25;
                                                        throw th;
                                                    }
                                                } catch (Throwable th54) {
                                                    th = th54;
                                                    str = str29;
                                                    th = th;
                                                    response3 = response19;
                                                    remoteBundleSourceImpl$fetchBundle$25 = remoteBundleSourceImpl$fetchBundle$210;
                                                    responseExecute = response3;
                                                    r10 = remoteBundleSourceImpl$fetchBundle$25;
                                                    throw th;
                                                }
                                            } catch (Throwable th55) {
                                                th = th55;
                                                response19 = responseExecute;
                                            }
                                        } catch (Throwable th56) {
                                            th = th56;
                                            response19 = responseExecute;
                                            str = str29;
                                            str57 = str28;
                                        }
                                    } catch (Throwable th57) {
                                        th = th57;
                                        str = str29;
                                        str57 = str28;
                                        obj35 = objOnWarmupCompleted;
                                        remoteBundleSourceImpl$fetchBundle$24 = remoteBundleSourceImpl$fetchBundle$211;
                                        th = th;
                                        response3 = responseExecute;
                                        remoteBundleSourceImpl$fetchBundle$25 = remoteBundleSourceImpl$fetchBundle$24;
                                        responseExecute = response3;
                                        r10 = remoteBundleSourceImpl$fetchBundle$25;
                                        throw th;
                                    }
                                } catch (Throwable th58) {
                                    th = th58;
                                    remoteBundleSourceImpl$fetchBundle$24 = this;
                                    str = str29;
                                    str57 = str28;
                                    obj35 = objOnWarmupCompleted;
                                }
                            }
                        } catch (Throwable th59) {
                            th = th59;
                            str57 = "from";
                            str56 = "bundleName";
                            str = "RemoteBundleSourceImpl";
                            obj35 = objOnWarmupCompleted;
                            remoteBundleSourceImpl$fetchBundle$24 = this;
                        }
                    } catch (Throwable th60) {
                        th = th60;
                        str57 = "from";
                        str56 = "bundleName";
                        str = "RemoteBundleSourceImpl";
                        obj35 = objOnWarmupCompleted;
                        r10 = this;
                        throw th;
                    }
                }
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str58, "remote_fetch_unexpected_error", th4, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str57, str), getWrite.IAuthTabCallback(str56, str3), getWrite.IAuthTabCallback("errorType", str5)}));
                return new RemoteBundleResult.Error(th4, null, 2, null);
            case 1:
                int i41 = this.I$0;
                findResAndMsg findresandmsg7 = (findResAndMsg) this.L$8;
                String str76 = (String) this.L$7;
                Date date8 = (Date) this.L$6;
                String str77 = (String) this.L$5;
                String str78 = (String) this.L$4;
                String str79 = (String) this.L$3;
                String str80 = (String) this.L$2;
                RemoteBundleSourceImpl remoteBundleSourceImpl11 = (RemoteBundleSourceImpl) this.L$1;
                try {
                    ResultKt.onNavigationEvent(obj);
                    remoteBundleSourceImpl2 = remoteBundleSourceImpl11;
                    str10 = str78;
                    obj7 = "minDeployedAt";
                    str9 = str76;
                    obj4 = "responseCode";
                    obj6 = "signature";
                    date = date8;
                    obj5 = "deploymentId";
                    str8 = str77;
                    obj3 = "source";
                    str7 = str79;
                    obj8 = "company";
                    findresandmsg2 = findresandmsg7;
                    str6 = str80;
                    obj9 = "region";
                    i3 = i41;
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Map mapOnExtraCallback2 = access8100.onExtraCallback();
                    mapOnExtraCallback2.put("from", "RemoteBundleSourceImpl");
                    mapOnExtraCallback2.put("bundleName", str7);
                    i4 = i3;
                    obj10 = obj9;
                    mapOnExtraCallback2.put(obj10, str10);
                    findresandmsg3 = findresandmsg2;
                    obj11 = obj8;
                    mapOnExtraCallback2.put(obj11, str8);
                    str11 = str9;
                    str12 = str8;
                    findresandmsg = findresandmsg6;
                    Object[] objArr22 = new Object[1];
                    a(new int[]{-393834964, 783819354}, (ViewConfiguration.getLongPressTimeout() >> 16) + 3, objArr22);
                    mapOnExtraCallback2.put(((String) objArr22[0]).intern(), str6);
                    if (date == null) {
                    }
                    mapOnExtraCallback2.put(obj12, string);
                    mapOnExtraCallback2.putAll(MaxNativeAdLoaderImplb.onNavigationEvent.onWarmupCompleted(RemoteBundleSourceImpl.onExtraCallbackWithResult(remoteBundleSourceImpl2)));
                    Unit unit2 = Unit.INSTANCE;
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_fetch_started", access8100.onExtraCallbackWithResult(mapOnExtraCallback2), (String) null, false, (String) null, 56, (Object) null);
                    ReactLogKt.onNavigationEvent(str7, str6);
                    obj13 = obj12;
                    date2 = date;
                    requestBuild = new Request.Builder().headers(new Headers.Builder().add("x-toss-app-version", RnAppVersion.onExtraCallback.onWarmupCompleted(RemoteBundleSourceImpl.onExtraCallbackWithResult(remoteBundleSourceImpl2), RemoteBundleSourceImpl.onWarmupCompleted(remoteBundleSourceImpl2))).add("TossDeviceId", RemoteBundleSourceImpl.asBinder(remoteBundleSourceImpl2).onNavigationEvent()).build()).url(str6).build();
                    responseExecute = RemoteBundleSourceImpl.onNavigationEvent(remoteBundleSourceImpl2).newCall(requestBuild).execute();
                    responseNetworkResponse = responseExecute.networkResponse();
                    if (responseNetworkResponse == null) {
                    }
                } catch (Throwable th61) {
                    th2 = th61;
                    obj35 = objOnWarmupCompleted;
                    str57 = "from";
                    str56 = "bundleName";
                    str = "RemoteBundleSourceImpl";
                    findresandmsg = findresandmsg6;
                    remoteBundleSourceImpl$fetchBundle$2 = this;
                    Result.Companion companion32222 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$2;
                    RemoteBundleSourceImpl remoteBundleSourceImpl722222222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                    String str5922222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                    String str6022222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                    th3 = Result.exceptionOrNull-impl(obj2);
                    if (th3 != null) {
                    }
                }
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str58, "remote_fetch_unexpected_error", th4, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str57, str), getWrite.IAuthTabCallback(str56, str3), getWrite.IAuthTabCallback("errorType", str5)}));
                return new RemoteBundleResult.Error(th4, null, 2, null);
            case 2:
                int i42 = this.I$2;
                int i43 = this.I$1;
                int i44 = this.I$0;
                byte[] bArr10 = (byte[]) this.L$18;
                String str81 = (String) this.L$17;
                String str82 = (String) this.L$16;
                String str83 = (String) this.L$15;
                String str84 = (String) this.L$14;
                Long l2 = (Long) this.L$13;
                remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13 = (Function1) this.L$12;
                RnBundleResponseParser.ServerTiming serverTiming2 = (RnBundleResponseParser.ServerTiming) this.L$11;
                Response response24 = (Response) this.L$10;
                Response response25 = (Closeable) this.L$9;
                Request request2 = (Request) this.L$8;
                findresandmsg4 = (findResAndMsg) this.L$7;
                String str85 = (String) this.L$6;
                Date date9 = (Date) this.L$5;
                String str86 = (String) this.L$4;
                String str87 = (String) this.L$3;
                String str88 = (String) this.L$2;
                remoteBundleSourceImpl4 = (RemoteBundleSourceImpl) this.L$1;
                ResultKt.onNavigationEvent(obj);
                obj15 = "signature";
                obj16 = "deploymentId";
                obj18 = "company";
                obj17 = "region";
                str21 = "bundleName";
                i7 = i43;
                i6 = i42;
                l = l2;
                serverTiming = serverTiming2;
                responseExecute = response25;
                request = request2;
                str23 = str85;
                date3 = date9;
                str22 = str86;
                str24 = str87;
                obj3 = "source";
                obj19 = objOnWarmupCompleted;
                remoteBundleSourceImpl$fetchBundle$26 = this;
                str27 = str83;
                str16 = str84;
                str7 = str88;
                findresandmsg = findresandmsg6;
                i8 = i44;
                str26 = str82;
                obj4 = "responseCode";
                obj13 = "minDeployedAt";
                response4 = response24;
                bArr = bArr10;
                strIAuthTabCallback = "from";
                str25 = str81;
                str31 = "RemoteBundleSourceImpl";
                bArr2 = bArr;
                rnPhaseObserverIAuthTabCallbackDefault3 = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl4);
                remoteBundleSourceImpl$fetchBundle$26.L$0 = access15400.onNavigationEvent(findresandmsg);
                remoteBundleSourceImpl$fetchBundle$26.L$1 = remoteBundleSourceImpl4;
                remoteBundleSourceImpl$fetchBundle$26.L$2 = str7;
                remoteBundleSourceImpl$fetchBundle$26.L$3 = str24;
                remoteBundleSourceImpl$fetchBundle$26.L$4 = str22;
                remoteBundleSourceImpl$fetchBundle$26.L$5 = date3;
                remoteBundleSourceImpl$fetchBundle$26.L$6 = str23;
                remoteBundleSourceImpl$fetchBundle$26.L$7 = access15400.onNavigationEvent(findresandmsg4);
                remoteBundleSourceImpl$fetchBundle$26.L$8 = access15400.onNavigationEvent(request);
                remoteBundleSourceImpl$fetchBundle$26.L$9 = responseExecute;
                remoteBundleSourceImpl$fetchBundle$26.L$10 = response4;
                remoteBundleSourceImpl$fetchBundle$26.L$11 = access15400.onNavigationEvent(serverTiming);
                remoteBundleSourceImpl$fetchBundle$26.L$12 = access15400.onNavigationEvent(remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13);
                remoteBundleSourceImpl$fetchBundle$26.L$13 = access15400.onNavigationEvent(l);
                remoteBundleSourceImpl$fetchBundle$26.L$14 = str16;
                remoteBundleSourceImpl$fetchBundle$26.L$15 = str27;
                remoteBundleSourceImpl$fetchBundle$26.L$16 = str26;
                remoteBundleSourceImpl$fetchBundle$26.L$17 = str25;
                remoteBundleSourceImpl$fetchBundle$26.L$18 = bArr2;
                int i312 = i8;
                remoteBundleSourceImpl$fetchBundle$26.I$0 = i312;
                RemoteBundleSourceImpl remoteBundleSourceImpl102 = remoteBundleSourceImpl4;
                int i322 = i7;
                remoteBundleSourceImpl$fetchBundle$26.I$1 = i322;
                int i332 = i6;
                remoteBundleSourceImpl$fetchBundle$26.I$2 = i332;
                i9 = i332;
                remoteBundleSourceImpl$fetchBundle$26.label = 3;
                Response response202 = responseExecute;
                obj24 = obj19;
                if (rnPhaseObserverIAuthTabCallbackDefault3.IAuthTabCallback((access13800<? super Unit>) remoteBundleSourceImpl$fetchBundle$26) != obj24) {
                }
                break;
            case 3:
                int i45 = this.I$2;
                int i46 = this.I$1;
                int i47 = this.I$0;
                byte[] bArr11 = (byte[]) this.L$18;
                String str89 = (String) this.L$17;
                String str90 = (String) this.L$16;
                String str91 = (String) this.L$15;
                String str92 = (String) this.L$14;
                Long l3 = (Long) this.L$13;
                remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$13 = (Function1) this.L$12;
                RnBundleResponseParser.ServerTiming serverTiming3 = (RnBundleResponseParser.ServerTiming) this.L$11;
                Response response26 = (Response) this.L$10;
                Response response27 = (Closeable) this.L$9;
                Request request3 = (Request) this.L$8;
                findResAndMsg findresandmsg8 = (findResAndMsg) this.L$7;
                String str93 = (String) this.L$6;
                Date date10 = (Date) this.L$5;
                String str94 = (String) this.L$4;
                String str95 = (String) this.L$3;
                String str96 = (String) this.L$2;
                RemoteBundleSourceImpl remoteBundleSourceImpl12 = (RemoteBundleSourceImpl) this.L$1;
                ResultKt.onNavigationEvent(obj);
                obj15 = "signature";
                obj16 = "deploymentId";
                obj18 = "company";
                obj17 = "region";
                str21 = "bundleName";
                i10 = i47;
                str33 = str89;
                str36 = str92;
                l = l3;
                serverTiming = serverTiming3;
                request = request3;
                date4 = date10;
                str22 = str94;
                obj4 = "responseCode";
                remoteBundleSourceImpl$fetchBundle$26 = this;
                str31 = "RemoteBundleSourceImpl";
                findresandmsg = findresandmsg6;
                i9 = i45;
                str35 = str90;
                str39 = str91;
                str37 = str93;
                remoteBundleSourceImpl5 = remoteBundleSourceImpl12;
                obj3 = "source";
                obj13 = "minDeployedAt";
                i11 = i46;
                response7 = response26;
                response8 = response27;
                findresandmsg5 = findresandmsg8;
                str38 = str96;
                obj25 = objOnWarmupCompleted;
                bArr3 = bArr11;
                strIAuthTabCallback = "from";
                str34 = str95;
                publicKeyIAuthTabCallback = RemoteBundleSourceImpl.IAuthTabCallback(remoteBundleSourceImpl5).IAuthTabCallback(str34, str22);
                int i342 = i11;
                tTAppOpenAdTransActivityOnWarmupCompleted = new TTBaseActivity().onWarmupCompleted(bArr3);
                int i352 = i10;
                zIAuthTabCallback = dbExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(tTAppOpenAdTransActivityOnWarmupCompleted, str36, publicKeyIAuthTabCallback);
                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnWarmupCompleted, (Throwable) null);
                if (zIAuthTabCallback) {
                }
                return obj20;
            case 4:
                response13 = (Response) this.L$5;
                response14 = (Closeable) this.L$4;
                str44 = (String) this.L$1;
                ResultKt.onNavigationEvent(obj);
                remoteBundleSourceImpl$fetchBundle$26 = this;
                str42 = "RemoteBundleSourceImpl";
                findresandmsg = findresandmsg6;
                obj26 = objOnWarmupCompleted;
                str43 = "bundleName";
                str41 = "from";
                SecurityException securityException2 = new SecurityException("번들 파일 검증에 실패했습니다. 서비스: " + str44);
                responseNetworkResponse3 = response13.networkResponse();
                if (responseNetworkResponse3 == null) {
                }
                RemoteBundleResult error22 = new RemoteBundleResult.Error(securityException2, access14000.onNavigationEvent(iCode4));
                response17 = response14;
                error = error22;
                obj35 = obj26;
                remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$26;
                str57 = str41;
                str56 = str43;
                str = str42;
                CloseableKt.closeFinally(response17, (Throwable) null);
                obj2 = Result.constructor-impl(error);
                remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                RemoteBundleSourceImpl remoteBundleSourceImpl7222222222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                String str59222222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                String str60222222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                th3 = Result.exceptionOrNull-impl(obj2);
                if (th3 != null) {
                }
                break;
            case 5:
                int i48 = this.I$2;
                byte[] bArr12 = (byte[]) this.L$18;
                String str97 = (String) this.L$17;
                String str98 = (String) this.L$16;
                String str99 = (String) this.L$15;
                str50 = (String) this.L$14;
                response16 = (Response) this.L$10;
                response = (Closeable) this.L$9;
                String str100 = (String) this.L$6;
                Date date11 = (Date) this.L$5;
                String str101 = (String) this.L$4;
                String str102 = (String) this.L$3;
                String str103 = (String) this.L$2;
                RemoteBundleSourceImpl remoteBundleSourceImpl13 = (RemoteBundleSourceImpl) this.L$1;
                try {
                    ResultKt.onNavigationEvent(obj);
                    obj28 = "responseCode";
                    obj29 = "deploymentId";
                    obj30 = "source";
                    obj31 = "minDeployedAt";
                    obj32 = objOnWarmupCompleted;
                    obj27 = "company";
                    obj17 = "region";
                    str21 = "bundleName";
                    str45 = "RemoteBundleSourceImpl";
                    str49 = str97;
                    str39 = str99;
                    str22 = str101;
                    str38 = str103;
                    bArr4 = bArr12;
                    str46 = "from";
                    str48 = strIntern;
                    str51 = str100;
                    str34 = str102;
                    findresandmsg = findresandmsg6;
                    i12 = i48;
                    str47 = str98;
                    date5 = date11;
                    remoteBundleSourceImpl6 = remoteBundleSourceImpl13;
                    response15 = response;
                    convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    str52 = str45;
                    Pair pairIAuthTabCallback192 = getWrite.IAuthTabCallback(str46, str52);
                    obj23 = obj32;
                    str56 = str21;
                    Pair pairIAuthTabCallback202 = getWrite.IAuthTabCallback(str56, str38);
                    response18 = response15;
                    obj33 = obj17;
                    strIAuthTabCallback = getWrite.IAuthTabCallback(obj33, str34);
                    obj34 = obj27;
                    Pair pairIAuthTabCallback212 = getWrite.IAuthTabCallback(obj34, str22);
                    responseNetworkResponse4 = response16.networkResponse();
                    if (responseNetworkResponse4 == null) {
                    }
                    IAuthTabCallback2 = getWrite.IAuthTabCallback(obj28, access14000.onNavigationEvent(iCode5));
                    bArr5 = bArr4;
                    ?? r42 = new Pair[5];
                    r42[0] = pairIAuthTabCallback192;
                    r42[1] = pairIAuthTabCallback202;
                    r42[2] = strIAuthTabCallback;
                    r42[3] = pairIAuthTabCallback212;
                    r42[4] = IAuthTabCallback2;
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "react_native_debug", "bundle_signature_verified", access8100.onWarmupCompleted((Pair[]) r42), (String) null, false, (String) null, 56, (Object) null);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (i12 == 0) {
                    }
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str58, "remote_fetch_unexpected_error", th4, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str57, str), getWrite.IAuthTabCallback(str56, str3), getWrite.IAuthTabCallback("errorType", str5)}));
                    return new RemoteBundleResult.Error(th4, null, 2, null);
                } catch (Throwable th62) {
                    th = th62;
                    obj35 = objOnWarmupCompleted;
                    str57 = "from";
                    str56 = "bundleName";
                    str = "RemoteBundleSourceImpl";
                    findresandmsg = findresandmsg6;
                    responseExecute = response;
                    r10 = this;
                    throw th;
                }
            case 6:
                response5 = (Response) this.L$5;
                Response response28 = (Closeable) this.L$4;
                String str104 = (String) this.L$1;
                ResultKt.onNavigationEvent(obj);
                obj21 = "source";
                str28 = "from";
                findresandmsg = findresandmsg6;
                obj22 = "responseCode";
                str7 = str104;
                remoteBundleSourceImpl$fetchBundle$210 = this;
                str56 = "bundleName";
                str29 = "RemoteBundleSourceImpl";
                responseExecute = response28;
                obj35 = objOnWarmupCompleted;
                str30 = strIntern;
                str57 = str28;
                response19 = responseExecute;
                str = str29;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "remote_http_error", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str57, str29), getWrite.IAuthTabCallback(str56, str7), getWrite.IAuthTabCallback(obj22, access14000.onNavigationEvent(response5.code())), getWrite.IAuthTabCallback("responseMessage", response5.message())}), 4, (Object) null);
                auth.IAuthTabCallback(auth.onNavigationEvent, "BundleVerification: http-error result=error", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str56, str7), getWrite.IAuthTabCallback(obj21, "http-error"), getWrite.IAuthTabCallback(str30, "error"), getWrite.IAuthTabCallback(obj22, String.valueOf(response5.code())), getWrite.IAuthTabCallback("error", response5.message())}), (auth.onExtraCallbackWithResult) null, 4, (Object) null);
                error = new RemoteBundleResult.Error(new IOException("HTTP error " + response5.code() + ": " + response5.message()), access14000.onNavigationEvent(response5.code()));
                response17 = response19;
                remoteBundleSourceImpl$fetchBundle$28 = remoteBundleSourceImpl$fetchBundle$210;
                CloseableKt.closeFinally(response17, (Throwable) null);
                obj2 = Result.constructor-impl(error);
                remoteBundleSourceImpl$fetchBundle$22 = remoteBundleSourceImpl$fetchBundle$28;
                RemoteBundleSourceImpl remoteBundleSourceImpl72222222222222 = remoteBundleSourceImpl$fetchBundle$22.this$0;
                String str592222222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleURL;
                String str602222222222222 = remoteBundleSourceImpl$fetchBundle$22.$bundleName;
                th3 = Result.exceptionOrNull-impl(obj2);
                if (th3 != null) {
                }
                break;
            case 7:
                i2 = this.I$1;
                int i49 = this.I$0;
                String str105 = (String) this.L$5;
                Throwable th63 = (Throwable) this.L$4;
                String str106 = (String) this.L$3;
                String str107 = (String) this.L$2;
                RemoteBundleSourceImpl remoteBundleSourceImpl14 = (RemoteBundleSourceImpl) this.L$1;
                ResultKt.onNavigationEvent(obj);
                str2 = str107;
                str = "RemoteBundleSourceImpl";
                findresandmsg = findresandmsg6;
                str3 = str106;
                i = i49;
                obj35 = objOnWarmupCompleted;
                th3 = th63;
                str4 = str105;
                str56 = "bundleName";
                remoteBundleSourceImpl$fetchBundle$23 = this;
                remoteBundleSourceImpl = remoteBundleSourceImpl14;
                str57 = "from";
                rnPhaseObserverIAuthTabCallbackDefault = RemoteBundleSourceImpl.IAuthTabCallbackDefault(remoteBundleSourceImpl);
                rnBundleInfo = new RnBundleInfo((RnBundleInfo.Source) null, (String) null, (String) null, (String) null, str2, (String) null, (Integer) null, (Long) null, (Long) null, (RnCause) null, (RnBundleInfo.Role) null, (List) null, (Double) null, 8175, (DefaultConstructorMarker) null);
                if (i2 == 0) {
                }
                remoteBundleSourceImpl$fetchBundle$23.L$0 = access15400.onNavigationEvent(findresandmsg);
                remoteBundleSourceImpl$fetchBundle$23.L$1 = str3;
                remoteBundleSourceImpl$fetchBundle$23.L$2 = th3;
                remoteBundleSourceImpl$fetchBundle$23.L$3 = str4;
                remoteBundleSourceImpl$fetchBundle$23.L$4 = null;
                remoteBundleSourceImpl$fetchBundle$23.L$5 = null;
                remoteBundleSourceImpl$fetchBundle$23.I$0 = i;
                remoteBundleSourceImpl$fetchBundle$23.I$1 = i2;
                remoteBundleSourceImpl$fetchBundle$23.label = 8;
                if (rnPhaseObserverIAuthTabCallbackDefault.onNavigationEvent(rnBundleInfo, str4, z, (access13800<? super Unit>) remoteBundleSourceImpl$fetchBundle$23) != obj35) {
                }
                break;
            case 8:
                str5 = (String) this.L$3;
                th4 = (Throwable) this.L$2;
                String str108 = (String) this.L$1;
                ResultKt.onNavigationEvent(obj);
                str3 = str108;
                str57 = "from";
                str56 = "bundleName";
                str = "RemoteBundleSourceImpl";
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str58, "remote_fetch_unexpected_error", th4, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(str57, str), getWrite.IAuthTabCallback(str56, str3), getWrite.IAuthTabCallback("errorType", str5)}));
                return new RemoteBundleResult.Error(th4, null, 2, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
