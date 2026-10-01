package com.tnkfactory.ad.off;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.d.d0;
import com.tnkfactory.ad.d.e0;
import com.tnkfactory.ad.d.f0;
import com.tnkfactory.ad.d.h0;
import com.tnkfactory.ad.d.i0;
import com.tnkfactory.ad.d.j0;
import com.tnkfactory.ad.d.k0;
import com.tnkfactory.ad.off.TnkOffRepository$;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.off.data.CpsFavoriteKeywardVo;
import com.tnkfactory.ad.off.data.EventListVo;
import com.tnkfactory.ad.off.data.PayForAttendVo;
import com.tnkfactory.ad.off.data.PayForInstallVo;
import com.tnkfactory.ad.off.data.PlacementAdList;
import com.tnkfactory.ad.off.data.PlacementPubInfo;
import com.tnkfactory.ad.off.data.RecommendList;
import com.tnkfactory.ad.off.data.RequestPayForEvent;
import com.tnkfactory.ad.repository.db.AdItemRoomDbImpl;
import com.tnkfactory.ad.repository.db.dao.AdItemDao;
import com.tnkfactory.ad.repository.db.entity.AdItemDto;
import com.tnkfactory.ad.repository.rpc.parser.AdListParser;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.rwd.PubInfo;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.api.ServiceTask;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.framework.vo.ValueObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access13800;
import o.access14300;
import o.getBacktraceNote;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkOffRepository {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static boolean onWarmupCompleted;
    public static String r;
    public final ServiceTask a;
    public final TnkAdItemRepository b;
    public final Context c;
    public final AdItemRoomDbImpl d;
    public MutableLiveData e;
    public MutableLiveData f;
    public final ArrayList g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f37i;
    public final ArrayList j;
    public MutableLiveData k;
    public TnkRwdFilter l;
    public ArrayList m;
    public PubInfo n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f38o;
    public MutableLiveData p;
    public long q;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final String getTnpickUrl() {
            return TnkOffRepository.access$getTnpickUrl$cp();
        }

        public final void setTnpickUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            TnkOffRepository.access$setTnpickUrl$cp(str);
        }
    }

    static {
        onNavigationEvent();
        Companion = new Companion(null);
        Object[] objArr = new Object[1];
        s(null, null, new byte[]{-122, -114, -115, -117, -120, -116, -117, -118, -125, -119, -126, -120, -121, -121, -121, -122, -122, -123, -124, -125, -126, -126, -127}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, objArr);
        r = ((String) objArr[0]).intern();
        int i2 = onExtraCallbackWithResult + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public TnkOffRepository(@NotNull ServiceTask serviceTask) {
        AdItemRoomDbImpl companion;
        Intrinsics.checkNotNullParameter(serviceTask, "");
        this.a = serviceTask;
        this.b = TnkAdItemRepository.INSTANCE;
        this.c = serviceTask.getApplicationContext();
        try {
            companion = AdItemRoomDbImpl.Companion.getInstance(serviceTask.getApplicationContext());
            int i2 = 2 % 2;
        } catch (Exception unused) {
            companion = null;
        }
        this.d = companion;
        this.b.init(companion, this.a.getApplicationContext());
        this.e = new MutableLiveData(Boolean.FALSE);
        this.f = new MutableLiveData();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.f37i = new ArrayList();
        this.j = new ArrayList();
        this.k = new MutableLiveData();
        this.l = new TnkRwdFilter();
        this.m = new ArrayList();
        this.n = new PubInfo(null, 0L, null, 0, null, null, null, null, null, 511, null);
        this.f38o = new ArrayList();
        this.p = new MutableLiveData(new ArrayList());
        int i3 = IAuthTabCallbackDefault + 79;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
    }

    public static final /* synthetic */ String access$getTnpickUrl$cp() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = r;
        int i5 = i3 + 99;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public static final /* synthetic */ void access$setTnpickUrl$cp(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        r = str;
        if (i5 != 0) {
            int i6 = 43 / 0;
        }
        int i7 = i3 + 43;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 82 / 0;
        }
    }

    public final void adListCacheClear() {
        int i2 = 2 % 2;
        int i3 = onTransact + 101;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.b.setLastUpdate(0L);
        int i5 = IAuthTabCallbackDefault + 21;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
    }

    public final Object getActionInfoV3(long j, int i2, @NotNull access13800<? super TnkResultTask<ArrayList<AdActionInfoVo>>> access13800Var) {
        int i3 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new d0(this, j, i2, null), access13800Var);
        int i4 = onTransact + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public final TnkAdItemRepository getAdItemRepository() {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        TnkAdItemRepository tnkAdItemRepository = this.b;
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        return tnkAdItemRepository;
    }

    public final ArrayList<AdListVo> getAdList() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<AdListVo> arrayList = this.f37i;
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        return arrayList;
    }

    public final ArrayList<BannerItem> getBannerList() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 35;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        ArrayList<BannerItem> arrayList = this.g;
        int i6 = i4 + 115;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public final Context getContext() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Context context = this.c;
        int i6 = i3 + 89;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 27 / 0;
        }
        return context;
    }

    public final ArrayList<BannerItem> getCpsBannerList() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 125;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        ArrayList<BannerItem> arrayList = this.h;
        int i6 = i4 + 79;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public final MutableLiveData<ArrayList<Long>> getCpsRecentItem() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        MutableLiveData<ArrayList<Long>> mutableLiveData = this.f;
        int i6 = i3 + 103;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return mutableLiveData;
    }

    public final ArrayList<AdListCuration> getCuriation() {
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return this.m;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Boolean> getDataChanged() {
        int i2 = 2 % 2;
        int i3 = onTransact + 63;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        MutableLiveData<Boolean> mutableLiveData = this.e;
        int i6 = i4 + 119;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final AdItemRoomDbImpl getDb() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 29;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        AdItemRoomDbImpl adItemRoomDbImpl = this.d;
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        return adItemRoomDbImpl;
    }

    public final long getEarnPoint() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 115;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Settings settings = Settings.INSTANCE;
        if (i4 == 0) {
            return settings.getEarnPoint(this.c);
        }
        settings.getEarnPoint(this.c);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getEarnPointCPS() {
        int i2 = 2 % 2;
        int i3 = onTransact + 81;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Settings.INSTANCE.getEarnPointCPS(this.c);
            obj.hashCode();
            throw null;
        }
        long earnPointCPS = Settings.INSTANCE.getEarnPointCPS(this.c);
        int i4 = onTransact + 91;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return earnPointCPS;
        }
        obj.hashCode();
        throw null;
    }

    public final long getEarnPointCalcTime() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        long j = this.q;
        int i6 = i3 + 113;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final MutableLiveData<ArrayList<MultiCampaignJoinListItem>> getJoinMultiList() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 47;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<ArrayList<MultiCampaignJoinListItem>> mutableLiveData = this.p;
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        return mutableLiveData;
    }

    public final Object getMultiCampaignJoinListItem(@NotNull access13800<? super TnkResultTask<ArrayList<MultiCampaignJoinListItem>>> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new e0(this, null), access13800Var);
        int i3 = IAuthTabCallbackDefault + 75;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public final ArrayList<AdListVo> getNewsList() {
        ArrayList<AdListVo> arrayList;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            arrayList = this.j;
            int i5 = 4 / 0;
        } else {
            arrayList = this.j;
        }
        int i6 = i3 + 61;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return arrayList;
    }

    public final TnkResultTask<PlacementAdList> getPlacementAdList(@NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TnkResultTask<PlacementAdList> tnkResultTask = new TnkResultTask<>(new TnkOffRepository$.ExternalSyntheticLambda9(this, str));
        int i3 = IAuthTabCallbackDefault + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return tnkResultTask;
    }

    public final PubInfo getPubInfo() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        PubInfo pubInfo = this.n;
        int i6 = i3 + 23;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return pubInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<RecommendList> getRecommendList() {
        int i2 = 2 % 2;
        int i3 = onTransact + 73;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        MutableLiveData<RecommendList> mutableLiveData = this.k;
        int i6 = i4 + 43;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TnkResultTask<AdJoinInfoVo> getRequestJoin(@NotNull final ResultState<? extends ValueObject> resultState) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(resultState, "");
        TnkResultTask<AdJoinInfoVo> tnkResultTask = new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TnkOffRepository.c(resultState);
            }
        });
        int i3 = onTransact + 99;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return tnkResultTask;
        }
        throw null;
    }

    public final TnkRwdFilter getRwdFilter() {
        TnkRwdFilter tnkRwdFilter;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            tnkRwdFilter = this.l;
            int i5 = 24 / 0;
        } else {
            tnkRwdFilter = this.l;
        }
        int i6 = i3 + 33;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return tnkRwdFilter;
    }

    public final ServiceTask getServiceTask() {
        ServiceTask serviceTask;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 57;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0) {
            serviceTask = this.a;
            int i5 = 46 / 0;
        } else {
            serviceTask = this.a;
        }
        int i6 = i4 + 75;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return serviceTask;
    }

    public final ArrayList<MultiCampaignJoinListItem> get_joinMultiList() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        ArrayList<MultiCampaignJoinListItem> arrayList = this.f38o;
        int i5 = i3 + 111;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public final Object likeProduct(long j, boolean z, @NotNull access13800<? super TnkResultTask<Boolean>> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new f0(this, j, z, null), access13800Var);
        int i3 = IAuthTabCallbackDefault + 81;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public final Object loadAdData(@NotNull access13800<? super TnkResultTask<ArrayList<AdListVo>>> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new a(this, null), access13800Var);
        int i3 = IAuthTabCallbackDefault + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public final Object loadAdDataWithNews(@NotNull access13800<? super TnkResultTask<ArrayList<AdListVo>>> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new h0(this, (access13800) null), access13800Var);
        int i3 = onTransact + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public final void loadAdItemClickHistory() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 121;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.f.postValue(this.b.loadClickHistory());
        int i5 = IAuthTabCallbackDefault + 21;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TnkResultTask<ArrayList<AdListVo>> loadCPSAdData() {
        int i2 = 2 % 2;
        TnkResultTask<ArrayList<AdListVo>> tnkResultTask = new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda10
            public final Object invoke() {
                return TnkOffRepository.a(this.f$0);
            }
        });
        int i3 = IAuthTabCallbackDefault + 51;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return tnkResultTask;
        }
        throw null;
    }

    public final TnkResultTask<ArrayList<AdListVo>> loadNewsAdData() {
        int i2 = 2 % 2;
        TnkResultTask<ArrayList<AdListVo>> tnkResultTask = new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda12
            public final Object invoke() {
                return TnkOffRepository.b(this.f$0);
            }
        });
        int i3 = onTransact + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return tnkResultTask;
    }

    public final EventLinkVo parserTnkEvetLink(@NotNull ValueObject valueObject) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 57;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(valueObject, "");
        EventLinkVo eventLinkVo = EventLinkVo.Companion.parse(valueObject);
        int i5 = onTransact + 121;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return eventLinkVo;
        }
        throw null;
    }

    public final TnkResultTask<AdListVo> reqAdItemWithActionInfo(long j, int i2) {
        int i3 = 2 % 2;
        TnkResultTask<AdListVo> tnkResultTask = new TnkResultTask<>(new TnkOffRepository$.ExternalSyntheticLambda11(this, j, i2));
        int i4 = IAuthTabCallbackDefault + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return tnkResultTask;
    }

    public final TnkResultTask<AdJoinInfoVo> requestJoinV3(long j, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 93;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        TnkResultTask<AdJoinInfoVo> requestJoin = getRequestJoin(this.a.requestJoinV3(j, i2, i3, i4));
        int i8 = onTransact + 69;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return requestJoin;
    }

    public final Object requestPayForAttend(long j, long j2, int i2, long j3, long j4, @NotNull access13800<? super TnkResultTask<PayForAttendVo>> access13800Var) {
        int i3 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new j0(this, j, j2, i2, j3, j4, null), access13800Var);
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public final Object requestRewardForInstall(long j, long j2, @NotNull access13800<? super TnkResultTask<PayForInstallVo>> access13800Var) {
        int i2 = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new k0(this, j, j2, null), access13800Var);
        int i3 = onTransact + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    public final void saveAdItemClickHistory(long j) {
        int i2 = 2 % 2;
        int i3 = onTransact + 119;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.b.saveClickHistory(j);
        int i5 = onTransact + 45;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setCpsRecentItem(@NotNull MutableLiveData<ArrayList<Long>> mutableLiveData) {
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.f = mutableLiveData;
        int i5 = IAuthTabCallbackDefault + 89;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setCuriation(@NotNull ArrayList<AdListCuration> arrayList) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.m = arrayList;
        int i5 = onTransact + 91;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setDataChanged(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        int i2 = 2 % 2;
        int i3 = onTransact + 21;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mutableLiveData, "");
            this.e = mutableLiveData;
        } else {
            Intrinsics.checkNotNullParameter(mutableLiveData, "");
            this.e = mutableLiveData;
            int i4 = 24 / 0;
        }
    }

    public final void setEarnPoint(long j) {
        int i2 = 2 % 2;
        int i3 = onTransact + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Settings.INSTANCE.setEarnPoint(this.c, j);
        int i5 = IAuthTabCallbackDefault + 5;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setEarnPointCPS(long j) {
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Settings settings = Settings.INSTANCE;
        if (i4 != 0) {
            settings.setEarnPointCPS(this.c, j);
        } else {
            settings.setEarnPointCPS(this.c, j);
            int i5 = 43 / 0;
        }
    }

    public final void setEarnPointCalcTime(long j) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        this.q = j;
        int i6 = i3 + 113;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void setJoinMultiList(@NotNull MutableLiveData<ArrayList<MultiCampaignJoinListItem>> mutableLiveData) {
        int i2 = 2 % 2;
        int i3 = onTransact + 53;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.p = mutableLiveData;
        int i5 = onTransact + 117;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setPubInfo(@NotNull PubInfo pubInfo) {
        int i2 = 2 % 2;
        int i3 = onTransact + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(pubInfo, "");
        this.n = pubInfo;
        int i5 = IAuthTabCallbackDefault + 61;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setRecommendList(@NotNull MutableLiveData<RecommendList> mutableLiveData) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.k = mutableLiveData;
        int i5 = onTransact + 55;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setRwdFilter(@NotNull TnkRwdFilter tnkRwdFilter) {
        int i2 = 2 % 2;
        int i3 = onTransact + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tnkRwdFilter, "");
        this.l = tnkRwdFilter;
        int i5 = IAuthTabCallbackDefault + 105;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void set_joinMultiList(@NotNull ArrayList<MultiCampaignJoinListItem> arrayList) {
        int i2 = 2 % 2;
        int i3 = onTransact + 17;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.f38o = arrayList;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.f38o = arrayList;
        int i4 = onTransact + 5;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    public final void clearAdItemClickHistory() {
        int i2 = 2 % 2;
        this.b.clearClickHistory();
        this.f.postValue(new ArrayList());
        int i3 = IAuthTabCallbackDefault + 21;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void removeAdItemClickHistory(long j) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.b.removeClickHistory(j);
        this.f.postValue(this.b.loadClickHistory());
        int i5 = IAuthTabCallbackDefault + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r3
      0x002b: PHI (r1v13 com.tnkfactory.ad.d.i0) = (r1v12 com.tnkfactory.ad.d.i0), (r1v15 com.tnkfactory.ad.d.i0) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadJoinMultiList(@NotNull access13800<? super Unit> access13800Var) {
        i0 i0Var;
        final TnkOffRepository tnkOffRepository;
        int i2;
        int i3 = 2 % 2;
        if (access13800Var instanceof i0) {
            int i4 = onTransact + 97;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                i0Var = (i0) access13800Var;
                i2 = i0Var.d;
                int i5 = 77 / 0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    i0Var.d = i2 - 2147483648;
                } else {
                    i0Var = new i0(this, access13800Var);
                }
            } else {
                i0Var = (i0) access13800Var;
                i2 = i0Var.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object multiCampaignJoinListItem = i0Var.b;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = i0Var.d;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(multiCampaignJoinListItem);
            i0Var.a = this;
            i0Var.d = 1;
            multiCampaignJoinListItem = getMultiCampaignJoinListItem(i0Var);
            if (multiCampaignJoinListItem == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            tnkOffRepository = this;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = onTransact + 39;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                tnkOffRepository = i0Var.a;
                ResultKt.onNavigationEvent(multiCampaignJoinListItem);
                int i8 = 96 / 0;
            } else {
                tnkOffRepository = i0Var.a;
                ResultKt.onNavigationEvent(multiCampaignJoinListItem);
            }
        }
        ((TnkResultTask) multiCampaignJoinListItem).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return TnkOffRepository.a(this.f$0, (ArrayList) obj);
            }
        }).setOnError(new Function1() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return TnkOffRepository.a(this.f$0, (TnkError) obj);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        if (r7.getRet_cd() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        r1 = com.tnkfactory.ad.off.TnkOffRepository.IAuthTabCallbackDefault + 97;
        com.tnkfactory.ad.off.TnkOffRepository.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.getPay_yn(), "Y") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        r8.invoke(java.lang.Boolean.TRUE, "requestPayForEvent success", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        kotlin.jvm.internal.Intrinsics.areEqual(r7.getPay_yn(), "Y");
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r8.invoke(java.lang.Boolean.FALSE, com.tnkfactory.ad.rwd.data.constants.ErrorCodes.INSTANCE.getErrorMessage(r7.getRet_cd()), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if ((r7 instanceof com.tnkfactory.ad.rwd.data.ResultState.Error) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        r8.invoke(java.lang.Boolean.FALSE, ((com.tnkfactory.ad.rwd.data.ResultState.Error) r7).getE().getMessage(), (java.lang.Object) null);
        r7 = com.tnkfactory.ad.off.TnkOffRepository.onTransact + 81;
        com.tnkfactory.ad.off.TnkOffRepository.IAuthTabCallbackDefault = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if ((r7 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        r8.invoke(java.lang.Boolean.FALSE, "requestPayForEvent error", (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if ((r7 instanceof com.tnkfactory.ad.rwd.data.ResultState.Success) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if ((r7 instanceof com.tnkfactory.ad.rwd.data.ResultState.Success) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r7 = com.tnkfactory.ad.off.data.RequestPayForEvent.Companion.parse((com.tnkfactory.framework.vo.ValueObject) ((com.tnkfactory.ad.rwd.data.ResultState.Success) r7).getValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void requestPayForEvent(@NotNull EventListVo eventListVo, @NotNull getBacktraceNote<? super Boolean, ? super String, ? super RequestPayForEvent, Unit> getbacktracenote) {
        ResultState<ValueObject> resultStateRequestPayForEvent;
        int i2 = 2 % 2;
        int i3 = onTransact + 21;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(eventListVo, "");
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            resultStateRequestPayForEvent = this.a.requestPayForEvent(eventListVo.getApp_id(), TnkCore.INSTANCE.getServiceTask().getSessionRunVO(this.c));
            int i4 = 89 / 0;
        } else {
            Intrinsics.checkNotNullParameter(eventListVo, "");
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            resultStateRequestPayForEvent = this.a.requestPayForEvent(eventListVo.getApp_id(), TnkCore.INSTANCE.getServiceTask().getSessionRunVO(this.c));
        }
    }

    public final void fetchRecommendList() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 75;
        onTransact = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                boolean z = this.a.getRecommandList() instanceof ResultState.Success;
                throw null;
            }
            ResultState<ValueObject> recommandList = this.a.getRecommandList();
            if (!(recommandList instanceof ResultState.Success)) {
                this.k.postValue(new RecommendList(null, null, null, null, null, null, 63, null));
                return;
            }
            int i4 = IAuthTabCallbackDefault + 3;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = ((ValueObject) ((ResultState.Success) recommandList).getValue()).getInt("ret_cd");
            ((ValueObject) ((ResultState.Success) recommandList).getValue()).getString("ret_msg");
            if (i6 != 0) {
                this.k.postValue(new RecommendList(null, null, null, null, null, null, 63, null));
                return;
            }
            int i7 = IAuthTabCallbackDefault + 27;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            this.k.postValue(AdListParser.INSTANCE.parserRecommendList((ValueObject) ((ResultState.Success) recommandList).getValue()));
            int i9 = IAuthTabCallbackDefault + 89;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }

    public final void requestJoinForEvent(@NotNull EventListVo eventListVo, @NotNull getBacktraceNote<? super EventListVo, ? super Boolean, ? super String, Unit> getbacktracenote) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 5;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eventListVo, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        ResultState<ValueObject> resultStateRequestJoinForEvent = this.a.requestJoinForEvent(eventListVo.getApp_id(), TnkCore.INSTANCE.getServiceTask().getSessionRunVO(this.c));
        Object obj = null;
        if (!(resultStateRequestJoinForEvent instanceof ResultState.Success)) {
            if (!(resultStateRequestJoinForEvent instanceof ResultState.Error)) {
                getbacktracenote.invoke((Object) null, Boolean.FALSE, "requestPayForEvent error");
                return;
            }
            int i5 = onTransact + 79;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            getbacktracenote.invoke((Object) null, Boolean.FALSE, ((ResultState.Error) resultStateRequestJoinForEvent).getE().getMessage());
            return;
        }
        ResultState.Success success = (ResultState.Success) resultStateRequestJoinForEvent;
        int i7 = ((ValueObject) success.getValue()).getInt("ret_cd", 0);
        EventListVo eventListVo2 = AdListParser.INSTANCE.parserEventItem((ValueObject) success.getValue());
        if (i7 == 0) {
            getbacktracenote.invoke(eventListVo2, Boolean.TRUE, "requestJoinForEvent success");
            return;
        }
        getbacktracenote.invoke(eventListVo2, Boolean.FALSE, ErrorCodes.INSTANCE.getErrorMessage(i7));
        int i8 = IAuthTabCallbackDefault + 47;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void getEventUrl(long j, @NotNull getBacktraceNote<? super EventLinkVo, ? super Boolean, ? super String, Unit> getbacktracenote) {
        int i2 = 2 % 2;
        int i3 = onTransact + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        ResultState<ValueObject> eventUrl = this.a.getEventUrl(j, TnkCore.INSTANCE.getServiceTask().getSessionRunVO(this.c));
        if (!(eventUrl instanceof ResultState.Success)) {
            if (eventUrl instanceof ResultState.Error) {
                getbacktracenote.invoke((Object) null, Boolean.FALSE, ((ResultState.Error) eventUrl).getE().getMessage());
                return;
            } else {
                getbacktracenote.invoke((Object) null, Boolean.FALSE, "requestPayForEvent error");
                return;
            }
        }
        ResultState.Success success = (ResultState.Success) eventUrl;
        int i5 = ((ValueObject) success.getValue()).getInt("ret_cd", 0);
        EventLinkVo eventLinkVo = parserTnkEvetLink((ValueObject) success.getValue());
        if (i5 != 0) {
            getbacktracenote.invoke(eventLinkVo, Boolean.FALSE, ErrorCodes.INSTANCE.getErrorMessage(i5));
            return;
        }
        int i6 = onTransact + 119;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            getbacktracenote.invoke(eventLinkVo, Boolean.TRUE, "requestJoinForEvent success");
        } else {
            getbacktracenote.invoke(eventLinkVo, Boolean.TRUE, "requestJoinForEvent success");
            throw null;
        }
    }

    public final TnkResultTask<ArrayList<CpsFavoriteKeywardVo>> getFavoriteKeywordList(@NotNull Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        try {
            final ResultState<ValueObject> favoriteKeywordList = this.a.getFavoriteKeywordList(context);
            if (!(favoriteKeywordList instanceof ResultState.Success)) {
                if (favoriteKeywordList instanceof ResultState.Error) {
                    return new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda5
                        public final Object invoke() {
                            return TnkOffRepository.b(favoriteKeywordList);
                        }
                    });
                }
                if (!(favoriteKeywordList instanceof ResultState.Pass)) {
                    return new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda7
                        public final Object invoke() {
                            return TnkOffRepository.b();
                        }
                    });
                }
                TnkResultTask<ArrayList<CpsFavoriteKeywardVo>> tnkResultTask = new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda6
                    public final Object invoke() {
                        return TnkOffRepository.a();
                    }
                });
                int i3 = onTransact + 59;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 34 / 0;
                }
                return tnkResultTask;
            }
            final int i5 = ((ValueObject) ((ResultState.Success) favoriteKeywordList).getValue()).getInt("ret_cd");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = ((ValueObject) ((ResultState.Success) favoriteKeywordList).getValue()).getString("ret_msg");
            if (i5 != 0) {
                return new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda4
                    public final Object invoke() {
                        return TnkOffRepository.a(i5, objectRef);
                    }
                });
            }
            TnkResultTask<ArrayList<CpsFavoriteKeywardVo>> tnkResultTask2 = new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda3
                public final Object invoke() {
                    return TnkOffRepository.a(favoriteKeywordList);
                }
            });
            int i6 = onTransact + 67;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                return tnkResultTask2;
            }
            throw null;
        } catch (Exception unused) {
            return new TnkResultTask<>(new Function0() { // from class: com.tnkfactory.ad.off.TnkOffRepository$$ExternalSyntheticLambda8
                public final Object invoke() {
                    return TnkOffRepository.c();
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0091, code lost:
    
        return new com.tnkfactory.ad.rwd.data.ResultState.Success(new java.util.ArrayList(r8.f37i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0092, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b4, code lost:
    
        return new com.tnkfactory.ad.rwd.data.ResultState.Error(new com.tnkfactory.ad.TnkError(500, "에러 : " + r8.getMessage(), r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b7, code lost:
    
        if ((r2 instanceof com.tnkfactory.ad.rwd.data.ResultState.Error) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c4, code lost:
    
        return new com.tnkfactory.ad.rwd.data.ResultState.Error(((com.tnkfactory.ad.rwd.data.ResultState.Error) r2).getE());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if ((r2 instanceof com.tnkfactory.ad.rwd.data.ResultState.Pass) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        r8 = new com.tnkfactory.ad.rwd.data.ResultState.Error(new com.tnkfactory.ad.TnkError(0, "pass", null, 4, null));
        r0 = com.tnkfactory.ad.off.TnkOffRepository.IAuthTabCallbackDefault + 53;
        com.tnkfactory.ad.off.TnkOffRepository.onTransact = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if ((r2 instanceof com.tnkfactory.ad.rwd.data.ResultState.Success) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if ((r2 instanceof com.tnkfactory.ad.rwd.data.ResultState.Success) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r8.h.clear();
        r1 = r8.m;
        r3 = com.tnkfactory.ad.repository.rpc.parser.AdListParser.INSTANCE;
        r4 = ((com.tnkfactory.framework.vo.ValueObject) ((com.tnkfactory.ad.rwd.data.ResultState.Success) r2).getValue()).get("crt_set");
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4, "");
        r1.addAll(r3.parseCuration((com.tnkfactory.framework.vo.ValueObject) r4));
        r1 = r8.h;
        r4 = ((com.tnkfactory.framework.vo.ValueObject) ((com.tnkfactory.ad.rwd.data.ResultState.Success) r2).getValue()).get("bnr_list");
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4, "");
        r1.addAll(r3.parseBanner((com.tnkfactory.framework.vo.ValueObject) r4));
        r1 = r8.f37i;
        r2 = ((com.tnkfactory.framework.vo.ValueObject) ((com.tnkfactory.ad.rwd.data.ResultState.Success) r2).getValue()).get("ad_list");
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2, "");
        r1.addAll(r3.parseAdListItem((com.tnkfactory.framework.vo.ValueObject) r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ResultState a(TnkOffRepository tnkOffRepository) throws NoWhenBranchMatchedException {
        ResultState cPSAdList$default;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 53;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            cPSAdList$default = ServiceTask.getCPSAdList$default(tnkOffRepository.a, 0, 0, null);
        } else {
            cPSAdList$default = ServiceTask.getCPSAdList$default(tnkOffRepository.a, 0, 1, null);
        }
    }

    public static final Unit a(TnkOffRepository tnkOffRepository, ArrayList arrayList) {
        int i2 = 2 % 2;
        int i3 = onTransact + 73;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        tnkOffRepository.f38o.clear();
        tnkOffRepository.f38o.addAll(arrayList);
        tnkOffRepository.p.postValue(tnkOffRepository.f38o);
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 9;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return unit;
    }

    public static final Unit a(TnkOffRepository tnkOffRepository, TnkError tnkError) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 117;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tnkError, "");
            tnkOffRepository.f38o.clear();
            tnkOffRepository.p.postValue(tnkOffRepository.f38o);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(tnkError, "");
        tnkOffRepository.f38o.clear();
        tnkOffRepository.p.postValue(tnkOffRepository.f38o);
        Unit unit2 = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 115;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return unit2;
    }

    public static final ResultState c(ResultState resultState) {
        String errorMessage;
        int i2 = 2 % 2;
        if (!(resultState instanceof ResultState.Success)) {
            if (!(resultState instanceof ResultState.Error)) {
                return resultState instanceof ResultState.Pass ? new ResultState.Error(new TnkError(0, "pass", null, 4, null)) : new ResultState.Error(new TnkError(0, "pass", null, 4, null));
            }
            ResultState.Error error = new ResultState.Error(((ResultState.Error) resultState).getE());
            int i3 = onTransact + 15;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return error;
        }
        ResultState.Success success = (ResultState.Success) resultState;
        int i5 = ((ValueObject) success.getValue()).getInt("ret_cd");
        String string = ((ValueObject) success.getValue()).getString("ret_msg");
        if (i5 == 0) {
            return new ResultState.Success(AdListParser.INSTANCE.parseJoinItem((ValueObject) success.getValue()));
        }
        if (string == null) {
            int i6 = IAuthTabCallbackDefault + 55;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            errorMessage = ErrorCodes.INSTANCE.getErrorMessage(i5);
        } else {
            errorMessage = string;
        }
        return new ResultState.Error(new TnkError(i5, errorMessage, null, 4, null));
    }

    public static final ResultState c() {
        int i2 = 2 % 2;
        ResultState.Error error = new ResultState.Error(new TnkError(99, "unknown error", null, 4, null));
        int i3 = onTransact + 79;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return error;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final ResultState b(TnkOffRepository tnkOffRepository) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 25;
        onTransact = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                boolean z = tnkOffRepository.a.getNewsList() instanceof ResultState.Success;
                throw null;
            }
            ResultState<ValueObject> newsList = tnkOffRepository.a.getNewsList();
            if (newsList instanceof ResultState.Success) {
                try {
                    tnkOffRepository.j.clear();
                    tnkOffRepository.j.addAll(AdListParser.INSTANCE.parseNewsListVo((ValueObject) ((ResultState.Success) newsList).getValue()));
                    return new ResultState.Success(new ArrayList(tnkOffRepository.j));
                } catch (Exception e) {
                    return new ResultState.Error(new TnkError(500, "에러 : " + e.getMessage(), e));
                }
            }
            if (newsList instanceof ResultState.Error) {
                return new ResultState.Error(((ResultState.Error) newsList).getE());
            }
            if (!(newsList instanceof ResultState.Pass)) {
                throw new NoWhenBranchMatchedException();
            }
            ResultState.Error error = new ResultState.Error(new TnkError(0, "pass", null, 4, null));
            int i4 = IAuthTabCallbackDefault + 97;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return error;
            }
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = ApiLog.API_LOG_STATE_ERROR;
            }
            return new ResultState.Error(new TnkError(0, message, e2));
        }
    }

    public static final ResultState b(ResultState resultState) {
        int i2 = 2 % 2;
        ResultState.Error error = new ResultState.Error(((ResultState.Error) resultState).getE());
        int i3 = IAuthTabCallbackDefault + 109;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return error;
    }

    public static final ResultState b() {
        int i2 = 2 % 2;
        ResultState.Error error = new ResultState.Error(new TnkError(0, "pass", null, 4, null));
        int i3 = onTransact + 111;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return error;
        }
        throw null;
    }

    private static void s(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 67;
                $11 = i7 % 128;
                if (i7 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 76 - TextUtils.indexOf("", c, 0, 0), 20953 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 77 - TextUtils.getOffsetBefore("", 0), 20951 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i4 = 2;
                c = '0';
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 74 - MotionEvent.axisFromString(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                try {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), KeyEvent.getDeadChar(0, 0) + 63, 12214 - TextUtils.getTrimmedLength(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 71;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i2] - iIntValue);
                    i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i3;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i9 = $10 + 85;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i2] % iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 64, 12214 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 63 - (ViewConfiguration.getEdgeSlop() >> 16), (Process.myPid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static final ResultState a(TnkOffRepository tnkOffRepository, String str) {
        String errorMessage;
        AdItemDao adItemDao;
        int i2 = 2 % 2;
        int i3 = onTransact + 71;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ResultState<ValueObject> placementAdList = tnkOffRepository.a.getPlacementAdList(str);
        if (!(placementAdList instanceof ResultState.Success)) {
            return placementAdList instanceof ResultState.Error ? new ResultState.Error(((ResultState.Error) placementAdList).getE()) : placementAdList instanceof ResultState.Pass ? new ResultState.Error(new TnkError(0, "pass", null, 4, null)) : new ResultState.Error(new TnkError(0, "pass", null, 4, null));
        }
        ResultState.Success success = (ResultState.Success) placementAdList;
        int i5 = ((ValueObject) success.getValue()).getInt("ret_cd");
        String string = ((ValueObject) success.getValue()).getString("ret_msg");
        if (i5 != 0) {
            if (string == null) {
                int i6 = onTransact + 45;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                errorMessage = ErrorCodes.INSTANCE.getErrorMessage(i5);
            } else {
                errorMessage = string;
            }
            return new ResultState.Error(new TnkError(i5, errorMessage, null, 4, null));
        }
        Object obj = ((ValueObject) success.getValue()).get("pub_info");
        Object obj2 = ((ValueObject) success.getValue()).get("ad_list");
        AdListParser adListParser = AdListParser.INSTANCE;
        Intrinsics.checkNotNull(obj, "");
        PlacementPubInfo placementPubInfo = adListParser.parsePlacementPubInfo((ValueObject) obj);
        Intrinsics.checkNotNull(obj2, "");
        PlacementAdList placementAdList2 = new PlacementAdList(placementPubInfo, adListParser.parseAdListItem((ValueObject) obj2));
        AdItemRoomDbImpl adItemRoomDbImpl = tnkOffRepository.d;
        if (adItemRoomDbImpl != null && (adItemDao = adItemRoomDbImpl.adItemDao()) != null) {
            ArrayList adList = placementAdList2.getAdList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(adList, 10));
            Iterator it = adList.iterator();
            while (it.hasNext()) {
                int i8 = onTransact + 5;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                arrayList.add(AdListVoKt.toAdListDto((AdListVo) it.next()));
            }
            AdItemDto[] adItemDtoArr = (AdItemDto[]) arrayList.toArray(new AdItemDto[0]);
            adItemDao.insertAll((AdItemDto[]) Arrays.copyOf(adItemDtoArr, adItemDtoArr.length));
            int i10 = onTransact + 37;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        }
        ResultState.Success success2 = new ResultState.Success(placementAdList2);
        int i12 = IAuthTabCallbackDefault + 91;
        onTransact = i12 % 128;
        int i13 = i12 % 2;
        return success2;
    }

    public static final ResultState a(ResultState resultState) {
        int i2 = 2 % 2;
        ResultState.Success success = new ResultState.Success(AdListParser.INSTANCE.parseCpsFavoriteKeywardVo((ValueObject) ((ResultState.Success) resultState).getValue()));
        int i3 = onTransact + 17;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return success;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final ResultState a(int i2, Ref.ObjectRef objectRef) {
        int i3 = 2 % 2;
        int i4 = onTransact + 33;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            String errorMessage = (String) objectRef.element;
            if (errorMessage == null) {
                errorMessage = ErrorCodes.INSTANCE.getErrorMessage(i2);
            }
            ResultState.Error error = new ResultState.Error(new TnkError(i2, errorMessage, null, 4, null));
            int i5 = IAuthTabCallbackDefault + 107;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return error;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public static final ResultState a() {
        int i2 = 2 % 2;
        ResultState.Error error = new ResultState.Error(new TnkError(0, "pass", null, 4, null));
        int i3 = IAuthTabCallbackDefault + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r4 != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r11 = com.tnkfactory.ad.repository.rpc.parser.AdListParser.INSTANCE;
        r12 = r11.parseAdItem((com.tnkfactory.framework.vo.ValueObject) r10.getValue());
        r12.setCampaignItems(r11.parseActionItem((com.tnkfactory.framework.vo.ValueObject) r10.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        r10 = r12.getCampaignItems();
        r11 = new java.util.ArrayList();
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r10.hasNext() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        r13 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        if (((com.tnkfactory.ad.off.data.AdActionInfoVo) r13).getPayYn() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        r11.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r10 = r11.iterator();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r10.hasNext() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        r12.setPointAmount(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        r0 = r0 + ((com.tnkfactory.ad.off.data.AdActionInfoVo) r10.next()).getPointAmount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r11 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        r10 = com.tnkfactory.ad.off.TnkOffRepository.IAuthTabCallbackDefault + 3;
        com.tnkfactory.ad.off.TnkOffRepository.onTransact = r10 % 128;
        r10 = r10 % 2;
        r5 = com.tnkfactory.ad.rwd.data.constants.ErrorCodes.INSTANCE.getErrorMessage(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        return new com.tnkfactory.ad.rwd.data.ResultState.Error(new com.tnkfactory.ad.TnkError(r4, r5, null, 4, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if ((r10 instanceof com.tnkfactory.ad.rwd.data.ResultState.Error) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        return new com.tnkfactory.ad.rwd.data.ResultState.Error(((com.tnkfactory.ad.rwd.data.ResultState.Error) r10).getE());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if ((r10 instanceof com.tnkfactory.ad.rwd.data.ResultState.Pass) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        return new com.tnkfactory.ad.rwd.data.ResultState.Error(new com.tnkfactory.ad.TnkError(0, "pass", null, 4, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        return new com.tnkfactory.ad.rwd.data.ResultState.Error(new com.tnkfactory.ad.TnkError(99, "unknown error", null, 4, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((r10 instanceof com.tnkfactory.ad.rwd.data.ResultState.Success) != true) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((r10 instanceof com.tnkfactory.ad.rwd.data.ResultState.Success) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r10 = (com.tnkfactory.ad.rwd.data.ResultState.Success) r10;
        r4 = ((com.tnkfactory.framework.vo.ValueObject) r10.getValue()).getInt("ret_cd", 500);
        r11 = ((com.tnkfactory.framework.vo.ValueObject) r10.getValue()).getString("ret_msg");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ResultState a(TnkOffRepository tnkOffRepository, long j, int i2) {
        ResultState actionInfoV3$default;
        AdListVo adItem;
        int i3 = 2 % 2;
        int i4 = onTransact + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            actionInfoV3$default = ServiceTask.getActionInfoV3$default(tnkOffRepository.a, j, i2, false, 2, null);
        } else {
            actionInfoV3$default = ServiceTask.getActionInfoV3$default(tnkOffRepository.a, j, i2, false, 4, null);
        }
        return new ResultState.Success(adItem);
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{32511, 32491, 32503, 32500, 32429, 32432, 32488, 32433, 32497, 32510, 32452, 32508, 32496, 32498};
        onNavigationEvent = -1184333977;
        IAuthTabCallback = true;
        onWarmupCompleted = true;
    }
}
