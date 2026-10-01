package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.OverviewPrice;
import im.toss.securities.widget.data.model.overview.OverviewRate;
import im.toss.tosssecurities.core.currency.domain.Currency;
import im.toss.tosssecurities.core.option.domain.model.OptionLiquidation;
import j$.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.r2ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r2ExternalSyntheticLambda2 {
    public static final onNavigationEvent Companion = onNavigationEvent.onWarmupCompleted;

    IAuthTabCallbackDefault IAuthTabCallback();

    Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallbackDefault {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallbackDefault[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallbackDefault SUM_OF_PROFIT = new IAuthTabCallbackDefault("SUM_OF_PROFIT", 0);
        public static final IAuthTabCallbackDefault DAILY_PROFIT = new IAuthTabCallbackDefault("DAILY_PROFIT", 1);

        private static final /* synthetic */ IAuthTabCallbackDefault[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = {SUM_OF_PROFIT, DAILY_PROFIT};
            int i5 = i3 + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackDefaultArr;
        }

        public static EnumEntries<IAuthTabCallbackDefault> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallbackDefault> enumEntries = $ENTRIES;
            int i5 = i2 + 3;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallbackDefault valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) Enum.valueOf(IAuthTabCallbackDefault.class, str);
            int i4 = onExtraCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefault;
        }

        public static IAuthTabCallbackDefault[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr = (IAuthTabCallbackDefault[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefaultArr;
        }

        private IAuthTabCallbackDefault(String str, int i) {
        }

        static {
            IAuthTabCallbackDefault[] iAuthTabCallbackDefaultArr$values = $values();
            $VALUES = iAuthTabCallbackDefaultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackDefaultArr$values);
            int i = onNavigationEvent + 11;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class onWarmupCompleted implements r2ExternalSyntheticLambda2 {
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder;
        private static int onNavigationEvent;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static final String onExtraCallbackWithResult = "FIXED";
        private static final IAuthTabCallbackDefault onWarmupCompleted = IAuthTabCallbackDefault.SUM_OF_PROFIT;

        public static /* synthetic */ int onExtraCallback(OverviewItemInfo overviewItemInfo, OverviewItemInfo overviewItemInfo2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent = onNavigationEvent(overviewItemInfo, overviewItemInfo2);
            if (i3 == 0) {
                int i4 = 92 / 0;
            }
            int i5 = onNavigationEvent + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 8 / 0;
            }
            return iOnNavigationEvent;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r7 instanceof o.r2ExternalSyntheticLambda2.onWarmupCompleted) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r1 = r1 + 75;
            o.r2ExternalSyntheticLambda2.onWarmupCompleted.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r3 = r3 + 87;
            o.r2ExternalSyntheticLambda2.onWarmupCompleted.onNavigationEvent = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if ((r3 % 2) != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 111;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                int i5 = 15 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                int i4 = 83 / 0;
            }
            int i5 = i3 + 81;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return 39473852;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return "Fixed";
            }
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted() {
        }

        static {
            int i = IAuthTabCallbackDefault + 101;
            asBinder = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = onExtraCallbackWithResult;
            int i5 = i2 + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = onWarmupCompleted;
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        private static final int onNavigationEvent(OverviewItemInfo overviewItemInfo, OverviewItemInfo overviewItemInfo2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AFh1vSDKAFa1uSDK aFh1vSDKAFa1uSDK = AFh1vSDKAFa1uSDK.onExtraCallback;
            String strIAuthTabCallbackStubProxy = overviewItemInfo.IAuthTabCallbackStubProxy();
            if (i3 != 0) {
                return aFh1vSDKAFa1uSDK.IAuthTabCallback(strIAuthTabCallbackStubProxy, overviewItemInfo2.IAuthTabCallbackStubProxy());
            }
            int iIAuthTabCallback = aFh1vSDKAFa1uSDK.IAuthTabCallback(strIAuthTabCallbackStubProxy, overviewItemInfo2.IAuthTabCallbackStubProxy());
            int i4 = 37 / 0;
            return iIAuthTabCallback;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent(new Comparator() { // from class: im.toss.securities.widget.data.model.overview.OverviewSortingType$Fixed$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 47;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    int iOnExtraCallback = r2ExternalSyntheticLambda2.onWarmupCompleted.onExtraCallback((OverviewItemInfo) obj, (OverviewItemInfo) obj2);
                    int i5 = onNavigationEvent + 55;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return iOnExtraCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public static final class onNavigationEvent<T> implements Comparator {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Comparator onExtraCallback;

            public onNavigationEvent(Comparator comparator) {
                this.onExtraCallback = comparator;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) {
                OverviewItemInfo.Option option;
                Long lValueOf;
                OptionLiquidation optionLiquidationOnUnminimized;
                ZonedDateTime zonedDateTimeOnExtraCallback;
                Long lValueOf2;
                OptionLiquidation optionLiquidationOnUnminimized2;
                int i = 2 % 2;
                Long l = 0L;
                int iCompare = this.onExtraCallback.compare(t, t2);
                if (iCompare != 0) {
                    int i2 = onWarmupCompleted + 13;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        return iCompare;
                    }
                    option.hashCode();
                    throw null;
                }
                OverviewItemInfo overviewItemInfo = (OverviewItemInfo) t;
                if (!(overviewItemInfo instanceof OverviewItemInfo.Option)) {
                    int i3 = onNavigationEvent + 91;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    option = null;
                } else {
                    option = (OverviewItemInfo.Option) overviewItemInfo;
                }
                if (option == null || (optionLiquidationOnUnminimized2 = option.onUnminimized()) == null) {
                    lValueOf = l;
                } else {
                    int i5 = onNavigationEvent + 107;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    ZonedDateTime zonedDateTimeOnExtraCallback2 = optionLiquidationOnUnminimized2.onExtraCallback();
                    if (zonedDateTimeOnExtraCallback2 != null) {
                        lValueOf = Long.valueOf(((Long) isCivilized.onNavigationEvent(new Object[]{isCivilized.onWarmupCompleted, zonedDateTimeOnExtraCallback2}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1369965004, -1369965003)).longValue());
                    }
                }
                OverviewItemInfo overviewItemInfo2 = (OverviewItemInfo) t2;
                option = (overviewItemInfo2 instanceof OverviewItemInfo.Option) ^ true ? null : (OverviewItemInfo.Option) overviewItemInfo2;
                if (option != null && (optionLiquidationOnUnminimized = option.onUnminimized()) != null && (zonedDateTimeOnExtraCallback = optionLiquidationOnUnminimized.onExtraCallback()) != null) {
                    int i7 = onNavigationEvent + 119;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        lValueOf2 = Long.valueOf(((Long) isCivilized.onNavigationEvent(new Object[]{isCivilized.onWarmupCompleted, zonedDateTimeOnExtraCallback}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1369965004, -1369965003)).longValue());
                        int i8 = 70 / 0;
                    } else {
                        lValueOf2 = Long.valueOf(((Long) isCivilized.onNavigationEvent(new Object[]{isCivilized.onWarmupCompleted, zonedDateTimeOnExtraCallback}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1369965004, -1369965003)).longValue());
                    }
                    l = lValueOf2;
                }
                return getCodeNameBytes.IAuthTabCallback(lValueOf, l);
            }
        }
    }

    public static final class IAuthTabCallbackStub implements r2ExternalSyntheticLambda2 {
        private static int asInterface = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onTransact = 1;
        public static final IAuthTabCallbackStub onExtraCallback = new IAuthTabCallbackStub();
        private static final String IAuthTabCallback = "TOTAL_ASC";
        private static final IAuthTabCallbackDefault onWarmupCompleted = IAuthTabCallbackDefault.SUM_OF_PROFIT;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.r2ExternalSyntheticLambda2.IAuthTabCallbackStub) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r6 = r2 + 23;
            o.r2ExternalSyntheticLambda2.IAuthTabCallbackStub.onTransact = r6 % 128;
            r6 = r6 % 2;
            r2 = r2 + 31;
            o.r2ExternalSyntheticLambda2.IAuthTabCallbackStub.onTransact = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            if ((r2 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            r6 = 43 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 59;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 != 0) {
                int i4 = 8 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 5;
            onTransact = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 81;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return 476667452;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 53;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return "ProfitAscending";
        }

        private IAuthTabCallbackStub() {
        }

        static {
            int i = onExtraCallbackWithResult + 17;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asInterface + 47;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback;
            }
            throw null;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 83;
            onTransact = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault = onWarmupCompleted;
            int i4 = i2 + 29;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(onNavigationEvent.onExtraCallback(), currency, z);
            int i2 = onTransact + 89;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 95 / 0;
            }
            return onwarmupcompleted;
        }

        public static final class onWarmupCompleted<T> implements Comparator {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ Comparator onExtraCallback;
            final /* synthetic */ boolean onNavigationEvent;
            final /* synthetic */ Currency onWarmupCompleted;

            public onWarmupCompleted(Comparator comparator, Currency currency, boolean z) {
                this.onExtraCallback = comparator;
                this.onWarmupCompleted = currency;
                this.onNavigationEvent = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) {
                Double dOnNavigationEvent;
                Currency currency;
                Double dOnNavigationEvent2;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Double dValueOf = Double.valueOf(0.0d);
                int iCompare = this.onExtraCallback.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                OverviewItemInfo overviewItemInfo = (OverviewItemInfo) t;
                Currency currency2 = overviewItemInfo.onPostMessage() ? this.onWarmupCompleted : Currency.KRW;
                OverviewRate overviewRateOnNavigationEvent = overviewItemInfo.onNavigationEvent(this.onNavigationEvent);
                Object obj = null;
                if (overviewRateOnNavigationEvent != null) {
                    int i4 = onExtraCallbackWithResult + 119;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        overviewRateOnNavigationEvent.onNavigationEvent(currency2);
                        throw null;
                    }
                    dOnNavigationEvent = overviewRateOnNavigationEvent.onNavigationEvent(currency2);
                    if (dOnNavigationEvent == null) {
                        dOnNavigationEvent = dValueOf;
                    }
                }
                OverviewItemInfo overviewItemInfo2 = (OverviewItemInfo) t2;
                if (overviewItemInfo2.onPostMessage()) {
                    int i5 = IAuthTabCallback + 83;
                    int i6 = i5 % 128;
                    onExtraCallbackWithResult = i6;
                    if (i5 % 2 != 0) {
                        currency = this.onWarmupCompleted;
                        int i7 = 95 / 0;
                    } else {
                        currency = this.onWarmupCompleted;
                    }
                    int i8 = i6 + 47;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    currency = Currency.KRW;
                }
                OverviewRate overviewRateOnNavigationEvent2 = overviewItemInfo2.onNavigationEvent(this.onNavigationEvent);
                if (overviewRateOnNavigationEvent2 != null && (dOnNavigationEvent2 = overviewRateOnNavigationEvent2.onNavigationEvent(currency)) != null) {
                    int i10 = onExtraCallbackWithResult;
                    int i11 = i10 + 111;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i12 = i10 + 67;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    dValueOf = dOnNavigationEvent2;
                }
                return getCodeNameBytes.IAuthTabCallback(dOnNavigationEvent, dValueOf);
            }
        }
    }

    public static final class asInterface implements r2ExternalSyntheticLambda2 {
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        public static final asInterface onExtraCallbackWithResult = new asInterface();
        private static final String onNavigationEvent = "TOTAL_DESC";
        private static final IAuthTabCallbackDefault IAuthTabCallback = IAuthTabCallbackDefault.SUM_OF_PROFIT;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 99;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj || (obj instanceof asInterface)) {
                return true;
            }
            int i5 = i2 + 9;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 9;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 95;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return 928380948;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 63;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return "ProfitDescending";
        }

        private asInterface() {
        }

        static {
            int i = onWarmupCompleted + 29;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 59;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = onNavigationEvent;
            int i5 = i2 + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 81;
            IAuthTabCallbackStub = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault = IAuthTabCallback;
            int i4 = i2 + 25;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            throw null;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(onNavigationEvent.onExtraCallback(), currency, z);
            int i2 = IAuthTabCallbackStub + 57;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public static final class onWarmupCompleted<T> implements Comparator {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Comparator onExtraCallback;
            final /* synthetic */ boolean onExtraCallbackWithResult;
            final /* synthetic */ Currency onNavigationEvent;

            public onWarmupCompleted(Comparator comparator, Currency currency, boolean z) {
                this.onExtraCallback = comparator;
                this.onNavigationEvent = currency;
                this.onExtraCallbackWithResult = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) {
                Double dOnNavigationEvent;
                Double dOnNavigationEvent2;
                int i = 2 % 2;
                Double dValueOf = Double.valueOf(0.0d);
                int iCompare = this.onExtraCallback.compare(t, t2);
                if (iCompare != 0) {
                    int i2 = IAuthTabCallback + 19;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 99 / 0;
                    }
                    return iCompare;
                }
                OverviewItemInfo overviewItemInfo = (OverviewItemInfo) t2;
                Currency currency = !overviewItemInfo.onPostMessage() ? Currency.KRW : this.onNavigationEvent;
                OverviewRate overviewRateOnNavigationEvent = overviewItemInfo.onNavigationEvent(this.onExtraCallbackWithResult);
                if (overviewRateOnNavigationEvent != null) {
                    int i4 = IAuthTabCallback + 25;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    dOnNavigationEvent = overviewRateOnNavigationEvent.onNavigationEvent(currency);
                    if (dOnNavigationEvent == null) {
                        int i6 = onWarmupCompleted + 103;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 5 % 5;
                        }
                        dOnNavigationEvent = dValueOf;
                    }
                }
                OverviewItemInfo overviewItemInfo2 = (OverviewItemInfo) t;
                Currency currency2 = overviewItemInfo2.onPostMessage() ? this.onNavigationEvent : Currency.KRW;
                OverviewRate overviewRateOnNavigationEvent2 = overviewItemInfo2.onNavigationEvent(this.onExtraCallbackWithResult);
                if (overviewRateOnNavigationEvent2 != null && (dOnNavigationEvent2 = overviewRateOnNavigationEvent2.onNavigationEvent(currency2)) != null) {
                    int i8 = IAuthTabCallback + 63;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    dValueOf = dOnNavigationEvent2;
                }
                int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(dOnNavigationEvent, dValueOf);
                int i9 = IAuthTabCallback + 33;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 55 / 0;
                }
                return iIAuthTabCallback;
            }
        }
    }

    public static final class onTransact implements r2ExternalSyntheticLambda2 {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final onTransact onNavigationEvent = new onTransact();
        private static final String onWarmupCompleted = "DAILY_ASC";
        private static final IAuthTabCallbackDefault onExtraCallback = IAuthTabCallbackDefault.DAILY_PROFIT;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = asInterface + 25;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(obj instanceof onTransact))) {
                return true;
            }
            int i4 = asInterface + 99;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 123;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 13;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return 830024667;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 95;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return "ProfitDailyAscending";
            }
            throw null;
        }

        private onTransact() {
        }

        static {
            int i = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 87;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            String str = onWarmupCompleted;
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
            return str;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = onExtraCallback;
            int i5 = i3 + 105;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackDefault;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            onExtraCallback onextracallback = new onExtraCallback(onNavigationEvent.onExtraCallback(), currency);
            int i2 = IAuthTabCallbackDefault + 41;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public static final class onExtraCallback<T> implements Comparator {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ Comparator onExtraCallback;
            final /* synthetic */ Currency onExtraCallbackWithResult;

            public onExtraCallback(Comparator comparator, Currency currency) {
                this.onExtraCallback = comparator;
                this.onExtraCallbackWithResult = currency;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Double dOnNavigationEvent;
                Currency currency;
                Double dOnNavigationEvent2;
                int i = 2 % 2;
                Double dValueOf = Double.valueOf(0.0d);
                int iCompare = this.onExtraCallback.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                OverviewItemInfo overviewItemInfo = (OverviewItemInfo) t;
                Currency currency2 = overviewItemInfo.onPostMessage() ? this.onExtraCallbackWithResult : Currency.KRW;
                OverviewRate overviewRateOnExtraCallback = overviewItemInfo.onExtraCallback();
                if (overviewRateOnExtraCallback == null || (dOnNavigationEvent = overviewRateOnExtraCallback.onNavigationEvent(currency2)) == null) {
                    dOnNavigationEvent = dValueOf;
                }
                OverviewItemInfo overviewItemInfo2 = (OverviewItemInfo) t2;
                Object obj = null;
                if (overviewItemInfo2.onPostMessage()) {
                    int i2 = IAuthTabCallback + 45;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    currency = this.onExtraCallbackWithResult;
                } else {
                    currency = Currency.KRW;
                }
                OverviewRate overviewRateOnExtraCallback2 = overviewItemInfo2.onExtraCallback();
                if (overviewRateOnExtraCallback2 != null && (dOnNavigationEvent2 = overviewRateOnExtraCallback2.onNavigationEvent(currency)) != null) {
                    int i3 = IAuthTabCallback + 51;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    dValueOf = dOnNavigationEvent2;
                }
                int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(dOnNavigationEvent, dValueOf);
                int i4 = IAuthTabCallback + 9;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return iIAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class asBinder implements r2ExternalSyntheticLambda2 {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        public static final asBinder IAuthTabCallback = new asBinder();
        private static final String onWarmupCompleted = "DAILY_DESC";
        private static final IAuthTabCallbackDefault onExtraCallbackWithResult = IAuthTabCallbackDefault.DAILY_PROFIT;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 123;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj || (obj instanceof asBinder)) {
                return true;
            }
            int i4 = i3 + 87;
            IAuthTabCallbackDefault = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 109;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return -1002447275;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 117;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return "ProfitDailyDescending";
        }

        private asBinder() {
        }

        static {
            int i = onExtraCallback + 69;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 79;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = onWarmupCompleted;
            int i5 = i3 + 83;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 0;
            }
            return str;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 19;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault = onExtraCallbackWithResult;
            int i4 = i3 + 67;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackDefault;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent(onNavigationEvent.onExtraCallback(), currency);
            int i2 = IAuthTabCallbackDefault + 9;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public static final class onNavigationEvent<T> implements Comparator {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Comparator IAuthTabCallback;
            final /* synthetic */ Currency onExtraCallback;

            public onNavigationEvent(Comparator comparator, Currency currency) {
                this.IAuthTabCallback = comparator;
                this.onExtraCallback = currency;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            
                r8 = (im.toss.securities.widget.data.model.overview.OverviewItemInfo) r8;
                r3 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
            
                if (r8.onPostMessage() == false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
            
                r2 = o.r2ExternalSyntheticLambda2.asBinder.onNavigationEvent.onWarmupCompleted + 1;
                o.r2ExternalSyntheticLambda2.asBinder.onNavigationEvent.onExtraCallbackWithResult = r2 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
            
                if ((r2 % 2) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
            
                r2 = r6.onExtraCallback;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            
                r2 = im.toss.tosssecurities.core.currency.domain.Currency.KRW;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
            
                r8 = r8.onExtraCallback();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
            
                if (r8 == null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
            
                r4 = o.r2ExternalSyntheticLambda2.asBinder.onNavigationEvent.onWarmupCompleted + 103;
                o.r2ExternalSyntheticLambda2.asBinder.onNavigationEvent.onExtraCallbackWithResult = r4 % 128;
                r4 = r4 % 2;
                r8 = r8.onNavigationEvent(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
            
                if (r8 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
            
                r8 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
            
                r7 = (im.toss.securities.widget.data.model.overview.OverviewItemInfo) r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
            
                if (r7.onPostMessage() == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
            
                r2 = r6.onExtraCallback;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
            
                r2 = im.toss.tosssecurities.core.currency.domain.Currency.KRW;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
            
                r7 = r7.onExtraCallback();
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
            
                if (r7 == null) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
            
                r7 = r7.onNavigationEvent(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
            
                if (r7 == null) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
            
                r1 = o.r2ExternalSyntheticLambda2.asBinder.onNavigationEvent.onExtraCallbackWithResult + 85;
                o.r2ExternalSyntheticLambda2.asBinder.onNavigationEvent.onWarmupCompleted = r1 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
            
                if ((r1 % 2) == 0) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
            
                r1 = r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
            
                r3.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
            
                return o.getCodeNameBytes.IAuthTabCallback(r8, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
            
                return r2;
             */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) {
                Double dValueOf;
                int iCompare;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    dValueOf = Double.valueOf(1.0d);
                    iCompare = this.IAuthTabCallback.compare(t, t2);
                } else {
                    dValueOf = Double.valueOf(0.0d);
                    iCompare = this.IAuthTabCallback.compare(t, t2);
                }
            }
        }
    }

    public static final class IAuthTabCallback implements r2ExternalSyntheticLambda2 {
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent = 0;
        private static int onTransact = 0;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static final String onExtraCallbackWithResult = "EVALUATION_ASC";
        private static final IAuthTabCallbackDefault IAuthTabCallback = IAuthTabCallbackDefault.SUM_OF_PROFIT;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallbackDefault + 77;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof IAuthTabCallback) {
                return true;
            }
            int i4 = onTransact + 47;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 47;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 63;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return 1668904098;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 27;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 15;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return "EvaluatedPriceAscending";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }

        static {
            int i = onWarmupCompleted + 99;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 53;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = onExtraCallbackWithResult;
            int i5 = i3 + 17;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 99;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 32 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            onExtraCallback onextracallback = new onExtraCallback(onNavigationEvent.onExtraCallback(), currency, z);
            int i2 = onTransact + 109;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public static final class onExtraCallback<T> implements Comparator {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ boolean IAuthTabCallback;
            final /* synthetic */ Currency onExtraCallbackWithResult;
            final /* synthetic */ Comparator onWarmupCompleted;

            public onExtraCallback(Comparator comparator, Currency currency, boolean z) {
                this.onWarmupCompleted = comparator;
                this.onExtraCallbackWithResult = currency;
                this.IAuthTabCallback = z;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            
                r7 = (im.toss.securities.widget.data.model.overview.OverviewItemInfo) r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
            
                if (r7.onPostMessage() == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                r2 = r6.onExtraCallbackWithResult;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                r2 = im.toss.tosssecurities.core.currency.domain.Currency.KRW;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
            
                r7 = r7.onExtraCallback(r6.IAuthTabCallback);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
            
                if (r7 == null) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
            
                r4 = o.r2ExternalSyntheticLambda2.IAuthTabCallback.onExtraCallback.onNavigationEvent + 81;
                o.r2ExternalSyntheticLambda2.IAuthTabCallback.onExtraCallback.onExtraCallback = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
            
                if ((r4 % 2) != 0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
            
                r7 = r7.IAuthTabCallback(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
            
                if (r7 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
            
                r7.IAuthTabCallback(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
            
                r7 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
            
                r8 = (im.toss.securities.widget.data.model.overview.OverviewItemInfo) r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
            
                if (r8.onPostMessage() == false) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
            
                r2 = o.r2ExternalSyntheticLambda2.IAuthTabCallback.onExtraCallback.onNavigationEvent + 105;
                o.r2ExternalSyntheticLambda2.IAuthTabCallback.onExtraCallback.onExtraCallback = r2 % 128;
                r2 = r2 % 2;
                r2 = r6.onExtraCallbackWithResult;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
            
                r2 = im.toss.tosssecurities.core.currency.domain.Currency.KRW;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
            
                r8 = r8.onExtraCallback(r6.IAuthTabCallback);
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
            
                if (r8 == null) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
            
                r4 = o.r2ExternalSyntheticLambda2.IAuthTabCallback.onExtraCallback.onExtraCallback + 119;
                o.r2ExternalSyntheticLambda2.IAuthTabCallback.onExtraCallback.onNavigationEvent = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
            
                if ((r4 % 2) == 0) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
            
                r8 = r8.IAuthTabCallback(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
            
                if (r8 == null) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
            
                r1 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
            
                r8.IAuthTabCallback(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
            
                return o.getCodeNameBytes.IAuthTabCallback(r7, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
            
                if (r2 != 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
            
                return r2;
             */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) throws NoWhenBranchMatchedException {
                Double dValueOf;
                int iCompare;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 117;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    dValueOf = Double.valueOf(1.0d);
                    iCompare = this.onWarmupCompleted.compare(t, t2);
                } else {
                    dValueOf = Double.valueOf(0.0d);
                    iCompare = this.onWarmupCompleted.compare(t, t2);
                }
            }
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        private static int onTransact;
        static final /* synthetic */ onNavigationEvent onWarmupCompleted = new onNavigationEvent();
        private static final Comparator<OverviewItemInfo> onNavigationEvent = new IAuthTabCallback();
        private static final List<r2ExternalSyntheticLambda2> onExtraCallbackWithResult = CollectionsKt.listOf(new r2ExternalSyntheticLambda2[]{onWarmupCompleted.onExtraCallback, IAuthTabCallbackStub.onExtraCallback, asInterface.onExtraCallbackWithResult, IAuthTabCallback.onExtraCallback, onExtraCallback.onExtraCallback, onTransact.onNavigationEvent, asBinder.IAuthTabCallback, onExtraCallbackWithResult.IAuthTabCallback});

        public static final class IAuthTabCallback<T> implements Comparator {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) {
                boolean z;
                OverviewItemInfo.Stock stock;
                int i = 2 % 2;
                OverviewItemInfo overviewItemInfo = (OverviewItemInfo) t;
                OverviewItemInfo.Stock stock2 = null;
                boolean z2 = false;
                if (!overviewItemInfo.IAuthTabCallbackDefault()) {
                    int i2 = onWarmupCompleted + 59;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 18 / 0;
                        stock = overviewItemInfo instanceof OverviewItemInfo.Stock ? (OverviewItemInfo.Stock) overviewItemInfo : null;
                    } else if (overviewItemInfo instanceof OverviewItemInfo.Stock) {
                    }
                    z = stock != null && stock.ICustomTabsService();
                }
                OverviewItemInfo overviewItemInfo2 = (OverviewItemInfo) t2;
                if (overviewItemInfo2.IAuthTabCallbackDefault()) {
                    z2 = true;
                } else {
                    if (overviewItemInfo2 instanceof OverviewItemInfo.Stock) {
                        int i4 = onWarmupCompleted + 73;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            stock2.hashCode();
                            throw null;
                        }
                        stock2 = (OverviewItemInfo.Stock) overviewItemInfo2;
                    }
                    if (stock2 != null && stock2.ICustomTabsService()) {
                    }
                }
                return getCodeNameBytes.IAuthTabCallback(Boolean.valueOf(z), Boolean.valueOf(z2));
            }
        }

        private onNavigationEvent() {
        }

        public static final /* synthetic */ Comparator onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 31;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Comparator<OverviewItemInfo> comparator = onNavigationEvent;
            int i4 = i2 + 69;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return comparator;
        }

        static {
            int i = IAuthTabCallback + 113;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final r2ExternalSyntheticLambda2 IAuthTabCallback(@Nullable String str) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallback;
            if (!Intrinsics.areEqual(str, onwarmupcompleted.onExtraCallback())) {
                IAuthTabCallbackStub iAuthTabCallbackStub = IAuthTabCallbackStub.onExtraCallback;
                if (Intrinsics.areEqual(str, iAuthTabCallbackStub.onWarmupCompleted())) {
                    return iAuthTabCallbackStub;
                }
                asInterface asinterface = asInterface.onExtraCallbackWithResult;
                if (!Intrinsics.areEqual(str, asinterface.onExtraCallback())) {
                    onTransact ontransact = onTransact.onNavigationEvent;
                    if (Intrinsics.areEqual(str, ontransact.onNavigationEvent())) {
                        return ontransact;
                    }
                    asBinder asbinder = asBinder.IAuthTabCallback;
                    if (Intrinsics.areEqual(str, asbinder.onExtraCallbackWithResult())) {
                        return asbinder;
                    }
                    IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onExtraCallback;
                    if (Intrinsics.areEqual(str, iAuthTabCallback.onExtraCallback())) {
                        return iAuthTabCallback;
                    }
                    onExtraCallback onextracallback = onExtraCallback.onExtraCallback;
                    if (Intrinsics.areEqual(str, onextracallback.onWarmupCompleted())) {
                        int i2 = onTransact + 19;
                        IAuthTabCallbackDefault = i2 % 128;
                        if (i2 % 2 != 0) {
                            return onextracallback;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.IAuthTabCallback;
                    if (Intrinsics.areEqual(str, onextracallbackwithresult.onWarmupCompleted())) {
                        int i3 = onTransact + 31;
                        IAuthTabCallbackDefault = i3 % 128;
                        int i4 = i3 % 2;
                        return onextracallbackwithresult;
                    }
                } else {
                    int i5 = onTransact + 91;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    return asinterface;
                }
            }
            return onwarmupcompleted;
        }
    }

    public static final class onExtraCallback implements r2ExternalSyntheticLambda2 {
        private static int asBinder = 0;
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final onExtraCallback onExtraCallback = new onExtraCallback();
        private static final String onWarmupCompleted = "EVALUATION_DESC";
        private static final IAuthTabCallbackDefault IAuthTabCallback = IAuthTabCallbackDefault.SUM_OF_PROFIT;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 27;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj || !(!(obj instanceof onExtraCallback))) {
                return true;
            }
            int i4 = i2 + 65;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 81;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 73;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return -766988690;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 59;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 52 / 0;
            }
            int i5 = i2 + 95;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return "EvaluatedPriceDescending";
        }

        private onExtraCallback() {
        }

        static {
            int i = onExtraCallbackWithResult + 93;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 51;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = onWarmupCompleted;
            int i4 = i3 + 105;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 77;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback;
            }
            throw null;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            onNavigationEvent onnavigationevent = new onNavigationEvent(onNavigationEvent.onExtraCallback(), currency, z);
            int i2 = asBinder + 63;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public static final class onNavigationEvent<T> implements Comparator {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ Comparator IAuthTabCallback;
            final /* synthetic */ boolean onExtraCallback;
            final /* synthetic */ Currency onWarmupCompleted;

            public onNavigationEvent(Comparator comparator, Currency currency, boolean z) {
                this.IAuthTabCallback = comparator;
                this.onWarmupCompleted = currency;
                this.onExtraCallback = z;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) throws NoWhenBranchMatchedException {
                Double dIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Double dValueOf = Double.valueOf(0.0d);
                int iCompare = this.IAuthTabCallback.compare(t, t2);
                if (iCompare != 0) {
                    int i4 = onNavigationEvent + 11;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return iCompare;
                }
                OverviewItemInfo overviewItemInfo = (OverviewItemInfo) t2;
                Currency currency = !overviewItemInfo.onPostMessage() ? Currency.KRW : this.onWarmupCompleted;
                OverviewPrice overviewPriceOnExtraCallback = overviewItemInfo.onExtraCallback(this.onExtraCallback);
                if (overviewPriceOnExtraCallback == null || (dIAuthTabCallback = overviewPriceOnExtraCallback.IAuthTabCallback(currency)) == null) {
                    dIAuthTabCallback = dValueOf;
                }
                OverviewItemInfo overviewItemInfo2 = (OverviewItemInfo) t;
                Currency currency2 = !(overviewItemInfo2.onPostMessage() ^ true) ? this.onWarmupCompleted : Currency.KRW;
                OverviewPrice overviewPriceOnExtraCallback2 = overviewItemInfo2.onExtraCallback(this.onExtraCallback);
                if (overviewPriceOnExtraCallback2 != null) {
                    int i6 = onNavigationEvent + 99;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    Double dIAuthTabCallback2 = overviewPriceOnExtraCallback2.IAuthTabCallback(currency2);
                    if (dIAuthTabCallback2 != null) {
                        int i8 = onNavigationEvent + 111;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        dValueOf = dIAuthTabCallback2;
                    }
                }
                return getCodeNameBytes.IAuthTabCallback(dIAuthTabCallback, dValueOf);
            }
        }
    }

    public static final class onExtraCallbackWithResult implements r2ExternalSyntheticLambda2 {
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static final String onNavigationEvent = "CUSTOM";
        private static final IAuthTabCallbackDefault onExtraCallbackWithResult = IAuthTabCallbackDefault.SUM_OF_PROFIT;

        public static /* synthetic */ int IAuthTabCallback(OverviewItemInfo overviewItemInfo, OverviewItemInfo overviewItemInfo2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(overviewItemInfo, overviewItemInfo2);
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(overviewItemInfo, overviewItemInfo2);
            int i3 = onExtraCallback + 117;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return iOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        private static final int onExtraCallbackWithResult(OverviewItemInfo overviewItemInfo, OverviewItemInfo overviewItemInfo2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 123;
            onExtraCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this != obj) {
                return obj instanceof onExtraCallbackWithResult;
            }
            int i4 = i2 + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 1148750121;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 97;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return "Custom";
            }
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult() {
        }

        static {
            int i = IAuthTabCallbackStub + 95;
            asBinder = i % 128;
            if (i % 2 == 0) {
                int i2 = 83 / 0;
            }
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = onNavigationEvent;
            int i5 = i3 + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public IAuthTabCallbackDefault IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.r2ExternalSyntheticLambda2
        public Comparator<OverviewItemInfo> onWarmupCompleted(@NotNull Currency currency, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(currency, "");
            Comparator<OverviewItemInfo> comparator = new Comparator() { // from class: im.toss.securities.widget.data.model.overview.OverviewSortingType$Custom$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 71;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    int iIAuthTabCallback = r2ExternalSyntheticLambda2.onExtraCallbackWithResult.IAuthTabCallback((OverviewItemInfo) obj, (OverviewItemInfo) obj2);
                    int i5 = onWarmupCompleted + 27;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return iIAuthTabCallback;
                }
            };
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return comparator;
        }
    }
}
