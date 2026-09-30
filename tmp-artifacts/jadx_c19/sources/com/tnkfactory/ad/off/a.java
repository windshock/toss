package com.tnkfactory.ad.off;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.repository.rpc.parser.AdListParser;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.rwd.CampaignType;
import com.tnkfactory.ad.rwd.PubInfo;
import com.tnkfactory.ad.rwd.api.ServiceTask;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.framework.vo.ValueObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.setUnreadableElfFiles;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class a extends SuspendLambda implements Function2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onWarmupCompleted = {27330, 27483, 27483, 27479, 27487, 27486, 27248, 27341, 27335, 27337, 27336, 27173, 27143, 27146};
    public setUnreadableElfFiles a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ TnkOffRepository d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TnkOffRepository tnkOffRepository, access13800 access13800Var) {
        super(2, access13800Var);
        this.d = tnkOffRepository;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        int i2 = 2 % 2;
        a aVar = new a(this.d, access13800Var);
        aVar.c = obj;
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        a aVar = new a(this.d, (access13800) obj2);
        aVar.c = (findResAndMsg) obj;
        Object objInvokeSuspend = aVar.invokeSuspend(Unit.INSTANCE);
        int i3 = onExtraCallback + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        final findResAndMsg findresandmsg;
        final setUnreadableElfFiles setunreadableelffiles;
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.b;
        Object obj2 = null;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            findResAndMsg findresandmsg2 = (findResAndMsg) this.c;
            final TnkOffRepository tnkOffRepository = this.d;
            setUnreadableElfFiles setunreadableelffiles2 = new setUnreadableElfFiles() { // from class: com.tnkfactory.ad.off.a$$ExternalSyntheticLambda0
                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                    return a.a(tnkOffRepository, (List) obj3, (List) obj4, (PubInfo) obj5, (List) obj6, (List) obj7);
                }
            };
            TnkOffRepository tnkOffRepository2 = this.d;
            this.c = findresandmsg2;
            this.a = setunreadableelffiles2;
            this.b = 1;
            if (tnkOffRepository2.loadJoinMultiList(this) == objOnWarmupCompleted) {
                int i4 = onExtraCallback + 39;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
            findresandmsg = findresandmsg2;
            setunreadableelffiles = setunreadableelffiles2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = IAuthTabCallback + 43;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                obj2.hashCode();
                throw null;
            }
            setunreadableelffiles = this.a;
            findresandmsg = (findResAndMsg) this.c;
            ResultKt.onNavigationEvent(obj);
        }
        final TnkOffRepository tnkOffRepository3 = this.d;
        return new TnkResultTask(new Function0() { // from class: com.tnkfactory.ad.off.a$$ExternalSyntheticLambda1
            public final Object invoke() {
                return a.a(findresandmsg, tnkOffRepository3, setunreadableelffiles);
            }
        });
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onWarmupCompleted;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ExpandableListView.getPackedPositionGroup(j) + 35, 14239 - ((Process.getThreadPriority(0) + 20) >> 6), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = $10 + 43;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 65, 16718 - (ViewConfiguration.getLongPressTimeout() >> 16), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i11 = 75 / 0;
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 10935), 65 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49468), 71 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12486 - Color.green(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i13 = $10 + 101;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 + i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 - i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i14 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i14, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $11 + 53;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $10 + 39;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 3 % 4;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static final Unit a(TnkOffRepository tnkOffRepository, List list, List list2, PubInfo pubInfo, List list3, List list4) throws Throwable {
        Object next;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        tnkOffRepository.getRwdFilter().setFilterData(list);
        tnkOffRepository.getCuriation().addAll(list2);
        tnkOffRepository.setPubInfo(pubInfo);
        tnkOffRepository.getAdList().addAll(list3);
        Iterator it = list4.iterator();
        int i5 = onExtraCallback + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                tnkOffRepository.getBannerList().addAll(list4);
                try {
                    CampaignType.INSTANCE.updateCampaignType(tnkOffRepository.getContext(), tnkOffRepository.getPubInfo().getCtype_surl());
                } catch (Exception unused) {
                }
                for (CategorySet categorySet : tnkOffRepository.getRwdFilter().getCategorySet()) {
                    if (categorySet.getCatUrl() != null) {
                        String catUrl = categorySet.getCatUrl();
                        Intrinsics.checkNotNull(catUrl);
                        if (StringsKt.contains$default(catUrl, "tnpick", false, 2, (Object) null)) {
                            TnkOffRepository.Companion companion = TnkOffRepository.Companion;
                            String authority = Uri.parse(categorySet.getCatUrl()).getAuthority();
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr = new Object[1];
                            e(new int[]{6, 8, 21, 0}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0}, objArr);
                            sb.append(((String) objArr[0]).intern());
                            sb.append(authority);
                            companion.setTnpickUrl(sb.toString());
                            int i7 = IAuthTabCallback + 69;
                            onExtraCallback = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                }
                tnkOffRepository.getDataChanged().postValue(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            int i9 = onExtraCallback + 91;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            BannerItem bannerItem = (BannerItem) it.next();
            Iterator<T> it2 = tnkOffRepository.getAdList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((AdListVo) next).getAppId() == bannerItem.getApp_id()) {
                    break;
                }
            }
            AdListVo adListVo = (AdListVo) next;
            if (adListVo != null) {
                int i11 = IAuthTabCallback + 27;
                onExtraCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    bannerItem.setPointAmount(adListVo.getPointAmount());
                    bannerItem.setPointUnit(adListVo.getPointUnit());
                    obj.hashCode();
                    throw null;
                }
                bannerItem.setPointAmount(adListVo.getPointAmount());
                bannerItem.setPointUnit(adListVo.getPointUnit());
            }
        }
    }

    public static final ResultState a(findResAndMsg findresandmsg, TnkOffRepository tnkOffRepository, setUnreadableElfFiles setunreadableelffiles) {
        synchronized (findresandmsg) {
            try {
                if (!tnkOffRepository.getAdItemRepository().isNeedUpdate()) {
                    tnkOffRepository.getAdList().clear();
                    tnkOffRepository.getCuriation().clear();
                    tnkOffRepository.getBannerList().clear();
                    List<AdListVo> adList = tnkOffRepository.getAdItemRepository().getAdList();
                    if (!adList.isEmpty()) {
                        setunreadableelffiles.invoke(tnkOffRepository.getAdItemRepository().getArrCategory(), tnkOffRepository.getAdItemRepository().getCuration(), tnkOffRepository.getAdItemRepository().getPubInfo(), adList, tnkOffRepository.getAdItemRepository().getArrBanner());
                        return new ResultState.Success(new ArrayList(tnkOffRepository.getAdList()));
                    }
                }
            } catch (Exception unused) {
            }
            ResultState adList$default = ServiceTask.getAdList$default(tnkOffRepository.getServiceTask(), 0, 1, null);
            if (adList$default instanceof ResultState.Success) {
                ValueObject valueObject = (ValueObject) ((ResultState.Success) adList$default).getValue();
                Object[] objArr = new Object[1];
                e(new int[]{0, 6, 165, 0}, true, new byte[]{1, 0, 1, 0, 0, 1}, objArr);
                Object obj = valueObject.get(((String) objArr[0]).intern());
                Intrinsics.checkNotNull(obj, "");
                Object obj2 = ((ValueObject) obj).get("ret_cd");
                Intrinsics.checkNotNull(obj2, "");
                int iIntValue = ((Integer) obj2).intValue();
                if (iIntValue != 0) {
                    return new ResultState.Error(new TnkError(500, "에러 : " + ErrorCodes.INSTANCE.getErrorMessage(iIntValue), null, 4, null));
                }
                try {
                    tnkOffRepository.getAdList().clear();
                    tnkOffRepository.getCuriation().clear();
                    tnkOffRepository.getBannerList().clear();
                    AdListParser adListParser = AdListParser.INSTANCE;
                    Object obj3 = ((ValueObject) ((ResultState.Success) adList$default).getValue()).get("cat_set");
                    Intrinsics.checkNotNull(obj3, "");
                    List<CategorySet> category = adListParser.parseCategory((ValueObject) obj3);
                    Object obj4 = ((ValueObject) ((ResultState.Success) adList$default).getValue()).get("crt_set");
                    Intrinsics.checkNotNull(obj4, "");
                    List<AdListCuration> curation = adListParser.parseCuration((ValueObject) obj4);
                    Object obj5 = ((ValueObject) ((ResultState.Success) adList$default).getValue()).get("pub_info");
                    Intrinsics.checkNotNull(obj5, "");
                    PubInfo pubInfo = adListParser.parsePubInfo((ValueObject) obj5);
                    Object obj6 = ((ValueObject) ((ResultState.Success) adList$default).getValue()).get("ad_list");
                    Intrinsics.checkNotNull(obj6, "");
                    ArrayList<AdListVo> adListItem = adListParser.parseAdListItem((ValueObject) obj6);
                    Object obj7 = ((ValueObject) ((ResultState.Success) adList$default).getValue()).get("bnr_list");
                    Intrinsics.checkNotNull(obj7, "");
                    List<BannerItem> banner = adListParser.parseBanner((ValueObject) obj7);
                    setunreadableelffiles.invoke(category, curation, pubInfo, adListItem, banner);
                    tnkOffRepository.getAdItemRepository().setArrCategory(category);
                    tnkOffRepository.getAdItemRepository().setCuration(curation);
                    tnkOffRepository.getAdItemRepository().setPubInfo(pubInfo);
                    tnkOffRepository.getAdItemRepository().setAdList(adListItem);
                    tnkOffRepository.getAdItemRepository().setArrBanner(banner);
                    tnkOffRepository.getAdItemRepository().saveLastUpdate();
                    return new ResultState.Success(new ArrayList(tnkOffRepository.getAdList()));
                } catch (Exception e) {
                    return new ResultState.Error(new TnkError(500, "에러 : " + e.getMessage(), e));
                }
            }
            if (adList$default instanceof ResultState.Error) {
                return new ResultState.Error(((ResultState.Error) adList$default).getE());
            }
            if (adList$default instanceof ResultState.Pass) {
                return new ResultState.Error(new TnkError(0, "pass", null, 4, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
