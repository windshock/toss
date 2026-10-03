package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import o.EnvelopedData;
import o.SetDetectableSize;
import o._string;
import o.deserializeUriNullableCollection;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EnvelopedData extends isTestMode {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 1;
    private static final List<buildArgumentExtractors> SHIPPING_STATUS;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int[] onWarmupCompleted;
    private final Rmipmap<Unit> _bannerClickedEvent;
    private final MutableLiveData<nativeToCircleWithBorderFilter> _cardInfo;
    private final Rmipmap<toCircle> _cardStatusRouteEvent;
    private final Rmipmap<Throwable> _errorEvent;
    private final MediatorLiveData<List<getOther>> _items;
    private final Rmipmap<Integer> _monthTextSelectedEvent;
    private final Rmipmap<Pair<String, copyBitmap>> _noticeClickedEvent;
    private final MutableLiveData<Boolean> _swipeRefreshing;
    private final LiveData<Unit> bannerClickedEvent;
    private Long cardId;
    private final LiveData<nativeToCircleWithBorderFilter> cardInfo;
    private final LiveData<toCircle> cardStatusRouteEvent;
    private final LiveData<Throwable> errorEvent;
    private final LiveData<List<getOther>> items;
    private int monthOffset;
    private final LiveData<Integer> monthTextSelectedEvent;
    private final LiveData<Pair<String, copyBitmap>> noticeClickedEvent;
    private toCircle plccCard;
    private RemoveImageTransformMetaDataProducer plccNotice;
    private final LiveData<Boolean> swipeRefreshing;
    private deserializeUriNullableCollection transactionFetcher;
    private final MutableLiveData<Pair<String, RepeatedPostprocessorRunner>> transactionListInfo;

    static final /* synthetic */ class asBinder implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 function;

        asBinder(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.function = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.function;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.function.invoke(obj);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(EnvelopedData envelopedData) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(envelopedData);
        int i4 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        int i5 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(boolean z, EnvelopedData envelopedData) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(z, envelopedData);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        EnvelopedData envelopedData = (EnvelopedData) objArr[0];
        String str = (String) objArr[1];
        Triple triple = (Triple) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(envelopedData, str, triple);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(envelopedData, str, triple);
        int i3 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        EnvelopedData envelopedData = (EnvelopedData) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(envelopedData);
        int i4 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        EnvelopedData envelopedData = (EnvelopedData) objArr[0];
        toCircle tocircle = (toCircle) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(envelopedData, tocircle, view);
        }
        onExtraCallbackWithResult(envelopedData, tocircle, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        EnvelopedData envelopedData = (EnvelopedData) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(envelopedData, view);
        int i4 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder = (GingerbreadPurgeableDecoder) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(gingerbreadPurgeableDecoder, view);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Unit unit;
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{function1, obj}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1344236439, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1344236449, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            int i3 = 97 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{function1, obj}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1344236439, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1344236449, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        }
        int i4 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(EnvelopedData envelopedData) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(envelopedData);
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(EnvelopedData envelopedData, MediatorLiveData mediatorLiveData, Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(envelopedData, mediatorLiveData, pair);
        }
        onWarmupCompleted(envelopedData, mediatorLiveData, pair);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, EnvelopedData envelopedData, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(z, envelopedData, deserializeurinullablecollection);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(z, envelopedData, deserializeurinullablecollection);
        int i3 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i4 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        View view = (View) objArr[0];
        GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder = (GingerbreadPurgeableDecoder) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(view, gingerbreadPurgeableDecoder, setDetectableSize);
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EnvelopedData envelopedData, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(envelopedData, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(envelopedData, view);
        int i3 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(EnvelopedData envelopedData, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(envelopedData, th);
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(list);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(EnvelopedData envelopedData, List list) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(envelopedData, list);
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(EnvelopedData envelopedData, RemoveImageTransformMetaDataProducer removeImageTransformMetaDataProducer) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(envelopedData, removeImageTransformMetaDataProducer);
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = i | i7;
        int i11 = (~(i | i5)) | (~(i7 | (~i5) | i8)) | (~(i5 | i3));
        int i12 = i5 + i3 + i4 + (764943627 * i6) + (189947931 * i2);
        int i13 = i12 * i12;
        int i14 = ((i5 * (-973936384)) - 801505280) + ((-973936384) * i3) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i4) + ((-1475084288) * i6) + ((-1479278592) * i2) + ((-626393088) * i13);
        int i15 = (i5 * 1860537600) + 224780607 + (i3 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i4 * 1860538117) + (i6 * (-1861700041)) + (i2 * (-831392377)) + (i13 * 995229696);
        switch (i14 + (i15 * i15 * 1053163520)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return getInterfaceDescriptor(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            case 12:
                return access100(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public EnvelopedData() {
        MutableLiveData<Pair<String, RepeatedPostprocessorRunner>> mutableLiveData = new MutableLiveData<>();
        this.transactionListInfo = mutableLiveData;
        final MediatorLiveData<List<getOther>> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(mutableLiveData, new asBinder(new Function1() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return EnvelopedData.onExtraCallback(this.f$0, mediatorLiveData, (Pair) obj);
            }
        }));
        this._items = mediatorLiveData;
        this.items = onNavigationEvent((MutableLiveData) mediatorLiveData);
        MutableLiveData<nativeToCircleWithBorderFilter> mutableLiveData2 = new MutableLiveData<>();
        this._cardInfo = mutableLiveData2;
        this.cardInfo = onNavigationEvent(mutableLiveData2);
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this._swipeRefreshing = mutableLiveData3;
        this.swipeRefreshing = onNavigationEvent(mutableLiveData3);
        Rmipmap<Integer> rmipmap = new Rmipmap<>();
        this._monthTextSelectedEvent = rmipmap;
        this.monthTextSelectedEvent = onNavigationEvent((MutableLiveData) rmipmap);
        Rmipmap<Unit> rmipmap2 = new Rmipmap<>();
        this._bannerClickedEvent = rmipmap2;
        this.bannerClickedEvent = onNavigationEvent((MutableLiveData) rmipmap2);
        Rmipmap<Pair<String, copyBitmap>> rmipmap3 = new Rmipmap<>();
        this._noticeClickedEvent = rmipmap3;
        this.noticeClickedEvent = onNavigationEvent((MutableLiveData) rmipmap3);
        Rmipmap<toCircle> rmipmap4 = new Rmipmap<>();
        this._cardStatusRouteEvent = rmipmap4;
        this.cardStatusRouteEvent = onNavigationEvent((MutableLiveData) rmipmap4);
        Rmipmap<Throwable> rmipmap5 = new Rmipmap<>();
        this._errorEvent = rmipmap5;
        this.errorEvent = onNavigationEvent((MutableLiveData) rmipmap5);
    }

    public final void onExtraCallbackWithResult(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.cardId = l;
        int i5 = i3 + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cardId;
        }
        throw null;
    }

    public final void IAuthTabCallback(@Nullable toCircle tocircle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        this.plccCard = tocircle;
        int i5 = i3 + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        EnvelopedData envelopedData = (EnvelopedData) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Object obj = null;
        int i5 = envelopedData.monthOffset;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 67;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    private final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1WriteTypedObject = CommonModule_closeView.onWarmupCompleted.writeTypedObject();
        Calendar calendarOnNavigationEvent = zzaj.onWarmupCompleted().onNavigationEvent();
        calendarOnNavigationEvent.add(2, this.monthOffset);
        String str = idGeneratorExternalSyntheticLambda1WriteTypedObject.format(calendarOnNavigationEvent.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter $observeOn;
        final /* synthetic */ MapConverter $subscribeOn;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.$subscribeOn = mapConverter;
            this.$observeOn = mapConverter2;
        }

        public final deserializeIp<List<? extends RemoveImageTransformMetaDataProducer>> apply(writeRaw<BaseApiResponse<List<? extends RemoveImageTransformMetaDataProducer>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainNonConfigurationInstance(new Function1<BaseApiResponse<List<? extends RemoveImageTransformMetaDataProducer>>, deserializeIp<? extends List<? extends RemoveImageTransformMetaDataProducer>>>() { // from class: o.EnvelopedData.onExtraCallbackWithResult.4
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends RemoveImageTransformMetaDataProducer>> invoke(BaseApiResponse<List<? extends RemoveImageTransformMetaDataProducer>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
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
            MapConverter mapConverter = this.$subscribeOn;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.$observeOn;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter $observeOn;
        final /* synthetic */ MapConverter $subscribeOn;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.$subscribeOn = mapConverter;
            this.$observeOn = mapConverter2;
        }

        public final deserializeIp<List<? extends toCircle>> apply(writeRaw<BaseApiResponse<List<? extends toCircle>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainNonConfigurationInstance(new Function1<BaseApiResponse<List<? extends toCircle>>, deserializeIp<? extends List<? extends toCircle>>>() { // from class: o.EnvelopedData.onNavigationEvent.4
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends toCircle>> invoke(BaseApiResponse<List<? extends toCircle>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
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
            MapConverter mapConverter = this.$subscribeOn;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.$observeOn;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter $observeOn;
        final /* synthetic */ MapConverter $subscribeOn;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.$subscribeOn = mapConverter;
            this.$observeOn = mapConverter2;
        }

        public final deserializeIp<RepeatedPostprocessorRunner> apply(writeRaw<BaseApiResponse<RepeatedPostprocessorRunner>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$onRetainNonConfigurationInstance(new Function1<BaseApiResponse<RepeatedPostprocessorRunner>, deserializeIp<? extends RepeatedPostprocessorRunner>>() { // from class: o.EnvelopedData.onWarmupCompleted.3
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends RepeatedPostprocessorRunner> invoke(BaseApiResponse<RepeatedPostprocessorRunner> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = RepeatedPostprocessorRunner.class.newInstance();
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
            MapConverter mapConverter = this.$subscribeOn;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.$observeOn;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static final Unit onWarmupCompleted(EnvelopedData envelopedData, MediatorLiveData mediatorLiveData, Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            String str = (String) pair.onExtraCallbackWithResult();
            Intrinsics.areEqual(str, envelopedData.IAuthTabCallback_Parcel());
            throw null;
        }
        String str2 = (String) pair.onExtraCallbackWithResult();
        RepeatedPostprocessorRunner repeatedPostprocessorRunner = (RepeatedPostprocessorRunner) pair.IAuthTabCallback();
        if (!(!Intrinsics.areEqual(str2, envelopedData.IAuthTabCallback_Parcel()))) {
            int i3 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            mediatorLiveData.setValue(envelopedData.IAuthTabCallback(repeatedPostprocessorRunner));
        }
        return Unit.INSTANCE;
    }

    public final LiveData<List<getOther>> onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.items;
        }
        throw null;
    }

    public final LiveData<nativeToCircleWithBorderFilter> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LiveData<nativeToCircleWithBorderFilter> liveData = this.cardInfo;
        int i5 = i3 + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final LiveData<Boolean> access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LiveData<Boolean> liveData = this.swipeRefreshing;
        int i5 = i2 + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return liveData;
        }
        throw null;
    }

    public final LiveData<Integer> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LiveData<Integer> liveData = this.monthTextSelectedEvent;
        int i5 = i2 + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final LiveData<Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LiveData<Unit> liveData = this.bannerClickedEvent;
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return liveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LiveData<Pair<String, copyBitmap>> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        LiveData<Pair<String, copyBitmap>> liveData = this.noticeClickedEvent;
        int i5 = i3 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return liveData;
    }

    public final LiveData<toCircle> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        LiveData<toCircle> liveData = this.cardStatusRouteEvent;
        int i4 = i3 + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return liveData;
    }

    public final LiveData<Throwable> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        LiveData<Throwable> liveData = this.errorEvent;
        int i5 = i3 + 39;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    private final getRecipientInfos writeTypedObject() {
        Object obj;
        Object next;
        int i = 2 % 2;
        List list = (List) this._items.getValue();
        if (list != null) {
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i4 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    boolean z = ((getOther) it.next()) instanceof getRecipientInfos;
                    getrecipientinfos.hashCode();
                    throw null;
                }
                next = it.next();
                if (((getOther) next) instanceof getRecipientInfos) {
                    break;
                }
            }
            obj = (getOther) next;
        } else {
            obj = null;
        }
        getrecipientinfos = obj instanceof getRecipientInfos ? (getRecipientInfos) obj : null;
        return getrecipientinfos == null ? new getRecipientInfos((nativeToCircleWithBorderFilter) this._cardInfo.getValue(), this.monthOffset, new Function0() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda14
            public final Object invoke() {
                return EnvelopedData.onExtraCallback(this.f$0);
            }
        }) : getrecipientinfos;
    }

    private static final Unit onExtraCallbackWithResult(EnvelopedData envelopedData) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{envelopedData}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1269883453, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1269883445, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{envelopedData}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1269883453, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1269883445, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(EnvelopedData envelopedData, int i, boolean z, int i2, Object obj) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 77;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 35;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                i = envelopedData.monthOffset;
                int i8 = 20 / 0;
            } else {
                i = envelopedData.monthOffset;
            }
        }
        if ((i2 & 2) != 0) {
            int i9 = onExtraCallbackWithResult;
            int i10 = i9 + 65;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 43;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            z = false;
        }
        envelopedData.onExtraCallback(i, z);
    }

    public final void onExtraCallback(int i, final boolean z) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
            if (this.cardId == null) {
                return;
            }
        } else if (this.cardId == null) {
            return;
        }
        this.monthOffset = i;
        final String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        deserializeUriNullableCollection deserializeurinullablecollection = this.transactionFetcher;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
        setTagBytes settagbytes = setTagBytes.onNavigationEvent;
        writeRaw<Unit> writerawIAuthTabCallback = IAuthTabCallback();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (Process.myPid() >> 22)), 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getEdgeSlop() >> 16)), 21 - TextUtils.indexOf((CharSequence) "", '0'), 24734 - Color.alpha(0), -1144844641, false, "access100", new Class[0]);
            }
            writeRaw<BaseApiResponse<List<RemoveImageTransformMetaDataProducer>>> writerawIAuthTabCallback2 = ((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback3 = writerawIAuthTabCallback2.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback3, "");
            try {
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29426), View.resolveSize(0, 0) + 22, ((Process.getThreadPriority(0) + 20) >> 6) + 24734, -1144844641, false, "access100", new Class[0]);
                }
                writeRaw<BaseApiResponse<RepeatedPostprocessorRunner>> writerawOnExtraCallbackWithResult = ((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback3).invoke(obj, null)).onExtraCallbackWithResult(strIAuthTabCallback_Parcel);
                MapConverter mapConverterOnExtraCallback2 = clearTid.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback2, "");
                writeRaw writerawIAuthTabCallback4 = writerawOnExtraCallbackWithResult.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback2, null));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback4, "");
                writeRaw writerawIAuthTabCallback5 = settagbytes.onExtraCallbackWithResult(writerawIAuthTabCallback, writerawIAuthTabCallback3, writerawIAuthTabCallback4).IAuthTabCallback(NetConverter3.onExtraCallback());
                final Function1 function1 = new Function1() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj2) {
                        return EnvelopedData.onExtraCallback(z, this, (deserializeUriNullableCollection) obj2);
                    }
                };
                writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback5.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda10
                    public final void accept(Object obj2) {
                        EnvelopedData.onExtraCallback(function1, obj2);
                    }
                }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda11
                    public final void run() {
                        EnvelopedData.IAuthTabCallback(z, this);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                this.transactionFetcher = onExtraCallbackWithResult(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj2) {
                        return EnvelopedData.onExtraCallbackWithResult(this.f$0, (Throwable) obj2);
                    }
                }, new Function1() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj2) {
                        Object[] objArr = {this.f$0, strIAuthTabCallback_Parcel, (Triple) obj2};
                        return (Unit) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1830666615, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1830666622, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                    }
                }));
                int i5 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
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

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(boolean z, EnvelopedData envelopedData, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        if (!(!z)) {
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            envelopedData._swipeRefreshing.setValue(Boolean.TRUE);
            int i4 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            envelopedData._items.setValue(envelopedData.IAuthTabCallback((RepeatedPostprocessorRunner) null));
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(boolean z, EnvelopedData envelopedData) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            envelopedData._swipeRefreshing.setValue(Boolean.FALSE);
            if (i6 == 0) {
                int i7 = 7 / 0;
            }
        }
    }

    public static final class onExtraCallback<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((KitKatPurgeableDecoder) t2).onNavigationEvent().getTime()), Long.valueOf(((KitKatPurgeableDecoder) t).onNavigationEvent().getTime()));
        }
    }

    private static final Unit onExtraCallback(EnvelopedData envelopedData, String str, Triple triple) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List list = (List) triple.onExtraCallback();
        RepeatedPostprocessorRunner repeatedPostprocessorRunner = (RepeatedPostprocessorRunner) triple.IAuthTabCallback();
        envelopedData._cardInfo.setValue(repeatedPostprocessorRunner.onExtraCallback());
        Intrinsics.checkNotNull(list);
        envelopedData.plccNotice = (RemoveImageTransformMetaDataProducer) CollectionsKt.firstOrNull(list);
        envelopedData.transactionListInfo.setValue(getWrite.IAuthTabCallback(str, repeatedPostprocessorRunner));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(EnvelopedData envelopedData, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            envelopedData._errorEvent.setValue(th);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        envelopedData._errorEvent.setValue(th);
        int i3 = 57 / 0;
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, 0, true, 1, null);
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(EnvelopedData envelopedData, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        Long lValueOf = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(list);
            envelopedData.plccCard = (toCircle) CollectionsKt.firstOrNull(list);
            toCircle tocircle = (toCircle) CollectionsKt.firstOrNull(list);
            if (tocircle != null) {
                lValueOf = Long.valueOf(tocircle.onExtraCallbackWithResult());
            } else {
                int i3 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            envelopedData.cardId = lValueOf;
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(list);
        envelopedData.plccCard = (toCircle) CollectionsKt.firstOrNull(list);
        lValueOf.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Unit) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(list, "");
        int i3 = 20 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 29426), (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 21, 24734 - android.text.TextUtils.getOffsetBefore("", 0), -842029757, false, "onWarmupCompleted", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        r1 = ((java.lang.reflect.Field) r1).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1023870124);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r5 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.text.TextUtils.getOffsetAfter("", 0) + 29426), 22 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 24734 - android.text.TextUtils.indexOf("", "", 0), -206043708, false, "getInterfaceDescriptor", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        r1 = ((o.FullScreenAdShowConfigBuilder) ((java.lang.reflect.Method) r5).invoke(r1, null)).onExtraCallbackWithResult();
        r2 = o.clearTid.onExtraCallback();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r1 = r1.IAuthTabCallback(new o.EnvelopedData.onNavigationEvent(r2, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3 = new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda0(r13);
        r1 = r1.onNavigationEvent(new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda1(r3));
        r2 = new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda2();
        r1 = r1.onWarmupCompleted(new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda3(r2));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r2 = o.EnvelopedData.IAuthTabCallback + 125;
        o.EnvelopedData.onExtraCallbackWithResult = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r13.plccCard != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r13.plccCard != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = o.writeRaw.onExtraCallback(kotlin.Unit.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r2 = o.EnvelopedData.IAuthTabCallback + 19;
        o.EnvelopedData.onExtraCallbackWithResult = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.writeRaw<kotlin.Unit> IAuthTabCallback() throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.EnvelopedData.onExtraCallbackWithResult
            int r1 = r1 + 107
            int r2 = r1 % 128
            o.EnvelopedData.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            o.toCircle r1 = r13.plccCard
            r3 = 51
            int r3 = r3 / r2
            if (r1 == 0) goto L2e
            goto L1b
        L17:
            o.toCircle r1 = r13.plccCard
            if (r1 == 0) goto L2e
        L1b:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            o.writeRaw r1 = o.writeRaw.onExtraCallback(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = o.EnvelopedData.IAuthTabCallback
            int r2 = r2 + 19
            int r3 = r2 % 128
            o.EnvelopedData.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            return r1
        L2e:
            r1 = -57713709(0xfffffffffc8f5bd3, float:-5.954887E36)
            java.lang.Object r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(r1)
            java.lang.String r3 = ""
            if (r1 != 0) goto L5b
            int r1 = android.view.View.resolveSizeAndState(r2, r2, r2)
            int r1 = r1 + 29426
            char r4 = (char) r1
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r5 = r1 + 21
            int r1 = android.text.TextUtils.getOffsetBefore(r3, r2)
            int r6 = 24734 - r1
            r7 = -842029757(0xffffffffcdcfa543, float:-4.354643E8)
            r8 = 0
            java.lang.String r9 = "onWarmupCompleted"
            r10 = 0
            java.lang.Object r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(r4, r5, r6, r7, r8, r9, r10)
        L5b:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            r5 = -1023870124(0xffffffffc2f8fb54, float:-124.490875)
            java.lang.Object r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(r5)     // Catch: java.lang.Throwable -> Ld5
            if (r5 != 0) goto L8d
            int r5 = android.text.TextUtils.getOffsetAfter(r3, r2)     // Catch: java.lang.Throwable -> Ld5
            int r5 = r5 + 29426
            char r6 = (char) r5     // Catch: java.lang.Throwable -> Ld5
            r5 = 0
            float r7 = android.graphics.PointF.length(r5, r5)     // Catch: java.lang.Throwable -> Ld5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r7 = 22 - r5
            int r5 = android.text.TextUtils.indexOf(r3, r3, r2)     // Catch: java.lang.Throwable -> Ld5
            int r8 = 24734 - r5
            r9 = -206043708(0xfffffffff3b805c4, float:-2.9159533E31)
            r10 = 0
            java.lang.String r11 = "getInterfaceDescriptor"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r5 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Ld5
        L8d:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r1 = r5.invoke(r1, r4)     // Catch: java.lang.Throwable -> Ld5
            o.FullScreenAdShowConfigBuilder r1 = (o.FullScreenAdShowConfigBuilder) r1     // Catch: java.lang.Throwable -> Ld5
            o.writeRaw r1 = r1.onExtraCallbackWithResult()
            o.MapConverter r2 = o.clearTid.onExtraCallback()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            o.EnvelopedData$onNavigationEvent r5 = new o.EnvelopedData$onNavigationEvent
            r5.<init>(r2, r4)
            o.writeRaw r1 = r1.IAuthTabCallback(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda1 r2 = new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda1
            viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda0 r3 = new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda0
            r3.<init>()
            r2.<init>()
            o.writeRaw r1 = r1.onNavigationEvent(r2)
            viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda2 r2 = new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda2
            r2.<init>()
            viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda3 r3 = new viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda3
            r3.<init>()
            o.writeRaw r1 = r1.onWarmupCompleted(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = o.EnvelopedData.IAuthTabCallback
            int r2 = r2 + 125
            int r3 = r2 % 128
            o.EnvelopedData.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            return r1
        Ld5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto Ldd
            throw r1
        Ldd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EnvelopedData.IAuthTabCallback():o.writeRaw");
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 73 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 8848 - Drawable.resolveOpacity(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 101;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = -1469660336;
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
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i9]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 72, 8848 - TextUtils.getTrimmedLength(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9++;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $11 + 29;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 22252), (Process.myPid() >> 22) + 39, 10301 - Color.alpha(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getJumpTapTimeout() >> 16)), '~' - AndroidCharacter.getMirror('0'), 7398 - View.combineMeasuredStates(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onWarmupCompleted(EnvelopedData envelopedData, RemoveImageTransformMetaDataProducer removeImageTransformMetaDataProducer) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        envelopedData._noticeClickedEvent.setValue(getWrite.IAuthTabCallback(removeImageTransformMetaDataProducer.onExtraCallbackWithResult(), removeImageTransformMetaDataProducer.onExtraCallback()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "impression");
        setDetectableSize.onExtraCallback("screen_name", "tosscreditcard__payment_history");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(EnvelopedData envelopedData) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        envelopedData.readTypedObject();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(View view, GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder, SetDetectableSize setDetectableSize) throws Throwable {
        AFj1oSDKAFa1ySDK aFj1oSDKAFa1ySDK;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        AFj1oSDKAFa1ySDK context = view.getContext();
        String screenName = null;
        if (context instanceof AFj1oSDKAFa1ySDK) {
            int i4 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                screenName.hashCode();
                throw null;
            }
            aFj1oSDKAFa1ySDK = context;
        } else {
            aFj1oSDKAFa1ySDK = null;
        }
        if (aFj1oSDKAFa1ySDK != null) {
            int i5 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                aFj1oSDKAFa1ySDK.getScreenName();
                throw null;
            }
            screenName = aFj1oSDKAFa1ySDK.getScreenName();
        }
        setDetectableSize.onExtraCallback("screen_name", screenName);
        Object[] objArr = new Object[1];
        a(new int[]{1863139265, 481657196}, 3 - ExpandableListView.getPackedPositionChild(0L), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), String.valueOf(gingerbreadPurgeableDecoder.onNavigationEvent()));
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder, final View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard_payment_history_event_banner", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                Object[] objArr = {view, gingerbreadPurgeableDecoder, (SetDetectableSize) obj};
                return (Unit) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 183942145, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -183942141, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            }
        }, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<o.getOther> IAuthTabCallback(o.RepeatedPostprocessorRunner r23) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EnvelopedData.IAuthTabCallback(o.RepeatedPostprocessorRunner):java.util.List");
    }

    private static final Unit IAuthTabCallback(EnvelopedData envelopedData, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onExtraCallback(envelopedData, envelopedData.monthOffset, false, 3, null);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            onExtraCallback(envelopedData, envelopedData.monthOffset - 1, false, 2, null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 10; i2++) {
            arrayList.add(new getKekid(i2));
        }
        int i3 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(EnvelopedData envelopedData) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Rmipmap<Unit> rmipmap = envelopedData._bannerClickedEvent;
        Unit unit = Unit.INSTANCE;
        rmipmap.setValue(unit);
        int i4 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final List<getOther> onWarmupCompleted(RepeatedPostprocessorRunner repeatedPostprocessorRunner) {
        nativeToCircleWithBorderFilter nativetocirclewithborderfilterOnExtraCallback;
        nativeAddRoundedCornersFilter nativeaddroundedcornersfilterOnWarmupCompleted;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        getRecipientInfos getrecipientinfosWriteTypedObject = writeTypedObject();
        nativeAddRoundedCornersFilter nativeaddroundedcornersfilterOnWarmupCompleted2 = null;
        if (repeatedPostprocessorRunner != null) {
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            nativetocirclewithborderfilterOnExtraCallback = repeatedPostprocessorRunner.onExtraCallback();
        } else {
            nativetocirclewithborderfilterOnExtraCallback = null;
        }
        getrecipientinfosWriteTypedObject.onWarmupCompleted(nativetocirclewithborderfilterOnExtraCallback);
        getrecipientinfosWriteTypedObject.onExtraCallback(this.monthOffset);
        arrayList.add(getrecipientinfosWriteTypedObject);
        if (repeatedPostprocessorRunner != null) {
            int i4 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                repeatedPostprocessorRunner.onWarmupCompleted();
                nativeaddroundedcornersfilterOnWarmupCompleted2.hashCode();
                throw null;
            }
            nativeaddroundedcornersfilterOnWarmupCompleted = repeatedPostprocessorRunner.onWarmupCompleted();
        } else {
            nativeaddroundedcornersfilterOnWarmupCompleted = null;
        }
        arrayList.add(new EncryptedContentInfoParser(1, nativeaddroundedcornersfilterOnWarmupCompleted == null ? 1 : 0));
        if (repeatedPostprocessorRunner != null) {
            int i5 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            nativeaddroundedcornersfilterOnWarmupCompleted2 = repeatedPostprocessorRunner.onWarmupCompleted();
        }
        if (nativeaddroundedcornersfilterOnWarmupCompleted2 != null) {
            arrayList.add(new AudienceNetworkRemoteServiceApiPackageVerifier(repeatedPostprocessorRunner.onWarmupCompleted(), new Function0() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda17
                public final Object invoke() {
                    Object[] objArr = {this.f$0};
                    return (Unit) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1100177941, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1100177947, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                }
            }));
            arrayList.add(new EncryptedContentInfoParser(3, 1));
        }
        int i7 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 52 / 0;
        }
        return arrayList;
    }

    private static final Unit onNavigationEvent(EnvelopedData envelopedData, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        commonTypeToChar.onExtraCallbackWithResult.onWarmupCompleted();
        envelopedData.readTypedObject();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        final EnvelopedData envelopedData = (EnvelopedData) objArr[0];
        final toCircle tocircle = (toCircle) objArr[1];
        int i = 2 % 2;
        if (!commonTypeToChar.onExtraCallbackWithResult.onExtraCallbackWithResult()) {
            AFj1rSDK aFj1rSDK = AFj1rSDK.onExtraCallback;
            String strOnExtraCallbackWithResult = aFj1rSDK.onExtraCallbackWithResult(R.string.app_card_model___b31fada25a);
            String strOnExtraCallbackWithResult2 = aFj1rSDK.onExtraCallbackWithResult(R.string.app_card_model___f2c15248bc);
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
            Function1 function1 = new Function1() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda15
                public final Object invoke(Object obj) {
                    Object[] objArr2 = {this.f$0, (View) obj};
                    return (Unit) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -681962724, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 681962736, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                }
            };
            Object[] objArr2 = new Object[1];
            a(new int[]{1888851153, -87073816, -1067753441, 915051069, -1496446648, 672216444, -279534805, -504439621, -439906979, 1683660140, 1100176954, -2000820393, -354165730, -1710460510, -1456991891, -908546090, 688995792, -1663163136, 815311055, 386669399, -2092160800, -1144084542, 1503530746, -904298263, 1596324115, -1180289494, 1484550249, -151005640, 353075631, 1938941404, 872824142, 1910152368, -259123460, -1935151130, -1057251080, 1512310597}, 70 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            return new EncryptedData(strOnExtraCallbackWithResult, null, strOnExtraCallbackWithResult2, iAuthTabCallbackDefault, null, ((String) objArr2[0]).intern(), function1, 62.0f, 62.0f, 18, null);
        }
        Object obj = null;
        if (tocircle != null) {
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!envelopedData.onExtraCallbackWithResult(tocircle.onNavigationEvent())) {
                int i4 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                tocircle = null;
            }
            if (tocircle != null) {
                AFj1rSDK aFj1rSDK2 = AFj1rSDK.onExtraCallback;
                String strOnExtraCallbackWithResult3 = aFj1rSDK2.onExtraCallbackWithResult(R.string.app_card_model___0439c5af22);
                String strOnExtraCallbackWithResult4 = aFj1rSDK2.onExtraCallbackWithResult(R.string.app_card_model___636ae178c2);
                String strOnExtraCallbackWithResult5 = aFj1rSDK2.onExtraCallbackWithResult(R.string.app_card_model___45e7d43123);
                TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
                Function1 function12 = new Function1() { // from class: viva.republica.toss.card.model.PlccCardTransactionViewModel$$ExternalSyntheticLambda16
                    public final Object invoke(Object obj2) {
                        Object[] objArr3 = {this.f$0, tocircle, (View) obj2};
                        return (Unit) EnvelopedData.onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr3, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -864192685, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 864192696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                    }
                };
                Object[] objArr3 = new Object[1];
                a(new int[]{1888851153, -87073816, -1067753441, 915051069, -1496446648, 672216444, -279534805, -504439621, -439906979, 1683660140, 1100176954, -2000820393, -354165730, -1710460510, -1083357178, 299752064, -181291567, 1316255031, 1895607164, 1846756331, 196890786, -445661502, -1949020592, 480225957, -1423450187, -558142133, -1057251080, 1512310597}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 54, objArr3);
                return new EncryptedData(strOnExtraCallbackWithResult3, strOnExtraCallbackWithResult4, strOnExtraCallbackWithResult5, iAuthTabCallbackDefault2, null, ((String) objArr3[0]).intern(), function12, 62.0f, 62.0f, 16, null);
            }
        }
        int i5 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(EnvelopedData envelopedData, toCircle tocircle, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            envelopedData._cardStatusRouteEvent.setValue(tocircle);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        envelopedData._cardStatusRouteEvent.setValue(tocircle);
        int i3 = 48 / 0;
        return Unit.INSTANCE;
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            MutableLiveData<Pair<String, RepeatedPostprocessorRunner>> mutableLiveData = this.transactionListInfo;
            mutableLiveData.setValue(mutableLiveData.getValue());
            throw null;
        }
        MutableLiveData<Pair<String, RepeatedPostprocessorRunner>> mutableLiveData2 = this.transactionListInfo;
        mutableLiveData2.setValue(mutableLiveData2.getValue());
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        EnvelopedData envelopedData = (EnvelopedData) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            nativeToCircleWithBorderFilter nativetocirclewithborderfilter = (nativeToCircleWithBorderFilter) envelopedData._cardInfo.getValue();
            if (nativetocirclewithborderfilter == null) {
                return null;
            }
            envelopedData._monthTextSelectedEvent.setValue(Integer.valueOf(envelopedData.onWarmupCompleted(nativetocirclewithborderfilter)));
            int i3 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final int onWarmupCompleted(nativeToCircleWithBorderFilter nativetocirclewithborderfilter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Date dateOnExtraCallback = onExtraCallback(nativetocirclewithborderfilter.onExtraCallback());
        if (dateOnExtraCallback != null) {
            Calendar calendarOnWarmupCompleted = zzaj.onWarmupCompleted().onWarmupCompleted(dateOnExtraCallback);
            Calendar calendarOnNavigationEvent = zzaj.onWarmupCompleted().onNavigationEvent();
            return (calendarOnNavigationEvent.get(2) - calendarOnWarmupCompleted.get(2)) + ((calendarOnNavigationEvent.get(1) - calendarOnWarmupCompleted.get(1)) * 12) + 1;
        }
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 == 0 ? 4 : 3;
    }

    private final Date onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
        if (i3 != 0) {
            int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
            return ((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback())).parse(str);
        }
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        ((IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), iIAuthTabCallback2, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback())).parse(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallbackWithResult(buildArgumentExtractors buildargumentextractors) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            SHIPPING_STATUS.contains(buildargumentextractors);
            throw null;
        }
        boolean zContains = SHIPPING_STATUS.contains(buildargumentextractors);
        int i3 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return zContains;
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static {
        getInterfaceDescriptor();
        Companion = new IAuthTabCallback(null);
        $stable = 8;
        SHIPPING_STATUS = CollectionsKt.listOf(new buildArgumentExtractors[]{buildArgumentExtractors.DIRECT_ISSUE, buildArgumentExtractors.UNDER_AUDIT, buildArgumentExtractors.SHIPPING, buildArgumentExtractors.RETURN, buildArgumentExtractors.RESEND_APPLY, buildArgumentExtractors.REFUSE, buildArgumentExtractors.APPLY_CANCELED, buildArgumentExtractors.REACH_FAILED});
        int i = onExtraCallback + 47;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder, View view) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{gingerbreadPurgeableDecoder, view}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1675876222, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1675876227, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(EnvelopedData envelopedData, View view) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{envelopedData, view}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -681962724, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 681962736, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(EnvelopedData envelopedData, toCircle tocircle, View view) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{envelopedData, tocircle, view}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -864192685, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 864192696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(EnvelopedData envelopedData) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{envelopedData}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1100177941, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1100177947, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(EnvelopedData envelopedData, String str, Triple triple) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{envelopedData, str, triple}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1830666615, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1830666622, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view, GingerbreadPurgeableDecoder gingerbreadPurgeableDecoder, SetDetectableSize setDetectableSize) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{view, gingerbreadPurgeableDecoder, setDetectableSize}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 183942145, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -183942141, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, Object obj) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{function1, obj}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -398176604, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 398176605, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final getOther onExtraCallback(toCircle tocircle) {
        return (getOther) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, tocircle}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -505674850, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 505674850, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final List<getOther> access100() {
        return (List) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -865988141, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 865988144, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(Function1 function1, Object obj) {
        return (Unit) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{function1, obj}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1344236439, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1344236449, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void extraCallback() {
        onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1269883453, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1269883445, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final int asBinder() {
        return ((Integer) onWarmupCompleted(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 469955197, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -469955195, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).intValue();
    }

    static void getInterfaceDescriptor() {
        onWarmupCompleted = new int[]{827217057, -1477078510, 1701092658, 1766713345, 291604277, -698853566, -35493957, -785825095, -128590750, -884756002, 1735498745, 1360051717, -1391864032, -1715603609, 411949898, 1396682600, 308197776, 1652136778};
    }
}
