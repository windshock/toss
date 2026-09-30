package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.securities.widget.data.model.watchlists.ItemType;
import im.toss.securities.widget.data.model.watchlists.Price;
import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tosssecurities.core.account.domain.model.Account;
import im.toss.tosssecurities.core.base.model.SessionType;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel;
import im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.KSerializer;
import o.DiskLruCacheEditornewSink11;
import o.getIconImageResource;
import o.setLogBuffers;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class x_ {
    public static final onWarmupCompleted Companion;
    private static int extraCallback;
    public static final int onExtraCallback;
    private static final long onWarmupCompleted;
    private static int writeTypedObject;
    private final r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo IAuthTabCallback;
    private final y_<Result<WidgetMiniCharts>> IAuthTabCallbackDefault;
    private final y_<Result<WidgetMiniCharts>> IAuthTabCallbackStub;
    private final zzag IAuthTabCallbackStubProxy;
    private final y_<Result<WidgetMiniCharts>> IAuthTabCallback_Parcel;
    private final getIconImageResource<Result<WidgetWatchlists>> access000;
    private final r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU access100;
    private final decodeIpv6 asBinder;
    private final setAdUnitIds asInterface;
    private final y_<Result<OverviewAccounts>> getInterfaceDescriptor;
    private final threadFactorylambda1 onExtraCallbackWithResult;
    private final registerClient onNavigationEvent;
    private final DiskLruCacheEditornewSink11.IAuthTabCallback onTransact;
    private static final byte[] $$a = {113, 66, 51, 67};
    private static final int $$b = 31;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 0;
    private static int readTypedObject = 1;
    private static int extraCallbackWithResult = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[Currency.values().length];
            try {
                iArr[Currency.KRW.ordinal()] = 1;
                int i = onNavigationEvent + 15;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Currency.USD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i3 = onExtraCallback + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = x_.onNavigationEvent(x_.this, this);
            if (objOnNavigationEvent == access14100.onExtraCallback()) {
                return objOnNavigationEvent;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnNavigationEvent);
            int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return resultIAuthTabCallback;
            }
            throw null;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = x_.this.onExtraCallback(null, 0, null, this);
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2 = b * 2;
        int i3 = 105 - (b2 * 2);
        byte[] bArr = $$a;
        int i4 = 3 - (s * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i4;
            int i9 = i4 + i6;
            i = i7;
            int i10 = i8;
            i3 = i9;
            i4 = i10;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i11 = i4 + 1;
            int i12 = i3;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i + 1;
            i6 = i12;
            int i92 = i4 + i6;
            i = i7;
            int i102 = i8;
            i3 = i92;
            i4 = i102;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = i2 | i5 | i7;
        int i9 = ~i2;
        int i10 = (~i5) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i5 | i7 | i9)) | (~(i10 | i2));
        int i13 = i3 + i2 + i + (2053704882 * i4) + ((-167119771) * i6);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i3) - 1543503872) + (1501345335 * i2) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i) + (511705088 * i4) + ((-1639972864) * i6) + (1278279680 * i14);
        int i16 = ((i3 * (-1228230693)) - 288632672) + (i2 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i * (-1228230607)) + (i4 * 927583762) + (i6 * (-1784727723)) + (i14 * 1163984896);
        int i17 = i15 + (i16 * i16 * 992935936);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    @Inject
    public x_(@NotNull zzag zzagVar, @NotNull decodeIpv6 decodeipv6, @NotNull threadFactorylambda1 threadfactorylambda1, @NotNull r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, @NotNull setAdUnitIds setadunitids, @NotNull r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull registerClient registerclient) {
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        Intrinsics.checkNotNullParameter(threadfactorylambda1, "");
        Intrinsics.checkNotNullParameter(r8lambdakeemxoi4two_xjjc4c2vgm4dau, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(r8lambdaws9z36z_nyqlya8ut2rf642vcso, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.IAuthTabCallbackStubProxy = zzagVar;
        this.asBinder = decodeipv6;
        this.onExtraCallbackWithResult = threadfactorylambda1;
        this.access100 = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        this.asInterface = setadunitids;
        this.IAuthTabCallback = r8lambdaws9z36z_nyqlya8ut2rf642vcso;
        this.onNavigationEvent = registerclient;
        this.onTransact = diskLruCacheEntry.IAuthTabCallback();
        getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(null);
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        this.access000 = getIconImageResource.onExtraCallback.onExtraCallback(onextracallback, "watchlist", iCustomTabsCallback, setCommandLine.onWarmupCompleted(5, setRevision.SECONDS), (Object) null, 8, (Object) null);
        long j = onWarmupCompleted;
        this.getInterfaceDescriptor = new y_<>(j, new extraCallbackWithResult(zzagVar));
        this.IAuthTabCallbackDefault = new y_<>(j, new onExtraCallback(zzagVar));
        this.IAuthTabCallback_Parcel = new y_<>(j, new extraCallback(zzagVar));
        this.IAuthTabCallbackStub = new y_<>(j, new writeTypedObject(zzagVar));
    }

    public static final /* synthetic */ y_ IAuthTabCallbackStub(x_ x_Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        y_<Result<OverviewAccounts>> y_Var = x_Var.getInterfaceDescriptor;
        if (i3 != 0) {
            return y_Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU access000(x_ x_Var) {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau = x_Var.access100;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 37;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return r8lambdakeemxoi4two_xjjc4c2vgm4dau;
    }

    public static final /* synthetic */ y_ asBinder(x_ x_Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        y_<Result<WidgetMiniCharts>> y_Var = x_Var.IAuthTabCallback_Parcel;
        int i5 = i3 + 97;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return y_Var;
    }

    public static final /* synthetic */ zzag asInterface(x_ x_Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        zzag zzagVar = x_Var.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return zzagVar;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        x_ x_Var = (x_) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 19;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getIconImageResource<Result<WidgetWatchlists>> geticonimageresource = x_Var.access000;
        if (i4 == 0) {
            int i5 = 8 / 0;
        }
        int i6 = i2 + 91;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return geticonimageresource;
    }

    public static final /* synthetic */ decodeIpv6 onExtraCallback(x_ x_Var) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        decodeIpv6 decodeipv6 = x_Var.asBinder;
        int i5 = i3 + 105;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return decodeipv6;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(x_ x_Var, int i, Long l, AFi1tSDKAFa1uSDK aFi1tSDKAFa1uSDK, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 17;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnExtraCallbackWithResult = x_Var.onExtraCallbackWithResult(i, l, aFi1tSDKAFa1uSDK, access13800Var);
        if (i4 != 0) {
            int i5 = 62 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        x_ x_Var = (x_) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 69;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = x_Var.onTransact;
        int i5 = i2 + 13;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ y_ onExtraCallbackWithResult(x_ x_Var) {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        y_<Result<WidgetMiniCharts>> y_Var = x_Var.IAuthTabCallbackDefault;
        int i5 = i3 + 93;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return y_Var;
        }
        throw null;
    }

    public static final /* synthetic */ WatchlistWidgetState.RowItem onNavigationEvent(x_ x_Var, WidgetMiniCharts.ProductMiniChart productMiniChart, Currency currency, Context context, ItemType itemType) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        WatchlistWidgetState.RowItem rowItemOnNavigationEvent = x_Var.onNavigationEvent(productMiniChart, currency, context, itemType);
        int i4 = readTypedObject + 19;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return rowItemOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(x_ x_Var, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            x_Var.onNavigationEvent((access13800<? super Result<WidgetWatchlists>>) access13800Var);
            throw null;
        }
        Object objOnNavigationEvent = x_Var.onNavigationEvent((access13800<? super Result<WidgetWatchlists>>) access13800Var);
        int i3 = readTypedObject + 65;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return objOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        x_ x_Var = (x_) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 79;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = x_Var.IAuthTabCallback;
        int i5 = i2 + 123;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return r8lambdaws9z36z_nyqlya8ut2rf642vcso;
        }
        throw null;
    }

    public static final /* synthetic */ threadFactorylambda1 onNavigationEvent(x_ x_Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        threadFactorylambda1 threadfactorylambda1 = x_Var.onExtraCallbackWithResult;
        if (i3 != 0) {
            return threadfactorylambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setAdUnitIds onTransact(x_ x_Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 33;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        setAdUnitIds setadunitids = x_Var.asInterface;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        int i6 = i2 + 109;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return setadunitids;
        }
        throw null;
    }

    public static final /* synthetic */ WatchlistWidgetState.RowItem onWarmupCompleted(x_ x_Var, WidgetMiniCharts.IndexMiniChart indexMiniChart, ItemType itemType, Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        WatchlistWidgetState.RowItem rowItemOnExtraCallback = x_Var.onExtraCallback(indexMiniChart, itemType, context);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return rowItemOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        x_ x_Var = (x_) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        y_<Result<WidgetMiniCharts>> y_Var = x_Var.IAuthTabCallbackStub;
        int i5 = i2 + 9;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return y_Var;
        }
        throw null;
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function1<access13800<? super Result<? extends WidgetWatchlists>>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        ICustomTabsCallback(access13800<? super ICustomTabsCallback> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Result<WidgetWatchlists>> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) create(access13800Var);
            if (i3 == 0) {
                iCustomTabsCallback.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iCustomTabsCallback.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = x_.this.new ICustomTabsCallback(access13800Var);
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(access13800<? super Result<? extends WidgetWatchlists>> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            access13800<? super Result<? extends WidgetWatchlists>> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(access13800Var2);
            }
            IAuthTabCallback(access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback2 = access14100.onExtraCallback();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000 = x_.access000(x_.this);
                this.label = 1;
                objOnExtraCallback = r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000.onExtraCallback(this);
                if (objOnExtraCallback == objOnExtraCallback2) {
                    int i5 = onWarmupCompleted + 19;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objOnExtraCallback2;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onNavigationEvent + 101;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
                Result result = (Result) obj;
                if (i7 == 0) {
                    objOnExtraCallback = result.onNavigationEvent();
                    int i8 = 60 / 0;
                } else {
                    objOnExtraCallback = result.onNavigationEvent();
                }
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnExtraCallback);
            int i9 = onNavigationEvent + 9;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                return resultIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class extraCallbackWithResult extends FunctionReferenceImpl implements Function0<Long> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        extraCallbackWithResult(Object obj) {
            super(0, obj, zzag.class, "getElapsedRealTime", "getElapsedRealTime()J", 0);
        }

        public final Long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            zzag zzagVar = (zzag) this.receiver;
            if (i3 != 0) {
                return Long.valueOf(zzagVar.onExtraCallbackWithResult());
            }
            Long.valueOf(zzagVar.onExtraCallbackWithResult());
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Long invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback();
                throw null;
            }
            Long lIAuthTabCallback = IAuthTabCallback();
            int i3 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return lIAuthTabCallback;
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Long> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        onExtraCallback(Object obj) {
            super(0, obj, zzag.class, "getElapsedRealTime", "getElapsedRealTime()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Long invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Long lOnNavigationEvent = onNavigationEvent();
            int i4 = IAuthTabCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return lOnNavigationEvent;
        }

        public final Long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Long lValueOf = Long.valueOf(((zzag) this.receiver).onExtraCallbackWithResult());
            int i4 = onNavigationEvent + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return lValueOf;
        }
    }

    static final /* synthetic */ class extraCallback extends FunctionReferenceImpl implements Function0<Long> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        extraCallback(Object obj) {
            super(0, obj, zzag.class, "getElapsedRealTime", "getElapsedRealTime()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Long invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Long lOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return lOnExtraCallbackWithResult;
        }

        public final Long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Long lValueOf = Long.valueOf(((zzag) this.receiver).onExtraCallbackWithResult());
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return lValueOf;
        }
    }

    static final /* synthetic */ class writeTypedObject extends FunctionReferenceImpl implements Function0<Long> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        writeTypedObject(Object obj) {
            super(0, obj, zzag.class, "getElapsedRealTime", "getElapsedRealTime()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Long invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Long lOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onNavigationEvent + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return lOnExtraCallbackWithResult;
        }

        public final Long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Long.valueOf(((zzag) this.receiver).onExtraCallbackWithResult());
                obj.hashCode();
                throw null;
            }
            Long lValueOf = Long.valueOf(((zzag) this.receiver).onExtraCallbackWithResult());
            int i3 = onWarmupCompleted + 61;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return lValueOf;
            }
            throw null;
        }
    }

    static final class access100 implements Function1<q8ExternalSyntheticLambda1, CharSequence> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final access100 onNavigationEvent = new access100();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 43;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        access100() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ CharSequence invoke(q8ExternalSyntheticLambda1 q8externalsyntheticlambda1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnExtraCallback = onExtraCallback(q8externalsyntheticlambda1);
            if (i3 != 0) {
                int i4 = 22 / 0;
            }
            return charSequenceOnExtraCallback;
        }

        public final CharSequence onExtraCallback(q8ExternalSyntheticLambda1 q8externalsyntheticlambda1) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(q8externalsyntheticlambda1, "");
                return q8externalsyntheticlambda1.getCode();
            }
            Intrinsics.checkNotNullParameter(q8externalsyntheticlambda1, "");
            q8externalsyntheticlambda1.getCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $11 + 87;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(extraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0)), 23 - Color.blue(0), 10278 - (Process.myPid() >> 22), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16790059), 55 - (ViewConfiguration.getPressedStateDuration() >> 16), 2167 - (Process.myPid() >> 22), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $11 + 83;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12891 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, (Process.myTid() >> 22) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = $11 + 51;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static final class IAuthTabCallbackDefault implements Function1<q8ExternalSyntheticLambda1, CharSequence> {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallbackDefault onExtraCallback = new IAuthTabCallbackDefault();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 65;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 84 / 0;
            }
        }

        IAuthTabCallbackDefault() {
        }

        public final CharSequence IAuthTabCallback(q8ExternalSyntheticLambda1 q8externalsyntheticlambda1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(q8externalsyntheticlambda1, "");
                return q8externalsyntheticlambda1.getCode();
            }
            Intrinsics.checkNotNullParameter(q8externalsyntheticlambda1, "");
            int i3 = 11 / 0;
            return q8externalsyntheticlambda1.getCode();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ CharSequence invoke(q8ExternalSyntheticLambda1 q8externalsyntheticlambda1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            q8ExternalSyntheticLambda1 q8externalsyntheticlambda12 = q8externalsyntheticlambda1;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(q8externalsyntheticlambda12);
            }
            IAuthTabCallback(q8externalsyntheticlambda12);
            throw null;
        }
    }

    static final class readTypedObject implements Function0<getIconImageResource<Result<? extends WidgetMiniCharts>>> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String onNavigationEvent;

        readTypedObject(String str) {
            this.onNavigationEvent = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ getIconImageResource<Result<? extends WidgetMiniCharts>> invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getIconImageResource<Result<WidgetMiniCharts>> geticonimageresourceOnWarmupCompleted = onWarmupCompleted();
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return geticonimageresourceOnWarmupCompleted;
        }

        public final getIconImageResource<Result<WidgetMiniCharts>> onWarmupCompleted() {
            int i = 2 % 2;
            getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
            Object obj = null;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(x_.this, this.onNavigationEvent, null);
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            getIconImageResource<Result<WidgetMiniCharts>> geticonimageresourceOnExtraCallback = getIconImageResource.onExtraCallback.onExtraCallback(onextracallback, "indexMiniChart", anonymousClass2, setCommandLine.onWarmupCompleted(5, setRevision.SECONDS), (Object) null, 8, (Object) null);
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return geticonimageresourceOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.x_$readTypedObject$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function1<access13800<? super Result<? extends WidgetMiniCharts>>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ String $indexCodes;
            int label;
            final /* synthetic */ x_ this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(x_ x_Var, String str, access13800<? super AnonymousClass2> access13800Var) {
                super(1, access13800Var);
                this.this$0 = x_Var;
                this.$indexCodes = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$indexCodes, access13800Var);
                int i2 = onWarmupCompleted + 99;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(access13800<? super Result<? extends WidgetMiniCharts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted(access13800Var);
                int i4 = onNavigationEvent + 105;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(access13800<? super Result<WidgetMiniCharts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 1;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 79;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000 = x_.access000(this.this$0);
                    String str = this.$indexCodes;
                    this.label = 1;
                    objOnExtraCallbackWithResult = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onExtraCallbackWithResult(r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000, (String) null, str, this, 1, (Object) null);
                    if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onWarmupCompleted + 1;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        ((Result) obj).onNavigationEvent();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
                }
                return Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            }
        }
    }

    static final class IAuthTabCallbackStub implements Function1<Account, CharSequence> {
        public static final IAuthTabCallbackStub IAuthTabCallback = new IAuthTabCallbackStub();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        IAuthTabCallbackStub() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ CharSequence invoke(Account account) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            Account account2 = account;
            if (i2 % 2 != 0) {
                return onExtraCallback(account2);
            }
            onExtraCallback(account2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CharSequence onExtraCallback(Account account) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(account, "");
                account.IAuthTabCallbackStub();
                throw null;
            }
            Intrinsics.checkNotNullParameter(account, "");
            String strIAuthTabCallbackStub = account.IAuthTabCallbackStub();
            int i3 = onNavigationEvent + 91;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return strIAuthTabCallbackStub;
        }
    }

    static final class IAuthTabCallbackStubProxy implements Function0<getIconImageResource<Result<? extends OverviewAccounts>>> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String onExtraCallbackWithResult;

        IAuthTabCallbackStubProxy(String str) {
            this.onExtraCallbackWithResult = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ getIconImageResource<Result<? extends OverviewAccounts>> invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getIconImageResource<Result<OverviewAccounts>> geticonimageresourceOnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return geticonimageresourceOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getIconImageResource<Result<OverviewAccounts>> onWarmupCompleted() {
            int i = 2 % 2;
            getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(x_.this, this.onExtraCallbackWithResult, null);
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            getIconImageResource<Result<OverviewAccounts>> geticonimageresourceOnExtraCallback = getIconImageResource.onExtraCallback.onExtraCallback(onextracallback, "overviewV2", anonymousClass3, setCommandLine.onWarmupCompleted(5, setRevision.SECONDS), (Object) null, 8, (Object) null);
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return geticonimageresourceOnExtraCallback;
        }

        /* renamed from: o.x_$IAuthTabCallbackStubProxy$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function1<access13800<? super Result<? extends OverviewAccounts>>, Object> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ String $accountSeqs;
            int label;
            final /* synthetic */ x_ this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(x_ x_Var, String str, access13800<? super AnonymousClass3> access13800Var) {
                super(1, access13800Var);
                this.this$0 = x_Var;
                this.$accountSeqs = str;
            }

            public final Object IAuthTabCallback(access13800<? super Result<OverviewAccounts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 115;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(access13800Var);
                if (i3 == 0) {
                    anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 73;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$accountSeqs, access13800Var);
                int i2 = onExtraCallback + 91;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass3;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(access13800<? super Result<? extends OverviewAccounts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                onExtraCallback = i2 % 128;
                access13800<? super Result<? extends OverviewAccounts>> access13800Var2 = access13800Var;
                if (i2 % 2 == 0) {
                    IAuthTabCallback(access13800Var2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(access13800Var2);
                int i3 = onNavigationEvent + 111;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 85 / 0;
                }
                return objIAuthTabCallback;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r1
              0x0038: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
              0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback;
                int i;
                Object objOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    objOnExtraCallback = access14100.onExtraCallback();
                    i = this.label;
                    int i4 = 97 / 0;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000 = x_.access000(this.this$0);
                        String str = this.$accountSeqs;
                        this.label = 1;
                        objOnNavigationEvent = r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000.onExtraCallback(str, this);
                        if (objOnNavigationEvent == objOnExtraCallback) {
                            int i5 = onExtraCallback + 23;
                            onNavigationEvent = i5 % 128;
                            int i6 = i5 % 2;
                            return objOnExtraCallback;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                    }
                } else {
                    objOnExtraCallback = access14100.onExtraCallback();
                    i = this.label;
                    if (i != 0) {
                    }
                }
                Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnNavigationEvent);
                int i7 = onExtraCallback + 107;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 34 / 0;
                }
                return resultIAuthTabCallback;
            }
        }
    }

    static final class asInterface implements Function1<WidgetWatchlists.WatchList.Item, CharSequence> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final asInterface onWarmupCompleted = new asInterface();

        static {
            int i = IAuthTabCallback + 27;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        asInterface() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ CharSequence invoke(WidgetWatchlists.WatchList.Item item) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(item);
            int i4 = onExtraCallbackWithResult + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return charSequenceOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final CharSequence onExtraCallbackWithResult(WidgetWatchlists.WatchList.Item item) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(item, "");
                return item.IAuthTabCallback();
            }
            Intrinsics.checkNotNullParameter(item, "");
            item.IAuthTabCallback();
            throw null;
        }
    }

    static final class asBinder implements Function1<WidgetWatchlists.WatchList.Item, CharSequence> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final asBinder onWarmupCompleted = new asBinder();

        static {
            int i = IAuthTabCallback + 87;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        asBinder() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ CharSequence invoke(WidgetWatchlists.WatchList.Item item) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnNavigationEvent = onNavigationEvent(item);
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            int i5 = onExtraCallback + 51;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 31 / 0;
            }
            return charSequenceOnNavigationEvent;
        }

        public final CharSequence onNavigationEvent(WidgetWatchlists.WatchList.Item item) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(item, "");
            String strIAuthTabCallback = item.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strIAuthTabCallback;
        }
    }

    static final class getInterfaceDescriptor implements Function0<getIconImageResource<Result<? extends WidgetMiniCharts>>> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ String onExtraCallback;

        getInterfaceDescriptor(String str) {
            this.onExtraCallback = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ getIconImageResource<Result<? extends WidgetMiniCharts>> invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final getIconImageResource<Result<WidgetMiniCharts>> onExtraCallbackWithResult() {
            int i = 2 % 2;
            getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(x_.this, this.onExtraCallback, null);
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            getIconImageResource<Result<WidgetMiniCharts>> geticonimageresourceOnExtraCallback = getIconImageResource.onExtraCallback.onExtraCallback(onextracallback, "productMiniChart", anonymousClass2, setCommandLine.onWarmupCompleted(5, setRevision.SECONDS), (Object) null, 8, (Object) null);
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return geticonimageresourceOnExtraCallback;
        }

        /* renamed from: o.x_$getInterfaceDescriptor$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function1<access13800<? super Result<? extends WidgetMiniCharts>>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ String $productCodes;
            int label;
            final /* synthetic */ x_ this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(x_ x_Var, String str, access13800<? super AnonymousClass2> access13800Var) {
                super(1, access13800Var);
                this.this$0 = x_Var;
                this.$productCodes = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$productCodes, access13800Var);
                int i2 = onWarmupCompleted + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(access13800<? super Result<? extends WidgetMiniCharts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                access13800<? super Result<? extends WidgetMiniCharts>> access13800Var2 = access13800Var;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(access13800Var2);
                    obj.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = onWarmupCompleted(access13800Var2);
                int i3 = onWarmupCompleted + 65;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(access13800<? super Result<WidgetMiniCharts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 107;
                    int i4 = i3 % 128;
                    onWarmupCompleted = i4;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i4 + 101;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        ((Result) obj).onNavigationEvent();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
                } else {
                    ResultKt.onNavigationEvent(obj);
                    r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000 = x_.access000(this.this$0);
                    String str = this.$productCodes;
                    this.label = 1;
                    objOnExtraCallbackWithResult = r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU.onExtraCallbackWithResult(r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000, str, (String) null, this, 2, (Object) null);
                    if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                        int i6 = onWarmupCompleted + 29;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            return objOnExtraCallback;
                        }
                        throw null;
                    }
                }
                return Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            }
        }
    }

    static final class IAuthTabCallback_Parcel implements Function0<getIconImageResource<Result<? extends WidgetMiniCharts>>> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Ref.ObjectRef<String> onExtraCallback;
        final /* synthetic */ String onNavigationEvent;

        IAuthTabCallback_Parcel(String str, Ref.ObjectRef<String> objectRef) {
            this.onNavigationEvent = str;
            this.onExtraCallback = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ getIconImageResource<Result<? extends WidgetMiniCharts>> invoke() {
            getIconImageResource<Result<WidgetMiniCharts>> geticonimageresourceOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                geticonimageresourceOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 97 / 0;
            } else {
                geticonimageresourceOnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return geticonimageresourceOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final getIconImageResource<Result<WidgetMiniCharts>> onExtraCallbackWithResult() {
            int i = 2 % 2;
            getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(x_.this, this.onNavigationEvent, this.onExtraCallback, null);
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            getIconImageResource<Result<WidgetMiniCharts>> geticonimageresourceOnExtraCallback = getIconImageResource.onExtraCallback.onExtraCallback(onextracallback, "mixedMiniChart", anonymousClass1, setCommandLine.onWarmupCompleted(5, setRevision.SECONDS), (Object) null, 8, (Object) null);
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 89 / 0;
            }
            return geticonimageresourceOnExtraCallback;
        }

        /* renamed from: o.x_$IAuthTabCallback_Parcel$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function1<access13800<? super Result<? extends WidgetMiniCharts>>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Ref.ObjectRef<String> $indexCodes;
            final /* synthetic */ String $productCodes;
            int label;
            final /* synthetic */ x_ this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(x_ x_Var, String str, Ref.ObjectRef<String> objectRef, access13800<? super AnonymousClass1> access13800Var) {
                super(1, access13800Var);
                this.this$0 = x_Var;
                this.$productCodes = str;
                this.$indexCodes = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$productCodes, this.$indexCodes, access13800Var);
                int i2 = onWarmupCompleted + 33;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(access13800<? super Result<? extends WidgetMiniCharts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(access13800Var);
                int i4 = onExtraCallback + 93;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(access13800<? super Result<WidgetMiniCharts>> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 12 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                onWarmupCompleted = i2 % 128;
                String str = null;
                if (i2 % 2 != 0) {
                    access14100.onExtraCallback();
                    throw null;
                }
                Object objOnExtraCallback2 = access14100.onExtraCallback();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = onWarmupCompleted + 87;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = ((Result) obj).onNavigationEvent();
                } else {
                    ResultKt.onNavigationEvent(obj);
                    r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000 = x_.access000(this.this$0);
                    String str2 = this.$productCodes;
                    if (str2.length() == 0) {
                        int i5 = onWarmupCompleted + 29;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 53 / 0;
                        }
                    } else {
                        str = str2;
                    }
                    String str3 = this.$indexCodes.element;
                    this.label = 1;
                    objOnExtraCallback = r8lambdakeemxoi4two_xjjc4c2vgm4dauAccess000.onExtraCallback(str, str3, this);
                    if (objOnExtraCallback == objOnExtraCallback2) {
                        return objOnExtraCallback2;
                    }
                }
                return Result.IAuthTabCallback(objOnExtraCallback);
            }
        }
    }

    static final class access000 implements Function1<WidgetWatchlists.WatchList.Item, CharSequence> {
        private static int IAuthTabCallback = 0;
        public static final access000 onExtraCallback = new access000();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 43 / 0;
            }
        }

        access000() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ CharSequence invoke(WidgetWatchlists.WatchList.Item item) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            WidgetWatchlists.WatchList.Item item2 = item;
            if (i2 % 2 == 0) {
                onExtraCallback(item2);
                obj.hashCode();
                throw null;
            }
            CharSequence charSequenceOnExtraCallback = onExtraCallback(item2);
            int i3 = onNavigationEvent + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return charSequenceOnExtraCallback;
            }
            throw null;
        }

        public final CharSequence onExtraCallback(WidgetWatchlists.WatchList.Item item) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(item, "");
                return item.IAuthTabCallback();
            }
            Intrinsics.checkNotNullParameter(item, "");
            item.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0481: MOVE (r1 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:64:0x047d */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0489: MOVE (r1 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:66:0x0486 */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0404: MOVE (r1 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:57:0x03ff */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0410: MOVE (r1 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:59:0x040b */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0406: MOVE (r2 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]), block:B:57:0x03ff */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0412: MOVE (r2 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]), block:B:59:0x040b */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull android.content.Context r50, int r51, @org.jetbrains.annotations.NotNull o.q8ExternalSyntheticLambda4 r52, @org.jetbrains.annotations.NotNull o.access13800<? super im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState> r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 6236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x_.onExtraCallback(android.content.Context, int, o.q8ExternalSyntheticLambda4, o.access13800):java.lang.Object");
    }

    private final Object onExtraCallbackWithResult(int i, Long l, AFi1tSDKAFa1uSDK aFi1tSDKAFa1uSDK, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        q8a.onNavigationEvent.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("function", "WatchlistRepo.watchlistFallback"), getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i)), getWrite.IAuthTabCallback("prevWatchlistId", l), getWrite.IAuthTabCallback("fallbackReason", aFi1tSDKAFa1uSDK.onNavigationEvent().name()), getWrite.IAuthTabCallback("fallbackType", aFi1tSDKAFa1uSDK.onExtraCallbackWithResult().asInterface())));
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(UpdatePackageContent.onExtraCallback, new onNavigationEvent(i, aFi1tSDKAFa1uSDK, null), access13800Var);
        if (objOnExtraCallback == access14100.onExtraCallback()) {
            int i3 = readTypedObject + 35;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 22 / 0;
            }
            return objOnExtraCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = readTypedObject + 103;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ AFi1tSDKAFa1uSDK $selection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(int i, AFi1tSDKAFa1uSDK aFi1tSDKAFa1uSDK, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
            this.$selection = aFi1tSDKAFa1uSDK;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = x_.this.new onNavigationEvent(this.$appWidgetId, this.$selection, access13800Var);
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onnavigationevent.invokeSuspend(Unit.INSTANCE);
            }
            onnavigationevent.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
        
            if (r12.onNavigationEvent(r2, r3, r4, r11) == r1) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {x_.this};
                DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) x_.IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -684524838, 684524840, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
                String strOnWarmupCompleted = WidgetProductSelectViewModel.Companion.onWarmupCompleted(this.$appWidgetId);
                this.label = 1;
                if (iAuthTabCallback.onNavigationEvent(strOnWarmupCompleted, this) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            int i5 = onNavigationEvent + 105;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            if (i4 != 1) {
                int i8 = i6 + Imgproc.COLOR_YUV2RGBA_YVYU;
                int i9 = i8 % 128;
                onNavigationEvent = i9;
                int i10 = i8 % 2;
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = i9 + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            Object[] objArr2 = {x_.this};
            DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback2 = (DiskLruCacheEditornewSink11.IAuthTabCallback) x_.IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -684524838, 684524840, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
            String strOnExtraCallbackWithResult = WidgetWatchlistSelectViewModel.Companion.onExtraCallbackWithResult(this.$appWidgetId);
            Object[] objArr3 = {this.$selection.onExtraCallbackWithResult()};
            Long lOnExtraCallback = access14000.onExtraCallback(((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), objArr3, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue());
            KSerializer<Long> kSerializerOnNavigationEvent = sp.onNavigationEvent(LongCompanionObject.INSTANCE);
            this.label = 2;
        }
    }

    static /* synthetic */ WatchlistWidgetState.RowItem onWarmupCompleted(x_ x_Var, WidgetMiniCharts.ProductMiniChart productMiniChart, Currency currency, Context context, ItemType itemType, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 91;
        int i4 = i3 % 128;
        readTypedObject = i4;
        if (i3 % 2 != 0 ? (i & 8) != 0 : (i & 49) != 0) {
            int i5 = i4 + 31;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            itemType = null;
        }
        WatchlistWidgetState.RowItem rowItemOnNavigationEvent = x_Var.onNavigationEvent(productMiniChart, currency, context, itemType);
        int i7 = ICustomTabsCallback + 19;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return rowItemOnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0208, code lost:
    
        if (r2 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0229, code lost:
    
        if (r2 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0232, code lost:
    
        r19 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0193, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bc, code lost:
    
        if (r2 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        r17 = 0.0d;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WatchlistWidgetState.RowItem onNavigationEvent(WidgetMiniCharts.ProductMiniChart productMiniChart, Currency currency, Context context, ItemType itemType) throws Throwable {
        Double dOnWarmupCompleted;
        Double dOnWarmupCompleted2;
        Pair pairIAuthTabCallback;
        String strOnExtraCallback;
        String strIntern;
        double dDoubleValue;
        double d;
        Double dOnWarmupCompleted3;
        double dDoubleValue2;
        double d2;
        List list;
        List listOnNavigationEvent;
        Double dOnExtraCallback;
        Double dOnWarmupCompleted4;
        Double dOnWarmupCompleted5;
        Double dOnWarmupCompleted6;
        int i = 2 % 2;
        Enum r1 = Currency.USD;
        if (currency != r1 || !intersect.onExtraCallbackWithResult(productMiniChart.onExtraCallbackWithResult())) {
            r1 = Currency.KRW;
        }
        Enum r3 = r1;
        int i2 = IAuthTabCallback.IAuthTabCallback[r3.ordinal()];
        if (i2 == 1) {
            Price priceOnExtraCallback = productMiniChart.onExtraCallback();
            if (priceOnExtraCallback != null) {
                int i3 = readTypedObject + 97;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                dOnWarmupCompleted = priceOnExtraCallback.onWarmupCompleted();
            } else {
                dOnWarmupCompleted = null;
            }
            Price priceOnWarmupCompleted = productMiniChart.onWarmupCompleted();
            if (priceOnWarmupCompleted != null) {
                int i5 = ICustomTabsCallback + 49;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                dOnWarmupCompleted2 = priceOnWarmupCompleted.onWarmupCompleted();
            } else {
                dOnWarmupCompleted2 = null;
            }
            Price priceOnExtraCallback2 = productMiniChart.onExtraCallback();
            pairIAuthTabCallback = getWrite.IAuthTabCallback(dOnWarmupCompleted, isHealthy.onNavigationEvent(dOnWarmupCompleted2, priceOnExtraCallback2 != null ? priceOnExtraCallback2.onWarmupCompleted() : null));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Price priceOnExtraCallback3 = productMiniChart.onExtraCallback();
            if (priceOnExtraCallback3 != null) {
                int i7 = readTypedObject + 63;
                ICustomTabsCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    priceOnExtraCallback3.onExtraCallback();
                    str.hashCode();
                    throw null;
                }
                Double dOnWarmupCompleted7 = priceOnExtraCallback3.onExtraCallback();
                if (dOnWarmupCompleted7 == null) {
                    Price priceOnExtraCallback4 = productMiniChart.onExtraCallback();
                    dOnWarmupCompleted7 = priceOnExtraCallback4 != null ? priceOnExtraCallback4.onWarmupCompleted() : null;
                }
                Price priceOnWarmupCompleted2 = productMiniChart.onWarmupCompleted();
                if (priceOnWarmupCompleted2 == null || (dOnWarmupCompleted5 = priceOnWarmupCompleted2.onExtraCallback()) == null) {
                    Price priceOnWarmupCompleted3 = productMiniChart.onWarmupCompleted();
                    dOnWarmupCompleted5 = priceOnWarmupCompleted3 != null ? priceOnWarmupCompleted3.onWarmupCompleted() : null;
                }
                Price priceOnExtraCallback5 = productMiniChart.onExtraCallback();
                if (priceOnExtraCallback5 == null || (dOnWarmupCompleted6 = priceOnExtraCallback5.onExtraCallback()) == null) {
                    Price priceOnExtraCallback6 = productMiniChart.onExtraCallback();
                    if (priceOnExtraCallback6 != null) {
                        int i8 = readTypedObject + 93;
                        ICustomTabsCallback = i8 % 128;
                        int i9 = i8 % 2;
                        dOnWarmupCompleted6 = priceOnExtraCallback6.onWarmupCompleted();
                    } else {
                        dOnWarmupCompleted6 = null;
                    }
                }
                pairIAuthTabCallback = getWrite.IAuthTabCallback(dOnWarmupCompleted7, isHealthy.onNavigationEvent(dOnWarmupCompleted5, dOnWarmupCompleted6));
                int i10 = readTypedObject + 15;
                ICustomTabsCallback = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        Double d3 = (Double) pairIAuthTabCallback.onExtraCallbackWithResult();
        Double d4 = (Double) pairIAuthTabCallback.IAuthTabCallback();
        if (d4 != null) {
            String str = discard.onExtraCallback.onExtraCallback().format(d4.doubleValue());
            Intrinsics.checkNotNullExpressionValue(str, "");
            strOnExtraCallback = CacheInterceptorCompanion.onExtraCallback(str);
        } else {
            strOnExtraCallback = "-";
        }
        String str2 = strOnExtraCallback;
        String strOnTransact = productMiniChart.onTransact();
        String strOnExtraCallbackWithResult = productMiniChart.onExtraCallbackWithResult();
        if (d3 != null) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            strIntern = isHealthy.IAuthTabCallback(d3, r3, resources, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
            if (strIntern == null) {
                Object[] objArr = new Object[1];
                a(KeyEvent.getDeadChar(0, 0) + 1, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{0}, false, 134 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                strIntern = ((String) objArr[0]).intern();
            }
        }
        String str3 = strIntern;
        if (!intersect.onExtraCallbackWithResult(productMiniChart.onExtraCallbackWithResult())) {
            Price priceIAuthTabCallback = productMiniChart.IAuthTabCallback();
            if (priceIAuthTabCallback == null || (dOnWarmupCompleted4 = priceIAuthTabCallback.onWarmupCompleted()) == null) {
                Price priceOnWarmupCompleted4 = productMiniChart.onWarmupCompleted();
                if (priceOnWarmupCompleted4 != null) {
                    int i12 = readTypedObject + 5;
                    ICustomTabsCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        priceOnWarmupCompleted4.onWarmupCompleted();
                        str.hashCode();
                        throw null;
                    }
                    dOnWarmupCompleted4 = priceOnWarmupCompleted4.onWarmupCompleted();
                } else {
                    dOnWarmupCompleted4 = null;
                }
            }
            dDoubleValue = dOnWarmupCompleted4.doubleValue();
            d = dDoubleValue;
        } else {
            Price priceIAuthTabCallback2 = productMiniChart.IAuthTabCallback();
            if (priceIAuthTabCallback2 != null) {
                int i13 = ICustomTabsCallback + 55;
                readTypedObject = i13 % 128;
                int i14 = i13 % 2;
                Double dOnExtraCallback2 = priceIAuthTabCallback2.onExtraCallback();
                if (dOnExtraCallback2 == null) {
                    Price priceOnWarmupCompleted5 = productMiniChart.onWarmupCompleted();
                    dOnExtraCallback2 = priceOnWarmupCompleted5 != null ? priceOnWarmupCompleted5.onExtraCallback() : null;
                }
                dDoubleValue = dOnExtraCallback2.doubleValue();
                d = dDoubleValue;
            }
        }
        if (intersect.onExtraCallbackWithResult(productMiniChart.onExtraCallbackWithResult())) {
            int i15 = readTypedObject + 91;
            ICustomTabsCallback = i15 % 128;
            int i16 = i15 % 2;
            Price priceOnNavigationEvent = productMiniChart.onNavigationEvent();
            if (priceOnNavigationEvent != null) {
                int i17 = ICustomTabsCallback + 7;
                readTypedObject = i17 % 128;
                if (i17 % 2 == 0) {
                    dOnExtraCallback = priceOnNavigationEvent.onExtraCallback();
                    int i18 = 13 / 0;
                    if (dOnExtraCallback == null) {
                        Price priceOnExtraCallback7 = productMiniChart.onExtraCallback();
                        dOnExtraCallback = priceOnExtraCallback7 != null ? priceOnExtraCallback7.onExtraCallback() : null;
                    }
                    dDoubleValue2 = dOnExtraCallback.doubleValue();
                    d2 = dDoubleValue2;
                } else {
                    dOnExtraCallback = priceOnNavigationEvent.onExtraCallback();
                    if (dOnExtraCallback == null) {
                    }
                    dDoubleValue2 = dOnExtraCallback.doubleValue();
                    d2 = dDoubleValue2;
                }
            }
        } else {
            Price priceOnNavigationEvent2 = productMiniChart.onNavigationEvent();
            if (priceOnNavigationEvent2 == null || (dOnWarmupCompleted3 = priceOnNavigationEvent2.onWarmupCompleted()) == null) {
                Price priceOnExtraCallback8 = productMiniChart.onExtraCallback();
                dOnWarmupCompleted3 = priceOnExtraCallback8 != null ? priceOnExtraCallback8.onWarmupCompleted() : null;
            }
            dDoubleValue2 = dOnWarmupCompleted3.doubleValue();
            d2 = dDoubleValue2;
        }
        WidgetMiniCharts.ProductMiniChart.MiniChart miniChartIAuthTabCallbackStub = productMiniChart.IAuthTabCallbackStub();
        if (miniChartIAuthTabCallbackStub == null || (listOnNavigationEvent = miniChartIAuthTabCallbackStub.onNavigationEvent()) == null) {
            List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            int i19 = readTypedObject + 9;
            ICustomTabsCallback = i19 % 128;
            int i20 = i19 % 2;
            list = listEmptyList;
        } else {
            List<WidgetMiniCharts.ProductMiniChart.MiniChart.Candle> list2 = listOnNavigationEvent;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (WidgetMiniCharts.ProductMiniChart.MiniChart.Candle candle : list2) {
                arrayList.add(new WatchlistWidgetState.SimpleCandle(candle.IAuthTabCallbackDefault(), candle.onNavigationEvent(), candle.IAuthTabCallback(), candle.onExtraCallback()));
            }
            list = arrayList;
        }
        double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
        WidgetMiniCharts.ProductMiniChart.MiniChart miniChartIAuthTabCallbackStub2 = productMiniChart.IAuthTabCallbackStub();
        String strIAuthTabCallback = miniChartIAuthTabCallbackStub2 != null ? miniChartIAuthTabCallbackStub2.IAuthTabCallback() : null;
        WidgetMiniCharts.ProductMiniChart.MiniChart miniChartIAuthTabCallbackStub3 = productMiniChart.IAuthTabCallbackStub();
        return new WatchlistWidgetState.RowItem(strOnTransact, strOnExtraCallbackWithResult, str3, d, d2, list, str2, dDoubleValue3, strIAuthTabCallback, miniChartIAuthTabCallbackStub3 != null ? miniChartIAuthTabCallbackStub3.onExtraCallbackWithResult() : null, itemType);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00df A[PHI: r3
      0x00df: PHI (r3v15 java.util.List) = (r3v14 java.util.List), (r3v18 java.util.List) binds: [B:22:0x00dd, B:19:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WatchlistWidgetState.RowItem onExtraCallback(WidgetMiniCharts.IndexMiniChart indexMiniChart, ItemType itemType, Context context) throws Throwable {
        String strOnExtraCallback;
        String string;
        List listEmptyList;
        double dDoubleValue;
        String strOnWarmupCompleted;
        List listOnExtraCallbackWithResult;
        int i = 2 % 2;
        Double dOnNavigationEvent = isHealthy.onNavigationEvent(Double.valueOf(indexMiniChart.onWarmupCompleted()), Double.valueOf(indexMiniChart.IAuthTabCallback()));
        if (dOnNavigationEvent != null) {
            String str = discard.onExtraCallback.onExtraCallback().format(dOnNavigationEvent.doubleValue());
            Intrinsics.checkNotNullExpressionValue(str, "");
            strOnExtraCallback = CacheInterceptorCompanion.onExtraCallback(str);
        } else {
            strOnExtraCallback = "-";
        }
        String str2 = strOnExtraCallback;
        if (itemType == ItemType.CRYPTO && StringsKt__StringsJVMKt.startsWith$default(indexMiniChart.onExtraCallbackWithResult(), "VWAP.KRW-", false, 2, null)) {
            double dIAuthTabCallback = indexMiniChart.IAuthTabCallback();
            Currency currency = Currency.KRW;
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            string = isHealthy.IAuthTabCallback(Double.valueOf(dIAuthTabCallback), currency, resources, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
            if (string == null) {
                Object[] objArr = new Object[1];
                a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, '1' - AndroidCharacter.getMirror('0'), new char[]{0}, false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + Imgproc.COLOR_BGRA2YUV_YV12, objArr);
                string = ((String) objArr[0]).intern();
            }
        } else {
            string = discard.onExtraCallback.onNavigationEvent().format(indexMiniChart.IAuthTabCallback()).toString();
        }
        String str3 = string;
        String strOnExtraCallback2 = indexMiniChart.onExtraCallback();
        String strOnExtraCallbackWithResult = indexMiniChart.onExtraCallbackWithResult();
        double dOnWarmupCompleted = indexMiniChart.onWarmupCompleted();
        double dIAuthTabCallback2 = indexMiniChart.IAuthTabCallback();
        WidgetMiniCharts.IndexMiniChart.MiniChart miniChartOnNavigationEvent = indexMiniChart.onNavigationEvent();
        if (miniChartOnNavigationEvent != null) {
            int i2 = ICustomTabsCallback + 43;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                listOnExtraCallbackWithResult = miniChartOnNavigationEvent.onExtraCallbackWithResult();
                int i3 = 18 / 0;
                if (listOnExtraCallbackWithResult != null) {
                    List<WidgetMiniCharts.IndexMiniChart.MiniChart.Candle> list = listOnExtraCallbackWithResult;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (WidgetMiniCharts.IndexMiniChart.MiniChart.Candle candle : list) {
                        arrayList.add(new WatchlistWidgetState.SimpleCandle(candle.IAuthTabCallback(), candle.onWarmupCompleted(), candle.onExtraCallback(), (SessionType) null, 8, (DefaultConstructorMarker) null));
                    }
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } else {
                listOnExtraCallbackWithResult = miniChartOnNavigationEvent.onExtraCallbackWithResult();
                if (listOnExtraCallbackWithResult != null) {
                }
            }
        }
        if (dOnNavigationEvent != null) {
            int i4 = ICustomTabsCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            dDoubleValue = dOnNavigationEvent.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        WidgetMiniCharts.IndexMiniChart.MiniChart miniChartOnNavigationEvent2 = indexMiniChart.onNavigationEvent();
        if (miniChartOnNavigationEvent2 != null) {
            int i6 = readTypedObject + 75;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            strOnWarmupCompleted = miniChartOnNavigationEvent2.onWarmupCompleted();
            int i8 = readTypedObject + 55;
            ICustomTabsCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            strOnWarmupCompleted = null;
        }
        WidgetMiniCharts.IndexMiniChart.MiniChart miniChartOnNavigationEvent3 = indexMiniChart.onNavigationEvent();
        return new WatchlistWidgetState.RowItem(strOnExtraCallback2, strOnExtraCallbackWithResult, str3, dOnWarmupCompleted, dIAuthTabCallback2, listEmptyList, str2, dDoubleValue, strOnWarmupCompleted, miniChartOnNavigationEvent3 != null ? miniChartOnNavigationEvent3.onNavigationEvent() : null, itemType);
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final int IAuthTabCallback(@NotNull q8ExternalSyntheticLambda4 q8externalsyntheticlambda4) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(q8externalsyntheticlambda4, "");
                int i3 = 24 / 0;
                if (q8externalsyntheticlambda4 != q8ExternalSyntheticLambda4.small) {
                    return 20;
                }
            } else {
                Intrinsics.checkNotNullParameter(q8externalsyntheticlambda4, "");
                if (q8externalsyntheticlambda4 != q8ExternalSyntheticLambda4.small) {
                    return 20;
                }
            }
            int i4 = IAuthTabCallback;
            int i5 = i4 + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 17;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 9 / 0;
            }
            return 3;
        }
    }

    static {
        writeTypedObject = 0;
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        onExtraCallback = 8;
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        onWarmupCompleted = setLogBuffers.asBinder(setCommandLine.onWarmupCompleted(5, setRevision.SECONDS));
        int i = extraCallbackWithResult + 43;
        writeTypedObject = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Result<WidgetWatchlists>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objIAuthTabCallback = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = onextracallbackwithresult.label;
        try {
            if (i5 != 0) {
                int i6 = ICustomTabsCallback;
                int i7 = i6 + 11;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = i6 + 33;
                readTypedObject = i9 % 128;
                int i10 = i9 % 2;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
            } else {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                Result.Companion companion = Result.Companion;
                getIconImageResource geticonimageresource = (getIconImageResource) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 461254383, -461254382, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.I$1 = 0;
                onextracallbackwithresult.label = 1;
                objIAuthTabCallback = getIconImageResource.IAuthTabCallback(geticonimageresource, false, onextracallbackwithresult, 1, (Object) null);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            Object objOnNavigationEvent = ((Result) objIAuthTabCallback).onNavigationEvent();
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            return Result.m31constructorimpl(objOnNavigationEvent);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            Object objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            int i11 = ICustomTabsCallback + 57;
            readTypedObject = i11 % 128;
            int i12 = i11 % 2;
            return objM31constructorimpl;
        }
    }

    public static final /* synthetic */ r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo onWarmupCompleted(x_ x_Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1247788371, -1247788368, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{x_Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback(x_ x_Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (DiskLruCacheEditornewSink11.IAuthTabCallback) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -684524838, 684524840, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{x_Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ y_ IAuthTabCallbackDefault(x_ x_Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (y_) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1988020010, -1988020010, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{x_Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ getIconImageResource IAuthTabCallback_Parcel(x_ x_Var) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (getIconImageResource) IAuthTabCallback(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 461254383, -461254382, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{x_Var}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    static void IAuthTabCallback() {
        extraCallback = 478308991;
    }
}
