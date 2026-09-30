package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzaq;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.securities.widget.common.utils.RemoteViewsThemeUtilKt;
import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.data.model.overview.OverviewRate;
import im.toss.securities.widget.data.model.overview.Product;
import im.toss.securities.widget.data.model.overview.WidgetOverview;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.securities.widget.overview.ui.medium.model.OverviewUiData;
import im.toss.securities.widget.overview.ui.setting.model.AccountSections;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
import im.toss.tosssecurities.core.account.domain.model.Account;
import im.toss.tosssecurities.core.account.domain.model.AccountList;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.core.storage.domain.crosstype.CrossType;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.DiskLruCacheEditornewSink11;
import o._string;
import o.getIconImageResource;
import o.r2ExternalSyntheticLambda2;
import o.r4;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r4 {
    private static int ICustomTabsCallback = 1;
    private static int access100 = 0;
    private static int extraCallback = 0;
    private static int readTypedObject = 1;
    private final threadFactorylambda1 IAuthTabCallback;
    private final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackDefault;
    private final decodeIpv6 IAuthTabCallbackStub;
    private final zzag IAuthTabCallbackStubProxy;
    private final r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU IAuthTabCallback_Parcel;
    private final DiskLruCacheEntry access000;
    private final DiskLruCacheEditornewSink11.IAuthTabCallback asBinder;
    private final setAdUnitIds asInterface;
    private final getIconImageResource<Unit> getInterfaceDescriptor;
    private final r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo onExtraCallback;
    private final r3 onNavigationEvent;
    private final ConcurrentHashMap<String, getIconImageResource<Result<onExtraCallback>>> onTransact;
    private final registerClient onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = r4.IAuthTabCallback(r4.this, 0, (access13800) this);
            int i4 = onExtraCallback + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = r4.onNavigationEvent(r4.this, null, i3 == 0, this);
            int i4 = onExtraCallback + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class access000 extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;
        /* synthetic */ Object result;

        access000(access13800<? super access000> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            r4 r4Var = r4.this;
            if (i3 != 0) {
                r4.IAuthTabCallback(r4Var, (access13800) this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = r4.IAuthTabCallback(r4Var, (access13800) this);
            int i4 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class access100 extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            r4 r4Var = r4.this;
            if (i3 == 0) {
                r4.onExtraCallback(r4Var, this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallback = r4.onExtraCallback(r4Var, this);
            int i4 = onExtraCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return objOnExtraCallback;
        }
    }

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = r4.onWarmupCompleted(r4.this, i3 != 0 ? 1 : 0, this);
            int i4 = onExtraCallbackWithResult + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    static final class extraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        extraCallbackWithResult(access13800<? super extraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = r4.this.onNavigationEvent((Context) null, 0, (access13800<? super OverviewSmallWidgetState>) this);
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class getInterfaceDescriptor extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = r4.this.IAuthTabCallback((Context) null, 0, (access13800<? super OverviewMediumWidgetState>) this);
            int i4 = onNavigationEvent + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = r4.onExtraCallback(r4.this, 0, (access13800) this);
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[Currency.values().length];
            try {
                iArr[Currency.USD.ordinal()] = 1;
                int i = IAuthTabCallback + 41;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Currency.KRW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i3 = IAuthTabCallback + 71;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            r4 r4Var = r4.this;
            if (i3 != 0) {
                r4.onWarmupCompleted(r4Var, (access13800) this);
                throw null;
            }
            Object objOnWarmupCompleted = r4.onWarmupCompleted(r4Var, (access13800) this);
            int i4 = onExtraCallback + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    static {
        int i = extraCallback + 101;
        readTypedObject = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ getIconImageResource onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getIconImageResource geticonimageresourceOnWarmupCompleted = onWarmupCompleted(function1, obj);
        int i4 = ICustomTabsCallback + 39;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return geticonimageresourceOnWarmupCompleted;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | (~i2) | i4)) | (~(i4 | i6 | i2));
        int i10 = ~i4;
        int i11 = (~(i2 | i6)) | (~(i10 | i2)) | (~(i10 | i6));
        int i12 = i4 + i6 + i5 + (1698977638 * i3) + (1466394737 * i);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i4) - 490274816) + ((-1116082190) * i6) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i5) + (1553727488 * i3) + (1859780608 * i) + (925827072 * i13);
        int i15 = ((i4 * (-1787956080)) - 1478154965) + (i6 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i5 * (-1787955639)) + (i3 * 552005654) + (i * (-2013897159)) + (i13 * (-429457408));
        switch (i14 + (i15 * i15 * (-402587648))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ getIconImageResource onWarmupCompleted(boolean z, r4 r4Var, AccountSections.Account account, String str) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(z, r4Var, account, str);
            throw null;
        }
        getIconImageResource geticonimageresourceOnExtraCallback = onExtraCallback(z, r4Var, account, str);
        int i3 = access100 + 113;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return geticonimageresourceOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    @Inject
    public r4(@NotNull zzag zzagVar, @NotNull decodeIpv6 decodeipv6, @NotNull setAdUnitIds setadunitids, @NotNull r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, @NotNull threadFactorylambda1 threadfactorylambda1, @NotNull r3 r3Var, @NotNull r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull registerClient registerclient) {
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(r8lambdakeemxoi4two_xjjc4c2vgm4dau, "");
        Intrinsics.checkNotNullParameter(threadfactorylambda1, "");
        Intrinsics.checkNotNullParameter(r3Var, "");
        Intrinsics.checkNotNullParameter(r8lambdaws9z36z_nyqlya8ut2rf642vcso, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.IAuthTabCallbackStubProxy = zzagVar;
        this.IAuthTabCallbackStub = decodeipv6;
        this.asInterface = setadunitids;
        this.IAuthTabCallback_Parcel = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        this.IAuthTabCallback = threadfactorylambda1;
        this.onNavigationEvent = r3Var;
        this.onExtraCallback = r8lambdaws9z36z_nyqlya8ut2rf642vcso;
        this.IAuthTabCallbackDefault = textRoundCornerProgressBarSavedState1;
        this.access000 = diskLruCacheEntry;
        this.onWarmupCompleted = registerclient;
        this.asBinder = diskLruCacheEntry.IAuthTabCallback();
        this.onTransact = new ConcurrentHashMap<>();
        getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
        onUnminimized onunminimized = new onUnminimized(null);
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        this.getInterfaceDescriptor = getIconImageResource.onExtraCallback.IAuthTabCallback(onextracallback, "refreshRemoteStorage", onunminimized, (Object) null, setLogBuffers.onWarmupCompleted(setCommandLine.onWarmupCompleted(5, setRevision.SECONDS)), 4, (Object) null);
    }

    public static final /* synthetic */ Object IAuthTabCallback(r4 r4Var, int i, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = access100 + 87;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = r4Var.onWarmupCompleted(i, (access13800<? super DisplaySetting>) access13800Var);
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ Object IAuthTabCallback(r4 r4Var, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = r4Var.onNavigationEvent((access13800<? super Boolean>) access13800Var);
        int i4 = ICustomTabsCallback + 73;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        r4 r4Var = (r4) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 19;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        DiskLruCacheEntry diskLruCacheEntry = r4Var.access000;
        int i5 = i2 + 125;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return diskLruCacheEntry;
    }

    public static final /* synthetic */ Currency IAuthTabCallbackStub(r4 r4Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        Currency currency = (Currency) onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{r4Var}, iOnNavigationEvent3, -1927366244, iOnNavigationEvent2, 1927366246);
        int i4 = ICustomTabsCallback + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return currency;
    }

    public static final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU asBinder(r4 r4Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau = r4Var.IAuthTabCallback_Parcel;
        if (i4 != 0) {
            int i5 = 30 / 0;
        }
        int i6 = i3 + 103;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return r8lambdakeemxoi4two_xjjc4c2vgm4dau;
    }

    public static final /* synthetic */ Currency onExtraCallback(r4 r4Var, Currency currency, onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        Currency currency2 = (Currency) onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{r4Var, currency, onextracallback}, iOnNavigationEvent3, -1920200188, iOnNavigationEvent2, 1920200193);
        int i4 = ICustomTabsCallback + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return currency2;
    }

    public static final /* synthetic */ Object onExtraCallback(r4 r4Var, int i, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 7;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            r4Var.onExtraCallbackWithResult(i, (access13800<? super AccountSections.Account>) access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = r4Var.onExtraCallbackWithResult(i, (access13800<? super AccountSections.Account>) access13800Var);
        int i4 = ICustomTabsCallback + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Object onExtraCallback(r4 r4Var, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            int iOnNavigationEvent3 = zzaq.onNavigationEvent();
            return onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{r4Var, access13800Var}, iOnNavigationEvent3, -448406477, iOnNavigationEvent2, 448406483);
        }
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        int iOnNavigationEvent5 = zzaq.onNavigationEvent();
        int iOnNavigationEvent6 = zzaq.onNavigationEvent();
        onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent4, new Object[]{r4Var, access13800Var}, iOnNavigationEvent6, -448406477, iOnNavigationEvent5, 448406483);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        r4 r4Var = (r4) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 39;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = r4Var.asBinder;
        if (i4 == 0) {
            int i5 = 98 / 0;
        }
        int i6 = i2 + 49;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(r4 r4Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {r4Var};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        if (i3 != 0) {
            throw null;
        }
        String str = (String) onWarmupCompleted(iOnNavigationEvent4, iOnNavigationEvent, objArr, iOnNavigationEvent3, 1040944454, iOnNavigationEvent2, -1040944454);
        int i4 = access100 + 117;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final /* synthetic */ decodeIpv6 onExtraCallbackWithResult(r4 r4Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 117;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        decodeIpv6 decodeipv6 = r4Var.IAuthTabCallbackStub;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 69;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return decodeipv6;
    }

    public static final /* synthetic */ Object onNavigationEvent(r4 r4Var, AccountSections.Account account, boolean z, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {r4Var, account, Boolean.valueOf(z), access13800Var};
        if (i3 == 0) {
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            return onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, objArr, zzaq.onNavigationEvent(), -661480440, iOnNavigationEvent2, 661480441);
        }
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent3, objArr, zzaq.onNavigationEvent(), -661480440, iOnNavigationEvent4, 661480441);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ r2ExternalSyntheticLambda1 onNavigationEvent(r4 r4Var) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        r2ExternalSyntheticLambda1 r2externalsyntheticlambda1OnWarmupCompleted = r4Var.onWarmupCompleted();
        int i4 = ICustomTabsCallback + 101;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return r2externalsyntheticlambda1OnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(r4 r4Var, int i, access13800 access13800Var) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 17;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object objIAuthTabCallback = r4Var.IAuthTabCallback(i, (access13800<? super Float>) access13800Var);
        int i5 = access100 + 83;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onWarmupCompleted(r4 r4Var, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = r4Var.onExtraCallback((access13800<? super Boolean>) access13800Var);
        int i4 = ICustomTabsCallback + 73;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Triple onWarmupCompleted(r4 r4Var, Context context, onExtraCallback onextracallback, boolean z, Currency currency) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return r4Var.onExtraCallback(context, onextracallback, z, currency);
        }
        r4Var.onExtraCallback(context, onextracallback, z, currency);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setAdUnitIds onWarmupCompleted(r4 r4Var) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 79;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        setAdUnitIds setadunitids = r4Var.asInterface;
        int i5 = i2 + 13;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return setadunitids;
        }
        throw null;
    }

    static final class onUnminimized extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;
        private static char[] onNavigationEvent = {64961, 64962, 64978, 64983, 64987, 64963, 64982, 64965, 64960};
        private static char onExtraCallbackWithResult = 51242;

        onUnminimized(access13800<? super onUnminimized> access13800Var) {
            super(1, access13800Var);
        }

        public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onUnminimized onunminimizedCreate = create(access13800Var);
            if (i3 == 0) {
                return onunminimizedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 11 / 0;
            return onunminimizedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onUnminimized onunminimized = r4.this.new onUnminimized(access13800Var);
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onunminimized;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            access13800<? super Unit> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(access13800Var);
            }
            IAuthTabCallback(access13800Var);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 29;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 121;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {r4.this};
                int iOnNavigationEvent = zzaq.onNavigationEvent();
                int iOnNavigationEvent2 = zzaq.onNavigationEvent();
                DiskLruCacheEntry diskLruCacheEntry = (DiskLruCacheEntry) r4.onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, objArr, zzaq.onNavigationEvent(), -2085673767, iOnNavigationEvent2, 2085673771);
                Object[] objArr2 = new Object[1];
                a(new char[]{7, 5, 0, 1, 0, 6}, (byte) (84 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getTrimmedLength("") + 6, objArr2);
                DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback2 = diskLruCacheEntry.IAuthTabCallback(((String) objArr2[0]).intern());
                this.label = 1;
                if (IAuthTabCallback2.onWarmupCompleted(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), 23138 - MotionEvent.axisFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                    int i5 = $10 + 65;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 4 % 5;
                    }
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i7 = $11 + 73;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    }
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        int i8 = $10 + 29;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 74, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), Color.red(0) + 30, 19488 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                    } else {
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i15 = 0; i15 < i; i15++) {
                    cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final LinkedHashMap<String, Long> onWarmupCompleted = new LinkedHashMap<>();
        private String onExtraCallbackWithResult = "start";

        static final class onWarmupCompleted<T> extends ContinuationImpl {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            long J$0;
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                Object obj2 = null;
                Object objOnExtraCallback = IAuthTabCallback.this.onExtraCallback(null, null, this);
                int i4 = onWarmupCompleted + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallback;
                }
                obj2.hashCode();
                throw null;
            }
        }

        public static /* synthetic */ CharSequence onNavigationEvent(Map.Entry entry) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(entry);
            }
            onExtraCallback(entry);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> Object onExtraCallback(@NotNull String str, @NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) {
            onWarmupCompleted onwarmupcompleted;
            long jElapsedRealtime;
            Throwable th;
            int i = 2 % 2;
            if (!(access13800Var instanceof onWarmupCompleted)) {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            } else {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i2 = onwarmupcompleted.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i2 - 2147483648;
                }
            }
            Object objInvoke = onwarmupcompleted.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = onwarmupcompleted.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(objInvoke);
                this.onExtraCallbackWithResult = str;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    onwarmupcompleted.L$0 = str;
                    onwarmupcompleted.L$1 = access15400.onNavigationEvent(function1);
                    onwarmupcompleted.J$0 = jElapsedRealtime;
                    onwarmupcompleted.label = 1;
                    objInvoke = function1.invoke(onwarmupcompleted);
                    if (objInvoke == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    this.onWarmupCompleted.put(str, access14000.onExtraCallback(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    this.onWarmupCompleted.put(str, access14000.onExtraCallback(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    throw th;
                }
            }
            int i4 = onNavigationEvent;
            int i5 = i4 + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = i4 + 63;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            long j = onwarmupcompleted.J$0;
            String str2 = (String) onwarmupcompleted.L$0;
            try {
                ResultKt.onNavigationEvent(objInvoke);
                jElapsedRealtime = j;
                str = str2;
                this.onWarmupCompleted.put(str, access14000.onExtraCallback(SystemClock.elapsedRealtime() - jElapsedRealtime));
                return objInvoke;
            } catch (Throwable th3) {
                th = th3;
                jElapsedRealtime = j;
                str = str2;
                this.onWarmupCompleted.put(str, access14000.onExtraCallback(SystemClock.elapsedRealtime() - jElapsedRealtime));
                throw th;
            }
        }

        public final Map<String, Object> onWarmupCompleted() {
            int i = 2 % 2;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("stuckStep", this.onExtraCallbackWithResult);
            Set<Map.Entry<String, Long>> setEntrySet = this.onWarmupCompleted.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
            Map<String, Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("stepTimingsMs", CollectionsKt.joinToString$default(setEntrySet, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.securities.widget.overview.data.OverviewRepository$LoadStepTracker$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 125;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    CharSequence charSequenceOnNavigationEvent = r4.IAuthTabCallback.onNavigationEvent((Map.Entry) obj);
                    int i5 = onNavigationEvent + 13;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return charSequenceOnNavigationEvent;
                }
            }, 30, (Object) null))});
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 64 / 0;
            }
            return mapOnWarmupCompleted;
        }

        private static final CharSequence onExtraCallback(Map.Entry entry) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(entry, "");
            String str = entry.getKey() + "=" + entry.getValue();
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    static final class onPostMessage extends SuspendLambda implements Function1<access13800<? super Boolean>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onPostMessage(access13800<? super onPostMessage> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onPostMessage onpostmessage = r4.this.new onPostMessage(access13800Var);
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onpostmessage;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            int i4 = onExtraCallback + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super Boolean> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onPostMessage onpostmessageCreate = create(access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onpostmessageCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 89 / 0;
            } else {
                objInvokeSuspend = onpostmessageCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                decodeIpv6 decodeipv6OnExtraCallbackWithResult = r4.onExtraCallbackWithResult(r4.this);
                this.label = 1;
                Object objOnExtraCallback = decodeipv6OnExtraCallbackWithResult.onExtraCallback(this);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    return objOnExtraCallback;
                }
                int i3 = onExtraCallback + 75;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 6 / 0;
                }
                return objOnWarmupCompleted;
            }
            int i5 = onExtraCallback + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i7 = onNavigationEvent + 61;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return obj;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onActivityLayout extends SuspendLambda implements Function1<access13800<? super Boolean>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;

        onActivityLayout(access13800<? super onActivityLayout> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityLayout onactivitylayout = r4.this.new onActivityLayout(access13800Var);
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 40 / 0;
            }
            return onactivitylayout;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(access13800<? super Boolean> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onActivityLayout onactivitylayoutCreate = create(access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onactivitylayoutCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 2 / 0;
            } else {
                objInvokeSuspend = onactivitylayoutCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                decodeIpv6 decodeipv6OnExtraCallbackWithResult = r4.onExtraCallbackWithResult(r4.this);
                this.label = 1;
                Object objOnWarmupCompleted2 = decodeipv6OnExtraCallbackWithResult.onWarmupCompleted(this);
                return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
            }
            int i3 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i4 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return obj;
        }
    }

    static final class onMessageChannelReady extends SuspendLambda implements Function1<access13800<? super AccountSections.Account>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(int i, access13800<? super onMessageChannelReady> access13800Var) {
            super(1, access13800Var);
            this.$appWidgetId = i;
        }

        public final Object IAuthTabCallback(access13800<? super AccountSections.Account> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onMessageChannelReady onmessagechannelreadyCreate = create(access13800Var);
            if (i3 != 0) {
                return onmessagechannelreadyCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 5 / 0;
            return onmessagechannelreadyCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onMessageChannelReady onmessagechannelready = r4.this.new onMessageChannelReady(this.$appWidgetId, access13800Var);
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 70 / 0;
            }
            return onmessagechannelready;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            access13800<? super AccountSections.Account> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                IAuthTabCallback(access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(access13800Var);
            int i3 = onExtraCallbackWithResult + 119;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 14 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            r1 = o.r4.onMessageChannelReady.onExtraCallback + 103;
            o.r4.onMessageChannelReady.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
            kotlin.ResultKt.onNavigationEvent(r6);
            r1 = o.r4.onMessageChannelReady.onExtraCallbackWithResult + 51;
            o.r4.onMessageChannelReady.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r6);
            r6 = r5.this$0;
            r0 = r5.$appWidgetId;
            r5.label = 1;
            r6 = o.r4.onExtraCallback(r6, r0, (o.access13800) r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        
            if (r6 != r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r3 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r3 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r3 != 1) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 87 / 0;
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
            }
        }
    }

    static final class ICustomTabsCallbackDefault extends SuspendLambda implements Function1<access13800<? super onExtraCallback>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ AccountSections.Account $account;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallbackDefault(AccountSections.Account account, access13800<? super ICustomTabsCallbackDefault> access13800Var) {
            super(1, access13800Var);
            this.$account = account;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallbackDefault iCustomTabsCallbackDefault = r4.this.new ICustomTabsCallbackDefault(this.$account, access13800Var);
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            if (i3 == 0) {
                int i4 = 0 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super onExtraCallback> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 123;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r4 r4Var = r4.this;
            AccountSections.Account account = this.$account;
            this.label = 1;
            Object objOnNavigationEvent = r4.onNavigationEvent(r4Var, account, false, this);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            int i7 = onWarmupCompleted + 103;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class onActivityResized extends SuspendLambda implements Function1<access13800<? super Boolean>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        onActivityResized(access13800<? super onActivityResized> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onActivityResized onactivityresized = r4.this.new onActivityResized(access13800Var);
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onactivityresized;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onNavigationEvent + 59;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i4 != 0) {
                    int i5 = 28 / 0;
                }
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r4 r4Var = r4.this;
            this.label = 1;
            Object objOnWarmupCompleted2 = r4.onWarmupCompleted(r4Var, (access13800) this);
            if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                int i6 = onWarmupCompleted + 125;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 34 / 0;
                }
                return objOnWarmupCompleted;
            }
            int i8 = onNavigationEvent + 119;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return objOnWarmupCompleted2;
            }
            throw null;
        }
    }

    static final class onMinimized extends SuspendLambda implements Function1<access13800<? super List<? extends String>>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $logoPaddingColor;
        final /* synthetic */ onExtraCallback $overview;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMinimized(onExtraCallback onextracallback, Context context, int i, access13800<? super onMinimized> access13800Var) {
            super(1, access13800Var);
            this.$overview = onextracallback;
            this.$context = context;
            this.$logoPaddingColor = i;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onMinimized onminimized = new onMinimized(this.$overview, this.$context, this.$logoPaddingColor, access13800Var);
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onminimized;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super List<String>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overview, this.$context, this.$logoPaddingColor, null);
            this.label = 1;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(anonymousClass1, this);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                return objOnExtraCallbackWithResult;
            }
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        /* renamed from: o.r4$onMinimized$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends String>>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ Context $context;
            final /* synthetic */ int $logoPaddingColor;
            final /* synthetic */ onExtraCallback $overview;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(onExtraCallback onextracallback, Context context, int i, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$overview = onextracallback;
                this.$context = context;
                this.$logoPaddingColor = i;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overview, this.$context, this.$logoPaddingColor, access13800Var);
                anonymousClass1.L$0 = obj;
                int i2 = IAuthTabCallback + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<String>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onWarmupCompleted(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = IAuthTabCallback + 117;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<String>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                }
                int i4 = 46 / 0;
                return anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: o.r4$onMinimized$1$IAuthTabCallback */
            static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                final /* synthetic */ Context $context;
                final /* synthetic */ int $logoPaddingColor;
                final /* synthetic */ String $url;
                int I$0;
                int I$1;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IAuthTabCallback(String str, Context context, int i, access13800<? super IAuthTabCallback> access13800Var) {
                    super(2, access13800Var);
                    this.$url = str;
                    this.$context = context;
                    this.$logoPaddingColor = i;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$url, this.$context, this.$logoPaddingColor, access13800Var);
                    int i2 = IAuthTabCallback + 69;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return iAuthTabCallback;
                    }
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 45;
                    onExtraCallback = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super String> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return onExtraCallback(findresandmsg, access13800Var);
                    }
                    Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                    int i3 = 63 / 0;
                    return objOnExtraCallback;
                }

                public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 109;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        return iAuthTabCallbackCreate.invokeSuspend(unit);
                    }
                    iAuthTabCallbackCreate.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    Object obj3 = null;
                    try {
                        if (i2 != 0) {
                            int i3 = onExtraCallback + 91;
                            IAuthTabCallback = i3 % 128;
                            if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                        } else {
                            ResultKt.onNavigationEvent(obj);
                            String str = this.$url;
                            Context context = this.$context;
                            int i4 = this.$logoPaddingColor;
                            Result.Companion companion = Result.Companion;
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.label = 1;
                            obj = rExternalSyntheticLambda1.onExtraCallback(str, context, 28.4f, 1.2f, i4, this);
                            if (obj == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                        obj2 = Result.constructor-impl(rExternalSyntheticLambda1.onExtraCallback((Bitmap) obj, null, 0, 3, null));
                    } catch (WebResourceResponseModel e) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e));
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                        int i5 = onExtraCallback + 119;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 5 % 3;
                        }
                    }
                    if (Result.onExtraCallback(obj2)) {
                        obj2 = null;
                    }
                    int i7 = onExtraCallback + 95;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return obj2;
                    }
                    obj3.hashCode();
                    throw null;
                }
            }

            public final Object invokeSuspend(Object obj) {
                List listTake;
                Object objIAuthTabCallback;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallback + 99;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    int i7 = i5 % 2;
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = i6 + 61;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i9 = 88 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                    objIAuthTabCallback = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    List list = (List) onExtraCallback.onExtraCallbackWithResult(new Object[]{this.$overview}, -1481187999, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1481188000, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
                    if (list == null || (listTake = CollectionsKt.take(list, 2)) == null) {
                        int i10 = IAuthTabCallback + 115;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        return null;
                    }
                    List list2 = listTake;
                    Context context = this.$context;
                    int i12 = this.$logoPaddingColor;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback((String) it.next(), context, i12, null), 3, (Object) null));
                        int i13 = IAuthTabCallback + 11;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.label = 1;
                    objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                return (List) objIAuthTabCallback;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0207: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:59:0x0206 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0210: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:63:0x020f */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0208: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:59:0x0206 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0211: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:63:0x020f */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a4 A[Catch: CancellationException -> 0x020b, Exception -> 0x06c5, WebResourceResponseModel -> 0x06c7, TRY_LEAVE, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0448 A[Catch: CancellationException -> 0x0641, Exception -> 0x0695, WebResourceResponseModel -> 0x0699, TRY_LEAVE, TryCatch #14 {CancellationException -> 0x0641, blocks: (B:180:0x0590, B:132:0x0492, B:134:0x049c, B:142:0x04ba, B:144:0x04cc, B:148:0x04d2, B:150:0x04dc, B:146:0x04cf, B:169:0x0504, B:173:0x0533, B:175:0x0547, B:125:0x0434, B:126:0x0448), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05f1 A[Catch: CancellationException -> 0x020b, Exception -> 0x0635, WebResourceResponseModel -> 0x0637, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0608 A[Catch: CancellationException -> 0x020b, Exception -> 0x0635, WebResourceResponseModel -> 0x0637, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x060d A[Catch: CancellationException -> 0x020b, Exception -> 0x0635, WebResourceResponseModel -> 0x0637, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06f4 A[Catch: CancellationException -> 0x020b, Exception -> 0x06fe, WebResourceResponseModel -> 0x0701, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x078e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294 A[Catch: CancellationException -> 0x020b, Exception -> 0x0704, WebResourceResponseModel -> 0x0719, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030d A[Catch: Exception -> 0x01d6, WebResourceResponseModel -> 0x01da, CancellationException -> 0x020b, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031b A[Catch: Exception -> 0x01d6, WebResourceResponseModel -> 0x01da, CancellationException -> 0x020b, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0339 A[Catch: CancellationException -> 0x020b, Exception -> 0x06de, WebResourceResponseModel -> 0x06e4, TRY_ENTER, TRY_LEAVE, TryCatch #54 {CancellationException -> 0x020b, blocks: (B:13:0x0070, B:182:0x0594, B:184:0x05f1, B:186:0x05fa, B:188:0x0608, B:191:0x0610, B:193:0x0627, B:190:0x060d, B:16:0x00a7, B:23:0x00f4, B:122:0x0424, B:32:0x013b, B:116:0x03db, B:39:0x0177, B:109:0x03a0, B:111:0x03a4, B:113:0x03a9, B:260:0x06bd, B:261:0x06c4, B:46:0x01ad, B:102:0x0363, B:104:0x036a, B:49:0x01d1, B:85:0x0305, B:87:0x030d, B:89:0x031b, B:90:0x0320, B:56:0x01f6, B:80:0x02d0, B:82:0x02d8, B:99:0x0339, B:73:0x0288, B:75:0x0294, B:77:0x029c, B:283:0x06ee, B:284:0x06f3, B:285:0x06f4, B:286:0x06fd), top: B:316:0x003d }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r2v19, types: [o.q8a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull Context context, int i, @NotNull access13800<? super OverviewSmallWidgetState> access13800Var) throws Throwable {
        extraCallbackWithResult extracallbackwithresult;
        WebResourceResponseModel webResourceResponseModel;
        Exception exc;
        ?? r12;
        DisplaySetting displaySetting;
        DisplaySetting displaySetting2;
        ?? r122;
        DisplaySetting displaySetting3;
        int i2;
        IAuthTabCallback iAuthTabCallback;
        int i3;
        Object obj;
        Object obj2;
        float fFloatValue;
        Object maintenance;
        ?? r3;
        Context context2;
        Object objOnWarmupCompleted;
        int i4;
        Object objIAuthTabCallback;
        int i5;
        DisplaySetting displaySetting4;
        Context context3;
        Context context4;
        extraCallbackWithResult extracallbackwithresult2;
        int i6;
        int i7;
        int i8;
        IAuthTabCallback iAuthTabCallback2;
        extraCallbackWithResult extracallbackwithresult3;
        int i9;
        Object maintenance2;
        AccountSections.Account account;
        Object objOnExtraCallback;
        AccountSections.Account account2;
        WebResourceResponseModel webResourceResponseModel2;
        Exception exc2;
        onExtraCallback onextracallback;
        DisplaySetting displaySetting5;
        Context context5;
        extraCallbackWithResult extracallbackwithresult4;
        onExtraCallback onextracallback2;
        boolean zBooleanValue;
        Context context6;
        Object objOnExtraCallbackWithResult;
        Context context7;
        onExtraCallback onextracallback3;
        float f;
        int i10;
        Object obj3;
        Boolean bool;
        Object obj4;
        extraCallbackWithResult extracallbackwithresult5;
        DisplaySetting displaySetting6;
        AccountSections.Account account3;
        float f2;
        int i11;
        int i12;
        boolean z;
        Context context8;
        DisplaySetting displaySetting7;
        OverviewAccounts.Overview.HiddenStock hiddenStockIAuthTabCallback;
        String str;
        boolean zAreEqual;
        WebResourceResponseModel webResourceResponseModel3;
        DisplaySetting displaySetting8;
        Exception exc3;
        Currency currencyOnExtraCallback;
        AccountSections.Account account4;
        onExtraCallback onextracallback4;
        Object obj5;
        String str2;
        Object objOnExtraCallback2;
        boolean z2;
        boolean z3;
        String str3;
        onExtraCallback onextracallback5;
        IAuthTabCallback iAuthTabCallback3;
        Context context9;
        AccountSections.Account account5;
        int i13;
        Currency currency;
        int i14 = i;
        ?? r4 = 2;
        ?? r42 = 2;
        int i15 = 2 % 2;
        int i16 = ICustomTabsCallback + 75;
        int i17 = i16 % 128;
        access100 = i17;
        int i18 = i16 % 2;
        if (access13800Var instanceof extraCallbackWithResult) {
            int i19 = i17 + 11;
            ICustomTabsCallback = i19 % 128;
            int i20 = i19 % 2;
            extracallbackwithresult = (extraCallbackWithResult) access13800Var;
            int i21 = extracallbackwithresult.label;
            i2 = i21 & Integer.MIN_VALUE;
            if (i2 != 0) {
                extracallbackwithresult.label = i21 - 2147483648;
            } else {
                extracallbackwithresult = new extraCallbackWithResult(access13800Var);
            }
        }
        Object objOnExtraCallback3 = extracallbackwithresult.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        float f3 = extracallbackwithresult.label;
        try {
            try {
                try {
                    try {
                    } catch (CancellationException e) {
                        e = e;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                }
            } catch (WebResourceResponseModel e3) {
                webResourceResponseModel = e3;
                r4 = r122;
                displaySetting2 = displaySetting3;
            } catch (Exception e4) {
                exc = e4;
                r42 = r12;
                displaySetting2 = displaySetting;
            }
        } catch (Exception e5) {
            exc = e5;
        } catch (WebResourceResponseModel e6) {
            webResourceResponseModel = e6;
        }
        switch (f3) {
            case 0.0f:
                ResultKt.onNavigationEvent(objOnExtraCallback3);
                context2 = context;
                extracallbackwithresult.L$0 = context2;
                extracallbackwithresult.I$0 = i14;
                extracallbackwithresult.label = 1;
                objOnWarmupCompleted = onWarmupCompleted(i14, (access13800<? super DisplaySetting>) extracallbackwithresult);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                DisplaySetting displaySetting9 = (DisplaySetting) objOnWarmupCompleted;
                extracallbackwithresult.L$0 = context2;
                extracallbackwithresult.L$1 = displaySetting9;
                extracallbackwithresult.I$0 = i14;
                i4 = 2;
                extracallbackwithresult.label = 2;
                objIAuthTabCallback = IAuthTabCallback(i14, (access13800<? super Float>) extracallbackwithresult);
                if (objIAuthTabCallback != objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                i5 = i14;
                displaySetting4 = displaySetting9;
                context3 = context2;
                objOnExtraCallback3 = objIAuthTabCallback;
                fFloatValue = ((Number) objOnExtraCallback3).floatValue();
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "OverviewRepository.loadOverviewSmallData");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i5));
                Pair[] pairArr = new Pair[i4];
                pairArr[0] = pairIAuthTabCallback;
                pairArr[1] = pairIAuthTabCallback2;
                q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(pairArr));
                iAuthTabCallback = new IAuthTabCallback();
                try {
                    Result.Companion companion = Result.Companion;
                    try {
                    } catch (WebResourceResponseModel e7) {
                        e = e7;
                        webResourceResponseModel2 = e;
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        webResourceResponseModel = webResourceResponseModel2;
                        Result.Companion companion2 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    } catch (Exception e8) {
                        e = e8;
                        exc2 = e;
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        exc = exc2;
                        Result.Companion companion3 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    }
                } catch (Exception e9) {
                    e = e9;
                    obj = "appWidgetId";
                    obj2 = "function";
                } catch (WebResourceResponseModel e10) {
                    e = e10;
                    obj = "appWidgetId";
                    obj2 = "function";
                }
                if (onWarmupCompleted(this).IAuthTabCallback()) {
                    throw new OverviewSmallWidgetState.NotTradeableUser(displaySetting4, fFloatValue);
                }
                if (!onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback()) {
                    throw new OverviewSmallWidgetState.NetworkError(displaySetting4, fFloatValue);
                }
                onPostMessage onpostmessage = new onPostMessage(null);
                extracallbackwithresult.L$0 = context3;
                extracallbackwithresult.L$1 = displaySetting4;
                extracallbackwithresult.L$2 = iAuthTabCallback;
                extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult);
                extracallbackwithresult.I$0 = i5;
                extracallbackwithresult.F$0 = fFloatValue;
                extracallbackwithresult.I$1 = 0;
                extracallbackwithresult.I$2 = 0;
                extracallbackwithresult.label = 3;
                objOnExtraCallback3 = iAuthTabCallback.onExtraCallback("syncCanTrading", onpostmessage, extracallbackwithresult);
                if (objOnExtraCallback3 == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                int i22 = access100 + 93;
                ICustomTabsCallback = i22 % 128;
                int i23 = i22 % 2;
                context4 = context3;
                extracallbackwithresult2 = extracallbackwithresult;
                i6 = 0;
                i7 = 0;
                try {
                } catch (WebResourceResponseModel e11) {
                    e = e11;
                    obj = "appWidgetId";
                    obj2 = "function";
                    webResourceResponseModel2 = e;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    webResourceResponseModel = webResourceResponseModel2;
                    Result.Companion companion22 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (Exception e12) {
                    e = e12;
                    obj = "appWidgetId";
                    obj2 = "function";
                    exc2 = e;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    exc = exc2;
                    Result.Companion companion32 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                if (((Boolean) objOnExtraCallback3).booleanValue()) {
                    try {
                        onActivityLayout onactivitylayout = new onActivityLayout(null);
                        extracallbackwithresult.L$0 = access15400.onNavigationEvent(context4);
                        extracallbackwithresult.L$1 = displaySetting4;
                        extracallbackwithresult.L$2 = iAuthTabCallback;
                        extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult2);
                        extracallbackwithresult.I$0 = i5;
                        extracallbackwithresult.F$0 = fFloatValue;
                        extracallbackwithresult.I$1 = i6;
                        extracallbackwithresult.I$2 = i7;
                        extracallbackwithresult.label = 4;
                        objOnExtraCallback3 = iAuthTabCallback.onExtraCallback("isInMaintenance", onactivitylayout, extracallbackwithresult);
                    } catch (Exception e13) {
                        e = e13;
                        exc2 = e;
                        obj = "appWidgetId";
                        obj2 = "function";
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        exc = exc2;
                        Result.Companion companion322 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    } catch (WebResourceResponseModel e14) {
                        e = e14;
                        webResourceResponseModel2 = e;
                        obj = "appWidgetId";
                        obj2 = "function";
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        webResourceResponseModel = webResourceResponseModel2;
                        Result.Companion companion222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    }
                    if (objOnExtraCallback3 == objOnWarmupCompleted2) {
                        return objOnWarmupCompleted2;
                    }
                    f3 = fFloatValue;
                    i8 = i5;
                    iAuthTabCallback2 = iAuthTabCallback;
                    displaySetting2 = displaySetting4;
                    if (((Boolean) objOnExtraCallback3).booleanValue()) {
                        throw new OverviewSmallWidgetState.NotTradeableUser(displaySetting2, f3);
                    }
                    maintenance2 = new OverviewSmallWidgetState.Maintenance(displaySetting2, f3);
                    iAuthTabCallback = iAuthTabCallback2;
                    i3 = i8;
                    obj = "appWidgetId";
                    obj2 = "function";
                    fFloatValue = f3;
                    try {
                        maintenance = Result.constructor-impl(maintenance2);
                    } catch (Exception e15) {
                        exc = e15;
                        Result.Companion companion3222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    } catch (WebResourceResponseModel e16) {
                        webResourceResponseModel = e16;
                        Result.Companion companion2222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    }
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                        q8a.onNavigationEvent.onNavigationEvent(r3, access8100.onWarmupCompleted(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj2, "OverviewRepo.loadOverviewSmallData onFailure"), getWrite.IAuthTabCallback(obj, access14000.onNavigationEvent(i3))}), iAuthTabCallback.onWarmupCompleted()));
                        if (r3 instanceof OverviewSmallWidgetState) {
                            int i24 = access100 + 105;
                            ICustomTabsCallback = i24 % 128;
                            if (i24 % 2 == 0) {
                                throw null;
                            }
                            maintenance = (OverviewSmallWidgetState) r3;
                        } else {
                            maintenance = setCustomerUserId.onExtraCallbackWithResult((Throwable) r3) ? new OverviewSmallWidgetState.Maintenance(displaySetting2, fFloatValue) : new OverviewSmallWidgetState.Error(displaySetting2, fFloatValue, r3.getMessage());
                        }
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                onMessageChannelReady onmessagechannelready = new onMessageChannelReady(i5, null);
                extracallbackwithresult.L$0 = context4;
                extracallbackwithresult.L$1 = displaySetting4;
                extracallbackwithresult.L$2 = iAuthTabCallback;
                extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult2);
                extracallbackwithresult.I$0 = i5;
                extracallbackwithresult.F$0 = fFloatValue;
                extracallbackwithresult.I$1 = i6;
                extracallbackwithresult.I$2 = i7;
                extracallbackwithresult.label = 5;
                objOnExtraCallback3 = iAuthTabCallback.onExtraCallback("getAccount", onmessagechannelready, extracallbackwithresult);
                if (objOnExtraCallback3 == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                int i25 = i6;
                extracallbackwithresult3 = extracallbackwithresult2;
                i9 = i25;
                try {
                    account = (AccountSections.Account) objOnExtraCallback3;
                    obj = "appWidgetId";
                    try {
                        ICustomTabsCallbackDefault iCustomTabsCallbackDefault = new ICustomTabsCallbackDefault(account, null);
                        extracallbackwithresult.L$0 = context4;
                        extracallbackwithresult.L$1 = displaySetting4;
                        extracallbackwithresult.L$2 = iAuthTabCallback;
                        extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult3);
                        extracallbackwithresult.L$4 = account;
                        extracallbackwithresult.I$0 = i5;
                        extracallbackwithresult.F$0 = fFloatValue;
                        extracallbackwithresult.I$1 = i9;
                        extracallbackwithresult.I$2 = i7;
                        extracallbackwithresult.label = 6;
                        objOnExtraCallback = iAuthTabCallback.onExtraCallback("getOverview", iCustomTabsCallbackDefault, extracallbackwithresult);
                    } catch (Exception e17) {
                        e = e17;
                        obj2 = "function";
                        exc2 = e;
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        exc = exc2;
                        Result.Companion companion32222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    } catch (WebResourceResponseModel e18) {
                        e = e18;
                        obj2 = "function";
                        webResourceResponseModel2 = e;
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        webResourceResponseModel = webResourceResponseModel2;
                        Result.Companion companion22222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    }
                } catch (Exception e19) {
                    e = e19;
                    obj = "appWidgetId";
                    obj2 = "function";
                    exc2 = e;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    exc = exc2;
                    Result.Companion companion322222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (WebResourceResponseModel e20) {
                    e = e20;
                    obj = "appWidgetId";
                    obj2 = "function";
                    webResourceResponseModel2 = e;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    webResourceResponseModel = webResourceResponseModel2;
                    Result.Companion companion222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                if (objOnExtraCallback != objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                int i26 = ICustomTabsCallback + 43;
                DisplaySetting displaySetting10 = displaySetting4;
                access100 = i26 % 128;
                if (i26 % 2 != 0) {
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                displaySetting4 = displaySetting10;
                account2 = account;
                objOnExtraCallback3 = objOnExtraCallback;
                try {
                    onextracallback = (onExtraCallback) objOnExtraCallback3;
                    try {
                    } catch (Exception e21) {
                        e = e21;
                        exc2 = e;
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        exc = exc2;
                        Result.Companion companion3222222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    } catch (WebResourceResponseModel e22) {
                        e = e22;
                        webResourceResponseModel2 = e;
                        i3 = i5;
                        displaySetting2 = displaySetting4;
                        webResourceResponseModel = webResourceResponseModel2;
                        Result.Companion companion2222222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    }
                } catch (WebResourceResponseModel e23) {
                    e = e23;
                    obj2 = "function";
                    webResourceResponseModel2 = e;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    webResourceResponseModel = webResourceResponseModel2;
                    Result.Companion companion22222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (Exception e24) {
                    e = e24;
                    obj2 = "function";
                    exc2 = e;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    exc = exc2;
                    Result.Companion companion32222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                if (onextracallback != null) {
                    throw new OverviewSmallWidgetState.Error(displaySetting4, fFloatValue, "overview is null");
                }
                obj2 = "function";
                onActivityResized onactivityresized = new onActivityResized(null);
                extracallbackwithresult.L$0 = context4;
                extracallbackwithresult.L$1 = displaySetting4;
                extracallbackwithresult.L$2 = iAuthTabCallback;
                extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult3);
                extracallbackwithresult.L$4 = account2;
                extracallbackwithresult.L$5 = onextracallback;
                extracallbackwithresult.I$0 = i5;
                extracallbackwithresult.F$0 = fFloatValue;
                extracallbackwithresult.I$1 = i9;
                extracallbackwithresult.I$2 = i7;
                extracallbackwithresult.label = 7;
                Object objOnExtraCallback4 = iAuthTabCallback.onExtraCallback("getIncludeExpense", onactivityresized, extracallbackwithresult);
                if (objOnExtraCallback4 == objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                float f4 = fFloatValue;
                displaySetting5 = displaySetting4;
                context5 = context4;
                extracallbackwithresult4 = extracallbackwithresult3;
                f3 = f4;
                onextracallback2 = onextracallback;
                objOnExtraCallback3 = objOnExtraCallback4;
                try {
                    zBooleanValue = ((Boolean) objOnExtraCallback3).booleanValue();
                    q8a q8aVar2 = q8a.onNavigationEvent;
                    extracallbackwithresult.L$0 = context5;
                    extracallbackwithresult.L$1 = displaySetting5;
                    extracallbackwithresult.L$2 = iAuthTabCallback;
                    context6 = context5;
                    extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult4);
                    extracallbackwithresult.L$4 = account2;
                    extracallbackwithresult.L$5 = onextracallback2;
                    extracallbackwithresult.I$0 = i5;
                    extracallbackwithresult.F$0 = f3;
                    extracallbackwithresult.I$1 = i9;
                    extracallbackwithresult.I$2 = i7;
                    extracallbackwithresult.Z$0 = zBooleanValue;
                    extracallbackwithresult.label = 8;
                    objOnExtraCallbackWithResult = q8aVar2.onExtraCallbackWithResult(i5, (access13800<? super Boolean>) extracallbackwithresult);
                } catch (Exception e25) {
                    exc2 = e25;
                    displaySetting4 = displaySetting5;
                    fFloatValue = f3;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    exc = exc2;
                    Result.Companion companion322222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (WebResourceResponseModel e26) {
                    webResourceResponseModel2 = e26;
                    displaySetting4 = displaySetting5;
                    fFloatValue = f3;
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    webResourceResponseModel = webResourceResponseModel2;
                    Result.Companion companion222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                if (objOnExtraCallbackWithResult != objOnWarmupCompleted2) {
                    return objOnWarmupCompleted2;
                }
                int i27 = ICustomTabsCallback + 5;
                access100 = i27 % 128;
                if (i27 % 2 != 0) {
                    int i28 = 97 / 0;
                }
                context7 = context6;
                onextracallback3 = onextracallback2;
                f = f3;
                i10 = i9;
                obj3 = objOnExtraCallbackWithResult;
                try {
                    bool = (Boolean) obj3;
                    try {
                    } catch (Exception e27) {
                        e = e27;
                        exc = e;
                        i3 = i5;
                        displaySetting2 = displaySetting5;
                        fFloatValue = f;
                        Result.Companion companion3222222222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    } catch (WebResourceResponseModel e28) {
                        e = e28;
                        webResourceResponseModel = e;
                        i3 = i5;
                        displaySetting2 = displaySetting5;
                        fFloatValue = f;
                        Result.Companion companion2222222222 = Result.Companion;
                        maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    }
                } catch (WebResourceResponseModel e29) {
                    e = e29;
                } catch (Exception e30) {
                    e = e30;
                }
                if (bool == null) {
                    int i29 = access100 + 107;
                    ICustomTabsCallback = i29 % 128;
                    int i30 = i29 % 2;
                    boolean zBooleanValue2 = bool.booleanValue();
                    obj4 = objOnWarmupCompleted2;
                    extracallbackwithresult5 = extracallbackwithresult4;
                    i3 = i5;
                    displaySetting6 = displaySetting5;
                    account3 = account2;
                    f2 = f;
                    i11 = i7;
                    i12 = i10;
                    Context context10 = context7;
                    z = zBooleanValue2;
                    context8 = context10;
                    try {
                        String strOnExtraCallback = onExtraCallback(this);
                        hiddenStockIAuthTabCallback = onextracallback3.IAuthTabCallback();
                        if (hiddenStockIAuthTabCallback != null) {
                            try {
                                str = strOnExtraCallback;
                                zAreEqual = Intrinsics.areEqual(hiddenStockIAuthTabCallback.onExtraCallbackWithResult(), access14000.onNavigationEvent(true));
                            } catch (Exception e31) {
                                exc3 = e31;
                                displaySetting8 = displaySetting6;
                                exc = exc3;
                                displaySetting2 = displaySetting8;
                                fFloatValue = f2;
                                Result.Companion companion32222222222 = Result.Companion;
                                maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                                r3 = Result.exceptionOrNull-impl(maintenance);
                                if (r3 != 0) {
                                }
                                return (OverviewSmallWidgetState) maintenance;
                            } catch (WebResourceResponseModel e32) {
                                webResourceResponseModel3 = e32;
                                displaySetting8 = displaySetting6;
                                webResourceResponseModel = webResourceResponseModel3;
                                displaySetting2 = displaySetting8;
                                fFloatValue = f2;
                                Result.Companion companion22222222222 = Result.Companion;
                                maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                r3 = Result.exceptionOrNull-impl(maintenance);
                                if (r3 != 0) {
                                }
                                return (OverviewSmallWidgetState) maintenance;
                            }
                        } else {
                            str = strOnExtraCallback;
                            zAreEqual = false;
                        }
                    } catch (WebResourceResponseModel e33) {
                        e = e33;
                        displaySetting7 = displaySetting6;
                    } catch (Exception e34) {
                        e = e34;
                        displaySetting7 = displaySetting6;
                    }
                    if (zAreEqual) {
                        try {
                            try {
                                displaySetting8 = displaySetting6;
                            } catch (WebResourceResponseModel e35) {
                                e = e35;
                                displaySetting8 = displaySetting6;
                            } catch (Exception e36) {
                                e = e36;
                                displaySetting8 = displaySetting6;
                            }
                        } catch (Exception e37) {
                            e = e37;
                            displaySetting8 = displaySetting6;
                        } catch (WebResourceResponseModel e38) {
                            e = e38;
                            displaySetting8 = displaySetting6;
                        }
                        try {
                            maintenance2 = new OverviewSmallWidgetState.AllHidden(displaySetting6, f2, account3.onWarmupCompleted(), str, account3.asInterface(), account3.onTransact().isChildAccount() ? HostnamesKt.PARENTS : HostnamesKt.SELF);
                            displaySetting2 = displaySetting8;
                            fFloatValue = f2;
                            maintenance = Result.constructor-impl(maintenance2);
                        } catch (WebResourceResponseModel e39) {
                            e = e39;
                            webResourceResponseModel3 = e;
                            webResourceResponseModel = webResourceResponseModel3;
                            displaySetting2 = displaySetting8;
                            fFloatValue = f2;
                            Result.Companion companion222222222222 = Result.Companion;
                            maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                            r3 = Result.exceptionOrNull-impl(maintenance);
                            if (r3 != 0) {
                            }
                            return (OverviewSmallWidgetState) maintenance;
                        } catch (Exception e40) {
                            e = e40;
                            exc3 = e;
                            exc = exc3;
                            displaySetting2 = displaySetting8;
                            fFloatValue = f2;
                            Result.Companion companion322222222222 = Result.Companion;
                            maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                            r3 = Result.exceptionOrNull-impl(maintenance);
                            if (r3 != 0) {
                            }
                            return (OverviewSmallWidgetState) maintenance;
                        }
                        r3 = Result.exceptionOrNull-impl(maintenance);
                        if (r3 != 0) {
                        }
                        return (OverviewSmallWidgetState) maintenance;
                    }
                    DisplaySetting displaySetting11 = displaySetting6;
                    try {
                        try {
                            currencyOnExtraCallback = onExtraCallback(this, IAuthTabCallbackStub(this), onextracallback3);
                            account4 = account3;
                            int i31 = i11;
                            onextracallback4 = onextracallback3;
                            obj5 = obj4;
                            str2 = str;
                            try {
                                int iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(RemoteViewsThemeUtilKt.IAuthTabCallback(RequestBodyCompanion.onExtraCallbackWithResult(authParams.BackgroundDefault), context8, displaySetting11, null, 4, null));
                                onMinimized onminimized = new onMinimized(onextracallback4, context8, iOnNavigationEvent, null);
                                extracallbackwithresult.L$0 = context8;
                                displaySetting7 = displaySetting11;
                                try {
                                    extracallbackwithresult.L$1 = displaySetting7;
                                    extracallbackwithresult.L$2 = iAuthTabCallback;
                                    extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult5);
                                    extracallbackwithresult.L$4 = account4;
                                    extracallbackwithresult.L$5 = onextracallback4;
                                    extracallbackwithresult.L$6 = str2;
                                    extracallbackwithresult.L$7 = currencyOnExtraCallback;
                                    extracallbackwithresult.I$0 = i3;
                                    extracallbackwithresult.F$0 = f2;
                                    extracallbackwithresult.I$1 = i12;
                                    extracallbackwithresult.I$2 = i31;
                                    extracallbackwithresult.Z$0 = zBooleanValue;
                                    extracallbackwithresult.I$3 = iOnNavigationEvent;
                                    extracallbackwithresult.Z$1 = z;
                                    extracallbackwithresult.label = 10;
                                    objOnExtraCallback2 = iAuthTabCallback.onExtraCallback("loadLogoImages", onminimized, extracallbackwithresult);
                                } catch (Exception e41) {
                                    e = e41;
                                    exc = e;
                                    displaySetting2 = displaySetting7;
                                    fFloatValue = f2;
                                    Result.Companion companion3222222222222 = Result.Companion;
                                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                                    r3 = Result.exceptionOrNull-impl(maintenance);
                                    if (r3 != 0) {
                                    }
                                    return (OverviewSmallWidgetState) maintenance;
                                } catch (WebResourceResponseModel e42) {
                                    e = e42;
                                    webResourceResponseModel = e;
                                    displaySetting2 = displaySetting7;
                                    fFloatValue = f2;
                                    Result.Companion companion2222222222222 = Result.Companion;
                                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                    r3 = Result.exceptionOrNull-impl(maintenance);
                                    if (r3 != 0) {
                                    }
                                    return (OverviewSmallWidgetState) maintenance;
                                }
                            } catch (Exception e43) {
                                e = e43;
                                displaySetting7 = displaySetting11;
                            } catch (WebResourceResponseModel e44) {
                                e = e44;
                                displaySetting7 = displaySetting11;
                            }
                        } catch (Exception e45) {
                            e = e45;
                            displaySetting7 = displaySetting11;
                        } catch (WebResourceResponseModel e46) {
                            e = e46;
                            displaySetting7 = displaySetting11;
                        } catch (CancellationException e47) {
                            e = e47;
                            throw e;
                        }
                    } catch (Exception e48) {
                        e = e48;
                        displaySetting7 = displaySetting11;
                    } catch (WebResourceResponseModel e49) {
                        e = e49;
                        displaySetting7 = displaySetting11;
                    }
                    if (objOnExtraCallback2 == obj5) {
                        return obj5;
                    }
                    z2 = z;
                    z3 = zBooleanValue;
                    str3 = str2;
                    objOnExtraCallback3 = objOnExtraCallback2;
                    onextracallback5 = onextracallback4;
                    f3 = f2;
                    iAuthTabCallback3 = iAuthTabCallback;
                    context9 = context8;
                    account5 = account4;
                    displaySetting2 = displaySetting7;
                    i13 = i3;
                    currency = currencyOnExtraCallback;
                    try {
                        List list = (List) objOnExtraCallback3;
                        try {
                            Triple tripleOnWarmupCompleted = onWarmupCompleted(this, context9, onextracallback5, z3, currency);
                            maintenance2 = new OverviewSmallWidgetState.Success(displaySetting2, f3, account5.onWarmupCompleted(), new WidgetOverview.Overview((OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, (String) tripleOnWarmupCompleted.onExtraCallbackWithResult(), (String) tripleOnWarmupCompleted.IAuthTabCallback(), (checkDuration) tripleOnWarmupCompleted.onExtraCallback(), onextracallback5.onWarmupCompleted(), (List) onExtraCallback.onExtraCallbackWithResult(new Object[]{onextracallback5}, -1481187999, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1481188000, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted()), onextracallback5.access100(), onextracallback5.getInterfaceDescriptor(), 7, (DefaultConstructorMarker) null), str3, list != null ? CollectionsKt.emptyList() : list, currency, z3, z2, account5.asInterface(), !account5.onTransact().isChildAccount() ? HostnamesKt.PARENTS : HostnamesKt.SELF);
                            iAuthTabCallback = iAuthTabCallback3;
                            i3 = i13;
                            fFloatValue = f3;
                            maintenance = Result.constructor-impl(maintenance2);
                        } catch (Exception e50) {
                            e = e50;
                            exc = e;
                            iAuthTabCallback = iAuthTabCallback3;
                            i3 = i13;
                            fFloatValue = f3;
                            Result.Companion companion32222222222222 = Result.Companion;
                            maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                            r3 = Result.exceptionOrNull-impl(maintenance);
                            if (r3 != 0) {
                            }
                            return (OverviewSmallWidgetState) maintenance;
                        } catch (WebResourceResponseModel e51) {
                            e = e51;
                            webResourceResponseModel = e;
                            iAuthTabCallback = iAuthTabCallback3;
                            i3 = i13;
                            fFloatValue = f3;
                            Result.Companion companion22222222222222 = Result.Companion;
                            maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                            r3 = Result.exceptionOrNull-impl(maintenance);
                            if (r3 != 0) {
                            }
                            return (OverviewSmallWidgetState) maintenance;
                        }
                    } catch (WebResourceResponseModel e52) {
                        e = e52;
                    } catch (Exception e53) {
                        e = e53;
                    }
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                q8a q8aVar3 = q8a.onNavigationEvent;
                extracallbackwithresult.L$0 = context7;
                extracallbackwithresult.L$1 = displaySetting5;
                extracallbackwithresult.L$2 = iAuthTabCallback;
                extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult4);
                extracallbackwithresult.L$4 = account2;
                extracallbackwithresult.L$5 = onextracallback3;
                extracallbackwithresult.L$6 = access15400.onNavigationEvent(this);
                extracallbackwithresult.I$0 = i5;
                extracallbackwithresult.F$0 = f;
                extracallbackwithresult.I$1 = i10;
                extracallbackwithresult.I$2 = i7;
                extracallbackwithresult.Z$0 = zBooleanValue;
                extracallbackwithresult.I$3 = 0;
                extracallbackwithresult.label = 9;
                obj4 = objOnWarmupCompleted2;
                if (q8aVar3.onNavigationEvent(i5, true, (access13800<? super Unit>) extracallbackwithresult) == obj4) {
                    return obj4;
                }
                int i32 = access100 + 109;
                ICustomTabsCallback = i32 % 128;
                if (i32 % 2 == 0) {
                    throw null;
                }
                context8 = context7;
                extracallbackwithresult5 = extracallbackwithresult4;
                z = true;
                i3 = i5;
                displaySetting6 = displaySetting5;
                account3 = account2;
                f2 = f;
                i11 = i7;
                i12 = i10;
                String strOnExtraCallback2 = onExtraCallback(this);
                hiddenStockIAuthTabCallback = onextracallback3.IAuthTabCallback();
                if (hiddenStockIAuthTabCallback != null) {
                }
                if (zAreEqual) {
                }
            case Float.MIN_VALUE:
                i14 = extracallbackwithresult.I$0;
                Context context11 = (Context) extracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback3);
                objOnWarmupCompleted = objOnExtraCallback3;
                context2 = context11;
                DisplaySetting displaySetting92 = (DisplaySetting) objOnWarmupCompleted;
                extracallbackwithresult.L$0 = context2;
                extracallbackwithresult.L$1 = displaySetting92;
                extracallbackwithresult.I$0 = i14;
                i4 = 2;
                extracallbackwithresult.label = 2;
                objIAuthTabCallback = IAuthTabCallback(i14, (access13800<? super Float>) extracallbackwithresult);
                if (objIAuthTabCallback != objOnWarmupCompleted2) {
                }
                break;
            case 2.8E-45f:
                int i33 = extracallbackwithresult.I$0;
                DisplaySetting displaySetting12 = (DisplaySetting) extracallbackwithresult.L$1;
                Context context12 = (Context) extracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback3);
                i5 = i33;
                displaySetting4 = displaySetting12;
                context3 = context12;
                i4 = 2;
                fFloatValue = ((Number) objOnExtraCallback3).floatValue();
                q8a q8aVar4 = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("function", "OverviewRepository.loadOverviewSmallData");
                Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i5));
                Pair[] pairArr2 = new Pair[i4];
                pairArr2[0] = pairIAuthTabCallback3;
                pairArr2[1] = pairIAuthTabCallback22;
                q8aVar4.onExtraCallbackWithResult(access8100.onWarmupCompleted(pairArr2));
                iAuthTabCallback = new IAuthTabCallback();
                Result.Companion companion4 = Result.Companion;
                if (onWarmupCompleted(this).IAuthTabCallback()) {
                }
                break;
            case 4.2E-45f:
                int i34 = extracallbackwithresult.I$2;
                int i35 = extracallbackwithresult.I$1;
                float f5 = extracallbackwithresult.F$0;
                int i36 = extracallbackwithresult.I$0;
                extraCallbackWithResult extracallbackwithresult6 = (access13800) extracallbackwithresult.L$3;
                IAuthTabCallback iAuthTabCallback4 = (IAuthTabCallback) extracallbackwithresult.L$2;
                DisplaySetting displaySetting13 = (DisplaySetting) extracallbackwithresult.L$1;
                context4 = (Context) extracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback3);
                iAuthTabCallback = iAuthTabCallback4;
                i7 = i34;
                displaySetting4 = displaySetting13;
                i6 = i35;
                extracallbackwithresult2 = extracallbackwithresult6;
                i5 = i36;
                fFloatValue = f5;
                if (((Boolean) objOnExtraCallback3).booleanValue()) {
                }
                break;
            case 5.6E-45f:
                f3 = extracallbackwithresult.F$0;
                i8 = extracallbackwithresult.I$0;
                iAuthTabCallback2 = (IAuthTabCallback) extracallbackwithresult.L$2;
                displaySetting2 = (DisplaySetting) extracallbackwithresult.L$1;
                ResultKt.onNavigationEvent(objOnExtraCallback3);
                if (((Boolean) objOnExtraCallback3).booleanValue()) {
                }
                break;
            case 7.0E-45f:
                int i37 = extracallbackwithresult.I$2;
                i9 = extracallbackwithresult.I$1;
                float f6 = extracallbackwithresult.F$0;
                int i38 = extracallbackwithresult.I$0;
                extraCallbackWithResult extracallbackwithresult7 = (access13800) extracallbackwithresult.L$3;
                IAuthTabCallback iAuthTabCallback5 = (IAuthTabCallback) extracallbackwithresult.L$2;
                DisplaySetting displaySetting14 = (DisplaySetting) extracallbackwithresult.L$1;
                context4 = (Context) extracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback3);
                iAuthTabCallback = iAuthTabCallback5;
                i7 = i37;
                displaySetting4 = displaySetting14;
                fFloatValue = f6;
                extracallbackwithresult3 = extracallbackwithresult7;
                i5 = i38;
                account = (AccountSections.Account) objOnExtraCallback3;
                obj = "appWidgetId";
                ICustomTabsCallbackDefault iCustomTabsCallbackDefault2 = new ICustomTabsCallbackDefault(account, null);
                extracallbackwithresult.L$0 = context4;
                extracallbackwithresult.L$1 = displaySetting4;
                extracallbackwithresult.L$2 = iAuthTabCallback;
                extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult3);
                extracallbackwithresult.L$4 = account;
                extracallbackwithresult.I$0 = i5;
                extracallbackwithresult.F$0 = fFloatValue;
                extracallbackwithresult.I$1 = i9;
                extracallbackwithresult.I$2 = i7;
                extracallbackwithresult.label = 6;
                objOnExtraCallback = iAuthTabCallback.onExtraCallback("getOverview", iCustomTabsCallbackDefault2, extracallbackwithresult);
                if (objOnExtraCallback != objOnWarmupCompleted2) {
                }
                break;
            case 8.4E-45f:
                int i39 = extracallbackwithresult.I$2;
                i9 = extracallbackwithresult.I$1;
                f3 = extracallbackwithresult.F$0;
                i2 = extracallbackwithresult.I$0;
                AccountSections.Account account6 = (AccountSections.Account) extracallbackwithresult.L$4;
                extraCallbackWithResult extracallbackwithresult8 = (access13800) extracallbackwithresult.L$3;
                IAuthTabCallback iAuthTabCallback6 = (IAuthTabCallback) extracallbackwithresult.L$2;
                DisplaySetting displaySetting15 = (DisplaySetting) extracallbackwithresult.L$1;
                Context context13 = (Context) extracallbackwithresult.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback3);
                    obj = "appWidgetId";
                    i7 = i39;
                    displaySetting4 = displaySetting15;
                    context4 = context13;
                    iAuthTabCallback = iAuthTabCallback6;
                    account2 = account6;
                    i5 = i2;
                    fFloatValue = f3;
                    extracallbackwithresult3 = extracallbackwithresult8;
                    onextracallback = (onExtraCallback) objOnExtraCallback3;
                    if (onextracallback != null) {
                    }
                } catch (WebResourceResponseModel e54) {
                    webResourceResponseModel = e54;
                    r4 = iAuthTabCallback6;
                    displaySetting2 = displaySetting15;
                    iAuthTabCallback = r4;
                    i3 = i2;
                    obj = "appWidgetId";
                    obj2 = "function";
                    fFloatValue = f3;
                    Result.Companion companion222222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (Exception e55) {
                    exc = e55;
                    r42 = iAuthTabCallback6;
                    displaySetting2 = displaySetting15;
                    iAuthTabCallback = r42;
                    i3 = i2;
                    obj = "appWidgetId";
                    obj2 = "function";
                    fFloatValue = f3;
                    Result.Companion companion322222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                break;
            case 9.8E-45f:
                int i40 = extracallbackwithresult.I$2;
                i9 = extracallbackwithresult.I$1;
                f3 = extracallbackwithresult.F$0;
                i5 = extracallbackwithresult.I$0;
                onExtraCallback onextracallback6 = (onExtraCallback) extracallbackwithresult.L$5;
                account2 = (AccountSections.Account) extracallbackwithresult.L$4;
                extracallbackwithresult4 = (access13800) extracallbackwithresult.L$3;
                iAuthTabCallback = (IAuthTabCallback) extracallbackwithresult.L$2;
                displaySetting5 = (DisplaySetting) extracallbackwithresult.L$1;
                context5 = (Context) extracallbackwithresult.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback3);
                    obj = "appWidgetId";
                    obj2 = "function";
                    onextracallback2 = onextracallback6;
                    i7 = i40;
                    zBooleanValue = ((Boolean) objOnExtraCallback3).booleanValue();
                    q8a q8aVar22 = q8a.onNavigationEvent;
                    extracallbackwithresult.L$0 = context5;
                    extracallbackwithresult.L$1 = displaySetting5;
                    extracallbackwithresult.L$2 = iAuthTabCallback;
                    context6 = context5;
                    extracallbackwithresult.L$3 = access15400.onNavigationEvent(extracallbackwithresult4);
                    extracallbackwithresult.L$4 = account2;
                    extracallbackwithresult.L$5 = onextracallback2;
                    extracallbackwithresult.I$0 = i5;
                    extracallbackwithresult.F$0 = f3;
                    extracallbackwithresult.I$1 = i9;
                    extracallbackwithresult.I$2 = i7;
                    extracallbackwithresult.Z$0 = zBooleanValue;
                    extracallbackwithresult.label = 8;
                    objOnExtraCallbackWithResult = q8aVar22.onExtraCallbackWithResult(i5, (access13800<? super Boolean>) extracallbackwithresult);
                    if (objOnExtraCallbackWithResult != objOnWarmupCompleted2) {
                    }
                } catch (WebResourceResponseModel e56) {
                    webResourceResponseModel = e56;
                    r4 = iAuthTabCallback;
                    displaySetting2 = displaySetting5;
                    i2 = i5;
                    iAuthTabCallback = r4;
                    i3 = i2;
                    obj = "appWidgetId";
                    obj2 = "function";
                    fFloatValue = f3;
                    Result.Companion companion2222222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (Exception e57) {
                    exc = e57;
                    r42 = iAuthTabCallback;
                    displaySetting2 = displaySetting5;
                    i2 = i5;
                    iAuthTabCallback = r42;
                    i3 = i2;
                    obj = "appWidgetId";
                    obj2 = "function";
                    fFloatValue = f3;
                    Result.Companion companion3222222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                break;
            case 1.1E-44f:
                boolean z4 = extracallbackwithresult.Z$0;
                int i41 = extracallbackwithresult.I$2;
                i10 = extracallbackwithresult.I$1;
                fFloatValue = extracallbackwithresult.F$0;
                i5 = extracallbackwithresult.I$0;
                onExtraCallback onextracallback7 = (onExtraCallback) extracallbackwithresult.L$5;
                account2 = (AccountSections.Account) extracallbackwithresult.L$4;
                extracallbackwithresult4 = (access13800) extracallbackwithresult.L$3;
                iAuthTabCallback = (IAuthTabCallback) extracallbackwithresult.L$2;
                DisplaySetting displaySetting16 = (DisplaySetting) extracallbackwithresult.L$1;
                context7 = (Context) extracallbackwithresult.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback3);
                    obj = "appWidgetId";
                    obj2 = "function";
                    onextracallback3 = onextracallback7;
                    i7 = i41;
                    f = fFloatValue;
                    displaySetting5 = displaySetting16;
                    obj3 = objOnExtraCallback3;
                    zBooleanValue = z4;
                    bool = (Boolean) obj3;
                    if (bool == null) {
                    }
                } catch (WebResourceResponseModel e58) {
                    e = e58;
                    displaySetting4 = displaySetting16;
                    webResourceResponseModel2 = e;
                    obj = "appWidgetId";
                    obj2 = "function";
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    webResourceResponseModel = webResourceResponseModel2;
                    Result.Companion companion22222222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (Exception e59) {
                    e = e59;
                    displaySetting4 = displaySetting16;
                    exc2 = e;
                    obj = "appWidgetId";
                    obj2 = "function";
                    i3 = i5;
                    displaySetting2 = displaySetting4;
                    exc = exc2;
                    Result.Companion companion32222222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                break;
            case 1.3E-44f:
                boolean z5 = extracallbackwithresult.Z$0;
                int i42 = extracallbackwithresult.I$2;
                i10 = extracallbackwithresult.I$1;
                fFloatValue = extracallbackwithresult.F$0;
                i5 = extracallbackwithresult.I$0;
                onExtraCallback onextracallback8 = (onExtraCallback) extracallbackwithresult.L$5;
                account2 = (AccountSections.Account) extracallbackwithresult.L$4;
                extracallbackwithresult4 = (access13800) extracallbackwithresult.L$3;
                iAuthTabCallback = (IAuthTabCallback) extracallbackwithresult.L$2;
                DisplaySetting displaySetting17 = (DisplaySetting) extracallbackwithresult.L$1;
                context7 = (Context) extracallbackwithresult.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback3);
                    zBooleanValue = z5;
                    obj = "appWidgetId";
                    obj2 = "function";
                    onextracallback3 = onextracallback8;
                    i7 = i42;
                    obj4 = objOnWarmupCompleted2;
                    f = fFloatValue;
                    displaySetting5 = displaySetting17;
                    context8 = context7;
                    extracallbackwithresult5 = extracallbackwithresult4;
                    z = true;
                    i3 = i5;
                    displaySetting6 = displaySetting5;
                    account3 = account2;
                    f2 = f;
                    i11 = i7;
                    i12 = i10;
                    String strOnExtraCallback22 = onExtraCallback(this);
                    hiddenStockIAuthTabCallback = onextracallback3.IAuthTabCallback();
                    if (hiddenStockIAuthTabCallback != null) {
                    }
                    if (zAreEqual) {
                    }
                } catch (Exception e60) {
                    exc = e60;
                    obj = "appWidgetId";
                    obj2 = "function";
                    i3 = i5;
                    displaySetting2 = displaySetting17;
                    Result.Companion companion322222222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(exc));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                } catch (WebResourceResponseModel e61) {
                    webResourceResponseModel = e61;
                    obj = "appWidgetId";
                    obj2 = "function";
                    i3 = i5;
                    displaySetting2 = displaySetting17;
                    Result.Companion companion222222222222222222 = Result.Companion;
                    maintenance = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    r3 = Result.exceptionOrNull-impl(maintenance);
                    if (r3 != 0) {
                    }
                    return (OverviewSmallWidgetState) maintenance;
                }
                break;
            case 1.4E-44f:
                boolean z6 = extracallbackwithresult.Z$1;
                z3 = extracallbackwithresult.Z$0;
                f3 = extracallbackwithresult.F$0;
                i13 = extracallbackwithresult.I$0;
                currency = (Currency) extracallbackwithresult.L$7;
                String str4 = (String) extracallbackwithresult.L$6;
                onextracallback5 = (onExtraCallback) extracallbackwithresult.L$5;
                account5 = (AccountSections.Account) extracallbackwithresult.L$4;
                iAuthTabCallback3 = (IAuthTabCallback) extracallbackwithresult.L$2;
                displaySetting2 = (DisplaySetting) extracallbackwithresult.L$1;
                context9 = (Context) extracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback3);
                z2 = z6;
                obj = "appWidgetId";
                obj2 = "function";
                str3 = str4;
                List list2 = (List) objOnExtraCallback3;
                Triple tripleOnWarmupCompleted2 = onWarmupCompleted(this, context9, onextracallback5, z3, currency);
                maintenance2 = new OverviewSmallWidgetState.Success(displaySetting2, f3, account5.onWarmupCompleted(), new WidgetOverview.Overview((OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, (String) tripleOnWarmupCompleted2.onExtraCallbackWithResult(), (String) tripleOnWarmupCompleted2.IAuthTabCallback(), (checkDuration) tripleOnWarmupCompleted2.onExtraCallback(), onextracallback5.onWarmupCompleted(), (List) onExtraCallback.onExtraCallbackWithResult(new Object[]{onextracallback5}, -1481187999, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1481188000, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted()), onextracallback5.access100(), onextracallback5.getInterfaceDescriptor(), 7, (DefaultConstructorMarker) null), str3, list2 != null ? CollectionsKt.emptyList() : list2, currency, z3, z2, account5.asInterface(), !account5.onTransact().isChildAccount() ? HostnamesKt.PARENTS : HostnamesKt.SELF);
                iAuthTabCallback = iAuthTabCallback3;
                i3 = i13;
                fFloatValue = f3;
                maintenance = Result.constructor-impl(maintenance2);
                r3 = Result.exceptionOrNull-impl(maintenance);
                if (r3 != 0) {
                }
                return (OverviewSmallWidgetState) maintenance;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function1<access13800<? super Boolean>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = r4.this.new IAuthTabCallback_Parcel(access13800Var);
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                decodeIpv6 decodeipv6OnExtraCallbackWithResult = r4.onExtraCallbackWithResult(r4.this);
                this.label = 1;
                Object objOnExtraCallback = decodeipv6OnExtraCallbackWithResult.onExtraCallback(this);
                return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
            }
            int i3 = onWarmupCompleted + 111;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 89;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function1<access13800<? super Boolean>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = r4.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 87 / 0;
            }
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i2 % 128;
            access13800<? super Boolean> access13800Var = (access13800) obj;
            if (i2 % 2 != 0) {
                return onNavigationEvent(access13800Var);
            }
            onNavigationEvent(access13800Var);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                decodeIpv6 decodeipv6OnExtraCallbackWithResult = r4.onExtraCallbackWithResult(r4.this);
                this.label = 1;
                Object objOnWarmupCompleted2 = decodeipv6OnExtraCallbackWithResult.onWarmupCompleted(this);
                return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
            }
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                return obj;
            }
            throw null;
        }
    }

    static final class readTypedObject extends SuspendLambda implements Function1<access13800<? super AccountSections.Account>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        readTypedObject(int i, access13800<? super readTypedObject> access13800Var) {
            super(1, access13800Var);
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            readTypedObject readtypedobject = r4.this.new readTypedObject(this.$appWidgetId, access13800Var);
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 0 / 0;
            }
            return readtypedobject;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super AccountSections.Account> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            readTypedObject readtypedobjectCreate = create(access13800Var);
            if (i3 != 0) {
                return readtypedobjectCreate.invokeSuspend(Unit.INSTANCE);
            }
            readtypedobjectCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                r4 r4Var = r4.this;
                int i5 = this.$appWidgetId;
                this.label = 1;
                Object objOnExtraCallback = r4.onExtraCallback(r4Var, i5, (access13800) this);
                return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
            }
            int i6 = onExtraCallback + 79;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0 ? i4 != 1 : i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
    }

    static final class writeTypedObject extends SuspendLambda implements Function1<access13800<? super onExtraCallback>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ AccountSections.Account $account;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        writeTypedObject(AccountSections.Account account, access13800<? super writeTypedObject> access13800Var) {
            super(1, access13800Var);
            this.$account = account;
        }

        public final Object IAuthTabCallback(access13800<? super onExtraCallback> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            writeTypedObject writetypedobject = r4.this.new writeTypedObject(this.$account, access13800Var);
            int i2 = onWarmupCompleted + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return writetypedobject;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((access13800) obj);
            int i4 = onWarmupCompleted + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallback + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r4 r4Var = r4.this;
            AccountSections.Account account = this.$account;
            this.label = 1;
            Object objOnExtraCallback = r4.onExtraCallback(r4Var, account, false, this, 2, null);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                return objOnExtraCallback;
            }
            int i5 = onWarmupCompleted + 103;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    static final class extraCallback extends SuspendLambda implements Function1<access13800<? super Boolean>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        extraCallback(access13800<? super extraCallback> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            extraCallback extracallback = r4.this.new extraCallback(access13800Var);
            int i2 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return extracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r4 r4Var = r4.this;
            this.label = 1;
            Object objOnWarmupCompleted2 = r4.onWarmupCompleted(r4Var, (access13800) this);
            if (objOnWarmupCompleted2 == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            int i5 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objOnWarmupCompleted2;
        }
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function1<access13800<? super r2ExternalSyntheticLambda2>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        ICustomTabsCallback(access13800<? super ICustomTabsCallback> access13800Var) {
            super(1, access13800Var);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            ICustomTabsCallback iCustomTabsCallback = r4.this.new ICustomTabsCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iCustomTabsCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(access13800<? super r2ExternalSyntheticLambda2> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r4 r4Var = r4.this;
            this.label = 1;
            Object objOnExtraCallback = r4.onExtraCallback(r4Var, this);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                return objOnExtraCallback;
            }
            int i7 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return objOnWarmupCompleted;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:164|473|165|166|451|222|223|454|224|225|513|226|(4:228|489|229|(13:231|232|(2:234|235)(1:237)|238|469|239|240|503|287|430|(0)|439|440))(1:249)|250|251|514|252|253|(20:256|509|257|(1:259)(1:260)|261|(6:264|(1:266)(1:267)|(1:269)(1:270)|(3:519|272|522)(1:521)|520|262)|518|273|(5:276|277|(3:524|279|527)(1:526)|525|274)|523|280|(2:282|283)(1:284)|285|286|503|287|430|(0)|439|440)|338|529) */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x09d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x09d4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0362: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:85:0x035c */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0372: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:90:0x036c */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0363: MOVE (r15 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:85:0x035c */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0373: MOVE (r15 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:90:0x036c */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0402 A[Catch: CancellationException -> 0x0367, Exception -> 0x0add, WebResourceResponseModel -> 0x0af6, TryCatch #14 {CancellationException -> 0x0367, blocks: (B:18:0x008f, B:25:0x00e6, B:32:0x0134, B:35:0x0184, B:38:0x01ce, B:47:0x022b, B:56:0x0279, B:142:0x0546, B:63:0x02bf, B:135:0x050e, B:137:0x0512, B:139:0x0517, B:66:0x02e1, B:130:0x04de, B:132:0x04e5, B:73:0x031a, B:114:0x046b, B:116:0x0473, B:117:0x0485, B:118:0x048a, B:82:0x0356, B:109:0x0439, B:111:0x0441, B:127:0x04b5, B:102:0x03f6, B:104:0x0402, B:106:0x040a), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0473 A[Catch: CancellationException -> 0x0367, Exception -> 0x048b, WebResourceResponseModel -> 0x0496, TryCatch #14 {CancellationException -> 0x0367, blocks: (B:18:0x008f, B:25:0x00e6, B:32:0x0134, B:35:0x0184, B:38:0x01ce, B:47:0x022b, B:56:0x0279, B:142:0x0546, B:63:0x02bf, B:135:0x050e, B:137:0x0512, B:139:0x0517, B:66:0x02e1, B:130:0x04de, B:132:0x04e5, B:73:0x031a, B:114:0x046b, B:116:0x0473, B:117:0x0485, B:118:0x048a, B:82:0x0356, B:109:0x0439, B:111:0x0441, B:127:0x04b5, B:102:0x03f6, B:104:0x0402, B:106:0x040a), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0485 A[Catch: CancellationException -> 0x0367, Exception -> 0x048b, WebResourceResponseModel -> 0x0496, TryCatch #14 {CancellationException -> 0x0367, blocks: (B:18:0x008f, B:25:0x00e6, B:32:0x0134, B:35:0x0184, B:38:0x01ce, B:47:0x022b, B:56:0x0279, B:142:0x0546, B:63:0x02bf, B:135:0x050e, B:137:0x0512, B:139:0x0517, B:66:0x02e1, B:130:0x04de, B:132:0x04e5, B:73:0x031a, B:114:0x046b, B:116:0x0473, B:117:0x0485, B:118:0x048a, B:82:0x0356, B:109:0x0439, B:111:0x0441, B:127:0x04b5, B:102:0x03f6, B:104:0x0402, B:106:0x040a), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04b5 A[Catch: CancellationException -> 0x0367, Exception -> 0x0aa9, WebResourceResponseModel -> 0x0ab5, TRY_ENTER, TRY_LEAVE, TryCatch #14 {CancellationException -> 0x0367, blocks: (B:18:0x008f, B:25:0x00e6, B:32:0x0134, B:35:0x0184, B:38:0x01ce, B:47:0x022b, B:56:0x0279, B:142:0x0546, B:63:0x02bf, B:135:0x050e, B:137:0x0512, B:139:0x0517, B:66:0x02e1, B:130:0x04de, B:132:0x04e5, B:73:0x031a, B:114:0x046b, B:116:0x0473, B:117:0x0485, B:118:0x048a, B:82:0x0356, B:109:0x0439, B:111:0x0441, B:127:0x04b5, B:102:0x03f6, B:104:0x0402, B:106:0x040a), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0512 A[Catch: CancellationException -> 0x0367, Exception -> 0x0a85, WebResourceResponseModel -> 0x0a88, TRY_LEAVE, TryCatch #14 {CancellationException -> 0x0367, blocks: (B:18:0x008f, B:25:0x00e6, B:32:0x0134, B:35:0x0184, B:38:0x01ce, B:47:0x022b, B:56:0x0279, B:142:0x0546, B:63:0x02bf, B:135:0x050e, B:137:0x0512, B:139:0x0517, B:66:0x02e1, B:130:0x04de, B:132:0x04e5, B:73:0x031a, B:114:0x046b, B:116:0x0473, B:117:0x0485, B:118:0x048a, B:82:0x0356, B:109:0x0439, B:111:0x0441, B:127:0x04b5, B:102:0x03f6, B:104:0x0402, B:106:0x040a), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0756 A[Catch: CancellationException -> 0x06a2, Exception -> 0x0a08, WebResourceResponseModel -> 0x0a14, TRY_ENTER, TRY_LEAVE, TryCatch #47 {CancellationException -> 0x06a2, blocks: (B:222:0x07a7, B:207:0x072b, B:209:0x072f, B:215:0x0756, B:217:0x0760, B:165:0x065d, B:158:0x061c, B:160:0x062c, B:149:0x05b4, B:151:0x05b8, B:153:0x05e4, B:197:0x06cd, B:199:0x06d7, B:201:0x06db, B:143:0x0551, B:145:0x0581), top: B:445:0x0551 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x08ce A[Catch: Exception -> 0x09c3, CancellationException -> 0x09c9, WebResourceResponseModel -> 0x09cc, TryCatch #38 {CancellationException -> 0x09c9, blocks: (B:257:0x089e, B:261:0x08b5, B:262:0x08c8, B:264:0x08ce, B:266:0x08d8, B:269:0x08de, B:272:0x08e6, B:273:0x08ea, B:274:0x090f, B:277:0x091f, B:279:0x092b, B:280:0x092f, B:283:0x0992, B:285:0x0997, B:287:0x09b4, B:284:0x0995, B:224:0x07b1, B:226:0x07bd, B:229:0x07c9, B:231:0x07db, B:235:0x07f9, B:239:0x0800, B:237:0x07fc, B:250:0x083a, B:252:0x086a, B:379:0x0a79, B:380:0x0a80, B:412:0x0ac7, B:413:0x0acc, B:414:0x0acd, B:415:0x0ad8), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0995 A[Catch: Exception -> 0x09c3, CancellationException -> 0x09c9, WebResourceResponseModel -> 0x09cc, TryCatch #38 {CancellationException -> 0x09c9, blocks: (B:257:0x089e, B:261:0x08b5, B:262:0x08c8, B:264:0x08ce, B:266:0x08d8, B:269:0x08de, B:272:0x08e6, B:273:0x08ea, B:274:0x090f, B:277:0x091f, B:279:0x092b, B:280:0x092f, B:283:0x0992, B:285:0x0997, B:287:0x09b4, B:284:0x0995, B:224:0x07b1, B:226:0x07bd, B:229:0x07c9, B:231:0x07db, B:235:0x07f9, B:239:0x0800, B:237:0x07fc, B:250:0x083a, B:252:0x086a, B:379:0x0a79, B:380:0x0a80, B:412:0x0ac7, B:413:0x0acc, B:414:0x0acd, B:415:0x0ad8), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0acd A[Catch: CancellationException -> 0x09c9, Exception -> 0x0ad9, WebResourceResponseModel -> 0x0adb, TryCatch #38 {CancellationException -> 0x09c9, blocks: (B:257:0x089e, B:261:0x08b5, B:262:0x08c8, B:264:0x08ce, B:266:0x08d8, B:269:0x08de, B:272:0x08e6, B:273:0x08ea, B:274:0x090f, B:277:0x091f, B:279:0x092b, B:280:0x092f, B:283:0x0992, B:285:0x0997, B:287:0x09b4, B:284:0x0995, B:224:0x07b1, B:226:0x07bd, B:229:0x07c9, B:231:0x07db, B:235:0x07f9, B:239:0x0800, B:237:0x07fc, B:250:0x083a, B:252:0x086a, B:379:0x0a79, B:380:0x0a80, B:412:0x0ac7, B:413:0x0acc, B:414:0x0acd, B:415:0x0ad8), top: B:444:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0441 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x05b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x072f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v75, types: [float] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull Context context, int i, @NotNull access13800<? super OverviewMediumWidgetState> access13800Var) throws Throwable {
        access13800<? super DisplaySetting> getinterfacedescriptor;
        IAuthTabCallback iAuthTabCallback;
        Exception exc;
        int i2;
        Object obj;
        Object obj2;
        IAuthTabCallback iAuthTabCallback2;
        IAuthTabCallback iAuthTabCallback3;
        DisplaySetting displaySetting;
        DisplaySetting displaySetting2;
        WebResourceResponseModel webResourceResponseModel;
        IAuthTabCallback iAuthTabCallback4;
        DisplaySetting displaySetting3;
        IAuthTabCallback iAuthTabCallback5;
        float f;
        Exception exc2;
        DisplaySetting displaySetting4;
        int i3;
        float f2;
        WebResourceResponseModel webResourceResponseModel2;
        DisplaySetting displaySetting5;
        float f3;
        float f4;
        float f5;
        Object obj3;
        float f6;
        float f7;
        Object maintenance;
        DisplaySetting displaySetting6;
        float f8;
        float f9;
        float f10;
        Throwable th;
        Context context2;
        Object objOnWarmupCompleted;
        int i4;
        Object objIAuthTabCallback;
        Context context3;
        DisplaySetting displaySetting7;
        DisplaySetting displaySetting8;
        IAuthTabCallback iAuthTabCallback6;
        access13800<? super DisplaySetting> access13800Var2;
        int i5;
        int i6;
        float f11;
        int i7;
        int i8;
        DisplaySetting displaySetting9;
        int i9;
        Object obj4;
        int i10;
        DisplaySetting displaySetting10;
        float f12;
        OverviewMediumWidgetState maintenance2;
        float f13;
        IAuthTabCallback iAuthTabCallback7;
        DisplaySetting displaySetting11;
        IAuthTabCallback iAuthTabCallback8;
        float f14;
        AccountSections.Account account;
        Object objOnExtraCallback;
        AccountSections.Account account2;
        int i11;
        float f15;
        float f16;
        float f17;
        onExtraCallback onextracallback;
        Object objOnExtraCallback2;
        AccountSections.Account account3;
        int i12;
        int i13;
        Context context4;
        float f18;
        float f19;
        float f20;
        int i14;
        int i15;
        boolean zBooleanValue;
        String string;
        Context context5;
        Object objOnExtraCallback3;
        access13800<? super DisplaySetting> access13800Var3;
        String str;
        Object obj5;
        Context context6;
        float f21;
        int i16;
        IAuthTabCallback iAuthTabCallback9;
        int i17;
        Exception exc3;
        WebResourceResponseModel webResourceResponseModel3;
        Boolean bool;
        Object obj6;
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback10;
        String str2;
        Object obj7;
        Boolean bool2;
        IAuthTabCallback iAuthTabCallback11;
        onExtraCallback onextracallback2;
        AccountSections.Account account4;
        Object obj8;
        q8a q8aVar;
        Context context7;
        float f22;
        IAuthTabCallback iAuthTabCallback12;
        int i18;
        int i19;
        Object obj9;
        Context context8;
        Object obj10;
        onExtraCallback onextracallback3;
        Boolean bool3;
        String str3;
        AccountSections.Account account5;
        Object obj11;
        float f23;
        WebResourceResponseModel webResourceResponseModel4;
        IAuthTabCallback iAuthTabCallback13;
        Exception exc4;
        IAuthTabCallback iAuthTabCallback14;
        Object objOnNavigationEvent;
        Context context9;
        boolean z;
        float f24;
        Boolean bool4;
        float f25;
        Context context10;
        onExtraCallback onextracallback4;
        int i20;
        boolean z2;
        access13800<? super DisplaySetting> access13800Var4;
        int i21;
        boolean zBooleanValue2;
        IAuthTabCallback iAuthTabCallback15;
        float f26;
        float f27;
        Exception exc5;
        WebResourceResponseModel webResourceResponseModel5;
        Boolean bool5;
        Object obj12;
        Context context11;
        onExtraCallback onextracallback5;
        float f28;
        float f29;
        WebResourceResponseModel webResourceResponseModel6;
        Exception exc6;
        Currency currencyIAuthTabCallbackStub;
        r4 r4Var;
        Currency currencyOnExtraCallback;
        String strOnExtraCallback;
        int i22;
        r2ExternalSyntheticLambda1 r2externalsyntheticlambda1OnNavigationEvent;
        OverviewAccounts.Overview.HiddenStock hiddenStockIAuthTabCallback;
        Currency currency;
        r2ExternalSyntheticLambda1 r2externalsyntheticlambda1;
        Currency currency2;
        boolean z3;
        Object objOnExtraCallback4;
        Context context12;
        String str4;
        r2ExternalSyntheticLambda1 r2externalsyntheticlambda12;
        boolean z4;
        onExtraCallback onextracallback6;
        Currency currency3;
        AccountSections.Account account6;
        Boolean boolOnExtraCallbackWithResult;
        HostnamesKt hostnamesKt;
        float f30;
        float f31;
        float f32;
        Iterator it;
        HostnamesKt hostnamesKt2;
        int i23 = i;
        int i24 = 2 % 2;
        int i25 = access100 + 3;
        ?? r7 = i25 % 128;
        ICustomTabsCallback = r7;
        if (i25 % 2 == 0) {
            boolean z5 = access13800Var instanceof getInterfaceDescriptor;
            Object obj13 = null;
            obj13.hashCode();
            throw null;
        }
        if (access13800Var instanceof getInterfaceDescriptor) {
            getinterfacedescriptor = (getInterfaceDescriptor) access13800Var;
            int i26 = getinterfacedescriptor.label;
            if ((i26 & Integer.MIN_VALUE) != 0) {
                int i27 = access100 + 107;
                ICustomTabsCallback = i27 % 128;
                if (i27 % 2 == 0) {
                    getinterfacedescriptor.label = i26 / Integer.MIN_VALUE;
                } else {
                    getinterfacedescriptor.label = i26 - 2147483648;
                }
            } else {
                getinterfacedescriptor = new getInterfaceDescriptor(access13800Var);
            }
        }
        Object objOnExtraCallback5 = getinterfacedescriptor.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i28 = getinterfacedescriptor.label;
        try {
            try {
                try {
                    try {
                    } catch (CancellationException e) {
                        e = e;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                }
            } catch (WebResourceResponseModel e3) {
                webResourceResponseModel = e3;
                i2 = i28;
                obj = "appWidgetId";
                obj2 = "function";
                iAuthTabCallback3 = iAuthTabCallback4;
                displaySetting2 = displaySetting3;
                f4 = r7;
            } catch (Exception e4) {
                exc = e4;
                i2 = i28;
                obj = "appWidgetId";
                obj2 = "function";
                iAuthTabCallback3 = iAuthTabCallback2;
                displaySetting2 = displaySetting;
                f3 = r7;
            }
        } catch (WebResourceResponseModel e5) {
            e = e5;
            iAuthTabCallback = i;
        } catch (Exception e6) {
            e = e6;
            iAuthTabCallback = i;
        }
        switch (i28) {
            case 0:
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                context2 = context;
                getinterfacedescriptor.L$0 = context2;
                getinterfacedescriptor.I$0 = i23;
                getinterfacedescriptor.label = 1;
                objOnWarmupCompleted = onWarmupCompleted(i23, getinterfacedescriptor);
                if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                    DisplaySetting displaySetting12 = (DisplaySetting) objOnWarmupCompleted;
                    getinterfacedescriptor.L$0 = context2;
                    getinterfacedescriptor.L$1 = displaySetting12;
                    getinterfacedescriptor.I$0 = i23;
                    i4 = 2;
                    getinterfacedescriptor.label = 2;
                    objIAuthTabCallback = IAuthTabCallback(i23, (access13800<? super Float>) getinterfacedescriptor);
                    if (objIAuthTabCallback != objOnWarmupCompleted2) {
                        int i29 = access100 + 21;
                        ICustomTabsCallback = i29 % 128;
                        int i30 = i29 % 2;
                        context3 = context2;
                        objOnExtraCallback5 = objIAuthTabCallback;
                        i28 = i23;
                        displaySetting7 = displaySetting12;
                        float fFloatValue = ((Number) objOnExtraCallback5).floatValue();
                        q8a q8aVar2 = q8a.onNavigationEvent;
                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "OverviewRepository.loadOverviewMediumData");
                        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i28));
                        Pair[] pairArr = new Pair[i4];
                        pairArr[0] = pairIAuthTabCallback;
                        pairArr[1] = pairIAuthTabCallback2;
                        q8aVar2.onExtraCallbackWithResult(access8100.onWarmupCompleted(pairArr));
                        IAuthTabCallback iAuthTabCallback16 = new IAuthTabCallback();
                        try {
                            Result.Companion companion = Result.Companion;
                        } catch (Exception e7) {
                            e = e7;
                            getinterfacedescriptor = i28;
                            obj = "appWidgetId";
                            obj2 = "function";
                        } catch (WebResourceResponseModel e8) {
                            e = e8;
                            getinterfacedescriptor = i28;
                            obj = "appWidgetId";
                            obj2 = "function";
                        }
                        try {
                        } catch (Exception e9) {
                            e = e9;
                            displaySetting2 = displaySetting7;
                            f5 = fFloatValue;
                            iAuthTabCallback3 = iAuthTabCallback16;
                            i2 = getinterfacedescriptor;
                            exc = e;
                            Result.Companion companion2 = Result.Companion;
                            obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                            f7 = f5;
                            i3 = i2;
                            maintenance = obj3;
                            displaySetting6 = displaySetting2;
                            f10 = f7;
                            th = Result.exceptionOrNull-impl(maintenance);
                            if (th != 0) {
                            }
                            return (OverviewMediumWidgetState) maintenance;
                        } catch (WebResourceResponseModel e10) {
                            e = e10;
                            displaySetting2 = displaySetting7;
                            f8 = fFloatValue;
                            iAuthTabCallback3 = iAuthTabCallback16;
                            i2 = getinterfacedescriptor;
                            webResourceResponseModel = e;
                            Result.Companion companion3 = Result.Companion;
                            obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                            f7 = f8;
                            i3 = i2;
                            maintenance = obj3;
                            displaySetting6 = displaySetting2;
                            f10 = f7;
                            th = Result.exceptionOrNull-impl(maintenance);
                            if (th != 0) {
                            }
                            return (OverviewMediumWidgetState) maintenance;
                        }
                        if (onWarmupCompleted(this).IAuthTabCallback()) {
                            throw new OverviewMediumWidgetState.NotTradeableUser(displaySetting7, fFloatValue);
                        }
                        if (!onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback()) {
                            throw new OverviewMediumWidgetState.NetworkError(displaySetting7, fFloatValue);
                        }
                        IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(null);
                        getinterfacedescriptor.L$0 = context3;
                        getinterfacedescriptor.L$1 = displaySetting7;
                        getinterfacedescriptor.L$2 = iAuthTabCallback16;
                        getinterfacedescriptor.L$3 = access15400.onNavigationEvent(getinterfacedescriptor);
                        getinterfacedescriptor.I$0 = i28;
                        getinterfacedescriptor.F$0 = fFloatValue;
                        getinterfacedescriptor.I$1 = 0;
                        getinterfacedescriptor.I$2 = 0;
                        getinterfacedescriptor.label = 3;
                        Object objOnExtraCallback6 = iAuthTabCallback16.onExtraCallback("syncCanTrading", iAuthTabCallback_Parcel, getinterfacedescriptor);
                        if (objOnExtraCallback6 != objOnWarmupCompleted2) {
                            displaySetting8 = displaySetting7;
                            iAuthTabCallback6 = iAuthTabCallback16;
                            access13800Var2 = getinterfacedescriptor;
                            i5 = 0;
                            i6 = 0;
                            f11 = fFloatValue;
                            objOnExtraCallback5 = objOnExtraCallback6;
                            try {
                            } catch (Exception e11) {
                                i8 = i28;
                                obj = "appWidgetId";
                                obj2 = "function";
                                exc = e11;
                            } catch (WebResourceResponseModel e12) {
                                i7 = i28;
                                obj = "appWidgetId";
                                obj2 = "function";
                                webResourceResponseModel = e12;
                            }
                            if (((Boolean) objOnExtraCallback5).booleanValue()) {
                                try {
                                    IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(null);
                                    getinterfacedescriptor.L$0 = access15400.onNavigationEvent(context3);
                                    getinterfacedescriptor.L$1 = displaySetting8;
                                    getinterfacedescriptor.L$2 = iAuthTabCallback6;
                                    getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var2);
                                    getinterfacedescriptor.I$0 = i28;
                                    getinterfacedescriptor.F$0 = f11;
                                    getinterfacedescriptor.I$1 = i6;
                                    getinterfacedescriptor.I$2 = i5;
                                    getinterfacedescriptor.label = 4;
                                    objOnExtraCallback5 = iAuthTabCallback6.onExtraCallback("isInMaintenance", iAuthTabCallbackStubProxy, getinterfacedescriptor);
                                } catch (WebResourceResponseModel e13) {
                                    webResourceResponseModel = e13;
                                    i7 = i28;
                                    obj = "appWidgetId";
                                    obj2 = "function";
                                    i2 = i7;
                                    iAuthTabCallback3 = iAuthTabCallback6;
                                    displaySetting2 = displaySetting8;
                                    f8 = f11;
                                    Result.Companion companion32 = Result.Companion;
                                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                    f7 = f8;
                                    i3 = i2;
                                    maintenance = obj3;
                                    displaySetting6 = displaySetting2;
                                    f10 = f7;
                                    th = Result.exceptionOrNull-impl(maintenance);
                                    if (th != 0) {
                                    }
                                    return (OverviewMediumWidgetState) maintenance;
                                } catch (Exception e14) {
                                    exc = e14;
                                    i8 = i28;
                                    obj = "appWidgetId";
                                    obj2 = "function";
                                    i2 = i8;
                                    iAuthTabCallback3 = iAuthTabCallback6;
                                    displaySetting2 = displaySetting8;
                                    f5 = f11;
                                    Result.Companion companion22 = Result.Companion;
                                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                    f7 = f5;
                                    i3 = i2;
                                    maintenance = obj3;
                                    displaySetting6 = displaySetting2;
                                    f10 = f7;
                                    th = Result.exceptionOrNull-impl(maintenance);
                                    if (th != 0) {
                                    }
                                    return (OverviewMediumWidgetState) maintenance;
                                }
                                if (objOnExtraCallback5 != objOnWarmupCompleted2) {
                                    displaySetting9 = displaySetting8;
                                    f12 = f11;
                                    try {
                                    } catch (Exception e15) {
                                        exc = e15;
                                        displaySetting2 = displaySetting9;
                                        i2 = i28;
                                        obj = "appWidgetId";
                                        obj2 = "function";
                                        iAuthTabCallback3 = iAuthTabCallback6;
                                        f3 = f12;
                                        f5 = f3;
                                        Result.Companion companion222 = Result.Companion;
                                        obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                        f7 = f5;
                                        i3 = i2;
                                        maintenance = obj3;
                                        displaySetting6 = displaySetting2;
                                        f10 = f7;
                                        th = Result.exceptionOrNull-impl(maintenance);
                                        if (th != 0) {
                                        }
                                        return (OverviewMediumWidgetState) maintenance;
                                    } catch (WebResourceResponseModel e16) {
                                        webResourceResponseModel = e16;
                                        displaySetting2 = displaySetting9;
                                        i2 = i28;
                                        obj = "appWidgetId";
                                        obj2 = "function";
                                        iAuthTabCallback3 = iAuthTabCallback6;
                                        f4 = f12;
                                        f8 = f4;
                                        Result.Companion companion322 = Result.Companion;
                                        obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                        f7 = f8;
                                        i3 = i2;
                                        maintenance = obj3;
                                        displaySetting6 = displaySetting2;
                                        f10 = f7;
                                        th = Result.exceptionOrNull-impl(maintenance);
                                        if (th != 0) {
                                        }
                                        return (OverviewMediumWidgetState) maintenance;
                                    }
                                    if (((Boolean) objOnExtraCallback5).booleanValue()) {
                                        throw new OverviewMediumWidgetState.NotTradeableUser(displaySetting9, f12);
                                    }
                                    DisplaySetting displaySetting13 = null;
                                    maintenance2 = new OverviewMediumWidgetState.Maintenance(displaySetting13, 0.0f, 3, (DefaultConstructorMarker) displaySetting13);
                                    i3 = i28;
                                    obj = "appWidgetId";
                                    obj2 = "function";
                                    displaySetting6 = displaySetting9;
                                    iAuthTabCallback3 = iAuthTabCallback6;
                                    f30 = f12;
                                    try {
                                        maintenance = Result.constructor-impl(maintenance2);
                                        f10 = f30;
                                    } catch (WebResourceResponseModel e17) {
                                        webResourceResponseModel = e17;
                                        displaySetting2 = displaySetting6;
                                        f9 = f30;
                                        i2 = i3;
                                        f8 = f9;
                                        Result.Companion companion3222 = Result.Companion;
                                        obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                        f7 = f8;
                                        i3 = i2;
                                        maintenance = obj3;
                                        displaySetting6 = displaySetting2;
                                        f10 = f7;
                                        th = Result.exceptionOrNull-impl(maintenance);
                                        if (th != 0) {
                                        }
                                        return (OverviewMediumWidgetState) maintenance;
                                    } catch (Exception e18) {
                                        exc = e18;
                                        displaySetting2 = displaySetting6;
                                        f6 = f30;
                                        i2 = i3;
                                        f5 = f6;
                                        Result.Companion companion2222 = Result.Companion;
                                        obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                        f7 = f5;
                                        i3 = i2;
                                        maintenance = obj3;
                                        displaySetting6 = displaySetting2;
                                        f10 = f7;
                                        th = Result.exceptionOrNull-impl(maintenance);
                                        if (th != 0) {
                                        }
                                        return (OverviewMediumWidgetState) maintenance;
                                    }
                                    th = Result.exceptionOrNull-impl(maintenance);
                                    if (th != 0) {
                                        q8a.onNavigationEvent.onNavigationEvent(th, access8100.onWarmupCompleted(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj2, "OverviewRepo.loadOverviewMediumData onFailure"), getWrite.IAuthTabCallback(obj, access14000.onNavigationEvent(i3))}), iAuthTabCallback3.onWarmupCompleted()));
                                        maintenance = (th instanceof OverviewMediumWidgetState) ^ true ? setCustomerUserId.onExtraCallbackWithResult(th) ? new OverviewMediumWidgetState.Maintenance(displaySetting6, f10) : new OverviewMediumWidgetState.Error(displaySetting6, f10, th.getMessage()) : (OverviewMediumWidgetState) th;
                                    }
                                    return (OverviewMediumWidgetState) maintenance;
                                }
                            } else {
                                readTypedObject readtypedobject = new readTypedObject(i28, null);
                                getinterfacedescriptor.L$0 = context3;
                                getinterfacedescriptor.L$1 = displaySetting8;
                                getinterfacedescriptor.L$2 = iAuthTabCallback6;
                                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var2);
                                getinterfacedescriptor.I$0 = i28;
                                getinterfacedescriptor.F$0 = f11;
                                getinterfacedescriptor.I$1 = i6;
                                getinterfacedescriptor.I$2 = i5;
                                getinterfacedescriptor.label = 5;
                                Object objOnExtraCallback7 = iAuthTabCallback6.onExtraCallback("getAccount", readtypedobject, getinterfacedescriptor);
                                if (objOnExtraCallback7 != objOnWarmupCompleted2) {
                                    i9 = i6;
                                    obj4 = objOnExtraCallback7;
                                    i10 = i5;
                                    displaySetting10 = displaySetting8;
                                    f14 = f11;
                                    try {
                                        account = (AccountSections.Account) obj4;
                                        obj = "appWidgetId";
                                        try {
                                            writeTypedObject writetypedobject = new writeTypedObject(account, null);
                                            getinterfacedescriptor.L$0 = context3;
                                            getinterfacedescriptor.L$1 = displaySetting10;
                                            getinterfacedescriptor.L$2 = iAuthTabCallback6;
                                            getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var2);
                                            getinterfacedescriptor.L$4 = account;
                                            getinterfacedescriptor.I$0 = i28;
                                            getinterfacedescriptor.F$0 = f14;
                                            getinterfacedescriptor.I$1 = i9;
                                            getinterfacedescriptor.I$2 = i10;
                                            getinterfacedescriptor.label = 6;
                                            objOnExtraCallback = iAuthTabCallback6.onExtraCallback("getOverview", writetypedobject, getinterfacedescriptor);
                                        } catch (WebResourceResponseModel e19) {
                                            e = e19;
                                            i2 = i28;
                                            f16 = f14;
                                            obj2 = "function";
                                            f17 = f16;
                                            webResourceResponseModel = e;
                                            displaySetting2 = displaySetting10;
                                            f18 = f17;
                                            iAuthTabCallback3 = iAuthTabCallback6;
                                            f8 = f18;
                                            Result.Companion companion32222 = Result.Companion;
                                            obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                            f7 = f8;
                                            i3 = i2;
                                            maintenance = obj3;
                                            displaySetting6 = displaySetting2;
                                            f10 = f7;
                                            th = Result.exceptionOrNull-impl(maintenance);
                                            if (th != 0) {
                                            }
                                            return (OverviewMediumWidgetState) maintenance;
                                        } catch (Exception e20) {
                                            e = e20;
                                            i2 = i28;
                                            f15 = f14;
                                            obj2 = "function";
                                            f17 = f15;
                                            exc = e;
                                            displaySetting2 = displaySetting10;
                                            f19 = f17;
                                            iAuthTabCallback3 = iAuthTabCallback6;
                                            f5 = f19;
                                            Result.Companion companion22222 = Result.Companion;
                                            obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                            f7 = f5;
                                            i3 = i2;
                                            maintenance = obj3;
                                            displaySetting6 = displaySetting2;
                                            f10 = f7;
                                            th = Result.exceptionOrNull-impl(maintenance);
                                            if (th != 0) {
                                            }
                                            return (OverviewMediumWidgetState) maintenance;
                                        }
                                    } catch (Exception e21) {
                                        e = e21;
                                        i2 = i28;
                                        obj = "appWidgetId";
                                        f15 = f14;
                                    } catch (WebResourceResponseModel e22) {
                                        e = e22;
                                        i2 = i28;
                                        obj = "appWidgetId";
                                        f16 = f14;
                                    }
                                    if (objOnExtraCallback != objOnWarmupCompleted2) {
                                        int i31 = i9;
                                        account2 = account;
                                        i11 = i31;
                                        f17 = f14;
                                        try {
                                            onextracallback = (onExtraCallback) objOnExtraCallback;
                                        } catch (WebResourceResponseModel e23) {
                                            e = e23;
                                            i2 = i28;
                                            f16 = f17;
                                            obj2 = "function";
                                            f17 = f16;
                                            webResourceResponseModel = e;
                                            displaySetting2 = displaySetting10;
                                            f18 = f17;
                                            iAuthTabCallback3 = iAuthTabCallback6;
                                            f8 = f18;
                                            Result.Companion companion322222 = Result.Companion;
                                            obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                            f7 = f8;
                                            i3 = i2;
                                            maintenance = obj3;
                                            displaySetting6 = displaySetting2;
                                            f10 = f7;
                                            th = Result.exceptionOrNull-impl(maintenance);
                                            if (th != 0) {
                                            }
                                            return (OverviewMediumWidgetState) maintenance;
                                        } catch (Exception e24) {
                                            e = e24;
                                            i2 = i28;
                                            f15 = f17;
                                            obj2 = "function";
                                            f17 = f15;
                                            exc = e;
                                            displaySetting2 = displaySetting10;
                                            f19 = f17;
                                            iAuthTabCallback3 = iAuthTabCallback6;
                                            f5 = f19;
                                            Result.Companion companion222222 = Result.Companion;
                                            obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                            f7 = f5;
                                            i3 = i2;
                                            maintenance = obj3;
                                            displaySetting6 = displaySetting2;
                                            f10 = f7;
                                            th = Result.exceptionOrNull-impl(maintenance);
                                            if (th != 0) {
                                            }
                                            return (OverviewMediumWidgetState) maintenance;
                                        }
                                        if (onextracallback != null) {
                                            i2 = i28;
                                            obj2 = "function";
                                            try {
                                                throw new OverviewMediumWidgetState.Error(displaySetting10, f17, "overview is null");
                                            } catch (WebResourceResponseModel e25) {
                                                e = e25;
                                                webResourceResponseModel = e;
                                                displaySetting2 = displaySetting10;
                                                f18 = f17;
                                                iAuthTabCallback3 = iAuthTabCallback6;
                                                f8 = f18;
                                                Result.Companion companion3222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                f7 = f8;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            } catch (Exception e26) {
                                                e = e26;
                                                exc = e;
                                                displaySetting2 = displaySetting10;
                                                f19 = f17;
                                                iAuthTabCallback3 = iAuthTabCallback6;
                                                f5 = f19;
                                                Result.Companion companion2222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                f7 = f5;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            }
                                        }
                                        obj2 = "function";
                                        try {
                                            extraCallback extracallback = new extraCallback(null);
                                            getinterfacedescriptor.L$0 = context3;
                                            getinterfacedescriptor.L$1 = displaySetting10;
                                            getinterfacedescriptor.L$2 = iAuthTabCallback6;
                                            getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var2);
                                            getinterfacedescriptor.L$4 = account2;
                                            getinterfacedescriptor.L$5 = onextracallback;
                                            getinterfacedescriptor.I$0 = i28;
                                            getinterfacedescriptor.F$0 = f17;
                                            getinterfacedescriptor.I$1 = i11;
                                            getinterfacedescriptor.I$2 = i10;
                                            getinterfacedescriptor.label = 7;
                                            objOnExtraCallback2 = iAuthTabCallback6.onExtraCallback("getIncludeExpense", extracallback, getinterfacedescriptor);
                                        } catch (Exception e27) {
                                            e = e27;
                                            i2 = i28;
                                            f17 = f17;
                                            exc = e;
                                            displaySetting2 = displaySetting10;
                                            f19 = f17;
                                            iAuthTabCallback3 = iAuthTabCallback6;
                                            f5 = f19;
                                            Result.Companion companion22222222 = Result.Companion;
                                            obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                            f7 = f5;
                                            i3 = i2;
                                            maintenance = obj3;
                                            displaySetting6 = displaySetting2;
                                            f10 = f7;
                                            th = Result.exceptionOrNull-impl(maintenance);
                                            if (th != 0) {
                                            }
                                            return (OverviewMediumWidgetState) maintenance;
                                        } catch (WebResourceResponseModel e28) {
                                            e = e28;
                                            i2 = i28;
                                            f17 = f17;
                                            webResourceResponseModel = e;
                                            displaySetting2 = displaySetting10;
                                            f18 = f17;
                                            iAuthTabCallback3 = iAuthTabCallback6;
                                            f8 = f18;
                                            Result.Companion companion32222222 = Result.Companion;
                                            obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                            f7 = f8;
                                            i3 = i2;
                                            maintenance = obj3;
                                            displaySetting6 = displaySetting2;
                                            f10 = f7;
                                            th = Result.exceptionOrNull-impl(maintenance);
                                            if (th != 0) {
                                            }
                                            return (OverviewMediumWidgetState) maintenance;
                                        }
                                        if (objOnExtraCallback2 != objOnWarmupCompleted2) {
                                            account3 = account2;
                                            i12 = i11;
                                            i13 = i10;
                                            objOnExtraCallback5 = objOnExtraCallback2;
                                            Context context13 = context3;
                                            displaySetting2 = displaySetting10;
                                            context4 = context13;
                                            f20 = f17;
                                            try {
                                                zBooleanValue = ((Boolean) objOnExtraCallback5).booleanValue();
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    try {
                                                        sb.append("show_amount_medium_");
                                                        sb.append(i28);
                                                        string = sb.toString();
                                                        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback17 = (DiskLruCacheEditornewSink11.IAuthTabCallback) onWarmupCompleted(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), new Object[]{this}, zzaq.onNavigationEvent(), 1198944754, zzaq.onNavigationEvent(), -1198944751);
                                                    } catch (CancellationException e29) {
                                                        e = e29;
                                                        throw e;
                                                    }
                                                } catch (Exception e30) {
                                                    e = e30;
                                                    i14 = i28;
                                                } catch (WebResourceResponseModel e31) {
                                                    e = e31;
                                                    i15 = i28;
                                                }
                                            } catch (WebResourceResponseModel e32) {
                                                e = e32;
                                                i15 = i28;
                                            } catch (Exception e33) {
                                                e = e33;
                                                i14 = i28;
                                            }
                                            try {
                                                KSerializer kSerializerOnExtraCallback = sp.onExtraCallback(BooleanCompanionObject.INSTANCE);
                                                getinterfacedescriptor.L$0 = context4;
                                                getinterfacedescriptor.L$1 = displaySetting2;
                                                getinterfacedescriptor.L$2 = iAuthTabCallback6;
                                                context5 = context4;
                                                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var2);
                                                getinterfacedescriptor.L$4 = account3;
                                                getinterfacedescriptor.L$5 = onextracallback;
                                                getinterfacedescriptor.L$6 = string;
                                                getinterfacedescriptor.I$0 = i28;
                                                getinterfacedescriptor.F$0 = f20;
                                                getinterfacedescriptor.I$1 = i12;
                                                getinterfacedescriptor.I$2 = i13;
                                                getinterfacedescriptor.Z$0 = zBooleanValue;
                                                getinterfacedescriptor.label = 8;
                                                objOnExtraCallback3 = iAuthTabCallback17.onExtraCallback(string, kSerializerOnExtraCallback, getinterfacedescriptor);
                                                objOnWarmupCompleted2 = objOnWarmupCompleted2;
                                            } catch (Exception e34) {
                                                e = e34;
                                                i14 = i28;
                                                exc = e;
                                                i2 = i14;
                                                f19 = f20;
                                                iAuthTabCallback3 = iAuthTabCallback6;
                                                f5 = f19;
                                                Result.Companion companion222222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                f7 = f5;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            } catch (WebResourceResponseModel e35) {
                                                e = e35;
                                                i15 = i28;
                                                webResourceResponseModel = e;
                                                i2 = i15;
                                                f18 = f20;
                                                iAuthTabCallback3 = iAuthTabCallback6;
                                                f8 = f18;
                                                Result.Companion companion322222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                f7 = f8;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            }
                                            if (objOnExtraCallback3 != objOnWarmupCompleted2) {
                                                return objOnWarmupCompleted2;
                                            }
                                            access13800Var3 = access13800Var2;
                                            str = string;
                                            obj5 = objOnExtraCallback3;
                                            context6 = context5;
                                            f21 = f20;
                                            try {
                                                bool = (Boolean) obj5;
                                            } catch (Exception e36) {
                                                e = e36;
                                                i17 = i28;
                                                iAuthTabCallback9 = iAuthTabCallback6;
                                            } catch (WebResourceResponseModel e37) {
                                                e = e37;
                                                i16 = i28;
                                                iAuthTabCallback9 = iAuthTabCallback6;
                                            }
                                            if (bool != null) {
                                                iAuthTabCallback9 = iAuthTabCallback6;
                                                obj8 = objOnWarmupCompleted2;
                                                try {
                                                    q8aVar = q8a.onNavigationEvent;
                                                    getinterfacedescriptor.L$0 = context6;
                                                    getinterfacedescriptor.L$1 = displaySetting2;
                                                    context7 = context6;
                                                } catch (WebResourceResponseModel e38) {
                                                    e = e38;
                                                } catch (Exception e39) {
                                                    e = e39;
                                                }
                                                try {
                                                    getinterfacedescriptor.L$2 = iAuthTabCallback9;
                                                    iAuthTabCallback9 = iAuthTabCallback9;
                                                    getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var3);
                                                    getinterfacedescriptor.L$4 = account3;
                                                    getinterfacedescriptor.L$5 = onextracallback;
                                                    getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str);
                                                    getinterfacedescriptor.L$7 = access15400.onNavigationEvent(bool);
                                                    getinterfacedescriptor.I$0 = i28;
                                                    getinterfacedescriptor.F$0 = f21;
                                                    getinterfacedescriptor.I$1 = i12;
                                                    getinterfacedescriptor.I$2 = i13;
                                                    getinterfacedescriptor.Z$0 = zBooleanValue;
                                                    getinterfacedescriptor.label = 11;
                                                    Object objOnExtraCallbackWithResult = q8aVar.onExtraCallbackWithResult(i28, (access13800<? super Boolean>) getinterfacedescriptor);
                                                    if (objOnExtraCallbackWithResult != obj8) {
                                                        int i32 = ICustomTabsCallback + 13;
                                                        access100 = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            int i33 = 23 / 0;
                                                        }
                                                        f22 = f21;
                                                        iAuthTabCallback12 = iAuthTabCallback9;
                                                        i18 = i12;
                                                        i19 = i13;
                                                        obj9 = objOnExtraCallbackWithResult;
                                                        context8 = context7;
                                                        obj10 = obj8;
                                                        onextracallback3 = onextracallback;
                                                        bool3 = bool;
                                                        AccountSections.Account account7 = account3;
                                                        str3 = str;
                                                        account5 = account7;
                                                        try {
                                                            bool5 = (Boolean) obj9;
                                                            if (bool5 == null) {
                                                                try {
                                                                    zBooleanValue2 = bool5.booleanValue();
                                                                    boolean z6 = zBooleanValue;
                                                                    iAuthTabCallback15 = iAuthTabCallback12;
                                                                    onextracallback4 = onextracallback3;
                                                                    bool4 = bool3;
                                                                    f25 = f22;
                                                                    i20 = i18;
                                                                    context10 = context8;
                                                                    displaySetting11 = displaySetting2;
                                                                    access13800Var4 = access13800Var3;
                                                                    i21 = i28;
                                                                    z2 = z6;
                                                                    currencyIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                                                                    int i34 = i19;
                                                                    boolean z7 = z2;
                                                                    r4Var = this;
                                                                    currencyOnExtraCallback = onExtraCallback(r4Var, currencyIAuthTabCallbackStub, onextracallback4);
                                                                    int i35 = i20;
                                                                    strOnExtraCallback = onExtraCallback(this);
                                                                    i22 = i21;
                                                                    r2externalsyntheticlambda1OnNavigationEvent = onNavigationEvent(this);
                                                                    hiddenStockIAuthTabCallback = onextracallback4.IAuthTabCallback();
                                                                    if (hiddenStockIAuthTabCallback != null) {
                                                                    }
                                                                    ICustomTabsCallback iCustomTabsCallback = r4Var.new ICustomTabsCallback(null);
                                                                    getinterfacedescriptor.L$0 = context10;
                                                                    getinterfacedescriptor.L$1 = displaySetting11;
                                                                    getinterfacedescriptor.L$2 = iAuthTabCallback15;
                                                                    getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var4);
                                                                    getinterfacedescriptor.L$4 = account5;
                                                                    getinterfacedescriptor.L$5 = onextracallback4;
                                                                    getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str3);
                                                                    getinterfacedescriptor.L$7 = access15400.onNavigationEvent(bool4);
                                                                    getinterfacedescriptor.L$8 = currencyIAuthTabCallbackStub;
                                                                    currency2 = currency;
                                                                    getinterfacedescriptor.L$9 = currency2;
                                                                    getinterfacedescriptor.L$10 = strOnExtraCallback;
                                                                    r2ExternalSyntheticLambda1 r2externalsyntheticlambda13 = r2externalsyntheticlambda1;
                                                                    getinterfacedescriptor.L$11 = r2externalsyntheticlambda13;
                                                                    i3 = i22;
                                                                    getinterfacedescriptor.I$0 = i3;
                                                                    getinterfacedescriptor.F$0 = f25;
                                                                    getinterfacedescriptor.I$1 = i35;
                                                                    getinterfacedescriptor.I$2 = i34;
                                                                    z3 = z7;
                                                                    getinterfacedescriptor.Z$0 = z3;
                                                                    onExtraCallback onextracallback7 = onextracallback4;
                                                                    boolean z8 = zBooleanValue2;
                                                                    getinterfacedescriptor.Z$1 = z8;
                                                                    getinterfacedescriptor.label = 13;
                                                                    objOnExtraCallback4 = iAuthTabCallback15.onExtraCallback("getSelectedSortingType", iCustomTabsCallback, getinterfacedescriptor);
                                                                    obj11 = obj10;
                                                                    if (objOnExtraCallback4 != obj11) {
                                                                    }
                                                                    return obj11;
                                                                } catch (WebResourceResponseModel e40) {
                                                                    webResourceResponseModel5 = e40;
                                                                    iAuthTabCallback9 = iAuthTabCallback12;
                                                                    i16 = i28;
                                                                    webResourceResponseModel = webResourceResponseModel5;
                                                                    f27 = f22;
                                                                    iAuthTabCallback3 = iAuthTabCallback9;
                                                                    i2 = i16;
                                                                    f8 = f27;
                                                                    Result.Companion companion3222222222 = Result.Companion;
                                                                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                                    f7 = f8;
                                                                    i3 = i2;
                                                                    maintenance = obj3;
                                                                    displaySetting6 = displaySetting2;
                                                                    f10 = f7;
                                                                    th = Result.exceptionOrNull-impl(maintenance);
                                                                    if (th != 0) {
                                                                    }
                                                                    return (OverviewMediumWidgetState) maintenance;
                                                                } catch (Exception e41) {
                                                                    exc5 = e41;
                                                                    iAuthTabCallback9 = iAuthTabCallback12;
                                                                    i17 = i28;
                                                                    exc = exc5;
                                                                    f26 = f22;
                                                                    iAuthTabCallback3 = iAuthTabCallback9;
                                                                    i2 = i17;
                                                                    f5 = f26;
                                                                    Result.Companion companion2222222222 = Result.Companion;
                                                                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                                    f7 = f5;
                                                                    i3 = i2;
                                                                    maintenance = obj3;
                                                                    displaySetting6 = displaySetting2;
                                                                    f10 = f7;
                                                                    th = Result.exceptionOrNull-impl(maintenance);
                                                                    if (th != 0) {
                                                                    }
                                                                    return (OverviewMediumWidgetState) maintenance;
                                                                }
                                                            }
                                                            q8a q8aVar3 = q8a.onNavigationEvent;
                                                            getinterfacedescriptor.L$0 = context8;
                                                            getinterfacedescriptor.L$1 = displaySetting2;
                                                            getinterfacedescriptor.L$2 = iAuthTabCallback12;
                                                            iAuthTabCallback9 = iAuthTabCallback12;
                                                            try {
                                                                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var3);
                                                                getinterfacedescriptor.L$4 = account5;
                                                                getinterfacedescriptor.L$5 = onextracallback3;
                                                                getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str3);
                                                                getinterfacedescriptor.L$7 = access15400.onNavigationEvent(bool3);
                                                                getinterfacedescriptor.L$8 = access15400.onNavigationEvent(this);
                                                                getinterfacedescriptor.I$0 = i28;
                                                                getinterfacedescriptor.F$0 = f22;
                                                                getinterfacedescriptor.I$1 = i18;
                                                                getinterfacedescriptor.I$2 = i19;
                                                                getinterfacedescriptor.Z$0 = zBooleanValue;
                                                                getinterfacedescriptor.I$3 = 0;
                                                                getinterfacedescriptor.label = 12;
                                                                obj12 = obj10;
                                                                if (q8aVar3.onNavigationEvent(i28, true, (access13800<? super Unit>) getinterfacedescriptor) == obj12) {
                                                                    obj11 = obj12;
                                                                    return obj11;
                                                                }
                                                                context11 = context8;
                                                                displaySetting11 = displaySetting2;
                                                                onextracallback5 = onextracallback3;
                                                                bool4 = bool3;
                                                                obj10 = obj12;
                                                                f25 = f22;
                                                                onextracallback4 = onextracallback5;
                                                                i20 = i18;
                                                                access13800Var4 = access13800Var3;
                                                                context10 = context11;
                                                                i21 = i28;
                                                                z2 = zBooleanValue;
                                                                iAuthTabCallback15 = iAuthTabCallback9;
                                                                zBooleanValue2 = true;
                                                                currencyIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                                                                int i342 = i19;
                                                                boolean z72 = z2;
                                                                r4Var = this;
                                                                currencyOnExtraCallback = onExtraCallback(r4Var, currencyIAuthTabCallbackStub, onextracallback4);
                                                                int i352 = i20;
                                                                strOnExtraCallback = onExtraCallback(this);
                                                                i22 = i21;
                                                                r2externalsyntheticlambda1OnNavigationEvent = onNavigationEvent(this);
                                                                hiddenStockIAuthTabCallback = onextracallback4.IAuthTabCallback();
                                                                if (hiddenStockIAuthTabCallback != null) {
                                                                }
                                                                ICustomTabsCallback iCustomTabsCallback2 = r4Var.new ICustomTabsCallback(null);
                                                                getinterfacedescriptor.L$0 = context10;
                                                                getinterfacedescriptor.L$1 = displaySetting11;
                                                                getinterfacedescriptor.L$2 = iAuthTabCallback15;
                                                                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var4);
                                                                getinterfacedescriptor.L$4 = account5;
                                                                getinterfacedescriptor.L$5 = onextracallback4;
                                                                getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str3);
                                                                getinterfacedescriptor.L$7 = access15400.onNavigationEvent(bool4);
                                                                getinterfacedescriptor.L$8 = currencyIAuthTabCallbackStub;
                                                                currency2 = currency;
                                                                getinterfacedescriptor.L$9 = currency2;
                                                                getinterfacedescriptor.L$10 = strOnExtraCallback;
                                                                r2ExternalSyntheticLambda1 r2externalsyntheticlambda132 = r2externalsyntheticlambda1;
                                                                getinterfacedescriptor.L$11 = r2externalsyntheticlambda132;
                                                                i3 = i22;
                                                                getinterfacedescriptor.I$0 = i3;
                                                                getinterfacedescriptor.F$0 = f25;
                                                                getinterfacedescriptor.I$1 = i352;
                                                                getinterfacedescriptor.I$2 = i342;
                                                                z3 = z72;
                                                                getinterfacedescriptor.Z$0 = z3;
                                                                onExtraCallback onextracallback72 = onextracallback4;
                                                                boolean z82 = zBooleanValue2;
                                                                getinterfacedescriptor.Z$1 = z82;
                                                                getinterfacedescriptor.label = 13;
                                                                objOnExtraCallback4 = iAuthTabCallback15.onExtraCallback("getSelectedSortingType", iCustomTabsCallback2, getinterfacedescriptor);
                                                                obj11 = obj10;
                                                                if (objOnExtraCallback4 != obj11) {
                                                                }
                                                                return obj11;
                                                            } catch (WebResourceResponseModel e42) {
                                                                e = e42;
                                                                i16 = i28;
                                                                webResourceResponseModel5 = e;
                                                                webResourceResponseModel = webResourceResponseModel5;
                                                                f27 = f22;
                                                                iAuthTabCallback3 = iAuthTabCallback9;
                                                                i2 = i16;
                                                                f8 = f27;
                                                                Result.Companion companion32222222222 = Result.Companion;
                                                                obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                                f7 = f8;
                                                                i3 = i2;
                                                                maintenance = obj3;
                                                                displaySetting6 = displaySetting2;
                                                                f10 = f7;
                                                                th = Result.exceptionOrNull-impl(maintenance);
                                                                if (th != 0) {
                                                                }
                                                                return (OverviewMediumWidgetState) maintenance;
                                                            } catch (Exception e43) {
                                                                e = e43;
                                                                i17 = i28;
                                                                exc5 = e;
                                                                exc = exc5;
                                                                f26 = f22;
                                                                iAuthTabCallback3 = iAuthTabCallback9;
                                                                i2 = i17;
                                                                f5 = f26;
                                                                Result.Companion companion22222222222 = Result.Companion;
                                                                obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                                f7 = f5;
                                                                i3 = i2;
                                                                maintenance = obj3;
                                                                displaySetting6 = displaySetting2;
                                                                f10 = f7;
                                                                th = Result.exceptionOrNull-impl(maintenance);
                                                                if (th != 0) {
                                                                }
                                                                return (OverviewMediumWidgetState) maintenance;
                                                            }
                                                        } catch (Exception e44) {
                                                            e = e44;
                                                            iAuthTabCallback9 = iAuthTabCallback12;
                                                        } catch (WebResourceResponseModel e45) {
                                                            e = e45;
                                                            iAuthTabCallback9 = iAuthTabCallback12;
                                                        }
                                                    }
                                                    obj11 = obj8;
                                                    return obj11;
                                                } catch (WebResourceResponseModel e46) {
                                                    e = e46;
                                                    iAuthTabCallback9 = iAuthTabCallback9;
                                                    i16 = i28;
                                                    webResourceResponseModel3 = e;
                                                    webResourceResponseModel = webResourceResponseModel3;
                                                    f27 = f21;
                                                    iAuthTabCallback3 = iAuthTabCallback9;
                                                    i2 = i16;
                                                    f8 = f27;
                                                    Result.Companion companion322222222222 = Result.Companion;
                                                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                    f7 = f8;
                                                    i3 = i2;
                                                    maintenance = obj3;
                                                    displaySetting6 = displaySetting2;
                                                    f10 = f7;
                                                    th = Result.exceptionOrNull-impl(maintenance);
                                                    if (th != 0) {
                                                    }
                                                    return (OverviewMediumWidgetState) maintenance;
                                                } catch (Exception e47) {
                                                    e = e47;
                                                    iAuthTabCallback9 = iAuthTabCallback9;
                                                    i17 = i28;
                                                    exc3 = e;
                                                    exc = exc3;
                                                    f26 = f21;
                                                    iAuthTabCallback3 = iAuthTabCallback9;
                                                    i2 = i17;
                                                    f5 = f26;
                                                    Result.Companion companion222222222222 = Result.Companion;
                                                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                    f7 = f5;
                                                    i3 = i2;
                                                    maintenance = obj3;
                                                    displaySetting6 = displaySetting2;
                                                    f10 = f7;
                                                    th = Result.exceptionOrNull-impl(maintenance);
                                                    if (th != 0) {
                                                    }
                                                    return (OverviewMediumWidgetState) maintenance;
                                                }
                                            }
                                            try {
                                                obj6 = objOnWarmupCompleted2;
                                                iAuthTabCallback10 = (DiskLruCacheEditornewSink11.IAuthTabCallback) onWarmupCompleted(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), new Object[]{this}, zzaq.onNavigationEvent(), 1198944754, zzaq.onNavigationEvent(), -1198944751);
                                                getinterfacedescriptor.L$0 = context6;
                                                getinterfacedescriptor.L$1 = displaySetting2;
                                                getinterfacedescriptor.L$2 = iAuthTabCallback6;
                                                iAuthTabCallback9 = iAuthTabCallback6;
                                            } catch (Exception e48) {
                                                e = e48;
                                                iAuthTabCallback9 = iAuthTabCallback6;
                                            } catch (WebResourceResponseModel e49) {
                                                e = e49;
                                                iAuthTabCallback9 = iAuthTabCallback6;
                                            }
                                            try {
                                                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var3);
                                                getinterfacedescriptor.L$4 = account3;
                                                getinterfacedescriptor.L$5 = onextracallback;
                                                getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str);
                                                getinterfacedescriptor.L$7 = bool;
                                                getinterfacedescriptor.I$0 = i28;
                                                getinterfacedescriptor.F$0 = f21;
                                                getinterfacedescriptor.I$1 = i12;
                                                getinterfacedescriptor.I$2 = i13;
                                                getinterfacedescriptor.Z$0 = zBooleanValue;
                                                getinterfacedescriptor.label = 9;
                                            } catch (Exception e50) {
                                                e = e50;
                                                exc3 = e;
                                                i17 = i28;
                                                exc = exc3;
                                                f26 = f21;
                                                iAuthTabCallback3 = iAuthTabCallback9;
                                                i2 = i17;
                                                f5 = f26;
                                                Result.Companion companion2222222222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                f7 = f5;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            } catch (WebResourceResponseModel e51) {
                                                e = e51;
                                                webResourceResponseModel3 = e;
                                                i16 = i28;
                                                webResourceResponseModel = webResourceResponseModel3;
                                                f27 = f21;
                                                iAuthTabCallback3 = iAuthTabCallback9;
                                                i2 = i16;
                                                f8 = f27;
                                                Result.Companion companion3222222222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                f7 = f8;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            }
                                            if (iAuthTabCallback10.onNavigationEvent(str, getinterfacedescriptor) == obj6) {
                                                return obj6;
                                            }
                                            str2 = str;
                                            obj7 = obj6;
                                            bool2 = bool;
                                            iAuthTabCallback11 = iAuthTabCallback9;
                                            AccountSections.Account account8 = account3;
                                            onextracallback2 = onextracallback;
                                            account4 = account8;
                                            f23 = f21;
                                            try {
                                                q8a q8aVar4 = q8a.onNavigationEvent;
                                                boolean zBooleanValue3 = bool2.booleanValue();
                                                getinterfacedescriptor.L$0 = context6;
                                                getinterfacedescriptor.L$1 = displaySetting2;
                                                getinterfacedescriptor.L$2 = iAuthTabCallback11;
                                                iAuthTabCallback5 = iAuthTabCallback11;
                                            } catch (Exception e52) {
                                                e = e52;
                                                iAuthTabCallback5 = iAuthTabCallback11;
                                            } catch (WebResourceResponseModel e53) {
                                                e = e53;
                                                iAuthTabCallback5 = iAuthTabCallback11;
                                            }
                                            try {
                                                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var3);
                                                getinterfacedescriptor.L$4 = account4;
                                                getinterfacedescriptor.L$5 = onextracallback2;
                                                getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str2);
                                                getinterfacedescriptor.L$7 = bool2;
                                                getinterfacedescriptor.I$0 = i28;
                                                getinterfacedescriptor.F$0 = f23;
                                                getinterfacedescriptor.I$1 = i12;
                                                getinterfacedescriptor.I$2 = i13;
                                                getinterfacedescriptor.Z$0 = zBooleanValue;
                                                getinterfacedescriptor.label = 10;
                                                objOnNavigationEvent = q8aVar4.onNavigationEvent(i28, zBooleanValue3, (access13800<? super Unit>) getinterfacedescriptor);
                                                obj8 = obj7;
                                            } catch (Exception e54) {
                                                e = e54;
                                                exc4 = e;
                                                i3 = i28;
                                                iAuthTabCallback14 = iAuthTabCallback5;
                                                f29 = f23;
                                                exc = exc4;
                                                iAuthTabCallback3 = iAuthTabCallback14;
                                                f6 = f29;
                                                i2 = i3;
                                                f5 = f6;
                                                Result.Companion companion22222222222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                f7 = f5;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            } catch (WebResourceResponseModel e55) {
                                                e = e55;
                                                webResourceResponseModel4 = e;
                                                i3 = i28;
                                                iAuthTabCallback13 = iAuthTabCallback5;
                                                f28 = f23;
                                                webResourceResponseModel = webResourceResponseModel4;
                                                iAuthTabCallback3 = iAuthTabCallback13;
                                                f9 = f28;
                                                i2 = i3;
                                                f8 = f9;
                                                Result.Companion companion32222222222222 = Result.Companion;
                                                obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                f7 = f8;
                                                i3 = i2;
                                                maintenance = obj3;
                                                displaySetting6 = displaySetting2;
                                                f10 = f7;
                                                th = Result.exceptionOrNull-impl(maintenance);
                                                if (th != 0) {
                                                }
                                                return (OverviewMediumWidgetState) maintenance;
                                            }
                                            if (objOnNavigationEvent != obj8) {
                                                context9 = context6;
                                                z = zBooleanValue;
                                                f24 = f23;
                                                try {
                                                    boolean zBooleanValue4 = bool2.booleanValue();
                                                    obj10 = obj8;
                                                    bool4 = bool2;
                                                    account5 = account4;
                                                    f25 = f24 == true ? 1 : 0;
                                                    context10 = context9;
                                                    onextracallback4 = onextracallback2;
                                                    str3 = str2;
                                                    i20 = i12;
                                                    i19 = i13;
                                                    int i36 = i28;
                                                    z2 = z;
                                                    displaySetting11 = displaySetting2;
                                                    access13800Var4 = access13800Var3;
                                                    i21 = i36;
                                                    IAuthTabCallback iAuthTabCallback18 = iAuthTabCallback5;
                                                    zBooleanValue2 = zBooleanValue4;
                                                    iAuthTabCallback15 = iAuthTabCallback18;
                                                    try {
                                                        currencyIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                                                        int i3422 = i19;
                                                        boolean z722 = z2;
                                                        r4Var = this;
                                                    } catch (WebResourceResponseModel e56) {
                                                        e = e56;
                                                    } catch (Exception e57) {
                                                        e = e57;
                                                    }
                                                    try {
                                                        currencyOnExtraCallback = onExtraCallback(r4Var, currencyIAuthTabCallbackStub, onextracallback4);
                                                        int i3522 = i20;
                                                        strOnExtraCallback = onExtraCallback(this);
                                                        i22 = i21;
                                                        try {
                                                            r2externalsyntheticlambda1OnNavigationEvent = onNavigationEvent(this);
                                                            hiddenStockIAuthTabCallback = onextracallback4.IAuthTabCallback();
                                                        } catch (Exception e58) {
                                                            e = e58;
                                                            i3 = i22;
                                                        } catch (WebResourceResponseModel e59) {
                                                            e = e59;
                                                            i3 = i22;
                                                        }
                                                    } catch (Exception e60) {
                                                        e = e60;
                                                        i3 = i21;
                                                        exc6 = e;
                                                        displaySetting2 = displaySetting11;
                                                        f29 = f25;
                                                        exc4 = exc6;
                                                        iAuthTabCallback14 = iAuthTabCallback15;
                                                        exc = exc4;
                                                        iAuthTabCallback3 = iAuthTabCallback14;
                                                        f6 = f29;
                                                        i2 = i3;
                                                        f5 = f6;
                                                        Result.Companion companion222222222222222 = Result.Companion;
                                                        obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                        f7 = f5;
                                                        i3 = i2;
                                                        maintenance = obj3;
                                                        displaySetting6 = displaySetting2;
                                                        f10 = f7;
                                                        th = Result.exceptionOrNull-impl(maintenance);
                                                        if (th != 0) {
                                                        }
                                                        return (OverviewMediumWidgetState) maintenance;
                                                    } catch (WebResourceResponseModel e61) {
                                                        e = e61;
                                                        i3 = i21;
                                                        webResourceResponseModel6 = e;
                                                        displaySetting2 = displaySetting11;
                                                        f28 = f25;
                                                        webResourceResponseModel4 = webResourceResponseModel6;
                                                        iAuthTabCallback13 = iAuthTabCallback15;
                                                        webResourceResponseModel = webResourceResponseModel4;
                                                        iAuthTabCallback3 = iAuthTabCallback13;
                                                        f9 = f28;
                                                        i2 = i3;
                                                        f8 = f9;
                                                        Result.Companion companion322222222222222 = Result.Companion;
                                                        obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                        f7 = f8;
                                                        i3 = i2;
                                                        maintenance = obj3;
                                                        displaySetting6 = displaySetting2;
                                                        f10 = f7;
                                                        th = Result.exceptionOrNull-impl(maintenance);
                                                        if (th != 0) {
                                                        }
                                                        return (OverviewMediumWidgetState) maintenance;
                                                    }
                                                } catch (WebResourceResponseModel e62) {
                                                    webResourceResponseModel2 = e62;
                                                    displaySetting5 = displaySetting2;
                                                    f2 = f24;
                                                    displaySetting2 = displaySetting5;
                                                    webResourceResponseModel = webResourceResponseModel2;
                                                    i3 = i28;
                                                    iAuthTabCallback3 = iAuthTabCallback5;
                                                    f9 = f2;
                                                    i2 = i3;
                                                    f8 = f9;
                                                    Result.Companion companion3222222222222222 = Result.Companion;
                                                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                    f7 = f8;
                                                    i3 = i2;
                                                    maintenance = obj3;
                                                    displaySetting6 = displaySetting2;
                                                    f10 = f7;
                                                    th = Result.exceptionOrNull-impl(maintenance);
                                                    if (th != 0) {
                                                    }
                                                    return (OverviewMediumWidgetState) maintenance;
                                                } catch (Exception e63) {
                                                    exc2 = e63;
                                                    displaySetting4 = displaySetting2;
                                                    f = f24;
                                                    displaySetting2 = displaySetting4;
                                                    exc = exc2;
                                                    i3 = i28;
                                                    iAuthTabCallback3 = iAuthTabCallback5;
                                                    f6 = f;
                                                    i2 = i3;
                                                    f5 = f6;
                                                    Result.Companion companion2222222222222222 = Result.Companion;
                                                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                    f7 = f5;
                                                    i3 = i2;
                                                    maintenance = obj3;
                                                    displaySetting6 = displaySetting2;
                                                    f10 = f7;
                                                    th = Result.exceptionOrNull-impl(maintenance);
                                                    if (th != 0) {
                                                    }
                                                    return (OverviewMediumWidgetState) maintenance;
                                                }
                                                if (hiddenStockIAuthTabCallback != null) {
                                                    r2externalsyntheticlambda1 = r2externalsyntheticlambda1OnNavigationEvent;
                                                    try {
                                                        boolOnExtraCallbackWithResult = hiddenStockIAuthTabCallback.onExtraCallbackWithResult();
                                                        currency = currencyOnExtraCallback;
                                                    } catch (WebResourceResponseModel e64) {
                                                        webResourceResponseModel = e64;
                                                        displaySetting2 = displaySetting11;
                                                        iAuthTabCallback3 = iAuthTabCallback15;
                                                        f8 = f25;
                                                        i2 = i22;
                                                        Result.Companion companion32222222222222222 = Result.Companion;
                                                        obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                        f7 = f8;
                                                        i3 = i2;
                                                        maintenance = obj3;
                                                        displaySetting6 = displaySetting2;
                                                        f10 = f7;
                                                        th = Result.exceptionOrNull-impl(maintenance);
                                                        if (th != 0) {
                                                        }
                                                        return (OverviewMediumWidgetState) maintenance;
                                                    } catch (Exception e65) {
                                                        exc = e65;
                                                        displaySetting2 = displaySetting11;
                                                        iAuthTabCallback3 = iAuthTabCallback15;
                                                        f5 = f25;
                                                        i2 = i22;
                                                        Result.Companion companion22222222222222222 = Result.Companion;
                                                        obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                        f7 = f5;
                                                        i3 = i2;
                                                        maintenance = obj3;
                                                        displaySetting6 = displaySetting2;
                                                        f10 = f7;
                                                        th = Result.exceptionOrNull-impl(maintenance);
                                                        if (th != 0) {
                                                        }
                                                        return (OverviewMediumWidgetState) maintenance;
                                                    }
                                                    if (Intrinsics.areEqual(boolOnExtraCallbackWithResult, access14000.onNavigationEvent(true))) {
                                                        String strOnWarmupCompleted = account5.onWarmupCompleted();
                                                        String strAsInterface = account5.asInterface();
                                                        if (!(!account5.onTransact().isChildAccount())) {
                                                            int i37 = ICustomTabsCallback + 123;
                                                            access100 = i37 % 128;
                                                            int i38 = i37 % 2;
                                                            hostnamesKt = HostnamesKt.PARENTS;
                                                        } else {
                                                            hostnamesKt = HostnamesKt.SELF;
                                                        }
                                                        try {
                                                            i3 = i22;
                                                            f30 = f25;
                                                            IAuthTabCallback iAuthTabCallback19 = iAuthTabCallback15;
                                                            maintenance2 = new OverviewMediumWidgetState.AllHidden(displaySetting11, f25, strOnWarmupCompleted, strOnExtraCallback, strAsInterface, hostnamesKt);
                                                            displaySetting6 = displaySetting11;
                                                            iAuthTabCallback3 = iAuthTabCallback19;
                                                            maintenance = Result.constructor-impl(maintenance2);
                                                            f10 = f30;
                                                        } catch (Exception e66) {
                                                            exc6 = e66;
                                                            i3 = i22;
                                                            displaySetting2 = displaySetting11;
                                                            f29 = f25;
                                                            exc4 = exc6;
                                                            iAuthTabCallback14 = iAuthTabCallback15;
                                                            exc = exc4;
                                                            iAuthTabCallback3 = iAuthTabCallback14;
                                                            f6 = f29;
                                                            i2 = i3;
                                                            f5 = f6;
                                                            Result.Companion companion222222222222222222 = Result.Companion;
                                                            obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                            f7 = f5;
                                                            i3 = i2;
                                                            maintenance = obj3;
                                                            displaySetting6 = displaySetting2;
                                                            f10 = f7;
                                                            th = Result.exceptionOrNull-impl(maintenance);
                                                            if (th != 0) {
                                                            }
                                                            return (OverviewMediumWidgetState) maintenance;
                                                        } catch (WebResourceResponseModel e67) {
                                                            webResourceResponseModel6 = e67;
                                                            i3 = i22;
                                                            displaySetting2 = displaySetting11;
                                                            f28 = f25;
                                                            webResourceResponseModel4 = webResourceResponseModel6;
                                                            iAuthTabCallback13 = iAuthTabCallback15;
                                                            webResourceResponseModel = webResourceResponseModel4;
                                                            iAuthTabCallback3 = iAuthTabCallback13;
                                                            f9 = f28;
                                                            i2 = i3;
                                                            f8 = f9;
                                                            Result.Companion companion322222222222222222 = Result.Companion;
                                                            obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                            f7 = f8;
                                                            i3 = i2;
                                                            maintenance = obj3;
                                                            displaySetting6 = displaySetting2;
                                                            f10 = f7;
                                                            th = Result.exceptionOrNull-impl(maintenance);
                                                            if (th != 0) {
                                                            }
                                                            return (OverviewMediumWidgetState) maintenance;
                                                        }
                                                        th = Result.exceptionOrNull-impl(maintenance);
                                                        if (th != 0) {
                                                        }
                                                        return (OverviewMediumWidgetState) maintenance;
                                                    }
                                                } else {
                                                    currency = currencyOnExtraCallback;
                                                    r2externalsyntheticlambda1 = r2externalsyntheticlambda1OnNavigationEvent;
                                                }
                                                ICustomTabsCallback iCustomTabsCallback22 = r4Var.new ICustomTabsCallback(null);
                                                getinterfacedescriptor.L$0 = context10;
                                                getinterfacedescriptor.L$1 = displaySetting11;
                                                getinterfacedescriptor.L$2 = iAuthTabCallback15;
                                                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var4);
                                                getinterfacedescriptor.L$4 = account5;
                                                getinterfacedescriptor.L$5 = onextracallback4;
                                                getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str3);
                                                getinterfacedescriptor.L$7 = access15400.onNavigationEvent(bool4);
                                                getinterfacedescriptor.L$8 = currencyIAuthTabCallbackStub;
                                                currency2 = currency;
                                                getinterfacedescriptor.L$9 = currency2;
                                                getinterfacedescriptor.L$10 = strOnExtraCallback;
                                                r2ExternalSyntheticLambda1 r2externalsyntheticlambda1322 = r2externalsyntheticlambda1;
                                                getinterfacedescriptor.L$11 = r2externalsyntheticlambda1322;
                                                i3 = i22;
                                                getinterfacedescriptor.I$0 = i3;
                                                getinterfacedescriptor.F$0 = f25;
                                                getinterfacedescriptor.I$1 = i3522;
                                                getinterfacedescriptor.I$2 = i3422;
                                                z3 = z722;
                                                getinterfacedescriptor.Z$0 = z3;
                                                onExtraCallback onextracallback722 = onextracallback4;
                                                boolean z822 = zBooleanValue2;
                                                getinterfacedescriptor.Z$1 = z822;
                                                getinterfacedescriptor.label = 13;
                                                objOnExtraCallback4 = iAuthTabCallback15.onExtraCallback("getSelectedSortingType", iCustomTabsCallback22, getinterfacedescriptor);
                                                obj11 = obj10;
                                                if (objOnExtraCallback4 != obj11) {
                                                    context12 = context10;
                                                    str4 = strOnExtraCallback;
                                                    f13 = f25;
                                                    r2externalsyntheticlambda12 = r2externalsyntheticlambda1322;
                                                    z4 = z822;
                                                    onextracallback6 = onextracallback722;
                                                    currency3 = currencyIAuthTabCallbackStub;
                                                    account6 = account5;
                                                    try {
                                                        r2ExternalSyntheticLambda2 r2externalsyntheticlambda2 = (r2ExternalSyntheticLambda2) objOnExtraCallback4;
                                                        boolean z9 = r2b.onExtraCallback(onextracallback6.access000(), r2externalsyntheticlambda2).IAuthTabCallback() != r2ExternalSyntheticLambda2.IAuthTabCallbackDefault.DAILY_PROFIT;
                                                        List<OverviewMediumListItem> listIAuthTabCallback = onextracallback6.IAuthTabCallback(currency3, z3, 100, r2externalsyntheticlambda2);
                                                        ArrayList arrayList = new ArrayList();
                                                        for (OverviewMediumListItem overviewMediumListItem : listIAuthTabCallback) {
                                                            OverviewMediumListItem.Stock stock = overviewMediumListItem instanceof OverviewMediumListItem.Stock ? (OverviewMediumListItem.Stock) overviewMediumListItem : null;
                                                            OverviewItemInfo overviewItemInfoIAuthTabCallback = stock != null ? stock.IAuthTabCallback() : null;
                                                            if (overviewItemInfoIAuthTabCallback != null) {
                                                                arrayList.add(overviewItemInfoIAuthTabCallback);
                                                            }
                                                        }
                                                        Triple tripleOnWarmupCompleted = onWarmupCompleted(r4Var, context12, onextracallback6, z3, currency2);
                                                        String str5 = (String) tripleOnWarmupCompleted.onExtraCallbackWithResult();
                                                        checkDuration checkduration = (checkDuration) tripleOnWarmupCompleted.onExtraCallback();
                                                        String str6 = (String) tripleOnWarmupCompleted.IAuthTabCallback();
                                                        ArrayList arrayList2 = new ArrayList();
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            int i39 = access100 + 115;
                                                            ICustomTabsCallback = i39 % 128;
                                                            int i40 = i39 % 2;
                                                            String strIAuthTabCallbackStub = ((OverviewItemInfo) it.next()).IAuthTabCallbackStub();
                                                            if (strIAuthTabCallbackStub != null) {
                                                                arrayList2.add(strIAuthTabCallbackStub);
                                                            }
                                                        }
                                                        OverviewUiData overviewUiData = new OverviewUiData((OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, str5, str6, checkduration, access14000.onNavigationEvent(onextracallback6.onExtraCallbackWithResult()), (List) onExtraCallback.onExtraCallbackWithResult(new Object[]{onextracallback6}, -1481187999, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1481188000, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted()), onextracallback6.access100(), onextracallback6.getInterfaceDescriptor(), (OverviewPrice) null, (OverviewPrice) null, (OverviewRate) null, arrayList, listIAuthTabCallback, 7175, (DefaultConstructorMarker) null);
                                                        String strAsInterface2 = account6.asInterface();
                                                        if (account6.onTransact().isChildAccount()) {
                                                            hostnamesKt2 = HostnamesKt.SELF;
                                                        } else {
                                                            int i41 = ICustomTabsCallback + 53;
                                                            access100 = i41 % 128;
                                                            int i42 = i41 % 2;
                                                            hostnamesKt2 = HostnamesKt.PARENTS;
                                                        }
                                                        OverviewMediumWidgetState success = new OverviewMediumWidgetState.Success(displaySetting11, f13, account6.onWarmupCompleted(), overviewUiData, str4, arrayList2, currency2, currency3, z3, z4, strAsInterface2, hostnamesKt2, r2externalsyntheticlambda12, z9);
                                                        displaySetting6 = displaySetting11;
                                                        iAuthTabCallback3 = iAuthTabCallback15;
                                                        maintenance2 = success;
                                                        f30 = f13;
                                                        maintenance = Result.constructor-impl(maintenance2);
                                                        f10 = f30;
                                                    } catch (WebResourceResponseModel e68) {
                                                        webResourceResponseModel = e68;
                                                        displaySetting2 = displaySetting11;
                                                        iAuthTabCallback3 = iAuthTabCallback15;
                                                        f9 = f13;
                                                        i2 = i3;
                                                        f8 = f9;
                                                        Result.Companion companion3222222222222222222 = Result.Companion;
                                                        obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                                                        f7 = f8;
                                                        i3 = i2;
                                                        maintenance = obj3;
                                                        displaySetting6 = displaySetting2;
                                                        f10 = f7;
                                                        th = Result.exceptionOrNull-impl(maintenance);
                                                        if (th != 0) {
                                                        }
                                                        return (OverviewMediumWidgetState) maintenance;
                                                    } catch (Exception e69) {
                                                        exc = e69;
                                                        displaySetting2 = displaySetting11;
                                                        iAuthTabCallback3 = iAuthTabCallback15;
                                                        f6 = f13;
                                                        i2 = i3;
                                                        f5 = f6;
                                                        Result.Companion companion2222222222222222222 = Result.Companion;
                                                        obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                                                        f7 = f5;
                                                        i3 = i2;
                                                        maintenance = obj3;
                                                        displaySetting6 = displaySetting2;
                                                        f10 = f7;
                                                        th = Result.exceptionOrNull-impl(maintenance);
                                                        if (th != 0) {
                                                        }
                                                        return (OverviewMediumWidgetState) maintenance;
                                                    }
                                                    th = Result.exceptionOrNull-impl(maintenance);
                                                    if (th != 0) {
                                                    }
                                                    return (OverviewMediumWidgetState) maintenance;
                                                }
                                                return obj11;
                                            }
                                            obj11 = obj8;
                                            return obj11;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return objOnWarmupCompleted2;
            case 1:
                i23 = getinterfacedescriptor.I$0;
                Context context14 = (Context) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                objOnWarmupCompleted = objOnExtraCallback5;
                context2 = context14;
                DisplaySetting displaySetting122 = (DisplaySetting) objOnWarmupCompleted;
                getinterfacedescriptor.L$0 = context2;
                getinterfacedescriptor.L$1 = displaySetting122;
                getinterfacedescriptor.I$0 = i23;
                i4 = 2;
                getinterfacedescriptor.label = 2;
                objIAuthTabCallback = IAuthTabCallback(i23, (access13800<? super Float>) getinterfacedescriptor);
                if (objIAuthTabCallback != objOnWarmupCompleted2) {
                }
                return objOnWarmupCompleted2;
            case 2:
                int i43 = getinterfacedescriptor.I$0;
                DisplaySetting displaySetting14 = (DisplaySetting) getinterfacedescriptor.L$1;
                Context context15 = (Context) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                i28 = i43;
                displaySetting7 = displaySetting14;
                context3 = context15;
                i4 = 2;
                float fFloatValue2 = ((Number) objOnExtraCallback5).floatValue();
                q8a q8aVar22 = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("function", "OverviewRepository.loadOverviewMediumData");
                Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i28));
                Pair[] pairArr2 = new Pair[i4];
                pairArr2[0] = pairIAuthTabCallback3;
                pairArr2[1] = pairIAuthTabCallback22;
                q8aVar22.onExtraCallbackWithResult(access8100.onWarmupCompleted(pairArr2));
                IAuthTabCallback iAuthTabCallback162 = new IAuthTabCallback();
                Result.Companion companion4 = Result.Companion;
                if (onWarmupCompleted(this).IAuthTabCallback()) {
                }
                break;
            case 3:
                i5 = getinterfacedescriptor.I$2;
                i6 = getinterfacedescriptor.I$1;
                float f33 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                access13800Var2 = (access13800) getinterfacedescriptor.L$3;
                iAuthTabCallback6 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                displaySetting8 = (DisplaySetting) getinterfacedescriptor.L$1;
                context3 = (Context) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                f11 = f33;
                if (((Boolean) objOnExtraCallback5).booleanValue()) {
                }
                return objOnWarmupCompleted2;
            case 4:
                f13 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                IAuthTabCallback iAuthTabCallback20 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting15 = (DisplaySetting) getinterfacedescriptor.L$1;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                    iAuthTabCallback6 = iAuthTabCallback20;
                    displaySetting9 = displaySetting15;
                    f12 = f13;
                    if (((Boolean) objOnExtraCallback5).booleanValue()) {
                    }
                } catch (WebResourceResponseModel e70) {
                    e = e70;
                    iAuthTabCallback8 = iAuthTabCallback20;
                    displaySetting11 = displaySetting15;
                    webResourceResponseModel = e;
                    displaySetting2 = displaySetting11;
                    iAuthTabCallback3 = iAuthTabCallback8;
                    f32 = f13;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    f4 = f32;
                    f8 = f4;
                    Result.Companion companion32222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    f7 = f8;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                } catch (Exception e71) {
                    e = e71;
                    iAuthTabCallback7 = iAuthTabCallback20;
                    displaySetting11 = displaySetting15;
                    exc = e;
                    int i44 = access100 + 81;
                    ICustomTabsCallback = i44 % 128;
                    int i45 = i44 % 2;
                    displaySetting2 = displaySetting11;
                    iAuthTabCallback3 = iAuthTabCallback7;
                    f31 = f13;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    f3 = f31;
                    f5 = f3;
                    Result.Companion companion22222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                    f7 = f5;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                }
                break;
            case 5:
                int i46 = getinterfacedescriptor.I$2;
                int i47 = getinterfacedescriptor.I$1;
                float f34 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                access13800<? super DisplaySetting> access13800Var5 = (access13800) getinterfacedescriptor.L$3;
                IAuthTabCallback iAuthTabCallback21 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting16 = (DisplaySetting) getinterfacedescriptor.L$1;
                Context context16 = (Context) getinterfacedescriptor.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                    context3 = context16;
                    i10 = i46;
                    displaySetting10 = displaySetting16;
                    iAuthTabCallback6 = iAuthTabCallback21;
                    access13800Var2 = access13800Var5;
                    i9 = i47;
                    obj4 = objOnExtraCallback5;
                    f14 = f34;
                    account = (AccountSections.Account) obj4;
                    obj = "appWidgetId";
                    writeTypedObject writetypedobject2 = new writeTypedObject(account, null);
                    getinterfacedescriptor.L$0 = context3;
                    getinterfacedescriptor.L$1 = displaySetting10;
                    getinterfacedescriptor.L$2 = iAuthTabCallback6;
                    getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var2);
                    getinterfacedescriptor.L$4 = account;
                    getinterfacedescriptor.I$0 = i28;
                    getinterfacedescriptor.F$0 = f14;
                    getinterfacedescriptor.I$1 = i9;
                    getinterfacedescriptor.I$2 = i10;
                    getinterfacedescriptor.label = 6;
                    objOnExtraCallback = iAuthTabCallback6.onExtraCallback("getOverview", writetypedobject2, getinterfacedescriptor);
                    if (objOnExtraCallback != objOnWarmupCompleted2) {
                    }
                    return objOnWarmupCompleted2;
                } catch (Exception e72) {
                    exc = e72;
                    i2 = i28;
                    iAuthTabCallback3 = iAuthTabCallback21;
                    obj = "appWidgetId";
                    obj2 = "function";
                    displaySetting2 = displaySetting16;
                    f3 = f34;
                    f5 = f3;
                    Result.Companion companion222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                    f7 = f5;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                } catch (WebResourceResponseModel e73) {
                    webResourceResponseModel = e73;
                    i2 = i28;
                    iAuthTabCallback3 = iAuthTabCallback21;
                    obj = "appWidgetId";
                    obj2 = "function";
                    displaySetting2 = displaySetting16;
                    f4 = f34;
                    f8 = f4;
                    Result.Companion companion322222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    f7 = f8;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                }
            case 6:
                int i48 = getinterfacedescriptor.I$2;
                i11 = getinterfacedescriptor.I$1;
                float f35 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                account2 = (AccountSections.Account) getinterfacedescriptor.L$4;
                access13800Var2 = (access13800) getinterfacedescriptor.L$3;
                iAuthTabCallback6 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting17 = (DisplaySetting) getinterfacedescriptor.L$1;
                context3 = (Context) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                obj = "appWidgetId";
                objOnExtraCallback = objOnExtraCallback5;
                i10 = i48;
                displaySetting10 = displaySetting17;
                f17 = f35;
                onextracallback = (onExtraCallback) objOnExtraCallback;
                if (onextracallback != null) {
                }
                break;
            case 7:
                int i49 = getinterfacedescriptor.I$2;
                int i50 = getinterfacedescriptor.I$1;
                float f36 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                onExtraCallback onextracallback8 = (onExtraCallback) getinterfacedescriptor.L$5;
                AccountSections.Account account9 = (AccountSections.Account) getinterfacedescriptor.L$4;
                access13800<? super DisplaySetting> access13800Var6 = (access13800) getinterfacedescriptor.L$3;
                IAuthTabCallback iAuthTabCallback22 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                displaySetting2 = (DisplaySetting) getinterfacedescriptor.L$1;
                context4 = (Context) getinterfacedescriptor.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                    obj2 = "function";
                    i12 = i50;
                    i13 = i49;
                    obj = "appWidgetId";
                    onextracallback = onextracallback8;
                    account3 = account9;
                    access13800Var2 = access13800Var6;
                    iAuthTabCallback6 = iAuthTabCallback22;
                    f20 = f36;
                    zBooleanValue = ((Boolean) objOnExtraCallback5).booleanValue();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("show_amount_medium_");
                    sb2.append(i28);
                    string = sb2.toString();
                    DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback172 = (DiskLruCacheEditornewSink11.IAuthTabCallback) onWarmupCompleted(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), new Object[]{this}, zzaq.onNavigationEvent(), 1198944754, zzaq.onNavigationEvent(), -1198944751);
                    KSerializer kSerializerOnExtraCallback2 = sp.onExtraCallback(BooleanCompanionObject.INSTANCE);
                    getinterfacedescriptor.L$0 = context4;
                    getinterfacedescriptor.L$1 = displaySetting2;
                    getinterfacedescriptor.L$2 = iAuthTabCallback6;
                    context5 = context4;
                    getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var2);
                    getinterfacedescriptor.L$4 = account3;
                    getinterfacedescriptor.L$5 = onextracallback;
                    getinterfacedescriptor.L$6 = string;
                    getinterfacedescriptor.I$0 = i28;
                    getinterfacedescriptor.F$0 = f20;
                    getinterfacedescriptor.I$1 = i12;
                    getinterfacedescriptor.I$2 = i13;
                    getinterfacedescriptor.Z$0 = zBooleanValue;
                    getinterfacedescriptor.label = 8;
                    objOnExtraCallback3 = iAuthTabCallback172.onExtraCallback(string, kSerializerOnExtraCallback2, getinterfacedescriptor);
                    objOnWarmupCompleted2 = objOnWarmupCompleted2;
                    if (objOnExtraCallback3 != objOnWarmupCompleted2) {
                    }
                } catch (Exception e74) {
                    exc = e74;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    iAuthTabCallback3 = iAuthTabCallback22;
                    f3 = f36;
                    f5 = f3;
                    Result.Companion companion2222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                    f7 = f5;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                } catch (WebResourceResponseModel e75) {
                    webResourceResponseModel = e75;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    iAuthTabCallback3 = iAuthTabCallback22;
                    f4 = f36;
                    f8 = f4;
                    Result.Companion companion3222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    f7 = f8;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                }
                break;
            case 8:
                boolean z10 = getinterfacedescriptor.Z$0;
                i13 = getinterfacedescriptor.I$2;
                i12 = getinterfacedescriptor.I$1;
                float f37 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                str = (String) getinterfacedescriptor.L$6;
                onExtraCallback onextracallback9 = (onExtraCallback) getinterfacedescriptor.L$5;
                account3 = (AccountSections.Account) getinterfacedescriptor.L$4;
                access13800<? super DisplaySetting> access13800Var7 = (access13800) getinterfacedescriptor.L$3;
                IAuthTabCallback iAuthTabCallback23 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting18 = (DisplaySetting) getinterfacedescriptor.L$1;
                context6 = (Context) getinterfacedescriptor.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                    obj5 = objOnExtraCallback5;
                    obj2 = "function";
                    access13800Var3 = access13800Var7;
                    zBooleanValue = z10;
                    displaySetting2 = displaySetting18;
                    obj = "appWidgetId";
                    onextracallback = onextracallback9;
                    iAuthTabCallback6 = iAuthTabCallback23;
                    f21 = f37;
                    bool = (Boolean) obj5;
                    if (bool != null) {
                    }
                } catch (WebResourceResponseModel e76) {
                    iAuthTabCallback3 = iAuthTabCallback23;
                    displaySetting2 = displaySetting18;
                    webResourceResponseModel = e76;
                    f32 = f37;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    f4 = f32;
                    f8 = f4;
                    Result.Companion companion32222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    f7 = f8;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                } catch (Exception e77) {
                    iAuthTabCallback3 = iAuthTabCallback23;
                    displaySetting2 = displaySetting18;
                    exc = e77;
                    f31 = f37;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    f3 = f31;
                    f5 = f3;
                    Result.Companion companion22222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                    f7 = f5;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                }
                break;
            case 9:
                boolean z11 = getinterfacedescriptor.Z$0;
                i13 = getinterfacedescriptor.I$2;
                i12 = getinterfacedescriptor.I$1;
                float f38 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                bool2 = (Boolean) getinterfacedescriptor.L$7;
                String str7 = (String) getinterfacedescriptor.L$6;
                onextracallback2 = (onExtraCallback) getinterfacedescriptor.L$5;
                AccountSections.Account account10 = (AccountSections.Account) getinterfacedescriptor.L$4;
                access13800<? super DisplaySetting> access13800Var8 = (access13800) getinterfacedescriptor.L$3;
                IAuthTabCallback iAuthTabCallback24 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting19 = (DisplaySetting) getinterfacedescriptor.L$1;
                context6 = (Context) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                iAuthTabCallback11 = iAuthTabCallback24;
                obj7 = objOnWarmupCompleted2;
                str2 = str7;
                zBooleanValue = z11;
                obj = "appWidgetId";
                account4 = account10;
                displaySetting2 = displaySetting19;
                obj2 = "function";
                access13800Var3 = access13800Var8;
                f23 = f38;
                q8a q8aVar42 = q8a.onNavigationEvent;
                boolean zBooleanValue32 = bool2.booleanValue();
                getinterfacedescriptor.L$0 = context6;
                getinterfacedescriptor.L$1 = displaySetting2;
                getinterfacedescriptor.L$2 = iAuthTabCallback11;
                iAuthTabCallback5 = iAuthTabCallback11;
                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var3);
                getinterfacedescriptor.L$4 = account4;
                getinterfacedescriptor.L$5 = onextracallback2;
                getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str2);
                getinterfacedescriptor.L$7 = bool2;
                getinterfacedescriptor.I$0 = i28;
                getinterfacedescriptor.F$0 = f23;
                getinterfacedescriptor.I$1 = i12;
                getinterfacedescriptor.I$2 = i13;
                getinterfacedescriptor.Z$0 = zBooleanValue;
                getinterfacedescriptor.label = 10;
                objOnNavigationEvent = q8aVar42.onNavigationEvent(i28, zBooleanValue32, (access13800<? super Unit>) getinterfacedescriptor);
                obj8 = obj7;
                if (objOnNavigationEvent != obj8) {
                }
                obj11 = obj8;
                return obj11;
            case 10:
                boolean z12 = getinterfacedescriptor.Z$0;
                i13 = getinterfacedescriptor.I$2;
                i12 = getinterfacedescriptor.I$1;
                float f39 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                bool2 = (Boolean) getinterfacedescriptor.L$7;
                String str8 = (String) getinterfacedescriptor.L$6;
                onextracallback2 = (onExtraCallback) getinterfacedescriptor.L$5;
                AccountSections.Account account11 = (AccountSections.Account) getinterfacedescriptor.L$4;
                access13800<? super DisplaySetting> access13800Var9 = (access13800) getinterfacedescriptor.L$3;
                IAuthTabCallback iAuthTabCallback25 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting20 = (DisplaySetting) getinterfacedescriptor.L$1;
                Context context17 = (Context) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                iAuthTabCallback5 = iAuthTabCallback25;
                context9 = context17;
                z = z12;
                obj = "appWidgetId";
                account4 = account11;
                displaySetting2 = displaySetting20;
                obj2 = "function";
                access13800Var3 = access13800Var9;
                obj8 = objOnWarmupCompleted2;
                str2 = str8;
                f24 = f39;
                boolean zBooleanValue42 = bool2.booleanValue();
                obj10 = obj8;
                bool4 = bool2;
                account5 = account4;
                f25 = f24 == true ? 1 : 0;
                context10 = context9;
                onextracallback4 = onextracallback2;
                str3 = str2;
                i20 = i12;
                i19 = i13;
                int i362 = i28;
                z2 = z;
                displaySetting11 = displaySetting2;
                access13800Var4 = access13800Var3;
                i21 = i362;
                IAuthTabCallback iAuthTabCallback182 = iAuthTabCallback5;
                zBooleanValue2 = zBooleanValue42;
                iAuthTabCallback15 = iAuthTabCallback182;
                currencyIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                int i34222 = i19;
                boolean z7222 = z2;
                r4Var = this;
                currencyOnExtraCallback = onExtraCallback(r4Var, currencyIAuthTabCallbackStub, onextracallback4);
                int i35222 = i20;
                strOnExtraCallback = onExtraCallback(this);
                i22 = i21;
                r2externalsyntheticlambda1OnNavigationEvent = onNavigationEvent(this);
                hiddenStockIAuthTabCallback = onextracallback4.IAuthTabCallback();
                if (hiddenStockIAuthTabCallback != null) {
                }
                ICustomTabsCallback iCustomTabsCallback222 = r4Var.new ICustomTabsCallback(null);
                getinterfacedescriptor.L$0 = context10;
                getinterfacedescriptor.L$1 = displaySetting11;
                getinterfacedescriptor.L$2 = iAuthTabCallback15;
                getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var4);
                getinterfacedescriptor.L$4 = account5;
                getinterfacedescriptor.L$5 = onextracallback4;
                getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str3);
                getinterfacedescriptor.L$7 = access15400.onNavigationEvent(bool4);
                getinterfacedescriptor.L$8 = currencyIAuthTabCallbackStub;
                currency2 = currency;
                getinterfacedescriptor.L$9 = currency2;
                getinterfacedescriptor.L$10 = strOnExtraCallback;
                r2ExternalSyntheticLambda1 r2externalsyntheticlambda13222 = r2externalsyntheticlambda1;
                getinterfacedescriptor.L$11 = r2externalsyntheticlambda13222;
                i3 = i22;
                getinterfacedescriptor.I$0 = i3;
                getinterfacedescriptor.F$0 = f25;
                getinterfacedescriptor.I$1 = i35222;
                getinterfacedescriptor.I$2 = i34222;
                z3 = z7222;
                getinterfacedescriptor.Z$0 = z3;
                onExtraCallback onextracallback7222 = onextracallback4;
                boolean z8222 = zBooleanValue2;
                getinterfacedescriptor.Z$1 = z8222;
                getinterfacedescriptor.label = 13;
                objOnExtraCallback4 = iAuthTabCallback15.onExtraCallback("getSelectedSortingType", iCustomTabsCallback222, getinterfacedescriptor);
                obj11 = obj10;
                if (objOnExtraCallback4 != obj11) {
                }
                return obj11;
            case 11:
                boolean z13 = getinterfacedescriptor.Z$0;
                int i51 = getinterfacedescriptor.I$2;
                int i52 = getinterfacedescriptor.I$1;
                float f40 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                Boolean bool6 = (Boolean) getinterfacedescriptor.L$7;
                String str9 = (String) getinterfacedescriptor.L$6;
                onExtraCallback onextracallback10 = (onExtraCallback) getinterfacedescriptor.L$5;
                AccountSections.Account account12 = (AccountSections.Account) getinterfacedescriptor.L$4;
                access13800<? super DisplaySetting> access13800Var10 = (access13800) getinterfacedescriptor.L$3;
                IAuthTabCallback iAuthTabCallback26 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting21 = (DisplaySetting) getinterfacedescriptor.L$1;
                context8 = (Context) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                iAuthTabCallback12 = iAuthTabCallback26;
                obj10 = objOnWarmupCompleted2;
                f22 = f40;
                i18 = i52;
                i19 = i51;
                obj9 = objOnExtraCallback5;
                zBooleanValue = z13;
                obj = "appWidgetId";
                bool3 = bool6;
                account5 = account12;
                displaySetting2 = displaySetting21;
                obj2 = "function";
                access13800Var3 = access13800Var10;
                str3 = str9;
                onextracallback3 = onextracallback10;
                bool5 = (Boolean) obj9;
                if (bool5 == null) {
                }
                break;
            case 12:
                boolean z14 = getinterfacedescriptor.Z$0;
                int i53 = getinterfacedescriptor.I$2;
                int i54 = getinterfacedescriptor.I$1;
                r7 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                bool4 = (Boolean) getinterfacedescriptor.L$7;
                str3 = (String) getinterfacedescriptor.L$6;
                onextracallback5 = (onExtraCallback) getinterfacedescriptor.L$5;
                account5 = (AccountSections.Account) getinterfacedescriptor.L$4;
                access13800<? super DisplaySetting> access13800Var11 = (access13800) getinterfacedescriptor.L$3;
                iAuthTabCallback = (IAuthTabCallback) getinterfacedescriptor.L$2;
                DisplaySetting displaySetting22 = (DisplaySetting) getinterfacedescriptor.L$1;
                Context context18 = (Context) getinterfacedescriptor.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                    zBooleanValue = z14;
                    obj12 = objOnWarmupCompleted2;
                    iAuthTabCallback9 = iAuthTabCallback;
                    f22 = r7;
                    obj = "appWidgetId";
                    i18 = i54;
                    i19 = i53;
                    context11 = context18;
                    displaySetting11 = displaySetting22;
                    obj2 = "function";
                    access13800Var3 = access13800Var11;
                    obj10 = obj12;
                    f25 = f22;
                    onextracallback4 = onextracallback5;
                    i20 = i18;
                    access13800Var4 = access13800Var3;
                    context10 = context11;
                    i21 = i28;
                    z2 = zBooleanValue;
                    iAuthTabCallback15 = iAuthTabCallback9;
                    zBooleanValue2 = true;
                    currencyIAuthTabCallbackStub = IAuthTabCallbackStub(this);
                    int i342222 = i19;
                    boolean z72222 = z2;
                    r4Var = this;
                    currencyOnExtraCallback = onExtraCallback(r4Var, currencyIAuthTabCallbackStub, onextracallback4);
                    int i352222 = i20;
                    strOnExtraCallback = onExtraCallback(this);
                    i22 = i21;
                    r2externalsyntheticlambda1OnNavigationEvent = onNavigationEvent(this);
                    hiddenStockIAuthTabCallback = onextracallback4.IAuthTabCallback();
                    if (hiddenStockIAuthTabCallback != null) {
                    }
                    ICustomTabsCallback iCustomTabsCallback2222 = r4Var.new ICustomTabsCallback(null);
                    getinterfacedescriptor.L$0 = context10;
                    getinterfacedescriptor.L$1 = displaySetting11;
                    getinterfacedescriptor.L$2 = iAuthTabCallback15;
                    getinterfacedescriptor.L$3 = access15400.onNavigationEvent(access13800Var4);
                    getinterfacedescriptor.L$4 = account5;
                    getinterfacedescriptor.L$5 = onextracallback4;
                    getinterfacedescriptor.L$6 = access15400.onNavigationEvent(str3);
                    getinterfacedescriptor.L$7 = access15400.onNavigationEvent(bool4);
                    getinterfacedescriptor.L$8 = currencyIAuthTabCallbackStub;
                    currency2 = currency;
                    getinterfacedescriptor.L$9 = currency2;
                    getinterfacedescriptor.L$10 = strOnExtraCallback;
                    r2ExternalSyntheticLambda1 r2externalsyntheticlambda132222 = r2externalsyntheticlambda1;
                    getinterfacedescriptor.L$11 = r2externalsyntheticlambda132222;
                    i3 = i22;
                    getinterfacedescriptor.I$0 = i3;
                    getinterfacedescriptor.F$0 = f25;
                    getinterfacedescriptor.I$1 = i352222;
                    getinterfacedescriptor.I$2 = i342222;
                    z3 = z72222;
                    getinterfacedescriptor.Z$0 = z3;
                    onExtraCallback onextracallback72222 = onextracallback4;
                    boolean z82222 = zBooleanValue2;
                    getinterfacedescriptor.Z$1 = z82222;
                    getinterfacedescriptor.label = 13;
                    objOnExtraCallback4 = iAuthTabCallback15.onExtraCallback("getSelectedSortingType", iCustomTabsCallback2222, getinterfacedescriptor);
                    obj11 = obj10;
                    if (objOnExtraCallback4 != obj11) {
                    }
                    return obj11;
                } catch (WebResourceResponseModel e78) {
                    e = e78;
                    webResourceResponseModel2 = e;
                    displaySetting5 = displaySetting22;
                    obj2 = "function";
                    iAuthTabCallback5 = iAuthTabCallback;
                    obj = "appWidgetId";
                    f2 = r7;
                    displaySetting2 = displaySetting5;
                    webResourceResponseModel = webResourceResponseModel2;
                    i3 = i28;
                    iAuthTabCallback3 = iAuthTabCallback5;
                    f9 = f2;
                    i2 = i3;
                    f8 = f9;
                    Result.Companion companion322222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    f7 = f8;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                } catch (Exception e79) {
                    e = e79;
                    exc2 = e;
                    displaySetting4 = displaySetting22;
                    obj2 = "function";
                    iAuthTabCallback5 = iAuthTabCallback;
                    obj = "appWidgetId";
                    f = r7;
                    displaySetting2 = displaySetting4;
                    exc = exc2;
                    i3 = i28;
                    iAuthTabCallback3 = iAuthTabCallback5;
                    f6 = f;
                    i2 = i3;
                    f5 = f6;
                    Result.Companion companion222222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                    f7 = f5;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                }
            case 13:
                boolean z15 = getinterfacedescriptor.Z$1;
                boolean z16 = getinterfacedescriptor.Z$0;
                f13 = getinterfacedescriptor.F$0;
                i28 = getinterfacedescriptor.I$0;
                r2ExternalSyntheticLambda1 r2externalsyntheticlambda14 = (r2ExternalSyntheticLambda1) getinterfacedescriptor.L$11;
                String str10 = (String) getinterfacedescriptor.L$10;
                Currency currency4 = (Currency) getinterfacedescriptor.L$9;
                currency3 = (Currency) getinterfacedescriptor.L$8;
                onExtraCallback onextracallback11 = (onExtraCallback) getinterfacedescriptor.L$5;
                account6 = (AccountSections.Account) getinterfacedescriptor.L$4;
                IAuthTabCallback iAuthTabCallback27 = (IAuthTabCallback) getinterfacedescriptor.L$2;
                displaySetting11 = (DisplaySetting) getinterfacedescriptor.L$1;
                context12 = (Context) getinterfacedescriptor.L$0;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                    z4 = z15;
                    r2externalsyntheticlambda12 = r2externalsyntheticlambda14;
                    obj = "appWidgetId";
                    obj2 = "function";
                    str4 = str10;
                    z3 = z16;
                    currency2 = currency4;
                    onextracallback6 = onextracallback11;
                    i3 = i28;
                    r4Var = this;
                    objOnExtraCallback4 = objOnExtraCallback5;
                    iAuthTabCallback15 = iAuthTabCallback27;
                    r2ExternalSyntheticLambda2 r2externalsyntheticlambda22 = (r2ExternalSyntheticLambda2) objOnExtraCallback4;
                    if (r2b.onExtraCallback(onextracallback6.access000(), r2externalsyntheticlambda22).IAuthTabCallback() != r2ExternalSyntheticLambda2.IAuthTabCallbackDefault.DAILY_PROFIT) {
                    }
                    List<OverviewMediumListItem> listIAuthTabCallback2 = onextracallback6.IAuthTabCallback(currency3, z3, 100, r2externalsyntheticlambda22);
                    ArrayList arrayList3 = new ArrayList();
                    while (r1.hasNext()) {
                    }
                    Triple tripleOnWarmupCompleted2 = onWarmupCompleted(r4Var, context12, onextracallback6, z3, currency2);
                    String str52 = (String) tripleOnWarmupCompleted2.onExtraCallbackWithResult();
                    checkDuration checkduration2 = (checkDuration) tripleOnWarmupCompleted2.onExtraCallback();
                    String str62 = (String) tripleOnWarmupCompleted2.IAuthTabCallback();
                    ArrayList arrayList22 = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    OverviewUiData overviewUiData2 = new OverviewUiData((OverviewPrice) null, (OverviewPrice) null, (OverviewPrice) null, str52, str62, checkduration2, access14000.onNavigationEvent(onextracallback6.onExtraCallbackWithResult()), (List) onExtraCallback.onExtraCallbackWithResult(new Object[]{onextracallback6}, -1481187999, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1481188000, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted()), onextracallback6.access100(), onextracallback6.getInterfaceDescriptor(), (OverviewPrice) null, (OverviewPrice) null, (OverviewRate) null, arrayList3, listIAuthTabCallback2, 7175, (DefaultConstructorMarker) null);
                    String strAsInterface22 = account6.asInterface();
                    if (account6.onTransact().isChildAccount()) {
                    }
                    OverviewMediumWidgetState success2 = new OverviewMediumWidgetState.Success(displaySetting11, f13, account6.onWarmupCompleted(), overviewUiData2, str4, arrayList22, currency2, currency3, z3, z4, strAsInterface22, hostnamesKt2, r2externalsyntheticlambda12, z9);
                    displaySetting6 = displaySetting11;
                    iAuthTabCallback3 = iAuthTabCallback15;
                    maintenance2 = success2;
                    f30 = f13;
                    maintenance = Result.constructor-impl(maintenance2);
                    f10 = f30;
                } catch (WebResourceResponseModel e80) {
                    e = e80;
                    iAuthTabCallback8 = iAuthTabCallback27;
                    webResourceResponseModel = e;
                    displaySetting2 = displaySetting11;
                    iAuthTabCallback3 = iAuthTabCallback8;
                    f32 = f13;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    f4 = f32;
                    f8 = f4;
                    Result.Companion companion3222222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(webResourceResponseModel));
                    f7 = f8;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                } catch (Exception e81) {
                    e = e81;
                    iAuthTabCallback7 = iAuthTabCallback27;
                    exc = e;
                    int i442 = access100 + 81;
                    ICustomTabsCallback = i442 % 128;
                    int i452 = i442 % 2;
                    displaySetting2 = displaySetting11;
                    iAuthTabCallback3 = iAuthTabCallback7;
                    f31 = f13;
                    i2 = i28;
                    obj = "appWidgetId";
                    obj2 = "function";
                    f3 = f31;
                    f5 = f3;
                    Result.Companion companion2222222222222222222222222 = Result.Companion;
                    obj3 = Result.constructor-impl(ResultKt.createFailure(exc));
                    f7 = f5;
                    i3 = i2;
                    maintenance = obj3;
                    displaySetting6 = displaySetting2;
                    f10 = f7;
                    th = Result.exceptionOrNull-impl(maintenance);
                    if (th != 0) {
                    }
                    return (OverviewMediumWidgetState) maintenance;
                }
                th = Result.exceptionOrNull-impl(maintenance);
                if (th != 0) {
                }
                return (OverviewMediumWidgetState) maintenance;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (r11 == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(int i, access13800<? super AccountSections.Account> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        Object objOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 125;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = access13800Var instanceof onExtraCallbackWithResult;
            throw null;
        }
        if (!(access13800Var instanceof onExtraCallbackWithResult)) {
            onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
        } else {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = ICustomTabsCallback + 119;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                onextracallbackwithresult.label = i4 - 2147483648;
            }
        }
        Object objOnExtraCallback2 = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback2);
            DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = this.asBinder;
            String strIAuthTabCallback = Companion.IAuthTabCallback(i);
            KSerializer<AccountSections.Account> kSerializerSerializer = AccountSections.Account.Companion.serializer();
            onextracallbackwithresult.I$0 = i;
            onextracallbackwithresult.label = 1;
            objOnExtraCallback2 = iAuthTabCallback.onExtraCallback(strIAuthTabCallback, kSerializerSerializer, onextracallbackwithresult);
            if (objOnExtraCallback2 != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i7 != 1) {
            int i8 = ICustomTabsCallback + 15;
            int i9 = i8 % 128;
            access100 = i9;
            if (i8 % 2 == 0 ? i7 != 2 : i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = i9 + 91;
            ICustomTabsCallback = i10 % 128;
            int i11 = i10 % 2;
            i = onextracallbackwithresult.I$0;
            ResultKt.onNavigationEvent(objOnExtraCallback2);
            objOnExtraCallback = ((Result) objOnExtraCallback2).onNavigationEvent();
            ResultKt.onNavigationEvent(objOnExtraCallback);
            Account accountOnExtraCallbackWithResult = ((AccountList) objOnExtraCallback).onExtraCallbackWithResult();
            if (accountOnExtraCallbackWithResult != null) {
                return new AccountSections.Account(true, accountOnExtraCallbackWithResult.IAuthTabCallbackStub(), accountOnExtraCallbackWithResult.IAuthTabCallbackDefault(), accountOnExtraCallbackWithResult.onNavigationEvent(), accountOnExtraCallbackWithResult.asInterface(), accountOnExtraCallbackWithResult.IAuthTabCallback(), accountOnExtraCallbackWithResult.onExtraCallbackWithResult(), null);
            }
            throw new IllegalStateException("Account is null for appWidgetId: " + i);
        }
        i = onextracallbackwithresult.I$0;
        ResultKt.onNavigationEvent(objOnExtraCallback2);
        AccountSections.Account account = (AccountSections.Account) objOnExtraCallback2;
        if (account != null) {
            return account;
        }
        int i12 = access100 + 53;
        ICustomTabsCallback = i12 % 128;
        int i13 = i12 % 2;
        r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = this.onExtraCallback;
        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(this);
        onextracallbackwithresult.I$0 = i;
        onextracallbackwithresult.I$1 = 0;
        onextracallbackwithresult.label = 2;
        objOnExtraCallback = r8lambdaws9z36z_nyqlya8ut2rf642vcso.onExtraCallback(onextracallbackwithresult);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(int i, access13800<? super DisplaySetting> access13800Var) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        int i2 = 2 % 2;
        if (!(access13800Var instanceof IAuthTabCallbackDefault)) {
            iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            int i3 = access100 + 113;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = access100 + 111;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = ((IAuthTabCallbackDefault) access13800Var).label;
                throw null;
            }
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i7 = iAuthTabCallbackDefault.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackDefault.label = i7 - 2147483648;
            }
        }
        Object objOnExtraCallback = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = iAuthTabCallbackDefault.label;
        if (i8 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            iAuthTabCallbackDefault.I$0 = i;
            iAuthTabCallbackDefault.label = 1;
            objOnExtraCallback = this.asBinder.onExtraCallback("display_setting_" + i, kSerializerSerializer, iAuthTabCallbackDefault);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i9 = access100 + 57;
                ICustomTabsCallback = i9 % 128;
                int i10 = i9 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        DisplaySetting displaySetting = (DisplaySetting) objOnExtraCallback;
        if (displaySetting != null) {
            return displaySetting;
        }
        int i11 = access100 + 65;
        ICustomTabsCallback = i11 % 128;
        int i12 = i11 % 2;
        return this.onWarmupCompleted.onNavigationEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(int i, access13800<? super Float> access13800Var) {
        asBinder asbinder;
        float fFloatValue;
        int i2 = 2 % 2;
        if (access13800Var instanceof asBinder) {
            int i3 = access100 + 5;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = ((asBinder) access13800Var).label;
                throw null;
            }
            asbinder = (asBinder) access13800Var;
            int i5 = asbinder.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i5 - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object objOnExtraCallback = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = asbinder.label;
        if (i6 != 0) {
            int i7 = access100 + 43;
            ICustomTabsCallback = i7 % 128;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            KSerializer kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
            asbinder.I$0 = i;
            asbinder.label = 1;
            objOnExtraCallback = this.asBinder.onExtraCallback("alpha_" + i, kSerializerOnWarmupCompleted, asbinder);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Float f = (Float) objOnExtraCallback;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            int i8 = ICustomTabsCallback + 77;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            fFloatValue = 1.0f;
        }
        return access14000.onExtraCallbackWithResult(fFloatValue);
    }

    static /* synthetic */ Object onExtraCallback(r4 r4Var, AccountSections.Account account, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100 + 69;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 7;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 95;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        Object[] objArr = {r4Var, account, Boolean.valueOf(z), access13800Var};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, objArr, zzaq.onNavigationEvent(), -661480440, iOnNavigationEvent2, 661480441);
    }

    private static final getIconImageResource onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getIconImageResource geticonimageresource = (getIconImageResource) function1.invoke(obj);
        int i4 = ICustomTabsCallback + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return geticonimageresource;
    }

    private static final getIconImageResource onExtraCallback(boolean z, r4 r4Var, AccountSections.Account account, String str) {
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getIconImageResource.onExtraCallback onextracallback = getIconImageResource.Companion;
        if (z) {
            int i2 = ICustomTabsCallback + 17;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            str2 = "folderOverviewV2";
        } else {
            str2 = "overviewV1";
        }
        asInterface asinterface = new asInterface(z, r4Var, account, null);
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        getIconImageResource geticonimageresourceIAuthTabCallback = getIconImageResource.onExtraCallback.IAuthTabCallback(onextracallback, str2, asinterface, (Object) null, setLogBuffers.onWarmupCompleted(setCommandLine.onWarmupCompleted(5, setRevision.SECONDS)), 4, (Object) null);
        int i4 = access100 + 39;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return geticonimageresourceIAuthTabCallback;
    }

    static final class asInterface extends SuspendLambda implements Function1<access13800<? super Result<? extends onExtraCallback>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ AccountSections.Account $account;
        final /* synthetic */ boolean $isFolderGroupMode;
        int label;
        final /* synthetic */ r4 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(boolean z, r4 r4Var, AccountSections.Account account, access13800<? super asInterface> access13800Var) {
            super(1, access13800Var);
            this.$isFolderGroupMode = z;
            this.this$0 = r4Var;
            this.$account = account;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$isFolderGroupMode, this.this$0, this.$account, access13800Var);
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 95 / 0;
            }
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            int i5 = IAuthTabCallback + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 37 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super Result<onExtraCallback>> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 71 / 0;
            } else {
                objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        
            if (r7 != r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
        
            if (r7 == r1) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[PHI: r1
          0x0054: PHI (r1v20 java.lang.Object) = (r1v4 java.lang.Object), (r1v21 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r4
          0x0025: PHI (r4v1 int) = (r4v0 int), (r4v5 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            Object objOnNavigationEvent;
            Object objOnNavigationEvent2;
            Object obj2;
            OverviewAccounts.Overview overview;
            FolderOverviewAccounts.Overview overview2;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 111;
            IAuthTabCallback = i3 % 128;
            onExtraCallback onextracallbackIAuthTabCallback = null;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 86 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (this.$isFolderGroupMode) {
                        int i5 = onExtraCallback + 69;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAsBinder = r4.asBinder(this.this$0);
                        String strOnWarmupCompleted = this.$account.onWarmupCompleted();
                        this.label = 1;
                        objOnNavigationEvent2 = r8lambdakeemxoi4two_xjjc4c2vgm4dauAsBinder.IAuthTabCallback(strOnWarmupCompleted, this);
                    } else {
                        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAsBinder2 = r4.asBinder(this.this$0);
                        List<String> listListOf = CollectionsKt.listOf(this.$account.onWarmupCompleted());
                        this.label = 2;
                        objOnNavigationEvent = r8lambdakeemxoi4two_xjjc4c2vgm4dauAsBinder2.onExtraCallbackWithResult(listListOf, this);
                    }
                    return objOnWarmupCompleted;
                }
                int i7 = onExtraCallback + 119;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0 ? i == 1 : i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent2 = ((Result) obj).onNavigationEvent();
                    if (Result.onNavigationEvent(objOnNavigationEvent2)) {
                        int i8 = onExtraCallback + 1;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Result.Companion companion = Result.Companion;
                        List<FolderOverviewAccounts.Overview> listIAuthTabCallback = ((FolderOverviewAccounts) objOnNavigationEvent2).IAuthTabCallback();
                        if (listIAuthTabCallback != null && (overview2 = (FolderOverviewAccounts.Overview) CollectionsKt.firstOrNull(listIAuthTabCallback)) != null) {
                            int i10 = IAuthTabCallback + 51;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 == 0) {
                                onExtraCallback.Companion.onNavigationEvent(overview2);
                                onextracallbackIAuthTabCallback.hashCode();
                                throw null;
                            }
                            onextracallbackIAuthTabCallback = onExtraCallback.Companion.onNavigationEvent(overview2);
                        }
                        obj2 = Result.constructor-impl(onextracallbackIAuthTabCallback);
                    } else {
                        obj2 = Result.constructor-impl(objOnNavigationEvent2);
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                    if (Result.onNavigationEvent(objOnNavigationEvent)) {
                        Result.Companion companion2 = Result.Companion;
                        List<OverviewAccounts.Overview> listOnWarmupCompleted = ((OverviewAccounts) objOnNavigationEvent).onWarmupCompleted();
                        if (listOnWarmupCompleted != null && (overview = (OverviewAccounts.Overview) CollectionsKt.firstOrNull(listOnWarmupCompleted)) != null) {
                            onextracallbackIAuthTabCallback = onExtraCallback.Companion.IAuthTabCallback(overview);
                        }
                        obj2 = Result.constructor-impl(onextracallbackIAuthTabCallback);
                    } else {
                        obj2 = Result.constructor-impl(objOnNavigationEvent);
                        int i11 = onExtraCallback + 67;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Result.IAuthTabCallback(obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r13 != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        if (r13 != r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        final ?? r13;
        StringBuilder sb;
        String str;
        final r4 r4Var = (r4) objArr[0];
        final AccountSections.Account account = (AccountSections.Account) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        IAuthTabCallbackStub iAuthTabCallbackStub2 = (access13800) objArr[3];
        int i = 2 % 2;
        if (iAuthTabCallbackStub2 instanceof IAuthTabCallbackStub) {
            int i2 = access100 + 59;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackStub = iAuthTabCallbackStub2;
            int i4 = iAuthTabCallbackStub.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = access100 + 83;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    iAuthTabCallbackStub.label = i4 / Integer.MIN_VALUE;
                } else {
                    iAuthTabCallbackStub.label = i4 - 2147483648;
                }
            } else {
                iAuthTabCallbackStub = r4Var.new IAuthTabCallbackStub(iAuthTabCallbackStub2);
            }
        }
        Object objOnNavigationEvent = iAuthTabCallbackStub.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = iAuthTabCallbackStub.label;
        if (i6 != 0) {
            int i7 = access100 + 35;
            int i8 = i7 % 128;
            ICustomTabsCallback = i8;
            int i9 = i7 % 2;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i8 + 13;
                access100 = i10 % 128;
                if (i10 % 2 != 0) {
                    ResultKt.onNavigationEvent(objOnNavigationEvent);
                    throw null;
                }
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                Object objOnNavigationEvent2 = ((Result) objOnNavigationEvent).onNavigationEvent();
                ResultKt.onNavigationEvent(objOnNavigationEvent2);
                return objOnNavigationEvent2;
            }
            zBooleanValue = iAuthTabCallbackStub.Z$0;
            account = (AccountSections.Account) iAuthTabCallbackStub.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        } else {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            if (zBooleanValue) {
                iAuthTabCallbackStub.L$0 = account;
                iAuthTabCallbackStub.Z$0 = zBooleanValue;
                iAuthTabCallbackStub.label = 1;
                objOnNavigationEvent = r4Var.onNavigationEvent((access13800<? super Boolean>) iAuthTabCallbackStub);
            }
            int i11 = access100 + 87;
            ICustomTabsCallback = i11 % 128;
            int i12 = i11 % 2;
            r13 = 0;
            String strOnWarmupCompleted = account.onWarmupCompleted();
            if (r13 == 0) {
                sb = new StringBuilder();
                str = "folder:";
            } else {
                sb = new StringBuilder();
                str = "market:";
            }
            sb.append(str);
            sb.append(strOnWarmupCompleted);
            String string = sb.toString();
            ConcurrentHashMap<String, getIconImageResource<Result<onExtraCallback>>> concurrentHashMap = r4Var.onTransact;
            final Function1 function1 = new Function1() { // from class: im.toss.securities.widget.overview.data.OverviewRepository$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 41;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    getIconImageResource geticonimageresourceOnWarmupCompleted = r4.onWarmupCompleted(r13, r4Var, account, (String) obj);
                    int i16 = onWarmupCompleted + 13;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return geticonimageresourceOnWarmupCompleted;
                }
            };
            getIconImageResource<Result<onExtraCallback>> geticonimageresourceComputeIfAbsent = concurrentHashMap.computeIfAbsent(string, new Function() { // from class: im.toss.securities.widget.overview.data.OverviewRepository$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 97;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    getIconImageResource geticonimageresourceOnExtraCallbackWithResult = r4.onExtraCallbackWithResult(function1, obj);
                    int i16 = IAuthTabCallback + 97;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        return geticonimageresourceOnExtraCallbackWithResult;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            Intrinsics.checkNotNullExpressionValue(geticonimageresourceComputeIfAbsent, "");
            iAuthTabCallbackStub.L$0 = access15400.onNavigationEvent(account);
            iAuthTabCallbackStub.L$1 = access15400.onNavigationEvent(string);
            iAuthTabCallbackStub.Z$0 = zBooleanValue;
            iAuthTabCallbackStub.I$0 = r13;
            iAuthTabCallbackStub.label = 2;
            objOnNavigationEvent = getIconImageResource.IAuthTabCallback(geticonimageresourceComputeIfAbsent, false, iAuthTabCallbackStub, 1, (Object) null);
        }
        if (((Boolean) objOnNavigationEvent).booleanValue()) {
            r13 = 1;
        } else {
            int i112 = access100 + 87;
            ICustomTabsCallback = i112 % 128;
            int i122 = i112 % 2;
            r13 = 0;
        }
        String strOnWarmupCompleted2 = account.onWarmupCompleted();
        if (r13 == 0) {
        }
        sb.append(str);
        sb.append(strOnWarmupCompleted2);
        String string2 = sb.toString();
        ConcurrentHashMap<String, getIconImageResource<Result<onExtraCallback>>> concurrentHashMap2 = r4Var.onTransact;
        final Function1 function12 = new Function1() { // from class: im.toss.securities.widget.overview.data.OverviewRepository$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i13 = 2 % 2;
                int i14 = onExtraCallback + 41;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                getIconImageResource geticonimageresourceOnWarmupCompleted = r4.onWarmupCompleted(r13, r4Var, account, (String) obj);
                int i16 = onWarmupCompleted + 13;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                return geticonimageresourceOnWarmupCompleted;
            }
        };
        getIconImageResource<Result<onExtraCallback>> geticonimageresourceComputeIfAbsent2 = concurrentHashMap2.computeIfAbsent(string2, new Function() { // from class: im.toss.securities.widget.overview.data.OverviewRepository$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i13 = 2 % 2;
                int i14 = onExtraCallback + 97;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                getIconImageResource geticonimageresourceOnExtraCallbackWithResult = r4.onExtraCallbackWithResult(function12, obj);
                int i16 = IAuthTabCallback + 97;
                onExtraCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    return geticonimageresourceOnExtraCallbackWithResult;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(geticonimageresourceComputeIfAbsent2, "");
        iAuthTabCallbackStub.L$0 = access15400.onNavigationEvent(account);
        iAuthTabCallbackStub.L$1 = access15400.onNavigationEvent(string2);
        iAuthTabCallbackStub.Z$0 = zBooleanValue;
        iAuthTabCallbackStub.I$0 = r13;
        iAuthTabCallbackStub.label = 2;
        objOnNavigationEvent = getIconImageResource.IAuthTabCallback(geticonimageresourceComputeIfAbsent2, false, iAuthTabCallbackStub, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Boolean> access13800Var) {
        access000 access000Var;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        access100 = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
            if (!(!(access13800Var instanceof access000))) {
                access000Var = (access000) access13800Var;
                int i4 = access000Var.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    int i5 = ICustomTabsCallback + 93;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    access000Var.label = i4 - 2147483648;
                } else {
                    access000Var = new access000(access13800Var);
                }
            }
        } else if (access13800Var instanceof access000) {
        }
        Object objOnExtraCallbackWithResult = access000Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = access000Var.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            if (newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_3999)) {
                DiskLruCacheEntry diskLruCacheEntry = this.access000;
                CrossType.Native.Assets.onExtraCallback onextracallback = CrossType.Native.Assets.onExtraCallback.onWarmupCompleted;
                access000Var.label = 1;
                objOnExtraCallbackWithResult = diskLruCacheEntry.onExtraCallbackWithResult(onextracallback, access000Var);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    int i8 = ICustomTabsCallback + 119;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return access14000.onNavigationEvent(z);
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i10 = ICustomTabsCallback + 7;
        access100 = i10 % 128;
        int i11 = i10 % 2;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        if (objOnExtraCallbackWithResult == CrossType.Native.Assets.HoldingsGroupBy.FOLDER) {
            z = true;
        }
        return access14000.onNavigationEvent(z);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Currency currencyOnExtraCallback;
        r4 r4Var = (r4) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 61;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            currencyOnExtraCallback = Currency.Companion.onExtraCallback(r4Var.IAuthTabCallbackDefault.onExtraCallbackWithResult("@@dashboard/asset_currency", r4Var.IAuthTabCallback.onWarmupCompleted().name()));
            int i3 = 32 / 0;
        } else {
            currencyOnExtraCallback = Currency.Companion.onExtraCallback(r4Var.IAuthTabCallbackDefault.onExtraCallbackWithResult("@@dashboard/asset_currency", r4Var.IAuthTabCallback.onWarmupCompleted().name()));
        }
        int i4 = ICustomTabsCallback + 47;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return currencyOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Currency currency = (Currency) objArr[1];
        onExtraCallback onextracallback = (onExtraCallback) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Currency currency2 = Currency.USD;
            if (currency == currency2) {
                int i3 = ICustomTabsCallback + 39;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    onextracallback.onExtraCallbackWithResult();
                    throw null;
                }
                if (!onextracallback.onExtraCallbackWithResult()) {
                    int i4 = access100 + 73;
                    ICustomTabsCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return currency2;
                }
            }
            Currency currency3 = Currency.KRW;
            int i6 = ICustomTabsCallback + 13;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 26 / 0;
            }
            return currency3;
        }
        Currency currency4 = Currency.USD;
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        r4 r4Var = (r4) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = ((ZonedDateTime) isCivilized.onNavigationEvent(new Object[]{isCivilized.onWarmupCompleted, Long.valueOf(r4Var.IAuthTabCallbackStubProxy.IAuthTabCallbackDefault())}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1325193441, -1325193441)).format(DateTimeFormatter.ofPattern("HH:mm 기준", Locale.KOREAN));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = ICustomTabsCallback + 11;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final r2ExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        if (Intrinsics.areEqual((Boolean) this.onNavigationEvent.onExtraCallbackWithResult().IAuthTabCallback(), Boolean.FALSE)) {
            int i2 = access100 + 121;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return r2ExternalSyntheticLambda1.CURRENT;
        }
        r2ExternalSyntheticLambda1 r2externalsyntheticlambda1 = r2ExternalSyntheticLambda1.MATURITY;
        int i4 = access100 + 103;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return r2externalsyntheticlambda1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8 == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(access13800<? super Boolean> access13800Var) {
        onTransact ontransact;
        int i = 2 % 2;
        Object obj = null;
        if (access13800Var instanceof onTransact) {
            int i2 = ICustomTabsCallback + 9;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((onTransact) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            ontransact = (onTransact) access13800Var;
            int i4 = ontransact.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ontransact.label = i4 - 2147483648;
            } else {
                ontransact = new onTransact(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = ontransact.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = ontransact.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            getIconImageResource<Unit> geticonimageresource = this.getInterfaceDescriptor;
            ontransact.label = 1;
            if (getIconImageResource.IAuthTabCallback(geticonimageresource, false, ontransact, 1, (Object) null) != objOnWarmupCompleted) {
            }
            int i6 = access100 + 57;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            return objOnWarmupCompleted;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            Boolean bool = (Boolean) objOnExtraCallbackWithResult;
            return access14000.onNavigationEvent(bool != null ? bool.booleanValue() : false);
        }
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        DiskLruCacheEntry diskLruCacheEntry = this.access000;
        CrossType.Remote.Shared.onExtraCallback onextracallback = CrossType.Remote.Shared.onExtraCallback.onWarmupCompleted;
        ontransact.label = 2;
        objOnExtraCallbackWithResult = diskLruCacheEntry.onExtraCallbackWithResult(onextracallback, ontransact);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r9 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[PHI: r4 r6
      0x0034: PHI (r4v9 o.r4$access100) = (r4v8 o.r4$access100), (r4v11 o.r4$access100) binds: [B:10:0x0032, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:10:0x0032, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        access100 access100Var;
        int i;
        r4 r4Var = (r4) objArr[0];
        access100 access100Var2 = (access13800) objArr[1];
        int i2 = 2 % 2;
        if (access100Var2 instanceof access100) {
            int i3 = ICustomTabsCallback + 39;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                access100Var = access100Var2;
                i = access100Var.label;
                int i4 = 65 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    access100Var.label = i - 2147483648;
                } else {
                    access100Var = r4Var.new access100(access100Var2);
                }
            } else {
                access100Var = access100Var2;
                i = access100Var.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnExtraCallbackWithResult = access100Var.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = access100Var.label;
        String value = null;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            getIconImageResource<Unit> geticonimageresource = r4Var.getInterfaceDescriptor;
            access100Var.label = 1;
            if (getIconImageResource.IAuthTabCallback(geticonimageresource, false, access100Var, 1, (Object) null) != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i5 != 1) {
            int i6 = ICustomTabsCallback + 9;
            access100 = i6 % 128;
            if (i6 % 2 == 0 ? i5 != 2 : i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            int i7 = access100 + 91;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            CrossType.Remote.Shared.LastSelectedShareHoldingsSortingRule lastSelectedShareHoldingsSortingRule = (CrossType.Remote.Shared.LastSelectedShareHoldingsSortingRule) objOnExtraCallbackWithResult;
            if (lastSelectedShareHoldingsSortingRule != null) {
                int i9 = ICustomTabsCallback + 71;
                access100 = i9 % 128;
                int i10 = i9 % 2;
                value = lastSelectedShareHoldingsSortingRule.getValue();
            }
            return r5.onExtraCallback(value);
        }
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        int i11 = ICustomTabsCallback + 117;
        access100 = i11 % 128;
        int i12 = i11 % 2;
        DiskLruCacheEntry diskLruCacheEntry = r4Var.access000;
        CrossType.Remote.Shared.IAuthTabCallbackDefault iAuthTabCallbackDefault = CrossType.Remote.Shared.IAuthTabCallbackDefault.onExtraCallback;
        access100Var.label = 2;
        objOnExtraCallbackWithResult = diskLruCacheEntry.onExtraCallbackWithResult(iAuthTabCallbackDefault, access100Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129 A[PHI: r10
      0x0129: PHI (r10v20 java.lang.Double) = (r10v19 java.lang.Double), (r10v22 java.lang.Double) binds: [B:65:0x0127, B:62:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Triple<String, checkDuration, String> onExtraCallback(Context context, onExtraCallback onextracallback, boolean z, Currency currency) {
        OverviewPrice overviewPriceOnExtraCallback;
        String strIAuthTabCallback;
        Double dIAuthTabCallback;
        Double dOnNavigationEvent;
        Double dOnNavigationEvent2;
        double dDoubleValue;
        checkDuration checkduration;
        Pair pairIAuthTabCallback;
        double dDoubleValue2;
        Double dIAuthTabCallback2;
        Double dIAuthTabCallback3;
        int i = 2 % 2;
        if (z) {
            overviewPriceOnExtraCallback = onextracallback.onNavigationEvent();
            if (overviewPriceOnExtraCallback == null) {
                overviewPriceOnExtraCallback = OverviewPrice.Companion.onNavigationEvent();
            }
        } else {
            overviewPriceOnExtraCallback = onextracallback.onExtraCallback();
            if (overviewPriceOnExtraCallback == null) {
                overviewPriceOnExtraCallback = OverviewPrice.Companion.onNavigationEvent();
            }
        }
        int[] iArr = onNavigationEvent.onExtraCallbackWithResult;
        int i2 = iArr[currency.ordinal()];
        if (i2 != 1) {
            int i3 = ICustomTabsCallback + 15;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Double dIAuthTabCallback4 = overviewPriceOnExtraCallback.IAuthTabCallback();
            double dDoubleValue3 = dIAuthTabCallback4 != null ? dIAuthTabCallback4.doubleValue() : 0.0d;
            Currency currency2 = Currency.KRW;
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            strIAuthTabCallback = isHealthy.IAuthTabCallback(Double.valueOf(dDoubleValue3), currency2, resources, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
        } else {
            Double dOnNavigationEvent3 = overviewPriceOnExtraCallback.onNavigationEvent();
            double dDoubleValue4 = dOnNavigationEvent3 != null ? dOnNavigationEvent3.doubleValue() : 0.0d;
            Currency currency3 = Currency.USD;
            Resources resources2 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            strIAuthTabCallback = isHealthy.IAuthTabCallback(Double.valueOf(dDoubleValue4), currency3, resources2, false, false, (DecimalFormat) null, (DecimalFormat) null, 60, (Object) null);
        }
        OverviewPrice overviewPriceIAuthTabCallbackDefault = z ? onextracallback.IAuthTabCallbackDefault() : (OverviewPrice) onExtraCallback.onExtraCallbackWithResult(new Object[]{onextracallback}, 48654879, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -48654877, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted());
        Object obj = null;
        if (z) {
            OverviewRate overviewRateOnTransact = onextracallback.onTransact();
            if (overviewRateOnTransact != null) {
                int i5 = access100 + 93;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    overviewRateOnTransact.onExtraCallbackWithResult();
                    throw null;
                }
                dIAuthTabCallback = overviewRateOnTransact.onExtraCallbackWithResult();
            } else {
                dIAuthTabCallback = null;
            }
        } else {
            OverviewPrice overviewPriceAsInterface = onextracallback.asInterface();
            if (overviewPriceAsInterface != null) {
                dIAuthTabCallback = overviewPriceAsInterface.IAuthTabCallback();
            }
        }
        if (z) {
            OverviewRate overviewRateOnTransact2 = onextracallback.onTransact();
            dOnNavigationEvent = overviewRateOnTransact2 != null ? overviewRateOnTransact2.onWarmupCompleted() : null;
        } else {
            OverviewPrice overviewPriceAsInterface2 = onextracallback.asInterface();
            if (overviewPriceAsInterface2 != null) {
                dOnNavigationEvent = overviewPriceAsInterface2.onNavigationEvent();
            }
        }
        int i6 = iArr[currency.ordinal()];
        if (i6 != 1) {
            int i7 = access100 + 121;
            int i8 = i7 % 128;
            ICustomTabsCallback = i8;
            if (i7 % 2 != 0 ? i6 != 2 : i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (overviewPriceIAuthTabCallbackDefault != null) {
                int i9 = i8 + 61;
                access100 = i9 % 128;
                if (i9 % 2 != 0) {
                    dIAuthTabCallback3 = overviewPriceIAuthTabCallbackDefault.IAuthTabCallback();
                    int i10 = 18 / 0;
                    dDoubleValue = dIAuthTabCallback3 != null ? dIAuthTabCallback3.doubleValue() : 0.0d;
                } else {
                    dIAuthTabCallback3 = overviewPriceIAuthTabCallbackDefault.IAuthTabCallback();
                    if (dIAuthTabCallback3 != null) {
                    }
                }
            }
        } else if (overviewPriceIAuthTabCallbackDefault != null && (dOnNavigationEvent2 = overviewPriceIAuthTabCallbackDefault.onNavigationEvent()) != null) {
            int i11 = ICustomTabsCallback + 97;
            access100 = i11 % 128;
            if (i11 % 2 != 0) {
                dDoubleValue = dOnNavigationEvent2.doubleValue();
                int i12 = 10 / 0;
            } else {
                dDoubleValue = dOnNavigationEvent2.doubleValue();
            }
            int i13 = access100 + 57;
            ICustomTabsCallback = i13 % 128;
            int i14 = i13 % 2;
        }
        if (dDoubleValue > 0.0d) {
            checkduration = checkDuration.UP;
        } else if (dDoubleValue < 0.0d) {
            int i15 = access100 + 107;
            ICustomTabsCallback = i15 % 128;
            if (i15 % 2 == 0) {
                checkDuration checkduration2 = checkDuration.DOWN;
                obj.hashCode();
                throw null;
            }
            checkduration = checkDuration.DOWN;
        } else {
            checkduration = checkDuration.EQUAL;
        }
        int i16 = iArr[currency.ordinal()];
        if (i16 == 1) {
            discard discardVar = discard.onExtraCallback;
            DecimalFormat decimalFormatOnExtraCallbackWithResult = discardVar.onExtraCallbackWithResult();
            if (overviewPriceIAuthTabCallbackDefault != null) {
                int i17 = ICustomTabsCallback + 57;
                access100 = i17 % 128;
                if (i17 % 2 != 0) {
                    overviewPriceIAuthTabCallbackDefault.onNavigationEvent();
                    throw null;
                }
                Double dOnNavigationEvent4 = overviewPriceIAuthTabCallbackDefault.onNavigationEvent();
                double dDoubleValue5 = dOnNavigationEvent4 != null ? dOnNavigationEvent4.doubleValue() : 0.0d;
                String str = decimalFormatOnExtraCallbackWithResult.format(dDoubleValue5);
                NumberFormat numberFormatOnExtraCallback = discardVar.onExtraCallback();
                if (dOnNavigationEvent != null) {
                    int i18 = access100 + 95;
                    ICustomTabsCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        Math.abs(dOnNavigationEvent.doubleValue());
                        throw null;
                    }
                    dAbs = Math.abs(dOnNavigationEvent.doubleValue());
                }
                pairIAuthTabCallback = getWrite.IAuthTabCallback(str, numberFormatOnExtraCallback.format(dAbs));
            }
        } else {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            discard discardVar2 = discard.onExtraCallback;
            DecimalFormat decimalFormatOnWarmupCompleted = discardVar2.onWarmupCompleted();
            if (overviewPriceIAuthTabCallbackDefault == null || (dIAuthTabCallback2 = overviewPriceIAuthTabCallbackDefault.IAuthTabCallback()) == null) {
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue2 = dIAuthTabCallback2.doubleValue();
                int i19 = ICustomTabsCallback + 75;
                access100 = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 4 % 2;
                }
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(decimalFormatOnWarmupCompleted.format(dDoubleValue2), discardVar2.onExtraCallback().format(dIAuthTabCallback != null ? Math.abs(dIAuthTabCallback.doubleValue()) : 0.0d));
        }
        String str2 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
        String str3 = (String) pairIAuthTabCallback.IAuthTabCallback();
        StringBuilder sb = new StringBuilder();
        if (dDoubleValue > 0.0d) {
            sb.append("+");
        }
        sb.append(str2);
        sb.append(" (" + str3 + ")");
        return new Triple<>(strIAuthTabCallback, checkduration, sb.toString());
    }

    static final class onExtraCallback {
        public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
        private static int ICustomTabsCallback = 0;
        private static int extraCallback = 1;
        private static int readTypedObject = 1;
        private static int writeTypedObject;
        private final OverviewPrice IAuthTabCallback;
        private final Integer IAuthTabCallbackDefault;
        private final OverviewPrice IAuthTabCallbackStub;
        private final OverviewRate IAuthTabCallbackStubProxy;
        private final String IAuthTabCallback_Parcel;
        private final OverviewPrice access000;
        private final OverviewPrice access100;
        private final OverviewPrice asBinder;
        private final List<String> asInterface;
        private final OverviewPrice getInterfaceDescriptor;
        private final OverviewPrice onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final OverviewAccounts.Overview.HiddenStock onNavigationEvent;
        private final List<Product> onTransact;
        private final List<FolderOverviewAccounts.Folder> onWarmupCompleted;

        static {
            int i = writeTypedObject + 5;
            extraCallback = i % 128;
            int i2 = i % 2;
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~i5;
            int i9 = ~(i7 | i8);
            int i10 = i4 | i9;
            int i11 = ~i4;
            int i12 = i9 | (~(i11 | i));
            int i13 = (~(i5 | i7 | i4)) | (~(i8 | i11 | i7));
            int i14 = i + i4 + i3 + ((-619979367) * i6) + (68302741 * i2);
            int i15 = i14 * i14;
            int i16 = (i * 561304900) + 382271488 + (561304900 * i4) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i3) + (1615200256 * i6) + ((-1821507584) * i2) + (428933120 * i15);
            int i17 = ((i * (-96142684)) - 56799437) + (i4 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i3 * (-96141863)) + (i6 * (-1380774991)) + (i2 * (-1175232947)) + (i15 * (-118947840));
            int i18 = i16 + (i17 * i17 * (-1369505792));
            return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = readTypedObject + 81;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 109;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallback.IAuthTabCallbackStub)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, onextracallback.asBinder)) {
                int i6 = readTypedObject + 99;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.access100, onextracallback.access100) || !Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, onextracallback.IAuthTabCallbackStubProxy)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, onextracallback.asInterface)) {
                int i8 = readTypedObject + 95;
                ICustomTabsCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallback.IAuthTabCallbackDefault)) {
                int i10 = readTypedObject + 11;
                ICustomTabsCallback = i10 % 128;
                return i10 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.getInterfaceDescriptor, onextracallback.getInterfaceDescriptor)) {
                int i11 = ICustomTabsCallback + 109;
                readTypedObject = i11 % 128;
                return i11 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.access000, onextracallback.access000)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent)) {
                return Intrinsics.areEqual(this.IAuthTabCallback_Parcel, onextracallback.IAuthTabCallback_Parcel) && this.onExtraCallbackWithResult == onextracallback.onExtraCallbackWithResult && !(Intrinsics.areEqual(this.onTransact, onextracallback.onTransact) ^ true) && Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted);
            }
            int i12 = ICustomTabsCallback + 1;
            readTypedObject = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i;
            int iHashCode3;
            int i2 = 2 % 2;
            OverviewPrice overviewPrice = this.onExtraCallback;
            int iHashCode4 = overviewPrice == null ? 0 : overviewPrice.hashCode();
            OverviewPrice overviewPrice2 = this.IAuthTabCallback;
            int iHashCode5 = 1;
            if (overviewPrice2 == null) {
                int i3 = ICustomTabsCallback + 55;
                readTypedObject = i3 % 128;
                iHashCode = i3 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = overviewPrice2.hashCode();
            }
            OverviewPrice overviewPrice3 = this.IAuthTabCallbackStub;
            int iHashCode6 = overviewPrice3 == null ? 0 : overviewPrice3.hashCode();
            OverviewPrice overviewPrice4 = this.asBinder;
            int iHashCode7 = overviewPrice4 == null ? 0 : overviewPrice4.hashCode();
            OverviewPrice overviewPrice5 = this.access100;
            if (overviewPrice5 == null) {
                int i4 = readTypedObject + 57;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = overviewPrice5.hashCode();
                int i6 = readTypedObject + 29;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            OverviewRate overviewRate = this.IAuthTabCallbackStubProxy;
            int iHashCode8 = overviewRate == null ? 0 : overviewRate.hashCode();
            List<String> list = this.asInterface;
            int iHashCode9 = list == null ? 0 : list.hashCode();
            Integer num = this.IAuthTabCallbackDefault;
            int iHashCode10 = num == null ? 0 : num.hashCode();
            OverviewPrice overviewPrice6 = this.getInterfaceDescriptor;
            int iHashCode11 = overviewPrice6 == null ? 0 : overviewPrice6.hashCode();
            OverviewPrice overviewPrice7 = this.access000;
            int iHashCode12 = overviewPrice7 == null ? 0 : overviewPrice7.hashCode();
            OverviewAccounts.Overview.HiddenStock hiddenStock = this.onNavigationEvent;
            int iHashCode13 = hiddenStock == null ? 0 : hiddenStock.hashCode();
            String str = this.IAuthTabCallback_Parcel;
            if (str == null) {
                int i8 = readTypedObject + 61;
                ICustomTabsCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    iHashCode5 = 0;
                }
            } else {
                iHashCode5 = str.hashCode();
            }
            int iHashCode14 = Boolean.hashCode(this.onExtraCallbackWithResult);
            List<Product> list2 = this.onTransact;
            int iHashCode15 = list2 == null ? 0 : list2.hashCode();
            List<FolderOverviewAccounts.Folder> list3 = this.onWarmupCompleted;
            if (list3 != null) {
                int i9 = ICustomTabsCallback + 7;
                i = iHashCode15;
                readTypedObject = i9 % 128;
                if (i9 % 2 == 0) {
                    list3.hashCode();
                    throw null;
                }
                iHashCode3 = list3.hashCode();
            } else {
                i = iHashCode15;
                iHashCode3 = 0;
            }
            return (((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode5) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OverviewAccountData(evaluatedAmount=" + this.onExtraCallback + ", evaluatedAmountAfterFees=" + this.IAuthTabCallback + ", profitLossAmount=" + this.IAuthTabCallbackStub + ", profitLossAmountAfterFees=" + this.asBinder + ", profitLossRate=" + this.access100 + ", profitLossRateAfterFees=" + this.IAuthTabCallbackStubProxy + ", logoImageUrls=" + this.asInterface + ", itemsCount=" + this.IAuthTabCallbackDefault + ", totalCommission=" + this.getInterfaceDescriptor + ", totalTax=" + this.access000 + ", hiddenStock=" + this.onNavigationEvent + ", sortingRule=" + this.IAuthTabCallback_Parcel + ", hasKrStock=" + this.onExtraCallbackWithResult + ", products=" + this.onTransact + ", folders=" + this.onWarmupCompleted + ")";
            int i2 = readTypedObject + 47;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@Nullable OverviewPrice overviewPrice, @Nullable OverviewPrice overviewPrice2, @Nullable OverviewPrice overviewPrice3, @Nullable OverviewPrice overviewPrice4, @Nullable OverviewPrice overviewPrice5, @Nullable OverviewRate overviewRate, @Nullable List<String> list, @Nullable Integer num, @Nullable OverviewPrice overviewPrice6, @Nullable OverviewPrice overviewPrice7, @Nullable OverviewAccounts.Overview.HiddenStock hiddenStock, @Nullable String str, boolean z, @Nullable List<Product> list2, @Nullable List<FolderOverviewAccounts.Folder> list3) {
            this.onExtraCallback = overviewPrice;
            this.IAuthTabCallback = overviewPrice2;
            this.IAuthTabCallbackStub = overviewPrice3;
            this.asBinder = overviewPrice4;
            this.access100 = overviewPrice5;
            this.IAuthTabCallbackStubProxy = overviewRate;
            this.asInterface = list;
            this.IAuthTabCallbackDefault = num;
            this.getInterfaceDescriptor = overviewPrice6;
            this.access000 = overviewPrice7;
            this.onNavigationEvent = hiddenStock;
            this.IAuthTabCallback_Parcel = str;
            this.onExtraCallbackWithResult = z;
            this.onTransact = list2;
            this.onWarmupCompleted = list3;
        }

        public final OverviewPrice onExtraCallback() {
            int i = 2 % 2;
            int i2 = readTypedObject + 3;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPrice = this.onExtraCallback;
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
            return overviewPrice;
        }

        public final OverviewPrice onNavigationEvent() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 117;
            int i3 = i2 % 128;
            readTypedObject = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.IAuthTabCallback;
            int i5 = i3 + 83;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return overviewPrice;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 23;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            OverviewPrice overviewPrice = onextracallback.IAuthTabCallbackStub;
            if (i3 != 0) {
                return overviewPrice;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OverviewPrice IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = readTypedObject + 91;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.asBinder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OverviewPrice asInterface() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 33;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                return this.access100;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OverviewRate onTransact() {
            int i = 2 % 2;
            int i2 = readTypedObject;
            int i3 = i2 + 33;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            OverviewRate overviewRate = this.IAuthTabCallbackStubProxy;
            int i4 = i2 + 45;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return overviewRate;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 83;
            int i3 = i2 % 128;
            readTypedObject = i3;
            int i4 = i2 % 2;
            List<String> list = onextracallback.asInterface;
            int i5 = i3 + 69;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 80 / 0;
            }
            return list;
        }

        public final Integer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 37;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Integer num = this.IAuthTabCallbackDefault;
            if (i3 == 0) {
                int i4 = 84 / 0;
            }
            return num;
        }

        public final OverviewPrice access100() {
            int i = 2 % 2;
            int i2 = readTypedObject + 51;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            OverviewPrice overviewPrice = this.getInterfaceDescriptor;
            int i5 = i3 + 61;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return overviewPrice;
        }

        public final OverviewPrice getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = readTypedObject + 45;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            OverviewPrice overviewPrice = this.access000;
            int i4 = i3 + 33;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
            return overviewPrice;
        }

        public final OverviewAccounts.Overview.HiddenStock IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = readTypedObject;
            int i3 = i2 + 27;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            OverviewAccounts.Overview.HiddenStock hiddenStock = this.onNavigationEvent;
            int i5 = i2 + 103;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return hiddenStock;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String access000() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 51;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback_Parcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = readTypedObject + 5;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.onExtraCallbackWithResult;
            int i5 = i3 + 15;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            throw null;
        }

        private final List<OverviewMediumListItem> onExtraCallback(Currency currency, boolean z, int i, r2ExternalSyntheticLambda2 r2externalsyntheticlambda2) {
            int i2 = 2 % 2;
            ArrayList arrayList = new ArrayList();
            r2ExternalSyntheticLambda2 r2externalsyntheticlambda2OnExtraCallback = r2b.onExtraCallback(this.IAuthTabCallback_Parcel, r2externalsyntheticlambda2);
            List<FolderOverviewAccounts.Folder> listEmptyList = this.onWarmupCompleted;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            int size = 0;
            for (FolderOverviewAccounts.Folder folder : listEmptyList) {
                if (size < i) {
                    List<OverviewItemInfo> listIAuthTabCallback = r2b.IAuthTabCallback(folder);
                    if (r2b.IAuthTabCallback(listIAuthTabCallback)) {
                        Currency currencyOnNavigationEvent = r2b.onNavigationEvent(listIAuthTabCallback, currency);
                        List listTake = CollectionsKt.take(r2b.onWarmupCompleted(listIAuthTabCallback, r2externalsyntheticlambda2OnExtraCallback, currencyOnNavigationEvent, z), i - size);
                        if (!listTake.isEmpty()) {
                            arrayList.add(new OverviewMediumListItem.FolderHeader(folder.onWarmupCompleted(), folder.onNavigationEvent(), r2b.onExtraCallback(folder, currencyOnNavigationEvent, z, r2externalsyntheticlambda2OnExtraCallback)));
                            List list = listTake;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new OverviewMediumListItem.Stock((OverviewItemInfo) it.next()));
                                int i3 = ICustomTabsCallback + 81;
                                readTypedObject = i3 % 128;
                                int i4 = i3 % 2;
                            }
                            CollectionsKt.addAll(arrayList, arrayList2);
                            size += listTake.size();
                            int i5 = readTypedObject + 73;
                            ICustomTabsCallback = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    }
                }
            }
            return arrayList;
        }

        public static final class onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onExtraCallback IAuthTabCallback(@NotNull OverviewAccounts.Overview overview) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(overview, "");
                OverviewPrice overviewPriceIAuthTabCallback = overview.IAuthTabCallback();
                OverviewPrice overviewPriceOnWarmupCompleted = overview.onWarmupCompleted();
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                OverviewPrice overviewPrice = (OverviewPrice) OverviewAccounts.Overview.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{overview}, 1644305741, -1644305739, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                OverviewPrice overviewPriceIAuthTabCallback_Parcel = overview.IAuthTabCallback_Parcel();
                OverviewPrice overviewPriceAccess000 = overview.access000();
                OverviewRate overviewRateIAuthTabCallbackStubProxy = overview.IAuthTabCallbackStubProxy();
                List<String> listAsBinder = overview.asBinder();
                Integer numIAuthTabCallbackStub = overview.IAuthTabCallbackStub();
                OverviewPrice overviewPriceWriteTypedObject = overview.writeTypedObject();
                OverviewPrice overviewPriceExtraCallbackWithResult = overview.extraCallbackWithResult();
                int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                onExtraCallback onextracallback = new onExtraCallback(overviewPriceIAuthTabCallback, overviewPriceOnWarmupCompleted, overviewPrice, overviewPriceIAuthTabCallback_Parcel, overviewPriceAccess000, overviewRateIAuthTabCallbackStubProxy, listAsBinder, numIAuthTabCallbackStub, overviewPriceWriteTypedObject, overviewPriceExtraCallbackWithResult, (OverviewAccounts.Overview.HiddenStock) OverviewAccounts.Overview.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{overview}, 1886462183, -1886462183, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted()), overview.access100(), overview.asInterface(), overview.IAuthTabCallbackDefault(), null);
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final onExtraCallback onNavigationEvent(@NotNull FolderOverviewAccounts.Overview overview) {
                boolean z;
                boolean z2;
                boolean zBooleanValue;
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(overview, "");
                OverviewPrice overviewPrice = (OverviewPrice) FolderOverviewAccounts.Overview.onExtraCallbackWithResult(-312844636, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 312844637, new Object[]{overview}, _string.onNavigationEvent.IAuthTabCallback());
                OverviewPrice overviewPriceOnExtraCallback = overview.onExtraCallback();
                OverviewPrice overviewPriceAccess000 = overview.access000();
                OverviewPrice overviewPriceIAuthTabCallbackStubProxy = overview.IAuthTabCallbackStubProxy();
                OverviewPrice overviewPriceAccess100 = overview.access100();
                OverviewRate interfaceDescriptor = overview.getInterfaceDescriptor();
                List<String> listAsInterface = overview.asInterface();
                Integer numIAuthTabCallbackDefault = overview.IAuthTabCallbackDefault();
                OverviewPrice typedObject = overview.readTypedObject();
                OverviewPrice overviewPriceExtraCallback = overview.extraCallback();
                OverviewAccounts.Overview.HiddenStock hiddenStock = (OverviewAccounts.Overview.HiddenStock) FolderOverviewAccounts.Overview.onExtraCallbackWithResult(-317317451, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 317317453, new Object[]{overview}, _string.onNavigationEvent.IAuthTabCallback());
                String strIAuthTabCallback_Parcel = overview.IAuthTabCallback_Parcel();
                Boolean bool = (Boolean) FolderOverviewAccounts.Overview.onExtraCallbackWithResult(413752641, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -413752638, new Object[]{overview}, _string.onNavigationEvent.IAuthTabCallback());
                if (bool != null) {
                    int i4 = IAuthTabCallback + 55;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    zBooleanValue = bool.booleanValue();
                } else {
                    List list = (List) FolderOverviewAccounts.Overview.onExtraCallbackWithResult(-1032588933, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1032588933, new Object[]{overview}, _string.onNavigationEvent.IAuthTabCallback());
                    if (list instanceof Collection) {
                        int i6 = onExtraCallback + 83;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        z = true;
                        if (!list.isEmpty()) {
                        }
                        zBooleanValue = false;
                    } else {
                        z = true;
                    }
                    Iterator it = list.iterator();
                    loop0: while ((it.hasNext() ^ z) != z) {
                        List<OverviewItemInfo> listOnExtraCallback = ((FolderOverviewAccounts.Folder) it.next()).onExtraCallback();
                        if ((listOnExtraCallback instanceof Collection) && listOnExtraCallback.isEmpty()) {
                            int i8 = IAuthTabCallback + 21;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            Iterator<T> it2 = listOnExtraCallback.iterator();
                            while (it2.hasNext()) {
                                int i10 = onExtraCallback + 45;
                                Iterator it3 = it;
                                IAuthTabCallback = i10 % 128;
                                if (i10 % 2 == 0) {
                                    ((OverviewItemInfo) it2.next()).extraCallbackWithResult();
                                    OverviewItemInfo.ShareHoldingsType shareHoldingsType = OverviewItemInfo.ShareHoldingsType.kr;
                                    throw null;
                                }
                                if (((OverviewItemInfo) it2.next()).extraCallbackWithResult() == OverviewItemInfo.ShareHoldingsType.kr) {
                                    z2 = true;
                                    break loop0;
                                }
                                it = it3;
                            }
                        }
                        it = it;
                        z = true;
                    }
                    zBooleanValue = false;
                }
                z2 = zBooleanValue;
                return new onExtraCallback(overviewPrice, overviewPriceOnExtraCallback, overviewPriceAccess000, overviewPriceIAuthTabCallbackStubProxy, overviewPriceAccess100, interfaceDescriptor, listAsInterface, numIAuthTabCallbackDefault, typedObject, overviewPriceExtraCallback, hiddenStock, strIAuthTabCallback_Parcel, z2, null, (List) FolderOverviewAccounts.Overview.onExtraCallbackWithResult(-1032588933, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), 1032588933, new Object[]{overview}, _string.onNavigationEvent.IAuthTabCallback()));
            }
        }

        public final List<OverviewMediumListItem> IAuthTabCallback(@NotNull Currency currency, boolean z, int i, @NotNull r2ExternalSyntheticLambda2 r2externalsyntheticlambda2) {
            List<OverviewMediumListItem> listOnExtraCallback;
            int i2 = 2 % 2;
            int i3 = readTypedObject + 23;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            Intrinsics.checkNotNullParameter(r2externalsyntheticlambda2, "");
            if (this.onWarmupCompleted != null) {
                int i5 = ICustomTabsCallback + 117;
                readTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    listOnExtraCallback = onExtraCallback(currency, z, i, r2externalsyntheticlambda2);
                    int i6 = 14 / 0;
                } else {
                    listOnExtraCallback = onExtraCallback(currency, z, i, r2externalsyntheticlambda2);
                }
                int i7 = readTypedObject + 51;
                ICustomTabsCallback = i7 % 128;
                int i8 = i7 % 2;
                return listOnExtraCallback;
            }
            Object[] objArr = {this, currency, Boolean.valueOf(z), r2externalsyntheticlambda2};
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            List listTake = CollectionsKt.take((List) onExtraCallbackWithResult(objArr, 274235022, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -274235022, iOnWarmupCompleted, ACPayResult.onWarmupCompleted()), i);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            Iterator it = listTake.iterator();
            while (it.hasNext()) {
                arrayList.add(new OverviewMediumListItem.Stock((OverviewItemInfo) it.next()));
            }
            return arrayList;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            Currency currency = (Currency) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i = 2 % 2;
            r2ExternalSyntheticLambda2 r2externalsyntheticlambda2OnExtraCallback = r2b.onExtraCallback(onextracallback.IAuthTabCallback_Parcel, (r2ExternalSyntheticLambda2) objArr[3]);
            List<Product> listEmptyList = onextracallback.onTransact;
            if (listEmptyList == null) {
                int i2 = readTypedObject + 103;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                int i4 = readTypedObject + 61;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                CollectionsKt.addAll(arrayList, r2b.onWarmupCompleted(((Product) it.next()).onExtraCallbackWithResult(), r2externalsyntheticlambda2OnExtraCallback, currency, zBooleanValue));
            }
            return arrayList;
        }

        private final List<OverviewItemInfo> onWarmupCompleted(Currency currency, boolean z, r2ExternalSyntheticLambda2 r2externalsyntheticlambda2) {
            Object[] objArr = {this, currency, Boolean.valueOf(z), r2externalsyntheticlambda2};
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            return (List) onExtraCallbackWithResult(objArr, 274235022, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -274235022, iOnWarmupCompleted, ACPayResult.onWarmupCompleted());
        }

        public final List<String> IAuthTabCallbackStub() {
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            return (List) onExtraCallbackWithResult(new Object[]{this}, -1481187999, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1481188000, iOnWarmupCompleted, ACPayResult.onWarmupCompleted());
        }

        public final OverviewPrice asBinder() {
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            return (OverviewPrice) onExtraCallbackWithResult(new Object[]{this}, 48654879, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -48654877, iOnWarmupCompleted, ACPayResult.onWarmupCompleted());
        }
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final String IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            String str = "account_key_" + i;
            int i3 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
    }

    public static final /* synthetic */ DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback(r4 r4Var) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (DiskLruCacheEditornewSink11.IAuthTabCallback) onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{r4Var}, iOnNavigationEvent3, 1198944754, iOnNavigationEvent2, -1198944751);
    }

    public static final /* synthetic */ DiskLruCacheEntry asInterface(r4 r4Var) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (DiskLruCacheEntry) onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{r4Var}, iOnNavigationEvent3, -2085673767, iOnNavigationEvent2, 2085673771);
    }

    private final Currency onWarmupCompleted(Currency currency, onExtraCallback onextracallback) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (Currency) onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, currency, onextracallback}, iOnNavigationEvent3, -1920200188, iOnNavigationEvent2, 1920200193);
    }

    private final String onNavigationEvent() {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (String) onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, iOnNavigationEvent3, 1040944454, iOnNavigationEvent2, -1040944454);
    }

    private final Object onNavigationEvent(AccountSections.Account account, boolean z, access13800<? super onExtraCallback> access13800Var) {
        Object[] objArr = {this, account, Boolean.valueOf(z), access13800Var};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, objArr, zzaq.onNavigationEvent(), -661480440, iOnNavigationEvent2, 661480441);
    }

    private final Currency onExtraCallback() {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (Currency) onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, iOnNavigationEvent3, -1927366244, iOnNavigationEvent2, 1927366246);
    }

    private final Object onWarmupCompleted(access13800<? super r2ExternalSyntheticLambda2> access13800Var) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return onWarmupCompleted(zzaq.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, access13800Var}, iOnNavigationEvent3, -448406477, iOnNavigationEvent2, 448406483);
    }
}
