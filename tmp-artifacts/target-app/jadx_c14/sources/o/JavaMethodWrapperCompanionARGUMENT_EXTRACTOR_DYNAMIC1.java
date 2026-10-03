package o;

import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
    public /* synthetic */ JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1() {
    }

    public static final class IAuthTabCallbackDefault extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        private final KeyBoardVisiblePoint IAuthTabCallback;
        private final Function1<IAuthTabCallbackDefault, Unit> IAuthTabCallbackStub;
        private final Function1<IAuthTabCallbackDefault, Unit> asInterface;
        private final String onExtraCallback;
        private final Date onExtraCallbackWithResult;
        private final long onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackDefault)) {
                return false;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) obj;
            return this.onNavigationEvent == iAuthTabCallbackDefault.onNavigationEvent && Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallbackDefault.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, iAuthTabCallbackDefault.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, iAuthTabCallbackDefault.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallbackDefault.IAuthTabCallback) && Intrinsics.areEqual(this.asInterface, iAuthTabCallbackDefault.asInterface) && Intrinsics.areEqual(this.IAuthTabCallbackStub, iAuthTabCallbackDefault.IAuthTabCallbackStub);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.onNavigationEvent);
            int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode3 = this.onExtraCallback.hashCode();
            int iHashCode4 = this.onWarmupCompleted.hashCode();
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.IAuthTabCallback;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (keyBoardVisiblePoint == null ? 0 : keyBoardVisiblePoint.hashCode())) * 31) + this.asInterface.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode();
        }

        public String toString() {
            return "ExpectedAmountHeader(billAmount=" + this.onNavigationEvent + ", billDate=" + this.onExtraCallbackWithResult + ", accountNo=" + this.onExtraCallback + ", bankCode=" + this.onWarmupCompleted + ", account=" + this.IAuthTabCallback + ", onAccountClick=" + this.asInterface + ", onAmountButtonClick=" + this.IAuthTabCallbackStub + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallbackDefault(long j, @NotNull Date date, @NotNull String str, @NotNull String str2, @Nullable KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Function1<? super IAuthTabCallbackDefault, Unit> function1, @NotNull Function1<? super IAuthTabCallbackDefault, Unit> function12) {
            super(null);
            Intrinsics.checkNotNullParameter(date, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            this.onNavigationEvent = j;
            this.onExtraCallbackWithResult = date;
            this.onExtraCallback = str;
            this.onWarmupCompleted = str2;
            this.IAuthTabCallback = keyBoardVisiblePoint;
            this.asInterface = function1;
            this.IAuthTabCallbackStub = function12;
        }

        public final KeyBoardVisiblePoint IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final String onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public final long onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public final Function1<IAuthTabCallbackDefault, Unit> asBinder() {
            return this.IAuthTabCallbackStub;
        }

        public final Function1<IAuthTabCallbackDefault, Unit> onExtraCallbackWithResult() {
            return this.asInterface;
        }

        public final boolean asInterface() {
            Long lOnTransact;
            long j = this.onNavigationEvent;
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.IAuthTabCallback;
            return j <= ((keyBoardVisiblePoint == null || (lOnTransact = keyBoardVisiblePoint.onTransact()) == null) ? 0L : lOnTransact.longValue());
        }

        public final long onNavigationEvent() {
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.IAuthTabCallback;
            if (keyBoardVisiblePoint == null) {
                return -1L;
            }
            Long lOnTransact = keyBoardVisiblePoint.onTransact();
            if ((lOnTransact != null ? lOnTransact.longValue() : 0L) < 0) {
                return -1L;
            }
            long j = this.onNavigationEvent;
            Long lOnTransact2 = this.IAuthTabCallback.onTransact();
            if (j - (lOnTransact2 != null ? lOnTransact2.longValue() : 0L) <= 0) {
                return -1L;
            }
            long j2 = this.onNavigationEvent;
            Long lOnTransact3 = this.IAuthTabCallback.onTransact();
            return j2 - (lOnTransact3 != null ? lOnTransact3.longValue() : 0L);
        }
    }

    public static final class onNavigationEvent extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        private final String IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, ((onNavigationEvent) obj).IAuthTabCallback);
        }

        public int hashCode() {
            return this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return "BillHeader(amountText=" + this.IAuthTabCallback + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String onWarmupCompleted() {
            return this.IAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        private final String onExtraCallback;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback);
        }

        public int hashCode() {
            int iHashCode = this.onNavigationEvent.hashCode();
            String str = this.onExtraCallback;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AmountHeader(title=" + this.onNavigationEvent + ", date=" + this.onExtraCallback + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull String str, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
            this.onExtraCallback = str2;
        }

        public final String onExtraCallback() {
            return this.onNavigationEvent;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallback;
        }
    }

    public static final class IAuthTabCallback extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        private final List<nativeToCircleFastFilter> IAuthTabCallback;
        private final String asInterface;
        private final boolean onExtraCallback;
        private final Function1<IAuthTabCallback, Unit> onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent) && this.onWarmupCompleted == iAuthTabCallback.onWarmupCompleted && Intrinsics.areEqual(this.asInterface, iAuthTabCallback.asInterface) && this.onExtraCallback == iAuthTabCallback.onExtraCallback && Intrinsics.areEqual(this.IAuthTabCallback, iAuthTabCallback.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult);
        }

        public int hashCode() {
            return (((((((((this.onNavigationEvent.hashCode() * 31) + Long.hashCode(this.onWarmupCompleted)) * 31) + this.asInterface.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            return "Amount(title=" + this.onNavigationEvent + ", amount=" + this.onWarmupCompleted + ", unit=" + this.asInterface + ", detail=" + this.onExtraCallback + ", transactionList=" + this.IAuthTabCallback + ", onClick=" + this.onExtraCallbackWithResult + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallback(@NotNull String str, long j, @NotNull String str2, boolean z, @NotNull List<nativeToCircleFastFilter> list, @NotNull Function1<? super IAuthTabCallback, Unit> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = str;
            this.onWarmupCompleted = j;
            this.asInterface = str2;
            this.onExtraCallback = z;
            this.IAuthTabCallback = list;
            this.onExtraCallbackWithResult = function1;
        }

        public final String IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public final String IAuthTabCallbackStub() {
            return this.asInterface;
        }

        public final boolean onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public final long onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final List<nativeToCircleFastFilter> onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public final Function1<IAuthTabCallback, Unit> onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class onTransact extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        private final List<nativeToCircleFastFilter> IAuthTabCallback;
        private final String onExtraCallbackWithResult;
        private final Function1<onTransact, Unit> onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onTransact)) {
                return false;
            }
            onTransact ontransact = (onTransact) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, ontransact.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ontransact.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, ontransact.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, ontransact.onNavigationEvent);
        }

        public int hashCode() {
            int iHashCode = this.onWarmupCompleted.hashCode();
            int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode3 = this.IAuthTabCallback.hashCode();
            Function1<onTransact, Unit> function1 = this.onNavigationEvent;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function1 == null ? 0 : function1.hashCode());
        }

        public String toString() {
            return "ExtraInformation(title=" + this.onWarmupCompleted + ", content=" + this.onExtraCallbackWithResult + ", transactionList=" + this.IAuthTabCallback + ", onClick=" + this.onNavigationEvent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public onTransact(@NotNull String str, @NotNull String str2, @NotNull List<nativeToCircleFastFilter> list, @Nullable Function1<? super onTransact, Unit> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = str2;
            this.IAuthTabCallback = list;
            this.onNavigationEvent = function1;
        }

        public /* synthetic */ onTransact(String str, String str2, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : function1);
        }

        public final String onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final String onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final List<nativeToCircleFastFilter> onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public final Function1<onTransact, Unit> IAuthTabCallback() {
            return this.onNavigationEvent;
        }
    }

    public static final class onExtraCallback extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        private onExtraCallback() {
            super(null);
        }
    }

    public static final class asBinder extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        public static final asBinder onNavigationEvent = new asBinder();

        private asBinder() {
            super(null);
        }
    }

    public static final class onExtraCallbackWithResult extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1 {
        private final List<String> onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent);
        }

        public int hashCode() {
            return (this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "Disclaimer(title=" + this.onWarmupCompleted + ", content=" + this.onNavigationEvent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull String str, @NotNull List<String> list) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onWarmupCompleted = str;
            this.onNavigationEvent = list;
        }

        public final List<String> onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final String onWarmupCompleted() {
            return this.onWarmupCompleted;
        }
    }
}
